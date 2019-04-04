B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: false
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private xui As XUI
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private CLV1 As CustomListView
	Private Label1 As B4XView
	Private ImageView1 As B4XView
	Private Panel1 As B4XView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("MainHome")
	Activity.AddMenuItem3("", "refresh", xui.LoadBitmapResize(File.DirAssets, "ic_cached_white_24dp.png", 32dip, 32dip, True), True)
	Activity.AddMenuItem3("", "done", xui.LoadBitmapResize(File.DirAssets, "ic_done_white_24dp.png", 32dip, 32dip, True), True)
	Dim bitmaps As List = Array("office-building-home.png", "educational-building-home.png", _
	"house-building-home.png", "office-building-home.png")
	For i = 1 To 4
'		Dim content As String = $"Lorem ipsum dolor sit amet,
'consectetur adipiscing elit, 
'sed Do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
'Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."$
		CLV1.Add(CreateItem(CLV1.AsView.Width, $"This is item #${i}"$,bitmaps.Get(i - 1)), "")
	Next

End Sub

Private Sub CreateItem(Width As Int, Title As String, Image As String) As Panel
	Dim p As B4XView = xui.CreatePanel("")
	p.LoadLayout("card2")
	p.SetLayoutAnimated(0, 0, 0, Width, 15%y)
	
	Label1.Text = Title
'	lblContent.Text = Content
'	SetColorStateList(lblAction1, xui.Color_LightGray, lblAction1.TextColor)
'	SetColorStateList(lblAction2, xui.Color_LightGray, lblAction2.TextColor)
	Panel1.SetBitmap(xui.LoadBitmapResize(File.DirAssets, Image, Panel1.Width, Panel1.Height, True))
	Return p
End Sub

Sub lblAction1_Click
	Dim index As Int = CLV1.GetItemFromView(Sender)
	Log($"Action 1 clicked. Index: ${index}"$)
End Sub

Sub lblAction2_Click
	Dim index As Int = CLV1.GetItemFromView(Sender)
	Log($"Action 2 clicked. Index: ${index}"$)
End Sub

Sub SetColorStateList(Btn As Label,Pressed As Int,Enabled As Int)
	Dim States(2,1) As Int
	States(0,0) = 16842919    'Pressed
	States(1,0) = 16842910    'Enabled
	Dim CSL As JavaObject
	CSL.InitializeNewInstance("android.content.res.ColorStateList",Array(States,Array As Int(Pressed, Enabled)))
	Dim B1 As JavaObject = Btn
	B1.RunMethod("setTextColor",Array As Object(CSL))
End Sub
Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
