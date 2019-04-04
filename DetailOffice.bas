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
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private ScrollView1 As ScrollView
	Private Panel1 As Panel
	Public NameOfficeHome As String
	Private Label1 As Label
	Private TitleBar As Label
	Private BackArrow As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.LoadLayout("BuildingList")
	ScrollView1.Panel.Width=100%x
	Panel1.Height = Panel1.Height+60%x
	ScrollView1.Panel.Height=Panel1.Height
	Label1.Text = Home.result
	
	
	BackArrow.Visible= True
	BackArrow.SetBackgroundImage(LoadBitmap(File.DirAssets,"back-arrow.png"))
	
End Sub

Sub Activity_Resume

End Sub


Sub Activity_Pause (UserClosed As Boolean)
	SetAnimation("zoom_enter", "zoom_exit")
	
End Sub

Sub SetAnimation(InAnimation As String, OutAnimation As String)
	Dim r As Reflector
	Dim package As String
	Dim in, out As Int
	package = r.GetStaticField("anywheresoftware.b4a.BA", "packageName")
	in = r.GetStaticField(package & ".R$anim", InAnimation)
	out = r.GetStaticField(package & ".R$anim", OutAnimation)
	r.Target = r.GetActivity
	r.RunMethod4("overridePendingTransition", Array As Object(in, out), Array As String("java.lang.int", "java.lang.int"))
End Sub


Sub BackArrow_Click
	
End Sub