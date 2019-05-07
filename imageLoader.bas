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
	If FirstTime Then
		links.Initialize
		Dim pageJob As HttpJob
		pageJob.Initialize("PageJob", Me)
		pageJob.Download("http://www.loc.gov/rr/print/list/listguid.html#architecture")
	End If
	ImageViews.Initialize
	clv.Initialize(Me, "clv")
	Activity.AddView(clv.AsView, 0, 0, 100%x, 100%y)
End Sub

Sub Activity_Resume
	BuildItems
End Sub

Sub Activity_Pause(UserClosed As Boolean)
	CallSub(Starter, "ActivityIsPaused")
End Sub

Sub BuildItems
	If links.Size = 0 Then Return
	clv.Clear
	Dim m As Map
	m.Initialize
	For Each link As String In links
		Dim p As Panel
		p.Initialize("")
		clv.Add(p, link)
		p.LoadLayout("listitem-image")
		Label1.Text = link 'Label1 now points to the last "Label1" that was added
		'the same is true for ImageView1.
		m.Put(ImageView1, "http://www.loc.gov/rr/print/list/" & link)
	Next
	CallSubDelayed2(Starter, "Download", m)
End Sub

Sub JobDone(Job As HttpJob)
	If Job.Success = True Then
		If Job.JobName = "PageJob" Then
			Dim m As Matcher = Regex.Matcher("class=\""darkbox\""><img src=\""([^""]+)""", Job.GetString)
			Do While m.Find
				links.Add(m.Group(1))
			Loop
			BuildItems
		End If
	Else
		Log(Job.ErrorMessage)
	End If
	Job.Release
End Sub

Sub clv_ItemClick (Index As Int, Value As Object)
	Activity.Title = Value
End Sub




