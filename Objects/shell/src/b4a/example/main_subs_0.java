package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(null, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(b4a.example.main parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _firsttime;
RemoteObject _segoeui = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,57);
if (RapidSub.canDelegate("activity_create")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 59;BA.debugLine="CheckLoginSession";
Debug.ShouldStop(67108864);
_checkloginsession();
 BA.debugLineNum = 60;BA.debugLine="If FirstTime Then 'jika aplikasi pertama diaktifk";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 6;
if (_firsttime.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 61;BA.debugLine="folder = rp.GetSafeDirDefaultExternal(\"data\")";
Debug.ShouldStop(268435456);
parent._folder = parent._rp.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("data")));
 BA.debugLineNum = 62;BA.debugLine="kvs.Initialize(folder, \"datastore\")";
Debug.ShouldStop(536870912);
parent._kvs.runVoidMethod ("_initialize",main.processBA,(Object)(parent._folder),(Object)(RemoteObject.createImmutable("datastore")));
 BA.debugLineNum = 63;BA.debugLine="Activity.LoadLayout(\"splash\")";
Debug.ShouldStop(1073741824);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("splash")),main.mostCurrent.activityBA);
 BA.debugLineNum = 64;BA.debugLine="AnimSplash 'Panggil function animasi splash scre";
Debug.ShouldStop(-2147483648);
_animsplash();
 BA.debugLineNum = 65;BA.debugLine="tmSplash.Initialize(\"tmSplash\",3500) 'panggil ev";
Debug.ShouldStop(1);
parent._tmsplash.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("tmSplash")),(Object)(BA.numberCast(long.class, 3500)));
 BA.debugLineNum = 66;BA.debugLine="tmSplash.Enabled = True 'aktifkan timer";
Debug.ShouldStop(2);
parent._tmsplash.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 68;BA.debugLine="Activity.RemoveAllViews 'Hapus Design pada layou";
Debug.ShouldStop(8);
parent.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 69;BA.debugLine="Activity.LoadLayout(\"Welcome\")";
Debug.ShouldStop(16);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Welcome")),main.mostCurrent.activityBA);
 BA.debugLineNum = 70;BA.debugLine="Dim Segoeui As Typeface";
Debug.ShouldStop(32);
_segoeui = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");Debug.locals.put("Segoeui", _segoeui);
 BA.debugLineNum = 71;BA.debugLine="Segoeui =Typeface.LoadFromAssets(\"SEGOEUI.TTF\")";
Debug.ShouldStop(64);
_segoeui.setObject(parent.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("SEGOEUI.TTF"))));
 BA.debugLineNum = 75;BA.debugLine="LblWelcome2.Typeface = Segoeui";
Debug.ShouldStop(1024);
parent.mostCurrent._lblwelcome2.runMethod(false,"setTypeface",(_segoeui.getObject()));
 BA.debugLineNum = 76;BA.debugLine="LblSignin.Typeface = Segoeui";
Debug.ShouldStop(2048);
parent.mostCurrent._lblsignin.runMethod(false,"setTypeface",(_segoeui.getObject()));
 if (true) break;
;
 BA.debugLineNum = 79;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";
Debug.ShouldStop(16384);

case 6:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._starter._gps1.runMethod(true,"getGPSEnabled"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 17;
 BA.debugLineNum = 80;BA.debugLine="ToastMessageShow(\"Please enable the GPS device.\"";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please enable the GPS device.")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 81;BA.debugLine="StartActivity(Starter.GPS1.LocationSettingsInten";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((parent.mostCurrent._starter._gps1.runMethod(false,"getLocationSettingsIntent"))));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 83;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
Debug.ShouldStop(262144);
parent.mostCurrent._starter._rp.runVoidMethod ("CheckAndRequest",main.processBA,(Object)(parent.mostCurrent._starter._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 84;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), null);
this.state = 18;
return;
case 18:
//C
this.state = 11;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 85;BA.debugLine="If Result Then CallSubDelayed(Starter, \"StartGPS";
Debug.ShouldStop(1048576);
if (true) break;

case 11:
//if
this.state = 16;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",main.processBA,(Object)((parent.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StartGPS")));
if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = -1;
;
 BA.debugLineNum = 88;BA.debugLine="End Sub";
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
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,129);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 129;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="FunctionAll.SetAnimation(\"zoom_enter\", \"zoom_exit";
Debug.ShouldStop(2);
main.mostCurrent._functionall.runVoidMethod ("_setanimation",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,114);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");
RemoteObject _path = RemoteObject.createImmutable("");
 BA.debugLineNum = 114;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="If ShouldIClose = True Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",main._shouldiclose,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 116;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 117;BA.debugLine="ExitApplication";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 118;BA.debugLine="ShouldIClose = False";
Debug.ShouldStop(2097152);
main._shouldiclose = main.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 120;BA.debugLine="Dim path As String";
Debug.ShouldStop(8388608);
_path = RemoteObject.createImmutable("");Debug.locals.put("path", _path);
 BA.debugLineNum = 121;BA.debugLine="path =folder";
Debug.ShouldStop(16777216);
_path = main._folder;Debug.locals.put("path", _path);
 BA.debugLineNum = 122;BA.debugLine="If File.Exists(path,\"datastore\") Then";
Debug.ShouldStop(33554432);
if (main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_path),(Object)(RemoteObject.createImmutable("datastore"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 123;BA.debugLine="Log(\"file datastore ada\")";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("file datastore ada")));
 }else {
 BA.debugLineNum = 125;BA.debugLine="Log(\"file datastore tidak ada\")";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("file datastore tidak ada")));
 };
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _animsplash() throws Exception{
try {
		Debug.PushSubsStack("AnimSplash (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,104);
if (RapidSub.canDelegate("animsplash")) return b4a.example.main.remoteMe.runUserSub(false, "main","animsplash");
 BA.debugLineNum = 104;BA.debugLine="Sub AnimSplash()";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="If btAnim.IsInitialized Then";
Debug.ShouldStop(256);
if (main.mostCurrent._btanim.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 106;BA.debugLine="btAnim.Stop(ImageView1)";
Debug.ShouldStop(512);
main.mostCurrent._btanim.runVoidMethod ("Stop",(Object)((main.mostCurrent._imageview1.getObject())));
 BA.debugLineNum = 107;BA.debugLine="Activity.Invalidate";
Debug.ShouldStop(1024);
main.mostCurrent._activity.runVoidMethod ("Invalidate");
 };
 BA.debugLineNum = 109;BA.debugLine="btAnim.InitializeTranslate( \"AllFunction.btAnim\",";
Debug.ShouldStop(4096);
main.mostCurrent._btanim.runVoidMethod ("InitializeTranslate",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("AllFunction.btAnim")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, -(double) (0 + main.mostCurrent._activity.runMethod(true,"getHeight").<Integer>get().intValue()))),(Object)(BA.numberCast(float.class, main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 110;BA.debugLine="btAnim.SetInterpolator(btAnim.INTERPOLATOR_BOUNCE";
Debug.ShouldStop(8192);
main.mostCurrent._btanim.runVoidMethod ("SetInterpolator",(Object)(main.mostCurrent._btanim.getField(true,"INTERPOLATOR_BOUNCE")));
 BA.debugLineNum = 111;BA.debugLine="btAnim.Duration = 1500";
Debug.ShouldStop(16384);
main.mostCurrent._btanim.runMethod(true,"setDuration",BA.numberCast(long.class, 1500));
 BA.debugLineNum = 112;BA.debugLine="btAnim.Start(ImageView1)	'Jlaankan animasi pada o";
Debug.ShouldStop(32768);
main.mostCurrent._btanim.runVoidMethod ("Start",(Object)((main.mostCurrent._imageview1.getObject())));
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnadmin_click() throws Exception{
try {
		Debug.PushSubsStack("BtnAdmin_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,138);
if (RapidSub.canDelegate("btnadmin_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","btnadmin_click");
 BA.debugLineNum = 138;BA.debugLine="Sub BtnAdmin_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="StartActivity(Login)";
Debug.ShouldStop(1024);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._login.getObject())));
 BA.debugLineNum = 140;BA.debugLine="FunctionAll.SetAnimation(\"zoom_enter\", \"zoom_exit";
Debug.ShouldStop(2048);
main.mostCurrent._functionall.runVoidMethod ("_setanimation",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
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
public static RemoteObject  _btnguest_click() throws Exception{
try {
		Debug.PushSubsStack("BtnGuest_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,133);
if (RapidSub.canDelegate("btnguest_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","btnguest_click");
 BA.debugLineNum = 133;BA.debugLine="Sub BtnGuest_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 134;BA.debugLine="StartActivity(Home)";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._home.getObject())));
 BA.debugLineNum = 135;BA.debugLine="FunctionAll.SetAnimation(\"zoom_enter\", \"zoom_exit";
Debug.ShouldStop(64);
main.mostCurrent._functionall.runVoidMethod ("_setanimation",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkloginsession() throws Exception{
try {
		Debug.PushSubsStack("CheckLoginSession (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,89);
if (RapidSub.canDelegate("checkloginsession")) return b4a.example.main.remoteMe.runUserSub(false, "main","checkloginsession");
RemoteObject _islogin = RemoteObject.createImmutable(false);
 BA.debugLineNum = 89;BA.debugLine="Sub CheckLoginSession()";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="Dim isLogin As Boolean";
Debug.ShouldStop(33554432);
_islogin = RemoteObject.createImmutable(false);Debug.locals.put("isLogin", _islogin);
 BA.debugLineNum = 91;BA.debugLine="isLogin = Login.manager.GetBoolean(\"is_login\")";
Debug.ShouldStop(67108864);
_islogin = main.mostCurrent._login._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("is_login")));Debug.locals.put("isLogin", _islogin);
 BA.debugLineNum = 93;BA.debugLine="If isLogin Then";
Debug.ShouldStop(268435456);
if (_islogin.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 94;BA.debugLine="StartActivity(HomeAdmin)";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._homeadmin.getObject())));
 BA.debugLineNum = 95;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1073741824);
main.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 97;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 40;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 44;BA.debugLine="Private BtnGuest As Button";
main.mostCurrent._btnguest = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private BtnAdmin As Button";
main.mostCurrent._btnadmin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Public btAnim As AnimationPlus  'animasi object b";
main.mostCurrent._btanim = RemoteObject.createNew ("flm.b4a.animationplus.AnimationPlusWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private LblWelcome As Label";
main.mostCurrent._lblwelcome = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private LblWelcome2 As Label";
main.mostCurrent._lblwelcome2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private LblSignin As Label";
main.mostCurrent._lblsignin = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private ImageView1 As ImageView";
main.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private CheckBox1 As CheckBox";
main.mostCurrent._checkbox1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
officedetail_subs_0._process_globals();
functionall_subs_0._process_globals();
searchbuilding_subs_0._process_globals();
educationaldetail_subs_0._process_globals();
healthdetail_subs_0._process_globals();
housedetail_subs_0._process_globals();
msmedetail_subs_0._process_globals();
worshipdetail_subs_0._process_globals();
manualposition_subs_0._process_globals();
home_subs_0._process_globals();
homeadmin_subs_0._process_globals();
login_subs_0._process_globals();
addfacilitytype_subs_0._process_globals();
editbuildingfacility_subs_0._process_globals();
addbuildingfacility_subs_0._process_globals();
officeedit_subs_0._process_globals();
msmebuilding_subs_0._process_globals();
worshipbuilding_subs_0._process_globals();
addphoto_subs_0._process_globals();
loaderimage_subs_0._process_globals();
maincamera_subs_0._process_globals();
fileutil_subs_0._process_globals();
showimage_subs_0._process_globals();
browsegallery_subs_0._process_globals();
educationaledit_subs_0._process_globals();
housebuilding_subs_0._process_globals();
worshipedit_subs_0._process_globals();
healthbuilding_subs_0._process_globals();
gallery_subs_0._process_globals();
officebuilding_subs_0._process_globals();
educationalbuilding_subs_0._process_globals();
msmeedit_subs_0._process_globals();
buildinglist_subs_0._process_globals();
help_subs_0._process_globals();
healthedit_subs_0._process_globals();
searchworship_subs_0._process_globals();
multipartpost_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
officedetail.myClass = BA.getDeviceClass ("b4a.example.officedetail");
functionall.myClass = BA.getDeviceClass ("b4a.example.functionall");
searchbuilding.myClass = BA.getDeviceClass ("b4a.example.searchbuilding");
educationaldetail.myClass = BA.getDeviceClass ("b4a.example.educationaldetail");
healthdetail.myClass = BA.getDeviceClass ("b4a.example.healthdetail");
housedetail.myClass = BA.getDeviceClass ("b4a.example.housedetail");
msmedetail.myClass = BA.getDeviceClass ("b4a.example.msmedetail");
worshipdetail.myClass = BA.getDeviceClass ("b4a.example.worshipdetail");
manualposition.myClass = BA.getDeviceClass ("b4a.example.manualposition");
home.myClass = BA.getDeviceClass ("b4a.example.home");
homeadmin.myClass = BA.getDeviceClass ("b4a.example.homeadmin");
login.myClass = BA.getDeviceClass ("b4a.example.login");
addfacilitytype.myClass = BA.getDeviceClass ("b4a.example.addfacilitytype");
editbuildingfacility.myClass = BA.getDeviceClass ("b4a.example.editbuildingfacility");
arcmenu.myClass = BA.getDeviceClass ("b4a.example.arcmenu");
addbuildingfacility.myClass = BA.getDeviceClass ("b4a.example.addbuildingfacility");
officeedit.myClass = BA.getDeviceClass ("b4a.example.officeedit");
msmebuilding.myClass = BA.getDeviceClass ("b4a.example.msmebuilding");
worshipbuilding.myClass = BA.getDeviceClass ("b4a.example.worshipbuilding");
addphoto.myClass = BA.getDeviceClass ("b4a.example.addphoto");
loaderimage.myClass = BA.getDeviceClass ("b4a.example.loaderimage");
maincamera.myClass = BA.getDeviceClass ("b4a.example.maincamera");
fileutil.myClass = BA.getDeviceClass ("b4a.example.fileutil");
showimage.myClass = BA.getDeviceClass ("b4a.example.showimage");
browsegallery.myClass = BA.getDeviceClass ("b4a.example.browsegallery");
educationaledit.myClass = BA.getDeviceClass ("b4a.example.educationaledit");
camex2.myClass = BA.getDeviceClass ("b4a.example.camex2");
housebuilding.myClass = BA.getDeviceClass ("b4a.example.housebuilding");
worshipedit.myClass = BA.getDeviceClass ("b4a.example.worshipedit");
healthbuilding.myClass = BA.getDeviceClass ("b4a.example.healthbuilding");
gallery.myClass = BA.getDeviceClass ("b4a.example.gallery");
officebuilding.myClass = BA.getDeviceClass ("b4a.example.officebuilding");
educationalbuilding.myClass = BA.getDeviceClass ("b4a.example.educationalbuilding");
msmeedit.myClass = BA.getDeviceClass ("b4a.example.msmeedit");
buildinglist.myClass = BA.getDeviceClass ("b4a.example.buildinglist");
help.myClass = BA.getDeviceClass ("b4a.example.help");
healthedit.myClass = BA.getDeviceClass ("b4a.example.healthedit");
searchworship.myClass = BA.getDeviceClass ("b4a.example.searchworship");
multipartpost.myClass = BA.getDeviceClass ("b4a.example.multipartpost");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 24;BA.debugLine="Dim kvs As KeyValueStore";
main._kvs = RemoteObject.createNew ("b4a.example3.keyvaluestore");
 //BA.debugLineNum = 28;BA.debugLine="Dim tmSplash As Timer 'timer untuk animasi splash";
main._tmsplash = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 29;BA.debugLine="Dim Server As String = \"http://192.168.1.10/gisbu";
main._server = BA.ObjectToString("http://192.168.1.10/gisbuilding_mobile/");
 //BA.debugLineNum = 30;BA.debugLine="Dim ServerMap As String = Server";
main._servermap = main._server;
 //BA.debugLineNum = 31;BA.debugLine="Dim lblLon As String";
main._lbllon = RemoteObject.createImmutable("");
 //BA.debugLineNum = 32;BA.debugLine="Dim lblLat As String";
main._lbllat = RemoteObject.createImmutable("");
 //BA.debugLineNum = 33;BA.debugLine="Dim lblSpeed As String";
main._lblspeed = RemoteObject.createImmutable("");
 //BA.debugLineNum = 34;BA.debugLine="Dim lblSatellites As String";
main._lblsatellites = RemoteObject.createImmutable("");
 //BA.debugLineNum = 35;BA.debugLine="Private rp As RuntimePermissions";
main._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 36;BA.debugLine="Dim folder As String";
main._folder = RemoteObject.createImmutable("");
 //BA.debugLineNum = 37;BA.debugLine="Dim ShouldIClose As Boolean";
main._shouldiclose = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _tmsplash_tick() throws Exception{
try {
		Debug.PushSubsStack("tmSplash_Tick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,98);
if (RapidSub.canDelegate("tmsplash_tick")) return b4a.example.main.remoteMe.runUserSub(false, "main","tmsplash_tick");
 BA.debugLineNum = 98;BA.debugLine="Sub tmSplash_Tick";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="tmSplash.Enabled = False 'disable timer";
Debug.ShouldStop(4);
main._tmsplash.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 100;BA.debugLine="Activity.RemoveAllViews 'Hapus Design pada layout";
Debug.ShouldStop(8);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 101;BA.debugLine="Activity.LoadLayout(\"Welcome\") 'load layout lyHom";
Debug.ShouldStop(16);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Welcome")),main.mostCurrent.activityBA);
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}