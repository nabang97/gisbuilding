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
	Dim lat, lng As String
	Private xui As XUI
	Dim idBuilding As String
	Dim nameBuilding As String
	idBuilding=""
	nameBuilding=""
	Dim tipp,tipname,typeoffice,cons,consname,typecons  As String
	Dim idspin As String
	Dim latitude , longitude As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private TitleBar As Label
	Private BackArrow As Label
	Private ScrollView1 As ScrollView
	Dim WebViewTest As WebView
	Private PanelBuildingList As Panel
	Private PanelListItem As B4XView
	Private CLV2 As CustomListView
	Private PanelToolbar As Panel
	
	'declare attribute search
	Private PanelSearch As Panel
	Private SearchText As EditText
	Private SearchTextPanel As Panel
	
	Private num As B4XView
	Private Buildingname As B4XView
	
	Private PanelListItem As B4XView

	Private SearchBtn As Button
	Private SpinBuilding As Spinner
	Dim spinnerMap As Map
	Dim spinnerMapB As Map
	Dim spinnerMapJ As Map
	Dim spinnerMapT As Map
	Dim typesrc As String
	Dim jorongid As String
	Dim typeid As String
	Private SpinSearch As Spinner
	Private SearchRadius As SeekBar
	Private SpinJorong As Spinner
	Private SpinType As Spinner
	Private FacilityBtn As Button
	Dim idCheckSub As String
	Dim textCheckSub As String
	Dim lstChecks As List
	Dim count As Int
	Private FromText As EditText
	Private ToText As EditText
	Dim radiusku As Int
	Private Label3 As Label
	Private BtnMap As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.Width=100%y
	ScrollView1.Panel.LoadLayout("clvBuildingList")
	ScrollView1.Color =Colors.White
	'Title Bar
	If ManualPosition.lat == 0 Or ManualPosition.lng == 0 Then
		Msgbox("GPS can't find your location. Try to restart the application or open the application outside the room.","Warning")
		latitude = -0.3209284
		longitude = 100.3484996
	Else
		latitude = ManualPosition.lat
		longitude = ManualPosition.lng
	End If
	Log("Firsttime : "&lat&","&lng)
	BackArrow.Visible= False
	TitleBar.Text="Search Building"
	TitleBar.Left = 5%x
	Home.HomeBuilding = ""
	'menambahkan WebView Map
	WebViewTest.Initialize("")
	Activity.AddView(WebViewTest,0,6%y,100%x,35%y)
	WebViewTest.LoadURL(Main.Server&"index.php")
	
	'menambahkan PanelSearch View
	Dim TopSearch As Int
	TopSearch = WebViewTest.Height + WebViewTest.Top
	PanelSearch.Initialize("PanelSearch")
	Activity.AddView(PanelSearch,0,TopSearch,100%x,15%y)
	
	'Menambahkan isi PanelSearch
	PanelSearch.LoadLayout("SearchPanelnside")
	PanelSearch.Color= Colors.RGB(209,209,209)
	SetBackgroundTintList(SearchText, Colors.Transparent, Colors.Transparent)
	CreateSpinBuilding_Item
	SpinSearch.Clear
	CLV2.AsView.Height = 0
	
End Sub

Sub Activity_Resume
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub CreateSpinBuilding_Item
	spinnerMapB.Initialize
	SpinBuilding.add("Select Building Type")
	SpinBuilding.Add("All Building")
	spinnerMapB.Put("All Building","All")
	SpinBuilding.Add("Office Building")
	spinnerMapB.Put("Office Building","Office")
	SpinBuilding.Add("Worship Building")
	spinnerMapB.Put("Worship Building","Worship")
	
	If File.Exists(File.DirInternal,"datastore") Then
		If Main.kvs.ContainsKey("role") == True Then
			SpinBuilding.Add("House Building")
			spinnerMapB.Put("House Building","House")
		End If
	End If
	
	SpinBuilding.Add("Educational Building")
	spinnerMapB.Put("Educational Building","Educational")
	SpinBuilding.Add("Health Building")
	spinnerMapB.Put("Health Building","Health")
	SpinBuilding.Add("Msme Building")
	spinnerMapB.Put("Msme Building","Msme")
End Sub

Sub CreateSpinType_Item
	spinnerMapT.Initialize
	Select typesrc
		Case "model"
			SpinType.add("Select Building Model ")
			SpinType.add("Rumah Gadang")
			spinnerMapT.Put("Rumah Gadang","rg")
			SpinType.add("Dutch Building")
			spinnerMapT.Put("Dutch Building","db")
			SpinType.add("Other")
			spinnerMapT.Put("Other","ot")
		Case "type"
			Select idspin
				Case "Worship"	
					SpinType.add("Select Type "&idspin)
					ExecuteRemoteQuery("SELECT type_id, name_of_type FROM type_of_worship ORDER BY name_of_type ASC","ShowType")
				Case "Office"
					SpinType.add("Select Type "&idspin)
					ExecuteRemoteQuery("SELECT type_id, name_of_type FROM type_of_office ORDER BY name_of_type ASC","ShowType")
				Case "Msme"
					SpinType.add("Select Type "&idspin)
					ExecuteRemoteQuery("SELECT type_id, name_of_type FROM type_of_msme ORDER BY name_of_type ASC","ShowType")
				Case "Educational"
					SpinType.add("Select Type "&idspin)
					ExecuteRemoteQuery("SELECT level_id, name_of_level FROM level_of_education ORDER BY name_of_level ASC","ShowType")
				Case "Health"
					SpinType.add("Select Type "&idspin)
					ExecuteRemoteQuery("SELECT type_id, name_of_type FROM type_of_health_building ORDER BY name_of_type ASC","ShowType")
			End Select
		Case "jorong"
			Select idspin
				Case "Worship", "Office", "Health", "Msme", "Educational"
					SpinType.add("Select Jorong "&idspin)
					ExecuteRemoteQuery("SELECT jorong_id, name_of_jorong FROM jorong ORDER BY name_of_jorong ASC","ShowJorong")
			End Select
		Case "construction"
			Select idspin
				Case "Worship", "Office", "Health", "Msme", "Educational", "House"
					SpinType.add("Select Construction")
					ExecuteRemoteQuery("SELECT type_id, name_of_type FROM type_of_construction ORDER BY name_of_type ASC ","ShowConstruction")
			End Select
		Case "status"
			Select idspin 
				Case "Educational"
					SpinType.add("Select School Type")
					SpinType.Add("Public School")
					spinnerMapT.Put("Public School","1")
					SpinType.Add("Private School") 
					spinnerMapT.Put("Private School","0")
			End Select
		Case "tribe"
			Select idspin
				Case "House"
					SpinType.add("Select Tribe")
					ExecuteRemoteQuery ("SELECT tribe_id, name_of_tribe FROM tribe ORDER by name_of_tribe ASC","ShowTribe")
			End Select
		Case "village"
			Select idspin
				Case "House"
					SpinType.add("Select Village")
				ExecuteRemoteQuery ("SELECT village_id, village_name FROM village ORDER by village_name ASC","ShowVillage")
			End Select
		Case "datuk"
			Select idspin
				Case "House"
					SpinType.add("Select Datuk")
					ExecuteRemoteQuery ("SELECT datuk_id, datuk_name FROM datuk ORDER by datuk_name ASC","ShowDatuk")
			End Select
		Case "education"
			Select idspin
				Case "House"
					SpinType.add("Select Educational Level")
					ExecuteRemoteQuery("SELECT education_id, educational_level FROM education ORDER by educational_level ASC","ShowEducation")
			End Select
	End Select
End Sub

Private Sub CreateItem(Width As Int, Title As String, Content As String) As Panel
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 100%x,10%y)
	p.LoadLayout("BuildingListTwo")
	num.Text = Title
	Buildingname.Text = Content
	Return p
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
	ProgressDialogShow("load data from server....")
End Sub

Sub JobDone(Job As HttpJob)
	
	If Job.Success Then
		Dim res As String
		res = Job.GetString 'menyimpan json dalam bentuk string
		Log("Response from server :"& res)
		Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
		parser.Initialize(res)
		Select Job.JobName
			Case "ShowEducation"
				Dim education_array As List
				education_array = parser.NextArray
				For i=0 To education_array.Size -1
					Dim a As Map
					a = education_array.Get(i)
					Dim namatype, idtype As String
					namatype= a.Get("educational_level")
					idtype = a.Get("education_id")
					
					SpinType.Add(namatype)
					spinnerMapT.Put(namatype,idtype)
					Log("ID Map: "&namatype&" "&idtype)
					
				Next
				ProgressDialogHide
			Case "ShowVillage"
				Dim village_array As List
				village_array = parser.NextArray
				For i=0 To village_array.Size -1
					Dim a As Map
					a = village_array.Get(i)
					Dim namatype, idtype As String
					namatype= a.Get("village_name")
					idtype = a.Get("village_id")
					
					SpinType.Add(namatype)
					spinnerMapT.Put(namatype,idtype)
					Log("ID Map: "&namatype&" "&idtype)
					
				Next
				ProgressDialogHide
			Case "ShowDatuk"
				Dim datuk_array As List
				datuk_array = parser.NextArray
				For i=0 To datuk_array.Size -1
					Dim a As Map
					a = datuk_array.Get(i)
					Dim namatype, idtype As String
					namatype= a.Get("datuk_name")
					idtype = a.Get("datuk_id")
					
					SpinType.Add(namatype)
					spinnerMapT.Put(namatype,idtype)
					Log("ID Map: "&namatype&" "&idtype)
				Next
				ProgressDialogHide
			Case "ShowTribe"
				Dim tribe_array As List
				tribe_array = parser.NextArray
				For i=0 To tribe_array.Size -1
					Dim a As Map
					a = tribe_array.Get(i)
					Dim namatype, idtype As String
					namatype= a.Get("name_of_tribe")
					idtype = a.Get("tribe_id")
					
					SpinType.Add(namatype)
					spinnerMapT.Put(namatype,idtype)
					Log("ID Map: "&namatype&" "&idtype)
				Next
				ProgressDialogHide
			Case "ShowFacility"
				Dim facility_array As List
				facility_array = parser.NextArray
				
				Dim cd As CustomLayoutDialog
				Dim ScrollViewFac As ScrollView
				
				lstChecks.Initialize
				ScrollViewFac.Initialize(50%y)
				
				Dim sf As Object
				sf = cd.ShowAsync("Choose facility", "OK", "Cancel", "", Null,False)
				
				Dim arraynow As Int
				arraynow = facility_array.Size
				For c=0 To arraynow-1
					Dim f As Map
					f = facility_array.Get(c)
					'Set CustomListView for Facility
					Dim Contentt As String
					Dim Contentid As String
						Contentid = f.Get("facility_id")
						Contentt = f.Get("name_of_facility")
					Dim chk As CheckBox
						chk.Initialize("")
						chk.Text = Contentid&Contentt
						chk.TextColor= Colors.Transparent
					Dim lbl1 As Label
						lbl1.Initialize("")
						lbl1.Text = Contentt
						lbl1.TextColor = Colors.Black
						lbl1.Gravity = Gravity.CENTER_VERTICAL
						lstChecks.Add(chk)
						ScrollViewFac.Panel.AddView(chk, 0, 5%y * (c), 120dip,5%y)
						ScrollViewFac.Panel.AddView(lbl1, 10%x, 5%y * (c), 120dip, 5%y)
					Log("fasilitas :"&Contentt&" ID:"&Contentid&"")
				Next
				ProgressDialogHide
					cd.SetSize(100%x, 80%y)
				Wait For (sf) Dialog_Ready(pnl As Panel)
					pnl.AddView(ScrollViewFac,0,5%y,100%x,50%y)
					ScrollViewFac.Panel.Height = lstChecks.Size * 10%y
				Log(lstChecks.Size)
				
				pnl.Color=Colors.White
				ScrollViewFac.Color= Colors.White
				
'				Log("BERHASIL DOOONG :"&cd.Response)
				Wait For (sf) Dialog_Result(Result As Int)
				If Result = DialogResponse.POSITIVE Then
					Log("BERHASIL DOOONG")
					Dim sb,sc As StringBuilder
					sb.Initialize
					sc.Initialize
					count = 0
					For i = 0 To lstChecks.Size - 1
						Dim chk As CheckBox
						chk = lstChecks.Get(i)
						Dim chkSub As String
						chkSub = chk.Text
						Dim idCheck,textCheck As String
						If Contentid.Length == 1 Then
							idCheck = chkSub.SubString2(0,1)
							textCheck = chkSub.SubString(1)
						Else 
							idCheck = chkSub.SubString2(0,2)
							textCheck = chkSub.SubString(2)
						End If
						
						If chk.Checked Then
							sb.Append(idCheck&",")
							sc.Append(textCheck&",")
							count = count + 1
						End If
						
					Next
					Dim stridCheck,strtextCheck As String
					stridCheck = sb.ToString
					strtextCheck = sc.ToString
					
					idCheckSub= stridCheck.SubString2(0,stridCheck.Length-1)
					textCheckSub= strtextCheck.SubString2(0,strtextCheck.Length-1)
					Log("length id: "&idCheckSub.Length&" | "& idCheckSub)
					Log("length text: "&textCheckSub.Length&" | "& textCheckSub)
				Else
					Log("CANCEL DONG")
				End If
'				Dim c As Int
'				f = fasilitasall_array.Get(c)
'				For i=0 To facility_array.Size -1
'					Dim a As Map
'					a = facility_array.Get(i)
'					Dim namatype, idtype As String
'					namatype= a.Get("name_of_facility")
'					idtype = a.Get("facility_id")
'				Next
				
			Case "ShowJorong"
				Dim jorong_array As List
				jorong_array = parser.NextArray
				For i=0 To jorong_array.Size -1
					Dim a As Map
					a = jorong_array.Get(i)
					Dim namatype, idtype As String
					namatype= a.Get("name_of_jorong")
					idtype = a.Get("jorong_id")
					
					SpinType.Add(namatype)
					spinnerMapT.Put(namatype,idtype)
					Log("ID Map: "&namatype&" "&idtype)
				Next
				ProgressDialogHide
			Case "ShowType"
				Dim type_array As List
				type_array = parser.NextArray
				For i=0 To type_array.Size -1
					Dim a As Map
					a = type_array.Get(i)
					Dim namatype, idtype As String
					Select idspin 
						Case "Worship", "Office", "Msme", "Health"
							namatype= a.Get("name_of_type")
							idtype = a.Get("type_id")
						Case "Educational"
							namatype= a.Get("name_of_level")
							idtype = a.Get("level_id")
					End Select
					
					SpinType.Add(namatype)
					spinnerMapT.Put(namatype,idtype)
					Log("ID Map: "&namatype&" "&idtype)
				Next
				ProgressDialogHide
			Case "ShowConstruction"
				Dim cons_array As List
				cons_array = parser.NextArray
				For i=0 To cons_array.Size -1
					Dim a As Map
					a = cons_array.Get(i)
					Dim namatype, idtype As String
					namatype= a.Get("name_of_type")
					idtype = a.Get("type_id")
					
					SpinType.Add(namatype)
					spinnerMapT.Put(namatype,idtype)
					Log("ID Map: "&namatype&" "&idtype)
				Next
				ProgressDialogHide
			Case "Worship"
				Dim worship_array As List
				worship_array = parser.NextArray
				If worship_array.Size-1 < 0 Then
					Msgbox("Not Found","Warning")
					ProgressDialogHide
				Else
				For i=0 To worship_array.Size - 1
					Dim a As Map
					a = worship_array.Get(i)
					'Set CustomListView for Facility
						lat = a.Get("latitude")
						lng = a.Get("longitude")
						Log(lat)
						Log(lng)
					Dim number As String
					Dim nama As String
					number = a.Get("worship_building_id")
					nama = a.Get("name_of_worship_building")
					CLV2.Add(CreateItem(CLV2.AsView.Width, number, nama), "")
					'CLV2.sv.Height = PanelBuildingList.Height*(i+1)
				Next
					'Mengatur margin top ScrollView dan CLV
					CLV2.sv.Height = (PanelBuildingList.Height+0.5%y) * worship_array.Size
					ScrollView1.Top = WebViewTest.Height + WebViewTest.Top + PanelSearch.Height					
					ScrollView1.Height = 100%y - (ScrollView1.Top + PanelToolbar.Height)					
					CLV2.AsView.Height = CLV2.sv.Height
					ScrollView1.Panel.Height = CLV2.AsView.Height
				Log(nama)
				ProgressDialogHide
				End If
			Case "Office"
				Dim office_array As List
				office_array = parser.NextArray
				If office_array.Size -1 < 0 Then
					Msgbox("Not Found","Warning")
					ProgressDialogHide
				Else
					For i=0 To office_array.Size - 1
						Dim a As Map
						a = office_array.Get(i)
						'Set CustomListView for Facility
						lat = a.Get("latitude")
						lng = a.Get("longitude")
						Log(lat)
						Log(lng)
						Dim number As String
						Dim nama As String
						number = a.Get("office_building_id")
						nama = a.Get("name_of_office_building")
						CLV2.Add(CreateItem(CLV2.AsView.Width, number, nama), "")
						CLV2.AsView.Height = PanelListItem.Height*(i+1)
					Next
					'Mengatur margin top ScrollView dan CLV
					CLV2.AsView.Height = PanelBuildingList.Height * office_array.Size
					ScrollView1.Top = WebViewTest.Height + WebViewTest.Top + PanelSearch.Height
					CLV2.AsView.Height = CLV2.AsView.Height + 4%y
					CLV2.sv.Height = CLV2.AsView.Height
					ScrollView1.Panel.Height = CLV2.sv.Height
					ScrollView1.Height = 100%y - (ScrollView1.Top + PanelToolbar.Height)
					Log(nama)
					ProgressDialogHide
				End If
			Case "Educational"
				Dim education_array As List
				education_array = parser.NextArray
				If education_array.Size -1 < 0 Then
					Msgbox("Not Found","Warning")
					ProgressDialogHide
				Else
					For i=0 To education_array.Size - 1
						Dim a As Map
						a = education_array.Get(i)
						'Set CustomListView for Facility
						lat = a.Get("latitude")
						lng = a.Get("longitude")
						Log(lat)
						Log(lng)
						Dim number As String
						Dim nama As String
						number = a.Get("educational_building_id")
						nama = a.Get("name_of_educational_building")
						CLV2.Add(CreateItem(CLV2.AsView.Width, number, nama), "")
						CLV2.AsView.Height = PanelListItem.Height*(i+1)
					Next
					'Mengatur margin top ScrollView dan CLV
					CLV2.AsView.Height = PanelBuildingList.Height * education_array.Size
					ScrollView1.Top = WebViewTest.Height + WebViewTest.Top + PanelSearch.Height
					CLV2.AsView.Height = CLV2.AsView.Height + 4%y
					CLV2.sv.Height = CLV2.AsView.Height
					ScrollView1.Panel.Height = CLV2.sv.Height
					ScrollView1.Height = 100%y - (ScrollView1.Top + PanelToolbar.Height)
					Log(nama)
					ProgressDialogHide
				End If
			Case "Health"
				Dim health_array As List
				health_array = parser.NextArray
				If health_array.Size-1 < 0 Then
					Msgbox("Not Found","Warning")
					ProgressDialogHide
				Else
					For i=0 To health_array.Size - 1
						Dim a As Map
						a = health_array.Get(i)
						'Set CustomListView for Facility
						lat = a.Get("latitude")
						lng = a.Get("longitude")
						Log(lat)
						Log(lng)
						Dim number As String
						Dim nama As String
						number = a.Get("health_building_id")
						nama = a.Get("name_of_health_building")
						CLV2.Add(CreateItem(CLV2.AsView.Width, number, nama), "")
						CLV2.AsView.Height = PanelListItem.Height*(i+1)
					Next
					'Mengatur margin top ScrollView dan CLV
					CLV2.AsView.Height = PanelBuildingList.Height * health_array.Size
					ScrollView1.Top = WebViewTest.Height + WebViewTest.Top + PanelSearch.Height
					CLV2.AsView.Height = CLV2.AsView.Height + 4%y
					CLV2.sv.Height = CLV2.AsView.Height
					ScrollView1.Panel.Height = CLV2.sv.Height
					ScrollView1.Height = 100%y - (ScrollView1.Top + PanelToolbar.Height)
					Log(nama)
					ProgressDialogHide
				End If
			Case "Msme"
				Dim msme_array As List
				msme_array = parser.NextArray
				If msme_array.Size-1 < 0 Then
					Msgbox("Not Found","Warning")
					ProgressDialogHide
				Else
					For i=0 To msme_array.Size - 1
						Dim a As Map
						a = msme_array.Get(i)
						'Set CustomListView for Facility
						lat = a.Get("latitude")
						lng = a.Get("longitude")
						Log(lat)
						Log(lng)
						Dim number As String
						Dim nama As String
						number = a.Get("msme_building_id")
						nama = a.Get("name_of_msme_building")
						CLV2.Add(CreateItem(CLV2.AsView.Width, number, nama), "")
						CLV2.AsView.Height = PanelListItem.Height*(i+1)
					Next
					'Mengatur margin top ScrollView dan CLV
					CLV2.AsView.Height = PanelBuildingList.Height * msme_array.Size
					ScrollView1.Top = WebViewTest.Height + WebViewTest.Top + PanelSearch.Height
					CLV2.AsView.Height = CLV2.AsView.Height + 4%y
					CLV2.sv.Height = CLV2.AsView.Height
					ScrollView1.Panel.Height = CLV2.sv.Height
					ScrollView1.Height = 100%y - (ScrollView1.Top + PanelToolbar.Height)
					Log(nama)
					ProgressDialogHide
				End If
			Case "House"				
				Dim house_array As List
				house_array = parser.NextArray
				If house_array.Size-1 < 0 Then
					Msgbox("Not Found","Warning")
					ProgressDialogHide
				Else
					For i=0 To house_array.Size - 1
						Dim a As Map
						a = house_array.Get(i)
						'Set CustomListView for Facility
						lat = a.Get("latitude")
						lng = a.Get("longitude")
						Log(lat)
						Log(lng)
						Dim number As String
						Dim nama As String
						number = a.Get("house_building_id")
						nama = a.Get("fcn_owner")
						CLV2.Add(CreateItem(CLV2.AsView.Width, number, nama), "")
						
					Next
					'Mengatur margin top ScrollView dan CLV
					CLV2.sv.Height = (PanelBuildingList.Height + 0.2%y) * house_array.Size
					ScrollView1.Top = WebViewTest.Height + WebViewTest.Top + PanelSearch.Height
					ScrollView1.Height = 100%y - (ScrollView1.Top + PanelToolbar.Height)
					CLV2.AsView.Height = CLV2.sv.Height
					ScrollView1.Panel.Height = CLV2.AsView.Height
					Log(nama)
					ProgressDialogHide
				End If
		End Select
	End If
	Job.Release
	
End Sub

Sub PanelListItem_Click
	Dim item As Int = CLV2.GetItemFromView(Sender)
	Dim p As B4XView
	p = CLV2.GetPanel(item)
	Dim a As B4XView
	a = p.GetView(0)
	'mendapatkan label ID dan disimpan pada variabel global
	idBuilding = a.GetView(0).GetView(0).Text
	'mendapatkan nama building dan disimpan pada variabel global
	nameBuilding = a.GetView(0).GetView(1).Text
	Select idspin
		Case "Office"
			StartActivity(OfficeDetail)
		Case "Worship"
			StartActivity(WorshipDetail)
		Case "Educational"
			StartActivity(EducationalDetail)
		Case "Msme"
			StartActivity(MsmeDetail)
		Case "Health"
			StartActivity(HealthDetail)
		Case "House"
			StartActivity(HouseDetail)
	End Select
		
End Sub

Sub CLV2_ItemClick (Index As Int, Value As Object)
	'menyimpan id building
	idBuilding = Value 'store the value in the process global object.
End Sub

Sub SearchBtn_Click
	CLV2.Clear
	Select typesrc
		Case "name"
	End Select
	Log(SearchText.Text)
	Select idspin
		Case "All"
			Select typesrc
				Case "model"
				Msgbox("Query belum ada :(","WARNING!")
			End Select
		Case "Worship"
			Select typesrc
				Case "name"
					If SearchText.Text == "" Then
						Msgbox("Field is empty! Please write something in search field.","Warning")
					Else If idspin == "null" Or idspin == "" Then
						Msgbox("Select the building type to continue your searching!","Warning")
					Else If typesrc == "null" Or typesrc == "" Then
						Msgbox("Select the search type to continue your searching!","Warning")
					Else If SearchText.Text == "" And idspin == "" And typesrc == "" Then
						Msgbox("Please complete all fields!","Warning")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&SearchText.Text)
						ExecuteRemoteQuery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM worship_building WHERE upper(name_of_worship_building) like '%"&SearchText.Text.ToUpperCase&"%' ORDER BY name_of_worship_building",idspin)
						
					End If
				Case "type"
					If SpinType.SelectedIndex == 0 Then
						Msgbox("Please select type of educational building","Warning")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
						ExecuteRemoteQuery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM worship_building WHERE type_of_worship = '"&typeid&"' order by name_of_worship_building",idspin)
						
					End If
				Case "jorong"
					If SpinType.SelectedIndex == 0 Then
						Msgbox("Please select type of educational building","Warning")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
						ExecuteRemoteQuery("SELECT W.worship_building_id, W.name_of_worship_building, W.geom, ST_X(ST_CENTROID(W.geom)) As longitude, ST_Y(ST_CENTROID(W.geom)) As latitude	FROM worship_building As W, jorong As J	WHERE ST_CONTAINS(J.geom, W.geom) And J.jorong_id='"&typeid&"'",idspin)
					End If	
				Case "construction"
					If SpinType.SelectedIndex == 0 Then
						Msgbox("Please select type of educational building","Warning")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
						ExecuteRemoteQuery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM worship_building WHERE type_of_construction = '"&typeid&"' order by name_of_worship_building",idspin)
					End If
				Case "facility"
					  WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&idCheckSub)
						ExecuteRemoteQuery("SELECT M.worship_building_id, M.name_of_worship_building, ST_X(ST_Centroid(M.geom)) AS lng, ST_Y(ST_CENTROID(M.geom)) AS lat FROM worship_building As M	JOIN detail_worship_building_facilities As F on M.worship_building_id=F.worship_building_id	WHERE F.facility_id IN ("&idCheckSub&") GROUP BY F.worship_building_id, M.worship_building_id, M.name_of_worship_building HAVING COUNT(*) = "&count&"",idspin)
				Case "land area"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?awal="&FromText.Text&"&akhir="&ToText.Text)
					ExecuteRemoteQuery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM worship_building WHERE land_area BETWEEN "&FromText.Text&" AND "&ToText.Text&" ORDER BY name_of_worship_building",idspin)
				Case "building area"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?awal="&FromText.Text&"&akhir="&ToText.Text)
					ExecuteRemoteQuery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM worship_building WHERE building_area BETWEEN "&FromText.Text&" AND "&ToText.Text&" ORDER BY name_of_worship_building",idspin)
				Case "radius"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/index_"&typesrc&".php?lat="&latitude&"&lng="&longitude&"&rad="&radiusku)
					ExecuteRemoteQuery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_CENTROID(geom)) as lon, ST_Y(ST_CENTROID(geom)) as lat, ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("&longitude&" "&latitude&")',-1), geom) as jarak	FROM worship_building where ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("&longitude&" "&latitude&")',-1), geom) <= "&radiusku&" ORDER BY jarak",idspin)
				Case "standing year"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?awal="&FromText.Text&"&akhir="&ToText.Text)
					ExecuteRemoteQuery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM worship_building WHERE standing_year BETWEEN "&FromText.Text&" AND "&ToText.Text&" ORDER BY name_of_worship_building",idspin)
			End Select
		Case "Office"
			Select typesrc
				Case "name"
					If SearchText.Text == "" Then
						Msgbox("Field is empty! Please write something in search field.","Warning")
					Else If idspin == "null" Or idspin == "" Then
						Msgbox("Select the building type to continue your searching!","Warning")
					Else If typesrc == "null" Or typesrc == "" Then
						Msgbox("Select the search type to continue your searching!","Warning")
					Else If SearchText.Text == "" And idspin == "" And typesrc == "" Then
						Msgbox("Please complete all fields!","Warning")
					Else
						ExecuteRemoteQuery("SELECT office_building_id, name_of_office_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM office_building WHERE upper(name_of_office_building) like '%"&SearchText.Text.ToUpperCase&"%' ORDER BY name_of_office_building",idspin)
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
					End If
				Case "type"
					If SpinType.SelectedIndex == 0 Then
						Msgbox("Please select type of educational building","Warning")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
						ExecuteRemoteQuery("SELECT office_building_id, name_of_office_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM office_building WHERE type_of_office = '"&typeid&"' order by name_of_office_building",idspin)
						
					End If
				Case "jorong"
					If SpinType.SelectedIndex == 0 Then
						Msgbox("Please select type of educational building","Warning")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
						ExecuteRemoteQuery("SELECT O.office_building_id, O.name_of_office_building, O.geom,	ST_X(ST_CENTROID(O.geom)) As longitude, ST_Y(ST_CENTROID(O.geom)) As latitude FROM office_building As O, jorong As J WHERE ST_CONTAINS(J.geom, O.geom) And J.jorong_id='"&typeid&"'",idspin)
						
					End If
				Case "construction"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
					ExecuteRemoteQuery("SELECT office_building_id, name_of_office_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM office_building WHERE type_of_construction = '"&typeid&"' order by name_of_office_building",idspin)
					
				Case "facility"	
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&idCheckSub)
						ExecuteRemoteQuery("SELECT O.office_building_id, O.name_of_office_building, ST_X(ST_Centroid(O.geom)) AS lng, ST_Y(ST_CENTROID(O.geom)) AS lat FROM office_building As O JOIN detail_office_building_facilities As F on O.office_building_id=F.office_building_id WHERE F.facility_id IN ("&idCheckSub&") GROUP BY F.office_building_id, O.office_building_id, O.name_of_office_building HAVING COUNT(*) = "&count&"",idspin)	
				Case "radius"
					If Main.kvs.ContainsKey("Lat") == False And Main.kvs.ContainsKey("Long") == False Then
						Msgbox("Your location haven't been set","Error Message")
					Else
'						Dim lbla, lblo As String
'						Main.lblLat = "-0.9345308"
'						Main.lblLon = "100.4315281"
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/index_"&typesrc&".php?lat="&latitude&"&lng="&longitude&"&rad="&radiusku)
						ExecuteRemoteQuery("SELECT office_building_id, name_of_office_building ,ST_X(ST_CENTROID(geom)) as lon, ST_Y(ST_CENTROID(geom)) as lat, ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("&longitude&" "&latitude&")',-1), geom) as jarak FROM office_building where ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("&longitude&" "&latitude&")',-1),	geom) <= "&radiusku&" ORDER BY jarak",idspin)
					End If
			End Select
			
		Case "Health"
			Select typesrc
				Case "name"
					If SearchText.Text == "" Then
						Msgbox("Field is empty! Please write something in search field.","Warning")
					Else If idspin == "null" Or idspin == "" Then
						Msgbox("Select the building type to continue your searching!","Warning")
					Else If typesrc == "null" Or typesrc == "" Then
						Msgbox("Select the search type to continue your searching!","Warning")
					Else If SearchText.Text == "" And idspin == "" And typesrc == "" Then
						Msgbox("Please complete all fields!","Warning")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
						ExecuteRemoteQuery("SELECT health_building_id, name_of_health_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM health_building WHERE name_of_health_building like '%"&SearchText.Text.ToUpperCase&"%' ORDER BY name_of_health_building",idspin)
						
					End If
				Case "type"
					If SpinType.SelectedIndex == 0 Then
						Msgbox("Please select type of educational building","Warning")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
						ExecuteRemoteQuery("SELECT health_building_id, name_of_health_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM health_building WHERE type_of_health_building = '"&typeid&"' order by name_of_health_building",idspin)
						
					End If
				Case "jorong"
					If SpinType.SelectedIndex == 0 Then
						Msgbox("Please select type of educational building","Warning")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
						ExecuteRemoteQuery("SELECT W.health_building_id, W.name_of_health_building, W.geom, ST_X(ST_CENTROID(W.geom)) As longitude,	ST_Y(ST_CENTROID(W.geom)) As latitude FROM health_building As W, jorong As J WHERE ST_CONTAINS(J.geom, W.geom) And J.jorong_id='"&typeid&"'",idspin)
						
					End If
				Case "construction"
					If SpinType.SelectedIndex == 0 Then
						Msgbox("Please select type of educational building","Warning")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
						ExecuteRemoteQuery("SELECT health_building_id, name_of_health_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM health_building WHERE type_of_construction = '"&typeid&"' order by name_of_health_building",idspin)					
					End If
				Case "facility"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&idCheckSub)
						ExecuteRemoteQuery("SELECT H.health_building_id, H.name_of_health_building, ST_X(ST_Centroid(H.geom)) AS lng, ST_Y(ST_CENTROID(H.geom)) AS lat FROM health_building As H JOIN detail_health_building_facilities As F on H.health_building_id=F.health_building_id WHERE F.facility_id IN ("&idCheckSub&") GROUP BY F.health_building_id, H.health_building_id, H.name_of_health_building HAVING COUNT(*) = "&count&"",idspin)
				Case "radius"
					If Main.kvs.ContainsKey("Lat") == False And Main.kvs.ContainsKey("Long") == False Then
						Msgbox("Your location haven't been set","Error Message")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/index_"&typesrc&".php?lat="&latitude&"&lng="&longitude&"&rad="&radiusku)
						ExecuteRemoteQuery("SELECT health_building_id, name_of_health_building ,ST_X(ST_CENTROID(geom)) as lon, ST_Y(ST_CENTROID(geom)) as lat,	ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("&longitude&" "&latitude&")',-1), geom) as jarak FROM health_building where ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("&longitude&" "&latitude&")',-1),	geom) <= "&radiusku&" ORDER BY jarak",idspin)
					End If
			End Select
			
		Case "Educational"
			Select typesrc
				Case "name"
					If SearchText.Text == "" Then
						Msgbox("Field is empty! Please write something in search field.","Warning")
					Else If idspin == "null" Or idspin == "" Then
						Msgbox("Select the building type to continue your searching!","Warning")
					Else If typesrc == "null" Or typesrc == "" Then
						Msgbox("Select the search type to continue your searching!","Warning")
					Else If SearchText.Text == "" And idspin == "" And typesrc == "" Then
						Msgbox("Please complete all fields!","Warning")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
						ExecuteRemoteQuery("SELECT educational_building_id, name_of_educational_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM educational_building WHERE name_of_educational_building like '%"&SearchText.Text.ToUpperCase&"%' ORDER BY name_of_educational_building",idspin)
						
					End If
				Case "type"
					If SpinType.SelectedIndex == 0 Then
						Msgbox("Please select type of educational building","Warning")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
						ExecuteRemoteQuery("SELECT educational_building_id, name_of_educational_building, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM educational_building WHERE id_level_of_education = '"&typeid&"' order by name_of_educational_building",idspin)
						
					End If
				Case "jorong"
					If SpinType.SelectedIndex == 0 Then
						Msgbox("Please select type of educational building","Warning")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
						ExecuteRemoteQuery("SELECT W.educational_building_id, W.name_of_educational_building, W.geom, ST_X(ST_CENTROID(W.geom)) As longitude, ST_Y(ST_CENTROID(W.geom)) As latitude FROM educational_building As W, jorong As J WHERE ST_CONTAINS(J.geom, W.geom) And J.jorong_id='"&typeid&"'",idspin)
						
					End If	
				Case "status"
					If SpinType.SelectedIndex == 0 Then
						Msgbox("Please select type of educational building","Warning")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
						ExecuteRemoteQuery("Select educational_building_id, name_of_educational_building, ST_X(ST_Centroid(geom)) As longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM educational_building WHERE school_type = '"&typeid&"' order by name_of_educational_building",idspin)
						
					End If
				Case "facility"	
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&idCheckSub)
						ExecuteRemoteQuery("SELECT E.educational_building_id, E.name_of_educational_building, ST_X(ST_Centroid(E.geom)) AS lng, ST_Y(ST_CENTROID(E.geom)) AS lat FROM educational_building As E JOIN detail_educational_building_facilities As F on E.educational_building_id=F.educational_building_id	WHERE F.facility_id IN ("&idCheckSub&") GROUP BY F.educational_building_id, E.educational_building_id, E.name_of_educational_building HAVING COUNT(*) = "&count&"",idspin)
				Case "land area"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?awal="&FromText.Text&"&akhir="&ToText.Text)
					ExecuteRemoteQuery("SELECT educational_building_id, name_of_educational_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM educational_building WHERE land_area BETWEEN "&FromText.Text&" AND "&ToText.Text&" ORDER BY name_of_educational_building",idspin)
				Case "building area"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?awal="&FromText.Text&"&akhir="&ToText.Text)
					ExecuteRemoteQuery("SELECT educational_building_id, name_of_educational_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM educational_building WHERE building_area BETWEEN "&FromText.Text&" AND "&ToText.Text&" ORDER BY name_of_educational_building",idspin)
				Case "radius"
					If Main.kvs.ContainsKey("Lat") == False And Main.kvs.ContainsKey("Long") == False Then
						Msgbox("Your location haven't been set","Error Message")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/index_"&typesrc&".php?lat="&latitude&"&lng="&longitude&"&rad="&radiusku)
						ExecuteRemoteQuery("SELECT educational_building_id, name_of_educational_building ,ST_X(ST_CENTROID(geom)) as lon, ST_Y(ST_CENTROID(geom)) as lat, ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("&longitude&" "&latitude&")',-1), geom) as jarak	FROM educational_building where ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("&longitude&" "&latitude&")',-1), geom) <= "&radiusku&" ORDER BY jarak",idspin)
					End If
			End Select
			
		Case "Msme"
			Select typesrc
				Case "name"
					If SearchText.Text == "" Then
						Msgbox("Field is empty! Please write something in search field.","Warning")
					Else If idspin == "null" Or idspin == "" Then
						Msgbox("Select the building type to continue your searching!","Warning")
					Else If typesrc == "null" Or typesrc == "" Then
						Msgbox("Select the search type to continue your searching!","Warning")
					Else If SearchText.Text == "" And idspin == "" And typesrc == "" Then
						Msgbox("Please complete all fields!","Warning")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
						ExecuteRemoteQuery("SELECT msme_building_id, name_of_msme_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM msme_building WHERE upper(name_of_msme_building) like '%"&SearchText.Text.ToUpperCase&"%' order by name_of_msme_building",idspin)
						
					End If
				Case "type"
					If SpinType.SelectedIndex == 0 Then
						Msgbox("Please select type of educational building","Warning")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
						ExecuteRemoteQuery("SELECT msme_building_id, name_of_msme_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM msme_building WHERE type_of_msme = '"&typeid&"' order by name_of_msme_building",idspin)
						
					End If
				Case "jorong"
					If SpinType.SelectedIndex == 0 Then
						Msgbox("Please select type of educational building","Warning")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
						ExecuteRemoteQuery("SELECT M.msme_building_id, M.name_of_msme_building, M.geom, ST_X(ST_CENTROID(M.geom)) As longitude, ST_Y(ST_CENTROID(M.geom)) As latitude FROM msme_building As M, jorong As J WHERE ST_CONTAINS(J.geom, M.geom) And J.jorong_id='"&typeid&"'",idspin)
						
					End If
				Case "construction"
					If SpinType.SelectedIndex == 0 Then
						Msgbox("Please select type of educational building","Warning")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
						ExecuteRemoteQuery("SELECT msme_building_id, name_of_msme_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM msme_building WHERE type_of_construction = '"&typeid&"' order by name_of_msme_building",idspin)
						
					End If
				Case "facility"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&idCheckSub)
						ExecuteRemoteQuery("Select M.msme_building_id, M.name_of_msme_building, ST_X(ST_Centroid(M.geom)) As lng, ST_Y(ST_CENTROID(M.geom)) As lat FROM msme_building As M JOIN detail_msme_building_facilities As F on M.msme_building_id=F.msme_building_id WHERE F.facility_id IN ("&idCheckSub&") GROUP BY F.msme_building_id, M.msme_building_id, M.name_of_msme_building HAVING COUNT(*) = "&count&"",idspin)
				Case "radius"
					If Main.kvs.ContainsKey("Lat") == False And Main.kvs.ContainsKey("Long") == False Then
						Msgbox("Your location haven't been set","Error Message")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/index_"&typesrc&".php?lat="&latitude&"&lng="&longitude&"&rad="&radiusku)
						ExecuteRemoteQuery("SELECT msme_building_id, name_of_msme_building ,ST_X(ST_CENTROID(geom)) as lon, ST_Y(ST_CENTROID(geom)) as lat,	ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("&longitude&" "&latitude&")',-1), geom) as jarak FROM msme_building where ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("&longitude&" "&latitude&")',-1), geom) <= "&radiusku&" ORDER BY jarak",idspin)
					End If
				Case "income"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?awal="&FromText.Text&"&akhir="&ToText.Text)
					ExecuteRemoteQuery("SELECT msme_building_id, name_of_msme_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) AS latitude FROM msme_building WHERE monthly_income BETWEEN "&FromText.Text&" AND "&ToText.Text&" ORDER BY name_of_msme_building",idspin)
			End Select
			
		Case "House"
			Select typesrc
				Case "id"
					If SearchText.Text == "" Then
						Msgbox("Field is empty! Please write something in search field.","Warning")
					Else If idspin == "null" Or idspin == "" Then
						Msgbox("Select the building type to continue your searching!","Warning")
					Else If typesrc == "null" Or typesrc == "" Then
						Msgbox("Select the search type to continue your searching!","Warning")
					Else If SearchText.Text == "" And idspin == "" And typesrc == "" Then
						Msgbox("Please complete all fields!","Warning")
					Else
						WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&SearchText.Text)
						ExecuteRemoteQuery("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM house_building WHERE upper(house_building_id) like '%"&SearchText.Text.ToUpperCase&"%' ORDER BY house_building_id",idspin)
					End If
				Case "owner"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&SearchText.Text)
					ExecuteRemoteQuery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN house_building_owner As O ON H.fcn_owner=O.national_identity_number	WHERE upper(O.owner_name) LIKE'%"&SearchText.Text.ToUpperCase&"%' ORDER BY house_building_id",idspin)
				Case "occupant"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&SearchText.Text)
					ExecuteRemoteQuery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id	WHERE upper(O.head_of_family) LIKE '%"&SearchText.Text.ToUpperCase&"%' ORDER BY house_building_id",idspin)
				Case "fcn owner"
					Msgbox("Query belum ada", "WARNING")
				Case "fcn occupant"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?fcn="&SearchText.Text)
					ExecuteRemoteQuery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id WHERE upper(O.family_card_number) LIKE '%"&SearchText.Text.ToUpperCase&"%' ORDER BY house_building_id",idspin)
				Case "income"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?awal="&FromText.Text&"&akhir="&ToText.Text)
					ExecuteRemoteQuery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id	WHERE income BETWEEN "&FromText.Text&" AND "&ToText.Text&" ORDER BY house_building_id",idspin)
				Case "tribe"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
					ExecuteRemoteQuery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id JOIN datuk As D ON O.datuk_id=D.datuk_id JOIN tribe As T ON D.tribe_id=T.tribe_id WHERE D.tribe_id = "&typeid&" ORDER BY house_building_id",idspin)
				Case "village"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
					ExecuteRemoteQuery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id WHERE village_id = "&typeid&" ORDER BY house_building_id",idspin)
				Case "datuk"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
					ExecuteRemoteQuery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id	WHERE datuk_id = "&typeid&" ORDER BY house_building_id",idspin)
				Case "construction"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
					ExecuteRemoteQuery("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) AS latitude	FROM house_building WHERE type_of_construction = "&typeid&" ORDER BY house_building_id",idspin)
				Case "standing year"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?awal="&FromText.Text&"&akhir="&ToText.Text)
					ExecuteRemoteQuery("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM house_building WHERE standing_year BETWEEN "&FromText.Text&" AND "&ToText.Text&" ORDER BY house_building_id",idspin)
				Case "electric capacity"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?awal="&FromText.Text&"&akhir="&ToText.Text)
					ExecuteRemoteQuery("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) AS latitude	FROM house_building WHERE electricity_capacity BETWEEN "&FromText.Text&" AND "&ToText.Text&" ORDER BY house_building_id",idspin)
				Case "empty"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php")
					ExecuteRemoteQuery("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM house_building WHERE building_status=0",idspin)
				Case "inhabited"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php")
					ExecuteRemoteQuery("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) AS latitude FROM house_building WHERE building_status=1",idspin)
				Case "education"
					WebViewTest.LoadUrl(""&Main.ServerMap&""&idspin&"/search_"&typesrc&".php?"&typesrc&"="&typeid)
					ExecuteRemoteQuery("SELECT H.house_building_id, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id	WHERE educational_id = "&typeid&" ORDER BY house_building_id",idspin)
			End Select
			
	End Select
	
End Sub

Sub BtnSearch_Click
	Activity_Create(True)
End Sub

Sub BtnHome_Click
	If File.Exists(File.DirInternal,"datastore") Then
		If Main.kvs.ContainsKey("role") == True Then
			StartActivity(HomeAdmin)
		Else
			StartActivity(Home)
		End If
	Else
		StartActivity(Home)
	End If
End Sub

Sub SpinBuilding_ItemClick (Position As Int, Value As Object)
	Dim id As String
	id = spinnerMapB.Get(Value)
	idspin = id
	Log(idspin)
	SpinSearch.Clear
	spinnerMap.Initialize
	Select idspin
		Case "All"
			SpinSearch.Enabled = True
			SpinSearch.add("Select Search Type")
			SpinSearch.Add("Model")
			spinnerMap.Put("Model","model")
			
		Case "Worship"
			SpinSearch.Enabled = True
			SpinSearch.add("Select Search Type")
			SpinSearch.Add("Name")
			spinnerMap.Put("Name","name")
			SpinSearch.Add("Radius")
			spinnerMap.Put("Radius","radius")
			SpinSearch.Add("Type")
			spinnerMap.Put("Type","type")
			SpinSearch.Add("Jorong")
			spinnerMap.Put("Jorong","jorong")
			SpinSearch.Add("Construction")
			spinnerMap.Put("Construction","construction")
			SpinSearch.Add("Facility")
			spinnerMap.Put("Facility","facility")
			SpinSearch.Add("Land Area")
			spinnerMap.Put("Land Area","land area")
			SpinSearch.Add("Building Area")
			spinnerMap.Put("Building Area","building area")
			SpinSearch.Add("Standing Year")
			spinnerMap.Put("Standing Year","standing year")
			
		Case "Msme","Office"
			SpinSearch.Enabled = True
			SpinSearch.add("Select Search Type")
			SpinSearch.Add("Name")
			spinnerMap.Put("Name","name")
			SpinSearch.Add("Radius")
			spinnerMap.Put("Radius","radius")
			SpinSearch.Add("Type")
			spinnerMap.Put("Type","type")
			SpinSearch.Add("Jorong")
			spinnerMap.Put("Jorong","jorong")
			If File.Exists(File.DirInternal,"datastore") Then
				If Main.kvs.ContainsKey("role") == True Then
					SpinSearch.Add("Income")
					spinnerMap.Put("Income","income")
				End If
			End If
			SpinSearch.Add("Construction")
			spinnerMap.Put("Construction","construction")
			SpinSearch.Add("Facility")
			spinnerMap.Put("Facility","facility")
			
		Case "Health" 
			SpinSearch.Enabled = True
			SpinSearch.add("Select Search Type")
			SpinSearch.Add("Name")
			spinnerMap.Put("Name","name")
			SpinSearch.Add("Radius")
			spinnerMap.Put("Radius","radius")
			SpinSearch.Add("Type")
			spinnerMap.Put("Type","type")
			SpinSearch.Add("Jorong")
			spinnerMap.Put("Jorong","jorong")
			SpinSearch.Add("Facility")
			spinnerMap.Put("Facility","facility")
			
		Case "House"
			SpinSearch.Enabled = True
			SpinSearch.add("Select Search Type")
			SpinSearch.Add("ID Rumah")
			spinnerMap.Put("ID Rumah","id")
			If File.Exists(File.DirInternal,"datastore") Then
				If Main.kvs.ContainsKey("role") == True Then
					SpinSearch.Add("Owner")
					spinnerMap.Put("Owner","owner")
					SpinSearch.Add("Occupant")
					spinnerMap.Put("Occupant","occupant")
					SpinSearch.Add("FCN Owner")
					spinnerMap.Put("FCN Owner","fcn owner")
					SpinSearch.Add("FCN Occupant")
					spinnerMap.Put("FCN Occupant","fcn occupant")
					SpinSearch.Add("Income")
					spinnerMap.Put("Income","income")
					SpinSearch.Add("Datuk")
					spinnerMap.Put("Datuk","datuk")
					SpinSearch.Add("Tribe")
					spinnerMap.Put("Tribe","tribe")
					SpinSearch.Add("Village")
					spinnerMap.Put("Village","village")
					SpinSearch.Add("Construction")
					spinnerMap.Put("Construction","construction")
					SpinSearch.Add("Standing Year")
					spinnerMap.Put("Standing Year","standing year")
					SpinSearch.Add("Electric Capacity")
					spinnerMap.Put("Electric Capacity","electric capacity")
					SpinSearch.Add("Education")
					spinnerMap.Put("Education","education")
					SpinSearch.Add("Inhabited House")
					spinnerMap.Put("Inhabited House","inhabited")
					SpinSearch.Add("Empty House")
					spinnerMap.Put("Empty House","empty")
				End If
			End If
			
		Case "Educational" 
			SpinSearch.Enabled = True
			SpinSearch.add("Select Search Type")
			SpinSearch.Add("Name")
			spinnerMap.Put("Name","name")
			SpinSearch.Add("Radius")
			spinnerMap.Put("Radius","radius")
			SpinSearch.Add("Type")
			spinnerMap.Put("Type","type")
			SpinSearch.Add("Status")
			spinnerMap.Put("Status","status")
			SpinSearch.Add("Jorong")
			spinnerMap.Put("Jorong","jorong")
			SpinSearch.Add("Construction")
			spinnerMap.Put("Construction","construction")
			SpinSearch.Add("Facility")
			spinnerMap.Put("Facility","facility")
			SpinSearch.Add("Land Area")
			spinnerMap.Put("Land Area","land area")
			SpinSearch.Add("Building Area")
			spinnerMap.Put("Building Area","building area")
		
		Case Else
			SpinSearch.Clear
			SpinJorong.Clear
			SpinSearch.Enabled = False
			SpinJorong.Visible = False
			SearchRadius.Visible = False
			SearchText.Visible = True
	End Select
		
	SpinSearch.SelectedIndex=0
	SpinJorong.Clear
	SpinType.Clear
End Sub

Sub SpinSearch_ItemClick (Position As Int, Value As Object)
	Dim id As String
	id = spinnerMap.Get(Value)
	typesrc = id
	Log(typesrc)
	SpinJorong.SelectedIndex = 0
	Select typesrc
		Case "null"
			Label3.Visible=False
			FromText.Visible=False
			ToText.Visible=False
			FacilityBtn.Visible=False
			SearchText.Enabled = False
			SearchText.Visible = True
			SearchRadius.Visible = False
			SpinJorong.Visible = False
			SpinType.Visible = False
			SearchTextPanel.Color = Colors.White
			SearchText.Text = ""
			SpinJorong.Clear
			SpinType.Clear
			
		Case "radius"
			Label3.Visible=True
			FromText.Visible=False
			ToText.Visible=False
			FacilityBtn.Visible=False
			SearchText.Visible = False
			SpinJorong.Visible = False
			SearchRadius.Visible = True
			SearchRadius.Max = 10000
			SpinType.Visible = False
			SpinType.Clear
			SearchTextPanel.Color = Colors.Transparent
			SpinJorong.Clear
			
		Case "jorong", "type" , "construction", "status" , "model", "tribe", "village", "datuk", "education"
			FromText.Visible=False
			ToText.Visible=False
			SearchTextPanel.Color = Colors.White
			SpinType.Visible = True
			SpinType.Clear
			CreateSpinType_Item
			FacilityBtn.Visible=False
			SearchText.Visible = False
			SearchRadius.Visible = False
			SpinJorong.Visible = False
			Label3.Visible=False
			
		Case "facility"
			Label3.Visible=False
			FromText.Visible=False
			ToText.Visible=False
			FacilityBtn.Visible=True
			SearchText.Visible = False
			SearchRadius.Visible = False
			SpinJorong.Visible = False
			SpinType.Visible = False
			SearchTextPanel.Color = Colors.Transparent
			SpinJorong.Clear
			SpinType.Clear
			
		Case "land area", "building area", "standing year", "income", "electric capacity"
			Label3.Visible=False
			FromText.Visible=True
			ToText.Visible=True
			FromText.Text=""
			ToText.Text=""
			FacilityBtn.Visible=False
			SearchText.Visible = False
			SearchRadius.Visible = False
			SpinJorong.Visible = False
			SpinType.Visible = False
			SearchTextPanel.Color = Colors.Transparent
			SpinJorong.Clear
			SpinType.Clear
				
		Case Else
			Label3.Visible=False
			FromText.Visible=False
			ToText.Visible=False
			FacilityBtn.Visible=False
			SearchText.Visible = True
			SearchRadius.Visible = False
			SpinJorong.Visible = False
			SpinType.Visible = False
			SearchTextPanel.Color = Colors.White
			SearchText.Text = ""
			SpinJorong.Clear
			SpinType.Clear
	End Select
End Sub

Sub SpinType_ItemClick (Position As Int, Value As Object)
	Dim id As String
	id = spinnerMapT.Get(Value)
	typeid = id
	Log(typeid)
End Sub

Sub FacilityBtn_Click
 Select typesrc
 	Case "facility"
		Select idspin
			Case "Worship"
				ExecuteRemoteQuery("SELECT * FROM worship_building_facilities ORDER BY name_of_facility ASC","ShowFacility")
			Case "Office"
				ExecuteRemoteQuery("SELECT * FROM office_building_facilities ORDER BY name_of_facility ASC","ShowFacility")
			Case "Health"
				ExecuteRemoteQuery("SELECT * FROM health_building_facilities ORDER BY name_of_facility ASC","ShowFacility")
			Case "Educational"
				ExecuteRemoteQuery("SELECT * FROM educational_building_facilities ORDER BY name_of_facility ASC","ShowFacility")
			Case "Msme"
				ExecuteRemoteQuery("SELECT * FROM msme_building_facilities ORDER BY name_of_facility ASC","ShowFacility")
		End Select
	End Select
End Sub


Sub SearchRadius_ValueChanged (Value As Int, UserChanged As Boolean)
	If UserChanged Then
		radiusku = Value
		Label3.Text = Value
	End If
	Label3.Text = Value&" m"
	Log(radiusku)
End Sub

Sub BtnMap_Click
	StartActivity(ManualPosition)
End Sub