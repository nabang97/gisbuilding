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
	Dim nama,kepala,tipe, jenis, tahun,ltanah,lparkir,lbangunan,listrik, kons, medic,nonmedic As String
	nama= ""
	tipe = ""
	jenis= ""
	Dim tipp,tipname,typehealth,cons,consname,typecons  As String
	Dim tipe_i , jenis_i, lbangunan_i, lparkir_i,ltanah_i ,listrik_i,tahun_i, cons_i,medic_i,nonmedic_i As Int
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
	Private PFacility As Panel
	Private ListItem As Panel
	Private PanelButton As Panel
	Private PanelToolbar As Panel
	Private LblEdit As Label
	
	'Set id
	Dim ids As String
	Private TypeOfHealth As Spinner
	Private HeadOffice As Label
	Private NumMedical As Label
	Private NumNonMedical As Label
	Private StandingYear As Label
	Private BuildingArea As Label
	Private LandArea As Label
	Private ParkingArea As Label
	Private Electricity As Label
	Private Construction As Spinner
	Private LblFacility As Label
	Private HealthName As Label
	
	Dim HealthMap As Map
	Dim ConsMap As Map
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Set Layout
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.LoadLayout("HealthEdit")
	ScrollView1.Panel.Height = PanelBuildingList.Height
	PanelToolbar.Visible = False
	LblEdit.Visible = True
	'Set Back arrow
	BackArrow.Visible= True
	BackArrow.SetBackgroundImage(LoadBitmap(File.DirAssets,"back-arrow.png"))
	TitleBar.Text="Building Detail"
	
	
	
	'Set building name
	If HealthBuilding.nameBuilding.Length > 0 Then
		HealthName.Text = HealthBuilding.nameBuilding
		ids =HealthBuilding.idBuilding
		Log(ids)
	Else
		HealthName.Text = "Please press on the button and choose an item."
	End If
	
	If SearchBuilding.nameBuilding.Length > 0 Then
		HealthName.Text = SearchBuilding.nameBuilding
		ids =SearchBuilding.idBuilding
		Log(ids)
	Else
		HealthName.Text = "Please press on the button and choose an item."
	End If
	
	Dim sv As ScrollView
	CLV1.sv.Height = CLV1.AsView.Height
	PFacility.Height = CLV1.AsView.Height + LblFacility.Height
	PanelButton.Top = PFacility.Top + PFacility.Height + 5%y
	PanelBuildingList.Height = PanelButton.Top + PanelButton.Height +5%y
	If PanelBuildingList.Height <= 93%y Then
		PanelBuildingList.Height = 93%y
		ScrollView1.Panel.Height = PanelBuildingList.Height
	Else
		ScrollView1.Panel.Height = PanelBuildingList.Height
	End If

End Sub

Sub Activity_Resume
	CLV1.Clear
	ProgressDialogShow("Loading...")
	ExecuteRemoteQuery("SELECT D.health_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id ='"&ids&"'","FASILITAS")
	ExecuteRemoteQuery("SELECT H.health_building_id, H.name_of_health_building, H.building_area, H.land_area, H.parking_area, H.standing_year, H.electricity_capacity, H.address, H.type_of_construction, H.type_of_health_services, H.name_of_head, H.number_of_medical_personnel, H.number_of_nonmedical_personnel, ST_X(ST_Centroid(H.geom)) As longitude, ST_Y(ST_CENTROID(H.geom)) As latitude,T.name_of_type As constr, J.name_of_type As typeh,ST_AsText(geom) As geom FROM health_building As H LEFT JOIN type_of_construction As T ON H.type_of_construction=T.type_id LEFT JOIN type_of_health_services As J ON H.type_of_health_services=J.type_id WHERE H.health_building_id='"&ids&"'","DATA")
	ExecuteRemoteQuery("SELECT type_id, name_of_type FROM type_of_construction ORDER BY name_of_type ASC ","Construction")
	ExecuteRemoteQuery("SELECT type_id, name_of_type FROM type_of_health_services ORDER BY name_of_type ASC","TypeHealth")
	HealthMap.Initialize
	ConsMap.Initialize
End Sub

Sub Activity_Pause (UserClosed As Boolean)

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
				
				Log(content)
				ProgressDialogHide
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
					HealthName.Text = a.Get("name_of_health_building")
					tipp = a.Get("type_of_msme")
					tipname = a.Get("typems")
					Log("Data jenis :"&tipp)
					HeadOffice.Text = a.Get("name_of_head")
					NumMedical.Text = a.Get("number_of_medical_personnel")
					NumNonMedical.Text = a.Get("number_of_nonmedical_personnel")
					StandingYear.Text = a.Get("standing_year")
					BuildingArea.Text = a.Get("building_area")
					LandArea.Text = a.Get("land_area")
					ParkingArea.Text = a.Get("parking_area")
					Electricity.Text = a.Get("electricity_capacity")
					cons = a.Get("type_of_construction")
					consname = a.Get("constr")
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
					Log("Data konstruksi :"&cons)
					nama=HealthName.Text
					kepala = HeadOffice.Text
					medic = NumMedical.Text
					nonmedic = NumNonMedical.Text
					tahun= StandingYear.Text
					ltanah= LandArea.Text
					lparkir= ParkingArea.Text
					lbangunan= BuildingArea.Text
					listrik= Electricity.Text
				
				Next
			Case "TypeHealth"
				Dim type_array As List
				type_array = parser.NextArray
				For i=0 To type_array.Size -1
					Dim a As Map
					a = type_array.Get(i)
					Dim namatype, idtype As String
					namatype= a.Get("name_of_type")
					idtype = a.Get("type_id")
					
					TypeOfHealth.Add(namatype)
					HealthMap.Put(namatype,idtype)
					Log("ID Map: "&namatype&" "&idtype)
				Next
				TypeOfHealth.SelectedIndex = TypeOfHealth.IndexOf(tipname)
				
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
				Construction.SelectedIndex = Construction.IndexOf(consname)
				
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

Sub btnGallery_Click
	Log(ids)
	If typehealth == "" Then
		tipe_i = tipp
	Else
		tipe_i = typehealth
	End If
	
	lbangunan_i = BuildingArea.Text
	lparkir_i = ParkingArea.Text
	ltanah_i = LandArea.Text
	listrik_i = Electricity.Text
	tahun_i = StandingYear.Text
	medic_i = NumMedical.Text
	nonmedic_i = NumNonMedical.Text
	
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
	ExecuteRemoteQuery("UPDATE health_building SET name_of_health_building = '"&nama&"', type_of_health_services = "&tipe_i&", building_area = "&lbangunan_i&",	land_area = "&ltanah_i&",parking_area = "&lparkir_i&",standing_year = "&tahun_i&",	electricity_capacity = "&listrik_i&",type_of_construction = "&cons_i&",	name_of_head = '"&kepala&"',number_of_medical_personnel = "&medic_i&",number_of_nonmedical_personnel = "&nonmedic_i&" WHERE health_building_id = '"&ids&"'","Update")
	
End Sub

Sub TypeOfHealth_ItemClick (Position As Int, Value As Object)
	Dim id As String
	id = HealthMap.Get(Value)
	typehealth = id
	Log(typehealth)
End Sub

Sub Construction_ItemClick (Position As Int, Value As Object)
	Dim idc As String
	idc = ConsMap.Get(Value)
	typecons = idc
	Log(typecons)
End Sub