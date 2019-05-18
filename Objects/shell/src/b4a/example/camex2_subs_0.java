package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class camex2_subs_0 {


public static RemoteObject  _boolstolist(RemoteObject __ref,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("BoolsToList (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,477);
if (RapidSub.canDelegate("boolstolist")) return __ref.runUserSub(false, "camex2","boolstolist", __ref, _obj);
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _i = null;
RemoteObject _ii = RemoteObject.createImmutable(false);
Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 477;BA.debugLine="Private Sub BoolsToList (Obj As Object) As List";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 478;BA.debugLine="Dim res As List";
Debug.ShouldStop(536870912);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 479;BA.debugLine="res.Initialize";
Debug.ShouldStop(1073741824);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 480;BA.debugLine="If Obj = Null Then Return res";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("n",_obj)) { 
if (true) return _res;};
 BA.debugLineNum = 481;BA.debugLine="Dim i() As Boolean = Obj";
Debug.ShouldStop(1);
_i = (_obj);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 482;BA.debugLine="For Each ii As Boolean In i";
Debug.ShouldStop(2);
{
final RemoteObject group5 = _i;
final int groupLen5 = group5.getField(true,"length").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_ii = group5.getArrayElement(true,RemoteObject.createImmutable(index5));Debug.locals.put("ii", _ii);
Debug.locals.put("ii", _ii);
 BA.debugLineNum = 483;BA.debugLine="res.Add(ii)";
Debug.ShouldStop(4);
_res.runVoidMethod ("Add",(Object)((_ii)));
 }
}Debug.locals.put("ii", _ii);
;
 BA.debugLineNum = 485;BA.debugLine="Return res";
Debug.ShouldStop(16);
if (true) return _res;
 BA.debugLineNum = 486;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bytestolist(RemoteObject __ref,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("BytesToList (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,488);
if (RapidSub.canDelegate("bytestolist")) return __ref.runUserSub(false, "camex2","bytestolist", __ref, _obj);
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _i = null;
RemoteObject _ii = RemoteObject.createImmutable((byte)0);
Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 488;BA.debugLine="Private Sub BytesToList (Obj As Object) As List";
Debug.ShouldStop(128);
 BA.debugLineNum = 489;BA.debugLine="Dim res As List";
Debug.ShouldStop(256);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 490;BA.debugLine="res.Initialize";
Debug.ShouldStop(512);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 491;BA.debugLine="If Obj = Null Then Return res";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("n",_obj)) { 
if (true) return _res;};
 BA.debugLineNum = 492;BA.debugLine="Dim i() As Byte = Obj";
Debug.ShouldStop(2048);
_i = (_obj);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 493;BA.debugLine="For Each ii As Byte In i";
Debug.ShouldStop(4096);
{
final RemoteObject group5 = _i;
final int groupLen5 = group5.getField(true,"length").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_ii = group5.getArrayElement(true,RemoteObject.createImmutable(index5));Debug.locals.put("ii", _ii);
Debug.locals.put("ii", _ii);
 BA.debugLineNum = 494;BA.debugLine="res.Add(ii)";
Debug.ShouldStop(8192);
_res.runVoidMethod ("Add",(Object)((_ii)));
 }
}Debug.locals.put("ii", _ii);
;
 BA.debugLineNum = 496;BA.debugLine="Return res";
Debug.ShouldStop(32768);
if (true) return _res;
 BA.debugLineNum = 497;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _camera_previewcapturecomplete(RemoteObject __ref,RemoteObject _captureresult) throws Exception{
try {
		Debug.PushSubsStack("Camera_PreviewCaptureComplete (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,308);
if (RapidSub.canDelegate("camera_previewcapturecomplete")) return __ref.runUserSub(false, "camex2","camera_previewcapturecomplete", __ref, _captureresult);
Debug.locals.put("CaptureResult", _captureresult);
 BA.debugLineNum = 308;BA.debugLine="Private Sub Camera_PreviewCaptureComplete (Capture";
Debug.ShouldStop(524288);
 BA.debugLineNum = 309;BA.debugLine="FocusState = IntToConst(GetFromCaptureResult(Capt";
Debug.ShouldStop(1048576);
__ref.setField ("_focusstate",__ref.runClassMethod (b4a.example.camex2.class, "_inttoconst",(Object)(__ref.runClassMethod (b4a.example.camex2.class, "_getfromcaptureresult",(Object)(_captureresult),(Object)(RemoteObject.createImmutable("CONTROL_AF_STATE")))),(Object)(__ref.getField(false,"_af_state"))));
 BA.debugLineNum = 312;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Camera As Camera2";
camex2._camera = RemoteObject.createNew ("anywheresoftware.b4a.objects.Camera2");__ref.setField("_camera",camex2._camera);
 //BA.debugLineNum = 4;BA.debugLine="Private jcamera As JavaObject";
camex2._jcamera = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_jcamera",camex2._jcamera);
 //BA.debugLineNum = 5;BA.debugLine="Private id As String";
camex2._id = RemoteObject.createImmutable("");__ref.setField("_id",camex2._id);
 //BA.debugLineNum = 6;BA.debugLine="Private mFront As Boolean = False";
camex2._mfront = camex2.__c.getField(true,"False");__ref.setField("_mfront",camex2._mfront);
 //BA.debugLineNum = 7;BA.debugLine="Public PreviewSize, CaptureSize As CameraSize";
camex2._previewsize = RemoteObject.createNew ("anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper");__ref.setField("_previewsize",camex2._previewsize);
camex2._capturesize = RemoteObject.createNew ("anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper");__ref.setField("_capturesize",camex2._capturesize);
 //BA.debugLineNum = 8;BA.debugLine="Public PreviewSettingsMap, CaptureSettingMap As M";
camex2._previewsettingsmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_previewsettingsmap",camex2._previewsettingsmap);
camex2._capturesettingmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_capturesettingmap",camex2._capturesettingmap);
 //BA.debugLineNum = 9;BA.debugLine="Private bothMaps As List";
camex2._bothmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_bothmaps",camex2._bothmaps);
 //BA.debugLineNum = 10;BA.debugLine="Private mPanel As Panel";
camex2._mpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mpanel",camex2._mpanel);
 //BA.debugLineNum = 11;BA.debugLine="Private tv As View";
camex2._tv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");__ref.setField("_tv",camex2._tv);
 //BA.debugLineNum = 12;BA.debugLine="Private StaticCaptureRequest As JavaObject";
camex2._staticcapturerequest = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_staticcapturerequest",camex2._staticcapturerequest);
 //BA.debugLineNum = 13;BA.debugLine="Private StaticCameraCharacteristics As JavaObject";
camex2._staticcameracharacteristics = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_staticcameracharacteristics",camex2._staticcameracharacteristics);
 //BA.debugLineNum = 14;BA.debugLine="Private StaticCaptureResult As JavaObject";
camex2._staticcaptureresult = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_staticcaptureresult",camex2._staticcaptureresult);
 //BA.debugLineNum = 15;BA.debugLine="Private AF_STATE As List = Array(\"INACTIVE\", \"PAS";
camex2._af_state = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
camex2._af_state = camex2.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {7},new Object[] {RemoteObject.createImmutable(("INACTIVE")),RemoteObject.createImmutable(("PASSIVE_SCAN")),RemoteObject.createImmutable(("PASSIVE_FOCUSED")),RemoteObject.createImmutable(("ACTIVE_SCAN")),RemoteObject.createImmutable(("FOCUSED_LOCKED")),RemoteObject.createImmutable(("NOT_FOCUSED_LOCKED")),(RemoteObject.createImmutable("PASSIVE_UNFOCUSED"))})));__ref.setField("_af_state",camex2._af_state);
 //BA.debugLineNum = 16;BA.debugLine="Private FLASH_STATE As List = Array(\"UNAVAILABLE\"";
camex2._flash_state = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
camex2._flash_state = camex2.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {RemoteObject.createImmutable(("UNAVAILABLE")),RemoteObject.createImmutable(("CHARGING")),RemoteObject.createImmutable(("READY")),RemoteObject.createImmutable(("FIRED")),(RemoteObject.createImmutable("PARTIAL"))})));__ref.setField("_flash_state",camex2._flash_state);
 //BA.debugLineNum = 18;BA.debugLine="Private AF_MODE As List = Array(\"OFF\", \"AUTO\", \"M";
camex2._af_mode = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
camex2._af_mode = camex2.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {RemoteObject.createImmutable(("OFF")),RemoteObject.createImmutable(("AUTO")),RemoteObject.createImmutable(("MACRO")),RemoteObject.createImmutable(("CONTINUOUS_VIDEO")),RemoteObject.createImmutable(("CONTINUOUS_PICTURE")),(RemoteObject.createImmutable("EDOF"))})));__ref.setField("_af_mode",camex2._af_mode);
 //BA.debugLineNum = 20;BA.debugLine="Private AE_MODE As List = Array(\"OFF\", \"ON\", \"ON_";
camex2._ae_mode = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
camex2._ae_mode = camex2.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {RemoteObject.createImmutable(("OFF")),RemoteObject.createImmutable(("ON")),RemoteObject.createImmutable(("ON_AUTO_FLASH")),RemoteObject.createImmutable(("ON_ALWAYS_FLASH")),(RemoteObject.createImmutable("ON_AUTO_FLASH_REDEYE"))})));__ref.setField("_ae_mode",camex2._ae_mode);
 //BA.debugLineNum = 21;BA.debugLine="Private FLASH_MODE As List = Array(\"OFF\", \"SINGLE";
camex2._flash_mode = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
camex2._flash_mode = camex2.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("OFF")),RemoteObject.createImmutable(("SINGLE")),(RemoteObject.createImmutable("TORCH"))})));__ref.setField("_flash_mode",camex2._flash_mode);
 //BA.debugLineNum = 22;BA.debugLine="Private SCENE_MODE As List = Array(\"DISABLED\", \"F";
camex2._scene_mode = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
camex2._scene_mode = camex2.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {20},new Object[] {RemoteObject.createImmutable(("DISABLED")),RemoteObject.createImmutable(("FACE_PRIORITY")),RemoteObject.createImmutable(("ACTION")),RemoteObject.createImmutable(("PORTRAIT")),RemoteObject.createImmutable(("LANDSCAPE")),RemoteObject.createImmutable(("NIGHT")),RemoteObject.createImmutable(("PORTRAIT")),RemoteObject.createImmutable(("THEATRE")),RemoteObject.createImmutable(("BEACH")),RemoteObject.createImmutable(("SNOW")),RemoteObject.createImmutable(("SUNSET")),RemoteObject.createImmutable(("STEADYPHOTO")),RemoteObject.createImmutable(("FIREWORKS")),RemoteObject.createImmutable(("SPORTS")),RemoteObject.createImmutable(("PARTY")),RemoteObject.createImmutable(("CANDLELIGHT")),RemoteObject.createImmutable(("BARCODE")),RemoteObject.createImmutable(("HIGH_SPEED_VIDEO")),RemoteObject.createImmutable(("MODE_HDR")),(RemoteObject.createImmutable("FACE_PRIORITY_LOW_LIGHT"))})));__ref.setField("_scene_mode",camex2._scene_mode);
 //BA.debugLineNum = 24;BA.debugLine="Private EFFECT_MODE As List = Array(\"OFF\", \"MONO\"";
camex2._effect_mode = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
camex2._effect_mode = camex2.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {9},new Object[] {RemoteObject.createImmutable(("OFF")),RemoteObject.createImmutable(("MONO")),RemoteObject.createImmutable(("NEGATIVE")),RemoteObject.createImmutable(("SOLARIZE")),RemoteObject.createImmutable(("SEPIA")),RemoteObject.createImmutable(("POSTERIZE")),RemoteObject.createImmutable(("WHITEBOARD")),RemoteObject.createImmutable(("BLACKBOARD")),(RemoteObject.createImmutable("AQUA"))})));__ref.setField("_effect_mode",camex2._effect_mode);
 //BA.debugLineNum = 25;BA.debugLine="Private SUPPORTED_HARDWARE_LEVEL As List = Array(";
camex2._supported_hardware_level = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
camex2._supported_hardware_level = camex2.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {RemoteObject.createImmutable(("LIMITED")),RemoteObject.createImmutable(("FULL")),RemoteObject.createImmutable(("LEGACY")),(RemoteObject.createImmutable("LEVEL_3"))})));__ref.setField("_supported_hardware_level",camex2._supported_hardware_level);
 //BA.debugLineNum = 26;BA.debugLine="Private CONTROL_MODE As List = Array(\"OFF\", \"AUTO";
camex2._control_mode = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
camex2._control_mode = camex2.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {RemoteObject.createImmutable(("OFF")),RemoteObject.createImmutable(("AUTO")),RemoteObject.createImmutable(("USE_SCENE_MODE")),(RemoteObject.createImmutable("OFF_KEEP_STATE"))})));__ref.setField("_control_mode",camex2._control_mode);
 //BA.debugLineNum = 27;BA.debugLine="Public PrintKeys As Boolean = False";
camex2._printkeys = camex2.__c.getField(true,"False");__ref.setField("_printkeys",camex2._printkeys);
 //BA.debugLineNum = 28;BA.debugLine="Private PreviewRequest As JavaObject";
camex2._previewrequest = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_previewrequest",camex2._previewrequest);
 //BA.debugLineNum = 29;BA.debugLine="Private FocusState As String";
camex2._focusstate = RemoteObject.createImmutable("");__ref.setField("_focusstate",camex2._focusstate);
 //BA.debugLineNum = 30;BA.debugLine="Private MediaRecorder As JavaObject";
camex2._mediarecorder = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_mediarecorder",camex2._mediarecorder);
 //BA.debugLineNum = 31;BA.debugLine="Public RecordingVideo As Boolean";
camex2._recordingvideo = RemoteObject.createImmutable(false);__ref.setField("_recordingvideo",camex2._recordingvideo);
 //BA.debugLineNum = 32;BA.debugLine="Public TaskIndex As Int = 1";
camex2._taskindex = BA.numberCast(int.class, 1);__ref.setField("_taskindex",camex2._taskindex);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _closesession(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CloseSession (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("closesession")) return __ref.runUserSub(false, "camex2","closesession", __ref);
RemoteObject _session = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 72;BA.debugLine="Private Sub CloseSession";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Dim session As JavaObject = jcamera.GetFieldJO(\"c";
Debug.ShouldStop(256);
_session = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_session = __ref.getField(false,"_jcamera").runMethod(false,"GetFieldJO",(Object)(RemoteObject.createImmutable("captureSession")));Debug.locals.put("session", _session);Debug.locals.put("session", _session);
 BA.debugLineNum = 74;BA.debugLine="If session.IsInitialized Then";
Debug.ShouldStop(512);
if (_session.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 75;BA.debugLine="session.RunMethod(\"stopRepeating\", Null)";
Debug.ShouldStop(1024);
_session.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("stopRepeating")),(Object)((camex2.__c.getField(false,"Null"))));
 BA.debugLineNum = 76;BA.debugLine="session.RunMethod(\"abortCaptures\", Null)";
Debug.ShouldStop(2048);
_session.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("abortCaptures")),(Object)((camex2.__c.getField(false,"Null"))));
 BA.debugLineNum = 77;BA.debugLine="jcamera.SetField(\"captureSession\", Null)";
Debug.ShouldStop(4096);
__ref.getField(false,"_jcamera").runVoidMethod ("SetField",(Object)(BA.ObjectToString("captureSession")),(Object)(camex2.__c.getField(false,"Null")));
 };
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsurface(RemoteObject __ref) throws Exception{
ResumableSub_CreateSurface rsub = new ResumableSub_CreateSurface(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
public static class ResumableSub_CreateSurface extends BA.ResumableSub {
public ResumableSub_CreateSurface(b4a.example.camex2 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.camex2 parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CreateSurface (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("createsurface")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 144;BA.debugLine="If tv.IsInitialized Then tv.RemoveView";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.getField(false,"_tv").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref.getField(false,"_tv").runVoidMethod ("RemoveView");
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 145;BA.debugLine="tv = Camera.CreateSurface";
Debug.ShouldStop(65536);
__ref.setField ("_tv",__ref.getField(false,"_camera").runMethod(false,"CreateSurface",__ref.getField(false, "ba")));
 BA.debugLineNum = 146;BA.debugLine="mPanel.AddView(tv, 0, 0, mPanel.Width, mPanel.Hei";
Debug.ShouldStop(131072);
__ref.getField(false,"_mpanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tv").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mpanel").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mpanel").runMethod(true,"getHeight")));
 BA.debugLineNum = 147;BA.debugLine="tv.SendToBack";
Debug.ShouldStop(262144);
__ref.getField(false,"_tv").runVoidMethod ("SendToBack");
 BA.debugLineNum = 148;BA.debugLine="Wait For Camera_SurfaceReady";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","camera_surfaceready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), null);
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
 BA.debugLineNum = 149;BA.debugLine="Return True";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
public static void  _camera_surfaceready(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _datatobitmap(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("DataToBitmap (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,364);
if (RapidSub.canDelegate("datatobitmap")) return __ref.runUserSub(false, "camex2","datatobitmap", __ref, _data);
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("Data", _data);
 BA.debugLineNum = 364;BA.debugLine="Public Sub DataToBitmap(Data() As Byte) As Bitmap";
Debug.ShouldStop(2048);
 BA.debugLineNum = 365;BA.debugLine="Dim in As InputStream";
Debug.ShouldStop(4096);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("in", _in);
 BA.debugLineNum = 366;BA.debugLine="in.InitializeFromBytesArray(Data, 0, Data.Length)";
Debug.ShouldStop(8192);
_in.runVoidMethod ("InitializeFromBytesArray",(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_data.getField(true,"length")));
 BA.debugLineNum = 367;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(16384);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 368;BA.debugLine="bmp.Initialize2(in)";
Debug.ShouldStop(32768);
_bmp.runVoidMethod ("Initialize2",(Object)((_in.getObject())));
 BA.debugLineNum = 369;BA.debugLine="in.Close";
Debug.ShouldStop(65536);
_in.runVoidMethod ("Close");
 BA.debugLineNum = 370;BA.debugLine="Return bmp";
Debug.ShouldStop(131072);
if (true) return _bmp;
 BA.debugLineNum = 371;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _datatofile(RemoteObject __ref,RemoteObject _data,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("DataToFile (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,374);
if (RapidSub.canDelegate("datatofile")) return __ref.runUserSub(false, "camex2","datatofile", __ref, _data, _dir, _filename);
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("Data", _data);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 374;BA.debugLine="Public Sub DataToFile(Data() As Byte, Dir As Strin";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 375;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
Debug.ShouldStop(4194304);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = camex2.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(_dir),(Object)(_filename),(Object)(camex2.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 376;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
Debug.ShouldStop(8388608);
_out.runVoidMethod ("WriteBytes",(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_data.getField(true,"length")));
 BA.debugLineNum = 377;BA.debugLine="out.Close";
Debug.ShouldStop(16777216);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 378;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _floatstolist(RemoteObject __ref,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("FloatsToList (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,511);
if (RapidSub.canDelegate("floatstolist")) return __ref.runUserSub(false, "camex2","floatstolist", __ref, _obj);
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _f = null;
RemoteObject _ff = RemoteObject.createImmutable(0f);
Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 511;BA.debugLine="Private Sub FloatsToList (Obj As Object) As List";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 512;BA.debugLine="Dim res As List";
Debug.ShouldStop(-2147483648);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 513;BA.debugLine="res.Initialize";
Debug.ShouldStop(1);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 514;BA.debugLine="If Obj = Null Then Return res";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("n",_obj)) { 
if (true) return _res;};
 BA.debugLineNum = 515;BA.debugLine="Dim f() As Float = Obj";
Debug.ShouldStop(4);
_f = (_obj);Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 516;BA.debugLine="For Each ff As Float In f";
Debug.ShouldStop(8);
{
final RemoteObject group5 = _f;
final int groupLen5 = group5.getField(true,"length").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_ff = group5.getArrayElement(true,RemoteObject.createImmutable(index5));Debug.locals.put("ff", _ff);
Debug.locals.put("ff", _ff);
 BA.debugLineNum = 517;BA.debugLine="res.Add(ff)";
Debug.ShouldStop(16);
_res.runVoidMethod ("Add",(Object)((_ff)));
 }
}Debug.locals.put("ff", _ff);
;
 BA.debugLineNum = 519;BA.debugLine="Return res";
Debug.ShouldStop(64);
if (true) return _res;
 BA.debugLineNum = 520;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _focusandtakepicture(RemoteObject __ref,RemoteObject _mytaskindex) throws Exception{
ResumableSub_FocusAndTakePicture rsub = new ResumableSub_FocusAndTakePicture(null,__ref,_mytaskindex);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
public static class ResumableSub_FocusAndTakePicture extends BA.ResumableSub {
public ResumableSub_FocusAndTakePicture(b4a.example.camex2 parent,RemoteObject __ref,RemoteObject _mytaskindex) {
this.parent = parent;
this.__ref = __ref;
this._mytaskindex = _mytaskindex;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.camex2 parent;
RemoteObject _mytaskindex;
RemoteObject _previewfocusmode = RemoteObject.createImmutable("");
RemoteObject _previewaemode = RemoteObject.createImmutable("");
RemoteObject _previewbuilder = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _data = null;
RemoteObject _captureresult = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FocusAndTakePicture (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,270);
if (RapidSub.canDelegate("focusandtakepicture")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("MyTaskIndex", _mytaskindex);
 BA.debugLineNum = 271;BA.debugLine="Dim PreviewFocusMode As String = AF_MODE.Get(GetF";
Debug.ShouldStop(16384);
_previewfocusmode = BA.ObjectToString(__ref.getField(false,"_af_mode").runMethod(false,"Get",(Object)(BA.numberCast(int.class, __ref.runClassMethod (b4a.example.camex2.class, "_getfromcapturerequest",(Object)((__ref.getField(false,"_previewrequest").getObject())),(Object)(RemoteObject.createImmutable("CONTROL_AF_MODE")))))));Debug.locals.put("PreviewFocusMode", _previewfocusmode);Debug.locals.put("PreviewFocusMode", _previewfocusmode);
 BA.debugLineNum = 272;BA.debugLine="Dim PreviewAEMode As String = AE_MODE.Get(GetFrom";
Debug.ShouldStop(32768);
_previewaemode = BA.ObjectToString(__ref.getField(false,"_ae_mode").runMethod(false,"Get",(Object)(BA.numberCast(int.class, __ref.runClassMethod (b4a.example.camex2.class, "_getfromcapturerequest",(Object)((__ref.getField(false,"_previewrequest").getObject())),(Object)(RemoteObject.createImmutable("CONTROL_AE_MODE")))))));Debug.locals.put("PreviewAEMode", _previewaemode);Debug.locals.put("PreviewAEMode", _previewaemode);
 BA.debugLineNum = 273;BA.debugLine="If PreviewFocusMode = \"OFF\" Or PreviewFocusMode =";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_previewfocusmode,BA.ObjectToString("OFF")) || RemoteObject.solveBoolean("=",_previewfocusmode,BA.ObjectToString("EDOF"))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 275;BA.debugLine="Else if PreviewFocusMode.Contains(\"CONTINUOUS\") =";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_previewfocusmode.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("CONTINUOUS"))),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_previewaemode,BA.ObjectToString("ON_ALWAYS_FLASH"))) { 
this.state = 5;
}}
if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 274;BA.debugLine="Log(\"Focus not supported\")";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Focus not supported")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 276;BA.debugLine="Dim PreviewBuilder As JavaObject = Camera.Create";
Debug.ShouldStop(524288);
_previewbuilder = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_previewbuilder.setObject(__ref.getField(false,"_camera").runMethod(false,"CreatePreviewBuilder"));Debug.locals.put("PreviewBuilder", _previewbuilder);
 BA.debugLineNum = 277;BA.debugLine="PreviewSettingsMap.Put(\"CONTROL_AF_TRIGGER\", 1)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_previewsettingsmap").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("CONTROL_AF_TRIGGER"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 278;BA.debugLine="SetSettingsFromMap(PreviewBuilder, PreviewSettin";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.camex2.class, "_setsettingsfrommap",(Object)(_previewbuilder),(Object)(__ref.getField(false,"_previewsettingsmap")));
 BA.debugLineNum = 279;BA.debugLine="Camera.AddCaptureRequest(PreviewBuilder)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_camera").runVoidMethod ("AddCaptureRequest",(Object)((_previewbuilder.getObject())));
 BA.debugLineNum = 280;BA.debugLine="Wait For (WaitForFocusWithTimeout(5000)) Complet";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), __ref.runClassMethod (b4a.example.camex2.class, "_waitforfocuswithtimeout",(Object)(BA.numberCast(int.class, 5000))));
this.state = 13;
return;
case 13:
//C
this.state = 6;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 281;BA.debugLine="If Success = False Then";
Debug.ShouldStop(16777216);
if (true) break;

case 6:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
 BA.debugLineNum = 282;BA.debugLine="Log(\"Focus failed\")";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Focus failed")));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 284;BA.debugLine="Log(\"Focused!\")";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Focused!")));
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 286;BA.debugLine="Wait For (TakePictureNow(MyTaskIndex)) Complete";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), __ref.runClassMethod (b4a.example.camex2.class, "_takepicturenow",(Object)(_mytaskindex)));
this.state = 14;
return;
case 14:
//C
this.state = 12;
_data = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("data", _data);
;
 BA.debugLineNum = 287;BA.debugLine="Dim PreviewBuilder As JavaObject = Camera.Create";
Debug.ShouldStop(1073741824);
_previewbuilder = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_previewbuilder.setObject(__ref.getField(false,"_camera").runMethod(false,"CreatePreviewBuilder"));Debug.locals.put("PreviewBuilder", _previewbuilder);
 BA.debugLineNum = 288;BA.debugLine="PreviewSettingsMap.Put(\"CONTROL_AF_TRIGGER\", 2)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_previewsettingsmap").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("CONTROL_AF_TRIGGER"))),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 289;BA.debugLine="SetSettingsFromMap(PreviewBuilder, PreviewSettin";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.camex2.class, "_setsettingsfrommap",(Object)(_previewbuilder),(Object)(__ref.getField(false,"_previewsettingsmap")));
 BA.debugLineNum = 290;BA.debugLine="Camera.AddCaptureRequest(PreviewBuilder)";
Debug.ShouldStop(2);
__ref.getField(false,"_camera").runVoidMethod ("AddCaptureRequest",(Object)((_previewbuilder.getObject())));
 BA.debugLineNum = 291;BA.debugLine="PreviewSettingsMap.Remove(\"CONTROL_AF_TRIGGER\")";
Debug.ShouldStop(4);
__ref.getField(false,"_previewsettingsmap").runVoidMethod ("Remove",(Object)((RemoteObject.createImmutable("CONTROL_AF_TRIGGER"))));
 BA.debugLineNum = 292;BA.debugLine="Wait For (PreviewBuilder) Camera_CaptureComplete";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","camera_capturecomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_previewbuilder.getObject()));
this.state = 15;
return;
case 15:
//C
this.state = 12;
_captureresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("CaptureResult", _captureresult);
;
 BA.debugLineNum = 293;BA.debugLine="Return data";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_data));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 295;BA.debugLine="Wait For (TakePictureNow(MyTaskIndex)) Complete (";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), __ref.runClassMethod (b4a.example.camex2.class, "_takepicturenow",(Object)(_mytaskindex)));
this.state = 16;
return;
case 16:
//C
this.state = -1;
_data = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("data", _data);
;
 BA.debugLineNum = 296;BA.debugLine="Return data";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_data));return;};
 BA.debugLineNum = 297;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
public static void  _complete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static void  _camera_capturecomplete(RemoteObject __ref,RemoteObject _captureresult) throws Exception{
}
public static RemoteObject  _getactivearraysize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getActiveArraySize (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,259);
if (RapidSub.canDelegate("getactivearraysize")) return __ref.runUserSub(false, "camex2","getactivearraysize", __ref);
 BA.debugLineNum = 259;BA.debugLine="Public Sub getActiveArraySize As Rect";
Debug.ShouldStop(4);
 BA.debugLineNum = 260;BA.debugLine="Return GetFromCameraCharacteristic(\"SENSOR_INFO_A";
Debug.ShouldStop(8);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper"), __ref.runClassMethod (b4a.example.camex2.class, "_getfromcameracharacteristic",(Object)(RemoteObject.createImmutable("SENSOR_INFO_ACTIVE_ARRAY_SIZE"))));
 BA.debugLineNum = 261;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getautoexposuremode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getAutoExposureMode (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,238);
if (RapidSub.canDelegate("getautoexposuremode")) return __ref.runUserSub(false, "camex2","getautoexposuremode", __ref);
 BA.debugLineNum = 238;BA.debugLine="Public Sub getAutoExposureMode As String";
Debug.ShouldStop(8192);
 BA.debugLineNum = 239;BA.debugLine="Return IntToConst(GetFromCaptureRequest(PreviewRe";
Debug.ShouldStop(16384);
if (true) return __ref.runClassMethod (b4a.example.camex2.class, "_inttoconst",(Object)(__ref.runClassMethod (b4a.example.camex2.class, "_getfromcapturerequest",(Object)((__ref.getField(false,"_previewrequest").getObject())),(Object)(RemoteObject.createImmutable("CONTROL_AE_MODE")))),(Object)(__ref.getField(false,"_ae_mode")));
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
public static RemoteObject  _getcontrolmode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getControlMode (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,242);
if (RapidSub.canDelegate("getcontrolmode")) return __ref.runUserSub(false, "camex2","getcontrolmode", __ref);
 BA.debugLineNum = 242;BA.debugLine="Public Sub getControlMode As String";
Debug.ShouldStop(131072);
 BA.debugLineNum = 243;BA.debugLine="Return IntToConst(GetFromCaptureRequest(PreviewRe";
Debug.ShouldStop(262144);
if (true) return __ref.runClassMethod (b4a.example.camex2.class, "_inttoconst",(Object)(__ref.runClassMethod (b4a.example.camex2.class, "_getfromcapturerequest",(Object)((__ref.getField(false,"_previewrequest").getObject())),(Object)(RemoteObject.createImmutable("CONTROL_MODE")))),(Object)(__ref.getField(false,"_control_mode")));
 BA.debugLineNum = 244;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _geteffectmode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getEffectMode (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("geteffectmode")) return __ref.runUserSub(false, "camex2","geteffectmode", __ref);
 BA.debugLineNum = 194;BA.debugLine="Public Sub getEffectMode As String";
Debug.ShouldStop(2);
 BA.debugLineNum = 195;BA.debugLine="Return IntToConst(GetFromCaptureRequest(PreviewRe";
Debug.ShouldStop(4);
if (true) return __ref.runClassMethod (b4a.example.camex2.class, "_inttoconst",(Object)(__ref.runClassMethod (b4a.example.camex2.class, "_getfromcapturerequest",(Object)((__ref.getField(false,"_previewrequest").getObject())),(Object)(RemoteObject.createImmutable("CONTROL_EFFECT_MODE")))),(Object)(__ref.getField(false,"_effect_mode")));
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfocusmode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getFocusMode (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,219);
if (RapidSub.canDelegate("getfocusmode")) return __ref.runUserSub(false, "camex2","getfocusmode", __ref);
 BA.debugLineNum = 219;BA.debugLine="Public Sub getFocusMode As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 220;BA.debugLine="Return IntToConst(GetFromCaptureRequest(PreviewRe";
Debug.ShouldStop(134217728);
if (true) return __ref.runClassMethod (b4a.example.camex2.class, "_inttoconst",(Object)(__ref.runClassMethod (b4a.example.camex2.class, "_getfromcapturerequest",(Object)((__ref.getField(false,"_previewrequest").getObject())),(Object)(RemoteObject.createImmutable("CONTROL_AF_MODE")))),(Object)(__ref.getField(false,"_af_mode")));
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfromcameracharacteristic(RemoteObject __ref,RemoteObject _field) throws Exception{
try {
		Debug.PushSubsStack("GetFromCameraCharacteristic (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,385);
if (RapidSub.canDelegate("getfromcameracharacteristic")) return __ref.runUserSub(false, "camex2","getfromcameracharacteristic", __ref, _field);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Field", _field);
 BA.debugLineNum = 385;BA.debugLine="Private Sub GetFromCameraCharacteristic (Field As";
Debug.ShouldStop(1);
 BA.debugLineNum = 386;BA.debugLine="Dim jo As JavaObject = Camera.GetCameraCharacteri";
Debug.ShouldStop(2);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(__ref.getField(false,"_camera").runMethod(false,"GetCameraCharacteristics",(Object)(__ref.getField(true,"_id"))));Debug.locals.put("jo", _jo);
 BA.debugLineNum = 387;BA.debugLine="Return jo.RunMethod(\"get\", Array(StaticCameraChar";
Debug.ShouldStop(4);
if (true) return _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("get")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.getField(false,"_staticcameracharacteristics").runMethod(false,"GetField",(Object)(_field))})));
 BA.debugLineNum = 388;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfromcapturerequest(RemoteObject __ref,RemoteObject _capturerequest,RemoteObject _field) throws Exception{
try {
		Debug.PushSubsStack("GetFromCaptureRequest (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,395);
if (RapidSub.canDelegate("getfromcapturerequest")) return __ref.runUserSub(false, "camex2","getfromcapturerequest", __ref, _capturerequest, _field);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("CaptureRequest", _capturerequest);
Debug.locals.put("Field", _field);
 BA.debugLineNum = 395;BA.debugLine="Private Sub GetFromCaptureRequest(CaptureRequest A";
Debug.ShouldStop(1024);
 BA.debugLineNum = 396;BA.debugLine="Dim jo As JavaObject = CaptureRequest";
Debug.ShouldStop(2048);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(_capturerequest);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 397;BA.debugLine="Return jo.RunMethod(\"get\", Array(StaticCaptureReq";
Debug.ShouldStop(4096);
if (true) return _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("get")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.getField(false,"_staticcapturerequest").runMethod(false,"GetField",(Object)(_field))})));
 BA.debugLineNum = 398;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfromcaptureresult(RemoteObject __ref,RemoteObject _captureresult,RemoteObject _field) throws Exception{
try {
		Debug.PushSubsStack("GetFromCaptureResult (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,390);
if (RapidSub.canDelegate("getfromcaptureresult")) return __ref.runUserSub(false, "camex2","getfromcaptureresult", __ref, _captureresult, _field);
RemoteObject _jresult = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("CaptureResult", _captureresult);
Debug.locals.put("Field", _field);
 BA.debugLineNum = 390;BA.debugLine="Private Sub GetFromCaptureResult(CaptureResult As";
Debug.ShouldStop(32);
 BA.debugLineNum = 391;BA.debugLine="Dim jresult As JavaObject = CaptureResult";
Debug.ShouldStop(64);
_jresult = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jresult.setObject(_captureresult);Debug.locals.put("jresult", _jresult);
 BA.debugLineNum = 392;BA.debugLine="Return jresult.RunMethod(\"get\", Array(StaticCaptu";
Debug.ShouldStop(128);
if (true) return _jresult.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("get")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.getField(false,"_staticcaptureresult").runMethod(false,"GetField",(Object)(_field))})));
 BA.debugLineNum = 393;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gethintorientation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetHintOrientation (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("gethintorientation")) return __ref.runUserSub(false, "camex2","gethintorientation", __ref);
RemoteObject _sensororientation = RemoteObject.createImmutable(0);
RemoteObject _front = RemoteObject.createImmutable(0);
RemoteObject _orientation = RemoteObject.createImmutable(0);
 BA.debugLineNum = 117;BA.debugLine="Private Sub GetHintOrientation As Int";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="Dim SensorOrientation As Int = GetFromCameraChara";
Debug.ShouldStop(2097152);
_sensororientation = BA.numberCast(int.class, __ref.runClassMethod (b4a.example.camex2.class, "_getfromcameracharacteristic",(Object)(RemoteObject.createImmutable("SENSOR_ORIENTATION"))));Debug.locals.put("SensorOrientation", _sensororientation);Debug.locals.put("SensorOrientation", _sensororientation);
 BA.debugLineNum = 119;BA.debugLine="Dim front As Int = -1";
Debug.ShouldStop(4194304);
_front = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("front", _front);Debug.locals.put("front", _front);
 BA.debugLineNum = 120;BA.debugLine="If getIsFrontFacingCamera Then front = 1";
Debug.ShouldStop(8388608);
if (__ref.runClassMethod (b4a.example.camex2.class, "_getisfrontfacingcamera").<Boolean>get().booleanValue()) { 
_front = BA.numberCast(int.class, 1);Debug.locals.put("front", _front);};
 BA.debugLineNum = 121;BA.debugLine="Dim orientation As Int = (SensorOrientation + jca";
Debug.ShouldStop(16777216);
_orientation = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_sensororientation,BA.numberCast(double.class, __ref.getField(false,"_jcamera").runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("lastKnownOrientation")))),_front,RemoteObject.createImmutable(360)}, "+*+",2, 0)),RemoteObject.createImmutable(360)}, "%",0, 0));Debug.locals.put("orientation", _orientation);Debug.locals.put("orientation", _orientation);
 BA.debugLineNum = 122;BA.debugLine="Return orientation";
Debug.ShouldStop(33554432);
if (true) return _orientation;
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getisfrontfacingcamera(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getIsFrontFacingCamera (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,381);
if (RapidSub.canDelegate("getisfrontfacingcamera")) return __ref.runUserSub(false, "camex2","getisfrontfacingcamera", __ref);
 BA.debugLineNum = 381;BA.debugLine="Public Sub getIsFrontFacingCamera As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 382;BA.debugLine="Return GetFromCameraCharacteristic(\"LENS_FACING\")";
Debug.ShouldStop(536870912);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.runClassMethod (b4a.example.camex2.class, "_getfromcameracharacteristic",(Object)(RemoteObject.createImmutable("LENS_FACING"))),RemoteObject.createImmutable((0))));
 BA.debugLineNum = 383;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmaxdigitalzoom(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getMaxDigitalZoom (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,228);
if (RapidSub.canDelegate("getmaxdigitalzoom")) return __ref.runUserSub(false, "camex2","getmaxdigitalzoom", __ref);
 BA.debugLineNum = 228;BA.debugLine="Public Sub getMaxDigitalZoom As Float";
Debug.ShouldStop(8);
 BA.debugLineNum = 229;BA.debugLine="Return GetFromCameraCharacteristic(\"SCALER_AVAILA";
Debug.ShouldStop(16);
if (true) return BA.numberCast(float.class, __ref.runClassMethod (b4a.example.camex2.class, "_getfromcameracharacteristic",(Object)(RemoteObject.createImmutable("SCALER_AVAILABLE_MAX_DIGITAL_ZOOM"))));
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpreviewbitmap(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("GetPreviewBitmap (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,356);
if (RapidSub.canDelegate("getpreviewbitmap")) return __ref.runUserSub(false, "camex2","getpreviewbitmap", __ref, _width, _height);
RemoteObject _mbmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 356;BA.debugLine="Public Sub GetPreviewBitmap(Width As Int, Height A";
Debug.ShouldStop(8);
 BA.debugLineNum = 357;BA.debugLine="Dim mbmp As Bitmap";
Debug.ShouldStop(16);
_mbmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("mbmp", _mbmp);
 BA.debugLineNum = 358;BA.debugLine="mbmp.InitializeMutable(Width, Height)";
Debug.ShouldStop(32);
_mbmp.runVoidMethod ("InitializeMutable",(Object)(_width),(Object)(_height));
 BA.debugLineNum = 359;BA.debugLine="Dim jo As JavaObject = tv";
Debug.ShouldStop(64);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(__ref.getField(false,"_tv").getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 360;BA.debugLine="Return jo.RunMethod(\"getBitmap\", Array(mbmp))";
Debug.ShouldStop(128);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getBitmap")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_mbmp.getObject())}))));
 BA.debugLineNum = 361;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscenemode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSceneMode (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("getscenemode")) return __ref.runUserSub(false, "camex2","getscenemode", __ref);
 BA.debugLineNum = 186;BA.debugLine="Public Sub getSceneMode As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 187;BA.debugLine="Return IntToConst(GetFromCaptureRequest(PreviewRe";
Debug.ShouldStop(67108864);
if (true) return __ref.runClassMethod (b4a.example.camex2.class, "_inttoconst",(Object)(__ref.runClassMethod (b4a.example.camex2.class, "_getfromcapturerequest",(Object)((__ref.getField(false,"_previewrequest").getObject())),(Object)(RemoteObject.createImmutable("CONTROL_SCENE_MODE")))),(Object)(__ref.getField(false,"_scene_mode")));
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedautoexposuremodes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSupportedAutoExposureModes (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,233);
if (RapidSub.canDelegate("getsupportedautoexposuremodes")) return __ref.runUserSub(false, "camex2","getsupportedautoexposuremodes", __ref);
 BA.debugLineNum = 233;BA.debugLine="Public Sub getSupportedAutoExposureModes As List";
Debug.ShouldStop(256);
 BA.debugLineNum = 234;BA.debugLine="Return IntsToConstsList(GetFromCameraCharacterist";
Debug.ShouldStop(512);
if (true) return __ref.runClassMethod (b4a.example.camex2.class, "_intstoconstslist",(Object)(__ref.runClassMethod (b4a.example.camex2.class, "_getfromcameracharacteristic",(Object)(RemoteObject.createImmutable("CONTROL_AE_AVAILABLE_MODES")))),(Object)(__ref.getField(false,"_ae_mode")));
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedcapturesizes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSupportedCaptureSizes (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("getsupportedcapturesizes")) return __ref.runUserSub(false, "camex2","getsupportedcapturesizes", __ref);
 BA.debugLineNum = 170;BA.debugLine="Public Sub getSupportedCaptureSizes As List";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="Return Camera.GetSupportedCaptureSizes(id)";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_camera").runMethod(false,"GetSupportedCaptureSizes",(Object)(__ref.getField(true,"_id")));
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedeffectmodes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSupportedEffectModes (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,198);
if (RapidSub.canDelegate("getsupportedeffectmodes")) return __ref.runUserSub(false, "camex2","getsupportedeffectmodes", __ref);
 BA.debugLineNum = 198;BA.debugLine="Public Sub getSupportedEffectModes As List";
Debug.ShouldStop(32);
 BA.debugLineNum = 199;BA.debugLine="Return IntsToConstsList(GetFromCameraCharacterist";
Debug.ShouldStop(64);
if (true) return __ref.runClassMethod (b4a.example.camex2.class, "_intstoconstslist",(Object)(__ref.runClassMethod (b4a.example.camex2.class, "_getfromcameracharacteristic",(Object)(RemoteObject.createImmutable("CONTROL_AVAILABLE_EFFECTS")))),(Object)(__ref.getField(false,"_effect_mode")));
 BA.debugLineNum = 200;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedfocusmodes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSupportedFocusModes (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("getsupportedfocusmodes")) return __ref.runUserSub(false, "camex2","getsupportedfocusmodes", __ref);
 BA.debugLineNum = 202;BA.debugLine="Public Sub getSupportedFocusModes As List";
Debug.ShouldStop(512);
 BA.debugLineNum = 203;BA.debugLine="Return RemoveDuplicates(IntsToConstsList(GetFromC";
Debug.ShouldStop(1024);
if (true) return __ref.runClassMethod (b4a.example.camex2.class, "_removeduplicates",(Object)(__ref.runClassMethod (b4a.example.camex2.class, "_intstoconstslist",(Object)(__ref.runClassMethod (b4a.example.camex2.class, "_getfromcameracharacteristic",(Object)(RemoteObject.createImmutable("CONTROL_AF_AVAILABLE_MODES")))),(Object)(__ref.getField(false,"_af_mode")))));
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedhardwarelevel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSupportedHardwareLevel (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("getsupportedhardwarelevel")) return __ref.runUserSub(false, "camex2","getsupportedhardwarelevel", __ref);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 82;BA.debugLine="Public Sub getSupportedHardwareLevel As String";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="Dim jo As JavaObject = Camera.GetCameraCharacteri";
Debug.ShouldStop(262144);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(__ref.getField(false,"_camera").runMethod(false,"GetCameraCharacteristics",(Object)(BA.NumberToString(0))));Debug.locals.put("jo", _jo);
 BA.debugLineNum = 84;BA.debugLine="Return IntToConst(jo.RunMethod(\"get\", Array(Stati";
Debug.ShouldStop(524288);
if (true) return __ref.runClassMethod (b4a.example.camex2.class, "_inttoconst",(Object)(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("get")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.getField(false,"_staticcameracharacteristics").runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("INFO_SUPPORTED_HARDWARE_LEVEL")))})))),(Object)(__ref.getField(false,"_supported_hardware_level")));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedpreviewsizes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSupportedPreviewSizes (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,166);
if (RapidSub.canDelegate("getsupportedpreviewsizes")) return __ref.runUserSub(false, "camex2","getsupportedpreviewsizes", __ref);
 BA.debugLineNum = 166;BA.debugLine="Public Sub getSupportedPreviewSizes As List";
Debug.ShouldStop(32);
 BA.debugLineNum = 167;BA.debugLine="Return Camera.GetSupportedPreviewSizes(id)";
Debug.ShouldStop(64);
if (true) return __ref.getField(false,"_camera").runMethod(false,"GetSupportedPreviewSizes",(Object)(__ref.getField(true,"_id")));
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedscenemodes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSupportedSceneModes (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,178);
if (RapidSub.canDelegate("getsupportedscenemodes")) return __ref.runUserSub(false, "camex2","getsupportedscenemodes", __ref);
 BA.debugLineNum = 178;BA.debugLine="Public Sub getSupportedSceneModes As List";
Debug.ShouldStop(131072);
 BA.debugLineNum = 179;BA.debugLine="Return RemoveDuplicates(IntsToConstsList(GetFromC";
Debug.ShouldStop(262144);
if (true) return __ref.runClassMethod (b4a.example.camex2.class, "_removeduplicates",(Object)(__ref.runClassMethod (b4a.example.camex2.class, "_intstoconstslist",(Object)(__ref.runClassMethod (b4a.example.camex2.class, "_getfromcameracharacteristic",(Object)(RemoteObject.createImmutable("CONTROL_AVAILABLE_SCENE_MODES")))),(Object)(__ref.getField(false,"_scene_mode")))));
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedvideosizes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSupportedVideoSizes (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,174);
if (RapidSub.canDelegate("getsupportedvideosizes")) return __ref.runUserSub(false, "camex2","getsupportedvideosizes", __ref);
 BA.debugLineNum = 174;BA.debugLine="Public Sub getSupportedVideoSizes As List";
Debug.ShouldStop(8192);
 BA.debugLineNum = 175;BA.debugLine="Return Camera.GetSupportedVideoSizes(id)";
Debug.ShouldStop(16384);
if (true) return __ref.getField(false,"_camera").runMethod(false,"GetSupportedVideoSizes",(Object)(__ref.getField(true,"_id")));
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _camerapanel) throws Exception{
try {
		Debug.PushSubsStack("Initialize (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "camex2","initialize", __ref, _ba, _camerapanel);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("CameraPanel", _camerapanel);
 BA.debugLineNum = 35;BA.debugLine="Public Sub Initialize (CameraPanel As Panel)";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="mPanel = CameraPanel";
Debug.ShouldStop(8);
__ref.setField ("_mpanel",_camerapanel);
 BA.debugLineNum = 37;BA.debugLine="Camera.Initialize(\"Camera\")";
Debug.ShouldStop(16);
__ref.getField(false,"_camera").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Camera")));
 BA.debugLineNum = 38;BA.debugLine="jcamera = Camera";
Debug.ShouldStop(32);
__ref.getField(false,"_jcamera").setObject (__ref.getField(false,"_camera"));
 BA.debugLineNum = 39;BA.debugLine="PreviewSize.Initialize(640, 480)";
Debug.ShouldStop(64);
__ref.getField(false,"_previewsize").runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 640)),(Object)(BA.numberCast(int.class, 480)));
 BA.debugLineNum = 40;BA.debugLine="CaptureSize.Initialize(1920, 1080)";
Debug.ShouldStop(128);
__ref.getField(false,"_capturesize").runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 1920)),(Object)(BA.numberCast(int.class, 1080)));
 BA.debugLineNum = 41;BA.debugLine="StaticCaptureRequest.InitializeStatic(\"android.ha";
Debug.ShouldStop(256);
__ref.getField(false,"_staticcapturerequest").runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.hardware.camera2.CaptureRequest")));
 BA.debugLineNum = 42;BA.debugLine="StaticCameraCharacteristics.InitializeStatic(\"and";
Debug.ShouldStop(512);
__ref.getField(false,"_staticcameracharacteristics").runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.hardware.camera2.CameraCharacteristics")));
 BA.debugLineNum = 43;BA.debugLine="StaticCaptureResult.InitializeStatic(\"android.har";
Debug.ShouldStop(1024);
__ref.getField(false,"_staticcaptureresult").runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.hardware.camera2.CaptureResult")));
 BA.debugLineNum = 44;BA.debugLine="PreviewSettingsMap.Initialize";
Debug.ShouldStop(2048);
__ref.getField(false,"_previewsettingsmap").runVoidMethod ("Initialize");
 BA.debugLineNum = 45;BA.debugLine="CaptureSettingMap.Initialize";
Debug.ShouldStop(4096);
__ref.getField(false,"_capturesettingmap").runVoidMethod ("Initialize");
 BA.debugLineNum = 46;BA.debugLine="bothMaps = Array(PreviewSettingsMap, CaptureSetti";
Debug.ShouldStop(8192);
__ref.setField ("_bothmaps",camex2.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(false,"_previewsettingsmap").getObject()),(__ref.getField(false,"_capturesettingmap").getObject())}))));
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
public static RemoteObject  _intstoconstslist(RemoteObject __ref,RemoteObject _ints,RemoteObject _consts) throws Exception{
try {
		Debug.PushSubsStack("IntsToConstsList (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,413);
if (RapidSub.canDelegate("intstoconstslist")) return __ref.runUserSub(false, "camex2","intstoconstslist", __ref, _ints, _consts);
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _f = null;
RemoteObject _mode = RemoteObject.createImmutable(0);
Debug.locals.put("Ints", _ints);
Debug.locals.put("Consts", _consts);
 BA.debugLineNum = 413;BA.debugLine="Private Sub IntsToConstsList (Ints As Object, Cons";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 414;BA.debugLine="Dim res As List";
Debug.ShouldStop(536870912);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 415;BA.debugLine="res.Initialize";
Debug.ShouldStop(1073741824);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 416;BA.debugLine="If Ints = Null Then Return res";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("n",_ints)) { 
if (true) return _res;};
 BA.debugLineNum = 417;BA.debugLine="Dim f() As Int = Ints";
Debug.ShouldStop(1);
_f = (_ints);Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 418;BA.debugLine="For Each mode As Int In f";
Debug.ShouldStop(2);
{
final RemoteObject group5 = _f;
final int groupLen5 = group5.getField(true,"length").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_mode = group5.getArrayElement(true,RemoteObject.createImmutable(index5));Debug.locals.put("mode", _mode);
Debug.locals.put("mode", _mode);
 BA.debugLineNum = 419;BA.debugLine="If mode >=0 And mode < Consts.Size Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("g",_mode,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("<",_mode,BA.numberCast(double.class, _consts.runMethod(true,"getSize")))) { 
 BA.debugLineNum = 420;BA.debugLine="res.Add(Consts.Get(mode))";
Debug.ShouldStop(8);
_res.runVoidMethod ("Add",(Object)(_consts.runMethod(false,"Get",(Object)(_mode))));
 }else {
 BA.debugLineNum = 422;BA.debugLine="Log(Consts) 'ignore";
Debug.ShouldStop(32);
camex2.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_consts)));
 BA.debugLineNum = 423;BA.debugLine="Log(\"Unknown consts: \" & mode)";
Debug.ShouldStop(64);
camex2.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Unknown consts: "),_mode)));
 };
 }
}Debug.locals.put("mode", _mode);
;
 BA.debugLineNum = 426;BA.debugLine="Return res";
Debug.ShouldStop(512);
if (true) return _res;
 BA.debugLineNum = 427;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _intstolist(RemoteObject __ref,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("IntsToList (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,500);
if (RapidSub.canDelegate("intstolist")) return __ref.runUserSub(false, "camex2","intstolist", __ref, _obj);
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _i = null;
RemoteObject _ii = RemoteObject.createImmutable(0);
Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 500;BA.debugLine="Private Sub IntsToList (Obj As Object) As List";
Debug.ShouldStop(524288);
 BA.debugLineNum = 501;BA.debugLine="Dim res As List";
Debug.ShouldStop(1048576);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 502;BA.debugLine="res.Initialize";
Debug.ShouldStop(2097152);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 503;BA.debugLine="If Obj = Null Then Return res";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("n",_obj)) { 
if (true) return _res;};
 BA.debugLineNum = 504;BA.debugLine="Dim i() As Int = Obj";
Debug.ShouldStop(8388608);
_i = (_obj);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 505;BA.debugLine="For Each ii As Int In i";
Debug.ShouldStop(16777216);
{
final RemoteObject group5 = _i;
final int groupLen5 = group5.getField(true,"length").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_ii = group5.getArrayElement(true,RemoteObject.createImmutable(index5));Debug.locals.put("ii", _ii);
Debug.locals.put("ii", _ii);
 BA.debugLineNum = 506;BA.debugLine="res.Add(ii)";
Debug.ShouldStop(33554432);
_res.runVoidMethod ("Add",(Object)((_ii)));
 }
}Debug.locals.put("ii", _ii);
;
 BA.debugLineNum = 508;BA.debugLine="Return res";
Debug.ShouldStop(134217728);
if (true) return _res;
 BA.debugLineNum = 509;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _inttoconst(RemoteObject __ref,RemoteObject _int1,RemoteObject _consts) throws Exception{
try {
		Debug.PushSubsStack("IntToConst (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,401);
if (RapidSub.canDelegate("inttoconst")) return __ref.runUserSub(false, "camex2","inttoconst", __ref, _int1, _consts);
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("Int1", _int1);
Debug.locals.put("Consts", _consts);
 BA.debugLineNum = 401;BA.debugLine="Private Sub IntToConst (Int1 As Object, Consts As";
Debug.ShouldStop(65536);
 BA.debugLineNum = 402;BA.debugLine="If Int1 = Null Then Return \"\"";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("n",_int1)) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 403;BA.debugLine="Dim i As Int = Int1";
Debug.ShouldStop(262144);
_i = BA.numberCast(int.class, _int1);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 404;BA.debugLine="If i >= 0 And i < Consts.Size Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("g",_i,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("<",_i,BA.numberCast(double.class, _consts.runMethod(true,"getSize")))) { 
 BA.debugLineNum = 405;BA.debugLine="Return Consts.Get(i)";
Debug.ShouldStop(1048576);
if (true) return BA.ObjectToString(_consts.runMethod(false,"Get",(Object)(_i)));
 }else {
 BA.debugLineNum = 407;BA.debugLine="Log(Consts)'ignore";
Debug.ShouldStop(4194304);
camex2.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_consts)));
 BA.debugLineNum = 408;BA.debugLine="Log(\"Unknown const: \" & i)";
Debug.ShouldStop(8388608);
camex2.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Unknown const: "),_i)));
 BA.debugLineNum = 409;BA.debugLine="Return \"\"";
Debug.ShouldStop(16777216);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 411;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _objectstolist(RemoteObject __ref,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("ObjectsToList (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,466);
if (RapidSub.canDelegate("objectstolist")) return __ref.runUserSub(false, "camex2","objectstolist", __ref, _obj);
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _o = null;
RemoteObject _oo = RemoteObject.declareNull("Object");
Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 466;BA.debugLine="Private Sub ObjectsToList(Obj As Object) As List";
Debug.ShouldStop(131072);
 BA.debugLineNum = 467;BA.debugLine="Dim res As List";
Debug.ShouldStop(262144);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 468;BA.debugLine="res.Initialize";
Debug.ShouldStop(524288);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 469;BA.debugLine="If Obj = Null Then Return res";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("n",_obj)) { 
if (true) return _res;};
 BA.debugLineNum = 470;BA.debugLine="Dim o() As Object = Obj";
Debug.ShouldStop(2097152);
_o = (_obj);Debug.locals.put("o", _o);Debug.locals.put("o", _o);
 BA.debugLineNum = 471;BA.debugLine="For Each oo As Object In o";
Debug.ShouldStop(4194304);
{
final RemoteObject group5 = _o;
final int groupLen5 = group5.getField(true,"length").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_oo = group5.getArrayElement(false,RemoteObject.createImmutable(index5));Debug.locals.put("oo", _oo);
Debug.locals.put("oo", _oo);
 BA.debugLineNum = 472;BA.debugLine="res.Add(oo)";
Debug.ShouldStop(8388608);
_res.runVoidMethod ("Add",(Object)(_oo));
 }
}Debug.locals.put("oo", _oo);
;
 BA.debugLineNum = 474;BA.debugLine="Return res";
Debug.ShouldStop(33554432);
if (true) return _res;
 BA.debugLineNum = 475;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _opencamera(RemoteObject __ref,RemoteObject _front) throws Exception{
ResumableSub_OpenCamera rsub = new ResumableSub_OpenCamera(null,__ref,_front);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
public static class ResumableSub_OpenCamera extends BA.ResumableSub {
public ResumableSub_OpenCamera(b4a.example.camex2 parent,RemoteObject __ref,RemoteObject _front) {
this.parent = parent;
this.__ref = __ref;
this._front = _front;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.camex2 parent;
RemoteObject _front;
RemoteObject _open = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("OpenCamera (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("opencamera")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Front", _front);
 BA.debugLineNum = 52;BA.debugLine="TaskIndex = TaskIndex + 1";
Debug.ShouldStop(524288);
__ref.setField ("_taskindex",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_taskindex"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 53;BA.debugLine="If Camera.IsCameraOpen Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 4;
if (__ref.getField(false,"_camera").runMethod(true,"getIsCameraOpen").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 54;BA.debugLine="Stop";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.camex2.class, "_stop");
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 56;BA.debugLine="mFront = Front";
Debug.ShouldStop(8388608);
__ref.setField ("_mfront",_front);
 BA.debugLineNum = 57;BA.debugLine="id = Camera.FindCameraId(mFront)";
Debug.ShouldStop(16777216);
__ref.setField ("_id",__ref.getField(false,"_camera").runMethod(true,"FindCameraId",(Object)(__ref.getField(true,"_mfront"))));
 BA.debugLineNum = 58;BA.debugLine="If id = \"\" Then";
Debug.ShouldStop(33554432);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_id"),BA.ObjectToString(""))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 59;BA.debugLine="Log(\"Camera not found.\")";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Camera not found.")));
 BA.debugLineNum = 60;BA.debugLine="id = Camera.CameraIDs(0)";
Debug.ShouldStop(134217728);
__ref.setField ("_id",__ref.getField(false,"_camera").runMethod(false,"getCameraIDs").getArrayElement(true,BA.numberCast(int.class, 0)));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 62;BA.debugLine="Camera.OpenCamera(id)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_camera").runVoidMethod ("OpenCamera",(Object)(__ref.getField(true,"_id")));
 BA.debugLineNum = 63;BA.debugLine="Wait For Camera_CameraState (Open As Boolean)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","camera_camerastate", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), null);
this.state = 18;
return;
case 18:
//C
this.state = 9;
_open = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Open", _open);
;
 BA.debugLineNum = 64;BA.debugLine="If Open = False Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_open,parent.__c.getField(true,"False"))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 65;BA.debugLine="Log(\"Failed to open camera\")";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Failed to open camera")));
 BA.debugLineNum = 66;BA.debugLine="Return 0";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((0)));return;};
 if (true) break;
;
 BA.debugLineNum = 68;BA.debugLine="If PrintKeys Then PrintAllKeys(Camera.GetCameraCh";
Debug.ShouldStop(8);

case 12:
//if
this.state = 17;
if (__ref.getField(true,"_printkeys").<Boolean>get().booleanValue()) { 
this.state = 14;
;}if (true) break;

case 14:
//C
this.state = 17;
__ref.runClassMethod (b4a.example.camex2.class, "_printallkeys",(Object)(__ref.getField(false,"_camera").runMethod(false,"GetCameraCharacteristics",(Object)(__ref.getField(true,"_id")))),(Object)(RemoteObject.createImmutable("Camera Characteristics")));
if (true) break;

case 17:
//C
this.state = -1;
;
 BA.debugLineNum = 69;BA.debugLine="Return TaskIndex";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(__ref.getField(true,"_taskindex")));return;};
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static void  _camera_camerastate(RemoteObject __ref,RemoteObject _open) throws Exception{
}
public static RemoteObject  _preparesurface(RemoteObject __ref,RemoteObject _mytaskindex) throws Exception{
ResumableSub_PrepareSurface rsub = new ResumableSub_PrepareSurface(null,__ref,_mytaskindex);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
public static class ResumableSub_PrepareSurface extends BA.ResumableSub {
public ResumableSub_PrepareSurface(b4a.example.camex2 parent,RemoteObject __ref,RemoteObject _mytaskindex) {
this.parent = parent;
this.__ref = __ref;
this._mytaskindex = _mytaskindex;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.camex2 parent;
RemoteObject _mytaskindex;
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PrepareSurface (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("preparesurface")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("MyTaskIndex", _mytaskindex);
 BA.debugLineNum = 90;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_mytaskindex,BA.numberCast(double.class, __ref.getField(true,"_taskindex")))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 91;BA.debugLine="CloseSession";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.example.camex2.class, "_closesession");
 BA.debugLineNum = 92;BA.debugLine="Wait For (CreateSurface) Complete (Result As Bool";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), __ref.runClassMethod (b4a.example.camex2.class, "_createsurface"));
this.state = 19;
return;
case 19:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 93;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
Debug.ShouldStop(268435456);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_mytaskindex,BA.numberCast(double.class, __ref.getField(true,"_taskindex")))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 94;BA.debugLine="Camera.StartSession(tv, PreviewSize, CaptureSize,";
Debug.ShouldStop(536870912);
__ref.getField(false,"_camera").runVoidMethod ("StartSession",(Object)((__ref.getField(false,"_tv").getObject())),(Object)(__ref.getField(false,"_previewsize")),(Object)(__ref.getField(false,"_capturesize")),(Object)(BA.numberCast(int.class, 256)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 95;BA.debugLine="Wait For Camera_SessionConfigured (Success As Boo";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","camera_sessionconfigured", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), null);
this.state = 20;
return;
case 20:
//C
this.state = 13;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 96;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
Debug.ShouldStop(-2147483648);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("!",_mytaskindex,BA.numberCast(double.class, __ref.getField(true,"_taskindex")))) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 97;BA.debugLine="Return Success";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_success));return;};
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
public static void  _camera_sessionconfigured(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static RemoteObject  _preparesurfaceforvideo(RemoteObject __ref,RemoteObject _mytaskindex,RemoteObject _dir,RemoteObject _filename) throws Exception{
ResumableSub_PrepareSurfaceForVideo rsub = new ResumableSub_PrepareSurfaceForVideo(null,__ref,_mytaskindex,_dir,_filename);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
public static class ResumableSub_PrepareSurfaceForVideo extends BA.ResumableSub {
public ResumableSub_PrepareSurfaceForVideo(b4a.example.camex2 parent,RemoteObject __ref,RemoteObject _mytaskindex,RemoteObject _dir,RemoteObject _filename) {
this.parent = parent;
this.__ref = __ref;
this._mytaskindex = _mytaskindex;
this._dir = _dir;
this._filename = _filename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.camex2 parent;
RemoteObject _mytaskindex;
RemoteObject _dir;
RemoteObject _filename;
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PrepareSurfaceForVideo (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("preparesurfaceforvideo")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("MyTaskIndex", _mytaskindex);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 104;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_mytaskindex,BA.numberCast(double.class, __ref.getField(true,"_taskindex")))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 105;BA.debugLine="CloseSession";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.camex2.class, "_closesession");
 BA.debugLineNum = 106;BA.debugLine="Wait For (CreateSurface) Complete (Result As Bool";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), __ref.runClassMethod (b4a.example.camex2.class, "_createsurface"));
this.state = 19;
return;
case 19:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 107;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
Debug.ShouldStop(1024);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_mytaskindex,BA.numberCast(double.class, __ref.getField(true,"_taskindex")))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 108;BA.debugLine="File.Delete(Dir, FileName)";
Debug.ShouldStop(2048);
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(_dir),(Object)(_filename));
 BA.debugLineNum = 109;BA.debugLine="MediaRecorder = Camera.CreateMediaRecorder(Previe";
Debug.ShouldStop(4096);
__ref.getField(false,"_mediarecorder").setObject (__ref.getField(false,"_camera").runMethod(false,"CreateMediaRecorder",(Object)(__ref.getField(false,"_previewsize")),(Object)(_dir),(Object)(_filename)));
 BA.debugLineNum = 110;BA.debugLine="MediaRecorder.RunMethod(\"setOrientationHint\", Arr";
Debug.ShouldStop(8192);
__ref.getField(false,"_mediarecorder").runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setOrientationHint")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.runClassMethod (b4a.example.camex2.class, "_gethintorientation"))})));
 BA.debugLineNum = 111;BA.debugLine="Camera.StartSession(tv, PreviewSize, CaptureSize,";
Debug.ShouldStop(16384);
__ref.getField(false,"_camera").runVoidMethod ("StartSession",(Object)((__ref.getField(false,"_tv").getObject())),(Object)(__ref.getField(false,"_previewsize")),(Object)(__ref.getField(false,"_capturesize")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 112;BA.debugLine="Wait For Camera_SessionConfigured (Success As Boo";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","camera_sessionconfigured", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), null);
this.state = 20;
return;
case 20:
//C
this.state = 13;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 113;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
Debug.ShouldStop(65536);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("!",_mytaskindex,BA.numberCast(double.class, __ref.getField(true,"_taskindex")))) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 114;BA.debugLine="Return Success";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_success));return;};
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
public static RemoteObject  _printallkeys(RemoteObject __ref,RemoteObject _cameramap,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("PrintAllKeys (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,444);
if (RapidSub.canDelegate("printallkeys")) return __ref.runUserSub(false, "camex2","printallkeys", __ref, _cameramap, _title);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _keys = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _k = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _value = RemoteObject.declareNull("Object");
RemoteObject _typ = RemoteObject.createImmutable("");
Debug.locals.put("CameraMap", _cameramap);
Debug.locals.put("title", _title);
 BA.debugLineNum = 444;BA.debugLine="Private Sub PrintAllKeys (CameraMap As Object, tit";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 445;BA.debugLine="Log($\"******  ${title} **********\"$)";
Debug.ShouldStop(268435456);
camex2.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("******  "),camex2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_title))),RemoteObject.createImmutable(" **********")))));
 BA.debugLineNum = 446;BA.debugLine="Dim jo As JavaObject = CameraMap";
Debug.ShouldStop(536870912);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(_cameramap);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 447;BA.debugLine="Dim keys As List = jo.RunMethod(\"getKeys\", Null)";
Debug.ShouldStop(1073741824);
_keys = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_keys.setObject(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getKeys")),(Object)((camex2.__c.getField(false,"Null")))));Debug.locals.put("keys", _keys);
 BA.debugLineNum = 448;BA.debugLine="For Each k As JavaObject In keys";
Debug.ShouldStop(-2147483648);
_k = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
{
final RemoteObject group4 = _keys;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k.setObject(group4.runMethod(false,"Get",index4));
Debug.locals.put("k", _k);
 BA.debugLineNum = 449;BA.debugLine="Dim value As Object = jo.RunMethod(\"get\", Array(";
Debug.ShouldStop(1);
_value = _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("get")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_k.getObject())})));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 450;BA.debugLine="If value = Null Then Continue";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("n",_value)) { 
if (true) continue;};
 BA.debugLineNum = 451;BA.debugLine="Dim typ As String = GetType(value)";
Debug.ShouldStop(4);
_typ = camex2.__c.runMethod(true,"GetType",(Object)(_value));Debug.locals.put("typ", _typ);Debug.locals.put("typ", _typ);
 BA.debugLineNum = 452;BA.debugLine="If typ = \"[F\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_typ,BA.ObjectToString("[F"))) { 
 BA.debugLineNum = 453;BA.debugLine="value = FloatsToList(value)";
Debug.ShouldStop(16);
_value = (__ref.runClassMethod (b4a.example.camex2.class, "_floatstolist",(Object)(_value)).getObject());Debug.locals.put("value", _value);
 }else 
{ BA.debugLineNum = 454;BA.debugLine="Else If typ = \"[I\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_typ,BA.ObjectToString("[I"))) { 
 BA.debugLineNum = 455;BA.debugLine="value = IntsToList(value)";
Debug.ShouldStop(64);
_value = (__ref.runClassMethod (b4a.example.camex2.class, "_intstolist",(Object)(_value)).getObject());Debug.locals.put("value", _value);
 }else 
{ BA.debugLineNum = 456;BA.debugLine="Else If typ = \"[Z\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_typ,BA.ObjectToString("[Z"))) { 
 BA.debugLineNum = 457;BA.debugLine="value = BoolsToList(value)";
Debug.ShouldStop(256);
_value = (__ref.runClassMethod (b4a.example.camex2.class, "_boolstolist",(Object)(_value)).getObject());Debug.locals.put("value", _value);
 }else 
{ BA.debugLineNum = 458;BA.debugLine="Else If typ = \"[B\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_typ,BA.ObjectToString("[B"))) { 
 BA.debugLineNum = 459;BA.debugLine="value = BytesToList(value)";
Debug.ShouldStop(1024);
_value = (__ref.runClassMethod (b4a.example.camex2.class, "_bytestolist",(Object)(_value)).getObject());Debug.locals.put("value", _value);
 }else 
{ BA.debugLineNum = 460;BA.debugLine="Else if typ.StartsWith(\"[\") Then";
Debug.ShouldStop(2048);
if (_typ.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("["))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 461;BA.debugLine="value = ObjectsToList(value)";
Debug.ShouldStop(4096);
_value = (__ref.runClassMethod (b4a.example.camex2.class, "_objectstolist",(Object)(_value)).getObject());Debug.locals.put("value", _value);
 }}}}}
;
 BA.debugLineNum = 463;BA.debugLine="Log($\"${k.RunMethod(\"getName\", Null)}: ${value}\"";
Debug.ShouldStop(16384);
camex2.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),camex2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_k.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getName")),(Object)((camex2.__c.getField(false,"Null")))))),RemoteObject.createImmutable(": "),camex2.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_value)),RemoteObject.createImmutable("")))));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 465;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeduplicates(RemoteObject __ref,RemoteObject _raw) throws Exception{
try {
		Debug.PushSubsStack("RemoveDuplicates (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,206);
if (RapidSub.canDelegate("removeduplicates")) return __ref.runUserSub(false, "camex2","removeduplicates", __ref, _raw);
RemoteObject _unique = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _f = RemoteObject.createImmutable("");
Debug.locals.put("Raw", _raw);
 BA.debugLineNum = 206;BA.debugLine="Private Sub RemoveDuplicates(Raw As List) As List";
Debug.ShouldStop(8192);
 BA.debugLineNum = 207;BA.debugLine="Dim unique As Map";
Debug.ShouldStop(16384);
_unique = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("unique", _unique);
 BA.debugLineNum = 208;BA.debugLine="unique.Initialize";
Debug.ShouldStop(32768);
_unique.runVoidMethod ("Initialize");
 BA.debugLineNum = 209;BA.debugLine="For Each f As String In Raw";
Debug.ShouldStop(65536);
{
final RemoteObject group3 = _raw;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_f = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("f", _f);
Debug.locals.put("f", _f);
 BA.debugLineNum = 210;BA.debugLine="unique.Put(f, \"\")";
Debug.ShouldStop(131072);
_unique.runVoidMethod ("Put",(Object)((_f)),(Object)((RemoteObject.createImmutable(""))));
 }
}Debug.locals.put("f", _f);
;
 BA.debugLineNum = 212;BA.debugLine="Raw.Clear";
Debug.ShouldStop(524288);
_raw.runVoidMethod ("Clear");
 BA.debugLineNum = 213;BA.debugLine="For Each f As String In unique.Keys";
Debug.ShouldStop(1048576);
{
final RemoteObject group7 = _unique.runMethod(false,"Keys");
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_f = BA.ObjectToString(group7.runMethod(false,"Get",index7));Debug.locals.put("f", _f);
Debug.locals.put("f", _f);
 BA.debugLineNum = 214;BA.debugLine="Raw.Add(f)";
Debug.ShouldStop(2097152);
_raw.runVoidMethod ("Add",(Object)((_f)));
 }
}Debug.locals.put("f", _f);
;
 BA.debugLineNum = 216;BA.debugLine="Return Raw";
Debug.ShouldStop(8388608);
if (true) return _raw;
 BA.debugLineNum = 217;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setautoexposuremode(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("setAutoExposureMode (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,245);
if (RapidSub.canDelegate("setautoexposuremode")) return __ref.runUserSub(false, "camex2","setautoexposuremode", __ref, _mode);
Debug.locals.put("Mode", _mode);
 BA.debugLineNum = 245;BA.debugLine="Public Sub setAutoExposureMode (Mode As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 246;BA.debugLine="SetBothMaps(\"CONTROL_AE_MODE\", AE_MODE.IndexOf(Mo";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.camex2.class, "_setbothmaps",(Object)(BA.ObjectToString("CONTROL_AE_MODE")),(Object)((__ref.getField(false,"_ae_mode").runMethod(true,"IndexOf",(Object)((_mode))))));
 BA.debugLineNum = 247;BA.debugLine="PreviewSettingsMap.Put(\"FLASH_MODE\", FLASH_MODE.I";
Debug.ShouldStop(4194304);
__ref.getField(false,"_previewsettingsmap").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FLASH_MODE"))),(Object)((__ref.getField(false,"_flash_mode").runMethod(true,"IndexOf",(Object)((RemoteObject.createImmutable("OFF")))))));
 BA.debugLineNum = 248;BA.debugLine="If Mode = \"ON_ALWAYS_FLASH\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_mode,BA.ObjectToString("ON_ALWAYS_FLASH"))) { 
 BA.debugLineNum = 249;BA.debugLine="CaptureSettingMap.Put(\"FLASH_MODE\", FLASH_MODE.I";
Debug.ShouldStop(16777216);
__ref.getField(false,"_capturesettingmap").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FLASH_MODE"))),(Object)((__ref.getField(false,"_flash_mode").runMethod(true,"IndexOf",(Object)((RemoteObject.createImmutable("SINGLE")))))));
 };
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbothmaps(RemoteObject __ref,RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetBothMaps (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,263);
if (RapidSub.canDelegate("setbothmaps")) return __ref.runUserSub(false, "camex2","setbothmaps", __ref, _key, _value);
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 263;BA.debugLine="Private Sub SetBothMaps(Key As String, Value As Ob";
Debug.ShouldStop(64);
 BA.debugLineNum = 264;BA.debugLine="For Each m As Map In bothMaps";
Debug.ShouldStop(128);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group1 = __ref.getField(false,"_bothmaps");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_m.setObject(group1.runMethod(false,"Get",index1));
Debug.locals.put("m", _m);
 BA.debugLineNum = 265;BA.debugLine="m.Put(Key, Value)";
Debug.ShouldStop(256);
_m.runVoidMethod ("Put",(Object)((_key)),(Object)(_value));
 }
}Debug.locals.put("m", _m);
;
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
public static RemoteObject  _seteffectmode(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("setEffectMode (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("seteffectmode")) return __ref.runUserSub(false, "camex2","seteffectmode", __ref, _mode);
Debug.locals.put("Mode", _mode);
 BA.debugLineNum = 190;BA.debugLine="Public Sub setEffectMode(Mode As String)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 191;BA.debugLine="SetBothMaps(\"CONTROL_EFFECT_MODE\", EFFECT_MODE.In";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.camex2.class, "_setbothmaps",(Object)(BA.ObjectToString("CONTROL_EFFECT_MODE")),(Object)((__ref.getField(false,"_effect_mode").runMethod(true,"IndexOf",(Object)((_mode))))));
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfocusmode(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("setFocusMode (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,223);
if (RapidSub.canDelegate("setfocusmode")) return __ref.runUserSub(false, "camex2","setfocusmode", __ref, _mode);
Debug.locals.put("mode", _mode);
 BA.debugLineNum = 223;BA.debugLine="Public Sub setFocusMode(mode As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 224;BA.debugLine="SetBothMaps(\"CONTROL_AF_MODE\", AF_MODE.IndexOf(mo";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4a.example.camex2.class, "_setbothmaps",(Object)(BA.ObjectToString("CONTROL_AF_MODE")),(Object)((__ref.getField(false,"_af_mode").runMethod(true,"IndexOf",(Object)((_mode))))));
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpreviewcropregion(RemoteObject __ref,RemoteObject _r) throws Exception{
try {
		Debug.PushSubsStack("setPreviewCropRegion (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,254);
if (RapidSub.canDelegate("setpreviewcropregion")) return __ref.runUserSub(false, "camex2","setpreviewcropregion", __ref, _r);
Debug.locals.put("r", _r);
 BA.debugLineNum = 254;BA.debugLine="Public Sub setPreviewCropRegion(r As Rect)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 255;BA.debugLine="PreviewSettingsMap.Put(\"SCALER_CROP_REGION\", r)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_previewsettingsmap").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("SCALER_CROP_REGION"))),(Object)((_r.getObject())));
 BA.debugLineNum = 256;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscenemode(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("setSceneMode (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("setscenemode")) return __ref.runUserSub(false, "camex2","setscenemode", __ref, _mode);
Debug.locals.put("Mode", _mode);
 BA.debugLineNum = 182;BA.debugLine="Public Sub setSceneMode(Mode As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="SetBothMaps(\"CONTROL_SCENE_MODE\", SCENE_MODE.Inde";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4a.example.camex2.class, "_setbothmaps",(Object)(BA.ObjectToString("CONTROL_SCENE_MODE")),(Object)((__ref.getField(false,"_scene_mode").runMethod(true,"IndexOf",(Object)((_mode))))));
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsettingsfrommap(RemoteObject __ref,RemoteObject _builder,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetSettingsFromMap (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,429);
if (RapidSub.canDelegate("setsettingsfrommap")) return __ref.runUserSub(false, "camex2","setsettingsfrommap", __ref, _builder, _m);
RemoteObject _key = RemoteObject.createImmutable("");
Debug.locals.put("Builder", _builder);
Debug.locals.put("m", _m);
 BA.debugLineNum = 429;BA.debugLine="Private Sub SetSettingsFromMap (Builder As JavaObj";
Debug.ShouldStop(4096);
 BA.debugLineNum = 430;BA.debugLine="For Each key As String In m.Keys";
Debug.ShouldStop(8192);
{
final RemoteObject group1 = _m.runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 431;BA.debugLine="Builder.RunMethod(\"set\", Array(StaticCaptureRequ";
Debug.ShouldStop(16384);
_builder.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("set")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {__ref.getField(false,"_staticcapturerequest").runMethod(false,"GetField",(Object)(_key)),_m.runMethod(false,"Get",(Object)((_key)))})));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 433;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startpreview(RemoteObject __ref,RemoteObject _mytaskindex,RemoteObject _videorecording) throws Exception{
try {
		Debug.PushSubsStack("StartPreview (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("startpreview")) return __ref.runUserSub(false, "camex2","startpreview", __ref, _mytaskindex, _videorecording);
RemoteObject _previewbuilder = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("MyTaskIndex", _mytaskindex);
Debug.locals.put("VideoRecording", _videorecording);
 BA.debugLineNum = 153;BA.debugLine="Public Sub StartPreview (MyTaskIndex As Int, Video";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 154;BA.debugLine="Dim PreviewBuilder As JavaObject";
Debug.ShouldStop(33554432);
_previewbuilder = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("PreviewBuilder", _previewbuilder);
 BA.debugLineNum = 155;BA.debugLine="If VideoRecording Then";
Debug.ShouldStop(67108864);
if (_videorecording.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 156;BA.debugLine="PreviewBuilder = Camera.CreateVideoRequestBuilde";
Debug.ShouldStop(134217728);
_previewbuilder.setObject(__ref.getField(false,"_camera").runMethod(false,"CreateVideoRequestBuilder"));
 }else {
 BA.debugLineNum = 158;BA.debugLine="PreviewBuilder = Camera.CreatePreviewBuilder";
Debug.ShouldStop(536870912);
_previewbuilder.setObject(__ref.getField(false,"_camera").runMethod(false,"CreatePreviewBuilder"));
 };
 BA.debugLineNum = 160;BA.debugLine="SetSettingsFromMap(PreviewBuilder, PreviewSetting";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4a.example.camex2.class, "_setsettingsfrommap",(Object)(_previewbuilder),(Object)(__ref.getField(false,"_previewsettingsmap")));
 BA.debugLineNum = 161;BA.debugLine="PreviewRequest = Camera.SetRepeatingRequest(Previ";
Debug.ShouldStop(1);
__ref.getField(false,"_previewrequest").setObject (__ref.getField(false,"_camera").runMethod(false,"SetRepeatingRequest",(Object)((_previewbuilder.getObject()))));
 BA.debugLineNum = 162;BA.debugLine="If PrintKeys Then PrintAllKeys(PreviewRequest, \"P";
Debug.ShouldStop(2);
if (__ref.getField(true,"_printkeys").<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4a.example.camex2.class, "_printallkeys",(Object)((__ref.getField(false,"_previewrequest").getObject())),(Object)(RemoteObject.createImmutable("Preview Capture Request")));};
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startvideorecording(RemoteObject __ref,RemoteObject _mytaskindex) throws Exception{
try {
		Debug.PushSubsStack("StartVideoRecording (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("startvideorecording")) return __ref.runUserSub(false, "camex2","startvideorecording", __ref, _mytaskindex);
Debug.locals.put("MyTaskIndex", _mytaskindex);
 BA.debugLineNum = 126;BA.debugLine="Public Sub StartVideoRecording (MyTaskIndex As Int";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",_mytaskindex,BA.numberCast(double.class, __ref.getField(true,"_taskindex")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 128;BA.debugLine="MediaRecorder.RunMethod(\"start\", Null)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mediarecorder").runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("start")),(Object)((camex2.__c.getField(false,"Null"))));
 BA.debugLineNum = 129;BA.debugLine="RecordingVideo = True";
Debug.ShouldStop(1);
__ref.setField ("_recordingvideo",camex2.__c.getField(true,"True"));
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Stop (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,435);
if (RapidSub.canDelegate("stop")) return __ref.runUserSub(false, "camex2","stop", __ref);
 BA.debugLineNum = 435;BA.debugLine="Public Sub Stop";
Debug.ShouldStop(262144);
 BA.debugLineNum = 436;BA.debugLine="RecordingVideo = False";
Debug.ShouldStop(524288);
__ref.setField ("_recordingvideo",camex2.__c.getField(true,"False"));
 BA.debugLineNum = 437;BA.debugLine="Camera.Stop";
Debug.ShouldStop(1048576);
__ref.getField(false,"_camera").runVoidMethod ("Stop");
 BA.debugLineNum = 438;BA.debugLine="TaskIndex = TaskIndex + 1";
Debug.ShouldStop(2097152);
__ref.setField ("_taskindex",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_taskindex"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 439;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stopvideorecording(RemoteObject __ref,RemoteObject _mytaskindex) throws Exception{
try {
		Debug.PushSubsStack("StopVideoRecording (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("stopvideorecording")) return __ref.runUserSub(false, "camex2","stopvideorecording", __ref, _mytaskindex);
Debug.locals.put("MyTaskIndex", _mytaskindex);
 BA.debugLineNum = 133;BA.debugLine="Public Sub StopVideoRecording (MyTaskIndex As Int)";
Debug.ShouldStop(16);
 BA.debugLineNum = 134;BA.debugLine="CloseSession";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.camex2.class, "_closesession");
 BA.debugLineNum = 135;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 136;BA.debugLine="MediaRecorder.RunMethod(\"stop\", Null)";
Debug.ShouldStop(128);
__ref.getField(false,"_mediarecorder").runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("stop")),(Object)((camex2.__c.getField(false,"Null"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e5.toString()); BA.debugLineNum = 138;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
camex2.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(camex2.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 };
 BA.debugLineNum = 140;BA.debugLine="RecordingVideo = False";
Debug.ShouldStop(2048);
__ref.setField ("_recordingvideo",camex2.__c.getField(true,"False"));
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _takepicturenow(RemoteObject __ref,RemoteObject _mytaskindex) throws Exception{
ResumableSub_TakePictureNow rsub = new ResumableSub_TakePictureNow(null,__ref,_mytaskindex);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
public static class ResumableSub_TakePictureNow extends BA.ResumableSub {
public ResumableSub_TakePictureNow(b4a.example.camex2 parent,RemoteObject __ref,RemoteObject _mytaskindex) {
this.parent = parent;
this.__ref = __ref;
this._mytaskindex = _mytaskindex;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.camex2 parent;
RemoteObject _mytaskindex;
RemoteObject _builder = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _capturerequest = RemoteObject.declareNull("Object");
RemoteObject _data = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TakePictureNow (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,315);
if (RapidSub.canDelegate("takepicturenow")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("MyTaskIndex", _mytaskindex);
 BA.debugLineNum = 316;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_mytaskindex,BA.numberCast(double.class, __ref.getField(true,"_taskindex")))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 317;BA.debugLine="Camera.AbortCaptures";
Debug.ShouldStop(268435456);
__ref.getField(false,"_camera").runVoidMethod ("AbortCaptures");
 BA.debugLineNum = 318;BA.debugLine="Dim builder As JavaObject = Camera.CreateCaptureB";
Debug.ShouldStop(536870912);
_builder = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_builder.setObject(__ref.getField(false,"_camera").runMethod(false,"CreateCaptureBuilder"));Debug.locals.put("builder", _builder);
 BA.debugLineNum = 319;BA.debugLine="CaptureSettingMap.Put(\"JPEG_ORIENTATION\", GetHint";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_capturesettingmap").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("JPEG_ORIENTATION"))),(Object)((__ref.runClassMethod (b4a.example.camex2.class, "_gethintorientation"))));
 BA.debugLineNum = 320;BA.debugLine="SetSettingsFromMap(builder, CaptureSettingMap)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4a.example.camex2.class, "_setsettingsfrommap",(Object)(_builder),(Object)(__ref.getField(false,"_capturesettingmap")));
 BA.debugLineNum = 321;BA.debugLine="Dim CaptureRequest As Object = Camera.AddCaptureR";
Debug.ShouldStop(1);
_capturerequest = __ref.getField(false,"_camera").runMethod(false,"AddCaptureRequest",(Object)((_builder.getObject())));Debug.locals.put("CaptureRequest", _capturerequest);Debug.locals.put("CaptureRequest", _capturerequest);
 BA.debugLineNum = 322;BA.debugLine="If PrintKeys Then PrintAllKeys(CaptureRequest, \"C";
Debug.ShouldStop(2);
if (true) break;

case 7:
//if
this.state = 12;
if (__ref.getField(true,"_printkeys").<Boolean>get().booleanValue()) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
__ref.runClassMethod (b4a.example.camex2.class, "_printallkeys",(Object)(_capturerequest),(Object)(RemoteObject.createImmutable("Capture Request")));
if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 323;BA.debugLine="Wait For Camera_PictureTaken (Data() As Byte)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","camera_picturetaken", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), null);
this.state = 13;
return;
case 13:
//C
this.state = -1;
_data = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Data", _data);
;
 BA.debugLineNum = 324;BA.debugLine="StartPreview(MyTaskIndex, False)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.camex2.class, "_startpreview",(Object)(_mytaskindex),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 325;BA.debugLine="Return Data";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_data));return;};
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static void  _camera_picturetaken(RemoteObject __ref,RemoteObject _data) throws Exception{
}
public static RemoteObject  _takepicturesnow(RemoteObject __ref,RemoteObject _mytaskindex,RemoteObject _numberofpictures) throws Exception{
ResumableSub_TakePicturesNow rsub = new ResumableSub_TakePicturesNow(null,__ref,_mytaskindex,_numberofpictures);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
public static class ResumableSub_TakePicturesNow extends BA.ResumableSub {
public ResumableSub_TakePicturesNow(b4a.example.camex2 parent,RemoteObject __ref,RemoteObject _mytaskindex,RemoteObject _numberofpictures) {
this.parent = parent;
this.__ref = __ref;
this._mytaskindex = _mytaskindex;
this._numberofpictures = _numberofpictures;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.camex2 parent;
RemoteObject _mytaskindex;
RemoteObject _numberofpictures;
RemoteObject _builder = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _data = null;
int step8;
int limit8;
int step11;
int limit11;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TakePicturesNow (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,334);
if (RapidSub.canDelegate("takepicturesnow")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("MyTaskIndex", _mytaskindex);
Debug.locals.put("NumberOfPictures", _numberofpictures);
 BA.debugLineNum = 335;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_mytaskindex,BA.numberCast(double.class, __ref.getField(true,"_taskindex")))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 336;BA.debugLine="Camera.AbortCaptures";
Debug.ShouldStop(32768);
__ref.getField(false,"_camera").runVoidMethod ("AbortCaptures");
 BA.debugLineNum = 337;BA.debugLine="Dim builder As JavaObject = Camera.CreateCaptureB";
Debug.ShouldStop(65536);
_builder = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_builder.setObject(__ref.getField(false,"_camera").runMethod(false,"CreateCaptureBuilder"));Debug.locals.put("builder", _builder);
 BA.debugLineNum = 338;BA.debugLine="CaptureSettingMap.Put(\"JPEG_ORIENTATION\", GetHint";
Debug.ShouldStop(131072);
__ref.getField(false,"_capturesettingmap").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("JPEG_ORIENTATION"))),(Object)((__ref.runClassMethod (b4a.example.camex2.class, "_gethintorientation"))));
 BA.debugLineNum = 339;BA.debugLine="SetSettingsFromMap(builder, CaptureSettingMap)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.camex2.class, "_setsettingsfrommap",(Object)(_builder),(Object)(__ref.getField(false,"_capturesettingmap")));
 BA.debugLineNum = 340;BA.debugLine="Dim result As List";
Debug.ShouldStop(524288);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("result", _result);
 BA.debugLineNum = 341;BA.debugLine="result.Initialize";
Debug.ShouldStop(1048576);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 342;BA.debugLine="For i = 1 To NumberOfPictures";
Debug.ShouldStop(2097152);
if (true) break;

case 7:
//for
this.state = 10;
step8 = 1;
limit8 = _numberofpictures.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 14;
if (true) break;

case 14:
//C
this.state = 10;
if ((step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8)) this.state = 9;
if (true) break;

case 15:
//C
this.state = 14;
_i = ((int)(0 + _i + step8)) ;
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 15;
 BA.debugLineNum = 343;BA.debugLine="Camera.AddCaptureRequest(builder)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_camera").runVoidMethod ("AddCaptureRequest",(Object)((_builder.getObject())));
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 345;BA.debugLine="For i = 1 To NumberOfPictures";
Debug.ShouldStop(16777216);

case 10:
//for
this.state = 13;
step11 = 1;
limit11 = _numberofpictures.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 16;
if (true) break;

case 16:
//C
this.state = 13;
if ((step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11)) this.state = 12;
if (true) break;

case 17:
//C
this.state = 16;
_i = ((int)(0 + _i + step11)) ;
Debug.locals.put("i", _i);
if (true) break;

case 12:
//C
this.state = 17;
 BA.debugLineNum = 346;BA.debugLine="Wait For Camera_PictureTaken (Data() As Byte)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","camera_picturetaken", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), null);
this.state = 18;
return;
case 18:
//C
this.state = 17;
_data = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Data", _data);
;
 BA.debugLineNum = 347;BA.debugLine="result.Add(Data)";
Debug.ShouldStop(67108864);
_result.runVoidMethod ("Add",(Object)((_data)));
 if (true) break;
if (true) break;

case 13:
//C
this.state = -1;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 349;BA.debugLine="StartPreview(MyTaskIndex, False)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.camex2.class, "_startpreview",(Object)(_mytaskindex),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 350;BA.debugLine="Return result";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_result));return;};
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
public static RemoteObject  _waitforfocuswithtimeout(RemoteObject __ref,RemoteObject _timeoutms) throws Exception{
ResumableSub_WaitForFocusWithTimeout rsub = new ResumableSub_WaitForFocusWithTimeout(null,__ref,_timeoutms);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
public static class ResumableSub_WaitForFocusWithTimeout extends BA.ResumableSub {
public ResumableSub_WaitForFocusWithTimeout(b4a.example.camex2 parent,RemoteObject __ref,RemoteObject _timeoutms) {
this.parent = parent;
this.__ref = __ref;
this._timeoutms = _timeoutms;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.camex2 parent;
RemoteObject _timeoutms;
RemoteObject _start = RemoteObject.createImmutable(0L);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("WaitForFocusWithTimeout (camex2) ","camex2",28,__ref.getField(false, "ba"),__ref,299);
if (RapidSub.canDelegate("waitforfocuswithtimeout")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("TimeoutMs", _timeoutms);
 BA.debugLineNum = 300;BA.debugLine="Dim start As Long = DateTime.Now";
Debug.ShouldStop(2048);
_start = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("start", _start);Debug.locals.put("start", _start);
 BA.debugLineNum = 301;BA.debugLine="Do Until FocusState = \"FOCUSED_LOCKED\" Or FocusSt";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//do until
this.state = 10;
while (!(RemoteObject.solveBoolean("=",__ref.getField(true,"_focusstate"),BA.ObjectToString("FOCUSED_LOCKED")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_focusstate"),BA.ObjectToString("NOT_FOCUSED_LOCKED")))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 302;BA.debugLine="Sleep(50)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this),BA.numberCast(int.class, 50));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
 BA.debugLineNum = 303;BA.debugLine="If DateTime.Now - start > TimeoutMs Then Return";
Debug.ShouldStop(16384);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),_start}, "-",1, 2),BA.numberCast(double.class, _timeoutms))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 9:
//C
this.state = 1;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 305;BA.debugLine="Return FocusState = \"FOCUSED_LOCKED\"";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((RemoteObject.solveBoolean("=",__ref.getField(true,"_focusstate"),BA.ObjectToString("FOCUSED_LOCKED")))));return;};
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
}