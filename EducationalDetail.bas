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
	Private links As List
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Dim ScrollImage As ScrollView
	
	Dim clv As CustomListView
	Dim Label1 As Label
	Dim ImageView1 As ImageView
	Dim ImageViews As List
	
	Dim menu As ArcMenu
	Dim menuButtonStatic, menuButtonAnimated As Bitmap
	Private CLV1 As CustomListView
	Private ScrollView1 As ScrollView
	Private TitleBar As Label
	Private BackArrow As Label
	Private PanelBuildingList As Panel
	Private numfc As B4XView
	Private namefc As B4XView
	Private PFacility As Panel
	Private ListItem As Panel
	Private PanelButton As Panel
	Private Panel4 As Panel
	Dim TabHost1 As TabHost
	Dim bmp1, bmp2 As Bitmap
	
	Private StandingYear As Label
	Private BuildingArea As Label
	Private LandArea As Label
	Private ParkingArea As Label
	Private Electricity As Label
	Private Construction As Label
	Dim EducationName As Label
	Private TypeOfEducation As Label
	Private SchoolLevel As Label
	Private Headmaster As Label
	Private NumTeacher As Label
	Private NumStudent As Label
	Private PanelToolbar As Panel
	Private LblFacility As Label
	'Set id
	Dim ids As String
	Private PanelMap As Panel
	Private btnRoute As Button
	Private WebViewRoute As WebView
	Private editBtn As Button
	Private editFacility As Button
	Private PanelGallery As Panel
	
	Private AddPicture As Button
	AddPicture.Initialize("AddPicture")
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Set Layout
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.LoadLayout("EducationalDetail")
	PanelToolbar.Visible = False
	ScrollView1.Height = 100%y - ScrollView1.Top
	TabHost1.AddTab("Map","tabMap")
	TabHost1.AddTab("Detail","Educational_tabDetail")
	TabHost1.AddTab("Gallery","tabGallery")
	
	'Set Back arrow
	BackArrow.Visible= True
	BackArrow.SetBackgroundImage(LoadBitmap(File.DirAssets,"back-arrow.png"))
	TitleBar.Text="Building Detail"
	
	'Set building name
	If EducationalBuilding.nameBuilding.Length > 0 Then
		EducationName.Text = EducationalBuilding.nameBuilding
		ids =EducationalBuilding.idBuilding
		Log(ids)
	Else
		EducationName.Text = "Please press on the button and choose an item."
	End If
	
	If SearchBuilding.nameBuilding.Length > 0 Then
		EducationName.Text = SearchBuilding.nameBuilding
		ids =SearchBuilding.idBuilding
		Log(ids)
	Else
		EducationName.Text = "Please press on the button and choose an item."
	End If

	TabHost1.CurrentTab = 1
End Sub

Sub Activity_Resume
	CLV1.Clear	
	ProgressDialogShow("Loading...")
	If TabHost1.CurrentTab == 2 Then
		clv.Clear
		ExecuteRemoteQuery("SELECT photo_url, upload_date FROM educational_building_gallery WHERE educational_building_id='"&ids&"'","Download")
	Else
		ExecuteRemoteQuery("SELECT D.educational_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id ='"&ids&"'","FASILITAS")
		ExecuteRemoteQuery("SELECT E.educational_building_id, E.name_of_educational_building, E.building_area, E.land_area, E.parking_area, E.standing_year, E.electricity_capacity, E.address, E.type_of_construction, E.id_level_of_education, E.headmaster_name, E.total_students, E.total_teachers, E.school_type,ST_X(ST_Centroid(E.geom)) As longitude, ST_Y(ST_CENTROID(E.geom)) As latitude, T.name_of_type As constr, L.name_of_level As levels, ST_AsText(geom) As geom FROM educational_building As E	LEFT JOIN type_of_construction As T ON E.type_of_construction=T.type_id	LEFT JOIN level_of_education As L ON E.id_level_of_education=L.level_id	WHERE E.educational_building_id='"&ids&"'","DATA")
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
		Log("Response:"& res)
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
					TabHost1.Height = PanelGallery.Height
					Msgbox("Galery Foto tidak ditemukan", "Peringatan")
				Else
					ScrollImage.Initialize(100%y)
					PanelGallery.AddView(ScrollImage,0,0,100%x,100%y)					
					ScrollImage.Panel.LoadLayout("LoaderImage")
					For i=0 To agn.Size-1
						Dim w As Map
						w=agn.Get(i)
						Dim image = w.Get("photo_url") As String
						Dim gambar = ""&Main.Server&"Files/Educational/img/"&image As String
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
				Dim sv As ScrollView
				CLV1.sv.Height = CLV1.AsView.Height
				PFacility.Height = LblFacility.Height + LblFacility.Top
				PFacility.Height = PFacility.Height + CLV1.sv.Height + CLV1.AsView.Top
				Select TabHost1.CurrentTab
					Case 1
						TabHost1.Height = PFacility.Top+PFacility.Height + 10%y
				End Select		
				End If
				PanelBuildingList.Height = TabHost1.Height + TabHost1.Top + 2%y
				ScrollView1.Panel.Height = PanelBuildingList.Height
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
					
					EducationName.Text = a.Get("name_of_educational_building")
					SchoolLevel.Text = a.Get("levels")		
					Log("Level sekolah: "&SchoolLevel.Text)
					Headmaster.Text = a.Get("headmaster_name")
					NumTeacher.Text = a.Get("total_teachers")
					NumStudent.Text = a.Get("total_students")
					StandingYear.Text = a.Get("standing_year")
					BuildingArea.Text = a.Get("building_area")
					LandArea.Text = a.Get("land_area")
					ParkingArea.Text = a.Get("parking_area")
					Electricity.Text = a.Get("electricity_capacity")
					Construction.Text = a.Get("constr")
					If a.Get("school_type") == Null Then
						TypeOfEducation.Text = "Private School"
					Else 
						TypeOfEducation.Text = "Public School"
					End If
				Next
		End Select
	End If
	Job.Release
End Sub

Sub AddPicture_Click
	ToastMessageShow("Add photo",True)
	StartActivity(AddPhoto)
End Sub

Sub TabHost1_TabChanged
	
	Select TabHost1.CurrentTab
		Case 0
			WebViewRoute.LoadUrl(Main.Server&"Educational/Route.php?lat="&Main.lblLat&"&lng="&Main.lblLon&"&latd="&lat&"&lngd="&lng)
			Msgbox("Current tab is " & TabHost1.CurrentTab, "")
			Log ("Button Top :"&btnRoute.Top)
			TabHost1.Height = btnRoute.Top + btnRoute.Height + 15%y
			AddPicture.Visible=False
			Log("tabHost height: "&TabHost1.Height)
			PanelBuildingList.Height = TabHost1.Height + TabHost1.Top
			ScrollView1.Panel.Height = PanelBuildingList.Height
		Case 1
			CLV1.Clear
			AddPicture.Visible=False
			ProgressDialogShow("loading...")
			ExecuteRemoteQuery("SELECT D.educational_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id ='"&ids&"'","FASILITAS")
			ExecuteRemoteQuery("SELECT E.educational_building_id, E.name_of_educational_building, E.building_area, E.land_area, E.parking_area, E.standing_year, E.electricity_capacity, E.address, E.type_of_construction, E.id_level_of_education, E.headmaster_name, E.total_students, E.total_teachers, E.school_type,ST_X(ST_Centroid(E.geom)) As longitude, ST_Y(ST_CENTROID(E.geom)) As latitude, T.name_of_type As constr, L.name_of_level As levels, ST_AsText(geom) As geom FROM educational_building As E	LEFT JOIN type_of_construction As T ON E.type_of_construction=T.type_id	LEFT JOIN level_of_education As L ON E.id_level_of_education=L.level_id	WHERE E.educational_building_id='"&ids&"'","DATA")
		Case 2
			'Msgbox("Current tab is " & TabHost1.CurrentTab, "")
			AddPicture.Visible=True
			ProgressDialogShow("loading...")
			ExecuteRemoteQuery("SELECT photo_url, upload_date FROM educational_building_gallery WHERE educational_building_id='"&ids&"'","Download")
	End Select

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

Sub BackArrow_Click
	Activity.Finish
End Sub

Sub editBtn_Click
	StartActivity(EducationalEdit)
End Sub

Sub editFacility_Click
	StartActivity(EditBuildingFacility)
End Sub