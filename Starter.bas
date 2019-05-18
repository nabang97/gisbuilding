B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=8.3
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Public rp As RuntimePermissions
	Public GPS1 As GPS
	Private gpsStarted As Boolean
	Private cache As Map
	Private tasks As Map
	Private ongoingTasks As Map
End Sub

Sub Service_Create
	'This is the program entry point.
	'This is a good place to load resources that are not specific to a single activity.
	GPS1.Initialize("GPS")
	tasks.Initialize
	cache.Initialize
	ongoingTasks.Initialize
End Sub

Sub Service_Start (StartingIntent As Intent)
	If rp.Check(rp.PERMISSION_ACCESS_FINE_LOCATION) Then StartGps
End Sub

Sub Service_TaskRemoved
	'This event will be raised when the user removes the app from the recent apps list.
End Sub

Public Sub StartGps
	Log("GPS STAR")
	If gpsStarted = False Then
		GPS1.Start(0, 0)
		gpsStarted = True
	End If
End Sub

Public Sub StopGps
	If gpsStarted Then
		GPS1.Stop
		gpsStarted = False
	End If
End Sub

Sub GPS_LocationChanged (Location1 As Location)
	'CallSub2(Main, "LocationChanged", Location1)
	Dim Longi As String
	Dim latitu As String
	latitu =Location1.Latitude
	Longi =Location1.Longitude
	Log("dari starter: "& latitu&","&Longi)
	ToastMessageShow("Your current location: "&latitu&","&Longi,False)
	CallSubDelayed3(ManualPosition,"LocationChanged",latitu,Longi)
End Sub

Sub GPS_GpsStatus (Satellites As List)
	'CallSub2(Main, "GpsStatus", Satellites)
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("Satellites:").Append(CRLF)
	For i = 0 To Satellites.Size - 1
		Dim Satellite As GPSSatellite = Satellites.Get(i)
		sb.Append(CRLF).Append(Satellite.Prn).Append($" $1.2{Satellite.Snr}"$).Append(" ").Append(Satellite.UsedInFix)
		sb.Append(" ").Append($" $1.2{Satellite.Azimuth}"$).Append($" $1.2{Satellite.Elevation}"$)
	Next
	Dim lblSatellites As String
	lblSatellites = sb.ToString
	Log("dari starter ya: "&lblSatellites)
	CallSub2(ManualPosition, "GpsStatus", lblSatellites)
End Sub


Sub Download (ImageViewsMap As Map)
	For i = 0 To ImageViewsMap.Size - 1
		tasks.Put(ImageViewsMap.GetKeyAt(i), ImageViewsMap.GetValueAt(i))
		Dim link As String = ImageViewsMap.GetValueAt(i)
		If cache.ContainsKey(link) Then
			Dim iv As ImageView = ImageViewsMap.GetKeyAt(i)
			iv.SetBackgroundImage(cache.Get(link))
		Else If ongoingTasks.ContainsKey(link) = False Then
			ongoingTasks.Put(link, "")
			Dim j As HttpJob
			j.Initialize(link, Me)
			j.Download(link)
		End If
	Next
End Sub

Sub JobDone(Job As HttpJob)
	ongoingTasks.Remove(Job.JobName)
	If Job.Success Then
		Dim bmp As Bitmap = Job.GetBitmap
		cache.Put(Job.JobName, bmp)
		If tasks.IsInitialized Then
			For i = 0 To tasks.Size - 1
				Dim link As String = tasks.GetValueAt(i)
				If link = Job.JobName Then
					Dim iv As ImageView = tasks.GetKeyAt(i)
					iv.SetBackgroundImage(bmp)
				End If
			Next
		End If
	Else
		Log("Error downloading image: " & Job.JobName & CRLF & Job.ErrorMessage)
	End If
	Job.Release
End Sub

Sub ActivityIsPaused
	tasks.Clear
End Sub

'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub

Sub Service_Destroy
	StopGps
End Sub
