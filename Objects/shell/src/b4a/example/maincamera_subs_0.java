package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class maincamera_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (maincamera) ","maincamera",23,maincamera.mostCurrent.activityBA,maincamera.mostCurrent,42);
if (RapidSub.canDelegate("activity_create")) return b4a.example.maincamera.remoteMe.runUserSub(false, "maincamera","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="VideoFileDir = rp.GetSafeDirDefaultExternal(\"temp";
Debug.ShouldStop(2048);
maincamera._videofiledir = maincamera._rp.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("temp")));
 BA.debugLineNum = 45;BA.debugLine="Activity.LoadLayout(\"1\")";
Debug.ShouldStop(4096);
maincamera.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("1")),maincamera.mostCurrent.activityBA);
 BA.debugLineNum = 46;BA.debugLine="Activity.LoadLayout(\"StillPicture\")";
Debug.ShouldStop(8192);
maincamera.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("StillPicture")),maincamera.mostCurrent.activityBA);
 BA.debugLineNum = 47;BA.debugLine="cam.Initialize(pnlCamera)";
Debug.ShouldStop(16384);
maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_initialize",maincamera.mostCurrent.activityBA,(Object)(maincamera.mostCurrent._pnlcamera));
 BA.debugLineNum = 48;BA.debugLine="Log(cam.SupportedHardwareLevel)";
Debug.ShouldStop(32768);
maincamera.mostCurrent.__c.runVoidMethod ("Log",(Object)(maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_getsupportedhardwarelevel")));
 BA.debugLineNum = 49;BA.debugLine="buttons = Array(btnScene, btnAutoExposure, btnEff";
Debug.ShouldStop(65536);
maincamera.mostCurrent._buttons = maincamera.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(maincamera.mostCurrent._btnscene.getObject()),(maincamera.mostCurrent._btnautoexposure.getObject()),(maincamera.mostCurrent._btneffects.getObject()),(maincamera.mostCurrent._btnfocus.getObject()),(maincamera.mostCurrent._btnmode.getObject())})));
 BA.debugLineNum = 50;BA.debugLine="SetState(False, False, VideoMode)";
Debug.ShouldStop(131072);
_setstate(maincamera.mostCurrent.__c.getField(true,"False"),maincamera.mostCurrent.__c.getField(true,"False"),maincamera._videomode);
 BA.debugLineNum = 52;BA.debugLine="If Home.HomeBuilding.Length > 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",maincamera.mostCurrent._home._homebuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 53;BA.debugLine="Log(Home.HomeBuilding)";
Debug.ShouldStop(1048576);
maincamera.mostCurrent.__c.runVoidMethod ("Log",(Object)(maincamera.mostCurrent._home._homebuilding));
 BA.debugLineNum = 54;BA.debugLine="Select Home.HomeBuilding";
Debug.ShouldStop(2097152);
switch (BA.switchObjectToInt(maincamera.mostCurrent._home._homebuilding,BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Health"),BA.ObjectToString("Msme"),BA.ObjectToString("Educational"))) {
case 0: {
 BA.debugLineNum = 56;BA.debugLine="If WorshipBuilding.idBuilding.Length > 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",maincamera.mostCurrent._worshipbuilding._idbuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 57;BA.debugLine="idBuilding= WorshipBuilding.idBuilding";
Debug.ShouldStop(16777216);
maincamera.mostCurrent._idbuilding = maincamera.mostCurrent._worshipbuilding._idbuilding;
 BA.debugLineNum = 58;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(33554432);
maincamera.mostCurrent.__c.runVoidMethod ("Log",(Object)(maincamera.mostCurrent._idbuilding));
 }else {
 BA.debugLineNum = 60;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(134217728);
maincamera.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),maincamera.mostCurrent.activityBA);
 BA.debugLineNum = 61;BA.debugLine="Activity.Finish";
Debug.ShouldStop(268435456);
maincamera.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
case 1: {
 BA.debugLineNum = 64;BA.debugLine="If OfficeBuilding.idBuilding.Length > 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",maincamera.mostCurrent._officebuilding._idbuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 65;BA.debugLine="idBuilding= OfficeBuilding.idBuilding";
Debug.ShouldStop(1);
maincamera.mostCurrent._idbuilding = maincamera.mostCurrent._officebuilding._idbuilding;
 BA.debugLineNum = 66;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(2);
maincamera.mostCurrent.__c.runVoidMethod ("Log",(Object)(maincamera.mostCurrent._idbuilding));
 }else {
 BA.debugLineNum = 68;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(8);
maincamera.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),maincamera.mostCurrent.activityBA);
 BA.debugLineNum = 69;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
maincamera.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
case 2: {
 BA.debugLineNum = 72;BA.debugLine="If HealthBuilding.idBuilding.Length > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",maincamera.mostCurrent._healthbuilding._idbuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 73;BA.debugLine="idBuilding= HealthBuilding.idBuilding";
Debug.ShouldStop(256);
maincamera.mostCurrent._idbuilding = maincamera.mostCurrent._healthbuilding._idbuilding;
 BA.debugLineNum = 74;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(512);
maincamera.mostCurrent.__c.runVoidMethod ("Log",(Object)(maincamera.mostCurrent._idbuilding));
 }else {
 BA.debugLineNum = 76;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(2048);
maincamera.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),maincamera.mostCurrent.activityBA);
 BA.debugLineNum = 77;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
maincamera.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
case 3: {
 BA.debugLineNum = 80;BA.debugLine="If MsmeBuilding.idBuilding.Length > 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",maincamera.mostCurrent._msmebuilding._idbuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 81;BA.debugLine="idBuilding= MsmeBuilding.idBuilding";
Debug.ShouldStop(65536);
maincamera.mostCurrent._idbuilding = maincamera.mostCurrent._msmebuilding._idbuilding;
 BA.debugLineNum = 82;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(131072);
maincamera.mostCurrent.__c.runVoidMethod ("Log",(Object)(maincamera.mostCurrent._idbuilding));
 }else {
 BA.debugLineNum = 84;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(524288);
maincamera.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),maincamera.mostCurrent.activityBA);
 BA.debugLineNum = 85;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
maincamera.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
case 4: {
 BA.debugLineNum = 88;BA.debugLine="If EducationalBuilding.idBuilding.Length > 0 T";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",maincamera.mostCurrent._educationalbuilding._idbuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 89;BA.debugLine="idBuilding= EducationalBuilding.idBuilding";
Debug.ShouldStop(16777216);
maincamera.mostCurrent._idbuilding = maincamera.mostCurrent._educationalbuilding._idbuilding;
 BA.debugLineNum = 90;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(33554432);
maincamera.mostCurrent.__c.runVoidMethod ("Log",(Object)(maincamera.mostCurrent._idbuilding));
 }else {
 BA.debugLineNum = 92;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(134217728);
maincamera.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),maincamera.mostCurrent.activityBA);
 BA.debugLineNum = 93;BA.debugLine="Activity.Finish";
Debug.ShouldStop(268435456);
maincamera.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
default: {
 BA.debugLineNum = 96;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(-2147483648);
maincamera.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),maincamera.mostCurrent.activityBA);
 BA.debugLineNum = 97;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1);
maincamera.mostCurrent._activity.runVoidMethod ("Finish");
 break; }
}
;
 }else 
{ BA.debugLineNum = 99;BA.debugLine="Else If SearchBuilding.idspin.Length > 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",maincamera.mostCurrent._searchbuilding._idspin.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 100;BA.debugLine="buildingtype = SearchBuilding.idspin";
Debug.ShouldStop(8);
maincamera.mostCurrent._buildingtype = maincamera.mostCurrent._searchbuilding._idspin;
 BA.debugLineNum = 101;BA.debugLine="Log(buildingtype)";
Debug.ShouldStop(16);
maincamera.mostCurrent.__c.runVoidMethod ("Log",(Object)(maincamera.mostCurrent._buildingtype));
 BA.debugLineNum = 102;BA.debugLine="If SearchBuilding.idBuilding.Length > 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",maincamera.mostCurrent._searchbuilding._idbuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 103;BA.debugLine="idBuilding = SearchBuilding.idBuilding";
Debug.ShouldStop(64);
maincamera.mostCurrent._idbuilding = maincamera.mostCurrent._searchbuilding._idbuilding;
 BA.debugLineNum = 104;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(128);
maincamera.mostCurrent.__c.runVoidMethod ("Log",(Object)(maincamera.mostCurrent._idbuilding));
 }else {
 BA.debugLineNum = 106;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(512);
maincamera.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),maincamera.mostCurrent.activityBA);
 BA.debugLineNum = 107;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1024);
maincamera.mostCurrent._activity.runVoidMethod ("Finish");
 };
 }}
;
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Activity_Pause (maincamera) ","maincamera",23,maincamera.mostCurrent.activityBA,maincamera.mostCurrent,159);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.maincamera.remoteMe.runUserSub(false, "maincamera","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 159;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 160;BA.debugLine="cam.Stop";
Debug.ShouldStop(-2147483648);
maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_stop");
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Activity_Resume (maincamera) ","maincamera",23,maincamera.mostCurrent.activityBA,maincamera.mostCurrent,112);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.maincamera.remoteMe.runUserSub(false, "maincamera","activity_resume");
 BA.debugLineNum = 112;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="OpenCamera(frontCamera)";
Debug.ShouldStop(65536);
_opencamera(maincamera._frontcamera);
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _barzoom_valuechanged(RemoteObject _value,RemoteObject _userchanged) throws Exception{
try {
		Debug.PushSubsStack("barZoom_ValueChanged (maincamera) ","maincamera",23,maincamera.mostCurrent.activityBA,maincamera.mostCurrent,294);
if (RapidSub.canDelegate("barzoom_valuechanged")) return b4a.example.maincamera.remoteMe.runUserSub(false, "maincamera","barzoom_valuechanged", _value, _userchanged);
RemoteObject _originalsize = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
RemoteObject _zoom = RemoteObject.createImmutable(0f);
RemoteObject _crop = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
RemoteObject _newwidth = RemoteObject.createImmutable(0);
RemoteObject _newheight = RemoteObject.createImmutable(0);
Debug.locals.put("Value", _value);
Debug.locals.put("UserChanged", _userchanged);
 BA.debugLineNum = 294;BA.debugLine="Sub barZoom_ValueChanged (Value As Int, UserChange";
Debug.ShouldStop(32);
 BA.debugLineNum = 295;BA.debugLine="Dim OriginalSize As Rect = cam.ActiveArraySize";
Debug.ShouldStop(64);
_originalsize = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
_originalsize = maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_getactivearraysize");Debug.locals.put("OriginalSize", _originalsize);Debug.locals.put("OriginalSize", _originalsize);
 BA.debugLineNum = 296;BA.debugLine="Dim Zoom As Float = 1 + Value / 100 * (cam.MaxDig";
Debug.ShouldStop(128);
_zoom = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),_value,RemoteObject.createImmutable(100),(RemoteObject.solve(new RemoteObject[] {maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_getmaxdigitalzoom"),RemoteObject.createImmutable(1)}, "-",1, 0))}, "+/*",1, 0));Debug.locals.put("Zoom", _zoom);Debug.locals.put("Zoom", _zoom);
 BA.debugLineNum = 297;BA.debugLine="Dim Crop As Rect";
Debug.ShouldStop(256);
_crop = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");Debug.locals.put("Crop", _crop);
 BA.debugLineNum = 298;BA.debugLine="Dim NewWidth As Int = OriginalSize.Width / Zoom";
Debug.ShouldStop(512);
_newwidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_originalsize.runMethod(true,"getWidth"),_zoom}, "/",0, 0));Debug.locals.put("NewWidth", _newwidth);Debug.locals.put("NewWidth", _newwidth);
 BA.debugLineNum = 299;BA.debugLine="Dim NewHeight As Int = OriginalSize.Height / Zoom";
Debug.ShouldStop(1024);
_newheight = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_originalsize.runMethod(true,"getHeight"),_zoom}, "/",0, 0));Debug.locals.put("NewHeight", _newheight);Debug.locals.put("NewHeight", _newheight);
 BA.debugLineNum = 300;BA.debugLine="Crop.Initialize(OriginalSize.CenterX - NewWidth /";
Debug.ShouldStop(2048);
_crop.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_originalsize.runMethod(true,"getCenterX"),_newwidth,RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_originalsize.runMethod(true,"getCenterY"),_newheight,RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_originalsize.runMethod(true,"getCenterX"),_newwidth,RemoteObject.createImmutable(2)}, "+/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_originalsize.runMethod(true,"getCenterY"),_newheight,RemoteObject.createImmutable(2)}, "+/",1, 0))));
 BA.debugLineNum = 302;BA.debugLine="cam.PreviewCropRegion = Crop";
Debug.ShouldStop(8192);
maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_setpreviewcropregion",_crop);
 BA.debugLineNum = 303;BA.debugLine="cam.StartPreview(MyTaskIndex, VideoMode)";
Debug.ShouldStop(16384);
maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_startpreview",(Object)(maincamera._mytaskindex),(Object)(maincamera._videomode));
 BA.debugLineNum = 304;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnautoexposure_click() throws Exception{
try {
		Debug.PushSubsStack("btnAutoExposure_Click (maincamera) ","maincamera",23,maincamera.mostCurrent.activityBA,maincamera.mostCurrent,251);
if (RapidSub.canDelegate("btnautoexposure_click")) return b4a.example.maincamera.remoteMe.runUserSub(false, "maincamera","btnautoexposure_click");
RemoteObject _flashes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 251;BA.debugLine="Sub btnAutoExposure_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 252;BA.debugLine="Dim flashes As List = cam.SupportedAutoExposureMo";
Debug.ShouldStop(134217728);
_flashes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_flashes = maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_getsupportedautoexposuremodes");Debug.locals.put("flashes", _flashes);Debug.locals.put("flashes", _flashes);
 BA.debugLineNum = 253;BA.debugLine="Dim i As Int = flashes.IndexOf(cam.AutoExposureMo";
Debug.ShouldStop(268435456);
_i = _flashes.runMethod(true,"IndexOf",(Object)((maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_getautoexposuremode"))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 254;BA.debugLine="i = (i + 1) Mod flashes.Size";
Debug.ShouldStop(536870912);
_i = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),_flashes.runMethod(true,"getSize")}, "%",0, 1);Debug.locals.put("i", _i);
 BA.debugLineNum = 255;BA.debugLine="cam.AutoExposureMode = flashes.Get(i)";
Debug.ShouldStop(1073741824);
maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_setautoexposuremode",BA.ObjectToString(_flashes.runMethod(false,"Get",(Object)(_i))));
 BA.debugLineNum = 256;BA.debugLine="btnAutoExposure.Text = flashes.Get(i)";
Debug.ShouldStop(-2147483648);
maincamera.mostCurrent._btnautoexposure.runMethod(true,"setText",BA.ObjectToCharSequence(_flashes.runMethod(false,"Get",(Object)(_i))));
 BA.debugLineNum = 257;BA.debugLine="cam.StartPreview(MyTaskIndex, VideoMode)";
Debug.ShouldStop(1);
maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_startpreview",(Object)(maincamera._mytaskindex),(Object)(maincamera._videomode));
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncamera_click() throws Exception{
try {
		Debug.PushSubsStack("btnCamera_Click (maincamera) ","maincamera",23,maincamera.mostCurrent.activityBA,maincamera.mostCurrent,154);
if (RapidSub.canDelegate("btncamera_click")) return b4a.example.maincamera.remoteMe.runUserSub(false, "maincamera","btncamera_click");
 BA.debugLineNum = 154;BA.debugLine="Sub btnCamera_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 155;BA.debugLine="frontCamera = Not(frontCamera)";
Debug.ShouldStop(67108864);
maincamera._frontcamera = maincamera.mostCurrent.__c.runMethod(true,"Not",(Object)(maincamera._frontcamera));
 BA.debugLineNum = 156;BA.debugLine="OpenCamera(frontCamera)";
Debug.ShouldStop(134217728);
_opencamera(maincamera._frontcamera);
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btneffects_click() throws Exception{
try {
		Debug.PushSubsStack("btnEffects_Click (maincamera) ","maincamera",23,maincamera.mostCurrent.activityBA,maincamera.mostCurrent,233);
if (RapidSub.canDelegate("btneffects_click")) return b4a.example.maincamera.remoteMe.runUserSub(false, "maincamera","btneffects_click");
RemoteObject _effects = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 233;BA.debugLine="Sub btnEffects_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 234;BA.debugLine="Dim effects As List = cam.SupportedEffectModes";
Debug.ShouldStop(512);
_effects = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_effects = maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_getsupportedeffectmodes");Debug.locals.put("effects", _effects);Debug.locals.put("effects", _effects);
 BA.debugLineNum = 235;BA.debugLine="Dim i As Int = effects.IndexOf(cam.EffectMode)";
Debug.ShouldStop(1024);
_i = _effects.runMethod(true,"IndexOf",(Object)((maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_geteffectmode"))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 236;BA.debugLine="i = (i + 1) Mod effects.Size";
Debug.ShouldStop(2048);
_i = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),_effects.runMethod(true,"getSize")}, "%",0, 1);Debug.locals.put("i", _i);
 BA.debugLineNum = 237;BA.debugLine="cam.EffectMode = effects.Get(i)";
Debug.ShouldStop(4096);
maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_seteffectmode",BA.ObjectToString(_effects.runMethod(false,"Get",(Object)(_i))));
 BA.debugLineNum = 238;BA.debugLine="btnEffects.Text = effects.Get(i)";
Debug.ShouldStop(8192);
maincamera.mostCurrent._btneffects.runMethod(true,"setText",BA.ObjectToCharSequence(_effects.runMethod(false,"Get",(Object)(_i))));
 BA.debugLineNum = 239;BA.debugLine="cam.StartPreview(MyTaskIndex, VideoMode)";
Debug.ShouldStop(16384);
maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_startpreview",(Object)(maincamera._mytaskindex),(Object)(maincamera._videomode));
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnfocus_click() throws Exception{
try {
		Debug.PushSubsStack("btnFocus_Click (maincamera) ","maincamera",23,maincamera.mostCurrent.activityBA,maincamera.mostCurrent,260);
if (RapidSub.canDelegate("btnfocus_click")) return b4a.example.maincamera.remoteMe.runUserSub(false, "maincamera","btnfocus_click");
RemoteObject _focuses = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 260;BA.debugLine="Sub btnFocus_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 261;BA.debugLine="Dim focuses As List = cam.SupportedFocusModes";
Debug.ShouldStop(16);
_focuses = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_focuses = maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_getsupportedfocusmodes");Debug.locals.put("focuses", _focuses);Debug.locals.put("focuses", _focuses);
 BA.debugLineNum = 262;BA.debugLine="Dim i As Int = focuses.IndexOf(cam.FocusMode)";
Debug.ShouldStop(32);
_i = _focuses.runMethod(true,"IndexOf",(Object)((maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_getfocusmode"))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 263;BA.debugLine="i = (i + 1) Mod focuses.Size";
Debug.ShouldStop(64);
_i = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),_focuses.runMethod(true,"getSize")}, "%",0, 1);Debug.locals.put("i", _i);
 BA.debugLineNum = 264;BA.debugLine="cam.FocusMode = focuses.Get(i)";
Debug.ShouldStop(128);
maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_setfocusmode",BA.ObjectToString(_focuses.runMethod(false,"Get",(Object)(_i))));
 BA.debugLineNum = 265;BA.debugLine="btnFocus.Text = focuses.Get(i)";
Debug.ShouldStop(256);
maincamera.mostCurrent._btnfocus.runMethod(true,"setText",BA.ObjectToCharSequence(_focuses.runMethod(false,"Get",(Object)(_i))));
 BA.debugLineNum = 266;BA.debugLine="cam.StartPreview(MyTaskIndex, VideoMode)";
Debug.ShouldStop(512);
maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_startpreview",(Object)(maincamera._mytaskindex),(Object)(maincamera._videomode));
 BA.debugLineNum = 267;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnmode_click() throws Exception{
ResumableSub_btnMode_Click rsub = new ResumableSub_btnMode_Click(null);
rsub.resume(null, null);
}
public static class ResumableSub_btnMode_Click extends BA.ResumableSub {
public ResumableSub_btnMode_Click(b4a.example.maincamera parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.maincamera parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnMode_Click (maincamera) ","maincamera",23,maincamera.mostCurrent.activityBA,maincamera.mostCurrent,163);
if (RapidSub.canDelegate("btnmode_click")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 164;BA.debugLine="VideoMode = Not(VideoMode)";
Debug.ShouldStop(8);
parent._videomode = parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent._videomode));
 BA.debugLineNum = 165;BA.debugLine="If VideoMode Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 8;
if (parent._videomode.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 166;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_RECORD_AUDIO)";
Debug.ShouldStop(32);
parent._rp.runVoidMethod ("CheckAndRequest",maincamera.processBA,(Object)(parent._rp.getField(true,"PERMISSION_RECORD_AUDIO")));
 BA.debugLineNum = 167;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", maincamera.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), null);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 168;BA.debugLine="If Result = False Then";
Debug.ShouldStop(128);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 169;BA.debugLine="ToastMessageShow(\"No permission!\", True)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No permission!")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 170;BA.debugLine="VideoMode = False";
Debug.ShouldStop(512);
parent._videomode = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 173;BA.debugLine="SetState(openstate, busystate, VideoMode)";
Debug.ShouldStop(4096);
_setstate(parent._openstate,parent._busystate,parent._videomode);
 BA.debugLineNum = 174;BA.debugLine="PrepareSurface";
Debug.ShouldStop(8192);
_preparesurface();
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _btnrecord_click() throws Exception{
try {
		Debug.PushSubsStack("btnRecord_Click (maincamera) ","maincamera",23,maincamera.mostCurrent.activityBA,maincamera.mostCurrent,177);
if (RapidSub.canDelegate("btnrecord_click")) return b4a.example.maincamera.remoteMe.runUserSub(false, "maincamera","btnrecord_click");
 BA.debugLineNum = 177;BA.debugLine="Sub btnRecord_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="If VideoMode Then";
Debug.ShouldStop(131072);
if (maincamera._videomode.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 179;BA.debugLine="CaptureVideo";
Debug.ShouldStop(262144);
_capturevideo();
 }else {
 BA.debugLineNum = 181;BA.debugLine="TakePicture";
Debug.ShouldStop(1048576);
_takepicture();
 };
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnscene_click() throws Exception{
try {
		Debug.PushSubsStack("btnScene_Click (maincamera) ","maincamera",23,maincamera.mostCurrent.activityBA,maincamera.mostCurrent,242);
if (RapidSub.canDelegate("btnscene_click")) return b4a.example.maincamera.remoteMe.runUserSub(false, "maincamera","btnscene_click");
RemoteObject _scenes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 242;BA.debugLine="Sub btnScene_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 243;BA.debugLine="Dim scenes As List = cam.SupportedSceneModes";
Debug.ShouldStop(262144);
_scenes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_scenes = maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_getsupportedscenemodes");Debug.locals.put("scenes", _scenes);Debug.locals.put("scenes", _scenes);
 BA.debugLineNum = 244;BA.debugLine="Dim i As Int = scenes.IndexOf(cam.SceneMode)";
Debug.ShouldStop(524288);
_i = _scenes.runMethod(true,"IndexOf",(Object)((maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_getscenemode"))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 245;BA.debugLine="i = (i + 1) Mod scenes.Size";
Debug.ShouldStop(1048576);
_i = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),_scenes.runMethod(true,"getSize")}, "%",0, 1);Debug.locals.put("i", _i);
 BA.debugLineNum = 246;BA.debugLine="cam.SceneMode = scenes.Get(i)";
Debug.ShouldStop(2097152);
maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_setscenemode",BA.ObjectToString(_scenes.runMethod(false,"Get",(Object)(_i))));
 BA.debugLineNum = 247;BA.debugLine="btnScene.Text = scenes.Get(i)";
Debug.ShouldStop(4194304);
maincamera.mostCurrent._btnscene.runMethod(true,"setText",BA.ObjectToCharSequence(_scenes.runMethod(false,"Get",(Object)(_i))));
 BA.debugLineNum = 248;BA.debugLine="cam.StartPreview(MyTaskIndex, VideoMode)";
Debug.ShouldStop(8388608);
maincamera.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_startpreview",(Object)(maincamera._mytaskindex),(Object)(maincamera._videomode));
 BA.debugLineNum = 249;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cancelsavebtn_click() throws Exception{
try {
		Debug.PushSubsStack("CancelSaveBtn_Click (maincamera) ","maincamera",23,maincamera.mostCurrent.activityBA,maincamera.mostCurrent,320);
if (RapidSub.canDelegate("cancelsavebtn_click")) return b4a.example.maincamera.remoteMe.runUserSub(false, "maincamera","cancelsavebtn_click");
 BA.debugLineNum = 320;BA.debugLine="Sub CancelSaveBtn_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 321;BA.debugLine="pnlBackground.Visible = False";
Debug.ShouldStop(1);
maincamera.mostCurrent._pnlbackground.runMethod(true,"setVisible",maincamera.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _capturevideo() throws Exception{
ResumableSub_CaptureVideo rsub = new ResumableSub_CaptureVideo(null);
rsub.resume(null, null);
}
public static class ResumableSub_CaptureVideo extends BA.ResumableSub {
public ResumableSub_CaptureVideo(b4a.example.maincamera parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.maincamera parent;
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CaptureVideo (maincamera) ","maincamera",23,maincamera.mostCurrent.activityBA,maincamera.mostCurrent,185);
if (RapidSub.canDelegate("capturevideo")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 186;BA.debugLine="Try";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 187;BA.debugLine="SetState(openstate, True, VideoMode)";
Debug.ShouldStop(67108864);
_setstate(parent._openstate,parent.mostCurrent.__c.getField(true,"True"),parent._videomode);
 BA.debugLineNum = 188;BA.debugLine="If cam.RecordingVideo = False Then";
Debug.ShouldStop(134217728);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._cam.getField(true,"_recordingvideo"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 189;BA.debugLine="cam.StartVideoRecording (MyTaskIndex)";
Debug.ShouldStop(268435456);
parent.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_startvideorecording",(Object)(parent._mytaskindex));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 191;BA.debugLine="cam.StopVideoRecording (MyTaskIndex)";
Debug.ShouldStop(1073741824);
parent.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_stopvideorecording",(Object)(parent._mytaskindex));
 BA.debugLineNum = 192;BA.debugLine="File.Copy(VideoFileDir, \"temp-\" & VideoFileName";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent._videofiledir),(Object)(RemoteObject.concat(RemoteObject.createImmutable("temp-"),parent._videofilename)),(Object)(parent._videofiledir),(Object)(parent._videofilename));
 BA.debugLineNum = 193;BA.debugLine="ToastMessageShow($\"Video file saved: $1.2{File.";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Video file saved: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Size",(Object)(parent._videofiledir),(Object)(parent._videofilename)),RemoteObject.createImmutable(1024),RemoteObject.createImmutable(1024)}, "//",0, 0)))),RemoteObject.createImmutable(" MB"))))),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 194;BA.debugLine="Wait For (PrepareSurface) Complete (Success As";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", maincamera.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), _preparesurface());
this.state = 13;
return;
case 13:
//C
this.state = 9;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 195;BA.debugLine="SetState(openstate, False, VideoMode)";
Debug.ShouldStop(4);
_setstate(parent._openstate,parent.mostCurrent.__c.getField(true,"False"),parent._videomode);
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 199;BA.debugLine="HandleError(LastException)";
Debug.ShouldStop(64);
_handleerror(parent.mostCurrent.__c.runMethod(false,"LastException",maincamera.mostCurrent.activityBA));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",maincamera.processBA, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject _success) throws Exception{
}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private cam As CamEx2";
maincamera.mostCurrent._cam = RemoteObject.createNew ("b4a.example.camex2");
 //BA.debugLineNum = 21;BA.debugLine="Private pnlCamera As Panel";
maincamera.mostCurrent._pnlcamera = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private pnlPicture As Panel";
maincamera.mostCurrent._pnlpicture = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private pnlBackground As Panel";
maincamera.mostCurrent._pnlbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private btnEffects As Button";
maincamera.mostCurrent._btneffects = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private btnScene As Button";
maincamera.mostCurrent._btnscene = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private buttons As List";
maincamera.mostCurrent._buttons = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 27;BA.debugLine="Private btnAutoExposure As Button";
maincamera.mostCurrent._btnautoexposure = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private btnFocus As Button";
maincamera.mostCurrent._btnfocus = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private ProgressBar1 As ProgressBar";
maincamera.mostCurrent._progressbar1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private openstate, busystate As Boolean";
maincamera._openstate = RemoteObject.createImmutable(false);
maincamera._busystate = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 31;BA.debugLine="Private btnRecord As Button";
maincamera.mostCurrent._btnrecord = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private btnMode As Button";
maincamera.mostCurrent._btnmode = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private btnCamera As Button";
maincamera.mostCurrent._btncamera = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private barZoom As SeekBar";
maincamera.mostCurrent._barzoom = RemoteObject.createNew ("anywheresoftware.b4a.objects.SeekBarWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private SaveImgBtn As Button";
maincamera.mostCurrent._saveimgbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private CancelSaveBtn As Button";
maincamera.mostCurrent._cancelsavebtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Dim idBuilding As String";
maincamera.mostCurrent._idbuilding = RemoteObject.createImmutable("");
 //BA.debugLineNum = 39;BA.debugLine="Dim buildingtype As String";
maincamera.mostCurrent._buildingtype = RemoteObject.createImmutable("");
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _handleerror(RemoteObject _error) throws Exception{
try {
		Debug.PushSubsStack("HandleError (maincamera) ","maincamera",23,maincamera.mostCurrent.activityBA,maincamera.mostCurrent,203);
if (RapidSub.canDelegate("handleerror")) return b4a.example.maincamera.remoteMe.runUserSub(false, "maincamera","handleerror", _error);
Debug.locals.put("Error", _error);
 BA.debugLineNum = 203;BA.debugLine="Sub HandleError (Error As Exception)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 204;BA.debugLine="Log(\"Error: \" & Error)";
Debug.ShouldStop(2048);
maincamera.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_error)));
 BA.debugLineNum = 205;BA.debugLine="ToastMessageShow(Error, True)";
Debug.ShouldStop(4096);
maincamera.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_error.getObject())),(Object)(maincamera.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 206;BA.debugLine="OpenCamera(frontCamera)";
Debug.ShouldStop(8192);
_opencamera(maincamera._frontcamera);
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _opencamera(RemoteObject _front) throws Exception{
ResumableSub_OpenCamera rsub = new ResumableSub_OpenCamera(null,_front);
rsub.resume(null, null);
}
public static class ResumableSub_OpenCamera extends BA.ResumableSub {
public ResumableSub_OpenCamera(b4a.example.maincamera parent,RemoteObject _front) {
this.parent = parent;
this._front = _front;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.maincamera parent;
RemoteObject _front;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _taskindex = RemoteObject.createImmutable(0);
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("OpenCamera (maincamera) ","maincamera",23,maincamera.mostCurrent.activityBA,maincamera.mostCurrent,117);
if (RapidSub.canDelegate("opencamera")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("front", _front);
 BA.debugLineNum = 118;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
Debug.ShouldStop(2097152);
parent._rp.runVoidMethod ("CheckAndRequest",maincamera.processBA,(Object)(parent._rp.getField(true,"PERMISSION_CAMERA")));
 BA.debugLineNum = 119;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", maincamera.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 120;BA.debugLine="If Result = False Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 121;BA.debugLine="ToastMessageShow(\"No permission!\", True)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No permission!")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 122;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 125;BA.debugLine="SetState(False, False, VideoMode)";
Debug.ShouldStop(268435456);
_setstate(parent.mostCurrent.__c.getField(true,"False"),parent.mostCurrent.__c.getField(true,"False"),parent._videomode);
 BA.debugLineNum = 126;BA.debugLine="Wait For (cam.OpenCamera(front)) Complete (TaskIn";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", maincamera.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), parent.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_opencamera",(Object)(_front)));
this.state = 14;
return;
case 14:
//C
this.state = 5;
_taskindex = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("TaskIndex", _taskindex);
;
 BA.debugLineNum = 127;BA.debugLine="If TaskIndex > 0 Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean(">",_taskindex,BA.numberCast(double.class, 0))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 128;BA.debugLine="MyTaskIndex = TaskIndex 'hold this index. It wil";
Debug.ShouldStop(-2147483648);
parent._mytaskindex = _taskindex;
 BA.debugLineNum = 129;BA.debugLine="Wait For(PrepareSurface) Complete (Success As Bo";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", maincamera.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), _preparesurface());
this.state = 15;
return;
case 15:
//C
this.state = 8;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 131;BA.debugLine="Log(\"Start success: \" & Success)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Start success: "),_success)));
 BA.debugLineNum = 132;BA.debugLine="SetState(Success, False, VideoMode)";
Debug.ShouldStop(8);
_setstate(_success,parent.mostCurrent.__c.getField(true,"False"),parent._videomode);
 BA.debugLineNum = 133;BA.debugLine="If Success = False Then";
Debug.ShouldStop(16);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_success,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 134;BA.debugLine="ToastMessageShow(\"Failed to open camera\", True)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Failed to open camera")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _pnlpicture_click() throws Exception{
try {
		Debug.PushSubsStack("pnlPicture_Click (maincamera) ","maincamera",23,maincamera.mostCurrent.activityBA,maincamera.mostCurrent,229);
if (RapidSub.canDelegate("pnlpicture_click")) return b4a.example.maincamera.remoteMe.runUserSub(false, "maincamera","pnlpicture_click");
 BA.debugLineNum = 229;BA.debugLine="Sub pnlPicture_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 231;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _preparesurface() throws Exception{
ResumableSub_PrepareSurface rsub = new ResumableSub_PrepareSurface(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
public static class ResumableSub_PrepareSurface extends BA.ResumableSub {
public ResumableSub_PrepareSurface(b4a.example.maincamera parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.maincamera parent;
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PrepareSurface (maincamera) ","maincamera",23,maincamera.mostCurrent.activityBA,maincamera.mostCurrent,138);
if (RapidSub.canDelegate("preparesurface")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 139;BA.debugLine="SetState(False, busystate, VideoMode)";
Debug.ShouldStop(1024);
_setstate(parent.mostCurrent.__c.getField(true,"False"),parent._busystate,parent._videomode);
 BA.debugLineNum = 141;BA.debugLine="If VideoMode Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 6;
if (parent._videomode.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 142;BA.debugLine="cam.PreviewSize.Initialize(640, 480)";
Debug.ShouldStop(8192);
parent.mostCurrent._cam.getField(false,"_previewsize").runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 640)),(Object)(BA.numberCast(int.class, 480)));
 BA.debugLineNum = 144;BA.debugLine="Wait For (cam.PrepareSurfaceForVideo(MyTaskIndex";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", maincamera.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), parent.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_preparesurfaceforvideo",(Object)(parent._mytaskindex),(Object)(parent._videofiledir),(Object)(RemoteObject.concat(RemoteObject.createImmutable("temp-"),parent._videofilename))));
this.state = 12;
return;
case 12:
//C
this.state = 6;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 146;BA.debugLine="cam.PreviewSize.Initialize(1920, 1080)";
Debug.ShouldStop(131072);
parent.mostCurrent._cam.getField(false,"_previewsize").runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 1920)),(Object)(BA.numberCast(int.class, 1080)));
 BA.debugLineNum = 147;BA.debugLine="Wait For (cam.PrepareSurface(MyTaskIndex)) Compl";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", maincamera.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), parent.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_preparesurface",(Object)(parent._mytaskindex)));
this.state = 13;
return;
case 13:
//C
this.state = 6;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 if (true) break;
;
 BA.debugLineNum = 149;BA.debugLine="If Success Then cam.StartPreview(MyTaskIndex, Vid";
Debug.ShouldStop(1048576);

case 6:
//if
this.state = 11;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
parent.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_startpreview",(Object)(parent._mytaskindex),(Object)(parent._videomode));
if (true) break;

case 11:
//C
this.state = -1;
;
 BA.debugLineNum = 150;BA.debugLine="SetState(Success, busystate, VideoMode)";
Debug.ShouldStop(2097152);
_setstate(_success,parent._busystate,parent._videomode);
 BA.debugLineNum = 151;BA.debugLine="Return Success";
Debug.ShouldStop(4194304);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_success));return;};
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private frontCamera As Boolean = False";
maincamera._frontcamera = maincamera.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 10;BA.debugLine="Private VideoMode As Boolean = False";
maincamera._videomode = maincamera.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 11;BA.debugLine="Private VideoFileDir, VideoFileName As String";
maincamera._videofiledir = RemoteObject.createImmutable("");
maincamera._videofilename = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Private MyTaskIndex As Int";
maincamera._mytaskindex = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 13;BA.debugLine="Private rp As RuntimePermissions";
maincamera._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 14;BA.debugLine="Dim namefile As String";
maincamera._namefile = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _saveimgbtn_click() throws Exception{
ResumableSub_SaveImgBtn_Click rsub = new ResumableSub_SaveImgBtn_Click(null);
rsub.resume(null, null);
}
public static class ResumableSub_SaveImgBtn_Click extends BA.ResumableSub {
public ResumableSub_SaveImgBtn_Click(b4a.example.maincamera parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.maincamera parent;
RemoteObject _data = null;
RemoteObject _tanggal = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SaveImgBtn_Click (maincamera) ","maincamera",23,maincamera.mostCurrent.activityBA,maincamera.mostCurrent,307);
if (RapidSub.canDelegate("saveimgbtn_click")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 308;BA.debugLine="Wait For(cam.FocusAndTakePicture(MyTaskIndex)) Co";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", maincamera.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), parent.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_focusandtakepicture",(Object)(parent._mytaskindex)));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_data = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("data", _data);
;
 BA.debugLineNum = 309;BA.debugLine="Dim tanggal As String";
Debug.ShouldStop(1048576);
_tanggal = RemoteObject.createImmutable("");Debug.locals.put("tanggal", _tanggal);
 BA.debugLineNum = 310;BA.debugLine="DateTime.DateFormat=\"ddmmyyy-hhmmss\"";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("ddmmyyy-hhmmss"));
 BA.debugLineNum = 311;BA.debugLine="tanggal = DateTime.Date(DateTime.now)";
Debug.ShouldStop(4194304);
_tanggal = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("tanggal", _tanggal);
 BA.debugLineNum = 312;BA.debugLine="namefile = idBuilding&\"-\"&tanggal&\".jpg\"";
Debug.ShouldStop(8388608);
parent._namefile = RemoteObject.concat(parent.mostCurrent._idbuilding,RemoteObject.createImmutable("-"),_tanggal,RemoteObject.createImmutable(".jpg"));
 BA.debugLineNum = 313;BA.debugLine="cam.DataToFile(data, VideoFileDir,namefile)";
Debug.ShouldStop(16777216);
parent.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_datatofile",(Object)(_data),(Object)(parent._videofiledir),(Object)(parent._namefile));
 BA.debugLineNum = 315;BA.debugLine="ToastMessageShow(\"Image Saved!\",True)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Image Saved!")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 316;BA.debugLine="pnlBackground.Visible = False";
Debug.ShouldStop(134217728);
parent.mostCurrent._pnlbackground.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 317;BA.debugLine="CallSubDelayed2(AddPhoto,\"ShowPicture\",namefile)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",maincamera.processBA,(Object)((parent.mostCurrent._addphoto.getObject())),(Object)(BA.ObjectToString("ShowPicture")),(Object)((parent._namefile)));
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _setstate(RemoteObject _open,RemoteObject _busy,RemoteObject _video) throws Exception{
try {
		Debug.PushSubsStack("SetState (maincamera) ","maincamera",23,maincamera.mostCurrent.activityBA,maincamera.mostCurrent,270);
if (RapidSub.canDelegate("setstate")) return b4a.example.maincamera.remoteMe.runUserSub(false, "maincamera","setstate", _open, _busy, _video);
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _btnrecordtext = RemoteObject.createImmutable("");
Debug.locals.put("Open", _open);
Debug.locals.put("Busy", _busy);
Debug.locals.put("Video", _video);
 BA.debugLineNum = 270;BA.debugLine="Sub SetState(Open As Boolean, Busy As Boolean, Vid";
Debug.ShouldStop(8192);
 BA.debugLineNum = 271;BA.debugLine="For Each b As Button In buttons";
Debug.ShouldStop(16384);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
{
final RemoteObject group1 = maincamera.mostCurrent._buttons;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b.setObject(group1.runMethod(false,"Get",index1));
Debug.locals.put("b", _b);
 BA.debugLineNum = 272;BA.debugLine="b.Visible = Open And Not(Busy)";
Debug.ShouldStop(32768);
_b.runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_open) && RemoteObject.solveBoolean(".",maincamera.mostCurrent.__c.runMethod(true,"Not",(Object)(_busy)))));
 }
}Debug.locals.put("b", _b);
;
 BA.debugLineNum = 274;BA.debugLine="btnCamera.Visible = Not(Busy)";
Debug.ShouldStop(131072);
maincamera.mostCurrent._btncamera.runMethod(true,"setVisible",maincamera.mostCurrent.__c.runMethod(true,"Not",(Object)(_busy)));
 BA.debugLineNum = 275;BA.debugLine="btnRecord.Visible = Open And (Video Or Not(Busy))";
Debug.ShouldStop(262144);
maincamera.mostCurrent._btnrecord.runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_open) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",_video) || RemoteObject.solveBoolean(".",maincamera.mostCurrent.__c.runMethod(true,"Not",(Object)(_busy))))))));
 BA.debugLineNum = 276;BA.debugLine="openstate = Open";
Debug.ShouldStop(524288);
maincamera._openstate = _open;
 BA.debugLineNum = 277;BA.debugLine="ProgressBar1.Visible = Busy";
Debug.ShouldStop(1048576);
maincamera.mostCurrent._progressbar1.runMethod(true,"setVisible",_busy);
 BA.debugLineNum = 278;BA.debugLine="busystate = Busy";
Debug.ShouldStop(2097152);
maincamera._busystate = _busy;
 BA.debugLineNum = 279;BA.debugLine="VideoMode = Video";
Debug.ShouldStop(4194304);
maincamera._videomode = _video;
 BA.debugLineNum = 280;BA.debugLine="barZoom.Visible = Open";
Debug.ShouldStop(8388608);
maincamera.mostCurrent._barzoom.runMethod(true,"setVisible",_open);
 BA.debugLineNum = 281;BA.debugLine="Dim btnRecordText As String";
Debug.ShouldStop(16777216);
_btnrecordtext = RemoteObject.createImmutable("");Debug.locals.put("btnRecordText", _btnrecordtext);
 BA.debugLineNum = 282;BA.debugLine="If VideoMode Then";
Debug.ShouldStop(33554432);
if (maincamera._videomode.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 283;BA.debugLine="If Busy Then";
Debug.ShouldStop(67108864);
if (_busy.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 284;BA.debugLine="btnRecordText = Chr(0xF04D)";
Debug.ShouldStop(134217728);
_btnrecordtext = BA.ObjectToString(maincamera.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf04d))));Debug.locals.put("btnRecordText", _btnrecordtext);
 }else {
 BA.debugLineNum = 286;BA.debugLine="btnRecordText = Chr(0xF03D)";
Debug.ShouldStop(536870912);
_btnrecordtext = BA.ObjectToString(maincamera.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf03d))));Debug.locals.put("btnRecordText", _btnrecordtext);
 };
 }else {
 BA.debugLineNum = 289;BA.debugLine="btnRecordText = Chr(0xF030)";
Debug.ShouldStop(1);
_btnrecordtext = BA.ObjectToString(maincamera.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf030))));Debug.locals.put("btnRecordText", _btnrecordtext);
 };
 BA.debugLineNum = 291;BA.debugLine="btnRecord.Text = btnRecordText";
Debug.ShouldStop(4);
maincamera.mostCurrent._btnrecord.runMethod(true,"setText",BA.ObjectToCharSequence(_btnrecordtext));
 BA.debugLineNum = 292;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _takepicture() throws Exception{
ResumableSub_TakePicture rsub = new ResumableSub_TakePicture(null);
rsub.resume(null, null);
}
public static class ResumableSub_TakePicture extends BA.ResumableSub {
public ResumableSub_TakePicture(b4a.example.maincamera parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.maincamera parent;
RemoteObject _data = null;
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TakePicture (maincamera) ","maincamera",23,maincamera.mostCurrent.activityBA,maincamera.mostCurrent,209);
if (RapidSub.canDelegate("takepicture")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 210;BA.debugLine="Try";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 BA.debugLineNum = 211;BA.debugLine="SetState(openstate, True, VideoMode)";
Debug.ShouldStop(262144);
_setstate(parent._openstate,parent.mostCurrent.__c.getField(true,"True"),parent._videomode);
 BA.debugLineNum = 212;BA.debugLine="Wait For(cam.FocusAndTakePicture(MyTaskIndex)) C";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", maincamera.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), parent.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_focusandtakepicture",(Object)(parent._mytaskindex)));
this.state = 7;
return;
case 7:
//C
this.state = 6;
_data = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("data", _data);
;
 BA.debugLineNum = 213;BA.debugLine="SetState(openstate, False, VideoMode)";
Debug.ShouldStop(1048576);
_setstate(parent._openstate,parent.mostCurrent.__c.getField(true,"False"),parent._videomode);
 BA.debugLineNum = 214;BA.debugLine="Dim bmp As Bitmap = cam.DataToBitmap(data)";
Debug.ShouldStop(2097152);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_bmp = parent.mostCurrent._cam.runClassMethod (b4a.example.camex2.class, "_datatobitmap",(Object)(_data));Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 215;BA.debugLine="Log(\"Picture taken: \" & bmp) 'ignore";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Picture taken: "),_bmp)));
 BA.debugLineNum = 216;BA.debugLine="pnlBackground.SetVisibleAnimated(100, True)";
Debug.ShouldStop(8388608);
parent.mostCurrent._pnlbackground.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 100)),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 217;BA.debugLine="pnlPicture.SetBackgroundImage(bmp.Resize(pnlPict";
Debug.ShouldStop(16777216);
parent.mostCurrent._pnlpicture.runMethod(false,"SetBackgroundImageNew",(Object)((_bmp.runMethod(false,"Resize",(Object)(BA.numberCast(float.class, parent.mostCurrent._pnlpicture.runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, parent.mostCurrent._pnlpicture.runMethod(true,"getHeight"))),(Object)(parent.mostCurrent.__c.getField(true,"True"))).getObject()))).runMethod(true,"setGravity",parent.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 224;BA.debugLine="HandleError(LastException)";
Debug.ShouldStop(-2147483648);
_handleerror(parent.mostCurrent.__c.runMethod(false,"LastException",maincamera.mostCurrent.activityBA));
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.ShouldStop(4);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",maincamera.processBA, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
}