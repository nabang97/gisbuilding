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
	Private mBmp As Bitmap
	Dim SourceImageRect, TouchImageViewRect As Rect
End Sub

Sub Globals
	Dim ImageShow As TouchImageView 
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Activity.LoadLayout("ImageViewer")
	'Activity.AddMenuItem("Create Log", "CreateLog")
	
	ImageShow.Initialize("ImageShow")
	Activity.AddView(ImageShow, 0, 0, 100%x, 100%y)
	ImageShow.Gravity=Gravity.CENTER_HORIZONTAL
	If mBmp.IsInitialized Then 
		ImageShow.SetBitmap(mBmp)
	End If
	If FirstTime Then
		
	End If
	
End Sub
Sub Activity_Pause (UserClosed As Boolean)
	TouchImageViewRect=ImageShow.GetDestRect
End Sub

Sub CreateLog_Click
	ImageShow.CreateLog
End Sub

Sub ImageShow_Click(X As Int, Y As Int)
	Log("Click X="&X&", Y="&Y)
	
	'	zoom the image in by 5% on the clicked point
	'	the new scale factor will be the previous scale factor * 1.05
	ImageShow.PreScale(1.05, X, Y)
End Sub

Sub ImageShow_LongClick(X As Int, Y As Int)
	Log("LongClick X="&X&", Y="&Y)
	
	'	set the zoom/scale to 100%
	'	in this demo ScaleX and ScaleY will always be equal
	ImageShow.PreScale(1/ImageShow.ScaleX, X, Y)
	
End Sub
Sub Show(bmp As Bitmap)
		'	if the scaling process scales the image to less than the current MinScale or more than the current MaxScale then MinScale or MaxScale will be adjusted
'	If bmp.Height > bmp.Width Then
'		Dim bmpRatio As Float = bmp.Width / bmp.Height
'		Dim viewRatio As Float = ImageShow.Width / ImageShow.Height
'		If viewRatio > bmpRatio Then
'			Dim NewHeight As Int = bmp.Width / viewRatio
'			bmp = bmp.Crop(0, bmp.Height / 2 - NewHeight / 2, bmp.Width, NewHeight)
'		Else if viewRatio < bmpRatio Then
'			Dim NewWidth As Int = bmp.Height * viewRatio
'			bmp = bmp.Crop(bmp.Width / 2 - NewWidth / 2, 0, NewWidth, bmp.Height)
'		End If
'		mBmp = bmp
'		ImageShow.SetBitmap(mBmp.Resize(ImageShow.Width, ImageShow.Height, True))
'	Else
'		mBmp = bmp
'		ImageShow.SetBitmap(mBmp.Resize(ImageShow.Width, ImageShow.Height, True))'		
'	End If
	mBmp = bmp
	ImageShow.SetBitmap(mBmp)
	SourceImageRect.Initialize(0,0,mBmp.Width, mBmp.Height)
	TouchImageViewRect.Initialize(0,0,100%x,100%y)
	ImageShow.ScaleSrcRectToDestRect(SourceImageRect, TouchImageViewRect, "CENTER")
End Sub
