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
	Dim idBuilding As String
	Dim nameBuilding As String
	idBuilding=""
	nameBuilding=""
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private TitleBar As Label
	Private BackArrow As Label
	Private ScrollView1 As ScrollView
	Dim WebViewTest As WebView
	Private PanelBuildingList As Panel
	Private CLV2 As CustomListView
	Private Num As B4XView
	Private Buildingname As B4XView
	Private PanelListItem As B4XView
	Private PanelToolbar As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.Width=100%y
	ScrollView1.Panel.LoadLayout("clvBuildingList")
	PanelToolbar.Visible = False
	
	'Title Bar
	BackArrow.Visible= True
	BackArrow.SetBackgroundImage(LoadBitmap(File.DirAssets,"back-arrow.png"))
	TitleBar.Text="Building List"
	
	'menambahkan WebView Map
	WebViewTest.Initialize("")
	Activity.AddView(WebViewTest,0,6%y,100%x,50%y)
	WebViewTest.LoadURL("https://gisbuildingkotogadang.herokuapp.com/office_building.php")
	
	'Mengatur margin top ScrollView dan CLV
	ScrollView1.Panel.Height = CLV2.sv.Height
	ScrollView1.Top = WebViewTest.Height+WebViewTest.Top
	


	'Mengatur height ScrollView dan CLV
	ScrollView1.Height = 100%y - WebViewTest.Height - PanelToolbar.Height
	CLV2.sv.Height = CLV2.AsView.Height
	ScrollView1.Panel.Height = CLV2.AsView.Height
	
	
End Sub

Private Sub CreateItem(Width As Int, Title As String, Content As String) As Panel
	Dim p As B4XView = xui.CreatePanel("")
	p.LoadLayout("BuildingListTwo")
	p.SetLayoutAnimated(0, 0, 0, Width, PanelListItem.Height)
	Num.Text = Title
	Buildingname.Text = Content
	Return p
End Sub

Sub Activity_Resume
	CLV2.Clear
	Dim j As HttpJob
	j.Initialize("",Me)
	j.Download(Main.Server&"mobile/datakantor.php")
	ProgressDialogShow2("Downloading...",False)
	Wait For (j) JobDone (j As HttpJob)
	JobDone(j)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub CLV2_ItemClick (Index As Int, Value As Object)
	'menyimpan id building
	idBuilding = Value 'store the value in the process global object.
	StartActivity(OfficeDetail)
End Sub

Sub JobDone (j As HttpJob)
	If j.Success Then
		Log(j.GetString)
		If j.GetString.Length == 0 Then
			Msgbox("Data Not Found", "Warning")
			Activity.Finish
		Else
			Dim parser As JSONParser
			parser.Initialize(j.GetString)
			Dim root As Map = parser.NextObject
			Dim features As List = root.Get("features")
			For Each colfeatures As Map In features
				Dim jenis As String = colfeatures.Get("jenis")
				Dim geometry As Map = colfeatures.Get("geometry")
				Dim properties As Map = colfeatures.Get("properties")
				Dim nama As String = properties.Get("nama")
				Dim id As String = properties.Get("id")
				Dim content As String = nama
			
				'Menambahkan data ke CLV
				CLV2.Add(CreateItem(CLV2.AsView.Width, id, content), "")
				CLV2.AsView.Height = PanelListItem.Height* CLV2.Size
			Next
			Dim Type As String = root.Get("type")
			ProgressDialogHide
		End If
	Else
		Log("Error" & j.ErrorMessage)
		ProgressDialogHide
	End If
	j.Release
End Sub

Sub BuildingName_Click

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
	StartActivity(OfficeDetail)
End Sub
Sub BackArrow_Click
	Activity.Finish
End Sub