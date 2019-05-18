package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class functionall_subs_0 {


public static RemoteObject  _checkbuilding_id(RemoteObject _ba,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CheckBuilding_id (functionall) ","functionall",3,_ba,functionall.mostCurrent,26);
if (RapidSub.canDelegate("checkbuilding_id")) return b4a.example.functionall.remoteMe.runUserSub(false, "functionall","checkbuilding_id", _ba, _id);
;
Debug.locals.put("id", _id);
 BA.debugLineNum = 26;BA.debugLine="Sub CheckBuilding_id (id As String)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="If id.Length > 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_id.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 28;BA.debugLine="ids = id";
Debug.ShouldStop(134217728);
functionall._ids = _id;
 BA.debugLineNum = 29;BA.debugLine="Log(ids)";
Debug.ShouldStop(268435456);
functionall.mostCurrent.__c.runVoidMethod ("Log",(Object)(functionall._ids));
 }else 
{ BA.debugLineNum = 30;BA.debugLine="Else If	SearchBuilding.idBuilding.Length > 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",functionall.mostCurrent._searchbuilding._idbuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 31;BA.debugLine="ids = SearchBuilding.idBuilding";
Debug.ShouldStop(1073741824);
functionall._ids = functionall.mostCurrent._searchbuilding._idbuilding;
 BA.debugLineNum = 32;BA.debugLine="Log(ids)";
Debug.ShouldStop(-2147483648);
functionall.mostCurrent.__c.runVoidMethod ("Log",(Object)(functionall._ids));
 }else {
 BA.debugLineNum = 34;BA.debugLine="Msgbox (\"Please press on the button and choose a";
Debug.ShouldStop(2);
functionall.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please press on the button and choose an item")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),_ba);
 }}
;
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executeremotequery(RemoteObject _ba,RemoteObject _query,RemoteObject _jobname,RemoteObject _objek) throws Exception{
try {
		Debug.PushSubsStack("ExecuteRemoteQuery (functionall) ","functionall",3,_ba,functionall.mostCurrent,9);
if (RapidSub.canDelegate("executeremotequery")) return b4a.example.functionall.remoteMe.runUserSub(false, "functionall","executeremotequery", _ba, _query, _jobname, _objek);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
;
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
Debug.locals.put("Objek", _objek);
 BA.debugLineNum = 9;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(512);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 11;BA.debugLine="Job.Initialize(JobName,Objek)";
Debug.ShouldStop(1024);
_job.runVoidMethod ("_initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(_jobname),(Object)(_objek));
 BA.debugLineNum = 12;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
Debug.ShouldStop(2048);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),functionall.mostCurrent._main._server,RemoteObject.createImmutable("mobile/json.php"))),(Object)(_query));
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Dim ids As String";
functionall._ids = RemoteObject.createImmutable("");
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setanimation(RemoteObject _ba,RemoteObject _inanimation,RemoteObject _outanimation) throws Exception{
try {
		Debug.PushSubsStack("SetAnimation (functionall) ","functionall",3,_ba,functionall.mostCurrent,15);
if (RapidSub.canDelegate("setanimation")) return b4a.example.functionall.remoteMe.runUserSub(false, "functionall","setanimation", _ba, _inanimation, _outanimation);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _package = RemoteObject.createImmutable("");
RemoteObject _in = RemoteObject.createImmutable(0);
RemoteObject _out = RemoteObject.createImmutable(0);
;
Debug.locals.put("InAnimation", _inanimation);
Debug.locals.put("OutAnimation", _outanimation);
 BA.debugLineNum = 15;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(32768);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 17;BA.debugLine="Dim package As String";
Debug.ShouldStop(65536);
_package = RemoteObject.createImmutable("");Debug.locals.put("package", _package);
 BA.debugLineNum = 18;BA.debugLine="Dim in, out As Int";
Debug.ShouldStop(131072);
_in = RemoteObject.createImmutable(0);Debug.locals.put("in", _in);
_out = RemoteObject.createImmutable(0);Debug.locals.put("out", _out);
 BA.debugLineNum = 19;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
Debug.ShouldStop(262144);
_package = BA.ObjectToString(_r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("anywheresoftware.b4a.BA")),(Object)(RemoteObject.createImmutable("packageName"))));Debug.locals.put("package", _package);
 BA.debugLineNum = 20;BA.debugLine="in = r.GetStaticField(package & \".R$anim\", InAnim";
Debug.ShouldStop(524288);
_in = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_inanimation)));Debug.locals.put("in", _in);
 BA.debugLineNum = 21;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
Debug.ShouldStop(1048576);
_out = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_outanimation)));Debug.locals.put("out", _out);
 BA.debugLineNum = 22;BA.debugLine="r.Target = r.GetActivity";
Debug.ShouldStop(2097152);
_r.setField ("Target",(_r.runMethod(false,"GetActivity",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba))));
 BA.debugLineNum = 23;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
Debug.ShouldStop(4194304);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("overridePendingTransition")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_in),(_out)})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.lang.int")})));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setborderdrawable(RemoteObject _ba,RemoteObject _v,RemoteObject _fillcolor,RemoteObject _strokecolor,RemoteObject _rx,RemoteObject _ry,RemoteObject _swidth,RemoteObject _padding) throws Exception{
try {
		Debug.PushSubsStack("SetBorderDrawable (functionall) ","functionall",3,_ba,functionall.mostCurrent,38);
if (RapidSub.canDelegate("setborderdrawable")) return b4a.example.functionall.remoteMe.runUserSub(false, "functionall","setborderdrawable", _ba, _v, _fillcolor, _strokecolor, _rx, _ry, _swidth, _padding);
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _bmd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _cnv = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
RemoteObject _l = RemoteObject.createImmutable(0f);
RemoteObject _t = RemoteObject.createImmutable(0f);
RemoteObject _r = RemoteObject.createImmutable(0f);
RemoteObject _b = RemoteObject.createImmutable(0f);
RemoteObject _rect1 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _ps = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _paint = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _paint1 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _cnvjo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _vjo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("V", _v);
Debug.locals.put("FillColor", _fillcolor);
Debug.locals.put("StrokeColor", _strokecolor);
Debug.locals.put("rx", _rx);
Debug.locals.put("ry", _ry);
Debug.locals.put("SWidth", _swidth);
Debug.locals.put("Padding", _padding);
 BA.debugLineNum = 38;BA.debugLine="Sub SetBorderDrawable (V As View, FillColor As Int";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="Dim BM As Bitmap";
Debug.ShouldStop(128);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("BM", _bm);
 BA.debugLineNum = 41;BA.debugLine="Dim BMD As BitmapDrawable";
Debug.ShouldStop(256);
_bmd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("BMD", _bmd);
 BA.debugLineNum = 42;BA.debugLine="Dim Cnv As Canvas";
Debug.ShouldStop(512);
_cnv = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("Cnv", _cnv);
 BA.debugLineNum = 44;BA.debugLine="BM.InitializeMutable(V.Width,V.Height)";
Debug.ShouldStop(2048);
_bm.runVoidMethod ("InitializeMutable",(Object)(_v.runMethod(true,"getWidth")),(Object)(_v.runMethod(true,"getHeight")));
 BA.debugLineNum = 45;BA.debugLine="Cnv.Initialize2(BM)";
Debug.ShouldStop(4096);
_cnv.runVoidMethod ("Initialize2",(Object)((_bm.getObject())));
 BA.debugLineNum = 47;BA.debugLine="Dim l,t,r,b As Float";
Debug.ShouldStop(16384);
_l = RemoteObject.createImmutable(0f);Debug.locals.put("l", _l);
_t = RemoteObject.createImmutable(0f);Debug.locals.put("t", _t);
_r = RemoteObject.createImmutable(0f);Debug.locals.put("r", _r);
_b = RemoteObject.createImmutable(0f);Debug.locals.put("b", _b);
 BA.debugLineNum = 48;BA.debugLine="l = 0";
Debug.ShouldStop(32768);
_l = BA.numberCast(float.class, 0);Debug.locals.put("l", _l);
 BA.debugLineNum = 49;BA.debugLine="t = 0";
Debug.ShouldStop(65536);
_t = BA.numberCast(float.class, 0);Debug.locals.put("t", _t);
 BA.debugLineNum = 50;BA.debugLine="r = V.Width";
Debug.ShouldStop(131072);
_r = BA.numberCast(float.class, _v.runMethod(true,"getWidth"));Debug.locals.put("r", _r);
 BA.debugLineNum = 51;BA.debugLine="b = V.Height";
Debug.ShouldStop(262144);
_b = BA.numberCast(float.class, _v.runMethod(true,"getHeight"));Debug.locals.put("b", _b);
 BA.debugLineNum = 53;BA.debugLine="Dim rect1 As JavaObject";
Debug.ShouldStop(1048576);
_rect1 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("rect1", _rect1);
 BA.debugLineNum = 54;BA.debugLine="rect1.InitializeNewInstance(\"android.graphics.Rec";
Debug.ShouldStop(2097152);
_rect1.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.graphics.RectF")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_l),(_t),(_r),(_b)})));
 BA.debugLineNum = 56;BA.debugLine="Dim PS As JavaObject";
Debug.ShouldStop(8388608);
_ps = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("PS", _ps);
 BA.debugLineNum = 57;BA.debugLine="PS.InitializeStatic(\"android.graphics.Paint.Style";
Debug.ShouldStop(16777216);
_ps.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.graphics.Paint.Style")));
 BA.debugLineNum = 59;BA.debugLine="Dim Paint,Paint1 As JavaObject";
Debug.ShouldStop(67108864);
_paint = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("Paint", _paint);
_paint1 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("Paint1", _paint1);
 BA.debugLineNum = 60;BA.debugLine="Paint.InitializeNewInstance(\"android.graphics.Pai";
Debug.ShouldStop(134217728);
_paint.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.graphics.Paint")),(Object)((functionall.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 61;BA.debugLine="Paint.RunMethod(\"setStrokeWidth\",Array As Object(";
Debug.ShouldStop(268435456);
_paint.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setStrokeWidth")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_swidth)})));
 BA.debugLineNum = 62;BA.debugLine="Paint.RunMethod(\"setColor\",Array As Object(Stroke";
Debug.ShouldStop(536870912);
_paint.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_strokecolor)})));
 BA.debugLineNum = 63;BA.debugLine="Paint.RunMethod(\"setStyle\",Array As Object(PS.Get";
Debug.ShouldStop(1073741824);
_paint.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setStyle")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_ps.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("STROKE")))})));
 BA.debugLineNum = 64;BA.debugLine="Paint.RunMethod(\"setAntiAlias\",Array As Object(Tr";
Debug.ShouldStop(-2147483648);
_paint.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setAntiAlias")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(functionall.mostCurrent.__c.getField(true,"True"))})));
 BA.debugLineNum = 66;BA.debugLine="Paint1.InitializeNewInstance(\"android.graphics.Pa";
Debug.ShouldStop(2);
_paint1.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.graphics.Paint")),(Object)((functionall.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 67;BA.debugLine="Paint1.RunMethod(\"setColor\",Array As Object(FillC";
Debug.ShouldStop(4);
_paint1.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_fillcolor)})));
 BA.debugLineNum = 68;BA.debugLine="Paint1.RunMethod(\"setAntiAlias\",Array As Object(T";
Debug.ShouldStop(8);
_paint1.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setAntiAlias")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(functionall.mostCurrent.__c.getField(true,"True"))})));
 BA.debugLineNum = 69;BA.debugLine="Paint1.RunMethod(\"setStyle\",Array As Object(PS.Ge";
Debug.ShouldStop(16);
_paint1.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setStyle")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_ps.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("FILL")))})));
 BA.debugLineNum = 72;BA.debugLine="Dim CnvJO As JavaObject = Cnv";
Debug.ShouldStop(128);
_cnvjo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_cnvjo.setObject(_cnv);Debug.locals.put("CnvJO", _cnvjo);
 BA.debugLineNum = 73;BA.debugLine="CnvJO = CnvJO.GetField(\"canvas\")";
Debug.ShouldStop(256);
_cnvjo.setObject(_cnvjo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("canvas"))));
 BA.debugLineNum = 75;BA.debugLine="CnvJO.RunMethod(\"drawRoundRect\",Array As Object(r";
Debug.ShouldStop(1024);
_cnvjo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("drawRoundRect")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_rect1.getObject()),(_rx),(_ry),(_paint1.getObject())})));
 BA.debugLineNum = 77;BA.debugLine="CnvJO.RunMethod(\"drawRoundRect\",Array As Object(r";
Debug.ShouldStop(4096);
_cnvjo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("drawRoundRect")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_rect1.getObject()),(_rx),(_ry),(_paint.getObject())})));
 BA.debugLineNum = 79;BA.debugLine="BMD.Initialize(BM)";
Debug.ShouldStop(16384);
_bmd.runVoidMethod ("Initialize",(Object)((_bm.getObject())));
 BA.debugLineNum = 80;BA.debugLine="If Padding <> -1 And GetType(V) = \"android.widget";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("!",_padding,BA.numberCast(double.class, -(double) (0 + 1))) && RemoteObject.solveBoolean("=",functionall.mostCurrent.__c.runMethod(true,"GetType",(Object)((_v.getObject()))),BA.ObjectToString("android.widget.TextView"))) { 
 BA.debugLineNum = 81;BA.debugLine="Dim VJO As JavaObject = V";
Debug.ShouldStop(65536);
_vjo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_vjo.setObject(_v.getObject());Debug.locals.put("VJO", _vjo);
 BA.debugLineNum = 82;BA.debugLine="VJO.RunMethod(\"setPadding\",Array As Object(Paddi";
Debug.ShouldStop(131072);
_vjo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setPadding")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_padding),(_padding),(_padding),(_padding)})));
 };
 BA.debugLineNum = 85;BA.debugLine="V.Background = BMD";
Debug.ShouldStop(1048576);
_v.runMethod(false,"setBackground",(_bmd.getObject()));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcornerradii(RemoteObject _ba,RemoteObject _v,RemoteObject _rx_topleft,RemoteObject _ry_topleft,RemoteObject _rx_topright,RemoteObject _ry_topright,RemoteObject _rx_bottomright,RemoteObject _ry_bottomright,RemoteObject _rx_bottomleft,RemoteObject _ry_bottomleft) throws Exception{
try {
		Debug.PushSubsStack("setCornerRadii (functionall) ","functionall",3,_ba,functionall.mostCurrent,88);
if (RapidSub.canDelegate("setcornerradii")) return b4a.example.functionall.remoteMe.runUserSub(false, "functionall","setcornerradii", _ba, _v, _rx_topleft, _ry_topleft, _rx_topright, _ry_topright, _rx_bottomright, _ry_bottomright, _rx_bottomleft, _ry_bottomleft);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("v", _v);
Debug.locals.put("Rx_TopLeft", _rx_topleft);
Debug.locals.put("Ry_TopLeft", _ry_topleft);
Debug.locals.put("Rx_TopRight", _rx_topright);
Debug.locals.put("Ry_TopRight", _ry_topright);
Debug.locals.put("Rx_BottomRight", _rx_bottomright);
Debug.locals.put("Ry_BottomRight", _ry_bottomright);
Debug.locals.put("Rx_BottomLeft", _rx_bottomleft);
Debug.locals.put("Ry_BottomLeft", _ry_bottomleft);
 BA.debugLineNum = 88;BA.debugLine="Sub setCornerRadii(v As View, Rx_TopLeft As Float,";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="Dim jo As JavaObject = v.Background";
Debug.ShouldStop(16777216);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(_v.runMethod(false,"getBackground"));Debug.locals.put("jo", _jo);
 BA.debugLineNum = 91;BA.debugLine="jo.RunMethod(\"setCornerRadii\", Array As Object(A";
Debug.ShouldStop(67108864);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setCornerRadii")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createNewArray("float",new int[] {8},new Object[] {_rx_topleft,_ry_topleft,_rx_topright,_ry_topright,_rx_bottomright,_ry_bottomright,_rx_bottomleft,_ry_bottomleft}))})));
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}