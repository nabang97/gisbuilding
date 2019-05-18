package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class msmebuilding_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (msmebuilding) ","msmebuilding",19,msmebuilding.mostCurrent.activityBA,msmebuilding.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) return b4a.example.msmebuilding.remoteMe.runUserSub(false, "msmebuilding","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(1);
msmebuilding.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),msmebuilding.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="ScrollView1.Panel.Width=100%y";
Debug.ShouldStop(2);
msmebuilding.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setWidth",msmebuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),msmebuilding.mostCurrent.activityBA));
 BA.debugLineNum = 35;BA.debugLine="ScrollView1.Panel.LoadLayout(\"clvBuildingList\")";
Debug.ShouldStop(4);
msmebuilding.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("clvBuildingList")),msmebuilding.mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="PanelToolbar.Visible = False";
Debug.ShouldStop(8);
msmebuilding.mostCurrent._paneltoolbar.runMethod(true,"setVisible",msmebuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 39;BA.debugLine="BackArrow.Visible= True";
Debug.ShouldStop(64);
msmebuilding.mostCurrent._backarrow.runMethod(true,"setVisible",msmebuilding.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 40;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(128);
msmebuilding.mostCurrent._backarrow.runVoidMethod ("SetBackgroundImageNew",(Object)((msmebuilding.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(msmebuilding.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("back-arrow.png"))).getObject())));
 BA.debugLineNum = 41;BA.debugLine="TitleBar.Text=\"Building List\"";
Debug.ShouldStop(256);
msmebuilding.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("Building List"));
 BA.debugLineNum = 44;BA.debugLine="WebViewTest.Initialize(\"\")";
Debug.ShouldStop(2048);
msmebuilding.mostCurrent._webviewtest.runVoidMethod ("Initialize",msmebuilding.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 45;BA.debugLine="Activity.AddView(WebViewTest,0,6%y,100%x,50%y)";
Debug.ShouldStop(4096);
msmebuilding.mostCurrent._activity.runVoidMethod ("AddView",(Object)((msmebuilding.mostCurrent._webviewtest.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(msmebuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),msmebuilding.mostCurrent.activityBA)),(Object)(msmebuilding.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),msmebuilding.mostCurrent.activityBA)),(Object)(msmebuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),msmebuilding.mostCurrent.activityBA)));
 BA.debugLineNum = 46;BA.debugLine="WebViewTest.LoadURL(Main.Server&\"msme_building.ph";
Debug.ShouldStop(8192);
msmebuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(msmebuilding.mostCurrent._main._server,RemoteObject.createImmutable("msme_building.php"))));
 BA.debugLineNum = 49;BA.debugLine="ScrollView1.Panel.Height = CLV2.sv.Height";
Debug.ShouldStop(65536);
msmebuilding.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",msmebuilding.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"getHeight"));
 BA.debugLineNum = 50;BA.debugLine="ScrollView1.Top = WebViewTest.Height+WebViewTest.";
Debug.ShouldStop(131072);
msmebuilding.mostCurrent._scrollview1.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {msmebuilding.mostCurrent._webviewtest.runMethod(true,"getHeight"),msmebuilding.mostCurrent._webviewtest.runMethod(true,"getTop")}, "+",1, 1));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (msmebuilding) ","msmebuilding",19,msmebuilding.mostCurrent.activityBA,msmebuilding.mostCurrent,73);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.msmebuilding.remoteMe.runUserSub(false, "msmebuilding","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 73;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
public ResumableSub_Activity_Resume(b4a.example.msmebuilding parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.msmebuilding parent;
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (msmebuilding) ","msmebuilding",19,msmebuilding.mostCurrent.activityBA,msmebuilding.mostCurrent,63);
if (RapidSub.canDelegate("activity_resume")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 64;BA.debugLine="CLV2.Clear";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._clv2.runVoidMethod ("_clear");
 BA.debugLineNum = 65;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(1);
_j = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 66;BA.debugLine="j.Initialize(\"\",Me)";
Debug.ShouldStop(2);
_j.runVoidMethod ("_initialize",msmebuilding.processBA,(Object)(BA.ObjectToString("")),(Object)(msmebuilding.getObject()));
 BA.debugLineNum = 67;BA.debugLine="j.Download(Main.Server&\"mobile/dataumkm.php\")";
Debug.ShouldStop(4);
_j.runVoidMethod ("_download",(Object)(RemoteObject.concat(parent.mostCurrent._main._server,RemoteObject.createImmutable("mobile/dataumkm.php"))));
 BA.debugLineNum = 68;BA.debugLine="ProgressDialogShow2(\"Downloading...\",False)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",msmebuilding.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("Downloading...")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 69;BA.debugLine="Wait For (j) JobDone (j As HttpJob)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", msmebuilding.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_j));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 70;BA.debugLine="JobDone(j)";
Debug.ShouldStop(32);
_jobdone(_j);
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("BackArrow_Click (msmebuilding) ","msmebuilding",19,msmebuilding.mostCurrent.activityBA,msmebuilding.mostCurrent,132);
if (RapidSub.canDelegate("backarrow_click")) return b4a.example.msmebuilding.remoteMe.runUserSub(false, "msmebuilding","backarrow_click");
 BA.debugLineNum = 132;BA.debugLine="Sub BackArrow_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
msmebuilding.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("BuildingName_Click (msmebuilding) ","msmebuilding",19,msmebuilding.mostCurrent.activityBA,msmebuilding.mostCurrent,115);
if (RapidSub.canDelegate("buildingname_click")) return b4a.example.msmebuilding.remoteMe.runUserSub(false, "msmebuilding","buildingname_click");
 BA.debugLineNum = 115;BA.debugLine="Sub BuildingName_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("CLV2_ItemClick (msmebuilding) ","msmebuilding",19,msmebuilding.mostCurrent.activityBA,msmebuilding.mostCurrent,77);
if (RapidSub.canDelegate("clv2_itemclick")) return b4a.example.msmebuilding.remoteMe.runUserSub(false, "msmebuilding","clv2_itemclick", _index, _value);
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 77;BA.debugLine="Sub CLV2_ItemClick (Index As Int, Value As Object)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 79;BA.debugLine="idBuilding = Value 'store the value in the proces";
Debug.ShouldStop(16384);
msmebuilding._idbuilding = BA.ObjectToString(_value);
 BA.debugLineNum = 80;BA.debugLine="StartActivity(MsmeDetail)";
Debug.ShouldStop(32768);
msmebuilding.mostCurrent.__c.runVoidMethod ("StartActivity",msmebuilding.processBA,(Object)((msmebuilding.mostCurrent._msmedetail.getObject())));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("CreateItem (msmebuilding) ","msmebuilding",19,msmebuilding.mostCurrent.activityBA,msmebuilding.mostCurrent,54);
if (RapidSub.canDelegate("createitem")) return b4a.example.msmebuilding.remoteMe.runUserSub(false, "msmebuilding","createitem", _width, _title, _content);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Title", _title);
Debug.locals.put("Content", _content);
 BA.debugLineNum = 54;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(4194304);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = msmebuilding._xui.runMethod(false,"CreatePanel",msmebuilding.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 56;BA.debugLine="p.LoadLayout(\"BuildingListTwo\")";
Debug.ShouldStop(8388608);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("BuildingListTwo")),msmebuilding.mostCurrent.activityBA);
 BA.debugLineNum = 57;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, PanelListItem";
Debug.ShouldStop(16777216);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(msmebuilding.mostCurrent._panellistitem.runMethod(true,"getHeight")));
 BA.debugLineNum = 58;BA.debugLine="Num.Text = Title";
Debug.ShouldStop(33554432);
msmebuilding.mostCurrent._num.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 59;BA.debugLine="BuildingName.Text = Content";
Debug.ShouldStop(67108864);
msmebuilding.mostCurrent._buildingname.runMethod(true,"setText",BA.ObjectToCharSequence(_content));
 BA.debugLineNum = 60;BA.debugLine="Return p";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private TitleBar As Label";
msmebuilding.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private BackArrow As Label";
msmebuilding.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ScrollView1 As ScrollView";
msmebuilding.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim WebViewTest As WebView";
msmebuilding.mostCurrent._webviewtest = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private PanelBuildingList As Panel";
msmebuilding.mostCurrent._panelbuildinglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private CLV2 As CustomListView";
msmebuilding.mostCurrent._clv2 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 25;BA.debugLine="Private Num As B4XView";
msmebuilding.mostCurrent._num = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private BuildingName As B4XView";
msmebuilding.mostCurrent._buildingname = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private PanelListItem As Panel";
msmebuilding.mostCurrent._panellistitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private PanelToolbar As Panel";
msmebuilding.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _j) throws Exception{
try {
		Debug.PushSubsStack("JobDone (msmebuilding) ","msmebuilding",19,msmebuilding.mostCurrent.activityBA,msmebuilding.mostCurrent,83);
if (RapidSub.canDelegate("jobdone")) return b4a.example.msmebuilding.remoteMe.runUserSub(false, "msmebuilding","jobdone", _j);
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
 BA.debugLineNum = 83;BA.debugLine="Sub JobDone (j As HttpJob)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="If j.Success Then";
Debug.ShouldStop(524288);
if (_j.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 85;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(1048576);
msmebuilding.mostCurrent.__c.runVoidMethod ("Log",(Object)(_j.runMethod(true,"_getstring")));
 BA.debugLineNum = 86;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2097152);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 87;BA.debugLine="parser.Initialize(j.GetString)";
Debug.ShouldStop(4194304);
_parser.runVoidMethod ("Initialize",(Object)(_j.runMethod(true,"_getstring")));
 BA.debugLineNum = 88;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(8388608);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 89;BA.debugLine="Dim features As List = root.Get(\"features\")";
Debug.ShouldStop(16777216);
_features = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_features.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("features")))));Debug.locals.put("features", _features);
 BA.debugLineNum = 90;BA.debugLine="For Each colfeatures As Map In features";
Debug.ShouldStop(33554432);
_colfeatures = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group7 = _features;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_colfeatures.setObject(group7.runMethod(false,"Get",index7));
Debug.locals.put("colfeatures", _colfeatures);
 BA.debugLineNum = 92;BA.debugLine="Dim properties As Map = colfeatures.Get(\"proper";
Debug.ShouldStop(134217728);
_properties = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_properties.setObject(_colfeatures.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("properties")))));Debug.locals.put("properties", _properties);
 BA.debugLineNum = 93;BA.debugLine="Dim nama As String = properties.Get(\"nama\")";
Debug.ShouldStop(268435456);
_nama = BA.ObjectToString(_properties.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nama")))));Debug.locals.put("nama", _nama);Debug.locals.put("nama", _nama);
 BA.debugLineNum = 94;BA.debugLine="Dim id As String = properties.Get(\"id\")";
Debug.ShouldStop(536870912);
_id = BA.ObjectToString(_properties.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 95;BA.debugLine="Dim content As String = nama";
Debug.ShouldStop(1073741824);
_content = _nama;Debug.locals.put("content", _content);Debug.locals.put("content", _content);
 BA.debugLineNum = 98;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, id, cont";
Debug.ShouldStop(2);
msmebuilding.mostCurrent._clv2.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(msmebuilding.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getWidth"),_id,_content).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 99;BA.debugLine="CLV2.AsView.Height = PanelListItem.Height* CLV2";
Debug.ShouldStop(4);
msmebuilding.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {msmebuilding.mostCurrent._panellistitem.runMethod(true,"getHeight"),msmebuilding.mostCurrent._clv2.runMethod(true,"_getsize")}, "*",0, 1));
 }
}Debug.locals.put("colfeatures", _colfeatures);
;
 BA.debugLineNum = 101;BA.debugLine="Dim Type As String = root.Get(\"type\")";
Debug.ShouldStop(16);
_type = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));Debug.locals.put("Type", _type);Debug.locals.put("Type", _type);
 BA.debugLineNum = 102;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32);
msmebuilding.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 }else {
 BA.debugLineNum = 104;BA.debugLine="Log(\"Error\" & j.ErrorMessage)";
Debug.ShouldStop(128);
msmebuilding.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error"),_j.getField(true,"_errormessage"))));
 BA.debugLineNum = 105;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(256);
msmebuilding.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 };
 BA.debugLineNum = 107;BA.debugLine="j.Release";
Debug.ShouldStop(1024);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 110;BA.debugLine="ScrollView1.Height = 100%y - WebViewTest.Height -";
Debug.ShouldStop(8192);
msmebuilding.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {msmebuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),msmebuilding.mostCurrent.activityBA),msmebuilding.mostCurrent._webviewtest.runMethod(true,"getHeight"),msmebuilding.mostCurrent._paneltoolbar.runMethod(true,"getHeight")}, "--",2, 1));
 BA.debugLineNum = 111;BA.debugLine="CLV2.sv.Height = CLV2.AsView.Height";
Debug.ShouldStop(16384);
msmebuilding.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"setHeight",msmebuilding.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 112;BA.debugLine="ScrollView1.Panel.Height = CLV2.AsView.Height";
Debug.ShouldStop(32768);
msmebuilding.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",msmebuilding.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getHeight"));
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
public static RemoteObject  _panellistitem_click() throws Exception{
try {
		Debug.PushSubsStack("PanelListItem_Click (msmebuilding) ","msmebuilding",19,msmebuilding.mostCurrent.activityBA,msmebuilding.mostCurrent,119);
if (RapidSub.canDelegate("panellistitem_click")) return b4a.example.msmebuilding.remoteMe.runUserSub(false, "msmebuilding","panellistitem_click");
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 119;BA.debugLine="Sub PanelListItem_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="Dim item As Int = CLV2.GetItemFromView(Sender)";
Debug.ShouldStop(8388608);
_item = msmebuilding.mostCurrent._clv2.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), msmebuilding.mostCurrent.__c.runMethod(false,"Sender",msmebuilding.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 121;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(16777216);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 122;BA.debugLine="p = CLV2.GetPanel(item)";
Debug.ShouldStop(33554432);
_p = msmebuilding.mostCurrent._clv2.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 123;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(67108864);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 124;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(134217728);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 126;BA.debugLine="idBuilding = a.GetView(0).GetView(0).Text";
Debug.ShouldStop(536870912);
msmebuilding._idbuilding = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"getText");
 BA.debugLineNum = 128;BA.debugLine="nameBuilding = a.GetView(0).GetView(1).Text";
Debug.ShouldStop(-2147483648);
msmebuilding._namebuilding = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"getText");
 BA.debugLineNum = 129;BA.debugLine="StartActivity(MsmeDetail)";
Debug.ShouldStop(1);
msmebuilding.mostCurrent.__c.runVoidMethod ("StartActivity",msmebuilding.processBA,(Object)((msmebuilding.mostCurrent._msmedetail.getObject())));
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
msmebuilding._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim idBuilding As String";
msmebuilding._idbuilding = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim nameBuilding As String";
msmebuilding._namebuilding = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="idBuilding=\"\"";
msmebuilding._idbuilding = BA.ObjectToString("");
 //BA.debugLineNum = 13;BA.debugLine="nameBuilding=\"\"";
msmebuilding._namebuilding = BA.ObjectToString("");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}