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
	Dim ids As String
End Sub

Sub ExecuteRemoteQuery(Query As String, JobName As String, Objek As Object)
	Dim Job As HttpJob
	Job.Initialize(JobName,Objek)
	Job.PostString(""&Main.Server&"mobile/json.php", Query)
End Sub

Sub SetAnimation(InAnimation As String, OutAnimation As String)
	Dim r As Reflector
	Dim package As String
	Dim in, out As Int
	package = r.GetStaticField("anywheresoftware.b4a.BA", "packageName")
	in = r.GetStaticField(package & ".R$anim", InAnimation)
	out = r.GetStaticField(package & ".R$anim", OutAnimation)
	r.Target = r.GetActivity
	r.RunMethod4("overridePendingTransition", Array As Object(in, out), Array As String("java.lang.int", "java.lang.int"))
End Sub

Sub CheckBuilding_id (id As String)	
	If id.Length > 0 Then
		ids = id
		Log(ids)
	Else If	SearchBuilding.idBuilding.Length > 0 Then
		ids = SearchBuilding.idBuilding
		Log(ids)
	Else
		Msgbox ("Please press on the button and choose an item","Error")
	End If
End Sub

Sub SetBorderDrawable (V As View, FillColor As Int, StrokeColor As Int, rx As Float, ry As Float, SWidth As Float, Padding As Int)

	Dim BM As Bitmap
	Dim BMD As BitmapDrawable
	Dim Cnv As Canvas
	'We need to draw on the bitmap with a canvas
	BM.InitializeMutable(V.Width,V.Height)
	Cnv.Initialize2(BM)
	'Sizing Variables need to be cast to floats to enable the constructor to be found.
	Dim l,t,r,b As Float
	l = 0
	t = 0
	r = V.Width
	b = V.Height
	'Needs a RectF object not just a Rect
	Dim rect1 As JavaObject
	rect1.InitializeNewInstance("android.graphics.RectF",Array As Object(l,t,r,b))
	'Create a Paint.Style object
	Dim PS As JavaObject
	PS.InitializeStatic("android.graphics.Paint.Style")
	'Create and setup a Paint object
	Dim Paint,Paint1 As JavaObject
	Paint.InitializeNewInstance("android.graphics.Paint",Null)
	Paint.RunMethod("setStrokeWidth",Array As Object(SWidth))
	Paint.RunMethod("setColor",Array As Object(StrokeColor))
	Paint.RunMethod("setStyle",Array As Object(PS.GetField("STROKE")))
	Paint.RunMethod("setAntiAlias",Array As Object(True))
	
	Paint1.InitializeNewInstance("android.graphics.Paint",Null)
	Paint1.RunMethod("setColor",Array As Object(FillColor))
	Paint1.RunMethod("setAntiAlias",Array As Object(True))
	Paint1.RunMethod("setStyle",Array As Object(PS.GetField("FILL")))
	
	'Get the canvas object from the wrapper
	Dim CnvJO As JavaObject = Cnv
	CnvJO = CnvJO.GetField("canvas")
	'Draw the filled round rect on the bitmap using the canvas
	CnvJO.RunMethod("drawRoundRect",Array As Object(rect1,rx,ry,Paint1))
	'Draw the border round rect on the bitmap using the canvas
	CnvJO.RunMethod("drawRoundRect",Array As Object(rect1,rx,ry,Paint))
	'Cast the Bitmap to a BitmapDrawable
	BMD.Initialize(BM)
	If Padding <> -1 And GetType(V) = "android.widget.TextView" Then
		Dim VJO As JavaObject = V
		VJO.RunMethod("setPadding",Array As Object(Padding,Padding,Padding,Padding))
	End If
	'Add it to the view
	V.Background = BMD
End Sub

Sub setCornerRadii(v As View, Rx_TopLeft As Float, Ry_TopLeft As Float, Rx_TopRight As Float, Ry_TopRight As Float, Rx_BottomRight As Float, Ry_BottomRight As Float, Rx_BottomLeft As Float, Ry_BottomLeft As Float)
	Dim jo As JavaObject = v.Background
	'If v.Background Is ColorDrawable Or v.Background Is GradientDrawable Then
		jo.RunMethod("setCornerRadii", Array As Object(Array As Float(Rx_TopLeft, Ry_TopLeft, Rx_TopRight, Ry_TopRight, Rx_BottomRight, Ry_BottomRight, Rx_BottomLeft, Ry_BottomLeft)))
	'End If
End Sub