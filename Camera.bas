B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
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
	Dim dataku As Byte
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
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
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
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
