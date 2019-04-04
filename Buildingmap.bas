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
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private ScrollView1 As ScrollView
	Dim WebViewTest As WebView
	Private PanelBuildingList As Panel
	Private CLV2 As CustomListView
	Private Num As B4XView
	Private BuildingName As B4XView
	Private PanelListItem As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.Width=100%y
	ScrollView1.Panel.LoadLayout("clvBuildingList")
	
	'menambahkan WebView Map
	WebViewTest.Initialize("")
	Activity.AddView(WebViewTest,0,6%y,100%x,50%y)
	WebViewTest.LoadURL("https://gisbuildingkotogadang.herokuapp.com/")
	
	'Mengatur margin top ScrollView dan CLV
	ScrollView1.Panel.Height = CLV2.sv.Height
	ScrollView1.Top = WebViewTest.Height+WebViewTest.Top
	
	Dim j As HttpJob
	j.Initialize("",Me)
	j.Download("https://gis-kotogadang.herokuapp.com/dataumkm.php")
	ProgressDialogShow2("Downloading...",False)
	Wait For (j) JobDone (j As HttpJob)
	If j.Success Then
		Log(j.GetString)
		Dim parser As JSONParser
		parser.Initialize(j.GetString)
		Dim root As Map = parser.NextObject
		Dim features As List = root.Get("features")
		For Each colfeatures As Map In features
			'Dim jenis As String = colfeatures.Get("jenis")
			'Dim geometry As Map = colfeatures.Get("geometry")
			'Dim coordinates As List = geometry.Get("coordinates")
			'For Each colcoordinates As List In coordinates
			'	For Each colcolcoordinates As List In colcoordinates
			'		For Each colcolcolcoordinates As List In colcolcoordinates
'						For Each colcolcolcolcoordinates As Double In colcolcolcoordinates
'						Next
'					Next
'				Next
'			Next
'			Dim Type As String = geometry.Get("type")
'			Dim Type As String = colfeatures.Get("type")
			Dim properties As Map = colfeatures.Get("properties")
			Dim nama As String = properties.Get("nama")
			Dim id As String = properties.Get("id")
			Dim content As String = nama
			
			'Menambahkan data ke CLV
			CLV2.Add(CreateItem(CLV2.AsView.Width, id, content), "")
			CLV2.AsView.Height = PanelListItem.Height* CLV2.Size
		Next
		Dim Type As String = root.Get("type")
		Else
			Log("Error" & j.ErrorMessage)
			ProgressDialogHide
	End If
	j.Release

	'Mengatur height ScrollView dan CLV
	CLV2.sv.Height = CLV2.AsView.Height + 27%y
	ScrollView1.Panel.Height = CLV2.sv.Height + 30%y
End Sub

Private Sub CreateItem(Width As Int, Title As String, Content As String) As Panel
	Dim p As B4XView = xui.CreatePanel("")
	p.LoadLayout("BuildingListTwo")
	p.SetLayoutAnimated(0, 0, 0, Width, PanelListItem.Height)
	Num.Text = Title
	BuildingName.Text = Content
	Return p
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
