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
	Dim temp As String
	
	Dim hc As OkHttpClient
	Dim out As OutputStream
	Dim Base64Con As Base64Image
	Dim chooser As ContentChooser
	Dim cc As ContentChooser
	Private ion As Object
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	'Dim Server As String = ""&Main.Server&"jsonfile.php"
	Private ButtonBrowse As Button
	Private ButtonCamera As Button
	Private ImageView1 As ImageView
	Private ButtonUpload As Button
	Dim namefile As String
	
	Private rp As RuntimePermissions
	Private mBmp As Bitmap	
	Dim folder As String
	Dim idBuilding As String
	Dim buildingtype As String
	
	Private PanelToolBar As Panel
	Private TitleBar As Label
	Private BackArrow As Label
	Private ScrollView1 As ScrollView
	Private Label1 As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MainScrollView")
	ScrollView1.Panel.LoadLayout("AddPhoto")	
	ScrollView1.Height = 100%y - ScrollView1.Top
	PanelToolBar.Visible = False
	Base64Con.Initialize
	'Set Back arrow
	BackArrow.Visible= True
	BackArrow.SetBackgroundImage(LoadBitmap(File.DirAssets,"back-arrow.png"))
	TitleBar.Text="Upload Photo"
	
	ImageView1.Gravity=Gravity.CENTER
	If FirstTime Then		
		temp = rp.GetSafeDirDefaultExternal("temp")
		folder = rp.GetSafeDirDefaultExternal("uploads")
		hc.Initialize("hc")
		chooser.Initialize("chooser")
	End If
	If Home.HomeBuilding.Length > 0 Then
		Log(Home.HomeBuilding)
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
				Msgbox("Can't get the ID","Error Message")
				Activity.Finish						
		End Select
	 Else If SearchBuilding.idspin.Length > 0 Then
	 	buildingtype = SearchBuilding.idspin
		Log(buildingtype)	 
		If SearchBuilding.idBuilding.Length > 0 Then
			idBuilding = SearchBuilding.idBuilding
			Log(idBuilding)
		Else
			Msgbox("Can't get the ID","Error Message")
			Activity.Finish
		End If	
	End If

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub ButtonBrowse_Click
	Dim list_files As List
	list_files.Initialize
	list_files = File.ListFiles(temp)
	Log(list_files.Size)
	For i= 0 To list_files.Size-1
		File.Delete(temp,list_files.Get(i))
		Log(list_files.size)
	Next
'	cc.Initialize("cc")
'	cc.Show("image/*", "")
	
		
	Log("IDnyaa LOOOO: "&idBuilding)
	rp.CheckAndRequest(rp.PERMISSION_READ_EXTERNAL_STORAGE)
	Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
	If Result Then
		Dim a As Intent
		'i.Initialize("android.intent.action.GET_CONTENT","content://media/external/images/media/")
		a.Initialize(a.ACTION_PICK, "content://media/external/images/media/")
		a.PutExtra("android.intent.extra.ALLOW_MULTIPLE", True)
		a.SetType("image/*")
		StartActivityForResult(a)
	End If
End Sub

Sub CC_Result (Success As Boolean, Dir As String, FileName As String)
	If Success Then		
			'Log("GET STREAM : "&GetStreamFromContentResult(FileName))
			Log("GET PATH: "&GetPathFromContentResult(FileName))
			DateTime.DateFormat="ddmmyyy-hhmmss"
			Dim tanggal As String
			tanggal = DateTime.Date(DateTime.now)
			Dim namafile As String
			namafile = idBuilding&"-"&tanggal&".jpg"
			'Log(namefile)
			File.Copy(Dir,FileName,temp,namafile)
		ShowPicture(namafile)
	End If
End Sub

Sub GetPathFromContentResult(UriString As String) As String
	If UriString.StartsWith("/") Then Return UriString 'If the user used a file manager to choose the image
	Dim Cursor1 As Cursor
	Dim Uri1 As Uri
	Dim Proj() As String = Array As String("_data")
	Dim cr As ContentResolver
	cr.Initialize("")
	If UriString.StartsWith("content://com.android.providers.media.documents") Then
		Dim i As Int = UriString.IndexOf("%3A")
		Dim id As String = UriString.SubString(i + 3)
		Uri1.Parse("content://media/external/images/media")
		Cursor1 = cr.Query(Uri1, Proj, "_id = ?", Array As String(id), "")
	Else
		Uri1.Parse(UriString)
		Cursor1 = cr.Query(Uri1, Proj, "", Null, "")
	End If
	Cursor1.Position = 0
	Dim res As String
	res = Cursor1.GetString("_data")
	Cursor1.Close
	Return res
'	If UriString.StartsWith("/") Then Return UriString 'If the user used a file manager to choose the image
'	Dim Proj() As String
'	Proj = Array As String("_data")
'	Dim Cursor As Cursor
'	Dim r As Reflector
'	Dim Uri As Object
'	Uri = r.RunStaticMethod("android.net.Uri", "parse", _
'      Array As Object(UriString), _
'      Array As String("java.lang.String"))
'	r.Target = r.GetContext
'	r.Target = r.RunMethod("getContentResolver")
'	Cursor = r.RunMethod4("query", _
'   Array As Object(Uri, Proj, Null, Null, Null), _
'   Array As String("android.net.Uri", _
'      "[Ljava.lang.String;", "java.lang.String", _
'      "[Ljava.lang.String;", "java.lang.String"))
' 
'	Cursor.Position = 0
'	Dim res As String
'	res = Cursor.GetString("_data")
'	Cursor.Close
'	Return res
End Sub

Sub ShowPicture(FileName As String)
	ImageView1.Visible=True
	Label1.Visible=False
	Dim bmp As Bitmap
	bmp = LoadBitmap(temp,FileName)
	If bmp.Height > bmp.Width Then
		Dim bmpRatio As Float = bmp.Width / bmp.Height
		Dim viewRatio As Float = ImageView1.Width / ImageView1.Height
		If viewRatio > bmpRatio Then
			Dim NewHeight As Int = bmp.Width / viewRatio
			bmp = bmp.Crop(0, bmp.Height / 2 - NewHeight / 2, bmp.Width, NewHeight)
		Else if viewRatio < bmpRatio Then
			Dim NewWidth As Int = bmp.Height * viewRatio
			bmp = bmp.Crop(bmp.Width / 2 - NewWidth / 2, 0, NewWidth, bmp.Height)
		End If
		mBmp = bmp
		ImageView1.Bitmap = mBmp.Resize(ImageView1.Width, ImageView1.Height, True)
	Else
		mBmp = bmp
		ImageView1.Bitmap = mBmp.Resize(ImageView1.Width, ImageView1.Height, True)
	End If
	namefile = FileName
End Sub

Sub ion_Event (MethodName As String, Args() As Object) As Object
	If Args(0) = -1 Then 'resultCode = RESULT_OK
		Dim i As Intent = Args(1)
		Dim jo As JavaObject = i
		'Android 4.1+ (API 16)
		Dim uris As List
		uris.Initialize
		Dim clipdata As JavaObject = jo.RunMethod("getClipData", Null)
		If clipdata.IsInitialized Then
			Dim count As Int = clipdata.RunMethod("getItemCount", Null)
			For i2 = 0 To count -1
				Dim item As JavaObject = clipdata.RunMethod("getItemAt", Array(i2))
				uris.Add(item.RunMethod("getUri", Null))
			Next
		Else
			uris.Add(i.GetData)
		End If
		Log(uris)
		Dim urisize As Int = uris.Size
		For c=0 To urisize-1
			Dim urst,realpath As String
			urst= uris.Get(c)
			Log("PATH:"& GetPathFromContentResult(urst))
			realpath = GetPathFromContentResult(urst)
			Log(realpath.LastIndexOf("/"))
			Dim lastidx As Int = realpath.LastIndexOf("/")
			Dim pathonly As String = realpath.SubString2(0,lastidx)
			Dim namefilee As String = realpath.SubString2(lastidx+1, realpath.Length)
			Log("NAMAA :"&namefilee)
			If File.Exists(temp,namefilee) Then
				Dim newname,oldname As String
				oldname = namefilee
				Do While File.Exists(temp,oldname) == True
					Dim filenamefile , filename, extensi As String
					filenamefile = oldname
					Log("COBA :"&filenamefile.SubString2(0, filenamefile.Length-4))
					filename = filenamefile.SubString2(0, filenamefile.Length-4)
					extensi = filenamefile.SubString2(filename.Length, filenamefile.Length)
					Log("name: "&filename)
					Log("extention: "&extensi)
					newname=filename&"(copy)"&extensi
					oldname=newname
					'Log(namefile)
					'namefile = filename&"(copy)"&extensi
				Loop
				File.Copy(pathonly,namefilee,temp,newname)
				Log("DONE")
			Else
				File.Copy(pathonly,namefilee,temp,namefilee)
			End If		
		Next
	End If
	Return Null
End Sub

Sub Activity_PermissionResult (Permission As String, Result As Boolean)
	If Permission = rp.PERMISSION_ACCESS_FINE_LOCATION Then
	End If
End Sub
Sub StartActivityForResult(i As Intent)
	Dim jo As JavaObject = GetBA
	ion = jo.CreateEvent("anywheresoftware.b4a.IOnActivityResult", "ion", Null)
	jo.RunMethod("startActivityForResult", Array As Object(ion, i))
End Sub

Sub ButtonCamera_Click
	ToastMessageShow("fileee: "&namefile,False)
	Dim list_files As List
	list_files.Initialize
	list_files = File.ListFiles(temp)
	Log(list_files.Size)
	For i= 0 To list_files.Size-1
		File.Delete(temp,list_files.Get(i))
		Log(list_files.size)
	Next
	StartActivity(MainCamera)
	
End Sub

Sub GetBA As Object
	Dim jo As JavaObject
	Dim cls As String = Me
	cls = cls.SubString("class ".Length)
	jo.InitializeStatic(cls)
	Return jo.GetField("processBA")
End Sub

'Sub GetStreamFromContentResult(UriString As String) As InputStream
'	Dim r As Reflector
'	Dim Uri As Object
'	Dim iStream As InputStream
'	Uri = r.RunStaticMethod("android.net.Uri", "parse", Array As Object(UriString), Array As String("java.lang.String"))
'	r.Target = r.GetContext
'	r.Target = r.RunMethod("getContentResolver")
'	iStream = r.RunMethod4( "openInputStream", Array As Object(Uri), Array As String("android.net.Uri"))
'	Return iStream
'End Sub

Sub JobDone(Job As HttpJob)
	If Job.Success Then
		Select Job.JobName
			Case "Upload Success"
				Log("Uploaded file success!!!")
				ProgressDialogHide
		End Select	
	Else
		Msgbox("gagal","WARNING")
	End If	
	Job.Release
End Sub

Sub ButtonUpload_Click
	ToastMessageShow("fileee: "&namefile,False)
	'Dim bmp As Bitmap = LoadBitmap(temp,namefile)
	DateTime.DateFormat="yyyy-MM-dd"
	Dim tanggal As String
	tanggal = DateTime.Date(DateTime.now)
	Log(tanggal)
	Dim baseim As String
	baseim = Base64Con.EncodeFromImage(temp,namefile)
	Log ("BASE64: "&baseim)
	
	Dim filenamefile , filename As String
	filenamefile = namefile
	Log("COBA :"&filenamefile.SubString2(0, filenamefile.Length-4))
	filename = filenamefile.SubString2(0, filenamefile.Length-4)
	Dim files As List
	files.Initialize
	Dim fd As FileData
	fd.Initialize
	fd.Dir = temp
	fd.FileName = filenamefile
	fd.KeyName = filename
	fd.ContentType = "application/octet-stream"
	files.Add(fd)
	Dim NV As Map
	NV.Initialize
	NV.Put("buildingtype", buildingtype)
	NV.Put("tanggal", tanggal)
	NV.Put("idbang", idBuilding)
	NV.Put("keyname", filename)
	NV.Put("action", "upload")
	Dim req As OkHttpRequest
	ProgressDialogShow("uploading...")
	req = MultipartPost.CreatePostRequest(Main.Server&"multipartpost.php", NV, files)
	hc.Execute(req, 1)
End Sub
Sub hc_ResponseError (Response As OkHttpResponse, Reason As String, StatusCode As Int, TaskId As Int)
	'Log("error: " & Response.GetString("utf8") & " " & StatusCode)
	ProgressDialogHide	
	If Response <> Null Then
		Msgbox("Upload file failed!","Error Message")
		ImageView1.Visible=False
		Label1.Visible =True
		Label1.Text = "failed"
		Log(Reason)
	End If
End Sub

Sub hc_ResponseSuccess (Response As OkHttpResponse, TaskId As Int)
	out.InitializeToBytesArray(0) ' I expect less than 2000 bytes here
	Response.GetAsynchronously("Response", out, True, TaskId)
	ProgressDialogHide
	ImageView1.Visible=False
	Label1.Visible =True
	Label1.Text = "Image has successfully been uploaded!"
	Log("response: " & Response.ErrorResponse)
	
	Dim list_files As List
	list_files.Initialize
	list_files = File.ListFiles(temp)
	Log(list_files.Size)
	For i= 0 To list_files.Size-1
		File.Delete(temp,list_files.Get(i))
		Log(list_files.size)
	Next
	'Msgbox(Response, "")
	'Response.Release
End Sub

Sub Response_StreamFinish (Success As Boolean, TaskId As Int)
	Dim another_buffer () As Byte
	another_buffer = out.ToBytesArray
	Log (BytesToString(another_buffer, 0, another_buffer.Length, "UTF8"))
End Sub
