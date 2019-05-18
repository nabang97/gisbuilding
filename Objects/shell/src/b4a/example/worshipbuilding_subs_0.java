package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class worshipbuilding_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (worshipbuilding) ","worshipbuilding",20,worshipbuilding.mostCurrent.activityBA,worshipbuilding.mostCurrent,37);
if (RapidSub.canDelegate("activity_create")) return b4a.example.worshipbuilding.remoteMe.runUserSub(false, "worshipbuilding","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 39;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(64);
worshipbuilding.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),worshipbuilding.mostCurrent.activityBA);
 BA.debugLineNum = 40;BA.debugLine="ScrollView1.Panel.Width=100%y";
Debug.ShouldStop(128);
worshipbuilding.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setWidth",worshipbuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),worshipbuilding.mostCurrent.activityBA));
 BA.debugLineNum = 41;BA.debugLine="ScrollView1.Panel.LoadLayout(\"clvBuildingList\")";
Debug.ShouldStop(256);
worshipbuilding.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("clvBuildingList")),worshipbuilding.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="PanelToolBar.Visible = False";
Debug.ShouldStop(512);
worshipbuilding.mostCurrent._paneltoolbar.runMethod(true,"setVisible",worshipbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 45;BA.debugLine="BackArrow.Visible= True";
Debug.ShouldStop(4096);
worshipbuilding.mostCurrent._backarrow.runMethod(true,"setVisible",worshipbuilding.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 46;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(8192);
worshipbuilding.mostCurrent._backarrow.runVoidMethod ("SetBackgroundImageNew",(Object)((worshipbuilding.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(worshipbuilding.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("back-arrow.png"))).getObject())));
 BA.debugLineNum = 47;BA.debugLine="TitleBar.Text=\"Building List\"";
Debug.ShouldStop(16384);
worshipbuilding.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("Building List"));
 BA.debugLineNum = 50;BA.debugLine="WebViewTest.Initialize(\"\")";
Debug.ShouldStop(131072);
worshipbuilding.mostCurrent._webviewtest.runVoidMethod ("Initialize",worshipbuilding.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 51;BA.debugLine="Activity.AddView(WebViewTest,0,6%y,100%x,50%y)";
Debug.ShouldStop(262144);
worshipbuilding.mostCurrent._activity.runVoidMethod ("AddView",(Object)((worshipbuilding.mostCurrent._webviewtest.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(worshipbuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),worshipbuilding.mostCurrent.activityBA)),(Object)(worshipbuilding.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),worshipbuilding.mostCurrent.activityBA)),(Object)(worshipbuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),worshipbuilding.mostCurrent.activityBA)));
 BA.debugLineNum = 52;BA.debugLine="WebViewTest.LoadURL(Main.Server&\"worship_building";
Debug.ShouldStop(524288);
worshipbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(worshipbuilding.mostCurrent._main._server,RemoteObject.createImmutable("worship_building.php"))));
 BA.debugLineNum = 55;BA.debugLine="ScrollView1.Panel.Height = CLV2.sv.Height";
Debug.ShouldStop(4194304);
worshipbuilding.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",worshipbuilding.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"getHeight"));
 BA.debugLineNum = 56;BA.debugLine="ScrollView1.Top = WebViewTest.Height+WebViewTest.";
Debug.ShouldStop(8388608);
worshipbuilding.mostCurrent._scrollview1.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {worshipbuilding.mostCurrent._webviewtest.runMethod(true,"getHeight"),worshipbuilding.mostCurrent._webviewtest.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Pause (worshipbuilding) ","worshipbuilding",20,worshipbuilding.mostCurrent.activityBA,worshipbuilding.mostCurrent,71);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.worshipbuilding.remoteMe.runUserSub(false, "worshipbuilding","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 71;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _activity_resume() throws Exception{
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(null, null);
}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(b4a.example.worshipbuilding parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.worshipbuilding parent;
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (worshipbuilding) ","worshipbuilding",20,worshipbuilding.mostCurrent.activityBA,worshipbuilding.mostCurrent,61);
if (RapidSub.canDelegate("activity_resume")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 62;BA.debugLine="CLV2.Clear";
Debug.ShouldStop(536870912);
parent.mostCurrent._clv2.runVoidMethod ("_clear");
 BA.debugLineNum = 63;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(1073741824);
_j = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 64;BA.debugLine="j.Initialize(\"\",Me)";
Debug.ShouldStop(-2147483648);
_j.runVoidMethod ("_initialize",worshipbuilding.processBA,(Object)(BA.ObjectToString("")),(Object)(worshipbuilding.getObject()));
 BA.debugLineNum = 65;BA.debugLine="j.Download(Main.Server&\"mobile/datat4ibadah.php\")";
Debug.ShouldStop(1);
_j.runVoidMethod ("_download",(Object)(RemoteObject.concat(parent.mostCurrent._main._server,RemoteObject.createImmutable("mobile/datat4ibadah.php"))));
 BA.debugLineNum = 66;BA.debugLine="ProgressDialogShow2(\"Downloading...\",False)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",worshipbuilding.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("Downloading...")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 67;BA.debugLine="Wait For (j) JobDone (j As HttpJob)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", worshipbuilding.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_j));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 68;BA.debugLine="JobDone(j)";
Debug.ShouldStop(8);
_jobdone(_j);
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
public static RemoteObject  _backarrow_click() throws Exception{
try {
		Debug.PushSubsStack("BackArrow_Click (worshipbuilding) ","worshipbuilding",20,worshipbuilding.mostCurrent.activityBA,worshipbuilding.mostCurrent,144);
if (RapidSub.canDelegate("backarrow_click")) return b4a.example.worshipbuilding.remoteMe.runUserSub(false, "worshipbuilding","backarrow_click");
 BA.debugLineNum = 144;BA.debugLine="Sub BackArrow_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
worshipbuilding.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnhome_click() throws Exception{
try {
		Debug.PushSubsStack("BtnHome_Click (worshipbuilding) ","worshipbuilding",20,worshipbuilding.mostCurrent.activityBA,worshipbuilding.mostCurrent,148);
if (RapidSub.canDelegate("btnhome_click")) return b4a.example.worshipbuilding.remoteMe.runUserSub(false, "worshipbuilding","btnhome_click");
 BA.debugLineNum = 148;BA.debugLine="Sub BtnHome_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("BtnInfo_Click (worshipbuilding) ","worshipbuilding",20,worshipbuilding.mostCurrent.activityBA,worshipbuilding.mostCurrent,160);
if (RapidSub.canDelegate("btninfo_click")) return b4a.example.worshipbuilding.remoteMe.runUserSub(false, "worshipbuilding","btninfo_click");
 BA.debugLineNum = 160;BA.debugLine="Sub BtnInfo_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("BtnMap_Click (worshipbuilding) ","worshipbuilding",20,worshipbuilding.mostCurrent.activityBA,worshipbuilding.mostCurrent,152);
if (RapidSub.canDelegate("btnmap_click")) return b4a.example.worshipbuilding.remoteMe.runUserSub(false, "worshipbuilding","btnmap_click");
 BA.debugLineNum = 152;BA.debugLine="Sub BtnMap_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("BtnSearch_Click (worshipbuilding) ","worshipbuilding",20,worshipbuilding.mostCurrent.activityBA,worshipbuilding.mostCurrent,156);
if (RapidSub.canDelegate("btnsearch_click")) return b4a.example.worshipbuilding.remoteMe.runUserSub(false, "worshipbuilding","btnsearch_click");
 BA.debugLineNum = 156;BA.debugLine="Sub BtnSearch_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("BuildingName_Click (worshipbuilding) ","worshipbuilding",20,worshipbuilding.mostCurrent.activityBA,worshipbuilding.mostCurrent,126);
if (RapidSub.canDelegate("buildingname_click")) return b4a.example.worshipbuilding.remoteMe.runUserSub(false, "worshipbuilding","buildingname_click");
 BA.debugLineNum = 126;BA.debugLine="Sub BuildingName_Click";
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
public static RemoteObject  _clv2_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLV2_ItemClick (worshipbuilding) ","worshipbuilding",20,worshipbuilding.mostCurrent.activityBA,worshipbuilding.mostCurrent,85);
if (RapidSub.canDelegate("clv2_itemclick")) return b4a.example.worshipbuilding.remoteMe.runUserSub(false, "worshipbuilding","clv2_itemclick", _index, _value);
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 85;BA.debugLine="Sub CLV2_ItemClick (Index As Int, Value As Object)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 87;BA.debugLine="idBuilding = Value 'store the value in the proces";
Debug.ShouldStop(4194304);
worshipbuilding._idbuilding = BA.ObjectToString(_value);
 BA.debugLineNum = 88;BA.debugLine="StartActivity(WorshipDetail)";
Debug.ShouldStop(8388608);
worshipbuilding.mostCurrent.__c.runVoidMethod ("StartActivity",worshipbuilding.processBA,(Object)((worshipbuilding.mostCurrent._worshipdetail.getObject())));
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createitem(RemoteObject _width,RemoteObject _title,RemoteObject _content) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (worshipbuilding) ","worshipbuilding",20,worshipbuilding.mostCurrent.activityBA,worshipbuilding.mostCurrent,75);
if (RapidSub.canDelegate("createitem")) return b4a.example.worshipbuilding.remoteMe.runUserSub(false, "worshipbuilding","createitem", _width, _title, _content);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Title", _title);
Debug.locals.put("Content", _content);
 BA.debugLineNum = 75;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(2048);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = worshipbuilding._xui.runMethod(false,"CreatePanel",worshipbuilding.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 77;BA.debugLine="p.LoadLayout(\"BuildingListTwo\")";
Debug.ShouldStop(4096);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("BuildingListTwo")),worshipbuilding.mostCurrent.activityBA);
 BA.debugLineNum = 78;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, PanelListItem";
Debug.ShouldStop(8192);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(worshipbuilding.mostCurrent._panellistitem.runMethod(true,"getHeight")));
 BA.debugLineNum = 79;BA.debugLine="Num.Text = Title";
Debug.ShouldStop(16384);
worshipbuilding.mostCurrent._num.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 80;BA.debugLine="BuildingName.Text = Content";
Debug.ShouldStop(32768);
worshipbuilding.mostCurrent._buildingname.runMethod(true,"setText",BA.ObjectToCharSequence(_content));
 BA.debugLineNum = 81;BA.debugLine="Return p";
Debug.ShouldStop(65536);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private TitleBar As Label";
worshipbuilding.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private BackArrow As Label";
worshipbuilding.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ScrollView1 As ScrollView";
worshipbuilding.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim WebViewTest As WebView";
worshipbuilding.mostCurrent._webviewtest = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private PanelBuildingList As Panel";
worshipbuilding.mostCurrent._panelbuildinglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private CLV2 As CustomListView";
worshipbuilding.mostCurrent._clv2 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 26;BA.debugLine="Private Num As B4XView";
worshipbuilding.mostCurrent._num = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private BuildingName As B4XView";
worshipbuilding.mostCurrent._buildingname = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private PanelListItem As Panel";
worshipbuilding.mostCurrent._panellistitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private BtnHome As Button";
worshipbuilding.mostCurrent._btnhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private BtnSearch As Button";
worshipbuilding.mostCurrent._btnsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private BtnInfo As Button";
worshipbuilding.mostCurrent._btninfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private PanelToolBar As Panel";
worshipbuilding.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private btnDelete As Button";
worshipbuilding.mostCurrent._btndelete = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _j) throws Exception{
try {
		Debug.PushSubsStack("JobDone (worshipbuilding) ","worshipbuilding",20,worshipbuilding.mostCurrent.activityBA,worshipbuilding.mostCurrent,91);
if (RapidSub.canDelegate("jobdone")) return b4a.example.worshipbuilding.remoteMe.runUserSub(false, "worshipbuilding","jobdone", _j);
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _features = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colfeatures = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _properties = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nama = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _content = RemoteObject.createImmutable("");
RemoteObject _type = RemoteObject.createImmutable("");
Debug.locals.put("j", _j);
 BA.debugLineNum = 91;BA.debugLine="Sub JobDone(j As HttpJob)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="If j.Success Then";
Debug.ShouldStop(134217728);
if (_j.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 93;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(268435456);
worshipbuilding.mostCurrent.__c.runVoidMethod ("Log",(Object)(_j.runMethod(true,"_getstring")));
 BA.debugLineNum = 94;BA.debugLine="If j.GetString.Length == 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_j.runMethod(true,"_getstring").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 95;BA.debugLine="Msgbox(\"Data Not Found\", \"Warning\")";
Debug.ShouldStop(1073741824);
worshipbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Data Not Found")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),worshipbuilding.mostCurrent.activityBA);
 BA.debugLineNum = 96;BA.debugLine="Activity.Finish";
Debug.ShouldStop(-2147483648);
worshipbuilding.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 98;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 99;BA.debugLine="parser.Initialize(j.GetString)";
Debug.ShouldStop(4);
_parser.runVoidMethod ("Initialize",(Object)(_j.runMethod(true,"_getstring")));
 BA.debugLineNum = 100;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(8);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 101;BA.debugLine="Dim features As List = root.Get(\"features\")";
Debug.ShouldStop(16);
_features = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_features.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("features")))));Debug.locals.put("features", _features);
 BA.debugLineNum = 102;BA.debugLine="For Each colfeatures As Map In features";
Debug.ShouldStop(32);
_colfeatures = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group11 = _features;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_colfeatures.setObject(group11.runMethod(false,"Get",index11));
Debug.locals.put("colfeatures", _colfeatures);
 BA.debugLineNum = 104;BA.debugLine="Dim properties As Map = colfeatures.Get(\"proper";
Debug.ShouldStop(128);
_properties = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_properties.setObject(_colfeatures.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("properties")))));Debug.locals.put("properties", _properties);
 BA.debugLineNum = 105;BA.debugLine="Dim nama As String = properties.Get(\"nama\")";
Debug.ShouldStop(256);
_nama = BA.ObjectToString(_properties.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nama")))));Debug.locals.put("nama", _nama);Debug.locals.put("nama", _nama);
 BA.debugLineNum = 106;BA.debugLine="Dim id As String = properties.Get(\"id\")";
Debug.ShouldStop(512);
_id = BA.ObjectToString(_properties.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 107;BA.debugLine="Dim content As String = nama";
Debug.ShouldStop(1024);
_content = _nama;Debug.locals.put("content", _content);Debug.locals.put("content", _content);
 BA.debugLineNum = 109;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, id, cont";
Debug.ShouldStop(4096);
worshipbuilding.mostCurrent._clv2.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(worshipbuilding.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getWidth"),_id,_content).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 110;BA.debugLine="CLV2.AsView.Height = PanelListItem.Height* CLV2";
Debug.ShouldStop(8192);
worshipbuilding.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {worshipbuilding.mostCurrent._panellistitem.runMethod(true,"getHeight"),worshipbuilding.mostCurrent._clv2.runMethod(true,"_getsize")}, "*",0, 1));
 }
}Debug.locals.put("colfeatures", _colfeatures);
;
 BA.debugLineNum = 112;BA.debugLine="Dim Type As String = root.Get(\"type\")";
Debug.ShouldStop(32768);
_type = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));Debug.locals.put("Type", _type);Debug.locals.put("Type", _type);
 BA.debugLineNum = 114;BA.debugLine="ScrollView1.Height = 100%y - WebViewTest.Height";
Debug.ShouldStop(131072);
worshipbuilding.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {worshipbuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),worshipbuilding.mostCurrent.activityBA),worshipbuilding.mostCurrent._webviewtest.runMethod(true,"getHeight"),worshipbuilding.mostCurrent._paneltoolbar.runMethod(true,"getHeight")}, "--",2, 1));
 BA.debugLineNum = 115;BA.debugLine="CLV2.sv.Height = CLV2.AsView.Height";
Debug.ShouldStop(262144);
worshipbuilding.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"setHeight",worshipbuilding.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 116;BA.debugLine="ScrollView1.Panel.Height = CLV2.AsView.Height";
Debug.ShouldStop(524288);
worshipbuilding.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",worshipbuilding.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 117;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1048576);
worshipbuilding.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 };
 }else {
 BA.debugLineNum = 120;BA.debugLine="Log(\"Error\" & j.ErrorMessage)";
Debug.ShouldStop(8388608);
worshipbuilding.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error"),_j.getField(true,"_errormessage"))));
 BA.debugLineNum = 121;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16777216);
worshipbuilding.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 };
 BA.debugLineNum = 123;BA.debugLine="j.Release";
Debug.ShouldStop(67108864);
_j.runVoidMethod ("_release");
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
public static RemoteObject  _panellistitem_click() throws Exception{
try {
		Debug.PushSubsStack("PanelListItem_Click (worshipbuilding) ","worshipbuilding",20,worshipbuilding.mostCurrent.activityBA,worshipbuilding.mostCurrent,130);
if (RapidSub.canDelegate("panellistitem_click")) return b4a.example.worshipbuilding.remoteMe.runUserSub(false, "worshipbuilding","panellistitem_click");
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 130;BA.debugLine="Sub PanelListItem_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="Dim item As Int = CLV2.GetItemFromView(Sender)";
Debug.ShouldStop(4);
_item = worshipbuilding.mostCurrent._clv2.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), worshipbuilding.mostCurrent.__c.runMethod(false,"Sender",worshipbuilding.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 132;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(8);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 133;BA.debugLine="p = CLV2.GetPanel(item)";
Debug.ShouldStop(16);
_p = worshipbuilding.mostCurrent._clv2.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 134;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(32);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 135;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(64);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 137;BA.debugLine="idBuilding = a.GetView(0).GetView(0).Text";
Debug.ShouldStop(256);
worshipbuilding._idbuilding = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"getText");
 BA.debugLineNum = 139;BA.debugLine="nameBuilding = a.GetView(0).GetView(1).Text";
Debug.ShouldStop(1024);
worshipbuilding._namebuilding = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"getText");
 BA.debugLineNum = 140;BA.debugLine="Log(\"NAMA BUILDING: \"&nameBuilding)";
Debug.ShouldStop(2048);
worshipbuilding.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("NAMA BUILDING: "),worshipbuilding._namebuilding)));
 BA.debugLineNum = 141;BA.debugLine="StartActivity(WorshipDetail)";
Debug.ShouldStop(4096);
worshipbuilding.mostCurrent.__c.runVoidMethod ("StartActivity",worshipbuilding.processBA,(Object)((worshipbuilding.mostCurrent._worshipdetail.getObject())));
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
worshipbuilding._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim idBuilding As String";
worshipbuilding._idbuilding = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim nameBuilding As String";
worshipbuilding._namebuilding = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="idBuilding=\"\"";
worshipbuilding._idbuilding = BA.ObjectToString("");
 //BA.debugLineNum = 13;BA.debugLine="nameBuilding=\"\"";
worshipbuilding._namebuilding = BA.ObjectToString("");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}