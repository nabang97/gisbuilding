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
	Private xui As XUI
	Dim lat, lng As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private ScrollView1 As ScrollView
	Private TitleBar As Label
	Private BackArrow As Label
	Private PanelBuildingList As Panel
	Private PanelButton As Panel
	
	Dim HouseID As Label
	Private StandingYear As Label
	Private BuildingTax As Label
	Private Electricity As Label
	Private Construction As Label
	Private PanelToolBar As Panel
	Dim ids As String
	Private LblEdit As Label
	Private Panel4 As Panel
	Dim TabHost1 As TabHost
	Private PanelMap As Panel
	Private btnRoute As Button
	Private WebViewRoute As WebView
	Private LblFcnOwner As Label
	Private FcnOwner As Label
	Private Address As Label
	Private LblStandingYear As Label
	Private LblBuildingTax As Label
	Private LblAddress As Label
	Private LblElectric As Label
	Private LblCons As Label
	Private Label2 As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Set Layout
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.LoadLayout("HouseDetail")
	ScrollView1.Panel.Height = PanelBuildingList.Height
	PanelToolBar.Visible = False
	'Set Back arrow
	BackArrow.Visible= True
	BackArrow.SetBackgroundImage(LoadBitmap(File.DirAssets,"back-arrow.png"))
	TitleBar.Text="Building Detail"
	
	TabHost1.AddTab("Map","tabMap")
	TabHost1.AddTab("Detail","House_tabDetail")
	TabHost1.AddTab("Gallery","tabGallery")
	
	
	If SearchBuilding.nameBuilding.Length > 0 Then
		HouseID.Text = SearchBuilding.nameBuilding
		ids = SearchBuilding.idBuilding
		Log(ids)
	Else
		HouseID.Text = "Please press on the button and choose an item."
	End If
	
	TabHost1.CurrentTab = 1
	Log("Height awal: "&Address.Height)
	
End Sub
Sub ExecuteRemoteQuery(Query As String, JobName As String)
	Dim Job As HttpJob
	Job.Initialize(JobName, Me)
	Job.PostString(""&Main.Server&"mobile/json.php", Query)
End Sub
Sub Activity_Resume
	ProgressDialogShow("loading...")
	ExecuteRemoteQuery("SELECT H.fcn_owner, H.address, H.standing_year, H.land_building_tax, H.type_of_construction, H.electricity_capacity, H.tap_water, H.building_status,ST_X(ST_Centroid(H.geom)) As longitude, ST_Y(ST_CENTROID(H.geom)) As latitude, ST_AsText(H.geom) As geom,T.name_of_type As jkonstruksi, O.*	FROM house_building As H LEFT JOIN type_of_construction As T ON H.type_of_construction=T.type_id JOIN house_building_owner As O ON H.fcn_owner=O.national_identity_number WHERE H.house_building_id='"&ids&"' ","DATA")
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub JobDone(Job As HttpJob)
	If Job.Success Then
		Dim res As String
		res = Job.GetString 'menyimpan json dalam bentuk string
		Log("Response from server :"& res)
		Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
		parser.Initialize(res)
		Select Job.JobName
		
			Case "DATA"
				Dim data_array As List
				data_array = parser.NextArray
				For i=0 To data_array.Size -1
					Dim a As Map
					a = data_array.Get(i)
					lat = a.Get("latitude")
					lng = a.Get("longitude")
					Log(lat)
					Log(lng)
					FcnOwner.Text = a.Get ("fcn_owner")
					StandingYear.Text = a.Get("standing_year")
					Address.Text = a.Get("address")
					BuildingTax.Text = a.Get("land_building_tax")
					Electricity.Text = a.Get("electricity_capacity")
					Construction.Text = a.Get("jkonstruksi")
				Next
				Dim su As StringUtils
				Dim heightlabel As Int
				heightlabel = su.MeasureMultilineTextHeight(Address,Address.Text)
				Log("Height akhir: "&heightlabel)
				Address.Height= heightlabel
				Select TabHost1.CurrentTab
					Case 1
						TabHost1.Height = Panel4.Top + Panel4.Height + 10%y
				End Select
				
				PanelBuildingList.Height = TabHost1.Height + TabHost1.Top
				ScrollView1.Panel.Height = PanelBuildingList.Height
				ProgressDialogHide
				
		End Select
	End If
	Job.Release
End Sub

Sub BackArrow_Click
	Activity.Finish
End Sub

Sub LblEdit_Click
	StartActivity(OfficeEdit)
End Sub

Sub TabHost1_TabChanged
	
	Select TabHost1.CurrentTab
		Case 0
			WebViewRoute.LoadUrl("https://www.google.com/maps/@-0.8206655,100.3217247,15z")
			Msgbox("Current tab is " & TabHost1.CurrentTab, "")
			Log ("Button Top :"&btnRoute.Top)
			TabHost1.Height = btnRoute.Top + btnRoute.Height + 10%y
			Log("tabHost height: "&TabHost1.Height)
			PanelBuildingList.Height = TabHost1.Height + TabHost1.Top
			ScrollView1.Panel.Height = PanelBuildingList.Height
			ScrollView1.Height = ScrollView1.Panel.Height
		Case 1
			
		Case 2
			Msgbox("Current tab is " & TabHost1.CurrentTab, "")
	End Select

End Sub