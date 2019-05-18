B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8.3
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim HomeBuilding As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	
	Private ScrollView1 As ScrollView
	Private Panelhome As Panel
	Private OfficeHome As Panel
	Private Label1 As Label
	Private TitleBar As Label
	Private BackArrow As Label
	Private HealthHome As Panel
	Private EducationalHome As Panel
	Private MsmeHome As Panel
	Private BtnHome As Button
	Private BtnSearch As Button
	Private PanelBar As Panel
	Private PanelToolBar As Panel
	Private BtnMap As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.LoadLayout("HomeContent")
	ScrollView1.Panel.Width=100%x
	ScrollView1.Panel.Height = Panelhome.Height
	Panelhome.Height = 100%y - PanelToolBar.Height - PanelBar.Height
	ScrollView1.Height = Panelhome.Height + 2%y
	
	BackArrow.Visible= True
	BackArrow.SetBackgroundImage(LoadBitmap(File.DirAssets,"logotoolbar.png"))
	BackArrow.Width=8%x
	BackArrow.Height=8%x
	BackArrow.Top=1%y
	TitleBar.Text="GIS Building"
	SetPressed(BtnHome, True)
End Sub

Sub Activity_Resume
	OfficeHome.SetBackgroundImage(LoadBitmap(File.DirAssets,"office-building-home.png"))
	SetPressed(BtnHome, True)
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub SetAnimation(InAnimation As String, OutAnimation As String)
	Dim r As Reflector
	Dim package As String
	Dim in, out As Int
	package = r.GetStaticField("anywheresoftware.b4a.BA","packageName")
	in = r.GetStaticField(package & ".R$anim", InAnimation)
	out = r.GetStaticField(package & ".R$anim", OutAnimation)
	r.Target = r.GetActivity
	r.RunMethod4("overridePendingTransition", Array As Object(in, out), Array As String("java.lang.int", "java.lang.int"))
End Sub

Sub OfficeHome_Click()
	SearchBuilding.idspin =""
	OfficeHome.SetBackgroundImage(LoadBitmap(File.DirAssets,"office-pres.png"))
	HomeBuilding = "Office"
	StartActivity(OfficeBuilding)
	SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub WorshipHome_Click
	SearchBuilding.idspin =""
	HomeBuilding = "Worship"
	StartActivity(WorshipBuilding)
	SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub HealthHome_Click
	SearchBuilding.idspin =""
	HomeBuilding = "Health"
	StartActivity(HealthBuilding)
	SetAnimation("zoom_enter", "zoom_exit")
End Sub


Sub EducationalHome_Click
	SearchBuilding.idspin =""
	HomeBuilding = "Educational"
	StartActivity(EducationalBuilding)
	SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub MsmeHome_Click
	SearchBuilding.idspin =""
	HomeBuilding = "Msme"
	StartActivity(MsmeBuilding)
	SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub SetPressed(cmd As Button, Pressed As Boolean)
	Dim ref As Reflector
	ref.Target = cmd
	ref.RunMethod2("setPressed", Pressed, "java.lang.boolean")
End Sub

Sub BtnSearch_Click
	Activity.Finish
	StartActivity(SearchBuilding)
End Sub

Sub BtnMap_Click
	Activity.Finish
	StartActivity(ManualPosition)
End Sub