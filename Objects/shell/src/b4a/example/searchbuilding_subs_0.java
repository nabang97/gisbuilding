package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class searchbuilding_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,68);
if (RapidSub.canDelegate("activity_create")) return b4a.example.searchbuilding.remoteMe.runUserSub(false, "searchbuilding","activity_create", _firsttime);
RemoteObject _topsearch = RemoteObject.createImmutable(0);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 68;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 71;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(64);
searchbuilding.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),searchbuilding.mostCurrent.activityBA);
 BA.debugLineNum = 72;BA.debugLine="ScrollView1.Panel.Width=100%y";
Debug.ShouldStop(128);
searchbuilding.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setWidth",searchbuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),searchbuilding.mostCurrent.activityBA));
 BA.debugLineNum = 73;BA.debugLine="ScrollView1.Panel.LoadLayout(\"clvBuildingList\")";
Debug.ShouldStop(256);
searchbuilding.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("clvBuildingList")),searchbuilding.mostCurrent.activityBA);
 BA.debugLineNum = 74;BA.debugLine="ScrollView1.Color =Colors.White";
Debug.ShouldStop(512);
searchbuilding.mostCurrent._scrollview1.runVoidMethod ("setColor",searchbuilding.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 76;BA.debugLine="If ManualPosition.lat == 0 Or ManualPosition.lng";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._manualposition._lat,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._manualposition._lng,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 77;BA.debugLine="Msgbox(\"GPS can't find your location. Try to res";
Debug.ShouldStop(4096);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("GPS can't find your location. Try to restart the application or open the application outside the room.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 BA.debugLineNum = 78;BA.debugLine="latitude = -0.3209284";
Debug.ShouldStop(8192);
searchbuilding._latitude = BA.NumberToString(-0.3209284);
 BA.debugLineNum = 79;BA.debugLine="longitude = 100.3484996";
Debug.ShouldStop(16384);
searchbuilding._longitude = BA.NumberToString(100.3484996);
 }else {
 BA.debugLineNum = 81;BA.debugLine="latitude = ManualPosition.lat";
Debug.ShouldStop(65536);
searchbuilding._latitude = BA.NumberToString(searchbuilding.mostCurrent._manualposition._lat);
 BA.debugLineNum = 82;BA.debugLine="longitude = ManualPosition.lng";
Debug.ShouldStop(131072);
searchbuilding._longitude = BA.NumberToString(searchbuilding.mostCurrent._manualposition._lng);
 };
 BA.debugLineNum = 84;BA.debugLine="Log(\"Firsttime : \"&lat&\",\"&lng)";
Debug.ShouldStop(524288);
searchbuilding.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Firsttime : "),searchbuilding._lat,RemoteObject.createImmutable(","),searchbuilding._lng)));
 BA.debugLineNum = 85;BA.debugLine="BackArrow.Visible= False";
Debug.ShouldStop(1048576);
searchbuilding.mostCurrent._backarrow.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 86;BA.debugLine="TitleBar.Text=\"Search Building\"";
Debug.ShouldStop(2097152);
searchbuilding.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("Search Building"));
 BA.debugLineNum = 87;BA.debugLine="TitleBar.Left = 5%x";
Debug.ShouldStop(4194304);
searchbuilding.mostCurrent._titlebar.runMethod(true,"setLeft",searchbuilding.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),searchbuilding.mostCurrent.activityBA));
 BA.debugLineNum = 88;BA.debugLine="Home.HomeBuilding = \"\"";
Debug.ShouldStop(8388608);
searchbuilding.mostCurrent._home._homebuilding = BA.ObjectToString("");
 BA.debugLineNum = 90;BA.debugLine="WebViewTest.Initialize(\"\")";
Debug.ShouldStop(33554432);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("Initialize",searchbuilding.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 91;BA.debugLine="Activity.AddView(WebViewTest,0,6%y,100%x,35%y)";
Debug.ShouldStop(67108864);
searchbuilding.mostCurrent._activity.runVoidMethod ("AddView",(Object)((searchbuilding.mostCurrent._webviewtest.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(searchbuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),searchbuilding.mostCurrent.activityBA)),(Object)(searchbuilding.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),searchbuilding.mostCurrent.activityBA)),(Object)(searchbuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 35)),searchbuilding.mostCurrent.activityBA)));
 BA.debugLineNum = 92;BA.debugLine="WebViewTest.LoadURL(Main.Server&\"index.php\")";
Debug.ShouldStop(134217728);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(searchbuilding.mostCurrent._main._server,RemoteObject.createImmutable("index.php"))));
 BA.debugLineNum = 95;BA.debugLine="Dim TopSearch As Int";
Debug.ShouldStop(1073741824);
_topsearch = RemoteObject.createImmutable(0);Debug.locals.put("TopSearch", _topsearch);
 BA.debugLineNum = 96;BA.debugLine="TopSearch = WebViewTest.Height + WebViewTest.Top";
Debug.ShouldStop(-2147483648);
_topsearch = RemoteObject.solve(new RemoteObject[] {searchbuilding.mostCurrent._webviewtest.runMethod(true,"getHeight"),searchbuilding.mostCurrent._webviewtest.runMethod(true,"getTop")}, "+",1, 1);Debug.locals.put("TopSearch", _topsearch);
 BA.debugLineNum = 97;BA.debugLine="PanelSearch.Initialize(\"PanelSearch\")";
Debug.ShouldStop(1);
searchbuilding.mostCurrent._panelsearch.runVoidMethod ("Initialize",searchbuilding.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PanelSearch")));
 BA.debugLineNum = 98;BA.debugLine="Activity.AddView(PanelSearch,0,TopSearch,100%x,15";
Debug.ShouldStop(2);
searchbuilding.mostCurrent._activity.runVoidMethod ("AddView",(Object)((searchbuilding.mostCurrent._panelsearch.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_topsearch),(Object)(searchbuilding.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),searchbuilding.mostCurrent.activityBA)),(Object)(searchbuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),searchbuilding.mostCurrent.activityBA)));
 BA.debugLineNum = 101;BA.debugLine="PanelSearch.LoadLayout(\"SearchPanelnside\")";
Debug.ShouldStop(16);
searchbuilding.mostCurrent._panelsearch.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("SearchPanelnside")),searchbuilding.mostCurrent.activityBA);
 BA.debugLineNum = 102;BA.debugLine="PanelSearch.Color= Colors.RGB(209,209,209)";
Debug.ShouldStop(32);
searchbuilding.mostCurrent._panelsearch.runVoidMethod ("setColor",searchbuilding.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 209)),(Object)(BA.numberCast(int.class, 209)),(Object)(BA.numberCast(int.class, 209))));
 BA.debugLineNum = 103;BA.debugLine="SetBackgroundTintList(SearchText, Colors.Transpar";
Debug.ShouldStop(64);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), searchbuilding.mostCurrent._searchtext.getObject()),searchbuilding.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"),searchbuilding.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 104;BA.debugLine="CreateSpinBuilding_Item";
Debug.ShouldStop(128);
_createspinbuilding_item();
 BA.debugLineNum = 105;BA.debugLine="SpinSearch.Clear";
Debug.ShouldStop(256);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Clear");
 BA.debugLineNum = 106;BA.debugLine="CLV2.AsView.Height = 0";
Debug.ShouldStop(512);
searchbuilding.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"setHeight",BA.numberCast(int.class, 0));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,1326);
if (RapidSub.canDelegate("activity_keypress")) return b4a.example.searchbuilding.remoteMe.runUserSub(false, "searchbuilding","activity_keypress", _keycode);
RemoteObject _islogin = RemoteObject.createImmutable(false);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 1326;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1327;BA.debugLine="Dim isLogin As Boolean";
Debug.ShouldStop(16384);
_islogin = RemoteObject.createImmutable(false);Debug.locals.put("isLogin", _islogin);
 BA.debugLineNum = 1328;BA.debugLine="isLogin = Login.manager.GetBoolean(\"is_login\")";
Debug.ShouldStop(32768);
_islogin = searchbuilding.mostCurrent._login._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("is_login")));Debug.locals.put("isLogin", _islogin);
 BA.debugLineNum = 1329;BA.debugLine="Log(\"keyy: \"&KeyCodes.KEYCODE_BACK)";
Debug.ShouldStop(65536);
searchbuilding.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("keyy: "),searchbuilding.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK"))));
 BA.debugLineNum = 1330;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then  ' Back b";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, searchbuilding.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 1331;BA.debugLine="If File.Exists(Main.folder,\"datastore\") Then";
Debug.ShouldStop(262144);
if (searchbuilding.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(searchbuilding.mostCurrent._main._folder),(Object)(RemoteObject.createImmutable("datastore"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1332;BA.debugLine="If Main.kvs.ContainsKey(\"role\")Then";
Debug.ShouldStop(524288);
if (searchbuilding.mostCurrent._main._kvs.runMethod(true,"_containskey",(Object)(RemoteObject.createImmutable("role"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1333;BA.debugLine="StopService(Starter)";
Debug.ShouldStop(1048576);
searchbuilding.mostCurrent.__c.runVoidMethod ("StopService",searchbuilding.processBA,(Object)((searchbuilding.mostCurrent._starter.getObject())));
 BA.debugLineNum = 1334;BA.debugLine="Main.ShouldIClose = True";
Debug.ShouldStop(2097152);
searchbuilding.mostCurrent._main._shouldiclose = searchbuilding.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1335;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4194304);
searchbuilding.mostCurrent._activity.runVoidMethod ("Finish");
 };
 };
 };
 BA.debugLineNum = 1339;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Pause (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,114);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.searchbuilding.remoteMe.runUserSub(false, "searchbuilding","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 114;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(131072);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,110);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.searchbuilding.remoteMe.runUserSub(false, "searchbuilding","activity_resume");
 BA.debugLineNum = 110;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8192);
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("BtnHome_Click (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,1035);
if (RapidSub.canDelegate("btnhome_click")) return b4a.example.searchbuilding.remoteMe.runUserSub(false, "searchbuilding","btnhome_click");
 BA.debugLineNum = 1035;BA.debugLine="Sub BtnHome_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1036;BA.debugLine="If File.Exists(Main.folder,\"datastore\") Then";
Debug.ShouldStop(2048);
if (searchbuilding.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(searchbuilding.mostCurrent._main._folder),(Object)(RemoteObject.createImmutable("datastore"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1037;BA.debugLine="If Main.kvs.ContainsKey(\"role\") == True Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._main._kvs.runMethod(true,"_containskey",(Object)(RemoteObject.createImmutable("role"))),searchbuilding.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1038;BA.debugLine="StartActivity(HomeAdmin)";
Debug.ShouldStop(8192);
searchbuilding.mostCurrent.__c.runVoidMethod ("StartActivity",searchbuilding.processBA,(Object)((searchbuilding.mostCurrent._homeadmin.getObject())));
 BA.debugLineNum = 1039;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16384);
searchbuilding.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 1041;BA.debugLine="StartActivity(Home)";
Debug.ShouldStop(65536);
searchbuilding.mostCurrent.__c.runVoidMethod ("StartActivity",searchbuilding.processBA,(Object)((searchbuilding.mostCurrent._home.getObject())));
 BA.debugLineNum = 1042;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
searchbuilding.mostCurrent._activity.runVoidMethod ("Finish");
 };
 };
 BA.debugLineNum = 1045;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("BtnMap_Click (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,1321);
if (RapidSub.canDelegate("btnmap_click")) return b4a.example.searchbuilding.remoteMe.runUserSub(false, "searchbuilding","btnmap_click");
 BA.debugLineNum = 1321;BA.debugLine="Sub BtnMap_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 1322;BA.debugLine="StartActivity(ManualPosition)";
Debug.ShouldStop(512);
searchbuilding.mostCurrent.__c.runVoidMethod ("StartActivity",searchbuilding.processBA,(Object)((searchbuilding.mostCurrent._manualposition.getObject())));
 BA.debugLineNum = 1323;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1024);
searchbuilding.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 1324;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("BtnSearch_Click (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,1031);
if (RapidSub.canDelegate("btnsearch_click")) return b4a.example.searchbuilding.remoteMe.runUserSub(false, "searchbuilding","btnsearch_click");
 BA.debugLineNum = 1031;BA.debugLine="Sub BtnSearch_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 1032;BA.debugLine="Activity_Create(True)";
Debug.ShouldStop(128);
_activity_create(searchbuilding.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1033;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("CLV2_ItemClick (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,684);
if (RapidSub.canDelegate("clv2_itemclick")) return b4a.example.searchbuilding.remoteMe.runUserSub(false, "searchbuilding","clv2_itemclick", _index, _value);
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 684;BA.debugLine="Sub CLV2_ItemClick (Index As Int, Value As Object)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 686;BA.debugLine="idBuilding = Value 'store the value in the proces";
Debug.ShouldStop(8192);
searchbuilding._idbuilding = BA.ObjectToString(_value);
 BA.debugLineNum = 687;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("CreateItem (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,214);
if (RapidSub.canDelegate("createitem")) return b4a.example.searchbuilding.remoteMe.runUserSub(false, "searchbuilding","createitem", _width, _title, _content);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Title", _title);
Debug.locals.put("Content", _content);
 BA.debugLineNum = 214;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 215;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(4194304);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = searchbuilding._xui.runMethod(false,"CreatePanel",searchbuilding.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 216;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 100%x,10%y)";
Debug.ShouldStop(8388608);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(searchbuilding.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),searchbuilding.mostCurrent.activityBA)),(Object)(searchbuilding.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),searchbuilding.mostCurrent.activityBA)));
 BA.debugLineNum = 217;BA.debugLine="p.LoadLayout(\"BuildingListTwo\")";
Debug.ShouldStop(16777216);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("BuildingListTwo")),searchbuilding.mostCurrent.activityBA);
 BA.debugLineNum = 218;BA.debugLine="num.Text = Title";
Debug.ShouldStop(33554432);
searchbuilding.mostCurrent._num.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 219;BA.debugLine="Buildingname.Text = Content";
Debug.ShouldStop(67108864);
searchbuilding.mostCurrent._buildingname.runMethod(true,"setText",BA.ObjectToCharSequence(_content));
 BA.debugLineNum = 220;BA.debugLine="Return p";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createspinbuilding_item() throws Exception{
try {
		Debug.PushSubsStack("CreateSpinBuilding_Item (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,118);
if (RapidSub.canDelegate("createspinbuilding_item")) return b4a.example.searchbuilding.remoteMe.runUserSub(false, "searchbuilding","createspinbuilding_item");
 BA.debugLineNum = 118;BA.debugLine="Sub CreateSpinBuilding_Item";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="spinnerMapB.Initialize";
Debug.ShouldStop(4194304);
searchbuilding.mostCurrent._spinnermapb.runVoidMethod ("Initialize");
 BA.debugLineNum = 120;BA.debugLine="SpinBuilding.add(\"Select Building Type\")";
Debug.ShouldStop(8388608);
searchbuilding.mostCurrent._spinbuilding.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Select Building Type")));
 BA.debugLineNum = 121;BA.debugLine="SpinBuilding.Add(\"All Building\")";
Debug.ShouldStop(16777216);
searchbuilding.mostCurrent._spinbuilding.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("All Building")));
 BA.debugLineNum = 122;BA.debugLine="spinnerMapB.Put(\"All Building\",\"All\")";
Debug.ShouldStop(33554432);
searchbuilding.mostCurrent._spinnermapb.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("All Building"))),(Object)((RemoteObject.createImmutable("All"))));
 BA.debugLineNum = 123;BA.debugLine="SpinBuilding.Add(\"Office Building\")";
Debug.ShouldStop(67108864);
searchbuilding.mostCurrent._spinbuilding.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Office Building")));
 BA.debugLineNum = 124;BA.debugLine="spinnerMapB.Put(\"Office Building\",\"Office\")";
Debug.ShouldStop(134217728);
searchbuilding.mostCurrent._spinnermapb.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Office Building"))),(Object)((RemoteObject.createImmutable("Office"))));
 BA.debugLineNum = 125;BA.debugLine="SpinBuilding.Add(\"Worship Building\")";
Debug.ShouldStop(268435456);
searchbuilding.mostCurrent._spinbuilding.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Worship Building")));
 BA.debugLineNum = 126;BA.debugLine="spinnerMapB.Put(\"Worship Building\",\"Worship\")";
Debug.ShouldStop(536870912);
searchbuilding.mostCurrent._spinnermapb.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Worship Building"))),(Object)((RemoteObject.createImmutable("Worship"))));
 BA.debugLineNum = 127;BA.debugLine="SpinBuilding.Add(\"House Building\")";
Debug.ShouldStop(1073741824);
searchbuilding.mostCurrent._spinbuilding.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("House Building")));
 BA.debugLineNum = 128;BA.debugLine="spinnerMapB.Put(\"House Building\",\"House\")";
Debug.ShouldStop(-2147483648);
searchbuilding.mostCurrent._spinnermapb.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("House Building"))),(Object)((RemoteObject.createImmutable("House"))));
 BA.debugLineNum = 129;BA.debugLine="SpinBuilding.Add(\"Educational Building\")";
Debug.ShouldStop(1);
searchbuilding.mostCurrent._spinbuilding.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Educational Building")));
 BA.debugLineNum = 130;BA.debugLine="spinnerMapB.Put(\"Educational Building\",\"Education";
Debug.ShouldStop(2);
searchbuilding.mostCurrent._spinnermapb.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Educational Building"))),(Object)((RemoteObject.createImmutable("Educational"))));
 BA.debugLineNum = 131;BA.debugLine="SpinBuilding.Add(\"Health Building\")";
Debug.ShouldStop(4);
searchbuilding.mostCurrent._spinbuilding.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Health Building")));
 BA.debugLineNum = 132;BA.debugLine="spinnerMapB.Put(\"Health Building\",\"Health\")";
Debug.ShouldStop(8);
searchbuilding.mostCurrent._spinnermapb.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Health Building"))),(Object)((RemoteObject.createImmutable("Health"))));
 BA.debugLineNum = 133;BA.debugLine="SpinBuilding.Add(\"Msme Building\")";
Debug.ShouldStop(16);
searchbuilding.mostCurrent._spinbuilding.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Msme Building")));
 BA.debugLineNum = 134;BA.debugLine="spinnerMapB.Put(\"Msme Building\",\"Msme\")";
Debug.ShouldStop(32);
searchbuilding.mostCurrent._spinnermapb.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Msme Building"))),(Object)((RemoteObject.createImmutable("Msme"))));
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createspintype_item() throws Exception{
try {
		Debug.PushSubsStack("CreateSpinType_Item (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,137);
if (RapidSub.canDelegate("createspintype_item")) return b4a.example.searchbuilding.remoteMe.runUserSub(false, "searchbuilding","createspintype_item");
 BA.debugLineNum = 137;BA.debugLine="Sub CreateSpinType_Item";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="spinnerMapT.Initialize";
Debug.ShouldStop(512);
searchbuilding.mostCurrent._spinnermapt.runVoidMethod ("Initialize");
 BA.debugLineNum = 139;BA.debugLine="Select typesrc";
Debug.ShouldStop(1024);
switch (BA.switchObjectToInt(searchbuilding.mostCurrent._typesrc,BA.ObjectToString("model"),BA.ObjectToString("type"),BA.ObjectToString("jorong"),BA.ObjectToString("construction"),BA.ObjectToString("status"),BA.ObjectToString("tribe"),BA.ObjectToString("village"),BA.ObjectToString("datuk"),BA.ObjectToString("education"))) {
case 0: {
 BA.debugLineNum = 141;BA.debugLine="SpinType.add(\"Select Building Model \")";
Debug.ShouldStop(4096);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Select Building Model ")));
 BA.debugLineNum = 142;BA.debugLine="SpinType.add(\"Rumah Gadang\")";
Debug.ShouldStop(8192);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Rumah Gadang")));
 BA.debugLineNum = 143;BA.debugLine="spinnerMapT.Put(\"Rumah Gadang\",\"rg\")";
Debug.ShouldStop(16384);
searchbuilding.mostCurrent._spinnermapt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Rumah Gadang"))),(Object)((RemoteObject.createImmutable("rg"))));
 BA.debugLineNum = 144;BA.debugLine="SpinType.add(\"Dutch Building\")";
Debug.ShouldStop(32768);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Dutch Building")));
 BA.debugLineNum = 145;BA.debugLine="spinnerMapT.Put(\"Dutch Building\",\"db\")";
Debug.ShouldStop(65536);
searchbuilding.mostCurrent._spinnermapt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Dutch Building"))),(Object)((RemoteObject.createImmutable("db"))));
 BA.debugLineNum = 146;BA.debugLine="SpinType.add(\"Other\")";
Debug.ShouldStop(131072);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Other")));
 BA.debugLineNum = 147;BA.debugLine="spinnerMapT.Put(\"Other\",\"ot\")";
Debug.ShouldStop(262144);
searchbuilding.mostCurrent._spinnermapt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Other"))),(Object)((RemoteObject.createImmutable("ot"))));
 break; }
case 1: {
 BA.debugLineNum = 149;BA.debugLine="Select idspin";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(searchbuilding._idspin,BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Msme"),BA.ObjectToString("Educational"),BA.ObjectToString("Health"))) {
case 0: {
 BA.debugLineNum = 151;BA.debugLine="SpinType.add(\"Select Type \"&idspin)";
Debug.ShouldStop(4194304);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Add",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select Type "),searchbuilding._idspin)));
 BA.debugLineNum = 152;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_t";
Debug.ShouldStop(8388608);
_executeremotequery(BA.ObjectToString("SELECT type_id, name_of_type FROM type_of_worship ORDER BY name_of_type ASC"),RemoteObject.createImmutable("ShowType"));
 break; }
case 1: {
 BA.debugLineNum = 154;BA.debugLine="SpinType.add(\"Select Type \"&idspin)";
Debug.ShouldStop(33554432);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Add",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select Type "),searchbuilding._idspin)));
 BA.debugLineNum = 155;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_t";
Debug.ShouldStop(67108864);
_executeremotequery(BA.ObjectToString("SELECT type_id, name_of_type FROM type_of_office ORDER BY name_of_type ASC"),RemoteObject.createImmutable("ShowType"));
 break; }
case 2: {
 BA.debugLineNum = 157;BA.debugLine="SpinType.add(\"Select Type \"&idspin)";
Debug.ShouldStop(268435456);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Add",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select Type "),searchbuilding._idspin)));
 BA.debugLineNum = 158;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_t";
Debug.ShouldStop(536870912);
_executeremotequery(BA.ObjectToString("SELECT type_id, name_of_type FROM type_of_msme ORDER BY name_of_type ASC"),RemoteObject.createImmutable("ShowType"));
 break; }
case 3: {
 BA.debugLineNum = 160;BA.debugLine="SpinType.add(\"Select Type \"&idspin)";
Debug.ShouldStop(-2147483648);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Add",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select Type "),searchbuilding._idspin)));
 BA.debugLineNum = 161;BA.debugLine="ExecuteRemoteQuery(\"SELECT level_id, name_of_";
Debug.ShouldStop(1);
_executeremotequery(BA.ObjectToString("SELECT level_id, name_of_level FROM level_of_education ORDER BY name_of_level ASC"),RemoteObject.createImmutable("ShowType"));
 break; }
case 4: {
 BA.debugLineNum = 163;BA.debugLine="SpinType.add(\"Select Type \"&idspin)";
Debug.ShouldStop(4);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Add",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select Type "),searchbuilding._idspin)));
 BA.debugLineNum = 164;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_t";
Debug.ShouldStop(8);
_executeremotequery(BA.ObjectToString("SELECT type_id, name_of_type FROM type_of_health_building ORDER BY name_of_type ASC"),RemoteObject.createImmutable("ShowType"));
 break; }
}
;
 break; }
case 2: {
 BA.debugLineNum = 167;BA.debugLine="Select idspin";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(searchbuilding._idspin,BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Health"),BA.ObjectToString("Msme"),BA.ObjectToString("Educational"))) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: {
 BA.debugLineNum = 169;BA.debugLine="SpinType.add(\"Select Jorong \"&idspin)";
Debug.ShouldStop(256);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Add",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select Jorong "),searchbuilding._idspin)));
 BA.debugLineNum = 170;BA.debugLine="ExecuteRemoteQuery(\"SELECT jorong_id, name_of";
Debug.ShouldStop(512);
_executeremotequery(BA.ObjectToString("SELECT jorong_id, name_of_jorong FROM jorong ORDER BY name_of_jorong ASC"),RemoteObject.createImmutable("ShowJorong"));
 break; }
}
;
 break; }
case 3: {
 BA.debugLineNum = 173;BA.debugLine="Select idspin";
Debug.ShouldStop(4096);
switch (BA.switchObjectToInt(searchbuilding._idspin,BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Health"),BA.ObjectToString("Msme"),BA.ObjectToString("Educational"),BA.ObjectToString("House"))) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
 BA.debugLineNum = 175;BA.debugLine="SpinType.add(\"Select Construction\")";
Debug.ShouldStop(16384);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Select Construction")));
 BA.debugLineNum = 176;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_t";
Debug.ShouldStop(32768);
_executeremotequery(BA.ObjectToString("SELECT type_id, name_of_type FROM type_of_construction ORDER BY name_of_type ASC "),RemoteObject.createImmutable("ShowConstruction"));
 break; }
}
;
 break; }
case 4: {
 BA.debugLineNum = 179;BA.debugLine="Select idspin";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(searchbuilding._idspin,BA.ObjectToString("Educational"))) {
case 0: {
 BA.debugLineNum = 181;BA.debugLine="SpinType.add(\"Select School Type\")";
Debug.ShouldStop(1048576);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Select School Type")));
 BA.debugLineNum = 182;BA.debugLine="SpinType.Add(\"Public School\")";
Debug.ShouldStop(2097152);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Public School")));
 BA.debugLineNum = 183;BA.debugLine="spinnerMapT.Put(\"Public School\",\"1\")";
Debug.ShouldStop(4194304);
searchbuilding.mostCurrent._spinnermapt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Public School"))),(Object)((RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 184;BA.debugLine="SpinType.Add(\"Private School\")";
Debug.ShouldStop(8388608);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Private School")));
 BA.debugLineNum = 185;BA.debugLine="spinnerMapT.Put(\"Private School\",\"0\")";
Debug.ShouldStop(16777216);
searchbuilding.mostCurrent._spinnermapt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Private School"))),(Object)((RemoteObject.createImmutable("0"))));
 break; }
}
;
 break; }
case 5: {
 BA.debugLineNum = 188;BA.debugLine="Select idspin";
Debug.ShouldStop(134217728);
switch (BA.switchObjectToInt(searchbuilding._idspin,BA.ObjectToString("House"))) {
case 0: {
 BA.debugLineNum = 190;BA.debugLine="SpinType.add(\"Select Tribe\")";
Debug.ShouldStop(536870912);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Select Tribe")));
 BA.debugLineNum = 191;BA.debugLine="ExecuteRemoteQuery (\"SELECT tribe_id, name_of";
Debug.ShouldStop(1073741824);
_executeremotequery(BA.ObjectToString("SELECT tribe_id, name_of_tribe FROM tribe ORDER by name_of_tribe ASC"),RemoteObject.createImmutable("ShowTribe"));
 break; }
}
;
 break; }
case 6: {
 BA.debugLineNum = 194;BA.debugLine="Select idspin";
Debug.ShouldStop(2);
switch (BA.switchObjectToInt(searchbuilding._idspin,BA.ObjectToString("House"))) {
case 0: {
 BA.debugLineNum = 196;BA.debugLine="SpinType.add(\"Select Village\")";
Debug.ShouldStop(8);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Select Village")));
 BA.debugLineNum = 197;BA.debugLine="ExecuteRemoteQuery (\"SELECT village_id, villag";
Debug.ShouldStop(16);
_executeremotequery(BA.ObjectToString("SELECT village_id, village_name FROM village ORDER by village_name ASC"),RemoteObject.createImmutable("ShowVillage"));
 break; }
}
;
 break; }
case 7: {
 BA.debugLineNum = 200;BA.debugLine="Select idspin";
Debug.ShouldStop(128);
switch (BA.switchObjectToInt(searchbuilding._idspin,BA.ObjectToString("House"))) {
case 0: {
 BA.debugLineNum = 202;BA.debugLine="SpinType.add(\"Select Datuk\")";
Debug.ShouldStop(512);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Select Datuk")));
 BA.debugLineNum = 203;BA.debugLine="ExecuteRemoteQuery (\"SELECT datuk_id, datuk_n";
Debug.ShouldStop(1024);
_executeremotequery(BA.ObjectToString("SELECT datuk_id, datuk_name FROM datuk ORDER by datuk_name ASC"),RemoteObject.createImmutable("ShowDatuk"));
 break; }
}
;
 break; }
case 8: {
 BA.debugLineNum = 206;BA.debugLine="Select idspin";
Debug.ShouldStop(8192);
switch (BA.switchObjectToInt(searchbuilding._idspin,BA.ObjectToString("House"))) {
case 0: {
 BA.debugLineNum = 208;BA.debugLine="SpinType.add(\"Select Educational Level\")";
Debug.ShouldStop(32768);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Select Educational Level")));
 BA.debugLineNum = 209;BA.debugLine="ExecuteRemoteQuery(\"SELECT education_id, educ";
Debug.ShouldStop(65536);
_executeremotequery(BA.ObjectToString("SELECT education_id, educational_level FROM education ORDER by educational_level ASC"),RemoteObject.createImmutable("ShowEducation"));
 break; }
}
;
 break; }
}
;
 BA.debugLineNum = 212;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ExecuteRemoteQuery (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,235);
if (RapidSub.canDelegate("executeremotequery")) return b4a.example.searchbuilding.remoteMe.runUserSub(false, "searchbuilding","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 235;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 236;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(2048);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 237;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(4096);
_job.runVoidMethod ("_initialize",searchbuilding.processBA,(Object)(_jobname),(Object)(searchbuilding.getObject()));
 BA.debugLineNum = 238;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
Debug.ShouldStop(8192);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._server,RemoteObject.createImmutable("mobile/json.php"))),(Object)(_query));
 BA.debugLineNum = 239;BA.debugLine="ProgressDialogShow(\"load data from server....\")";
Debug.ShouldStop(16384);
searchbuilding.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",searchbuilding.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("load data from server...."))));
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
public static RemoteObject  _facilitybtn_click() throws Exception{
try {
		Debug.PushSubsStack("FacilityBtn_Click (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,1293);
if (RapidSub.canDelegate("facilitybtn_click")) return b4a.example.searchbuilding.remoteMe.runUserSub(false, "searchbuilding","facilitybtn_click");
 BA.debugLineNum = 1293;BA.debugLine="Sub FacilityBtn_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1294;BA.debugLine="Select typesrc";
Debug.ShouldStop(8192);
switch (BA.switchObjectToInt(searchbuilding.mostCurrent._typesrc,BA.ObjectToString("facility"))) {
case 0: {
 BA.debugLineNum = 1296;BA.debugLine="Select idspin";
Debug.ShouldStop(32768);
switch (BA.switchObjectToInt(searchbuilding._idspin,BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Health"),BA.ObjectToString("Educational"),BA.ObjectToString("Msme"))) {
case 0: {
 BA.debugLineNum = 1298;BA.debugLine="ExecuteRemoteQuery(\"SELECT * FROM worship_buil";
Debug.ShouldStop(131072);
_executeremotequery(BA.ObjectToString("SELECT * FROM worship_building_facilities ORDER BY name_of_facility ASC"),RemoteObject.createImmutable("ShowFacility"));
 break; }
case 1: {
 BA.debugLineNum = 1300;BA.debugLine="ExecuteRemoteQuery(\"SELECT * FROM office_build";
Debug.ShouldStop(524288);
_executeremotequery(BA.ObjectToString("SELECT * FROM office_building_facilities ORDER BY name_of_facility ASC"),RemoteObject.createImmutable("ShowFacility"));
 break; }
case 2: {
 BA.debugLineNum = 1302;BA.debugLine="ExecuteRemoteQuery(\"SELECT * FROM health_build";
Debug.ShouldStop(2097152);
_executeremotequery(BA.ObjectToString("SELECT * FROM health_building_facilities ORDER BY name_of_facility ASC"),RemoteObject.createImmutable("ShowFacility"));
 break; }
case 3: {
 BA.debugLineNum = 1304;BA.debugLine="ExecuteRemoteQuery(\"SELECT * FROM educational_";
Debug.ShouldStop(8388608);
_executeremotequery(BA.ObjectToString("SELECT * FROM educational_building_facilities ORDER BY name_of_facility ASC"),RemoteObject.createImmutable("ShowFacility"));
 break; }
case 4: {
 BA.debugLineNum = 1306;BA.debugLine="ExecuteRemoteQuery(\"SELECT * FROM msme_buildin";
Debug.ShouldStop(33554432);
_executeremotequery(BA.ObjectToString("SELECT * FROM msme_building_facilities ORDER BY name_of_facility ASC"),RemoteObject.createImmutable("ShowFacility"));
 break; }
}
;
 break; }
}
;
 BA.debugLineNum = 1309;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private TitleBar As Label";
searchbuilding.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private BackArrow As Label";
searchbuilding.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ScrollView1 As ScrollView";
searchbuilding.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim WebViewTest As WebView";
searchbuilding.mostCurrent._webviewtest = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private PanelBuildingList As Panel";
searchbuilding.mostCurrent._panelbuildinglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private PanelListItem As B4XView";
searchbuilding.mostCurrent._panellistitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private CLV2 As CustomListView";
searchbuilding.mostCurrent._clv2 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 30;BA.debugLine="Private PanelToolbar As Panel";
searchbuilding.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private PanelSearch As Panel";
searchbuilding.mostCurrent._panelsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private SearchText As EditText";
searchbuilding.mostCurrent._searchtext = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private SearchTextPanel As Panel";
searchbuilding.mostCurrent._searchtextpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private num As B4XView";
searchbuilding.mostCurrent._num = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private Buildingname As B4XView";
searchbuilding.mostCurrent._buildingname = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private PanelListItem As B4XView";
searchbuilding.mostCurrent._panellistitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private SearchBtn As Button";
searchbuilding.mostCurrent._searchbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private SpinBuilding As Spinner";
searchbuilding.mostCurrent._spinbuilding = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Dim spinnerMap As Map";
searchbuilding.mostCurrent._spinnermap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 45;BA.debugLine="Dim spinnerMapB As Map";
searchbuilding.mostCurrent._spinnermapb = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 46;BA.debugLine="Dim spinnerMapJ As Map";
searchbuilding.mostCurrent._spinnermapj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 47;BA.debugLine="Dim spinnerMapT As Map";
searchbuilding.mostCurrent._spinnermapt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 48;BA.debugLine="Dim typesrc As String";
searchbuilding.mostCurrent._typesrc = RemoteObject.createImmutable("");
 //BA.debugLineNum = 49;BA.debugLine="Dim jorongid As String";
searchbuilding.mostCurrent._jorongid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 50;BA.debugLine="Dim typeid As String";
searchbuilding.mostCurrent._typeid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 51;BA.debugLine="Private SpinSearch As Spinner";
searchbuilding.mostCurrent._spinsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private SearchRadius As SeekBar";
searchbuilding.mostCurrent._searchradius = RemoteObject.createNew ("anywheresoftware.b4a.objects.SeekBarWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private SpinJorong As Spinner";
searchbuilding.mostCurrent._spinjorong = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private SpinType As Spinner";
searchbuilding.mostCurrent._spintype = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private FacilityBtn As Button";
searchbuilding.mostCurrent._facilitybtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Dim idCheckSub As String";
searchbuilding.mostCurrent._idchecksub = RemoteObject.createImmutable("");
 //BA.debugLineNum = 57;BA.debugLine="Dim textCheckSub As String";
searchbuilding.mostCurrent._textchecksub = RemoteObject.createImmutable("");
 //BA.debugLineNum = 58;BA.debugLine="Dim lstChecks As List";
searchbuilding.mostCurrent._lstchecks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 59;BA.debugLine="Dim count As Int";
searchbuilding._count = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 60;BA.debugLine="Private FromText As EditText";
searchbuilding.mostCurrent._fromtext = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private ToText As EditText";
searchbuilding.mostCurrent._totext = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Dim radiusku As Int";
searchbuilding._radiusku = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 63;BA.debugLine="Private Label3 As Label";
searchbuilding.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private BtnMap As Button";
searchbuilding.mostCurrent._btnmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Dim datapath As String = Main.folder";
searchbuilding.mostCurrent._datapath = searchbuilding.mostCurrent._main._folder;
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _jobdone(RemoteObject _job) throws Exception{
ResumableSub_JobDone rsub = new ResumableSub_JobDone(null,_job);
rsub.resume(null, null);
}
public static class ResumableSub_JobDone extends BA.ResumableSub {
public ResumableSub_JobDone(b4a.example.searchbuilding parent,RemoteObject _job) {
this.parent = parent;
this._job = _job;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.searchbuilding parent;
RemoteObject _job;
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _education_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _namatype = RemoteObject.createImmutable("");
RemoteObject _idtype = RemoteObject.createImmutable("");
RemoteObject _village_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _datuk_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tribe_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _facility_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");
RemoteObject _scrollviewfac = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _arraynow = RemoteObject.createImmutable(0);
int _c = 0;
RemoteObject _f = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _contentt = RemoteObject.createImmutable("");
RemoteObject _contentid = RemoteObject.createImmutable("");
RemoteObject _chk = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
RemoteObject _lbl1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _sc = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _chksub = RemoteObject.createImmutable("");
RemoteObject _idcheck = RemoteObject.createImmutable("");
RemoteObject _textcheck = RemoteObject.createImmutable("");
RemoteObject _stridcheck = RemoteObject.createImmutable("");
RemoteObject _strtextcheck = RemoteObject.createImmutable("");
RemoteObject _jorong_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _type_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cons_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _worship_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _number = RemoteObject.createImmutable("");
RemoteObject _nama = RemoteObject.createImmutable("");
RemoteObject _office_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _health_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _msme_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _house_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int step11;
int limit11;
int step25;
int limit25;
int step39;
int limit39;
int step53;
int limit53;
int step75;
int limit75;
int step111;
int limit111;
int step143;
int limit143;
int step157;
int limit157;
int step177;
int limit177;
int step195;
int limit195;
int step223;
int limit223;
int step253;
int limit253;
int step283;
int limit283;
int step313;
int limit313;
int step343;
int limit343;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("JobDone (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,242);
if (RapidSub.canDelegate("jobdone")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Job", _job);
 BA.debugLineNum = 244;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 151;
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 245;BA.debugLine="Dim res As String";
Debug.ShouldStop(1048576);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 246;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(2097152);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 247;BA.debugLine="Log(\"Response from server :\"& res)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 248;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(8388608);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 249;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(16777216);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 250;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(33554432);
if (true) break;

case 4:
//select
this.state = 150;
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("ShowEducation"),BA.ObjectToString("ShowVillage"),BA.ObjectToString("ShowDatuk"),BA.ObjectToString("ShowTribe"),BA.ObjectToString("ShowFacility"),BA.ObjectToString("ShowJorong"),BA.ObjectToString("ShowType"),BA.ObjectToString("ShowConstruction"),BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Educational"),BA.ObjectToString("Health"),BA.ObjectToString("Msme"),BA.ObjectToString("House"))) {
case 0: {
this.state = 6;
if (true) break;
}
case 1: {
this.state = 12;
if (true) break;
}
case 2: {
this.state = 18;
if (true) break;
}
case 3: {
this.state = 24;
if (true) break;
}
case 4: {
this.state = 30;
if (true) break;
}
case 5: {
this.state = 55;
if (true) break;
}
case 6: {
this.state = 61;
if (true) break;
}
case 7: {
this.state = 73;
if (true) break;
}
case 8: {
this.state = 79;
if (true) break;
}
case 9: {
this.state = 91;
if (true) break;
}
case 10: {
this.state = 103;
if (true) break;
}
case 11: {
this.state = 115;
if (true) break;
}
case 12: {
this.state = 127;
if (true) break;
}
case 13: {
this.state = 139;
if (true) break;
}
}
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 252;BA.debugLine="Dim education_array As List";
Debug.ShouldStop(134217728);
_education_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("education_array", _education_array);
 BA.debugLineNum = 253;BA.debugLine="education_array = parser.NextArray";
Debug.ShouldStop(268435456);
_education_array = _parser.runMethod(false,"NextArray");Debug.locals.put("education_array", _education_array);
 BA.debugLineNum = 254;BA.debugLine="For i=0 To education_array.Size -1";
Debug.ShouldStop(536870912);
if (true) break;

case 7:
//for
this.state = 10;
step11 = 1;
limit11 = RemoteObject.solve(new RemoteObject[] {_education_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 152;
if (true) break;

case 152:
//C
this.state = 10;
if ((step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11)) this.state = 9;
if (true) break;

case 153:
//C
this.state = 152;
_i = ((int)(0 + _i + step11)) ;
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 153;
 BA.debugLineNum = 255;BA.debugLine="Dim a As Map";
Debug.ShouldStop(1073741824);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 256;BA.debugLine="a = education_array.Get(i)";
Debug.ShouldStop(-2147483648);
_a.setObject(_education_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 257;BA.debugLine="Dim namatype, idtype As String";
Debug.ShouldStop(1);
_namatype = RemoteObject.createImmutable("");Debug.locals.put("namatype", _namatype);
_idtype = RemoteObject.createImmutable("");Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 258;BA.debugLine="namatype= a.Get(\"educational_level\")";
Debug.ShouldStop(2);
_namatype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("educational_level")))));Debug.locals.put("namatype", _namatype);
 BA.debugLineNum = 259;BA.debugLine="idtype = a.Get(\"education_id\")";
Debug.ShouldStop(4);
_idtype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("education_id")))));Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 261;BA.debugLine="SpinType.Add(namatype)";
Debug.ShouldStop(16);
parent.mostCurrent._spintype.runVoidMethod ("Add",(Object)(_namatype));
 BA.debugLineNum = 262;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
Debug.ShouldStop(32);
parent.mostCurrent._spinnermapt.runVoidMethod ("Put",(Object)((_namatype)),(Object)((_idtype)));
 BA.debugLineNum = 263;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ID Map: "),_namatype,RemoteObject.createImmutable(" "),_idtype)));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 150;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 266;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 268;BA.debugLine="Dim village_array As List";
Debug.ShouldStop(2048);
_village_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("village_array", _village_array);
 BA.debugLineNum = 269;BA.debugLine="village_array = parser.NextArray";
Debug.ShouldStop(4096);
_village_array = _parser.runMethod(false,"NextArray");Debug.locals.put("village_array", _village_array);
 BA.debugLineNum = 270;BA.debugLine="For i=0 To village_array.Size -1";
Debug.ShouldStop(8192);
if (true) break;

case 13:
//for
this.state = 16;
step25 = 1;
limit25 = RemoteObject.solve(new RemoteObject[] {_village_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 154;
if (true) break;

case 154:
//C
this.state = 16;
if ((step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25)) this.state = 15;
if (true) break;

case 155:
//C
this.state = 154;
_i = ((int)(0 + _i + step25)) ;
Debug.locals.put("i", _i);
if (true) break;

case 15:
//C
this.state = 155;
 BA.debugLineNum = 271;BA.debugLine="Dim a As Map";
Debug.ShouldStop(16384);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 272;BA.debugLine="a = village_array.Get(i)";
Debug.ShouldStop(32768);
_a.setObject(_village_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 273;BA.debugLine="Dim namatype, idtype As String";
Debug.ShouldStop(65536);
_namatype = RemoteObject.createImmutable("");Debug.locals.put("namatype", _namatype);
_idtype = RemoteObject.createImmutable("");Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 274;BA.debugLine="namatype= a.Get(\"village_name\")";
Debug.ShouldStop(131072);
_namatype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("village_name")))));Debug.locals.put("namatype", _namatype);
 BA.debugLineNum = 275;BA.debugLine="idtype = a.Get(\"village_id\")";
Debug.ShouldStop(262144);
_idtype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("village_id")))));Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 277;BA.debugLine="SpinType.Add(namatype)";
Debug.ShouldStop(1048576);
parent.mostCurrent._spintype.runVoidMethod ("Add",(Object)(_namatype));
 BA.debugLineNum = 278;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
Debug.ShouldStop(2097152);
parent.mostCurrent._spinnermapt.runVoidMethod ("Put",(Object)((_namatype)),(Object)((_idtype)));
 BA.debugLineNum = 279;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ID Map: "),_namatype,RemoteObject.createImmutable(" "),_idtype)));
 if (true) break;
if (true) break;

case 16:
//C
this.state = 150;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 282;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 284;BA.debugLine="Dim datuk_array As List";
Debug.ShouldStop(134217728);
_datuk_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("datuk_array", _datuk_array);
 BA.debugLineNum = 285;BA.debugLine="datuk_array = parser.NextArray";
Debug.ShouldStop(268435456);
_datuk_array = _parser.runMethod(false,"NextArray");Debug.locals.put("datuk_array", _datuk_array);
 BA.debugLineNum = 286;BA.debugLine="For i=0 To datuk_array.Size -1";
Debug.ShouldStop(536870912);
if (true) break;

case 19:
//for
this.state = 22;
step39 = 1;
limit39 = RemoteObject.solve(new RemoteObject[] {_datuk_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 156;
if (true) break;

case 156:
//C
this.state = 22;
if ((step39 > 0 && _i <= limit39) || (step39 < 0 && _i >= limit39)) this.state = 21;
if (true) break;

case 157:
//C
this.state = 156;
_i = ((int)(0 + _i + step39)) ;
Debug.locals.put("i", _i);
if (true) break;

case 21:
//C
this.state = 157;
 BA.debugLineNum = 287;BA.debugLine="Dim a As Map";
Debug.ShouldStop(1073741824);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 288;BA.debugLine="a = datuk_array.Get(i)";
Debug.ShouldStop(-2147483648);
_a.setObject(_datuk_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 289;BA.debugLine="Dim namatype, idtype As String";
Debug.ShouldStop(1);
_namatype = RemoteObject.createImmutable("");Debug.locals.put("namatype", _namatype);
_idtype = RemoteObject.createImmutable("");Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 290;BA.debugLine="namatype= a.Get(\"datuk_name\")";
Debug.ShouldStop(2);
_namatype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("datuk_name")))));Debug.locals.put("namatype", _namatype);
 BA.debugLineNum = 291;BA.debugLine="idtype = a.Get(\"datuk_id\")";
Debug.ShouldStop(4);
_idtype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("datuk_id")))));Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 293;BA.debugLine="SpinType.Add(namatype)";
Debug.ShouldStop(16);
parent.mostCurrent._spintype.runVoidMethod ("Add",(Object)(_namatype));
 BA.debugLineNum = 294;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
Debug.ShouldStop(32);
parent.mostCurrent._spinnermapt.runVoidMethod ("Put",(Object)((_namatype)),(Object)((_idtype)));
 BA.debugLineNum = 295;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ID Map: "),_namatype,RemoteObject.createImmutable(" "),_idtype)));
 if (true) break;
if (true) break;

case 22:
//C
this.state = 150;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 297;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 299;BA.debugLine="Dim tribe_array As List";
Debug.ShouldStop(1024);
_tribe_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("tribe_array", _tribe_array);
 BA.debugLineNum = 300;BA.debugLine="tribe_array = parser.NextArray";
Debug.ShouldStop(2048);
_tribe_array = _parser.runMethod(false,"NextArray");Debug.locals.put("tribe_array", _tribe_array);
 BA.debugLineNum = 301;BA.debugLine="For i=0 To tribe_array.Size -1";
Debug.ShouldStop(4096);
if (true) break;

case 25:
//for
this.state = 28;
step53 = 1;
limit53 = RemoteObject.solve(new RemoteObject[] {_tribe_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 158;
if (true) break;

case 158:
//C
this.state = 28;
if ((step53 > 0 && _i <= limit53) || (step53 < 0 && _i >= limit53)) this.state = 27;
if (true) break;

case 159:
//C
this.state = 158;
_i = ((int)(0 + _i + step53)) ;
Debug.locals.put("i", _i);
if (true) break;

case 27:
//C
this.state = 159;
 BA.debugLineNum = 302;BA.debugLine="Dim a As Map";
Debug.ShouldStop(8192);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 303;BA.debugLine="a = tribe_array.Get(i)";
Debug.ShouldStop(16384);
_a.setObject(_tribe_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 304;BA.debugLine="Dim namatype, idtype As String";
Debug.ShouldStop(32768);
_namatype = RemoteObject.createImmutable("");Debug.locals.put("namatype", _namatype);
_idtype = RemoteObject.createImmutable("");Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 305;BA.debugLine="namatype= a.Get(\"name_of_tribe\")";
Debug.ShouldStop(65536);
_namatype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_tribe")))));Debug.locals.put("namatype", _namatype);
 BA.debugLineNum = 306;BA.debugLine="idtype = a.Get(\"tribe_id\")";
Debug.ShouldStop(131072);
_idtype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tribe_id")))));Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 308;BA.debugLine="SpinType.Add(namatype)";
Debug.ShouldStop(524288);
parent.mostCurrent._spintype.runVoidMethod ("Add",(Object)(_namatype));
 BA.debugLineNum = 309;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
Debug.ShouldStop(1048576);
parent.mostCurrent._spinnermapt.runVoidMethod ("Put",(Object)((_namatype)),(Object)((_idtype)));
 BA.debugLineNum = 310;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ID Map: "),_namatype,RemoteObject.createImmutable(" "),_idtype)));
 if (true) break;
if (true) break;

case 28:
//C
this.state = 150;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 312;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 314;BA.debugLine="Dim facility_array As List";
Debug.ShouldStop(33554432);
_facility_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("facility_array", _facility_array);
 BA.debugLineNum = 315;BA.debugLine="facility_array = parser.NextArray";
Debug.ShouldStop(67108864);
_facility_array = _parser.runMethod(false,"NextArray");Debug.locals.put("facility_array", _facility_array);
 BA.debugLineNum = 317;BA.debugLine="Dim cd As CustomLayoutDialog";
Debug.ShouldStop(268435456);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 318;BA.debugLine="Dim ScrollViewFac As ScrollView";
Debug.ShouldStop(536870912);
_scrollviewfac = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");Debug.locals.put("ScrollViewFac", _scrollviewfac);
 BA.debugLineNum = 320;BA.debugLine="lstChecks.Initialize";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._lstchecks.runVoidMethod ("Initialize");
 BA.debugLineNum = 321;BA.debugLine="ScrollViewFac.Initialize(50%y)";
Debug.ShouldStop(1);
_scrollviewfac.runVoidMethod ("Initialize",searchbuilding.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),searchbuilding.mostCurrent.activityBA)));
 BA.debugLineNum = 323;BA.debugLine="Dim sf As Object";
Debug.ShouldStop(4);
_sf = RemoteObject.createNew ("Object");Debug.locals.put("sf", _sf);
 BA.debugLineNum = 324;BA.debugLine="sf = cd.ShowAsync(\"Choose facility\", \"OK\", \"Ca";
Debug.ShouldStop(8);
_sf = _cd.runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Choose facility")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),searchbuilding.mostCurrent.activityBA,(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);
 BA.debugLineNum = 326;BA.debugLine="Dim arraynow As Int";
Debug.ShouldStop(32);
_arraynow = RemoteObject.createImmutable(0);Debug.locals.put("arraynow", _arraynow);
 BA.debugLineNum = 327;BA.debugLine="arraynow = facility_array.Size";
Debug.ShouldStop(64);
_arraynow = _facility_array.runMethod(true,"getSize");Debug.locals.put("arraynow", _arraynow);
 BA.debugLineNum = 328;BA.debugLine="For c=0 To arraynow-1";
Debug.ShouldStop(128);
if (true) break;

case 31:
//for
this.state = 34;
step75 = 1;
limit75 = RemoteObject.solve(new RemoteObject[] {_arraynow,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_c = 0 ;
Debug.locals.put("c", _c);
this.state = 160;
if (true) break;

case 160:
//C
this.state = 34;
if ((step75 > 0 && _c <= limit75) || (step75 < 0 && _c >= limit75)) this.state = 33;
if (true) break;

case 161:
//C
this.state = 160;
_c = ((int)(0 + _c + step75)) ;
Debug.locals.put("c", _c);
if (true) break;

case 33:
//C
this.state = 161;
 BA.debugLineNum = 329;BA.debugLine="Dim f As Map";
Debug.ShouldStop(256);
_f = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("f", _f);
 BA.debugLineNum = 330;BA.debugLine="f = facility_array.Get(c)";
Debug.ShouldStop(512);
_f.setObject(_facility_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _c))));
 BA.debugLineNum = 332;BA.debugLine="Dim Contentt As String";
Debug.ShouldStop(2048);
_contentt = RemoteObject.createImmutable("");Debug.locals.put("Contentt", _contentt);
 BA.debugLineNum = 333;BA.debugLine="Dim Contentid As String";
Debug.ShouldStop(4096);
_contentid = RemoteObject.createImmutable("");Debug.locals.put("Contentid", _contentid);
 BA.debugLineNum = 334;BA.debugLine="Contentid = f.Get(\"facility_id\")";
Debug.ShouldStop(8192);
_contentid = BA.ObjectToString(_f.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("facility_id")))));Debug.locals.put("Contentid", _contentid);
 BA.debugLineNum = 335;BA.debugLine="Contentt = f.Get(\"name_of_facility\")";
Debug.ShouldStop(16384);
_contentt = BA.ObjectToString(_f.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_facility")))));Debug.locals.put("Contentt", _contentt);
 BA.debugLineNum = 336;BA.debugLine="Dim chk As CheckBox";
Debug.ShouldStop(32768);
_chk = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("chk", _chk);
 BA.debugLineNum = 337;BA.debugLine="chk.Initialize(\"\")";
Debug.ShouldStop(65536);
_chk.runVoidMethod ("Initialize",searchbuilding.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 338;BA.debugLine="chk.Text = Contentid&Contentt";
Debug.ShouldStop(131072);
_chk.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_contentid,_contentt)));
 BA.debugLineNum = 339;BA.debugLine="chk.TextColor= Colors.Transparent";
Debug.ShouldStop(262144);
_chk.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 340;BA.debugLine="Dim lbl1 As Label";
Debug.ShouldStop(524288);
_lbl1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl1", _lbl1);
 BA.debugLineNum = 341;BA.debugLine="lbl1.Initialize(\"\")";
Debug.ShouldStop(1048576);
_lbl1.runVoidMethod ("Initialize",searchbuilding.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 342;BA.debugLine="lbl1.Text = Contentt";
Debug.ShouldStop(2097152);
_lbl1.runMethod(true,"setText",BA.ObjectToCharSequence(_contentt));
 BA.debugLineNum = 343;BA.debugLine="lbl1.TextColor = Colors.Black";
Debug.ShouldStop(4194304);
_lbl1.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 344;BA.debugLine="lbl1.Gravity = Gravity.CENTER_VERTICAL";
Debug.ShouldStop(8388608);
_lbl1.runMethod(true,"setGravity",parent.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"));
 BA.debugLineNum = 345;BA.debugLine="lstChecks.Add(chk)";
Debug.ShouldStop(16777216);
parent.mostCurrent._lstchecks.runVoidMethod ("Add",(Object)((_chk.getObject())));
 BA.debugLineNum = 346;BA.debugLine="ScrollViewFac.Panel.AddView(chk, 0, 5%y * (c";
Debug.ShouldStop(33554432);
_scrollviewfac.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_chk.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),searchbuilding.mostCurrent.activityBA),RemoteObject.createImmutable((_c))}, "*",0, 1)),(Object)(parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),searchbuilding.mostCurrent.activityBA)));
 BA.debugLineNum = 347;BA.debugLine="ScrollViewFac.Panel.AddView(lbl1, 10%x, 5%y";
Debug.ShouldStop(67108864);
_scrollviewfac.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_lbl1.getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),searchbuilding.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),searchbuilding.mostCurrent.activityBA),RemoteObject.createImmutable((_c))}, "*",0, 1)),(Object)(parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),searchbuilding.mostCurrent.activityBA)));
 BA.debugLineNum = 348;BA.debugLine="Log(\"fasilitas :\"&Contentt&\" ID:\"&Contentid&\"";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("fasilitas :"),_contentt,RemoteObject.createImmutable(" ID:"),_contentid,RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 34:
//C
this.state = 35;
Debug.locals.put("c", _c);
;
 BA.debugLineNum = 350;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 351;BA.debugLine="cd.SetSize(100%x, 80%y)";
Debug.ShouldStop(1073741824);
_cd.runVoidMethod ("SetSize",(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),searchbuilding.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 80)),searchbuilding.mostCurrent.activityBA)));
 BA.debugLineNum = 352;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","dialog_ready", searchbuilding.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), _sf);
this.state = 162;
return;
case 162:
//C
this.state = 35;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 353;BA.debugLine="pnl.AddView(ScrollViewFac,0,5%y,100%x,50%y)";
Debug.ShouldStop(1);
_pnl.runVoidMethod ("AddView",(Object)((_scrollviewfac.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),searchbuilding.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),searchbuilding.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),searchbuilding.mostCurrent.activityBA)));
 BA.debugLineNum = 354;BA.debugLine="ScrollViewFac.Panel.Height = lstChecks.Size *";
Debug.ShouldStop(2);
_scrollviewfac.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._lstchecks.runMethod(true,"getSize"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),searchbuilding.mostCurrent.activityBA)}, "*",0, 1));
 BA.debugLineNum = 355;BA.debugLine="Log(lstChecks.Size)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(parent.mostCurrent._lstchecks.runMethod(true,"getSize"))));
 BA.debugLineNum = 357;BA.debugLine="pnl.Color=Colors.White";
Debug.ShouldStop(16);
_pnl.runVoidMethod ("setColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 358;BA.debugLine="ScrollViewFac.Color= Colors.White";
Debug.ShouldStop(32);
_scrollviewfac.runVoidMethod ("setColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 361;BA.debugLine="Wait For (sf) Dialog_Result(Result As Int)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","dialog_result", searchbuilding.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), _sf);
this.state = 163;
return;
case 163:
//C
this.state = 35;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 362;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(512);
if (true) break;

case 35:
//if
this.state = 53;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 37;
}else {
this.state = 52;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 363;BA.debugLine="Log(\"BERHASIL DOOONG\")";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("BERHASIL DOOONG")));
 BA.debugLineNum = 364;BA.debugLine="Dim sb,sc As StringBuilder";
Debug.ShouldStop(2048);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
_sc = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sc", _sc);
 BA.debugLineNum = 365;BA.debugLine="sb.Initialize";
Debug.ShouldStop(4096);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 366;BA.debugLine="sc.Initialize";
Debug.ShouldStop(8192);
_sc.runVoidMethod ("Initialize");
 BA.debugLineNum = 367;BA.debugLine="count = 0";
Debug.ShouldStop(16384);
parent._count = BA.numberCast(int.class, 0);
 BA.debugLineNum = 368;BA.debugLine="For i = 0 To lstChecks.Size - 1";
Debug.ShouldStop(32768);
if (true) break;

case 38:
//for
this.state = 50;
step111 = 1;
limit111 = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._lstchecks.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 164;
if (true) break;

case 164:
//C
this.state = 50;
if ((step111 > 0 && _i <= limit111) || (step111 < 0 && _i >= limit111)) this.state = 40;
if (true) break;

case 165:
//C
this.state = 164;
_i = ((int)(0 + _i + step111)) ;
Debug.locals.put("i", _i);
if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 369;BA.debugLine="Dim chk As CheckBox";
Debug.ShouldStop(65536);
_chk = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("chk", _chk);
 BA.debugLineNum = 370;BA.debugLine="chk = lstChecks.Get(i)";
Debug.ShouldStop(131072);
_chk.setObject(parent.mostCurrent._lstchecks.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 371;BA.debugLine="Dim chkSub As String";
Debug.ShouldStop(262144);
_chksub = RemoteObject.createImmutable("");Debug.locals.put("chkSub", _chksub);
 BA.debugLineNum = 372;BA.debugLine="chkSub = chk.Text";
Debug.ShouldStop(524288);
_chksub = _chk.runMethod(true,"getText");Debug.locals.put("chkSub", _chksub);
 BA.debugLineNum = 373;BA.debugLine="Dim idCheck,textCheck As String";
Debug.ShouldStop(1048576);
_idcheck = RemoteObject.createImmutable("");Debug.locals.put("idCheck", _idcheck);
_textcheck = RemoteObject.createImmutable("");Debug.locals.put("textCheck", _textcheck);
 BA.debugLineNum = 374;BA.debugLine="If Contentid.Length == 1 Then";
Debug.ShouldStop(2097152);
if (true) break;

case 41:
//if
this.state = 46;
if (RemoteObject.solveBoolean("=",_contentid.runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
this.state = 43;
}else {
this.state = 45;
}if (true) break;

case 43:
//C
this.state = 46;
 BA.debugLineNum = 375;BA.debugLine="idCheck = chkSub.SubString2(0,1)";
Debug.ShouldStop(4194304);
_idcheck = _chksub.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("idCheck", _idcheck);
 BA.debugLineNum = 376;BA.debugLine="textCheck = chkSub.SubString(1)";
Debug.ShouldStop(8388608);
_textcheck = _chksub.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("textCheck", _textcheck);
 if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 378;BA.debugLine="idCheck = chkSub.SubString2(0,2)";
Debug.ShouldStop(33554432);
_idcheck = _chksub.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("idCheck", _idcheck);
 BA.debugLineNum = 379;BA.debugLine="textCheck = chkSub.SubString(2)";
Debug.ShouldStop(67108864);
_textcheck = _chksub.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("textCheck", _textcheck);
 if (true) break;
;
 BA.debugLineNum = 382;BA.debugLine="If chk.Checked Then";
Debug.ShouldStop(536870912);

case 46:
//if
this.state = 49;
if (_chk.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 383;BA.debugLine="sb.Append(idCheck&\",\")";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(_idcheck,RemoteObject.createImmutable(","))));
 BA.debugLineNum = 384;BA.debugLine="sc.Append(textCheck&\",\")";
Debug.ShouldStop(-2147483648);
_sc.runVoidMethod ("Append",(Object)(RemoteObject.concat(_textcheck,RemoteObject.createImmutable(","))));
 BA.debugLineNum = 385;BA.debugLine="count = count + 1";
Debug.ShouldStop(1);
parent._count = RemoteObject.solve(new RemoteObject[] {parent._count,RemoteObject.createImmutable(1)}, "+",1, 1);
 if (true) break;

case 49:
//C
this.state = 165;
;
 if (true) break;
if (true) break;

case 50:
//C
this.state = 53;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 389;BA.debugLine="Dim stridCheck,strtextCheck As String";
Debug.ShouldStop(16);
_stridcheck = RemoteObject.createImmutable("");Debug.locals.put("stridCheck", _stridcheck);
_strtextcheck = RemoteObject.createImmutable("");Debug.locals.put("strtextCheck", _strtextcheck);
 BA.debugLineNum = 390;BA.debugLine="stridCheck = sb.ToString";
Debug.ShouldStop(32);
_stridcheck = _sb.runMethod(true,"ToString");Debug.locals.put("stridCheck", _stridcheck);
 BA.debugLineNum = 391;BA.debugLine="strtextCheck = sc.ToString";
Debug.ShouldStop(64);
_strtextcheck = _sc.runMethod(true,"ToString");Debug.locals.put("strtextCheck", _strtextcheck);
 BA.debugLineNum = 393;BA.debugLine="idCheckSub= stridCheck.SubString2(0,stridChec";
Debug.ShouldStop(256);
parent.mostCurrent._idchecksub = _stridcheck.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_stridcheck.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 394;BA.debugLine="textCheckSub= strtextCheck.SubString2(0,strte";
Debug.ShouldStop(512);
parent.mostCurrent._textchecksub = _strtextcheck.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_strtextcheck.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 395;BA.debugLine="Log(\"length id: \"&idCheckSub.Length&\" | \"& id";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("length id: "),parent.mostCurrent._idchecksub.runMethod(true,"length"),RemoteObject.createImmutable(" | "),parent.mostCurrent._idchecksub)));
 BA.debugLineNum = 396;BA.debugLine="Log(\"length text: \"&textCheckSub.Length&\" | \"";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("length text: "),parent.mostCurrent._textchecksub.runMethod(true,"length"),RemoteObject.createImmutable(" | "),parent.mostCurrent._textchecksub)));
 if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 398;BA.debugLine="Log(\"CANCEL DONG\")";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("CANCEL DONG")));
 if (true) break;

case 53:
//C
this.state = 150;
;
 if (true) break;

case 55:
//C
this.state = 56;
 BA.debugLineNum = 411;BA.debugLine="Dim jorong_array As List";
Debug.ShouldStop(67108864);
_jorong_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("jorong_array", _jorong_array);
 BA.debugLineNum = 412;BA.debugLine="jorong_array = parser.NextArray";
Debug.ShouldStop(134217728);
_jorong_array = _parser.runMethod(false,"NextArray");Debug.locals.put("jorong_array", _jorong_array);
 BA.debugLineNum = 413;BA.debugLine="For i=0 To jorong_array.Size -1";
Debug.ShouldStop(268435456);
if (true) break;

case 56:
//for
this.state = 59;
step143 = 1;
limit143 = RemoteObject.solve(new RemoteObject[] {_jorong_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 166;
if (true) break;

case 166:
//C
this.state = 59;
if ((step143 > 0 && _i <= limit143) || (step143 < 0 && _i >= limit143)) this.state = 58;
if (true) break;

case 167:
//C
this.state = 166;
_i = ((int)(0 + _i + step143)) ;
Debug.locals.put("i", _i);
if (true) break;

case 58:
//C
this.state = 167;
 BA.debugLineNum = 414;BA.debugLine="Dim a As Map";
Debug.ShouldStop(536870912);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 415;BA.debugLine="a = jorong_array.Get(i)";
Debug.ShouldStop(1073741824);
_a.setObject(_jorong_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 416;BA.debugLine="Dim namatype, idtype As String";
Debug.ShouldStop(-2147483648);
_namatype = RemoteObject.createImmutable("");Debug.locals.put("namatype", _namatype);
_idtype = RemoteObject.createImmutable("");Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 417;BA.debugLine="namatype= a.Get(\"name_of_jorong\")";
Debug.ShouldStop(1);
_namatype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_jorong")))));Debug.locals.put("namatype", _namatype);
 BA.debugLineNum = 418;BA.debugLine="idtype = a.Get(\"jorong_id\")";
Debug.ShouldStop(2);
_idtype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("jorong_id")))));Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 420;BA.debugLine="SpinType.Add(namatype)";
Debug.ShouldStop(8);
parent.mostCurrent._spintype.runVoidMethod ("Add",(Object)(_namatype));
 BA.debugLineNum = 421;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
Debug.ShouldStop(16);
parent.mostCurrent._spinnermapt.runVoidMethod ("Put",(Object)((_namatype)),(Object)((_idtype)));
 BA.debugLineNum = 422;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ID Map: "),_namatype,RemoteObject.createImmutable(" "),_idtype)));
 if (true) break;
if (true) break;

case 59:
//C
this.state = 150;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 424;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 426;BA.debugLine="Dim type_array As List";
Debug.ShouldStop(512);
_type_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("type_array", _type_array);
 BA.debugLineNum = 427;BA.debugLine="type_array = parser.NextArray";
Debug.ShouldStop(1024);
_type_array = _parser.runMethod(false,"NextArray");Debug.locals.put("type_array", _type_array);
 BA.debugLineNum = 428;BA.debugLine="For i=0 To type_array.Size -1";
Debug.ShouldStop(2048);
if (true) break;

case 62:
//for
this.state = 71;
step157 = 1;
limit157 = RemoteObject.solve(new RemoteObject[] {_type_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 168;
if (true) break;

case 168:
//C
this.state = 71;
if ((step157 > 0 && _i <= limit157) || (step157 < 0 && _i >= limit157)) this.state = 64;
if (true) break;

case 169:
//C
this.state = 168;
_i = ((int)(0 + _i + step157)) ;
Debug.locals.put("i", _i);
if (true) break;

case 64:
//C
this.state = 65;
 BA.debugLineNum = 429;BA.debugLine="Dim a As Map";
Debug.ShouldStop(4096);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 430;BA.debugLine="a = type_array.Get(i)";
Debug.ShouldStop(8192);
_a.setObject(_type_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 431;BA.debugLine="Dim namatype, idtype As String";
Debug.ShouldStop(16384);
_namatype = RemoteObject.createImmutable("");Debug.locals.put("namatype", _namatype);
_idtype = RemoteObject.createImmutable("");Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 432;BA.debugLine="Select idspin";
Debug.ShouldStop(32768);
if (true) break;

case 65:
//select
this.state = 70;
switch (BA.switchObjectToInt(parent._idspin,BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Msme"),BA.ObjectToString("Health"),BA.ObjectToString("Educational"))) {
case 0: 
case 1: 
case 2: 
case 3: {
this.state = 67;
if (true) break;
}
case 4: {
this.state = 69;
if (true) break;
}
}
if (true) break;

case 67:
//C
this.state = 70;
 BA.debugLineNum = 434;BA.debugLine="namatype= a.Get(\"name_of_type\")";
Debug.ShouldStop(131072);
_namatype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_type")))));Debug.locals.put("namatype", _namatype);
 BA.debugLineNum = 435;BA.debugLine="idtype = a.Get(\"type_id\")";
Debug.ShouldStop(262144);
_idtype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_id")))));Debug.locals.put("idtype", _idtype);
 if (true) break;

case 69:
//C
this.state = 70;
 BA.debugLineNum = 437;BA.debugLine="namatype= a.Get(\"name_of_level\")";
Debug.ShouldStop(1048576);
_namatype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_level")))));Debug.locals.put("namatype", _namatype);
 BA.debugLineNum = 438;BA.debugLine="idtype = a.Get(\"level_id\")";
Debug.ShouldStop(2097152);
_idtype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("level_id")))));Debug.locals.put("idtype", _idtype);
 if (true) break;

case 70:
//C
this.state = 169;
;
 BA.debugLineNum = 441;BA.debugLine="SpinType.Add(namatype)";
Debug.ShouldStop(16777216);
parent.mostCurrent._spintype.runVoidMethod ("Add",(Object)(_namatype));
 BA.debugLineNum = 442;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
Debug.ShouldStop(33554432);
parent.mostCurrent._spinnermapt.runVoidMethod ("Put",(Object)((_namatype)),(Object)((_idtype)));
 BA.debugLineNum = 443;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ID Map: "),_namatype,RemoteObject.createImmutable(" "),_idtype)));
 if (true) break;
if (true) break;

case 71:
//C
this.state = 150;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 445;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 73:
//C
this.state = 74;
 BA.debugLineNum = 447;BA.debugLine="Dim cons_array As List";
Debug.ShouldStop(1073741824);
_cons_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("cons_array", _cons_array);
 BA.debugLineNum = 448;BA.debugLine="cons_array = parser.NextArray";
Debug.ShouldStop(-2147483648);
_cons_array = _parser.runMethod(false,"NextArray");Debug.locals.put("cons_array", _cons_array);
 BA.debugLineNum = 449;BA.debugLine="For i=0 To cons_array.Size -1";
Debug.ShouldStop(1);
if (true) break;

case 74:
//for
this.state = 77;
step177 = 1;
limit177 = RemoteObject.solve(new RemoteObject[] {_cons_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 170;
if (true) break;

case 170:
//C
this.state = 77;
if ((step177 > 0 && _i <= limit177) || (step177 < 0 && _i >= limit177)) this.state = 76;
if (true) break;

case 171:
//C
this.state = 170;
_i = ((int)(0 + _i + step177)) ;
Debug.locals.put("i", _i);
if (true) break;

case 76:
//C
this.state = 171;
 BA.debugLineNum = 450;BA.debugLine="Dim a As Map";
Debug.ShouldStop(2);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 451;BA.debugLine="a = cons_array.Get(i)";
Debug.ShouldStop(4);
_a.setObject(_cons_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 452;BA.debugLine="Dim namatype, idtype As String";
Debug.ShouldStop(8);
_namatype = RemoteObject.createImmutable("");Debug.locals.put("namatype", _namatype);
_idtype = RemoteObject.createImmutable("");Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 453;BA.debugLine="namatype= a.Get(\"name_of_type\")";
Debug.ShouldStop(16);
_namatype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_type")))));Debug.locals.put("namatype", _namatype);
 BA.debugLineNum = 454;BA.debugLine="idtype = a.Get(\"type_id\")";
Debug.ShouldStop(32);
_idtype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_id")))));Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 456;BA.debugLine="SpinType.Add(namatype)";
Debug.ShouldStop(128);
parent.mostCurrent._spintype.runVoidMethod ("Add",(Object)(_namatype));
 BA.debugLineNum = 457;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
Debug.ShouldStop(256);
parent.mostCurrent._spinnermapt.runVoidMethod ("Put",(Object)((_namatype)),(Object)((_idtype)));
 BA.debugLineNum = 458;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ID Map: "),_namatype,RemoteObject.createImmutable(" "),_idtype)));
 if (true) break;
if (true) break;

case 77:
//C
this.state = 150;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 460;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 79:
//C
this.state = 80;
 BA.debugLineNum = 462;BA.debugLine="Dim worship_array As List";
Debug.ShouldStop(8192);
_worship_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("worship_array", _worship_array);
 BA.debugLineNum = 463;BA.debugLine="worship_array = parser.NextArray";
Debug.ShouldStop(16384);
_worship_array = _parser.runMethod(false,"NextArray");Debug.locals.put("worship_array", _worship_array);
 BA.debugLineNum = 464;BA.debugLine="If worship_array.Size-1 < 0 Then";
Debug.ShouldStop(32768);
if (true) break;

case 80:
//if
this.state = 89;
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_worship_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
this.state = 82;
}else {
this.state = 84;
}if (true) break;

case 82:
//C
this.state = 89;
 BA.debugLineNum = 465;BA.debugLine="Msgbox(\"Not Found\",\"Warning\")";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Not Found")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 BA.debugLineNum = 466;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 84:
//C
this.state = 85;
 BA.debugLineNum = 468;BA.debugLine="For i=0 To worship_array.Size - 1";
Debug.ShouldStop(524288);
if (true) break;

case 85:
//for
this.state = 88;
step195 = 1;
limit195 = RemoteObject.solve(new RemoteObject[] {_worship_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 172;
if (true) break;

case 172:
//C
this.state = 88;
if ((step195 > 0 && _i <= limit195) || (step195 < 0 && _i >= limit195)) this.state = 87;
if (true) break;

case 173:
//C
this.state = 172;
_i = ((int)(0 + _i + step195)) ;
Debug.locals.put("i", _i);
if (true) break;

case 87:
//C
this.state = 173;
 BA.debugLineNum = 469;BA.debugLine="Dim a As Map";
Debug.ShouldStop(1048576);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 470;BA.debugLine="a = worship_array.Get(i)";
Debug.ShouldStop(2097152);
_a.setObject(_worship_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 472;BA.debugLine="lat = a.Get(\"latitude\")";
Debug.ShouldStop(8388608);
parent._lat = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("latitude")))));
 BA.debugLineNum = 473;BA.debugLine="lng = a.Get(\"longitude\")";
Debug.ShouldStop(16777216);
parent._lng = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("longitude")))));
 BA.debugLineNum = 474;BA.debugLine="Log(lat)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(parent._lat));
 BA.debugLineNum = 475;BA.debugLine="Log(lng)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(parent._lng));
 BA.debugLineNum = 476;BA.debugLine="Dim number As String";
Debug.ShouldStop(134217728);
_number = RemoteObject.createImmutable("");Debug.locals.put("number", _number);
 BA.debugLineNum = 477;BA.debugLine="Dim nama As String";
Debug.ShouldStop(268435456);
_nama = RemoteObject.createImmutable("");Debug.locals.put("nama", _nama);
 BA.debugLineNum = 478;BA.debugLine="number = a.Get(\"worship_building_id\")";
Debug.ShouldStop(536870912);
_number = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("worship_building_id")))));Debug.locals.put("number", _number);
 BA.debugLineNum = 479;BA.debugLine="nama = a.Get(\"name_of_worship_building\")";
Debug.ShouldStop(1073741824);
_nama = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_worship_building")))));Debug.locals.put("nama", _nama);
 BA.debugLineNum = 480;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, number";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._clv2.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getWidth"),_number,_nama).getObject()),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 88:
//C
this.state = 89;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 484;BA.debugLine="CLV2.sv.Height = (PanelBuildingList.Height+0.";
Debug.ShouldStop(8);
parent.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0.5)),searchbuilding.mostCurrent.activityBA)}, "+",1, 1)),_worship_array.runMethod(true,"getSize")}, "*",0, 1));
 BA.debugLineNum = 485;BA.debugLine="ScrollView1.Top = WebViewTest.Height + WebVie";
Debug.ShouldStop(16);
parent.mostCurrent._scrollview1.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._webviewtest.runMethod(true,"getHeight"),parent.mostCurrent._webviewtest.runMethod(true,"getTop"),parent.mostCurrent._panelsearch.runMethod(true,"getHeight")}, "++",2, 1));
 BA.debugLineNum = 486;BA.debugLine="ScrollView1.Height = 100%y - (ScrollView1.Top";
Debug.ShouldStop(32);
parent.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),searchbuilding.mostCurrent.activityBA),(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._scrollview1.runMethod(true,"getTop"),parent.mostCurrent._paneltoolbar.runMethod(true,"getHeight")}, "+",1, 1))}, "-",1, 1));
 BA.debugLineNum = 487;BA.debugLine="CLV2.AsView.Height = CLV2.sv.Height";
Debug.ShouldStop(64);
parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"setHeight",parent.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"getHeight"));
 BA.debugLineNum = 488;BA.debugLine="ScrollView1.Panel.Height = CLV2.AsView.Height";
Debug.ShouldStop(128);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 489;BA.debugLine="Log(nama)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(_nama));
 BA.debugLineNum = 490;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 89:
//C
this.state = 150;
;
 if (true) break;

case 91:
//C
this.state = 92;
 BA.debugLineNum = 493;BA.debugLine="Dim office_array As List";
Debug.ShouldStop(4096);
_office_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("office_array", _office_array);
 BA.debugLineNum = 494;BA.debugLine="office_array = parser.NextArray";
Debug.ShouldStop(8192);
_office_array = _parser.runMethod(false,"NextArray");Debug.locals.put("office_array", _office_array);
 BA.debugLineNum = 495;BA.debugLine="If office_array.Size -1 < 0 Then";
Debug.ShouldStop(16384);
if (true) break;

case 92:
//if
this.state = 101;
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_office_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
this.state = 94;
}else {
this.state = 96;
}if (true) break;

case 94:
//C
this.state = 101;
 BA.debugLineNum = 496;BA.debugLine="Msgbox(\"Not Found\",\"Warning\")";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Not Found")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 BA.debugLineNum = 497;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 96:
//C
this.state = 97;
 BA.debugLineNum = 499;BA.debugLine="For i=0 To office_array.Size - 1";
Debug.ShouldStop(262144);
if (true) break;

case 97:
//for
this.state = 100;
step223 = 1;
limit223 = RemoteObject.solve(new RemoteObject[] {_office_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 174;
if (true) break;

case 174:
//C
this.state = 100;
if ((step223 > 0 && _i <= limit223) || (step223 < 0 && _i >= limit223)) this.state = 99;
if (true) break;

case 175:
//C
this.state = 174;
_i = ((int)(0 + _i + step223)) ;
Debug.locals.put("i", _i);
if (true) break;

case 99:
//C
this.state = 175;
 BA.debugLineNum = 500;BA.debugLine="Dim a As Map";
Debug.ShouldStop(524288);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 501;BA.debugLine="a = office_array.Get(i)";
Debug.ShouldStop(1048576);
_a.setObject(_office_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 503;BA.debugLine="lat = a.Get(\"latitude\")";
Debug.ShouldStop(4194304);
parent._lat = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("latitude")))));
 BA.debugLineNum = 504;BA.debugLine="lng = a.Get(\"longitude\")";
Debug.ShouldStop(8388608);
parent._lng = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("longitude")))));
 BA.debugLineNum = 505;BA.debugLine="Log(lat)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(parent._lat));
 BA.debugLineNum = 506;BA.debugLine="Log(lng)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(parent._lng));
 BA.debugLineNum = 507;BA.debugLine="Dim number As String";
Debug.ShouldStop(67108864);
_number = RemoteObject.createImmutable("");Debug.locals.put("number", _number);
 BA.debugLineNum = 508;BA.debugLine="Dim nama As String";
Debug.ShouldStop(134217728);
_nama = RemoteObject.createImmutable("");Debug.locals.put("nama", _nama);
 BA.debugLineNum = 509;BA.debugLine="number = a.Get(\"office_building_id\")";
Debug.ShouldStop(268435456);
_number = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("office_building_id")))));Debug.locals.put("number", _number);
 BA.debugLineNum = 510;BA.debugLine="nama = a.Get(\"name_of_office_building\")";
Debug.ShouldStop(536870912);
_nama = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_office_building")))));Debug.locals.put("nama", _nama);
 BA.debugLineNum = 511;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, numbe";
Debug.ShouldStop(1073741824);
parent.mostCurrent._clv2.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getWidth"),_number,_nama).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 512;BA.debugLine="CLV2.AsView.Height = PanelListItem.Height*(i";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._panellistitem.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))}, "*",0, 1));
 if (true) break;
if (true) break;

case 100:
//C
this.state = 101;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 515;BA.debugLine="CLV2.AsView.Height = PanelBuildingList.Height";
Debug.ShouldStop(4);
parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"),_office_array.runMethod(true,"getSize")}, "*",0, 1));
 BA.debugLineNum = 516;BA.debugLine="ScrollView1.Top = WebViewTest.Height + WebVie";
Debug.ShouldStop(8);
parent.mostCurrent._scrollview1.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._webviewtest.runMethod(true,"getHeight"),parent.mostCurrent._webviewtest.runMethod(true,"getTop"),parent.mostCurrent._panelsearch.runMethod(true,"getHeight")}, "++",2, 1));
 BA.debugLineNum = 517;BA.debugLine="CLV2.AsView.Height = CLV2.AsView.Height + 4%y";
Debug.ShouldStop(16);
parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getHeight"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),searchbuilding.mostCurrent.activityBA)}, "+",1, 1));
 BA.debugLineNum = 518;BA.debugLine="CLV2.sv.Height = CLV2.AsView.Height";
Debug.ShouldStop(32);
parent.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"setHeight",parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 519;BA.debugLine="ScrollView1.Panel.Height = CLV2.sv.Height";
Debug.ShouldStop(64);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",parent.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"getHeight"));
 BA.debugLineNum = 520;BA.debugLine="ScrollView1.Height = 100%y - (ScrollView1.Top";
Debug.ShouldStop(128);
parent.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),searchbuilding.mostCurrent.activityBA),(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._scrollview1.runMethod(true,"getTop"),parent.mostCurrent._paneltoolbar.runMethod(true,"getHeight")}, "+",1, 1))}, "-",1, 1));
 BA.debugLineNum = 521;BA.debugLine="Log(nama)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(_nama));
 BA.debugLineNum = 522;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 101:
//C
this.state = 150;
;
 if (true) break;

case 103:
//C
this.state = 104;
 BA.debugLineNum = 525;BA.debugLine="Dim education_array As List";
Debug.ShouldStop(4096);
_education_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("education_array", _education_array);
 BA.debugLineNum = 526;BA.debugLine="education_array = parser.NextArray";
Debug.ShouldStop(8192);
_education_array = _parser.runMethod(false,"NextArray");Debug.locals.put("education_array", _education_array);
 BA.debugLineNum = 527;BA.debugLine="If education_array.Size -1 < 0 Then";
Debug.ShouldStop(16384);
if (true) break;

case 104:
//if
this.state = 113;
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_education_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
this.state = 106;
}else {
this.state = 108;
}if (true) break;

case 106:
//C
this.state = 113;
 BA.debugLineNum = 528;BA.debugLine="Msgbox(\"Not Found\",\"Warning\")";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Not Found")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 BA.debugLineNum = 529;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 108:
//C
this.state = 109;
 BA.debugLineNum = 531;BA.debugLine="For i=0 To education_array.Size - 1";
Debug.ShouldStop(262144);
if (true) break;

case 109:
//for
this.state = 112;
step253 = 1;
limit253 = RemoteObject.solve(new RemoteObject[] {_education_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 176;
if (true) break;

case 176:
//C
this.state = 112;
if ((step253 > 0 && _i <= limit253) || (step253 < 0 && _i >= limit253)) this.state = 111;
if (true) break;

case 177:
//C
this.state = 176;
_i = ((int)(0 + _i + step253)) ;
Debug.locals.put("i", _i);
if (true) break;

case 111:
//C
this.state = 177;
 BA.debugLineNum = 532;BA.debugLine="Dim a As Map";
Debug.ShouldStop(524288);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 533;BA.debugLine="a = education_array.Get(i)";
Debug.ShouldStop(1048576);
_a.setObject(_education_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 535;BA.debugLine="lat = a.Get(\"latitude\")";
Debug.ShouldStop(4194304);
parent._lat = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("latitude")))));
 BA.debugLineNum = 536;BA.debugLine="lng = a.Get(\"longitude\")";
Debug.ShouldStop(8388608);
parent._lng = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("longitude")))));
 BA.debugLineNum = 537;BA.debugLine="Log(lat)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(parent._lat));
 BA.debugLineNum = 538;BA.debugLine="Log(lng)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(parent._lng));
 BA.debugLineNum = 539;BA.debugLine="Dim number As String";
Debug.ShouldStop(67108864);
_number = RemoteObject.createImmutable("");Debug.locals.put("number", _number);
 BA.debugLineNum = 540;BA.debugLine="Dim nama As String";
Debug.ShouldStop(134217728);
_nama = RemoteObject.createImmutable("");Debug.locals.put("nama", _nama);
 BA.debugLineNum = 541;BA.debugLine="number = a.Get(\"educational_building_id\")";
Debug.ShouldStop(268435456);
_number = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("educational_building_id")))));Debug.locals.put("number", _number);
 BA.debugLineNum = 542;BA.debugLine="nama = a.Get(\"name_of_educational_building\")";
Debug.ShouldStop(536870912);
_nama = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_educational_building")))));Debug.locals.put("nama", _nama);
 BA.debugLineNum = 543;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, numbe";
Debug.ShouldStop(1073741824);
parent.mostCurrent._clv2.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getWidth"),_number,_nama).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 544;BA.debugLine="CLV2.AsView.Height = PanelListItem.Height*(i";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._panellistitem.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))}, "*",0, 1));
 if (true) break;
if (true) break;

case 112:
//C
this.state = 113;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 547;BA.debugLine="CLV2.AsView.Height = PanelBuildingList.Height";
Debug.ShouldStop(4);
parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"),_education_array.runMethod(true,"getSize")}, "*",0, 1));
 BA.debugLineNum = 548;BA.debugLine="ScrollView1.Top = WebViewTest.Height + WebVie";
Debug.ShouldStop(8);
parent.mostCurrent._scrollview1.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._webviewtest.runMethod(true,"getHeight"),parent.mostCurrent._webviewtest.runMethod(true,"getTop"),parent.mostCurrent._panelsearch.runMethod(true,"getHeight")}, "++",2, 1));
 BA.debugLineNum = 549;BA.debugLine="CLV2.AsView.Height = CLV2.AsView.Height + 4%y";
Debug.ShouldStop(16);
parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getHeight"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),searchbuilding.mostCurrent.activityBA)}, "+",1, 1));
 BA.debugLineNum = 550;BA.debugLine="CLV2.sv.Height = CLV2.AsView.Height";
Debug.ShouldStop(32);
parent.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"setHeight",parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 551;BA.debugLine="ScrollView1.Panel.Height = CLV2.sv.Height";
Debug.ShouldStop(64);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",parent.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"getHeight"));
 BA.debugLineNum = 552;BA.debugLine="ScrollView1.Height = 100%y - (ScrollView1.Top";
Debug.ShouldStop(128);
parent.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),searchbuilding.mostCurrent.activityBA),(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._scrollview1.runMethod(true,"getTop"),parent.mostCurrent._paneltoolbar.runMethod(true,"getHeight")}, "+",1, 1))}, "-",1, 1));
 BA.debugLineNum = 553;BA.debugLine="Log(nama)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(_nama));
 BA.debugLineNum = 554;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 113:
//C
this.state = 150;
;
 if (true) break;

case 115:
//C
this.state = 116;
 BA.debugLineNum = 557;BA.debugLine="Dim health_array As List";
Debug.ShouldStop(4096);
_health_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("health_array", _health_array);
 BA.debugLineNum = 558;BA.debugLine="health_array = parser.NextArray";
Debug.ShouldStop(8192);
_health_array = _parser.runMethod(false,"NextArray");Debug.locals.put("health_array", _health_array);
 BA.debugLineNum = 559;BA.debugLine="If health_array.Size-1 < 0 Then";
Debug.ShouldStop(16384);
if (true) break;

case 116:
//if
this.state = 125;
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_health_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
this.state = 118;
}else {
this.state = 120;
}if (true) break;

case 118:
//C
this.state = 125;
 BA.debugLineNum = 560;BA.debugLine="Msgbox(\"Not Found\",\"Warning\")";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Not Found")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 BA.debugLineNum = 561;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 120:
//C
this.state = 121;
 BA.debugLineNum = 563;BA.debugLine="For i=0 To health_array.Size - 1";
Debug.ShouldStop(262144);
if (true) break;

case 121:
//for
this.state = 124;
step283 = 1;
limit283 = RemoteObject.solve(new RemoteObject[] {_health_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 178;
if (true) break;

case 178:
//C
this.state = 124;
if ((step283 > 0 && _i <= limit283) || (step283 < 0 && _i >= limit283)) this.state = 123;
if (true) break;

case 179:
//C
this.state = 178;
_i = ((int)(0 + _i + step283)) ;
Debug.locals.put("i", _i);
if (true) break;

case 123:
//C
this.state = 179;
 BA.debugLineNum = 564;BA.debugLine="Dim a As Map";
Debug.ShouldStop(524288);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 565;BA.debugLine="a = health_array.Get(i)";
Debug.ShouldStop(1048576);
_a.setObject(_health_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 567;BA.debugLine="lat = a.Get(\"latitude\")";
Debug.ShouldStop(4194304);
parent._lat = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("latitude")))));
 BA.debugLineNum = 568;BA.debugLine="lng = a.Get(\"longitude\")";
Debug.ShouldStop(8388608);
parent._lng = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("longitude")))));
 BA.debugLineNum = 569;BA.debugLine="Log(lat)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(parent._lat));
 BA.debugLineNum = 570;BA.debugLine="Log(lng)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(parent._lng));
 BA.debugLineNum = 571;BA.debugLine="Dim number As String";
Debug.ShouldStop(67108864);
_number = RemoteObject.createImmutable("");Debug.locals.put("number", _number);
 BA.debugLineNum = 572;BA.debugLine="Dim nama As String";
Debug.ShouldStop(134217728);
_nama = RemoteObject.createImmutable("");Debug.locals.put("nama", _nama);
 BA.debugLineNum = 573;BA.debugLine="number = a.Get(\"health_building_id\")";
Debug.ShouldStop(268435456);
_number = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("health_building_id")))));Debug.locals.put("number", _number);
 BA.debugLineNum = 574;BA.debugLine="nama = a.Get(\"name_of_health_building\")";
Debug.ShouldStop(536870912);
_nama = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_health_building")))));Debug.locals.put("nama", _nama);
 BA.debugLineNum = 575;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, numbe";
Debug.ShouldStop(1073741824);
parent.mostCurrent._clv2.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getWidth"),_number,_nama).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 576;BA.debugLine="CLV2.AsView.Height = PanelListItem.Height*(i";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._panellistitem.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))}, "*",0, 1));
 if (true) break;
if (true) break;

case 124:
//C
this.state = 125;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 579;BA.debugLine="CLV2.AsView.Height = PanelBuildingList.Height";
Debug.ShouldStop(4);
parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"),_health_array.runMethod(true,"getSize")}, "*",0, 1));
 BA.debugLineNum = 580;BA.debugLine="ScrollView1.Top = WebViewTest.Height + WebVie";
Debug.ShouldStop(8);
parent.mostCurrent._scrollview1.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._webviewtest.runMethod(true,"getHeight"),parent.mostCurrent._webviewtest.runMethod(true,"getTop"),parent.mostCurrent._panelsearch.runMethod(true,"getHeight")}, "++",2, 1));
 BA.debugLineNum = 581;BA.debugLine="CLV2.AsView.Height = CLV2.AsView.Height + 4%y";
Debug.ShouldStop(16);
parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getHeight"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),searchbuilding.mostCurrent.activityBA)}, "+",1, 1));
 BA.debugLineNum = 582;BA.debugLine="CLV2.sv.Height = CLV2.AsView.Height";
Debug.ShouldStop(32);
parent.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"setHeight",parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 583;BA.debugLine="ScrollView1.Panel.Height = CLV2.sv.Height";
Debug.ShouldStop(64);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",parent.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"getHeight"));
 BA.debugLineNum = 584;BA.debugLine="ScrollView1.Height = 100%y - (ScrollView1.Top";
Debug.ShouldStop(128);
parent.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),searchbuilding.mostCurrent.activityBA),(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._scrollview1.runMethod(true,"getTop"),parent.mostCurrent._paneltoolbar.runMethod(true,"getHeight")}, "+",1, 1))}, "-",1, 1));
 BA.debugLineNum = 585;BA.debugLine="Log(nama)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(_nama));
 BA.debugLineNum = 586;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 125:
//C
this.state = 150;
;
 if (true) break;

case 127:
//C
this.state = 128;
 BA.debugLineNum = 589;BA.debugLine="Dim msme_array As List";
Debug.ShouldStop(4096);
_msme_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("msme_array", _msme_array);
 BA.debugLineNum = 590;BA.debugLine="msme_array = parser.NextArray";
Debug.ShouldStop(8192);
_msme_array = _parser.runMethod(false,"NextArray");Debug.locals.put("msme_array", _msme_array);
 BA.debugLineNum = 591;BA.debugLine="If msme_array.Size-1 < 0 Then";
Debug.ShouldStop(16384);
if (true) break;

case 128:
//if
this.state = 137;
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_msme_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
this.state = 130;
}else {
this.state = 132;
}if (true) break;

case 130:
//C
this.state = 137;
 BA.debugLineNum = 592;BA.debugLine="Msgbox(\"Not Found\",\"Warning\")";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Not Found")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 BA.debugLineNum = 593;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 132:
//C
this.state = 133;
 BA.debugLineNum = 595;BA.debugLine="For i=0 To msme_array.Size - 1";
Debug.ShouldStop(262144);
if (true) break;

case 133:
//for
this.state = 136;
step313 = 1;
limit313 = RemoteObject.solve(new RemoteObject[] {_msme_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 180;
if (true) break;

case 180:
//C
this.state = 136;
if ((step313 > 0 && _i <= limit313) || (step313 < 0 && _i >= limit313)) this.state = 135;
if (true) break;

case 181:
//C
this.state = 180;
_i = ((int)(0 + _i + step313)) ;
Debug.locals.put("i", _i);
if (true) break;

case 135:
//C
this.state = 181;
 BA.debugLineNum = 596;BA.debugLine="Dim a As Map";
Debug.ShouldStop(524288);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 597;BA.debugLine="a = msme_array.Get(i)";
Debug.ShouldStop(1048576);
_a.setObject(_msme_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 599;BA.debugLine="lat = a.Get(\"latitude\")";
Debug.ShouldStop(4194304);
parent._lat = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("latitude")))));
 BA.debugLineNum = 600;BA.debugLine="lng = a.Get(\"longitude\")";
Debug.ShouldStop(8388608);
parent._lng = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("longitude")))));
 BA.debugLineNum = 601;BA.debugLine="Log(lat)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(parent._lat));
 BA.debugLineNum = 602;BA.debugLine="Log(lng)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(parent._lng));
 BA.debugLineNum = 603;BA.debugLine="Dim number As String";
Debug.ShouldStop(67108864);
_number = RemoteObject.createImmutable("");Debug.locals.put("number", _number);
 BA.debugLineNum = 604;BA.debugLine="Dim nama As String";
Debug.ShouldStop(134217728);
_nama = RemoteObject.createImmutable("");Debug.locals.put("nama", _nama);
 BA.debugLineNum = 605;BA.debugLine="number = a.Get(\"msme_building_id\")";
Debug.ShouldStop(268435456);
_number = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msme_building_id")))));Debug.locals.put("number", _number);
 BA.debugLineNum = 606;BA.debugLine="nama = a.Get(\"name_of_msme_building\")";
Debug.ShouldStop(536870912);
_nama = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_msme_building")))));Debug.locals.put("nama", _nama);
 BA.debugLineNum = 607;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, numbe";
Debug.ShouldStop(1073741824);
parent.mostCurrent._clv2.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getWidth"),_number,_nama).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 608;BA.debugLine="CLV2.AsView.Height = PanelListItem.Height*(i";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._panellistitem.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))}, "*",0, 1));
 if (true) break;
if (true) break;

case 136:
//C
this.state = 137;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 611;BA.debugLine="CLV2.AsView.Height = PanelBuildingList.Height";
Debug.ShouldStop(4);
parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"),_msme_array.runMethod(true,"getSize")}, "*",0, 1));
 BA.debugLineNum = 612;BA.debugLine="ScrollView1.Top = WebViewTest.Height + WebVie";
Debug.ShouldStop(8);
parent.mostCurrent._scrollview1.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._webviewtest.runMethod(true,"getHeight"),parent.mostCurrent._webviewtest.runMethod(true,"getTop"),parent.mostCurrent._panelsearch.runMethod(true,"getHeight")}, "++",2, 1));
 BA.debugLineNum = 613;BA.debugLine="CLV2.AsView.Height = CLV2.AsView.Height + 4%y";
Debug.ShouldStop(16);
parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getHeight"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),searchbuilding.mostCurrent.activityBA)}, "+",1, 1));
 BA.debugLineNum = 614;BA.debugLine="CLV2.sv.Height = CLV2.AsView.Height";
Debug.ShouldStop(32);
parent.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"setHeight",parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 615;BA.debugLine="ScrollView1.Panel.Height = CLV2.sv.Height";
Debug.ShouldStop(64);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",parent.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"getHeight"));
 BA.debugLineNum = 616;BA.debugLine="ScrollView1.Height = 100%y - (ScrollView1.Top";
Debug.ShouldStop(128);
parent.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),searchbuilding.mostCurrent.activityBA),(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._scrollview1.runMethod(true,"getTop"),parent.mostCurrent._paneltoolbar.runMethod(true,"getHeight")}, "+",1, 1))}, "-",1, 1));
 BA.debugLineNum = 617;BA.debugLine="Log(nama)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(_nama));
 BA.debugLineNum = 618;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 137:
//C
this.state = 150;
;
 if (true) break;

case 139:
//C
this.state = 140;
 BA.debugLineNum = 621;BA.debugLine="Dim house_array As List";
Debug.ShouldStop(4096);
_house_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("house_array", _house_array);
 BA.debugLineNum = 622;BA.debugLine="house_array = parser.NextArray";
Debug.ShouldStop(8192);
_house_array = _parser.runMethod(false,"NextArray");Debug.locals.put("house_array", _house_array);
 BA.debugLineNum = 623;BA.debugLine="If house_array.Size-1 < 0 Then";
Debug.ShouldStop(16384);
if (true) break;

case 140:
//if
this.state = 149;
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_house_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
this.state = 142;
}else {
this.state = 144;
}if (true) break;

case 142:
//C
this.state = 149;
 BA.debugLineNum = 624;BA.debugLine="Msgbox(\"Not Found\",\"Warning\")";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Not Found")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 BA.debugLineNum = 625;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 144:
//C
this.state = 145;
 BA.debugLineNum = 627;BA.debugLine="For i=0 To house_array.Size - 1";
Debug.ShouldStop(262144);
if (true) break;

case 145:
//for
this.state = 148;
step343 = 1;
limit343 = RemoteObject.solve(new RemoteObject[] {_house_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 182;
if (true) break;

case 182:
//C
this.state = 148;
if ((step343 > 0 && _i <= limit343) || (step343 < 0 && _i >= limit343)) this.state = 147;
if (true) break;

case 183:
//C
this.state = 182;
_i = ((int)(0 + _i + step343)) ;
Debug.locals.put("i", _i);
if (true) break;

case 147:
//C
this.state = 183;
 BA.debugLineNum = 628;BA.debugLine="Dim a As Map";
Debug.ShouldStop(524288);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 629;BA.debugLine="a = house_array.Get(i)";
Debug.ShouldStop(1048576);
_a.setObject(_house_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 631;BA.debugLine="lat = a.Get(\"latitude\")";
Debug.ShouldStop(4194304);
parent._lat = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("latitude")))));
 BA.debugLineNum = 632;BA.debugLine="lng = a.Get(\"longitude\")";
Debug.ShouldStop(8388608);
parent._lng = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("longitude")))));
 BA.debugLineNum = 633;BA.debugLine="Log(lat)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(parent._lat));
 BA.debugLineNum = 634;BA.debugLine="Log(lng)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(parent._lng));
 BA.debugLineNum = 635;BA.debugLine="Dim number As String";
Debug.ShouldStop(67108864);
_number = RemoteObject.createImmutable("");Debug.locals.put("number", _number);
 BA.debugLineNum = 636;BA.debugLine="Dim nama As String";
Debug.ShouldStop(134217728);
_nama = RemoteObject.createImmutable("");Debug.locals.put("nama", _nama);
 BA.debugLineNum = 637;BA.debugLine="number = a.Get(\"house_building_id\")";
Debug.ShouldStop(268435456);
_number = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("house_building_id")))));Debug.locals.put("number", _number);
 BA.debugLineNum = 638;BA.debugLine="nama = a.Get(\"fcn_owner\")";
Debug.ShouldStop(536870912);
_nama = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fcn_owner")))));Debug.locals.put("nama", _nama);
 BA.debugLineNum = 639;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, numbe";
Debug.ShouldStop(1073741824);
parent.mostCurrent._clv2.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getWidth"),_number,_nama).getObject()),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 148:
//C
this.state = 149;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 643;BA.debugLine="CLV2.sv.Height = (PanelBuildingList.Height +";
Debug.ShouldStop(4);
parent.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0.2)),searchbuilding.mostCurrent.activityBA)}, "+",1, 1)),_house_array.runMethod(true,"getSize")}, "*",0, 1));
 BA.debugLineNum = 644;BA.debugLine="ScrollView1.Top = WebViewTest.Height + WebVie";
Debug.ShouldStop(8);
parent.mostCurrent._scrollview1.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._webviewtest.runMethod(true,"getHeight"),parent.mostCurrent._webviewtest.runMethod(true,"getTop"),parent.mostCurrent._panelsearch.runMethod(true,"getHeight")}, "++",2, 1));
 BA.debugLineNum = 645;BA.debugLine="ScrollView1.Height = 100%y - (ScrollView1.Top";
Debug.ShouldStop(16);
parent.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),searchbuilding.mostCurrent.activityBA),(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._scrollview1.runMethod(true,"getTop"),parent.mostCurrent._paneltoolbar.runMethod(true,"getHeight")}, "+",1, 1))}, "-",1, 1));
 BA.debugLineNum = 646;BA.debugLine="CLV2.AsView.Height = CLV2.sv.Height";
Debug.ShouldStop(32);
parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"setHeight",parent.mostCurrent._clv2.getField(false,"_sv").runMethod(true,"getHeight"));
 BA.debugLineNum = 647;BA.debugLine="ScrollView1.Panel.Height = CLV2.AsView.Height";
Debug.ShouldStop(64);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",parent.mostCurrent._clv2.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 648;BA.debugLine="Log(nama)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(_nama));
 BA.debugLineNum = 649;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 149:
//C
this.state = 150;
;
 if (true) break;

case 150:
//C
this.state = 151;
;
 if (true) break;

case 151:
//C
this.state = -1;
;
 BA.debugLineNum = 653;BA.debugLine="Job.Release";
Debug.ShouldStop(4096);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 655;BA.debugLine="End Sub";
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
public static void  _dialog_ready(RemoteObject _pnl) throws Exception{
}
public static void  _dialog_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _panellistitem_click() throws Exception{
try {
		Debug.PushSubsStack("PanelListItem_Click (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,657);
if (RapidSub.canDelegate("panellistitem_click")) return b4a.example.searchbuilding.remoteMe.runUserSub(false, "searchbuilding","panellistitem_click");
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 657;BA.debugLine="Sub PanelListItem_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 658;BA.debugLine="Dim item As Int = CLV2.GetItemFromView(Sender)";
Debug.ShouldStop(131072);
_item = searchbuilding.mostCurrent._clv2.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), searchbuilding.mostCurrent.__c.runMethod(false,"Sender",searchbuilding.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 659;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(262144);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 660;BA.debugLine="p = CLV2.GetPanel(item)";
Debug.ShouldStop(524288);
_p = searchbuilding.mostCurrent._clv2.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 661;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(1048576);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 662;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(2097152);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 664;BA.debugLine="idBuilding = a.GetView(0).GetView(0).Text";
Debug.ShouldStop(8388608);
searchbuilding._idbuilding = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"getText");
 BA.debugLineNum = 666;BA.debugLine="nameBuilding = a.GetView(0).GetView(1).Text";
Debug.ShouldStop(33554432);
searchbuilding._namebuilding = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"getText");
 BA.debugLineNum = 667;BA.debugLine="Select idspin";
Debug.ShouldStop(67108864);
switch (BA.switchObjectToInt(searchbuilding._idspin,BA.ObjectToString("Office"),BA.ObjectToString("Worship"),BA.ObjectToString("Educational"),BA.ObjectToString("Msme"),BA.ObjectToString("Health"),BA.ObjectToString("House"))) {
case 0: {
 BA.debugLineNum = 669;BA.debugLine="StartActivity(OfficeDetail)";
Debug.ShouldStop(268435456);
searchbuilding.mostCurrent.__c.runVoidMethod ("StartActivity",searchbuilding.processBA,(Object)((searchbuilding.mostCurrent._officedetail.getObject())));
 break; }
case 1: {
 BA.debugLineNum = 671;BA.debugLine="StartActivity(WorshipDetail)";
Debug.ShouldStop(1073741824);
searchbuilding.mostCurrent.__c.runVoidMethod ("StartActivity",searchbuilding.processBA,(Object)((searchbuilding.mostCurrent._worshipdetail.getObject())));
 break; }
case 2: {
 BA.debugLineNum = 673;BA.debugLine="StartActivity(EducationalDetail)";
Debug.ShouldStop(1);
searchbuilding.mostCurrent.__c.runVoidMethod ("StartActivity",searchbuilding.processBA,(Object)((searchbuilding.mostCurrent._educationaldetail.getObject())));
 break; }
case 3: {
 BA.debugLineNum = 675;BA.debugLine="StartActivity(MsmeDetail)";
Debug.ShouldStop(4);
searchbuilding.mostCurrent.__c.runVoidMethod ("StartActivity",searchbuilding.processBA,(Object)((searchbuilding.mostCurrent._msmedetail.getObject())));
 break; }
case 4: {
 BA.debugLineNum = 677;BA.debugLine="StartActivity(HealthDetail)";
Debug.ShouldStop(16);
searchbuilding.mostCurrent.__c.runVoidMethod ("StartActivity",searchbuilding.processBA,(Object)((searchbuilding.mostCurrent._healthdetail.getObject())));
 break; }
case 5: {
 BA.debugLineNum = 679;BA.debugLine="StartActivity(HouseDetail)";
Debug.ShouldStop(64);
searchbuilding.mostCurrent.__c.runVoidMethod ("StartActivity",searchbuilding.processBA,(Object)((searchbuilding.mostCurrent._housedetail.getObject())));
 break; }
}
;
 BA.debugLineNum = 682;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim lat, lng As String";
searchbuilding._lat = RemoteObject.createImmutable("");
searchbuilding._lng = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
searchbuilding._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 11;BA.debugLine="Dim idBuilding As String";
searchbuilding._idbuilding = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim nameBuilding As String";
searchbuilding._namebuilding = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="idBuilding=\"\"";
searchbuilding._idbuilding = BA.ObjectToString("");
 //BA.debugLineNum = 14;BA.debugLine="nameBuilding=\"\"";
searchbuilding._namebuilding = BA.ObjectToString("");
 //BA.debugLineNum = 15;BA.debugLine="Dim tipp,tipname,typeoffice,cons,consname,typecon";
searchbuilding._tipp = RemoteObject.createImmutable("");
searchbuilding._tipname = RemoteObject.createImmutable("");
searchbuilding._typeoffice = RemoteObject.createImmutable("");
searchbuilding._cons = RemoteObject.createImmutable("");
searchbuilding._consname = RemoteObject.createImmutable("");
searchbuilding._typecons = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Dim idspin As String";
searchbuilding._idspin = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="Dim latitude , longitude As String";
searchbuilding._latitude = RemoteObject.createImmutable("");
searchbuilding._longitude = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _searchbtn_click() throws Exception{
try {
		Debug.PushSubsStack("SearchBtn_Click (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,689);
if (RapidSub.canDelegate("searchbtn_click")) return b4a.example.searchbuilding.remoteMe.runUserSub(false, "searchbuilding","searchbtn_click");
 BA.debugLineNum = 689;BA.debugLine="Sub SearchBtn_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 690;BA.debugLine="CLV2.Clear";
Debug.ShouldStop(131072);
searchbuilding.mostCurrent._clv2.runVoidMethod ("_clear");
 BA.debugLineNum = 691;BA.debugLine="Select typesrc";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(searchbuilding.mostCurrent._typesrc,BA.ObjectToString("name"))) {
case 0: {
 break; }
}
;
 BA.debugLineNum = 694;BA.debugLine="Log(SearchText.Text)";
Debug.ShouldStop(2097152);
searchbuilding.mostCurrent.__c.runVoidMethod ("Log",(Object)(searchbuilding.mostCurrent._searchtext.runMethod(true,"getText")));
 BA.debugLineNum = 695;BA.debugLine="Select idspin";
Debug.ShouldStop(4194304);
switch (BA.switchObjectToInt(searchbuilding._idspin,BA.ObjectToString("All"),BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Health"),BA.ObjectToString("Educational"),BA.ObjectToString("Msme"),BA.ObjectToString("House"))) {
case 0: {
 BA.debugLineNum = 697;BA.debugLine="Select typesrc";
Debug.ShouldStop(16777216);
switch (BA.switchObjectToInt(searchbuilding.mostCurrent._typesrc,BA.ObjectToString("model"))) {
case 0: {
 BA.debugLineNum = 699;BA.debugLine="Msgbox(\"Query belum ada :(\",\"WARNING!\")";
Debug.ShouldStop(67108864);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Query belum ada :(")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("WARNING!"))),searchbuilding.mostCurrent.activityBA);
 break; }
}
;
 break; }
case 1: {
 BA.debugLineNum = 702;BA.debugLine="Select typesrc";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(searchbuilding.mostCurrent._typesrc,BA.ObjectToString("name"),BA.ObjectToString("type"),BA.ObjectToString("jorong"),BA.ObjectToString("construction"),BA.ObjectToString("facility"),BA.ObjectToString("land area"),BA.ObjectToString("building area"),BA.ObjectToString("radius"),BA.ObjectToString("standing year"))) {
case 0: {
 BA.debugLineNum = 704;BA.debugLine="If SearchText.Text == \"\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._searchtext.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 705;BA.debugLine="Msgbox(\"Field is empty! Please write somethi";
Debug.ShouldStop(1);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Field is empty! Please write something in search field.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 706;BA.debugLine="Else If idspin == \"null\" Or idspin == \"\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",searchbuilding._idspin,BA.ObjectToString("null")) || RemoteObject.solveBoolean("=",searchbuilding._idspin,BA.ObjectToString(""))) { 
 BA.debugLineNum = 707;BA.debugLine="Msgbox(\"Select the building type to continue";
Debug.ShouldStop(4);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Select the building type to continue your searching!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 708;BA.debugLine="Else If typesrc == \"null\" Or typesrc == \"\" Th";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._typesrc,BA.ObjectToString("null")) || RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._typesrc,BA.ObjectToString(""))) { 
 BA.debugLineNum = 709;BA.debugLine="Msgbox(\"Select the search type to continue y";
Debug.ShouldStop(16);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Select the search type to continue your searching!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 710;BA.debugLine="Else If SearchText.Text == \"\" And idspin == \"";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._searchtext.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",searchbuilding._idspin,BA.ObjectToString("")) && RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._typesrc,BA.ObjectToString(""))) { 
 BA.debugLineNum = 711;BA.debugLine="Msgbox(\"Please complete all fields!\",\"Warnin";
Debug.ShouldStop(64);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please complete all fields!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 713;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(256);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._searchtext.runMethod(true,"getText"))));
 BA.debugLineNum = 714;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_";
Debug.ShouldStop(512);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM worship_building WHERE upper(name_of_worship_building) like '%"),searchbuilding.mostCurrent._searchtext.runMethod(true,"getText").runMethod(true,"toUpperCase"),RemoteObject.createImmutable("%' ORDER BY name_of_worship_building")),searchbuilding._idspin);
 }}}}
;
 break; }
case 1: {
 BA.debugLineNum = 718;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._spintype.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 719;BA.debugLine="Msgbox(\"Please select type of educational bu";
Debug.ShouldStop(16384);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please select type of educational building")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 721;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(65536);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 722;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_";
Debug.ShouldStop(131072);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM worship_building WHERE type_of_worship = '"),searchbuilding.mostCurrent._typeid,RemoteObject.createImmutable("' order by name_of_worship_building")),searchbuilding._idspin);
 };
 break; }
case 2: {
 BA.debugLineNum = 726;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._spintype.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 727;BA.debugLine="Msgbox(\"Please select type of educational bu";
Debug.ShouldStop(4194304);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please select type of educational building")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 729;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(16777216);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 730;BA.debugLine="ExecuteRemoteQuery(\"SELECT W.worship_buildin";
Debug.ShouldStop(33554432);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT W.worship_building_id, W.name_of_worship_building, W.geom, ST_X(ST_CENTROID(W.geom)) As longitude, ST_Y(ST_CENTROID(W.geom)) As latitude	FROM worship_building As W, jorong As J	WHERE ST_CONTAINS(J.geom, W.geom) And J.jorong_id='"),searchbuilding.mostCurrent._typeid,RemoteObject.createImmutable("'")),searchbuilding._idspin);
 };
 break; }
case 3: {
 BA.debugLineNum = 733;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._spintype.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 734;BA.debugLine="Msgbox(\"Please select type of educational bu";
Debug.ShouldStop(536870912);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please select type of educational building")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 736;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(-2147483648);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 737;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_";
Debug.ShouldStop(1);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM worship_building WHERE type_of_construction = '"),searchbuilding.mostCurrent._typeid,RemoteObject.createImmutable("' order by name_of_worship_building")),searchbuilding._idspin);
 };
 break; }
case 4: {
 BA.debugLineNum = 740;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&id";
Debug.ShouldStop(8);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._idchecksub)));
 BA.debugLineNum = 741;BA.debugLine="ExecuteRemoteQuery(\"SELECT M.worship_buildin";
Debug.ShouldStop(16);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT M.worship_building_id, M.name_of_worship_building, ST_X(ST_Centroid(M.geom)) AS lng, ST_Y(ST_CENTROID(M.geom)) AS lat FROM worship_building As M	JOIN detail_worship_building_facilities As F on M.worship_building_id=F.worship_building_id	WHERE F.facility_id IN ("),searchbuilding.mostCurrent._idchecksub,RemoteObject.createImmutable(") GROUP BY F.worship_building_id, M.worship_building_id, M.name_of_worship_building HAVING COUNT(*) = "),searchbuilding._count,RemoteObject.createImmutable("")),searchbuilding._idspin);
 break; }
case 5: {
 BA.debugLineNum = 743;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(64);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?awal="),searchbuilding.mostCurrent._fromtext.runMethod(true,"getText"),RemoteObject.createImmutable("&akhir="),searchbuilding.mostCurrent._totext.runMethod(true,"getText"))));
 BA.debugLineNum = 744;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_i";
Debug.ShouldStop(128);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM worship_building WHERE land_area BETWEEN "),searchbuilding.mostCurrent._fromtext.runMethod(true,"getText"),RemoteObject.createImmutable(" AND "),searchbuilding.mostCurrent._totext.runMethod(true,"getText"),RemoteObject.createImmutable(" ORDER BY name_of_worship_building")),searchbuilding._idspin);
 break; }
case 6: {
 BA.debugLineNum = 746;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(512);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?awal="),searchbuilding.mostCurrent._fromtext.runMethod(true,"getText"),RemoteObject.createImmutable("&akhir="),searchbuilding.mostCurrent._totext.runMethod(true,"getText"))));
 BA.debugLineNum = 747;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_i";
Debug.ShouldStop(1024);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM worship_building WHERE building_area BETWEEN "),searchbuilding.mostCurrent._fromtext.runMethod(true,"getText"),RemoteObject.createImmutable(" AND "),searchbuilding.mostCurrent._totext.runMethod(true,"getText"),RemoteObject.createImmutable(" ORDER BY name_of_worship_building")),searchbuilding._idspin);
 break; }
case 7: {
 BA.debugLineNum = 749;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(4096);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/index_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?lat="),searchbuilding._latitude,RemoteObject.createImmutable("&lng="),searchbuilding._longitude,RemoteObject.createImmutable("&rad="),searchbuilding._radiusku)));
 BA.debugLineNum = 750;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_i";
Debug.ShouldStop(8192);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_CENTROID(geom)) as lon, ST_Y(ST_CENTROID(geom)) as lat, ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("),searchbuilding._longitude,RemoteObject.createImmutable(" "),searchbuilding._latitude,RemoteObject.createImmutable(")',-1), geom) as jarak	FROM worship_building where ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("),searchbuilding._longitude,RemoteObject.createImmutable(" "),searchbuilding._latitude,RemoteObject.createImmutable(")',-1), geom) <= "),searchbuilding._radiusku,RemoteObject.createImmutable(" ORDER BY jarak")),searchbuilding._idspin);
 break; }
case 8: {
 BA.debugLineNum = 752;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(32768);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?awal="),searchbuilding.mostCurrent._fromtext.runMethod(true,"getText"),RemoteObject.createImmutable("&akhir="),searchbuilding.mostCurrent._totext.runMethod(true,"getText"))));
 BA.debugLineNum = 753;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_i";
Debug.ShouldStop(65536);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM worship_building WHERE standing_year BETWEEN "),searchbuilding.mostCurrent._fromtext.runMethod(true,"getText"),RemoteObject.createImmutable(" AND "),searchbuilding.mostCurrent._totext.runMethod(true,"getText"),RemoteObject.createImmutable(" ORDER BY name_of_worship_building")),searchbuilding._idspin);
 break; }
}
;
 break; }
case 2: {
 BA.debugLineNum = 756;BA.debugLine="Select typesrc";
Debug.ShouldStop(524288);
switch (BA.switchObjectToInt(searchbuilding.mostCurrent._typesrc,BA.ObjectToString("name"),BA.ObjectToString("type"),BA.ObjectToString("jorong"),BA.ObjectToString("construction"),BA.ObjectToString("facility"),BA.ObjectToString("radius"))) {
case 0: {
 BA.debugLineNum = 758;BA.debugLine="If SearchText.Text == \"\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._searchtext.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 759;BA.debugLine="Msgbox(\"Field is empty! Please write somethi";
Debug.ShouldStop(4194304);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Field is empty! Please write something in search field.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 760;BA.debugLine="Else If idspin == \"null\" Or idspin == \"\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",searchbuilding._idspin,BA.ObjectToString("null")) || RemoteObject.solveBoolean("=",searchbuilding._idspin,BA.ObjectToString(""))) { 
 BA.debugLineNum = 761;BA.debugLine="Msgbox(\"Select the building type to continue";
Debug.ShouldStop(16777216);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Select the building type to continue your searching!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 762;BA.debugLine="Else If typesrc == \"null\" Or typesrc == \"\" Th";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._typesrc,BA.ObjectToString("null")) || RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._typesrc,BA.ObjectToString(""))) { 
 BA.debugLineNum = 763;BA.debugLine="Msgbox(\"Select the search type to continue y";
Debug.ShouldStop(67108864);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Select the search type to continue your searching!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 764;BA.debugLine="Else If SearchText.Text == \"\" And idspin == \"";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._searchtext.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",searchbuilding._idspin,BA.ObjectToString("")) && RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._typesrc,BA.ObjectToString(""))) { 
 BA.debugLineNum = 765;BA.debugLine="Msgbox(\"Please complete all fields!\",\"Warnin";
Debug.ShouldStop(268435456);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please complete all fields!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 767;BA.debugLine="ExecuteRemoteQuery(\"SELECT office_building_i";
Debug.ShouldStop(1073741824);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT office_building_id, name_of_office_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM office_building WHERE upper(name_of_office_building) like '%"),searchbuilding.mostCurrent._searchtext.runMethod(true,"getText").runMethod(true,"toUpperCase"),RemoteObject.createImmutable("%' ORDER BY name_of_office_building")),searchbuilding._idspin);
 BA.debugLineNum = 768;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(-2147483648);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 }}}}
;
 break; }
case 1: {
 BA.debugLineNum = 771;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._spintype.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 772;BA.debugLine="Msgbox(\"Please select type of educational bu";
Debug.ShouldStop(8);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please select type of educational building")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 774;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(32);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 775;BA.debugLine="ExecuteRemoteQuery(\"SELECT office_building_i";
Debug.ShouldStop(64);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT office_building_id, name_of_office_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM office_building WHERE type_of_office = '"),searchbuilding.mostCurrent._typeid,RemoteObject.createImmutable("' order by name_of_office_building")),searchbuilding._idspin);
 };
 break; }
case 2: {
 BA.debugLineNum = 779;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._spintype.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 780;BA.debugLine="Msgbox(\"Please select type of educational bu";
Debug.ShouldStop(2048);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please select type of educational building")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 782;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(8192);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 783;BA.debugLine="ExecuteRemoteQuery(\"SELECT O.office_building";
Debug.ShouldStop(16384);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT O.office_building_id, O.name_of_office_building, O.geom,	ST_X(ST_CENTROID(O.geom)) As longitude, ST_Y(ST_CENTROID(O.geom)) As latitude FROM office_building As O, jorong As J WHERE ST_CONTAINS(J.geom, O.geom) And J.jorong_id='"),searchbuilding.mostCurrent._typeid,RemoteObject.createImmutable("'")),searchbuilding._idspin);
 };
 break; }
case 3: {
 BA.debugLineNum = 787;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(262144);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 788;BA.debugLine="ExecuteRemoteQuery(\"SELECT office_building_id";
Debug.ShouldStop(524288);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT office_building_id, name_of_office_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM office_building WHERE type_of_construction = '"),searchbuilding.mostCurrent._typeid,RemoteObject.createImmutable("' order by name_of_office_building")),searchbuilding._idspin);
 break; }
case 4: {
 BA.debugLineNum = 791;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(4194304);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._idchecksub)));
 BA.debugLineNum = 792;BA.debugLine="ExecuteRemoteQuery(\"SELECT O.office_building";
Debug.ShouldStop(8388608);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT O.office_building_id, O.name_of_office_building, ST_X(ST_Centroid(O.geom)) AS lng, ST_Y(ST_CENTROID(O.geom)) AS lat FROM office_building As O JOIN detail_office_building_facilities As F on O.office_building_id=F.office_building_id WHERE F.facility_id IN ("),searchbuilding.mostCurrent._idchecksub,RemoteObject.createImmutable(") GROUP BY F.office_building_id, O.office_building_id, O.name_of_office_building HAVING COUNT(*) = "),searchbuilding._count,RemoteObject.createImmutable("")),searchbuilding._idspin);
 break; }
case 5: {
 BA.debugLineNum = 794;BA.debugLine="If Main.kvs.ContainsKey(\"Lat\") == False And M";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._main._kvs.runMethod(true,"_containskey",(Object)(RemoteObject.createImmutable("Lat"))),searchbuilding.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._main._kvs.runMethod(true,"_containskey",(Object)(RemoteObject.createImmutable("Long"))),searchbuilding.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 795;BA.debugLine="Msgbox(\"Your location haven't been set\",\"Err";
Debug.ShouldStop(67108864);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Your location haven't been set")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 800;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(-2147483648);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/index_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?lat="),searchbuilding._latitude,RemoteObject.createImmutable("&lng="),searchbuilding._longitude,RemoteObject.createImmutable("&rad="),searchbuilding._radiusku)));
 BA.debugLineNum = 801;BA.debugLine="ExecuteRemoteQuery(\"SELECT office_building_i";
Debug.ShouldStop(1);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT office_building_id, name_of_office_building ,ST_X(ST_CENTROID(geom)) as lon, ST_Y(ST_CENTROID(geom)) as lat, ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("),searchbuilding._longitude,RemoteObject.createImmutable(" "),searchbuilding._latitude,RemoteObject.createImmutable(")',-1), geom) as jarak FROM office_building where ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("),searchbuilding._longitude,RemoteObject.createImmutable(" "),searchbuilding._latitude,RemoteObject.createImmutable(")',-1),	geom) <= "),searchbuilding._radiusku,RemoteObject.createImmutable(" ORDER BY jarak")),searchbuilding._idspin);
 };
 break; }
}
;
 break; }
case 3: {
 BA.debugLineNum = 806;BA.debugLine="Select typesrc";
Debug.ShouldStop(32);
switch (BA.switchObjectToInt(searchbuilding.mostCurrent._typesrc,BA.ObjectToString("name"),BA.ObjectToString("type"),BA.ObjectToString("jorong"),BA.ObjectToString("construction"),BA.ObjectToString("facility"),BA.ObjectToString("radius"))) {
case 0: {
 BA.debugLineNum = 808;BA.debugLine="If SearchText.Text == \"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._searchtext.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 809;BA.debugLine="Msgbox(\"Field is empty! Please write somethi";
Debug.ShouldStop(256);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Field is empty! Please write something in search field.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 810;BA.debugLine="Else If idspin == \"null\" Or idspin == \"\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",searchbuilding._idspin,BA.ObjectToString("null")) || RemoteObject.solveBoolean("=",searchbuilding._idspin,BA.ObjectToString(""))) { 
 BA.debugLineNum = 811;BA.debugLine="Msgbox(\"Select the building type to continue";
Debug.ShouldStop(1024);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Select the building type to continue your searching!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 812;BA.debugLine="Else If typesrc == \"null\" Or typesrc == \"\" Th";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._typesrc,BA.ObjectToString("null")) || RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._typesrc,BA.ObjectToString(""))) { 
 BA.debugLineNum = 813;BA.debugLine="Msgbox(\"Select the search type to continue y";
Debug.ShouldStop(4096);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Select the search type to continue your searching!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 814;BA.debugLine="Else If SearchText.Text == \"\" And idspin == \"";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._searchtext.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",searchbuilding._idspin,BA.ObjectToString("")) && RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._typesrc,BA.ObjectToString(""))) { 
 BA.debugLineNum = 815;BA.debugLine="Msgbox(\"Please complete all fields!\",\"Warnin";
Debug.ShouldStop(16384);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please complete all fields!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 817;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(65536);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 818;BA.debugLine="ExecuteRemoteQuery(\"SELECT health_building_i";
Debug.ShouldStop(131072);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT health_building_id, name_of_health_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM health_building WHERE name_of_health_building like '%"),searchbuilding.mostCurrent._searchtext.runMethod(true,"getText").runMethod(true,"toUpperCase"),RemoteObject.createImmutable("%' ORDER BY name_of_health_building")),searchbuilding._idspin);
 }}}}
;
 break; }
case 1: {
 BA.debugLineNum = 822;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._spintype.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 823;BA.debugLine="Msgbox(\"Please select type of educational bu";
Debug.ShouldStop(4194304);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please select type of educational building")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 825;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(16777216);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 826;BA.debugLine="ExecuteRemoteQuery(\"SELECT health_building_i";
Debug.ShouldStop(33554432);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT health_building_id, name_of_health_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM health_building WHERE type_of_health_building = '"),searchbuilding.mostCurrent._typeid,RemoteObject.createImmutable("' order by name_of_health_building")),searchbuilding._idspin);
 };
 break; }
case 2: {
 BA.debugLineNum = 830;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._spintype.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 831;BA.debugLine="Msgbox(\"Please select type of educational bu";
Debug.ShouldStop(1073741824);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please select type of educational building")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 833;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(1);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 834;BA.debugLine="ExecuteRemoteQuery(\"SELECT W.health_building";
Debug.ShouldStop(2);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT W.health_building_id, W.name_of_health_building, W.geom, ST_X(ST_CENTROID(W.geom)) As longitude,	ST_Y(ST_CENTROID(W.geom)) As latitude FROM health_building As W, jorong As J WHERE ST_CONTAINS(J.geom, W.geom) And J.jorong_id='"),searchbuilding.mostCurrent._typeid,RemoteObject.createImmutable("'")),searchbuilding._idspin);
 };
 break; }
case 3: {
 BA.debugLineNum = 838;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._spintype.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 839;BA.debugLine="Msgbox(\"Please select type of educational bu";
Debug.ShouldStop(64);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please select type of educational building")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 841;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(256);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 842;BA.debugLine="ExecuteRemoteQuery(\"SELECT health_building_i";
Debug.ShouldStop(512);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT health_building_id, name_of_health_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM health_building WHERE type_of_construction = '"),searchbuilding.mostCurrent._typeid,RemoteObject.createImmutable("' order by name_of_health_building")),searchbuilding._idspin);
 };
 break; }
case 4: {
 BA.debugLineNum = 845;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(4096);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._idchecksub)));
 BA.debugLineNum = 846;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.health_building";
Debug.ShouldStop(8192);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT H.health_building_id, H.name_of_health_building, ST_X(ST_Centroid(H.geom)) AS lng, ST_Y(ST_CENTROID(H.geom)) AS lat FROM health_building As H JOIN detail_health_building_facilities As F on H.health_building_id=F.health_building_id WHERE F.facility_id IN ("),searchbuilding.mostCurrent._idchecksub,RemoteObject.createImmutable(") GROUP BY F.health_building_id, H.health_building_id, H.name_of_health_building HAVING COUNT(*) = "),searchbuilding._count,RemoteObject.createImmutable("")),searchbuilding._idspin);
 break; }
case 5: {
 BA.debugLineNum = 848;BA.debugLine="If Main.kvs.ContainsKey(\"Lat\") == False And M";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._main._kvs.runMethod(true,"_containskey",(Object)(RemoteObject.createImmutable("Lat"))),searchbuilding.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._main._kvs.runMethod(true,"_containskey",(Object)(RemoteObject.createImmutable("Long"))),searchbuilding.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 849;BA.debugLine="Msgbox(\"Your location haven't been set\",\"Err";
Debug.ShouldStop(65536);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Your location haven't been set")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 851;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(262144);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/index_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?lat="),searchbuilding._latitude,RemoteObject.createImmutable("&lng="),searchbuilding._longitude,RemoteObject.createImmutable("&rad="),searchbuilding._radiusku)));
 BA.debugLineNum = 852;BA.debugLine="ExecuteRemoteQuery(\"SELECT health_building_i";
Debug.ShouldStop(524288);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT health_building_id, name_of_health_building ,ST_X(ST_CENTROID(geom)) as lon, ST_Y(ST_CENTROID(geom)) as lat,	ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("),searchbuilding._longitude,RemoteObject.createImmutable(" "),searchbuilding._latitude,RemoteObject.createImmutable(")',-1), geom) as jarak FROM health_building where ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("),searchbuilding._longitude,RemoteObject.createImmutable(" "),searchbuilding._latitude,RemoteObject.createImmutable(")',-1),	geom) <= "),searchbuilding._radiusku,RemoteObject.createImmutable(" ORDER BY jarak")),searchbuilding._idspin);
 };
 break; }
}
;
 break; }
case 4: {
 BA.debugLineNum = 857;BA.debugLine="Select typesrc";
Debug.ShouldStop(16777216);
switch (BA.switchObjectToInt(searchbuilding.mostCurrent._typesrc,BA.ObjectToString("name"),BA.ObjectToString("type"),BA.ObjectToString("jorong"),BA.ObjectToString("status"),BA.ObjectToString("facility"),BA.ObjectToString("land area"),BA.ObjectToString("building area"),BA.ObjectToString("radius"))) {
case 0: {
 BA.debugLineNum = 859;BA.debugLine="If SearchText.Text == \"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._searchtext.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 860;BA.debugLine="Msgbox(\"Field is empty! Please write somethi";
Debug.ShouldStop(134217728);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Field is empty! Please write something in search field.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 861;BA.debugLine="Else If idspin == \"null\" Or idspin == \"\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",searchbuilding._idspin,BA.ObjectToString("null")) || RemoteObject.solveBoolean("=",searchbuilding._idspin,BA.ObjectToString(""))) { 
 BA.debugLineNum = 862;BA.debugLine="Msgbox(\"Select the building type to continue";
Debug.ShouldStop(536870912);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Select the building type to continue your searching!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 863;BA.debugLine="Else If typesrc == \"null\" Or typesrc == \"\" Th";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._typesrc,BA.ObjectToString("null")) || RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._typesrc,BA.ObjectToString(""))) { 
 BA.debugLineNum = 864;BA.debugLine="Msgbox(\"Select the search type to continue y";
Debug.ShouldStop(-2147483648);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Select the search type to continue your searching!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 865;BA.debugLine="Else If SearchText.Text == \"\" And idspin == \"";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._searchtext.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",searchbuilding._idspin,BA.ObjectToString("")) && RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._typesrc,BA.ObjectToString(""))) { 
 BA.debugLineNum = 866;BA.debugLine="Msgbox(\"Please complete all fields!\",\"Warnin";
Debug.ShouldStop(2);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please complete all fields!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 868;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(8);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 869;BA.debugLine="ExecuteRemoteQuery(\"SELECT educational_build";
Debug.ShouldStop(16);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT educational_building_id, name_of_educational_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM educational_building WHERE name_of_educational_building like '%"),searchbuilding.mostCurrent._searchtext.runMethod(true,"getText").runMethod(true,"toUpperCase"),RemoteObject.createImmutable("%' ORDER BY name_of_educational_building")),searchbuilding._idspin);
 }}}}
;
 break; }
case 1: {
 BA.debugLineNum = 873;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._spintype.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 874;BA.debugLine="Msgbox(\"Please select type of educational bu";
Debug.ShouldStop(512);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please select type of educational building")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 876;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(2048);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 877;BA.debugLine="ExecuteRemoteQuery(\"SELECT educational_build";
Debug.ShouldStop(4096);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT educational_building_id, name_of_educational_building, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM educational_building WHERE id_level_of_education = '"),searchbuilding.mostCurrent._typeid,RemoteObject.createImmutable("' order by name_of_educational_building")),searchbuilding._idspin);
 };
 break; }
case 2: {
 BA.debugLineNum = 881;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._spintype.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 882;BA.debugLine="Msgbox(\"Please select type of educational bu";
Debug.ShouldStop(131072);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please select type of educational building")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 884;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(524288);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 885;BA.debugLine="ExecuteRemoteQuery(\"SELECT W.educational_bui";
Debug.ShouldStop(1048576);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT W.educational_building_id, W.name_of_educational_building, W.geom, ST_X(ST_CENTROID(W.geom)) As longitude, ST_Y(ST_CENTROID(W.geom)) As latitude FROM educational_building As W, jorong As J WHERE ST_CONTAINS(J.geom, W.geom) And J.jorong_id='"),searchbuilding.mostCurrent._typeid,RemoteObject.createImmutable("'")),searchbuilding._idspin);
 };
 break; }
case 3: {
 BA.debugLineNum = 889;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._spintype.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 890;BA.debugLine="Msgbox(\"Please select type of educational bu";
Debug.ShouldStop(33554432);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please select type of educational building")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 892;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(134217728);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 893;BA.debugLine="ExecuteRemoteQuery(\"Select educational_build";
Debug.ShouldStop(268435456);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("Select educational_building_id, name_of_educational_building, ST_X(ST_Centroid(geom)) As longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM educational_building WHERE school_type = '"),searchbuilding.mostCurrent._typeid,RemoteObject.createImmutable("' order by name_of_educational_building")),searchbuilding._idspin);
 };
 break; }
case 4: {
 BA.debugLineNum = 897;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(1);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._idchecksub)));
 BA.debugLineNum = 898;BA.debugLine="ExecuteRemoteQuery(\"SELECT E.educational_bui";
Debug.ShouldStop(2);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT E.educational_building_id, E.name_of_educational_building, ST_X(ST_Centroid(E.geom)) AS lng, ST_Y(ST_CENTROID(E.geom)) AS lat FROM educational_building As E JOIN detail_educational_building_facilities As F on E.educational_building_id=F.educational_building_id	WHERE F.facility_id IN ("),searchbuilding.mostCurrent._idchecksub,RemoteObject.createImmutable(") GROUP BY F.educational_building_id, E.educational_building_id, E.name_of_educational_building HAVING COUNT(*) = "),searchbuilding._count,RemoteObject.createImmutable("")),searchbuilding._idspin);
 break; }
case 5: {
 BA.debugLineNum = 900;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(8);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?awal="),searchbuilding.mostCurrent._fromtext.runMethod(true,"getText"),RemoteObject.createImmutable("&akhir="),searchbuilding.mostCurrent._totext.runMethod(true,"getText"))));
 BA.debugLineNum = 901;BA.debugLine="ExecuteRemoteQuery(\"SELECT educational_buildi";
Debug.ShouldStop(16);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT educational_building_id, name_of_educational_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM educational_building WHERE land_area BETWEEN "),searchbuilding.mostCurrent._fromtext.runMethod(true,"getText"),RemoteObject.createImmutable(" AND "),searchbuilding.mostCurrent._totext.runMethod(true,"getText"),RemoteObject.createImmutable(" ORDER BY name_of_educational_building")),searchbuilding._idspin);
 break; }
case 6: {
 BA.debugLineNum = 903;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(64);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?awal="),searchbuilding.mostCurrent._fromtext.runMethod(true,"getText"),RemoteObject.createImmutable("&akhir="),searchbuilding.mostCurrent._totext.runMethod(true,"getText"))));
 BA.debugLineNum = 904;BA.debugLine="ExecuteRemoteQuery(\"SELECT educational_buildi";
Debug.ShouldStop(128);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT educational_building_id, name_of_educational_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM educational_building WHERE building_area BETWEEN "),searchbuilding.mostCurrent._fromtext.runMethod(true,"getText"),RemoteObject.createImmutable(" AND "),searchbuilding.mostCurrent._totext.runMethod(true,"getText"),RemoteObject.createImmutable(" ORDER BY name_of_educational_building")),searchbuilding._idspin);
 break; }
case 7: {
 BA.debugLineNum = 906;BA.debugLine="If Main.kvs.ContainsKey(\"Lat\") == False And M";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._main._kvs.runMethod(true,"_containskey",(Object)(RemoteObject.createImmutable("Lat"))),searchbuilding.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._main._kvs.runMethod(true,"_containskey",(Object)(RemoteObject.createImmutable("Long"))),searchbuilding.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 907;BA.debugLine="Msgbox(\"Your location haven't been set\",\"Err";
Debug.ShouldStop(1024);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Your location haven't been set")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 909;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(4096);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/index_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?lat="),searchbuilding._latitude,RemoteObject.createImmutable("&lng="),searchbuilding._longitude,RemoteObject.createImmutable("&rad="),searchbuilding._radiusku)));
 BA.debugLineNum = 910;BA.debugLine="ExecuteRemoteQuery(\"SELECT educational_build";
Debug.ShouldStop(8192);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT educational_building_id, name_of_educational_building ,ST_X(ST_CENTROID(geom)) as lon, ST_Y(ST_CENTROID(geom)) as lat, ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("),searchbuilding._longitude,RemoteObject.createImmutable(" "),searchbuilding._latitude,RemoteObject.createImmutable(")',-1), geom) as jarak	FROM educational_building where ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("),searchbuilding._longitude,RemoteObject.createImmutable(" "),searchbuilding._latitude,RemoteObject.createImmutable(")',-1), geom) <= "),searchbuilding._radiusku,RemoteObject.createImmutable(" ORDER BY jarak")),searchbuilding._idspin);
 };
 break; }
}
;
 break; }
case 5: {
 BA.debugLineNum = 915;BA.debugLine="Select typesrc";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(searchbuilding.mostCurrent._typesrc,BA.ObjectToString("name"),BA.ObjectToString("type"),BA.ObjectToString("jorong"),BA.ObjectToString("construction"),BA.ObjectToString("facility"),BA.ObjectToString("radius"),BA.ObjectToString("income"))) {
case 0: {
 BA.debugLineNum = 917;BA.debugLine="If SearchText.Text == \"\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._searchtext.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 918;BA.debugLine="Msgbox(\"Field is empty! Please write somethi";
Debug.ShouldStop(2097152);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Field is empty! Please write something in search field.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 919;BA.debugLine="Else If idspin == \"null\" Or idspin == \"\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",searchbuilding._idspin,BA.ObjectToString("null")) || RemoteObject.solveBoolean("=",searchbuilding._idspin,BA.ObjectToString(""))) { 
 BA.debugLineNum = 920;BA.debugLine="Msgbox(\"Select the building type to continue";
Debug.ShouldStop(8388608);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Select the building type to continue your searching!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 921;BA.debugLine="Else If typesrc == \"null\" Or typesrc == \"\" Th";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._typesrc,BA.ObjectToString("null")) || RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._typesrc,BA.ObjectToString(""))) { 
 BA.debugLineNum = 922;BA.debugLine="Msgbox(\"Select the search type to continue y";
Debug.ShouldStop(33554432);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Select the search type to continue your searching!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 923;BA.debugLine="Else If SearchText.Text == \"\" And idspin == \"";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._searchtext.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",searchbuilding._idspin,BA.ObjectToString("")) && RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._typesrc,BA.ObjectToString(""))) { 
 BA.debugLineNum = 924;BA.debugLine="Msgbox(\"Please complete all fields!\",\"Warnin";
Debug.ShouldStop(134217728);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please complete all fields!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 926;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(536870912);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 927;BA.debugLine="ExecuteRemoteQuery(\"SELECT msme_building_id,";
Debug.ShouldStop(1073741824);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT msme_building_id, name_of_msme_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM msme_building WHERE upper(name_of_msme_building) like '%"),searchbuilding.mostCurrent._searchtext.runMethod(true,"getText").runMethod(true,"toUpperCase"),RemoteObject.createImmutable("%' order by name_of_msme_building")),searchbuilding._idspin);
 }}}}
;
 break; }
case 1: {
 BA.debugLineNum = 931;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._spintype.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 932;BA.debugLine="Msgbox(\"Please select type of educational bu";
Debug.ShouldStop(8);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please select type of educational building")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 934;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(32);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 935;BA.debugLine="ExecuteRemoteQuery(\"SELECT msme_building_id,";
Debug.ShouldStop(64);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT msme_building_id, name_of_msme_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM msme_building WHERE type_of_msme = '"),searchbuilding.mostCurrent._typeid,RemoteObject.createImmutable("' order by name_of_msme_building")),searchbuilding._idspin);
 };
 break; }
case 2: {
 BA.debugLineNum = 939;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._spintype.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 940;BA.debugLine="Msgbox(\"Please select type of educational bu";
Debug.ShouldStop(2048);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please select type of educational building")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 942;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(8192);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 943;BA.debugLine="ExecuteRemoteQuery(\"SELECT M.msme_building_i";
Debug.ShouldStop(16384);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT M.msme_building_id, M.name_of_msme_building, M.geom, ST_X(ST_CENTROID(M.geom)) As longitude, ST_Y(ST_CENTROID(M.geom)) As latitude FROM msme_building As M, jorong As J WHERE ST_CONTAINS(J.geom, M.geom) And J.jorong_id='"),searchbuilding.mostCurrent._typeid,RemoteObject.createImmutable("'")),searchbuilding._idspin);
 };
 break; }
case 3: {
 BA.debugLineNum = 947;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._spintype.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 948;BA.debugLine="Msgbox(\"Please select type of educational bu";
Debug.ShouldStop(524288);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please select type of educational building")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 950;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(2097152);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 951;BA.debugLine="ExecuteRemoteQuery(\"SELECT msme_building_id,";
Debug.ShouldStop(4194304);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT msme_building_id, name_of_msme_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM msme_building WHERE type_of_construction = '"),searchbuilding.mostCurrent._typeid,RemoteObject.createImmutable("' order by name_of_msme_building")),searchbuilding._idspin);
 };
 break; }
case 4: {
 BA.debugLineNum = 955;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(67108864);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._idchecksub)));
 BA.debugLineNum = 956;BA.debugLine="ExecuteRemoteQuery(\"Select M.msme_building_i";
Debug.ShouldStop(134217728);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("Select M.msme_building_id, M.name_of_msme_building, ST_X(ST_Centroid(M.geom)) As lng, ST_Y(ST_CENTROID(M.geom)) As lat FROM msme_building As M JOIN detail_msme_building_facilities As F on M.msme_building_id=F.msme_building_id WHERE F.facility_id IN ("),searchbuilding.mostCurrent._idchecksub,RemoteObject.createImmutable(") GROUP BY F.msme_building_id, M.msme_building_id, M.name_of_msme_building HAVING COUNT(*) = "),searchbuilding._count,RemoteObject.createImmutable("")),searchbuilding._idspin);
 break; }
case 5: {
 BA.debugLineNum = 958;BA.debugLine="If Main.kvs.ContainsKey(\"Lat\") == False And M";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._main._kvs.runMethod(true,"_containskey",(Object)(RemoteObject.createImmutable("Lat"))),searchbuilding.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._main._kvs.runMethod(true,"_containskey",(Object)(RemoteObject.createImmutable("Long"))),searchbuilding.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 959;BA.debugLine="Msgbox(\"Your location haven't been set\",\"Err";
Debug.ShouldStop(1073741824);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Your location haven't been set")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 961;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(1);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/index_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?lat="),searchbuilding._latitude,RemoteObject.createImmutable("&lng="),searchbuilding._longitude,RemoteObject.createImmutable("&rad="),searchbuilding._radiusku)));
 BA.debugLineNum = 962;BA.debugLine="ExecuteRemoteQuery(\"SELECT msme_building_id,";
Debug.ShouldStop(2);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT msme_building_id, name_of_msme_building ,ST_X(ST_CENTROID(geom)) as lon, ST_Y(ST_CENTROID(geom)) as lat,	ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("),searchbuilding._longitude,RemoteObject.createImmutable(" "),searchbuilding._latitude,RemoteObject.createImmutable(")',-1), geom) as jarak FROM msme_building where ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("),searchbuilding._longitude,RemoteObject.createImmutable(" "),searchbuilding._latitude,RemoteObject.createImmutable(")',-1), geom) <= "),searchbuilding._radiusku,RemoteObject.createImmutable(" ORDER BY jarak")),searchbuilding._idspin);
 };
 break; }
case 6: {
 BA.debugLineNum = 965;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(16);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?awal="),searchbuilding.mostCurrent._fromtext.runMethod(true,"getText"),RemoteObject.createImmutable("&akhir="),searchbuilding.mostCurrent._totext.runMethod(true,"getText"))));
 BA.debugLineNum = 966;BA.debugLine="ExecuteRemoteQuery(\"SELECT msme_building_id,";
Debug.ShouldStop(32);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT msme_building_id, name_of_msme_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) AS latitude FROM msme_building WHERE monthly_income BETWEEN "),searchbuilding.mostCurrent._fromtext.runMethod(true,"getText"),RemoteObject.createImmutable(" AND "),searchbuilding.mostCurrent._totext.runMethod(true,"getText"),RemoteObject.createImmutable(" ORDER BY name_of_msme_building")),searchbuilding._idspin);
 break; }
}
;
 break; }
case 6: {
 BA.debugLineNum = 970;BA.debugLine="Select typesrc";
Debug.ShouldStop(512);
switch (BA.switchObjectToInt(searchbuilding.mostCurrent._typesrc,BA.ObjectToString("id"),BA.ObjectToString("owner"),BA.ObjectToString("occupant"),BA.ObjectToString("fcn owner"),BA.ObjectToString("fcn occupant"),BA.ObjectToString("income"),BA.ObjectToString("tribe"),BA.ObjectToString("village"),BA.ObjectToString("datuk"),BA.ObjectToString("construction"),BA.ObjectToString("standing year"),BA.ObjectToString("electric capacity"),BA.ObjectToString("empty"),BA.ObjectToString("inhabited"),BA.ObjectToString("education"))) {
case 0: {
 BA.debugLineNum = 972;BA.debugLine="If SearchText.Text == \"\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._searchtext.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 973;BA.debugLine="Msgbox(\"Field is empty! Please write somethi";
Debug.ShouldStop(4096);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Field is empty! Please write something in search field.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 974;BA.debugLine="Else If idspin == \"null\" Or idspin == \"\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",searchbuilding._idspin,BA.ObjectToString("null")) || RemoteObject.solveBoolean("=",searchbuilding._idspin,BA.ObjectToString(""))) { 
 BA.debugLineNum = 975;BA.debugLine="Msgbox(\"Select the building type to continue";
Debug.ShouldStop(16384);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Select the building type to continue your searching!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 976;BA.debugLine="Else If typesrc == \"null\" Or typesrc == \"\" Th";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._typesrc,BA.ObjectToString("null")) || RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._typesrc,BA.ObjectToString(""))) { 
 BA.debugLineNum = 977;BA.debugLine="Msgbox(\"Select the search type to continue y";
Debug.ShouldStop(65536);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Select the search type to continue your searching!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 978;BA.debugLine="Else If SearchText.Text == \"\" And idspin == \"";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._searchtext.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",searchbuilding._idspin,BA.ObjectToString("")) && RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._typesrc,BA.ObjectToString(""))) { 
 BA.debugLineNum = 979;BA.debugLine="Msgbox(\"Please complete all fields!\",\"Warnin";
Debug.ShouldStop(262144);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please complete all fields!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),searchbuilding.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 981;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
Debug.ShouldStop(1048576);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._searchtext.runMethod(true,"getText"))));
 BA.debugLineNum = 982;BA.debugLine="ExecuteRemoteQuery(\"SELECT house_building_id";
Debug.ShouldStop(2097152);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM house_building WHERE upper(house_building_id) like '%"),searchbuilding.mostCurrent._searchtext.runMethod(true,"getText").runMethod(true,"toUpperCase"),RemoteObject.createImmutable("%' ORDER BY house_building_id")),searchbuilding._idspin);
 }}}}
;
 break; }
case 1: {
 BA.debugLineNum = 985;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(16777216);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._searchtext.runMethod(true,"getText"))));
 BA.debugLineNum = 986;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
Debug.ShouldStop(33554432);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN house_building_owner As O ON H.fcn_owner=O.national_identity_number	WHERE upper(O.owner_name) LIKE'%"),searchbuilding.mostCurrent._searchtext.runMethod(true,"getText").runMethod(true,"toUpperCase"),RemoteObject.createImmutable("%' ORDER BY house_building_id")),searchbuilding._idspin);
 break; }
case 2: {
 BA.debugLineNum = 988;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(134217728);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._searchtext.runMethod(true,"getText"))));
 BA.debugLineNum = 989;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
Debug.ShouldStop(268435456);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id	WHERE upper(O.head_of_family) LIKE '%"),searchbuilding.mostCurrent._searchtext.runMethod(true,"getText").runMethod(true,"toUpperCase"),RemoteObject.createImmutable("%' ORDER BY house_building_id")),searchbuilding._idspin);
 break; }
case 3: {
 BA.debugLineNum = 991;BA.debugLine="Msgbox(\"Query belum ada\", \"WARNING\")";
Debug.ShouldStop(1073741824);
searchbuilding.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Query belum ada")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("WARNING"))),searchbuilding.mostCurrent.activityBA);
 break; }
case 4: {
 BA.debugLineNum = 993;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(1);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?fcn="),searchbuilding.mostCurrent._searchtext.runMethod(true,"getText"))));
 BA.debugLineNum = 994;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
Debug.ShouldStop(2);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id WHERE upper(O.family_card_number) LIKE '%"),searchbuilding.mostCurrent._searchtext.runMethod(true,"getText").runMethod(true,"toUpperCase"),RemoteObject.createImmutable("%' ORDER BY house_building_id")),searchbuilding._idspin);
 break; }
case 5: {
 BA.debugLineNum = 996;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(8);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?awal="),searchbuilding.mostCurrent._fromtext.runMethod(true,"getText"),RemoteObject.createImmutable("&akhir="),searchbuilding.mostCurrent._totext.runMethod(true,"getText"))));
 BA.debugLineNum = 997;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
Debug.ShouldStop(16);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id	WHERE income BETWEEN "),searchbuilding.mostCurrent._fromtext.runMethod(true,"getText"),RemoteObject.createImmutable(" AND "),searchbuilding.mostCurrent._totext.runMethod(true,"getText"),RemoteObject.createImmutable(" ORDER BY house_building_id")),searchbuilding._idspin);
 break; }
case 6: {
 BA.debugLineNum = 999;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(64);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 1000;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
Debug.ShouldStop(128);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id JOIN datuk As D ON O.datuk_id=D.datuk_id JOIN tribe As T ON D.tribe_id=T.tribe_id WHERE D.tribe_id = "),searchbuilding.mostCurrent._typeid,RemoteObject.createImmutable(" ORDER BY house_building_id")),searchbuilding._idspin);
 break; }
case 7: {
 BA.debugLineNum = 1002;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(512);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 1003;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
Debug.ShouldStop(1024);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id WHERE village_id = "),searchbuilding.mostCurrent._typeid,RemoteObject.createImmutable(" ORDER BY house_building_id")),searchbuilding._idspin);
 break; }
case 8: {
 BA.debugLineNum = 1005;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(4096);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 1006;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
Debug.ShouldStop(8192);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id	WHERE datuk_id = "),searchbuilding.mostCurrent._typeid,RemoteObject.createImmutable(" ORDER BY house_building_id")),searchbuilding._idspin);
 break; }
case 9: {
 BA.debugLineNum = 1008;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(32768);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 1009;BA.debugLine="ExecuteRemoteQuery(\"SELECT house_building_id,";
Debug.ShouldStop(65536);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) AS latitude	FROM house_building WHERE type_of_construction = "),searchbuilding.mostCurrent._typeid,RemoteObject.createImmutable(" ORDER BY house_building_id")),searchbuilding._idspin);
 break; }
case 10: {
 BA.debugLineNum = 1011;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(262144);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?awal="),searchbuilding.mostCurrent._fromtext.runMethod(true,"getText"),RemoteObject.createImmutable("&akhir="),searchbuilding.mostCurrent._totext.runMethod(true,"getText"))));
 BA.debugLineNum = 1012;BA.debugLine="ExecuteRemoteQuery(\"SELECT house_building_id,";
Debug.ShouldStop(524288);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM house_building WHERE standing_year BETWEEN "),searchbuilding.mostCurrent._fromtext.runMethod(true,"getText"),RemoteObject.createImmutable(" AND "),searchbuilding.mostCurrent._totext.runMethod(true,"getText"),RemoteObject.createImmutable(" ORDER BY house_building_id")),searchbuilding._idspin);
 break; }
case 11: {
 BA.debugLineNum = 1014;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(2097152);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?awal="),searchbuilding.mostCurrent._fromtext.runMethod(true,"getText"),RemoteObject.createImmutable("&akhir="),searchbuilding.mostCurrent._totext.runMethod(true,"getText"))));
 BA.debugLineNum = 1015;BA.debugLine="ExecuteRemoteQuery(\"SELECT house_building_id,";
Debug.ShouldStop(4194304);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) AS latitude	FROM house_building WHERE electricity_capacity BETWEEN "),searchbuilding.mostCurrent._fromtext.runMethod(true,"getText"),RemoteObject.createImmutable(" AND "),searchbuilding.mostCurrent._totext.runMethod(true,"getText"),RemoteObject.createImmutable(" ORDER BY house_building_id")),searchbuilding._idspin);
 break; }
case 12: {
 BA.debugLineNum = 1017;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(16777216);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php"))));
 BA.debugLineNum = 1018;BA.debugLine="ExecuteRemoteQuery(\"SELECT house_building_id,";
Debug.ShouldStop(33554432);
_executeremotequery(BA.ObjectToString("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM house_building WHERE building_status=0"),searchbuilding._idspin);
 break; }
case 13: {
 BA.debugLineNum = 1020;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(134217728);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php"))));
 BA.debugLineNum = 1021;BA.debugLine="ExecuteRemoteQuery(\"SELECT house_building_id,";
Debug.ShouldStop(268435456);
_executeremotequery(BA.ObjectToString("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) AS latitude FROM house_building WHERE building_status=1"),searchbuilding._idspin);
 break; }
case 14: {
 BA.debugLineNum = 1023;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
Debug.ShouldStop(1073741824);
searchbuilding.mostCurrent._webviewtest.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),searchbuilding.mostCurrent._main._servermap,RemoteObject.createImmutable(""),searchbuilding._idspin,RemoteObject.createImmutable("/search_"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable(".php?"),searchbuilding.mostCurrent._typesrc,RemoteObject.createImmutable("="),searchbuilding.mostCurrent._typeid)));
 BA.debugLineNum = 1024;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
Debug.ShouldStop(-2147483648);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT H.house_building_id, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id	WHERE educational_id = "),searchbuilding.mostCurrent._typeid,RemoteObject.createImmutable(" ORDER BY house_building_id")),searchbuilding._idspin);
 break; }
}
;
 break; }
}
;
 BA.debugLineNum = 1029;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _searchradius_valuechanged(RemoteObject _value,RemoteObject _userchanged) throws Exception{
try {
		Debug.PushSubsStack("SearchRadius_ValueChanged (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,1312);
if (RapidSub.canDelegate("searchradius_valuechanged")) return b4a.example.searchbuilding.remoteMe.runUserSub(false, "searchbuilding","searchradius_valuechanged", _value, _userchanged);
Debug.locals.put("Value", _value);
Debug.locals.put("UserChanged", _userchanged);
 BA.debugLineNum = 1312;BA.debugLine="Sub SearchRadius_ValueChanged (Value As Int, UserC";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1313;BA.debugLine="If UserChanged Then";
Debug.ShouldStop(1);
if (_userchanged.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1314;BA.debugLine="radiusku = Value";
Debug.ShouldStop(2);
searchbuilding._radiusku = _value;
 BA.debugLineNum = 1315;BA.debugLine="Label3.Text = Value";
Debug.ShouldStop(4);
searchbuilding.mostCurrent._label3.runMethod(true,"setText",BA.ObjectToCharSequence(_value));
 };
 BA.debugLineNum = 1317;BA.debugLine="Label3.Text = Value&\" m\"";
Debug.ShouldStop(16);
searchbuilding.mostCurrent._label3.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_value,RemoteObject.createImmutable(" m"))));
 BA.debugLineNum = 1318;BA.debugLine="Log(radiusku)";
Debug.ShouldStop(32);
searchbuilding.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(searchbuilding._radiusku)));
 BA.debugLineNum = 1319;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbackgroundtintlist(RemoteObject _view,RemoteObject _active,RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundTintList (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,223);
if (RapidSub.canDelegate("setbackgroundtintlist")) return b4a.example.searchbuilding.remoteMe.runUserSub(false, "searchbuilding","setbackgroundtintlist", _view, _active, _enabled);
RemoteObject _states = null;
RemoteObject _color = null;
RemoteObject _csl = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("View", _view);
Debug.locals.put("Active", _active);
Debug.locals.put("Enabled", _enabled);
 BA.debugLineNum = 223;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 224;BA.debugLine="Dim States(2,1) As Int";
Debug.ShouldStop(-2147483648);
_states = RemoteObject.createNewArray ("int", new int[] {2,1}, new Object[]{});Debug.locals.put("States", _states);
 BA.debugLineNum = 225;BA.debugLine="States(0,0) = 16842908     'Active";
Debug.ShouldStop(1);
_states.setArrayElement (BA.numberCast(int.class, 16842908),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 226;BA.debugLine="States(1,0) = 16842910    'Enabled";
Debug.ShouldStop(2);
_states.setArrayElement (BA.numberCast(int.class, 16842910),BA.numberCast(int.class, 1),BA.numberCast(int.class, 0));
 BA.debugLineNum = 227;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
Debug.ShouldStop(4);
_color = RemoteObject.createNewArray("int",new int[] {2},new Object[] {_active,_enabled});Debug.locals.put("Color", _color);Debug.locals.put("Color", _color);
 BA.debugLineNum = 228;BA.debugLine="Dim CSL As JavaObject";
Debug.ShouldStop(8);
_csl = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("CSL", _csl);
 BA.debugLineNum = 229;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
Debug.ShouldStop(16);
_csl.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.content.res.ColorStateList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_states),(_color)})));
 BA.debugLineNum = 230;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(32);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 231;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
Debug.ShouldStop(64);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.support.v4.view.ViewCompat")));
 BA.debugLineNum = 232;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
Debug.ShouldStop(128);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBackgroundTintList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_view.getObject()),(_csl.getObject())})));
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinbuilding_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinBuilding_ItemClick (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,1047);
if (RapidSub.canDelegate("spinbuilding_itemclick")) return b4a.example.searchbuilding.remoteMe.runUserSub(false, "searchbuilding","spinbuilding_itemclick", _position, _value);
RemoteObject _id = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1047;BA.debugLine="Sub SpinBuilding_ItemClick (Position As Int, Value";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1048;BA.debugLine="Dim id As String";
Debug.ShouldStop(8388608);
_id = RemoteObject.createImmutable("");Debug.locals.put("id", _id);
 BA.debugLineNum = 1049;BA.debugLine="id = spinnerMapB.Get(Value)";
Debug.ShouldStop(16777216);
_id = BA.ObjectToString(searchbuilding.mostCurrent._spinnermapb.runMethod(false,"Get",(Object)(_value)));Debug.locals.put("id", _id);
 BA.debugLineNum = 1050;BA.debugLine="idspin = id";
Debug.ShouldStop(33554432);
searchbuilding._idspin = _id;
 BA.debugLineNum = 1051;BA.debugLine="Log(idspin)";
Debug.ShouldStop(67108864);
searchbuilding.mostCurrent.__c.runVoidMethod ("Log",(Object)(searchbuilding._idspin));
 BA.debugLineNum = 1052;BA.debugLine="SpinSearch.Clear";
Debug.ShouldStop(134217728);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Clear");
 BA.debugLineNum = 1053;BA.debugLine="spinnerMap.Initialize";
Debug.ShouldStop(268435456);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Initialize");
 BA.debugLineNum = 1054;BA.debugLine="Select idspin";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(searchbuilding._idspin,BA.ObjectToString("All"),BA.ObjectToString("Worship"),BA.ObjectToString("Msme"),BA.ObjectToString("Office"),BA.ObjectToString("Health"),BA.ObjectToString("House"),BA.ObjectToString("Educational"))) {
case 0: {
 BA.debugLineNum = 1056;BA.debugLine="SpinSearch.Enabled = True";
Debug.ShouldStop(-2147483648);
searchbuilding.mostCurrent._spinsearch.runMethod(true,"setEnabled",searchbuilding.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1057;BA.debugLine="SpinSearch.add(\"Select Search Type\")";
Debug.ShouldStop(1);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Select Search Type")));
 BA.debugLineNum = 1058;BA.debugLine="SpinSearch.Add(\"Model\")";
Debug.ShouldStop(2);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Model")));
 BA.debugLineNum = 1059;BA.debugLine="spinnerMap.Put(\"Model\",\"model\")";
Debug.ShouldStop(4);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Model"))),(Object)((RemoteObject.createImmutable("model"))));
 break; }
case 1: {
 BA.debugLineNum = 1062;BA.debugLine="SpinSearch.Enabled = True";
Debug.ShouldStop(32);
searchbuilding.mostCurrent._spinsearch.runMethod(true,"setEnabled",searchbuilding.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1063;BA.debugLine="SpinSearch.add(\"Select Search Type\")";
Debug.ShouldStop(64);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Select Search Type")));
 BA.debugLineNum = 1064;BA.debugLine="SpinSearch.Add(\"Name\")";
Debug.ShouldStop(128);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Name")));
 BA.debugLineNum = 1065;BA.debugLine="spinnerMap.Put(\"Name\",\"name\")";
Debug.ShouldStop(256);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Name"))),(Object)((RemoteObject.createImmutable("name"))));
 BA.debugLineNum = 1066;BA.debugLine="SpinSearch.Add(\"Radius\")";
Debug.ShouldStop(512);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Radius")));
 BA.debugLineNum = 1067;BA.debugLine="spinnerMap.Put(\"Radius\",\"radius\")";
Debug.ShouldStop(1024);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Radius"))),(Object)((RemoteObject.createImmutable("radius"))));
 BA.debugLineNum = 1068;BA.debugLine="SpinSearch.Add(\"Type\")";
Debug.ShouldStop(2048);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Type")));
 BA.debugLineNum = 1069;BA.debugLine="spinnerMap.Put(\"Type\",\"type\")";
Debug.ShouldStop(4096);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Type"))),(Object)((RemoteObject.createImmutable("type"))));
 BA.debugLineNum = 1070;BA.debugLine="SpinSearch.Add(\"Jorong\")";
Debug.ShouldStop(8192);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Jorong")));
 BA.debugLineNum = 1071;BA.debugLine="spinnerMap.Put(\"Jorong\",\"jorong\")";
Debug.ShouldStop(16384);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Jorong"))),(Object)((RemoteObject.createImmutable("jorong"))));
 BA.debugLineNum = 1072;BA.debugLine="SpinSearch.Add(\"Construction\")";
Debug.ShouldStop(32768);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Construction")));
 BA.debugLineNum = 1073;BA.debugLine="spinnerMap.Put(\"Construction\",\"construction\")";
Debug.ShouldStop(65536);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Construction"))),(Object)((RemoteObject.createImmutable("construction"))));
 BA.debugLineNum = 1074;BA.debugLine="SpinSearch.Add(\"Facility\")";
Debug.ShouldStop(131072);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Facility")));
 BA.debugLineNum = 1075;BA.debugLine="spinnerMap.Put(\"Facility\",\"facility\")";
Debug.ShouldStop(262144);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Facility"))),(Object)((RemoteObject.createImmutable("facility"))));
 BA.debugLineNum = 1076;BA.debugLine="SpinSearch.Add(\"Land Area\")";
Debug.ShouldStop(524288);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Land Area")));
 BA.debugLineNum = 1077;BA.debugLine="spinnerMap.Put(\"Land Area\",\"land area\")";
Debug.ShouldStop(1048576);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Land Area"))),(Object)((RemoteObject.createImmutable("land area"))));
 BA.debugLineNum = 1078;BA.debugLine="SpinSearch.Add(\"Building Area\")";
Debug.ShouldStop(2097152);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Building Area")));
 BA.debugLineNum = 1079;BA.debugLine="spinnerMap.Put(\"Building Area\",\"building area\")";
Debug.ShouldStop(4194304);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Building Area"))),(Object)((RemoteObject.createImmutable("building area"))));
 BA.debugLineNum = 1080;BA.debugLine="SpinSearch.Add(\"Standing Year\")";
Debug.ShouldStop(8388608);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Standing Year")));
 BA.debugLineNum = 1081;BA.debugLine="spinnerMap.Put(\"Standing Year\",\"standing year\")";
Debug.ShouldStop(16777216);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Standing Year"))),(Object)((RemoteObject.createImmutable("standing year"))));
 break; }
case 2: 
case 3: {
 BA.debugLineNum = 1084;BA.debugLine="SpinSearch.Enabled = True";
Debug.ShouldStop(134217728);
searchbuilding.mostCurrent._spinsearch.runMethod(true,"setEnabled",searchbuilding.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1085;BA.debugLine="SpinSearch.add(\"Select Search Type\")";
Debug.ShouldStop(268435456);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Select Search Type")));
 BA.debugLineNum = 1086;BA.debugLine="SpinSearch.Add(\"Name\")";
Debug.ShouldStop(536870912);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Name")));
 BA.debugLineNum = 1087;BA.debugLine="spinnerMap.Put(\"Name\",\"name\")";
Debug.ShouldStop(1073741824);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Name"))),(Object)((RemoteObject.createImmutable("name"))));
 BA.debugLineNum = 1088;BA.debugLine="SpinSearch.Add(\"Radius\")";
Debug.ShouldStop(-2147483648);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Radius")));
 BA.debugLineNum = 1089;BA.debugLine="spinnerMap.Put(\"Radius\",\"radius\")";
Debug.ShouldStop(1);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Radius"))),(Object)((RemoteObject.createImmutable("radius"))));
 BA.debugLineNum = 1090;BA.debugLine="SpinSearch.Add(\"Type\")";
Debug.ShouldStop(2);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Type")));
 BA.debugLineNum = 1091;BA.debugLine="spinnerMap.Put(\"Type\",\"type\")";
Debug.ShouldStop(4);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Type"))),(Object)((RemoteObject.createImmutable("type"))));
 BA.debugLineNum = 1092;BA.debugLine="SpinSearch.Add(\"Jorong\")";
Debug.ShouldStop(8);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Jorong")));
 BA.debugLineNum = 1093;BA.debugLine="spinnerMap.Put(\"Jorong\",\"jorong\")";
Debug.ShouldStop(16);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Jorong"))),(Object)((RemoteObject.createImmutable("jorong"))));
 BA.debugLineNum = 1094;BA.debugLine="If File.Exists(datapath,\"datastore\") Then";
Debug.ShouldStop(32);
if (searchbuilding.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(searchbuilding.mostCurrent._datapath),(Object)(RemoteObject.createImmutable("datastore"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1095;BA.debugLine="If Main.kvs.ContainsKey(\"role\") == True Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",searchbuilding.mostCurrent._main._kvs.runMethod(true,"_containskey",(Object)(RemoteObject.createImmutable("role"))),searchbuilding.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1096;BA.debugLine="SpinSearch.Add(\"Income\")";
Debug.ShouldStop(128);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Income")));
 BA.debugLineNum = 1097;BA.debugLine="spinnerMap.Put(\"Income\",\"income\")";
Debug.ShouldStop(256);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Income"))),(Object)((RemoteObject.createImmutable("income"))));
 };
 };
 BA.debugLineNum = 1100;BA.debugLine="SpinSearch.Add(\"Construction\")";
Debug.ShouldStop(2048);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Construction")));
 BA.debugLineNum = 1101;BA.debugLine="spinnerMap.Put(\"Construction\",\"construction\")";
Debug.ShouldStop(4096);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Construction"))),(Object)((RemoteObject.createImmutable("construction"))));
 BA.debugLineNum = 1102;BA.debugLine="SpinSearch.Add(\"Facility\")";
Debug.ShouldStop(8192);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Facility")));
 BA.debugLineNum = 1103;BA.debugLine="spinnerMap.Put(\"Facility\",\"facility\")";
Debug.ShouldStop(16384);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Facility"))),(Object)((RemoteObject.createImmutable("facility"))));
 break; }
case 4: {
 BA.debugLineNum = 1106;BA.debugLine="SpinSearch.Enabled = True";
Debug.ShouldStop(131072);
searchbuilding.mostCurrent._spinsearch.runMethod(true,"setEnabled",searchbuilding.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1107;BA.debugLine="SpinSearch.add(\"Select Search Type\")";
Debug.ShouldStop(262144);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Select Search Type")));
 BA.debugLineNum = 1108;BA.debugLine="SpinSearch.Add(\"Name\")";
Debug.ShouldStop(524288);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Name")));
 BA.debugLineNum = 1109;BA.debugLine="spinnerMap.Put(\"Name\",\"name\")";
Debug.ShouldStop(1048576);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Name"))),(Object)((RemoteObject.createImmutable("name"))));
 BA.debugLineNum = 1110;BA.debugLine="SpinSearch.Add(\"Radius\")";
Debug.ShouldStop(2097152);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Radius")));
 BA.debugLineNum = 1111;BA.debugLine="spinnerMap.Put(\"Radius\",\"radius\")";
Debug.ShouldStop(4194304);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Radius"))),(Object)((RemoteObject.createImmutable("radius"))));
 BA.debugLineNum = 1112;BA.debugLine="SpinSearch.Add(\"Type\")";
Debug.ShouldStop(8388608);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Type")));
 BA.debugLineNum = 1113;BA.debugLine="spinnerMap.Put(\"Type\",\"type\")";
Debug.ShouldStop(16777216);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Type"))),(Object)((RemoteObject.createImmutable("type"))));
 BA.debugLineNum = 1114;BA.debugLine="SpinSearch.Add(\"Jorong\")";
Debug.ShouldStop(33554432);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Jorong")));
 BA.debugLineNum = 1115;BA.debugLine="spinnerMap.Put(\"Jorong\",\"jorong\")";
Debug.ShouldStop(67108864);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Jorong"))),(Object)((RemoteObject.createImmutable("jorong"))));
 BA.debugLineNum = 1116;BA.debugLine="SpinSearch.Add(\"Facility\")";
Debug.ShouldStop(134217728);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Facility")));
 BA.debugLineNum = 1117;BA.debugLine="spinnerMap.Put(\"Facility\",\"facility\")";
Debug.ShouldStop(268435456);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Facility"))),(Object)((RemoteObject.createImmutable("facility"))));
 break; }
case 5: {
 BA.debugLineNum = 1120;BA.debugLine="SpinSearch.Enabled = True";
Debug.ShouldStop(-2147483648);
searchbuilding.mostCurrent._spinsearch.runMethod(true,"setEnabled",searchbuilding.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1121;BA.debugLine="SpinSearch.add(\"Select Search Type\")";
Debug.ShouldStop(1);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Select Search Type")));
 BA.debugLineNum = 1122;BA.debugLine="SpinSearch.Add(\"ID Rumah\")";
Debug.ShouldStop(2);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("ID Rumah")));
 BA.debugLineNum = 1123;BA.debugLine="spinnerMap.Put(\"ID Rumah\",\"id\")";
Debug.ShouldStop(4);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ID Rumah"))),(Object)((RemoteObject.createImmutable("id"))));
 BA.debugLineNum = 1124;BA.debugLine="If File.Exists(datapath,\"datastore\") Then";
Debug.ShouldStop(8);
if (searchbuilding.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(searchbuilding.mostCurrent._datapath),(Object)(RemoteObject.createImmutable("datastore"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1125;BA.debugLine="If Main.kvs.ContainsKey(\"role\") Then";
Debug.ShouldStop(16);
if (searchbuilding.mostCurrent._main._kvs.runMethod(true,"_containskey",(Object)(RemoteObject.createImmutable("role"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1126;BA.debugLine="SpinSearch.Add(\"Owner\")";
Debug.ShouldStop(32);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Owner")));
 BA.debugLineNum = 1127;BA.debugLine="spinnerMap.Put(\"Owner\",\"owner\")";
Debug.ShouldStop(64);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Owner"))),(Object)((RemoteObject.createImmutable("owner"))));
 BA.debugLineNum = 1128;BA.debugLine="SpinSearch.Add(\"Occupant\")";
Debug.ShouldStop(128);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Occupant")));
 BA.debugLineNum = 1129;BA.debugLine="spinnerMap.Put(\"Occupant\",\"occupant\")";
Debug.ShouldStop(256);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Occupant"))),(Object)((RemoteObject.createImmutable("occupant"))));
 BA.debugLineNum = 1130;BA.debugLine="SpinSearch.Add(\"FCN Owner\")";
Debug.ShouldStop(512);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("FCN Owner")));
 BA.debugLineNum = 1131;BA.debugLine="spinnerMap.Put(\"FCN Owner\",\"fcn owner\")";
Debug.ShouldStop(1024);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FCN Owner"))),(Object)((RemoteObject.createImmutable("fcn owner"))));
 BA.debugLineNum = 1132;BA.debugLine="SpinSearch.Add(\"FCN Occupant\")";
Debug.ShouldStop(2048);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("FCN Occupant")));
 BA.debugLineNum = 1133;BA.debugLine="spinnerMap.Put(\"FCN Occupant\",\"fcn occupant\")";
Debug.ShouldStop(4096);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FCN Occupant"))),(Object)((RemoteObject.createImmutable("fcn occupant"))));
 BA.debugLineNum = 1134;BA.debugLine="SpinSearch.Add(\"Income\")";
Debug.ShouldStop(8192);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Income")));
 BA.debugLineNum = 1135;BA.debugLine="spinnerMap.Put(\"Income\",\"income\")";
Debug.ShouldStop(16384);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Income"))),(Object)((RemoteObject.createImmutable("income"))));
 BA.debugLineNum = 1136;BA.debugLine="SpinSearch.Add(\"Datuk\")";
Debug.ShouldStop(32768);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Datuk")));
 BA.debugLineNum = 1137;BA.debugLine="spinnerMap.Put(\"Datuk\",\"datuk\")";
Debug.ShouldStop(65536);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Datuk"))),(Object)((RemoteObject.createImmutable("datuk"))));
 BA.debugLineNum = 1138;BA.debugLine="SpinSearch.Add(\"Tribe\")";
Debug.ShouldStop(131072);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Tribe")));
 BA.debugLineNum = 1139;BA.debugLine="spinnerMap.Put(\"Tribe\",\"tribe\")";
Debug.ShouldStop(262144);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Tribe"))),(Object)((RemoteObject.createImmutable("tribe"))));
 BA.debugLineNum = 1140;BA.debugLine="SpinSearch.Add(\"Village\")";
Debug.ShouldStop(524288);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Village")));
 BA.debugLineNum = 1141;BA.debugLine="spinnerMap.Put(\"Village\",\"village\")";
Debug.ShouldStop(1048576);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Village"))),(Object)((RemoteObject.createImmutable("village"))));
 BA.debugLineNum = 1142;BA.debugLine="SpinSearch.Add(\"Construction\")";
Debug.ShouldStop(2097152);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Construction")));
 BA.debugLineNum = 1143;BA.debugLine="spinnerMap.Put(\"Construction\",\"construction\")";
Debug.ShouldStop(4194304);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Construction"))),(Object)((RemoteObject.createImmutable("construction"))));
 BA.debugLineNum = 1144;BA.debugLine="SpinSearch.Add(\"Standing Year\")";
Debug.ShouldStop(8388608);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Standing Year")));
 BA.debugLineNum = 1145;BA.debugLine="spinnerMap.Put(\"Standing Year\",\"standing year";
Debug.ShouldStop(16777216);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Standing Year"))),(Object)((RemoteObject.createImmutable("standing year"))));
 BA.debugLineNum = 1146;BA.debugLine="SpinSearch.Add(\"Electric Capacity\")";
Debug.ShouldStop(33554432);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Electric Capacity")));
 BA.debugLineNum = 1147;BA.debugLine="spinnerMap.Put(\"Electric Capacity\",\"electric";
Debug.ShouldStop(67108864);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Electric Capacity"))),(Object)((RemoteObject.createImmutable("electric capacity"))));
 BA.debugLineNum = 1148;BA.debugLine="SpinSearch.Add(\"Education\")";
Debug.ShouldStop(134217728);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Education")));
 BA.debugLineNum = 1149;BA.debugLine="spinnerMap.Put(\"Education\",\"education\")";
Debug.ShouldStop(268435456);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Education"))),(Object)((RemoteObject.createImmutable("education"))));
 BA.debugLineNum = 1150;BA.debugLine="SpinSearch.Add(\"Inhabited House\")";
Debug.ShouldStop(536870912);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Inhabited House")));
 BA.debugLineNum = 1151;BA.debugLine="spinnerMap.Put(\"Inhabited House\",\"inhabited\")";
Debug.ShouldStop(1073741824);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Inhabited House"))),(Object)((RemoteObject.createImmutable("inhabited"))));
 BA.debugLineNum = 1152;BA.debugLine="SpinSearch.Add(\"Empty House\")";
Debug.ShouldStop(-2147483648);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Empty House")));
 BA.debugLineNum = 1153;BA.debugLine="spinnerMap.Put(\"Empty House\",\"empty\")";
Debug.ShouldStop(1);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Empty House"))),(Object)((RemoteObject.createImmutable("empty"))));
 };
 };
 break; }
case 6: {
 BA.debugLineNum = 1158;BA.debugLine="SpinSearch.Enabled = True";
Debug.ShouldStop(32);
searchbuilding.mostCurrent._spinsearch.runMethod(true,"setEnabled",searchbuilding.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1159;BA.debugLine="SpinSearch.add(\"Select Search Type\")";
Debug.ShouldStop(64);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Select Search Type")));
 BA.debugLineNum = 1160;BA.debugLine="SpinSearch.Add(\"Name\")";
Debug.ShouldStop(128);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Name")));
 BA.debugLineNum = 1161;BA.debugLine="spinnerMap.Put(\"Name\",\"name\")";
Debug.ShouldStop(256);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Name"))),(Object)((RemoteObject.createImmutable("name"))));
 BA.debugLineNum = 1162;BA.debugLine="SpinSearch.Add(\"Radius\")";
Debug.ShouldStop(512);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Radius")));
 BA.debugLineNum = 1163;BA.debugLine="spinnerMap.Put(\"Radius\",\"radius\")";
Debug.ShouldStop(1024);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Radius"))),(Object)((RemoteObject.createImmutable("radius"))));
 BA.debugLineNum = 1164;BA.debugLine="SpinSearch.Add(\"Type\")";
Debug.ShouldStop(2048);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Type")));
 BA.debugLineNum = 1165;BA.debugLine="spinnerMap.Put(\"Type\",\"type\")";
Debug.ShouldStop(4096);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Type"))),(Object)((RemoteObject.createImmutable("type"))));
 BA.debugLineNum = 1166;BA.debugLine="SpinSearch.Add(\"Status\")";
Debug.ShouldStop(8192);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Status")));
 BA.debugLineNum = 1167;BA.debugLine="spinnerMap.Put(\"Status\",\"status\")";
Debug.ShouldStop(16384);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Status"))),(Object)((RemoteObject.createImmutable("status"))));
 BA.debugLineNum = 1168;BA.debugLine="SpinSearch.Add(\"Jorong\")";
Debug.ShouldStop(32768);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Jorong")));
 BA.debugLineNum = 1169;BA.debugLine="spinnerMap.Put(\"Jorong\",\"jorong\")";
Debug.ShouldStop(65536);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Jorong"))),(Object)((RemoteObject.createImmutable("jorong"))));
 BA.debugLineNum = 1170;BA.debugLine="SpinSearch.Add(\"Construction\")";
Debug.ShouldStop(131072);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Construction")));
 BA.debugLineNum = 1171;BA.debugLine="spinnerMap.Put(\"Construction\",\"construction\")";
Debug.ShouldStop(262144);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Construction"))),(Object)((RemoteObject.createImmutable("construction"))));
 BA.debugLineNum = 1172;BA.debugLine="SpinSearch.Add(\"Facility\")";
Debug.ShouldStop(524288);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Facility")));
 BA.debugLineNum = 1173;BA.debugLine="spinnerMap.Put(\"Facility\",\"facility\")";
Debug.ShouldStop(1048576);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Facility"))),(Object)((RemoteObject.createImmutable("facility"))));
 BA.debugLineNum = 1174;BA.debugLine="SpinSearch.Add(\"Land Area\")";
Debug.ShouldStop(2097152);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Land Area")));
 BA.debugLineNum = 1175;BA.debugLine="spinnerMap.Put(\"Land Area\",\"land area\")";
Debug.ShouldStop(4194304);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Land Area"))),(Object)((RemoteObject.createImmutable("land area"))));
 BA.debugLineNum = 1176;BA.debugLine="SpinSearch.Add(\"Building Area\")";
Debug.ShouldStop(8388608);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Building Area")));
 BA.debugLineNum = 1177;BA.debugLine="spinnerMap.Put(\"Building Area\",\"building area\")";
Debug.ShouldStop(16777216);
searchbuilding.mostCurrent._spinnermap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Building Area"))),(Object)((RemoteObject.createImmutable("building area"))));
 break; }
default: {
 BA.debugLineNum = 1180;BA.debugLine="SpinSearch.Clear";
Debug.ShouldStop(134217728);
searchbuilding.mostCurrent._spinsearch.runVoidMethod ("Clear");
 BA.debugLineNum = 1181;BA.debugLine="SpinJorong.Clear";
Debug.ShouldStop(268435456);
searchbuilding.mostCurrent._spinjorong.runVoidMethod ("Clear");
 BA.debugLineNum = 1182;BA.debugLine="SpinSearch.Enabled = False";
Debug.ShouldStop(536870912);
searchbuilding.mostCurrent._spinsearch.runMethod(true,"setEnabled",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1183;BA.debugLine="SpinJorong.Visible = False";
Debug.ShouldStop(1073741824);
searchbuilding.mostCurrent._spinjorong.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1184;BA.debugLine="SearchRadius.Visible = False";
Debug.ShouldStop(-2147483648);
searchbuilding.mostCurrent._searchradius.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1185;BA.debugLine="SearchText.Visible = True";
Debug.ShouldStop(1);
searchbuilding.mostCurrent._searchtext.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"True"));
 break; }
}
;
 BA.debugLineNum = 1188;BA.debugLine="SpinSearch.SelectedIndex=0";
Debug.ShouldStop(8);
searchbuilding.mostCurrent._spinsearch.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1189;BA.debugLine="SpinJorong.Clear";
Debug.ShouldStop(16);
searchbuilding.mostCurrent._spinjorong.runVoidMethod ("Clear");
 BA.debugLineNum = 1190;BA.debugLine="SpinType.Clear";
Debug.ShouldStop(32);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Clear");
 BA.debugLineNum = 1191;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinsearch_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinSearch_ItemClick (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,1193);
if (RapidSub.canDelegate("spinsearch_itemclick")) return b4a.example.searchbuilding.remoteMe.runUserSub(false, "searchbuilding","spinsearch_itemclick", _position, _value);
RemoteObject _id = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1193;BA.debugLine="Sub SpinSearch_ItemClick (Position As Int, Value A";
Debug.ShouldStop(256);
 BA.debugLineNum = 1194;BA.debugLine="Dim id As String";
Debug.ShouldStop(512);
_id = RemoteObject.createImmutable("");Debug.locals.put("id", _id);
 BA.debugLineNum = 1195;BA.debugLine="id = spinnerMap.Get(Value)";
Debug.ShouldStop(1024);
_id = BA.ObjectToString(searchbuilding.mostCurrent._spinnermap.runMethod(false,"Get",(Object)(_value)));Debug.locals.put("id", _id);
 BA.debugLineNum = 1196;BA.debugLine="typesrc = id";
Debug.ShouldStop(2048);
searchbuilding.mostCurrent._typesrc = _id;
 BA.debugLineNum = 1197;BA.debugLine="Log(typesrc)";
Debug.ShouldStop(4096);
searchbuilding.mostCurrent.__c.runVoidMethod ("Log",(Object)(searchbuilding.mostCurrent._typesrc));
 BA.debugLineNum = 1198;BA.debugLine="SpinJorong.SelectedIndex = 0";
Debug.ShouldStop(8192);
searchbuilding.mostCurrent._spinjorong.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1199;BA.debugLine="Select typesrc";
Debug.ShouldStop(16384);
switch (BA.switchObjectToInt(searchbuilding.mostCurrent._typesrc,BA.ObjectToString("null"),BA.ObjectToString("radius"),BA.ObjectToString("jorong"),BA.ObjectToString("type"),BA.ObjectToString("construction"),BA.ObjectToString("status"),BA.ObjectToString("model"),BA.ObjectToString("tribe"),BA.ObjectToString("village"),BA.ObjectToString("datuk"),BA.ObjectToString("education"),BA.ObjectToString("facility"),BA.ObjectToString("land area"),BA.ObjectToString("building area"),BA.ObjectToString("standing year"),BA.ObjectToString("income"),BA.ObjectToString("electric capacity"))) {
case 0: {
 BA.debugLineNum = 1201;BA.debugLine="Label3.Visible=False";
Debug.ShouldStop(65536);
searchbuilding.mostCurrent._label3.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1202;BA.debugLine="FromText.Visible=False";
Debug.ShouldStop(131072);
searchbuilding.mostCurrent._fromtext.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1203;BA.debugLine="ToText.Visible=False";
Debug.ShouldStop(262144);
searchbuilding.mostCurrent._totext.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1204;BA.debugLine="FacilityBtn.Visible=False";
Debug.ShouldStop(524288);
searchbuilding.mostCurrent._facilitybtn.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1205;BA.debugLine="SearchText.Enabled = False";
Debug.ShouldStop(1048576);
searchbuilding.mostCurrent._searchtext.runMethod(true,"setEnabled",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1206;BA.debugLine="SearchText.Visible = True";
Debug.ShouldStop(2097152);
searchbuilding.mostCurrent._searchtext.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1207;BA.debugLine="SearchRadius.Visible = False";
Debug.ShouldStop(4194304);
searchbuilding.mostCurrent._searchradius.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1208;BA.debugLine="SpinJorong.Visible = False";
Debug.ShouldStop(8388608);
searchbuilding.mostCurrent._spinjorong.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1209;BA.debugLine="SpinType.Visible = False";
Debug.ShouldStop(16777216);
searchbuilding.mostCurrent._spintype.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1210;BA.debugLine="SearchTextPanel.Color = Colors.White";
Debug.ShouldStop(33554432);
searchbuilding.mostCurrent._searchtextpanel.runVoidMethod ("setColor",searchbuilding.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1211;BA.debugLine="SearchText.Text = \"\"";
Debug.ShouldStop(67108864);
searchbuilding.mostCurrent._searchtext.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1212;BA.debugLine="SpinJorong.Clear";
Debug.ShouldStop(134217728);
searchbuilding.mostCurrent._spinjorong.runVoidMethod ("Clear");
 BA.debugLineNum = 1213;BA.debugLine="SpinType.Clear";
Debug.ShouldStop(268435456);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Clear");
 break; }
case 1: {
 BA.debugLineNum = 1216;BA.debugLine="Label3.Visible=True";
Debug.ShouldStop(-2147483648);
searchbuilding.mostCurrent._label3.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1217;BA.debugLine="FromText.Visible=False";
Debug.ShouldStop(1);
searchbuilding.mostCurrent._fromtext.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1218;BA.debugLine="ToText.Visible=False";
Debug.ShouldStop(2);
searchbuilding.mostCurrent._totext.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1219;BA.debugLine="FacilityBtn.Visible=False";
Debug.ShouldStop(4);
searchbuilding.mostCurrent._facilitybtn.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1220;BA.debugLine="SearchText.Visible = False";
Debug.ShouldStop(8);
searchbuilding.mostCurrent._searchtext.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1221;BA.debugLine="SpinJorong.Visible = False";
Debug.ShouldStop(16);
searchbuilding.mostCurrent._spinjorong.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1222;BA.debugLine="SearchRadius.Visible = True";
Debug.ShouldStop(32);
searchbuilding.mostCurrent._searchradius.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1223;BA.debugLine="SearchRadius.Max = 10000";
Debug.ShouldStop(64);
searchbuilding.mostCurrent._searchradius.runMethod(true,"setMax",BA.numberCast(int.class, 10000));
 BA.debugLineNum = 1224;BA.debugLine="SpinType.Visible = False";
Debug.ShouldStop(128);
searchbuilding.mostCurrent._spintype.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1225;BA.debugLine="SpinType.Clear";
Debug.ShouldStop(256);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Clear");
 BA.debugLineNum = 1226;BA.debugLine="SearchTextPanel.Color = Colors.Transparent";
Debug.ShouldStop(512);
searchbuilding.mostCurrent._searchtextpanel.runVoidMethod ("setColor",searchbuilding.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 1227;BA.debugLine="SpinJorong.Clear";
Debug.ShouldStop(1024);
searchbuilding.mostCurrent._spinjorong.runVoidMethod ("Clear");
 break; }
case 2: 
case 3: 
case 4: 
case 5: 
case 6: 
case 7: 
case 8: 
case 9: 
case 10: {
 BA.debugLineNum = 1230;BA.debugLine="FromText.Visible=False";
Debug.ShouldStop(8192);
searchbuilding.mostCurrent._fromtext.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1231;BA.debugLine="ToText.Visible=False";
Debug.ShouldStop(16384);
searchbuilding.mostCurrent._totext.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1232;BA.debugLine="SearchTextPanel.Color = Colors.White";
Debug.ShouldStop(32768);
searchbuilding.mostCurrent._searchtextpanel.runVoidMethod ("setColor",searchbuilding.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1233;BA.debugLine="SpinType.Visible = True";
Debug.ShouldStop(65536);
searchbuilding.mostCurrent._spintype.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1234;BA.debugLine="SpinType.Clear";
Debug.ShouldStop(131072);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Clear");
 BA.debugLineNum = 1235;BA.debugLine="CreateSpinType_Item";
Debug.ShouldStop(262144);
_createspintype_item();
 BA.debugLineNum = 1236;BA.debugLine="FacilityBtn.Visible=False";
Debug.ShouldStop(524288);
searchbuilding.mostCurrent._facilitybtn.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1237;BA.debugLine="SearchText.Visible = False";
Debug.ShouldStop(1048576);
searchbuilding.mostCurrent._searchtext.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1238;BA.debugLine="SearchRadius.Visible = False";
Debug.ShouldStop(2097152);
searchbuilding.mostCurrent._searchradius.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1239;BA.debugLine="SpinJorong.Visible = False";
Debug.ShouldStop(4194304);
searchbuilding.mostCurrent._spinjorong.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1240;BA.debugLine="Label3.Visible=False";
Debug.ShouldStop(8388608);
searchbuilding.mostCurrent._label3.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 break; }
case 11: {
 BA.debugLineNum = 1243;BA.debugLine="Label3.Visible=False";
Debug.ShouldStop(67108864);
searchbuilding.mostCurrent._label3.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1244;BA.debugLine="FromText.Visible=False";
Debug.ShouldStop(134217728);
searchbuilding.mostCurrent._fromtext.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1245;BA.debugLine="ToText.Visible=False";
Debug.ShouldStop(268435456);
searchbuilding.mostCurrent._totext.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1246;BA.debugLine="FacilityBtn.Visible=True";
Debug.ShouldStop(536870912);
searchbuilding.mostCurrent._facilitybtn.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1247;BA.debugLine="SearchText.Visible = False";
Debug.ShouldStop(1073741824);
searchbuilding.mostCurrent._searchtext.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1248;BA.debugLine="SearchRadius.Visible = False";
Debug.ShouldStop(-2147483648);
searchbuilding.mostCurrent._searchradius.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1249;BA.debugLine="SpinJorong.Visible = False";
Debug.ShouldStop(1);
searchbuilding.mostCurrent._spinjorong.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1250;BA.debugLine="SpinType.Visible = False";
Debug.ShouldStop(2);
searchbuilding.mostCurrent._spintype.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1251;BA.debugLine="SearchTextPanel.Color = Colors.Transparent";
Debug.ShouldStop(4);
searchbuilding.mostCurrent._searchtextpanel.runVoidMethod ("setColor",searchbuilding.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 1252;BA.debugLine="SpinJorong.Clear";
Debug.ShouldStop(8);
searchbuilding.mostCurrent._spinjorong.runVoidMethod ("Clear");
 BA.debugLineNum = 1253;BA.debugLine="SpinType.Clear";
Debug.ShouldStop(16);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Clear");
 break; }
case 12: 
case 13: 
case 14: 
case 15: 
case 16: {
 BA.debugLineNum = 1256;BA.debugLine="Label3.Visible=False";
Debug.ShouldStop(128);
searchbuilding.mostCurrent._label3.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1257;BA.debugLine="FromText.Visible=True";
Debug.ShouldStop(256);
searchbuilding.mostCurrent._fromtext.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1258;BA.debugLine="ToText.Visible=True";
Debug.ShouldStop(512);
searchbuilding.mostCurrent._totext.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1259;BA.debugLine="FromText.Text=\"\"";
Debug.ShouldStop(1024);
searchbuilding.mostCurrent._fromtext.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1260;BA.debugLine="ToText.Text=\"\"";
Debug.ShouldStop(2048);
searchbuilding.mostCurrent._totext.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1261;BA.debugLine="FacilityBtn.Visible=False";
Debug.ShouldStop(4096);
searchbuilding.mostCurrent._facilitybtn.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1262;BA.debugLine="SearchText.Visible = False";
Debug.ShouldStop(8192);
searchbuilding.mostCurrent._searchtext.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1263;BA.debugLine="SearchRadius.Visible = False";
Debug.ShouldStop(16384);
searchbuilding.mostCurrent._searchradius.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1264;BA.debugLine="SpinJorong.Visible = False";
Debug.ShouldStop(32768);
searchbuilding.mostCurrent._spinjorong.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1265;BA.debugLine="SpinType.Visible = False";
Debug.ShouldStop(65536);
searchbuilding.mostCurrent._spintype.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1266;BA.debugLine="SearchTextPanel.Color = Colors.Transparent";
Debug.ShouldStop(131072);
searchbuilding.mostCurrent._searchtextpanel.runVoidMethod ("setColor",searchbuilding.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 1267;BA.debugLine="SpinJorong.Clear";
Debug.ShouldStop(262144);
searchbuilding.mostCurrent._spinjorong.runVoidMethod ("Clear");
 BA.debugLineNum = 1268;BA.debugLine="SpinType.Clear";
Debug.ShouldStop(524288);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Clear");
 break; }
default: {
 BA.debugLineNum = 1271;BA.debugLine="Label3.Visible=False";
Debug.ShouldStop(4194304);
searchbuilding.mostCurrent._label3.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1272;BA.debugLine="FromText.Visible=False";
Debug.ShouldStop(8388608);
searchbuilding.mostCurrent._fromtext.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1273;BA.debugLine="ToText.Visible=False";
Debug.ShouldStop(16777216);
searchbuilding.mostCurrent._totext.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1274;BA.debugLine="FacilityBtn.Visible=False";
Debug.ShouldStop(33554432);
searchbuilding.mostCurrent._facilitybtn.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1275;BA.debugLine="SearchText.Visible = True";
Debug.ShouldStop(67108864);
searchbuilding.mostCurrent._searchtext.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1276;BA.debugLine="SearchRadius.Visible = False";
Debug.ShouldStop(134217728);
searchbuilding.mostCurrent._searchradius.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1277;BA.debugLine="SpinJorong.Visible = False";
Debug.ShouldStop(268435456);
searchbuilding.mostCurrent._spinjorong.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1278;BA.debugLine="SpinType.Visible = False";
Debug.ShouldStop(536870912);
searchbuilding.mostCurrent._spintype.runMethod(true,"setVisible",searchbuilding.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1279;BA.debugLine="SearchTextPanel.Color = Colors.White";
Debug.ShouldStop(1073741824);
searchbuilding.mostCurrent._searchtextpanel.runVoidMethod ("setColor",searchbuilding.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1280;BA.debugLine="SearchText.Text = \"\"";
Debug.ShouldStop(-2147483648);
searchbuilding.mostCurrent._searchtext.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1281;BA.debugLine="SpinJorong.Clear";
Debug.ShouldStop(1);
searchbuilding.mostCurrent._spinjorong.runVoidMethod ("Clear");
 BA.debugLineNum = 1282;BA.debugLine="SpinType.Clear";
Debug.ShouldStop(2);
searchbuilding.mostCurrent._spintype.runVoidMethod ("Clear");
 break; }
}
;
 BA.debugLineNum = 1284;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spintype_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinType_ItemClick (searchbuilding) ","searchbuilding",4,searchbuilding.mostCurrent.activityBA,searchbuilding.mostCurrent,1286);
if (RapidSub.canDelegate("spintype_itemclick")) return b4a.example.searchbuilding.remoteMe.runUserSub(false, "searchbuilding","spintype_itemclick", _position, _value);
RemoteObject _id = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1286;BA.debugLine="Sub SpinType_ItemClick (Position As Int, Value As";
Debug.ShouldStop(32);
 BA.debugLineNum = 1287;BA.debugLine="Dim id As String";
Debug.ShouldStop(64);
_id = RemoteObject.createImmutable("");Debug.locals.put("id", _id);
 BA.debugLineNum = 1288;BA.debugLine="id = spinnerMapT.Get(Value)";
Debug.ShouldStop(128);
_id = BA.ObjectToString(searchbuilding.mostCurrent._spinnermapt.runMethod(false,"Get",(Object)(_value)));Debug.locals.put("id", _id);
 BA.debugLineNum = 1289;BA.debugLine="typeid = id";
Debug.ShouldStop(256);
searchbuilding.mostCurrent._typeid = _id;
 BA.debugLineNum = 1290;BA.debugLine="Log(typeid)";
Debug.ShouldStop(512);
searchbuilding.mostCurrent.__c.runVoidMethod ("Log",(Object)(searchbuilding.mostCurrent._typeid));
 BA.debugLineNum = 1291;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}