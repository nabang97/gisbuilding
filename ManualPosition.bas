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
	Dim latnew, lngnew, savedlat, savedlng, latGps,lngGps As Double
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
	Dim latpos, lngpos As Double
	Dim latman, lngman As Double
	Private PanelBar As Panel
	Private Legend As Panel
	Private closebtn As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.Width=100%x
	ScrollView1.Panel.LoadLayout("MapLocation") 	
	BackArrow.Visible= False
	TitleBar.Text="Your Position"
	manager.SetBoolean("legend",False)
	manager.SetBoolean("position_click", True)
	WebView1.Height= 100%y - (PanelToolBar.Height + PanelBar.Height+ WebView1.Top)
	Panel1.Height = WebView1.Height + WebView1.Top	
	btnSaveLocation.Top = 100%y - 25%y
	Legend.Top = 100%y - (26%y + Legend.Height)
	ScrollView1.Panel.Height = Panel1.Height
	Legend.Visible = False
	
	ScrollView1.Height = Panel1.Height
	If latGps == 0 Or latGps == 0 Then
		Msgbox("GPS can't find your location. Try to refresh or open the application outside the room.","Warning")
		lat = -0.3209284
		lng = 100.3484996
	Else
		lat = latGps
		lng = lngGps
	End If
	
End Sub

Sub Activity_Resume
	'CallSubDelayed(Starter,"GPS_GpsStatus")
	'CallSubDelayed(Starter,"GPS_LocationChanged")
	
	Log("Firsttime : "&lat&","&lng)
	Dim WebViewExtras1 As WebViewExtras
	WebViewExtras1.addJavascriptInterface(WebView1, "B4A")
	WebView1.LoadUrl(Main.Server&"user_position.php?lat="&lat&"&lng="&lng&"&legend="&manager.GetBoolean("legend"))
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Public Sub LocationChanged(Latitude As String, Longitude As String)
	Log("Location:"&Latitude&","&Longitude)
	latGps = Latitude
	lngGps = Longitude
End Sub

Public Sub GpsStatus (Satellites As String)	
	Log("dari manual position: "&Satellites)
End Sub

'Public Sub LocationChanged(Location1 As Location)
'	Dim Longi As String
'	Dim latitu As String
'	latitu =Location1.Latitude
'	Longi =Location1.Longitude
'	lblSpeed= $"Speed = $1.2{Location1.Speed} m/s "$
'	Dim latt,  lonn As String
'	latt = latitu
'	lblLat = latt
'	lonn = Longi
'	lblLon= lonn
'	ToastMessageShow(lblLat&" , "&lblLon,False)
'	Log("Speed : "&lblSpeed)
'	Log("Lat : "&lblLat)
'	Log("Long : "&lblLon)
'	kvs.Put("lat",lblLat)
'	kvs.Put("Long",lblLon)
'End Sub
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
	'Dim latpos, lngpos As Double
	If latGps ==0  Or lngGps == 0 Then
		'Msgbox("GPS can't find your location. Try to restart the application or open the application outside the room.","Warning")
		latpos = lat
		lngpos = lng
	Else
		latpos = latGps
		lngpos = lngGps
	End If
	WebView1.LoadUrl(Main.Server&"user_position.php?lat="&latpos&"&lng="&lngpos&"&legend="&manager.GetBoolean("legend"))
	manager.SetBoolean("position_click", True)
	manager.SetBoolean("manual_click", False)
End Sub

Sub ImageManual_Click
	If manager.GetBoolean("manual_clicked") Then
		latman = lat
		lngman = lng
	Else
		latman = latpos
		lngman = lngpos
	End If
	WebView1.LoadUrl(Main.Server&"manual_position.php?lat="&latman&"&lng="&lngman&"&legend="&manager.GetBoolean("legend"))
	manager.SetBoolean("manual_click", True)
	manager.SetBoolean("position_click", False)
End Sub

Sub ImageLegend_Click	
	Legend.Visible = True
	'manager.SetBoolean("manual_click", True)
	'manager.SetBoolean("position_click", False)
	'manager.SetBoolean("legend",True)
	'WebView1.LoadUrl(Main.Server&"manual_position.php?lat="&lat&"&lng="&lng&"&legend="&manager.GetBoolean("legend"))
End Sub

Sub ImageRefresh_Click
	CallSubDelayed(Starter, "StartGPS")
	Dim manualclick, positionClick As Boolean
	positionClick = manager.GetBoolean("position_click")
	manualclick = manager.GetBoolean("manual_click")
	
	If positionClick Then
		WebView1.LoadUrl(Main.Server&"user_position.php?lat="&latpos&"&lng="&lngpos&"&legend="&manager.GetBoolean("legend"))
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
		manager.SetBoolean("manual_clicked",True)
		manager.SetBoolean("posisi_clicked",False)
	Else if manager.GetBoolean("position_click") Then
		If latGps <> 0  Or lngGps <> 0 Then
			Msgbox("GPS can't find your location. Try to restart the application or open the application outside the room.","Warning")
			lat = latpos
			lng = lngpos
		Else
			lat = latGps
			lng = lngGps
		End If
		manager.SetBoolean("posisi_clicked",True)
		manager.SetBoolean("manual_clicked",False)
	End If
	
	Log("saved:"&lat&","&lng)
	Log("posisi_clicked: "&manager.GetBoolean("posisi_clicked"))
	Log("manual_clicked: "&manager.GetBoolean("manual_clicked"))
	Msgbox("Your Location has been saved ("&lat&","&lng&")","Successful")
End Sub

Sub BtnHome_Click
	If File.Exists(Main.folder,"datastore") Then
		If Main.kvs.ContainsKey("role") == True Then
			
			StartActivity(HomeAdmin)
			Activity.Finish
		Else
			
			StartActivity(Home)
			Activity.Finish
		End If
	End If
End Sub

Sub BtnMap_Click
	
End Sub

Sub BtnSearch_Click
	
	StartActivity(SearchBuilding)
	Activity.Finish
End Sub

Sub BtnInfo_Click
	
End Sub

Sub closebtn_Click
	Legend.Visible = False
End Sub