package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class browsegallery_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (browsegallery) ","browsegallery",26,browsegallery.mostCurrent.activityBA,browsegallery.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) return b4a.example.browsegallery.remoteMe.runUserSub(false, "browsegallery","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="cc.Initialize(\"cc\")";
Debug.ShouldStop(262144);
browsegallery._cc.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("cc")));
 BA.debugLineNum = 20;BA.debugLine="cc.Show(\"image/*\", \"\")";
Debug.ShouldStop(524288);
browsegallery._cc.runVoidMethod ("Show",browsegallery.processBA,(Object)(BA.ObjectToString("image/*")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Activity_Pause (browsegallery) ","browsegallery",26,browsegallery.mostCurrent.activityBA,browsegallery.mostCurrent,38);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.browsegallery.remoteMe.runUserSub(false, "browsegallery","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Activity_Resume (browsegallery) ","browsegallery",26,browsegallery.mostCurrent.activityBA,browsegallery.mostCurrent,35);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.browsegallery.remoteMe.runUserSub(false, "browsegallery","activity_resume");
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
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
public static RemoteObject  _cc_result(RemoteObject _success,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("CC_Result (browsegallery) ","browsegallery",26,browsegallery.mostCurrent.activityBA,browsegallery.mostCurrent,23);
if (RapidSub.canDelegate("cc_result")) return b4a.example.browsegallery.remoteMe.runUserSub(false, "browsegallery","cc_result", _success, _dir, _filename);
Debug.locals.put("Success", _success);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 23;BA.debugLine="Sub CC_Result (Success As Boolean, Dir As String,";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="If Success Then";
Debug.ShouldStop(8388608);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 25;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 26;BA.debugLine="rp.GetSafeDirDefaultExternal(\"\")";
Debug.ShouldStop(33554432);
browsegallery._rp.runVoidMethod ("GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 27;BA.debugLine="File.Copy(Dir ,FileName,File.DirInternal ,\"myfi";
Debug.ShouldStop(67108864);
browsegallery.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(_dir),(Object)(_filename),(Object)(browsegallery.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("myfilename.jpg")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",browsegallery.processBA, e6.toString()); BA.debugLineNum = 29;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(268435456);
browsegallery.mostCurrent.__c.runVoidMethod ("Log",(Object)(browsegallery.mostCurrent.__c.runMethod(false,"LastException",browsegallery.mostCurrent.activityBA).runMethod(true,"getMessage")));
 };
 };
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private image As ImageView";
browsegallery.mostCurrent._image = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim cc As ContentChooser";
browsegallery._cc = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.ContentChooser");
 //BA.debugLineNum = 10;BA.debugLine="Private rp As RuntimePermissions";
browsegallery._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 11;BA.debugLine="Private mBmp As Bitmap";
browsegallery._mbmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}