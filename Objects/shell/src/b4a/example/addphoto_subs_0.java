package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class addphoto_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (addphoto) ","addphoto",21,addphoto.mostCurrent.activityBA,addphoto.mostCurrent,42);
if (RapidSub.canDelegate("activity_create")) return b4a.example.addphoto.remoteMe.runUserSub(false, "addphoto","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(2048);
addphoto.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),addphoto.mostCurrent.activityBA);
 BA.debugLineNum = 45;BA.debugLine="ScrollView1.Panel.LoadLayout(\"AddPhoto\")";
Debug.ShouldStop(4096);
addphoto.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("AddPhoto")),addphoto.mostCurrent.activityBA);
 BA.debugLineNum = 46;BA.debugLine="ScrollView1.Height = 100%y - ScrollView1.Top";
Debug.ShouldStop(8192);
addphoto.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {addphoto.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),addphoto.mostCurrent.activityBA),addphoto.mostCurrent._scrollview1.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 47;BA.debugLine="PanelToolBar.Visible = False";
Debug.ShouldStop(16384);
addphoto.mostCurrent._paneltoolbar.runMethod(true,"setVisible",addphoto.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 48;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(32768);
addphoto._base64con.runVoidMethod ("_initialize",addphoto.processBA);
 BA.debugLineNum = 50;BA.debugLine="BackArrow.Visible= True";
Debug.ShouldStop(131072);
addphoto.mostCurrent._backarrow.runMethod(true,"setVisible",addphoto.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 51;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(262144);
addphoto.mostCurrent._backarrow.runVoidMethod ("SetBackgroundImageNew",(Object)((addphoto.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(addphoto.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("back-arrow.png"))).getObject())));
 BA.debugLineNum = 52;BA.debugLine="TitleBar.Text=\"Upload Photo\"";
Debug.ShouldStop(524288);
addphoto.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("Upload Photo"));
 BA.debugLineNum = 54;BA.debugLine="ImageView1.Gravity=Gravity.CENTER";
Debug.ShouldStop(2097152);
addphoto.mostCurrent._imageview1.runMethod(true,"setGravity",addphoto.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 55;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(4194304);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 56;BA.debugLine="temp = rp.GetSafeDirDefaultExternal(\"temp\")";
Debug.ShouldStop(8388608);
addphoto._temp = addphoto.mostCurrent._rp.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("temp")));
 BA.debugLineNum = 57;BA.debugLine="folder = rp.GetSafeDirDefaultExternal(\"uploads\")";
Debug.ShouldStop(16777216);
addphoto.mostCurrent._folder = addphoto.mostCurrent._rp.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("uploads")));
 BA.debugLineNum = 58;BA.debugLine="hc.Initialize(\"hc\")";
Debug.ShouldStop(33554432);
addphoto._hc.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("hc")));
 BA.debugLineNum = 59;BA.debugLine="chooser.Initialize(\"chooser\")";
Debug.ShouldStop(67108864);
addphoto._chooser.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("chooser")));
 };
 BA.debugLineNum = 61;BA.debugLine="If Home.HomeBuilding.Length > 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",addphoto.mostCurrent._home._homebuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 62;BA.debugLine="Log(Home.HomeBuilding)";
Debug.ShouldStop(536870912);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(addphoto.mostCurrent._home._homebuilding));
 BA.debugLineNum = 63;BA.debugLine="Select Home.HomeBuilding";
Debug.ShouldStop(1073741824);
switch (BA.switchObjectToInt(addphoto.mostCurrent._home._homebuilding,BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Health"),BA.ObjectToString("Msme"),BA.ObjectToString("Educational"))) {
case 0: {
 BA.debugLineNum = 65;BA.debugLine="If WorshipBuilding.idBuilding.Length > 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",addphoto.mostCurrent._worshipbuilding._idbuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 66;BA.debugLine="idBuilding= WorshipBuilding.idBuilding";
Debug.ShouldStop(2);
addphoto.mostCurrent._idbuilding = addphoto.mostCurrent._worshipbuilding._idbuilding;
 BA.debugLineNum = 67;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(4);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(addphoto.mostCurrent._idbuilding));
 }else {
 BA.debugLineNum = 69;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(16);
addphoto.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),addphoto.mostCurrent.activityBA);
 BA.debugLineNum = 70;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32);
addphoto.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
case 1: {
 BA.debugLineNum = 73;BA.debugLine="If OfficeBuilding.idBuilding.Length > 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",addphoto.mostCurrent._officebuilding._idbuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 74;BA.debugLine="idBuilding= OfficeBuilding.idBuilding";
Debug.ShouldStop(512);
addphoto.mostCurrent._idbuilding = addphoto.mostCurrent._officebuilding._idbuilding;
 BA.debugLineNum = 75;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(1024);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(addphoto.mostCurrent._idbuilding));
 }else {
 BA.debugLineNum = 77;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(4096);
addphoto.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),addphoto.mostCurrent.activityBA);
 BA.debugLineNum = 78;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
addphoto.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
case 2: {
 BA.debugLineNum = 81;BA.debugLine="If HealthBuilding.idBuilding.Length > 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",addphoto.mostCurrent._healthbuilding._idbuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 82;BA.debugLine="idBuilding= HealthBuilding.idBuilding";
Debug.ShouldStop(131072);
addphoto.mostCurrent._idbuilding = addphoto.mostCurrent._healthbuilding._idbuilding;
 BA.debugLineNum = 83;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(262144);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(addphoto.mostCurrent._idbuilding));
 }else {
 BA.debugLineNum = 85;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(1048576);
addphoto.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),addphoto.mostCurrent.activityBA);
 BA.debugLineNum = 86;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2097152);
addphoto.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
case 3: {
 BA.debugLineNum = 89;BA.debugLine="If MsmeBuilding.idBuilding.Length > 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",addphoto.mostCurrent._msmebuilding._idbuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 90;BA.debugLine="idBuilding= MsmeBuilding.idBuilding";
Debug.ShouldStop(33554432);
addphoto.mostCurrent._idbuilding = addphoto.mostCurrent._msmebuilding._idbuilding;
 BA.debugLineNum = 91;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(67108864);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(addphoto.mostCurrent._idbuilding));
 }else {
 BA.debugLineNum = 93;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(268435456);
addphoto.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),addphoto.mostCurrent.activityBA);
 BA.debugLineNum = 94;BA.debugLine="Activity.Finish";
Debug.ShouldStop(536870912);
addphoto.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
case 4: {
 BA.debugLineNum = 97;BA.debugLine="If EducationalBuilding.idBuilding.Length > 0 T";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",addphoto.mostCurrent._educationalbuilding._idbuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 98;BA.debugLine="idBuilding= EducationalBuilding.idBuilding";
Debug.ShouldStop(2);
addphoto.mostCurrent._idbuilding = addphoto.mostCurrent._educationalbuilding._idbuilding;
 BA.debugLineNum = 99;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(4);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(addphoto.mostCurrent._idbuilding));
 }else {
 BA.debugLineNum = 101;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(16);
addphoto.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),addphoto.mostCurrent.activityBA);
 BA.debugLineNum = 102;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32);
addphoto.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
default: {
 BA.debugLineNum = 105;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(256);
addphoto.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),addphoto.mostCurrent.activityBA);
 BA.debugLineNum = 106;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
addphoto.mostCurrent._activity.runVoidMethod ("Finish");
 break; }
}
;
 }else 
{ BA.debugLineNum = 108;BA.debugLine="Else If SearchBuilding.idspin.Length > 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",addphoto.mostCurrent._searchbuilding._idspin.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 109;BA.debugLine="buildingtype = SearchBuilding.idspin";
Debug.ShouldStop(4096);
addphoto.mostCurrent._buildingtype = addphoto.mostCurrent._searchbuilding._idspin;
 BA.debugLineNum = 110;BA.debugLine="Log(buildingtype)";
Debug.ShouldStop(8192);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(addphoto.mostCurrent._buildingtype));
 BA.debugLineNum = 111;BA.debugLine="If SearchBuilding.idBuilding.Length > 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",addphoto.mostCurrent._searchbuilding._idbuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 112;BA.debugLine="idBuilding = SearchBuilding.idBuilding";
Debug.ShouldStop(32768);
addphoto.mostCurrent._idbuilding = addphoto.mostCurrent._searchbuilding._idbuilding;
 BA.debugLineNum = 113;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(65536);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(addphoto.mostCurrent._idbuilding));
 }else {
 BA.debugLineNum = 115;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(262144);
addphoto.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),addphoto.mostCurrent.activityBA);
 BA.debugLineNum = 116;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
addphoto.mostCurrent._activity.runVoidMethod ("Finish");
 };
 }}
;
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Activity_Pause (addphoto) ","addphoto",21,addphoto.mostCurrent.activityBA,addphoto.mostCurrent,126);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.addphoto.remoteMe.runUserSub(false, "addphoto","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 126;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("Activity_PermissionResult (addphoto) ","addphoto",21,addphoto.mostCurrent.activityBA,addphoto.mostCurrent,295);
if (RapidSub.canDelegate("activity_permissionresult")) return b4a.example.addphoto.remoteMe.runUserSub(false, "addphoto","activity_permissionresult", _permission, _result);
Debug.locals.put("Permission", _permission);
Debug.locals.put("Result", _result);
 BA.debugLineNum = 295;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
Debug.ShouldStop(64);
 BA.debugLineNum = 296;BA.debugLine="If Permission = rp.PERMISSION_ACCESS_FINE_LOCATIO";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_permission,addphoto.mostCurrent._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION"))) { 
 };
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Activity_Resume (addphoto) ","addphoto",21,addphoto.mostCurrent.activityBA,addphoto.mostCurrent,122);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.addphoto.remoteMe.runUserSub(false, "addphoto","activity_resume");
 BA.debugLineNum = 122;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(33554432);
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
public static void  _buttonbrowse_click() throws Exception{
ResumableSub_ButtonBrowse_Click rsub = new ResumableSub_ButtonBrowse_Click(null);
rsub.resume(null, null);
}
public static class ResumableSub_ButtonBrowse_Click extends BA.ResumableSub {
public ResumableSub_ButtonBrowse_Click(b4a.example.addphoto parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.addphoto parent;
RemoteObject _list_files = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
int step5;
int limit5;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ButtonBrowse_Click (addphoto) ","addphoto",21,addphoto.mostCurrent.activityBA,addphoto.mostCurrent,130);
if (RapidSub.canDelegate("buttonbrowse_click")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 131;BA.debugLine="Dim list_files As List";
Debug.ShouldStop(4);
_list_files = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("list_files", _list_files);
 BA.debugLineNum = 132;BA.debugLine="list_files.Initialize";
Debug.ShouldStop(8);
_list_files.runVoidMethod ("Initialize");
 BA.debugLineNum = 133;BA.debugLine="list_files = File.ListFiles(temp)";
Debug.ShouldStop(16);
_list_files = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(parent._temp));Debug.locals.put("list_files", _list_files);
 BA.debugLineNum = 134;BA.debugLine="Log(list_files.Size)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_list_files.runMethod(true,"getSize"))));
 BA.debugLineNum = 135;BA.debugLine="For i= 0 To list_files.Size-1";
Debug.ShouldStop(64);
if (true) break;

case 1:
//for
this.state = 4;
step5 = 1;
limit5 = RemoteObject.solve(new RemoteObject[] {_list_files.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 9;
if (true) break;

case 9:
//C
this.state = 4;
if ((step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5)) this.state = 3;
if (true) break;

case 10:
//C
this.state = 9;
_i = ((int)(0 + _i + step5)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 10;
 BA.debugLineNum = 136;BA.debugLine="File.Delete(temp,list_files.Get(i))";
Debug.ShouldStop(128);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent._temp),(Object)(BA.ObjectToString(_list_files.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 BA.debugLineNum = 137;BA.debugLine="Log(list_files.size)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_list_files.runMethod(true,"getSize"))));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 143;BA.debugLine="Log(\"IDnyaa LOOOO: \"&idBuilding)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("IDnyaa LOOOO: "),parent.mostCurrent._idbuilding)));
 BA.debugLineNum = 144;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_READ_EXTERNAL_ST";
Debug.ShouldStop(32768);
parent.mostCurrent._rp.runVoidMethod ("CheckAndRequest",addphoto.processBA,(Object)(parent.mostCurrent._rp.getField(true,"PERMISSION_READ_EXTERNAL_STORAGE")));
 BA.debugLineNum = 145;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", addphoto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), null);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 146;BA.debugLine="If Result Then";
Debug.ShouldStop(131072);
if (true) break;

case 5:
//if
this.state = 8;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 147;BA.debugLine="Dim a As Intent";
Debug.ShouldStop(262144);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 149;BA.debugLine="a.Initialize(a.ACTION_PICK, \"content://media/ext";
Debug.ShouldStop(1048576);
_a.runVoidMethod ("Initialize",(Object)(_a.getField(true,"ACTION_PICK")),(Object)(RemoteObject.createImmutable("content://media/external/images/media/")));
 BA.debugLineNum = 150;BA.debugLine="a.PutExtra(\"android.intent.extra.ALLOW_MULTIPLE\"";
Debug.ShouldStop(2097152);
_a.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("android.intent.extra.ALLOW_MULTIPLE")),(Object)((parent.mostCurrent.__c.getField(true,"True"))));
 BA.debugLineNum = 151;BA.debugLine="a.SetType(\"image/*\")";
Debug.ShouldStop(4194304);
_a.runVoidMethod ("SetType",(Object)(RemoteObject.createImmutable("image/*")));
 BA.debugLineNum = 152;BA.debugLine="StartActivityForResult(a)";
Debug.ShouldStop(8388608);
_startactivityforresult(_a);
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _buttoncamera_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonCamera_Click (addphoto) ","addphoto",21,addphoto.mostCurrent.activityBA,addphoto.mostCurrent,305);
if (RapidSub.canDelegate("buttoncamera_click")) return b4a.example.addphoto.remoteMe.runUserSub(false, "addphoto","buttoncamera_click");
RemoteObject _list_files = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
 BA.debugLineNum = 305;BA.debugLine="Sub ButtonCamera_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 306;BA.debugLine="ToastMessageShow(\"fileee: \"&namefile,False)";
Debug.ShouldStop(131072);
addphoto.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("fileee: "),addphoto.mostCurrent._namefile))),(Object)(addphoto.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 307;BA.debugLine="Dim list_files As List";
Debug.ShouldStop(262144);
_list_files = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("list_files", _list_files);
 BA.debugLineNum = 308;BA.debugLine="list_files.Initialize";
Debug.ShouldStop(524288);
_list_files.runVoidMethod ("Initialize");
 BA.debugLineNum = 309;BA.debugLine="list_files = File.ListFiles(temp)";
Debug.ShouldStop(1048576);
_list_files = addphoto.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(addphoto._temp));Debug.locals.put("list_files", _list_files);
 BA.debugLineNum = 310;BA.debugLine="Log(list_files.Size)";
Debug.ShouldStop(2097152);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_list_files.runMethod(true,"getSize"))));
 BA.debugLineNum = 311;BA.debugLine="For i= 0 To list_files.Size-1";
Debug.ShouldStop(4194304);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_list_files.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 312;BA.debugLine="File.Delete(temp,list_files.Get(i))";
Debug.ShouldStop(8388608);
addphoto.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(addphoto._temp),(Object)(BA.ObjectToString(_list_files.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 BA.debugLineNum = 313;BA.debugLine="Log(list_files.size)";
Debug.ShouldStop(16777216);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_list_files.runMethod(true,"getSize"))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 315;BA.debugLine="StartActivity(MainCamera)";
Debug.ShouldStop(67108864);
addphoto.mostCurrent.__c.runVoidMethod ("StartActivity",addphoto.processBA,(Object)((addphoto.mostCurrent._maincamera.getObject())));
 BA.debugLineNum = 317;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonupload_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonUpload_Click (addphoto) ","addphoto",21,addphoto.mostCurrent.activityBA,addphoto.mostCurrent,351);
if (RapidSub.canDelegate("buttonupload_click")) return b4a.example.addphoto.remoteMe.runUserSub(false, "addphoto","buttonupload_click");
RemoteObject _tanggal = RemoteObject.createImmutable("");
RemoteObject _baseim = RemoteObject.createImmutable("");
RemoteObject _filenamefile = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _files = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _fd = RemoteObject.declareNull("b4a.example.multipartpost._filedata");
RemoteObject _nv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _req = RemoteObject.declareNull("anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest");
 BA.debugLineNum = 351;BA.debugLine="Sub ButtonUpload_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 352;BA.debugLine="ToastMessageShow(\"fileee: \"&namefile,False)";
Debug.ShouldStop(-2147483648);
addphoto.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("fileee: "),addphoto.mostCurrent._namefile))),(Object)(addphoto.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 354;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
Debug.ShouldStop(2);
addphoto.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 355;BA.debugLine="Dim tanggal As String";
Debug.ShouldStop(4);
_tanggal = RemoteObject.createImmutable("");Debug.locals.put("tanggal", _tanggal);
 BA.debugLineNum = 356;BA.debugLine="tanggal = DateTime.Date(DateTime.now)";
Debug.ShouldStop(8);
_tanggal = addphoto.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(addphoto.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("tanggal", _tanggal);
 BA.debugLineNum = 357;BA.debugLine="Log(tanggal)";
Debug.ShouldStop(16);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(_tanggal));
 BA.debugLineNum = 358;BA.debugLine="Dim baseim As String";
Debug.ShouldStop(32);
_baseim = RemoteObject.createImmutable("");Debug.locals.put("baseim", _baseim);
 BA.debugLineNum = 359;BA.debugLine="baseim = Base64Con.EncodeFromImage(temp,namefile)";
Debug.ShouldStop(64);
_baseim = addphoto._base64con.runMethod(true,"_encodefromimage",(Object)(addphoto._temp),(Object)(addphoto.mostCurrent._namefile));Debug.locals.put("baseim", _baseim);
 BA.debugLineNum = 360;BA.debugLine="Log (\"BASE64: \"&baseim)";
Debug.ShouldStop(128);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("BASE64: "),_baseim)));
 BA.debugLineNum = 362;BA.debugLine="Dim filenamefile , filename As String";
Debug.ShouldStop(512);
_filenamefile = RemoteObject.createImmutable("");Debug.locals.put("filenamefile", _filenamefile);
_filename = RemoteObject.createImmutable("");Debug.locals.put("filename", _filename);
 BA.debugLineNum = 363;BA.debugLine="filenamefile = namefile";
Debug.ShouldStop(1024);
_filenamefile = addphoto.mostCurrent._namefile;Debug.locals.put("filenamefile", _filenamefile);
 BA.debugLineNum = 364;BA.debugLine="Log(\"COBA :\"&filenamefile.SubString2(0, filenamef";
Debug.ShouldStop(2048);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("COBA :"),_filenamefile.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_filenamefile.runMethod(true,"length"),RemoteObject.createImmutable(4)}, "-",1, 1))))));
 BA.debugLineNum = 365;BA.debugLine="filename = filenamefile.SubString2(0, filenamefil";
Debug.ShouldStop(4096);
_filename = _filenamefile.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_filenamefile.runMethod(true,"length"),RemoteObject.createImmutable(4)}, "-",1, 1)));Debug.locals.put("filename", _filename);
 BA.debugLineNum = 366;BA.debugLine="Dim files As List";
Debug.ShouldStop(8192);
_files = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("files", _files);
 BA.debugLineNum = 367;BA.debugLine="files.Initialize";
Debug.ShouldStop(16384);
_files.runVoidMethod ("Initialize");
 BA.debugLineNum = 368;BA.debugLine="Dim fd As FileData";
Debug.ShouldStop(32768);
_fd = RemoteObject.createNew ("b4a.example.multipartpost._filedata");Debug.locals.put("fd", _fd);
 BA.debugLineNum = 369;BA.debugLine="fd.Initialize";
Debug.ShouldStop(65536);
_fd.runVoidMethod ("Initialize");
 BA.debugLineNum = 370;BA.debugLine="fd.Dir = temp";
Debug.ShouldStop(131072);
_fd.setField ("Dir",addphoto._temp);
 BA.debugLineNum = 371;BA.debugLine="fd.FileName = filenamefile";
Debug.ShouldStop(262144);
_fd.setField ("FileName",_filenamefile);
 BA.debugLineNum = 372;BA.debugLine="fd.KeyName = filename";
Debug.ShouldStop(524288);
_fd.setField ("KeyName",_filename);
 BA.debugLineNum = 373;BA.debugLine="fd.ContentType = \"application/octet-stream\"";
Debug.ShouldStop(1048576);
_fd.setField ("ContentType",BA.ObjectToString("application/octet-stream"));
 BA.debugLineNum = 374;BA.debugLine="files.Add(fd)";
Debug.ShouldStop(2097152);
_files.runVoidMethod ("Add",(Object)((_fd)));
 BA.debugLineNum = 375;BA.debugLine="Dim NV As Map";
Debug.ShouldStop(4194304);
_nv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("NV", _nv);
 BA.debugLineNum = 376;BA.debugLine="NV.Initialize";
Debug.ShouldStop(8388608);
_nv.runVoidMethod ("Initialize");
 BA.debugLineNum = 377;BA.debugLine="NV.Put(\"buildingtype\", buildingtype)";
Debug.ShouldStop(16777216);
_nv.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("buildingtype"))),(Object)((addphoto.mostCurrent._buildingtype)));
 BA.debugLineNum = 378;BA.debugLine="NV.Put(\"tanggal\", tanggal)";
Debug.ShouldStop(33554432);
_nv.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tanggal"))),(Object)((_tanggal)));
 BA.debugLineNum = 379;BA.debugLine="NV.Put(\"idbang\", idBuilding)";
Debug.ShouldStop(67108864);
_nv.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("idbang"))),(Object)((addphoto.mostCurrent._idbuilding)));
 BA.debugLineNum = 380;BA.debugLine="NV.Put(\"keyname\", filename)";
Debug.ShouldStop(134217728);
_nv.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("keyname"))),(Object)((_filename)));
 BA.debugLineNum = 381;BA.debugLine="NV.Put(\"action\", \"upload\")";
Debug.ShouldStop(268435456);
_nv.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("action"))),(Object)((RemoteObject.createImmutable("upload"))));
 BA.debugLineNum = 382;BA.debugLine="Dim req As OkHttpRequest";
Debug.ShouldStop(536870912);
_req = RemoteObject.createNew ("anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest");Debug.locals.put("req", _req);
 BA.debugLineNum = 383;BA.debugLine="ProgressDialogShow(\"uploading...\")";
Debug.ShouldStop(1073741824);
addphoto.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",addphoto.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("uploading..."))));
 BA.debugLineNum = 384;BA.debugLine="req = MultipartPost.CreatePostRequest(Main.Server";
Debug.ShouldStop(-2147483648);
_req = addphoto.mostCurrent._multipartpost.runMethod(false,"_createpostrequest",addphoto.mostCurrent.activityBA,(Object)(RemoteObject.concat(addphoto.mostCurrent._main._server,RemoteObject.createImmutable("multipartpost.php"))),(Object)(_nv),(Object)(_files));Debug.locals.put("req", _req);
 BA.debugLineNum = 385;BA.debugLine="hc.Execute(req, 1)";
Debug.ShouldStop(1);
addphoto._hc.runVoidMethod ("Execute",addphoto.processBA,(Object)(_req),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 386;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("CC_Result (addphoto) ","addphoto",21,addphoto.mostCurrent.activityBA,addphoto.mostCurrent,156);
if (RapidSub.canDelegate("cc_result")) return b4a.example.addphoto.remoteMe.runUserSub(false, "addphoto","cc_result", _success, _dir, _filename);
RemoteObject _tanggal = RemoteObject.createImmutable("");
RemoteObject _namafile = RemoteObject.createImmutable("");
Debug.locals.put("Success", _success);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 156;BA.debugLine="Sub CC_Result (Success As Boolean, Dir As String,";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="If Success Then";
Debug.ShouldStop(268435456);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 159;BA.debugLine="Log(\"GET PATH: \"&GetPathFromContentResult(FileN";
Debug.ShouldStop(1073741824);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("GET PATH: "),_getpathfromcontentresult(_filename))));
 BA.debugLineNum = 160;BA.debugLine="DateTime.DateFormat=\"ddmmyyy-hhmmss\"";
Debug.ShouldStop(-2147483648);
addphoto.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("ddmmyyy-hhmmss"));
 BA.debugLineNum = 161;BA.debugLine="Dim tanggal As String";
Debug.ShouldStop(1);
_tanggal = RemoteObject.createImmutable("");Debug.locals.put("tanggal", _tanggal);
 BA.debugLineNum = 162;BA.debugLine="tanggal = DateTime.Date(DateTime.now)";
Debug.ShouldStop(2);
_tanggal = addphoto.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(addphoto.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("tanggal", _tanggal);
 BA.debugLineNum = 163;BA.debugLine="Dim namafile As String";
Debug.ShouldStop(4);
_namafile = RemoteObject.createImmutable("");Debug.locals.put("namafile", _namafile);
 BA.debugLineNum = 164;BA.debugLine="namafile = idBuilding&\"-\"&tanggal&\".jpg\"";
Debug.ShouldStop(8);
_namafile = RemoteObject.concat(addphoto.mostCurrent._idbuilding,RemoteObject.createImmutable("-"),_tanggal,RemoteObject.createImmutable(".jpg"));Debug.locals.put("namafile", _namafile);
 BA.debugLineNum = 166;BA.debugLine="File.Copy(Dir,FileName,temp,namafile)";
Debug.ShouldStop(32);
addphoto.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(_dir),(Object)(_filename),(Object)(addphoto._temp),(Object)(_namafile));
 BA.debugLineNum = 167;BA.debugLine="ShowPicture(namafile)";
Debug.ShouldStop(64);
_showpicture(_namafile);
 };
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getba() throws Exception{
try {
		Debug.PushSubsStack("GetBA (addphoto) ","addphoto",21,addphoto.mostCurrent.activityBA,addphoto.mostCurrent,319);
if (RapidSub.canDelegate("getba")) return b4a.example.addphoto.remoteMe.runUserSub(false, "addphoto","getba");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _cls = RemoteObject.createImmutable("");
 BA.debugLineNum = 319;BA.debugLine="Sub GetBA As Object";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 320;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(-2147483648);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 321;BA.debugLine="Dim cls As String = Me";
Debug.ShouldStop(1);
_cls = BA.ObjectToString(addphoto.getObject());Debug.locals.put("cls", _cls);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 322;BA.debugLine="cls = cls.SubString(\"class \".Length)";
Debug.ShouldStop(2);
_cls = _cls.runMethod(true,"substring",(Object)(RemoteObject.createImmutable("class ").runMethod(true,"length")));Debug.locals.put("cls", _cls);
 BA.debugLineNum = 323;BA.debugLine="jo.InitializeStatic(cls)";
Debug.ShouldStop(4);
_jo.runVoidMethod ("InitializeStatic",(Object)(_cls));
 BA.debugLineNum = 324;BA.debugLine="Return jo.GetField(\"processBA\")";
Debug.ShouldStop(8);
if (true) return _jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("processBA")));
 BA.debugLineNum = 325;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpathfromcontentresult(RemoteObject _uristring) throws Exception{
try {
		Debug.PushSubsStack("GetPathFromContentResult (addphoto) ","addphoto",21,addphoto.mostCurrent.activityBA,addphoto.mostCurrent,171);
if (RapidSub.canDelegate("getpathfromcontentresult")) return b4a.example.addphoto.remoteMe.runUserSub(false, "addphoto","getpathfromcontentresult", _uristring);
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _uri1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper");
RemoteObject _proj = null;
RemoteObject _cr = RemoteObject.declareNull("anywheresoftware.b4a.objects.ContentResolverWrapper");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable("");
Debug.locals.put("UriString", _uristring);
 BA.debugLineNum = 171;BA.debugLine="Sub GetPathFromContentResult(UriString As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="If UriString.StartsWith(\"/\") Then Return UriStrin";
Debug.ShouldStop(2048);
if (_uristring.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("/"))).<Boolean>get().booleanValue()) { 
if (true) return _uristring;};
 BA.debugLineNum = 173;BA.debugLine="Dim Cursor1 As Cursor";
Debug.ShouldStop(4096);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 174;BA.debugLine="Dim Uri1 As Uri";
Debug.ShouldStop(8192);
_uri1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper");Debug.locals.put("Uri1", _uri1);
 BA.debugLineNum = 175;BA.debugLine="Dim Proj() As String = Array As String(\"_data\")";
Debug.ShouldStop(16384);
_proj = RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("_data")});Debug.locals.put("Proj", _proj);Debug.locals.put("Proj", _proj);
 BA.debugLineNum = 176;BA.debugLine="Dim cr As ContentResolver";
Debug.ShouldStop(32768);
_cr = RemoteObject.createNew ("anywheresoftware.b4a.objects.ContentResolverWrapper");Debug.locals.put("cr", _cr);
 BA.debugLineNum = 177;BA.debugLine="cr.Initialize(\"\")";
Debug.ShouldStop(65536);
_cr.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 178;BA.debugLine="If UriString.StartsWith(\"content://com.android.pr";
Debug.ShouldStop(131072);
if (_uristring.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("content://com.android.providers.media.documents"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 179;BA.debugLine="Dim i As Int = UriString.IndexOf(\"%3A\")";
Debug.ShouldStop(262144);
_i = _uristring.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("%3A")));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 180;BA.debugLine="Dim id As String = UriString.SubString(i + 3)";
Debug.ShouldStop(524288);
_id = _uristring.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(3)}, "+",1, 1)));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 181;BA.debugLine="Uri1.Parse(\"content://media/external/images/medi";
Debug.ShouldStop(1048576);
_uri1.runVoidMethod ("Parse",(Object)(RemoteObject.createImmutable("content://media/external/images/media")));
 BA.debugLineNum = 182;BA.debugLine="Cursor1 = cr.Query(Uri1, Proj, \"_id = ?\", Array";
Debug.ShouldStop(2097152);
_cursor1 = _cr.runMethod(false,"Query",(Object)(_uri1),(Object)(_proj),(Object)(BA.ObjectToString("_id = ?")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_id})),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Cursor1", _cursor1);
 }else {
 BA.debugLineNum = 184;BA.debugLine="Uri1.Parse(UriString)";
Debug.ShouldStop(8388608);
_uri1.runVoidMethod ("Parse",(Object)(_uristring));
 BA.debugLineNum = 185;BA.debugLine="Cursor1 = cr.Query(Uri1, Proj, \"\", Null, \"\")";
Debug.ShouldStop(16777216);
_cursor1 = _cr.runMethod(false,"Query",(Object)(_uri1),(Object)(_proj),(Object)(BA.ObjectToString("")),(Object)((addphoto.mostCurrent.__c.getField(false,"Null"))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Cursor1", _cursor1);
 };
 BA.debugLineNum = 187;BA.debugLine="Cursor1.Position = 0";
Debug.ShouldStop(67108864);
_cursor1.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 188;BA.debugLine="Dim res As String";
Debug.ShouldStop(134217728);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 189;BA.debugLine="res = Cursor1.GetString(\"_data\")";
Debug.ShouldStop(268435456);
_res = _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("_data")));Debug.locals.put("res", _res);
 BA.debugLineNum = 190;BA.debugLine="Cursor1.Close";
Debug.ShouldStop(536870912);
_cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 191;BA.debugLine="Return res";
Debug.ShouldStop(1073741824);
if (true) return _res;
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private ButtonBrowse As Button";
addphoto.mostCurrent._buttonbrowse = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ButtonCamera As Button";
addphoto.mostCurrent._buttoncamera = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ImageView1 As ImageView";
addphoto.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ButtonUpload As Button";
addphoto.mostCurrent._buttonupload = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim namefile As String";
addphoto.mostCurrent._namefile = RemoteObject.createImmutable("");
 //BA.debugLineNum = 29;BA.debugLine="Private rp As RuntimePermissions";
addphoto.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 30;BA.debugLine="Private mBmp As Bitmap";
addphoto.mostCurrent._mbmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Dim folder As String";
addphoto.mostCurrent._folder = RemoteObject.createImmutable("");
 //BA.debugLineNum = 32;BA.debugLine="Dim idBuilding As String";
addphoto.mostCurrent._idbuilding = RemoteObject.createImmutable("");
 //BA.debugLineNum = 33;BA.debugLine="Dim buildingtype As String";
addphoto.mostCurrent._buildingtype = RemoteObject.createImmutable("");
 //BA.debugLineNum = 35;BA.debugLine="Private PanelToolBar As Panel";
addphoto.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private TitleBar As Label";
addphoto.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private BackArrow As Label";
addphoto.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private ScrollView1 As ScrollView";
addphoto.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private Label1 As Label";
addphoto.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hc_responseerror(RemoteObject _response,RemoteObject _reason,RemoteObject _statuscode,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("hc_ResponseError (addphoto) ","addphoto",21,addphoto.mostCurrent.activityBA,addphoto.mostCurrent,387);
if (RapidSub.canDelegate("hc_responseerror")) return b4a.example.addphoto.remoteMe.runUserSub(false, "addphoto","hc_responseerror", _response, _reason, _statuscode, _taskid);
Debug.locals.put("Response", _response);
Debug.locals.put("Reason", _reason);
Debug.locals.put("StatusCode", _statuscode);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 387;BA.debugLine="Sub hc_ResponseError (Response As OkHttpResponse,";
Debug.ShouldStop(4);
 BA.debugLineNum = 389;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16);
addphoto.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 390;BA.debugLine="If Response <> Null Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("N",_response)) { 
 BA.debugLineNum = 391;BA.debugLine="Msgbox(\"Upload file failed!\",\"Error Message\")";
Debug.ShouldStop(64);
addphoto.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Upload file failed!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),addphoto.mostCurrent.activityBA);
 BA.debugLineNum = 392;BA.debugLine="ImageView1.Visible=False";
Debug.ShouldStop(128);
addphoto.mostCurrent._imageview1.runMethod(true,"setVisible",addphoto.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 393;BA.debugLine="Label1.Visible =True";
Debug.ShouldStop(256);
addphoto.mostCurrent._label1.runMethod(true,"setVisible",addphoto.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 394;BA.debugLine="Label1.Text = \"failed\"";
Debug.ShouldStop(512);
addphoto.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence("failed"));
 BA.debugLineNum = 395;BA.debugLine="Log(Reason)";
Debug.ShouldStop(1024);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(_reason));
 };
 BA.debugLineNum = 397;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hc_responsesuccess(RemoteObject _response,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("hc_ResponseSuccess (addphoto) ","addphoto",21,addphoto.mostCurrent.activityBA,addphoto.mostCurrent,399);
if (RapidSub.canDelegate("hc_responsesuccess")) return b4a.example.addphoto.remoteMe.runUserSub(false, "addphoto","hc_responsesuccess", _response, _taskid);
RemoteObject _list_files = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
Debug.locals.put("Response", _response);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 399;BA.debugLine="Sub hc_ResponseSuccess (Response As OkHttpResponse";
Debug.ShouldStop(16384);
 BA.debugLineNum = 400;BA.debugLine="out.InitializeToBytesArray(0) ' I expect less tha";
Debug.ShouldStop(32768);
addphoto._out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 401;BA.debugLine="Response.GetAsynchronously(\"Response\", out, True,";
Debug.ShouldStop(65536);
_response.runVoidMethod ("GetAsynchronously",addphoto.processBA,(Object)(BA.ObjectToString("Response")),(Object)((addphoto._out.getObject())),(Object)(addphoto.mostCurrent.__c.getField(true,"True")),(Object)(_taskid));
 BA.debugLineNum = 402;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(131072);
addphoto.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 403;BA.debugLine="ImageView1.Visible=False";
Debug.ShouldStop(262144);
addphoto.mostCurrent._imageview1.runMethod(true,"setVisible",addphoto.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 404;BA.debugLine="Label1.Visible =True";
Debug.ShouldStop(524288);
addphoto.mostCurrent._label1.runMethod(true,"setVisible",addphoto.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 405;BA.debugLine="Label1.Text = \"Image has successfully been upload";
Debug.ShouldStop(1048576);
addphoto.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence("Image has successfully been uploaded!"));
 BA.debugLineNum = 406;BA.debugLine="Log(\"response: \" & Response.ErrorResponse)";
Debug.ShouldStop(2097152);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("response: "),_response.runMethod(true,"getErrorResponse"))));
 BA.debugLineNum = 408;BA.debugLine="Dim list_files As List";
Debug.ShouldStop(8388608);
_list_files = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("list_files", _list_files);
 BA.debugLineNum = 409;BA.debugLine="list_files.Initialize";
Debug.ShouldStop(16777216);
_list_files.runVoidMethod ("Initialize");
 BA.debugLineNum = 410;BA.debugLine="list_files = File.ListFiles(temp)";
Debug.ShouldStop(33554432);
_list_files = addphoto.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(addphoto._temp));Debug.locals.put("list_files", _list_files);
 BA.debugLineNum = 411;BA.debugLine="Log(list_files.Size)";
Debug.ShouldStop(67108864);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_list_files.runMethod(true,"getSize"))));
 BA.debugLineNum = 412;BA.debugLine="For i= 0 To list_files.Size-1";
Debug.ShouldStop(134217728);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_list_files.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 413;BA.debugLine="File.Delete(temp,list_files.Get(i))";
Debug.ShouldStop(268435456);
addphoto.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(addphoto._temp),(Object)(BA.ObjectToString(_list_files.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 BA.debugLineNum = 414;BA.debugLine="Log(list_files.size)";
Debug.ShouldStop(536870912);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_list_files.runMethod(true,"getSize"))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 418;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ion_event(RemoteObject _methodname,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("ion_Event (addphoto) ","addphoto",21,addphoto.mostCurrent.activityBA,addphoto.mostCurrent,240);
if (RapidSub.canDelegate("ion_event")) return b4a.example.addphoto.remoteMe.runUserSub(false, "addphoto","ion_event", _methodname, _args);
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _uris = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _clipdata = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _count = RemoteObject.createImmutable(0);
int _i2 = 0;
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _urisize = RemoteObject.createImmutable(0);
int _c = 0;
RemoteObject _urst = RemoteObject.createImmutable("");
RemoteObject _realpath = RemoteObject.createImmutable("");
RemoteObject _lastidx = RemoteObject.createImmutable(0);
RemoteObject _pathonly = RemoteObject.createImmutable("");
RemoteObject _namefilee = RemoteObject.createImmutable("");
RemoteObject _newname = RemoteObject.createImmutable("");
RemoteObject _oldname = RemoteObject.createImmutable("");
RemoteObject _filenamefile = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _extensi = RemoteObject.createImmutable("");
Debug.locals.put("MethodName", _methodname);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 240;BA.debugLine="Sub ion_Event (MethodName As String, Args() As Obj";
Debug.ShouldStop(32768);
 BA.debugLineNum = 241;BA.debugLine="If Args(0) = -1 Then 'resultCode = RESULT_OK";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_args.getArrayElement(false,BA.numberCast(int.class, 0)),RemoteObject.createImmutable((-(double) (0 + 1))))) { 
 BA.debugLineNum = 242;BA.debugLine="Dim i As Intent = Args(1)";
Debug.ShouldStop(131072);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");
_i.setObject(_args.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("i", _i);
 BA.debugLineNum = 243;BA.debugLine="Dim jo As JavaObject = i";
Debug.ShouldStop(262144);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(_i.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 245;BA.debugLine="Dim uris As List";
Debug.ShouldStop(1048576);
_uris = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("uris", _uris);
 BA.debugLineNum = 246;BA.debugLine="uris.Initialize";
Debug.ShouldStop(2097152);
_uris.runVoidMethod ("Initialize");
 BA.debugLineNum = 247;BA.debugLine="Dim clipdata As JavaObject = jo.RunMethod(\"getCl";
Debug.ShouldStop(4194304);
_clipdata = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_clipdata.setObject(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getClipData")),(Object)((addphoto.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("clipdata", _clipdata);
 BA.debugLineNum = 248;BA.debugLine="If clipdata.IsInitialized Then";
Debug.ShouldStop(8388608);
if (_clipdata.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 249;BA.debugLine="Dim count As Int = clipdata.RunMethod(\"getItemC";
Debug.ShouldStop(16777216);
_count = BA.numberCast(int.class, _clipdata.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getItemCount")),(Object)((addphoto.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 250;BA.debugLine="For i2 = 0 To count -1";
Debug.ShouldStop(33554432);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_count,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i2 = 0 ;
for (;(step9 > 0 && _i2 <= limit9) || (step9 < 0 && _i2 >= limit9) ;_i2 = ((int)(0 + _i2 + step9))  ) {
Debug.locals.put("i2", _i2);
 BA.debugLineNum = 251;BA.debugLine="Dim item As JavaObject = clipdata.RunMethod(\"g";
Debug.ShouldStop(67108864);
_item = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_item.setObject(_clipdata.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getItemAt")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((_i2))}))));Debug.locals.put("item", _item);
 BA.debugLineNum = 252;BA.debugLine="uris.Add(item.RunMethod(\"getUri\", Null))";
Debug.ShouldStop(134217728);
_uris.runVoidMethod ("Add",(Object)(_item.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getUri")),(Object)((addphoto.mostCurrent.__c.getField(false,"Null"))))));
 }
}Debug.locals.put("i2", _i2);
;
 }else {
 BA.debugLineNum = 255;BA.debugLine="uris.Add(i.GetData)";
Debug.ShouldStop(1073741824);
_uris.runVoidMethod ("Add",(Object)((_i.runMethod(true,"GetData"))));
 };
 BA.debugLineNum = 257;BA.debugLine="Log(uris)";
Debug.ShouldStop(1);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_uris)));
 BA.debugLineNum = 258;BA.debugLine="Dim urisize As Int = uris.Size";
Debug.ShouldStop(2);
_urisize = _uris.runMethod(true,"getSize");Debug.locals.put("urisize", _urisize);Debug.locals.put("urisize", _urisize);
 BA.debugLineNum = 259;BA.debugLine="For c=0 To urisize-1";
Debug.ShouldStop(4);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {_urisize,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_c = 0 ;
for (;(step18 > 0 && _c <= limit18) || (step18 < 0 && _c >= limit18) ;_c = ((int)(0 + _c + step18))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 260;BA.debugLine="Dim urst,realpath As String";
Debug.ShouldStop(8);
_urst = RemoteObject.createImmutable("");Debug.locals.put("urst", _urst);
_realpath = RemoteObject.createImmutable("");Debug.locals.put("realpath", _realpath);
 BA.debugLineNum = 261;BA.debugLine="urst= uris.Get(c)";
Debug.ShouldStop(16);
_urst = BA.ObjectToString(_uris.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _c))));Debug.locals.put("urst", _urst);
 BA.debugLineNum = 262;BA.debugLine="Log(\"PATH:\"& GetPathFromContentResult(urst))";
Debug.ShouldStop(32);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("PATH:"),_getpathfromcontentresult(_urst))));
 BA.debugLineNum = 263;BA.debugLine="realpath = GetPathFromContentResult(urst)";
Debug.ShouldStop(64);
_realpath = _getpathfromcontentresult(_urst);Debug.locals.put("realpath", _realpath);
 BA.debugLineNum = 264;BA.debugLine="Log(realpath.LastIndexOf(\"/\"))";
Debug.ShouldStop(128);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_realpath.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("/"))))));
 BA.debugLineNum = 265;BA.debugLine="Dim lastidx As Int = realpath.LastIndexOf(\"/\")";
Debug.ShouldStop(256);
_lastidx = _realpath.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("lastidx", _lastidx);Debug.locals.put("lastidx", _lastidx);
 BA.debugLineNum = 266;BA.debugLine="Dim pathonly As String = realpath.SubString2(0,";
Debug.ShouldStop(512);
_pathonly = _realpath.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_lastidx));Debug.locals.put("pathonly", _pathonly);Debug.locals.put("pathonly", _pathonly);
 BA.debugLineNum = 267;BA.debugLine="Dim namefilee As String = realpath.SubString2(l";
Debug.ShouldStop(1024);
_namefilee = _realpath.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_lastidx,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_realpath.runMethod(true,"length")));Debug.locals.put("namefilee", _namefilee);Debug.locals.put("namefilee", _namefilee);
 BA.debugLineNum = 268;BA.debugLine="Log(\"NAMAA :\"&namefilee)";
Debug.ShouldStop(2048);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("NAMAA :"),_namefilee)));
 BA.debugLineNum = 269;BA.debugLine="If File.Exists(temp,namefilee) Then";
Debug.ShouldStop(4096);
if (addphoto.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(addphoto._temp),(Object)(_namefilee)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 270;BA.debugLine="Dim newname,oldname As String";
Debug.ShouldStop(8192);
_newname = RemoteObject.createImmutable("");Debug.locals.put("newname", _newname);
_oldname = RemoteObject.createImmutable("");Debug.locals.put("oldname", _oldname);
 BA.debugLineNum = 271;BA.debugLine="oldname = namefilee";
Debug.ShouldStop(16384);
_oldname = _namefilee;Debug.locals.put("oldname", _oldname);
 BA.debugLineNum = 272;BA.debugLine="Do While File.Exists(temp,oldname) == True";
Debug.ShouldStop(32768);
while (RemoteObject.solveBoolean("=",addphoto.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(addphoto._temp),(Object)(_oldname)),addphoto.mostCurrent.__c.getField(true,"True"))) {
 BA.debugLineNum = 273;BA.debugLine="Dim filenamefile , filename, extensi As Strin";
Debug.ShouldStop(65536);
_filenamefile = RemoteObject.createImmutable("");Debug.locals.put("filenamefile", _filenamefile);
_filename = RemoteObject.createImmutable("");Debug.locals.put("filename", _filename);
_extensi = RemoteObject.createImmutable("");Debug.locals.put("extensi", _extensi);
 BA.debugLineNum = 274;BA.debugLine="filenamefile = oldname";
Debug.ShouldStop(131072);
_filenamefile = _oldname;Debug.locals.put("filenamefile", _filenamefile);
 BA.debugLineNum = 275;BA.debugLine="Log(\"COBA :\"&filenamefile.SubString2(0, filen";
Debug.ShouldStop(262144);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("COBA :"),_filenamefile.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_filenamefile.runMethod(true,"length"),RemoteObject.createImmutable(4)}, "-",1, 1))))));
 BA.debugLineNum = 276;BA.debugLine="filename = filenamefile.SubString2(0, filenam";
Debug.ShouldStop(524288);
_filename = _filenamefile.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_filenamefile.runMethod(true,"length"),RemoteObject.createImmutable(4)}, "-",1, 1)));Debug.locals.put("filename", _filename);
 BA.debugLineNum = 277;BA.debugLine="extensi = filenamefile.SubString2(filename.Le";
Debug.ShouldStop(1048576);
_extensi = _filenamefile.runMethod(true,"substring",(Object)(_filename.runMethod(true,"length")),(Object)(_filenamefile.runMethod(true,"length")));Debug.locals.put("extensi", _extensi);
 BA.debugLineNum = 278;BA.debugLine="Log(\"name: \"&filename)";
Debug.ShouldStop(2097152);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("name: "),_filename)));
 BA.debugLineNum = 279;BA.debugLine="Log(\"extention: \"&extensi)";
Debug.ShouldStop(4194304);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("extention: "),_extensi)));
 BA.debugLineNum = 280;BA.debugLine="newname=filename&\"(copy)\"&extensi";
Debug.ShouldStop(8388608);
_newname = RemoteObject.concat(_filename,RemoteObject.createImmutable("(copy)"),_extensi);Debug.locals.put("newname", _newname);
 BA.debugLineNum = 281;BA.debugLine="oldname=newname";
Debug.ShouldStop(16777216);
_oldname = _newname;Debug.locals.put("oldname", _oldname);
 }
;
 BA.debugLineNum = 285;BA.debugLine="File.Copy(pathonly,namefilee,temp,newname)";
Debug.ShouldStop(268435456);
addphoto.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(_pathonly),(Object)(_namefilee),(Object)(addphoto._temp),(Object)(_newname));
 BA.debugLineNum = 286;BA.debugLine="Log(\"DONE\")";
Debug.ShouldStop(536870912);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("DONE")));
 }else {
 BA.debugLineNum = 288;BA.debugLine="File.Copy(pathonly,namefilee,temp,namefilee)";
Debug.ShouldStop(-2147483648);
addphoto.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(_pathonly),(Object)(_namefilee),(Object)(addphoto._temp),(Object)(_namefilee));
 };
 }
}Debug.locals.put("c", _c);
;
 };
 BA.debugLineNum = 292;BA.debugLine="Return Null";
Debug.ShouldStop(8);
if (true) return addphoto.mostCurrent.__c.getField(false,"Null");
 BA.debugLineNum = 293;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (addphoto) ","addphoto",21,addphoto.mostCurrent.activityBA,addphoto.mostCurrent,338);
if (RapidSub.canDelegate("jobdone")) return b4a.example.addphoto.remoteMe.runUserSub(false, "addphoto","jobdone", _job);
Debug.locals.put("Job", _job);
 BA.debugLineNum = 338;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 339;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(262144);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 340;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(524288);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("Upload Success"))) {
case 0: {
 BA.debugLineNum = 342;BA.debugLine="Log(\"Uploaded file success!!!\")";
Debug.ShouldStop(2097152);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Uploaded file success!!!")));
 BA.debugLineNum = 343;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4194304);
addphoto.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
}
;
 }else {
 BA.debugLineNum = 346;BA.debugLine="Msgbox(\"gagal\",\"WARNING\")";
Debug.ShouldStop(33554432);
addphoto.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("gagal")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("WARNING"))),addphoto.mostCurrent.activityBA);
 };
 BA.debugLineNum = 348;BA.debugLine="Job.Release";
Debug.ShouldStop(134217728);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 349;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim temp As String";
addphoto._temp = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim hc As OkHttpClient";
addphoto._hc = RemoteObject.createNew ("anywheresoftware.b4h.okhttp.OkHttpClientWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Dim out As OutputStream";
addphoto._out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Dim Base64Con As Base64Image";
addphoto._base64con = RemoteObject.createNew ("simplysoftware.base64image.base64image");
 //BA.debugLineNum = 14;BA.debugLine="Dim chooser As ContentChooser";
addphoto._chooser = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.ContentChooser");
 //BA.debugLineNum = 15;BA.debugLine="Dim cc As ContentChooser";
addphoto._cc = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.ContentChooser");
 //BA.debugLineNum = 16;BA.debugLine="Private ion As Object";
addphoto._ion = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _response_streamfinish(RemoteObject _success,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("Response_StreamFinish (addphoto) ","addphoto",21,addphoto.mostCurrent.activityBA,addphoto.mostCurrent,420);
if (RapidSub.canDelegate("response_streamfinish")) return b4a.example.addphoto.remoteMe.runUserSub(false, "addphoto","response_streamfinish", _success, _taskid);
RemoteObject _another_buffer = null;
Debug.locals.put("Success", _success);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 420;BA.debugLine="Sub Response_StreamFinish (Success As Boolean, Tas";
Debug.ShouldStop(8);
 BA.debugLineNum = 421;BA.debugLine="Dim another_buffer () As Byte";
Debug.ShouldStop(16);
_another_buffer = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("another_buffer", _another_buffer);
 BA.debugLineNum = 422;BA.debugLine="another_buffer = out.ToBytesArray";
Debug.ShouldStop(32);
_another_buffer = addphoto._out.runMethod(false,"ToBytesArray");Debug.locals.put("another_buffer", _another_buffer);
 BA.debugLineNum = 423;BA.debugLine="Log (BytesToString(another_buffer, 0, another_buf";
Debug.ShouldStop(64);
addphoto.mostCurrent.__c.runVoidMethod ("Log",(Object)(addphoto.mostCurrent.__c.runMethod(true,"BytesToString",(Object)(_another_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_another_buffer.getField(true,"length")),(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 424;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showpicture(RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("ShowPicture (addphoto) ","addphoto",21,addphoto.mostCurrent.activityBA,addphoto.mostCurrent,216);
if (RapidSub.canDelegate("showpicture")) return b4a.example.addphoto.remoteMe.runUserSub(false, "addphoto","showpicture", _filename);
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _bmpratio = RemoteObject.createImmutable(0f);
RemoteObject _viewratio = RemoteObject.createImmutable(0f);
RemoteObject _newheight = RemoteObject.createImmutable(0);
RemoteObject _newwidth = RemoteObject.createImmutable(0);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 216;BA.debugLine="Sub ShowPicture(FileName As String)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 217;BA.debugLine="ImageView1.Visible=True";
Debug.ShouldStop(16777216);
addphoto.mostCurrent._imageview1.runMethod(true,"setVisible",addphoto.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 218;BA.debugLine="Label1.Visible=False";
Debug.ShouldStop(33554432);
addphoto.mostCurrent._label1.runMethod(true,"setVisible",addphoto.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 219;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(67108864);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 220;BA.debugLine="bmp = LoadBitmap(temp,FileName)";
Debug.ShouldStop(134217728);
_bmp = addphoto.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(addphoto._temp),(Object)(_filename));Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 221;BA.debugLine="If bmp.Height > bmp.Width Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_bmp.runMethod(true,"getHeight"),BA.numberCast(double.class, _bmp.runMethod(true,"getWidth")))) { 
 BA.debugLineNum = 222;BA.debugLine="Dim bmpRatio As Float = bmp.Width / bmp.Height";
Debug.ShouldStop(536870912);
_bmpratio = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_bmp.runMethod(true,"getHeight")}, "/",0, 0));Debug.locals.put("bmpRatio", _bmpratio);Debug.locals.put("bmpRatio", _bmpratio);
 BA.debugLineNum = 223;BA.debugLine="Dim viewRatio As Float = ImageView1.Width / Imag";
Debug.ShouldStop(1073741824);
_viewratio = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {addphoto.mostCurrent._imageview1.runMethod(true,"getWidth"),addphoto.mostCurrent._imageview1.runMethod(true,"getHeight")}, "/",0, 0));Debug.locals.put("viewRatio", _viewratio);Debug.locals.put("viewRatio", _viewratio);
 BA.debugLineNum = 224;BA.debugLine="If viewRatio > bmpRatio Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_viewratio,BA.numberCast(double.class, _bmpratio))) { 
 BA.debugLineNum = 225;BA.debugLine="Dim NewHeight As Int = bmp.Width / viewRatio";
Debug.ShouldStop(1);
_newheight = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_viewratio}, "/",0, 0));Debug.locals.put("NewHeight", _newheight);Debug.locals.put("NewHeight", _newheight);
 BA.debugLineNum = 226;BA.debugLine="bmp = bmp.Crop(0, bmp.Height / 2 - NewHeight /";
Debug.ShouldStop(2);
_bmp = _bmp.runMethod(false,"Crop",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_newheight,RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(_bmp.runMethod(true,"getWidth")),(Object)(_newheight));Debug.locals.put("bmp", _bmp);
 }else 
{ BA.debugLineNum = 227;BA.debugLine="Else if viewRatio < bmpRatio Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("<",_viewratio,BA.numberCast(double.class, _bmpratio))) { 
 BA.debugLineNum = 228;BA.debugLine="Dim NewWidth As Int = bmp.Height * viewRatio";
Debug.ShouldStop(8);
_newwidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),_viewratio}, "*",0, 0));Debug.locals.put("NewWidth", _newwidth);Debug.locals.put("NewWidth", _newwidth);
 BA.debugLineNum = 229;BA.debugLine="bmp = bmp.Crop(bmp.Width / 2 - NewWidth / 2, 0,";
Debug.ShouldStop(16);
_bmp = _bmp.runMethod(false,"Crop",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),_newwidth,RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(_newwidth),(Object)(_bmp.runMethod(true,"getHeight")));Debug.locals.put("bmp", _bmp);
 }}
;
 BA.debugLineNum = 231;BA.debugLine="mBmp = bmp";
Debug.ShouldStop(64);
addphoto.mostCurrent._mbmp = _bmp;
 BA.debugLineNum = 232;BA.debugLine="ImageView1.Bitmap = mBmp.Resize(ImageView1.Width";
Debug.ShouldStop(128);
addphoto.mostCurrent._imageview1.runMethod(false,"setBitmap",(addphoto.mostCurrent._mbmp.runMethod(false,"Resize",(Object)(BA.numberCast(float.class, addphoto.mostCurrent._imageview1.runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, addphoto.mostCurrent._imageview1.runMethod(true,"getHeight"))),(Object)(addphoto.mostCurrent.__c.getField(true,"True"))).getObject()));
 }else {
 BA.debugLineNum = 234;BA.debugLine="mBmp = bmp";
Debug.ShouldStop(512);
addphoto.mostCurrent._mbmp = _bmp;
 BA.debugLineNum = 235;BA.debugLine="ImageView1.Bitmap = mBmp.Resize(ImageView1.Width";
Debug.ShouldStop(1024);
addphoto.mostCurrent._imageview1.runMethod(false,"setBitmap",(addphoto.mostCurrent._mbmp.runMethod(false,"Resize",(Object)(BA.numberCast(float.class, addphoto.mostCurrent._imageview1.runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, addphoto.mostCurrent._imageview1.runMethod(true,"getHeight"))),(Object)(addphoto.mostCurrent.__c.getField(true,"True"))).getObject()));
 };
 BA.debugLineNum = 237;BA.debugLine="namefile = FileName";
Debug.ShouldStop(4096);
addphoto.mostCurrent._namefile = _filename;
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startactivityforresult(RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("StartActivityForResult (addphoto) ","addphoto",21,addphoto.mostCurrent.activityBA,addphoto.mostCurrent,299);
if (RapidSub.canDelegate("startactivityforresult")) return b4a.example.addphoto.remoteMe.runUserSub(false, "addphoto","startactivityforresult", _i);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("i", _i);
 BA.debugLineNum = 299;BA.debugLine="Sub StartActivityForResult(i As Intent)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 300;BA.debugLine="Dim jo As JavaObject = GetBA";
Debug.ShouldStop(2048);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(_getba());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 301;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
Debug.ShouldStop(4096);
addphoto._ion = _jo.runMethod(false,"CreateEvent",addphoto.processBA,(Object)(BA.ObjectToString("anywheresoftware.b4a.IOnActivityResult")),(Object)(BA.ObjectToString("ion")),(Object)(addphoto.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 302;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array As O";
Debug.ShouldStop(8192);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("startActivityForResult")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {addphoto._ion,(_i.getObject())})));
 BA.debugLineNum = 303;BA.debugLine="End Sub";
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