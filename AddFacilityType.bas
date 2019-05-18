B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: false
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private xui As XUI
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private ScrollView1 As ScrollView
	Private Label1 As Label
	Private PanelName As Panel
	Private PanelAddPanel As Panel
	Private PanelAddFacility As Panel
	Private PanelBar As Panel
	Private PanelToolBar As Panel
	Private PnListFac As Panel
	Private CLVFac As CustomListView
	Private numfc As B4XView
	Private namefc As B4XView
	Private idfaci As Label
	Private PnlQuantity As Label
	Private ListItem As Panel
	Private btnDelete As Button
	Dim idelete As Int
	Private BtnAdd As Button
	Private EditName As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.LoadLayout("AddFacilityType")	
	ScrollView1.Height = 100%y - (PanelBar.Height + PanelToolBar.Height)
	PanelAddFacility.Height = ScrollView1.Height
	ScrollView1.panel.Height = PanelAddFacility.Height

	
End Sub

Sub Activity_Resume
	CLVFac.Clear
	FunctionAll.ExecuteRemoteQuery("SELECT * FROM worship_building_facilities ORDER BY name_of_facility ASC","Worship",Me)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub CreateItem(Width As Int, Title As String, Content As String, id As Int) As Panel
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 100%x,10%x)
	p.LoadLayout("facility_type_list")
	PnlQuantity.Text = Title
	namefc.Text = Content
	idfaci.Text = id
	'SetBackgroundTintList(numfc, Colors.ARGB(225,3,155,230), Colors.LightGray)
	Return p
End Sub

Sub JobDone(Job As HttpJob)
	If Job.Success Then
		Dim res As String
		res = Job.GetString 'menyimpan json dalam bentuk string
		Log("Response from server :"& res)
		Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
		parser.Initialize(res)
		Select Job.JobName
			Case "Worship"
				Log("success")
					Dim fasi_array As List = parser.NextArray
					parser.Initialize(res)
					Dim c As Int
					For c=0 To fasi_array.Size - 1
					Dim a As Map
					a = fasi_array.Get(c)
					'Set CustomListView for Facility
					Dim id, name As String
					id=a.Get("facility_id")
					name=a.Get("name_of_facility")
					Log("id: "&id&" | name: "&name)
					CLVFac.Add(CreateItem(CLVFac.AsView.Width, $"${c+1}"$, name, $"${id}"$),"")
				Next
					CLVFac.AsView.Height = (ListItem.Height+0.6%x) * fasi_array.Size
					CLVFac.sv.Height = CLVFac.AsView.Height
					PnListFac.Height =CLVFac.AsView.Height
			Case "DeleteAll"
				Dim fasi_array As List = parser.NextArray
				If fasi_array.Size = 0 Then
					FunctionAll.ExecuteRemoteQuery("DELETE FROM worship_building_facilities WHERE facility_id="&idelete,"Delete",Me)
				Else
					ProgressDialogHide
					Msgbox("Ada Error"& Job.ErrorMessage,"Error")
				End If
				
			Case "Delete"
				Dim fasi_array As List = parser.NextArray
				If fasi_array.Size = 0 Then
					Try
						CLVFac.Clear
						FunctionAll.ExecuteRemoteQuery("SELECT * FROM worship_building_facilities ORDER BY name_of_facility ASC","Worship",Me)
						ProgressDialogHide
						ToastMessageShow("Deleted",False)					
					Catch
						Msgbox("Error ???" , "error" )
						Log(LastException)
					End Try
				Else
					Try
						Msgbox("can't update data" , "Failed" )
					Catch
						Msgbox("Error ???" , "error" )
						Log(LastException)
					End Try
				End If		
			Case "AddFacility"	
				Dim fasi_array As List = parser.NextArray
				Dim c As Int
				For c=0 To fasi_array.Size - 1
					Dim a As Map
					a = fasi_array.Get(c)
					'Set CustomListView for Facility
					Dim id As String
					id = a.Get("id")
					Log(id)
				Next	
				Dim id2 As Int =id + 1
				FunctionAll.ExecuteRemoteQuery("INSERT INTO worship_building_facilities (facility_id, name_of_facility) VALUES ("&id2&",'"&EditName.Text&"')","AddSuccess",Me)
			Case "AddSuccess"
				Try
					CLVFac.Clear
					FunctionAll.ExecuteRemoteQuery("SELECT * FROM worship_building_facilities ORDER BY name_of_facility ASC","Worship",Me)
					ProgressDialogHide
					ToastMessageShow("Added!",False)
				Catch
					ToastMessageShow("Failed!",False)
					Log(LastException)
				End Try
		End Select
	End If
	Job.Release
End Sub

Sub CLVFac_ItemClick (Index As Int, Value As Object)
	
End Sub

Sub btnDelete_Click
	Dim item As Int = CLVFac.GetItemFromView(Sender)
	Dim p As B4XView
	p = CLVFac.GetPanel(item)
	Dim a As B4XView
	a = p.GetView(0)
	idelete= a.GetView(2).Text
	Log("NAMA BUILDING: "&a.GetView(2).Text)
	Msgbox2Async("Are you sure to delete all facilities consist "&a.GetView(0).Text&"?", "Caution", "Yes", "Cancel", "No", Null, False)
	Wait For Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		Log("YES")
		ProgressDialogShow("deleting..")
		FunctionAll.ExecuteRemoteQuery("DELETE FROM detail_worship_building_facilities WHERE facility_id="&idelete,"DeleteAll",Me)
	Else
		Log("CANCEL")
	End If
End Sub

Sub BtnAdd_Click
	If EditName.Text <> "" Then		
		ProgressDialogShow("Adding facility..")
		FunctionAll.ExecuteRemoteQuery("SELECT MAX(facility_id) AS id FROM worship_building_facilities","AddFacility",Me)
	Else
		Msgbox("Fill the blank","")
	End If

End Sub