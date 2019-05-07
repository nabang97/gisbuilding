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
	Private xui As XUI
	Dim ArraySize2 As Int
	Dim idisi,isi As String
	Dim idBuilding As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private CLV1 As CustomListView
	Private ScrollView1 As ScrollView
	
	Private numfc As B4XView
	Private namefc As B4XView
	Private ListItem As Panel
	Dim FacMap As Map
	
	Private Label1 As Label
	Private LblFacility As Label
	Private CLV1 As CustomListView
	Private PFacility As Panel
	Private BtnSaveChanges As Button
	Private PanelBuildingList As Panel
	Private btnDelete As Button
	Private Panel1 As Panel
	Private idfaci As Label
	Private Label3 As Label
	Private Label2 As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("MainScrollView")	
	ScrollView1.Panel.LoadLayout("EditBuildingFacility")
	ScrollView1.Height = 100%y
	ScrollView1.Panel.Height = PanelBuildingList.Height
	'Set building name
	Select Home.HomeBuilding 
		Case "Worship"
			If WorshipBuilding.idBuilding.Length > 0 Then
				idBuilding= WorshipBuilding.idBuilding
				Log(idBuilding)
			Else
				Msgbox("Can't get the ID","Error Message")
				Activity.Finish
			End If
		Case "Office"
			If OfficeBuilding.idBuilding.Length > 0 Then
				idBuilding= OfficeBuilding.idBuilding
				Log(idBuilding)
			Else
				Msgbox("Can't get the ID","Error Message")
				Activity.Finish
			End If	
		Case "Health"
			If HealthBuilding.idBuilding.Length > 0 Then
				idBuilding= HealthBuilding.idBuilding
				Log(idBuilding)
			Else
				Msgbox("Can't get the ID","Error Message")
				Activity.Finish
			End If
		Case "Msme"
			If MsmeBuilding.idBuilding.Length > 0 Then
				idBuilding= MsmeBuilding.idBuilding
				Log(idBuilding)
			Else
				Msgbox("Can't get the ID","Error Message")
				Activity.Finish
			End If
		Case "Educational"
			If EducationalBuilding.idBuilding.Length > 0 Then
				idBuilding= EducationalBuilding.idBuilding
				Log(idBuilding)
			Else
				Msgbox("Can't get the ID","Error Message")
				Activity.Finish
			End If
		Case Else
			If SearchBuilding.idBuilding.Length > 0 Then
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
	CLV1.Clear
	FacMap.Initialize
	Select Home.HomeBuilding
		Case "Worship"
			ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from worship_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
			ExecuteRemoteQuery("SELECT D.worship_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id ='"&idBuilding&"'","Facility")
		Case "Office"
			ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from office_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
			ExecuteRemoteQuery("SELECT D.office_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"&idBuilding&"'","Facility")
		Case "Msme"
			ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from msme_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
			ExecuteRemoteQuery("SELECT D.msme_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"&idBuilding&"'","Facility")
		Case "Educational"
			ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from educational_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
			ExecuteRemoteQuery("SELECT D.educational_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"&idBuilding&"'","Facility")
		Case "Health"
			ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from health_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
			ExecuteRemoteQuery("SELECT D.health_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_health_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"&idBuilding&"'","Facility")
		Case Else
		Select SearchBuilding.idspin
			Case "Worship"
					ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from worship_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
					ExecuteRemoteQuery("SELECT D.worship_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id ='"&idBuilding&"'","Facility")
			Case "Office"
					ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from office_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
					ExecuteRemoteQuery("SELECT D.office_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"&idBuilding&"'","Facility")
			Case "Msme"	
					ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from msme_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
					ExecuteRemoteQuery("SELECT D.msme_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"&idBuilding&"'","Facility")
			Case "Educational"	
					ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from educational_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
					ExecuteRemoteQuery("SELECT D.educational_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"&idBuilding&"'","Facility")
			Case "Health"	
					ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from health_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
					ExecuteRemoteQuery("SELECT D.health_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_health_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"&idBuilding&"'","Facility")
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

Private Sub CreateItem(Width As Int, Title As String, Content As String, id As Int) As Panel
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 100%x,6%y)
	p.LoadLayout("facility_edit")
	numfc.Text = Title
	namefc.Text = Content
	idfaci.Text = id
	SetBackgroundTintList(numfc, Colors.ARGB(225,3,155,230), Colors.LightGray)
	Return p
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
				If fasi_array.Size-1 < 0 Then
					Panel1.Enabled=False
					Panel1.Color=Colors.ARGB(225,247,247,247)
					Label2.TextColor=0xFFCECECE
					Panel1.Visible=True
				Else
					For c=0 To fasi_array.Size - 1
						Dim a As Map
						a = fasi_array.Get(c)
						'Set CustomListView for Facility
						Dim id, name As String
						id=a.Get("facility_id")
						name=a.Get("name_of_facility")
						Log("id: "&id&" | name: "&name)
					Next
					Panel1.Enabled=True
					Panel1.Color=Colors.White
					Label2.TextColor=Colors.Black
					Panel1.Visible =True
					
				End If
				ProgressDialogHide
			Case "Facility"
				Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
				parser.Initialize(res)
				Dim fasilitas_array As List
				fasilitas_array = parser.NextArray
				If fasilitas_array.Size > 0 Then
					For i=0 To fasilitas_array.Size - 1
						Dim a As Map
						a = fasilitas_array.Get(i)
						'Set CustomListView for Facility
						Dim content As String = a.Get("name_of_facility")
						Dim quantity As Int = a.Get("quantity_of_facilities")
						Dim idnya As Int = a.Get("facility_id")
						CLV1.Add(CreateItem(CLV1.AsView.Width, $"${quantity}"$, content, idnya),"")
						CLV1.AsView.Height = ListItem.Height*(i+1)
					Next
					'Log("Temp Array 2: "&fasilitasall_array.Size)
					Label3.Visible=False
					CLV1.AsView.Height = CLV1.AsView.Height + 1%y
					CLV1.sv.Height = CLV1.AsView.Height
					PFacility.Height = CLV1.AsView.Top + CLV1.AsView.Height + 1%y
					Panel1.Top=PFacility.Height+PFacility.Top+3%y
					BtnSaveChanges.Top=Panel1.Top+Panel1.Height+3%y
				Else
					Label3.Visible=True
					Label3.Height= 15%y
					Label3.Top=LblFacility.Height
					PFacility.Height=Label3.Top+Label3.Height
					Panel1.Top=PFacility.Height+PFacility.Top+3%y
					BtnSaveChanges.Top=Panel1.Top+Panel1.Height+3%y
				End If
					
				ProgressDialogHide
		Case "DeleteFacility"
			Try
				CLV1.Clear
				Select Home.HomeBuilding
				Case "Worship"
					ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from worship_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
					ExecuteRemoteQuery("SELECT D.worship_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id ='"&idBuilding&"'","Facility")
				Case "Office"
					ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from office_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
					ExecuteRemoteQuery("SELECT D.office_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"&idBuilding&"'","Facility")
				Case "Msme"
					ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from msme_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
					ExecuteRemoteQuery("SELECT D.msme_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"&idBuilding&"'","Facility")
				Case "Educational"
					ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from educational_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
					ExecuteRemoteQuery("SELECT D.educational_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"&idBuilding&"'","Facility")
				Case "Health"
					ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from health_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
					ExecuteRemoteQuery("SELECT D.health_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_health_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"&idBuilding&"'","Facility")
				Case Else
					Select SearchBuilding.idspin
						Case "Worship"
							ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from worship_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
							ExecuteRemoteQuery("SELECT D.worship_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id ='"&idBuilding&"'","Facility")
						Case "Office"
							ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from office_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
							ExecuteRemoteQuery("SELECT D.office_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"&idBuilding&"'","Facility")
						Case "Msme"
							ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from msme_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
							ExecuteRemoteQuery("SELECT D.msme_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"&idBuilding&"'","Facility")
						Case "Educational"
							ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from educational_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
							ExecuteRemoteQuery("SELECT D.educational_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"&idBuilding&"'","Facility")
						Case "Health"
							ExecuteRemoteQuery("SELECT DISTINCT facility_id , name_of_facility from health_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"&idBuilding&"') ORDER BY name_of_facility ASC","AllFacilities")
							ExecuteRemoteQuery("SELECT D.health_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_health_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"&idBuilding&"'","Facility")
					End Select
				End Select
					ToastMessageShow("Deleted",True)	
			Catch
				Msgbox("Data can not be updated :(" , "error" )
			End Try
			End Select
		 
End If
Job.Release
 End Sub
  
Sub BtnSaveChanges_Click
	
End Sub

Sub btnDelete_Click
	Dim item As Int = CLV1.GetItemFromView(Sender)
	Dim p As B4XView
	p = CLV1.GetPanel(item)
	Dim a As B4XView
	a = p.GetView(0)
	Log("NAMA BUILDING: "&a.GetView(3).Text)
	Select Home.HomeBuilding
		Case "Worship"
			ExecuteRemoteQuery("DELETE FROM detail_worship_building_facilities WHERE worship_building_id = '"&idBuilding&"' AND facility_id = "&a.GetView(3).Text&" ","DeleteFacility")
		Case "Office"
			ExecuteRemoteQuery("DELETE FROM detail_office_building_facilities WHERE office_building_id = '"&idBuilding&"' and facility_id = "&a.GetView(3).Text&"","DeleteFacility")
		Case "Msme"
			ExecuteRemoteQuery("DELETE FROM detail_msme_building_facilities WHERE msme_building_id = '"&idBuilding&"' and facility_id = "&a.GetView(3).Text&"","DeleteFacility")
		Case "Educational"
			ExecuteRemoteQuery("DELETE FROM detail_educational_building_facilities WHERE educational_building_id = '"&idBuilding&"' and facility_id = "&a.GetView(3).Text&"","DeleteFacility")
		Case "Health"
			ExecuteRemoteQuery("DELETE FROM detail_health_building_facilities WHERE health_building_id = '"&idBuilding&"' and facility_id = "&a.GetView(3).Text&"","DeleteFacility")
		Case Else
			Select SearchBuilding.idspin
				Case "Worship"
					ExecuteRemoteQuery("DELETE FROM detail_worship_building_facilities WHERE worship_building_id = '"&idBuilding&"' AND facility_id = "&a.GetView(3).Text&" ","DeleteFacility")
				Case "Office"
					ExecuteRemoteQuery("DELETE FROM detail_office_building_facilities WHERE office_building_id = '"&idBuilding&"' and facility_id = "&a.GetView(3).Text&"","DeleteFacility")
				Case "Msme"
					ExecuteRemoteQuery("DELETE FROM detail_msme_building_facilities WHERE msme_building_id = '"&idBuilding&"' and facility_id = "&a.GetView(3).Text&"","DeleteFacility")
				Case "Educational"
					ExecuteRemoteQuery("DELETE FROM detail_educational_building_facilities WHERE educational_building_id = '"&idBuilding&"' and facility_id = "&a.GetView(3).Text&"","DeleteFacility")
				Case "Health"
					ExecuteRemoteQuery("DELETE FROM detail_health_building_facilities WHERE health_building_id = '"&idBuilding&"' and facility_id = "&a.GetView(3).Text&"","DeleteFacility")
			End Select
	End Select
	
End Sub

Sub Panel1_Click
	StartActivity(AddBuildingFacility)
End Sub