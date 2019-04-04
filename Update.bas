B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim t As String
	t=""
End Sub

Sub Do1
	t = WorshipEdit.ids
	ExecuteRemoteQuery("UPDATE worship_building SET name_of_worship_building = '"&WorshipEdit.nama&"', type_of_worship = '"&WorshipEdit.tipe&"', building_area = '"&WorshipEdit.lbangunan&"', land_area = '"&WorshipEdit.ltanah&"', parking_area = '"&WorshipEdit.lparkir&"',	standing_year = '"&WorshipEdit.tahun&"', electricity_capacity = '"&WorshipEdit.listrik&"', type_of_construction = '1' WHERE worship_building_id = '"&t&"'","Update")
	Msgbox(t, "Test")
End Sub

Sub ExecuteRemoteQuery(Query As String, JobName As String)
	Dim Job As HttpJob
	Job.Initialize(JobName,"")
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
			Case "Update"
				Msgbox("Updated!","Success")				
		End Select
	End If
	Job.Release
End Sub