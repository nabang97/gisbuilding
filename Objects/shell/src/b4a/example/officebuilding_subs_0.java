package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class officebuilding_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (officebuilding) ","officebuilding",33,officebuilding.mostCurrent.activityBA,officebuilding.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) return b4a.example.officebuilding.remoteMe.runUserSub(false, "officebuilding","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(1);
officebuilding.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),officebuilding.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="ScrollView1.Panel.Width=100%y";
Debug.ShouldStop(2);
officebuilding.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setWidth",officebuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),officebuilding.mostCurrent.activityBA));
 BA.debugLineNum = 35;BA.debugLine="ScrollView1.Panel.LoadLayout(\"clvBuildingList\")";
Debug.ShouldStop(4);
officebuilding.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("clvBuildingList")),officebuilding.mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="PanelToolbar.Visible = False";
Debug.ShouldStop(8);
officebuilding.mostCurrent._paneltoolbar.runMethod(true,"setVisible",officebuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 39;BA.debugLine="BackArrow.Visible= True";
Debug.ShouldStop(64);
officebuilding.mostCurrent._backarrow.runMethod(true,"setVisible",officebuilding.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 40;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(128);
officebuilding.mostCurrent._backarrow.runVoidMethod ("SetBackgroundImageNew",(Object)((officebuilding.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(officebuilding.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("back-arrow.png"))).getObject())));
 BA.debugLineNum = 41;BA.debugLine="TitleBar.Text=\"Building List\"";
Debug.ShouldStop(256);
officebuilding.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("Building List"));
 BA.debugLineNum = 44;BA.debugLine="WebViewTest.Initialize(\"\")";
Debug.ShouldStop(2048);
officebuilding.mostCurrent._webviewtest.runVoidMethod ("Initialize",officebuilding.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 45;BA.debugLine="Activity.AddView(WebViewTest,0,6%y,100%x,50%y)";
Debug.ShouldStop(4096);
officebuilding.mostCurrent._activity.runVoidMethod ("AddView",(Object)((officebuilding.mostCurrent._webviewtest.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(officebuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),officebuilding.mostCurrent.activityBA)),(Object)(officebuilding.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),officebuilding.mostCurrent.activityBA)),(Object)(officebuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),officebuilding.mostCurrent.activityBA)));
 BA.debugLineNum = 46;BA.debugLine="WebViewTest.LoadURL(Main.Server&\"office_building.";
Debug.ShouldStop(8192);
officebuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(officebuilding.mostCurrent._main._server,RemoteObject.createImmutable("office_building.php"))));
 BA.debugLineNum = 49;BA.debugLine="ScrollView1.Panel.Height = CLV2.sv.Height";
Debug.ShouldStop(65536);
officebuilding.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",officebuilding.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"getHeight"));
 BA.debugLineNum = 50;BA.debugLine="ScrollView1.Top = WebViewTest.Height+WebViewTest.";
Debug.ShouldStop(131072);
officebuilding.mostCurrent._scrollview1.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {officebuilding.mostCurrent._webviewtest.runMethod(true,"getHeight"),officebuilding.mostCurrent._webviewtest.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 55;BA.debugLine="ScrollView1.Height = 100%y - WebViewTest.Height -";
Debug.ShouldStop(4194304);
officebuilding.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {officebuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),officebuilding.mostCurrent.activityBA),officebuilding.mostCurrent._webviewtest.runMethod(true,"getHeight"),officebuilding.mostCurrent._paneltoolbar.runMethod(true,"getHeight")}, "--",2, 1));
 BA.debugLineNum = 56;BA.debugLine="CLV2.sv.Height = CLV2.AsView.Height";
Debug.ShouldStop(8388608);
officebuilding.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"setHeight",officebuilding.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 57;BA.debugLine="ScrollView1.Panel.Height = CLV2.AsView.Height";
Debug.ShouldStop(16777216);
officebuilding.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",officebuilding.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Activity_Pause (officebuilding) ","officebuilding",33,officebuilding.mostCurrent.activityBA,officebuilding.mostCurrent,81);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.officebuilding.remoteMe.runUserSub(false, "officebuilding","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 81;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(65536);
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
public static void  _activity_resume() throws Exception{
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(null, null);
}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(b4a.example.officebuilding parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.officebuilding parent;
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (officebuilding) ","officebuilding",33,officebuilding.mostCurrent.activityBA,officebuilding.mostCurrent,71);
if (RapidSub.canDelegate("activity_resume")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 72;BA.debugLine="CLV2.Clear";
Debug.ShouldStop(128);
parent.mostCurrent._clv2.runVoidMethod ("_clear");
 BA.debugLineNum = 73;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(256);
_j = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 74;BA.debugLine="j.Initialize(\"\",Me)";
Debug.ShouldStop(512);
_j.runVoidMethod ("_initialize",officebuilding.processBA,(Object)(BA.ObjectToString("")),(Object)(officebuilding.getObject()));
 BA.debugLineNum = 75;BA.debugLine="j.Download(Main.Server&\"mobile/datakantor.php\")";
Debug.ShouldStop(1024);
_j.runVoidMethod ("_download",(Object)(RemoteObject.concat(parent.mostCurrent._main._server,RemoteObject.createImmutable("mobile/datakantor.php"))));
 BA.debugLineNum = 76;BA.debugLine="ProgressDialogShow2(\"Downloading...\",False)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",officebuilding.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("Downloading...")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 77;BA.debugLine="Wait For (j) JobDone (j As HttpJob)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", officebuilding.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_j));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 78;BA.debugLine="JobDone(j)";
Debug.ShouldStop(8192);
_jobdone(_j);
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("BackArrow_Click (officebuilding) ","officebuilding",33,officebuilding.mostCurrent.activityBA,officebuilding.mostCurrent,141);
if (RapidSub.canDelegate("backarrow_click")) return b4a.example.officebuilding.remoteMe.runUserSub(false, "officebuilding","backarrow_click");
 BA.debugLineNum = 141;BA.debugLine="Sub BackArrow_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
officebuilding.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("BuildingName_Click (officebuilding) ","officebuilding",33,officebuilding.mostCurrent.activityBA,officebuilding.mostCurrent,125);
if (RapidSub.canDelegate("buildingname_click")) return b4a.example.officebuilding.remoteMe.runUserSub(false, "officebuilding","buildingname_click");
 BA.debugLineNum = 125;BA.debugLine="Sub BuildingName_Click";
Debug.ShouldStop(268435456);
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
public static RemoteObject  _clv2_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLV2_ItemClick (officebuilding) ","officebuilding",33,officebuilding.mostCurrent.activityBA,officebuilding.mostCurrent,86);
if (RapidSub.canDelegate("clv2_itemclick")) return b4a.example.officebuilding.remoteMe.runUserSub(false, "officebuilding","clv2_itemclick", _index, _value);
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 86;BA.debugLine="Sub CLV2_ItemClick (Index As Int, Value As Object)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 88;BA.debugLine="idBuilding = Value 'store the value in the proces";
Debug.ShouldStop(8388608);
officebuilding._idbuilding = BA.ObjectToString(_value);
 BA.debugLineNum = 89;BA.debugLine="StartActivity(OfficeDetail)";
Debug.ShouldStop(16777216);
officebuilding.mostCurrent.__c.runVoidMethod ("StartActivity",officebuilding.processBA,(Object)((officebuilding.mostCurrent._officedetail.getObject())));
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
public static RemoteObject  _createitem(RemoteObject _width,RemoteObject _title,RemoteObject _content) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (officebuilding) ","officebuilding",33,officebuilding.mostCurrent.activityBA,officebuilding.mostCurrent,62);
if (RapidSub.canDelegate("createitem")) return b4a.example.officebuilding.remoteMe.runUserSub(false, "officebuilding","createitem", _width, _title, _content);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Title", _title);
Debug.locals.put("Content", _content);
 BA.debugLineNum = 62;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(1073741824);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = officebuilding._xui.runMethod(false,"CreatePanel",officebuilding.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 64;BA.debugLine="p.LoadLayout(\"BuildingListTwo\")";
Debug.ShouldStop(-2147483648);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("BuildingListTwo")),officebuilding.mostCurrent.activityBA);
 BA.debugLineNum = 65;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, PanelListItem";
Debug.ShouldStop(1);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(officebuilding.mostCurrent._panellistitem.runMethod(true,"getHeight")));
 BA.debugLineNum = 66;BA.debugLine="Num.Text = Title";
Debug.ShouldStop(2);
officebuilding.mostCurrent._num.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 67;BA.debugLine="Buildingname.Text = Content";
Debug.ShouldStop(4);
officebuilding.mostCurrent._buildingname.runMethod(true,"setText",BA.ObjectToCharSequence(_content));
 BA.debugLineNum = 68;BA.debugLine="Return p";
Debug.ShouldStop(8);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
officebuilding.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private BackArrow As Label";
officebuilding.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ScrollView1 As ScrollView";
officebuilding.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim WebViewTest As WebView";
officebuilding.mostCurrent._webviewtest = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private PanelBuildingList As Panel";
officebuilding.mostCurrent._panelbuildinglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private CLV2 As CustomListView";
officebuilding.mostCurrent._clv2 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 25;BA.debugLine="Private Num As B4XView";
officebuilding.mostCurrent._num = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Buildingname As B4XView";
officebuilding.mostCurrent._buildingname = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private PanelListItem As B4XView";
officebuilding.mostCurrent._panellistitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private PanelToolbar As Panel";
officebuilding.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _j) throws Exception{
try {
		Debug.PushSubsStack("JobDone (officebuilding) ","officebuilding",33,officebuilding.mostCurrent.activityBA,officebuilding.mostCurrent,92);
if (RapidSub.canDelegate("jobdone")) return b4a.example.officebuilding.remoteMe.runUserSub(false, "officebuilding","jobdone", _j);
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _features = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colfeatures = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jenis = RemoteObject.createImmutable("");
RemoteObject _geometry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _properties = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nama = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _content = RemoteObject.createImmutable("");
RemoteObject _type = RemoteObject.createImmutable("");
Debug.locals.put("j", _j);
 BA.debugLineNum = 92;BA.debugLine="Sub JobDone (j As HttpJob)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="If j.Success Then";
Debug.ShouldStop(268435456);
if (_j.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 94;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(536870912);
officebuilding.mostCurrent.__c.runVoidMethod ("Log",(Object)(_j.runMethod(true,"_getstring")));
 BA.debugLineNum = 95;BA.debugLine="If j.GetString.Length == 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_j.runMethod(true,"_getstring").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 96;BA.debugLine="Msgbox(\"Data Not Found\", \"Warning\")";
Debug.ShouldStop(-2147483648);
officebuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Data Not Found")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),officebuilding.mostCurrent.activityBA);
 BA.debugLineNum = 97;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1);
officebuilding.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 99;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(4);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 100;BA.debugLine="parser.Initialize(j.GetString)";
Debug.ShouldStop(8);
_parser.runVoidMethod ("Initialize",(Object)(_j.runMethod(true,"_getstring")));
 BA.debugLineNum = 101;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(16);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 102;BA.debugLine="Dim features As List = root.Get(\"features\")";
Debug.ShouldStop(32);
_features = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_features.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("features")))));Debug.locals.put("features", _features);
 BA.debugLineNum = 103;BA.debugLine="For Each colfeatures As Map In features";
Debug.ShouldStop(64);
_colfeatures = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group11 = _features;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_colfeatures.setObject(group11.runMethod(false,"Get",index11));
Debug.locals.put("colfeatures", _colfeatures);
 BA.debugLineNum = 104;BA.debugLine="Dim jenis As String = colfeatures.Get(\"jenis\")";
Debug.ShouldStop(128);
_jenis = BA.ObjectToString(_colfeatures.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("jenis")))));Debug.locals.put("jenis", _jenis);Debug.locals.put("jenis", _jenis);
 BA.debugLineNum = 105;BA.debugLine="Dim geometry As Map = colfeatures.Get(\"geometr";
Debug.ShouldStop(256);
_geometry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_geometry.setObject(_colfeatures.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("geometry")))));Debug.locals.put("geometry", _geometry);
 BA.debugLineNum = 106;BA.debugLine="Dim properties As Map = colfeatures.Get(\"prope";
Debug.ShouldStop(512);
_properties = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_properties.setObject(_colfeatures.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("properties")))));Debug.locals.put("properties", _properties);
 BA.debugLineNum = 107;BA.debugLine="Dim nama As String = properties.Get(\"nama\")";
Debug.ShouldStop(1024);
_nama = BA.ObjectToString(_properties.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nama")))));Debug.locals.put("nama", _nama);Debug.locals.put("nama", _nama);
 BA.debugLineNum = 108;BA.debugLine="Dim id As String = properties.Get(\"id\")";
Debug.ShouldStop(2048);
_id = BA.ObjectToString(_properties.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 109;BA.debugLine="Dim content As String = nama";
Debug.ShouldStop(4096);
_content = _nama;Debug.locals.put("content", _content);Debug.locals.put("content", _content);
 BA.debugLineNum = 112;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, id, con";
Debug.ShouldStop(32768);
officebuilding.mostCurrent._clv2.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(officebuilding.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getWidth"),_id,_content).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 113;BA.debugLine="CLV2.AsView.Height = PanelListItem.Height* CLV";
Debug.ShouldStop(65536);
officebuilding.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {officebuilding.mostCurrent._panellistitem.runMethod(true,"getHeight"),officebuilding.mostCurrent._clv2.runMethod(true,"_getsize")}, "*",0, 1));
 }
}Debug.locals.put("colfeatures", _colfeatures);
;
 BA.debugLineNum = 115;BA.debugLine="Dim Type As String = root.Get(\"type\")";
Debug.ShouldStop(262144);
_type = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));Debug.locals.put("Type", _type);Debug.locals.put("Type", _type);
 BA.debugLineNum = 116;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(524288);
officebuilding.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 };
 }else {
 BA.debugLineNum = 119;BA.debugLine="Log(\"Error\" & j.ErrorMessage)";
Debug.ShouldStop(4194304);
officebuilding.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error"),_j.getField(true,"_errormessage"))));
 BA.debugLineNum = 120;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8388608);
officebuilding.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 };
 BA.debugLineNum = 122;BA.debugLine="j.Release";
Debug.ShouldStop(33554432);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("PanelListItem_Click (officebuilding) ","officebuilding",33,officebuilding.mostCurrent.activityBA,officebuilding.mostCurrent,129);
if (RapidSub.canDelegate("panellistitem_click")) return b4a.example.officebuilding.remoteMe.runUserSub(false, "officebuilding","panellistitem_click");
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 129;BA.debugLine="Sub PanelListItem_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="Dim item As Int = CLV2.GetItemFromView(Sender)";
Debug.ShouldStop(2);
_item = officebuilding.mostCurrent._clv2.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), officebuilding.mostCurrent.__c.runMethod(false,"Sender",officebuilding.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 131;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(4);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 132;BA.debugLine="p = CLV2.GetPanel(item)";
Debug.ShouldStop(8);
_p = officebuilding.mostCurrent._clv2.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 133;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(16);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 134;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(32);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 136;BA.debugLine="idBuilding = a.GetView(0).GetView(0).Text";
Debug.ShouldStop(128);
officebuilding._idbuilding = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"getText");
 BA.debugLineNum = 138;BA.debugLine="nameBuilding = a.GetView(0).GetView(1).Text";
Debug.ShouldStop(512);
officebuilding._namebuilding = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"getText");
 BA.debugLineNum = 139;BA.debugLine="StartActivity(OfficeDetail)";
Debug.ShouldStop(1024);
officebuilding.mostCurrent.__c.runVoidMethod ("StartActivity",officebuilding.processBA,(Object)((officebuilding.mostCurrent._officedetail.getObject())));
 BA.debugLineNum = 140;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
officebuilding._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim idBuilding As String";
officebuilding._idbuilding = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim nameBuilding As String";
officebuilding._namebuilding = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="idBuilding=\"\"";
officebuilding._idbuilding = BA.ObjectToString("");
 //BA.debugLineNum = 13;BA.debugLine="nameBuilding=\"\"";
officebuilding._namebuilding = BA.ObjectToString("");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}