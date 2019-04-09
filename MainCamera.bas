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
	Private frontCamera As Boolean = False
	Private VideoMode As Boolean = False
	Private VideoFileDir, VideoFileName As String
	Private MyTaskIndex As Int
	Private rp As RuntimePermissions
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private cam As CamEx2
	Private pnlCamera As Panel
	Private pnlPicture As Panel
	Private pnlBackground As Panel
	Private btnEffects As Button
	Private btnScene As Button
	Private buttons As List
	Private btnAutoExposure As Button
	Private btnFocus As Button
	Private ProgressBar1 As ProgressBar
	Private openstate, busystate As Boolean
	Private btnRecord As Button
	Private btnMode As Button
	Private btnCamera As Button
	Private barZoom As SeekBar
	Private SaveImgBtn As Button
	Private CancelSaveBtn As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	VideoFileDir = rp.GetSafeDirDefaultExternal("")
	VideoFileName = "1.mp4"
	Activity.LoadLayout("1")
	Activity.LoadLayout("StillPicture")
	cam.Initialize(pnlCamera)
	Log(cam.SupportedHardwareLevel)
	buttons = Array(btnScene, btnAutoExposure, btnEffects, btnFocus, btnMode)
	SetState(False, False, VideoMode)
End Sub

Sub Activity_Resume
	OpenCamera(frontCamera)
End Sub


Sub OpenCamera (front As Boolean)
	rp.CheckAndRequest(rp.PERMISSION_CAMERA)
	Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
	If Result = False Then
		ToastMessageShow("No permission!", True)
		Return
	End If
	
	SetState(False, False, VideoMode)
	Wait For (cam.OpenCamera(front)) Complete (TaskIndex As Int)
	If TaskIndex > 0 Then
		MyTaskIndex = TaskIndex 'hold this index. It will be required in later calls.
		Wait For(PrepareSurface) Complete (Success As Boolean)
	End If
	Log("Start success: " & Success)
	SetState(Success, False, VideoMode)
	If Success = False Then
		ToastMessageShow("Failed to open camera", True)
	End If
End Sub

Sub PrepareSurface As ResumableSub
	SetState(False, busystate, VideoMode)
	'sizes can be modified here
	If VideoMode Then
		cam.PreviewSize.Initialize(640, 480)
		'Using a temporary file to store the video.
		Wait For (cam.PrepareSurfaceForVideo(MyTaskIndex, VideoFileDir, "temp-" & VideoFileName)) Complete (Success As Boolean)
	Else
		cam.PreviewSize.Initialize(1920, 1080)
		Wait For (cam.PrepareSurface(MyTaskIndex)) Complete (Success As Boolean)
	End If
	If Success Then cam.StartPreview(MyTaskIndex, VideoMode)
	SetState(Success, busystate, VideoMode)
	Return Success
End Sub

Sub btnCamera_Click
	frontCamera = Not(frontCamera)
	OpenCamera(frontCamera)
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	cam.Stop
End Sub

Sub btnMode_Click
	VideoMode = Not(VideoMode)
	If VideoMode Then
		rp.CheckAndRequest(rp.PERMISSION_RECORD_AUDIO)
		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
		If Result = False Then
			ToastMessageShow("No permission!", True)
			VideoMode = False
		End If
	End If
	SetState(openstate, busystate, VideoMode)
	PrepareSurface
End Sub

Sub btnRecord_Click
	If VideoMode Then
		CaptureVideo
	Else
		TakePicture
	End If
End Sub

Sub CaptureVideo
	Try
		SetState(openstate, True, VideoMode)
		If cam.RecordingVideo = False Then
			cam.StartVideoRecording (MyTaskIndex)
		Else
			cam.StopVideoRecording (MyTaskIndex)
			File.Copy(VideoFileDir, "temp-" & VideoFileName, VideoFileDir, VideoFileName)
			ToastMessageShow($"Video file saved: $1.2{File.Size(VideoFileDir, VideoFileName) / 1024 / 1024} MB"$, True)
			Wait For (PrepareSurface) Complete (Success As Boolean)
			SetState(openstate, False, VideoMode)
			
		End If
	Catch
		HandleError(LastException)
	End Try
End Sub

Sub HandleError (Error As Exception)
	Log("Error: " & Error)
	ToastMessageShow(Error, True)
	OpenCamera(frontCamera)
End Sub

Sub TakePicture
	Try
		SetState(openstate, True, VideoMode)
		Wait For(cam.FocusAndTakePicture(MyTaskIndex)) Complete (data() As Byte)
		SetState(openstate, False, VideoMode)	
		Dim bmp As Bitmap = cam.DataToBitmap(data)
		Log("Picture taken: " & bmp) 'ignore
		pnlBackground.SetVisibleAnimated(100, True)
		pnlPicture.SetBackgroundImage(bmp.Resize(pnlPicture.Width, pnlPicture.Height, True)).Gravity = Gravity.CENTER
		'Sleep(4000)
		'pnlBackground.SetVisibleAnimated(500, False)
'		If SaveImgBtn Then			
'			cam.DataToFile(data, VideoFileDir, "1.jpg")
'		End If
	Catch
		HandleError(LastException)
	End Try
	
End Sub

Sub pnlPicture_Click
	'pnlBackground.Visible = False
End Sub

Sub btnEffects_Click
	Dim effects As List = cam.SupportedEffectModes
	Dim i As Int = effects.IndexOf(cam.EffectMode)
	i = (i + 1) Mod effects.Size
	cam.EffectMode = effects.Get(i)
	btnEffects.Text = effects.Get(i)
	cam.StartPreview(MyTaskIndex, VideoMode)
End Sub

Sub btnScene_Click
	Dim scenes As List = cam.SupportedSceneModes
	Dim i As Int = scenes.IndexOf(cam.SceneMode)
	i = (i + 1) Mod scenes.Size
	cam.SceneMode = scenes.Get(i)
	btnScene.Text = scenes.Get(i)
	cam.StartPreview(MyTaskIndex, VideoMode)
End Sub

Sub btnAutoExposure_Click
	Dim flashes As List = cam.SupportedAutoExposureModes
	Dim i As Int = flashes.IndexOf(cam.AutoExposureMode)
	i = (i + 1) Mod flashes.Size
	cam.AutoExposureMode = flashes.Get(i)
	btnAutoExposure.Text = flashes.Get(i)
	cam.StartPreview(MyTaskIndex, VideoMode)
End Sub

Sub btnFocus_Click
	Dim focuses As List = cam.SupportedFocusModes
	Dim i As Int = focuses.IndexOf(cam.FocusMode)
	i = (i + 1) Mod focuses.Size
	cam.FocusMode = focuses.Get(i)
	btnFocus.Text = focuses.Get(i)
	cam.StartPreview(MyTaskIndex, VideoMode)
End Sub

'This sub enables or disables the various UI elements based on the current state.
Sub SetState(Open As Boolean, Busy As Boolean, Video As Boolean)
	For Each b As Button In buttons
		b.Visible = Open And Not(Busy)
	Next
	btnCamera.Visible = Not(Busy)
	btnRecord.Visible = Open And (Video Or Not(Busy))
	openstate = Open
	ProgressBar1.Visible = Busy
	busystate = Busy
	VideoMode = Video
	barZoom.Visible = Open
	Dim btnRecordText As String
	If VideoMode Then
		If Busy Then
			btnRecordText = Chr(0xF04D)
		Else
			btnRecordText = Chr(0xF03D)
		End If
	Else
		btnRecordText = Chr(0xF030)
	End If
	btnRecord.Text = btnRecordText
End Sub

Sub barZoom_ValueChanged (Value As Int, UserChanged As Boolean)
	Dim OriginalSize As Rect = cam.ActiveArraySize
	Dim Zoom As Float = 1 + Value / 100 * (cam.MaxDigitalZoom - 1)
	Dim Crop As Rect
	Dim NewWidth As Int = OriginalSize.Width / Zoom
	Dim NewHeight As Int = OriginalSize.Height / Zoom
	Crop.Initialize(OriginalSize.CenterX - NewWidth / 2, OriginalSize.CenterY - NewHeight / 2, _
		OriginalSize.CenterX + NewWidth / 2, OriginalSize.CenterY + NewHeight / 2)
	cam.PreviewCropRegion = Crop
	cam.StartPreview(MyTaskIndex, VideoMode)
End Sub


Sub SaveImgBtn_Click
	Wait For(cam.FocusAndTakePicture(MyTaskIndex)) Complete (data() As Byte)
	Dim tanggal As String
	DateTime.DateFormat="dd-mm-yyyy hh:mm:ss.s"
	tanggal = DateTime.Date(DateTime.now)
	cam.DataToFile(data, VideoFileDir, tanggal&".jpg")
	ToastMessageShow("Image Saved!",True)
	pnlBackground.Visible = False
End Sub

Sub CancelSaveBtn_Click
	pnlBackground.Visible = False
End Sub