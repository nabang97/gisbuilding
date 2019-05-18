package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class msmedetail_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (msmedetail) ","msmedetail",8,msmedetail.mostCurrent.activityBA,msmedetail.mostCurrent,59);
if (RapidSub.canDelegate("activity_create")) return b4a.example.msmedetail.remoteMe.runUserSub(false, "msmedetail","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 59;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 61;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(268435456);
msmedetail.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),msmedetail.mostCurrent.activityBA);
 BA.debugLineNum = 62;BA.debugLine="ScrollView1.Panel.LoadLayout(\"MsmeDetail\")";
Debug.ShouldStop(536870912);
msmedetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MsmeDetail")),msmedetail.mostCurrent.activityBA);
 BA.debugLineNum = 64;BA.debugLine="ScrollView1.Height = 100%y - ScrollView1.Top";
Debug.ShouldStop(-2147483648);
msmedetail.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {msmedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),msmedetail.mostCurrent.activityBA),msmedetail.mostCurrent._scrollview1.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 65;BA.debugLine="PanelToolBar.Visible = False";
Debug.ShouldStop(1);
msmedetail.mostCurrent._paneltoolbar.runMethod(true,"setVisible",msmedetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 67;BA.debugLine="BackArrow.Visible= True";
Debug.ShouldStop(4);
msmedetail.mostCurrent._backarrow.runMethod(true,"setVisible",msmedetail.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 68;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(8);
msmedetail.mostCurrent._backarrow.runVoidMethod ("SetBackgroundImageNew",(Object)((msmedetail.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(msmedetail.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("back-arrow.png"))).getObject())));
 BA.debugLineNum = 69;BA.debugLine="TitleBar.Text=\"Building Detail\"";
Debug.ShouldStop(16);
msmedetail.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("Building Detail"));
 BA.debugLineNum = 71;BA.debugLine="TabHost1.AddTab(\"Map\",\"tabMap\")";
Debug.ShouldStop(64);
msmedetail.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",msmedetail.mostCurrent.activityBA,(Object)(BA.ObjectToString("Map")),(Object)(RemoteObject.createImmutable("tabMap")));
 BA.debugLineNum = 72;BA.debugLine="TabHost1.AddTab(\"Detail\",\"Msme_tabDetail\")";
Debug.ShouldStop(128);
msmedetail.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",msmedetail.mostCurrent.activityBA,(Object)(BA.ObjectToString("Detail")),(Object)(RemoteObject.createImmutable("Msme_tabDetail")));
 BA.debugLineNum = 73;BA.debugLine="TabHost1.AddTab(\"Gallery\",\"tabGallery\")";
Debug.ShouldStop(256);
msmedetail.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",msmedetail.mostCurrent.activityBA,(Object)(BA.ObjectToString("Gallery")),(Object)(RemoteObject.createImmutable("tabGallery")));
 BA.debugLineNum = 76;BA.debugLine="FunctionAll.CheckBuilding_id(MsmeBuilding.idBuild";
Debug.ShouldStop(2048);
msmedetail.mostCurrent._functionall.runVoidMethod ("_checkbuilding_id",msmedetail.mostCurrent.activityBA,(Object)(msmedetail.mostCurrent._msmebuilding._idbuilding));
 BA.debugLineNum = 77;BA.debugLine="ids = FunctionAll.ids";
Debug.ShouldStop(4096);
msmedetail.mostCurrent._ids = msmedetail.mostCurrent._functionall._ids;
 BA.debugLineNum = 79;BA.debugLine="TabHost1.CurrentTab = 1";
Debug.ShouldStop(16384);
msmedetail.mostCurrent._tabhost1.runMethodAndSync(true,"setCurrentTab",BA.numberCast(int.class, 1));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (msmedetail) ","msmedetail",8,msmedetail.mostCurrent.activityBA,msmedetail.mostCurrent,95);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.msmedetail.remoteMe.runUserSub(false, "msmedetail","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 95;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="CallSub(Starter, \"ActivityIsPaused\")";
Debug.ShouldStop(-2147483648);
msmedetail.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",msmedetail.processBA,(Object)((msmedetail.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("ActivityIsPaused")));
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (msmedetail) ","msmedetail",8,msmedetail.mostCurrent.activityBA,msmedetail.mostCurrent,83);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.msmedetail.remoteMe.runUserSub(false, "msmedetail","activity_resume");
 BA.debugLineNum = 83;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="CLV1.Clear";
Debug.ShouldStop(524288);
msmedetail.mostCurrent._clv1.runVoidMethod ("_clear");
 BA.debugLineNum = 85;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(1048576);
msmedetail.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",msmedetail.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Loading..."))));
 BA.debugLineNum = 86;BA.debugLine="If TabHost1.CurrentTab == 2 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",msmedetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 87;BA.debugLine="clv.Clear";
Debug.ShouldStop(4194304);
msmedetail.mostCurrent._clv.runVoidMethod ("_clear");
 BA.debugLineNum = 88;BA.debugLine="ExecuteRemoteQuery(\"SELECT photo_url, upload_dat";
Debug.ShouldStop(8388608);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT photo_url, upload_date FROM msme_building_gallery WHERE msme_building_id='"),msmedetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("Download"));
 }else {
 BA.debugLineNum = 90;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.msme_building_id, D.";
Debug.ShouldStop(33554432);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.msme_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id ='"),msmedetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("FASILITAS"));
 BA.debugLineNum = 91;BA.debugLine="ExecuteRemoteQuery(\"SELECT M.msme_building_id, M.";
Debug.ShouldStop(67108864);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT M.msme_building_id, M.name_of_msme_building, M.building_area, M.land_area, M.parking_area, M.standing_year, M.electricity_capacity, M.address, M.type_of_construction, M.type_of_msme, M.owner_name, M.number_of_employee, M.monthly_income, M.contact_person, ST_X(ST_Centroid(M.geom)) As longitude, ST_Y(ST_CENTROID(M.geom)) As latitude,T.name_of_type As constr, J.name_of_type As typems, ST_AsText(geom) As geom FROM msme_building As M LEFT JOIN type_of_construction As T ON M.type_of_construction=T.type_id LEFT JOIN type_of_msme As J ON M.type_of_msme=J.type_id WHERE M.msme_building_id='"),msmedetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("DATA"));
 };
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("AddPicture_Click (msmedetail) ","msmedetail",8,msmedetail.mostCurrent.activityBA,msmedetail.mostCurrent,240);
if (RapidSub.canDelegate("addpicture_click")) return b4a.example.msmedetail.remoteMe.runUserSub(false, "msmedetail","addpicture_click");
 BA.debugLineNum = 240;BA.debugLine="Sub AddPicture_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 241;BA.debugLine="ToastMessageShow(\"Add photo\",True)";
Debug.ShouldStop(65536);
msmedetail.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Add photo")),(Object)(msmedetail.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 242;BA.debugLine="StartActivity(AddPhoto)";
Debug.ShouldStop(131072);
msmedetail.mostCurrent.__c.runVoidMethod ("StartActivity",msmedetail.processBA,(Object)((msmedetail.mostCurrent._addphoto.getObject())));
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
public static RemoteObject  _backarrow_click() throws Exception{
try {
		Debug.PushSubsStack("BackArrow_Click (msmedetail) ","msmedetail",8,msmedetail.mostCurrent.activityBA,msmedetail.mostCurrent,245);
if (RapidSub.canDelegate("backarrow_click")) return b4a.example.msmedetail.remoteMe.runUserSub(false, "msmedetail","backarrow_click");
 BA.debugLineNum = 245;BA.debugLine="Sub BackArrow_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 246;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2097152);
msmedetail.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 247;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("CreateItem (msmedetail) ","msmedetail",8,msmedetail.mostCurrent.activityBA,msmedetail.mostCurrent,99);
if (RapidSub.canDelegate("createitem")) return b4a.example.msmedetail.remoteMe.runUserSub(false, "msmedetail","createitem", _width, _title, _content);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Title", _title);
Debug.locals.put("Content", _content);
 BA.debugLineNum = 99;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(8);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = msmedetail._xui.runMethod(false,"CreatePanel",msmedetail.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 101;BA.debugLine="p.LoadLayout(\"facility_list\")";
Debug.ShouldStop(16);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("facility_list")),msmedetail.mostCurrent.activityBA);
 BA.debugLineNum = 102;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, 5%y)";
Debug.ShouldStop(32);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(msmedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),msmedetail.mostCurrent.activityBA)));
 BA.debugLineNum = 103;BA.debugLine="numfc.Text = Title";
Debug.ShouldStop(64);
msmedetail.mostCurrent._numfc.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 104;BA.debugLine="namefc.Text = Content";
Debug.ShouldStop(128);
msmedetail.mostCurrent._namefc.runMethod(true,"setText",BA.ObjectToCharSequence(_content));
 BA.debugLineNum = 105;BA.debugLine="Return p";
Debug.ShouldStop(256);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _editbtn_click() throws Exception{
try {
		Debug.PushSubsStack("editBtn_Click (msmedetail) ","msmedetail",8,msmedetail.mostCurrent.activityBA,msmedetail.mostCurrent,276);
if (RapidSub.canDelegate("editbtn_click")) return b4a.example.msmedetail.remoteMe.runUserSub(false, "msmedetail","editbtn_click");
 BA.debugLineNum = 276;BA.debugLine="Sub editBtn_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 277;BA.debugLine="StartActivity(MsmeEdit)";
Debug.ShouldStop(1048576);
msmedetail.mostCurrent.__c.runVoidMethod ("StartActivity",msmedetail.processBA,(Object)((msmedetail.mostCurrent._msmeedit.getObject())));
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _editfacility_click() throws Exception{
try {
		Debug.PushSubsStack("editFacility_Click (msmedetail) ","msmedetail",8,msmedetail.mostCurrent.activityBA,msmedetail.mostCurrent,280);
if (RapidSub.canDelegate("editfacility_click")) return b4a.example.msmedetail.remoteMe.runUserSub(false, "msmedetail","editfacility_click");
 BA.debugLineNum = 280;BA.debugLine="Sub editFacility_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 281;BA.debugLine="StartActivity(EditBuildingFacility)";
Debug.ShouldStop(16777216);
msmedetail.mostCurrent.__c.runVoidMethod ("StartActivity",msmedetail.processBA,(Object)((msmedetail.mostCurrent._editbuildingfacility.getObject())));
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("ExecuteRemoteQuery (msmedetail) ","msmedetail",8,msmedetail.mostCurrent.activityBA,msmedetail.mostCurrent,108);
if (RapidSub.canDelegate("executeremotequery")) return b4a.example.msmedetail.remoteMe.runUserSub(false, "msmedetail","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 108;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(4096);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 110;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(8192);
_job.runVoidMethod ("_initialize",msmedetail.processBA,(Object)(_jobname),(Object)(msmedetail.getObject()));
 BA.debugLineNum = 111;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
Debug.ShouldStop(16384);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),msmedetail.mostCurrent._main._server,RemoteObject.createImmutable("mobile/json.php"))),(Object)(_query));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim ScrollImage As ScrollView";
msmedetail.mostCurrent._scrollimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim clv As CustomListView";
msmedetail.mostCurrent._clv = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 19;BA.debugLine="Dim Label1 As Label";
msmedetail.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim ImageView1 As ImageView";
msmedetail.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private CLV1 As CustomListView";
msmedetail.mostCurrent._clv1 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 23;BA.debugLine="Private ScrollView1 As ScrollView";
msmedetail.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private TitleBar As Label";
msmedetail.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private BackArrow As Label";
msmedetail.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private PanelBuildingList As Panel";
msmedetail.mostCurrent._panelbuildinglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private numfc As B4XView";
msmedetail.mostCurrent._numfc = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private namefc As B4XView";
msmedetail.mostCurrent._namefc = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private btnGallery As Panel";
msmedetail.mostCurrent._btngallery = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private PFacility As Panel";
msmedetail.mostCurrent._pfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private ListItem As Panel";
msmedetail.mostCurrent._listitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private PanelButton As Panel";
msmedetail.mostCurrent._panelbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Dim MsmeName As Label";
msmedetail.mostCurrent._msmename = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private StandingYear As Label";
msmedetail.mostCurrent._standingyear = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private BuildingArea As Label";
msmedetail.mostCurrent._buildingarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private LandArea As Label";
msmedetail.mostCurrent._landarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private ParkingArea As Label";
msmedetail.mostCurrent._parkingarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private Electricity As Label";
msmedetail.mostCurrent._electricity = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private Construction As Label";
msmedetail.mostCurrent._construction = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private PanelToolBar As Panel";
msmedetail.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Dim ids As String";
msmedetail.mostCurrent._ids = RemoteObject.createImmutable("");
 //BA.debugLineNum = 44;BA.debugLine="Private LblEdit As Label";
msmedetail.mostCurrent._lbledit = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private LblFacility As Label";
msmedetail.mostCurrent._lblfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private Panel4 As Panel";
msmedetail.mostCurrent._panel4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Dim TabHost1 As TabHost";
msmedetail.mostCurrent._tabhost1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabHostWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private TypeOfMsme As Label";
msmedetail.mostCurrent._typeofmsme = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private PanelMap As Panel";
msmedetail.mostCurrent._panelmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private btnRoute As Button";
msmedetail.mostCurrent._btnroute = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private WebViewRoute As WebView";
msmedetail.mostCurrent._webviewroute = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private editBtn As Button";
msmedetail.mostCurrent._editbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private editFacility As Button";
msmedetail.mostCurrent._editfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private PanelGallery As Panel";
msmedetail.mostCurrent._panelgallery = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private AddPicture As Button";
msmedetail.mostCurrent._addpicture = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imageview1_click() throws Exception{
try {
		Debug.PushSubsStack("ImageView1_Click (msmedetail) ","msmedetail",8,msmedetail.mostCurrent.activityBA,msmedetail.mostCurrent,284);
if (RapidSub.canDelegate("imageview1_click")) return b4a.example.msmedetail.remoteMe.runUserSub(false, "msmedetail","imageview1_click");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _bd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 284;BA.debugLine="Sub ImageView1_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 285;BA.debugLine="Dim iv As ImageView";
Debug.ShouldStop(268435456);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 286;BA.debugLine="iv = Sender";
Debug.ShouldStop(536870912);
_iv.setObject(msmedetail.mostCurrent.__c.runMethod(false,"Sender",msmedetail.mostCurrent.activityBA));
 BA.debugLineNum = 287;BA.debugLine="If iv.Background Is BitmapDrawable Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("i",_iv.runMethod(false,"getBackground"), RemoteObject.createImmutable("android.graphics.drawable.BitmapDrawable"))) { 
 BA.debugLineNum = 289;BA.debugLine="Dim bd As BitmapDrawable";
Debug.ShouldStop(1);
_bd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bd", _bd);
 BA.debugLineNum = 290;BA.debugLine="bd = iv.Background";
Debug.ShouldStop(2);
_bd.setObject(_iv.runMethod(false,"getBackground"));
 BA.debugLineNum = 291;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(4);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 292;BA.debugLine="bmp = bd.Bitmap";
Debug.ShouldStop(8);
_bmp.setObject(_bd.runMethod(false,"getBitmap"));
 BA.debugLineNum = 293;BA.debugLine="CallSubDelayed2(ShowImage, \"Show\", bmp)";
Debug.ShouldStop(16);
msmedetail.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",msmedetail.processBA,(Object)((msmedetail.mostCurrent._showimage.getObject())),(Object)(BA.ObjectToString("Show")),(Object)((_bmp)));
 };
 BA.debugLineNum = 295;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("JobDone (msmedetail) ","msmedetail",8,msmedetail.mostCurrent.activityBA,msmedetail.mostCurrent,114);
if (RapidSub.canDelegate("jobdone")) return b4a.example.msmedetail.remoteMe.runUserSub(false, "msmedetail","jobdone", _job);
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
RemoteObject _fasilitas_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _notexist = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _content = RemoteObject.createImmutable("");
RemoteObject _quantity = RemoteObject.createImmutable(0);
RemoteObject _sv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
RemoteObject _data_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 114;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(262144);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 116;BA.debugLine="Dim res As String";
Debug.ShouldStop(524288);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 117;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(1048576);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 118;BA.debugLine="Log(\"Response from server :\"& res)";
Debug.ShouldStop(2097152);
msmedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 119;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(4194304);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 120;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(8388608);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 121;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(16777216);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("Download"),BA.ObjectToString("FASILITAS"),BA.ObjectToString("DATA"))) {
case 0: {
 BA.debugLineNum = 124;BA.debugLine="Dim agn As List";
Debug.ShouldStop(134217728);
_agn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 125;BA.debugLine="agn=parser.NextArray";
Debug.ShouldStop(268435456);
_agn = _parser.runMethod(false,"NextArray");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 126;BA.debugLine="If agn.Size - 1 < 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 127;BA.debugLine="Log(agn.Size)";
Debug.ShouldStop(1073741824);
msmedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_agn.runMethod(true,"getSize"))));
 BA.debugLineNum = 128;BA.debugLine="Dim NotFound As Label";
Debug.ShouldStop(-2147483648);
_notfound = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("NotFound", _notfound);
 BA.debugLineNum = 129;BA.debugLine="NotFound.Initialize(\"\")";
Debug.ShouldStop(1);
_notfound.runVoidMethod ("Initialize",msmedetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 130;BA.debugLine="PanelGallery.Color= Colors.White";
Debug.ShouldStop(2);
msmedetail.mostCurrent._panelgallery.runVoidMethod ("setColor",msmedetail.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 131;BA.debugLine="PanelGallery.AddView(NotFound,0,0,100%x,70%y)";
Debug.ShouldStop(4);
msmedetail.mostCurrent._panelgallery.runVoidMethod ("AddView",(Object)((_notfound.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(msmedetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),msmedetail.mostCurrent.activityBA)),(Object)(msmedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),msmedetail.mostCurrent.activityBA)));
 BA.debugLineNum = 132;BA.debugLine="NotFound.Text = \"Picture doesn't exist\"";
Debug.ShouldStop(8);
_notfound.runMethod(true,"setText",BA.ObjectToCharSequence("Picture doesn't exist"));
 BA.debugLineNum = 133;BA.debugLine="NotFound.TextSize = 15";
Debug.ShouldStop(16);
_notfound.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 134;BA.debugLine="NotFound.Gravity = Gravity.CENTER";
Debug.ShouldStop(32);
_notfound.runMethod(true,"setGravity",msmedetail.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 135;BA.debugLine="PanelGallery.Height = NotFound.Height";
Debug.ShouldStop(64);
msmedetail.mostCurrent._panelgallery.runMethod(true,"setHeight",_notfound.runMethod(true,"getHeight"));
 BA.debugLineNum = 136;BA.debugLine="TabHost1.Height = PanelGallery.Height";
Debug.ShouldStop(128);
msmedetail.mostCurrent._tabhost1.runMethod(true,"setHeight",msmedetail.mostCurrent._panelgallery.runMethod(true,"getHeight"));
 BA.debugLineNum = 137;BA.debugLine="Msgbox(\"Galery Foto tidak ditemukan\", \"Pering";
Debug.ShouldStop(256);
msmedetail.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Galery Foto tidak ditemukan")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Peringatan"))),msmedetail.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 139;BA.debugLine="ScrollImage.Initialize(100%y)";
Debug.ShouldStop(1024);
msmedetail.mostCurrent._scrollimage.runVoidMethod ("Initialize",msmedetail.mostCurrent.activityBA,(Object)(msmedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),msmedetail.mostCurrent.activityBA)));
 BA.debugLineNum = 140;BA.debugLine="PanelGallery.AddView(ScrollImage,0,0,100%x,10";
Debug.ShouldStop(2048);
msmedetail.mostCurrent._panelgallery.runVoidMethod ("AddView",(Object)((msmedetail.mostCurrent._scrollimage.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(msmedetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),msmedetail.mostCurrent.activityBA)),(Object)(msmedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),msmedetail.mostCurrent.activityBA)));
 BA.debugLineNum = 141;BA.debugLine="ScrollImage.Panel.LoadLayout(\"LoaderImage\")";
Debug.ShouldStop(4096);
msmedetail.mostCurrent._scrollimage.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LoaderImage")),msmedetail.mostCurrent.activityBA);
 BA.debugLineNum = 142;BA.debugLine="For i=0 To agn.Size-1";
Debug.ShouldStop(8192);
{
final int step27 = 1;
final int limit27 = RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27) ;_i = ((int)(0 + _i + step27))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 143;BA.debugLine="Dim w As Map";
Debug.ShouldStop(16384);
_w = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("w", _w);
 BA.debugLineNum = 144;BA.debugLine="w=agn.Get(i)";
Debug.ShouldStop(32768);
_w.setObject(_agn.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 145;BA.debugLine="Dim image = w.Get(\"photo_url\") As String";
Debug.ShouldStop(65536);
_image = BA.ObjectToString(_w.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_url")))));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 146;BA.debugLine="Dim gambar = \"\"&Main.Server&\"Files/Msme/img/";
Debug.ShouldStop(131072);
_gambar = RemoteObject.concat(RemoteObject.createImmutable(""),msmedetail.mostCurrent._main._server,RemoteObject.createImmutable("Files/Msme/img/"),_image);Debug.locals.put("gambar", _gambar);Debug.locals.put("gambar", _gambar);
 BA.debugLineNum = 147;BA.debugLine="Dim m As Map";
Debug.ShouldStop(262144);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 148;BA.debugLine="m.Initialize";
Debug.ShouldStop(524288);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 149;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(1048576);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 150;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(2097152);
_p.runVoidMethod ("Initialize",msmedetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 151;BA.debugLine="p.SetLayout(0,0,100%x,20%y)";
Debug.ShouldStop(4194304);
_p.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(msmedetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),msmedetail.mostCurrent.activityBA)),(Object)(msmedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),msmedetail.mostCurrent.activityBA)));
 BA.debugLineNum = 152;BA.debugLine="p.LoadLayout(\"listitem-image\")";
Debug.ShouldStop(8388608);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("listitem-image")),msmedetail.mostCurrent.activityBA);
 BA.debugLineNum = 153;BA.debugLine="clv.Add(p,m)";
Debug.ShouldStop(16777216);
msmedetail.mostCurrent._clv.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()),(Object)((_m.getObject())));
 BA.debugLineNum = 154;BA.debugLine="m.Put(ImageView1, gambar)";
Debug.ShouldStop(33554432);
_m.runVoidMethod ("Put",(Object)((msmedetail.mostCurrent._imageview1.getObject())),(Object)((_gambar)));
 BA.debugLineNum = 155;BA.debugLine="Log (gambar)";
Debug.ShouldStop(67108864);
msmedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(_gambar));
 BA.debugLineNum = 156;BA.debugLine="CallSubDelayed2(Starter, \"Download\", m)";
Debug.ShouldStop(134217728);
msmedetail.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",msmedetail.processBA,(Object)((msmedetail.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_m)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 158;BA.debugLine="ScrollView1.Height = 100%y - ScrollView1.Top";
Debug.ShouldStop(536870912);
msmedetail.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {msmedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),msmedetail.mostCurrent.activityBA),msmedetail.mostCurrent._scrollview1.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 159;BA.debugLine="ScrollImage.Panel.Height = (ImageView1.Height";
Debug.ShouldStop(1073741824);
msmedetail.mostCurrent._scrollimage.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {msmedetail.mostCurrent._imageview1.runMethod(true,"getHeight"),msmedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),msmedetail.mostCurrent.activityBA)}, "+",1, 1)),_agn.runMethod(true,"getSize")}, "*",0, 1));
 BA.debugLineNum = 160;BA.debugLine="ScrollImage.Height = 70%y";
Debug.ShouldStop(-2147483648);
msmedetail.mostCurrent._scrollimage.runMethod(true,"setHeight",msmedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),msmedetail.mostCurrent.activityBA));
 BA.debugLineNum = 161;BA.debugLine="PanelGallery.Height = ScrollImage.Height";
Debug.ShouldStop(1);
msmedetail.mostCurrent._panelgallery.runMethod(true,"setHeight",msmedetail.mostCurrent._scrollimage.runMethod(true,"getHeight"));
 BA.debugLineNum = 162;BA.debugLine="TabHost1.Height = ScrollImage.Height";
Debug.ShouldStop(2);
msmedetail.mostCurrent._tabhost1.runMethod(true,"setHeight",msmedetail.mostCurrent._scrollimage.runMethod(true,"getHeight"));
 };
 BA.debugLineNum = 164;BA.debugLine="AddPicture.Initialize(\"AddPicture\")";
Debug.ShouldStop(8);
msmedetail.mostCurrent._addpicture.runVoidMethod ("Initialize",msmedetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("AddPicture")));
 BA.debugLineNum = 165;BA.debugLine="PanelBuildingList.AddView(AddPicture,0, TabHos";
Debug.ShouldStop(16);
msmedetail.mostCurrent._panelbuildinglist.runVoidMethod ("AddView",(Object)((msmedetail.mostCurrent._addpicture.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {msmedetail.mostCurrent._tabhost1.runMethod(true,"getHeight"),msmedetail.mostCurrent._tabhost1.runMethod(true,"getTop")}, "+",1, 1)),(Object)(msmedetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),msmedetail.mostCurrent.activityBA)),(Object)(msmedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),msmedetail.mostCurrent.activityBA)));
 BA.debugLineNum = 166;BA.debugLine="PanelBuildingList.Height = AddPicture.Top + Ad";
Debug.ShouldStop(32);
msmedetail.mostCurrent._panelbuildinglist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {msmedetail.mostCurrent._addpicture.runMethod(true,"getTop"),msmedetail.mostCurrent._addpicture.runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 167;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.H";
Debug.ShouldStop(64);
msmedetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",msmedetail.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 BA.debugLineNum = 168;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(128);
msmedetail.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 1: {
 BA.debugLineNum = 171;BA.debugLine="Dim fasilitas_array As List";
Debug.ShouldStop(1024);
_fasilitas_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("fasilitas_array", _fasilitas_array);
 BA.debugLineNum = 172;BA.debugLine="fasilitas_array = parser.NextArray";
Debug.ShouldStop(2048);
_fasilitas_array = _parser.runMethod(false,"NextArray");Debug.locals.put("fasilitas_array", _fasilitas_array);
 BA.debugLineNum = 173;BA.debugLine="If fasilitas_array.Size-1 < 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_fasilitas_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 174;BA.debugLine="CLV1.AsView.Visible= False";
Debug.ShouldStop(8192);
msmedetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"setVisible",msmedetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 175;BA.debugLine="Dim NotExist As Label";
Debug.ShouldStop(16384);
_notexist = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("NotExist", _notexist);
 BA.debugLineNum = 176;BA.debugLine="NotExist.Initialize(\"\")";
Debug.ShouldStop(32768);
_notexist.runVoidMethod ("Initialize",msmedetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 177;BA.debugLine="PFacility.AddView(NotExist,LblFacility.Left,0";
Debug.ShouldStop(65536);
msmedetail.mostCurrent._pfacility.runVoidMethod ("AddView",(Object)((_notexist.getObject())),(Object)(msmedetail.mostCurrent._lblfacility.runMethod(true,"getLeft")),(Object)(BA.numberCast(int.class, 0)),(Object)(msmedetail.mostCurrent._lblfacility.runMethod(true,"getWidth")),(Object)(msmedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),msmedetail.mostCurrent.activityBA)));
 BA.debugLineNum = 178;BA.debugLine="NotExist.Gravity= Gravity.CENTER";
Debug.ShouldStop(131072);
_notexist.runMethod(true,"setGravity",msmedetail.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 179;BA.debugLine="NotExist.Text=\"Facility doesn't not exist.\"";
Debug.ShouldStop(262144);
_notexist.runMethod(true,"setText",BA.ObjectToCharSequence("Facility doesn't not exist."));
 BA.debugLineNum = 180;BA.debugLine="Select TabHost1.CurrentTab";
Debug.ShouldStop(524288);
switch (BA.switchObjectToInt(msmedetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 182;BA.debugLine="PFacility.Height= NotExist.Height + NotExis";
Debug.ShouldStop(2097152);
msmedetail.mostCurrent._pfacility.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_notexist.runMethod(true,"getHeight"),_notexist.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 183;BA.debugLine="TabHost1.Height = PFacility.Top+PFacility.H";
Debug.ShouldStop(4194304);
msmedetail.mostCurrent._tabhost1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {msmedetail.mostCurrent._pfacility.runMethod(true,"getTop"),msmedetail.mostCurrent._pfacility.runMethod(true,"getHeight")}, "+",1, 1));
 break; }
}
;
 }else {
 BA.debugLineNum = 186;BA.debugLine="For i=0 To fasilitas_array.Size - 1";
Debug.ShouldStop(33554432);
{
final int step70 = 1;
final int limit70 = RemoteObject.solve(new RemoteObject[] {_fasilitas_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step70 > 0 && _i <= limit70) || (step70 < 0 && _i >= limit70) ;_i = ((int)(0 + _i + step70))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 187;BA.debugLine="Dim a As Map";
Debug.ShouldStop(67108864);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 188;BA.debugLine="a = fasilitas_array.Get(i)";
Debug.ShouldStop(134217728);
_a.setObject(_fasilitas_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 190;BA.debugLine="Dim content As String = a.Get(\"name_of_facili";
Debug.ShouldStop(536870912);
_content = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_facility")))));Debug.locals.put("content", _content);Debug.locals.put("content", _content);
 BA.debugLineNum = 191;BA.debugLine="Dim quantity As Int = a.Get(\"quantity_of_faci";
Debug.ShouldStop(1073741824);
_quantity = BA.numberCast(int.class, _a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("quantity_of_facilities")))));Debug.locals.put("quantity", _quantity);Debug.locals.put("quantity", _quantity);
 BA.debugLineNum = 192;BA.debugLine="CLV1.Add(CreateItem(CLV1.AsView.Width, $\"${qu";
Debug.ShouldStop(-2147483648);
msmedetail.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(msmedetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getWidth"),(RemoteObject.concat(RemoteObject.createImmutable(""),msmedetail.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_quantity))),RemoteObject.createImmutable(""))),_content).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 193;BA.debugLine="CLV1.AsView.Height = ListItem.Height*(i+1)";
Debug.ShouldStop(1);
msmedetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {msmedetail.mostCurrent._listitem.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))}, "*",0, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 195;BA.debugLine="Dim sv As ScrollView";
Debug.ShouldStop(4);
_sv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");Debug.locals.put("sv", _sv);
 BA.debugLineNum = 196;BA.debugLine="CLV1.sv.Height = CLV1.AsView.Height";
Debug.ShouldStop(8);
msmedetail.mostCurrent._clv1.getField(false,"_sv").runMethod(true,"setHeight",msmedetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 197;BA.debugLine="PFacility.Height = LblFacility.Height + LblFac";
Debug.ShouldStop(16);
msmedetail.mostCurrent._pfacility.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {msmedetail.mostCurrent._lblfacility.runMethod(true,"getHeight"),msmedetail.mostCurrent._lblfacility.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 198;BA.debugLine="PFacility.Height = PFacility.Height + CLV1.sv.";
Debug.ShouldStop(32);
msmedetail.mostCurrent._pfacility.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {msmedetail.mostCurrent._pfacility.runMethod(true,"getHeight"),msmedetail.mostCurrent._clv1.getField(false,"_sv").runMethod(true,"getHeight"),msmedetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getTop")}, "++",2, 1));
 BA.debugLineNum = 199;BA.debugLine="Select TabHost1.CurrentTab";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(msmedetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 201;BA.debugLine="TabHost1.Height =PFacility.Top+PFacility.Hei";
Debug.ShouldStop(256);
msmedetail.mostCurrent._tabhost1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {msmedetail.mostCurrent._pfacility.runMethod(true,"getTop"),msmedetail.mostCurrent._pfacility.runMethod(true,"getHeight"),msmedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),msmedetail.mostCurrent.activityBA)}, "++",2, 1));
 break; }
}
;
 };
 BA.debugLineNum = 204;BA.debugLine="PanelBuildingList.Height = TabHost1.Height + T";
Debug.ShouldStop(2048);
msmedetail.mostCurrent._panelbuildinglist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {msmedetail.mostCurrent._tabhost1.runMethod(true,"getHeight"),msmedetail.mostCurrent._tabhost1.runMethod(true,"getTop"),msmedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),msmedetail.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 205;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.H";
Debug.ShouldStop(4096);
msmedetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",msmedetail.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 BA.debugLineNum = 212;BA.debugLine="Log(content)";
Debug.ShouldStop(524288);
msmedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(_content));
 BA.debugLineNum = 213;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1048576);
msmedetail.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 2: {
 BA.debugLineNum = 216;BA.debugLine="Dim data_array As List";
Debug.ShouldStop(8388608);
_data_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 217;BA.debugLine="data_array = parser.NextArray";
Debug.ShouldStop(16777216);
_data_array = _parser.runMethod(false,"NextArray");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 218;BA.debugLine="For i=0 To data_array.Size -1";
Debug.ShouldStop(33554432);
{
final int step94 = 1;
final int limit94 = RemoteObject.solve(new RemoteObject[] {_data_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step94 > 0 && _i <= limit94) || (step94 < 0 && _i >= limit94) ;_i = ((int)(0 + _i + step94))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 219;BA.debugLine="Dim a As Map";
Debug.ShouldStop(67108864);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 220;BA.debugLine="a = data_array.Get(i)";
Debug.ShouldStop(134217728);
_a.setObject(_data_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 221;BA.debugLine="lat = a.Get(\"latitude\")";
Debug.ShouldStop(268435456);
msmedetail._lat = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("latitude")))));
 BA.debugLineNum = 222;BA.debugLine="lng = a.Get(\"longitude\")";
Debug.ShouldStop(536870912);
msmedetail._lng = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("longitude")))));
 BA.debugLineNum = 223;BA.debugLine="Log(lat)";
Debug.ShouldStop(1073741824);
msmedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(msmedetail._lat));
 BA.debugLineNum = 224;BA.debugLine="Log(lng)";
Debug.ShouldStop(-2147483648);
msmedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(msmedetail._lng));
 BA.debugLineNum = 226;BA.debugLine="MsmeName.Text = a.Get(\"name_of_msme_building\"";
Debug.ShouldStop(2);
msmedetail.mostCurrent._msmename.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_msme_building"))))));
 BA.debugLineNum = 227;BA.debugLine="TypeOfMsme.Text = a.Get(\"typems\")";
Debug.ShouldStop(4);
msmedetail.mostCurrent._typeofmsme.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("typems"))))));
 BA.debugLineNum = 228;BA.debugLine="StandingYear.Text = a.Get(\"standing_year\")";
Debug.ShouldStop(8);
msmedetail.mostCurrent._standingyear.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("standing_year"))))));
 BA.debugLineNum = 229;BA.debugLine="BuildingArea.Text = a.Get(\"building_area\")";
Debug.ShouldStop(16);
msmedetail.mostCurrent._buildingarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("building_area"))))));
 BA.debugLineNum = 230;BA.debugLine="LandArea.Text = a.Get(\"land_area\")";
Debug.ShouldStop(32);
msmedetail.mostCurrent._landarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("land_area"))))));
 BA.debugLineNum = 231;BA.debugLine="ParkingArea.Text = a.Get(\"parking_area\")";
Debug.ShouldStop(64);
msmedetail.mostCurrent._parkingarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parking_area"))))));
 BA.debugLineNum = 232;BA.debugLine="Electricity.Text = a.Get(\"electricity_capacit";
Debug.ShouldStop(128);
msmedetail.mostCurrent._electricity.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("electricity_capacity"))))));
 BA.debugLineNum = 233;BA.debugLine="Construction.Text = a.Get(\"constr\")";
Debug.ShouldStop(256);
msmedetail.mostCurrent._construction.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("constr"))))));
 }
}Debug.locals.put("i", _i);
;
 break; }
}
;
 };
 BA.debugLineNum = 237;BA.debugLine="Job.Release";
Debug.ShouldStop(4096);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("LblEdit_Click (msmedetail) ","msmedetail",8,msmedetail.mostCurrent.activityBA,msmedetail.mostCurrent,249);
if (RapidSub.canDelegate("lbledit_click")) return b4a.example.msmedetail.remoteMe.runUserSub(false, "msmedetail","lbledit_click");
 BA.debugLineNum = 249;BA.debugLine="Sub LblEdit_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 250;BA.debugLine="StartActivity(MsmeEdit)";
Debug.ShouldStop(33554432);
msmedetail.mostCurrent.__c.runVoidMethod ("StartActivity",msmedetail.processBA,(Object)((msmedetail.mostCurrent._msmeedit.getObject())));
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
msmedetail._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim lat, lng As String";
msmedetail._lat = RemoteObject.createImmutable("");
msmedetail._lng = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _tabhost1_tabchanged() throws Exception{
try {
		Debug.PushSubsStack("TabHost1_TabChanged (msmedetail) ","msmedetail",8,msmedetail.mostCurrent.activityBA,msmedetail.mostCurrent,253);
if (RapidSub.canDelegate("tabhost1_tabchanged")) return b4a.example.msmedetail.remoteMe.runUserSub(false, "msmedetail","tabhost1_tabchanged");
 BA.debugLineNum = 253;BA.debugLine="Sub TabHost1_TabChanged";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 255;BA.debugLine="Select TabHost1.CurrentTab";
Debug.ShouldStop(1073741824);
switch (BA.switchObjectToInt(msmedetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 257;BA.debugLine="WebViewRoute.LoadUrl(Main.Server&\"Msme/Route.ph";
Debug.ShouldStop(1);
msmedetail.mostCurrent._webviewroute.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(msmedetail.mostCurrent._main._server,RemoteObject.createImmutable("Msme/Route.php?lat="),msmedetail.mostCurrent._main._lbllat,RemoteObject.createImmutable("&lng="),msmedetail.mostCurrent._main._lbllon,RemoteObject.createImmutable("&latd="),msmedetail._lat,RemoteObject.createImmutable("&lngd="),msmedetail._lng)));
 BA.debugLineNum = 258;BA.debugLine="Msgbox(\"Current tab is \" & TabHost1.CurrentTab,";
Debug.ShouldStop(2);
msmedetail.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Current tab is "),msmedetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),msmedetail.mostCurrent.activityBA);
 BA.debugLineNum = 259;BA.debugLine="Log (\"Button Top :\"&btnRoute.Top)";
Debug.ShouldStop(4);
msmedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Button Top :"),msmedetail.mostCurrent._btnroute.runMethod(true,"getTop"))));
 BA.debugLineNum = 260;BA.debugLine="TabHost1.Height = btnRoute.Top + btnRoute.Heigh";
Debug.ShouldStop(8);
msmedetail.mostCurrent._tabhost1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {msmedetail.mostCurrent._btnroute.runMethod(true,"getTop"),msmedetail.mostCurrent._btnroute.runMethod(true,"getHeight"),msmedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),msmedetail.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 261;BA.debugLine="Log(\"tabHost height: \"&TabHost1.Height)";
Debug.ShouldStop(16);
msmedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("tabHost height: "),msmedetail.mostCurrent._tabhost1.runMethod(true,"getHeight"))));
 BA.debugLineNum = 262;BA.debugLine="PanelBuildingList.Height = TabHost1.Height + Ta";
Debug.ShouldStop(32);
msmedetail.mostCurrent._panelbuildinglist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {msmedetail.mostCurrent._tabhost1.runMethod(true,"getHeight"),msmedetail.mostCurrent._tabhost1.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 263;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.He";
Debug.ShouldStop(64);
msmedetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",msmedetail.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 break; }
case 1: {
 BA.debugLineNum = 265;BA.debugLine="CLV1.Clear";
Debug.ShouldStop(256);
msmedetail.mostCurrent._clv1.runVoidMethod ("_clear");
 BA.debugLineNum = 266;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(512);
msmedetail.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",msmedetail.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Loading..."))));
 BA.debugLineNum = 267;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.msme_building_id,";
Debug.ShouldStop(1024);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.msme_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id ='"),msmedetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("FASILITAS"));
 BA.debugLineNum = 268;BA.debugLine="ExecuteRemoteQuery(\"SELECT M.msme_building_id,";
Debug.ShouldStop(2048);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT M.msme_building_id, M.name_of_msme_building, M.building_area, M.land_area, M.parking_area, M.standing_year, M.electricity_capacity, M.address, M.type_of_construction, M.type_of_msme, M.owner_name, M.number_of_employee, M.monthly_income, M.contact_person, ST_X(ST_Centroid(M.geom)) As longitude, ST_Y(ST_CENTROID(M.geom)) As latitude,T.name_of_type As constr, J.name_of_type As typems, ST_AsText(geom) As geom FROM msme_building As M LEFT JOIN type_of_construction As T ON M.type_of_construction=T.type_id LEFT JOIN type_of_msme As J ON M.type_of_msme=J.type_id WHERE M.msme_building_id='"),msmedetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("DATA"));
 break; }
case 2: {
 BA.debugLineNum = 270;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(8192);
msmedetail.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",msmedetail.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Loading..."))));
 BA.debugLineNum = 271;BA.debugLine="ExecuteRemoteQuery(\"SELECT photo_url, upload_da";
Debug.ShouldStop(16384);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT photo_url, upload_date FROM msme_building_gallery WHERE msme_building_id='"),msmedetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("Download"));
 break; }
}
;
 BA.debugLineNum = 274;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}