package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class fileutil_subs_0 {


public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (fileutil) ","fileutil",24,fileutil.processBA,fileutil.mostCurrent,13);
if (RapidSub.canDelegate("service_create")) return b4a.example.fileutil.remoteMe.runUserSub(false, "fileutil","service_create");
 BA.debugLineNum = 13;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(4096);
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (fileutil) ","fileutil",24,fileutil.processBA,fileutil.mostCurrent,22);
if (RapidSub.canDelegate("service_destroy")) return b4a.example.fileutil.remoteMe.runUserSub(false, "fileutil","service_destroy");
 BA.debugLineNum = 22;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(2097152);
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
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (fileutil) ","fileutil",24,fileutil.processBA,fileutil.mostCurrent,17);
if (RapidSub.canDelegate("service_start")) return b4a.example.fileutil.remoteMe.runUserSub(false, "fileutil","service_start", _startingintent);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 17;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 19;BA.debugLine="Service.StopAutomaticForeground 'Call this when t";
Debug.ShouldStop(262144);
fileutil.mostCurrent._service.runVoidMethod ("StopAutomaticForeground");
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}