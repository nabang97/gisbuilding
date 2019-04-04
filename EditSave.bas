B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Private FirstName, LastName As String
	Private BirthDate As Long
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	aFirstName As String, aLastName As String, aBirthDate As Long
End Sub

Public Sub ShowM
	Msgbox("Berhasil",False)
End Sub

Public Sub ExecuteRemoteQuery(Query As String, JobName As String)
	Dim Job As HttpJob
	Job.Initialize(JobName, Me)
	Job.PostString(""&Main.Server&"mobile/json.php", Query)
End Sub

Public Sub JobDone(Job As HttpJob)
	If Job.Success Then
		Dim res As String
		res = Job.GetString 'menyimpan json dalam bentuk string
		Log("Response from server :"& res)
		Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
		parser.Initialize(res)
		Select Job.JobName
			Case "FASILITAS"
				
			Case "DATA"
				
		End Select
	End If
	Job.Release
End Sub