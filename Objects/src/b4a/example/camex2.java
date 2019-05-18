package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class camex2 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.camex2");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.camex2.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.Camera2 _camera = null;
public anywheresoftware.b4j.object.JavaObject _jcamera = null;
public String _id = "";
public boolean _mfront = false;
public anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper _previewsize = null;
public anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper _capturesize = null;
public anywheresoftware.b4a.objects.collections.Map _previewsettingsmap = null;
public anywheresoftware.b4a.objects.collections.Map _capturesettingmap = null;
public anywheresoftware.b4a.objects.collections.List _bothmaps = null;
public anywheresoftware.b4a.objects.PanelWrapper _mpanel = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper _tv = null;
public anywheresoftware.b4j.object.JavaObject _staticcapturerequest = null;
public anywheresoftware.b4j.object.JavaObject _staticcameracharacteristics = null;
public anywheresoftware.b4j.object.JavaObject _staticcaptureresult = null;
public anywheresoftware.b4a.objects.collections.List _af_state = null;
public anywheresoftware.b4a.objects.collections.List _flash_state = null;
public anywheresoftware.b4a.objects.collections.List _af_mode = null;
public anywheresoftware.b4a.objects.collections.List _ae_mode = null;
public anywheresoftware.b4a.objects.collections.List _flash_mode = null;
public anywheresoftware.b4a.objects.collections.List _scene_mode = null;
public anywheresoftware.b4a.objects.collections.List _effect_mode = null;
public anywheresoftware.b4a.objects.collections.List _supported_hardware_level = null;
public anywheresoftware.b4a.objects.collections.List _control_mode = null;
public boolean _printkeys = false;
public anywheresoftware.b4j.object.JavaObject _previewrequest = null;
public String _focusstate = "";
public anywheresoftware.b4j.object.JavaObject _mediarecorder = null;
public boolean _recordingvideo = false;
public int _taskindex = 0;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.officedetail _officedetail = null;
public b4a.example.functionall _functionall = null;
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
public String  _initialize(b4a.example.camex2 __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.PanelWrapper _camerapanel) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba,_camerapanel});
RDebugUtils.currentLine=24903680;
 //BA.debugLineNum = 24903680;BA.debugLine="Public Sub Initialize (CameraPanel As Panel)";
RDebugUtils.currentLine=24903681;
 //BA.debugLineNum = 24903681;BA.debugLine="mPanel = CameraPanel";
__ref._mpanel = _camerapanel;
RDebugUtils.currentLine=24903682;
 //BA.debugLineNum = 24903682;BA.debugLine="Camera.Initialize(\"Camera\")";
__ref._camera.Initialize(ba,"Camera");
RDebugUtils.currentLine=24903683;
 //BA.debugLineNum = 24903683;BA.debugLine="jcamera = Camera";
__ref._jcamera.setObject((java.lang.Object)(__ref._camera));
RDebugUtils.currentLine=24903684;
 //BA.debugLineNum = 24903684;BA.debugLine="PreviewSize.Initialize(640, 480)";
__ref._previewsize.Initialize((int) (640),(int) (480));
RDebugUtils.currentLine=24903685;
 //BA.debugLineNum = 24903685;BA.debugLine="CaptureSize.Initialize(1920, 1080)";
__ref._capturesize.Initialize((int) (1920),(int) (1080));
RDebugUtils.currentLine=24903686;
 //BA.debugLineNum = 24903686;BA.debugLine="StaticCaptureRequest.InitializeStatic(\"android.ha";
__ref._staticcapturerequest.InitializeStatic("android.hardware.camera2.CaptureRequest");
RDebugUtils.currentLine=24903687;
 //BA.debugLineNum = 24903687;BA.debugLine="StaticCameraCharacteristics.InitializeStatic(\"and";
__ref._staticcameracharacteristics.InitializeStatic("android.hardware.camera2.CameraCharacteristics");
RDebugUtils.currentLine=24903688;
 //BA.debugLineNum = 24903688;BA.debugLine="StaticCaptureResult.InitializeStatic(\"android.har";
__ref._staticcaptureresult.InitializeStatic("android.hardware.camera2.CaptureResult");
RDebugUtils.currentLine=24903689;
 //BA.debugLineNum = 24903689;BA.debugLine="PreviewSettingsMap.Initialize";
__ref._previewsettingsmap.Initialize();
RDebugUtils.currentLine=24903690;
 //BA.debugLineNum = 24903690;BA.debugLine="CaptureSettingMap.Initialize";
__ref._capturesettingmap.Initialize();
RDebugUtils.currentLine=24903691;
 //BA.debugLineNum = 24903691;BA.debugLine="bothMaps = Array(PreviewSettingsMap, CaptureSetti";
__ref._bothmaps = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__ref._previewsettingsmap.getObject()),(Object)(__ref._capturesettingmap.getObject())});
RDebugUtils.currentLine=24903692;
 //BA.debugLineNum = 24903692;BA.debugLine="End Sub";
return "";
}
public String  _getsupportedhardwarelevel(b4a.example.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getsupportedhardwarelevel"))
	return (String) Debug.delegate(ba, "getsupportedhardwarelevel", null);
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=25100288;
 //BA.debugLineNum = 25100288;BA.debugLine="Public Sub getSupportedHardwareLevel As String";
RDebugUtils.currentLine=25100289;
 //BA.debugLineNum = 25100289;BA.debugLine="Dim jo As JavaObject = Camera.GetCameraCharacteri";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(__ref._camera.GetCameraCharacteristics(BA.NumberToString(0))));
RDebugUtils.currentLine=25100290;
 //BA.debugLineNum = 25100290;BA.debugLine="Return IntToConst(jo.RunMethod(\"get\", Array(Stati";
if (true) return __ref._inttoconst(null,_jo.RunMethod("get",new Object[]{__ref._staticcameracharacteristics.GetField("INFO_SUPPORTED_HARDWARE_LEVEL")}),__ref._supported_hardware_level);
RDebugUtils.currentLine=25100291;
 //BA.debugLineNum = 25100291;BA.debugLine="End Sub";
return "";
}
public String  _stop(b4a.example.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "stop"))
	return (String) Debug.delegate(ba, "stop", null);
RDebugUtils.currentLine=27983872;
 //BA.debugLineNum = 27983872;BA.debugLine="Public Sub Stop";
RDebugUtils.currentLine=27983873;
 //BA.debugLineNum = 27983873;BA.debugLine="RecordingVideo = False";
__ref._recordingvideo = __c.False;
RDebugUtils.currentLine=27983874;
 //BA.debugLineNum = 27983874;BA.debugLine="Camera.Stop";
__ref._camera.Stop();
RDebugUtils.currentLine=27983875;
 //BA.debugLineNum = 27983875;BA.debugLine="TaskIndex = TaskIndex + 1";
__ref._taskindex = (int) (__ref._taskindex+1);
RDebugUtils.currentLine=27983876;
 //BA.debugLineNum = 27983876;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper  _getactivearraysize(b4a.example.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getactivearraysize"))
	return (anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper) Debug.delegate(ba, "getactivearraysize", null);
RDebugUtils.currentLine=26869760;
 //BA.debugLineNum = 26869760;BA.debugLine="Public Sub getActiveArraySize As Rect";
RDebugUtils.currentLine=26869761;
 //BA.debugLineNum = 26869761;BA.debugLine="Return GetFromCameraCharacteristic(\"SENSOR_INFO_A";
if (true) return (anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper(), (android.graphics.Rect)(__ref._getfromcameracharacteristic(null,"SENSOR_INFO_ACTIVE_ARRAY_SIZE")));
RDebugUtils.currentLine=26869762;
 //BA.debugLineNum = 26869762;BA.debugLine="End Sub";
return null;
}
public float  _getmaxdigitalzoom(b4a.example.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getmaxdigitalzoom"))
	return (Float) Debug.delegate(ba, "getmaxdigitalzoom", null);
RDebugUtils.currentLine=26476544;
 //BA.debugLineNum = 26476544;BA.debugLine="Public Sub getMaxDigitalZoom As Float";
RDebugUtils.currentLine=26476545;
 //BA.debugLineNum = 26476545;BA.debugLine="Return GetFromCameraCharacteristic(\"SCALER_AVAILA";
if (true) return (float)(BA.ObjectToNumber(__ref._getfromcameracharacteristic(null,"SCALER_AVAILABLE_MAX_DIGITAL_ZOOM")));
RDebugUtils.currentLine=26476546;
 //BA.debugLineNum = 26476546;BA.debugLine="End Sub";
return 0f;
}
public String  _setpreviewcropregion(b4a.example.camex2 __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _r) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "setpreviewcropregion"))
	return (String) Debug.delegate(ba, "setpreviewcropregion", new Object[] {_r});
RDebugUtils.currentLine=26804224;
 //BA.debugLineNum = 26804224;BA.debugLine="Public Sub setPreviewCropRegion(r As Rect)";
RDebugUtils.currentLine=26804225;
 //BA.debugLineNum = 26804225;BA.debugLine="PreviewSettingsMap.Put(\"SCALER_CROP_REGION\", r)";
__ref._previewsettingsmap.Put((Object)("SCALER_CROP_REGION"),(Object)(_r.getObject()));
RDebugUtils.currentLine=26804226;
 //BA.debugLineNum = 26804226;BA.debugLine="End Sub";
return "";
}
public String  _startpreview(b4a.example.camex2 __ref,int _mytaskindex,boolean _videorecording) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "startpreview"))
	return (String) Debug.delegate(ba, "startpreview", new Object[] {_mytaskindex,_videorecording});
anywheresoftware.b4j.object.JavaObject _previewbuilder = null;
RDebugUtils.currentLine=25559040;
 //BA.debugLineNum = 25559040;BA.debugLine="Public Sub StartPreview (MyTaskIndex As Int, Video";
RDebugUtils.currentLine=25559041;
 //BA.debugLineNum = 25559041;BA.debugLine="Dim PreviewBuilder As JavaObject";
_previewbuilder = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=25559042;
 //BA.debugLineNum = 25559042;BA.debugLine="If VideoRecording Then";
if (_videorecording) { 
RDebugUtils.currentLine=25559043;
 //BA.debugLineNum = 25559043;BA.debugLine="PreviewBuilder = Camera.CreateVideoRequestBuilde";
_previewbuilder.setObject((java.lang.Object)(__ref._camera.CreateVideoRequestBuilder()));
 }else {
RDebugUtils.currentLine=25559045;
 //BA.debugLineNum = 25559045;BA.debugLine="PreviewBuilder = Camera.CreatePreviewBuilder";
_previewbuilder.setObject((java.lang.Object)(__ref._camera.CreatePreviewBuilder()));
 };
RDebugUtils.currentLine=25559047;
 //BA.debugLineNum = 25559047;BA.debugLine="SetSettingsFromMap(PreviewBuilder, PreviewSetting";
__ref._setsettingsfrommap(null,_previewbuilder,__ref._previewsettingsmap);
RDebugUtils.currentLine=25559048;
 //BA.debugLineNum = 25559048;BA.debugLine="PreviewRequest = Camera.SetRepeatingRequest(Previ";
__ref._previewrequest.setObject((java.lang.Object)(__ref._camera.SetRepeatingRequest((Object)(_previewbuilder.getObject()))));
RDebugUtils.currentLine=25559049;
 //BA.debugLineNum = 25559049;BA.debugLine="If PrintKeys Then PrintAllKeys(PreviewRequest, \"P";
if (__ref._printkeys) { 
__ref._printallkeys(null,(Object)(__ref._previewrequest.getObject()),"Preview Capture Request");};
RDebugUtils.currentLine=25559050;
 //BA.debugLineNum = 25559050;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedautoexposuremodes(b4a.example.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getsupportedautoexposuremodes"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedautoexposuremodes", null);
RDebugUtils.currentLine=26542080;
 //BA.debugLineNum = 26542080;BA.debugLine="Public Sub getSupportedAutoExposureModes As List";
RDebugUtils.currentLine=26542081;
 //BA.debugLineNum = 26542081;BA.debugLine="Return IntsToConstsList(GetFromCameraCharacterist";
if (true) return __ref._intstoconstslist(null,__ref._getfromcameracharacteristic(null,"CONTROL_AE_AVAILABLE_MODES"),__ref._ae_mode);
RDebugUtils.currentLine=26542082;
 //BA.debugLineNum = 26542082;BA.debugLine="End Sub";
return null;
}
public String  _getautoexposuremode(b4a.example.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getautoexposuremode"))
	return (String) Debug.delegate(ba, "getautoexposuremode", null);
RDebugUtils.currentLine=26607616;
 //BA.debugLineNum = 26607616;BA.debugLine="Public Sub getAutoExposureMode As String";
RDebugUtils.currentLine=26607617;
 //BA.debugLineNum = 26607617;BA.debugLine="Return IntToConst(GetFromCaptureRequest(PreviewRe";
if (true) return __ref._inttoconst(null,__ref._getfromcapturerequest(null,(Object)(__ref._previewrequest.getObject()),"CONTROL_AE_MODE"),__ref._ae_mode);
RDebugUtils.currentLine=26607618;
 //BA.debugLineNum = 26607618;BA.debugLine="End Sub";
return "";
}
public String  _setautoexposuremode(b4a.example.camex2 __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "setautoexposuremode"))
	return (String) Debug.delegate(ba, "setautoexposuremode", new Object[] {_mode});
RDebugUtils.currentLine=26738688;
 //BA.debugLineNum = 26738688;BA.debugLine="Public Sub setAutoExposureMode (Mode As String)";
RDebugUtils.currentLine=26738689;
 //BA.debugLineNum = 26738689;BA.debugLine="SetBothMaps(\"CONTROL_AE_MODE\", AE_MODE.IndexOf(Mo";
__ref._setbothmaps(null,"CONTROL_AE_MODE",(Object)(__ref._ae_mode.IndexOf((Object)(_mode))));
RDebugUtils.currentLine=26738690;
 //BA.debugLineNum = 26738690;BA.debugLine="PreviewSettingsMap.Put(\"FLASH_MODE\", FLASH_MODE.I";
__ref._previewsettingsmap.Put((Object)("FLASH_MODE"),(Object)(__ref._flash_mode.IndexOf((Object)("OFF"))));
RDebugUtils.currentLine=26738691;
 //BA.debugLineNum = 26738691;BA.debugLine="If Mode = \"ON_ALWAYS_FLASH\" Then";
if ((_mode).equals("ON_ALWAYS_FLASH")) { 
RDebugUtils.currentLine=26738692;
 //BA.debugLineNum = 26738692;BA.debugLine="CaptureSettingMap.Put(\"FLASH_MODE\", FLASH_MODE.I";
__ref._capturesettingmap.Put((Object)("FLASH_MODE"),(Object)(__ref._flash_mode.IndexOf((Object)("SINGLE"))));
 };
RDebugUtils.currentLine=26738694;
 //BA.debugLineNum = 26738694;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedeffectmodes(b4a.example.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getsupportedeffectmodes"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedeffectmodes", null);
RDebugUtils.currentLine=26148864;
 //BA.debugLineNum = 26148864;BA.debugLine="Public Sub getSupportedEffectModes As List";
RDebugUtils.currentLine=26148865;
 //BA.debugLineNum = 26148865;BA.debugLine="Return IntsToConstsList(GetFromCameraCharacterist";
if (true) return __ref._intstoconstslist(null,__ref._getfromcameracharacteristic(null,"CONTROL_AVAILABLE_EFFECTS"),__ref._effect_mode);
RDebugUtils.currentLine=26148866;
 //BA.debugLineNum = 26148866;BA.debugLine="End Sub";
return null;
}
public String  _geteffectmode(b4a.example.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "geteffectmode"))
	return (String) Debug.delegate(ba, "geteffectmode", null);
RDebugUtils.currentLine=26083328;
 //BA.debugLineNum = 26083328;BA.debugLine="Public Sub getEffectMode As String";
RDebugUtils.currentLine=26083329;
 //BA.debugLineNum = 26083329;BA.debugLine="Return IntToConst(GetFromCaptureRequest(PreviewRe";
if (true) return __ref._inttoconst(null,__ref._getfromcapturerequest(null,(Object)(__ref._previewrequest.getObject()),"CONTROL_EFFECT_MODE"),__ref._effect_mode);
RDebugUtils.currentLine=26083330;
 //BA.debugLineNum = 26083330;BA.debugLine="End Sub";
return "";
}
public String  _seteffectmode(b4a.example.camex2 __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "seteffectmode"))
	return (String) Debug.delegate(ba, "seteffectmode", new Object[] {_mode});
RDebugUtils.currentLine=26017792;
 //BA.debugLineNum = 26017792;BA.debugLine="Public Sub setEffectMode(Mode As String)";
RDebugUtils.currentLine=26017793;
 //BA.debugLineNum = 26017793;BA.debugLine="SetBothMaps(\"CONTROL_EFFECT_MODE\", EFFECT_MODE.In";
__ref._setbothmaps(null,"CONTROL_EFFECT_MODE",(Object)(__ref._effect_mode.IndexOf((Object)(_mode))));
RDebugUtils.currentLine=26017794;
 //BA.debugLineNum = 26017794;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedfocusmodes(b4a.example.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getsupportedfocusmodes"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedfocusmodes", null);
RDebugUtils.currentLine=26214400;
 //BA.debugLineNum = 26214400;BA.debugLine="Public Sub getSupportedFocusModes As List";
RDebugUtils.currentLine=26214401;
 //BA.debugLineNum = 26214401;BA.debugLine="Return RemoveDuplicates(IntsToConstsList(GetFromC";
if (true) return __ref._removeduplicates(null,__ref._intstoconstslist(null,__ref._getfromcameracharacteristic(null,"CONTROL_AF_AVAILABLE_MODES"),__ref._af_mode));
RDebugUtils.currentLine=26214402;
 //BA.debugLineNum = 26214402;BA.debugLine="End Sub";
return null;
}
public String  _getfocusmode(b4a.example.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getfocusmode"))
	return (String) Debug.delegate(ba, "getfocusmode", null);
RDebugUtils.currentLine=26345472;
 //BA.debugLineNum = 26345472;BA.debugLine="Public Sub getFocusMode As String";
RDebugUtils.currentLine=26345473;
 //BA.debugLineNum = 26345473;BA.debugLine="Return IntToConst(GetFromCaptureRequest(PreviewRe";
if (true) return __ref._inttoconst(null,__ref._getfromcapturerequest(null,(Object)(__ref._previewrequest.getObject()),"CONTROL_AF_MODE"),__ref._af_mode);
RDebugUtils.currentLine=26345474;
 //BA.debugLineNum = 26345474;BA.debugLine="End Sub";
return "";
}
public String  _setfocusmode(b4a.example.camex2 __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "setfocusmode"))
	return (String) Debug.delegate(ba, "setfocusmode", new Object[] {_mode});
RDebugUtils.currentLine=26411008;
 //BA.debugLineNum = 26411008;BA.debugLine="Public Sub setFocusMode(mode As String)";
RDebugUtils.currentLine=26411009;
 //BA.debugLineNum = 26411009;BA.debugLine="SetBothMaps(\"CONTROL_AF_MODE\", AF_MODE.IndexOf(mo";
__ref._setbothmaps(null,"CONTROL_AF_MODE",(Object)(__ref._af_mode.IndexOf((Object)(_mode))));
RDebugUtils.currentLine=26411010;
 //BA.debugLineNum = 26411010;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedscenemodes(b4a.example.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getsupportedscenemodes"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedscenemodes", null);
RDebugUtils.currentLine=25821184;
 //BA.debugLineNum = 25821184;BA.debugLine="Public Sub getSupportedSceneModes As List";
RDebugUtils.currentLine=25821185;
 //BA.debugLineNum = 25821185;BA.debugLine="Return RemoveDuplicates(IntsToConstsList(GetFromC";
if (true) return __ref._removeduplicates(null,__ref._intstoconstslist(null,__ref._getfromcameracharacteristic(null,"CONTROL_AVAILABLE_SCENE_MODES"),__ref._scene_mode));
RDebugUtils.currentLine=25821186;
 //BA.debugLineNum = 25821186;BA.debugLine="End Sub";
return null;
}
public String  _getscenemode(b4a.example.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getscenemode"))
	return (String) Debug.delegate(ba, "getscenemode", null);
RDebugUtils.currentLine=25952256;
 //BA.debugLineNum = 25952256;BA.debugLine="Public Sub getSceneMode As String";
RDebugUtils.currentLine=25952257;
 //BA.debugLineNum = 25952257;BA.debugLine="Return IntToConst(GetFromCaptureRequest(PreviewRe";
if (true) return __ref._inttoconst(null,__ref._getfromcapturerequest(null,(Object)(__ref._previewrequest.getObject()),"CONTROL_SCENE_MODE"),__ref._scene_mode);
RDebugUtils.currentLine=25952258;
 //BA.debugLineNum = 25952258;BA.debugLine="End Sub";
return "";
}
public String  _setscenemode(b4a.example.camex2 __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "setscenemode"))
	return (String) Debug.delegate(ba, "setscenemode", new Object[] {_mode});
RDebugUtils.currentLine=25886720;
 //BA.debugLineNum = 25886720;BA.debugLine="Public Sub setSceneMode(Mode As String)";
RDebugUtils.currentLine=25886721;
 //BA.debugLineNum = 25886721;BA.debugLine="SetBothMaps(\"CONTROL_SCENE_MODE\", SCENE_MODE.Inde";
__ref._setbothmaps(null,"CONTROL_SCENE_MODE",(Object)(__ref._scene_mode.IndexOf((Object)(_mode))));
RDebugUtils.currentLine=25886722;
 //BA.debugLineNum = 25886722;BA.debugLine="End Sub";
return "";
}
public String  _startvideorecording(b4a.example.camex2 __ref,int _mytaskindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "startvideorecording"))
	return (String) Debug.delegate(ba, "startvideorecording", new Object[] {_mytaskindex});
RDebugUtils.currentLine=25362432;
 //BA.debugLineNum = 25362432;BA.debugLine="Public Sub StartVideoRecording (MyTaskIndex As Int";
RDebugUtils.currentLine=25362433;
 //BA.debugLineNum = 25362433;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return";
if (_mytaskindex!=__ref._taskindex) { 
if (true) return "";};
RDebugUtils.currentLine=25362434;
 //BA.debugLineNum = 25362434;BA.debugLine="MediaRecorder.RunMethod(\"start\", Null)";
__ref._mediarecorder.RunMethod("start",(Object[])(__c.Null));
RDebugUtils.currentLine=25362435;
 //BA.debugLineNum = 25362435;BA.debugLine="RecordingVideo = True";
__ref._recordingvideo = __c.True;
RDebugUtils.currentLine=25362436;
 //BA.debugLineNum = 25362436;BA.debugLine="End Sub";
return "";
}
public String  _stopvideorecording(b4a.example.camex2 __ref,int _mytaskindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "stopvideorecording"))
	return (String) Debug.delegate(ba, "stopvideorecording", new Object[] {_mytaskindex});
RDebugUtils.currentLine=25427968;
 //BA.debugLineNum = 25427968;BA.debugLine="Public Sub StopVideoRecording (MyTaskIndex As Int)";
RDebugUtils.currentLine=25427969;
 //BA.debugLineNum = 25427969;BA.debugLine="CloseSession";
__ref._closesession(null);
RDebugUtils.currentLine=25427970;
 //BA.debugLineNum = 25427970;BA.debugLine="Try";
try {RDebugUtils.currentLine=25427971;
 //BA.debugLineNum = 25427971;BA.debugLine="MediaRecorder.RunMethod(\"stop\", Null)";
__ref._mediarecorder.RunMethod("stop",(Object[])(__c.Null));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=25427973;
 //BA.debugLineNum = 25427973;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
RDebugUtils.currentLine=25427975;
 //BA.debugLineNum = 25427975;BA.debugLine="RecordingVideo = False";
__ref._recordingvideo = __c.False;
RDebugUtils.currentLine=25427976;
 //BA.debugLineNum = 25427976;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _opencamera(b4a.example.camex2 __ref,boolean _front) throws Exception{
ResumableSub_OpenCamera rsub = new ResumableSub_OpenCamera(this,__ref,_front);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_OpenCamera extends BA.ResumableSub {
public ResumableSub_OpenCamera(b4a.example.camex2 parent,b4a.example.camex2 __ref,boolean _front) {
this.parent = parent;
this.__ref = __ref;
this._front = _front;
}
b4a.example.camex2 __ref;
b4a.example.camex2 parent;
boolean _front;
boolean _open = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="camex2";
Debug.delegate(ba, "opencamera", new Object[] {_front});
if (true) return;
    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=24969217;
 //BA.debugLineNum = 24969217;BA.debugLine="TaskIndex = TaskIndex + 1";
__ref._taskindex = (int) (__ref._taskindex+1);
RDebugUtils.currentLine=24969218;
 //BA.debugLineNum = 24969218;BA.debugLine="If Camera.IsCameraOpen Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._camera.getIsCameraOpen()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=24969219;
 //BA.debugLineNum = 24969219;BA.debugLine="Stop";
__ref._stop(null);
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=24969221;
 //BA.debugLineNum = 24969221;BA.debugLine="mFront = Front";
__ref._mfront = _front;
RDebugUtils.currentLine=24969222;
 //BA.debugLineNum = 24969222;BA.debugLine="id = Camera.FindCameraId(mFront)";
__ref._id = __ref._camera.FindCameraId(__ref._mfront);
RDebugUtils.currentLine=24969223;
 //BA.debugLineNum = 24969223;BA.debugLine="If id = \"\" Then";
if (true) break;

case 5:
//if
this.state = 8;
if ((__ref._id).equals("")) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=24969224;
 //BA.debugLineNum = 24969224;BA.debugLine="Log(\"Camera not found.\")";
parent.__c.Log("Camera not found.");
RDebugUtils.currentLine=24969225;
 //BA.debugLineNum = 24969225;BA.debugLine="id = Camera.CameraIDs(0)";
__ref._id = __ref._camera.getCameraIDs()[(int) (0)];
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=24969227;
 //BA.debugLineNum = 24969227;BA.debugLine="Camera.OpenCamera(id)";
__ref._camera.OpenCamera(__ref._id);
RDebugUtils.currentLine=24969228;
 //BA.debugLineNum = 24969228;BA.debugLine="Wait For Camera_CameraState (Open As Boolean)";
parent.__c.WaitFor("camera_camerastate", ba, this, null);
this.state = 18;
return;
case 18:
//C
this.state = 9;
_open = (Boolean) result[1];
;
RDebugUtils.currentLine=24969229;
 //BA.debugLineNum = 24969229;BA.debugLine="If Open = False Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_open==parent.__c.False) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=24969230;
 //BA.debugLineNum = 24969230;BA.debugLine="Log(\"Failed to open camera\")";
parent.__c.Log("Failed to open camera");
RDebugUtils.currentLine=24969231;
 //BA.debugLineNum = 24969231;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;
;
RDebugUtils.currentLine=24969233;
 //BA.debugLineNum = 24969233;BA.debugLine="If PrintKeys Then PrintAllKeys(Camera.GetCameraCh";

case 12:
//if
this.state = 17;
if (__ref._printkeys) { 
this.state = 14;
;}if (true) break;

case 14:
//C
this.state = 17;
__ref._printallkeys(null,__ref._camera.GetCameraCharacteristics(__ref._id),"Camera Characteristics");
if (true) break;

case 17:
//C
this.state = -1;
;
RDebugUtils.currentLine=24969234;
 //BA.debugLineNum = 24969234;BA.debugLine="Return TaskIndex";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._taskindex));return;};
RDebugUtils.currentLine=24969235;
 //BA.debugLineNum = 24969235;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparesurfaceforvideo(b4a.example.camex2 __ref,int _mytaskindex,String _dir,String _filename) throws Exception{
ResumableSub_PrepareSurfaceForVideo rsub = new ResumableSub_PrepareSurfaceForVideo(this,__ref,_mytaskindex,_dir,_filename);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareSurfaceForVideo extends BA.ResumableSub {
public ResumableSub_PrepareSurfaceForVideo(b4a.example.camex2 parent,b4a.example.camex2 __ref,int _mytaskindex,String _dir,String _filename) {
this.parent = parent;
this.__ref = __ref;
this._mytaskindex = _mytaskindex;
this._dir = _dir;
this._filename = _filename;
}
b4a.example.camex2 __ref;
b4a.example.camex2 parent;
int _mytaskindex;
String _dir;
String _filename;
boolean _result = false;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="camex2";
Debug.delegate(ba, "preparesurfaceforvideo", new Object[] {_mytaskindex,_dir,_filename});
if (true) return;
    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=25231361;
 //BA.debugLineNum = 25231361;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (_mytaskindex!=__ref._taskindex) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=25231362;
 //BA.debugLineNum = 25231362;BA.debugLine="CloseSession";
__ref._closesession(null);
RDebugUtils.currentLine=25231363;
 //BA.debugLineNum = 25231363;BA.debugLine="Wait For (CreateSurface) Complete (Result As Bool";
parent.__c.WaitFor("complete", ba, this, __ref._createsurface(null));
this.state = 19;
return;
case 19:
//C
this.state = 7;
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=25231364;
 //BA.debugLineNum = 25231364;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
if (true) break;

case 7:
//if
this.state = 12;
if (_mytaskindex!=__ref._taskindex) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=25231365;
 //BA.debugLineNum = 25231365;BA.debugLine="File.Delete(Dir, FileName)";
parent.__c.File.Delete(_dir,_filename);
RDebugUtils.currentLine=25231366;
 //BA.debugLineNum = 25231366;BA.debugLine="MediaRecorder = Camera.CreateMediaRecorder(Previe";
__ref._mediarecorder.setObject((java.lang.Object)(__ref._camera.CreateMediaRecorder(__ref._previewsize,_dir,_filename)));
RDebugUtils.currentLine=25231367;
 //BA.debugLineNum = 25231367;BA.debugLine="MediaRecorder.RunMethod(\"setOrientationHint\", Arr";
__ref._mediarecorder.RunMethod("setOrientationHint",new Object[]{(Object)(__ref._gethintorientation(null))});
RDebugUtils.currentLine=25231368;
 //BA.debugLineNum = 25231368;BA.debugLine="Camera.StartSession(tv, PreviewSize, CaptureSize,";
__ref._camera.StartSession((android.view.TextureView)(__ref._tv.getObject()),__ref._previewsize,__ref._capturesize,(int) (0),(int) (0),parent.__c.True);
RDebugUtils.currentLine=25231369;
 //BA.debugLineNum = 25231369;BA.debugLine="Wait For Camera_SessionConfigured (Success As Boo";
parent.__c.WaitFor("camera_sessionconfigured", ba, this, null);
this.state = 20;
return;
case 20:
//C
this.state = 13;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=25231370;
 //BA.debugLineNum = 25231370;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
if (true) break;

case 13:
//if
this.state = 18;
if (_mytaskindex!=__ref._taskindex) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=25231371;
 //BA.debugLineNum = 25231371;BA.debugLine="Return Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
RDebugUtils.currentLine=25231372;
 //BA.debugLineNum = 25231372;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparesurface(b4a.example.camex2 __ref,int _mytaskindex) throws Exception{
ResumableSub_PrepareSurface rsub = new ResumableSub_PrepareSurface(this,__ref,_mytaskindex);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareSurface extends BA.ResumableSub {
public ResumableSub_PrepareSurface(b4a.example.camex2 parent,b4a.example.camex2 __ref,int _mytaskindex) {
this.parent = parent;
this.__ref = __ref;
this._mytaskindex = _mytaskindex;
}
b4a.example.camex2 __ref;
b4a.example.camex2 parent;
int _mytaskindex;
boolean _result = false;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="camex2";
Debug.delegate(ba, "preparesurface", new Object[] {_mytaskindex});
if (true) return;
    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=25165825;
 //BA.debugLineNum = 25165825;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (_mytaskindex!=__ref._taskindex) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=25165826;
 //BA.debugLineNum = 25165826;BA.debugLine="CloseSession";
__ref._closesession(null);
RDebugUtils.currentLine=25165827;
 //BA.debugLineNum = 25165827;BA.debugLine="Wait For (CreateSurface) Complete (Result As Bool";
parent.__c.WaitFor("complete", ba, this, __ref._createsurface(null));
this.state = 19;
return;
case 19:
//C
this.state = 7;
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=25165828;
 //BA.debugLineNum = 25165828;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
if (true) break;

case 7:
//if
this.state = 12;
if (_mytaskindex!=__ref._taskindex) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=25165829;
 //BA.debugLineNum = 25165829;BA.debugLine="Camera.StartSession(tv, PreviewSize, CaptureSize,";
__ref._camera.StartSession((android.view.TextureView)(__ref._tv.getObject()),__ref._previewsize,__ref._capturesize,(int) (256),(int) (0),parent.__c.False);
RDebugUtils.currentLine=25165830;
 //BA.debugLineNum = 25165830;BA.debugLine="Wait For Camera_SessionConfigured (Success As Boo";
parent.__c.WaitFor("camera_sessionconfigured", ba, this, null);
this.state = 20;
return;
case 20:
//C
this.state = 13;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=25165831;
 //BA.debugLineNum = 25165831;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
if (true) break;

case 13:
//if
this.state = 18;
if (_mytaskindex!=__ref._taskindex) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=25165832;
 //BA.debugLineNum = 25165832;BA.debugLine="Return Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
RDebugUtils.currentLine=25165833;
 //BA.debugLineNum = 25165833;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _focusandtakepicture(b4a.example.camex2 __ref,int _mytaskindex) throws Exception{
ResumableSub_FocusAndTakePicture rsub = new ResumableSub_FocusAndTakePicture(this,__ref,_mytaskindex);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FocusAndTakePicture extends BA.ResumableSub {
public ResumableSub_FocusAndTakePicture(b4a.example.camex2 parent,b4a.example.camex2 __ref,int _mytaskindex) {
this.parent = parent;
this.__ref = __ref;
this._mytaskindex = _mytaskindex;
}
b4a.example.camex2 __ref;
b4a.example.camex2 parent;
int _mytaskindex;
String _previewfocusmode = "";
String _previewaemode = "";
anywheresoftware.b4j.object.JavaObject _previewbuilder = null;
boolean _success = false;
byte[] _data = null;
Object _captureresult = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="camex2";
Debug.delegate(ba, "focusandtakepicture", new Object[] {_mytaskindex});
if (true) return;
    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=27000833;
 //BA.debugLineNum = 27000833;BA.debugLine="Dim PreviewFocusMode As String = AF_MODE.Get(GetF";
_previewfocusmode = BA.ObjectToString(__ref._af_mode.Get((int)(BA.ObjectToNumber(__ref._getfromcapturerequest(null,(Object)(__ref._previewrequest.getObject()),"CONTROL_AF_MODE")))));
RDebugUtils.currentLine=27000834;
 //BA.debugLineNum = 27000834;BA.debugLine="Dim PreviewAEMode As String = AE_MODE.Get(GetFrom";
_previewaemode = BA.ObjectToString(__ref._ae_mode.Get((int)(BA.ObjectToNumber(__ref._getfromcapturerequest(null,(Object)(__ref._previewrequest.getObject()),"CONTROL_AE_MODE")))));
RDebugUtils.currentLine=27000835;
 //BA.debugLineNum = 27000835;BA.debugLine="If PreviewFocusMode = \"OFF\" Or PreviewFocusMode =";
if (true) break;

case 1:
//if
this.state = 12;
if ((_previewfocusmode).equals("OFF") || (_previewfocusmode).equals("EDOF")) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=27000837;
 //BA.debugLineNum = 27000837;BA.debugLine="Else if PreviewFocusMode.Contains(\"CONTINUOUS\") =";
if (_previewfocusmode.contains("CONTINUOUS")==parent.__c.False || (_previewaemode).equals("ON_ALWAYS_FLASH")) { 
this.state = 5;
}}
if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=27000836;
 //BA.debugLineNum = 27000836;BA.debugLine="Log(\"Focus not supported\")";
parent.__c.Log("Focus not supported");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=27000838;
 //BA.debugLineNum = 27000838;BA.debugLine="Dim PreviewBuilder As JavaObject = Camera.Create";
_previewbuilder = new anywheresoftware.b4j.object.JavaObject();
_previewbuilder.setObject((java.lang.Object)(__ref._camera.CreatePreviewBuilder()));
RDebugUtils.currentLine=27000839;
 //BA.debugLineNum = 27000839;BA.debugLine="PreviewSettingsMap.Put(\"CONTROL_AF_TRIGGER\", 1)";
__ref._previewsettingsmap.Put((Object)("CONTROL_AF_TRIGGER"),(Object)(1));
RDebugUtils.currentLine=27000840;
 //BA.debugLineNum = 27000840;BA.debugLine="SetSettingsFromMap(PreviewBuilder, PreviewSettin";
__ref._setsettingsfrommap(null,_previewbuilder,__ref._previewsettingsmap);
RDebugUtils.currentLine=27000841;
 //BA.debugLineNum = 27000841;BA.debugLine="Camera.AddCaptureRequest(PreviewBuilder)";
__ref._camera.AddCaptureRequest((Object)(_previewbuilder.getObject()));
RDebugUtils.currentLine=27000842;
 //BA.debugLineNum = 27000842;BA.debugLine="Wait For (WaitForFocusWithTimeout(5000)) Complet";
parent.__c.WaitFor("complete", ba, this, __ref._waitforfocuswithtimeout(null,(int) (5000)));
this.state = 13;
return;
case 13:
//C
this.state = 6;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=27000843;
 //BA.debugLineNum = 27000843;BA.debugLine="If Success = False Then";
if (true) break;

case 6:
//if
this.state = 11;
if (_success==parent.__c.False) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=27000844;
 //BA.debugLineNum = 27000844;BA.debugLine="Log(\"Focus failed\")";
parent.__c.Log("Focus failed");
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=27000846;
 //BA.debugLineNum = 27000846;BA.debugLine="Log(\"Focused!\")";
parent.__c.Log("Focused!");
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=27000848;
 //BA.debugLineNum = 27000848;BA.debugLine="Wait For (TakePictureNow(MyTaskIndex)) Complete";
parent.__c.WaitFor("complete", ba, this, __ref._takepicturenow(null,_mytaskindex));
this.state = 14;
return;
case 14:
//C
this.state = 12;
_data = (byte[]) result[1];
;
RDebugUtils.currentLine=27000849;
 //BA.debugLineNum = 27000849;BA.debugLine="Dim PreviewBuilder As JavaObject = Camera.Create";
_previewbuilder = new anywheresoftware.b4j.object.JavaObject();
_previewbuilder.setObject((java.lang.Object)(__ref._camera.CreatePreviewBuilder()));
RDebugUtils.currentLine=27000850;
 //BA.debugLineNum = 27000850;BA.debugLine="PreviewSettingsMap.Put(\"CONTROL_AF_TRIGGER\", 2)";
__ref._previewsettingsmap.Put((Object)("CONTROL_AF_TRIGGER"),(Object)(2));
RDebugUtils.currentLine=27000851;
 //BA.debugLineNum = 27000851;BA.debugLine="SetSettingsFromMap(PreviewBuilder, PreviewSettin";
__ref._setsettingsfrommap(null,_previewbuilder,__ref._previewsettingsmap);
RDebugUtils.currentLine=27000852;
 //BA.debugLineNum = 27000852;BA.debugLine="Camera.AddCaptureRequest(PreviewBuilder)";
__ref._camera.AddCaptureRequest((Object)(_previewbuilder.getObject()));
RDebugUtils.currentLine=27000853;
 //BA.debugLineNum = 27000853;BA.debugLine="PreviewSettingsMap.Remove(\"CONTROL_AF_TRIGGER\")";
__ref._previewsettingsmap.Remove((Object)("CONTROL_AF_TRIGGER"));
RDebugUtils.currentLine=27000854;
 //BA.debugLineNum = 27000854;BA.debugLine="Wait For (PreviewBuilder) Camera_CaptureComplete";
parent.__c.WaitFor("camera_capturecomplete", ba, this, (Object)(_previewbuilder.getObject()));
this.state = 15;
return;
case 15:
//C
this.state = 12;
_captureresult = (Object) result[1];
;
RDebugUtils.currentLine=27000855;
 //BA.debugLineNum = 27000855;BA.debugLine="Return data";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_data));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=27000857;
 //BA.debugLineNum = 27000857;BA.debugLine="Wait For (TakePictureNow(MyTaskIndex)) Complete (";
parent.__c.WaitFor("complete", ba, this, __ref._takepicturenow(null,_mytaskindex));
this.state = 16;
return;
case 16:
//C
this.state = -1;
_data = (byte[]) result[1];
;
RDebugUtils.currentLine=27000858;
 //BA.debugLineNum = 27000858;BA.debugLine="Return data";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_data));return;};
RDebugUtils.currentLine=27000859;
 //BA.debugLineNum = 27000859;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _datatofile(b4a.example.camex2 __ref,byte[] _data,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "datatofile"))
	return (String) Debug.delegate(ba, "datatofile", new Object[] {_data,_dir,_filename});
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=27459584;
 //BA.debugLineNum = 27459584;BA.debugLine="Public Sub DataToFile(Data() As Byte, Dir As Strin";
RDebugUtils.currentLine=27459585;
 //BA.debugLineNum = 27459585;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_dir,_filename,__c.False);
RDebugUtils.currentLine=27459586;
 //BA.debugLineNum = 27459586;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
_out.WriteBytes(_data,(int) (0),_data.length);
RDebugUtils.currentLine=27459587;
 //BA.debugLineNum = 27459587;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=27459588;
 //BA.debugLineNum = 27459588;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _datatobitmap(b4a.example.camex2 __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "datatobitmap"))
	return (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "datatobitmap", new Object[] {_data});
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
RDebugUtils.currentLine=27394048;
 //BA.debugLineNum = 27394048;BA.debugLine="Public Sub DataToBitmap(Data() As Byte) As Bitmap";
RDebugUtils.currentLine=27394049;
 //BA.debugLineNum = 27394049;BA.debugLine="Dim in As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=27394050;
 //BA.debugLineNum = 27394050;BA.debugLine="in.InitializeFromBytesArray(Data, 0, Data.Length)";
_in.InitializeFromBytesArray(_data,(int) (0),_data.length);
RDebugUtils.currentLine=27394051;
 //BA.debugLineNum = 27394051;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=27394052;
 //BA.debugLineNum = 27394052;BA.debugLine="bmp.Initialize2(in)";
_bmp.Initialize2((java.io.InputStream)(_in.getObject()));
RDebugUtils.currentLine=27394053;
 //BA.debugLineNum = 27394053;BA.debugLine="in.Close";
_in.Close();
RDebugUtils.currentLine=27394054;
 //BA.debugLineNum = 27394054;BA.debugLine="Return bmp";
if (true) return _bmp;
RDebugUtils.currentLine=27394055;
 //BA.debugLineNum = 27394055;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _boolstolist(b4a.example.camex2 __ref,Object _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "boolstolist"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "boolstolist", new Object[] {_obj});
anywheresoftware.b4a.objects.collections.List _res = null;
boolean[] _i = null;
boolean _ii = false;
RDebugUtils.currentLine=28180480;
 //BA.debugLineNum = 28180480;BA.debugLine="Private Sub BoolsToList (Obj As Object) As List";
RDebugUtils.currentLine=28180481;
 //BA.debugLineNum = 28180481;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28180482;
 //BA.debugLineNum = 28180482;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=28180483;
 //BA.debugLineNum = 28180483;BA.debugLine="If Obj = Null Then Return res";
if (_obj== null) { 
if (true) return _res;};
RDebugUtils.currentLine=28180484;
 //BA.debugLineNum = 28180484;BA.debugLine="Dim i() As Boolean = Obj";
_i = (boolean[])(_obj);
RDebugUtils.currentLine=28180485;
 //BA.debugLineNum = 28180485;BA.debugLine="For Each ii As Boolean In i";
{
final boolean[] group5 = _i;
final int groupLen5 = group5.length
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_ii = group5[index5];
RDebugUtils.currentLine=28180486;
 //BA.debugLineNum = 28180486;BA.debugLine="res.Add(ii)";
_res.Add((Object)(_ii));
 }
};
RDebugUtils.currentLine=28180488;
 //BA.debugLineNum = 28180488;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=28180489;
 //BA.debugLineNum = 28180489;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _bytestolist(b4a.example.camex2 __ref,Object _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "bytestolist"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "bytestolist", new Object[] {_obj});
anywheresoftware.b4a.objects.collections.List _res = null;
byte[] _i = null;
byte _ii = (byte)0;
RDebugUtils.currentLine=28246016;
 //BA.debugLineNum = 28246016;BA.debugLine="Private Sub BytesToList (Obj As Object) As List";
RDebugUtils.currentLine=28246017;
 //BA.debugLineNum = 28246017;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28246018;
 //BA.debugLineNum = 28246018;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=28246019;
 //BA.debugLineNum = 28246019;BA.debugLine="If Obj = Null Then Return res";
if (_obj== null) { 
if (true) return _res;};
RDebugUtils.currentLine=28246020;
 //BA.debugLineNum = 28246020;BA.debugLine="Dim i() As Byte = Obj";
_i = (byte[])(_obj);
RDebugUtils.currentLine=28246021;
 //BA.debugLineNum = 28246021;BA.debugLine="For Each ii As Byte In i";
{
final byte[] group5 = _i;
final int groupLen5 = group5.length
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_ii = group5[index5];
RDebugUtils.currentLine=28246022;
 //BA.debugLineNum = 28246022;BA.debugLine="res.Add(ii)";
_res.Add((Object)(_ii));
 }
};
RDebugUtils.currentLine=28246024;
 //BA.debugLineNum = 28246024;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=28246025;
 //BA.debugLineNum = 28246025;BA.debugLine="End Sub";
return null;
}
public String  _camera_previewcapturecomplete(b4a.example.camex2 __ref,Object _captureresult) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "camera_previewcapturecomplete"))
	return (String) Debug.delegate(ba, "camera_previewcapturecomplete", new Object[] {_captureresult});
RDebugUtils.currentLine=27131904;
 //BA.debugLineNum = 27131904;BA.debugLine="Private Sub Camera_PreviewCaptureComplete (Capture";
RDebugUtils.currentLine=27131905;
 //BA.debugLineNum = 27131905;BA.debugLine="FocusState = IntToConst(GetFromCaptureResult(Capt";
__ref._focusstate = __ref._inttoconst(null,__ref._getfromcaptureresult(null,_captureresult,"CONTROL_AF_STATE"),__ref._af_state);
RDebugUtils.currentLine=27131908;
 //BA.debugLineNum = 27131908;BA.debugLine="End Sub";
return "";
}
public String  _inttoconst(b4a.example.camex2 __ref,Object _int1,anywheresoftware.b4a.objects.collections.List _consts) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "inttoconst"))
	return (String) Debug.delegate(ba, "inttoconst", new Object[] {_int1,_consts});
int _i = 0;
RDebugUtils.currentLine=27787264;
 //BA.debugLineNum = 27787264;BA.debugLine="Private Sub IntToConst (Int1 As Object, Consts As";
RDebugUtils.currentLine=27787265;
 //BA.debugLineNum = 27787265;BA.debugLine="If Int1 = Null Then Return \"\"";
if (_int1== null) { 
if (true) return "";};
RDebugUtils.currentLine=27787266;
 //BA.debugLineNum = 27787266;BA.debugLine="Dim i As Int = Int1";
_i = (int)(BA.ObjectToNumber(_int1));
RDebugUtils.currentLine=27787267;
 //BA.debugLineNum = 27787267;BA.debugLine="If i >= 0 And i < Consts.Size Then";
if (_i>=0 && _i<_consts.getSize()) { 
RDebugUtils.currentLine=27787268;
 //BA.debugLineNum = 27787268;BA.debugLine="Return Consts.Get(i)";
if (true) return BA.ObjectToString(_consts.Get(_i));
 }else {
RDebugUtils.currentLine=27787270;
 //BA.debugLineNum = 27787270;BA.debugLine="Log(Consts)'ignore";
__c.Log(BA.ObjectToString(_consts));
RDebugUtils.currentLine=27787271;
 //BA.debugLineNum = 27787271;BA.debugLine="Log(\"Unknown const: \" & i)";
__c.Log("Unknown const: "+BA.NumberToString(_i));
RDebugUtils.currentLine=27787272;
 //BA.debugLineNum = 27787272;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=27787274;
 //BA.debugLineNum = 27787274;BA.debugLine="End Sub";
return "";
}
public Object  _getfromcaptureresult(b4a.example.camex2 __ref,Object _captureresult,String _field) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getfromcaptureresult"))
	return (Object) Debug.delegate(ba, "getfromcaptureresult", new Object[] {_captureresult,_field});
anywheresoftware.b4j.object.JavaObject _jresult = null;
RDebugUtils.currentLine=27656192;
 //BA.debugLineNum = 27656192;BA.debugLine="Private Sub GetFromCaptureResult(CaptureResult As";
RDebugUtils.currentLine=27656193;
 //BA.debugLineNum = 27656193;BA.debugLine="Dim jresult As JavaObject = CaptureResult";
_jresult = new anywheresoftware.b4j.object.JavaObject();
_jresult.setObject((java.lang.Object)(_captureresult));
RDebugUtils.currentLine=27656194;
 //BA.debugLineNum = 27656194;BA.debugLine="Return jresult.RunMethod(\"get\", Array(StaticCaptu";
if (true) return _jresult.RunMethod("get",new Object[]{__ref._staticcaptureresult.GetField(_field)});
RDebugUtils.currentLine=27656195;
 //BA.debugLineNum = 27656195;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
RDebugUtils.currentLine=24838144;
 //BA.debugLineNum = 24838144;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=24838145;
 //BA.debugLineNum = 24838145;BA.debugLine="Public Camera As Camera2";
_camera = new anywheresoftware.b4a.objects.Camera2();
RDebugUtils.currentLine=24838146;
 //BA.debugLineNum = 24838146;BA.debugLine="Private jcamera As JavaObject";
_jcamera = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=24838147;
 //BA.debugLineNum = 24838147;BA.debugLine="Private id As String";
_id = "";
RDebugUtils.currentLine=24838148;
 //BA.debugLineNum = 24838148;BA.debugLine="Private mFront As Boolean = False";
_mfront = __c.False;
RDebugUtils.currentLine=24838149;
 //BA.debugLineNum = 24838149;BA.debugLine="Public PreviewSize, CaptureSize As CameraSize";
_previewsize = new anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper();
_capturesize = new anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper();
RDebugUtils.currentLine=24838150;
 //BA.debugLineNum = 24838150;BA.debugLine="Public PreviewSettingsMap, CaptureSettingMap As M";
_previewsettingsmap = new anywheresoftware.b4a.objects.collections.Map();
_capturesettingmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24838151;
 //BA.debugLineNum = 24838151;BA.debugLine="Private bothMaps As List";
_bothmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=24838152;
 //BA.debugLineNum = 24838152;BA.debugLine="Private mPanel As Panel";
_mpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=24838153;
 //BA.debugLineNum = 24838153;BA.debugLine="Private tv As View";
_tv = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=24838154;
 //BA.debugLineNum = 24838154;BA.debugLine="Private StaticCaptureRequest As JavaObject";
_staticcapturerequest = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=24838155;
 //BA.debugLineNum = 24838155;BA.debugLine="Private StaticCameraCharacteristics As JavaObject";
_staticcameracharacteristics = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=24838156;
 //BA.debugLineNum = 24838156;BA.debugLine="Private StaticCaptureResult As JavaObject";
_staticcaptureresult = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=24838157;
 //BA.debugLineNum = 24838157;BA.debugLine="Private AF_STATE As List = Array(\"INACTIVE\", \"PAS";
_af_state = new anywheresoftware.b4a.objects.collections.List();
_af_state = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("INACTIVE"),(Object)("PASSIVE_SCAN"),(Object)("PASSIVE_FOCUSED"),(Object)("ACTIVE_SCAN"),(Object)("FOCUSED_LOCKED"),(Object)("NOT_FOCUSED_LOCKED"),(Object)("PASSIVE_UNFOCUSED")});
RDebugUtils.currentLine=24838158;
 //BA.debugLineNum = 24838158;BA.debugLine="Private FLASH_STATE As List = Array(\"UNAVAILABLE\"";
_flash_state = new anywheresoftware.b4a.objects.collections.List();
_flash_state = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("UNAVAILABLE"),(Object)("CHARGING"),(Object)("READY"),(Object)("FIRED"),(Object)("PARTIAL")});
RDebugUtils.currentLine=24838160;
 //BA.debugLineNum = 24838160;BA.debugLine="Private AF_MODE As List = Array(\"OFF\", \"AUTO\", \"M";
_af_mode = new anywheresoftware.b4a.objects.collections.List();
_af_mode = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("OFF"),(Object)("AUTO"),(Object)("MACRO"),(Object)("CONTINUOUS_VIDEO"),(Object)("CONTINUOUS_PICTURE"),(Object)("EDOF")});
RDebugUtils.currentLine=24838162;
 //BA.debugLineNum = 24838162;BA.debugLine="Private AE_MODE As List = Array(\"OFF\", \"ON\", \"ON_";
_ae_mode = new anywheresoftware.b4a.objects.collections.List();
_ae_mode = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("OFF"),(Object)("ON"),(Object)("ON_AUTO_FLASH"),(Object)("ON_ALWAYS_FLASH"),(Object)("ON_AUTO_FLASH_REDEYE")});
RDebugUtils.currentLine=24838163;
 //BA.debugLineNum = 24838163;BA.debugLine="Private FLASH_MODE As List = Array(\"OFF\", \"SINGLE";
_flash_mode = new anywheresoftware.b4a.objects.collections.List();
_flash_mode = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("OFF"),(Object)("SINGLE"),(Object)("TORCH")});
RDebugUtils.currentLine=24838164;
 //BA.debugLineNum = 24838164;BA.debugLine="Private SCENE_MODE As List = Array(\"DISABLED\", \"F";
_scene_mode = new anywheresoftware.b4a.objects.collections.List();
_scene_mode = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("DISABLED"),(Object)("FACE_PRIORITY"),(Object)("ACTION"),(Object)("PORTRAIT"),(Object)("LANDSCAPE"),(Object)("NIGHT"),(Object)("PORTRAIT"),(Object)("THEATRE"),(Object)("BEACH"),(Object)("SNOW"),(Object)("SUNSET"),(Object)("STEADYPHOTO"),(Object)("FIREWORKS"),(Object)("SPORTS"),(Object)("PARTY"),(Object)("CANDLELIGHT"),(Object)("BARCODE"),(Object)("HIGH_SPEED_VIDEO"),(Object)("MODE_HDR"),(Object)("FACE_PRIORITY_LOW_LIGHT")});
RDebugUtils.currentLine=24838166;
 //BA.debugLineNum = 24838166;BA.debugLine="Private EFFECT_MODE As List = Array(\"OFF\", \"MONO\"";
_effect_mode = new anywheresoftware.b4a.objects.collections.List();
_effect_mode = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("OFF"),(Object)("MONO"),(Object)("NEGATIVE"),(Object)("SOLARIZE"),(Object)("SEPIA"),(Object)("POSTERIZE"),(Object)("WHITEBOARD"),(Object)("BLACKBOARD"),(Object)("AQUA")});
RDebugUtils.currentLine=24838167;
 //BA.debugLineNum = 24838167;BA.debugLine="Private SUPPORTED_HARDWARE_LEVEL As List = Array(";
_supported_hardware_level = new anywheresoftware.b4a.objects.collections.List();
_supported_hardware_level = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("LIMITED"),(Object)("FULL"),(Object)("LEGACY"),(Object)("LEVEL_3")});
RDebugUtils.currentLine=24838168;
 //BA.debugLineNum = 24838168;BA.debugLine="Private CONTROL_MODE As List = Array(\"OFF\", \"AUTO";
_control_mode = new anywheresoftware.b4a.objects.collections.List();
_control_mode = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("OFF"),(Object)("AUTO"),(Object)("USE_SCENE_MODE"),(Object)("OFF_KEEP_STATE")});
RDebugUtils.currentLine=24838169;
 //BA.debugLineNum = 24838169;BA.debugLine="Public PrintKeys As Boolean = False";
_printkeys = __c.False;
RDebugUtils.currentLine=24838170;
 //BA.debugLineNum = 24838170;BA.debugLine="Private PreviewRequest As JavaObject";
_previewrequest = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=24838171;
 //BA.debugLineNum = 24838171;BA.debugLine="Private FocusState As String";
_focusstate = "";
RDebugUtils.currentLine=24838172;
 //BA.debugLineNum = 24838172;BA.debugLine="Private MediaRecorder As JavaObject";
_mediarecorder = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=24838173;
 //BA.debugLineNum = 24838173;BA.debugLine="Public RecordingVideo As Boolean";
_recordingvideo = false;
RDebugUtils.currentLine=24838174;
 //BA.debugLineNum = 24838174;BA.debugLine="Public TaskIndex As Int = 1";
_taskindex = (int) (1);
RDebugUtils.currentLine=24838175;
 //BA.debugLineNum = 24838175;BA.debugLine="End Sub";
return "";
}
public String  _closesession(b4a.example.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "closesession"))
	return (String) Debug.delegate(ba, "closesession", null);
anywheresoftware.b4j.object.JavaObject _session = null;
RDebugUtils.currentLine=25034752;
 //BA.debugLineNum = 25034752;BA.debugLine="Private Sub CloseSession";
RDebugUtils.currentLine=25034753;
 //BA.debugLineNum = 25034753;BA.debugLine="Dim session As JavaObject = jcamera.GetFieldJO(\"c";
_session = new anywheresoftware.b4j.object.JavaObject();
_session = __ref._jcamera.GetFieldJO("captureSession");
RDebugUtils.currentLine=25034754;
 //BA.debugLineNum = 25034754;BA.debugLine="If session.IsInitialized Then";
if (_session.IsInitialized()) { 
RDebugUtils.currentLine=25034755;
 //BA.debugLineNum = 25034755;BA.debugLine="session.RunMethod(\"stopRepeating\", Null)";
_session.RunMethod("stopRepeating",(Object[])(__c.Null));
RDebugUtils.currentLine=25034756;
 //BA.debugLineNum = 25034756;BA.debugLine="session.RunMethod(\"abortCaptures\", Null)";
_session.RunMethod("abortCaptures",(Object[])(__c.Null));
RDebugUtils.currentLine=25034757;
 //BA.debugLineNum = 25034757;BA.debugLine="jcamera.SetField(\"captureSession\", Null)";
__ref._jcamera.SetField("captureSession",__c.Null);
 };
RDebugUtils.currentLine=25034759;
 //BA.debugLineNum = 25034759;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _createsurface(b4a.example.camex2 __ref) throws Exception{
ResumableSub_CreateSurface rsub = new ResumableSub_CreateSurface(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CreateSurface extends BA.ResumableSub {
public ResumableSub_CreateSurface(b4a.example.camex2 parent,b4a.example.camex2 __ref) {
this.parent = parent;
this.__ref = __ref;
}
b4a.example.camex2 __ref;
b4a.example.camex2 parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="camex2";
Debug.delegate(ba, "createsurface", null);
if (true) return;
    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=25493505;
 //BA.debugLineNum = 25493505;BA.debugLine="If tv.IsInitialized Then tv.RemoveView";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._tv.IsInitialized()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref._tv.RemoveView();
if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=25493506;
 //BA.debugLineNum = 25493506;BA.debugLine="tv = Camera.CreateSurface";
__ref._tv = __ref._camera.CreateSurface(ba);
RDebugUtils.currentLine=25493507;
 //BA.debugLineNum = 25493507;BA.debugLine="mPanel.AddView(tv, 0, 0, mPanel.Width, mPanel.Hei";
__ref._mpanel.AddView((android.view.View)(__ref._tv.getObject()),(int) (0),(int) (0),__ref._mpanel.getWidth(),__ref._mpanel.getHeight());
RDebugUtils.currentLine=25493508;
 //BA.debugLineNum = 25493508;BA.debugLine="tv.SendToBack";
__ref._tv.SendToBack();
RDebugUtils.currentLine=25493509;
 //BA.debugLineNum = 25493509;BA.debugLine="Wait For Camera_SurfaceReady";
parent.__c.WaitFor("camera_surfaceready", ba, this, null);
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=25493510;
 //BA.debugLineNum = 25493510;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=25493511;
 //BA.debugLineNum = 25493511;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.collections.List  _floatstolist(b4a.example.camex2 __ref,Object _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "floatstolist"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "floatstolist", new Object[] {_obj});
anywheresoftware.b4a.objects.collections.List _res = null;
float[] _f = null;
float _ff = 0f;
RDebugUtils.currentLine=28377088;
 //BA.debugLineNum = 28377088;BA.debugLine="Private Sub FloatsToList (Obj As Object) As List";
RDebugUtils.currentLine=28377089;
 //BA.debugLineNum = 28377089;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28377090;
 //BA.debugLineNum = 28377090;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=28377091;
 //BA.debugLineNum = 28377091;BA.debugLine="If Obj = Null Then Return res";
if (_obj== null) { 
if (true) return _res;};
RDebugUtils.currentLine=28377092;
 //BA.debugLineNum = 28377092;BA.debugLine="Dim f() As Float = Obj";
_f = (float[])(_obj);
RDebugUtils.currentLine=28377093;
 //BA.debugLineNum = 28377093;BA.debugLine="For Each ff As Float In f";
{
final float[] group5 = _f;
final int groupLen5 = group5.length
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_ff = group5[index5];
RDebugUtils.currentLine=28377094;
 //BA.debugLineNum = 28377094;BA.debugLine="res.Add(ff)";
_res.Add((Object)(_ff));
 }
};
RDebugUtils.currentLine=28377096;
 //BA.debugLineNum = 28377096;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=28377097;
 //BA.debugLineNum = 28377097;BA.debugLine="End Sub";
return null;
}
public Object  _getfromcapturerequest(b4a.example.camex2 __ref,Object _capturerequest,String _field) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getfromcapturerequest"))
	return (Object) Debug.delegate(ba, "getfromcapturerequest", new Object[] {_capturerequest,_field});
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=27721728;
 //BA.debugLineNum = 27721728;BA.debugLine="Private Sub GetFromCaptureRequest(CaptureRequest A";
RDebugUtils.currentLine=27721729;
 //BA.debugLineNum = 27721729;BA.debugLine="Dim jo As JavaObject = CaptureRequest";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_capturerequest));
RDebugUtils.currentLine=27721730;
 //BA.debugLineNum = 27721730;BA.debugLine="Return jo.RunMethod(\"get\", Array(StaticCaptureReq";
if (true) return _jo.RunMethod("get",new Object[]{__ref._staticcapturerequest.GetField(_field)});
RDebugUtils.currentLine=27721731;
 //BA.debugLineNum = 27721731;BA.debugLine="End Sub";
return null;
}
public String  _setsettingsfrommap(b4a.example.camex2 __ref,anywheresoftware.b4j.object.JavaObject _builder,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "setsettingsfrommap"))
	return (String) Debug.delegate(ba, "setsettingsfrommap", new Object[] {_builder,_m});
String _key = "";
RDebugUtils.currentLine=27918336;
 //BA.debugLineNum = 27918336;BA.debugLine="Private Sub SetSettingsFromMap (Builder As JavaObj";
RDebugUtils.currentLine=27918337;
 //BA.debugLineNum = 27918337;BA.debugLine="For Each key As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=27918338;
 //BA.debugLineNum = 27918338;BA.debugLine="Builder.RunMethod(\"set\", Array(StaticCaptureRequ";
_builder.RunMethod("set",new Object[]{__ref._staticcapturerequest.GetField(_key),_m.Get((Object)(_key))});
 }
};
RDebugUtils.currentLine=27918340;
 //BA.debugLineNum = 27918340;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _waitforfocuswithtimeout(b4a.example.camex2 __ref,int _timeoutms) throws Exception{
ResumableSub_WaitForFocusWithTimeout rsub = new ResumableSub_WaitForFocusWithTimeout(this,__ref,_timeoutms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_WaitForFocusWithTimeout extends BA.ResumableSub {
public ResumableSub_WaitForFocusWithTimeout(b4a.example.camex2 parent,b4a.example.camex2 __ref,int _timeoutms) {
this.parent = parent;
this.__ref = __ref;
this._timeoutms = _timeoutms;
}
b4a.example.camex2 __ref;
b4a.example.camex2 parent;
int _timeoutms;
long _start = 0L;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="camex2";
Debug.delegate(ba, "waitforfocuswithtimeout", new Object[] {_timeoutms});
if (true) return;
    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=27066369;
 //BA.debugLineNum = 27066369;BA.debugLine="Dim start As Long = DateTime.Now";
_start = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=27066370;
 //BA.debugLineNum = 27066370;BA.debugLine="Do Until FocusState = \"FOCUSED_LOCKED\" Or FocusSt";
if (true) break;

case 1:
//do until
this.state = 10;
while (!((__ref._focusstate).equals("FOCUSED_LOCKED") || (__ref._focusstate).equals("NOT_FOCUSED_LOCKED"))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=27066371;
 //BA.debugLineNum = 27066371;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,this,(int) (50));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
RDebugUtils.currentLine=27066372;
 //BA.debugLineNum = 27066372;BA.debugLine="If DateTime.Now - start > TimeoutMs Then Return";
if (true) break;

case 4:
//if
this.state = 9;
if (parent.__c.DateTime.getNow()-_start>_timeoutms) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
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
RDebugUtils.currentLine=27066374;
 //BA.debugLineNum = 27066374;BA.debugLine="Return FocusState = \"FOCUSED_LOCKED\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)((__ref._focusstate).equals("FOCUSED_LOCKED")));return;};
RDebugUtils.currentLine=27066375;
 //BA.debugLineNum = 27066375;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _takepicturenow(b4a.example.camex2 __ref,int _mytaskindex) throws Exception{
ResumableSub_TakePictureNow rsub = new ResumableSub_TakePictureNow(this,__ref,_mytaskindex);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_TakePictureNow extends BA.ResumableSub {
public ResumableSub_TakePictureNow(b4a.example.camex2 parent,b4a.example.camex2 __ref,int _mytaskindex) {
this.parent = parent;
this.__ref = __ref;
this._mytaskindex = _mytaskindex;
}
b4a.example.camex2 __ref;
b4a.example.camex2 parent;
int _mytaskindex;
anywheresoftware.b4j.object.JavaObject _builder = null;
Object _capturerequest = null;
byte[] _data = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="camex2";
Debug.delegate(ba, "takepicturenow", new Object[] {_mytaskindex});
if (true) return;
    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=27197441;
 //BA.debugLineNum = 27197441;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (_mytaskindex!=__ref._taskindex) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=27197442;
 //BA.debugLineNum = 27197442;BA.debugLine="Camera.AbortCaptures";
__ref._camera.AbortCaptures();
RDebugUtils.currentLine=27197443;
 //BA.debugLineNum = 27197443;BA.debugLine="Dim builder As JavaObject = Camera.CreateCaptureB";
_builder = new anywheresoftware.b4j.object.JavaObject();
_builder.setObject((java.lang.Object)(__ref._camera.CreateCaptureBuilder()));
RDebugUtils.currentLine=27197444;
 //BA.debugLineNum = 27197444;BA.debugLine="CaptureSettingMap.Put(\"JPEG_ORIENTATION\", GetHint";
__ref._capturesettingmap.Put((Object)("JPEG_ORIENTATION"),(Object)(__ref._gethintorientation(null)));
RDebugUtils.currentLine=27197445;
 //BA.debugLineNum = 27197445;BA.debugLine="SetSettingsFromMap(builder, CaptureSettingMap)";
__ref._setsettingsfrommap(null,_builder,__ref._capturesettingmap);
RDebugUtils.currentLine=27197446;
 //BA.debugLineNum = 27197446;BA.debugLine="Dim CaptureRequest As Object = Camera.AddCaptureR";
_capturerequest = __ref._camera.AddCaptureRequest((Object)(_builder.getObject()));
RDebugUtils.currentLine=27197447;
 //BA.debugLineNum = 27197447;BA.debugLine="If PrintKeys Then PrintAllKeys(CaptureRequest, \"C";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._printkeys) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
__ref._printallkeys(null,_capturerequest,"Capture Request");
if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=27197448;
 //BA.debugLineNum = 27197448;BA.debugLine="Wait For Camera_PictureTaken (Data() As Byte)";
parent.__c.WaitFor("camera_picturetaken", ba, this, null);
this.state = 13;
return;
case 13:
//C
this.state = -1;
_data = (byte[]) result[1];
;
RDebugUtils.currentLine=27197449;
 //BA.debugLineNum = 27197449;BA.debugLine="StartPreview(MyTaskIndex, False)";
__ref._startpreview(null,_mytaskindex,parent.__c.False);
RDebugUtils.currentLine=27197450;
 //BA.debugLineNum = 27197450;BA.debugLine="Return Data";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_data));return;};
RDebugUtils.currentLine=27197451;
 //BA.debugLineNum = 27197451;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object  _getfromcameracharacteristic(b4a.example.camex2 __ref,String _field) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getfromcameracharacteristic"))
	return (Object) Debug.delegate(ba, "getfromcameracharacteristic", new Object[] {_field});
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=27590656;
 //BA.debugLineNum = 27590656;BA.debugLine="Private Sub GetFromCameraCharacteristic (Field As";
RDebugUtils.currentLine=27590657;
 //BA.debugLineNum = 27590657;BA.debugLine="Dim jo As JavaObject = Camera.GetCameraCharacteri";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(__ref._camera.GetCameraCharacteristics(__ref._id)));
RDebugUtils.currentLine=27590658;
 //BA.debugLineNum = 27590658;BA.debugLine="Return jo.RunMethod(\"get\", Array(StaticCameraChar";
if (true) return _jo.RunMethod("get",new Object[]{__ref._staticcameracharacteristics.GetField(_field)});
RDebugUtils.currentLine=27590659;
 //BA.debugLineNum = 27590659;BA.debugLine="End Sub";
return null;
}
public String  _getcontrolmode(b4a.example.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getcontrolmode"))
	return (String) Debug.delegate(ba, "getcontrolmode", null);
RDebugUtils.currentLine=26673152;
 //BA.debugLineNum = 26673152;BA.debugLine="Public Sub getControlMode As String";
RDebugUtils.currentLine=26673153;
 //BA.debugLineNum = 26673153;BA.debugLine="Return IntToConst(GetFromCaptureRequest(PreviewRe";
if (true) return __ref._inttoconst(null,__ref._getfromcapturerequest(null,(Object)(__ref._previewrequest.getObject()),"CONTROL_MODE"),__ref._control_mode);
RDebugUtils.currentLine=26673154;
 //BA.debugLineNum = 26673154;BA.debugLine="End Sub";
return "";
}
public int  _gethintorientation(b4a.example.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "gethintorientation"))
	return (Integer) Debug.delegate(ba, "gethintorientation", null);
int _sensororientation = 0;
int _front = 0;
int _orientation = 0;
RDebugUtils.currentLine=25296896;
 //BA.debugLineNum = 25296896;BA.debugLine="Private Sub GetHintOrientation As Int";
RDebugUtils.currentLine=25296897;
 //BA.debugLineNum = 25296897;BA.debugLine="Dim SensorOrientation As Int = GetFromCameraChara";
_sensororientation = (int)(BA.ObjectToNumber(__ref._getfromcameracharacteristic(null,"SENSOR_ORIENTATION")));
RDebugUtils.currentLine=25296898;
 //BA.debugLineNum = 25296898;BA.debugLine="Dim front As Int = -1";
_front = (int) (-1);
RDebugUtils.currentLine=25296899;
 //BA.debugLineNum = 25296899;BA.debugLine="If getIsFrontFacingCamera Then front = 1";
if (__ref._getisfrontfacingcamera(null)) { 
_front = (int) (1);};
RDebugUtils.currentLine=25296900;
 //BA.debugLineNum = 25296900;BA.debugLine="Dim orientation As Int = (SensorOrientation + jca";
_orientation = (int) ((_sensororientation+(double)(BA.ObjectToNumber(__ref._jcamera.GetField("lastKnownOrientation")))*_front+360)%360);
RDebugUtils.currentLine=25296901;
 //BA.debugLineNum = 25296901;BA.debugLine="Return orientation";
if (true) return _orientation;
RDebugUtils.currentLine=25296902;
 //BA.debugLineNum = 25296902;BA.debugLine="End Sub";
return 0;
}
public boolean  _getisfrontfacingcamera(b4a.example.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getisfrontfacingcamera"))
	return (Boolean) Debug.delegate(ba, "getisfrontfacingcamera", null);
RDebugUtils.currentLine=27525120;
 //BA.debugLineNum = 27525120;BA.debugLine="Public Sub getIsFrontFacingCamera As Boolean";
RDebugUtils.currentLine=27525121;
 //BA.debugLineNum = 27525121;BA.debugLine="Return GetFromCameraCharacteristic(\"LENS_FACING\")";
if (true) return (__ref._getfromcameracharacteristic(null,"LENS_FACING")).equals((Object)(0));
RDebugUtils.currentLine=27525122;
 //BA.debugLineNum = 27525122;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getpreviewbitmap(b4a.example.camex2 __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getpreviewbitmap"))
	return (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getpreviewbitmap", new Object[] {_width,_height});
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _mbmp = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=27328512;
 //BA.debugLineNum = 27328512;BA.debugLine="Public Sub GetPreviewBitmap(Width As Int, Height A";
RDebugUtils.currentLine=27328513;
 //BA.debugLineNum = 27328513;BA.debugLine="Dim mbmp As Bitmap";
_mbmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=27328514;
 //BA.debugLineNum = 27328514;BA.debugLine="mbmp.InitializeMutable(Width, Height)";
_mbmp.InitializeMutable(_width,_height);
RDebugUtils.currentLine=27328515;
 //BA.debugLineNum = 27328515;BA.debugLine="Dim jo As JavaObject = tv";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(__ref._tv.getObject()));
RDebugUtils.currentLine=27328516;
 //BA.debugLineNum = 27328516;BA.debugLine="Return jo.RunMethod(\"getBitmap\", Array(mbmp))";
if (true) return (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_jo.RunMethod("getBitmap",new Object[]{(Object)(_mbmp.getObject())})));
RDebugUtils.currentLine=27328517;
 //BA.debugLineNum = 27328517;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _intstoconstslist(b4a.example.camex2 __ref,Object _ints,anywheresoftware.b4a.objects.collections.List _consts) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "intstoconstslist"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "intstoconstslist", new Object[] {_ints,_consts});
anywheresoftware.b4a.objects.collections.List _res = null;
int[] _f = null;
int _mode = 0;
RDebugUtils.currentLine=27852800;
 //BA.debugLineNum = 27852800;BA.debugLine="Private Sub IntsToConstsList (Ints As Object, Cons";
RDebugUtils.currentLine=27852801;
 //BA.debugLineNum = 27852801;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=27852802;
 //BA.debugLineNum = 27852802;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=27852803;
 //BA.debugLineNum = 27852803;BA.debugLine="If Ints = Null Then Return res";
if (_ints== null) { 
if (true) return _res;};
RDebugUtils.currentLine=27852804;
 //BA.debugLineNum = 27852804;BA.debugLine="Dim f() As Int = Ints";
_f = (int[])(_ints);
RDebugUtils.currentLine=27852805;
 //BA.debugLineNum = 27852805;BA.debugLine="For Each mode As Int In f";
{
final int[] group5 = _f;
final int groupLen5 = group5.length
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_mode = group5[index5];
RDebugUtils.currentLine=27852806;
 //BA.debugLineNum = 27852806;BA.debugLine="If mode >=0 And mode < Consts.Size Then";
if (_mode>=0 && _mode<_consts.getSize()) { 
RDebugUtils.currentLine=27852807;
 //BA.debugLineNum = 27852807;BA.debugLine="res.Add(Consts.Get(mode))";
_res.Add(_consts.Get(_mode));
 }else {
RDebugUtils.currentLine=27852809;
 //BA.debugLineNum = 27852809;BA.debugLine="Log(Consts) 'ignore";
__c.Log(BA.ObjectToString(_consts));
RDebugUtils.currentLine=27852810;
 //BA.debugLineNum = 27852810;BA.debugLine="Log(\"Unknown consts: \" & mode)";
__c.Log("Unknown consts: "+BA.NumberToString(_mode));
 };
 }
};
RDebugUtils.currentLine=27852813;
 //BA.debugLineNum = 27852813;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=27852814;
 //BA.debugLineNum = 27852814;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedcapturesizes(b4a.example.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getsupportedcapturesizes"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedcapturesizes", null);
RDebugUtils.currentLine=25690112;
 //BA.debugLineNum = 25690112;BA.debugLine="Public Sub getSupportedCaptureSizes As List";
RDebugUtils.currentLine=25690113;
 //BA.debugLineNum = 25690113;BA.debugLine="Return Camera.GetSupportedCaptureSizes(id)";
if (true) return __ref._camera.GetSupportedCaptureSizes(__ref._id);
RDebugUtils.currentLine=25690114;
 //BA.debugLineNum = 25690114;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _removeduplicates(b4a.example.camex2 __ref,anywheresoftware.b4a.objects.collections.List _raw) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "removeduplicates"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "removeduplicates", new Object[] {_raw});
anywheresoftware.b4a.objects.collections.Map _unique = null;
String _f = "";
RDebugUtils.currentLine=26279936;
 //BA.debugLineNum = 26279936;BA.debugLine="Private Sub RemoveDuplicates(Raw As List) As List";
RDebugUtils.currentLine=26279937;
 //BA.debugLineNum = 26279937;BA.debugLine="Dim unique As Map";
_unique = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=26279938;
 //BA.debugLineNum = 26279938;BA.debugLine="unique.Initialize";
_unique.Initialize();
RDebugUtils.currentLine=26279939;
 //BA.debugLineNum = 26279939;BA.debugLine="For Each f As String In Raw";
{
final anywheresoftware.b4a.BA.IterableList group3 = _raw;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_f = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=26279940;
 //BA.debugLineNum = 26279940;BA.debugLine="unique.Put(f, \"\")";
_unique.Put((Object)(_f),(Object)(""));
 }
};
RDebugUtils.currentLine=26279942;
 //BA.debugLineNum = 26279942;BA.debugLine="Raw.Clear";
_raw.Clear();
RDebugUtils.currentLine=26279943;
 //BA.debugLineNum = 26279943;BA.debugLine="For Each f As String In unique.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _unique.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_f = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=26279944;
 //BA.debugLineNum = 26279944;BA.debugLine="Raw.Add(f)";
_raw.Add((Object)(_f));
 }
};
RDebugUtils.currentLine=26279946;
 //BA.debugLineNum = 26279946;BA.debugLine="Return Raw";
if (true) return _raw;
RDebugUtils.currentLine=26279947;
 //BA.debugLineNum = 26279947;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedpreviewsizes(b4a.example.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getsupportedpreviewsizes"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedpreviewsizes", null);
RDebugUtils.currentLine=25624576;
 //BA.debugLineNum = 25624576;BA.debugLine="Public Sub getSupportedPreviewSizes As List";
RDebugUtils.currentLine=25624577;
 //BA.debugLineNum = 25624577;BA.debugLine="Return Camera.GetSupportedPreviewSizes(id)";
if (true) return __ref._camera.GetSupportedPreviewSizes(__ref._id);
RDebugUtils.currentLine=25624578;
 //BA.debugLineNum = 25624578;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedvideosizes(b4a.example.camex2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "getsupportedvideosizes"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedvideosizes", null);
RDebugUtils.currentLine=25755648;
 //BA.debugLineNum = 25755648;BA.debugLine="Public Sub getSupportedVideoSizes As List";
RDebugUtils.currentLine=25755649;
 //BA.debugLineNum = 25755649;BA.debugLine="Return Camera.GetSupportedVideoSizes(id)";
if (true) return __ref._camera.GetSupportedVideoSizes(__ref._id);
RDebugUtils.currentLine=25755650;
 //BA.debugLineNum = 25755650;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _intstolist(b4a.example.camex2 __ref,Object _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "intstolist"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "intstolist", new Object[] {_obj});
anywheresoftware.b4a.objects.collections.List _res = null;
int[] _i = null;
int _ii = 0;
RDebugUtils.currentLine=28311552;
 //BA.debugLineNum = 28311552;BA.debugLine="Private Sub IntsToList (Obj As Object) As List";
RDebugUtils.currentLine=28311553;
 //BA.debugLineNum = 28311553;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28311554;
 //BA.debugLineNum = 28311554;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=28311555;
 //BA.debugLineNum = 28311555;BA.debugLine="If Obj = Null Then Return res";
if (_obj== null) { 
if (true) return _res;};
RDebugUtils.currentLine=28311556;
 //BA.debugLineNum = 28311556;BA.debugLine="Dim i() As Int = Obj";
_i = (int[])(_obj);
RDebugUtils.currentLine=28311557;
 //BA.debugLineNum = 28311557;BA.debugLine="For Each ii As Int In i";
{
final int[] group5 = _i;
final int groupLen5 = group5.length
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_ii = group5[index5];
RDebugUtils.currentLine=28311558;
 //BA.debugLineNum = 28311558;BA.debugLine="res.Add(ii)";
_res.Add((Object)(_ii));
 }
};
RDebugUtils.currentLine=28311560;
 //BA.debugLineNum = 28311560;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=28311561;
 //BA.debugLineNum = 28311561;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _objectstolist(b4a.example.camex2 __ref,Object _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "objectstolist"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "objectstolist", new Object[] {_obj});
anywheresoftware.b4a.objects.collections.List _res = null;
Object[] _o = null;
Object _oo = null;
RDebugUtils.currentLine=28114944;
 //BA.debugLineNum = 28114944;BA.debugLine="Private Sub ObjectsToList(Obj As Object) As List";
RDebugUtils.currentLine=28114945;
 //BA.debugLineNum = 28114945;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28114946;
 //BA.debugLineNum = 28114946;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=28114947;
 //BA.debugLineNum = 28114947;BA.debugLine="If Obj = Null Then Return res";
if (_obj== null) { 
if (true) return _res;};
RDebugUtils.currentLine=28114948;
 //BA.debugLineNum = 28114948;BA.debugLine="Dim o() As Object = Obj";
_o = (Object[])(_obj);
RDebugUtils.currentLine=28114949;
 //BA.debugLineNum = 28114949;BA.debugLine="For Each oo As Object In o";
{
final Object[] group5 = _o;
final int groupLen5 = group5.length
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_oo = group5[index5];
RDebugUtils.currentLine=28114950;
 //BA.debugLineNum = 28114950;BA.debugLine="res.Add(oo)";
_res.Add(_oo);
 }
};
RDebugUtils.currentLine=28114952;
 //BA.debugLineNum = 28114952;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=28114953;
 //BA.debugLineNum = 28114953;BA.debugLine="End Sub";
return null;
}
public String  _printallkeys(b4a.example.camex2 __ref,Object _cameramap,String _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "printallkeys"))
	return (String) Debug.delegate(ba, "printallkeys", new Object[] {_cameramap,_title});
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.collections.List _keys = null;
anywheresoftware.b4j.object.JavaObject _k = null;
Object _value = null;
String _typ = "";
RDebugUtils.currentLine=28049408;
 //BA.debugLineNum = 28049408;BA.debugLine="Private Sub PrintAllKeys (CameraMap As Object, tit";
RDebugUtils.currentLine=28049409;
 //BA.debugLineNum = 28049409;BA.debugLine="Log($\"******  ${title} **********\"$)";
__c.Log(("******  "+__c.SmartStringFormatter("",(Object)(_title))+" **********"));
RDebugUtils.currentLine=28049410;
 //BA.debugLineNum = 28049410;BA.debugLine="Dim jo As JavaObject = CameraMap";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_cameramap));
RDebugUtils.currentLine=28049411;
 //BA.debugLineNum = 28049411;BA.debugLine="Dim keys As List = jo.RunMethod(\"getKeys\", Null)";
_keys = new anywheresoftware.b4a.objects.collections.List();
_keys.setObject((java.util.List)(_jo.RunMethod("getKeys",(Object[])(__c.Null))));
RDebugUtils.currentLine=28049412;
 //BA.debugLineNum = 28049412;BA.debugLine="For Each k As JavaObject In keys";
_k = new anywheresoftware.b4j.object.JavaObject();
{
final anywheresoftware.b4a.BA.IterableList group4 = _keys;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k.setObject((java.lang.Object)(group4.Get(index4)));
RDebugUtils.currentLine=28049413;
 //BA.debugLineNum = 28049413;BA.debugLine="Dim value As Object = jo.RunMethod(\"get\", Array(";
_value = _jo.RunMethod("get",new Object[]{(Object)(_k.getObject())});
RDebugUtils.currentLine=28049414;
 //BA.debugLineNum = 28049414;BA.debugLine="If value = Null Then Continue";
if (_value== null) { 
if (true) continue;};
RDebugUtils.currentLine=28049415;
 //BA.debugLineNum = 28049415;BA.debugLine="Dim typ As String = GetType(value)";
_typ = __c.GetType(_value);
RDebugUtils.currentLine=28049416;
 //BA.debugLineNum = 28049416;BA.debugLine="If typ = \"[F\" Then";
if ((_typ).equals("[F")) { 
RDebugUtils.currentLine=28049417;
 //BA.debugLineNum = 28049417;BA.debugLine="value = FloatsToList(value)";
_value = (Object)(__ref._floatstolist(null,_value).getObject());
 }else 
{RDebugUtils.currentLine=28049418;
 //BA.debugLineNum = 28049418;BA.debugLine="Else If typ = \"[I\" Then";
if ((_typ).equals("[I")) { 
RDebugUtils.currentLine=28049419;
 //BA.debugLineNum = 28049419;BA.debugLine="value = IntsToList(value)";
_value = (Object)(__ref._intstolist(null,_value).getObject());
 }else 
{RDebugUtils.currentLine=28049420;
 //BA.debugLineNum = 28049420;BA.debugLine="Else If typ = \"[Z\" Then";
if ((_typ).equals("[Z")) { 
RDebugUtils.currentLine=28049421;
 //BA.debugLineNum = 28049421;BA.debugLine="value = BoolsToList(value)";
_value = (Object)(__ref._boolstolist(null,_value).getObject());
 }else 
{RDebugUtils.currentLine=28049422;
 //BA.debugLineNum = 28049422;BA.debugLine="Else If typ = \"[B\" Then";
if ((_typ).equals("[B")) { 
RDebugUtils.currentLine=28049423;
 //BA.debugLineNum = 28049423;BA.debugLine="value = BytesToList(value)";
_value = (Object)(__ref._bytestolist(null,_value).getObject());
 }else 
{RDebugUtils.currentLine=28049424;
 //BA.debugLineNum = 28049424;BA.debugLine="Else if typ.StartsWith(\"[\") Then";
if (_typ.startsWith("[")) { 
RDebugUtils.currentLine=28049425;
 //BA.debugLineNum = 28049425;BA.debugLine="value = ObjectsToList(value)";
_value = (Object)(__ref._objectstolist(null,_value).getObject());
 }}}}}
;
RDebugUtils.currentLine=28049427;
 //BA.debugLineNum = 28049427;BA.debugLine="Log($\"${k.RunMethod(\"getName\", Null)}: ${value}\"";
__c.Log((""+__c.SmartStringFormatter("",_k.RunMethod("getName",(Object[])(__c.Null)))+": "+__c.SmartStringFormatter("",_value)+""));
 }
};
RDebugUtils.currentLine=28049429;
 //BA.debugLineNum = 28049429;BA.debugLine="End Sub";
return "";
}
public String  _setbothmaps(b4a.example.camex2 __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="camex2";
if (Debug.shouldDelegate(ba, "setbothmaps"))
	return (String) Debug.delegate(ba, "setbothmaps", new Object[] {_key,_value});
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=26935296;
 //BA.debugLineNum = 26935296;BA.debugLine="Private Sub SetBothMaps(Key As String, Value As Ob";
RDebugUtils.currentLine=26935297;
 //BA.debugLineNum = 26935297;BA.debugLine="For Each m As Map In bothMaps";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._bothmaps;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group1.Get(index1)));
RDebugUtils.currentLine=26935298;
 //BA.debugLineNum = 26935298;BA.debugLine="m.Put(Key, Value)";
_m.Put((Object)(_key),_value);
 }
};
RDebugUtils.currentLine=26935300;
 //BA.debugLineNum = 26935300;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _takepicturesnow(b4a.example.camex2 __ref,int _mytaskindex,int _numberofpictures) throws Exception{
ResumableSub_TakePicturesNow rsub = new ResumableSub_TakePicturesNow(this,__ref,_mytaskindex,_numberofpictures);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_TakePicturesNow extends BA.ResumableSub {
public ResumableSub_TakePicturesNow(b4a.example.camex2 parent,b4a.example.camex2 __ref,int _mytaskindex,int _numberofpictures) {
this.parent = parent;
this.__ref = __ref;
this._mytaskindex = _mytaskindex;
this._numberofpictures = _numberofpictures;
}
b4a.example.camex2 __ref;
b4a.example.camex2 parent;
int _mytaskindex;
int _numberofpictures;
anywheresoftware.b4j.object.JavaObject _builder = null;
anywheresoftware.b4a.objects.collections.List _result = null;
int _i = 0;
byte[] _data = null;
int step8;
int limit8;
int step11;
int limit11;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="camex2";
Debug.delegate(ba, "takepicturesnow", new Object[] {_mytaskindex,_numberofpictures});
if (true) return;
    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=27262977;
 //BA.debugLineNum = 27262977;BA.debugLine="If MyTaskIndex <> TaskIndex Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (_mytaskindex!=__ref._taskindex) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=27262978;
 //BA.debugLineNum = 27262978;BA.debugLine="Camera.AbortCaptures";
__ref._camera.AbortCaptures();
RDebugUtils.currentLine=27262979;
 //BA.debugLineNum = 27262979;BA.debugLine="Dim builder As JavaObject = Camera.CreateCaptureB";
_builder = new anywheresoftware.b4j.object.JavaObject();
_builder.setObject((java.lang.Object)(__ref._camera.CreateCaptureBuilder()));
RDebugUtils.currentLine=27262980;
 //BA.debugLineNum = 27262980;BA.debugLine="CaptureSettingMap.Put(\"JPEG_ORIENTATION\", GetHint";
__ref._capturesettingmap.Put((Object)("JPEG_ORIENTATION"),(Object)(__ref._gethintorientation(null)));
RDebugUtils.currentLine=27262981;
 //BA.debugLineNum = 27262981;BA.debugLine="SetSettingsFromMap(builder, CaptureSettingMap)";
__ref._setsettingsfrommap(null,_builder,__ref._capturesettingmap);
RDebugUtils.currentLine=27262982;
 //BA.debugLineNum = 27262982;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=27262983;
 //BA.debugLineNum = 27262983;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=27262984;
 //BA.debugLineNum = 27262984;BA.debugLine="For i = 1 To NumberOfPictures";
if (true) break;

case 7:
//for
this.state = 10;
step8 = 1;
limit8 = _numberofpictures;
_i = (int) (1) ;
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
if (true) break;

case 9:
//C
this.state = 15;
RDebugUtils.currentLine=27262985;
 //BA.debugLineNum = 27262985;BA.debugLine="Camera.AddCaptureRequest(builder)";
__ref._camera.AddCaptureRequest((Object)(_builder.getObject()));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=27262987;
 //BA.debugLineNum = 27262987;BA.debugLine="For i = 1 To NumberOfPictures";

case 10:
//for
this.state = 13;
step11 = 1;
limit11 = _numberofpictures;
_i = (int) (1) ;
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
if (true) break;

case 12:
//C
this.state = 17;
RDebugUtils.currentLine=27262988;
 //BA.debugLineNum = 27262988;BA.debugLine="Wait For Camera_PictureTaken (Data() As Byte)";
parent.__c.WaitFor("camera_picturetaken", ba, this, null);
this.state = 18;
return;
case 18:
//C
this.state = 17;
_data = (byte[]) result[1];
;
RDebugUtils.currentLine=27262989;
 //BA.debugLineNum = 27262989;BA.debugLine="result.Add(Data)";
_result.Add((Object)(_data));
 if (true) break;
if (true) break;

case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=27262991;
 //BA.debugLineNum = 27262991;BA.debugLine="StartPreview(MyTaskIndex, False)";
__ref._startpreview(null,_mytaskindex,parent.__c.False);
RDebugUtils.currentLine=27262992;
 //BA.debugLineNum = 27262992;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=27262993;
 //BA.debugLineNum = 27262993;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}