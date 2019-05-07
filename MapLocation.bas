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
	Dim manager As AHPreferenceManager
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private ScrollView1 As ScrollView
	Private WebView1 As WebView
	Private Panel1 As Panel
	Private Panel2 As Panel
	Private PanelToolBar As Panel
	Private btnPosition As Panel
	Private ImagePosition As ImageView
	Private ImageManual As ImageView
	Private ImageLegend As ImageView
	Private ImageRefresh As ImageView
	Private TitleBar As Label
	Private BackArrow As Label
	
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.Width=100%x
	ScrollView1.Panel.LoadLayout("MapLocation") 
	Panel1.Height = Panel1.Height
	ScrollView1.Panel.Height = Panel1.Height
	
	BackArrow.Visible= False
	TitleBar.Text="Your Position"
	
	ScrollView1.Height = Panel1.Height
	Dim WebViewExtras1 As WebViewExtras
	WebViewExtras1.addJavascriptInterface(WebView1, "B4A")
	WebView1.LoadUrl(Main.Server&"user_position.php?lat="&Main.lblLat&"&lng="&Main.lblLon)
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

'	this Sub is called by the map javascript when the Marker "dragend" event occurs
Sub Marker_DragEnd(NewLatitude As String, NewLongitude As String)
	'	only String types can be passed from the javascript to B4A so we need to convert the String types to Double
	Dim Latitude As Double=NewLatitude
	Dim Longititude As Double=NewLongitude
	Log("The user has dragged the Marker to ("&Latitude&", "&Longititude&")")
	Main.kvs.Put("Position Manual",Latitude&","&Longititude)
End Sub

Sub Marker_Dragging(Status As String)
	'	only String types can be passed from the javascript to B4A so we need to convert the String types to Double
	Dim stat As String = Status
	ToastMessageShow(stat,False)
End Sub

Sub Marker_Address(Address As String)
	'	only String types can be passed from the javascript to B4A so we need to convert the String types to Double
	Dim stat As String = Address
	Log(stat)
End Sub

Sub btnPosition_Click
	
End Sub

Sub ImagePosition_Click
	WebView1.LoadUrl(Main.Server&"user_position.php?lat="&Main.lblLat&"&lng="&Main.lblLon)
	manager.SetBoolean("position_click", True)
	manager.SetBoolean("manual_click", False)
End Sub

Sub ImageManual_Click
	WebView1.LoadUrl(Main.Server&"manual_position.php")
	manager.SetBoolean("manual_click", True)
	manager.SetBoolean("position_click", False)
End Sub

Sub ImageLegend_Click
	
End Sub

Sub ImageRefresh_Click
	Dim manualclick, positionClick As Boolean
	positionClick = manager.GetBoolean("position_click")
	manualclick = manager.GetBoolean("manual_click")
	
	If positionClick Then
		WebView1.LoadUrl(Main.Server&"user_position.php?lat="&Main.lblLat&"&lng="&Main.lblLon)
	Else If manualclick Then
		WebView1.LoadUrl(Main.Server&"manual_position.php")
	Else
		WebView1.LoadUrl(Main.Server&"user_position.php?lat="&Main.lblLat&"&lng="&Main.lblLon)
	End If
End Sub