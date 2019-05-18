package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class educationaldetail_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (educationaldetail) ","educationaldetail",5,educationaldetail.mostCurrent.activityBA,educationaldetail.mostCurrent,68);
if (RapidSub.canDelegate("activity_create")) return b4a.example.educationaldetail.remoteMe.runUserSub(false, "educationaldetail","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 68;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(32);
educationaldetail.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),educationaldetail.mostCurrent.activityBA);
 BA.debugLineNum = 71;BA.debugLine="ScrollView1.Panel.LoadLayout(\"EducationalDetail\")";
Debug.ShouldStop(64);
educationaldetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("EducationalDetail")),educationaldetail.mostCurrent.activityBA);
 BA.debugLineNum = 72;BA.debugLine="PanelToolbar.Visible = False";
Debug.ShouldStop(128);
educationaldetail.mostCurrent._paneltoolbar.runMethod(true,"setVisible",educationaldetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 73;BA.debugLine="ScrollView1.Height = 100%y - ScrollView1.Top";
Debug.ShouldStop(256);
educationaldetail.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {educationaldetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),educationaldetail.mostCurrent.activityBA),educationaldetail.mostCurrent._scrollview1.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 74;BA.debugLine="TabHost1.AddTab(\"Map\",\"tabMap\")";
Debug.ShouldStop(512);
educationaldetail.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",educationaldetail.mostCurrent.activityBA,(Object)(BA.ObjectToString("Map")),(Object)(RemoteObject.createImmutable("tabMap")));
 BA.debugLineNum = 75;BA.debugLine="TabHost1.AddTab(\"Detail\",\"Educational_tabDetail\")";
Debug.ShouldStop(1024);
educationaldetail.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",educationaldetail.mostCurrent.activityBA,(Object)(BA.ObjectToString("Detail")),(Object)(RemoteObject.createImmutable("Educational_tabDetail")));
 BA.debugLineNum = 76;BA.debugLine="TabHost1.AddTab(\"Gallery\",\"tabGallery\")";
Debug.ShouldStop(2048);
educationaldetail.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",educationaldetail.mostCurrent.activityBA,(Object)(BA.ObjectToString("Gallery")),(Object)(RemoteObject.createImmutable("tabGallery")));
 BA.debugLineNum = 79;BA.debugLine="BackArrow.Visible= True";
Debug.ShouldStop(16384);
educationaldetail.mostCurrent._backarrow.runMethod(true,"setVisible",educationaldetail.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 80;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(32768);
educationaldetail.mostCurrent._backarrow.runVoidMethod ("SetBackgroundImageNew",(Object)((educationaldetail.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(educationaldetail.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("back-arrow.png"))).getObject())));
 BA.debugLineNum = 81;BA.debugLine="TitleBar.Text=\"Building Detail\"";
Debug.ShouldStop(65536);
educationaldetail.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("Building Detail"));
 BA.debugLineNum = 84;BA.debugLine="AddPicture.Initialize(\"AddPicture\")";
Debug.ShouldStop(524288);
educationaldetail.mostCurrent._addpicture.runVoidMethod ("Initialize",educationaldetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("AddPicture")));
 BA.debugLineNum = 86;BA.debugLine="FunctionAll.CheckBuilding_id(OfficeBuilding.idBui";
Debug.ShouldStop(2097152);
educationaldetail.mostCurrent._functionall.runVoidMethod ("_checkbuilding_id",educationaldetail.mostCurrent.activityBA,(Object)(educationaldetail.mostCurrent._officebuilding._idbuilding));
 BA.debugLineNum = 87;BA.debugLine="ids = FunctionAll.ids";
Debug.ShouldStop(4194304);
educationaldetail.mostCurrent._ids = educationaldetail.mostCurrent._functionall._ids;
 BA.debugLineNum = 88;BA.debugLine="Log(\"DARI SINI\"&ids)";
Debug.ShouldStop(8388608);
educationaldetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DARI SINI"),educationaldetail.mostCurrent._ids)));
 BA.debugLineNum = 90;BA.debugLine="TabHost1.CurrentTab = 1";
Debug.ShouldStop(33554432);
educationaldetail.mostCurrent._tabhost1.runMethodAndSync(true,"setCurrentTab",BA.numberCast(int.class, 1));
 BA.debugLineNum = 91;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Pause (educationaldetail) ","educationaldetail",5,educationaldetail.mostCurrent.activityBA,educationaldetail.mostCurrent,107);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.educationaldetail.remoteMe.runUserSub(false, "educationaldetail","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 107;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="CallSub(Starter, \"ActivityIsPaused\")";
Debug.ShouldStop(2048);
educationaldetail.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",educationaldetail.processBA,(Object)((educationaldetail.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("ActivityIsPaused")));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Activity_Resume (educationaldetail) ","educationaldetail",5,educationaldetail.mostCurrent.activityBA,educationaldetail.mostCurrent,93);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.educationaldetail.remoteMe.runUserSub(false, "educationaldetail","activity_resume");
 BA.debugLineNum = 93;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="CLV1.Clear";
Debug.ShouldStop(536870912);
educationaldetail.mostCurrent._clv1.runVoidMethod ("_clear");
 BA.debugLineNum = 95;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(1073741824);
educationaldetail.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",educationaldetail.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Loading..."))));
 BA.debugLineNum = 96;BA.debugLine="If TabHost1.CurrentTab == 2 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",educationaldetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 97;BA.debugLine="clv.Clear";
Debug.ShouldStop(1);
educationaldetail.mostCurrent._clv.runVoidMethod ("_clear");
 BA.debugLineNum = 98;BA.debugLine="ExecuteRemoteQuery(\"SELECT photo_url, upload_dat";
Debug.ShouldStop(2);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT photo_url, upload_date FROM educational_building_gallery WHERE educational_building_id='"),educationaldetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("Download"));
 }else {
 BA.debugLineNum = 100;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.educational_buildin";
Debug.ShouldStop(8);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.educational_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id ='"),educationaldetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("FASILITAS"));
 BA.debugLineNum = 101;BA.debugLine="ExecuteRemoteQuery(\"SELECT E.educational_buildin";
Debug.ShouldStop(16);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT E.educational_building_id, E.name_of_educational_building, E.building_area, E.land_area, E.parking_area, E.standing_year, E.electricity_capacity, E.address, E.type_of_construction, E.id_level_of_education, E.headmaster_name, E.total_students, E.total_teachers, E.school_type,ST_X(ST_Centroid(E.geom)) As longitude, ST_Y(ST_CENTROID(E.geom)) As latitude, T.name_of_type As constr, L.name_of_level As levels, ST_AsText(geom) As geom FROM educational_building As E	LEFT JOIN type_of_construction As T ON E.type_of_construction=T.type_id	LEFT JOIN level_of_education As L ON E.id_level_of_education=L.level_id	WHERE E.educational_building_id='"),educationaldetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("DATA"));
 };
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("AddPicture_Click (educationaldetail) ","educationaldetail",5,educationaldetail.mostCurrent.activityBA,educationaldetail.mostCurrent,255);
if (RapidSub.canDelegate("addpicture_click")) return b4a.example.educationaldetail.remoteMe.runUserSub(false, "educationaldetail","addpicture_click");
 BA.debugLineNum = 255;BA.debugLine="Sub AddPicture_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 256;BA.debugLine="ToastMessageShow(\"Add photo\",True)";
Debug.ShouldStop(-2147483648);
educationaldetail.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Add photo")),(Object)(educationaldetail.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 257;BA.debugLine="StartActivity(AddPhoto)";
Debug.ShouldStop(1);
educationaldetail.mostCurrent.__c.runVoidMethod ("StartActivity",educationaldetail.processBA,(Object)((educationaldetail.mostCurrent._addphoto.getObject())));
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("BackArrow_Click (educationaldetail) ","educationaldetail",5,educationaldetail.mostCurrent.activityBA,educationaldetail.mostCurrent,300);
if (RapidSub.canDelegate("backarrow_click")) return b4a.example.educationaldetail.remoteMe.runUserSub(false, "educationaldetail","backarrow_click");
 BA.debugLineNum = 300;BA.debugLine="Sub BackArrow_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 301;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
educationaldetail.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 302;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CreateItem (educationaldetail) ","educationaldetail",5,educationaldetail.mostCurrent.activityBA,educationaldetail.mostCurrent,111);
if (RapidSub.canDelegate("createitem")) return b4a.example.educationaldetail.remoteMe.runUserSub(false, "educationaldetail","createitem", _width, _title, _content);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Title", _title);
Debug.locals.put("Content", _content);
 BA.debugLineNum = 111;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(32768);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = educationaldetail._xui.runMethod(false,"CreatePanel",educationaldetail.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 113;BA.debugLine="p.LoadLayout(\"facility_list\")";
Debug.ShouldStop(65536);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("facility_list")),educationaldetail.mostCurrent.activityBA);
 BA.debugLineNum = 114;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, 5%y)";
Debug.ShouldStop(131072);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(educationaldetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),educationaldetail.mostCurrent.activityBA)));
 BA.debugLineNum = 115;BA.debugLine="numfc.Text = Title";
Debug.ShouldStop(262144);
educationaldetail.mostCurrent._numfc.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 116;BA.debugLine="namefc.Text = Content";
Debug.ShouldStop(524288);
educationaldetail.mostCurrent._namefc.runMethod(true,"setText",BA.ObjectToCharSequence(_content));
 BA.debugLineNum = 117;BA.debugLine="Return p";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("editBtn_Click (educationaldetail) ","educationaldetail",5,educationaldetail.mostCurrent.activityBA,educationaldetail.mostCurrent,304);
if (RapidSub.canDelegate("editbtn_click")) return b4a.example.educationaldetail.remoteMe.runUserSub(false, "educationaldetail","editbtn_click");
 BA.debugLineNum = 304;BA.debugLine="Sub editBtn_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 305;BA.debugLine="StartActivity(EducationalEdit)";
Debug.ShouldStop(65536);
educationaldetail.mostCurrent.__c.runVoidMethod ("StartActivity",educationaldetail.processBA,(Object)((educationaldetail.mostCurrent._educationaledit.getObject())));
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("editFacility_Click (educationaldetail) ","educationaldetail",5,educationaldetail.mostCurrent.activityBA,educationaldetail.mostCurrent,308);
if (RapidSub.canDelegate("editfacility_click")) return b4a.example.educationaldetail.remoteMe.runUserSub(false, "educationaldetail","editfacility_click");
 BA.debugLineNum = 308;BA.debugLine="Sub editFacility_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 309;BA.debugLine="StartActivity(EditBuildingFacility)";
Debug.ShouldStop(1048576);
educationaldetail.mostCurrent.__c.runVoidMethod ("StartActivity",educationaldetail.processBA,(Object)((educationaldetail.mostCurrent._editbuildingfacility.getObject())));
 BA.debugLineNum = 310;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("ExecuteRemoteQuery (educationaldetail) ","educationaldetail",5,educationaldetail.mostCurrent.activityBA,educationaldetail.mostCurrent,120);
if (RapidSub.canDelegate("executeremotequery")) return b4a.example.educationaldetail.remoteMe.runUserSub(false, "educationaldetail","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 120;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(16777216);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 122;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(33554432);
_job.runVoidMethod ("_initialize",educationaldetail.processBA,(Object)(_jobname),(Object)(educationaldetail.getObject()));
 BA.debugLineNum = 123;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
Debug.ShouldStop(67108864);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),educationaldetail.mostCurrent._main._server,RemoteObject.createImmutable("mobile/json.php"))),(Object)(_query));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Dim ScrollImage As ScrollView";
educationaldetail.mostCurrent._scrollimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim clv As CustomListView";
educationaldetail.mostCurrent._clv = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 20;BA.debugLine="Dim Label1 As Label";
educationaldetail.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim ImageView1 As ImageView";
educationaldetail.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim ImageViews As List";
educationaldetail.mostCurrent._imageviews = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 24;BA.debugLine="Dim menu As ArcMenu";
educationaldetail.mostCurrent._menu = RemoteObject.createNew ("b4a.example.arcmenu");
 //BA.debugLineNum = 25;BA.debugLine="Dim menuButtonStatic, menuButtonAnimated As Bitma";
educationaldetail.mostCurrent._menubuttonstatic = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
educationaldetail.mostCurrent._menubuttonanimated = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private CLV1 As CustomListView";
educationaldetail.mostCurrent._clv1 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 27;BA.debugLine="Private ScrollView1 As ScrollView";
educationaldetail.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private TitleBar As Label";
educationaldetail.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private BackArrow As Label";
educationaldetail.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private PanelBuildingList As Panel";
educationaldetail.mostCurrent._panelbuildinglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private numfc As B4XView";
educationaldetail.mostCurrent._numfc = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private namefc As B4XView";
educationaldetail.mostCurrent._namefc = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private PFacility As Panel";
educationaldetail.mostCurrent._pfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private ListItem As Panel";
educationaldetail.mostCurrent._listitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private PanelButton As Panel";
educationaldetail.mostCurrent._panelbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private Panel4 As Panel";
educationaldetail.mostCurrent._panel4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Dim TabHost1 As TabHost";
educationaldetail.mostCurrent._tabhost1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabHostWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Dim bmp1, bmp2 As Bitmap";
educationaldetail.mostCurrent._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
educationaldetail.mostCurrent._bmp2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private StandingYear As Label";
educationaldetail.mostCurrent._standingyear = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private BuildingArea As Label";
educationaldetail.mostCurrent._buildingarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private LandArea As Label";
educationaldetail.mostCurrent._landarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private ParkingArea As Label";
educationaldetail.mostCurrent._parkingarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private Electricity As Label";
educationaldetail.mostCurrent._electricity = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private Construction As Label";
educationaldetail.mostCurrent._construction = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Dim EducationName As Label";
educationaldetail.mostCurrent._educationname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private TypeOfEducation As Label";
educationaldetail.mostCurrent._typeofeducation = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private SchoolLevel As Label";
educationaldetail.mostCurrent._schoollevel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private Headmaster As Label";
educationaldetail.mostCurrent._headmaster = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private NumTeacher As Label";
educationaldetail.mostCurrent._numteacher = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private NumStudent As Label";
educationaldetail.mostCurrent._numstudent = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private PanelToolbar As Panel";
educationaldetail.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private LblFacility As Label";
educationaldetail.mostCurrent._lblfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Dim ids As String";
educationaldetail.mostCurrent._ids = RemoteObject.createImmutable("");
 //BA.debugLineNum = 56;BA.debugLine="Private PanelMap As Panel";
educationaldetail.mostCurrent._panelmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private btnRoute As Button";
educationaldetail.mostCurrent._btnroute = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private WebViewRoute As WebView";
educationaldetail.mostCurrent._webviewroute = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private editBtn As Button";
educationaldetail.mostCurrent._editbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private editFacility As Button";
educationaldetail.mostCurrent._editfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private PanelGallery As Panel";
educationaldetail.mostCurrent._panelgallery = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private AddPicture As Button";
educationaldetail.mostCurrent._addpicture = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imageview1_click() throws Exception{
try {
		Debug.PushSubsStack("ImageView1_Click (educationaldetail) ","educationaldetail",5,educationaldetail.mostCurrent.activityBA,educationaldetail.mostCurrent,287);
if (RapidSub.canDelegate("imageview1_click")) return b4a.example.educationaldetail.remoteMe.runUserSub(false, "educationaldetail","imageview1_click");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _bd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 287;BA.debugLine="Sub ImageView1_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 288;BA.debugLine="Dim iv As ImageView";
Debug.ShouldStop(-2147483648);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 289;BA.debugLine="iv = Sender";
Debug.ShouldStop(1);
_iv.setObject(educationaldetail.mostCurrent.__c.runMethod(false,"Sender",educationaldetail.mostCurrent.activityBA));
 BA.debugLineNum = 290;BA.debugLine="If iv.Background Is BitmapDrawable Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("i",_iv.runMethod(false,"getBackground"), RemoteObject.createImmutable("android.graphics.drawable.BitmapDrawable"))) { 
 BA.debugLineNum = 292;BA.debugLine="Dim bd As BitmapDrawable";
Debug.ShouldStop(8);
_bd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bd", _bd);
 BA.debugLineNum = 293;BA.debugLine="bd = iv.Background";
Debug.ShouldStop(16);
_bd.setObject(_iv.runMethod(false,"getBackground"));
 BA.debugLineNum = 294;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(32);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 295;BA.debugLine="bmp = bd.Bitmap";
Debug.ShouldStop(64);
_bmp.setObject(_bd.runMethod(false,"getBitmap"));
 BA.debugLineNum = 296;BA.debugLine="CallSubDelayed2(ShowImage, \"Show\", bmp)";
Debug.ShouldStop(128);
educationaldetail.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",educationaldetail.processBA,(Object)((educationaldetail.mostCurrent._showimage.getObject())),(Object)(BA.ObjectToString("Show")),(Object)((_bmp)));
 };
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("JobDone (educationaldetail) ","educationaldetail",5,educationaldetail.mostCurrent.activityBA,educationaldetail.mostCurrent,126);
if (RapidSub.canDelegate("jobdone")) return b4a.example.educationaldetail.remoteMe.runUserSub(false, "educationaldetail","jobdone", _job);
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
 BA.debugLineNum = 126;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(1073741824);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 128;BA.debugLine="Dim res As String";
Debug.ShouldStop(-2147483648);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 129;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(1);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 130;BA.debugLine="Log(\"Response:\"& res)";
Debug.ShouldStop(2);
educationaldetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response:"),_res)));
 BA.debugLineNum = 131;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(4);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 132;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(8);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 133;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(16);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("Download"),BA.ObjectToString("FASILITAS"),BA.ObjectToString("DATA"))) {
case 0: {
 BA.debugLineNum = 136;BA.debugLine="Dim agn As List";
Debug.ShouldStop(128);
_agn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 137;BA.debugLine="agn=parser.NextArray";
Debug.ShouldStop(256);
_agn = _parser.runMethod(false,"NextArray");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 138;BA.debugLine="If agn.Size - 1 < 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 139;BA.debugLine="Log(agn.Size)";
Debug.ShouldStop(1024);
educationaldetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_agn.runMethod(true,"getSize"))));
 BA.debugLineNum = 140;BA.debugLine="Dim NotFound As Label";
Debug.ShouldStop(2048);
_notfound = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("NotFound", _notfound);
 BA.debugLineNum = 141;BA.debugLine="NotFound.Initialize(\"\")";
Debug.ShouldStop(4096);
_notfound.runVoidMethod ("Initialize",educationaldetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 142;BA.debugLine="PanelGallery.Color= Colors.White";
Debug.ShouldStop(8192);
educationaldetail.mostCurrent._panelgallery.runVoidMethod ("setColor",educationaldetail.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 143;BA.debugLine="PanelGallery.AddView(NotFound,0,0,100%x,70%y)";
Debug.ShouldStop(16384);
educationaldetail.mostCurrent._panelgallery.runVoidMethod ("AddView",(Object)((_notfound.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(educationaldetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),educationaldetail.mostCurrent.activityBA)),(Object)(educationaldetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),educationaldetail.mostCurrent.activityBA)));
 BA.debugLineNum = 144;BA.debugLine="NotFound.Text = \"Picture doesn't exist\"";
Debug.ShouldStop(32768);
_notfound.runMethod(true,"setText",BA.ObjectToCharSequence("Picture doesn't exist"));
 BA.debugLineNum = 145;BA.debugLine="NotFound.TextSize = 15";
Debug.ShouldStop(65536);
_notfound.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 146;BA.debugLine="NotFound.Gravity = Gravity.CENTER";
Debug.ShouldStop(131072);
_notfound.runMethod(true,"setGravity",educationaldetail.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 147;BA.debugLine="PanelGallery.Height = NotFound.Height";
Debug.ShouldStop(262144);
educationaldetail.mostCurrent._panelgallery.runMethod(true,"setHeight",_notfound.runMethod(true,"getHeight"));
 BA.debugLineNum = 148;BA.debugLine="TabHost1.Height = PanelGallery.Height";
Debug.ShouldStop(524288);
educationaldetail.mostCurrent._tabhost1.runMethod(true,"setHeight",educationaldetail.mostCurrent._panelgallery.runMethod(true,"getHeight"));
 BA.debugLineNum = 149;BA.debugLine="Msgbox(\"Galery Foto tidak ditemukan\", \"Pering";
Debug.ShouldStop(1048576);
educationaldetail.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Galery Foto tidak ditemukan")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Peringatan"))),educationaldetail.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 151;BA.debugLine="ScrollImage.Initialize(100%y)";
Debug.ShouldStop(4194304);
educationaldetail.mostCurrent._scrollimage.runVoidMethod ("Initialize",educationaldetail.mostCurrent.activityBA,(Object)(educationaldetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),educationaldetail.mostCurrent.activityBA)));
 BA.debugLineNum = 152;BA.debugLine="PanelGallery.AddView(ScrollImage,0,0,100%x,10";
Debug.ShouldStop(8388608);
educationaldetail.mostCurrent._panelgallery.runVoidMethod ("AddView",(Object)((educationaldetail.mostCurrent._scrollimage.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(educationaldetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),educationaldetail.mostCurrent.activityBA)),(Object)(educationaldetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),educationaldetail.mostCurrent.activityBA)));
 BA.debugLineNum = 153;BA.debugLine="ScrollImage.Panel.LoadLayout(\"LoaderImage\")";
Debug.ShouldStop(16777216);
educationaldetail.mostCurrent._scrollimage.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LoaderImage")),educationaldetail.mostCurrent.activityBA);
 BA.debugLineNum = 154;BA.debugLine="For i=0 To agn.Size-1";
Debug.ShouldStop(33554432);
{
final int step27 = 1;
final int limit27 = RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27) ;_i = ((int)(0 + _i + step27))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 155;BA.debugLine="Dim w As Map";
Debug.ShouldStop(67108864);
_w = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("w", _w);
 BA.debugLineNum = 156;BA.debugLine="w=agn.Get(i)";
Debug.ShouldStop(134217728);
_w.setObject(_agn.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 157;BA.debugLine="Dim image = w.Get(\"photo_url\") As String";
Debug.ShouldStop(268435456);
_image = BA.ObjectToString(_w.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_url")))));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 158;BA.debugLine="Dim gambar = \"\"&Main.Server&\"Files/Education";
Debug.ShouldStop(536870912);
_gambar = RemoteObject.concat(RemoteObject.createImmutable(""),educationaldetail.mostCurrent._main._server,RemoteObject.createImmutable("Files/Educational/img/"),_image);Debug.locals.put("gambar", _gambar);Debug.locals.put("gambar", _gambar);
 BA.debugLineNum = 159;BA.debugLine="Dim m As Map";
Debug.ShouldStop(1073741824);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 160;BA.debugLine="m.Initialize";
Debug.ShouldStop(-2147483648);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 161;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(1);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 162;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(2);
_p.runVoidMethod ("Initialize",educationaldetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 163;BA.debugLine="p.SetLayout(0,0,100%x,20%y)";
Debug.ShouldStop(4);
_p.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(educationaldetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),educationaldetail.mostCurrent.activityBA)),(Object)(educationaldetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),educationaldetail.mostCurrent.activityBA)));
 BA.debugLineNum = 164;BA.debugLine="p.LoadLayout(\"listitem-image\")";
Debug.ShouldStop(8);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("listitem-image")),educationaldetail.mostCurrent.activityBA);
 BA.debugLineNum = 165;BA.debugLine="clv.Add(p,m)";
Debug.ShouldStop(16);
educationaldetail.mostCurrent._clv.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()),(Object)((_m.getObject())));
 BA.debugLineNum = 166;BA.debugLine="m.Put(ImageView1, gambar)";
Debug.ShouldStop(32);
_m.runVoidMethod ("Put",(Object)((educationaldetail.mostCurrent._imageview1.getObject())),(Object)((_gambar)));
 BA.debugLineNum = 167;BA.debugLine="Log (gambar)";
Debug.ShouldStop(64);
educationaldetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(_gambar));
 BA.debugLineNum = 168;BA.debugLine="CallSubDelayed2(Starter, \"Download\", m)";
Debug.ShouldStop(128);
educationaldetail.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",educationaldetail.processBA,(Object)((educationaldetail.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_m)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 170;BA.debugLine="ScrollView1.Height = 100%y - ScrollView1.Top";
Debug.ShouldStop(512);
educationaldetail.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {educationaldetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),educationaldetail.mostCurrent.activityBA),educationaldetail.mostCurrent._scrollview1.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 171;BA.debugLine="ScrollImage.Panel.Height = (ImageView1.Height";
Debug.ShouldStop(1024);
educationaldetail.mostCurrent._scrollimage.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {educationaldetail.mostCurrent._imageview1.runMethod(true,"getHeight"),educationaldetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),educationaldetail.mostCurrent.activityBA)}, "+",1, 1)),_agn.runMethod(true,"getSize")}, "*",0, 1));
 BA.debugLineNum = 172;BA.debugLine="ScrollImage.Height = 70%y";
Debug.ShouldStop(2048);
educationaldetail.mostCurrent._scrollimage.runMethod(true,"setHeight",educationaldetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),educationaldetail.mostCurrent.activityBA));
 BA.debugLineNum = 173;BA.debugLine="PanelGallery.Height = ScrollImage.Height";
Debug.ShouldStop(4096);
educationaldetail.mostCurrent._panelgallery.runMethod(true,"setHeight",educationaldetail.mostCurrent._scrollimage.runMethod(true,"getHeight"));
 BA.debugLineNum = 174;BA.debugLine="TabHost1.Height = ScrollImage.Height";
Debug.ShouldStop(8192);
educationaldetail.mostCurrent._tabhost1.runMethod(true,"setHeight",educationaldetail.mostCurrent._scrollimage.runMethod(true,"getHeight"));
 };
 BA.debugLineNum = 176;BA.debugLine="AddPicture.RemoveView";
Debug.ShouldStop(32768);
educationaldetail.mostCurrent._addpicture.runVoidMethod ("RemoveView");
 BA.debugLineNum = 177;BA.debugLine="PanelBuildingList.AddView(AddPicture,0, TabHos";
Debug.ShouldStop(65536);
educationaldetail.mostCurrent._panelbuildinglist.runVoidMethod ("AddView",(Object)((educationaldetail.mostCurrent._addpicture.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {educationaldetail.mostCurrent._tabhost1.runMethod(true,"getHeight"),educationaldetail.mostCurrent._tabhost1.runMethod(true,"getTop")}, "+",1, 1)),(Object)(educationaldetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),educationaldetail.mostCurrent.activityBA)),(Object)(educationaldetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),educationaldetail.mostCurrent.activityBA)));
 BA.debugLineNum = 178;BA.debugLine="PanelBuildingList.Height = AddPicture.Top + Ad";
Debug.ShouldStop(131072);
educationaldetail.mostCurrent._panelbuildinglist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {educationaldetail.mostCurrent._addpicture.runMethod(true,"getTop"),educationaldetail.mostCurrent._addpicture.runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 179;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.H";
Debug.ShouldStop(262144);
educationaldetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",educationaldetail.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 BA.debugLineNum = 180;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(524288);
educationaldetail.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 1: {
 BA.debugLineNum = 183;BA.debugLine="Dim fasilitas_array As List";
Debug.ShouldStop(4194304);
_fasilitas_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("fasilitas_array", _fasilitas_array);
 BA.debugLineNum = 184;BA.debugLine="fasilitas_array = parser.NextArray";
Debug.ShouldStop(8388608);
_fasilitas_array = _parser.runMethod(false,"NextArray");Debug.locals.put("fasilitas_array", _fasilitas_array);
 BA.debugLineNum = 185;BA.debugLine="If fasilitas_array.Size-1 < 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_fasilitas_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 186;BA.debugLine="CLV1.AsView.Visible= False";
Debug.ShouldStop(33554432);
educationaldetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"setVisible",educationaldetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 187;BA.debugLine="Dim NotExist As Label";
Debug.ShouldStop(67108864);
_notexist = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("NotExist", _notexist);
 BA.debugLineNum = 188;BA.debugLine="NotExist.Initialize(\"\")";
Debug.ShouldStop(134217728);
_notexist.runVoidMethod ("Initialize",educationaldetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 189;BA.debugLine="PFacility.AddView(NotExist,LblFacility.Left,0";
Debug.ShouldStop(268435456);
educationaldetail.mostCurrent._pfacility.runVoidMethod ("AddView",(Object)((_notexist.getObject())),(Object)(educationaldetail.mostCurrent._lblfacility.runMethod(true,"getLeft")),(Object)(BA.numberCast(int.class, 0)),(Object)(educationaldetail.mostCurrent._lblfacility.runMethod(true,"getWidth")),(Object)(educationaldetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),educationaldetail.mostCurrent.activityBA)));
 BA.debugLineNum = 190;BA.debugLine="NotExist.Gravity= Gravity.CENTER";
Debug.ShouldStop(536870912);
_notexist.runMethod(true,"setGravity",educationaldetail.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 191;BA.debugLine="NotExist.Text=\"Facility doesn't not exist.\"";
Debug.ShouldStop(1073741824);
_notexist.runMethod(true,"setText",BA.ObjectToCharSequence("Facility doesn't not exist."));
 BA.debugLineNum = 192;BA.debugLine="Select TabHost1.CurrentTab";
Debug.ShouldStop(-2147483648);
switch (BA.switchObjectToInt(educationaldetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 194;BA.debugLine="PFacility.Height= NotExist.Height + NotExis";
Debug.ShouldStop(2);
educationaldetail.mostCurrent._pfacility.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_notexist.runMethod(true,"getHeight"),_notexist.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 195;BA.debugLine="TabHost1.Height = PFacility.Top+PFacility.H";
Debug.ShouldStop(4);
educationaldetail.mostCurrent._tabhost1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {educationaldetail.mostCurrent._pfacility.runMethod(true,"getTop"),educationaldetail.mostCurrent._pfacility.runMethod(true,"getHeight")}, "+",1, 1));
 break; }
}
;
 }else {
 BA.debugLineNum = 198;BA.debugLine="For i=0 To fasilitas_array.Size - 1";
Debug.ShouldStop(32);
{
final int step70 = 1;
final int limit70 = RemoteObject.solve(new RemoteObject[] {_fasilitas_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step70 > 0 && _i <= limit70) || (step70 < 0 && _i >= limit70) ;_i = ((int)(0 + _i + step70))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 199;BA.debugLine="Dim a As Map";
Debug.ShouldStop(64);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 200;BA.debugLine="a = fasilitas_array.Get(i)";
Debug.ShouldStop(128);
_a.setObject(_fasilitas_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 202;BA.debugLine="Dim content As String = a.Get(\"name_of_facili";
Debug.ShouldStop(512);
_content = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_facility")))));Debug.locals.put("content", _content);Debug.locals.put("content", _content);
 BA.debugLineNum = 203;BA.debugLine="Dim quantity As Int = a.Get(\"quantity_of_faci";
Debug.ShouldStop(1024);
_quantity = BA.numberCast(int.class, _a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("quantity_of_facilities")))));Debug.locals.put("quantity", _quantity);Debug.locals.put("quantity", _quantity);
 BA.debugLineNum = 204;BA.debugLine="CLV1.Add(CreateItem(CLV1.AsView.Width, $\"${qu";
Debug.ShouldStop(2048);
educationaldetail.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(educationaldetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getWidth"),(RemoteObject.concat(RemoteObject.createImmutable(""),educationaldetail.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_quantity))),RemoteObject.createImmutable(""))),_content).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 205;BA.debugLine="CLV1.AsView.Height = ListItem.Height*(i+1)";
Debug.ShouldStop(4096);
educationaldetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {educationaldetail.mostCurrent._listitem.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))}, "*",0, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 207;BA.debugLine="Dim sv As ScrollView";
Debug.ShouldStop(16384);
_sv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");Debug.locals.put("sv", _sv);
 BA.debugLineNum = 208;BA.debugLine="CLV1.sv.Height = CLV1.AsView.Height";
Debug.ShouldStop(32768);
educationaldetail.mostCurrent._clv1.getField(false,"_sv").runMethod(true,"setHeight",educationaldetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 209;BA.debugLine="PFacility.Height = LblFacility.Height + LblFac";
Debug.ShouldStop(65536);
educationaldetail.mostCurrent._pfacility.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {educationaldetail.mostCurrent._lblfacility.runMethod(true,"getHeight"),educationaldetail.mostCurrent._lblfacility.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 210;BA.debugLine="PFacility.Height = PFacility.Height + CLV1.sv.";
Debug.ShouldStop(131072);
educationaldetail.mostCurrent._pfacility.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {educationaldetail.mostCurrent._pfacility.runMethod(true,"getHeight"),educationaldetail.mostCurrent._clv1.getField(false,"_sv").runMethod(true,"getHeight"),educationaldetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getTop")}, "++",2, 1));
 BA.debugLineNum = 211;BA.debugLine="Select TabHost1.CurrentTab";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(educationaldetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 213;BA.debugLine="TabHost1.Height = PFacility.Top+PFacility.He";
Debug.ShouldStop(1048576);
educationaldetail.mostCurrent._tabhost1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {educationaldetail.mostCurrent._pfacility.runMethod(true,"getTop"),educationaldetail.mostCurrent._pfacility.runMethod(true,"getHeight"),educationaldetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),educationaldetail.mostCurrent.activityBA)}, "++",2, 1));
 break; }
}
;
 };
 BA.debugLineNum = 216;BA.debugLine="PanelBuildingList.Height = TabHost1.Height + T";
Debug.ShouldStop(8388608);
educationaldetail.mostCurrent._panelbuildinglist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {educationaldetail.mostCurrent._tabhost1.runMethod(true,"getHeight"),educationaldetail.mostCurrent._tabhost1.runMethod(true,"getTop"),educationaldetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),educationaldetail.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 217;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.H";
Debug.ShouldStop(16777216);
educationaldetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",educationaldetail.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 BA.debugLineNum = 218;BA.debugLine="Log(content)";
Debug.ShouldStop(33554432);
educationaldetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(_content));
 BA.debugLineNum = 219;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(67108864);
educationaldetail.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 2: {
 BA.debugLineNum = 222;BA.debugLine="Dim data_array As List";
Debug.ShouldStop(536870912);
_data_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 223;BA.debugLine="data_array = parser.NextArray";
Debug.ShouldStop(1073741824);
_data_array = _parser.runMethod(false,"NextArray");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 224;BA.debugLine="For i=0 To data_array.Size -1";
Debug.ShouldStop(-2147483648);
{
final int step94 = 1;
final int limit94 = RemoteObject.solve(new RemoteObject[] {_data_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step94 > 0 && _i <= limit94) || (step94 < 0 && _i >= limit94) ;_i = ((int)(0 + _i + step94))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 225;BA.debugLine="Dim a As Map";
Debug.ShouldStop(1);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 226;BA.debugLine="a = data_array.Get(i)";
Debug.ShouldStop(2);
_a.setObject(_data_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 227;BA.debugLine="lat = a.Get(\"latitude\")";
Debug.ShouldStop(4);
educationaldetail._lat = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("latitude")))));
 BA.debugLineNum = 228;BA.debugLine="lng = a.Get(\"longitude\")";
Debug.ShouldStop(8);
educationaldetail._lng = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("longitude")))));
 BA.debugLineNum = 229;BA.debugLine="Log(lat)";
Debug.ShouldStop(16);
educationaldetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(educationaldetail._lat));
 BA.debugLineNum = 230;BA.debugLine="Log(lng)";
Debug.ShouldStop(32);
educationaldetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(educationaldetail._lng));
 BA.debugLineNum = 232;BA.debugLine="EducationName.Text = a.Get(\"name_of_education";
Debug.ShouldStop(128);
educationaldetail.mostCurrent._educationname.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_educational_building"))))));
 BA.debugLineNum = 233;BA.debugLine="SchoolLevel.Text = a.Get(\"levels\")";
Debug.ShouldStop(256);
educationaldetail.mostCurrent._schoollevel.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("levels"))))));
 BA.debugLineNum = 234;BA.debugLine="Log(\"Level sekolah: \"&SchoolLevel.Text)";
Debug.ShouldStop(512);
educationaldetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Level sekolah: "),educationaldetail.mostCurrent._schoollevel.runMethod(true,"getText"))));
 BA.debugLineNum = 235;BA.debugLine="Headmaster.Text = a.Get(\"headmaster_name\")";
Debug.ShouldStop(1024);
educationaldetail.mostCurrent._headmaster.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("headmaster_name"))))));
 BA.debugLineNum = 236;BA.debugLine="NumTeacher.Text = a.Get(\"total_teachers\")";
Debug.ShouldStop(2048);
educationaldetail.mostCurrent._numteacher.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_teachers"))))));
 BA.debugLineNum = 237;BA.debugLine="NumStudent.Text = a.Get(\"total_students\")";
Debug.ShouldStop(4096);
educationaldetail.mostCurrent._numstudent.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_students"))))));
 BA.debugLineNum = 238;BA.debugLine="StandingYear.Text = a.Get(\"standing_year\")";
Debug.ShouldStop(8192);
educationaldetail.mostCurrent._standingyear.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("standing_year"))))));
 BA.debugLineNum = 239;BA.debugLine="BuildingArea.Text = a.Get(\"building_area\")";
Debug.ShouldStop(16384);
educationaldetail.mostCurrent._buildingarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("building_area"))))));
 BA.debugLineNum = 240;BA.debugLine="LandArea.Text = a.Get(\"land_area\")";
Debug.ShouldStop(32768);
educationaldetail.mostCurrent._landarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("land_area"))))));
 BA.debugLineNum = 241;BA.debugLine="ParkingArea.Text = a.Get(\"parking_area\")";
Debug.ShouldStop(65536);
educationaldetail.mostCurrent._parkingarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parking_area"))))));
 BA.debugLineNum = 242;BA.debugLine="Electricity.Text = a.Get(\"electricity_capacit";
Debug.ShouldStop(131072);
educationaldetail.mostCurrent._electricity.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("electricity_capacity"))))));
 BA.debugLineNum = 243;BA.debugLine="Construction.Text = a.Get(\"constr\")";
Debug.ShouldStop(262144);
educationaldetail.mostCurrent._construction.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("constr"))))));
 BA.debugLineNum = 244;BA.debugLine="If a.Get(\"school_type\") == Null Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("n",_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("school_type")))))) { 
 BA.debugLineNum = 245;BA.debugLine="TypeOfEducation.Text = \"Private School\"";
Debug.ShouldStop(1048576);
educationaldetail.mostCurrent._typeofeducation.runMethod(true,"setText",BA.ObjectToCharSequence("Private School"));
 }else {
 BA.debugLineNum = 247;BA.debugLine="TypeOfEducation.Text = \"Public School\"";
Debug.ShouldStop(4194304);
educationaldetail.mostCurrent._typeofeducation.runMethod(true,"setText",BA.ObjectToCharSequence("Public School"));
 };
 }
}Debug.locals.put("i", _i);
;
 break; }
}
;
 };
 BA.debugLineNum = 252;BA.debugLine="Job.Release";
Debug.ShouldStop(134217728);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
educationaldetail._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim lat, lng As String";
educationaldetail._lat = RemoteObject.createImmutable("");
educationaldetail._lng = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Private links As List";
educationaldetail._links = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _tabhost1_tabchanged() throws Exception{
try {
		Debug.PushSubsStack("TabHost1_TabChanged (educationaldetail) ","educationaldetail",5,educationaldetail.mostCurrent.activityBA,educationaldetail.mostCurrent,260);
if (RapidSub.canDelegate("tabhost1_tabchanged")) return b4a.example.educationaldetail.remoteMe.runUserSub(false, "educationaldetail","tabhost1_tabchanged");
 BA.debugLineNum = 260;BA.debugLine="Sub TabHost1_TabChanged";
Debug.ShouldStop(8);
 BA.debugLineNum = 262;BA.debugLine="Select TabHost1.CurrentTab";
Debug.ShouldStop(32);
switch (BA.switchObjectToInt(educationaldetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 264;BA.debugLine="WebViewRoute.LoadUrl(Main.Server&\"Educational/R";
Debug.ShouldStop(128);
educationaldetail.mostCurrent._webviewroute.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(educationaldetail.mostCurrent._main._server,RemoteObject.createImmutable("Educational/Route.php?lat="),educationaldetail.mostCurrent._main._lbllat,RemoteObject.createImmutable("&lng="),educationaldetail.mostCurrent._main._lbllon,RemoteObject.createImmutable("&latd="),educationaldetail._lat,RemoteObject.createImmutable("&lngd="),educationaldetail._lng)));
 BA.debugLineNum = 265;BA.debugLine="Msgbox(\"Current tab is \" & TabHost1.CurrentTab,";
Debug.ShouldStop(256);
educationaldetail.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Current tab is "),educationaldetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),educationaldetail.mostCurrent.activityBA);
 BA.debugLineNum = 266;BA.debugLine="Log (\"Button Top :\"&btnRoute.Top)";
Debug.ShouldStop(512);
educationaldetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Button Top :"),educationaldetail.mostCurrent._btnroute.runMethod(true,"getTop"))));
 BA.debugLineNum = 267;BA.debugLine="TabHost1.Height = btnRoute.Top + btnRoute.Heigh";
Debug.ShouldStop(1024);
educationaldetail.mostCurrent._tabhost1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {educationaldetail.mostCurrent._btnroute.runMethod(true,"getTop"),educationaldetail.mostCurrent._btnroute.runMethod(true,"getHeight"),educationaldetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),educationaldetail.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 268;BA.debugLine="AddPicture.Visible=False";
Debug.ShouldStop(2048);
educationaldetail.mostCurrent._addpicture.runMethod(true,"setVisible",educationaldetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 269;BA.debugLine="Log(\"tabHost height: \"&TabHost1.Height)";
Debug.ShouldStop(4096);
educationaldetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("tabHost height: "),educationaldetail.mostCurrent._tabhost1.runMethod(true,"getHeight"))));
 BA.debugLineNum = 270;BA.debugLine="PanelBuildingList.Height = TabHost1.Height + Ta";
Debug.ShouldStop(8192);
educationaldetail.mostCurrent._panelbuildinglist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {educationaldetail.mostCurrent._tabhost1.runMethod(true,"getHeight"),educationaldetail.mostCurrent._tabhost1.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 271;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.He";
Debug.ShouldStop(16384);
educationaldetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",educationaldetail.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 break; }
case 1: {
 BA.debugLineNum = 273;BA.debugLine="CLV1.Clear";
Debug.ShouldStop(65536);
educationaldetail.mostCurrent._clv1.runVoidMethod ("_clear");
 BA.debugLineNum = 274;BA.debugLine="AddPicture.Visible=False";
Debug.ShouldStop(131072);
educationaldetail.mostCurrent._addpicture.runMethod(true,"setVisible",educationaldetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 275;BA.debugLine="ProgressDialogShow(\"loading...\")";
Debug.ShouldStop(262144);
educationaldetail.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",educationaldetail.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("loading..."))));
 BA.debugLineNum = 276;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.educational_buildi";
Debug.ShouldStop(524288);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.educational_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id ='"),educationaldetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("FASILITAS"));
 BA.debugLineNum = 277;BA.debugLine="ExecuteRemoteQuery(\"SELECT E.educational_buildi";
Debug.ShouldStop(1048576);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT E.educational_building_id, E.name_of_educational_building, E.building_area, E.land_area, E.parking_area, E.standing_year, E.electricity_capacity, E.address, E.type_of_construction, E.id_level_of_education, E.headmaster_name, E.total_students, E.total_teachers, E.school_type,ST_X(ST_Centroid(E.geom)) As longitude, ST_Y(ST_CENTROID(E.geom)) As latitude, T.name_of_type As constr, L.name_of_level As levels, ST_AsText(geom) As geom FROM educational_building As E	LEFT JOIN type_of_construction As T ON E.type_of_construction=T.type_id	LEFT JOIN level_of_education As L ON E.id_level_of_education=L.level_id	WHERE E.educational_building_id='"),educationaldetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("DATA"));
 break; }
case 2: {
 BA.debugLineNum = 280;BA.debugLine="AddPicture.Visible=True";
Debug.ShouldStop(8388608);
educationaldetail.mostCurrent._addpicture.runMethod(true,"setVisible",educationaldetail.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 281;BA.debugLine="ProgressDialogShow(\"loading...\")";
Debug.ShouldStop(16777216);
educationaldetail.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",educationaldetail.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("loading..."))));
 BA.debugLineNum = 282;BA.debugLine="ExecuteRemoteQuery(\"SELECT photo_url, upload_da";
Debug.ShouldStop(33554432);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT photo_url, upload_date FROM educational_building_gallery WHERE educational_building_id='"),educationaldetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("Download"));
 break; }
}
;
 BA.debugLineNum = 285;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}