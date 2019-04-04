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
	Dim ids As String
	ids = ""
	Dim nama,tipe, jenis, tahun,ltanah,lparkir,lbangunan,listrik, kons As String
	nama= ""
	tipe = ""
	jenis= ""
	Dim tipp,tipname,typeworship,cons,consname,typecons  As String
	Dim tipe_i , jenis_i, lbangunan_i, lparkir_i,ltanah_i ,listrik_i,tahun_i, cons_i As Int
	Dim idisi,isi As String
	Dim ArraySize2 As Int
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private CLV1 As CustomListView
	Private ScrollView1 As ScrollView
	Private TitleBar As Label
	Private BackArrow As Label
	Private PanelBuildingList As Panel
	Private PanelToolBar As Panel
	
	Private numfc As B4XView
	Private namefc As Spinner
	Private btnGallery As Panel
	Private PFacility As Panel
	Private ListItem As Panel
	Private PanelButton As Panel
	
	Dim WorshipName As Label
	Private TypeOfWorship As Spinner
	Dim WorshipMap As Map
	Private StandingYear As Label
	Private BuildingArea As Label
	Private LandArea As Label
	Private ParkingArea As Label
	Private Electricity As Label
	Private Construction As Spinner
	Dim ConsMap As Map
	Dim FacMap As Map
	Dim ArraySize As Int
	Dim fasilitasall_array As List
	Dim f As Map
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Set Layout
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.LoadLayout("WorshipEdit")
	ScrollView1.Panel.Height = PanelBuildingList.Height
	PanelToolBar.Visible = False
	
	'Set Back arrow
	BackArrow.Visible= True
	BackArrow.SetBackgroundImage(LoadBitmap(File.DirAssets,"back-arrow.png"))
	TitleBar.Text="Building Detail"
	
	'Set building name
	If WorshipBuilding.nameBuilding.Length > 0 Then
		WorshipName.Text = WorshipBuilding.nameBuilding
		ids = WorshipBuilding.idBuilding
		Log(ids)
	Else
		WorshipName.Text = "Please press on the button and choose an item."
	End If
	
	If SearchBuilding.nameBuilding.Length > 0 Then
		WorshipName.Text = SearchBuilding.nameBuilding
		ids = SearchBuilding.idBuilding
		Log(ids)
	Else
		WorshipName.Text = "Please press on the button and choose an item."
	End If
	
	
	PFacility.Height=CLV1.AsView.Height + 30dip
	Dim sv As ScrollView
	CLV1.sv.Height= CLV1.AsView.Height + 2%y
	PanelBuildingList.Height = PanelBuildingList.Height + PFacility.Height
	ScrollView1.Panel.Height = PanelBuildingList.Height - 16%y
	PanelButton.Top= PanelBuildingList.Height - 30%y
	ToastMessageShow($"${CLV1.sv.ScrollViewInnerPanel.Height}"$,True)

End Sub

Sub Activity_Resume
	WorshipMap.Initialize
	ConsMap.Initialize
	FacMap.Initialize
	ExecuteRemoteQuery("SELECT facility_id , name_of_facility as nameface FROM worship_building_facilities ORDER BY name_of_facility ASC","AllFacilities")
	ExecuteRemoteQuery("SELECT D.worship_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id ='"&ids&"'","FASILITAS")
	ExecuteRemoteQuery("SELECT W.worship_building_id, W.name_of_worship_building, W.building_area, W.land_area, W.parking_area, W.standing_year, W.electricity_capacity, W.address, W.type_of_construction, W.type_of_worship, ST_X(ST_Centroid(W.geom)) As longitude, ST_Y(ST_CENTROID(W.geom)) As latitude, T.name_of_type As constr, J.name_of_type As typewor, ST_AsText(geom) As geom FROM worship_building As W LEFT JOIN type_of_construction As T ON W.type_of_construction=T.type_id LEFT JOIN type_of_worship As J ON W.type_of_worship=J.type_id WHERE W.worship_building_id='"&ids&"'","DATA")
	ExecuteRemoteQuery("SELECT type_id, name_of_type FROM type_of_worship ORDER BY name_of_type ASC","TypeWorship")
	ExecuteRemoteQuery("SELECT type_id, name_of_type FROM type_of_construction ORDER BY name_of_type ASC ","Construction")
	
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub CreateItem(Width As Int, Title As String, Content As String) As Panel
	Dim p As B4XView = xui.CreatePanel("")
	p.LoadLayout("facility_edit")
	p.SetLayoutAnimated(0, 0, 0, Width,5%y)
	numfc.Text = Title
	Dim arraynow As Int 
	arraynow = fasilitasall_array.Size
	For c=0 To arraynow-1
		Dim f As Map
		f = fasilitasall_array.Get(c)
		'Set CustomListView for Facility
		Dim Contentt As String
		Dim Contentid As String
		Contentid = f.Get("facility_id")
		Contentt = f.Get("nameface")
		namefc.Add(Contentt)
		FacMap.Put(Contentt,Contentid)
		Dim tesajah As String
		tesajah = arraynow - 1
		Log("Array now :"&tesajah)
		Log("fasilitas :"&Contentt&" ID:"&Contentid&"")
		
	Next
	namefc.SelectedIndex = namefc.IndexOf(Content)
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
		
		Select Job.JobName
			Case "AllFacilities"
				
				Dim parserf As JSONParser 'mengambil data dalam bentuk json menjadi array
				Dim parserfa As JSONParser
				parserf.Initialize(res)
				Dim fasi_array As List = parserf.NextArray
				parserfa.Initialize(res)
				fasilitasall_array.Initialize
				fasilitasall_array = parserfa.NextArray
				Dim c As Int
				f = fasilitasall_array.Get(c)
				Log("Array Size: "&ArraySize)
				For c=0 To fasi_array.Size - 1
					Dim a As Map
					a = fasi_array.Get(c)
					'Set CustomListView for Facility
					isi = a.Get("name_of_facility")
					Log("ISI: "&isi)
				Next
				Log("Temp Array: "&ArraySize)
				ArraySize = fasilitasall_array.Size
				ArraySize2 = ArraySize
				ProgressDialogHide
				
			Case "FASILITAS"
				Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
				parser.Initialize(res)
				Dim fasilitas_array As List
				fasilitas_array = parser.NextArray
				For i=0 To fasilitas_array.Size - 1
					Dim a As Map
					a = fasilitas_array.Get(i)
					'Set CustomListView for Facility
					Dim content As String = a.Get("name_of_facility")
					Dim quantity As Int = a.Get("quantity_of_facilities")
					CLV1.Add(CreateItem(CLV1.AsView.Width, $"${quantity}"$, content),"")
					CLV1.AsView.Height = ListItem.Height*(i+1)
					
				Next
				
				Log("Temp Array 2: "&fasilitasall_array.Size)
				ProgressDialogHide
				
			Case "DATA"
				Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
				parser.Initialize(res)
				Dim data_array As List
				data_array = parser.NextArray
				For i=0 To data_array.Size -1
					Dim a As Map
					a = data_array.Get(i)
					lat = a.Get("latitude")
					lng = a.Get("longitude")
					Log(lat)
					Log(lng)
					WorshipName.Text = a.Get("name_of_worship_building")
					tipp = a.Get("type_of_worship")
					tipname = a.Get("typewor")
					StandingYear.Text = a.Get("standing_year")
					BuildingArea.Text = a.Get("building_area")
					LandArea.Text = a.Get("land_area")
					ParkingArea.Text = a.Get("parking_area")
					Electricity.Text = a.Get("electricity_capacity")
					cons = a.Get("type_of_construction")
					consname = a.Get("constr")
					Log("Data :"&cons)
					nama= WorshipName.Text
					tahun= StandingYear.Text
					ltanah= LandArea.Text
					lparkir= ParkingArea.Text
					lbangunan= BuildingArea.Text
					listrik= Electricity.Text
				Next
				
			Case "Update"
				ProgressDialogHide
				Try
				Msgbox("Data has been updated! :)","Success")
				Activity.Finish
				Catch
					Msgbox("Data can not be updated :(" , "error" )
				End Try
				
			Case "TypeWorship"
				Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
				parser.Initialize(res)
				Dim type_array As List
				type_array = parser.NextArray
				For i=0 To type_array.Size -1
				Dim a As Map
				a = type_array.Get(i)
				Dim namatype, idtype As String
					namatype= a.Get("name_of_type")
					idtype = a.Get("type_id")
					TypeOfWorship.Add(namatype)
					WorshipMap.Put(namatype,idtype)
					Log("ID Map: "&namatype&" "&idtype)
				Next
				TypeOfWorship.SelectedIndex = TypeOfWorship.IndexOf(tipname)
				
			Case "Construction"
				Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
				parser.Initialize(res)
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
		End Select
	End If
	Job.Release
End Sub

Sub btnGallery_Click
	Log(ids)
	If typeworship == "" Then
		tipe_i = tipp
	Else
		tipe_i = typeworship
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
	ExecuteRemoteQuery("UPDATE worship_building SET name_of_worship_building = '"&nama&"', type_of_worship ="&tipe_i&", building_area = "& lbangunan_i&", land_area = '"&ltanah_i&"', parking_area = "&lparkir_i&",standing_year = '"&tahun_i&"', electricity_capacity = "& listrik_i &", type_of_construction = "& cons_i &"WHERE worship_building_id = '"&ids&"'","Update")
	
End Sub

Sub TypeOfWorship_ItemClick (Position As Int, Value As Object)
	Dim id As String
	id = WorshipMap.Get(Value)
	typeworship = id
	Log(typeworship)
End Sub

Sub Construction_ItemClick (Position As Int, Value As Object)
	Dim idc As String
	idc = ConsMap.Get(Value)
	typecons = idc
	Log(typecons)
End Sub