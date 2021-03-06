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
	Dim level,levelname,typeschool, typeschoolname,cons,consname,typecons  As String
	Dim idlevel, idcons, idtype As String
	Dim tipe_i , level_i, lbangunan_i, lparkir_i,ltanah_i ,listrik_i,tahun_i, cons_i, teacher_i, student_i As Int
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private ScrollView1 As ScrollView
	Private TitleBar As Label
	Private BackArrow As Label
	Private PanelBuildingList As Panel
	Private LblEdit As Label
	
	Private StandingYear As Label
	Private BuildingArea As Label
	Private LandArea As Label
	Private ParkingArea As Label
	Private Electricity As Label
	Private Construction As Spinner
	Dim EducationName As Label
	Private TypeOfEducation As Spinner
	Private schoollevel As Spinner
	Private Headmaster As Label
	Private NumTeacher As Label
	Private NumStudent As Label
	Private PanelToolbar As Panel
	'Set id
	Dim ids As String
	
	Dim EduMap As Map
	Dim ConsMap As Map
	Dim LevelMap As Map
	
	Private BtnSaveChanges As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Set Layout
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.LoadLayout("EducationalEdit")
	ScrollView1.Panel.Height = PanelBuildingList.Height
	PanelToolbar.Visible = False
	
	SetBackgroundTintList(EducationName, Colors.ARGB(225,3,155,230), Colors.LightGray)
	SetBackgroundTintList(Headmaster, Colors.ARGB(225,3,155,230), Colors.LightGray)
	SetBackgroundTintList(NumTeacher, Colors.ARGB(225,3,155,230), Colors.LightGray)
	SetBackgroundTintList(NumStudent, Colors.ARGB(225,3,155,230), Colors.LightGray)
	SetBackgroundTintList(StandingYear, Colors.ARGB(225,3,155,230), Colors.LightGray)
	SetBackgroundTintList(BuildingArea, Colors.ARGB(225,3,155,230), Colors.LightGray)
	SetBackgroundTintList(LandArea, Colors.ARGB(225,3,155,230), Colors.LightGray)
	SetBackgroundTintList(Electricity, Colors.ARGB(225,3,155,230), Colors.LightGray)
	SetBackgroundTintList(ParkingArea, Colors.ARGB(225,3,155,230), Colors.LightGray)
	
	'Set Back arrow
	BackArrow.Visible= True
	BackArrow.SetBackgroundImage(LoadBitmap(File.DirAssets,"back-arrow.png"))
	TitleBar.Text="Building Detail"
	
	'Set building name
	If EducationalBuilding.nameBuilding.Length > 0 Then
		EducationName.Text = EducationalBuilding.nameBuilding
		ids =EducationalBuilding.idBuilding
		Log(ids)
	Else If SearchBuilding.nameBuilding.Length > 0 Then
		EducationName.Text = SearchBuilding.nameBuilding
		ids =SearchBuilding.idBuilding
		Log(ids)
	Else
		EducationName.Text = "Please press on the button and choose an item."
	End If
	
	EduMap.Initialize
	ConsMap.Initialize
	LevelMap.Initialize
	
	Dim sv As ScrollView
	ScrollView1.Height=100%y	
	PanelBuildingList.Height=BtnSaveChanges.Top+BtnSaveChanges.Height+10%y
	ScrollView1.Panel.Height = PanelBuildingList.Height
End Sub

Sub Activity_Resume
	EduMap.Clear
	ConsMap.Clear
	LevelMap.Clear
	CreateSchoolLevel
	ProgressDialogShow("Loading...")
	ExecuteRemoteQuery("SELECT D.educational_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id ='"&ids&"'","FASILITAS")
	ExecuteRemoteQuery("SELECT E.educational_building_id, E.name_of_educational_building, E.building_area, E.land_area, E.parking_area, E.standing_year, E.electricity_capacity, E.address, E.type_of_construction, E.id_level_of_education, E.headmaster_name, E.total_students, E.total_teachers, E.school_type,ST_X(ST_Centroid(E.geom)) As longitude, ST_Y(ST_CENTROID(E.geom)) As latitude, T.name_of_type As constr, L.name_of_level As level, ST_AsText(geom) As geom FROM educational_building As E	LEFT JOIN type_of_construction As T ON E.type_of_construction=T.type_id	LEFT JOIN level_of_education As L ON E.id_level_of_education=L.level_id	WHERE E.educational_building_id='"&ids&"'","DATA")
	ExecuteRemoteQuery("SELECT level_id, name_of_level FROM level_of_education ORDER BY name_of_level ASC","TypeEducation")
	ExecuteRemoteQuery("SELECT type_id, name_of_type FROM type_of_construction ORDER BY name_of_type ASC ","Construction")
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub SetBackgroundTintList(View As View,Active As Int, Enabled As Int)
	Dim States(2,1) As Int
	States(0,0) = 16842908     'Active
	States(1,0) = 16842910    'Enabled
	Dim Color(2) As Int = Array As Int(Active,Enabled)
	Dim CSL As JavaObject
	CSL.InitializeNewInstance("android.content.res.ColorStateList",Array As Object(States,Color))
	Dim jo As JavaObject
	jo.InitializeStatic("android.support.v4.view.ViewCompat")
	jo.RunMethod("setBackgroundTintList", Array(View, CSL))
End Sub

Sub CreateSchoolLevel
	TypeOfEducation.Add("Private School")
	EduMap.Put("Private School","0")
	TypeOfEducation.Add("Public School")
	EduMap.Put("Public School","1")
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
					Headmaster.Text = a.Get("headmaster_name")
					NumTeacher.Text = a.Get("total_teachers")
					NumStudent.Text = a.Get("total_students")
					StandingYear.Text = a.Get("standing_year")
					BuildingArea.Text = a.Get("building_area")
					LandArea.Text = a.Get("land_area")
					ParkingArea.Text = a.Get("parking_area")
					Electricity.Text = a.Get("electricity_capacity")
					level = a.Get("id_level_of_education")
					levelname = a.Get("level")
					typeschool = a.Get("school_type")
					cons = a.Get("type_of_construction")
					consname = a.Get("constr")
					Select typeschool
						Case "0"
							typeschoolname = "Private School"
						Case "1"
							typeschoolname = "Public School"
					End Select
					Log(typeschoolname)
					
					If StandingYear.Text == "null" Then
						StandingYear.Text = "0"
					End If
					If BuildingArea.Text == "null" Then
						BuildingArea.Text = "0"
					End If
					If ParkingArea.Text == "null" Then
						ParkingArea.Text = "0"
					End If
					If Electricity.Text == "null" Then
						Electricity.Text = "0"
					End If
					If LandArea.Text == "null" Then
						LandArea.Text = "0"
					End If
				Next
				schoollevel.SelectedIndex = schoollevel.IndexOf(levelname)				
				TypeOfEducation.SelectedIndex = TypeOfEducation.IndexOf(typeschoolname)
				Construction.SelectedIndex = Construction.IndexOf(consname)
				Log("TYpe: "&TypeOfEducation.SelectedIndex&" Level: "&schoollevel.SelectedIndex& " COns :" &Construction.SelectedIndex)
				ProgressDialogHide
				
			Case "TypeEducation"
				Dim type_array As List
				type_array = parser.NextArray
				For i=0 To type_array.Size -1
					Dim a As Map
					a = type_array.Get(i)
					Dim namatype, id_type As String
					namatype= a.Get("name_of_level")
					id_type = a.Get("level_id")					
					schoollevel.Add(namatype)
					LevelMap.Put(namatype,id_type)
					Log("ID Map: "&namatype&" "&id_type)
				Next
				
			Case "Construction"
				Dim cons_array As List
				cons_array = parser.NextArray
				For j=0 To cons_array.Size -1
					Dim a As Map
					a = cons_array.Get(j)
					Dim nama_type, id_type As String
					nama_type= a.Get("name_of_type")
					id_type  = a.Get("type_id")
					Construction.Add(nama_type)
					ConsMap.Put(nama_type, id_type )
					Log("ID Map: "&nama_type&" "& id_type )
				Next
				
			Case "Update"
				ProgressDialogHide
				Try
					Msgbox("Data has been updated! :)","Success")
					Activity.Finish
				Catch
					Msgbox("Data can not be updated :(" , "error" )
				End Try
		End Select
	End If
	Job.Release

End Sub

Sub BackArrow_Click
	Activity.Finish
End Sub

Sub TypeOfEducation_ItemClick (Position As Int, Value As Object)
	Dim id As String
	id = EduMap.Get(Value)
	idtype = id
	Log(idtype)
End Sub

Sub SchoolLevel_ItemClick (Position As Int, Value As Object)
	Dim id As String
	id = LevelMap.Get(Value)
	idlevel = id
	Log(idlevel)
End Sub

Sub Construction_ItemClick (Position As Int, Value As Object)
	Dim id As String
	id = ConsMap.Get(Value)
	idcons = id
	Log(idcons)
End Sub

Sub btnGallery_Click
	
End Sub

Sub BtnSaveChanges_Click
	Log(ids)
	If idtype == "" Then
		tipe_i = typeschool
	Else
		tipe_i = idtype
	End If
	
	lbangunan_i = BuildingArea.Text
	lparkir_i = ParkingArea.Text
	ltanah_i = LandArea.Text
	listrik_i = Electricity.Text
	tahun_i = StandingYear.Text
	teacher_i = NumTeacher.Text
	student_i = NumStudent.Text
	
	If idlevel == "" Then
		level_i = level
	Else		
		level_i = idlevel
	End If
	
	If idcons == "" Then
		cons_i = cons
	Else
		cons_i = idcons
	End If
	
	Log(tipe_i)
	Log(cons_i)
	If IsNumber(tipe_i) Then
		Log(""&tipe_i&" is a number")
	Else
		Log(""&tipe_i&" is not a number")
	End If
	ProgressDialogShow("loading...")
	ExecuteRemoteQuery("UPDATE educational_building SET	name_of_educational_building = '"&EducationName.Text&"', headmaster_name = '"&Headmaster.Text&"', total_students = "&student_i&", total_teachers = "&teacher_i&", school_type = "&tipe_i&", id_level_of_education = "&level_i&", standing_year = "&tahun_i&",building_area = "&lbangunan_i&",land_area = "&ltanah_i&",parking_area = "&lparkir_i&", electricity_capacity = "&listrik_i&", type_of_construction = "&cons_i&"	WHERE educational_building_id = '"&ids&"'","Update")
	
End Sub