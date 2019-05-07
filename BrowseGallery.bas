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
	Dim cc As ContentChooser
	Private rp As RuntimePermissions
	Private mBmp As Bitmap
End Sub

Sub Globals
	Private image As ImageView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	cc.Initialize("cc")
	cc.Show("image/*", "")
End Sub

Sub CC_Result (Success As Boolean, Dir As String, FileName As String)
	If Success Then
		Try
			rp.GetSafeDirDefaultExternal("")
			File.Copy(Dir ,FileName,File.DirInternal ,"myfilename.jpg" )
		Catch
			Log(LastException.Message)
		End Try 
	End If
End Sub


Sub Activity_Resume
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

