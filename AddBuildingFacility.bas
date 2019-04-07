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
	
	Dim idBuilding As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private ScrollView1 As ScrollView
	Private PanelBuildingList As Panel
	Private PanelEditFacility As Panel
	Private editQuantity As EditText
	Private PanelEditQuanity As Panel
	Private LblQuantity As Label
	Private PanelSpinnerFacility As Panel
	Private SpinNameFacility As Spinner
	Private SpinFac As Map
	Private lblNameFacility As Label
	Private btnAddFacility As Button
	Dim idspin As String
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.LoadLayout("AddBuildingFacility")
	ScrollView1.Height = 100%y
	ScrollView1.Panel.Height = PanelBuildingList.Height
	SetBackgroundTintList(editQuantity, Colors.ARGB(225,3,155,230), Colors.LightGray)
	'Set building name
	Select Home.HomeBuilding
		Case "Worship"
			If WorshipBuilding.nameBuilding.Length > 0 Then
				idBuilding= WorshipBuilding.nameBuilding
				Log(idBuilding)
			Else
				Msgbox("Can't get the ID","Error Message")
				Activity.Finish
			End If
		Case "Office"
			If OfficeBuilding.nameBuilding.Length > 0 Then
				idBuilding= OfficeBuilding.nameBuilding
				Log(idBuilding)
			Else
				Msgbox("Can't get the ID","Error Message")
				Activity.Finish
			End If
		Case "Health"
			If HealthBuilding.nameBuilding.Length > 0 Then
				idBuilding= HealthBuilding.nameBuilding
				Log(idBuilding)
			Else
				Msgbox("Can't get the ID","Error Message")
				Activity.Finish
			End If
		Case "Msme"
			If MsmeBuilding.nameBuilding.Length > 0 Then
				idBuilding= MsmeBuilding.nameBuilding
				Log(idBuilding)
			Else
				Msgbox("Can't get the ID","Error Message")
				Activity.Finish
			End If
		Case "Educational"
			If EducationalBuilding.nameBuilding.Length > 0 Then
				idBuilding= EducationalBuilding.nameBuilding
				Log(idBuilding)
			Else
				Msgbox("Can't get the ID","Error Message")
				Activity.Finish
			End If
		Case Else
			If SearchBuilding.nameBuilding.Length > 0 Then
				idBuilding = SearchBuilding.idBuilding
				Log(idBuilding)
			Else
				Msgbox("Can't get the ID","Error Message")
				Activity.Finish
			End If
	End Select
	
	Log("IDnyaa LOOOO: "&idBuilding)
	
End Sub

Sub Activity_Resume
	ProgressDialogShow("Loading...")
	
	SpinFac.Initialize
	Select Home.HomeBuilding
		Case "Worship"
			ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from worship_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
		Case "Office"
			ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from office_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
		Case "Msme"
			ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from msme_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
		Case "Educational"
			ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from educational_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
		Case "Health"
			ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from health_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
		Case Else
			Select SearchBuilding.idspin
				Case "Worship"
					ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from worship_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
				Case "Office"
					ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from office_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
				Case "Msme"
					ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from msme_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
				Case "Educational"
					ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from educational_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
				Case "Health"
					ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from health_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
			End Select
	End Select
End Sub

Sub Activity_Pause (UserClosed As Boolean)

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
		Select Job.JobName
			Case "AllFacilities"
				Dim parserf As JSONParser 'mengambil data dalam bentuk json menjadi array
				Dim parserfa As JSONParser
				parserf.Initialize(res)
				Dim fasi_array As List = parserf.NextArray
				parserfa.Initialize(res)
				Dim c As Int
				If fasi_array.Size > 0 Then
				For c=0 To fasi_array.Size - 1
					Dim a As Map
					a = fasi_array.Get(c)
					'Set CustomListView for Facility
					Dim id, name As String
					id=a.Get("facility_id")
					name=a.Get("name_of_facility")
					SpinNameFacility.Add(name)
					SpinFac.Put(name,id)
							Log("id: "&id&" | name: "&name)
				Next
					idspin = SpinFac.GetValueAt(0)
					Log(idspin)
				Else
					
				End If
				ProgressDialogHide
			Case "AddFacility"
					Try
						Msgbox("Data has been updated! :)","Success")
						Activity.Finish
					Catch
						Msgbox("Data can not be updated :(" , "error" )
					End Try
		End Select
	End If
	Job.Release
End Sub

Sub SpinNameFacility_ItemClick (Position As Int, Value As Object)
	Dim idc As String
	idc = SpinFac.Get(Value)
	idspin = idc
End Sub

Sub btnAddFacility_Click
	Select Home.HomeBuilding
		Case "Worship"
			ExecuteRemoteQuery("INSERT INTO detail_worship_building_facilities (worship_building_id, facility_id, quantity_of_facilities) VALUES ('"&idBuilding&"',"&idspin&","&editQuantity.Text&")","AddFacility")
		Case "Office"
			ExecuteRemoteQuery("INSERT INTO detail_office_building_facilities (office_building_id, facility_id, quantity_of_facilities) VALUES ('"&idBuilding&"', "&idspin&", "&editQuantity.Text&")","AddFacility")
		Case "Msme"
			ExecuteRemoteQuery("INSERT INTO detail_msme_building_facilities (msme_building_id, facility_id, quantity_of_facilities) VALUES ('"&idBuilding&"', "&idspin&", "&editQuantity.Text&")","AddFacility")
		Case "Educational"
			ExecuteRemoteQuery("INSERT INTO detail_educational_building_facilities (educational_building_id, facility_id, quantity_of_facilities) VALUES ('"&idBuilding&"', "&idspin&", "&editQuantity.Text&")","AddFacility")
		Case "Health"
			ExecuteRemoteQuery("INSERT INTO detail_health_building_facilities (health_building_id, facility_id, quantity_of_facilities) VALUES ('"&idBuilding&"', "&idspin&", "&editQuantity.Text&")","AddFacility")
		Case Else
			Select SearchBuilding.idspin
				Case "Worship"
					ExecuteRemoteQuery("INSERT INTO detail_worship_building_facilities (worship_building_id, facility_id, quantity_of_facilities) VALUES ('"&idBuilding&"',"&idspin&","&editQuantity.Text&")","AddFacility")
				Case "Office"
					ExecuteRemoteQuery("INSERT INTO detail_office_building_facilities (office_building_id, facility_id, quantity_of_facilities) VALUES ('"&idBuilding&"', "&idspin&", "&editQuantity.Text&")","AddFacility")
				Case "Msme"
					ExecuteRemoteQuery("INSERT INTO detail_msme_building_facilities (msme_building_id, facility_id, quantity_of_facilities) VALUES ('"&idBuilding&"', "&idspin&", "&editQuantity.Text&")","AddFacility")
				Case "Educational"
					ExecuteRemoteQuery("INSERT INTO detail_educational_building_facilities (educational_building_id, facility_id, quantity_of_facilities) VALUES ('"&idBuilding&"', "&idspin&", "&editQuantity.Text&")","AddFacility")
				Case "Health"
					ExecuteRemoteQuery("INSERT INTO detail_health_building_facilities (health_building_id, facility_id, quantity_of_facilities) VALUES ('"&idBuilding&"', "&idspin&", "&editQuantity.Text&")","AddFacility")
			End Select
	End Select
	
End Sub
