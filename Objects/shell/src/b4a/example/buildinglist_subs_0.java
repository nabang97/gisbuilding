package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class buildinglist_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (buildinglist) ","buildinglist",36,buildinglist.mostCurrent.activityBA,buildinglist.mostCurrent,25);
if (RapidSub.canDelegate("activity_create")) return b4a.example.buildinglist.remoteMe.runUserSub(false, "buildinglist","activity_create", _firsttime);
RemoteObject _totheight = RemoteObject.createImmutable(0);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 28;BA.debugLine="Activity.LoadLayout(\"MapScrollView\")";
Debug.ShouldStop(134217728);
buildinglist.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MapScrollView")),buildinglist.mostCurrent.activityBA);
 BA.debugLineNum = 30;BA.debugLine="ScrollView1.Panel.LoadLayout(\"BuildingList\")";
Debug.ShouldStop(536870912);
buildinglist.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("BuildingList")),buildinglist.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="ScrollView1.Panel.Width=100%x";
Debug.ShouldStop(1073741824);
buildinglist.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setWidth",buildinglist.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),buildinglist.mostCurrent.activityBA));
 BA.debugLineNum = 32;BA.debugLine="Dim TotHeight As Int";
Debug.ShouldStop(-2147483648);
_totheight = RemoteObject.createImmutable(0);Debug.locals.put("TotHeight", _totheight);
 BA.debugLineNum = 33;BA.debugLine="TotHeight = PanelBuildingList.Height+10%x";
Debug.ShouldStop(1);
_totheight = RemoteObject.solve(new RemoteObject[] {buildinglist.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"),buildinglist.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),buildinglist.mostCurrent.activityBA)}, "+",1, 1);Debug.locals.put("TotHeight", _totheight);
 BA.debugLineNum = 34;BA.debugLine="ScrollView1.Panel.Height = TotHeight";
Debug.ShouldStop(2);
buildinglist.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",_totheight);
 BA.debugLineNum = 37;BA.debugLine="WebView1.LoadURL(\"https://gisbuildingkotogadang.h";
Debug.ShouldStop(16);
buildinglist.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://gisbuildingkotogadang.herokuapp.com/")));
 BA.debugLineNum = 38;BA.debugLine="BackArrow.Visible= True";
Debug.ShouldStop(32);
buildinglist.mostCurrent._backarrow.runMethod(true,"setVisible",buildinglist.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 39;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(64);
buildinglist.mostCurrent._backarrow.runVoidMethod ("SetBackgroundImageNew",(Object)((buildinglist.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(buildinglist.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("back-arrow.png"))).getObject())));
 BA.debugLineNum = 40;BA.debugLine="TitleBar.Text=\"Building List\"";
Debug.ShouldStop(128);
buildinglist.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("Building List"));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Activity_Pause (buildinglist) ","buildinglist",36,buildinglist.mostCurrent.activityBA,buildinglist.mostCurrent,49);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.buildinglist.remoteMe.runUserSub(false, "buildinglist","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 49;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="SetAnimation(\"zoom_enter\", \"zoom_exit\")";
Debug.ShouldStop(131072);
_setanimation(BA.ObjectToString("zoom_enter"),RemoteObject.createImmutable("zoom_exit"));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Activity_Resume (buildinglist) ","buildinglist",36,buildinglist.mostCurrent.activityBA,buildinglist.mostCurrent,44);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.buildinglist.remoteMe.runUserSub(false, "buildinglist","activity_resume");
 BA.debugLineNum = 44;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _backarrow_click() throws Exception{
try {
		Debug.PushSubsStack("BackArrow_Click (buildinglist) ","buildinglist",36,buildinglist.mostCurrent.activityBA,buildinglist.mostCurrent,66);
if (RapidSub.canDelegate("backarrow_click")) return b4a.example.buildinglist.remoteMe.runUserSub(false, "buildinglist","backarrow_click");
 BA.debugLineNum = 66;BA.debugLine="Sub BackArrow_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4);
buildinglist.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _buildingname_click() throws Exception{
try {
		Debug.PushSubsStack("BuildingName_Click (buildinglist) ","buildinglist",36,buildinglist.mostCurrent.activityBA,buildinglist.mostCurrent,70);
if (RapidSub.canDelegate("buildingname_click")) return b4a.example.buildinglist.remoteMe.runUserSub(false, "buildinglist","buildingname_click");
 BA.debugLineNum = 70;BA.debugLine="Sub BuildingName_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="StartActivity(OfficeDetail)";
Debug.ShouldStop(64);
buildinglist.mostCurrent.__c.runVoidMethod ("StartActivity",buildinglist.processBA,(Object)((buildinglist.mostCurrent._officedetail.getObject())));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
 //BA.debugLineNum = 15;BA.debugLine="Private ScrollView1 As ScrollView";
buildinglist.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Public NameOfficeHome As String";
buildinglist.mostCurrent._nameofficehome = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="Private TitleBar As Label";
buildinglist.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private BackArrow As Label";
buildinglist.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private PanelListItem As Panel";
buildinglist.mostCurrent._panellistitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private PanelBuildingList As Panel";
buildinglist.mostCurrent._panelbuildinglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim WebView1 As WebView";
buildinglist.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private BuildingName As Label";
buildinglist.mostCurrent._buildingname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
buildinglist._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setanimation(RemoteObject _inanimation,RemoteObject _outanimation) throws Exception{
try {
		Debug.PushSubsStack("SetAnimation (buildinglist) ","buildinglist",36,buildinglist.mostCurrent.activityBA,buildinglist.mostCurrent,54);
if (RapidSub.canDelegate("setanimation")) return b4a.example.buildinglist.remoteMe.runUserSub(false, "buildinglist","setanimation", _inanimation, _outanimation);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _package = RemoteObject.createImmutable("");
RemoteObject _in = RemoteObject.createImmutable(0);
RemoteObject _out = RemoteObject.createImmutable(0);
Debug.locals.put("InAnimation", _inanimation);
Debug.locals.put("OutAnimation", _outanimation);
 BA.debugLineNum = 54;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(4194304);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 56;BA.debugLine="Dim package As String";
Debug.ShouldStop(8388608);
_package = RemoteObject.createImmutable("");Debug.locals.put("package", _package);
 BA.debugLineNum = 57;BA.debugLine="Dim in, out As Int";
Debug.ShouldStop(16777216);
_in = RemoteObject.createImmutable(0);Debug.locals.put("in", _in);
_out = RemoteObject.createImmutable(0);Debug.locals.put("out", _out);
 BA.debugLineNum = 58;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
Debug.ShouldStop(33554432);
_package = BA.ObjectToString(_r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("anywheresoftware.b4a.BA")),(Object)(RemoteObject.createImmutable("packageName"))));Debug.locals.put("package", _package);
 BA.debugLineNum = 59;BA.debugLine="in = r.GetStaticField(package & \".R$anim\", InAnim";
Debug.ShouldStop(67108864);
_in = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_inanimation)));Debug.locals.put("in", _in);
 BA.debugLineNum = 60;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
Debug.ShouldStop(134217728);
_out = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_outanimation)));Debug.locals.put("out", _out);
 BA.debugLineNum = 61;BA.debugLine="r.Target = r.GetActivity";
Debug.ShouldStop(268435456);
_r.setField ("Target",(_r.runMethod(false,"GetActivity",buildinglist.processBA)));
 BA.debugLineNum = 62;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
Debug.ShouldStop(536870912);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("overridePendingTransition")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_in),(_out)})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.lang.int")})));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}