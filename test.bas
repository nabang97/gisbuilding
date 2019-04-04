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
	Dim fasilitas, lat, lng As String
	Dim quantity_fac As Int
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
	
	Dim WorshipName As Label
	Private TypeOfWorship As Label
	Private StandingYear As Label
	Private BuildingArea As Label
	Private LandArea As Label
	Private ParkingArea As Label
	Private Electricity As Label
	Private Construction As Label
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Set Layout
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.LoadLayout("WorshipDetail")
	ScrollView1.Panel.Height = PanelBuildingList.Height
	
	'Set Back arrow
	BackArrow.Visible= True
	BackArrow.SetBackgroundImage(LoadBitmap(File.DirAssets,"back-arrow.png"))
	TitleBar.Text="Building Detail"
	
	'Set building name
	If WorshipBuilding.nameBuilding.Length > 0 Then
		WorshipName.Text = WorshipBuilding.nameBuilding
	Else
		WorshipName.Text = "Please press on the button and choose an item."
	End If
	
	'Set id
	Dim ids As String
	ids = WorshipBuilding.idBuilding
	Log(ids)
	
	'Get data
'	Dim j As HttpJob
'	j.Initialize("", Me)
'	j.Download(Main.Server&"mobile/detailibadah.php?id="&ids)
'	Wait For (j) JobDone (j As HttpJob)
'	Log(j.Success)
'	JobDone(j)

	ExecuteRemoteQuery("SELECT D.worship_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id ='"&WorshipBuilding.idBuilding&"'","FASILITAS")
	ExecuteRemoteQuery("SELECT W.worship_building_id, W.name_of_worship_building, W.building_area, W.land_area, W.parking_area, W.standing_year, W.electricity_capacity, W.address, W.type_of_construction, W.type_of_worship, ST_X(ST_Centroid(W.geom)) As longitude, ST_Y(ST_CENTROID(W.geom)) As latitude, T.name_of_type As constr, J.name_of_type As Type, ST_AsText(geom) As geom FROM worship_building As W LEFT JOIN type_of_construction As T ON W.type_of_construction=T.type_id LEFT JOIN type_of_worship As J ON W.type_of_worship=J.type_id WHERE W.worship_building_id='"&WorshipBuilding.idBuilding&"'","DATA")
	
	PFacility.Height=CLV1.AsView.Height + 30dip
	Dim sv As ScrollView
	CLV1.sv.Height= CLV1.AsView.Height + 2%y
	PanelBuildingList.Height = PanelBuildingList.Height + PFacility.Height
	ScrollView1.Panel.Height = PanelBuildingList.Height - 16%y
	PanelButton.Top= PanelBuildingList.Height - 30%y
	ToastMessageShow($"${CLV1.sv.ScrollViewInnerPanel.Height}"$,True)
	
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
				Dim produkik_array As List
				produkik_array = parser.NextArray
				For i=0 To produkik_array.Size - 1
						Dim a As Map
						a = produkik_array.Get(i)		
						'Set CustomListView for Facility
						Dim content As String = a.Get("name_of_facility")
						Dim quantity As Int = a.Get("quantity_of_facilities")
						CLV1.Add(CreateItem(CLV1.AsView.Width, $"${quantity}"$, content), "")
						CLV1.AsView.Height = ListItem.Height*(i+1)
				Next
				Log(content)
				ProgressDialogHide
				
			Case "DATA"
				Dim produkik_array As List
				produkik_array = parser.NextArray
				For i=0 To produkik_array.Size -1
						Dim a As Map
						a = produkik_array.Get(i)
						lat = a.Get("latitude")
						lng = a.Get("longitude")
						Log(lat)
						Log(lng)					
					Next
		End Select
	End If
	Job.Release

End Sub

Sub Activity_Resume
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
Sub BackArrow_Click
	Activity.Finish
End Sub



Sub BtnHome_Click
	
End Sub

Sub BtnMap_Click
	
End Sub

Sub BtnSearch_Click
	
End Sub

Sub BtnInfo_Click
	
End Sub