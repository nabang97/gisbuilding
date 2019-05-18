package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class starter_subs_0 {


public static RemoteObject  _activityispaused() throws Exception{
try {
		Debug.PushSubsStack("ActivityIsPaused (starter) ","starter",1,starter.processBA,starter.mostCurrent,113);
if (RapidSub.canDelegate("activityispaused")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","activityispaused");
 BA.debugLineNum = 113;BA.debugLine="Sub ActivityIsPaused";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="tasks.Clear";
Debug.ShouldStop(131072);
starter._tasks.runVoidMethod ("Clear");
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (starter) ","starter",1,starter.processBA,starter.mostCurrent,118);
if (RapidSub.canDelegate("application_error")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","application_error", _error, _stacktrace);
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 118;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="Return True";
Debug.ShouldStop(4194304);
if (true) return starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _download(RemoteObject _imageviewsmap) throws Exception{
try {
		Debug.PushSubsStack("Download (starter) ","starter",1,starter.processBA,starter.mostCurrent,77);
if (RapidSub.canDelegate("download")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","download", _imageviewsmap);
int _i = 0;
RemoteObject _link = RemoteObject.createImmutable("");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("ImageViewsMap", _imageviewsmap);
 BA.debugLineNum = 77;BA.debugLine="Sub Download (ImageViewsMap As Map)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="For i = 0 To ImageViewsMap.Size - 1";
Debug.ShouldStop(8192);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {_imageviewsmap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 79;BA.debugLine="tasks.Put(ImageViewsMap.GetKeyAt(i), ImageViewsM";
Debug.ShouldStop(16384);
starter._tasks.runVoidMethod ("Put",(Object)(_imageviewsmap.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),(Object)(_imageviewsmap.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 80;BA.debugLine="Dim link As String = ImageViewsMap.GetValueAt(i)";
Debug.ShouldStop(32768);
_link = BA.ObjectToString(_imageviewsmap.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("link", _link);Debug.locals.put("link", _link);
 BA.debugLineNum = 81;BA.debugLine="If cache.ContainsKey(link) Then";
Debug.ShouldStop(65536);
if (starter._cache.runMethod(true,"ContainsKey",(Object)((_link))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 82;BA.debugLine="Dim iv As ImageView = ImageViewsMap.GetKeyAt(i)";
Debug.ShouldStop(131072);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_iv.setObject(_imageviewsmap.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("iv", _iv);
 BA.debugLineNum = 83;BA.debugLine="iv.SetBackgroundImage(cache.Get(link))";
Debug.ShouldStop(262144);
_iv.runVoidMethod ("SetBackgroundImageNew",(Object)((starter._cache.runMethod(false,"Get",(Object)((_link))))));
 }else 
{ BA.debugLineNum = 84;BA.debugLine="Else If ongoingTasks.ContainsKey(link) = False T";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",starter._ongoingtasks.runMethod(true,"ContainsKey",(Object)((_link))),starter.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 85;BA.debugLine="ongoingTasks.Put(link, \"\")";
Debug.ShouldStop(1048576);
starter._ongoingtasks.runVoidMethod ("Put",(Object)((_link)),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 86;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(2097152);
_j = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 87;BA.debugLine="j.Initialize(link, Me)";
Debug.ShouldStop(4194304);
_j.runVoidMethod ("_initialize",starter.processBA,(Object)(_link),(Object)(starter.getObject()));
 BA.debugLineNum = 88;BA.debugLine="j.Download(link)";
Debug.ShouldStop(8388608);
_j.runVoidMethod ("_download",(Object)(_link));
 }}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gps_gpsstatus(RemoteObject _satellites) throws Exception{
try {
		Debug.PushSubsStack("GPS_GpsStatus (starter) ","starter",1,starter.processBA,starter.mostCurrent,60);
if (RapidSub.canDelegate("gps_gpsstatus")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","gps_gpsstatus", _satellites);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _satellite = RemoteObject.declareNull("anywheresoftware.b4a.gps.GpsSatelliteWrapper");
RemoteObject _lblsatellites = RemoteObject.createImmutable("");
Debug.locals.put("Satellites", _satellites);
 BA.debugLineNum = 60;BA.debugLine="Sub GPS_GpsStatus (Satellites As List)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 62;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(536870912);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 63;BA.debugLine="sb.Initialize";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 64;BA.debugLine="sb.Append(\"Satellites:\").Append(CRLF)";
Debug.ShouldStop(-2147483648);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Satellites:"))).runVoidMethod ("Append",(Object)(starter.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 65;BA.debugLine="For i = 0 To Satellites.Size - 1";
Debug.ShouldStop(1);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_satellites.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 66;BA.debugLine="Dim Satellite As GPSSatellite = Satellites.Get(i";
Debug.ShouldStop(2);
_satellite = RemoteObject.createNew ("anywheresoftware.b4a.gps.GpsSatelliteWrapper");
_satellite.setObject(_satellites.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Satellite", _satellite);
 BA.debugLineNum = 67;BA.debugLine="sb.Append(CRLF).Append(Satellite.Prn).Append($\"";
Debug.ShouldStop(4);
_sb.runMethod(false,"Append",(Object)(starter.mostCurrent.__c.getField(true,"CRLF"))).runMethod(false,"Append",(Object)(BA.NumberToString(_satellite.runMethod(true,"getPrn")))).runMethod(false,"Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((_satellite.runMethod(true,"getSnr")))),RemoteObject.createImmutable(""))))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" "))).runVoidMethod ("Append",(Object)(BA.ObjectToString(_satellite.runMethod(true,"getUsedInFix"))));
 BA.debugLineNum = 68;BA.debugLine="sb.Append(\" \").Append($\" $1.2{Satellite.Azimuth}";
Debug.ShouldStop(8);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" "))).runMethod(false,"Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((_satellite.runMethod(true,"getAzimuth")))),RemoteObject.createImmutable(""))))).runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((_satellite.runMethod(true,"getElevation")))),RemoteObject.createImmutable("")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 70;BA.debugLine="Dim lblSatellites As String";
Debug.ShouldStop(32);
_lblsatellites = RemoteObject.createImmutable("");Debug.locals.put("lblSatellites", _lblsatellites);
 BA.debugLineNum = 71;BA.debugLine="lblSatellites = sb.ToString";
Debug.ShouldStop(64);
_lblsatellites = _sb.runMethod(true,"ToString");Debug.locals.put("lblSatellites", _lblsatellites);
 BA.debugLineNum = 72;BA.debugLine="Log(\"dari starter ya: \"&lblSatellites)";
Debug.ShouldStop(128);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("dari starter ya: "),_lblsatellites)));
 BA.debugLineNum = 73;BA.debugLine="CallSub2(ManualPosition, \"GpsStatus\", lblSatellit";
Debug.ShouldStop(256);
starter.mostCurrent.__c.runMethodAndSync(false,"CallSubNew2",starter.processBA,(Object)((starter.mostCurrent._manualposition.getObject())),(Object)(BA.ObjectToString("GpsStatus")),(Object)((_lblsatellites)));
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
public static RemoteObject  _gps_locationchanged(RemoteObject _location1) throws Exception{
try {
		Debug.PushSubsStack("GPS_LocationChanged (starter) ","starter",1,starter.processBA,starter.mostCurrent,49);
if (RapidSub.canDelegate("gps_locationchanged")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","gps_locationchanged", _location1);
RemoteObject _longi = RemoteObject.createImmutable("");
RemoteObject _latitu = RemoteObject.createImmutable("");
Debug.locals.put("Location1", _location1);
 BA.debugLineNum = 49;BA.debugLine="Sub GPS_LocationChanged (Location1 As Location)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="Dim Longi As String";
Debug.ShouldStop(262144);
_longi = RemoteObject.createImmutable("");Debug.locals.put("Longi", _longi);
 BA.debugLineNum = 52;BA.debugLine="Dim latitu As String";
Debug.ShouldStop(524288);
_latitu = RemoteObject.createImmutable("");Debug.locals.put("latitu", _latitu);
 BA.debugLineNum = 53;BA.debugLine="latitu =Location1.Latitude";
Debug.ShouldStop(1048576);
_latitu = BA.NumberToString(_location1.runMethod(true,"getLatitude"));Debug.locals.put("latitu", _latitu);
 BA.debugLineNum = 54;BA.debugLine="Longi =Location1.Longitude";
Debug.ShouldStop(2097152);
_longi = BA.NumberToString(_location1.runMethod(true,"getLongitude"));Debug.locals.put("Longi", _longi);
 BA.debugLineNum = 55;BA.debugLine="Log(\"dari starter: \"& latitu&\",\"&Longi)";
Debug.ShouldStop(4194304);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("dari starter: "),_latitu,RemoteObject.createImmutable(","),_longi)));
 BA.debugLineNum = 56;BA.debugLine="ToastMessageShow(\"Your current location: \"&latitu";
Debug.ShouldStop(8388608);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Your current location: "),_latitu,RemoteObject.createImmutable(","),_longi))),(Object)(starter.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 57;BA.debugLine="CallSubDelayed3(ManualPosition,\"LocationChanged\",";
Debug.ShouldStop(16777216);
starter.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",starter.processBA,(Object)((starter.mostCurrent._manualposition.getObject())),(Object)(BA.ObjectToString("LocationChanged")),(Object)((_latitu)),(Object)((_longi)));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("JobDone (starter) ","starter",1,starter.processBA,starter.mostCurrent,93);
if (RapidSub.canDelegate("jobdone")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","jobdone", _job);
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
int _i = 0;
RemoteObject _link = RemoteObject.createImmutable("");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 93;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="ongoingTasks.Remove(Job.JobName)";
Debug.ShouldStop(536870912);
starter._ongoingtasks.runVoidMethod ("Remove",(Object)((_job.getField(true,"_jobname"))));
 BA.debugLineNum = 95;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(1073741824);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 96;BA.debugLine="Dim bmp As Bitmap = Job.GetBitmap";
Debug.ShouldStop(-2147483648);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_bmp = _job.runMethod(false,"_getbitmap");Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 97;BA.debugLine="cache.Put(Job.JobName, bmp)";
Debug.ShouldStop(1);
starter._cache.runVoidMethod ("Put",(Object)((_job.getField(true,"_jobname"))),(Object)((_bmp.getObject())));
 BA.debugLineNum = 98;BA.debugLine="If tasks.IsInitialized Then";
Debug.ShouldStop(2);
if (starter._tasks.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 99;BA.debugLine="For i = 0 To tasks.Size - 1";
Debug.ShouldStop(4);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {starter._tasks.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 100;BA.debugLine="Dim link As String = tasks.GetValueAt(i)";
Debug.ShouldStop(8);
_link = BA.ObjectToString(starter._tasks.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("link", _link);Debug.locals.put("link", _link);
 BA.debugLineNum = 101;BA.debugLine="If link = Job.JobName Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_link,_job.getField(true,"_jobname"))) { 
 BA.debugLineNum = 102;BA.debugLine="Dim iv As ImageView = tasks.GetKeyAt(i)";
Debug.ShouldStop(32);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_iv.setObject(starter._tasks.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("iv", _iv);
 BA.debugLineNum = 103;BA.debugLine="iv.SetBackgroundImage(bmp)";
Debug.ShouldStop(64);
_iv.runVoidMethod ("SetBackgroundImageNew",(Object)((_bmp.getObject())));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 }else {
 BA.debugLineNum = 108;BA.debugLine="Log(\"Error downloading image: \" & Job.JobName &";
Debug.ShouldStop(2048);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error downloading image: "),_job.getField(true,"_jobname"),starter.mostCurrent.__c.getField(true,"CRLF"),_job.getField(true,"_errormessage"))));
 };
 BA.debugLineNum = 110;BA.debugLine="Job.Release";
Debug.ShouldStop(8192);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
 //BA.debugLineNum = 9;BA.debugLine="Public rp As RuntimePermissions";
starter._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 10;BA.debugLine="Public GPS1 As GPS";
starter._gps1 = RemoteObject.createNew ("anywheresoftware.b4a.gps.GPS");
 //BA.debugLineNum = 11;BA.debugLine="Private gpsStarted As Boolean";
starter._gpsstarted = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 12;BA.debugLine="Private cache As Map";
starter._cache = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 13;BA.debugLine="Private tasks As Map";
starter._tasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 14;BA.debugLine="Private ongoingTasks As Map";
starter._ongoingtasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (starter) ","starter",1,starter.processBA,starter.mostCurrent,17);
if (RapidSub.canDelegate("service_create")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_create");
 BA.debugLineNum = 17;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(65536);
 BA.debugLineNum = 20;BA.debugLine="GPS1.Initialize(\"GPS\")";
Debug.ShouldStop(524288);
starter._gps1.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("GPS")));
 BA.debugLineNum = 21;BA.debugLine="tasks.Initialize";
Debug.ShouldStop(1048576);
starter._tasks.runVoidMethod ("Initialize");
 BA.debugLineNum = 22;BA.debugLine="cache.Initialize";
Debug.ShouldStop(2097152);
starter._cache.runVoidMethod ("Initialize");
 BA.debugLineNum = 23;BA.debugLine="ongoingTasks.Initialize";
Debug.ShouldStop(4194304);
starter._ongoingtasks.runVoidMethod ("Initialize");
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
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (starter) ","starter",1,starter.processBA,starter.mostCurrent,122);
if (RapidSub.canDelegate("service_destroy")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_destroy");
 BA.debugLineNum = 122;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="StopGps";
Debug.ShouldStop(67108864);
_stopgps();
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Service_Start (starter) ","starter",1,starter.processBA,starter.mostCurrent,26);
if (RapidSub.canDelegate("service_start")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_start", _startingintent);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 26;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="If rp.Check(rp.PERMISSION_ACCESS_FINE_LOCATION) T";
Debug.ShouldStop(67108864);
if (starter._rp.runMethod(true,"Check",(Object)(starter._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION"))).<Boolean>get().booleanValue()) { 
_startgps();};
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
public static RemoteObject  _service_taskremoved() throws Exception{
try {
		Debug.PushSubsStack("Service_TaskRemoved (starter) ","starter",1,starter.processBA,starter.mostCurrent,30);
if (RapidSub.canDelegate("service_taskremoved")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_taskremoved");
 BA.debugLineNum = 30;BA.debugLine="Sub Service_TaskRemoved";
Debug.ShouldStop(536870912);
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
public static RemoteObject  _startgps() throws Exception{
try {
		Debug.PushSubsStack("StartGps (starter) ","starter",1,starter.processBA,starter.mostCurrent,34);
if (RapidSub.canDelegate("startgps")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","startgps");
 BA.debugLineNum = 34;BA.debugLine="Public Sub StartGps";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Log(\"GPS STAR\")";
Debug.ShouldStop(4);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("GPS STAR")));
 BA.debugLineNum = 36;BA.debugLine="If gpsStarted = False Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",starter._gpsstarted,starter.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 37;BA.debugLine="GPS1.Start(0, 0)";
Debug.ShouldStop(16);
starter._gps1.runVoidMethodAndSync ("Start",starter.processBA,(Object)(BA.numberCast(long.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 38;BA.debugLine="gpsStarted = True";
Debug.ShouldStop(32);
starter._gpsstarted = starter.mostCurrent.__c.getField(true,"True");
 };
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
public static RemoteObject  _stopgps() throws Exception{
try {
		Debug.PushSubsStack("StopGps (starter) ","starter",1,starter.processBA,starter.mostCurrent,42);
if (RapidSub.canDelegate("stopgps")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","stopgps");
 BA.debugLineNum = 42;BA.debugLine="Public Sub StopGps";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="If gpsStarted Then";
Debug.ShouldStop(1024);
if (starter._gpsstarted.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 44;BA.debugLine="GPS1.Stop";
Debug.ShouldStop(2048);
starter._gps1.runVoidMethod ("Stop");
 BA.debugLineNum = 45;BA.debugLine="gpsStarted = False";
Debug.ShouldStop(4096);
starter._gpsstarted = starter.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}