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
	Dim manager As AHPreferenceManager
	Dim username As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private EditUsername As EditText
	Private EditPass As EditText
	Private CheckBox1 As CheckBox
	
	Dim md5string As String
	
	Private password As String
	Private role As String
	Private Btnlogin As Button
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Cek login session
	
	Activity.LoadLayout("login_layout")
	SetBackgroundTintList(EditUsername, Colors.Transparent, Colors.Transparent)
	SetBackgroundTintList(EditPass, Colors.Transparent, Colors.Transparent)
	'Set value untuk Username dan Password
End Sub
Sub SetLoginSession(Checked As Boolean)
	If Checked Then
		manager.SetBoolean("is_login", True)
	Else
		manager.SetBoolean("is_login", False)
	End If
End Sub

Sub SetBackgroundTintList(View As View,Active As Int, Enabled As Int)
	Dim States(2,1) As Int
	States(0,0) = 16842908     'Active
	States(1,0) = 16842910    'Enabled
	Dim Color(2) As Int = Array As Int(Active,Enabled)
	Dim CSL As JavaObject
	CSL.InitializeNewInstance("android.content.res.ColorStateList",Array As Object(States,Color))
	Dim jo As JavaObject
	jo.InitializeStatic("android.support.v4.view.ViewCompat")
	jo.RunMethod("setBackgroundTintList", Array(View, CSL))
End Sub

Sub Activity_Resume
End Sub

Sub ExecuteRemoteQuery(Query As String, JobName As String)
	Dim Job As HttpJob
	Job.Initialize(JobName, Me)
	Job.PostString(""&Main.Server&"mobile/json.php", Query)
End Sub

Sub JobDone(Job As HttpJob)
	If Job.Success Then
		Dim res As String
		res = Job.GetString 'menyimpan json dalam bentuk string
		Log("Response from server :"& res)
		Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
		parser.Initialize(res)
		Select Job.JobName
			Case "Data"
				Dim data_array As List
				data_array = parser.NextArray
				If data_array.Size > 0 Then
					For i=0 To data_array.Size - 1
						Dim a As Map
						a = data_array.Get(i)
						'Set CustomListView for Facility
						username = a.Get("username")
						password = a.Get("password")
						role = a.Get("role")
					Next
					ProgressDialogHide
					Msgbox("Hai, " & EditUsername.Text & CRLF & _
					"Selamat datang di My AutoLogin.", "Login Sukses")
					Main.kvs.Put("username", username)
					Main.kvs.Put("role", role)
					Log("DISINI :"&Main.kvs.Get("username")&" | Role: "&Main.kvs.Get("role"))
					'Set login session
						If CheckBox1.Checked Then
							SetLoginSession(True)
						Else
							SetLoginSession(False)
						End If
					StartActivity(HomeAdmin)
					Activity.Finish
				Else
					Msgbox("Username atau Password salah.", "Login Gagal")
				End If
		End Select
	End If
	Job.Release
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub CheckBox1_CheckedChange(Checked As Boolean)
	
End Sub


Sub Btnlogin_Click
	Private pi As String
	pi = EditPass.Text
	Dim md As MessageDigest
	Dim ByteCon As ByteConverter
	Dim passwordhash() As Byte
	Dim passwordhash2() As Byte
	passwordhash = md.GetMessageDigest(pi.GetBytes("UTF8"),"MD5")
	md5string = ByteCon.HexFromBytes(passwordhash)
	md5string = md5string.ToLowerCase
	Log(md5string)
	
	ExecuteRemoteQuery("SELECT * FROM user_account where username='"&EditUsername.Text&"' and password='"&md5string&"'","Data")
	
	
End Sub