package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class loaderimage_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (loaderimage) ","loaderimage",22,loaderimage.mostCurrent.activityBA,loaderimage.mostCurrent,17);
if (RapidSub.canDelegate("activity_create")) return b4a.example.loaderimage.remoteMe.runUserSub(false, "loaderimage","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 17;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="Activity.LoadLayout(\"LoaderImage\")";
Debug.ShouldStop(131072);
loaderimage.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LoaderImage")),loaderimage.mostCurrent.activityBA);
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (loaderimage) ","loaderimage",22,loaderimage.mostCurrent.activityBA,loaderimage.mostCurrent,26);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.loaderimage.remoteMe.runUserSub(false, "loaderimage","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Pause(UserClosed As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="CallSub(Starter, \"ActivityIsPaused\")";
Debug.ShouldStop(67108864);
loaderimage.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",loaderimage.processBA,(Object)((loaderimage.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("ActivityIsPaused")));
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (loaderimage) ","loaderimage",22,loaderimage.mostCurrent.activityBA,loaderimage.mostCurrent,21);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.loaderimage.remoteMe.runUserSub(false, "loaderimage","activity_resume");
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="clv.Clear";
Debug.ShouldStop(2097152);
loaderimage.mostCurrent._clv.runVoidMethod ("_clear");
 BA.debugLineNum = 23;BA.debugLine="ExecuteRemoteQuery(\"SELECT photo_url, upload_date";
Debug.ShouldStop(4194304);
_executeremotequery(BA.ObjectToString("SELECT photo_url, upload_date FROM house_building_gallery WHERE house_building_id='KG048'"),RemoteObject.createImmutable("Download"));
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
public static RemoteObject  _clv_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("clv_ItemClick (loaderimage) ","loaderimage",22,loaderimage.mostCurrent.activityBA,loaderimage.mostCurrent,72);
if (RapidSub.canDelegate("clv_itemclick")) return b4a.example.loaderimage.remoteMe.runUserSub(false, "loaderimage","clv_itemclick", _index, _value);
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 72;BA.debugLine="Sub clv_ItemClick (Index As Int, Value As Object)";
Debug.ShouldStop(128);
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executeremotequery(RemoteObject _query,RemoteObject _jobname) throws Exception{
try {
		Debug.PushSubsStack("ExecuteRemoteQuery (loaderimage) ","loaderimage",22,loaderimage.mostCurrent.activityBA,loaderimage.mostCurrent,29);
if (RapidSub.canDelegate("executeremotequery")) return b4a.example.loaderimage.remoteMe.runUserSub(false, "loaderimage","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 29;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(536870912);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 31;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(1073741824);
_job.runVoidMethod ("_initialize",loaderimage.processBA,(Object)(_jobname),(Object)(loaderimage.getObject()));
 BA.debugLineNum = 32;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
Debug.ShouldStop(-2147483648);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),loaderimage.mostCurrent._main._server,RemoteObject.createImmutable("mobile/json.php"))),(Object)(_query));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 11;BA.debugLine="Dim clv As CustomListView";
loaderimage.mostCurrent._clv = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 12;BA.debugLine="Dim Label1 As Label";
loaderimage.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Dim ImageView1 As ImageView";
loaderimage.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Dim ImageViews As List";
loaderimage.mostCurrent._imageviews = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imageview1_click() throws Exception{
try {
		Debug.PushSubsStack("ImageView1_Click (loaderimage) ","loaderimage",22,loaderimage.mostCurrent.activityBA,loaderimage.mostCurrent,76);
if (RapidSub.canDelegate("imageview1_click")) return b4a.example.loaderimage.remoteMe.runUserSub(false, "loaderimage","imageview1_click");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _bd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 76;BA.debugLine="Sub ImageView1_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="Dim iv As ImageView";
Debug.ShouldStop(4096);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 78;BA.debugLine="iv = Sender";
Debug.ShouldStop(8192);
_iv.setObject(loaderimage.mostCurrent.__c.runMethod(false,"Sender",loaderimage.mostCurrent.activityBA));
 BA.debugLineNum = 79;BA.debugLine="If iv.Background Is BitmapDrawable Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("i",_iv.runMethod(false,"getBackground"), RemoteObject.createImmutable("android.graphics.drawable.BitmapDrawable"))) { 
 BA.debugLineNum = 81;BA.debugLine="Dim bd As BitmapDrawable";
Debug.ShouldStop(65536);
_bd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bd", _bd);
 BA.debugLineNum = 82;BA.debugLine="bd = iv.Background";
Debug.ShouldStop(131072);
_bd.setObject(_iv.runMethod(false,"getBackground"));
 BA.debugLineNum = 83;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(262144);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 84;BA.debugLine="bmp = bd.Bitmap";
Debug.ShouldStop(524288);
_bmp.setObject(_bd.runMethod(false,"getBitmap"));
 BA.debugLineNum = 85;BA.debugLine="CallSubDelayed2(ShowImage, \"Show\", bmp)";
Debug.ShouldStop(1048576);
loaderimage.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",loaderimage.processBA,(Object)((loaderimage.mostCurrent._showimage.getObject())),(Object)(BA.ObjectToString("Show")),(Object)((_bmp)));
 };
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("Jobdone (loaderimage) ","loaderimage",22,loaderimage.mostCurrent.activityBA,loaderimage.mostCurrent,35);
if (RapidSub.canDelegate("jobdone")) return b4a.example.loaderimage.remoteMe.runUserSub(false, "loaderimage","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _agn = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _w = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _image = RemoteObject.createImmutable("");
RemoteObject _gambar = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 35;BA.debugLine="Sub Jobdone (Job As HttpJob)";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8);
loaderimage.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 37;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(16);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 38;BA.debugLine="Dim res As String";
Debug.ShouldStop(32);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 39;BA.debugLine="res= Job.GetString";
Debug.ShouldStop(64);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 40;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(128);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 41;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(256);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 42;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(512);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("Download"))) {
case 0: {
 BA.debugLineNum = 45;BA.debugLine="Dim agn As List";
Debug.ShouldStop(4096);
_agn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 46;BA.debugLine="agn=parser.NextArray";
Debug.ShouldStop(8192);
_agn = _parser.runMethod(false,"NextArray");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 47;BA.debugLine="If agn.Size - 1 < 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 48;BA.debugLine="Log(agn.Size)";
Debug.ShouldStop(32768);
loaderimage.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_agn.runMethod(true,"getSize"))));
 BA.debugLineNum = 49;BA.debugLine="Msgbox(\"Galery Foto tidak ditemukan\", \"Peringa";
Debug.ShouldStop(65536);
loaderimage.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Galery Foto tidak ditemukan")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Peringatan"))),loaderimage.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 51;BA.debugLine="For i=0 To agn.Size-1";
Debug.ShouldStop(262144);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 52;BA.debugLine="Dim w As Map";
Debug.ShouldStop(524288);
_w = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("w", _w);
 BA.debugLineNum = 53;BA.debugLine="w=agn.Get(i)";
Debug.ShouldStop(1048576);
_w.setObject(_agn.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 54;BA.debugLine="Dim image = w.Get(\"photo_url\") As String";
Debug.ShouldStop(2097152);
_image = BA.ObjectToString(_w.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_url")))));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 55;BA.debugLine="Dim gambar = \"\"&Main.Server&\"Files/Worship/i";
Debug.ShouldStop(4194304);
_gambar = RemoteObject.concat(RemoteObject.createImmutable(""),loaderimage.mostCurrent._main._server,RemoteObject.createImmutable("Files/Worship/img/"),_image);Debug.locals.put("gambar", _gambar);Debug.locals.put("gambar", _gambar);
 BA.debugLineNum = 56;BA.debugLine="Dim m As Map";
Debug.ShouldStop(8388608);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 57;BA.debugLine="m.Initialize";
Debug.ShouldStop(16777216);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 58;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(33554432);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 59;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(67108864);
_p.runVoidMethod ("Initialize",loaderimage.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 60;BA.debugLine="p.SetLayout(0,0,100%x,20%y)";
Debug.ShouldStop(134217728);
_p.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(loaderimage.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),loaderimage.mostCurrent.activityBA)),(Object)(loaderimage.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),loaderimage.mostCurrent.activityBA)));
 BA.debugLineNum = 61;BA.debugLine="p.LoadLayout(\"listitem-image\")";
Debug.ShouldStop(268435456);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("listitem-image")),loaderimage.mostCurrent.activityBA);
 BA.debugLineNum = 62;BA.debugLine="clv.Add(p,m)";
Debug.ShouldStop(536870912);
loaderimage.mostCurrent._clv.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()),(Object)((_m.getObject())));
 BA.debugLineNum = 63;BA.debugLine="m.Put(ImageView1, gambar)";
Debug.ShouldStop(1073741824);
_m.runVoidMethod ("Put",(Object)((loaderimage.mostCurrent._imageview1.getObject())),(Object)((_gambar)));
 BA.debugLineNum = 64;BA.debugLine="Log (gambar)";
Debug.ShouldStop(-2147483648);
loaderimage.mostCurrent.__c.runVoidMethod ("Log",(Object)(_gambar));
 BA.debugLineNum = 65;BA.debugLine="CallSubDelayed2(Starter, \"Download\", m)";
Debug.ShouldStop(1);
loaderimage.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",loaderimage.processBA,(Object)((loaderimage.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_m)));
 }
}Debug.locals.put("i", _i);
;
 };
 break; }
}
;
 };
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private links As List";
loaderimage._links = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}