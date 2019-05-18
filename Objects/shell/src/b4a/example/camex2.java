
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class camex2 {
    public static RemoteObject myClass;
	public camex2() {
	}
    public static PCBA staticBA = new PCBA(null, camex2.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _camera = RemoteObject.declareNull("anywheresoftware.b4a.objects.Camera2");
public static RemoteObject _jcamera = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _mfront = RemoteObject.createImmutable(false);
public static RemoteObject _previewsize = RemoteObject.declareNull("anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper");
public static RemoteObject _capturesize = RemoteObject.declareNull("anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper");
public static RemoteObject _previewsettingsmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _capturesettingmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _bothmaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _tv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
public static RemoteObject _staticcapturerequest = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _staticcameracharacteristics = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _staticcaptureresult = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _af_state = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _flash_state = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _af_mode = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _ae_mode = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _flash_mode = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _scene_mode = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _effect_mode = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _supported_hardware_level = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _control_mode = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _printkeys = RemoteObject.createImmutable(false);
public static RemoteObject _previewrequest = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _focusstate = RemoteObject.createImmutable("");
public static RemoteObject _mediarecorder = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _recordingvideo = RemoteObject.createImmutable(false);
public static RemoteObject _taskindex = RemoteObject.createImmutable(0);
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.officedetail _officedetail = null;
public static b4a.example.functionall _functionall = null;
public static b4a.example.searchbuilding _searchbuilding = null;
public static b4a.example.educationaldetail _educationaldetail = null;
public static b4a.example.healthdetail _healthdetail = null;
public static b4a.example.housedetail _housedetail = null;
public static b4a.example.msmedetail _msmedetail = null;
public static b4a.example.worshipdetail _worshipdetail = null;
public static b4a.example.manualposition _manualposition = null;
public static b4a.example.home _home = null;
public static b4a.example.homeadmin _homeadmin = null;
public static b4a.example.login _login = null;
public static b4a.example.addfacilitytype _addfacilitytype = null;
public static b4a.example.editbuildingfacility _editbuildingfacility = null;
public static b4a.example.addbuildingfacility _addbuildingfacility = null;
public static b4a.example.officeedit _officeedit = null;
public static b4a.example.msmebuilding _msmebuilding = null;
public static b4a.example.worshipbuilding _worshipbuilding = null;
public static b4a.example.addphoto _addphoto = null;
public static b4a.example.loaderimage _loaderimage = null;
public static b4a.example.maincamera _maincamera = null;
public static b4a.example.fileutil _fileutil = null;
public static b4a.example.showimage _showimage = null;
public static b4a.example.browsegallery _browsegallery = null;
public static b4a.example.educationaledit _educationaledit = null;
public static b4a.example.housebuilding _housebuilding = null;
public static b4a.example.worshipedit _worshipedit = null;
public static b4a.example.healthbuilding _healthbuilding = null;
public static b4a.example.gallery _gallery = null;
public static b4a.example.officebuilding _officebuilding = null;
public static b4a.example.educationalbuilding _educationalbuilding = null;
public static b4a.example.msmeedit _msmeedit = null;
public static b4a.example.buildinglist _buildinglist = null;
public static b4a.example.help _help = null;
public static b4a.example.healthedit _healthedit = null;
public static b4a.example.searchworship _searchworship = null;
public static b4a.example.multipartpost _multipartpost = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AE_MODE",_ref.getField(false, "_ae_mode"),"AF_MODE",_ref.getField(false, "_af_mode"),"AF_STATE",_ref.getField(false, "_af_state"),"bothMaps",_ref.getField(false, "_bothmaps"),"Camera",_ref.getField(false, "_camera"),"CaptureSettingMap",_ref.getField(false, "_capturesettingmap"),"CaptureSize",_ref.getField(false, "_capturesize"),"CONTROL_MODE",_ref.getField(false, "_control_mode"),"EFFECT_MODE",_ref.getField(false, "_effect_mode"),"FLASH_MODE",_ref.getField(false, "_flash_mode"),"FLASH_STATE",_ref.getField(false, "_flash_state"),"FocusState",_ref.getField(false, "_focusstate"),"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"id",_ref.getField(false, "_id"),"jcamera",_ref.getField(false, "_jcamera"),"MediaRecorder",_ref.getField(false, "_mediarecorder"),"mFront",_ref.getField(false, "_mfront"),"mPanel",_ref.getField(false, "_mpanel"),"PreviewRequest",_ref.getField(false, "_previewrequest"),"PreviewSettingsMap",_ref.getField(false, "_previewsettingsmap"),"PreviewSize",_ref.getField(false, "_previewsize"),"PrintKeys",_ref.getField(false, "_printkeys"),"RecordingVideo",_ref.getField(false, "_recordingvideo"),"SCENE_MODE",_ref.getField(false, "_scene_mode"),"StaticCameraCharacteristics",_ref.getField(false, "_staticcameracharacteristics"),"StaticCaptureRequest",_ref.getField(false, "_staticcapturerequest"),"StaticCaptureResult",_ref.getField(false, "_staticcaptureresult"),"SUPPORTED_HARDWARE_LEVEL",_ref.getField(false, "_supported_hardware_level"),"TaskIndex",_ref.getField(false, "_taskindex"),"tv",_ref.getField(false, "_tv")};
}
}