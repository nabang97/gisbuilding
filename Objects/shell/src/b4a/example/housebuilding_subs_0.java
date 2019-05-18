package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class housebuilding_subs_0 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(null, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(b4a.example.housebuilding parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.housebuilding parent;
RemoteObject _firsttime;
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _features = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colfeatures = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _properties = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nama = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _content = RemoteObject.createImmutable("");
RemoteObject _type = RemoteObject.createImmutable("");
RemoteObject group24;
int index24;
int groupLen24;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (housebuilding) ","housebuilding",29,housebuilding.mostCurrent.activityBA,housebuilding.mostCurrent,34);
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
 BA.debugLineNum = 36;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(8);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),housebuilding.mostCurrent.activityBA);
 BA.debugLineNum = 37;BA.debugLine="ScrollView1.Panel.Width=100%y";
Debug.ShouldStop(16);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setWidth",parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),housebuilding.mostCurrent.activityBA));
 BA.debugLineNum = 38;BA.debugLine="ScrollView1.Panel.LoadLayout(\"clvBuildingList\")";
Debug.ShouldStop(32);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("clvBuildingList")),housebuilding.mostCurrent.activityBA);
 BA.debugLineNum = 39;BA.debugLine="PanelToolbar.Visible = False";
Debug.ShouldStop(64);
parent.mostCurrent._paneltoolbar.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 42;BA.debugLine="BackArrow.Visible= True";
Debug.ShouldStop(512);
parent.mostCurrent._backarrow.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 43;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(1024);
parent.mostCurrent._backarrow.runVoidMethod ("SetBackgroundImageNew",(Object)((parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("back-arrow.png"))).getObject())));
 BA.debugLineNum = 44;BA.debugLine="TitleBar.Text=\"Building List\"";
Debug.ShouldStop(2048);
parent.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("Building List"));
 BA.debugLineNum = 47;BA.debugLine="WebViewTest.Initialize(\"\")";
Debug.ShouldStop(16384);
parent.mostCurrent._webviewtest.runVoidMethod ("Initialize",housebuilding.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 48;BA.debugLine="Activity.AddView(WebViewTest,0,6%y,100%x,50%y)";
Debug.ShouldStop(32768);
parent.mostCurrent._activity.runVoidMethod ("AddView",(Object)((parent.mostCurrent._webviewtest.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),housebuilding.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),housebuilding.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),housebuilding.mostCurrent.activityBA)));
 BA.debugLineNum = 49;BA.debugLine="WebViewTest.LoadURL(\"https://gisbuildingkotogadan";
Debug.ShouldStop(65536);
parent.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://gisbuildingkotogadang.herokuapp.com/house_building.php")));
 BA.debugLineNum = 52;BA.debugLine="ScrollView1.Panel.Height = CLV2.sv.Height";
Debug.ShouldStop(524288);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",parent.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"getHeight"));
 BA.debugLineNum = 53;BA.debugLine="ScrollView1.Top = WebViewTest.Height+WebViewTest.";
Debug.ShouldStop(1048576);
parent.mostCurrent._scrollview1.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._webviewtest.runMethod(true,"getHeight"),parent.mostCurrent._webviewtest.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 55;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(4194304);
_j = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 56;BA.debugLine="j.Initialize(\"\",Me)";
Debug.ShouldStop(8388608);
_j.runVoidMethod ("_initialize",housebuilding.processBA,(Object)(BA.ObjectToString("")),(Object)(housebuilding.getObject()));
 BA.debugLineNum = 57;BA.debugLine="j.Download(Main.Server&\"mobile/datarumah.php\")";
Debug.ShouldStop(16777216);
_j.runVoidMethod ("_download",(Object)(RemoteObject.concat(parent.mostCurrent._main._server,RemoteObject.createImmutable("mobile/datarumah.php"))));
 BA.debugLineNum = 58;BA.debugLine="ProgressDialogShow2(\"Downloading...\",False)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",housebuilding.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("Downloading...")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 59;BA.debugLine="Wait For (j) JobDone (j As HttpJob)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", housebuilding.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_j));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 60;BA.debugLine="If j.Success Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 10;
if (_j.getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 61;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(_j.runMethod(true,"_getstring")));
 BA.debugLineNum = 62;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(536870912);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 63;BA.debugLine="parser.Initialize(j.GetString)";
Debug.ShouldStop(1073741824);
_parser.runVoidMethod ("Initialize",(Object)(_j.runMethod(true,"_getstring")));
 BA.debugLineNum = 64;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(-2147483648);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 65;BA.debugLine="Dim features As List = root.Get(\"features\")";
Debug.ShouldStop(1);
_features = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_features.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("features")))));Debug.locals.put("features", _features);
 BA.debugLineNum = 66;BA.debugLine="For Each colfeatures As Map In features";
Debug.ShouldStop(2);
if (true) break;

case 4:
//for
this.state = 7;
_colfeatures = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group24 = _features;
index24 = 0;
groupLen24 = group24.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colfeatures", _colfeatures);
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if (index24 < groupLen24) {
this.state = 6;
_colfeatures.setObject(group24.runMethod(false,"Get",index24));}
if (true) break;

case 13:
//C
this.state = 12;
index24++;
Debug.locals.put("colfeatures", _colfeatures);
if (true) break;

case 6:
//C
this.state = 13;
 BA.debugLineNum = 67;BA.debugLine="Dim properties As Map = colfeatures.Get(\"proper";
Debug.ShouldStop(4);
_properties = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_properties.setObject(_colfeatures.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("properties")))));Debug.locals.put("properties", _properties);
 BA.debugLineNum = 68;BA.debugLine="Dim nama As String = properties.Get(\"nama\")";
Debug.ShouldStop(8);
_nama = BA.ObjectToString(_properties.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nama")))));Debug.locals.put("nama", _nama);Debug.locals.put("nama", _nama);
 BA.debugLineNum = 69;BA.debugLine="Dim id As String = properties.Get(\"id\")";
Debug.ShouldStop(16);
_id = BA.ObjectToString(_properties.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 70;BA.debugLine="Dim content As String = nama";
Debug.ShouldStop(32);
_content = _nama;Debug.locals.put("content", _content);Debug.locals.put("content", _content);
 BA.debugLineNum = 72;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, id, cont";
Debug.ShouldStop(128);
parent.mostCurrent._clv2.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getWidth"),_id,_content).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 73;BA.debugLine="CLV2.AsView.Height = PanelListItem.Height* CLV2";
Debug.ShouldStop(256);
parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._panellistitem.runMethod(true,"getHeight"),parent.mostCurrent._clv2.runMethod(true,"_getsize")}, "*",0, 1));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("colfeatures", _colfeatures);
;
 BA.debugLineNum = 75;BA.debugLine="Dim Type As String = root.Get(\"type\")";
Debug.ShouldStop(1024);
_type = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));Debug.locals.put("Type", _type);Debug.locals.put("Type", _type);
 BA.debugLineNum = 76;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 78;BA.debugLine="Log(\"Error\" & j.ErrorMessage)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error"),_j.getField(true,"_errormessage"))));
 BA.debugLineNum = 79;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 81;BA.debugLine="j.Release";
Debug.ShouldStop(65536);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
public static void  _jobdone(RemoteObject _j) throws Exception{
}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (housebuilding) ","housebuilding",29,housebuilding.mostCurrent.activityBA,housebuilding.mostCurrent,92);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.housebuilding.remoteMe.runUserSub(false, "housebuilding","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 92;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Resume (housebuilding) ","housebuilding",29,housebuilding.mostCurrent.activityBA,housebuilding.mostCurrent,88);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.housebuilding.remoteMe.runUserSub(false, "housebuilding","activity_resume");
 BA.debugLineNum = 88;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8388608);
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
public static RemoteObject  _backarrow_click() throws Exception{
try {
		Debug.PushSubsStack("BackArrow_Click (housebuilding) ","housebuilding",29,housebuilding.mostCurrent.activityBA,housebuilding.mostCurrent,129);
if (RapidSub.canDelegate("backarrow_click")) return b4a.example.housebuilding.remoteMe.runUserSub(false, "housebuilding","backarrow_click");
 BA.debugLineNum = 129;BA.debugLine="Sub BackArrow_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2);
housebuilding.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _buildingname_click() throws Exception{
try {
		Debug.PushSubsStack("BuildingName_Click (housebuilding) ","housebuilding",29,housebuilding.mostCurrent.activityBA,housebuilding.mostCurrent,112);
if (RapidSub.canDelegate("buildingname_click")) return b4a.example.housebuilding.remoteMe.runUserSub(false, "housebuilding","buildingname_click");
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
		Debug.PushSubsStack("CLV2_ItemClick (housebuilding) ","housebuilding",29,housebuilding.mostCurrent.activityBA,housebuilding.mostCurrent,106);
if (RapidSub.canDelegate("clv2_itemclick")) return b4a.example.housebuilding.remoteMe.runUserSub(false, "housebuilding","clv2_itemclick", _index, _value);
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 106;BA.debugLine="Sub CLV2_ItemClick (Index As Int, Value As Object)";
Debug.ShouldStop(512);
 BA.debugLineNum = 108;BA.debugLine="idBuilding = Value 'store the value in the proces";
Debug.ShouldStop(2048);
housebuilding._idbuilding = BA.ObjectToString(_value);
 BA.debugLineNum = 109;BA.debugLine="StartActivity(HouseDetail)";
Debug.ShouldStop(4096);
housebuilding.mostCurrent.__c.runVoidMethod ("StartActivity",housebuilding.processBA,(Object)((housebuilding.mostCurrent._housedetail.getObject())));
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("CreateItem (housebuilding) ","housebuilding",29,housebuilding.mostCurrent.activityBA,housebuilding.mostCurrent,97);
if (RapidSub.canDelegate("createitem")) return b4a.example.housebuilding.remoteMe.runUserSub(false, "housebuilding","createitem", _width, _title, _content);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Title", _title);
Debug.locals.put("Content", _content);
 BA.debugLineNum = 97;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(2);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = housebuilding._xui.runMethod(false,"CreatePanel",housebuilding.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 99;BA.debugLine="p.LoadLayout(\"BuildingListTwo\")";
Debug.ShouldStop(4);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("BuildingListTwo")),housebuilding.mostCurrent.activityBA);
 BA.debugLineNum = 100;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, PanelListItem";
Debug.ShouldStop(8);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(housebuilding.mostCurrent._panellistitem.runMethod(true,"getHeight")));
 BA.debugLineNum = 101;BA.debugLine="Num.Text = Title";
Debug.ShouldStop(16);
housebuilding.mostCurrent._num.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 102;BA.debugLine="BuildingName.Text = Content";
Debug.ShouldStop(32);
housebuilding.mostCurrent._buildingname.runMethod(true,"setText",BA.ObjectToCharSequence(_content));
 BA.debugLineNum = 103;BA.debugLine="Return p";
Debug.ShouldStop(64);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 22;BA.debugLine="Private TitleBar As Label";
housebuilding.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private BackArrow As Label";
housebuilding.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ScrollView1 As ScrollView";
housebuilding.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim WebViewTest As WebView";
housebuilding.mostCurrent._webviewtest = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private PanelBuildingList As Panel";
housebuilding.mostCurrent._panelbuildinglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private CLV2 As CustomListView";
housebuilding.mostCurrent._clv2 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 28;BA.debugLine="Private Num As B4XView";
housebuilding.mostCurrent._num = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private BuildingName As B4XView";
housebuilding.mostCurrent._buildingname = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private PanelListItem As Panel";
housebuilding.mostCurrent._panellistitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private PanelToolbar As Panel";
housebuilding.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _panellistitem_click() throws Exception{
try {
		Debug.PushSubsStack("PanelListItem_Click (housebuilding) ","housebuilding",29,housebuilding.mostCurrent.activityBA,housebuilding.mostCurrent,116);
if (RapidSub.canDelegate("panellistitem_click")) return b4a.example.housebuilding.remoteMe.runUserSub(false, "housebuilding","panellistitem_click");
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 116;BA.debugLine="Sub PanelListItem_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="Dim item As Int = CLV2.GetItemFromView(Sender)";
Debug.ShouldStop(1048576);
_item = housebuilding.mostCurrent._clv2.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), housebuilding.mostCurrent.__c.runMethod(false,"Sender",housebuilding.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 118;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(2097152);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 119;BA.debugLine="p = CLV2.GetPanel(item)";
Debug.ShouldStop(4194304);
_p = housebuilding.mostCurrent._clv2.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 120;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(8388608);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 121;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(16777216);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 123;BA.debugLine="idBuilding = a.GetView(0).GetView(0).Text";
Debug.ShouldStop(67108864);
housebuilding._idbuilding = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"getText");
 BA.debugLineNum = 125;BA.debugLine="nameBuilding = a.GetView(0).GetView(1).Text";
Debug.ShouldStop(268435456);
housebuilding._namebuilding = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"getText");
 BA.debugLineNum = 126;BA.debugLine="StartActivity(HouseDetail)";
Debug.ShouldStop(536870912);
housebuilding.mostCurrent.__c.runVoidMethod ("StartActivity",housebuilding.processBA,(Object)((housebuilding.mostCurrent._housedetail.getObject())));
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
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
housebuilding._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 11;BA.debugLine="Dim idBuilding As String";
housebuilding._idbuilding = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim nameBuilding As String";
housebuilding._namebuilding = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="idBuilding=\"\"";
housebuilding._idbuilding = BA.ObjectToString("");
 //BA.debugLineNum = 14;BA.debugLine="nameBuilding=\"\"";
housebuilding._namebuilding = BA.ObjectToString("");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}