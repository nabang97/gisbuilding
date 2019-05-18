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
	Dim ScrollImage As ScrollView
	
	Dim clv As CustomListView
	Dim Label1 As Label
	Dim ImageView1 As ImageView
	
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
	Private PanelMap As Panel
	Private btnRoute As Button
	Private WebViewRoute As WebView
	
	Private editBtn As Button
	Private editFacility As Button
	Private PanelGallery As Panel
	Private tabRoute As Panel
	Private tabDetail As Panel
	'Private tabMap As Panel
	Private AddPicture As Button
	Private TabHost1 As TabHost
	Dim TabManager As TabHostExtras
	Dim tab_clicked, tab_unclicked As Int
	Private tabGallery As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
'Set Layout
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.LoadLayout("OfficeDetail")
	
	ScrollView1.Height = 100%y - ScrollView1.Top
	PanelToolBar.Visible = False
	
'Set Back arrow
	BackArrow.Visible= True
	BackArrow.SetBackgroundImage(LoadBitmapSample(File.DirAssets,"back-arrow.png",5%x,2%y))
	TitleBar.Text="Building Detail"
	
	Dim bmp1, bmp2 As Bitmap
	bmp1 = LoadBitmap(File.DirAssets, "home.png")
	TabHost1.AddTabWithIcon("",LoadBitmap(File.DirAssets,"map-marker-blue.png"),LoadBitmap(File.DirAssets,"map-marker-blue.png"),"tabMap")
	TabHost1.AddTab( "Detail","Office_tabDetail")
	TabHost1.AddTab( "Gallery", "tabGallery")
	
	TabManager.setTabHeight(TabHost1,10%x)
	TabManager.setTabGradientDrawable(TabHost1,"TOP_BOTTOM",Colors.Transparent,Colors.Transparent,0)
	TabManager.setTabContentViewPadding(TabHost1,0,20,0,0)
	
'Set building name
	FunctionAll.CheckBuilding_id(OfficeBuilding.idBuilding)
	ids = FunctionAll.ids
	Log("DARI SINI"&ids)
	
 	TabHost1.CurrentTab = 1
	AddPicture.Initialize("AddPicture")
	
	
	tab_clicked=Colors.White
	tab_unclicked=Colors.ARGB(255,0,111,196)
	FunctionAll.setCornerRadii(tabRoute,25,25,0,0,0,0,25,25)
	FunctionAll.setCornerRadii(tabRoute,25,25,0,0,0,0,25,25)
	
End Sub
Sub Activity_Resume
'	FunctionAll.setCornerRadii(tabRoute,25,25,0,0,0,0,25,25)
'	FunctionAll.setCornerRadii(tabGallery,0,0,25,25,25,25,0,0)
	CLV1.Clear
	ProgressDialogShow("Loading...")
	
	If TabHost1.CurrentTab == 2 Then
		clv.Clear
		ExecuteRemoteQuery("SELECT photo_url, upload_date FROM office_building_gallery WHERE office_building_id='"&ids&"'","Download")
	Else
	ExecuteRemoteQuery("SELECT D.office_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id ='"&ids&"'","FASILITAS")
	ExecuteRemoteQuery("SELECT O.office_building_id, O.name_of_office_building, O.building_area, O.land_area, O.parking_area, O.standing_year, O.electricity_capacity, O.address, O.type_of_construction, O.type_of_office, ST_X(ST_Centroid(O.geom)) As longitude, ST_Y(ST_CENTROID(O.geom)) As latitude,T.name_of_type As constr, J.name_of_type As typeof,	ST_AsText(geom) As geom	FROM office_building As O LEFT JOIN type_of_construction As T ON O.type_of_construction=T.type_id LEFT JOIN type_of_office As J ON O.type_of_office=J.type_id WHERE O.office_building_id='"&ids&"'","DATA")
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	CallSub(Starter, "ActivityIsPaused")
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
			Case "Download"
'			ResetImagesBackground				
				Dim agn As List
				agn=parser.NextArray
				If agn.Size - 1 < 0 Then
					Log(agn.Size)
					Dim NotFound As Label
					NotFound.Initialize("")
					PanelGallery.Color= Colors.White
					PanelGallery.AddView(NotFound,0,0,100%x,70%y)
					NotFound.Text = "Picture doesn't exist"
					NotFound.TextSize = 15
					NotFound.Gravity = Gravity.CENTER
					PanelGallery.Height = NotFound.Height
					'TabHost1.Height = PanelGallery.Height
					Msgbox("Galery Foto tidak ditemukan", "Peringatan")
				Else
					ScrollImage.Initialize(100%y)
					PanelGallery.AddView(ScrollImage,0,0,100%x,100%y)
					ScrollImage.Panel.LoadLayout("LoaderImage")
					For i=0 To agn.Size-1
						Dim w As Map
						w=agn.Get(i)
						Dim image = w.Get("photo_url") As String
						Dim gambar = ""&Main.Server&"Files/Office/img/"&image As String
						Dim m As Map
						m.Initialize
						Dim p As Panel
						p.Initialize("")
						p.SetLayout(0,0,100%x,20%y)
						p.LoadLayout("listitem-image")
						clv.Add(p,m)
						m.Put(ImageView1, gambar)
						Log (gambar)
						CallSubDelayed2(Starter, "Download", m)
					Next
					ScrollView1.Height = 100%y - ScrollView1.Top
					ScrollImage.Panel.Height = (ImageView1.Height+3%y) * agn.Size
					ScrollImage.Height = 70%y
					PanelGallery.Height = ScrollImage.Height
					TabHost1.Height = ScrollImage.Height
				End If
				AddPicture.RemoveView
				PanelBuildingList.AddView(AddPicture,0, TabHost1.Height + TabHost1.Top, 100%x, 10%y)
				PanelBuildingList.Height = AddPicture.Top + AddPicture.Height
				ScrollView1.Panel.Height = PanelBuildingList.Height
				ProgressDialogHide
			FunctionAll.setCornerRadii(tabRoute,25,25,0,0,0,0,25,25)
				FunctionAll.setCornerRadii(tabGallery,0,0,25,25,25,25,0,0)
				
			Case "FASILITAS"
				Dim fasilitas_array As List
				fasilitas_array = parser.NextArray
				If fasilitas_array.Size-1 < 0 Then
					CLV1.AsView.Visible= False
					Dim NotExist As Label
					NotExist.Initialize("")
					PFacility.AddView(NotExist,LblFacility.Left,0,LblFacility.Width,30%y)
					NotExist.Gravity= Gravity.CENTER
					NotExist.Text="Facility doesn't not exist."
					Select TabHost1.CurrentTab
						Case 1
							PFacility.Height= NotExist.Height + NotExist.Top
							TabHost1.Height = PFacility.Top+PFacility.Height
					End Select
				Else
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
					If TabHost1.CurrentTab = 1 Then
							TabHost1.Height = PFacility.Top+PFacility.Height + 10%y
					End If
				End If
				PanelBuildingList.Height = TabHost1.Height + TabHost1.Top + 2%y
				ScrollView1.Panel.Height = PanelBuildingList.Height
				ScrollView1.Height = ScrollView1.Panel.Height
				Log(content)
				ProgressDialogHide
				FunctionAll.setCornerRadii(tabRoute,25,25,0,0,0,0,25,25)
				FunctionAll.setCornerRadii(tabGallery,0,0,25,25,25,25,0,0)
				
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
				FunctionAll.setCornerRadii(tabRoute,25,25,0,0,0,0,25,25)
				FunctionAll.setCornerRadii(tabGallery,0,0,25,25,25,25,0,0)
		End Select
	End If
	Job.Release
End Sub

Sub AddPicture_Click
	ToastMessageShow("Add photo",True)
	StartActivity(AddPhoto)
End Sub

Sub BackArrow_Click
	Activity.Finish
End Sub

Sub TabHost1_TabChanged
	'FunctionAll.setCornerRadii(tabRoute,25,25,0,0,0,0,25,25)
	Select TabHost1.CurrentTab
		Case 0
			'FunctionAll.setCornerRadii(tabRoute,25,25,0,0,0,0,25,25)
			tabRoute.Color = tab_clicked
			tabDetail.Color= tab_unclicked
			tabGallery.Color= tab_unclicked			
			FunctionAll.setCornerRadii(tabRoute,25,25,0,0,0,0,25,25)
			FunctionAll.setCornerRadii(tabGallery,0,0,25,25,25,25,0,0)
			WebViewRoute.LoadUrl(Main.Server&"Office/Route.php?lat="&Main.lblLat&"&lng="&Main.lblLon&"&latd="&lat&"&lngd="&lng)
			Msgbox("Current tab is " & TabHost1.CurrentTab, "")
			Log ("Button Top :"&btnRoute.Top)
			TabHost1.Height = btnRoute.Top + btnRoute.Height + 15%y
			Log("tabHost height: "&TabHost1.Height)
			AddPicture.Visible=False
			PanelBuildingList.Height = TabHost1.Height + TabHost1.Top
			ScrollView1.Panel.Height = PanelBuildingList.Height
			
		Case 1		
			tabRoute.Color = tab_unclicked
			tabDetail.Color= tab_clicked
			tabGallery.Color = tab_unclicked
			FunctionAll.setCornerRadii(tabRoute,25,25,0,0,0,0,25,25)
			FunctionAll.setCornerRadii(tabGallery,0,0,25,25,25,25,0,0)
			CLV1.Clear
			AddPicture.Visible=False
			ProgressDialogShow("Loading...")
			ExecuteRemoteQuery("SELECT D.office_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id ='"&ids&"'","FASILITAS")
			ExecuteRemoteQuery("SELECT O.office_building_id, O.name_of_office_building, O.building_area, O.land_area, O.parking_area, O.standing_year, O.electricity_capacity, O.address, O.type_of_construction, O.type_of_office, ST_X(ST_Centroid(O.geom)) As longitude, ST_Y(ST_CENTROID(O.geom)) As latitude,T.name_of_type As constr, J.name_of_type As typeof,	ST_AsText(geom) As geom	FROM office_building As O LEFT JOIN type_of_construction As T ON O.type_of_construction=T.type_id LEFT JOIN type_of_office As J ON O.type_of_office=J.type_id WHERE O.office_building_id='"&ids&"'","DATA")
			
		Case 2
			'Log(FunctionAll.setCornerRadii(tabRoute,25,25,0,0,0,0,25,25))
			tabRoute.Color = tab_unclicked
			tabDetail.Color = tab_unclicked
			tabGallery.Color = tab_clicked
			FunctionAll.setCornerRadii(tabRoute,25,25,0,0,0,0,25,25)
			FunctionAll.setCornerRadii(tabGallery,0,0,25,25,25,25,0,0)
			'FunctionAll.setCornerRadii(tabRoute,25,25,0,0,0,0,25,25)
			AddPicture.Visible=True
			ProgressDialogShow("Loading...")
			ExecuteRemoteQuery("SELECT photo_url, upload_date FROM office_building_gallery WHERE office_building_id='"&ids&"'","Download")
			
	End Select

End Sub

Sub editBtn_Click
	StartActivity(OfficeEdit)
End Sub

Sub editFacility_Click
	StartActivity(EditBuildingFacility)
End Sub

Sub ImageView1_Click
	Dim iv As ImageView
	iv = Sender
	If iv.Background Is BitmapDrawable Then
		'It will be ColorDrawable when there is no image.
		Dim bd As BitmapDrawable
		bd = iv.Background
		Dim bmp As Bitmap
		bmp = bd.Bitmap
		CallSubDelayed2(ShowImage, "Show", bmp)
	End If
End Sub

