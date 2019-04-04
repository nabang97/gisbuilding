﻿B4A=true
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

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private ScrollView1 As ScrollView
	Private Panel3 As Panel
	Private PanelBar As Panel
	Private PanelToolBar As Panel
	Private BtnLogout As Button
	Private Label1 As Label
	Private BtnSearch As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.LoadLayout("HomeAdmin")
	Panel3.Height = 100%y - PanelToolBar.Height - PanelBar.Height
	ScrollView1.Height = Panel3.Height
	ScrollView1.Panel.Height = Panel3.Height
	
End Sub

Sub Activity_Resume
	Log("DISINI :"&Main.kvs.Get("username"))
	Label1.Text ="Welcome, "&Main.kvs.Get("username")&""
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean  ' Return true to consume the event
	Dim isLogin As Boolean
	isLogin = Login.manager.GetBoolean("is_login")
	If KeyCode = KeyCodes.KEYCODE_BACK Then  ' Back button
		If isLogin Then
			ToastMessageShow("You are logged!",False)
			StopService(Starter)
			Return True  ' Consume event, so the app does not close
		Else
			Return False ' Do not consume, the app will close or go to previous activity
		End If
	End If
End Sub

Sub BtnLogout_Click
	'Set is_login ke false
	Login.manager.SetBoolean("is_login", False)
	
	'Buka activity Main (Halaman Login)
	StartActivity(Main)
	Activity.Finish
	ToastMessageShow("Logout berhasil", False)
	Main.kvs.Remove("username")
	Main.kvs.Remove("role")

End Sub

Sub BtnSearch_Click
	StartActivity(SearchBuilding)
End Sub