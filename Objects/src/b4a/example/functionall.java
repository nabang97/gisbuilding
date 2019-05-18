package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class functionall {
private static functionall mostCurrent = new functionall();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _ids = "";
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.officedetail _officedetail = null;
public b4a.example.searchbuilding _searchbuilding = null;
public b4a.example.educationaldetail _educationaldetail = null;
public b4a.example.healthdetail _healthdetail = null;
public b4a.example.housedetail _housedetail = null;
public b4a.example.msmedetail _msmedetail = null;
public b4a.example.worshipdetail _worshipdetail = null;
public b4a.example.manualposition _manualposition = null;
public b4a.example.home _home = null;
public b4a.example.homeadmin _homeadmin = null;
public b4a.example.login _login = null;
public b4a.example.addfacilitytype _addfacilitytype = null;
public b4a.example.editbuildingfacility _editbuildingfacility = null;
public b4a.example.addbuildingfacility _addbuildingfacility = null;
public b4a.example.officeedit _officeedit = null;
public b4a.example.msmebuilding _msmebuilding = null;
public b4a.example.worshipbuilding _worshipbuilding = null;
public b4a.example.addphoto _addphoto = null;
public b4a.example.loaderimage _loaderimage = null;
public b4a.example.maincamera _maincamera = null;
public b4a.example.fileutil _fileutil = null;
public b4a.example.showimage _showimage = null;
public b4a.example.browsegallery _browsegallery = null;
public b4a.example.educationaledit _educationaledit = null;
public b4a.example.housebuilding _housebuilding = null;
public b4a.example.worshipedit _worshipedit = null;
public b4a.example.healthbuilding _healthbuilding = null;
public b4a.example.gallery _gallery = null;
public b4a.example.officebuilding _officebuilding = null;
public b4a.example.educationalbuilding _educationalbuilding = null;
public b4a.example.msmeedit _msmeedit = null;
public b4a.example.buildinglist _buildinglist = null;
public b4a.example.help _help = null;
public b4a.example.healthedit _healthedit = null;
public b4a.example.searchworship _searchworship = null;
public b4a.example.multipartpost _multipartpost = null;
public static String  _setanimation(anywheresoftware.b4a.BA _ba,String _inanimation,String _outanimation) throws Exception{
RDebugUtils.currentModule="functionall";
if (Debug.shouldDelegate(null, "setanimation"))
	return (String) Debug.delegate(null, "setanimation", new Object[] {_ba,_inanimation,_outanimation});
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
String _package = "";
int _in = 0;
int _out = 0;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Dim package As String";
_package = "";
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Dim in, out As Int";
_in = 0;
_out = 0;
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
_package = BA.ObjectToString(_r.GetStaticField("anywheresoftware.b4a.BA","packageName"));
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="in = r.GetStaticField(package & \".R$anim\", InAnim";
_in = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_inanimation)));
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
_out = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_outanimation)));
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="r.Target = r.GetActivity";
_r.Target = (Object)(_r.GetActivity((_ba.processBA == null ? _ba : _ba.processBA)));
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
_r.RunMethod4("overridePendingTransition",new Object[]{(Object)(_in),(Object)(_out)},new String[]{"java.lang.int","java.lang.int"});
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="End Sub";
return "";
}
public static String  _checkbuilding_id(anywheresoftware.b4a.BA _ba,String _id) throws Exception{
RDebugUtils.currentModule="functionall";
if (Debug.shouldDelegate(null, "checkbuilding_id"))
	return (String) Debug.delegate(null, "checkbuilding_id", new Object[] {_ba,_id});
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub CheckBuilding_id (id As String)";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="If id.Length > 0 Then";
if (_id.length()>0) { 
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="ids = id";
_ids = _id;
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Log(ids)";
anywheresoftware.b4a.keywords.Common.Log(_ids);
 }else 
{RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="Else If	SearchBuilding.idBuilding.Length > 0 Then";
if (mostCurrent._searchbuilding._idbuilding.length()>0) { 
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="ids = SearchBuilding.idBuilding";
_ids = mostCurrent._searchbuilding._idbuilding;
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="Log(ids)";
anywheresoftware.b4a.keywords.Common.Log(_ids);
 }else {
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="Msgbox (\"Please press on the button and choose a";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please press on the button and choose an item"),BA.ObjectToCharSequence("Error"),_ba);
 }}
;
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="End Sub";
return "";
}
public static String  _setcornerradii(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _v,float _rx_topleft,float _ry_topleft,float _rx_topright,float _ry_topright,float _rx_bottomright,float _ry_bottomright,float _rx_bottomleft,float _ry_bottomleft) throws Exception{
RDebugUtils.currentModule="functionall";
if (Debug.shouldDelegate(null, "setcornerradii"))
	return (String) Debug.delegate(null, "setcornerradii", new Object[] {_ba,_v,_rx_topleft,_ry_topleft,_rx_topright,_ry_topright,_rx_bottomright,_ry_bottomright,_rx_bottomleft,_ry_bottomleft});
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub setCornerRadii(v As View, Rx_TopLeft As Float,";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim jo As JavaObject = v.Background";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_v.getBackground()));
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="jo.RunMethod(\"setCornerRadii\", Array As Object(A";
_jo.RunMethod("setCornerRadii",new Object[]{(Object)(new float[]{_rx_topleft,_ry_topleft,_rx_topright,_ry_topright,_rx_bottomright,_ry_bottomright,_rx_bottomleft,_ry_bottomleft})});
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="End Sub";
return "";
}
public static String  _executeremotequery(anywheresoftware.b4a.BA _ba,String _query,String _jobname,Object _objek) throws Exception{
RDebugUtils.currentModule="functionall";
if (Debug.shouldDelegate(null, "executeremotequery"))
	return (String) Debug.delegate(null, "executeremotequery", new Object[] {_ba,_query,_jobname,_objek});
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Job.Initialize(JobName,Objek)";
_job._initialize((_ba.processBA == null ? _ba : _ba.processBA),_jobname,_objek);
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
_job._poststring(""+mostCurrent._main._server+"mobile/json.php",_query);
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="End Sub";
return "";
}
public static String  _setborderdrawable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _v,int _fillcolor,int _strokecolor,float _rx,float _ry,float _swidth,int _padding) throws Exception{
RDebugUtils.currentModule="functionall";
if (Debug.shouldDelegate(null, "setborderdrawable"))
	return (String) Debug.delegate(null, "setborderdrawable", new Object[] {_ba,_v,_fillcolor,_strokecolor,_rx,_ry,_swidth,_padding});
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bm = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bmd = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cnv = null;
float _l = 0f;
float _t = 0f;
float _r = 0f;
float _b = 0f;
anywheresoftware.b4j.object.JavaObject _rect1 = null;
anywheresoftware.b4j.object.JavaObject _ps = null;
anywheresoftware.b4j.object.JavaObject _paint = null;
anywheresoftware.b4j.object.JavaObject _paint1 = null;
anywheresoftware.b4j.object.JavaObject _cnvjo = null;
anywheresoftware.b4j.object.JavaObject _vjo = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub SetBorderDrawable (V As View, FillColor As Int";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Dim BM As Bitmap";
_bm = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Dim BMD As BitmapDrawable";
_bmd = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="Dim Cnv As Canvas";
_cnv = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="BM.InitializeMutable(V.Width,V.Height)";
_bm.InitializeMutable(_v.getWidth(),_v.getHeight());
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="Cnv.Initialize2(BM)";
_cnv.Initialize2((android.graphics.Bitmap)(_bm.getObject()));
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="Dim l,t,r,b As Float";
_l = 0f;
_t = 0f;
_r = 0f;
_b = 0f;
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="l = 0";
_l = (float) (0);
RDebugUtils.currentLine=2686987;
 //BA.debugLineNum = 2686987;BA.debugLine="t = 0";
_t = (float) (0);
RDebugUtils.currentLine=2686988;
 //BA.debugLineNum = 2686988;BA.debugLine="r = V.Width";
_r = (float) (_v.getWidth());
RDebugUtils.currentLine=2686989;
 //BA.debugLineNum = 2686989;BA.debugLine="b = V.Height";
_b = (float) (_v.getHeight());
RDebugUtils.currentLine=2686991;
 //BA.debugLineNum = 2686991;BA.debugLine="Dim rect1 As JavaObject";
_rect1 = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=2686992;
 //BA.debugLineNum = 2686992;BA.debugLine="rect1.InitializeNewInstance(\"android.graphics.Rec";
_rect1.InitializeNewInstance("android.graphics.RectF",new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)});
RDebugUtils.currentLine=2686994;
 //BA.debugLineNum = 2686994;BA.debugLine="Dim PS As JavaObject";
_ps = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=2686995;
 //BA.debugLineNum = 2686995;BA.debugLine="PS.InitializeStatic(\"android.graphics.Paint.Style";
_ps.InitializeStatic("android.graphics.Paint.Style");
RDebugUtils.currentLine=2686997;
 //BA.debugLineNum = 2686997;BA.debugLine="Dim Paint,Paint1 As JavaObject";
_paint = new anywheresoftware.b4j.object.JavaObject();
_paint1 = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=2686998;
 //BA.debugLineNum = 2686998;BA.debugLine="Paint.InitializeNewInstance(\"android.graphics.Pai";
_paint.InitializeNewInstance("android.graphics.Paint",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=2686999;
 //BA.debugLineNum = 2686999;BA.debugLine="Paint.RunMethod(\"setStrokeWidth\",Array As Object(";
_paint.RunMethod("setStrokeWidth",new Object[]{(Object)(_swidth)});
RDebugUtils.currentLine=2687000;
 //BA.debugLineNum = 2687000;BA.debugLine="Paint.RunMethod(\"setColor\",Array As Object(Stroke";
_paint.RunMethod("setColor",new Object[]{(Object)(_strokecolor)});
RDebugUtils.currentLine=2687001;
 //BA.debugLineNum = 2687001;BA.debugLine="Paint.RunMethod(\"setStyle\",Array As Object(PS.Get";
_paint.RunMethod("setStyle",new Object[]{_ps.GetField("STROKE")});
RDebugUtils.currentLine=2687002;
 //BA.debugLineNum = 2687002;BA.debugLine="Paint.RunMethod(\"setAntiAlias\",Array As Object(Tr";
_paint.RunMethod("setAntiAlias",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.True)});
RDebugUtils.currentLine=2687004;
 //BA.debugLineNum = 2687004;BA.debugLine="Paint1.InitializeNewInstance(\"android.graphics.Pa";
_paint1.InitializeNewInstance("android.graphics.Paint",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=2687005;
 //BA.debugLineNum = 2687005;BA.debugLine="Paint1.RunMethod(\"setColor\",Array As Object(FillC";
_paint1.RunMethod("setColor",new Object[]{(Object)(_fillcolor)});
RDebugUtils.currentLine=2687006;
 //BA.debugLineNum = 2687006;BA.debugLine="Paint1.RunMethod(\"setAntiAlias\",Array As Object(T";
_paint1.RunMethod("setAntiAlias",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.True)});
RDebugUtils.currentLine=2687007;
 //BA.debugLineNum = 2687007;BA.debugLine="Paint1.RunMethod(\"setStyle\",Array As Object(PS.Ge";
_paint1.RunMethod("setStyle",new Object[]{_ps.GetField("FILL")});
RDebugUtils.currentLine=2687010;
 //BA.debugLineNum = 2687010;BA.debugLine="Dim CnvJO As JavaObject = Cnv";
_cnvjo = new anywheresoftware.b4j.object.JavaObject();
_cnvjo.setObject((java.lang.Object)(_cnv));
RDebugUtils.currentLine=2687011;
 //BA.debugLineNum = 2687011;BA.debugLine="CnvJO = CnvJO.GetField(\"canvas\")";
_cnvjo.setObject((java.lang.Object)(_cnvjo.GetField("canvas")));
RDebugUtils.currentLine=2687013;
 //BA.debugLineNum = 2687013;BA.debugLine="CnvJO.RunMethod(\"drawRoundRect\",Array As Object(r";
_cnvjo.RunMethod("drawRoundRect",new Object[]{(Object)(_rect1.getObject()),(Object)(_rx),(Object)(_ry),(Object)(_paint1.getObject())});
RDebugUtils.currentLine=2687015;
 //BA.debugLineNum = 2687015;BA.debugLine="CnvJO.RunMethod(\"drawRoundRect\",Array As Object(r";
_cnvjo.RunMethod("drawRoundRect",new Object[]{(Object)(_rect1.getObject()),(Object)(_rx),(Object)(_ry),(Object)(_paint.getObject())});
RDebugUtils.currentLine=2687017;
 //BA.debugLineNum = 2687017;BA.debugLine="BMD.Initialize(BM)";
_bmd.Initialize((android.graphics.Bitmap)(_bm.getObject()));
RDebugUtils.currentLine=2687018;
 //BA.debugLineNum = 2687018;BA.debugLine="If Padding <> -1 And GetType(V) = \"android.widget";
if (_padding!=-1 && (anywheresoftware.b4a.keywords.Common.GetType((Object)(_v.getObject()))).equals("android.widget.TextView")) { 
RDebugUtils.currentLine=2687019;
 //BA.debugLineNum = 2687019;BA.debugLine="Dim VJO As JavaObject = V";
_vjo = new anywheresoftware.b4j.object.JavaObject();
_vjo.setObject((java.lang.Object)(_v.getObject()));
RDebugUtils.currentLine=2687020;
 //BA.debugLineNum = 2687020;BA.debugLine="VJO.RunMethod(\"setPadding\",Array As Object(Paddi";
_vjo.RunMethod("setPadding",new Object[]{(Object)(_padding),(Object)(_padding),(Object)(_padding),(Object)(_padding)});
 };
RDebugUtils.currentLine=2687023;
 //BA.debugLineNum = 2687023;BA.debugLine="V.Background = BMD";
_v.setBackground((android.graphics.drawable.Drawable)(_bmd.getObject()));
RDebugUtils.currentLine=2687024;
 //BA.debugLineNum = 2687024;BA.debugLine="End Sub";
return "";
}
}