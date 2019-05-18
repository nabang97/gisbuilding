package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class homeadmin_subs_0 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(null, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(b4a.example.homeadmin parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.homeadmin parent;
RemoteObject _firsttime;
RemoteObject _islogin = RemoteObject.createImmutable(false);
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (homeadmin) ","homeadmin",12,homeadmin.mostCurrent.activityBA,homeadmin.mostCurrent,52);
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
 BA.debugLineNum = 55;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(4194304);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),homeadmin.mostCurrent.activityBA);
 BA.debugLineNum = 56;BA.debugLine="ScrollView1.Panel.LoadLayout(\"HomeAdmin\")";
Debug.ShouldStop(8388608);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("HomeAdmin")),homeadmin.mostCurrent.activityBA);
 BA.debugLineNum = 57;BA.debugLine="HorizontalScrollView1.Panel.LoadLayout(\"AdminCont";
Debug.ShouldStop(16777216);
parent.mostCurrent._horizontalscrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("AdminContent")),homeadmin.mostCurrent.activityBA);
 BA.debugLineNum = 58;BA.debugLine="HorizontalScrollView1.Panel.Width = ContentAdmin.";
Debug.ShouldStop(33554432);
parent.mostCurrent._horizontalscrollview1.runMethod(false,"getPanel").runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._contentadmin.runMethod(true,"getWidth"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),homeadmin.mostCurrent.activityBA)}, "+",1, 1));
 BA.debugLineNum = 59;BA.debugLine="PanelBackground.Height = HorizontalScrollView1.To";
Debug.ShouldStop(67108864);
parent.mostCurrent._panelbackground.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._horizontalscrollview1.runMethod(true,"getTop"),parent.mostCurrent._horizontalscrollview1.runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 60;BA.debugLine="ScrollView1.Panel.Height = PanelBackground.Height";
Debug.ShouldStop(134217728);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._panelbackground.runMethod(true,"getHeight"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),homeadmin.mostCurrent.activityBA)}, "+",1, 1));
 BA.debugLineNum = 61;BA.debugLine="BackArrow.Visible = False";
Debug.ShouldStop(268435456);
parent.mostCurrent._backarrow.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 62;BA.debugLine="If BackArrow.Visible Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent._backarrow.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 65;BA.debugLine="TitleBar.Left = 5%x";
Debug.ShouldStop(1);
parent.mostCurrent._titlebar.runMethod(true,"setLeft",parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),homeadmin.mostCurrent.activityBA));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 68;BA.debugLine="Dim isLogin As Boolean";
Debug.ShouldStop(8);
_islogin = RemoteObject.createImmutable(false);Debug.locals.put("isLogin", _islogin);
 BA.debugLineNum = 69;BA.debugLine="isLogin = Login.manager.GetBoolean(\"is_login\")";
Debug.ShouldStop(16);
_islogin = parent.mostCurrent._login._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("is_login")));Debug.locals.put("isLogin", _islogin);
 BA.debugLineNum = 70;BA.debugLine="If isLogin Then";
Debug.ShouldStop(32);
if (true) break;

case 7:
//if
this.state = 12;
if (_islogin.<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 71;BA.debugLine="PanelLogout.Visible = True";
Debug.ShouldStop(64);
parent.mostCurrent._panellogout.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 73;BA.debugLine="PanelLogout.Visible = False";
Debug.ShouldStop(256);
parent.mostCurrent._panellogout.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 if (true) break;
;
 BA.debugLineNum = 75;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";
Debug.ShouldStop(1024);

case 12:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._starter._gps1.runMethod(true,"getGPSEnabled"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 23;
 BA.debugLineNum = 76;BA.debugLine="ToastMessageShow(\"Please enable the GPS device.\"";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please enable the GPS device.")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 77;BA.debugLine="StartActivity(Starter.GPS1.LocationSettingsInten";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",homeadmin.processBA,(Object)((parent.mostCurrent._starter._gps1.runMethod(false,"getLocationSettingsIntent"))));
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 79;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
Debug.ShouldStop(16384);
parent.mostCurrent._starter._rp.runVoidMethod ("CheckAndRequest",homeadmin.processBA,(Object)(parent.mostCurrent._starter._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 80;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", homeadmin.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), null);
this.state = 24;
return;
case 24:
//C
this.state = 17;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 81;BA.debugLine="If Result Then CallSubDelayed(Starter, \"StartGPS";
Debug.ShouldStop(65536);
if (true) break;

case 17:
//if
this.state = 22;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 19;
;}if (true) break;

case 19:
//C
this.state = 22;
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",homeadmin.processBA,(Object)((parent.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StartGPS")));
if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;

case 23:
//C
this.state = -1;
;
 BA.debugLineNum = 83;BA.debugLine="End Sub";
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
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (homeadmin) ","homeadmin",12,homeadmin.mostCurrent.activityBA,homeadmin.mostCurrent,196);
if (RapidSub.canDelegate("activity_keypress")) return b4a.example.homeadmin.remoteMe.runUserSub(false, "homeadmin","activity_keypress", _keycode);
RemoteObject _islogin = RemoteObject.createImmutable(false);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 196;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(8);
 BA.debugLineNum = 197;BA.debugLine="Dim isLogin As Boolean";
Debug.ShouldStop(16);
_islogin = RemoteObject.createImmutable(false);Debug.locals.put("isLogin", _islogin);
 BA.debugLineNum = 198;BA.debugLine="isLogin = Login.manager.GetBoolean(\"is_login\")";
Debug.ShouldStop(32);
_islogin = homeadmin.mostCurrent._login._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("is_login")));Debug.locals.put("isLogin", _islogin);
 BA.debugLineNum = 199;BA.debugLine="Log(\"keyy: \"&KeyCodes.KEYCODE_BACK)";
Debug.ShouldStop(64);
homeadmin.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("keyy: "),homeadmin.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK"))));
 BA.debugLineNum = 200;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then  ' Back b";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, homeadmin.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 201;BA.debugLine="If File.Exists(Main.folder,\"datastore\") Then";
Debug.ShouldStop(256);
if (homeadmin.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(homeadmin.mostCurrent._main._folder),(Object)(RemoteObject.createImmutable("datastore"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 202;BA.debugLine="If Main.kvs.ContainsKey(\"role\")Then";
Debug.ShouldStop(512);
if (homeadmin.mostCurrent._main._kvs.runMethod(true,"_containskey",(Object)(RemoteObject.createImmutable("role"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 203;BA.debugLine="StopService(Starter)";
Debug.ShouldStop(1024);
homeadmin.mostCurrent.__c.runVoidMethod ("StopService",homeadmin.processBA,(Object)((homeadmin.mostCurrent._starter.getObject())));
 BA.debugLineNum = 204;BA.debugLine="Main.ShouldIClose = True";
Debug.ShouldStop(2048);
homeadmin.mostCurrent._main._shouldiclose = homeadmin.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 205;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
homeadmin.mostCurrent._activity.runVoidMethod ("Finish");
 };
 };
 };
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (homeadmin) ","homeadmin",12,homeadmin.mostCurrent.activityBA,homeadmin.mostCurrent,101);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.homeadmin.remoteMe.runUserSub(false, "homeadmin","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 101;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Activity_Resume (homeadmin) ","homeadmin",12,homeadmin.mostCurrent.activityBA,homeadmin.mostCurrent,85);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.homeadmin.remoteMe.runUserSub(false, "homeadmin","activity_resume");
 BA.debugLineNum = 85;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="ExecuteRemoteQuery(\"SELECT COUNT(*) FROM house_bu";
Debug.ShouldStop(2097152);
_executeremotequery(BA.ObjectToString("SELECT COUNT(*) FROM house_building"),RemoteObject.createImmutable("CountHouse"));
 BA.debugLineNum = 87;BA.debugLine="ExecuteRemoteQuery(\"SELECT COUNT(*) FROM office_b";
Debug.ShouldStop(4194304);
_executeremotequery(BA.ObjectToString("SELECT COUNT(*) FROM office_building"),RemoteObject.createImmutable("CountOffice"));
 BA.debugLineNum = 88;BA.debugLine="ExecuteRemoteQuery(\"SELECT COUNT(*) FROM msme_bui";
Debug.ShouldStop(8388608);
_executeremotequery(BA.ObjectToString("SELECT COUNT(*) FROM msme_building"),RemoteObject.createImmutable("CountMsme"));
 BA.debugLineNum = 89;BA.debugLine="ExecuteRemoteQuery(\"SELECT COUNT(*) FROM educatio";
Debug.ShouldStop(16777216);
_executeremotequery(BA.ObjectToString("SELECT COUNT(*) FROM educational_building"),RemoteObject.createImmutable("CountEducation"));
 BA.debugLineNum = 90;BA.debugLine="ExecuteRemoteQuery(\"SELECT COUNT(*) FROM health_b";
Debug.ShouldStop(33554432);
_executeremotequery(BA.ObjectToString("SELECT COUNT(*) FROM health_building"),RemoteObject.createImmutable("CountHealth"));
 BA.debugLineNum = 91;BA.debugLine="ExecuteRemoteQuery(\"SELECT COUNT(*) FROM worship_";
Debug.ShouldStop(67108864);
_executeremotequery(BA.ObjectToString("SELECT COUNT(*) FROM worship_building"),RemoteObject.createImmutable("CountWorship"));
 BA.debugLineNum = 92;BA.debugLine="If File.Exists(Main.folder,\"datastore\") Then";
Debug.ShouldStop(134217728);
if (homeadmin.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(homeadmin.mostCurrent._main._folder),(Object)(RemoteObject.createImmutable("datastore"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 93;BA.debugLine="If Main.kvs.ContainsKey(\"role\") == True Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",homeadmin.mostCurrent._main._kvs.runMethod(true,"_containskey",(Object)(RemoteObject.createImmutable("role"))),homeadmin.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 94;BA.debugLine="Log(\"DISINI :\"&Main.kvs.Get(\"username\"))";
Debug.ShouldStop(536870912);
homeadmin.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DISINI :"),homeadmin.mostCurrent._main._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("username"))))));
 BA.debugLineNum = 95;BA.debugLine="Label1.Text =\"Welcome, \"&Main.kvs.Get(\"username";
Debug.ShouldStop(1073741824);
homeadmin.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Welcome, "),homeadmin.mostCurrent._main._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("username"))),RemoteObject.createImmutable(""))));
 };
 };
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btninfo_click() throws Exception{
try {
		Debug.PushSubsStack("BtnInfo_Click (homeadmin) ","homeadmin",12,homeadmin.mostCurrent.activityBA,homeadmin.mostCurrent,265);
if (RapidSub.canDelegate("btninfo_click")) return b4a.example.homeadmin.remoteMe.runUserSub(false, "homeadmin","btninfo_click");
 BA.debugLineNum = 265;BA.debugLine="Sub BtnInfo_Click";
Debug.ShouldStop(256);
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
public static RemoteObject  _btnlogout_click() throws Exception{
try {
		Debug.PushSubsStack("BtnLogout_Click (homeadmin) ","homeadmin",12,homeadmin.mostCurrent.activityBA,homeadmin.mostCurrent,211);
if (RapidSub.canDelegate("btnlogout_click")) return b4a.example.homeadmin.remoteMe.runUserSub(false, "homeadmin","btnlogout_click");
 BA.debugLineNum = 211;BA.debugLine="Sub BtnLogout_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 213;BA.debugLine="Login.manager.SetBoolean(\"is_login\", False)";
Debug.ShouldStop(1048576);
homeadmin.mostCurrent._login._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("is_login")),(Object)(homeadmin.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 216;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(8388608);
homeadmin.mostCurrent.__c.runVoidMethod ("StartActivity",homeadmin.processBA,(Object)((homeadmin.mostCurrent._main.getObject())));
 BA.debugLineNum = 217;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16777216);
homeadmin.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 218;BA.debugLine="ToastMessageShow(\"Logout berhasil\", False)";
Debug.ShouldStop(33554432);
homeadmin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Logout berhasil")),(Object)(homeadmin.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 219;BA.debugLine="Main.kvs.Remove(\"username\")";
Debug.ShouldStop(67108864);
homeadmin.mostCurrent._main._kvs.runVoidMethod ("_remove",(Object)(RemoteObject.createImmutable("username")));
 BA.debugLineNum = 220;BA.debugLine="Main.kvs.Remove(\"role\")";
Debug.ShouldStop(134217728);
homeadmin.mostCurrent._main._kvs.runVoidMethod ("_remove",(Object)(RemoteObject.createImmutable("role")));
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnmap_click() throws Exception{
try {
		Debug.PushSubsStack("BtnMap_Click (homeadmin) ","homeadmin",12,homeadmin.mostCurrent.activityBA,homeadmin.mostCurrent,260);
if (RapidSub.canDelegate("btnmap_click")) return b4a.example.homeadmin.remoteMe.runUserSub(false, "homeadmin","btnmap_click");
 BA.debugLineNum = 260;BA.debugLine="Sub BtnMap_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 261;BA.debugLine="StartActivity(ManualPosition)";
Debug.ShouldStop(16);
homeadmin.mostCurrent.__c.runVoidMethod ("StartActivity",homeadmin.processBA,(Object)((homeadmin.mostCurrent._manualposition.getObject())));
 BA.debugLineNum = 262;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32);
homeadmin.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsearch_click() throws Exception{
try {
		Debug.PushSubsStack("BtnSearch_Click (homeadmin) ","homeadmin",12,homeadmin.mostCurrent.activityBA,homeadmin.mostCurrent,224);
if (RapidSub.canDelegate("btnsearch_click")) return b4a.example.homeadmin.remoteMe.runUserSub(false, "homeadmin","btnsearch_click");
 BA.debugLineNum = 224;BA.debugLine="Sub BtnSearch_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 225;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1);
homeadmin.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 226;BA.debugLine="StartActivity(SearchBuilding)";
Debug.ShouldStop(2);
homeadmin.mostCurrent.__c.runVoidMethod ("StartActivity",homeadmin.processBA,(Object)((homeadmin.mostCurrent._searchbuilding.getObject())));
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (homeadmin) ","homeadmin",12,homeadmin.mostCurrent.activityBA,homeadmin.mostCurrent,269);
if (RapidSub.canDelegate("button1_click")) return b4a.example.homeadmin.remoteMe.runUserSub(false, "homeadmin","button1_click");
 BA.debugLineNum = 269;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 270;BA.debugLine="AddFac_clicked = \"Worship\"";
Debug.ShouldStop(8192);
homeadmin._addfac_clicked = BA.ObjectToString("Worship");
 BA.debugLineNum = 271;BA.debugLine="StartActivity(AddFacilityType)";
Debug.ShouldStop(16384);
homeadmin.mostCurrent.__c.runVoidMethod ("StartActivity",homeadmin.processBA,(Object)((homeadmin.mostCurrent._addfacilitytype.getObject())));
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (homeadmin) ","homeadmin",12,homeadmin.mostCurrent.activityBA,homeadmin.mostCurrent,279);
if (RapidSub.canDelegate("button2_click")) return b4a.example.homeadmin.remoteMe.runUserSub(false, "homeadmin","button2_click");
 BA.debugLineNum = 279;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 280;BA.debugLine="AddFac_clicked = \"Office\"";
Debug.ShouldStop(8388608);
homeadmin._addfac_clicked = BA.ObjectToString("Office");
 BA.debugLineNum = 281;BA.debugLine="StartActivity(AddFacilityType)";
Debug.ShouldStop(16777216);
homeadmin.mostCurrent.__c.runVoidMethod ("StartActivity",homeadmin.processBA,(Object)((homeadmin.mostCurrent._addfacilitytype.getObject())));
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button3_click() throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (homeadmin) ","homeadmin",12,homeadmin.mostCurrent.activityBA,homeadmin.mostCurrent,289);
if (RapidSub.canDelegate("button3_click")) return b4a.example.homeadmin.remoteMe.runUserSub(false, "homeadmin","button3_click");
 BA.debugLineNum = 289;BA.debugLine="Sub Button3_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 290;BA.debugLine="AddFac_clicked = \"Educational\"";
Debug.ShouldStop(2);
homeadmin._addfac_clicked = BA.ObjectToString("Educational");
 BA.debugLineNum = 291;BA.debugLine="StartActivity(AddFacilityType)";
Debug.ShouldStop(4);
homeadmin.mostCurrent.__c.runVoidMethod ("StartActivity",homeadmin.processBA,(Object)((homeadmin.mostCurrent._addfacilitytype.getObject())));
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
public static RemoteObject  _button4_click() throws Exception{
try {
		Debug.PushSubsStack("Button4_Click (homeadmin) ","homeadmin",12,homeadmin.mostCurrent.activityBA,homeadmin.mostCurrent,274);
if (RapidSub.canDelegate("button4_click")) return b4a.example.homeadmin.remoteMe.runUserSub(false, "homeadmin","button4_click");
 BA.debugLineNum = 274;BA.debugLine="Sub Button4_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 275;BA.debugLine="AddFac_clicked = \"Health\"";
Debug.ShouldStop(262144);
homeadmin._addfac_clicked = BA.ObjectToString("Health");
 BA.debugLineNum = 276;BA.debugLine="StartActivity(AddFacilityType)";
Debug.ShouldStop(524288);
homeadmin.mostCurrent.__c.runVoidMethod ("StartActivity",homeadmin.processBA,(Object)((homeadmin.mostCurrent._addfacilitytype.getObject())));
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button5_click() throws Exception{
try {
		Debug.PushSubsStack("Button5_Click (homeadmin) ","homeadmin",12,homeadmin.mostCurrent.activityBA,homeadmin.mostCurrent,284);
if (RapidSub.canDelegate("button5_click")) return b4a.example.homeadmin.remoteMe.runUserSub(false, "homeadmin","button5_click");
 BA.debugLineNum = 284;BA.debugLine="Sub Button5_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 285;BA.debugLine="AddFac_clicked = \"Msme\"";
Debug.ShouldStop(268435456);
homeadmin._addfac_clicked = BA.ObjectToString("Msme");
 BA.debugLineNum = 286;BA.debugLine="StartActivity(AddFacilityType)";
Debug.ShouldStop(536870912);
homeadmin.mostCurrent.__c.runVoidMethod ("StartActivity",homeadmin.processBA,(Object)((homeadmin.mostCurrent._addfacilitytype.getObject())));
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _educationbtn_click() throws Exception{
try {
		Debug.PushSubsStack("EducationBtn_Click (homeadmin) ","homeadmin",12,homeadmin.mostCurrent.activityBA,homeadmin.mostCurrent,242);
if (RapidSub.canDelegate("educationbtn_click")) return b4a.example.homeadmin.remoteMe.runUserSub(false, "homeadmin","educationbtn_click");
 BA.debugLineNum = 242;BA.debugLine="Sub EducationBtn_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 243;BA.debugLine="StartActivity(EducationalBuilding)";
Debug.ShouldStop(262144);
homeadmin.mostCurrent.__c.runVoidMethod ("StartActivity",homeadmin.processBA,(Object)((homeadmin.mostCurrent._educationalbuilding.getObject())));
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
public static RemoteObject  _executeremotequery(RemoteObject _query,RemoteObject _jobname) throws Exception{
try {
		Debug.PushSubsStack("ExecuteRemoteQuery (homeadmin) ","homeadmin",12,homeadmin.mostCurrent.activityBA,homeadmin.mostCurrent,105);
if (RapidSub.canDelegate("executeremotequery")) return b4a.example.homeadmin.remoteMe.runUserSub(false, "homeadmin","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 105;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(512);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 107;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(1024);
_job.runVoidMethod ("_initialize",homeadmin.processBA,(Object)(_jobname),(Object)(homeadmin.getObject()));
 BA.debugLineNum = 108;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
Debug.ShouldStop(2048);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),homeadmin.mostCurrent._main._server,RemoteObject.createImmutable("mobile/json.php"))),(Object)(_query));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim menu As ArcMenu";
homeadmin.mostCurrent._menu = RemoteObject.createNew ("b4a.example.arcmenu");
 //BA.debugLineNum = 17;BA.debugLine="Dim menuButtonStatic, menuButtonAnimated As Bitma";
homeadmin.mostCurrent._menubuttonstatic = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
homeadmin.mostCurrent._menubuttonanimated = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ScrollView1 As ScrollView";
homeadmin.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private PanelBackground As Panel";
homeadmin.mostCurrent._panelbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private PanelBar As Panel";
homeadmin.mostCurrent._panelbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private PanelToolBar As Panel";
homeadmin.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private BtnLogout As Button";
homeadmin.mostCurrent._btnlogout = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Label1 As Label";
homeadmin.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private BtnSearch As Button";
homeadmin.mostCurrent._btnsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private Panel1 As Panel";
homeadmin.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Panel2 As Panel";
homeadmin.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ContentAdmin As Panel";
homeadmin.mostCurrent._contentadmin = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private HorizontalScrollView1 As HorizontalScroll";
homeadmin.mostCurrent._horizontalscrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private Label9 As Label";
homeadmin.mostCurrent._label9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private Label10 As Label";
homeadmin.mostCurrent._label10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private Label11 As Label";
homeadmin.mostCurrent._label11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private Label12 As Label";
homeadmin.mostCurrent._label12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private Label13 As Label";
homeadmin.mostCurrent._label13 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private Label14 As Label";
homeadmin.mostCurrent._label14 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private WorshipBtn As Panel";
homeadmin.mostCurrent._worshipbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private OfficeBtn As Panel";
homeadmin.mostCurrent._officebtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private HealthBtn As Panel";
homeadmin.mostCurrent._healthbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private EducationBtn As Panel";
homeadmin.mostCurrent._educationbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private Labellogout As Label";
homeadmin.mostCurrent._labellogout = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private PanelLogout As Panel";
homeadmin.mostCurrent._panellogout = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private BackArrow As Label";
homeadmin.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private TitleBar As Label";
homeadmin.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private BtnMap As Button";
homeadmin.mostCurrent._btnmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private BtnInfo As Button";
homeadmin.mostCurrent._btninfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private Button1 As Button";
homeadmin.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private Button4 As Button";
homeadmin.mostCurrent._button4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private Button2 As Button";
homeadmin.mostCurrent._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private Button5 As Button";
homeadmin.mostCurrent._button5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private Button3 As Button";
homeadmin.mostCurrent._button3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _healthbtn_click() throws Exception{
try {
		Debug.PushSubsStack("HealthBtn_Click (homeadmin) ","homeadmin",12,homeadmin.mostCurrent.activityBA,homeadmin.mostCurrent,238);
if (RapidSub.canDelegate("healthbtn_click")) return b4a.example.homeadmin.remoteMe.runUserSub(false, "homeadmin","healthbtn_click");
 BA.debugLineNum = 238;BA.debugLine="Sub HealthBtn_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 239;BA.debugLine="StartActivity(HealthBuilding)";
Debug.ShouldStop(16384);
homeadmin.mostCurrent.__c.runVoidMethod ("StartActivity",homeadmin.processBA,(Object)((homeadmin.mostCurrent._healthbuilding.getObject())));
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
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (homeadmin) ","homeadmin",12,homeadmin.mostCurrent.activityBA,homeadmin.mostCurrent,111);
if (RapidSub.canDelegate("jobdone")) return b4a.example.homeadmin.remoteMe.runUserSub(false, "homeadmin","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _data_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 111;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(32768);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 113;BA.debugLine="Dim res As String";
Debug.ShouldStop(65536);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 114;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(131072);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 115;BA.debugLine="Log(\"Response from server :\"& res)";
Debug.ShouldStop(262144);
homeadmin.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 116;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(524288);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 117;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(1048576);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 118;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(2097152);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("CountHouse"),BA.ObjectToString("CountOffice"),BA.ObjectToString("CountWorship"),BA.ObjectToString("CountMsme"),BA.ObjectToString("CountEducation"),BA.ObjectToString("CountHealth"))) {
case 0: {
 BA.debugLineNum = 120;BA.debugLine="Dim data_array As List";
Debug.ShouldStop(8388608);
_data_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 121;BA.debugLine="data_array = parser.NextArray";
Debug.ShouldStop(16777216);
_data_array = _parser.runMethod(false,"NextArray");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 122;BA.debugLine="If data_array.Size > 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_data_array.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 123;BA.debugLine="For i=0 To data_array.Size - 1";
Debug.ShouldStop(67108864);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_data_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 124;BA.debugLine="Dim a As Map";
Debug.ShouldStop(134217728);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 125;BA.debugLine="a = data_array.Get(i)";
Debug.ShouldStop(268435456);
_a.setObject(_data_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 127;BA.debugLine="Label9.Text = a.Get(\"count\")";
Debug.ShouldStop(1073741824);
homeadmin.mostCurrent._label9.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("count"))))));
 BA.debugLineNum = 128;BA.debugLine="Log(a.Get(\"count\"))";
Debug.ShouldStop(-2147483648);
homeadmin.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("count")))))));
 }
}Debug.locals.put("i", _i);
;
 };
 break; }
case 1: {
 BA.debugLineNum = 132;BA.debugLine="Dim data_array As List";
Debug.ShouldStop(8);
_data_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 133;BA.debugLine="data_array = parser.NextArray";
Debug.ShouldStop(16);
_data_array = _parser.runMethod(false,"NextArray");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 134;BA.debugLine="If data_array.Size > 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_data_array.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 135;BA.debugLine="For i=0 To data_array.Size - 1";
Debug.ShouldStop(64);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {_data_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23) ;_i = ((int)(0 + _i + step23))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 136;BA.debugLine="Dim a As Map";
Debug.ShouldStop(128);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 137;BA.debugLine="a = data_array.Get(i)";
Debug.ShouldStop(256);
_a.setObject(_data_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 139;BA.debugLine="Label11.Text = a.Get(\"count\")";
Debug.ShouldStop(1024);
homeadmin.mostCurrent._label11.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("count"))))));
 BA.debugLineNum = 140;BA.debugLine="Log(a.Get(\"count\"))";
Debug.ShouldStop(2048);
homeadmin.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("count")))))));
 }
}Debug.locals.put("i", _i);
;
 };
 break; }
case 2: {
 BA.debugLineNum = 144;BA.debugLine="Dim data_array As List";
Debug.ShouldStop(32768);
_data_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 145;BA.debugLine="data_array = parser.NextArray";
Debug.ShouldStop(65536);
_data_array = _parser.runMethod(false,"NextArray");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 146;BA.debugLine="If data_array.Size > 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_data_array.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 147;BA.debugLine="For i=0 To data_array.Size - 1";
Debug.ShouldStop(262144);
{
final int step34 = 1;
final int limit34 = RemoteObject.solve(new RemoteObject[] {_data_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step34 > 0 && _i <= limit34) || (step34 < 0 && _i >= limit34) ;_i = ((int)(0 + _i + step34))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 148;BA.debugLine="Dim a As Map";
Debug.ShouldStop(524288);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 149;BA.debugLine="a = data_array.Get(i)";
Debug.ShouldStop(1048576);
_a.setObject(_data_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 151;BA.debugLine="Label10.Text = a.Get(\"count\")";
Debug.ShouldStop(4194304);
homeadmin.mostCurrent._label10.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("count"))))));
 BA.debugLineNum = 152;BA.debugLine="Log(a.Get(\"count\"))";
Debug.ShouldStop(8388608);
homeadmin.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("count")))))));
 }
}Debug.locals.put("i", _i);
;
 };
 break; }
case 3: {
 BA.debugLineNum = 156;BA.debugLine="Dim data_array As List";
Debug.ShouldStop(134217728);
_data_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 157;BA.debugLine="data_array = parser.NextArray";
Debug.ShouldStop(268435456);
_data_array = _parser.runMethod(false,"NextArray");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 158;BA.debugLine="If data_array.Size > 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_data_array.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 159;BA.debugLine="For i=0 To data_array.Size - 1";
Debug.ShouldStop(1073741824);
{
final int step45 = 1;
final int limit45 = RemoteObject.solve(new RemoteObject[] {_data_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step45 > 0 && _i <= limit45) || (step45 < 0 && _i >= limit45) ;_i = ((int)(0 + _i + step45))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 160;BA.debugLine="Dim a As Map";
Debug.ShouldStop(-2147483648);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 161;BA.debugLine="a = data_array.Get(i)";
Debug.ShouldStop(1);
_a.setObject(_data_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 163;BA.debugLine="Label13.Text = a.Get(\"count\")";
Debug.ShouldStop(4);
homeadmin.mostCurrent._label13.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("count"))))));
 BA.debugLineNum = 164;BA.debugLine="Log(a.Get(\"count\"))";
Debug.ShouldStop(8);
homeadmin.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("count")))))));
 }
}Debug.locals.put("i", _i);
;
 };
 break; }
case 4: {
 BA.debugLineNum = 168;BA.debugLine="Dim data_array As List";
Debug.ShouldStop(128);
_data_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 169;BA.debugLine="data_array = parser.NextArray";
Debug.ShouldStop(256);
_data_array = _parser.runMethod(false,"NextArray");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 170;BA.debugLine="If data_array.Size > 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_data_array.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 171;BA.debugLine="For i=0 To data_array.Size - 1";
Debug.ShouldStop(1024);
{
final int step56 = 1;
final int limit56 = RemoteObject.solve(new RemoteObject[] {_data_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step56 > 0 && _i <= limit56) || (step56 < 0 && _i >= limit56) ;_i = ((int)(0 + _i + step56))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 172;BA.debugLine="Dim a As Map";
Debug.ShouldStop(2048);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 173;BA.debugLine="a = data_array.Get(i)";
Debug.ShouldStop(4096);
_a.setObject(_data_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 175;BA.debugLine="Label12.Text = a.Get(\"count\")";
Debug.ShouldStop(16384);
homeadmin.mostCurrent._label12.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("count"))))));
 BA.debugLineNum = 176;BA.debugLine="Log(a.Get(\"count\"))";
Debug.ShouldStop(32768);
homeadmin.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("count")))))));
 }
}Debug.locals.put("i", _i);
;
 };
 break; }
case 5: {
 BA.debugLineNum = 180;BA.debugLine="Dim data_array As List";
Debug.ShouldStop(524288);
_data_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 181;BA.debugLine="data_array = parser.NextArray";
Debug.ShouldStop(1048576);
_data_array = _parser.runMethod(false,"NextArray");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 182;BA.debugLine="If data_array.Size > 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_data_array.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 183;BA.debugLine="For i=0 To data_array.Size - 1";
Debug.ShouldStop(4194304);
{
final int step67 = 1;
final int limit67 = RemoteObject.solve(new RemoteObject[] {_data_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step67 > 0 && _i <= limit67) || (step67 < 0 && _i >= limit67) ;_i = ((int)(0 + _i + step67))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 184;BA.debugLine="Dim a As Map";
Debug.ShouldStop(8388608);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 185;BA.debugLine="a = data_array.Get(i)";
Debug.ShouldStop(16777216);
_a.setObject(_data_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 187;BA.debugLine="Label14.Text = a.Get(\"count\")";
Debug.ShouldStop(67108864);
homeadmin.mostCurrent._label14.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("count"))))));
 BA.debugLineNum = 188;BA.debugLine="Log(a.Get(\"count\"))";
Debug.ShouldStop(134217728);
homeadmin.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("count")))))));
 }
}Debug.locals.put("i", _i);
;
 };
 break; }
}
;
 };
 BA.debugLineNum = 193;BA.debugLine="Job.Release";
Debug.ShouldStop(1);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _labellogout_click() throws Exception{
try {
		Debug.PushSubsStack("Labellogout_Click (homeadmin) ","homeadmin",12,homeadmin.mostCurrent.activityBA,homeadmin.mostCurrent,246);
if (RapidSub.canDelegate("labellogout_click")) return b4a.example.homeadmin.remoteMe.runUserSub(false, "homeadmin","labellogout_click");
 BA.debugLineNum = 246;BA.debugLine="Sub Labellogout_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 248;BA.debugLine="Login.manager.SetBoolean(\"is_login\", False)";
Debug.ShouldStop(8388608);
homeadmin.mostCurrent._login._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("is_login")),(Object)(homeadmin.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 252;BA.debugLine="ToastMessageShow(\"Logout berhasil\", False)";
Debug.ShouldStop(134217728);
homeadmin.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Logout berhasil")),(Object)(homeadmin.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 253;BA.debugLine="Main.kvs.Remove(\"username\")";
Debug.ShouldStop(268435456);
homeadmin.mostCurrent._main._kvs.runVoidMethod ("_remove",(Object)(RemoteObject.createImmutable("username")));
 BA.debugLineNum = 254;BA.debugLine="Main.kvs.Remove(\"role\")";
Debug.ShouldStop(536870912);
homeadmin.mostCurrent._main._kvs.runVoidMethod ("_remove",(Object)(RemoteObject.createImmutable("role")));
 BA.debugLineNum = 255;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1073741824);
homeadmin.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 256;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(-2147483648);
homeadmin.mostCurrent.__c.runVoidMethod ("StartActivity",homeadmin.processBA,(Object)((homeadmin.mostCurrent._main.getObject())));
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
public static RemoteObject  _officebtn_click() throws Exception{
try {
		Debug.PushSubsStack("OfficeBtn_Click (homeadmin) ","homeadmin",12,homeadmin.mostCurrent.activityBA,homeadmin.mostCurrent,234);
if (RapidSub.canDelegate("officebtn_click")) return b4a.example.homeadmin.remoteMe.runUserSub(false, "homeadmin","officebtn_click");
 BA.debugLineNum = 234;BA.debugLine="Sub OfficeBtn_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 235;BA.debugLine="StartActivity(OfficeBuilding)";
Debug.ShouldStop(1024);
homeadmin.mostCurrent.__c.runVoidMethod ("StartActivity",homeadmin.processBA,(Object)((homeadmin.mostCurrent._officebuilding.getObject())));
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim AddFac_clicked As String = \"\"";
homeadmin._addfac_clicked = BA.ObjectToString("");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _worshipbtn_click() throws Exception{
try {
		Debug.PushSubsStack("WorshipBtn_Click (homeadmin) ","homeadmin",12,homeadmin.mostCurrent.activityBA,homeadmin.mostCurrent,230);
if (RapidSub.canDelegate("worshipbtn_click")) return b4a.example.homeadmin.remoteMe.runUserSub(false, "homeadmin","worshipbtn_click");
 BA.debugLineNum = 230;BA.debugLine="Sub WorshipBtn_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 231;BA.debugLine="StartActivity(WorshipBuilding)";
Debug.ShouldStop(64);
homeadmin.mostCurrent.__c.runVoidMethod ("StartActivity",homeadmin.processBA,(Object)((homeadmin.mostCurrent._worshipbuilding.getObject())));
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}