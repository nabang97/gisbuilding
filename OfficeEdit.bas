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
	Dim fasilitas, lat, lng As String
	Dim quantity_fac As Int
	Dim ids As String
	ids = ""
	Dim nama,tipe, jenis, tahun,ltanah,lparkir,lbangunan,listrik, kons As String
	nama= ""
	tipe = ""
	jenis= ""
	Dim tipp,tipname,typeoffice,cons,consname,typecons  As String
	Dim tipe_i , jenis_i, lbangunan_i, lparkir_i,ltanah_i ,listrik_i,tahun_i, cons_i As Int
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private ScrollView1 As ScrollView
	Private TitleBar As Label
	Private BackArrow As Label
	Private PanelBuildingList As Panel
	Private PanelToolBar As Panel
	
	Dim OfficeName As Label
	Private TypeOfOffice As Spinner
	Private StandingYear As Label
	Private BuildingArea As Label
	Private LandArea As Label
	Private ParkingArea As Label
	Private Electricity As Label
	Private Construction As Spinner
	Private PanelToolBar As Panel
	Dim OfficeMap As Map
	Dim ConsMap As Map
	Private BtnSaveChanges As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Set Layout
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.LoadLayout("OfficeEdit")
	ScrollView1.Panel.Height = PanelBuildingList.Height
	PanelToolBar.Visible = False
	SetBackgroundTintList(OfficeName, Colors.ARGB(225,3,155,230), Colors.LightGray)
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
	If OfficeBuilding.nameBuilding.Length > 0 Then
		OfficeName.Text = OfficeBuilding.nameBuilding
		ids = WorshipBuilding.idBuilding
		Log(ids)
	Else If SearchBuilding.nameBuilding.Length > 0 Then
		OfficeName.Text = SearchBuilding.nameBuilding
		ids = SearchBuilding.idBuilding
		Log(ids)
	Else
		OfficeName.Text = "Please press on the button and choose an item."
	End If
	
	Dim sv As ScrollView
	ScrollView1.Height=100%y
	ScrollView1.Panel.Height = PanelBuildingList.Height
End Sub

Sub Activity_Resume
	OfficeMap.Initialize
	ConsMap.Initialize
	OfficeMap.Clear
	ConsMap.Clear
	ProgressDialogShow("Loading...")
	ExecuteRemoteQuery("SELECT O.office_building_id, O.name_of_office_building, O.building_area, O.land_area, O.parking_area, O.standing_year, O.electricity_capacity, O.address, O.type_of_construction, O.type_of_office, ST_X(ST_Centroid(O.geom)) As longitude, ST_Y(ST_CENTROID(O.geom)) As latitude,T.name_of_type As constr, J.name_of_type As typeof,	ST_AsText(geom) As geom	FROM office_building As O LEFT JOIN type_of_construction As T ON O.type_of_construction=T.type_id LEFT JOIN type_of_office As J ON O.type_of_office=J.type_id WHERE O.office_building_id='"&ids&"'","DATA")
	ExecuteRemoteQuery("SELECT type_id, name_of_type FROM type_of_office ORDER BY name_of_type ASC","TypeOffice")
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
					tipp = a.Get("type_of_office")
					tipname = a.Get("typeof")
					Log("Data jenis :"&tipp)
					StandingYear.Text = a.Get("standing_year")
					BuildingArea.Text = a.Get("building_area")
					LandArea.Text = a.Get("land_area")
					ParkingArea.Text = a.Get("parking_area")
					Electricity.Text = a.Get("electricity_capacity")
					cons = a.Get("type_of_construction")
					consname = a.Get("constr")
				Next
					If StandingYear.Text == "" Then
						StandingYear.Text = "0"
					End If
					If BuildingArea.Text == "" Then
						BuildingArea.Text = "0"
					End If
					If ParkingArea.Text == "" Then
						ParkingArea.Text = "0"
					End If
					If Electricity.Text == "" Then
						Electricity.Text = "0"
					End If
					Log("Data konstruksi :"&cons)
					nama=OfficeName.Text
					tahun= StandingYear.Text
					ltanah= LandArea.Text
					lparkir= ParkingArea.Text
					lbangunan= BuildingArea.Text
					listrik= Electricity.Text
					TypeOfOffice.SelectedIndex = TypeOfOffice.IndexOf(tipname)
					Construction.SelectedIndex = Construction.IndexOf(consname)
				ProgressDialogHide
			Case "Update"
				ProgressDialogHide
				Try
					Msgbox("Data has been updated! :)","Success")
					Activity.Finish
				Catch
					Msgbox("Data can not be updated :(" , "error" )
				End Try
				
			Case "TypeOffice"
				Dim type_array As List
				type_array = parser.NextArray
				For i=0 To type_array.Size -1
					Dim a As Map
					a = type_array.Get(i)
					Dim namatype, idtype As String
					namatype= a.Get("name_of_type")
					idtype = a.Get("type_id")
					
					TypeOfOffice.Add(namatype)
					OfficeMap.Put(namatype,idtype)
					Log("ID Map: "&namatype&" "&idtype)
				Next
				
			Case "Construction"
				Dim cons_array As List
				cons_array = parser.NextArray
				For j=0 To cons_array.Size -1
					Dim a As Map
					a = cons_array.Get(j)
					Dim nama_type, id_type As String
					nama_type= a.Get("name_of_type")
					id_type = a.Get("type_id")
					
					Construction.Add(nama_type)
					ConsMap.Put(nama_type,id_type)
					Log("ID Map: "&nama_type&" "&id_type)
				Next
		End Select
	End If
	Job.Release
End Sub

Sub btnGallery_Click
	
End Sub

Sub TypeOfOffice_ItemClick (Position As Int, Value As Object)
	Dim id As String
	id = OfficeMap.Get(Value)
	typeoffice = id
	Log(typeoffice)
End Sub

Sub Construction_ItemClick (Position As Int, Value As Object)
	Dim idc As String
	idc = ConsMap.Get(Value)
	typecons = idc
	Log(typecons)
End Sub

Sub BtnSaveChanges_Click
	Log(ids)
	If typeoffice == "" Then
		tipe_i = tipp
	Else
		tipe_i = typeoffice
	End If
	
	lbangunan_i = BuildingArea.Text
	lparkir_i = ParkingArea.Text
	ltanah_i = LandArea.Text
	listrik_i = Electricity.Text
	tahun_i = StandingYear.Text
	
	If typecons == "" Then
		cons_i = cons
	Else
		cons_i = typecons
	End If
	
	Log(tipe_i)
	Log(cons_i)
	If IsNumber(tipe_i) Then
		Log(""&tipe_i&" is a number")
	Else
		Log(""&tipe_i&" is not a number")
	End If
	ProgressDialogShow("loading...")
	ExecuteRemoteQuery("UPDATE office_building SET name_of_office_building = '"&nama&"', type_of_office = "&tipe_i&", building_area = "&lbangunan_i&", land_area = "&ltanah_i&", parking_area = "&lparkir_i&", standing_year = '"&tahun_i&"', electricity_capacity = "&listrik_i&", type_of_construction = "&cons_i&" WHERE office_building_id = '"&ids&"'","Update")
	
End Sub

