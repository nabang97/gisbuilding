package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class home_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (home) ","home",11,home.mostCurrent.activityBA,home.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) return b4a.example.home.remoteMe.runUserSub(false, "home","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(2);
home.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),home.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="ScrollView1.Panel.LoadLayout(\"HomeContent\")";
Debug.ShouldStop(4);
home.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("HomeContent")),home.mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="ScrollView1.Panel.Width=100%x";
Debug.ShouldStop(8);
home.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setWidth",home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),home.mostCurrent.activityBA));
 BA.debugLineNum = 37;BA.debugLine="ScrollView1.Panel.Height = Panelhome.Height";
Debug.ShouldStop(16);
home.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",home.mostCurrent._panelhome.runMethod(true,"getHeight"));
 BA.debugLineNum = 38;BA.debugLine="Panelhome.Height = 100%y - PanelToolBar.Height -";
Debug.ShouldStop(32);
home.mostCurrent._panelhome.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {home.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),home.mostCurrent.activityBA),home.mostCurrent._paneltoolbar.runMethod(true,"getHeight"),home.mostCurrent._panelbar.runMethod(true,"getHeight")}, "--",2, 1));
 BA.debugLineNum = 39;BA.debugLine="ScrollView1.Height = Panelhome.Height + 2%y";
Debug.ShouldStop(64);
home.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {home.mostCurrent._panelhome.runMethod(true,"getHeight"),home.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),home.mostCurrent.activityBA)}, "+",1, 1));
 BA.debugLineNum = 41;BA.debugLine="BackArrow.Visible= True";
Debug.ShouldStop(256);
home.mostCurrent._backarrow.runMethod(true,"setVisible",home.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 42;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(512);
home.mostCurrent._backarrow.runVoidMethod ("SetBackgroundImageNew",(Object)((home.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(home.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("logotoolbar.png"))).getObject())));
 BA.debugLineNum = 43;BA.debugLine="BackArrow.Width=8%x";
Debug.ShouldStop(1024);
home.mostCurrent._backarrow.runMethod(true,"setWidth",home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 8)),home.mostCurrent.activityBA));
 BA.debugLineNum = 44;BA.debugLine="BackArrow.Height=8%x";
Debug.ShouldStop(2048);
home.mostCurrent._backarrow.runMethod(true,"setHeight",home.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 8)),home.mostCurrent.activityBA));
 BA.debugLineNum = 45;BA.debugLine="BackArrow.Top=1%y";
Debug.ShouldStop(4096);
home.mostCurrent._backarrow.runMethod(true,"setTop",home.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),home.mostCurrent.activityBA));
 BA.debugLineNum = 46;BA.debugLine="TitleBar.Text=\"GIS Building\"";
Debug.ShouldStop(8192);
home.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("GIS Building"));
 BA.debugLineNum = 47;BA.debugLine="SetPressed(BtnHome, True)";
Debug.ShouldStop(16384);
_setpressed(home.mostCurrent._btnhome,home.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Pause (home) ","home",11,home.mostCurrent.activityBA,home.mostCurrent,55);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.home.remoteMe.runUserSub(false, "home","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 55;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="SetAnimation(\"zoom_enter\", \"zoom_exit\")";
Debug.ShouldStop(8388608);
_setanimation(BA.ObjectToString("zoom_enter"),RemoteObject.createImmutable("zoom_exit"));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Resume (home) ","home",11,home.mostCurrent.activityBA,home.mostCurrent,50);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.home.remoteMe.runUserSub(false, "home","activity_resume");
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="OfficeHome.SetBackgroundImage(LoadBitmap(File.Dir";
Debug.ShouldStop(262144);
home.mostCurrent._officehome.runVoidMethod ("SetBackgroundImageNew",(Object)((home.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(home.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("office-building-home.png"))).getObject())));
 BA.debugLineNum = 52;BA.debugLine="SetPressed(BtnHome, True)";
Debug.ShouldStop(524288);
_setpressed(home.mostCurrent._btnhome,home.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("BtnMap_Click (home) ","home",11,home.mostCurrent.activityBA,home.mostCurrent,118);
if (RapidSub.canDelegate("btnmap_click")) return b4a.example.home.remoteMe.runUserSub(false, "home","btnmap_click");
 BA.debugLineNum = 118;BA.debugLine="Sub BtnMap_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4194304);
home.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 120;BA.debugLine="StartActivity(ManualPosition)";
Debug.ShouldStop(8388608);
home.mostCurrent.__c.runVoidMethod ("StartActivity",home.processBA,(Object)((home.mostCurrent._manualposition.getObject())));
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("BtnSearch_Click (home) ","home",11,home.mostCurrent.activityBA,home.mostCurrent,113);
if (RapidSub.canDelegate("btnsearch_click")) return b4a.example.home.remoteMe.runUserSub(false, "home","btnsearch_click");
 BA.debugLineNum = 113;BA.debugLine="Sub BtnSearch_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
home.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 115;BA.debugLine="StartActivity(SearchBuilding)";
Debug.ShouldStop(262144);
home.mostCurrent.__c.runVoidMethod ("StartActivity",home.processBA,(Object)((home.mostCurrent._searchbuilding.getObject())));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _educationalhome_click() throws Exception{
try {
		Debug.PushSubsStack("EducationalHome_Click (home) ","home",11,home.mostCurrent.activityBA,home.mostCurrent,93);
if (RapidSub.canDelegate("educationalhome_click")) return b4a.example.home.remoteMe.runUserSub(false, "home","educationalhome_click");
 BA.debugLineNum = 93;BA.debugLine="Sub EducationalHome_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="SearchBuilding.idspin =\"\"";
Debug.ShouldStop(536870912);
home.mostCurrent._searchbuilding._idspin = BA.ObjectToString("");
 BA.debugLineNum = 95;BA.debugLine="HomeBuilding = \"Educational\"";
Debug.ShouldStop(1073741824);
home._homebuilding = BA.ObjectToString("Educational");
 BA.debugLineNum = 96;BA.debugLine="StartActivity(EducationalBuilding)";
Debug.ShouldStop(-2147483648);
home.mostCurrent.__c.runVoidMethod ("StartActivity",home.processBA,(Object)((home.mostCurrent._educationalbuilding.getObject())));
 BA.debugLineNum = 97;BA.debugLine="SetAnimation(\"zoom_enter\", \"zoom_exit\")";
Debug.ShouldStop(1);
_setanimation(BA.ObjectToString("zoom_enter"),RemoteObject.createImmutable("zoom_exit"));
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
 //BA.debugLineNum = 16;BA.debugLine="Private ScrollView1 As ScrollView";
home.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Panelhome As Panel";
home.mostCurrent._panelhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private OfficeHome As Panel";
home.mostCurrent._officehome = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Label1 As Label";
home.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private TitleBar As Label";
home.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private BackArrow As Label";
home.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private HealthHome As Panel";
home.mostCurrent._healthhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private EducationalHome As Panel";
home.mostCurrent._educationalhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private MsmeHome As Panel";
home.mostCurrent._msmehome = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private BtnHome As Button";
home.mostCurrent._btnhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private BtnSearch As Button";
home.mostCurrent._btnsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private PanelBar As Panel";
home.mostCurrent._panelbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private PanelToolBar As Panel";
home.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private BtnMap As Button";
home.mostCurrent._btnmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _healthhome_click() throws Exception{
try {
		Debug.PushSubsStack("HealthHome_Click (home) ","home",11,home.mostCurrent.activityBA,home.mostCurrent,85);
if (RapidSub.canDelegate("healthhome_click")) return b4a.example.home.remoteMe.runUserSub(false, "home","healthhome_click");
 BA.debugLineNum = 85;BA.debugLine="Sub HealthHome_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="SearchBuilding.idspin =\"\"";
Debug.ShouldStop(2097152);
home.mostCurrent._searchbuilding._idspin = BA.ObjectToString("");
 BA.debugLineNum = 87;BA.debugLine="HomeBuilding = \"Health\"";
Debug.ShouldStop(4194304);
home._homebuilding = BA.ObjectToString("Health");
 BA.debugLineNum = 88;BA.debugLine="StartActivity(HealthBuilding)";
Debug.ShouldStop(8388608);
home.mostCurrent.__c.runVoidMethod ("StartActivity",home.processBA,(Object)((home.mostCurrent._healthbuilding.getObject())));
 BA.debugLineNum = 89;BA.debugLine="SetAnimation(\"zoom_enter\", \"zoom_exit\")";
Debug.ShouldStop(16777216);
_setanimation(BA.ObjectToString("zoom_enter"),RemoteObject.createImmutable("zoom_exit"));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _msmehome_click() throws Exception{
try {
		Debug.PushSubsStack("MsmeHome_Click (home) ","home",11,home.mostCurrent.activityBA,home.mostCurrent,100);
if (RapidSub.canDelegate("msmehome_click")) return b4a.example.home.remoteMe.runUserSub(false, "home","msmehome_click");
 BA.debugLineNum = 100;BA.debugLine="Sub MsmeHome_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="SearchBuilding.idspin =\"\"";
Debug.ShouldStop(16);
home.mostCurrent._searchbuilding._idspin = BA.ObjectToString("");
 BA.debugLineNum = 102;BA.debugLine="HomeBuilding = \"Msme\"";
Debug.ShouldStop(32);
home._homebuilding = BA.ObjectToString("Msme");
 BA.debugLineNum = 103;BA.debugLine="StartActivity(MsmeBuilding)";
Debug.ShouldStop(64);
home.mostCurrent.__c.runVoidMethod ("StartActivity",home.processBA,(Object)((home.mostCurrent._msmebuilding.getObject())));
 BA.debugLineNum = 104;BA.debugLine="SetAnimation(\"zoom_enter\", \"zoom_exit\")";
Debug.ShouldStop(128);
_setanimation(BA.ObjectToString("zoom_enter"),RemoteObject.createImmutable("zoom_exit"));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _officehome_click() throws Exception{
try {
		Debug.PushSubsStack("OfficeHome_Click (home) ","home",11,home.mostCurrent.activityBA,home.mostCurrent,70);
if (RapidSub.canDelegate("officehome_click")) return b4a.example.home.remoteMe.runUserSub(false, "home","officehome_click");
 BA.debugLineNum = 70;BA.debugLine="Sub OfficeHome_Click()";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="SearchBuilding.idspin =\"\"";
Debug.ShouldStop(64);
home.mostCurrent._searchbuilding._idspin = BA.ObjectToString("");
 BA.debugLineNum = 72;BA.debugLine="OfficeHome.SetBackgroundImage(LoadBitmap(File.Dir";
Debug.ShouldStop(128);
home.mostCurrent._officehome.runVoidMethod ("SetBackgroundImageNew",(Object)((home.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(home.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("office-pres.png"))).getObject())));
 BA.debugLineNum = 73;BA.debugLine="HomeBuilding = \"Office\"";
Debug.ShouldStop(256);
home._homebuilding = BA.ObjectToString("Office");
 BA.debugLineNum = 74;BA.debugLine="StartActivity(OfficeBuilding)";
Debug.ShouldStop(512);
home.mostCurrent.__c.runVoidMethod ("StartActivity",home.processBA,(Object)((home.mostCurrent._officebuilding.getObject())));
 BA.debugLineNum = 75;BA.debugLine="SetAnimation(\"zoom_enter\", \"zoom_exit\")";
Debug.ShouldStop(1024);
_setanimation(BA.ObjectToString("zoom_enter"),RemoteObject.createImmutable("zoom_exit"));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 9;BA.debugLine="Dim HomeBuilding As String";
home._homebuilding = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setanimation(RemoteObject _inanimation,RemoteObject _outanimation) throws Exception{
try {
		Debug.PushSubsStack("SetAnimation (home) ","home",11,home.mostCurrent.activityBA,home.mostCurrent,59);
if (RapidSub.canDelegate("setanimation")) return b4a.example.home.remoteMe.runUserSub(false, "home","setanimation", _inanimation, _outanimation);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _package = RemoteObject.createImmutable("");
RemoteObject _in = RemoteObject.createImmutable(0);
RemoteObject _out = RemoteObject.createImmutable(0);
Debug.locals.put("InAnimation", _inanimation);
Debug.locals.put("OutAnimation", _outanimation);
 BA.debugLineNum = 59;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(134217728);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 61;BA.debugLine="Dim package As String";
Debug.ShouldStop(268435456);
_package = RemoteObject.createImmutable("");Debug.locals.put("package", _package);
 BA.debugLineNum = 62;BA.debugLine="Dim in, out As Int";
Debug.ShouldStop(536870912);
_in = RemoteObject.createImmutable(0);Debug.locals.put("in", _in);
_out = RemoteObject.createImmutable(0);Debug.locals.put("out", _out);
 BA.debugLineNum = 63;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
Debug.ShouldStop(1073741824);
_package = BA.ObjectToString(_r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("anywheresoftware.b4a.BA")),(Object)(RemoteObject.createImmutable("packageName"))));Debug.locals.put("package", _package);
 BA.debugLineNum = 64;BA.debugLine="in = r.GetStaticField(package & \".R$anim\", InAnim";
Debug.ShouldStop(-2147483648);
_in = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_inanimation)));Debug.locals.put("in", _in);
 BA.debugLineNum = 65;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
Debug.ShouldStop(1);
_out = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_outanimation)));Debug.locals.put("out", _out);
 BA.debugLineNum = 66;BA.debugLine="r.Target = r.GetActivity";
Debug.ShouldStop(2);
_r.setField ("Target",(_r.runMethod(false,"GetActivity",home.processBA)));
 BA.debugLineNum = 67;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
Debug.ShouldStop(4);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("overridePendingTransition")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_in),(_out)})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.lang.int")})));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpressed(RemoteObject _cmd,RemoteObject _pressed) throws Exception{
try {
		Debug.PushSubsStack("SetPressed (home) ","home",11,home.mostCurrent.activityBA,home.mostCurrent,107);
if (RapidSub.canDelegate("setpressed")) return b4a.example.home.remoteMe.runUserSub(false, "home","setpressed", _cmd, _pressed);
RemoteObject _ref = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
Debug.locals.put("cmd", _cmd);
Debug.locals.put("Pressed", _pressed);
 BA.debugLineNum = 107;BA.debugLine="Sub SetPressed(cmd As Button, Pressed As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="Dim ref As Reflector";
Debug.ShouldStop(2048);
_ref = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("ref", _ref);
 BA.debugLineNum = 109;BA.debugLine="ref.Target = cmd";
Debug.ShouldStop(4096);
_ref.setField ("Target",(_cmd.getObject()));
 BA.debugLineNum = 110;BA.debugLine="ref.RunMethod2(\"setPressed\", Pressed, \"java.lang.";
Debug.ShouldStop(8192);
_ref.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setPressed")),(Object)(BA.ObjectToString(_pressed)),(Object)(RemoteObject.createImmutable("java.lang.boolean")));
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
public static RemoteObject  _worshiphome_click() throws Exception{
try {
		Debug.PushSubsStack("WorshipHome_Click (home) ","home",11,home.mostCurrent.activityBA,home.mostCurrent,78);
if (RapidSub.canDelegate("worshiphome_click")) return b4a.example.home.remoteMe.runUserSub(false, "home","worshiphome_click");
 BA.debugLineNum = 78;BA.debugLine="Sub WorshipHome_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="SearchBuilding.idspin =\"\"";
Debug.ShouldStop(16384);
home.mostCurrent._searchbuilding._idspin = BA.ObjectToString("");
 BA.debugLineNum = 80;BA.debugLine="HomeBuilding = \"Worship\"";
Debug.ShouldStop(32768);
home._homebuilding = BA.ObjectToString("Worship");
 BA.debugLineNum = 81;BA.debugLine="StartActivity(WorshipBuilding)";
Debug.ShouldStop(65536);
home.mostCurrent.__c.runVoidMethod ("StartActivity",home.processBA,(Object)((home.mostCurrent._worshipbuilding.getObject())));
 BA.debugLineNum = 82;BA.debugLine="SetAnimation(\"zoom_enter\", \"zoom_exit\")";
Debug.ShouldStop(131072);
_setanimation(BA.ObjectToString("zoom_enter"),RemoteObject.createImmutable("zoom_exit"));
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}