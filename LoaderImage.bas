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
	Private links As List
End Sub

Sub Globals
	Dim clv As CustomListView
	Dim Label1 As Label
	Dim ImageView1 As ImageView
	Dim ImageViews As List
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("LoaderImage")
End Sub

Sub Activity_Resume
	clv.Clear
	ExecuteRemoteQuery("SELECT photo_url, upload_date FROM house_building_gallery WHERE house_building_id='KG048'","Download")
End Sub

Sub Activity_Pause(UserClosed As Boolean)
	CallSub(Starter, "ActivityIsPaused")
End Sub
Sub ExecuteRemoteQuery(Query As String, JobName As String)
	Dim Job As HttpJob
	Job.Initialize(JobName, Me)
	Job.PostString(""&Main.Server&"mobile/json.php", Query)
End Sub

Sub Jobdone (Job As HttpJob)
ProgressDialogHide
	If Job.Success Then
	Dim res As String
	res= Job.GetString
	Dim parser As JSONParser
	parser.Initialize(res)
	Select Job.JobName
		Case "Download"
'			ResetImagesBackground
			Dim agn As List
			agn=parser.NextArray
			If agn.Size - 1 < 0 Then
			Log(agn.Size)
				Msgbox("Galery Foto tidak ditemukan", "Peringatan")
			Else
				For i=0 To agn.Size-1
				Dim w As Map
				w=agn.Get(i)	
				Dim image = w.Get("photo_url") As String
						Dim gambar = ""&Main.Server&"Files/Worship/img/"&image As String
						Dim m As Map
						m.Initialize
						Dim p As Panel
						p.Initialize("")
						p.SetLayout(0,0,100%x,20%y)						
						p.LoadLayout("listitem-image")
						clv.Add(p,m)
						m.Put(ImageView1, gambar)				
						Log (gambar)
						CallSubDelayed2(Starter, "Download", m)
				Next					
			End If
	End Select
	End If
End Sub

Sub clv_ItemClick (Index As Int, Value As Object)
	
End Sub

Sub ImageView1_Click
	Dim iv As ImageView
	iv = Sender
	If iv.Background Is BitmapDrawable Then
		'It will be ColorDrawable when there is no image.
		Dim bd As BitmapDrawable
		bd = iv.Background
		Dim bmp As Bitmap
		bmp = bd.Bitmap
		CallSubDelayed2(ShowImage, "Show", bmp)
	End If
End Sub