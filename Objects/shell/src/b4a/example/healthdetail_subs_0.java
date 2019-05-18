package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class healthdetail_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (healthdetail) ","healthdetail",6,healthdetail.mostCurrent.activityBA,healthdetail.mostCurrent,63);
if (RapidSub.canDelegate("activity_create")) return b4a.example.healthdetail.remoteMe.runUserSub(false, "healthdetail","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 63;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(1);
healthdetail.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),healthdetail.mostCurrent.activityBA);
 BA.debugLineNum = 66;BA.debugLine="ScrollView1.Panel.LoadLayout(\"HealthDetail\")";
Debug.ShouldStop(2);
healthdetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("HealthDetail")),healthdetail.mostCurrent.activityBA);
 BA.debugLineNum = 67;BA.debugLine="ScrollView1.Height = 100%y - ScrollView1.Top";
Debug.ShouldStop(4);
healthdetail.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {healthdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),healthdetail.mostCurrent.activityBA),healthdetail.mostCurrent._scrollview1.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 68;BA.debugLine="PanelToolbar.Visible = False";
Debug.ShouldStop(8);
healthdetail.mostCurrent._paneltoolbar.runMethod(true,"setVisible",healthdetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 70;BA.debugLine="BackArrow.Visible= True";
Debug.ShouldStop(32);
healthdetail.mostCurrent._backarrow.runMethod(true,"setVisible",healthdetail.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 71;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(64);
healthdetail.mostCurrent._backarrow.runVoidMethod ("SetBackgroundImageNew",(Object)((healthdetail.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(healthdetail.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("back-arrow.png"))).getObject())));
 BA.debugLineNum = 72;BA.debugLine="TitleBar.Text=\"Building Detail\"";
Debug.ShouldStop(128);
healthdetail.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("Building Detail"));
 BA.debugLineNum = 74;BA.debugLine="TabHost1.AddTab(\"Map\",\"tabMap\")";
Debug.ShouldStop(512);
healthdetail.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",healthdetail.mostCurrent.activityBA,(Object)(BA.ObjectToString("Map")),(Object)(RemoteObject.createImmutable("tabMap")));
 BA.debugLineNum = 75;BA.debugLine="TabHost1.AddTab(\"Detail\",\"Health_tabDetail\")";
Debug.ShouldStop(1024);
healthdetail.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",healthdetail.mostCurrent.activityBA,(Object)(BA.ObjectToString("Detail")),(Object)(RemoteObject.createImmutable("Health_tabDetail")));
 BA.debugLineNum = 76;BA.debugLine="TabHost1.AddTab(\"Gallery\",\"tabGallery\")";
Debug.ShouldStop(2048);
healthdetail.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",healthdetail.mostCurrent.activityBA,(Object)(BA.ObjectToString("Gallery")),(Object)(RemoteObject.createImmutable("tabGallery")));
 BA.debugLineNum = 79;BA.debugLine="FunctionAll.CheckBuilding_id(HealthBuilding.idBui";
Debug.ShouldStop(16384);
healthdetail.mostCurrent._functionall.runVoidMethod ("_checkbuilding_id",healthdetail.mostCurrent.activityBA,(Object)(healthdetail.mostCurrent._healthbuilding._idbuilding));
 BA.debugLineNum = 80;BA.debugLine="ids = FunctionAll.ids";
Debug.ShouldStop(32768);
healthdetail.mostCurrent._ids = healthdetail.mostCurrent._functionall._ids;
 BA.debugLineNum = 81;BA.debugLine="Log(\"DARI SINI\"&ids)";
Debug.ShouldStop(65536);
healthdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DARI SINI"),healthdetail.mostCurrent._ids)));
 BA.debugLineNum = 83;BA.debugLine="TabHost1.CurrentTab = 1";
Debug.ShouldStop(262144);
healthdetail.mostCurrent._tabhost1.runMethodAndSync(true,"setCurrentTab",BA.numberCast(int.class, 1));
 BA.debugLineNum = 84;BA.debugLine="AddPicture.Initialize(\"AddPicture\")";
Debug.ShouldStop(524288);
healthdetail.mostCurrent._addpicture.runVoidMethod ("Initialize",healthdetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("AddPicture")));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Pause (healthdetail) ","healthdetail",6,healthdetail.mostCurrent.activityBA,healthdetail.mostCurrent,99);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.healthdetail.remoteMe.runUserSub(false, "healthdetail","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 99;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="CallSub(Starter, \"ActivityIsPaused\")";
Debug.ShouldStop(8);
healthdetail.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",healthdetail.processBA,(Object)((healthdetail.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("ActivityIsPaused")));
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
		Debug.PushSubsStack("Activity_Resume (healthdetail) ","healthdetail",6,healthdetail.mostCurrent.activityBA,healthdetail.mostCurrent,87);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.healthdetail.remoteMe.runUserSub(false, "healthdetail","activity_resume");
 BA.debugLineNum = 87;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="CLV1.Clear";
Debug.ShouldStop(8388608);
healthdetail.mostCurrent._clv1.runVoidMethod ("_clear");
 BA.debugLineNum = 89;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(16777216);
healthdetail.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",healthdetail.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Loading..."))));
 BA.debugLineNum = 90;BA.debugLine="If TabHost1.CurrentTab == 2 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",healthdetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 91;BA.debugLine="clv.Clear";
Debug.ShouldStop(67108864);
healthdetail.mostCurrent._clv.runVoidMethod ("_clear");
 BA.debugLineNum = 92;BA.debugLine="ExecuteRemoteQuery(\"SELECT photo_url, upload_dat";
Debug.ShouldStop(134217728);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT photo_url, upload_date FROM health_building_gallery WHERE health_building_id='"),healthdetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("Download"));
 }else {
 BA.debugLineNum = 94;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.health_building_id,";
Debug.ShouldStop(536870912);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.health_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id ='"),healthdetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("FASILITAS"));
 BA.debugLineNum = 95;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.health_building_id,";
Debug.ShouldStop(1073741824);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT H.health_building_id, H.name_of_health_building, H.building_area, H.land_area, H.parking_area, H.standing_year, H.electricity_capacity, H.address, H.type_of_construction, H.type_of_health_building, H.name_of_head, H.number_of_medical_personnel, H.number_of_nonmedical_personnel,ST_X(ST_Centroid(H.geom)) As longitude, ST_Y(ST_CENTROID(H.geom)) As latitude,	T.name_of_type As constr, J.name_of_type As typeh, ST_AsText(geom) As geom FROM health_building As H LEFT JOIN type_of_construction As T ON H.type_of_construction=T.type_id LEFT JOIN type_of_health_building As J ON H.type_of_health_building=J.type_id	WHERE H.health_building_id='"),healthdetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("DATA"));
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
		Debug.PushSubsStack("AddPicture_Click (healthdetail) ","healthdetail",6,healthdetail.mostCurrent.activityBA,healthdetail.mostCurrent,248);
if (RapidSub.canDelegate("addpicture_click")) return b4a.example.healthdetail.remoteMe.runUserSub(false, "healthdetail","addpicture_click");
 BA.debugLineNum = 248;BA.debugLine="Sub AddPicture_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 249;BA.debugLine="ToastMessageShow(\"Add photo\",True)";
Debug.ShouldStop(16777216);
healthdetail.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Add photo")),(Object)(healthdetail.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 250;BA.debugLine="StartActivity(AddPhoto)";
Debug.ShouldStop(33554432);
healthdetail.mostCurrent.__c.runVoidMethod ("StartActivity",healthdetail.processBA,(Object)((healthdetail.mostCurrent._addphoto.getObject())));
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
public static RemoteObject  _backarrow_click() throws Exception{
try {
		Debug.PushSubsStack("BackArrow_Click (healthdetail) ","healthdetail",6,healthdetail.mostCurrent.activityBA,healthdetail.mostCurrent,293);
if (RapidSub.canDelegate("backarrow_click")) return b4a.example.healthdetail.remoteMe.runUserSub(false, "healthdetail","backarrow_click");
 BA.debugLineNum = 293;BA.debugLine="Sub BackArrow_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 294;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32);
healthdetail.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _createitem(RemoteObject _width,RemoteObject _title,RemoteObject _content) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (healthdetail) ","healthdetail",6,healthdetail.mostCurrent.activityBA,healthdetail.mostCurrent,103);
if (RapidSub.canDelegate("createitem")) return b4a.example.healthdetail.remoteMe.runUserSub(false, "healthdetail","createitem", _width, _title, _content);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Title", _title);
Debug.locals.put("Content", _content);
 BA.debugLineNum = 103;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(128);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = healthdetail._xui.runMethod(false,"CreatePanel",healthdetail.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 105;BA.debugLine="p.LoadLayout(\"facility_list\")";
Debug.ShouldStop(256);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("facility_list")),healthdetail.mostCurrent.activityBA);
 BA.debugLineNum = 106;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, 5%y)";
Debug.ShouldStop(512);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(healthdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),healthdetail.mostCurrent.activityBA)));
 BA.debugLineNum = 107;BA.debugLine="numfc.Text = Title";
Debug.ShouldStop(1024);
healthdetail.mostCurrent._numfc.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 108;BA.debugLine="namefc.Text = Content";
Debug.ShouldStop(2048);
healthdetail.mostCurrent._namefc.runMethod(true,"setText",BA.ObjectToCharSequence(_content));
 BA.debugLineNum = 109;BA.debugLine="Return p";
Debug.ShouldStop(4096);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("editBtn_Click (healthdetail) ","healthdetail",6,healthdetail.mostCurrent.activityBA,healthdetail.mostCurrent,301);
if (RapidSub.canDelegate("editbtn_click")) return b4a.example.healthdetail.remoteMe.runUserSub(false, "healthdetail","editbtn_click");
 BA.debugLineNum = 301;BA.debugLine="Sub editBtn_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 302;BA.debugLine="StartActivity(HealthEdit)";
Debug.ShouldStop(8192);
healthdetail.mostCurrent.__c.runVoidMethod ("StartActivity",healthdetail.processBA,(Object)((healthdetail.mostCurrent._healthedit.getObject())));
 BA.debugLineNum = 303;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("editFacility_Click (healthdetail) ","healthdetail",6,healthdetail.mostCurrent.activityBA,healthdetail.mostCurrent,305);
if (RapidSub.canDelegate("editfacility_click")) return b4a.example.healthdetail.remoteMe.runUserSub(false, "healthdetail","editfacility_click");
 BA.debugLineNum = 305;BA.debugLine="Sub editFacility_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 307;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("ExecuteRemoteQuery (healthdetail) ","healthdetail",6,healthdetail.mostCurrent.activityBA,healthdetail.mostCurrent,112);
if (RapidSub.canDelegate("executeremotequery")) return b4a.example.healthdetail.remoteMe.runUserSub(false, "healthdetail","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 112;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(65536);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 114;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(131072);
_job.runVoidMethod ("_initialize",healthdetail.processBA,(Object)(_jobname),(Object)(healthdetail.getObject()));
 BA.debugLineNum = 115;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
Debug.ShouldStop(262144);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),healthdetail.mostCurrent._main._server,RemoteObject.createImmutable("mobile/json.php"))),(Object)(_query));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim ScrollImage As ScrollView";
healthdetail.mostCurrent._scrollimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim clv As CustomListView";
healthdetail.mostCurrent._clv = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 19;BA.debugLine="Dim Label1 As Label";
healthdetail.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim ImageView1 As ImageView";
healthdetail.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private CLV1 As CustomListView";
healthdetail.mostCurrent._clv1 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 23;BA.debugLine="Private ScrollView1 As ScrollView";
healthdetail.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private TitleBar As Label";
healthdetail.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private BackArrow As Label";
healthdetail.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private PanelBuildingList As Panel";
healthdetail.mostCurrent._panelbuildinglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private numfc As B4XView";
healthdetail.mostCurrent._numfc = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private namefc As B4XView";
healthdetail.mostCurrent._namefc = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private PFacility As Panel";
healthdetail.mostCurrent._pfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private ListItem As Panel";
healthdetail.mostCurrent._listitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private PanelButton As Panel";
healthdetail.mostCurrent._panelbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private PanelToolbar As Panel";
healthdetail.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private LblEdit As Label";
healthdetail.mostCurrent._lbledit = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private LblFacility As Label";
healthdetail.mostCurrent._lblfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private Panel4 As Panel";
healthdetail.mostCurrent._panel4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Dim TabHost1 As TabHost";
healthdetail.mostCurrent._tabhost1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabHostWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Dim bmp1, bmp2 As Bitmap";
healthdetail.mostCurrent._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
healthdetail.mostCurrent._bmp2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Dim ids As String";
healthdetail.mostCurrent._ids = RemoteObject.createImmutable("");
 //BA.debugLineNum = 41;BA.debugLine="Private TypeOfHealth As Label";
healthdetail.mostCurrent._typeofhealth = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private HeadOffice As Label";
healthdetail.mostCurrent._headoffice = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private NumMedical As Label";
healthdetail.mostCurrent._nummedical = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private NumNonMedical As Label";
healthdetail.mostCurrent._numnonmedical = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private StandingYear As Label";
healthdetail.mostCurrent._standingyear = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private BuildingArea As Label";
healthdetail.mostCurrent._buildingarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private LandArea As Label";
healthdetail.mostCurrent._landarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private ParkingArea As Label";
healthdetail.mostCurrent._parkingarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private Electricity As Label";
healthdetail.mostCurrent._electricity = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private Construction As Label";
healthdetail.mostCurrent._construction = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private LblFacility As Label";
healthdetail.mostCurrent._lblfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private HealthName As Label";
healthdetail.mostCurrent._healthname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private PanelMap As Panel";
healthdetail.mostCurrent._panelmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private btnRoute As Button";
healthdetail.mostCurrent._btnroute = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private WebViewRoute As WebView";
healthdetail.mostCurrent._webviewroute = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private editBtn As Button";
healthdetail.mostCurrent._editbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private editFacility As Button";
healthdetail.mostCurrent._editfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private PanelGallery As Panel";
healthdetail.mostCurrent._panelgallery = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private AddPicture As Button";
healthdetail.mostCurrent._addpicture = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imageview1_click() throws Exception{
try {
		Debug.PushSubsStack("ImageView1_Click (healthdetail) ","healthdetail",6,healthdetail.mostCurrent.activityBA,healthdetail.mostCurrent,279);
if (RapidSub.canDelegate("imageview1_click")) return b4a.example.healthdetail.remoteMe.runUserSub(false, "healthdetail","imageview1_click");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _bd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 279;BA.debugLine="Sub ImageView1_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 280;BA.debugLine="Dim iv As ImageView";
Debug.ShouldStop(8388608);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 281;BA.debugLine="iv = Sender";
Debug.ShouldStop(16777216);
_iv.setObject(healthdetail.mostCurrent.__c.runMethod(false,"Sender",healthdetail.mostCurrent.activityBA));
 BA.debugLineNum = 282;BA.debugLine="If iv.Background Is BitmapDrawable Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("i",_iv.runMethod(false,"getBackground"), RemoteObject.createImmutable("android.graphics.drawable.BitmapDrawable"))) { 
 BA.debugLineNum = 284;BA.debugLine="Dim bd As BitmapDrawable";
Debug.ShouldStop(134217728);
_bd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bd", _bd);
 BA.debugLineNum = 285;BA.debugLine="bd = iv.Background";
Debug.ShouldStop(268435456);
_bd.setObject(_iv.runMethod(false,"getBackground"));
 BA.debugLineNum = 286;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(536870912);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 287;BA.debugLine="bmp = bd.Bitmap";
Debug.ShouldStop(1073741824);
_bmp.setObject(_bd.runMethod(false,"getBitmap"));
 BA.debugLineNum = 288;BA.debugLine="CallSubDelayed2(ShowImage, \"Show\", bmp)";
Debug.ShouldStop(-2147483648);
healthdetail.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",healthdetail.processBA,(Object)((healthdetail.mostCurrent._showimage.getObject())),(Object)(BA.ObjectToString("Show")),(Object)((_bmp)));
 };
 BA.debugLineNum = 290;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("JobDone (healthdetail) ","healthdetail",6,healthdetail.mostCurrent.activityBA,healthdetail.mostCurrent,118);
if (RapidSub.canDelegate("jobdone")) return b4a.example.healthdetail.remoteMe.runUserSub(false, "healthdetail","jobdone", _job);
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
 BA.debugLineNum = 118;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(4194304);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 120;BA.debugLine="Dim res As String";
Debug.ShouldStop(8388608);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 121;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(16777216);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 122;BA.debugLine="Log(\"Response from server :\"& res)";
Debug.ShouldStop(33554432);
healthdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 123;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(67108864);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 124;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(134217728);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 125;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(268435456);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("Download"),BA.ObjectToString("FASILITAS"),BA.ObjectToString("DATA"))) {
case 0: {
 BA.debugLineNum = 128;BA.debugLine="Dim agn As List";
Debug.ShouldStop(-2147483648);
_agn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 129;BA.debugLine="agn=parser.NextArray";
Debug.ShouldStop(1);
_agn = _parser.runMethod(false,"NextArray");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 130;BA.debugLine="If agn.Size - 1 < 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 131;BA.debugLine="Log(agn.Size)";
Debug.ShouldStop(4);
healthdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_agn.runMethod(true,"getSize"))));
 BA.debugLineNum = 132;BA.debugLine="Dim NotFound As Label";
Debug.ShouldStop(8);
_notfound = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("NotFound", _notfound);
 BA.debugLineNum = 133;BA.debugLine="NotFound.Initialize(\"\")";
Debug.ShouldStop(16);
_notfound.runVoidMethod ("Initialize",healthdetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 134;BA.debugLine="PanelGallery.Color= Colors.White";
Debug.ShouldStop(32);
healthdetail.mostCurrent._panelgallery.runVoidMethod ("setColor",healthdetail.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 135;BA.debugLine="PanelGallery.AddView(NotFound,0,0,100%x,70%y)";
Debug.ShouldStop(64);
healthdetail.mostCurrent._panelgallery.runVoidMethod ("AddView",(Object)((_notfound.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(healthdetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),healthdetail.mostCurrent.activityBA)),(Object)(healthdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),healthdetail.mostCurrent.activityBA)));
 BA.debugLineNum = 136;BA.debugLine="NotFound.Text = \"Picture doesn't exist\"";
Debug.ShouldStop(128);
_notfound.runMethod(true,"setText",BA.ObjectToCharSequence("Picture doesn't exist"));
 BA.debugLineNum = 137;BA.debugLine="NotFound.TextSize = 15";
Debug.ShouldStop(256);
_notfound.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 138;BA.debugLine="NotFound.Gravity = Gravity.CENTER";
Debug.ShouldStop(512);
_notfound.runMethod(true,"setGravity",healthdetail.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 139;BA.debugLine="PanelGallery.Height = NotFound.Height";
Debug.ShouldStop(1024);
healthdetail.mostCurrent._panelgallery.runMethod(true,"setHeight",_notfound.runMethod(true,"getHeight"));
 BA.debugLineNum = 140;BA.debugLine="TabHost1.Height = PanelGallery.Height";
Debug.ShouldStop(2048);
healthdetail.mostCurrent._tabhost1.runMethod(true,"setHeight",healthdetail.mostCurrent._panelgallery.runMethod(true,"getHeight"));
 BA.debugLineNum = 141;BA.debugLine="Msgbox(\"Galery Foto tidak ditemukan\", \"Pering";
Debug.ShouldStop(4096);
healthdetail.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Galery Foto tidak ditemukan")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Peringatan"))),healthdetail.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 143;BA.debugLine="ScrollImage.Initialize(100%y)";
Debug.ShouldStop(16384);
healthdetail.mostCurrent._scrollimage.runVoidMethod ("Initialize",healthdetail.mostCurrent.activityBA,(Object)(healthdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),healthdetail.mostCurrent.activityBA)));
 BA.debugLineNum = 144;BA.debugLine="PanelGallery.AddView(ScrollImage,0,0,100%x,10";
Debug.ShouldStop(32768);
healthdetail.mostCurrent._panelgallery.runVoidMethod ("AddView",(Object)((healthdetail.mostCurrent._scrollimage.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(healthdetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),healthdetail.mostCurrent.activityBA)),(Object)(healthdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),healthdetail.mostCurrent.activityBA)));
 BA.debugLineNum = 145;BA.debugLine="ScrollImage.Panel.LoadLayout(\"LoaderImage\")";
Debug.ShouldStop(65536);
healthdetail.mostCurrent._scrollimage.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LoaderImage")),healthdetail.mostCurrent.activityBA);
 BA.debugLineNum = 146;BA.debugLine="For i=0 To agn.Size-1";
Debug.ShouldStop(131072);
{
final int step27 = 1;
final int limit27 = RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27) ;_i = ((int)(0 + _i + step27))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 147;BA.debugLine="Dim w As Map";
Debug.ShouldStop(262144);
_w = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("w", _w);
 BA.debugLineNum = 148;BA.debugLine="w=agn.Get(i)";
Debug.ShouldStop(524288);
_w.setObject(_agn.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 149;BA.debugLine="Dim image = w.Get(\"photo_url\") As String";
Debug.ShouldStop(1048576);
_image = BA.ObjectToString(_w.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_url")))));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 150;BA.debugLine="Dim gambar = \"\"&Main.Server&\"Files/Health/im";
Debug.ShouldStop(2097152);
_gambar = RemoteObject.concat(RemoteObject.createImmutable(""),healthdetail.mostCurrent._main._server,RemoteObject.createImmutable("Files/Health/img/"),_image);Debug.locals.put("gambar", _gambar);Debug.locals.put("gambar", _gambar);
 BA.debugLineNum = 151;BA.debugLine="Dim m As Map";
Debug.ShouldStop(4194304);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 152;BA.debugLine="m.Initialize";
Debug.ShouldStop(8388608);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 153;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(16777216);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 154;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(33554432);
_p.runVoidMethod ("Initialize",healthdetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 155;BA.debugLine="p.SetLayout(0,0,100%x,20%y)";
Debug.ShouldStop(67108864);
_p.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(healthdetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),healthdetail.mostCurrent.activityBA)),(Object)(healthdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),healthdetail.mostCurrent.activityBA)));
 BA.debugLineNum = 156;BA.debugLine="p.LoadLayout(\"listitem-image\")";
Debug.ShouldStop(134217728);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("listitem-image")),healthdetail.mostCurrent.activityBA);
 BA.debugLineNum = 157;BA.debugLine="clv.Add(p,m)";
Debug.ShouldStop(268435456);
healthdetail.mostCurrent._clv.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()),(Object)((_m.getObject())));
 BA.debugLineNum = 158;BA.debugLine="m.Put(ImageView1, gambar)";
Debug.ShouldStop(536870912);
_m.runVoidMethod ("Put",(Object)((healthdetail.mostCurrent._imageview1.getObject())),(Object)((_gambar)));
 BA.debugLineNum = 159;BA.debugLine="Log (gambar)";
Debug.ShouldStop(1073741824);
healthdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(_gambar));
 BA.debugLineNum = 160;BA.debugLine="CallSubDelayed2(Starter, \"Download\", m)";
Debug.ShouldStop(-2147483648);
healthdetail.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",healthdetail.processBA,(Object)((healthdetail.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_m)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 162;BA.debugLine="ScrollView1.Height = 100%y - ScrollView1.Top";
Debug.ShouldStop(2);
healthdetail.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {healthdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),healthdetail.mostCurrent.activityBA),healthdetail.mostCurrent._scrollview1.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 163;BA.debugLine="ScrollImage.Panel.Height = (ImageView1.Height";
Debug.ShouldStop(4);
healthdetail.mostCurrent._scrollimage.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {healthdetail.mostCurrent._imageview1.runMethod(true,"getHeight"),healthdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),healthdetail.mostCurrent.activityBA)}, "+",1, 1)),_agn.runMethod(true,"getSize")}, "*",0, 1));
 BA.debugLineNum = 164;BA.debugLine="ScrollImage.Height = 70%y";
Debug.ShouldStop(8);
healthdetail.mostCurrent._scrollimage.runMethod(true,"setHeight",healthdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),healthdetail.mostCurrent.activityBA));
 BA.debugLineNum = 165;BA.debugLine="PanelGallery.Height = ScrollImage.Height";
Debug.ShouldStop(16);
healthdetail.mostCurrent._panelgallery.runMethod(true,"setHeight",healthdetail.mostCurrent._scrollimage.runMethod(true,"getHeight"));
 BA.debugLineNum = 166;BA.debugLine="TabHost1.Height = ScrollImage.Height";
Debug.ShouldStop(32);
healthdetail.mostCurrent._tabhost1.runMethod(true,"setHeight",healthdetail.mostCurrent._scrollimage.runMethod(true,"getHeight"));
 };
 BA.debugLineNum = 168;BA.debugLine="AddPicture.RemoveView";
Debug.ShouldStop(128);
healthdetail.mostCurrent._addpicture.runVoidMethod ("RemoveView");
 BA.debugLineNum = 169;BA.debugLine="PanelBuildingList.AddView(AddPicture,0, TabHos";
Debug.ShouldStop(256);
healthdetail.mostCurrent._panelbuildinglist.runVoidMethod ("AddView",(Object)((healthdetail.mostCurrent._addpicture.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {healthdetail.mostCurrent._tabhost1.runMethod(true,"getHeight"),healthdetail.mostCurrent._tabhost1.runMethod(true,"getTop")}, "+",1, 1)),(Object)(healthdetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),healthdetail.mostCurrent.activityBA)),(Object)(healthdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),healthdetail.mostCurrent.activityBA)));
 BA.debugLineNum = 170;BA.debugLine="PanelBuildingList.Height = AddPicture.Top + Ad";
Debug.ShouldStop(512);
healthdetail.mostCurrent._panelbuildinglist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {healthdetail.mostCurrent._addpicture.runMethod(true,"getTop"),healthdetail.mostCurrent._addpicture.runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 171;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.H";
Debug.ShouldStop(1024);
healthdetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",healthdetail.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 BA.debugLineNum = 172;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2048);
healthdetail.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 1: {
 BA.debugLineNum = 175;BA.debugLine="Dim fasilitas_array As List";
Debug.ShouldStop(16384);
_fasilitas_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("fasilitas_array", _fasilitas_array);
 BA.debugLineNum = 176;BA.debugLine="fasilitas_array = parser.NextArray";
Debug.ShouldStop(32768);
_fasilitas_array = _parser.runMethod(false,"NextArray");Debug.locals.put("fasilitas_array", _fasilitas_array);
 BA.debugLineNum = 177;BA.debugLine="If fasilitas_array.Size-1 < 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_fasilitas_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 178;BA.debugLine="CLV1.AsView.Visible= False";
Debug.ShouldStop(131072);
healthdetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"setVisible",healthdetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 179;BA.debugLine="Dim NotExist As Label";
Debug.ShouldStop(262144);
_notexist = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("NotExist", _notexist);
 BA.debugLineNum = 180;BA.debugLine="NotExist.Initialize(\"\")";
Debug.ShouldStop(524288);
_notexist.runVoidMethod ("Initialize",healthdetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 181;BA.debugLine="PFacility.AddView(NotExist,LblFacility.Left,0";
Debug.ShouldStop(1048576);
healthdetail.mostCurrent._pfacility.runVoidMethod ("AddView",(Object)((_notexist.getObject())),(Object)(healthdetail.mostCurrent._lblfacility.runMethod(true,"getLeft")),(Object)(BA.numberCast(int.class, 0)),(Object)(healthdetail.mostCurrent._lblfacility.runMethod(true,"getWidth")),(Object)(healthdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),healthdetail.mostCurrent.activityBA)));
 BA.debugLineNum = 182;BA.debugLine="NotExist.Gravity= Gravity.CENTER";
Debug.ShouldStop(2097152);
_notexist.runMethod(true,"setGravity",healthdetail.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 183;BA.debugLine="NotExist.Text=\"Facility doesn't not exist.\"";
Debug.ShouldStop(4194304);
_notexist.runMethod(true,"setText",BA.ObjectToCharSequence("Facility doesn't not exist."));
 BA.debugLineNum = 184;BA.debugLine="Select TabHost1.CurrentTab";
Debug.ShouldStop(8388608);
switch (BA.switchObjectToInt(healthdetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 186;BA.debugLine="PFacility.Height= NotExist.Height + NotExis";
Debug.ShouldStop(33554432);
healthdetail.mostCurrent._pfacility.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_notexist.runMethod(true,"getHeight"),_notexist.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 187;BA.debugLine="TabHost1.Height = PFacility.Top+PFacility.H";
Debug.ShouldStop(67108864);
healthdetail.mostCurrent._tabhost1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {healthdetail.mostCurrent._pfacility.runMethod(true,"getTop"),healthdetail.mostCurrent._pfacility.runMethod(true,"getHeight")}, "+",1, 1));
 break; }
}
;
 }else {
 BA.debugLineNum = 190;BA.debugLine="For i=0 To fasilitas_array.Size - 1";
Debug.ShouldStop(536870912);
{
final int step70 = 1;
final int limit70 = RemoteObject.solve(new RemoteObject[] {_fasilitas_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step70 > 0 && _i <= limit70) || (step70 < 0 && _i >= limit70) ;_i = ((int)(0 + _i + step70))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 191;BA.debugLine="Dim a As Map";
Debug.ShouldStop(1073741824);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 192;BA.debugLine="a = fasilitas_array.Get(i)";
Debug.ShouldStop(-2147483648);
_a.setObject(_fasilitas_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 194;BA.debugLine="Dim content As String = a.Get(\"name_of_facili";
Debug.ShouldStop(2);
_content = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_facility")))));Debug.locals.put("content", _content);Debug.locals.put("content", _content);
 BA.debugLineNum = 195;BA.debugLine="Dim quantity As Int = a.Get(\"quantity_of_faci";
Debug.ShouldStop(4);
_quantity = BA.numberCast(int.class, _a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("quantity_of_facilities")))));Debug.locals.put("quantity", _quantity);Debug.locals.put("quantity", _quantity);
 BA.debugLineNum = 196;BA.debugLine="CLV1.Add(CreateItem(CLV1.AsView.Width, $\"${qu";
Debug.ShouldStop(8);
healthdetail.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(healthdetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getWidth"),(RemoteObject.concat(RemoteObject.createImmutable(""),healthdetail.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_quantity))),RemoteObject.createImmutable(""))),_content).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 197;BA.debugLine="CLV1.AsView.Height = ListItem.Height*(i+1)";
Debug.ShouldStop(16);
healthdetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {healthdetail.mostCurrent._listitem.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))}, "*",0, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 199;BA.debugLine="Dim sv As ScrollView";
Debug.ShouldStop(64);
_sv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");Debug.locals.put("sv", _sv);
 BA.debugLineNum = 200;BA.debugLine="CLV1.sv.Height = CLV1.AsView.Height";
Debug.ShouldStop(128);
healthdetail.mostCurrent._clv1.getField(false,"_sv").runMethod(true,"setHeight",healthdetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 201;BA.debugLine="PFacility.Height = LblFacility.Height + LblFac";
Debug.ShouldStop(256);
healthdetail.mostCurrent._pfacility.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {healthdetail.mostCurrent._lblfacility.runMethod(true,"getHeight"),healthdetail.mostCurrent._lblfacility.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 202;BA.debugLine="PFacility.Height = PFacility.Height + CLV1.sv.";
Debug.ShouldStop(512);
healthdetail.mostCurrent._pfacility.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {healthdetail.mostCurrent._pfacility.runMethod(true,"getHeight"),healthdetail.mostCurrent._clv1.getField(false,"_sv").runMethod(true,"getHeight"),healthdetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getTop")}, "++",2, 1));
 BA.debugLineNum = 203;BA.debugLine="Select TabHost1.CurrentTab";
Debug.ShouldStop(1024);
switch (BA.switchObjectToInt(healthdetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 205;BA.debugLine="TabHost1.Height =PFacility.Top+PFacility.Hei";
Debug.ShouldStop(4096);
healthdetail.mostCurrent._tabhost1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {healthdetail.mostCurrent._pfacility.runMethod(true,"getTop"),healthdetail.mostCurrent._pfacility.runMethod(true,"getHeight"),healthdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),healthdetail.mostCurrent.activityBA)}, "++",2, 1));
 break; }
}
;
 };
 BA.debugLineNum = 208;BA.debugLine="PanelBuildingList.Height = TabHost1.Height + T";
Debug.ShouldStop(32768);
healthdetail.mostCurrent._panelbuildinglist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {healthdetail.mostCurrent._tabhost1.runMethod(true,"getHeight"),healthdetail.mostCurrent._tabhost1.runMethod(true,"getTop"),healthdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),healthdetail.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 209;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.H";
Debug.ShouldStop(65536);
healthdetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",healthdetail.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 BA.debugLineNum = 216;BA.debugLine="Log(content)";
Debug.ShouldStop(8388608);
healthdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(_content));
 BA.debugLineNum = 217;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16777216);
healthdetail.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 2: {
 BA.debugLineNum = 220;BA.debugLine="Dim data_array As List";
Debug.ShouldStop(134217728);
_data_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 221;BA.debugLine="data_array = parser.NextArray";
Debug.ShouldStop(268435456);
_data_array = _parser.runMethod(false,"NextArray");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 222;BA.debugLine="For i=0 To data_array.Size -1";
Debug.ShouldStop(536870912);
{
final int step94 = 1;
final int limit94 = RemoteObject.solve(new RemoteObject[] {_data_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step94 > 0 && _i <= limit94) || (step94 < 0 && _i >= limit94) ;_i = ((int)(0 + _i + step94))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 223;BA.debugLine="Dim a As Map";
Debug.ShouldStop(1073741824);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 224;BA.debugLine="a = data_array.Get(i)";
Debug.ShouldStop(-2147483648);
_a.setObject(_data_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 225;BA.debugLine="lat = a.Get(\"latitude\")";
Debug.ShouldStop(1);
healthdetail._lat = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("latitude")))));
 BA.debugLineNum = 226;BA.debugLine="lng = a.Get(\"longitude\")";
Debug.ShouldStop(2);
healthdetail._lng = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("longitude")))));
 BA.debugLineNum = 227;BA.debugLine="Log(lat)";
Debug.ShouldStop(4);
healthdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(healthdetail._lat));
 BA.debugLineNum = 228;BA.debugLine="Log(lng)";
Debug.ShouldStop(8);
healthdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(healthdetail._lng));
 BA.debugLineNum = 229;BA.debugLine="HealthName.Text = a.Get(\"name_of_health_build";
Debug.ShouldStop(16);
healthdetail.mostCurrent._healthname.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_health_building"))))));
 BA.debugLineNum = 230;BA.debugLine="HeadOffice.Text = a.Get(\"name_of_head\")";
Debug.ShouldStop(32);
healthdetail.mostCurrent._headoffice.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_head"))))));
 BA.debugLineNum = 231;BA.debugLine="NumMedical.Text = a.Get(\"number_of_medical_pe";
Debug.ShouldStop(64);
healthdetail.mostCurrent._nummedical.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("number_of_medical_personnel"))))));
 BA.debugLineNum = 232;BA.debugLine="NumNonMedical.Text = a.Get(\"number_of_nonmedi";
Debug.ShouldStop(128);
healthdetail.mostCurrent._numnonmedical.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("number_of_nonmedical_personnel"))))));
 BA.debugLineNum = 233;BA.debugLine="TypeOfHealth.Text = a.Get(\"typeh\")";
Debug.ShouldStop(256);
healthdetail.mostCurrent._typeofhealth.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("typeh"))))));
 BA.debugLineNum = 234;BA.debugLine="StandingYear.Text = a.Get(\"standing_year\")";
Debug.ShouldStop(512);
healthdetail.mostCurrent._standingyear.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("standing_year"))))));
 BA.debugLineNum = 235;BA.debugLine="BuildingArea.Text = a.Get(\"building_area\")";
Debug.ShouldStop(1024);
healthdetail.mostCurrent._buildingarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("building_area"))))));
 BA.debugLineNum = 236;BA.debugLine="LandArea.Text = a.Get(\"land_area\")";
Debug.ShouldStop(2048);
healthdetail.mostCurrent._landarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("land_area"))))));
 BA.debugLineNum = 237;BA.debugLine="ParkingArea.Text = a.Get(\"parking_area\")";
Debug.ShouldStop(4096);
healthdetail.mostCurrent._parkingarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parking_area"))))));
 BA.debugLineNum = 238;BA.debugLine="Electricity.Text = a.Get(\"electricity_capacit";
Debug.ShouldStop(8192);
healthdetail.mostCurrent._electricity.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("electricity_capacity"))))));
 BA.debugLineNum = 239;BA.debugLine="Construction.Text = a.Get(\"constr\")";
Debug.ShouldStop(16384);
healthdetail.mostCurrent._construction.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("constr"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 241;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(65536);
healthdetail.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
}
;
 };
 BA.debugLineNum = 244;BA.debugLine="Job.Release";
Debug.ShouldStop(524288);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 246;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("LblEdit_Click (healthdetail) ","healthdetail",6,healthdetail.mostCurrent.activityBA,healthdetail.mostCurrent,297);
if (RapidSub.canDelegate("lbledit_click")) return b4a.example.healthdetail.remoteMe.runUserSub(false, "healthdetail","lbledit_click");
 BA.debugLineNum = 297;BA.debugLine="Sub LblEdit_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 299;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
healthdetail._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim lat, lng As String";
healthdetail._lat = RemoteObject.createImmutable("");
healthdetail._lng = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _tabhost1_tabchanged() throws Exception{
try {
		Debug.PushSubsStack("TabHost1_TabChanged (healthdetail) ","healthdetail",6,healthdetail.mostCurrent.activityBA,healthdetail.mostCurrent,253);
if (RapidSub.canDelegate("tabhost1_tabchanged")) return b4a.example.healthdetail.remoteMe.runUserSub(false, "healthdetail","tabhost1_tabchanged");
 BA.debugLineNum = 253;BA.debugLine="Sub TabHost1_TabChanged";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 255;BA.debugLine="Select TabHost1.CurrentTab";
Debug.ShouldStop(1073741824);
switch (BA.switchObjectToInt(healthdetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 257;BA.debugLine="WebViewRoute.LoadUrl(Main.Server&\"Health/Route.";
Debug.ShouldStop(1);
healthdetail.mostCurrent._webviewroute.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(healthdetail.mostCurrent._main._server,RemoteObject.createImmutable("Health/Route.php?lat="),healthdetail.mostCurrent._main._lbllat,RemoteObject.createImmutable("&lng="),healthdetail.mostCurrent._main._lbllon,RemoteObject.createImmutable("&latd="),healthdetail._lat,RemoteObject.createImmutable("&lngd="),healthdetail._lng)));
 BA.debugLineNum = 258;BA.debugLine="Msgbox(\"Current tab is \" & TabHost1.CurrentTab,";
Debug.ShouldStop(2);
healthdetail.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Current tab is "),healthdetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),healthdetail.mostCurrent.activityBA);
 BA.debugLineNum = 259;BA.debugLine="Log (\"Button Top :\"&btnRoute.Top)";
Debug.ShouldStop(4);
healthdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Button Top :"),healthdetail.mostCurrent._btnroute.runMethod(true,"getTop"))));
 BA.debugLineNum = 260;BA.debugLine="TabHost1.Height = btnRoute.Top + btnRoute.Heigh";
Debug.ShouldStop(8);
healthdetail.mostCurrent._tabhost1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {healthdetail.mostCurrent._btnroute.runMethod(true,"getTop"),healthdetail.mostCurrent._btnroute.runMethod(true,"getHeight"),healthdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),healthdetail.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 261;BA.debugLine="AddPicture.Visible=False";
Debug.ShouldStop(16);
healthdetail.mostCurrent._addpicture.runMethod(true,"setVisible",healthdetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 262;BA.debugLine="Log(\"tabHost height: \"&TabHost1.Height)";
Debug.ShouldStop(32);
healthdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("tabHost height: "),healthdetail.mostCurrent._tabhost1.runMethod(true,"getHeight"))));
 BA.debugLineNum = 263;BA.debugLine="PanelBuildingList.Height = TabHost1.Height + Ta";
Debug.ShouldStop(64);
healthdetail.mostCurrent._panelbuildinglist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {healthdetail.mostCurrent._tabhost1.runMethod(true,"getHeight"),healthdetail.mostCurrent._tabhost1.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 264;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.He";
Debug.ShouldStop(128);
healthdetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",healthdetail.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 break; }
case 1: {
 BA.debugLineNum = 266;BA.debugLine="CLV1.Clear";
Debug.ShouldStop(512);
healthdetail.mostCurrent._clv1.runVoidMethod ("_clear");
 BA.debugLineNum = 267;BA.debugLine="AddPicture.Visible=False";
Debug.ShouldStop(1024);
healthdetail.mostCurrent._addpicture.runMethod(true,"setVisible",healthdetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 268;BA.debugLine="ProgressDialogShow(\"loading...\")";
Debug.ShouldStop(2048);
healthdetail.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",healthdetail.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("loading..."))));
 BA.debugLineNum = 269;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.health_building_id";
Debug.ShouldStop(4096);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.health_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id ='"),healthdetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("FASILITAS"));
 BA.debugLineNum = 270;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.health_building_id";
Debug.ShouldStop(8192);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT H.health_building_id, H.name_of_health_building, H.building_area, H.land_area, H.parking_area, H.standing_year, H.electricity_capacity, H.address, H.type_of_construction, H.type_of_health_building, H.name_of_head, H.number_of_medical_personnel, H.number_of_nonmedical_personnel,ST_X(ST_Centroid(H.geom)) As longitude, ST_Y(ST_CENTROID(H.geom)) As latitude,	T.name_of_type As constr, J.name_of_type As typeh, ST_AsText(geom) As geom FROM health_building As H LEFT JOIN type_of_construction As T ON H.type_of_construction=T.type_id LEFT JOIN type_of_health_building As J ON H.type_of_health_building=J.type_id	WHERE H.health_building_id='"),healthdetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("DATA"));
 break; }
case 2: {
 BA.debugLineNum = 272;BA.debugLine="AddPicture.Visible=True";
Debug.ShouldStop(32768);
healthdetail.mostCurrent._addpicture.runMethod(true,"setVisible",healthdetail.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 273;BA.debugLine="ProgressDialogShow(\"loading...\")";
Debug.ShouldStop(65536);
healthdetail.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",healthdetail.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("loading..."))));
 BA.debugLineNum = 274;BA.debugLine="ExecuteRemoteQuery(\"SELECT photo_url, upload_da";
Debug.ShouldStop(131072);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT photo_url, upload_date FROM health_building_gallery WHERE health_building_id='"),healthdetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("Download"));
 break; }
}
;
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}