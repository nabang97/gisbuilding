package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class manualposition_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (manualposition) ","manualposition",10,manualposition.mostCurrent.activityBA,manualposition.mostCurrent,41);
if (RapidSub.canDelegate("activity_create")) return b4a.example.manualposition.remoteMe.runUserSub(false, "manualposition","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 41;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 44;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(2048);
manualposition.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),manualposition.mostCurrent.activityBA);
 BA.debugLineNum = 45;BA.debugLine="ScrollView1.Panel.Width=100%x";
Debug.ShouldStop(4096);
manualposition.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setWidth",manualposition.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),manualposition.mostCurrent.activityBA));
 BA.debugLineNum = 46;BA.debugLine="ScrollView1.Panel.LoadLayout(\"MapLocation\")";
Debug.ShouldStop(8192);
manualposition.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MapLocation")),manualposition.mostCurrent.activityBA);
 BA.debugLineNum = 47;BA.debugLine="BackArrow.Visible= False";
Debug.ShouldStop(16384);
manualposition.mostCurrent._backarrow.runMethod(true,"setVisible",manualposition.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 48;BA.debugLine="TitleBar.Text=\"Your Position\"";
Debug.ShouldStop(32768);
manualposition.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("Your Position"));
 BA.debugLineNum = 49;BA.debugLine="manager.SetBoolean(\"legend\",False)";
Debug.ShouldStop(65536);
manualposition._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("legend")),(Object)(manualposition.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 50;BA.debugLine="manager.SetBoolean(\"position_click\", True)";
Debug.ShouldStop(131072);
manualposition._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("position_click")),(Object)(manualposition.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 51;BA.debugLine="WebView1.Height= 100%y - (PanelToolBar.Height + P";
Debug.ShouldStop(262144);
manualposition.mostCurrent._webview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {manualposition.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),manualposition.mostCurrent.activityBA),(RemoteObject.solve(new RemoteObject[] {manualposition.mostCurrent._paneltoolbar.runMethod(true,"getHeight"),manualposition.mostCurrent._panelbar.runMethod(true,"getHeight"),manualposition.mostCurrent._webview1.runMethod(true,"getTop")}, "++",2, 1))}, "-",1, 1));
 BA.debugLineNum = 52;BA.debugLine="Panel1.Height = WebView1.Height + WebView1.Top";
Debug.ShouldStop(524288);
manualposition.mostCurrent._panel1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {manualposition.mostCurrent._webview1.runMethod(true,"getHeight"),manualposition.mostCurrent._webview1.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 53;BA.debugLine="btnSaveLocation.Top = 100%y - 25%y";
Debug.ShouldStop(1048576);
manualposition.mostCurrent._btnsavelocation.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {manualposition.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),manualposition.mostCurrent.activityBA),manualposition.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),manualposition.mostCurrent.activityBA)}, "-",1, 1));
 BA.debugLineNum = 54;BA.debugLine="Legend.Top = 100%y - (26%y + Legend.Height)";
Debug.ShouldStop(2097152);
manualposition.mostCurrent._legend.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {manualposition.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),manualposition.mostCurrent.activityBA),(RemoteObject.solve(new RemoteObject[] {manualposition.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 26)),manualposition.mostCurrent.activityBA),manualposition.mostCurrent._legend.runMethod(true,"getHeight")}, "+",1, 1))}, "-",1, 1));
 BA.debugLineNum = 55;BA.debugLine="ScrollView1.Panel.Height = Panel1.Height";
Debug.ShouldStop(4194304);
manualposition.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",manualposition.mostCurrent._panel1.runMethod(true,"getHeight"));
 BA.debugLineNum = 56;BA.debugLine="Legend.Visible = False";
Debug.ShouldStop(8388608);
manualposition.mostCurrent._legend.runMethod(true,"setVisible",manualposition.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 58;BA.debugLine="ScrollView1.Height = Panel1.Height";
Debug.ShouldStop(33554432);
manualposition.mostCurrent._scrollview1.runMethod(true,"setHeight",manualposition.mostCurrent._panel1.runMethod(true,"getHeight"));
 BA.debugLineNum = 59;BA.debugLine="If latGps == 0 Or latGps == 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",manualposition._latgps,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",manualposition._latgps,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 60;BA.debugLine="Msgbox(\"GPS can't find your location. Try to ref";
Debug.ShouldStop(134217728);
manualposition.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("GPS can't find your location. Try to refresh or open the application outside the room.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),manualposition.mostCurrent.activityBA);
 BA.debugLineNum = 61;BA.debugLine="lat = -0.3209284";
Debug.ShouldStop(268435456);
manualposition._lat = BA.numberCast(double.class, -0.3209284);
 BA.debugLineNum = 62;BA.debugLine="lng = 100.3484996";
Debug.ShouldStop(536870912);
manualposition._lng = BA.numberCast(double.class, 100.3484996);
 }else {
 BA.debugLineNum = 64;BA.debugLine="lat = latGps";
Debug.ShouldStop(-2147483648);
manualposition._lat = manualposition._latgps;
 BA.debugLineNum = 65;BA.debugLine="lng = lngGps";
Debug.ShouldStop(1);
manualposition._lng = manualposition._lnggps;
 };
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (manualposition) ","manualposition",10,manualposition.mostCurrent.activityBA,manualposition.mostCurrent,80);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.manualposition.remoteMe.runUserSub(false, "manualposition","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 80;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Activity_Resume (manualposition) ","manualposition",10,manualposition.mostCurrent.activityBA,manualposition.mostCurrent,70);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.manualposition.remoteMe.runUserSub(false, "manualposition","activity_resume");
RemoteObject _webviewextras1 = RemoteObject.declareNull("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 BA.debugLineNum = 70;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32);
 BA.debugLineNum = 74;BA.debugLine="Log(\"Firsttime : \"&lat&\",\"&lng)";
Debug.ShouldStop(512);
manualposition.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Firsttime : "),manualposition._lat,RemoteObject.createImmutable(","),manualposition._lng)));
 BA.debugLineNum = 75;BA.debugLine="Dim WebViewExtras1 As WebViewExtras";
Debug.ShouldStop(1024);
_webviewextras1 = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");Debug.locals.put("WebViewExtras1", _webviewextras1);
 BA.debugLineNum = 76;BA.debugLine="WebViewExtras1.addJavascriptInterface(WebView1, \"";
Debug.ShouldStop(2048);
_webviewextras1.runVoidMethod ("addJavascriptInterface",manualposition.mostCurrent.activityBA,(Object)((manualposition.mostCurrent._webview1.getObject())),(Object)(RemoteObject.createImmutable("B4A")));
 BA.debugLineNum = 77;BA.debugLine="WebView1.LoadUrl(Main.Server&\"user_position.php?l";
Debug.ShouldStop(4096);
manualposition.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(manualposition.mostCurrent._main._server,RemoteObject.createImmutable("user_position.php?lat="),manualposition._lat,RemoteObject.createImmutable("&lng="),manualposition._lng,RemoteObject.createImmutable("&legend="),manualposition._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("legend"))))));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("BtnHome_Click (manualposition) ","manualposition",10,manualposition.mostCurrent.activityBA,manualposition.mostCurrent,229);
if (RapidSub.canDelegate("btnhome_click")) return b4a.example.manualposition.remoteMe.runUserSub(false, "manualposition","btnhome_click");
 BA.debugLineNum = 229;BA.debugLine="Sub BtnHome_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 230;BA.debugLine="If File.Exists(Main.folder,\"datastore\") Then";
Debug.ShouldStop(32);
if (manualposition.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(manualposition.mostCurrent._main._folder),(Object)(RemoteObject.createImmutable("datastore"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 231;BA.debugLine="If Main.kvs.ContainsKey(\"role\") == True Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",manualposition.mostCurrent._main._kvs.runMethod(true,"_containskey",(Object)(RemoteObject.createImmutable("role"))),manualposition.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 233;BA.debugLine="StartActivity(HomeAdmin)";
Debug.ShouldStop(256);
manualposition.mostCurrent.__c.runVoidMethod ("StartActivity",manualposition.processBA,(Object)((manualposition.mostCurrent._homeadmin.getObject())));
 BA.debugLineNum = 234;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
manualposition.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 237;BA.debugLine="StartActivity(Home)";
Debug.ShouldStop(4096);
manualposition.mostCurrent.__c.runVoidMethod ("StartActivity",manualposition.processBA,(Object)((manualposition.mostCurrent._home.getObject())));
 BA.debugLineNum = 238;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
manualposition.mostCurrent._activity.runVoidMethod ("Finish");
 };
 };
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("BtnInfo_Click (manualposition) ","manualposition",10,manualposition.mostCurrent.activityBA,manualposition.mostCurrent,253);
if (RapidSub.canDelegate("btninfo_click")) return b4a.example.manualposition.remoteMe.runUserSub(false, "manualposition","btninfo_click");
 BA.debugLineNum = 253;BA.debugLine="Sub BtnInfo_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("BtnMap_Click (manualposition) ","manualposition",10,manualposition.mostCurrent.activityBA,manualposition.mostCurrent,243);
if (RapidSub.canDelegate("btnmap_click")) return b4a.example.manualposition.remoteMe.runUserSub(false, "manualposition","btnmap_click");
 BA.debugLineNum = 243;BA.debugLine="Sub BtnMap_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnposition_click() throws Exception{
try {
		Debug.PushSubsStack("btnPosition_Click (manualposition) ","manualposition",10,manualposition.mostCurrent.activityBA,manualposition.mostCurrent,144);
if (RapidSub.canDelegate("btnposition_click")) return b4a.example.manualposition.remoteMe.runUserSub(false, "manualposition","btnposition_click");
 BA.debugLineNum = 144;BA.debugLine="Sub btnPosition_Click";
Debug.ShouldStop(32768);
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
public static RemoteObject  _btnsavelocation_click() throws Exception{
try {
		Debug.PushSubsStack("btnSaveLocation_Click (manualposition) ","manualposition",10,manualposition.mostCurrent.activityBA,manualposition.mostCurrent,199);
if (RapidSub.canDelegate("btnsavelocation_click")) return b4a.example.manualposition.remoteMe.runUserSub(false, "manualposition","btnsavelocation_click");
 BA.debugLineNum = 199;BA.debugLine="Sub btnSaveLocation_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 200;BA.debugLine="If manager.GetBoolean(\"manual_click\") Then";
Debug.ShouldStop(128);
if (manualposition._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("manual_click"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 201;BA.debugLine="If latnew <> 0 Or lngnew <> 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("!",manualposition._latnew,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("!",manualposition._lngnew,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 202;BA.debugLine="lat = latnew";
Debug.ShouldStop(512);
manualposition._lat = manualposition._latnew;
 BA.debugLineNum = 203;BA.debugLine="lng = lngnew";
Debug.ShouldStop(1024);
manualposition._lng = manualposition._lngnew;
 }else {
 BA.debugLineNum = 205;BA.debugLine="lat = lat";
Debug.ShouldStop(4096);
manualposition._lat = manualposition._lat;
 BA.debugLineNum = 206;BA.debugLine="lng = lng";
Debug.ShouldStop(8192);
manualposition._lng = manualposition._lng;
 };
 BA.debugLineNum = 208;BA.debugLine="manager.SetBoolean(\"manual_clicked\",True)";
Debug.ShouldStop(32768);
manualposition._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("manual_clicked")),(Object)(manualposition.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 209;BA.debugLine="manager.SetBoolean(\"posisi_clicked\",False)";
Debug.ShouldStop(65536);
manualposition._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("posisi_clicked")),(Object)(manualposition.mostCurrent.__c.getField(true,"False")));
 }else 
{ BA.debugLineNum = 210;BA.debugLine="Else if manager.GetBoolean(\"position_click\") Then";
Debug.ShouldStop(131072);
if (manualposition._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("position_click"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 211;BA.debugLine="If latGps <> 0  Or lngGps <> 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("!",manualposition._latgps,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("!",manualposition._lnggps,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 212;BA.debugLine="Msgbox(\"GPS can't find your location. Try to re";
Debug.ShouldStop(524288);
manualposition.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("GPS can't find your location. Try to restart the application or open the application outside the room.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),manualposition.mostCurrent.activityBA);
 BA.debugLineNum = 213;BA.debugLine="lat = latpos";
Debug.ShouldStop(1048576);
manualposition._lat = manualposition._latpos;
 BA.debugLineNum = 214;BA.debugLine="lng = lngpos";
Debug.ShouldStop(2097152);
manualposition._lng = manualposition._lngpos;
 }else {
 BA.debugLineNum = 216;BA.debugLine="lat = latGps";
Debug.ShouldStop(8388608);
manualposition._lat = manualposition._latgps;
 BA.debugLineNum = 217;BA.debugLine="lng = lngGps";
Debug.ShouldStop(16777216);
manualposition._lng = manualposition._lnggps;
 };
 BA.debugLineNum = 219;BA.debugLine="manager.SetBoolean(\"posisi_clicked\",True)";
Debug.ShouldStop(67108864);
manualposition._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("posisi_clicked")),(Object)(manualposition.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 220;BA.debugLine="manager.SetBoolean(\"manual_clicked\",False)";
Debug.ShouldStop(134217728);
manualposition._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("manual_clicked")),(Object)(manualposition.mostCurrent.__c.getField(true,"False")));
 }}
;
 BA.debugLineNum = 223;BA.debugLine="Log(\"saved:\"&lat&\",\"&lng)";
Debug.ShouldStop(1073741824);
manualposition.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("saved:"),manualposition._lat,RemoteObject.createImmutable(","),manualposition._lng)));
 BA.debugLineNum = 224;BA.debugLine="Log(\"posisi_clicked: \"&manager.GetBoolean(\"posisi";
Debug.ShouldStop(-2147483648);
manualposition.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("posisi_clicked: "),manualposition._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("posisi_clicked"))))));
 BA.debugLineNum = 225;BA.debugLine="Log(\"manual_clicked: \"&manager.GetBoolean(\"manual";
Debug.ShouldStop(1);
manualposition.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("manual_clicked: "),manualposition._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("manual_clicked"))))));
 BA.debugLineNum = 226;BA.debugLine="Msgbox(\"Your Location has been saved (\"&lat&\",\"&l";
Debug.ShouldStop(2);
manualposition.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Your Location has been saved ("),manualposition._lat,RemoteObject.createImmutable(","),manualposition._lng,RemoteObject.createImmutable(")")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Successful"))),manualposition.mostCurrent.activityBA);
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("BtnSearch_Click (manualposition) ","manualposition",10,manualposition.mostCurrent.activityBA,manualposition.mostCurrent,247);
if (RapidSub.canDelegate("btnsearch_click")) return b4a.example.manualposition.remoteMe.runUserSub(false, "manualposition","btnsearch_click");
 BA.debugLineNum = 247;BA.debugLine="Sub BtnSearch_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 249;BA.debugLine="StartActivity(SearchBuilding)";
Debug.ShouldStop(16777216);
manualposition.mostCurrent.__c.runVoidMethod ("StartActivity",manualposition.processBA,(Object)((manualposition.mostCurrent._searchbuilding.getObject())));
 BA.debugLineNum = 250;BA.debugLine="Activity.Finish";
Debug.ShouldStop(33554432);
manualposition.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _closebtn_click() throws Exception{
try {
		Debug.PushSubsStack("closebtn_Click (manualposition) ","manualposition",10,manualposition.mostCurrent.activityBA,manualposition.mostCurrent,257);
if (RapidSub.canDelegate("closebtn_click")) return b4a.example.manualposition.remoteMe.runUserSub(false, "manualposition","closebtn_click");
 BA.debugLineNum = 257;BA.debugLine="Sub closebtn_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 258;BA.debugLine="Legend.Visible = False";
Debug.ShouldStop(2);
manualposition.mostCurrent._legend.runMethod(true,"setVisible",manualposition.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 259;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private ScrollView1 As ScrollView";
manualposition.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private WebView1 As WebView";
manualposition.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Panel1 As Panel";
manualposition.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Panel2 As Panel";
manualposition.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private PanelToolBar As Panel";
manualposition.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private btnPosition As Panel";
manualposition.mostCurrent._btnposition = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ImagePosition As ImageView";
manualposition.mostCurrent._imageposition = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ImageManual As ImageView";
manualposition.mostCurrent._imagemanual = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ImageLegend As ImageView";
manualposition.mostCurrent._imagelegend = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ImageRefresh As ImageView";
manualposition.mostCurrent._imagerefresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private TitleBar As Label";
manualposition.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private BackArrow As Label";
manualposition.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private btnSaveLocation As Button";
manualposition.mostCurrent._btnsavelocation = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private BtnHome As Button";
manualposition.mostCurrent._btnhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private BtnMap As Button";
manualposition.mostCurrent._btnmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private BtnSearch As Button";
manualposition.mostCurrent._btnsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private BtnInfo As Button";
manualposition.mostCurrent._btninfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Dim latpos, lngpos As Double";
manualposition._latpos = RemoteObject.createImmutable(0);
manualposition._lngpos = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 35;BA.debugLine="Dim latman, lngman As Double";
manualposition._latman = RemoteObject.createImmutable(0);
manualposition._lngman = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 36;BA.debugLine="Private PanelBar As Panel";
manualposition.mostCurrent._panelbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private Legend As Panel";
manualposition.mostCurrent._legend = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private closebtn As Button";
manualposition.mostCurrent._closebtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _gpsstatus(RemoteObject _satellites) throws Exception{
try {
		Debug.PushSubsStack("GpsStatus (manualposition) ","manualposition",10,manualposition.mostCurrent.activityBA,manualposition.mostCurrent,90);
if (RapidSub.canDelegate("gpsstatus")) return b4a.example.manualposition.remoteMe.runUserSub(false, "manualposition","gpsstatus", _satellites);
Debug.locals.put("Satellites", _satellites);
 BA.debugLineNum = 90;BA.debugLine="Public Sub GpsStatus (Satellites As String)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="Log(\"dari manual position: \"&Satellites)";
Debug.ShouldStop(67108864);
manualposition.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("dari manual position: "),_satellites)));
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imagelegend_click() throws Exception{
try {
		Debug.PushSubsStack("ImageLegend_Click (manualposition) ","manualposition",10,manualposition.mostCurrent.activityBA,manualposition.mostCurrent,176);
if (RapidSub.canDelegate("imagelegend_click")) return b4a.example.manualposition.remoteMe.runUserSub(false, "manualposition","imagelegend_click");
 BA.debugLineNum = 176;BA.debugLine="Sub ImageLegend_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="Legend.Visible = True";
Debug.ShouldStop(65536);
manualposition.mostCurrent._legend.runMethod(true,"setVisible",manualposition.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imagemanual_click() throws Exception{
try {
		Debug.PushSubsStack("ImageManual_Click (manualposition) ","manualposition",10,manualposition.mostCurrent.activityBA,manualposition.mostCurrent,163);
if (RapidSub.canDelegate("imagemanual_click")) return b4a.example.manualposition.remoteMe.runUserSub(false, "manualposition","imagemanual_click");
 BA.debugLineNum = 163;BA.debugLine="Sub ImageManual_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 164;BA.debugLine="If manager.GetBoolean(\"manual_clicked\") Then";
Debug.ShouldStop(8);
if (manualposition._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("manual_clicked"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 165;BA.debugLine="latman = lat";
Debug.ShouldStop(16);
manualposition._latman = manualposition._lat;
 BA.debugLineNum = 166;BA.debugLine="lngman = lng";
Debug.ShouldStop(32);
manualposition._lngman = manualposition._lng;
 }else {
 BA.debugLineNum = 168;BA.debugLine="latman = latpos";
Debug.ShouldStop(128);
manualposition._latman = manualposition._latpos;
 BA.debugLineNum = 169;BA.debugLine="lngman = lngpos";
Debug.ShouldStop(256);
manualposition._lngman = manualposition._lngpos;
 };
 BA.debugLineNum = 171;BA.debugLine="WebView1.LoadUrl(Main.Server&\"manual_position.php";
Debug.ShouldStop(1024);
manualposition.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(manualposition.mostCurrent._main._server,RemoteObject.createImmutable("manual_position.php?lat="),manualposition._latman,RemoteObject.createImmutable("&lng="),manualposition._lngman,RemoteObject.createImmutable("&legend="),manualposition._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("legend"))))));
 BA.debugLineNum = 172;BA.debugLine="manager.SetBoolean(\"manual_click\", True)";
Debug.ShouldStop(2048);
manualposition._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("manual_click")),(Object)(manualposition.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 173;BA.debugLine="manager.SetBoolean(\"position_click\", False)";
Debug.ShouldStop(4096);
manualposition._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("position_click")),(Object)(manualposition.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imageposition_click() throws Exception{
try {
		Debug.PushSubsStack("ImagePosition_Click (manualposition) ","manualposition",10,manualposition.mostCurrent.activityBA,manualposition.mostCurrent,148);
if (RapidSub.canDelegate("imageposition_click")) return b4a.example.manualposition.remoteMe.runUserSub(false, "manualposition","imageposition_click");
 BA.debugLineNum = 148;BA.debugLine="Sub ImagePosition_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 150;BA.debugLine="If latGps ==0  Or lngGps == 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",manualposition._latgps,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",manualposition._lnggps,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 152;BA.debugLine="latpos = lat";
Debug.ShouldStop(8388608);
manualposition._latpos = manualposition._lat;
 BA.debugLineNum = 153;BA.debugLine="lngpos = lng";
Debug.ShouldStop(16777216);
manualposition._lngpos = manualposition._lng;
 }else {
 BA.debugLineNum = 155;BA.debugLine="latpos = latGps";
Debug.ShouldStop(67108864);
manualposition._latpos = manualposition._latgps;
 BA.debugLineNum = 156;BA.debugLine="lngpos = lngGps";
Debug.ShouldStop(134217728);
manualposition._lngpos = manualposition._lnggps;
 };
 BA.debugLineNum = 158;BA.debugLine="WebView1.LoadUrl(Main.Server&\"user_position.php?l";
Debug.ShouldStop(536870912);
manualposition.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(manualposition.mostCurrent._main._server,RemoteObject.createImmutable("user_position.php?lat="),manualposition._latpos,RemoteObject.createImmutable("&lng="),manualposition._lngpos,RemoteObject.createImmutable("&legend="),manualposition._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("legend"))))));
 BA.debugLineNum = 159;BA.debugLine="manager.SetBoolean(\"position_click\", True)";
Debug.ShouldStop(1073741824);
manualposition._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("position_click")),(Object)(manualposition.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 160;BA.debugLine="manager.SetBoolean(\"manual_click\", False)";
Debug.ShouldStop(-2147483648);
manualposition._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("manual_click")),(Object)(manualposition.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imagerefresh_click() throws Exception{
try {
		Debug.PushSubsStack("ImageRefresh_Click (manualposition) ","manualposition",10,manualposition.mostCurrent.activityBA,manualposition.mostCurrent,184);
if (RapidSub.canDelegate("imagerefresh_click")) return b4a.example.manualposition.remoteMe.runUserSub(false, "manualposition","imagerefresh_click");
RemoteObject _manualclick = RemoteObject.createImmutable(false);
RemoteObject _positionclick = RemoteObject.createImmutable(false);
 BA.debugLineNum = 184;BA.debugLine="Sub ImageRefresh_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 185;BA.debugLine="CallSubDelayed(Starter, \"StartGPS\")";
Debug.ShouldStop(16777216);
manualposition.mostCurrent.__c.runVoidMethod ("CallSubDelayed",manualposition.processBA,(Object)((manualposition.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StartGPS")));
 BA.debugLineNum = 186;BA.debugLine="Dim manualclick, positionClick As Boolean";
Debug.ShouldStop(33554432);
_manualclick = RemoteObject.createImmutable(false);Debug.locals.put("manualclick", _manualclick);
_positionclick = RemoteObject.createImmutable(false);Debug.locals.put("positionClick", _positionclick);
 BA.debugLineNum = 187;BA.debugLine="positionClick = manager.GetBoolean(\"position_clic";
Debug.ShouldStop(67108864);
_positionclick = manualposition._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("position_click")));Debug.locals.put("positionClick", _positionclick);
 BA.debugLineNum = 188;BA.debugLine="manualclick = manager.GetBoolean(\"manual_click\")";
Debug.ShouldStop(134217728);
_manualclick = manualposition._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("manual_click")));Debug.locals.put("manualclick", _manualclick);
 BA.debugLineNum = 190;BA.debugLine="If positionClick Then";
Debug.ShouldStop(536870912);
if (_positionclick.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 191;BA.debugLine="WebView1.LoadUrl(Main.Server&\"user_position.php?";
Debug.ShouldStop(1073741824);
manualposition.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(manualposition.mostCurrent._main._server,RemoteObject.createImmutable("user_position.php?lat="),manualposition._latpos,RemoteObject.createImmutable("&lng="),manualposition._lngpos,RemoteObject.createImmutable("&legend="),manualposition._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("legend"))))));
 }else 
{ BA.debugLineNum = 192;BA.debugLine="Else If manualclick Then";
Debug.ShouldStop(-2147483648);
if (_manualclick.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 193;BA.debugLine="WebView1.LoadUrl(Main.Server&\"manual_position.ph";
Debug.ShouldStop(1);
manualposition.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(manualposition.mostCurrent._main._server,RemoteObject.createImmutable("manual_position.php?lat="),manualposition._lat,RemoteObject.createImmutable("&lng="),manualposition._lng,RemoteObject.createImmutable("&legend="),manualposition._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("legend"))))));
 }else {
 BA.debugLineNum = 195;BA.debugLine="WebView1.LoadUrl(Main.Server&\"user_position.php?";
Debug.ShouldStop(4);
manualposition.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(manualposition.mostCurrent._main._server,RemoteObject.createImmutable("user_position.php?lat="),manualposition._lat,RemoteObject.createImmutable("&lng="),manualposition._lng,RemoteObject.createImmutable("&legend="),manualposition._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("legend"))))));
 }}
;
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _legend_status(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("Legend_Status (manualposition) ","manualposition",10,manualposition.mostCurrent.activityBA,manualposition.mostCurrent,135);
if (RapidSub.canDelegate("legend_status")) return b4a.example.manualposition.remoteMe.runUserSub(false, "manualposition","legend_status", _str);
Debug.locals.put("Str", _str);
 BA.debugLineNum = 135;BA.debugLine="Sub Legend_Status(Str As String)";
Debug.ShouldStop(64);
 BA.debugLineNum = 137;BA.debugLine="Log(Str)";
Debug.ShouldStop(256);
manualposition.mostCurrent.__c.runVoidMethod ("Log",(Object)(_str));
 BA.debugLineNum = 138;BA.debugLine="If Str == \"false\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_str,BA.ObjectToString("false"))) { 
 BA.debugLineNum = 139;BA.debugLine="manager.SetBoolean(\"legend\",False)";
Debug.ShouldStop(1024);
manualposition._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("legend")),(Object)(manualposition.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 141;BA.debugLine="Log(manager.GetBoolean(\"legend\"))";
Debug.ShouldStop(4096);
manualposition.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(manualposition._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("legend"))))));
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
public static RemoteObject  _locationchanged(RemoteObject _latitude,RemoteObject _longitude) throws Exception{
try {
		Debug.PushSubsStack("LocationChanged (manualposition) ","manualposition",10,manualposition.mostCurrent.activityBA,manualposition.mostCurrent,84);
if (RapidSub.canDelegate("locationchanged")) return b4a.example.manualposition.remoteMe.runUserSub(false, "manualposition","locationchanged", _latitude, _longitude);
Debug.locals.put("Latitude", _latitude);
Debug.locals.put("Longitude", _longitude);
 BA.debugLineNum = 84;BA.debugLine="Public Sub LocationChanged(Latitude As String, Lon";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="Log(\"Location:\"&Latitude&\",\"&Longitude)";
Debug.ShouldStop(1048576);
manualposition.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Location:"),_latitude,RemoteObject.createImmutable(","),_longitude)));
 BA.debugLineNum = 86;BA.debugLine="latGps = Latitude";
Debug.ShouldStop(2097152);
manualposition._latgps = BA.numberCast(double.class, _latitude);
 BA.debugLineNum = 87;BA.debugLine="lngGps = Longitude";
Debug.ShouldStop(4194304);
manualposition._lnggps = BA.numberCast(double.class, _longitude);
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _marker_address(RemoteObject _address) throws Exception{
try {
		Debug.PushSubsStack("Marker_Address (manualposition) ","manualposition",10,manualposition.mostCurrent.activityBA,manualposition.mostCurrent,129);
if (RapidSub.canDelegate("marker_address")) return b4a.example.manualposition.remoteMe.runUserSub(false, "manualposition","marker_address", _address);
RemoteObject _stat = RemoteObject.createImmutable("");
Debug.locals.put("Address", _address);
 BA.debugLineNum = 129;BA.debugLine="Sub Marker_Address(Address As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 131;BA.debugLine="Dim stat As String = Address";
Debug.ShouldStop(4);
_stat = _address;Debug.locals.put("stat", _stat);Debug.locals.put("stat", _stat);
 BA.debugLineNum = 132;BA.debugLine="Log(stat)";
Debug.ShouldStop(8);
manualposition.mostCurrent.__c.runVoidMethod ("Log",(Object)(_stat));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _marker_dragend(RemoteObject _newlatitude,RemoteObject _newlongitude) throws Exception{
try {
		Debug.PushSubsStack("Marker_DragEnd (manualposition) ","manualposition",10,manualposition.mostCurrent.activityBA,manualposition.mostCurrent,113);
if (RapidSub.canDelegate("marker_dragend")) return b4a.example.manualposition.remoteMe.runUserSub(false, "manualposition","marker_dragend", _newlatitude, _newlongitude);
RemoteObject _latitude = RemoteObject.createImmutable(0);
RemoteObject _longititude = RemoteObject.createImmutable(0);
Debug.locals.put("NewLatitude", _newlatitude);
Debug.locals.put("NewLongitude", _newlongitude);
 BA.debugLineNum = 113;BA.debugLine="Sub Marker_DragEnd(NewLatitude As String, NewLongi";
Debug.ShouldStop(65536);
 BA.debugLineNum = 115;BA.debugLine="Dim Latitude As Double=NewLatitude";
Debug.ShouldStop(262144);
_latitude = BA.numberCast(double.class, _newlatitude);Debug.locals.put("Latitude", _latitude);Debug.locals.put("Latitude", _latitude);
 BA.debugLineNum = 116;BA.debugLine="Dim Longititude As Double=NewLongitude";
Debug.ShouldStop(524288);
_longititude = BA.numberCast(double.class, _newlongitude);Debug.locals.put("Longititude", _longititude);Debug.locals.put("Longititude", _longititude);
 BA.debugLineNum = 117;BA.debugLine="Main.kvs.Put(\"Position Manual\",Latitude&\",\"&Longi";
Debug.ShouldStop(1048576);
manualposition.mostCurrent._main._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("Position Manual")),(Object)((RemoteObject.concat(_latitude,RemoteObject.createImmutable(","),_longititude))));
 BA.debugLineNum = 118;BA.debugLine="latnew = Latitude";
Debug.ShouldStop(2097152);
manualposition._latnew = _latitude;
 BA.debugLineNum = 119;BA.debugLine="lngnew = Longititude";
Debug.ShouldStop(4194304);
manualposition._lngnew = _longititude;
 BA.debugLineNum = 120;BA.debugLine="Log(\"The user has dragged the Marker to (\"&latnew";
Debug.ShouldStop(8388608);
manualposition.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("The user has dragged the Marker to ("),manualposition._latnew,RemoteObject.createImmutable(", "),manualposition._lngnew,RemoteObject.createImmutable(")"))));
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
public static RemoteObject  _marker_dragging(RemoteObject _status) throws Exception{
try {
		Debug.PushSubsStack("Marker_Dragging (manualposition) ","manualposition",10,manualposition.mostCurrent.activityBA,manualposition.mostCurrent,123);
if (RapidSub.canDelegate("marker_dragging")) return b4a.example.manualposition.remoteMe.runUserSub(false, "manualposition","marker_dragging", _status);
RemoteObject _stat = RemoteObject.createImmutable("");
Debug.locals.put("Status", _status);
 BA.debugLineNum = 123;BA.debugLine="Sub Marker_Dragging(Status As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 125;BA.debugLine="Dim stat As String = Status";
Debug.ShouldStop(268435456);
_stat = _status;Debug.locals.put("stat", _stat);Debug.locals.put("stat", _stat);
 BA.debugLineNum = 126;BA.debugLine="ToastMessageShow(stat,False)";
Debug.ShouldStop(536870912);
manualposition.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_stat)),(Object)(manualposition.mostCurrent.__c.getField(true,"False")));
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
 //BA.debugLineNum = 9;BA.debugLine="Dim manager As AHPreferenceManager";
manualposition._manager = RemoteObject.createNew ("de.amberhome.objects.preferenceactivity.PreferenceManager");
 //BA.debugLineNum = 10;BA.debugLine="Dim lat=0 , lng=0 As Double";
manualposition._lat = BA.numberCast(double.class, 0);
manualposition._lng = BA.numberCast(double.class, 0);
 //BA.debugLineNum = 11;BA.debugLine="Dim latnew, lngnew, savedlat, savedlng, latGps,ln";
manualposition._latnew = RemoteObject.createImmutable(0);
manualposition._lngnew = RemoteObject.createImmutable(0);
manualposition._savedlat = RemoteObject.createImmutable(0);
manualposition._savedlng = RemoteObject.createImmutable(0);
manualposition._latgps = RemoteObject.createImmutable(0);
manualposition._lnggps = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}