package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class worshipdetail_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (worshipdetail) ","worshipdetail",9,worshipdetail.mostCurrent.activityBA,worshipdetail.mostCurrent,60);
if (RapidSub.canDelegate("activity_create")) return b4a.example.worshipdetail.remoteMe.runUserSub(false, "worshipdetail","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 60;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 62;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(536870912);
worshipdetail.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),worshipdetail.mostCurrent.activityBA);
 BA.debugLineNum = 63;BA.debugLine="ScrollView1.Panel.LoadLayout(\"WorshipDetail\")";
Debug.ShouldStop(1073741824);
worshipdetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("WorshipDetail")),worshipdetail.mostCurrent.activityBA);
 BA.debugLineNum = 64;BA.debugLine="ScrollView1.Height = 100%y - ScrollView1.Top";
Debug.ShouldStop(-2147483648);
worshipdetail.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {worshipdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),worshipdetail.mostCurrent.activityBA),worshipdetail.mostCurrent._scrollview1.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 65;BA.debugLine="PanelToolBar.Visible = False";
Debug.ShouldStop(1);
worshipdetail.mostCurrent._paneltoolbar.runMethod(true,"setVisible",worshipdetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 66;BA.debugLine="TabHost1.AddTab(\"Map\",\"tabMap\")";
Debug.ShouldStop(2);
worshipdetail.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",worshipdetail.mostCurrent.activityBA,(Object)(BA.ObjectToString("Map")),(Object)(RemoteObject.createImmutable("tabMap")));
 BA.debugLineNum = 67;BA.debugLine="TabHost1.AddTab(\"Detail\",\"Worship_tabDetail\")";
Debug.ShouldStop(4);
worshipdetail.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",worshipdetail.mostCurrent.activityBA,(Object)(BA.ObjectToString("Detail")),(Object)(RemoteObject.createImmutable("Worship_tabDetail")));
 BA.debugLineNum = 68;BA.debugLine="TabHost1.AddTab(\"Gallery\",\"tabGallery\")";
Debug.ShouldStop(8);
worshipdetail.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",worshipdetail.mostCurrent.activityBA,(Object)(BA.ObjectToString("Gallery")),(Object)(RemoteObject.createImmutable("tabGallery")));
 BA.debugLineNum = 71;BA.debugLine="BackArrow.Visible= True";
Debug.ShouldStop(64);
worshipdetail.mostCurrent._backarrow.runMethod(true,"setVisible",worshipdetail.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 72;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(128);
worshipdetail.mostCurrent._backarrow.runVoidMethod ("SetBackgroundImageNew",(Object)((worshipdetail.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(worshipdetail.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("back-arrow.png"))).getObject())));
 BA.debugLineNum = 73;BA.debugLine="TitleBar.Text=\"Building Detail\"";
Debug.ShouldStop(256);
worshipdetail.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("Building Detail"));
 BA.debugLineNum = 76;BA.debugLine="FunctionAll.CheckBuilding_id(WorshipBuilding.idBu";
Debug.ShouldStop(2048);
worshipdetail.mostCurrent._functionall.runVoidMethod ("_checkbuilding_id",worshipdetail.mostCurrent.activityBA,(Object)(worshipdetail.mostCurrent._worshipbuilding._idbuilding));
 BA.debugLineNum = 77;BA.debugLine="ids = FunctionAll.ids";
Debug.ShouldStop(4096);
worshipdetail.mostCurrent._ids = worshipdetail.mostCurrent._functionall._ids;
 BA.debugLineNum = 79;BA.debugLine="TabHost1.CurrentTab = 1";
Debug.ShouldStop(16384);
worshipdetail.mostCurrent._tabhost1.runMethodAndSync(true,"setCurrentTab",BA.numberCast(int.class, 1));
 BA.debugLineNum = 80;BA.debugLine="AddPicture.Initialize(\"AddPicture\")";
Debug.ShouldStop(32768);
worshipdetail.mostCurrent._addpicture.runVoidMethod ("Initialize",worshipdetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("AddPicture")));
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
		Debug.PushSubsStack("Activity_Pause (worshipdetail) ","worshipdetail",9,worshipdetail.mostCurrent.activityBA,worshipdetail.mostCurrent,94);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.worshipdetail.remoteMe.runUserSub(false, "worshipdetail","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 94;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="CallSub(Starter, \"ActivityIsPaused\")";
Debug.ShouldStop(1073741824);
worshipdetail.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",worshipdetail.processBA,(Object)((worshipdetail.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("ActivityIsPaused")));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Activity_Resume (worshipdetail) ","worshipdetail",9,worshipdetail.mostCurrent.activityBA,worshipdetail.mostCurrent,82);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.worshipdetail.remoteMe.runUserSub(false, "worshipdetail","activity_resume");
 BA.debugLineNum = 82;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="CLV1.Clear";
Debug.ShouldStop(262144);
worshipdetail.mostCurrent._clv1.runVoidMethod ("_clear");
 BA.debugLineNum = 85;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(1048576);
worshipdetail.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",worshipdetail.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Loading..."))));
 BA.debugLineNum = 86;BA.debugLine="If TabHost1.CurrentTab == 2 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",worshipdetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 87;BA.debugLine="ExecuteRemoteQuery(\"SELECT photo_url, upload_dat";
Debug.ShouldStop(4194304);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT photo_url, upload_date FROM Worship_building_gallery WHERE worship_building_id='"),worshipdetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("Download"));
 }else {
 BA.debugLineNum = 89;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.worship_building_id,";
Debug.ShouldStop(16777216);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.worship_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id ='"),worshipdetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("FASILITAS"));
 BA.debugLineNum = 90;BA.debugLine="ExecuteRemoteQuery(\"SELECT W.worship_building_id,";
Debug.ShouldStop(33554432);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT W.worship_building_id, W.name_of_worship_building, W.building_area, W.land_area, W.parking_area, W.standing_year, W.electricity_capacity, W.address, W.type_of_construction, W.type_of_worship, ST_X(ST_Centroid(W.geom)) As longitude, ST_Y(ST_CENTROID(W.geom)) As latitude, T.name_of_type As constr, J.name_of_type As typewor, ST_AsText(geom) As geom FROM worship_building As W LEFT JOIN type_of_construction As T ON W.type_of_construction=T.type_id LEFT JOIN type_of_worship As J ON W.type_of_worship=J.type_id WHERE W.worship_building_id='"),worshipdetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("DATA"));
 };
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
public static RemoteObject  _addpicture_click() throws Exception{
try {
		Debug.PushSubsStack("AddPicture_Click (worshipdetail) ","worshipdetail",9,worshipdetail.mostCurrent.activityBA,worshipdetail.mostCurrent,237);
if (RapidSub.canDelegate("addpicture_click")) return b4a.example.worshipdetail.remoteMe.runUserSub(false, "worshipdetail","addpicture_click");
 BA.debugLineNum = 237;BA.debugLine="Sub AddPicture_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 238;BA.debugLine="ToastMessageShow(\"Add photo\",True)";
Debug.ShouldStop(8192);
worshipdetail.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Add photo")),(Object)(worshipdetail.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 239;BA.debugLine="StartActivity(AddPhoto)";
Debug.ShouldStop(16384);
worshipdetail.mostCurrent.__c.runVoidMethod ("StartActivity",worshipdetail.processBA,(Object)((worshipdetail.mostCurrent._addphoto.getObject())));
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
public static RemoteObject  _backarrow_click() throws Exception{
try {
		Debug.PushSubsStack("BackArrow_Click (worshipdetail) ","worshipdetail",9,worshipdetail.mostCurrent.activityBA,worshipdetail.mostCurrent,242);
if (RapidSub.canDelegate("backarrow_click")) return b4a.example.worshipdetail.remoteMe.runUserSub(false, "worshipdetail","backarrow_click");
 BA.debugLineNum = 242;BA.debugLine="Sub BackArrow_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 243;BA.debugLine="Activity.Finish";
Debug.ShouldStop(262144);
worshipdetail.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 244;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("CreateItem (worshipdetail) ","worshipdetail",9,worshipdetail.mostCurrent.activityBA,worshipdetail.mostCurrent,105);
if (RapidSub.canDelegate("createitem")) return b4a.example.worshipdetail.remoteMe.runUserSub(false, "worshipdetail","createitem", _width, _title, _content);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Title", _title);
Debug.locals.put("Content", _content);
 BA.debugLineNum = 105;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(512);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = worshipdetail._xui.runMethod(false,"CreatePanel",worshipdetail.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 107;BA.debugLine="p.LoadLayout(\"facility_list\")";
Debug.ShouldStop(1024);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("facility_list")),worshipdetail.mostCurrent.activityBA);
 BA.debugLineNum = 108;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, 5%y)";
Debug.ShouldStop(2048);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(worshipdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),worshipdetail.mostCurrent.activityBA)));
 BA.debugLineNum = 109;BA.debugLine="numfc.Text = Title";
Debug.ShouldStop(4096);
worshipdetail.mostCurrent._numfc.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 110;BA.debugLine="namefc.Text = Content";
Debug.ShouldStop(8192);
worshipdetail.mostCurrent._namefc.runMethod(true,"setText",BA.ObjectToCharSequence(_content));
 BA.debugLineNum = 111;BA.debugLine="Return p";
Debug.ShouldStop(16384);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("editBtn_Click (worshipdetail) ","worshipdetail",9,worshipdetail.mostCurrent.activityBA,worshipdetail.mostCurrent,290);
if (RapidSub.canDelegate("editbtn_click")) return b4a.example.worshipdetail.remoteMe.runUserSub(false, "worshipdetail","editbtn_click");
 BA.debugLineNum = 290;BA.debugLine="Sub editBtn_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 291;BA.debugLine="StartActivity(WorshipEdit)";
Debug.ShouldStop(4);
worshipdetail.mostCurrent.__c.runVoidMethod ("StartActivity",worshipdetail.processBA,(Object)((worshipdetail.mostCurrent._worshipedit.getObject())));
 BA.debugLineNum = 292;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("editFacility_Click (worshipdetail) ","worshipdetail",9,worshipdetail.mostCurrent.activityBA,worshipdetail.mostCurrent,294);
if (RapidSub.canDelegate("editfacility_click")) return b4a.example.worshipdetail.remoteMe.runUserSub(false, "worshipdetail","editfacility_click");
 BA.debugLineNum = 294;BA.debugLine="Sub editFacility_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 295;BA.debugLine="StartActivity(EditBuildingFacility)";
Debug.ShouldStop(64);
worshipdetail.mostCurrent.__c.runVoidMethod ("StartActivity",worshipdetail.processBA,(Object)((worshipdetail.mostCurrent._editbuildingfacility.getObject())));
 BA.debugLineNum = 296;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("ExecuteRemoteQuery (worshipdetail) ","worshipdetail",9,worshipdetail.mostCurrent.activityBA,worshipdetail.mostCurrent,98);
if (RapidSub.canDelegate("executeremotequery")) return b4a.example.worshipdetail.remoteMe.runUserSub(false, "worshipdetail","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 98;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(4);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 100;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(8);
_job.runVoidMethod ("_initialize",worshipdetail.processBA,(Object)(_jobname),(Object)(worshipdetail.getObject()));
 BA.debugLineNum = 101;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
Debug.ShouldStop(16);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),worshipdetail.mostCurrent._main._server,RemoteObject.createImmutable("mobile/json.php"))),(Object)(_query));
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
worshipdetail.mostCurrent._scrollimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim clv As CustomListView";
worshipdetail.mostCurrent._clv = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 20;BA.debugLine="Dim Label1 As Label";
worshipdetail.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim ImageView1 As ImageView";
worshipdetail.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private CLV1 As CustomListView";
worshipdetail.mostCurrent._clv1 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 24;BA.debugLine="Private ScrollView1 As ScrollView";
worshipdetail.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private TitleBar As Label";
worshipdetail.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private BackArrow As Label";
worshipdetail.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private PanelBuildingList As Panel";
worshipdetail.mostCurrent._panelbuildinglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private numfc As B4XView";
worshipdetail.mostCurrent._numfc = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private namefc As B4XView";
worshipdetail.mostCurrent._namefc = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private btnGallery As Panel";
worshipdetail.mostCurrent._btngallery = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private PFacility As Panel";
worshipdetail.mostCurrent._pfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private ListItem As Panel";
worshipdetail.mostCurrent._listitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private PanelButton As Panel";
worshipdetail.mostCurrent._panelbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Dim WorshipName As Label";
worshipdetail.mostCurrent._worshipname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private TypeOfWorship As Label";
worshipdetail.mostCurrent._typeofworship = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private StandingYear As Label";
worshipdetail.mostCurrent._standingyear = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private BuildingArea As Label";
worshipdetail.mostCurrent._buildingarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private LandArea As Label";
worshipdetail.mostCurrent._landarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private ParkingArea As Label";
worshipdetail.mostCurrent._parkingarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private Electricity As Label";
worshipdetail.mostCurrent._electricity = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private Construction As Label";
worshipdetail.mostCurrent._construction = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private PanelToolBar As Panel";
worshipdetail.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Dim ids As String";
worshipdetail.mostCurrent._ids = RemoteObject.createImmutable("");
 //BA.debugLineNum = 45;BA.debugLine="Private LblEdit As Label";
worshipdetail.mostCurrent._lbledit = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private LblFacility As Label";
worshipdetail.mostCurrent._lblfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private Panel4 As Panel";
worshipdetail.mostCurrent._panel4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Dim TabHost1 As TabHost";
worshipdetail.mostCurrent._tabhost1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabHostWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Dim bmp1, bmp2 As Bitmap";
worshipdetail.mostCurrent._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
worshipdetail.mostCurrent._bmp2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private PanelMap As Panel";
worshipdetail.mostCurrent._panelmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private btnRoute As Button";
worshipdetail.mostCurrent._btnroute = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private WebViewRoute As WebView";
worshipdetail.mostCurrent._webviewroute = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private editBtn As Button";
worshipdetail.mostCurrent._editbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private Label2 As Label";
worshipdetail.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private editFacility As Button";
worshipdetail.mostCurrent._editfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private PanelGallery As Panel";
worshipdetail.mostCurrent._panelgallery = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private AddPicture As Button";
worshipdetail.mostCurrent._addpicture = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imageview1_click() throws Exception{
try {
		Debug.PushSubsStack("ImageView1_Click (worshipdetail) ","worshipdetail",9,worshipdetail.mostCurrent.activityBA,worshipdetail.mostCurrent,277);
if (RapidSub.canDelegate("imageview1_click")) return b4a.example.worshipdetail.remoteMe.runUserSub(false, "worshipdetail","imageview1_click");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _bd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 277;BA.debugLine="Sub ImageView1_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 278;BA.debugLine="Dim iv As ImageView";
Debug.ShouldStop(2097152);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 279;BA.debugLine="iv = Sender";
Debug.ShouldStop(4194304);
_iv.setObject(worshipdetail.mostCurrent.__c.runMethod(false,"Sender",worshipdetail.mostCurrent.activityBA));
 BA.debugLineNum = 280;BA.debugLine="If iv.Background Is BitmapDrawable Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("i",_iv.runMethod(false,"getBackground"), RemoteObject.createImmutable("android.graphics.drawable.BitmapDrawable"))) { 
 BA.debugLineNum = 282;BA.debugLine="Dim bd As BitmapDrawable";
Debug.ShouldStop(33554432);
_bd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bd", _bd);
 BA.debugLineNum = 283;BA.debugLine="bd = iv.Background";
Debug.ShouldStop(67108864);
_bd.setObject(_iv.runMethod(false,"getBackground"));
 BA.debugLineNum = 284;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(134217728);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 285;BA.debugLine="bmp = bd.Bitmap";
Debug.ShouldStop(268435456);
_bmp.setObject(_bd.runMethod(false,"getBitmap"));
 BA.debugLineNum = 286;BA.debugLine="CallSubDelayed2(ShowImage, \"Show\", bmp)";
Debug.ShouldStop(536870912);
worshipdetail.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",worshipdetail.processBA,(Object)((worshipdetail.mostCurrent._showimage.getObject())),(Object)(BA.ObjectToString("Show")),(Object)((_bmp)));
 };
 BA.debugLineNum = 288;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("JobDone (worshipdetail) ","worshipdetail",9,worshipdetail.mostCurrent.activityBA,worshipdetail.mostCurrent,115);
if (RapidSub.canDelegate("jobdone")) return b4a.example.worshipdetail.remoteMe.runUserSub(false, "worshipdetail","jobdone", _job);
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
RemoteObject _data_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 115;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(524288);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 117;BA.debugLine="Dim res As String";
Debug.ShouldStop(1048576);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 118;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(2097152);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 119;BA.debugLine="Log(\"Response from server :\"& res)";
Debug.ShouldStop(4194304);
worshipdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 120;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(8388608);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 121;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(16777216);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 122;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("Download"),BA.ObjectToString("FASILITAS"),BA.ObjectToString("DATA"))) {
case 0: {
 BA.debugLineNum = 125;BA.debugLine="Dim agn As List";
Debug.ShouldStop(268435456);
_agn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 126;BA.debugLine="agn=parser.NextArray";
Debug.ShouldStop(536870912);
_agn = _parser.runMethod(false,"NextArray");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 127;BA.debugLine="If agn.Size - 1 < 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 128;BA.debugLine="Log(agn.Size)";
Debug.ShouldStop(-2147483648);
worshipdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_agn.runMethod(true,"getSize"))));
 BA.debugLineNum = 129;BA.debugLine="Dim NotFound As Label";
Debug.ShouldStop(1);
_notfound = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("NotFound", _notfound);
 BA.debugLineNum = 130;BA.debugLine="NotFound.Initialize(\"\")";
Debug.ShouldStop(2);
_notfound.runVoidMethod ("Initialize",worshipdetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 131;BA.debugLine="PanelGallery.Color= Colors.White";
Debug.ShouldStop(4);
worshipdetail.mostCurrent._panelgallery.runVoidMethod ("setColor",worshipdetail.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 132;BA.debugLine="PanelGallery.AddView(NotFound,0,0,100%x,60%y)";
Debug.ShouldStop(8);
worshipdetail.mostCurrent._panelgallery.runVoidMethod ("AddView",(Object)((_notfound.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(worshipdetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),worshipdetail.mostCurrent.activityBA)),(Object)(worshipdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 60)),worshipdetail.mostCurrent.activityBA)));
 BA.debugLineNum = 133;BA.debugLine="NotFound.Text = \"Picture doesn't exist\"";
Debug.ShouldStop(16);
_notfound.runMethod(true,"setText",BA.ObjectToCharSequence("Picture doesn't exist"));
 BA.debugLineNum = 134;BA.debugLine="NotFound.TextSize = 15";
Debug.ShouldStop(32);
_notfound.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 135;BA.debugLine="NotFound.Gravity = Gravity.CENTER";
Debug.ShouldStop(64);
_notfound.runMethod(true,"setGravity",worshipdetail.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 136;BA.debugLine="PanelGallery.Height = NotFound.Height";
Debug.ShouldStop(128);
worshipdetail.mostCurrent._panelgallery.runMethod(true,"setHeight",_notfound.runMethod(true,"getHeight"));
 BA.debugLineNum = 137;BA.debugLine="TabHost1.Height = PanelGallery.Height";
Debug.ShouldStop(256);
worshipdetail.mostCurrent._tabhost1.runMethod(true,"setHeight",worshipdetail.mostCurrent._panelgallery.runMethod(true,"getHeight"));
 BA.debugLineNum = 138;BA.debugLine="Msgbox(\"Galery Foto tidak ditemukan\", \"Pering";
Debug.ShouldStop(512);
worshipdetail.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Galery Foto tidak ditemukan")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Peringatan"))),worshipdetail.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 140;BA.debugLine="ScrollImage.Initialize(100%y)";
Debug.ShouldStop(2048);
worshipdetail.mostCurrent._scrollimage.runVoidMethod ("Initialize",worshipdetail.mostCurrent.activityBA,(Object)(worshipdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),worshipdetail.mostCurrent.activityBA)));
 BA.debugLineNum = 141;BA.debugLine="PanelGallery.AddView(ScrollImage,0,0,100%x,10";
Debug.ShouldStop(4096);
worshipdetail.mostCurrent._panelgallery.runVoidMethod ("AddView",(Object)((worshipdetail.mostCurrent._scrollimage.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(worshipdetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),worshipdetail.mostCurrent.activityBA)),(Object)(worshipdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),worshipdetail.mostCurrent.activityBA)));
 BA.debugLineNum = 142;BA.debugLine="ScrollImage.Panel.LoadLayout(\"LoaderImage\")";
Debug.ShouldStop(8192);
worshipdetail.mostCurrent._scrollimage.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LoaderImage")),worshipdetail.mostCurrent.activityBA);
 BA.debugLineNum = 143;BA.debugLine="For i=0 To agn.Size-1";
Debug.ShouldStop(16384);
{
final int step27 = 1;
final int limit27 = RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27) ;_i = ((int)(0 + _i + step27))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 144;BA.debugLine="Dim w As Map";
Debug.ShouldStop(32768);
_w = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("w", _w);
 BA.debugLineNum = 145;BA.debugLine="w=agn.Get(i)";
Debug.ShouldStop(65536);
_w.setObject(_agn.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 146;BA.debugLine="Dim image = w.Get(\"photo_url\") As String";
Debug.ShouldStop(131072);
_image = BA.ObjectToString(_w.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_url")))));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 147;BA.debugLine="Dim gambar = \"\"&Main.Server&\"Files/Worship/i";
Debug.ShouldStop(262144);
_gambar = RemoteObject.concat(RemoteObject.createImmutable(""),worshipdetail.mostCurrent._main._server,RemoteObject.createImmutable("Files/Worship/img/"),_image);Debug.locals.put("gambar", _gambar);Debug.locals.put("gambar", _gambar);
 BA.debugLineNum = 148;BA.debugLine="Dim m As Map";
Debug.ShouldStop(524288);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 149;BA.debugLine="m.Initialize";
Debug.ShouldStop(1048576);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 150;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(2097152);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 151;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(4194304);
_p.runVoidMethod ("Initialize",worshipdetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 152;BA.debugLine="p.SetLayout(0,0,100%x,20%y)";
Debug.ShouldStop(8388608);
_p.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(worshipdetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),worshipdetail.mostCurrent.activityBA)),(Object)(worshipdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),worshipdetail.mostCurrent.activityBA)));
 BA.debugLineNum = 153;BA.debugLine="p.LoadLayout(\"listitem-image\")";
Debug.ShouldStop(16777216);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("listitem-image")),worshipdetail.mostCurrent.activityBA);
 BA.debugLineNum = 154;BA.debugLine="clv.Add(p,m)";
Debug.ShouldStop(33554432);
worshipdetail.mostCurrent._clv.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()),(Object)((_m.getObject())));
 BA.debugLineNum = 155;BA.debugLine="m.Put(ImageView1, gambar)";
Debug.ShouldStop(67108864);
_m.runVoidMethod ("Put",(Object)((worshipdetail.mostCurrent._imageview1.getObject())),(Object)((_gambar)));
 BA.debugLineNum = 156;BA.debugLine="Log (gambar)";
Debug.ShouldStop(134217728);
worshipdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(_gambar));
 BA.debugLineNum = 157;BA.debugLine="CallSubDelayed2(Starter, \"Download\", m)";
Debug.ShouldStop(268435456);
worshipdetail.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",worshipdetail.processBA,(Object)((worshipdetail.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_m)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 159;BA.debugLine="ScrollView1.Height = 100%y - ScrollView1.Top";
Debug.ShouldStop(1073741824);
worshipdetail.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {worshipdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),worshipdetail.mostCurrent.activityBA),worshipdetail.mostCurrent._scrollview1.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 160;BA.debugLine="ScrollImage.Panel.Height = (ImageView1.Height";
Debug.ShouldStop(-2147483648);
worshipdetail.mostCurrent._scrollimage.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {worshipdetail.mostCurrent._imageview1.runMethod(true,"getHeight"),worshipdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),worshipdetail.mostCurrent.activityBA)}, "+",1, 1)),_agn.runMethod(true,"getSize")}, "*",0, 1));
 BA.debugLineNum = 161;BA.debugLine="ScrollImage.Height = 70%y";
Debug.ShouldStop(1);
worshipdetail.mostCurrent._scrollimage.runMethod(true,"setHeight",worshipdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),worshipdetail.mostCurrent.activityBA));
 BA.debugLineNum = 162;BA.debugLine="PanelGallery.Height = ScrollImage.Height";
Debug.ShouldStop(2);
worshipdetail.mostCurrent._panelgallery.runMethod(true,"setHeight",worshipdetail.mostCurrent._scrollimage.runMethod(true,"getHeight"));
 BA.debugLineNum = 163;BA.debugLine="TabHost1.Height = ScrollImage.Height";
Debug.ShouldStop(4);
worshipdetail.mostCurrent._tabhost1.runMethod(true,"setHeight",worshipdetail.mostCurrent._scrollimage.runMethod(true,"getHeight"));
 };
 BA.debugLineNum = 165;BA.debugLine="AddPicture.RemoveView";
Debug.ShouldStop(16);
worshipdetail.mostCurrent._addpicture.runVoidMethod ("RemoveView");
 BA.debugLineNum = 166;BA.debugLine="PanelBuildingList.AddView(AddPicture,0, TabHos";
Debug.ShouldStop(32);
worshipdetail.mostCurrent._panelbuildinglist.runVoidMethod ("AddView",(Object)((worshipdetail.mostCurrent._addpicture.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {worshipdetail.mostCurrent._tabhost1.runMethod(true,"getHeight"),worshipdetail.mostCurrent._tabhost1.runMethod(true,"getTop")}, "+",1, 1)),(Object)(worshipdetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),worshipdetail.mostCurrent.activityBA)),(Object)(worshipdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),worshipdetail.mostCurrent.activityBA)));
 BA.debugLineNum = 167;BA.debugLine="PanelBuildingList.Height = AddPicture.Top + Ad";
Debug.ShouldStop(64);
worshipdetail.mostCurrent._panelbuildinglist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {worshipdetail.mostCurrent._addpicture.runMethod(true,"getTop"),worshipdetail.mostCurrent._addpicture.runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 168;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.H";
Debug.ShouldStop(128);
worshipdetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",worshipdetail.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 BA.debugLineNum = 169;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(256);
worshipdetail.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 1: {
 BA.debugLineNum = 172;BA.debugLine="Dim fasilitas_array As List";
Debug.ShouldStop(2048);
_fasilitas_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("fasilitas_array", _fasilitas_array);
 BA.debugLineNum = 173;BA.debugLine="fasilitas_array = parser.NextArray";
Debug.ShouldStop(4096);
_fasilitas_array = _parser.runMethod(false,"NextArray");Debug.locals.put("fasilitas_array", _fasilitas_array);
 BA.debugLineNum = 174;BA.debugLine="If fasilitas_array.Size-1 < 0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_fasilitas_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 175;BA.debugLine="CLV1.AsView.Visible= False";
Debug.ShouldStop(16384);
worshipdetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"setVisible",worshipdetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 176;BA.debugLine="Dim NotExist As Label";
Debug.ShouldStop(32768);
_notexist = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("NotExist", _notexist);
 BA.debugLineNum = 177;BA.debugLine="NotExist.Initialize(\"\")";
Debug.ShouldStop(65536);
_notexist.runVoidMethod ("Initialize",worshipdetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 178;BA.debugLine="PFacility.AddView(NotExist,LblFacility.Left,0";
Debug.ShouldStop(131072);
worshipdetail.mostCurrent._pfacility.runVoidMethod ("AddView",(Object)((_notexist.getObject())),(Object)(worshipdetail.mostCurrent._lblfacility.runMethod(true,"getLeft")),(Object)(BA.numberCast(int.class, 0)),(Object)(worshipdetail.mostCurrent._lblfacility.runMethod(true,"getWidth")),(Object)(worshipdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),worshipdetail.mostCurrent.activityBA)));
 BA.debugLineNum = 179;BA.debugLine="NotExist.Gravity= Gravity.CENTER";
Debug.ShouldStop(262144);
_notexist.runMethod(true,"setGravity",worshipdetail.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 180;BA.debugLine="NotExist.Text=\"Facility doesn't not exist.\"";
Debug.ShouldStop(524288);
_notexist.runMethod(true,"setText",BA.ObjectToCharSequence("Facility doesn't not exist."));
 BA.debugLineNum = 181;BA.debugLine="Select TabHost1.CurrentTab";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(worshipdetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 183;BA.debugLine="PFacility.Height= NotExist.Height + NotExis";
Debug.ShouldStop(4194304);
worshipdetail.mostCurrent._pfacility.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_notexist.runMethod(true,"getHeight"),_notexist.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 184;BA.debugLine="TabHost1.Height = PFacility.Top+PFacility.H";
Debug.ShouldStop(8388608);
worshipdetail.mostCurrent._tabhost1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {worshipdetail.mostCurrent._pfacility.runMethod(true,"getTop"),worshipdetail.mostCurrent._pfacility.runMethod(true,"getHeight")}, "+",1, 1));
 break; }
}
;
 }else {
 BA.debugLineNum = 187;BA.debugLine="CLV1.AsView.Visible= True";
Debug.ShouldStop(67108864);
worshipdetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"setVisible",worshipdetail.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 188;BA.debugLine="For i=0 To fasilitas_array.Size - 1";
Debug.ShouldStop(134217728);
{
final int step71 = 1;
final int limit71 = RemoteObject.solve(new RemoteObject[] {_fasilitas_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step71 > 0 && _i <= limit71) || (step71 < 0 && _i >= limit71) ;_i = ((int)(0 + _i + step71))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 189;BA.debugLine="Dim a As Map";
Debug.ShouldStop(268435456);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 190;BA.debugLine="a = fasilitas_array.Get(i)";
Debug.ShouldStop(536870912);
_a.setObject(_fasilitas_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 193;BA.debugLine="Dim content As String = a.Get(\"name_of_facil";
Debug.ShouldStop(1);
_content = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_facility")))));Debug.locals.put("content", _content);Debug.locals.put("content", _content);
 BA.debugLineNum = 194;BA.debugLine="Dim quantity As Int = a.Get(\"quantity_of_fac";
Debug.ShouldStop(2);
_quantity = BA.numberCast(int.class, _a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("quantity_of_facilities")))));Debug.locals.put("quantity", _quantity);Debug.locals.put("quantity", _quantity);
 BA.debugLineNum = 195;BA.debugLine="CLV1.Add(CreateItem(CLV1.AsView.Width, $\"${q";
Debug.ShouldStop(4);
worshipdetail.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(worshipdetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getWidth"),(RemoteObject.concat(RemoteObject.createImmutable(""),worshipdetail.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_quantity))),RemoteObject.createImmutable(""))),_content).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 196;BA.debugLine="CLV1.AsView.Height = ListItem.Height*(i+1)";
Debug.ShouldStop(8);
worshipdetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {worshipdetail.mostCurrent._listitem.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))}, "*",0, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 198;BA.debugLine="CLV1.sv.Height = CLV1.AsView.Height";
Debug.ShouldStop(32);
worshipdetail.mostCurrent._clv1.getField(false,"_sv").runMethod(true,"setHeight",worshipdetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 199;BA.debugLine="PFacility.Height = LblFacility.Height + LblFa";
Debug.ShouldStop(64);
worshipdetail.mostCurrent._pfacility.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {worshipdetail.mostCurrent._lblfacility.runMethod(true,"getHeight"),worshipdetail.mostCurrent._lblfacility.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 200;BA.debugLine="PFacility.Height = PFacility.Height + CLV1.sv";
Debug.ShouldStop(128);
worshipdetail.mostCurrent._pfacility.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {worshipdetail.mostCurrent._pfacility.runMethod(true,"getHeight"),worshipdetail.mostCurrent._clv1.getField(false,"_sv").runMethod(true,"getHeight"),worshipdetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getTop")}, "++",2, 1));
 BA.debugLineNum = 201;BA.debugLine="Select TabHost1.CurrentTab";
Debug.ShouldStop(256);
switch (BA.switchObjectToInt(worshipdetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 203;BA.debugLine="TabHost1.Height = PFacility.Top+PFacility.H";
Debug.ShouldStop(1024);
worshipdetail.mostCurrent._tabhost1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {worshipdetail.mostCurrent._pfacility.runMethod(true,"getTop"),worshipdetail.mostCurrent._pfacility.runMethod(true,"getHeight"),worshipdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),worshipdetail.mostCurrent.activityBA)}, "++",2, 1));
 break; }
}
;
 };
 BA.debugLineNum = 206;BA.debugLine="PanelBuildingList.Height = TabHost1.Height + T";
Debug.ShouldStop(8192);
worshipdetail.mostCurrent._panelbuildinglist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {worshipdetail.mostCurrent._tabhost1.runMethod(true,"getHeight"),worshipdetail.mostCurrent._tabhost1.runMethod(true,"getTop"),worshipdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),worshipdetail.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 207;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.H";
Debug.ShouldStop(16384);
worshipdetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",worshipdetail.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 BA.debugLineNum = 208;BA.debugLine="Log(content)";
Debug.ShouldStop(32768);
worshipdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(_content));
 BA.debugLineNum = 209;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(65536);
worshipdetail.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 2: {
 BA.debugLineNum = 212;BA.debugLine="Dim data_array As List";
Debug.ShouldStop(524288);
_data_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 213;BA.debugLine="data_array = parser.NextArray";
Debug.ShouldStop(1048576);
_data_array = _parser.runMethod(false,"NextArray");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 214;BA.debugLine="For i=0 To data_array.Size -1";
Debug.ShouldStop(2097152);
{
final int step94 = 1;
final int limit94 = RemoteObject.solve(new RemoteObject[] {_data_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step94 > 0 && _i <= limit94) || (step94 < 0 && _i >= limit94) ;_i = ((int)(0 + _i + step94))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 215;BA.debugLine="Dim a As Map";
Debug.ShouldStop(4194304);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 216;BA.debugLine="a = data_array.Get(i)";
Debug.ShouldStop(8388608);
_a.setObject(_data_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 217;BA.debugLine="lat = a.Get(\"latitude\")";
Debug.ShouldStop(16777216);
worshipdetail._lat = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("latitude")))));
 BA.debugLineNum = 218;BA.debugLine="lng = a.Get(\"longitude\")";
Debug.ShouldStop(33554432);
worshipdetail._lng = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("longitude")))));
 BA.debugLineNum = 219;BA.debugLine="Log(lat)";
Debug.ShouldStop(67108864);
worshipdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(worshipdetail._lat));
 BA.debugLineNum = 220;BA.debugLine="Log(lng)";
Debug.ShouldStop(134217728);
worshipdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(worshipdetail._lng));
 BA.debugLineNum = 222;BA.debugLine="TypeOfWorship.Text = a.Get(\"typewor\")";
Debug.ShouldStop(536870912);
worshipdetail.mostCurrent._typeofworship.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("typewor"))))));
 BA.debugLineNum = 223;BA.debugLine="Log(a.Get(\"typewor\"))";
Debug.ShouldStop(1073741824);
worshipdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("typewor")))))));
 BA.debugLineNum = 224;BA.debugLine="StandingYear.Text = a.Get(\"standing_year\")";
Debug.ShouldStop(-2147483648);
worshipdetail.mostCurrent._standingyear.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("standing_year"))))));
 BA.debugLineNum = 225;BA.debugLine="BuildingArea.Text = a.Get(\"building_area\")";
Debug.ShouldStop(1);
worshipdetail.mostCurrent._buildingarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("building_area"))))));
 BA.debugLineNum = 226;BA.debugLine="LandArea.Text = a.Get(\"land_area\")";
Debug.ShouldStop(2);
worshipdetail.mostCurrent._landarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("land_area"))))));
 BA.debugLineNum = 227;BA.debugLine="ParkingArea.Text = a.Get(\"parking_area\")";
Debug.ShouldStop(4);
worshipdetail.mostCurrent._parkingarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parking_area"))))));
 BA.debugLineNum = 228;BA.debugLine="Electricity.Text = a.Get(\"electricity_capacit";
Debug.ShouldStop(8);
worshipdetail.mostCurrent._electricity.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("electricity_capacity"))))));
 BA.debugLineNum = 229;BA.debugLine="Construction.Text = a.Get(\"constr\")";
Debug.ShouldStop(16);
worshipdetail.mostCurrent._construction.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("constr"))))));
 }
}Debug.locals.put("i", _i);
;
 break; }
}
;
 };
 BA.debugLineNum = 233;BA.debugLine="Job.Release";
Debug.ShouldStop(256);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("LblEdit_Click (worshipdetail) ","worshipdetail",9,worshipdetail.mostCurrent.activityBA,worshipdetail.mostCurrent,247);
if (RapidSub.canDelegate("lbledit_click")) return b4a.example.worshipdetail.remoteMe.runUserSub(false, "worshipdetail","lbledit_click");
 BA.debugLineNum = 247;BA.debugLine="Sub LblEdit_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 249;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
worshipdetail._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim fasilitas, lat, lng As String";
worshipdetail._fasilitas = RemoteObject.createImmutable("");
worshipdetail._lat = RemoteObject.createImmutable("");
worshipdetail._lng = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim quantity_fac As Int";
worshipdetail._quantity_fac = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _tabhost1_tabchanged() throws Exception{
try {
		Debug.PushSubsStack("TabHost1_TabChanged (worshipdetail) ","worshipdetail",9,worshipdetail.mostCurrent.activityBA,worshipdetail.mostCurrent,251);
if (RapidSub.canDelegate("tabhost1_tabchanged")) return b4a.example.worshipdetail.remoteMe.runUserSub(false, "worshipdetail","tabhost1_tabchanged");
 BA.debugLineNum = 251;BA.debugLine="Sub TabHost1_TabChanged";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 253;BA.debugLine="Select TabHost1.CurrentTab";
Debug.ShouldStop(268435456);
switch (BA.switchObjectToInt(worshipdetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 255;BA.debugLine="WebViewRoute.LoadUrl(Main.Server&\"Worship/Route";
Debug.ShouldStop(1073741824);
worshipdetail.mostCurrent._webviewroute.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(worshipdetail.mostCurrent._main._server,RemoteObject.createImmutable("Worship/Route.php?lat="),worshipdetail.mostCurrent._main._lbllat,RemoteObject.createImmutable("&lng="),worshipdetail.mostCurrent._main._lbllon,RemoteObject.createImmutable("&latd="),worshipdetail._lat,RemoteObject.createImmutable("&lngd="),worshipdetail._lng)));
 BA.debugLineNum = 256;BA.debugLine="Msgbox(\"Current tab is \" & TabHost1.CurrentTab,";
Debug.ShouldStop(-2147483648);
worshipdetail.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Current tab is "),worshipdetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),worshipdetail.mostCurrent.activityBA);
 BA.debugLineNum = 257;BA.debugLine="Log (\"Button Top :\"&btnRoute.Top)";
Debug.ShouldStop(1);
worshipdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Button Top :"),worshipdetail.mostCurrent._btnroute.runMethod(true,"getTop"))));
 BA.debugLineNum = 258;BA.debugLine="TabHost1.Height = btnRoute.Top + btnRoute.Heigh";
Debug.ShouldStop(2);
worshipdetail.mostCurrent._tabhost1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {worshipdetail.mostCurrent._btnroute.runMethod(true,"getTop"),worshipdetail.mostCurrent._btnroute.runMethod(true,"getHeight"),worshipdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),worshipdetail.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 259;BA.debugLine="AddPicture.Visible=False";
Debug.ShouldStop(4);
worshipdetail.mostCurrent._addpicture.runMethod(true,"setVisible",worshipdetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 260;BA.debugLine="Log(\"tabHost height: \"&TabHost1.Height)";
Debug.ShouldStop(8);
worshipdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("tabHost height: "),worshipdetail.mostCurrent._tabhost1.runMethod(true,"getHeight"))));
 BA.debugLineNum = 261;BA.debugLine="PanelBuildingList.Height = TabHost1.Height + Ta";
Debug.ShouldStop(16);
worshipdetail.mostCurrent._panelbuildinglist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {worshipdetail.mostCurrent._tabhost1.runMethod(true,"getHeight"),worshipdetail.mostCurrent._tabhost1.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 262;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.He";
Debug.ShouldStop(32);
worshipdetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",worshipdetail.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 break; }
case 1: {
 BA.debugLineNum = 264;BA.debugLine="CLV1.Clear";
Debug.ShouldStop(128);
worshipdetail.mostCurrent._clv1.runVoidMethod ("_clear");
 BA.debugLineNum = 265;BA.debugLine="AddPicture.Visible=False";
Debug.ShouldStop(256);
worshipdetail.mostCurrent._addpicture.runMethod(true,"setVisible",worshipdetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 266;BA.debugLine="ProgressDialogShow(\"loading...\")";
Debug.ShouldStop(512);
worshipdetail.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",worshipdetail.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("loading..."))));
 BA.debugLineNum = 267;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.worship_building_i";
Debug.ShouldStop(1024);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.worship_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id ='"),worshipdetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("FASILITAS"));
 BA.debugLineNum = 268;BA.debugLine="ExecuteRemoteQuery(\"SELECT W.worship_building_i";
Debug.ShouldStop(2048);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT W.worship_building_id, W.name_of_worship_building, W.building_area, W.land_area, W.parking_area, W.standing_year, W.electricity_capacity, W.address, W.type_of_construction, W.type_of_worship, ST_X(ST_Centroid(W.geom)) As longitude, ST_Y(ST_CENTROID(W.geom)) As latitude, T.name_of_type As constr, J.name_of_type As typewor, ST_AsText(geom) As geom FROM worship_building As W LEFT JOIN type_of_construction As T ON W.type_of_construction=T.type_id LEFT JOIN type_of_worship As J ON W.type_of_worship=J.type_id WHERE W.worship_building_id='"),worshipdetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("DATA"));
 break; }
case 2: {
 BA.debugLineNum = 270;BA.debugLine="AddPicture.Visible=True";
Debug.ShouldStop(8192);
worshipdetail.mostCurrent._addpicture.runMethod(true,"setVisible",worshipdetail.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 271;BA.debugLine="ProgressDialogShow(\"loading...\")";
Debug.ShouldStop(16384);
worshipdetail.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",worshipdetail.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("loading..."))));
 BA.debugLineNum = 272;BA.debugLine="ExecuteRemoteQuery(\"SELECT photo_url, upload_da";
Debug.ShouldStop(32768);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT photo_url, upload_date FROM Worship_building_gallery WHERE worship_building_id='"),worshipdetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("Download"));
 break; }
}
;
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}