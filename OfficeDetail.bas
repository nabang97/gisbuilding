﻿B4A=true
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
	Private CLV1 As CustomListView
	Private ScrollView1 As ScrollView
	Private TitleBar As Label
	Private BackArrow As Label
	Private PanelBuildingList As Panel
	Private numfc As B4XView
	Private namefc As B4XView
	Private btnGallery As Panel
	Private PFacility As Panel
	Private ListItem As Panel
	Private PanelButton As Panel
	
	Dim OfficeName As Label
	Private TypeOfOffice As Label
	Private StandingYear As Label
	Private BuildingArea As Label
	Private LandArea As Label
	Private ParkingArea As Label
	Private Electricity As Label
	Private Construction As Label
	Private PanelToolBar As Panel
	Dim ids As String
	Private LblEdit As Label
	Private LblFacility As Label
	Private Panel4 As Panel
	Dim TabHost1 As TabHost
	Private PanelMap As Panel
	Private btnRoute As Button
	Private WebViewRoute As WebView
	
	Private editBtn As Button
	Private editFacility As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
'Set Layout
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.LoadLayout("OfficeDetail")
	ScrollView1.Panel.Height = PanelBuildingList.Height
	PanelToolBar.Visible = False
	
'Set Back arrow
	BackArrow.Visible= True
	BackArrow.SetBackgroundImage(LoadBitmap(File.DirAssets,"back-arrow.png"))
	TitleBar.Text="Building Detail"
	
	TabHost1.AddTab("Map","tabMap")
	TabHost1.AddTab("Detail","Office_tabDetail")
	TabHost1.AddTab("Gallery","tabGallery")
	
'Set building name
	If OfficeBuilding.nameBuilding.Length > 0 Then
		OfficeName.Text = OfficeBuilding.nameBuilding
		ids = OfficeBuilding.idBuilding
		Log(ids)
	Else
		OfficeName.Text = "Please press on the button and choose an item."
	End If
	
	If SearchBuilding.nameBuilding.Length > 0 Then
		OfficeName.Text = SearchBuilding.nameBuilding
		ids = SearchBuilding.idBuilding
		Log(ids)
	Else
		OfficeName.Text = "Please press on the button and choose an item."
	End If
	
	TabHost1.CurrentTab = 1
	CLV1.Clear
	ProgressDialogShow("loading...")
	ExecuteRemoteQuery("SELECT D.office_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id ='"&ids&"'","FASILITAS")
	ExecuteRemoteQuery("SELECT O.office_building_id, O.name_of_office_building, O.building_area, O.land_area, O.parking_area, O.standing_year, O.electricity_capacity, O.address, O.type_of_construction, O.type_of_office, ST_X(ST_Centroid(O.geom)) As longitude, ST_Y(ST_CENTROID(O.geom)) As latitude,T.name_of_type As constr, J.name_of_type As typeof,	ST_AsText(geom) As geom	FROM office_building As O LEFT JOIN type_of_construction As T ON O.type_of_construction=T.type_id LEFT JOIN type_of_office As J ON O.type_of_office=J.type_id WHERE O.office_building_id='"&ids&"'","DATA")
	
End Sub

Private Sub CreateItem(Width As Int, Title As String, Content As String) As Panel
	Dim p As B4XView = xui.CreatePanel("")
	p.LoadLayout("facility_list")
	p.SetLayoutAnimated(0, 0, 0, Width, 5%y)
	numfc.Text = Title
	namefc.Text = Content
	Return p
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
			Case "FASILITAS"
				Dim fasilitas_array As List
				fasilitas_array = parser.NextArray
				For i=0 To fasilitas_array.Size - 1
					Dim a As Map
					a = fasilitas_array.Get(i)
					'Set CustomListView for Facility
					Dim content As String = a.Get("name_of_facility")
					Dim quantity As Int = a.Get("quantity_of_facilities")
					CLV1.Add(CreateItem(CLV1.AsView.Width, $"${quantity}"$, content), "")
					CLV1.AsView.Height = ListItem.Height*(i+1)
				Next
				CLV1.sv.Height = CLV1.AsView.Height
				PFacility.Height = LblFacility.Height + LblFacility.Top
				PFacility.Height = PFacility.Height + CLV1.sv.Height + CLV1.AsView.Top
				Select TabHost1.CurrentTab
					Case 1
						TabHost1.Height = PFacility.Top+PFacility.Height +  10%y
				End Select
				
				PanelBuildingList.Height = TabHost1.Height + TabHost1.Top
				ScrollView1.Panel.Height = PanelBuildingList.Height
				ScrollView1.Height = ScrollView1.Panel.Height
				Log(content)
				ProgressDialogHide
				
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
					OfficeName.Text = a.Get("name_of_office_building")
					TypeOfOffice.Text = a.Get("typeof")
					StandingYear.Text = a.Get("standing_year")
					BuildingArea.Text = a.Get("building_area")
					LandArea.Text = a.Get("land_area")
					ParkingArea.Text = a.Get("parking_area")
					Electricity.Text = a.Get("electricity_capacity")
					Construction.Text = a.Get("constr")
				Next
		End Select
	End If
	Job.Release
End Sub

Sub Activity_Resume
	CLV1.Clear
	ProgressDialogShow("loading...")
	ExecuteRemoteQuery("SELECT D.office_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id ='"&ids&"'","FASILITAS")
	ExecuteRemoteQuery("SELECT O.office_building_id, O.name_of_office_building, O.building_area, O.land_area, O.parking_area, O.standing_year, O.electricity_capacity, O.address, O.type_of_construction, O.type_of_office, ST_X(ST_Centroid(O.geom)) As longitude, ST_Y(ST_CENTROID(O.geom)) As latitude,T.name_of_type As constr, J.name_of_type As typeof,	ST_AsText(geom) As geom	FROM office_building As O LEFT JOIN type_of_construction As T ON O.type_of_construction=T.type_id LEFT JOIN type_of_office As J ON O.type_of_office=J.type_id WHERE O.office_building_id='"&ids&"'","DATA")
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
Sub BackArrow_Click
	Activity.Finish
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

Sub editBtn_Click
	StartActivity(OfficeEdit)
End Sub

Sub editFacility_Click
	StartActivity(EditBuildingFacility)
End Sub