package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class housedetail_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (housedetail) ","housedetail",7,housedetail.mostCurrent.activityBA,housedetail.mostCurrent,55);
if (RapidSub.canDelegate("activity_create")) return b4a.example.housedetail.remoteMe.runUserSub(false, "housedetail","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 55;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(16777216);
housedetail.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),housedetail.mostCurrent.activityBA);
 BA.debugLineNum = 58;BA.debugLine="ScrollView1.Panel.LoadLayout(\"HouseDetail\")";
Debug.ShouldStop(33554432);
housedetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("HouseDetail")),housedetail.mostCurrent.activityBA);
 BA.debugLineNum = 59;BA.debugLine="ScrollView1.Height = 100%y - ScrollView1.Top";
Debug.ShouldStop(67108864);
housedetail.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {housedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),housedetail.mostCurrent.activityBA),housedetail.mostCurrent._scrollview1.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 60;BA.debugLine="PanelToolBar.Visible = False";
Debug.ShouldStop(134217728);
housedetail.mostCurrent._paneltoolbar.runMethod(true,"setVisible",housedetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 62;BA.debugLine="BackArrow.Visible= True";
Debug.ShouldStop(536870912);
housedetail.mostCurrent._backarrow.runMethod(true,"setVisible",housedetail.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 63;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(1073741824);
housedetail.mostCurrent._backarrow.runVoidMethod ("SetBackgroundImageNew",(Object)((housedetail.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(housedetail.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("back-arrow.png"))).getObject())));
 BA.debugLineNum = 64;BA.debugLine="TitleBar.Text=\"Building Detail\"";
Debug.ShouldStop(-2147483648);
housedetail.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("Building Detail"));
 BA.debugLineNum = 66;BA.debugLine="TabHost1.AddTab(\"Map\",\"tabMap\")";
Debug.ShouldStop(2);
housedetail.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",housedetail.mostCurrent.activityBA,(Object)(BA.ObjectToString("Map")),(Object)(RemoteObject.createImmutable("tabMap")));
 BA.debugLineNum = 67;BA.debugLine="TabHost1.AddTab(\"Detail\",\"House_tabDetail\")";
Debug.ShouldStop(4);
housedetail.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",housedetail.mostCurrent.activityBA,(Object)(BA.ObjectToString("Detail")),(Object)(RemoteObject.createImmutable("House_tabDetail")));
 BA.debugLineNum = 68;BA.debugLine="TabHost1.AddTab(\"Gallery\",\"tabGallery\")";
Debug.ShouldStop(8);
housedetail.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",housedetail.mostCurrent.activityBA,(Object)(BA.ObjectToString("Gallery")),(Object)(RemoteObject.createImmutable("tabGallery")));
 BA.debugLineNum = 71;BA.debugLine="If SearchBuilding.nameBuilding.Length > 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",housedetail.mostCurrent._searchbuilding._namebuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 72;BA.debugLine="HouseID.Text = SearchBuilding.nameBuilding";
Debug.ShouldStop(128);
housedetail.mostCurrent._houseid.runMethod(true,"setText",BA.ObjectToCharSequence(housedetail.mostCurrent._searchbuilding._namebuilding));
 BA.debugLineNum = 73;BA.debugLine="ids = SearchBuilding.idBuilding";
Debug.ShouldStop(256);
housedetail.mostCurrent._ids = housedetail.mostCurrent._searchbuilding._idbuilding;
 BA.debugLineNum = 74;BA.debugLine="Log(ids)";
Debug.ShouldStop(512);
housedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(housedetail.mostCurrent._ids));
 }else {
 BA.debugLineNum = 76;BA.debugLine="HouseID.Text = \"Please press on the button and c";
Debug.ShouldStop(2048);
housedetail.mostCurrent._houseid.runMethod(true,"setText",BA.ObjectToCharSequence("Please press on the button and choose an item."));
 };
 BA.debugLineNum = 79;BA.debugLine="TabHost1.CurrentTab = 1";
Debug.ShouldStop(16384);
housedetail.mostCurrent._tabhost1.runMethodAndSync(true,"setCurrentTab",BA.numberCast(int.class, 1));
 BA.debugLineNum = 80;BA.debugLine="AddPicture.Initialize(\"AddPicture\")";
Debug.ShouldStop(32768);
housedetail.mostCurrent._addpicture.runVoidMethod ("Initialize",housedetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("AddPicture")));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (housedetail) ","housedetail",7,housedetail.mostCurrent.activityBA,housedetail.mostCurrent,99);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.housedetail.remoteMe.runUserSub(false, "housedetail","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 99;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="CallSub(Starter, \"ActivityIsPaused\")";
Debug.ShouldStop(8);
housedetail.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",housedetail.processBA,(Object)((housedetail.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("ActivityIsPaused")));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Resume (housedetail) ","housedetail",7,housedetail.mostCurrent.activityBA,housedetail.mostCurrent,89);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.housedetail.remoteMe.runUserSub(false, "housedetail","activity_resume");
 BA.debugLineNum = 89;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(33554432);
housedetail.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",housedetail.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Loading..."))));
 BA.debugLineNum = 91;BA.debugLine="If TabHost1.CurrentTab == 2 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",housedetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 92;BA.debugLine="clv.Clear";
Debug.ShouldStop(134217728);
housedetail.mostCurrent._clv.runVoidMethod ("_clear");
 BA.debugLineNum = 93;BA.debugLine="ExecuteRemoteQuery(\"SELECT photo_url, upload_dat";
Debug.ShouldStop(268435456);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT photo_url, upload_date FROM house_building_gallery WHERE house_building_id='"),housedetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("Download"));
 }else {
 BA.debugLineNum = 95;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.fcn_owner, H.address";
Debug.ShouldStop(1073741824);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT H.fcn_owner, H.address, H.standing_year, H.land_building_tax, H.type_of_construction, H.electricity_capacity, H.tap_water, H.building_status,ST_X(ST_Centroid(H.geom)) As longitude, ST_Y(ST_CENTROID(H.geom)) As latitude, ST_AsText(H.geom) As geom,T.name_of_type As jkonstruksi, O.*	FROM house_building As H LEFT JOIN type_of_construction As T ON H.type_of_construction=T.type_id JOIN house_building_owner As O ON H.fcn_owner=O.national_identity_number WHERE H.house_building_id='"),housedetail.mostCurrent._ids,RemoteObject.createImmutable("' ")),RemoteObject.createImmutable("DATA"));
 };
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addpicture_click() throws Exception{
try {
		Debug.PushSubsStack("AddPicture_Click (housedetail) ","housedetail",7,housedetail.mostCurrent.activityBA,housedetail.mostCurrent,195);
if (RapidSub.canDelegate("addpicture_click")) return b4a.example.housedetail.remoteMe.runUserSub(false, "housedetail","addpicture_click");
 BA.debugLineNum = 195;BA.debugLine="Sub AddPicture_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 196;BA.debugLine="ToastMessageShow(\"Add photo\",True)";
Debug.ShouldStop(8);
housedetail.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Add photo")),(Object)(housedetail.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 197;BA.debugLine="StartActivity(AddPhoto)";
Debug.ShouldStop(16);
housedetail.mostCurrent.__c.runVoidMethod ("StartActivity",housedetail.processBA,(Object)((housedetail.mostCurrent._addphoto.getObject())));
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("BackArrow_Click (housedetail) ","housedetail",7,housedetail.mostCurrent.activityBA,housedetail.mostCurrent,200);
if (RapidSub.canDelegate("backarrow_click")) return b4a.example.housedetail.remoteMe.runUserSub(false, "housedetail","backarrow_click");
 BA.debugLineNum = 200;BA.debugLine="Sub BackArrow_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="Activity.Finish";
Debug.ShouldStop(256);
housedetail.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("ExecuteRemoteQuery (housedetail) ","housedetail",7,housedetail.mostCurrent.activityBA,housedetail.mostCurrent,83);
if (RapidSub.canDelegate("executeremotequery")) return b4a.example.housedetail.remoteMe.runUserSub(false, "housedetail","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 83;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(524288);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 85;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(1048576);
_job.runVoidMethod ("_initialize",housedetail.processBA,(Object)(_jobname),(Object)(housedetail.getObject()));
 BA.debugLineNum = 86;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
Debug.ShouldStop(2097152);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),housedetail.mostCurrent._main._server,RemoteObject.createImmutable("mobile/json.php"))),(Object)(_query));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim ScrollImage As ScrollView";
housedetail.mostCurrent._scrollimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim clv As CustomListView";
housedetail.mostCurrent._clv = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 19;BA.debugLine="Dim Label1 As Label";
housedetail.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim ImageView1 As ImageView";
housedetail.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ScrollView1 As ScrollView";
housedetail.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private TitleBar As Label";
housedetail.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private BackArrow As Label";
housedetail.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private PanelBuildingList As Panel";
housedetail.mostCurrent._panelbuildinglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private PanelButton As Panel";
housedetail.mostCurrent._panelbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim HouseID As Label";
housedetail.mostCurrent._houseid = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private StandingYear As Label";
housedetail.mostCurrent._standingyear = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private BuildingTax As Label";
housedetail.mostCurrent._buildingtax = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private Electricity As Label";
housedetail.mostCurrent._electricity = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private Construction As Label";
housedetail.mostCurrent._construction = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private PanelToolBar As Panel";
housedetail.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Dim ids As String";
housedetail.mostCurrent._ids = RemoteObject.createImmutable("");
 //BA.debugLineNum = 35;BA.debugLine="Private LblEdit As Label";
housedetail.mostCurrent._lbledit = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private Panel4 As Panel";
housedetail.mostCurrent._panel4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Dim TabHost1 As TabHost";
housedetail.mostCurrent._tabhost1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabHostWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private PanelMap As Panel";
housedetail.mostCurrent._panelmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private btnRoute As Button";
housedetail.mostCurrent._btnroute = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private WebViewRoute As WebView";
housedetail.mostCurrent._webviewroute = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private LblFcnOwner As Label";
housedetail.mostCurrent._lblfcnowner = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private FcnOwner As Label";
housedetail.mostCurrent._fcnowner = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private Address As Label";
housedetail.mostCurrent._address = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private LblStandingYear As Label";
housedetail.mostCurrent._lblstandingyear = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private LblBuildingTax As Label";
housedetail.mostCurrent._lblbuildingtax = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private LblAddress As Label";
housedetail.mostCurrent._lbladdress = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private LblElectric As Label";
housedetail.mostCurrent._lblelectric = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private LblCons As Label";
housedetail.mostCurrent._lblcons = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private Label2 As Label";
housedetail.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private PanelGallery As Panel";
housedetail.mostCurrent._panelgallery = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private AddPicture As Button";
housedetail.mostCurrent._addpicture = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imageview1_click() throws Exception{
try {
		Debug.PushSubsStack("ImageView1_Click (housedetail) ","housedetail",7,housedetail.mostCurrent.activityBA,housedetail.mostCurrent,232);
if (RapidSub.canDelegate("imageview1_click")) return b4a.example.housedetail.remoteMe.runUserSub(false, "housedetail","imageview1_click");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _bd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 232;BA.debugLine="Sub ImageView1_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 233;BA.debugLine="Dim iv As ImageView";
Debug.ShouldStop(256);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 234;BA.debugLine="iv = Sender";
Debug.ShouldStop(512);
_iv.setObject(housedetail.mostCurrent.__c.runMethod(false,"Sender",housedetail.mostCurrent.activityBA));
 BA.debugLineNum = 235;BA.debugLine="If iv.Background Is BitmapDrawable Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("i",_iv.runMethod(false,"getBackground"), RemoteObject.createImmutable("android.graphics.drawable.BitmapDrawable"))) { 
 BA.debugLineNum = 237;BA.debugLine="Dim bd As BitmapDrawable";
Debug.ShouldStop(4096);
_bd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bd", _bd);
 BA.debugLineNum = 238;BA.debugLine="bd = iv.Background";
Debug.ShouldStop(8192);
_bd.setObject(_iv.runMethod(false,"getBackground"));
 BA.debugLineNum = 239;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(16384);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 240;BA.debugLine="bmp = bd.Bitmap";
Debug.ShouldStop(32768);
_bmp.setObject(_bd.runMethod(false,"getBitmap"));
 BA.debugLineNum = 241;BA.debugLine="CallSubDelayed2(ShowImage, \"Show\", bmp)";
Debug.ShouldStop(65536);
housedetail.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",housedetail.processBA,(Object)((housedetail.mostCurrent._showimage.getObject())),(Object)(BA.ObjectToString("Show")),(Object)((_bmp)));
 };
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("JobDone (housedetail) ","housedetail",7,housedetail.mostCurrent.activityBA,housedetail.mostCurrent,103);
if (RapidSub.canDelegate("jobdone")) return b4a.example.housedetail.remoteMe.runUserSub(false, "housedetail","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _agn = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _notfound = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
int _i = 0;
RemoteObject _w = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _image = RemoteObject.createImmutable("");
RemoteObject _gambar = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _data_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _heightlabel = RemoteObject.createImmutable(0);
Debug.locals.put("Job", _job);
 BA.debugLineNum = 103;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(128);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 105;BA.debugLine="Dim res As String";
Debug.ShouldStop(256);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 106;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(512);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 107;BA.debugLine="Log(\"Response from server :\"& res)";
Debug.ShouldStop(1024);
housedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 108;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(2048);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 109;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(4096);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 110;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(8192);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("Download"),BA.ObjectToString("DATA"))) {
case 0: {
 BA.debugLineNum = 113;BA.debugLine="Dim agn As List";
Debug.ShouldStop(65536);
_agn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 114;BA.debugLine="agn=parser.NextArray";
Debug.ShouldStop(131072);
_agn = _parser.runMethod(false,"NextArray");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 115;BA.debugLine="If agn.Size - 1 < 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 116;BA.debugLine="Log(agn.Size)";
Debug.ShouldStop(524288);
housedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_agn.runMethod(true,"getSize"))));
 BA.debugLineNum = 117;BA.debugLine="Dim NotFound As Label";
Debug.ShouldStop(1048576);
_notfound = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("NotFound", _notfound);
 BA.debugLineNum = 118;BA.debugLine="NotFound.Initialize(\"\")";
Debug.ShouldStop(2097152);
_notfound.runVoidMethod ("Initialize",housedetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 119;BA.debugLine="PanelGallery.Color= Colors.White";
Debug.ShouldStop(4194304);
housedetail.mostCurrent._panelgallery.runVoidMethod ("setColor",housedetail.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 120;BA.debugLine="PanelGallery.AddView(NotFound,0,0,100%x,70%y)";
Debug.ShouldStop(8388608);
housedetail.mostCurrent._panelgallery.runVoidMethod ("AddView",(Object)((_notfound.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(housedetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),housedetail.mostCurrent.activityBA)),(Object)(housedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),housedetail.mostCurrent.activityBA)));
 BA.debugLineNum = 121;BA.debugLine="NotFound.Text = \"Picture doesn't exist\"";
Debug.ShouldStop(16777216);
_notfound.runMethod(true,"setText",BA.ObjectToCharSequence("Picture doesn't exist"));
 BA.debugLineNum = 122;BA.debugLine="NotFound.TextSize = 15";
Debug.ShouldStop(33554432);
_notfound.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 123;BA.debugLine="NotFound.Gravity = Gravity.CENTER";
Debug.ShouldStop(67108864);
_notfound.runMethod(true,"setGravity",housedetail.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 124;BA.debugLine="PanelGallery.Height = NotFound.Height";
Debug.ShouldStop(134217728);
housedetail.mostCurrent._panelgallery.runMethod(true,"setHeight",_notfound.runMethod(true,"getHeight"));
 BA.debugLineNum = 125;BA.debugLine="TabHost1.Height = PanelGallery.Height";
Debug.ShouldStop(268435456);
housedetail.mostCurrent._tabhost1.runMethod(true,"setHeight",housedetail.mostCurrent._panelgallery.runMethod(true,"getHeight"));
 BA.debugLineNum = 126;BA.debugLine="Msgbox(\"Galery Foto tidak ditemukan\", \"Pering";
Debug.ShouldStop(536870912);
housedetail.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Galery Foto tidak ditemukan")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Peringatan"))),housedetail.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 128;BA.debugLine="ScrollImage.Initialize(100%y)";
Debug.ShouldStop(-2147483648);
housedetail.mostCurrent._scrollimage.runVoidMethod ("Initialize",housedetail.mostCurrent.activityBA,(Object)(housedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),housedetail.mostCurrent.activityBA)));
 BA.debugLineNum = 129;BA.debugLine="PanelGallery.AddView(ScrollImage,0,0,100%x,10";
Debug.ShouldStop(1);
housedetail.mostCurrent._panelgallery.runVoidMethod ("AddView",(Object)((housedetail.mostCurrent._scrollimage.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(housedetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),housedetail.mostCurrent.activityBA)),(Object)(housedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),housedetail.mostCurrent.activityBA)));
 BA.debugLineNum = 130;BA.debugLine="ScrollImage.Panel.LoadLayout(\"LoaderImage\")";
Debug.ShouldStop(2);
housedetail.mostCurrent._scrollimage.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LoaderImage")),housedetail.mostCurrent.activityBA);
 BA.debugLineNum = 131;BA.debugLine="For i=0 To agn.Size-1";
Debug.ShouldStop(4);
{
final int step27 = 1;
final int limit27 = RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27) ;_i = ((int)(0 + _i + step27))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 132;BA.debugLine="Dim w As Map";
Debug.ShouldStop(8);
_w = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("w", _w);
 BA.debugLineNum = 133;BA.debugLine="w=agn.Get(i)";
Debug.ShouldStop(16);
_w.setObject(_agn.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 134;BA.debugLine="Dim image = w.Get(\"photo_url\") As String";
Debug.ShouldStop(32);
_image = BA.ObjectToString(_w.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_url")))));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 135;BA.debugLine="Dim gambar = \"\"&Main.Server&\"Files/House/img";
Debug.ShouldStop(64);
_gambar = RemoteObject.concat(RemoteObject.createImmutable(""),housedetail.mostCurrent._main._server,RemoteObject.createImmutable("Files/House/img/"),_image);Debug.locals.put("gambar", _gambar);Debug.locals.put("gambar", _gambar);
 BA.debugLineNum = 136;BA.debugLine="Dim m As Map";
Debug.ShouldStop(128);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 137;BA.debugLine="m.Initialize";
Debug.ShouldStop(256);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 138;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(512);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 139;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(1024);
_p.runVoidMethod ("Initialize",housedetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 140;BA.debugLine="p.SetLayout(0,0,100%x,20%y)";
Debug.ShouldStop(2048);
_p.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(housedetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),housedetail.mostCurrent.activityBA)),(Object)(housedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),housedetail.mostCurrent.activityBA)));
 BA.debugLineNum = 141;BA.debugLine="p.LoadLayout(\"listitem-image\")";
Debug.ShouldStop(4096);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("listitem-image")),housedetail.mostCurrent.activityBA);
 BA.debugLineNum = 142;BA.debugLine="clv.Add(p,m)";
Debug.ShouldStop(8192);
housedetail.mostCurrent._clv.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()),(Object)((_m.getObject())));
 BA.debugLineNum = 143;BA.debugLine="m.Put(ImageView1, gambar)";
Debug.ShouldStop(16384);
_m.runVoidMethod ("Put",(Object)((housedetail.mostCurrent._imageview1.getObject())),(Object)((_gambar)));
 BA.debugLineNum = 144;BA.debugLine="Log (gambar)";
Debug.ShouldStop(32768);
housedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(_gambar));
 BA.debugLineNum = 145;BA.debugLine="CallSubDelayed2(Starter, \"Download\", m)";
Debug.ShouldStop(65536);
housedetail.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",housedetail.processBA,(Object)((housedetail.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_m)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 147;BA.debugLine="ScrollView1.Height = 100%y - ScrollView1.Top";
Debug.ShouldStop(262144);
housedetail.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {housedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),housedetail.mostCurrent.activityBA),housedetail.mostCurrent._scrollview1.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 148;BA.debugLine="ScrollImage.Panel.Height = (ImageView1.Height";
Debug.ShouldStop(524288);
housedetail.mostCurrent._scrollimage.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {housedetail.mostCurrent._imageview1.runMethod(true,"getHeight"),housedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),housedetail.mostCurrent.activityBA)}, "+",1, 1)),_agn.runMethod(true,"getSize")}, "*",0, 1));
 BA.debugLineNum = 149;BA.debugLine="ScrollImage.Height = 70%y";
Debug.ShouldStop(1048576);
housedetail.mostCurrent._scrollimage.runMethod(true,"setHeight",housedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),housedetail.mostCurrent.activityBA));
 BA.debugLineNum = 150;BA.debugLine="PanelGallery.Height = ScrollImage.Height";
Debug.ShouldStop(2097152);
housedetail.mostCurrent._panelgallery.runMethod(true,"setHeight",housedetail.mostCurrent._scrollimage.runMethod(true,"getHeight"));
 BA.debugLineNum = 151;BA.debugLine="TabHost1.Height = ScrollImage.Height";
Debug.ShouldStop(4194304);
housedetail.mostCurrent._tabhost1.runMethod(true,"setHeight",housedetail.mostCurrent._scrollimage.runMethod(true,"getHeight"));
 };
 BA.debugLineNum = 153;BA.debugLine="AddPicture.RemoveView";
Debug.ShouldStop(16777216);
housedetail.mostCurrent._addpicture.runVoidMethod ("RemoveView");
 BA.debugLineNum = 154;BA.debugLine="PanelBuildingList.AddView(AddPicture,0, TabHos";
Debug.ShouldStop(33554432);
housedetail.mostCurrent._panelbuildinglist.runVoidMethod ("AddView",(Object)((housedetail.mostCurrent._addpicture.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {housedetail.mostCurrent._tabhost1.runMethod(true,"getHeight"),housedetail.mostCurrent._tabhost1.runMethod(true,"getTop")}, "+",1, 1)),(Object)(housedetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),housedetail.mostCurrent.activityBA)),(Object)(housedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),housedetail.mostCurrent.activityBA)));
 BA.debugLineNum = 155;BA.debugLine="PanelBuildingList.Height = AddPicture.Top + Ad";
Debug.ShouldStop(67108864);
housedetail.mostCurrent._panelbuildinglist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {housedetail.mostCurrent._addpicture.runMethod(true,"getTop"),housedetail.mostCurrent._addpicture.runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 156;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.H";
Debug.ShouldStop(134217728);
housedetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",housedetail.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 BA.debugLineNum = 157;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(268435456);
housedetail.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 1: {
 BA.debugLineNum = 160;BA.debugLine="Dim data_array As List";
Debug.ShouldStop(-2147483648);
_data_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 161;BA.debugLine="data_array = parser.NextArray";
Debug.ShouldStop(1);
_data_array = _parser.runMethod(false,"NextArray");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 162;BA.debugLine="For i=0 To data_array.Size -1";
Debug.ShouldStop(2);
{
final int step57 = 1;
final int limit57 = RemoteObject.solve(new RemoteObject[] {_data_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step57 > 0 && _i <= limit57) || (step57 < 0 && _i >= limit57) ;_i = ((int)(0 + _i + step57))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 163;BA.debugLine="Dim a As Map";
Debug.ShouldStop(4);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 164;BA.debugLine="a = data_array.Get(i)";
Debug.ShouldStop(8);
_a.setObject(_data_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 165;BA.debugLine="lat = a.Get(\"latitude\")";
Debug.ShouldStop(16);
housedetail._lat = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("latitude")))));
 BA.debugLineNum = 166;BA.debugLine="lng = a.Get(\"longitude\")";
Debug.ShouldStop(32);
housedetail._lng = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("longitude")))));
 BA.debugLineNum = 167;BA.debugLine="Log(lat)";
Debug.ShouldStop(64);
housedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(housedetail._lat));
 BA.debugLineNum = 168;BA.debugLine="Log(lng)";
Debug.ShouldStop(128);
housedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(housedetail._lng));
 BA.debugLineNum = 169;BA.debugLine="FcnOwner.Text = a.Get (\"fcn_owner\")";
Debug.ShouldStop(256);
housedetail.mostCurrent._fcnowner.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fcn_owner"))))));
 BA.debugLineNum = 170;BA.debugLine="StandingYear.Text = a.Get(\"standing_year\")";
Debug.ShouldStop(512);
housedetail.mostCurrent._standingyear.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("standing_year"))))));
 BA.debugLineNum = 171;BA.debugLine="Address.Text = a.Get(\"address\")";
Debug.ShouldStop(1024);
housedetail.mostCurrent._address.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address"))))));
 BA.debugLineNum = 172;BA.debugLine="BuildingTax.Text = a.Get(\"land_building_tax\")";
Debug.ShouldStop(2048);
housedetail.mostCurrent._buildingtax.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("land_building_tax"))))));
 BA.debugLineNum = 173;BA.debugLine="Electricity.Text = a.Get(\"electricity_capacit";
Debug.ShouldStop(4096);
housedetail.mostCurrent._electricity.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("electricity_capacity"))))));
 BA.debugLineNum = 174;BA.debugLine="Construction.Text = a.Get(\"jkonstruksi\")";
Debug.ShouldStop(8192);
housedetail.mostCurrent._construction.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("jkonstruksi"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 176;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(32768);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 177;BA.debugLine="Dim heightlabel As Int";
Debug.ShouldStop(65536);
_heightlabel = RemoteObject.createImmutable(0);Debug.locals.put("heightlabel", _heightlabel);
 BA.debugLineNum = 178;BA.debugLine="heightlabel = su.MeasureMultilineTextHeight(Ad";
Debug.ShouldStop(131072);
_heightlabel = _su.runMethod(true,"MeasureMultilineTextHeight",(Object)((housedetail.mostCurrent._address.getObject())),(Object)(BA.ObjectToCharSequence(housedetail.mostCurrent._address.runMethod(true,"getText"))));Debug.locals.put("heightlabel", _heightlabel);
 BA.debugLineNum = 179;BA.debugLine="Log(\"Height akhir: \"&heightlabel)";
Debug.ShouldStop(262144);
housedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Height akhir: "),_heightlabel)));
 BA.debugLineNum = 180;BA.debugLine="Address.Height= heightlabel";
Debug.ShouldStop(524288);
housedetail.mostCurrent._address.runMethod(true,"setHeight",_heightlabel);
 BA.debugLineNum = 181;BA.debugLine="Select TabHost1.CurrentTab";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(housedetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 183;BA.debugLine="TabHost1.Height = Panel4.Top + Panel4.Height";
Debug.ShouldStop(4194304);
housedetail.mostCurrent._tabhost1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {housedetail.mostCurrent._panel4.runMethod(true,"getTop"),housedetail.mostCurrent._panel4.runMethod(true,"getHeight"),housedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),housedetail.mostCurrent.activityBA)}, "++",2, 1));
 break; }
}
;
 BA.debugLineNum = 186;BA.debugLine="PanelBuildingList.Height = TabHost1.Height + T";
Debug.ShouldStop(33554432);
housedetail.mostCurrent._panelbuildinglist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {housedetail.mostCurrent._tabhost1.runMethod(true,"getHeight"),housedetail.mostCurrent._tabhost1.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 187;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.H";
Debug.ShouldStop(67108864);
housedetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",housedetail.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 BA.debugLineNum = 188;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(134217728);
housedetail.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
}
;
 };
 BA.debugLineNum = 192;BA.debugLine="Job.Release";
Debug.ShouldStop(-2147483648);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 193;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbledit_click() throws Exception{
try {
		Debug.PushSubsStack("LblEdit_Click (housedetail) ","housedetail",7,housedetail.mostCurrent.activityBA,housedetail.mostCurrent,204);
if (RapidSub.canDelegate("lbledit_click")) return b4a.example.housedetail.remoteMe.runUserSub(false, "housedetail","lbledit_click");
 BA.debugLineNum = 204;BA.debugLine="Sub LblEdit_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 205;BA.debugLine="StartActivity(OfficeEdit)";
Debug.ShouldStop(4096);
housedetail.mostCurrent.__c.runVoidMethod ("StartActivity",housedetail.processBA,(Object)((housedetail.mostCurrent._officeedit.getObject())));
 BA.debugLineNum = 206;BA.debugLine="End Sub";
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
housedetail._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim lat, lng As String";
housedetail._lat = RemoteObject.createImmutable("");
housedetail._lng = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _tabhost1_tabchanged() throws Exception{
try {
		Debug.PushSubsStack("TabHost1_TabChanged (housedetail) ","housedetail",7,housedetail.mostCurrent.activityBA,housedetail.mostCurrent,208);
if (RapidSub.canDelegate("tabhost1_tabchanged")) return b4a.example.housedetail.remoteMe.runUserSub(false, "housedetail","tabhost1_tabchanged");
 BA.debugLineNum = 208;BA.debugLine="Sub TabHost1_TabChanged";
Debug.ShouldStop(32768);
 BA.debugLineNum = 210;BA.debugLine="Select TabHost1.CurrentTab";
Debug.ShouldStop(131072);
switch (BA.switchObjectToInt(housedetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 212;BA.debugLine="WebViewRoute.LoadUrl(Main.Server&\"House/Route.p";
Debug.ShouldStop(524288);
housedetail.mostCurrent._webviewroute.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(housedetail.mostCurrent._main._server,RemoteObject.createImmutable("House/Route.php?lat="),housedetail.mostCurrent._main._lbllat,RemoteObject.createImmutable("&lng="),housedetail.mostCurrent._main._lbllon,RemoteObject.createImmutable("&latd="),housedetail._lat,RemoteObject.createImmutable("&lngd="),housedetail._lng)));
 BA.debugLineNum = 213;BA.debugLine="Msgbox(\"Current tab is \" & TabHost1.CurrentTab,";
Debug.ShouldStop(1048576);
housedetail.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Current tab is "),housedetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),housedetail.mostCurrent.activityBA);
 BA.debugLineNum = 214;BA.debugLine="Log (\"Button Top :\"&btnRoute.Top)";
Debug.ShouldStop(2097152);
housedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Button Top :"),housedetail.mostCurrent._btnroute.runMethod(true,"getTop"))));
 BA.debugLineNum = 215;BA.debugLine="TabHost1.Height = btnRoute.Top + btnRoute.Heigh";
Debug.ShouldStop(4194304);
housedetail.mostCurrent._tabhost1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {housedetail.mostCurrent._btnroute.runMethod(true,"getTop"),housedetail.mostCurrent._btnroute.runMethod(true,"getHeight"),housedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),housedetail.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 216;BA.debugLine="AddPicture.Visible=False";
Debug.ShouldStop(8388608);
housedetail.mostCurrent._addpicture.runMethod(true,"setVisible",housedetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 217;BA.debugLine="Log(\"tabHost height: \"&TabHost1.Height)";
Debug.ShouldStop(16777216);
housedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("tabHost height: "),housedetail.mostCurrent._tabhost1.runMethod(true,"getHeight"))));
 BA.debugLineNum = 218;BA.debugLine="PanelBuildingList.Height = TabHost1.Height + Ta";
Debug.ShouldStop(33554432);
housedetail.mostCurrent._panelbuildinglist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {housedetail.mostCurrent._tabhost1.runMethod(true,"getHeight"),housedetail.mostCurrent._tabhost1.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 219;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.He";
Debug.ShouldStop(67108864);
housedetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",housedetail.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 break; }
case 1: {
 BA.debugLineNum = 221;BA.debugLine="AddPicture.Visible=False";
Debug.ShouldStop(268435456);
housedetail.mostCurrent._addpicture.runMethod(true,"setVisible",housedetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 222;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(536870912);
housedetail.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",housedetail.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Loading..."))));
 BA.debugLineNum = 223;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.fcn_owner, H.addre";
Debug.ShouldStop(1073741824);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT H.fcn_owner, H.address, H.standing_year, H.land_building_tax, H.type_of_construction, H.electricity_capacity, H.tap_water, H.building_status,ST_X(ST_Centroid(H.geom)) As longitude, ST_Y(ST_CENTROID(H.geom)) As latitude, ST_AsText(H.geom) As geom,T.name_of_type As jkonstruksi, O.*	FROM house_building As H LEFT JOIN type_of_construction As T ON H.type_of_construction=T.type_id JOIN house_building_owner As O ON H.fcn_owner=O.national_identity_number WHERE H.house_building_id='"),housedetail.mostCurrent._ids,RemoteObject.createImmutable("' ")),RemoteObject.createImmutable("DATA"));
 break; }
case 2: {
 BA.debugLineNum = 225;BA.debugLine="AddPicture.Visible=True";
Debug.ShouldStop(1);
housedetail.mostCurrent._addpicture.runMethod(true,"setVisible",housedetail.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 226;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(2);
housedetail.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",housedetail.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Loading..."))));
 BA.debugLineNum = 227;BA.debugLine="ExecuteRemoteQuery(\"SELECT photo_url, upload_da";
Debug.ShouldStop(4);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT photo_url, upload_date FROM house_building_gallery WHERE house_building_id='"),housedetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("Download"));
 break; }
}
;
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}