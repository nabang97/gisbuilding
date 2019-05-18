package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class educationalbuilding_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (educationalbuilding) ","educationalbuilding",34,educationalbuilding.mostCurrent.activityBA,educationalbuilding.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) return b4a.example.educationalbuilding.remoteMe.runUserSub(false, "educationalbuilding","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(1);
educationalbuilding.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),educationalbuilding.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="ScrollView1.Panel.Width=100%y";
Debug.ShouldStop(2);
educationalbuilding.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setWidth",educationalbuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),educationalbuilding.mostCurrent.activityBA));
 BA.debugLineNum = 35;BA.debugLine="ScrollView1.Panel.LoadLayout(\"clvBuildingList\")";
Debug.ShouldStop(4);
educationalbuilding.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("clvBuildingList")),educationalbuilding.mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="PanelToolbar.Visible = False";
Debug.ShouldStop(8);
educationalbuilding.mostCurrent._paneltoolbar.runMethod(true,"setVisible",educationalbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 39;BA.debugLine="BackArrow.Visible= True";
Debug.ShouldStop(64);
educationalbuilding.mostCurrent._backarrow.runMethod(true,"setVisible",educationalbuilding.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 40;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(128);
educationalbuilding.mostCurrent._backarrow.runVoidMethod ("SetBackgroundImageNew",(Object)((educationalbuilding.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(educationalbuilding.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("back-arrow.png"))).getObject())));
 BA.debugLineNum = 41;BA.debugLine="TitleBar.Text=\"Building List\"";
Debug.ShouldStop(256);
educationalbuilding.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("Building List"));
 BA.debugLineNum = 44;BA.debugLine="WebViewTest.Initialize(\"\")";
Debug.ShouldStop(2048);
educationalbuilding.mostCurrent._webviewtest.runVoidMethod ("Initialize",educationalbuilding.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 45;BA.debugLine="Activity.AddView(WebViewTest,0,6%y,100%x,50%y)";
Debug.ShouldStop(4096);
educationalbuilding.mostCurrent._activity.runVoidMethod ("AddView",(Object)((educationalbuilding.mostCurrent._webviewtest.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(educationalbuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),educationalbuilding.mostCurrent.activityBA)),(Object)(educationalbuilding.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),educationalbuilding.mostCurrent.activityBA)),(Object)(educationalbuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),educationalbuilding.mostCurrent.activityBA)));
 BA.debugLineNum = 46;BA.debugLine="WebViewTest.LoadURL(Main.Server&\"educational_buil";
Debug.ShouldStop(8192);
educationalbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(educationalbuilding.mostCurrent._main._server,RemoteObject.createImmutable("educational_building.php"))));
 BA.debugLineNum = 49;BA.debugLine="ScrollView1.Panel.Height = CLV2.sv.Height";
Debug.ShouldStop(65536);
educationalbuilding.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",educationalbuilding.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"getHeight"));
 BA.debugLineNum = 50;BA.debugLine="ScrollView1.Top = WebViewTest.Height+WebViewTest.";
Debug.ShouldStop(131072);
educationalbuilding.mostCurrent._scrollview1.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {educationalbuilding.mostCurrent._webviewtest.runMethod(true,"getHeight"),educationalbuilding.mostCurrent._webviewtest.runMethod(true,"getTop")}, "+",1, 1));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (educationalbuilding) ","educationalbuilding",34,educationalbuilding.mostCurrent.activityBA,educationalbuilding.mostCurrent,64);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.educationalbuilding.remoteMe.runUserSub(false, "educationalbuilding","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 64;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
public ResumableSub_Activity_Resume(b4a.example.educationalbuilding parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.educationalbuilding parent;
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (educationalbuilding) ","educationalbuilding",34,educationalbuilding.mostCurrent.activityBA,educationalbuilding.mostCurrent,54);
if (RapidSub.canDelegate("activity_resume")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 55;BA.debugLine="CLV2.Clear";
Debug.ShouldStop(4194304);
parent.mostCurrent._clv2.runVoidMethod ("_clear");
 BA.debugLineNum = 56;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(8388608);
_j = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 57;BA.debugLine="j.Initialize(\"\",Me)";
Debug.ShouldStop(16777216);
_j.runVoidMethod ("_initialize",educationalbuilding.processBA,(Object)(BA.ObjectToString("")),(Object)(educationalbuilding.getObject()));
 BA.debugLineNum = 58;BA.debugLine="j.Download(Main.Server&\"mobile/datapendidikan.php";
Debug.ShouldStop(33554432);
_j.runVoidMethod ("_download",(Object)(RemoteObject.concat(parent.mostCurrent._main._server,RemoteObject.createImmutable("mobile/datapendidikan.php"))));
 BA.debugLineNum = 60;BA.debugLine="Wait For (j) JobDone (j As HttpJob)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", educationalbuilding.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_j));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 61;BA.debugLine="JobDone(j)";
Debug.ShouldStop(268435456);
_jobdone(_j);
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("BackArrow_Click (educationalbuilding) ","educationalbuilding",34,educationalbuilding.mostCurrent.activityBA,educationalbuilding.mostCurrent,130);
if (RapidSub.canDelegate("backarrow_click")) return b4a.example.educationalbuilding.remoteMe.runUserSub(false, "educationalbuilding","backarrow_click");
 BA.debugLineNum = 130;BA.debugLine="Sub BackArrow_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4);
educationalbuilding.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 132;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("BuildingName_Click (educationalbuilding) ","educationalbuilding",34,educationalbuilding.mostCurrent.activityBA,educationalbuilding.mostCurrent,112);
if (RapidSub.canDelegate("buildingname_click")) return b4a.example.educationalbuilding.remoteMe.runUserSub(false, "educationalbuilding","buildingname_click");
 BA.debugLineNum = 112;BA.debugLine="Sub BuildingName_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("CLV2_ItemClick (educationalbuilding) ","educationalbuilding",34,educationalbuilding.mostCurrent.activityBA,educationalbuilding.mostCurrent,76);
if (RapidSub.canDelegate("clv2_itemclick")) return b4a.example.educationalbuilding.remoteMe.runUserSub(false, "educationalbuilding","clv2_itemclick", _index, _value);
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 76;BA.debugLine="Sub CLV2_ItemClick (Index As Int, Value As Object)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 78;BA.debugLine="idBuilding = Value 'store the value in the proces";
Debug.ShouldStop(8192);
educationalbuilding._idbuilding = BA.ObjectToString(_value);
 BA.debugLineNum = 79;BA.debugLine="StartActivity(EducationalDetail)";
Debug.ShouldStop(16384);
educationalbuilding.mostCurrent.__c.runVoidMethod ("StartActivity",educationalbuilding.processBA,(Object)((educationalbuilding.mostCurrent._educationaldetail.getObject())));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("CreateItem (educationalbuilding) ","educationalbuilding",34,educationalbuilding.mostCurrent.activityBA,educationalbuilding.mostCurrent,67);
if (RapidSub.canDelegate("createitem")) return b4a.example.educationalbuilding.remoteMe.runUserSub(false, "educationalbuilding","createitem", _width, _title, _content);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Title", _title);
Debug.locals.put("Content", _content);
 BA.debugLineNum = 67;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(8);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = educationalbuilding._xui.runMethod(false,"CreatePanel",educationalbuilding.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 69;BA.debugLine="p.LoadLayout(\"BuildingListTwo\")";
Debug.ShouldStop(16);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("BuildingListTwo")),educationalbuilding.mostCurrent.activityBA);
 BA.debugLineNum = 70;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, PanelListItem";
Debug.ShouldStop(32);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(educationalbuilding.mostCurrent._panellistitem.runMethod(true,"getHeight")));
 BA.debugLineNum = 71;BA.debugLine="Num.Text = Title";
Debug.ShouldStop(64);
educationalbuilding.mostCurrent._num.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 72;BA.debugLine="BuildingName.Text = Content";
Debug.ShouldStop(128);
educationalbuilding.mostCurrent._buildingname.runMethod(true,"setText",BA.ObjectToCharSequence(_content));
 BA.debugLineNum = 73;BA.debugLine="Return p";
Debug.ShouldStop(256);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
educationalbuilding.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private BackArrow As Label";
educationalbuilding.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ScrollView1 As ScrollView";
educationalbuilding.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim WebViewTest As WebView";
educationalbuilding.mostCurrent._webviewtest = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private PanelBuildingList As Panel";
educationalbuilding.mostCurrent._panelbuildinglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private CLV2 As CustomListView";
educationalbuilding.mostCurrent._clv2 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 25;BA.debugLine="Private Num As B4XView";
educationalbuilding.mostCurrent._num = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private BuildingName As B4XView";
educationalbuilding.mostCurrent._buildingname = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private PanelListItem As Panel";
educationalbuilding.mostCurrent._panellistitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private PanelToolbar As Panel";
educationalbuilding.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _j) throws Exception{
try {
		Debug.PushSubsStack("JobDone (educationalbuilding) ","educationalbuilding",34,educationalbuilding.mostCurrent.activityBA,educationalbuilding.mostCurrent,82);
if (RapidSub.canDelegate("jobdone")) return b4a.example.educationalbuilding.remoteMe.runUserSub(false, "educationalbuilding","jobdone", _j);
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
 BA.debugLineNum = 82;BA.debugLine="Sub JobDone (j As HttpJob)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="If j.Success Then";
Debug.ShouldStop(262144);
if (_j.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 84;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(524288);
educationalbuilding.mostCurrent.__c.runVoidMethod ("Log",(Object)(_j.runMethod(true,"_getstring")));
 BA.debugLineNum = 85;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1048576);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 86;BA.debugLine="parser.Initialize(j.GetString)";
Debug.ShouldStop(2097152);
_parser.runVoidMethod ("Initialize",(Object)(_j.runMethod(true,"_getstring")));
 BA.debugLineNum = 87;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(4194304);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 88;BA.debugLine="Dim features As List = root.Get(\"features\")";
Debug.ShouldStop(8388608);
_features = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_features.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("features")))));Debug.locals.put("features", _features);
 BA.debugLineNum = 89;BA.debugLine="For Each colfeatures As Map In features";
Debug.ShouldStop(16777216);
_colfeatures = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group7 = _features;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_colfeatures.setObject(group7.runMethod(false,"Get",index7));
Debug.locals.put("colfeatures", _colfeatures);
 BA.debugLineNum = 91;BA.debugLine="Dim properties As Map = colfeatures.Get(\"proper";
Debug.ShouldStop(67108864);
_properties = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_properties.setObject(_colfeatures.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("properties")))));Debug.locals.put("properties", _properties);
 BA.debugLineNum = 92;BA.debugLine="Dim nama As String = properties.Get(\"nama\")";
Debug.ShouldStop(134217728);
_nama = BA.ObjectToString(_properties.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nama")))));Debug.locals.put("nama", _nama);Debug.locals.put("nama", _nama);
 BA.debugLineNum = 93;BA.debugLine="Dim id As String = properties.Get(\"id\")";
Debug.ShouldStop(268435456);
_id = BA.ObjectToString(_properties.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 94;BA.debugLine="Dim content As String = nama";
Debug.ShouldStop(536870912);
_content = _nama;Debug.locals.put("content", _content);Debug.locals.put("content", _content);
 BA.debugLineNum = 97;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, id, cont";
Debug.ShouldStop(1);
educationalbuilding.mostCurrent._clv2.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(educationalbuilding.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getWidth"),_id,_content).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 98;BA.debugLine="CLV2.AsView.Height = PanelListItem.Height* CLV2";
Debug.ShouldStop(2);
educationalbuilding.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {educationalbuilding.mostCurrent._panellistitem.runMethod(true,"getHeight"),educationalbuilding.mostCurrent._clv2.runMethod(true,"_getsize")}, "*",0, 1));
 }
}Debug.locals.put("colfeatures", _colfeatures);
;
 BA.debugLineNum = 100;BA.debugLine="Dim Type As String = root.Get(\"type\")";
Debug.ShouldStop(8);
_type = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));Debug.locals.put("Type", _type);Debug.locals.put("Type", _type);
 }else {
 BA.debugLineNum = 102;BA.debugLine="Log(\"Error\" & j.ErrorMessage)";
Debug.ShouldStop(32);
educationalbuilding.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error"),_j.getField(true,"_errormessage"))));
 BA.debugLineNum = 103;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(64);
educationalbuilding.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 };
 BA.debugLineNum = 105;BA.debugLine="j.Release";
Debug.ShouldStop(256);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 108;BA.debugLine="ScrollView1.Height = 100%y - WebViewTest.Height -";
Debug.ShouldStop(2048);
educationalbuilding.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {educationalbuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),educationalbuilding.mostCurrent.activityBA),educationalbuilding.mostCurrent._webviewtest.runMethod(true,"getHeight"),educationalbuilding.mostCurrent._paneltoolbar.runMethod(true,"getHeight")}, "--",2, 1));
 BA.debugLineNum = 109;BA.debugLine="CLV2.sv.Height = CLV2.AsView.Height";
Debug.ShouldStop(4096);
educationalbuilding.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"setHeight",educationalbuilding.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 110;BA.debugLine="ScrollView1.Panel.Height = CLV2.AsView.Height";
Debug.ShouldStop(8192);
educationalbuilding.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",educationalbuilding.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getHeight"));
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
public static RemoteObject  _panellistitem_click() throws Exception{
try {
		Debug.PushSubsStack("PanelListItem_Click (educationalbuilding) ","educationalbuilding",34,educationalbuilding.mostCurrent.activityBA,educationalbuilding.mostCurrent,116);
if (RapidSub.canDelegate("panellistitem_click")) return b4a.example.educationalbuilding.remoteMe.runUserSub(false, "educationalbuilding","panellistitem_click");
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 116;BA.debugLine="Sub PanelListItem_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="Dim item As Int = CLV2.GetItemFromView(Sender)";
Debug.ShouldStop(1048576);
_item = educationalbuilding.mostCurrent._clv2.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), educationalbuilding.mostCurrent.__c.runMethod(false,"Sender",educationalbuilding.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 118;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(2097152);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 119;BA.debugLine="p = CLV2.GetPanel(item)";
Debug.ShouldStop(4194304);
_p = educationalbuilding.mostCurrent._clv2.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 120;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(8388608);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 121;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(16777216);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 123;BA.debugLine="idBuilding = a.GetView(0).GetView(0).Text";
Debug.ShouldStop(67108864);
educationalbuilding._idbuilding = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"getText");
 BA.debugLineNum = 125;BA.debugLine="nameBuilding = a.GetView(0).GetView(1).Text";
Debug.ShouldStop(268435456);
educationalbuilding._namebuilding = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"getText");
 BA.debugLineNum = 126;BA.debugLine="StartActivity(EducationalDetail)";
Debug.ShouldStop(536870912);
educationalbuilding.mostCurrent.__c.runVoidMethod ("StartActivity",educationalbuilding.processBA,(Object)((educationalbuilding.mostCurrent._educationaldetail.getObject())));
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
educationalbuilding._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim idBuilding As String";
educationalbuilding._idbuilding = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim nameBuilding As String";
educationalbuilding._namebuilding = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="idBuilding=\"\"";
educationalbuilding._idbuilding = BA.ObjectToString("");
 //BA.debugLineNum = 13;BA.debugLine="nameBuilding=\"\"";
educationalbuilding._namebuilding = BA.ObjectToString("");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}