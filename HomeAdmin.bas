B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim AddFac_clicked As String = ""
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	
	Dim menu As ArcMenu
	Dim menuButtonStatic, menuButtonAnimated As Bitmap
	Private ScrollView1 As ScrollView
	Private PanelBackground As Panel
	Private PanelBar As Panel
	Private PanelToolBar As Panel
	Private BtnLogout As Button
	Private Label1 As Label
	Private BtnSearch As Button
	Private Panel1 As Panel
	Private Panel2 As Panel
	Private ContentAdmin As Panel
	Private HorizontalScrollView1 As HorizontalScrollView
	Private Label9 As Label
	Private Label10 As Label
	Private Label11 As Label
	Private Label12 As Label
	Private Label13 As Label
	Private Label14 As Label
	Private WorshipBtn As Panel
	Private OfficeBtn As Panel
	Private HealthBtn As Panel
	Private EducationBtn As Panel
	Private Labellogout As Label
	Private PanelLogout As Panel
	Private BackArrow As Label
	Private TitleBar As Label
	Private BtnMap As Button
	Private BtnInfo As Button
	Private Button1 As Button
	Private Button4 As Button
	Private Button2 As Button
	Private Button5 As Button
	Private Button3 As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.LoadLayout("HomeAdmin")	
	HorizontalScrollView1.Panel.LoadLayout("AdminContent")
	HorizontalScrollView1.Panel.Width = ContentAdmin.Width + 5%y
	PanelBackground.Height = HorizontalScrollView1.Top + HorizontalScrollView1.Height
	ScrollView1.Panel.Height = PanelBackground.Height + 2%y
	BackArrow.Visible = False
	If BackArrow.Visible Then
		
	Else
		TitleBar.Left = 5%x
	End If

	Dim isLogin As Boolean
	isLogin = Login.manager.GetBoolean("is_login")	
		If isLogin Then
			PanelLogout.Visible = True
		Else
			PanelLogout.Visible = False
	End If
	If Starter.GPS1.GPSEnabled = False Then
		ToastMessageShow("Please enable the GPS device.", True)
		StartActivity(Starter.GPS1.LocationSettingsIntent) 'Will open the relevant settings screen.
	Else
		Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_ACCESS_FINE_LOCATION)
		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
		If Result Then CallSubDelayed(Starter, "StartGPS")
	End If
End Sub

Sub Activity_Resume
	ExecuteRemoteQuery("SELECT COUNT(*) FROM house_building","CountHouse")
	ExecuteRemoteQuery("SELECT COUNT(*) FROM office_building","CountOffice")
	ExecuteRemoteQuery("SELECT COUNT(*) FROM msme_building","CountMsme")
	ExecuteRemoteQuery("SELECT COUNT(*) FROM educational_building","CountEducation")
	ExecuteRemoteQuery("SELECT COUNT(*) FROM health_building","CountHealth")
	ExecuteRemoteQuery("SELECT COUNT(*) FROM worship_building","CountWorship")
	If File.Exists(Main.folder,"datastore") Then
		If Main.kvs.ContainsKey("role") == True Then
			Log("DISINI :"&Main.kvs.Get("username"))
			Label1.Text ="Welcome, "&Main.kvs.Get("username")&""
		End If
	End If
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub ExecuteRemoteQuery(Query As String, JobName As String)
	Dim Job As HttpJob
	Job.Initialize(JobName, Me)
	Job.PostString(""&Main.Server&"mobile/json.php", Query)
End Sub

Sub JobDone(Job As HttpJob)
	If Job.Success Then
		Dim res As String
		res = Job.GetString 'menyimpan json dalam bentuk string
		Log("Response from server :"& res)
		Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
		parser.Initialize(res)
		Select Job.JobName
			Case "CountHouse"
				Dim data_array As List
				data_array = parser.NextArray
				If data_array.Size > 0 Then
				For i=0 To data_array.Size - 1
					Dim a As Map
					a = data_array.Get(i)
					'Set CustomListView for Facility a.Get("username")
						Label9.Text = a.Get("count")
						Log(a.Get("count"))
				Next					 
				End If
			Case "CountOffice"
				Dim data_array As List
				data_array = parser.NextArray
				If data_array.Size > 0 Then
					For i=0 To data_array.Size - 1
						Dim a As Map
						a = data_array.Get(i)
						'Set CustomListView for Facility a.Get("username")
						Label11.Text = a.Get("count")
						Log(a.Get("count"))
					Next
				End If
			Case "CountWorship"
				Dim data_array As List
				data_array = parser.NextArray
				If data_array.Size > 0 Then
					For i=0 To data_array.Size - 1
						Dim a As Map
						a = data_array.Get(i)
						'Set CustomListView for Facility a.Get("username")
						Label10.Text = a.Get("count")
						Log(a.Get("count"))
					Next
				End If
			Case "CountMsme"
				Dim data_array As List
				data_array = parser.NextArray
				If data_array.Size > 0 Then
					For i=0 To data_array.Size - 1
						Dim a As Map
						a = data_array.Get(i)
						'Set CustomListView for Facility a.Get("username")
						Label13.Text = a.Get("count")
						Log(a.Get("count"))
					Next
				End If
			Case "CountEducation"
				Dim data_array As List
				data_array = parser.NextArray
				If data_array.Size > 0 Then
					For i=0 To data_array.Size - 1
						Dim a As Map
						a = data_array.Get(i)
						'Set CustomListView for Facility a.Get("username")
						Label12.Text = a.Get("count")
						Log(a.Get("count"))
					Next
				End If
			Case "CountHealth"
				Dim data_array As List
				data_array = parser.NextArray
				If data_array.Size > 0 Then
					For i=0 To data_array.Size - 1
						Dim a As Map
						a = data_array.Get(i)
						'Set CustomListView for Facility a.Get("username")
						Label14.Text = a.Get("count")
						Log(a.Get("count"))
					Next
				End If
		End Select
	End If
	Job.Release
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean  ' Return true to consume the event
	Dim isLogin As Boolean
	isLogin = Login.manager.GetBoolean("is_login")
	Log("keyy: "&KeyCodes.KEYCODE_BACK)
	If KeyCode = KeyCodes.KEYCODE_BACK Then  ' Back button
		If File.Exists(Main.folder,"datastore") Then
			If Main.kvs.ContainsKey("role")Then
				StopService(Starter)
				Main.ShouldIClose = True
				Activity.Finish				
			End If			
		End If
	End If
End Sub

Sub BtnLogout_Click
	'Set is_login ke false
	Login.manager.SetBoolean("is_login", False)
	
	'Buka activity Main (Halaman Login)
	StartActivity(Main)
	Activity.Finish
	ToastMessageShow("Logout berhasil", False)
	Main.kvs.Remove("username")
	Main.kvs.Remove("role")

End Sub

Sub BtnSearch_Click
	Activity.Finish
	StartActivity(SearchBuilding)
	'StartActivity(LoaderImage)
End Sub

Sub WorshipBtn_Click
	StartActivity(WorshipBuilding)
End Sub

Sub OfficeBtn_Click
	StartActivity(OfficeBuilding)
End Sub

Sub HealthBtn_Click
	StartActivity(HealthBuilding)
End Sub

Sub EducationBtn_Click
	StartActivity(EducationalBuilding)
End Sub

Sub Labellogout_Click
	'Set is_login ke false
	Login.manager.SetBoolean("is_login", False)
	
	'Buka activity Main (Halaman Login)
	
	ToastMessageShow("Logout berhasil", False)
	Main.kvs.Remove("username")
	Main.kvs.Remove("role")
	Activity.Finish
	StartActivity(Main)
	
End Sub

Sub BtnMap_Click	
	StartActivity(ManualPosition)
	Activity.Finish
End Sub

Sub BtnInfo_Click
	
End Sub

Sub Button1_Click
	AddFac_clicked = "Worship"
	StartActivity(AddFacilityType)
End Sub

Sub Button4_Click
	AddFac_clicked = "Health"
	StartActivity(AddFacilityType)
End Sub

Sub Button2_Click
	AddFac_clicked = "Office"
	StartActivity(AddFacilityType)
End Sub

Sub Button5_Click
	AddFac_clicked = "Msme"
	StartActivity(AddFacilityType)
End Sub

Sub Button3_Click
	AddFac_clicked = "Educational"
	StartActivity(AddFacilityType)
End Sub