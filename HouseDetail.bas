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
	Private PanelGallery As Panel
	
	Private AddPicture As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Set Layout
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.LoadLayout("HouseDetail")
	ScrollView1.Height = 100%y - ScrollView1.Top
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
	AddPicture.Initialize("AddPicture")
	
End Sub
Sub ExecuteRemoteQuery(Query As String, JobName As String)
	Dim Job As HttpJob
	Job.Initialize(JobName, Me)
	Job.PostString(""&Main.Server&"mobile/json.php", Query)
End Sub

Sub Activity_Resume
	ProgressDialogShow("Loading...")
	If TabHost1.CurrentTab == 2 Then
		clv.Clear
		ExecuteRemoteQuery("SELECT photo_url, upload_date FROM house_building_gallery WHERE house_building_id='"&ids&"'","Download")
	Else
	ExecuteRemoteQuery("SELECT H.fcn_owner, H.address, H.standing_year, H.land_building_tax, H.type_of_construction, H.electricity_capacity, H.tap_water, H.building_status,ST_X(ST_Centroid(H.geom)) As longitude, ST_Y(ST_CENTROID(H.geom)) As latitude, ST_AsText(H.geom) As geom,T.name_of_type As jkonstruksi, O.*	FROM house_building As H LEFT JOIN type_of_construction As T ON H.type_of_construction=T.type_id JOIN house_building_owner As O ON H.fcn_owner=O.national_identity_number WHERE H.house_building_id='"&ids&"' ","DATA")
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	CallSub(Starter, "ActivityIsPaused")
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
						Dim gambar = ""&Main.Server&"Files/House/img/"&image As String
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

Sub AddPicture_Click
	ToastMessageShow("Add photo",True)
	StartActivity(AddPhoto)
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
			WebViewRoute.LoadUrl(Main.Server&"House/Route.php?lat="&Main.lblLat&"&lng="&Main.lblLon&"&latd="&lat&"&lngd="&lng)
			Msgbox("Current tab is " & TabHost1.CurrentTab, "")
			Log ("Button Top :"&btnRoute.Top)
			TabHost1.Height = btnRoute.Top + btnRoute.Height + 15%y
			AddPicture.Visible=False
			Log("tabHost height: "&TabHost1.Height)
			PanelBuildingList.Height = TabHost1.Height + TabHost1.Top
			ScrollView1.Panel.Height = PanelBuildingList.Height
		Case 1
			AddPicture.Visible=False
			ProgressDialogShow("Loading...")
			ExecuteRemoteQuery("SELECT H.fcn_owner, H.address, H.standing_year, H.land_building_tax, H.type_of_construction, H.electricity_capacity, H.tap_water, H.building_status,ST_X(ST_Centroid(H.geom)) As longitude, ST_Y(ST_CENTROID(H.geom)) As latitude, ST_AsText(H.geom) As geom,T.name_of_type As jkonstruksi, O.*	FROM house_building As H LEFT JOIN type_of_construction As T ON H.type_of_construction=T.type_id JOIN house_building_owner As O ON H.fcn_owner=O.national_identity_number WHERE H.house_building_id='"&ids&"' ","DATA")
		Case 2
			AddPicture.Visible=True
			ProgressDialogShow("Loading...")
			ExecuteRemoteQuery("SELECT photo_url, upload_date FROM house_building_gallery WHERE house_building_id='"&ids&"'","Download")
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
