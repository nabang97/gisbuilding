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
	Dim lat=0 , lng=0 As Double
	Dim latnew, lngnew, savedlat, savedlng As Double
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
	Private btnSaveLocation As Button
	Private BtnHome As Button
	Private BtnMap As Button
	Private BtnSearch As Button
	Private BtnInfo As Button
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
	
	If Main.lblLat == "" Or Main.lblLon == "" Then
		Msgbox("GPS can't find your location. Try to restart the application or open the application outside the room.","Warning")
		lat = -0.3209284
		lng = 100.3484996
	Else
		lat = Main.lblLat
		lng = Main.lblLon
	End If	
	Log("Firsttime : "&lat&","&lng)
	manager.SetBoolean("legend",False)
	manager.SetBoolean("position_click", True)
	ScrollView1.Height = Panel1.Height
	Dim WebViewExtras1 As WebViewExtras
	WebViewExtras1.addJavascriptInterface(WebView1, "B4A")
	WebView1.LoadUrl(Main.Server&"user_position.php?lat="&lat&"&lng="&lng&"&legend="&manager.GetBoolean("legend"))
	
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
	Main.kvs.Put("Position Manual",Latitude&","&Longititude)	
	latnew = Latitude
	lngnew = Longititude
	Log("The user has dragged the Marker to ("&latnew&", "&lngnew&")")
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

Sub Legend_Status(Str As String)
	'	only String types can be passed from the javascript to B4A so we need to convert the String types to Double
	Log(Str)
	If Str == "false" Then
		manager.SetBoolean("legend",False)
	End If
	Log(manager.GetBoolean("legend"))
End Sub

Sub btnPosition_Click
	
End Sub

Sub ImagePosition_Click
	If Main.lblLat ==""  Or Main.lblLon == "" Then
		Msgbox("GPS can't find your location. Try to restart the application or open the application outside the room.","Warning")
		lat = lat
		lng = lng
	Else
		lat = Main.lblLat
		lng = Main.lblLon
	End If
	WebView1.LoadUrl(Main.Server&"user_position.php?lat="&lat&"&lng="&lng&"&legend="&manager.GetBoolean("legend"))
	manager.SetBoolean("position_click", True)
	manager.SetBoolean("manual_click", False)
End Sub

Sub ImageManual_Click
	WebView1.LoadUrl(Main.Server&"manual_position.php?lat="&lat&"&lng="&lng&"&legend="&manager.GetBoolean("legend"))
	manager.SetBoolean("manual_click", True)
	manager.SetBoolean("position_click", False)
End Sub

Sub ImageLegend_Click	
	manager.SetBoolean("manual_click", True)
	manager.SetBoolean("position_click", False)
	manager.SetBoolean("legend",True)
	WebView1.LoadUrl(Main.Server&"manual_position.php?lat="&lat&"&lng="&lng&"&legend="&manager.GetBoolean("legend"))
End Sub

Sub ImageRefresh_Click
	Dim manualclick, positionClick As Boolean
	positionClick = manager.GetBoolean("position_click")
	manualclick = manager.GetBoolean("manual_click")
	
	If positionClick Then
		WebView1.LoadUrl(Main.Server&"user_position.php?lat="&lat&"&lng="&lng&"&legend="&manager.GetBoolean("legend"))
	Else If manualclick Then
		WebView1.LoadUrl(Main.Server&"manual_position.php?lat="&lat&"&lng="&lng&"&legend="&manager.GetBoolean("legend"))
	Else
		WebView1.LoadUrl(Main.Server&"user_position.php?lat="&lat&"&lng="&lng&"&legend="&manager.GetBoolean("legend"))
	End If
End Sub

Sub btnSaveLocation_Click
	If manager.GetBoolean("manual_click") Then
		If latnew <> 0 Or lngnew <> 0 Then
			lat = latnew
			lng = lngnew
		Else
			lat = lat
			lng = lng
		End If
	Else if manager.GetBoolean("position_click") Then
		If Main.lblLat ==""  Or Main.lblLon == "" Then
			Msgbox("GPS can't find your location. Try to restart the application or open the application outside the room.","Warning")
			lat = lat
			lng = lng
		Else
			lat = Main.lblLat
			lng = Main.lblLon
		End If
	End If
	
	Log("saved:"&lat&","&lng)
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

Sub BtnMap_Click
	
End Sub

Sub BtnSearch_Click
	StartActivity(SearchBuilding)
End Sub

Sub BtnInfo_Click
	
End Sub