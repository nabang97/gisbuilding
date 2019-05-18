package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class officedetail_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (officedetail) ","officedetail",2,officedetail.mostCurrent.activityBA,officedetail.mostCurrent,64);
if (RapidSub.canDelegate("activity_create")) return b4a.example.officedetail.remoteMe.runUserSub(false, "officedetail","activity_create", _firsttime);
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _bmp2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 64;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 66;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(2);
officedetail.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),officedetail.mostCurrent.activityBA);
 BA.debugLineNum = 67;BA.debugLine="ScrollView1.Panel.LoadLayout(\"OfficeDetail\")";
Debug.ShouldStop(4);
officedetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("OfficeDetail")),officedetail.mostCurrent.activityBA);
 BA.debugLineNum = 69;BA.debugLine="ScrollView1.Height = 100%y - ScrollView1.Top";
Debug.ShouldStop(16);
officedetail.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {officedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),officedetail.mostCurrent.activityBA),officedetail.mostCurrent._scrollview1.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 70;BA.debugLine="PanelToolBar.Visible = False";
Debug.ShouldStop(32);
officedetail.mostCurrent._paneltoolbar.runMethod(true,"setVisible",officedetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 73;BA.debugLine="BackArrow.Visible= True";
Debug.ShouldStop(256);
officedetail.mostCurrent._backarrow.runMethod(true,"setVisible",officedetail.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 74;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmapSample(Fil";
Debug.ShouldStop(512);
officedetail.mostCurrent._backarrow.runVoidMethod ("SetBackgroundImageNew",(Object)((officedetail.mostCurrent.__c.runMethod(false,"LoadBitmapSample",(Object)(officedetail.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("back-arrow.png")),(Object)(officedetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),officedetail.mostCurrent.activityBA)),(Object)(officedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),officedetail.mostCurrent.activityBA))).getObject())));
 BA.debugLineNum = 75;BA.debugLine="TitleBar.Text=\"Building Detail\"";
Debug.ShouldStop(1024);
officedetail.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("Building Detail"));
 BA.debugLineNum = 77;BA.debugLine="Dim bmp1, bmp2 As Bitmap";
Debug.ShouldStop(4096);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
_bmp2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp2", _bmp2);
 BA.debugLineNum = 78;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"home.png\")";
Debug.ShouldStop(8192);
_bmp1 = officedetail.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(officedetail.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("home.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 79;BA.debugLine="TabHost1.AddTabWithIcon(\"\",LoadBitmap(File.DirAss";
Debug.ShouldStop(16384);
officedetail.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTabWithIcon",officedetail.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)((officedetail.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(officedetail.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("map-marker-blue.png"))).getObject())),(Object)((officedetail.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(officedetail.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("map-marker-blue.png"))).getObject())),(Object)(RemoteObject.createImmutable("tabMap")));
 BA.debugLineNum = 80;BA.debugLine="TabHost1.AddTab( \"Detail\",\"Office_tabDetail\")";
Debug.ShouldStop(32768);
officedetail.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",officedetail.mostCurrent.activityBA,(Object)(BA.ObjectToString("Detail")),(Object)(RemoteObject.createImmutable("Office_tabDetail")));
 BA.debugLineNum = 81;BA.debugLine="TabHost1.AddTab( \"Gallery\", \"tabGallery\")";
Debug.ShouldStop(65536);
officedetail.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",officedetail.mostCurrent.activityBA,(Object)(BA.ObjectToString("Gallery")),(Object)(RemoteObject.createImmutable("tabGallery")));
 BA.debugLineNum = 83;BA.debugLine="TabManager.setTabHeight(TabHost1,10%x)";
Debug.ShouldStop(262144);
officedetail.mostCurrent._tabmanager.runVoidMethod ("setTabHeight",(Object)((officedetail.mostCurrent._tabhost1.getObject())),(Object)(officedetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),officedetail.mostCurrent.activityBA)));
 BA.debugLineNum = 84;BA.debugLine="TabManager.setTabGradientDrawable(TabHost1,\"TOP_B";
Debug.ShouldStop(524288);
officedetail.mostCurrent._tabmanager.runVoidMethod ("setTabGradientDrawable",(Object)((officedetail.mostCurrent._tabhost1.getObject())),(Object)(BA.ObjectToString("TOP_BOTTOM")),(Object)(officedetail.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(officedetail.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 85;BA.debugLine="TabManager.setTabContentViewPadding(TabHost1,0,20";
Debug.ShouldStop(1048576);
officedetail.mostCurrent._tabmanager.runVoidMethod ("setTabContentViewPadding",(Object)((officedetail.mostCurrent._tabhost1.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 20)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 88;BA.debugLine="FunctionAll.CheckBuilding_id(OfficeBuilding.idBui";
Debug.ShouldStop(8388608);
officedetail.mostCurrent._functionall.runVoidMethod ("_checkbuilding_id",officedetail.mostCurrent.activityBA,(Object)(officedetail.mostCurrent._officebuilding._idbuilding));
 BA.debugLineNum = 89;BA.debugLine="ids = FunctionAll.ids";
Debug.ShouldStop(16777216);
officedetail.mostCurrent._ids = officedetail.mostCurrent._functionall._ids;
 BA.debugLineNum = 90;BA.debugLine="Log(\"DARI SINI\"&ids)";
Debug.ShouldStop(33554432);
officedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DARI SINI"),officedetail.mostCurrent._ids)));
 BA.debugLineNum = 92;BA.debugLine="TabHost1.CurrentTab = 1";
Debug.ShouldStop(134217728);
officedetail.mostCurrent._tabhost1.runMethodAndSync(true,"setCurrentTab",BA.numberCast(int.class, 1));
 BA.debugLineNum = 93;BA.debugLine="AddPicture.Initialize(\"AddPicture\")";
Debug.ShouldStop(268435456);
officedetail.mostCurrent._addpicture.runVoidMethod ("Initialize",officedetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("AddPicture")));
 BA.debugLineNum = 96;BA.debugLine="tab_clicked=Colors.White";
Debug.ShouldStop(-2147483648);
officedetail._tab_clicked = officedetail.mostCurrent.__c.getField(false,"Colors").getField(true,"White");
 BA.debugLineNum = 97;BA.debugLine="tab_unclicked=Colors.ARGB(255,0,111,196)";
Debug.ShouldStop(1);
officedetail._tab_unclicked = officedetail.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 111)),(Object)(BA.numberCast(int.class, 196)));
 BA.debugLineNum = 98;BA.debugLine="FunctionAll.setCornerRadii(tabRoute,25,25,0,0,0,0";
Debug.ShouldStop(2);
officedetail.mostCurrent._functionall.runVoidMethod ("_setcornerradii",officedetail.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), officedetail.mostCurrent._tabroute.getObject()),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)));
 BA.debugLineNum = 99;BA.debugLine="FunctionAll.setCornerRadii(tabRoute,25,25,0,0,0,0";
Debug.ShouldStop(4);
officedetail.mostCurrent._functionall.runVoidMethod ("_setcornerradii",officedetail.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), officedetail.mostCurrent._tabroute.getObject()),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (officedetail) ","officedetail",2,officedetail.mostCurrent.activityBA,officedetail.mostCurrent,117);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.officedetail.remoteMe.runUserSub(false, "officedetail","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 117;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="CallSub(Starter, \"ActivityIsPaused\")";
Debug.ShouldStop(2097152);
officedetail.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",officedetail.processBA,(Object)((officedetail.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("ActivityIsPaused")));
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Activity_Resume (officedetail) ","officedetail",2,officedetail.mostCurrent.activityBA,officedetail.mostCurrent,102);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.officedetail.remoteMe.runUserSub(false, "officedetail","activity_resume");
 BA.debugLineNum = 102;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32);
 BA.debugLineNum = 105;BA.debugLine="CLV1.Clear";
Debug.ShouldStop(256);
officedetail.mostCurrent._clv1.runVoidMethod ("_clear");
 BA.debugLineNum = 106;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(512);
officedetail.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",officedetail.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Loading..."))));
 BA.debugLineNum = 108;BA.debugLine="If TabHost1.CurrentTab == 2 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",officedetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 109;BA.debugLine="clv.Clear";
Debug.ShouldStop(4096);
officedetail.mostCurrent._clv.runVoidMethod ("_clear");
 BA.debugLineNum = 110;BA.debugLine="ExecuteRemoteQuery(\"SELECT photo_url, upload_dat";
Debug.ShouldStop(8192);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT photo_url, upload_date FROM office_building_gallery WHERE office_building_id='"),officedetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("Download"));
 }else {
 BA.debugLineNum = 112;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.office_building_id,";
Debug.ShouldStop(32768);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.office_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id ='"),officedetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("FASILITAS"));
 BA.debugLineNum = 113;BA.debugLine="ExecuteRemoteQuery(\"SELECT O.office_building_id,";
Debug.ShouldStop(65536);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT O.office_building_id, O.name_of_office_building, O.building_area, O.land_area, O.parking_area, O.standing_year, O.electricity_capacity, O.address, O.type_of_construction, O.type_of_office, ST_X(ST_Centroid(O.geom)) As longitude, ST_Y(ST_CENTROID(O.geom)) As latitude,T.name_of_type As constr, J.name_of_type As typeof,	ST_AsText(geom) As geom	FROM office_building As O LEFT JOIN type_of_construction As T ON O.type_of_construction=T.type_id LEFT JOIN type_of_office As J ON O.type_of_office=J.type_id WHERE O.office_building_id='"),officedetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("DATA"));
 };
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("AddPicture_Click (officedetail) ","officedetail",2,officedetail.mostCurrent.activityBA,officedetail.mostCurrent,260);
if (RapidSub.canDelegate("addpicture_click")) return b4a.example.officedetail.remoteMe.runUserSub(false, "officedetail","addpicture_click");
 BA.debugLineNum = 260;BA.debugLine="Sub AddPicture_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 261;BA.debugLine="ToastMessageShow(\"Add photo\",True)";
Debug.ShouldStop(16);
officedetail.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Add photo")),(Object)(officedetail.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 262;BA.debugLine="StartActivity(AddPhoto)";
Debug.ShouldStop(32);
officedetail.mostCurrent.__c.runVoidMethod ("StartActivity",officedetail.processBA,(Object)((officedetail.mostCurrent._addphoto.getObject())));
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("BackArrow_Click (officedetail) ","officedetail",2,officedetail.mostCurrent.activityBA,officedetail.mostCurrent,265);
if (RapidSub.canDelegate("backarrow_click")) return b4a.example.officedetail.remoteMe.runUserSub(false, "officedetail","backarrow_click");
 BA.debugLineNum = 265;BA.debugLine="Sub BackArrow_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 266;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
officedetail.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 267;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("CreateItem (officedetail) ","officedetail",2,officedetail.mostCurrent.activityBA,officedetail.mostCurrent,121);
if (RapidSub.canDelegate("createitem")) return b4a.example.officedetail.remoteMe.runUserSub(false, "officedetail","createitem", _width, _title, _content);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Title", _title);
Debug.locals.put("Content", _content);
 BA.debugLineNum = 121;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(33554432);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = officedetail._xui.runMethod(false,"CreatePanel",officedetail.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 123;BA.debugLine="p.LoadLayout(\"facility_list\")";
Debug.ShouldStop(67108864);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("facility_list")),officedetail.mostCurrent.activityBA);
 BA.debugLineNum = 124;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, 5%y)";
Debug.ShouldStop(134217728);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(officedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),officedetail.mostCurrent.activityBA)));
 BA.debugLineNum = 125;BA.debugLine="numfc.Text = Title";
Debug.ShouldStop(268435456);
officedetail.mostCurrent._numfc.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 126;BA.debugLine="namefc.Text = Content";
Debug.ShouldStop(536870912);
officedetail.mostCurrent._namefc.runMethod(true,"setText",BA.ObjectToCharSequence(_content));
 BA.debugLineNum = 127;BA.debugLine="Return p";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("editBtn_Click (officedetail) ","officedetail",2,officedetail.mostCurrent.activityBA,officedetail.mostCurrent,316);
if (RapidSub.canDelegate("editbtn_click")) return b4a.example.officedetail.remoteMe.runUserSub(false, "officedetail","editbtn_click");
 BA.debugLineNum = 316;BA.debugLine="Sub editBtn_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 317;BA.debugLine="StartActivity(OfficeEdit)";
Debug.ShouldStop(268435456);
officedetail.mostCurrent.__c.runVoidMethod ("StartActivity",officedetail.processBA,(Object)((officedetail.mostCurrent._officeedit.getObject())));
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("editFacility_Click (officedetail) ","officedetail",2,officedetail.mostCurrent.activityBA,officedetail.mostCurrent,320);
if (RapidSub.canDelegate("editfacility_click")) return b4a.example.officedetail.remoteMe.runUserSub(false, "officedetail","editfacility_click");
 BA.debugLineNum = 320;BA.debugLine="Sub editFacility_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 321;BA.debugLine="StartActivity(EditBuildingFacility)";
Debug.ShouldStop(1);
officedetail.mostCurrent.__c.runVoidMethod ("StartActivity",officedetail.processBA,(Object)((officedetail.mostCurrent._editbuildingfacility.getObject())));
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("ExecuteRemoteQuery (officedetail) ","officedetail",2,officedetail.mostCurrent.activityBA,officedetail.mostCurrent,130);
if (RapidSub.canDelegate("executeremotequery")) return b4a.example.officedetail.remoteMe.runUserSub(false, "officedetail","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 130;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(4);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 132;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(8);
_job.runVoidMethod ("_initialize",officedetail.processBA,(Object)(_jobname),(Object)(officedetail.getObject()));
 BA.debugLineNum = 133;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
Debug.ShouldStop(16);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),officedetail.mostCurrent._main._server,RemoteObject.createImmutable("mobile/json.php"))),(Object)(_query));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim ScrollImage As ScrollView";
officedetail.mostCurrent._scrollimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim clv As CustomListView";
officedetail.mostCurrent._clv = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 19;BA.debugLine="Dim Label1 As Label";
officedetail.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim ImageView1 As ImageView";
officedetail.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private CLV1 As CustomListView";
officedetail.mostCurrent._clv1 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 23;BA.debugLine="Private ScrollView1 As ScrollView";
officedetail.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private TitleBar As Label";
officedetail.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private BackArrow As Label";
officedetail.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private PanelBuildingList As Panel";
officedetail.mostCurrent._panelbuildinglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private numfc As B4XView";
officedetail.mostCurrent._numfc = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private namefc As B4XView";
officedetail.mostCurrent._namefc = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private btnGallery As Panel";
officedetail.mostCurrent._btngallery = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private PFacility As Panel";
officedetail.mostCurrent._pfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private ListItem As Panel";
officedetail.mostCurrent._listitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private PanelButton As Panel";
officedetail.mostCurrent._panelbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Dim OfficeName As Label";
officedetail.mostCurrent._officename = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private TypeOfOffice As Label";
officedetail.mostCurrent._typeofoffice = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private StandingYear As Label";
officedetail.mostCurrent._standingyear = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private BuildingArea As Label";
officedetail.mostCurrent._buildingarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private LandArea As Label";
officedetail.mostCurrent._landarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private ParkingArea As Label";
officedetail.mostCurrent._parkingarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private Electricity As Label";
officedetail.mostCurrent._electricity = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private Construction As Label";
officedetail.mostCurrent._construction = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private PanelToolBar As Panel";
officedetail.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Dim ids As String";
officedetail.mostCurrent._ids = RemoteObject.createImmutable("");
 //BA.debugLineNum = 44;BA.debugLine="Private LblEdit As Label";
officedetail.mostCurrent._lbledit = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private LblFacility As Label";
officedetail.mostCurrent._lblfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private Panel4 As Panel";
officedetail.mostCurrent._panel4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private PanelMap As Panel";
officedetail.mostCurrent._panelmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private btnRoute As Button";
officedetail.mostCurrent._btnroute = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private WebViewRoute As WebView";
officedetail.mostCurrent._webviewroute = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private editBtn As Button";
officedetail.mostCurrent._editbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private editFacility As Button";
officedetail.mostCurrent._editfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private PanelGallery As Panel";
officedetail.mostCurrent._panelgallery = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private tabRoute As Panel";
officedetail.mostCurrent._tabroute = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private tabDetail As Panel";
officedetail.mostCurrent._tabdetail = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private AddPicture As Button";
officedetail.mostCurrent._addpicture = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private TabHost1 As TabHost";
officedetail.mostCurrent._tabhost1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabHostWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Dim TabManager As TabHostExtras";
officedetail.mostCurrent._tabmanager = RemoteObject.createNew ("uk.co.martinpearman.b4a.tabhostextras.TabHostExtras");
 //BA.debugLineNum = 60;BA.debugLine="Dim tab_clicked, tab_unclicked As Int";
officedetail._tab_clicked = RemoteObject.createImmutable(0);
officedetail._tab_unclicked = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 61;BA.debugLine="Private tabGallery As Panel";
officedetail.mostCurrent._tabgallery = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imageview1_click() throws Exception{
try {
		Debug.PushSubsStack("ImageView1_Click (officedetail) ","officedetail",2,officedetail.mostCurrent.activityBA,officedetail.mostCurrent,324);
if (RapidSub.canDelegate("imageview1_click")) return b4a.example.officedetail.remoteMe.runUserSub(false, "officedetail","imageview1_click");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _bd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 324;BA.debugLine="Sub ImageView1_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 325;BA.debugLine="Dim iv As ImageView";
Debug.ShouldStop(16);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 326;BA.debugLine="iv = Sender";
Debug.ShouldStop(32);
_iv.setObject(officedetail.mostCurrent.__c.runMethod(false,"Sender",officedetail.mostCurrent.activityBA));
 BA.debugLineNum = 327;BA.debugLine="If iv.Background Is BitmapDrawable Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("i",_iv.runMethod(false,"getBackground"), RemoteObject.createImmutable("android.graphics.drawable.BitmapDrawable"))) { 
 BA.debugLineNum = 329;BA.debugLine="Dim bd As BitmapDrawable";
Debug.ShouldStop(256);
_bd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bd", _bd);
 BA.debugLineNum = 330;BA.debugLine="bd = iv.Background";
Debug.ShouldStop(512);
_bd.setObject(_iv.runMethod(false,"getBackground"));
 BA.debugLineNum = 331;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(1024);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 332;BA.debugLine="bmp = bd.Bitmap";
Debug.ShouldStop(2048);
_bmp.setObject(_bd.runMethod(false,"getBitmap"));
 BA.debugLineNum = 333;BA.debugLine="CallSubDelayed2(ShowImage, \"Show\", bmp)";
Debug.ShouldStop(4096);
officedetail.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",officedetail.processBA,(Object)((officedetail.mostCurrent._showimage.getObject())),(Object)(BA.ObjectToString("Show")),(Object)((_bmp)));
 };
 BA.debugLineNum = 335;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("JobDone (officedetail) ","officedetail",2,officedetail.mostCurrent.activityBA,officedetail.mostCurrent,136);
if (RapidSub.canDelegate("jobdone")) return b4a.example.officedetail.remoteMe.runUserSub(false, "officedetail","jobdone", _job);
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
 BA.debugLineNum = 136;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(256);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 138;BA.debugLine="Dim res As String";
Debug.ShouldStop(512);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 139;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(1024);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 140;BA.debugLine="Log(\"Response from server :\"& res)";
Debug.ShouldStop(2048);
officedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 141;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(4096);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 142;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(8192);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 143;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(16384);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("Download"),BA.ObjectToString("FASILITAS"),BA.ObjectToString("DATA"))) {
case 0: {
 BA.debugLineNum = 146;BA.debugLine="Dim agn As List";
Debug.ShouldStop(131072);
_agn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 147;BA.debugLine="agn=parser.NextArray";
Debug.ShouldStop(262144);
_agn = _parser.runMethod(false,"NextArray");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 148;BA.debugLine="If agn.Size - 1 < 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 149;BA.debugLine="Log(agn.Size)";
Debug.ShouldStop(1048576);
officedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_agn.runMethod(true,"getSize"))));
 BA.debugLineNum = 150;BA.debugLine="Dim NotFound As Label";
Debug.ShouldStop(2097152);
_notfound = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("NotFound", _notfound);
 BA.debugLineNum = 151;BA.debugLine="NotFound.Initialize(\"\")";
Debug.ShouldStop(4194304);
_notfound.runVoidMethod ("Initialize",officedetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 152;BA.debugLine="PanelGallery.Color= Colors.White";
Debug.ShouldStop(8388608);
officedetail.mostCurrent._panelgallery.runVoidMethod ("setColor",officedetail.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 153;BA.debugLine="PanelGallery.AddView(NotFound,0,0,100%x,70%y)";
Debug.ShouldStop(16777216);
officedetail.mostCurrent._panelgallery.runVoidMethod ("AddView",(Object)((_notfound.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(officedetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),officedetail.mostCurrent.activityBA)),(Object)(officedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),officedetail.mostCurrent.activityBA)));
 BA.debugLineNum = 154;BA.debugLine="NotFound.Text = \"Picture doesn't exist\"";
Debug.ShouldStop(33554432);
_notfound.runMethod(true,"setText",BA.ObjectToCharSequence("Picture doesn't exist"));
 BA.debugLineNum = 155;BA.debugLine="NotFound.TextSize = 15";
Debug.ShouldStop(67108864);
_notfound.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 156;BA.debugLine="NotFound.Gravity = Gravity.CENTER";
Debug.ShouldStop(134217728);
_notfound.runMethod(true,"setGravity",officedetail.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 157;BA.debugLine="PanelGallery.Height = NotFound.Height";
Debug.ShouldStop(268435456);
officedetail.mostCurrent._panelgallery.runMethod(true,"setHeight",_notfound.runMethod(true,"getHeight"));
 BA.debugLineNum = 159;BA.debugLine="Msgbox(\"Galery Foto tidak ditemukan\", \"Pering";
Debug.ShouldStop(1073741824);
officedetail.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Galery Foto tidak ditemukan")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Peringatan"))),officedetail.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 161;BA.debugLine="ScrollImage.Initialize(100%y)";
Debug.ShouldStop(1);
officedetail.mostCurrent._scrollimage.runVoidMethod ("Initialize",officedetail.mostCurrent.activityBA,(Object)(officedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),officedetail.mostCurrent.activityBA)));
 BA.debugLineNum = 162;BA.debugLine="PanelGallery.AddView(ScrollImage,0,0,100%x,10";
Debug.ShouldStop(2);
officedetail.mostCurrent._panelgallery.runVoidMethod ("AddView",(Object)((officedetail.mostCurrent._scrollimage.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(officedetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),officedetail.mostCurrent.activityBA)),(Object)(officedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),officedetail.mostCurrent.activityBA)));
 BA.debugLineNum = 163;BA.debugLine="ScrollImage.Panel.LoadLayout(\"LoaderImage\")";
Debug.ShouldStop(4);
officedetail.mostCurrent._scrollimage.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LoaderImage")),officedetail.mostCurrent.activityBA);
 BA.debugLineNum = 164;BA.debugLine="For i=0 To agn.Size-1";
Debug.ShouldStop(8);
{
final int step26 = 1;
final int limit26 = RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26) ;_i = ((int)(0 + _i + step26))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 165;BA.debugLine="Dim w As Map";
Debug.ShouldStop(16);
_w = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("w", _w);
 BA.debugLineNum = 166;BA.debugLine="w=agn.Get(i)";
Debug.ShouldStop(32);
_w.setObject(_agn.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 167;BA.debugLine="Dim image = w.Get(\"photo_url\") As String";
Debug.ShouldStop(64);
_image = BA.ObjectToString(_w.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("photo_url")))));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 168;BA.debugLine="Dim gambar = \"\"&Main.Server&\"Files/Office/im";
Debug.ShouldStop(128);
_gambar = RemoteObject.concat(RemoteObject.createImmutable(""),officedetail.mostCurrent._main._server,RemoteObject.createImmutable("Files/Office/img/"),_image);Debug.locals.put("gambar", _gambar);Debug.locals.put("gambar", _gambar);
 BA.debugLineNum = 169;BA.debugLine="Dim m As Map";
Debug.ShouldStop(256);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 170;BA.debugLine="m.Initialize";
Debug.ShouldStop(512);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 171;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(1024);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 172;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(2048);
_p.runVoidMethod ("Initialize",officedetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 173;BA.debugLine="p.SetLayout(0,0,100%x,20%y)";
Debug.ShouldStop(4096);
_p.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(officedetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),officedetail.mostCurrent.activityBA)),(Object)(officedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),officedetail.mostCurrent.activityBA)));
 BA.debugLineNum = 174;BA.debugLine="p.LoadLayout(\"listitem-image\")";
Debug.ShouldStop(8192);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("listitem-image")),officedetail.mostCurrent.activityBA);
 BA.debugLineNum = 175;BA.debugLine="clv.Add(p,m)";
Debug.ShouldStop(16384);
officedetail.mostCurrent._clv.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()),(Object)((_m.getObject())));
 BA.debugLineNum = 176;BA.debugLine="m.Put(ImageView1, gambar)";
Debug.ShouldStop(32768);
_m.runVoidMethod ("Put",(Object)((officedetail.mostCurrent._imageview1.getObject())),(Object)((_gambar)));
 BA.debugLineNum = 177;BA.debugLine="Log (gambar)";
Debug.ShouldStop(65536);
officedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(_gambar));
 BA.debugLineNum = 178;BA.debugLine="CallSubDelayed2(Starter, \"Download\", m)";
Debug.ShouldStop(131072);
officedetail.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",officedetail.processBA,(Object)((officedetail.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_m)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 180;BA.debugLine="ScrollView1.Height = 100%y - ScrollView1.Top";
Debug.ShouldStop(524288);
officedetail.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {officedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),officedetail.mostCurrent.activityBA),officedetail.mostCurrent._scrollview1.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 181;BA.debugLine="ScrollImage.Panel.Height = (ImageView1.Height";
Debug.ShouldStop(1048576);
officedetail.mostCurrent._scrollimage.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {officedetail.mostCurrent._imageview1.runMethod(true,"getHeight"),officedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),officedetail.mostCurrent.activityBA)}, "+",1, 1)),_agn.runMethod(true,"getSize")}, "*",0, 1));
 BA.debugLineNum = 182;BA.debugLine="ScrollImage.Height = 70%y";
Debug.ShouldStop(2097152);
officedetail.mostCurrent._scrollimage.runMethod(true,"setHeight",officedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),officedetail.mostCurrent.activityBA));
 BA.debugLineNum = 183;BA.debugLine="PanelGallery.Height = ScrollImage.Height";
Debug.ShouldStop(4194304);
officedetail.mostCurrent._panelgallery.runMethod(true,"setHeight",officedetail.mostCurrent._scrollimage.runMethod(true,"getHeight"));
 BA.debugLineNum = 184;BA.debugLine="TabHost1.Height = ScrollImage.Height";
Debug.ShouldStop(8388608);
officedetail.mostCurrent._tabhost1.runMethod(true,"setHeight",officedetail.mostCurrent._scrollimage.runMethod(true,"getHeight"));
 };
 BA.debugLineNum = 186;BA.debugLine="AddPicture.RemoveView";
Debug.ShouldStop(33554432);
officedetail.mostCurrent._addpicture.runVoidMethod ("RemoveView");
 BA.debugLineNum = 187;BA.debugLine="PanelBuildingList.AddView(AddPicture,0, TabHos";
Debug.ShouldStop(67108864);
officedetail.mostCurrent._panelbuildinglist.runVoidMethod ("AddView",(Object)((officedetail.mostCurrent._addpicture.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {officedetail.mostCurrent._tabhost1.runMethod(true,"getHeight"),officedetail.mostCurrent._tabhost1.runMethod(true,"getTop")}, "+",1, 1)),(Object)(officedetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),officedetail.mostCurrent.activityBA)),(Object)(officedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),officedetail.mostCurrent.activityBA)));
 BA.debugLineNum = 188;BA.debugLine="PanelBuildingList.Height = AddPicture.Top + Ad";
Debug.ShouldStop(134217728);
officedetail.mostCurrent._panelbuildinglist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {officedetail.mostCurrent._addpicture.runMethod(true,"getTop"),officedetail.mostCurrent._addpicture.runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 189;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.H";
Debug.ShouldStop(268435456);
officedetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",officedetail.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 BA.debugLineNum = 190;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(536870912);
officedetail.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 191;BA.debugLine="FunctionAll.setCornerRadii(tabRoute,25,25,0,0,0";
Debug.ShouldStop(1073741824);
officedetail.mostCurrent._functionall.runVoidMethod ("_setcornerradii",officedetail.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), officedetail.mostCurrent._tabroute.getObject()),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)));
 BA.debugLineNum = 192;BA.debugLine="FunctionAll.setCornerRadii(tabGallery,0,0,25,2";
Debug.ShouldStop(-2147483648);
officedetail.mostCurrent._functionall.runVoidMethod ("_setcornerradii",officedetail.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), officedetail.mostCurrent._tabgallery.getObject()),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 break; }
case 1: {
 BA.debugLineNum = 195;BA.debugLine="Dim fasilitas_array As List";
Debug.ShouldStop(4);
_fasilitas_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("fasilitas_array", _fasilitas_array);
 BA.debugLineNum = 196;BA.debugLine="fasilitas_array = parser.NextArray";
Debug.ShouldStop(8);
_fasilitas_array = _parser.runMethod(false,"NextArray");Debug.locals.put("fasilitas_array", _fasilitas_array);
 BA.debugLineNum = 197;BA.debugLine="If fasilitas_array.Size-1 < 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_fasilitas_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 198;BA.debugLine="CLV1.AsView.Visible= False";
Debug.ShouldStop(32);
officedetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"setVisible",officedetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 199;BA.debugLine="Dim NotExist As Label";
Debug.ShouldStop(64);
_notexist = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("NotExist", _notexist);
 BA.debugLineNum = 200;BA.debugLine="NotExist.Initialize(\"\")";
Debug.ShouldStop(128);
_notexist.runVoidMethod ("Initialize",officedetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 201;BA.debugLine="PFacility.AddView(NotExist,LblFacility.Left,0";
Debug.ShouldStop(256);
officedetail.mostCurrent._pfacility.runVoidMethod ("AddView",(Object)((_notexist.getObject())),(Object)(officedetail.mostCurrent._lblfacility.runMethod(true,"getLeft")),(Object)(BA.numberCast(int.class, 0)),(Object)(officedetail.mostCurrent._lblfacility.runMethod(true,"getWidth")),(Object)(officedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),officedetail.mostCurrent.activityBA)));
 BA.debugLineNum = 202;BA.debugLine="NotExist.Gravity= Gravity.CENTER";
Debug.ShouldStop(512);
_notexist.runMethod(true,"setGravity",officedetail.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 203;BA.debugLine="NotExist.Text=\"Facility doesn't not exist.\"";
Debug.ShouldStop(1024);
_notexist.runMethod(true,"setText",BA.ObjectToCharSequence("Facility doesn't not exist."));
 BA.debugLineNum = 204;BA.debugLine="Select TabHost1.CurrentTab";
Debug.ShouldStop(2048);
switch (BA.switchObjectToInt(officedetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 206;BA.debugLine="PFacility.Height= NotExist.Height + NotExis";
Debug.ShouldStop(8192);
officedetail.mostCurrent._pfacility.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_notexist.runMethod(true,"getHeight"),_notexist.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 207;BA.debugLine="TabHost1.Height = PFacility.Top+PFacility.H";
Debug.ShouldStop(16384);
officedetail.mostCurrent._tabhost1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {officedetail.mostCurrent._pfacility.runMethod(true,"getTop"),officedetail.mostCurrent._pfacility.runMethod(true,"getHeight")}, "+",1, 1));
 break; }
}
;
 }else {
 BA.debugLineNum = 210;BA.debugLine="For i=0 To fasilitas_array.Size - 1";
Debug.ShouldStop(131072);
{
final int step71 = 1;
final int limit71 = RemoteObject.solve(new RemoteObject[] {_fasilitas_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step71 > 0 && _i <= limit71) || (step71 < 0 && _i >= limit71) ;_i = ((int)(0 + _i + step71))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 211;BA.debugLine="Dim a As Map";
Debug.ShouldStop(262144);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 212;BA.debugLine="a = fasilitas_array.Get(i)";
Debug.ShouldStop(524288);
_a.setObject(_fasilitas_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 214;BA.debugLine="Dim content As String = a.Get(\"name_of_facil";
Debug.ShouldStop(2097152);
_content = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_facility")))));Debug.locals.put("content", _content);Debug.locals.put("content", _content);
 BA.debugLineNum = 215;BA.debugLine="Dim quantity As Int = a.Get(\"quantity_of_fac";
Debug.ShouldStop(4194304);
_quantity = BA.numberCast(int.class, _a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("quantity_of_facilities")))));Debug.locals.put("quantity", _quantity);Debug.locals.put("quantity", _quantity);
 BA.debugLineNum = 216;BA.debugLine="CLV1.Add(CreateItem(CLV1.AsView.Width, $\"${q";
Debug.ShouldStop(8388608);
officedetail.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(officedetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getWidth"),(RemoteObject.concat(RemoteObject.createImmutable(""),officedetail.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_quantity))),RemoteObject.createImmutable(""))),_content).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 217;BA.debugLine="CLV1.AsView.Height = ListItem.Height*(i+1)";
Debug.ShouldStop(16777216);
officedetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {officedetail.mostCurrent._listitem.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))}, "*",0, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 219;BA.debugLine="CLV1.sv.Height = CLV1.AsView.Height";
Debug.ShouldStop(67108864);
officedetail.mostCurrent._clv1.getField(false,"_sv").runMethod(true,"setHeight",officedetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 220;BA.debugLine="PFacility.Height = LblFacility.Height + LblFa";
Debug.ShouldStop(134217728);
officedetail.mostCurrent._pfacility.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {officedetail.mostCurrent._lblfacility.runMethod(true,"getHeight"),officedetail.mostCurrent._lblfacility.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 221;BA.debugLine="PFacility.Height = PFacility.Height + CLV1.sv";
Debug.ShouldStop(268435456);
officedetail.mostCurrent._pfacility.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {officedetail.mostCurrent._pfacility.runMethod(true,"getHeight"),officedetail.mostCurrent._clv1.getField(false,"_sv").runMethod(true,"getHeight"),officedetail.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getTop")}, "++",2, 1));
 BA.debugLineNum = 222;BA.debugLine="If TabHost1.CurrentTab = 1 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",officedetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 223;BA.debugLine="TabHost1.Height = PFacility.Top+PFacility.H";
Debug.ShouldStop(1073741824);
officedetail.mostCurrent._tabhost1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {officedetail.mostCurrent._pfacility.runMethod(true,"getTop"),officedetail.mostCurrent._pfacility.runMethod(true,"getHeight"),officedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),officedetail.mostCurrent.activityBA)}, "++",2, 1));
 };
 };
 BA.debugLineNum = 226;BA.debugLine="PanelBuildingList.Height = TabHost1.Height + T";
Debug.ShouldStop(2);
officedetail.mostCurrent._panelbuildinglist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {officedetail.mostCurrent._tabhost1.runMethod(true,"getHeight"),officedetail.mostCurrent._tabhost1.runMethod(true,"getTop"),officedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),officedetail.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 227;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.H";
Debug.ShouldStop(4);
officedetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",officedetail.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 BA.debugLineNum = 228;BA.debugLine="ScrollView1.Height = ScrollView1.Panel.Height";
Debug.ShouldStop(8);
officedetail.mostCurrent._scrollview1.runMethod(true,"setHeight",officedetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"getHeight"));
 BA.debugLineNum = 229;BA.debugLine="Log(content)";
Debug.ShouldStop(16);
officedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(_content));
 BA.debugLineNum = 230;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32);
officedetail.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 231;BA.debugLine="FunctionAll.setCornerRadii(tabRoute,25,25,0,0,";
Debug.ShouldStop(64);
officedetail.mostCurrent._functionall.runVoidMethod ("_setcornerradii",officedetail.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), officedetail.mostCurrent._tabroute.getObject()),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)));
 BA.debugLineNum = 232;BA.debugLine="FunctionAll.setCornerRadii(tabGallery,0,0,25,2";
Debug.ShouldStop(128);
officedetail.mostCurrent._functionall.runVoidMethod ("_setcornerradii",officedetail.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), officedetail.mostCurrent._tabgallery.getObject()),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 break; }
case 2: {
 BA.debugLineNum = 235;BA.debugLine="Dim data_array As List";
Debug.ShouldStop(1024);
_data_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 236;BA.debugLine="data_array = parser.NextArray";
Debug.ShouldStop(2048);
_data_array = _parser.runMethod(false,"NextArray");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 237;BA.debugLine="For i=0 To data_array.Size -1";
Debug.ShouldStop(4096);
{
final int step96 = 1;
final int limit96 = RemoteObject.solve(new RemoteObject[] {_data_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step96 > 0 && _i <= limit96) || (step96 < 0 && _i >= limit96) ;_i = ((int)(0 + _i + step96))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 238;BA.debugLine="Dim a As Map";
Debug.ShouldStop(8192);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 239;BA.debugLine="a = data_array.Get(i)";
Debug.ShouldStop(16384);
_a.setObject(_data_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 240;BA.debugLine="lat = a.Get(\"latitude\")";
Debug.ShouldStop(32768);
officedetail._lat = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("latitude")))));
 BA.debugLineNum = 241;BA.debugLine="lng = a.Get(\"longitude\")";
Debug.ShouldStop(65536);
officedetail._lng = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("longitude")))));
 BA.debugLineNum = 242;BA.debugLine="Log(lat)";
Debug.ShouldStop(131072);
officedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(officedetail._lat));
 BA.debugLineNum = 243;BA.debugLine="Log(lng)";
Debug.ShouldStop(262144);
officedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(officedetail._lng));
 BA.debugLineNum = 244;BA.debugLine="OfficeName.Text = a.Get(\"name_of_office_build";
Debug.ShouldStop(524288);
officedetail.mostCurrent._officename.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_office_building"))))));
 BA.debugLineNum = 245;BA.debugLine="TypeOfOffice.Text = a.Get(\"typeof\")";
Debug.ShouldStop(1048576);
officedetail.mostCurrent._typeofoffice.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("typeof"))))));
 BA.debugLineNum = 246;BA.debugLine="StandingYear.Text = a.Get(\"standing_year\")";
Debug.ShouldStop(2097152);
officedetail.mostCurrent._standingyear.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("standing_year"))))));
 BA.debugLineNum = 247;BA.debugLine="BuildingArea.Text = a.Get(\"building_area\")";
Debug.ShouldStop(4194304);
officedetail.mostCurrent._buildingarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("building_area"))))));
 BA.debugLineNum = 248;BA.debugLine="LandArea.Text = a.Get(\"land_area\")";
Debug.ShouldStop(8388608);
officedetail.mostCurrent._landarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("land_area"))))));
 BA.debugLineNum = 249;BA.debugLine="ParkingArea.Text = a.Get(\"parking_area\")";
Debug.ShouldStop(16777216);
officedetail.mostCurrent._parkingarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parking_area"))))));
 BA.debugLineNum = 250;BA.debugLine="Electricity.Text = a.Get(\"electricity_capacit";
Debug.ShouldStop(33554432);
officedetail.mostCurrent._electricity.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("electricity_capacity"))))));
 BA.debugLineNum = 251;BA.debugLine="Construction.Text = a.Get(\"constr\")";
Debug.ShouldStop(67108864);
officedetail.mostCurrent._construction.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("constr"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 253;BA.debugLine="FunctionAll.setCornerRadii(tabRoute,25,25,0,0,";
Debug.ShouldStop(268435456);
officedetail.mostCurrent._functionall.runVoidMethod ("_setcornerradii",officedetail.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), officedetail.mostCurrent._tabroute.getObject()),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)));
 BA.debugLineNum = 254;BA.debugLine="FunctionAll.setCornerRadii(tabGallery,0,0,25,2";
Debug.ShouldStop(536870912);
officedetail.mostCurrent._functionall.runVoidMethod ("_setcornerradii",officedetail.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), officedetail.mostCurrent._tabgallery.getObject()),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 break; }
}
;
 };
 BA.debugLineNum = 257;BA.debugLine="Job.Release";
Debug.ShouldStop(1);
_job.runVoidMethod ("_release");
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
officedetail._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim lat, lng As String";
officedetail._lat = RemoteObject.createImmutable("");
officedetail._lng = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _tabhost1_tabchanged() throws Exception{
try {
		Debug.PushSubsStack("TabHost1_TabChanged (officedetail) ","officedetail",2,officedetail.mostCurrent.activityBA,officedetail.mostCurrent,269);
if (RapidSub.canDelegate("tabhost1_tabchanged")) return b4a.example.officedetail.remoteMe.runUserSub(false, "officedetail","tabhost1_tabchanged");
 BA.debugLineNum = 269;BA.debugLine="Sub TabHost1_TabChanged";
Debug.ShouldStop(4096);
 BA.debugLineNum = 271;BA.debugLine="Select TabHost1.CurrentTab";
Debug.ShouldStop(16384);
switch (BA.switchObjectToInt(officedetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 274;BA.debugLine="tabRoute.Color = tab_clicked";
Debug.ShouldStop(131072);
officedetail.mostCurrent._tabroute.runVoidMethod ("setColor",officedetail._tab_clicked);
 BA.debugLineNum = 275;BA.debugLine="tabDetail.Color= tab_unclicked";
Debug.ShouldStop(262144);
officedetail.mostCurrent._tabdetail.runVoidMethod ("setColor",officedetail._tab_unclicked);
 BA.debugLineNum = 276;BA.debugLine="tabGallery.Color= tab_unclicked";
Debug.ShouldStop(524288);
officedetail.mostCurrent._tabgallery.runVoidMethod ("setColor",officedetail._tab_unclicked);
 BA.debugLineNum = 277;BA.debugLine="FunctionAll.setCornerRadii(tabRoute,25,25,0,0,0";
Debug.ShouldStop(1048576);
officedetail.mostCurrent._functionall.runVoidMethod ("_setcornerradii",officedetail.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), officedetail.mostCurrent._tabroute.getObject()),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)));
 BA.debugLineNum = 278;BA.debugLine="FunctionAll.setCornerRadii(tabGallery,0,0,25,25";
Debug.ShouldStop(2097152);
officedetail.mostCurrent._functionall.runVoidMethod ("_setcornerradii",officedetail.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), officedetail.mostCurrent._tabgallery.getObject()),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 279;BA.debugLine="WebViewRoute.LoadUrl(Main.Server&\"Office/Route.";
Debug.ShouldStop(4194304);
officedetail.mostCurrent._webviewroute.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(officedetail.mostCurrent._main._server,RemoteObject.createImmutable("Office/Route.php?lat="),officedetail.mostCurrent._main._lbllat,RemoteObject.createImmutable("&lng="),officedetail.mostCurrent._main._lbllon,RemoteObject.createImmutable("&latd="),officedetail._lat,RemoteObject.createImmutable("&lngd="),officedetail._lng)));
 BA.debugLineNum = 280;BA.debugLine="Msgbox(\"Current tab is \" & TabHost1.CurrentTab,";
Debug.ShouldStop(8388608);
officedetail.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Current tab is "),officedetail.mostCurrent._tabhost1.runMethod(true,"getCurrentTab")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),officedetail.mostCurrent.activityBA);
 BA.debugLineNum = 281;BA.debugLine="Log (\"Button Top :\"&btnRoute.Top)";
Debug.ShouldStop(16777216);
officedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Button Top :"),officedetail.mostCurrent._btnroute.runMethod(true,"getTop"))));
 BA.debugLineNum = 282;BA.debugLine="TabHost1.Height = btnRoute.Top + btnRoute.Heigh";
Debug.ShouldStop(33554432);
officedetail.mostCurrent._tabhost1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {officedetail.mostCurrent._btnroute.runMethod(true,"getTop"),officedetail.mostCurrent._btnroute.runMethod(true,"getHeight"),officedetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),officedetail.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 283;BA.debugLine="Log(\"tabHost height: \"&TabHost1.Height)";
Debug.ShouldStop(67108864);
officedetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("tabHost height: "),officedetail.mostCurrent._tabhost1.runMethod(true,"getHeight"))));
 BA.debugLineNum = 284;BA.debugLine="AddPicture.Visible=False";
Debug.ShouldStop(134217728);
officedetail.mostCurrent._addpicture.runMethod(true,"setVisible",officedetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 285;BA.debugLine="PanelBuildingList.Height = TabHost1.Height + Ta";
Debug.ShouldStop(268435456);
officedetail.mostCurrent._panelbuildinglist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {officedetail.mostCurrent._tabhost1.runMethod(true,"getHeight"),officedetail.mostCurrent._tabhost1.runMethod(true,"getTop")}, "+",1, 1));
 BA.debugLineNum = 286;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.He";
Debug.ShouldStop(536870912);
officedetail.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",officedetail.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 break; }
case 1: {
 BA.debugLineNum = 289;BA.debugLine="tabRoute.Color = tab_unclicked";
Debug.ShouldStop(1);
officedetail.mostCurrent._tabroute.runVoidMethod ("setColor",officedetail._tab_unclicked);
 BA.debugLineNum = 290;BA.debugLine="tabDetail.Color= tab_clicked";
Debug.ShouldStop(2);
officedetail.mostCurrent._tabdetail.runVoidMethod ("setColor",officedetail._tab_clicked);
 BA.debugLineNum = 291;BA.debugLine="tabGallery.Color = tab_unclicked";
Debug.ShouldStop(4);
officedetail.mostCurrent._tabgallery.runVoidMethod ("setColor",officedetail._tab_unclicked);
 BA.debugLineNum = 292;BA.debugLine="FunctionAll.setCornerRadii(tabRoute,25,25,0,0,0";
Debug.ShouldStop(8);
officedetail.mostCurrent._functionall.runVoidMethod ("_setcornerradii",officedetail.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), officedetail.mostCurrent._tabroute.getObject()),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)));
 BA.debugLineNum = 293;BA.debugLine="FunctionAll.setCornerRadii(tabGallery,0,0,25,25";
Debug.ShouldStop(16);
officedetail.mostCurrent._functionall.runVoidMethod ("_setcornerradii",officedetail.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), officedetail.mostCurrent._tabgallery.getObject()),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 294;BA.debugLine="CLV1.Clear";
Debug.ShouldStop(32);
officedetail.mostCurrent._clv1.runVoidMethod ("_clear");
 BA.debugLineNum = 295;BA.debugLine="AddPicture.Visible=False";
Debug.ShouldStop(64);
officedetail.mostCurrent._addpicture.runMethod(true,"setVisible",officedetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 296;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(128);
officedetail.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",officedetail.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Loading..."))));
 BA.debugLineNum = 297;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.office_building_id";
Debug.ShouldStop(256);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.office_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id ='"),officedetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("FASILITAS"));
 BA.debugLineNum = 298;BA.debugLine="ExecuteRemoteQuery(\"SELECT O.office_building_id";
Debug.ShouldStop(512);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT O.office_building_id, O.name_of_office_building, O.building_area, O.land_area, O.parking_area, O.standing_year, O.electricity_capacity, O.address, O.type_of_construction, O.type_of_office, ST_X(ST_Centroid(O.geom)) As longitude, ST_Y(ST_CENTROID(O.geom)) As latitude,T.name_of_type As constr, J.name_of_type As typeof,	ST_AsText(geom) As geom	FROM office_building As O LEFT JOIN type_of_construction As T ON O.type_of_construction=T.type_id LEFT JOIN type_of_office As J ON O.type_of_office=J.type_id WHERE O.office_building_id='"),officedetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("DATA"));
 break; }
case 2: {
 BA.debugLineNum = 302;BA.debugLine="tabRoute.Color = tab_unclicked";
Debug.ShouldStop(8192);
officedetail.mostCurrent._tabroute.runVoidMethod ("setColor",officedetail._tab_unclicked);
 BA.debugLineNum = 303;BA.debugLine="tabDetail.Color = tab_unclicked";
Debug.ShouldStop(16384);
officedetail.mostCurrent._tabdetail.runVoidMethod ("setColor",officedetail._tab_unclicked);
 BA.debugLineNum = 304;BA.debugLine="tabGallery.Color = tab_clicked";
Debug.ShouldStop(32768);
officedetail.mostCurrent._tabgallery.runVoidMethod ("setColor",officedetail._tab_clicked);
 BA.debugLineNum = 305;BA.debugLine="FunctionAll.setCornerRadii(tabRoute,25,25,0,0,0";
Debug.ShouldStop(65536);
officedetail.mostCurrent._functionall.runVoidMethod ("_setcornerradii",officedetail.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), officedetail.mostCurrent._tabroute.getObject()),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)));
 BA.debugLineNum = 306;BA.debugLine="FunctionAll.setCornerRadii(tabGallery,0,0,25,25";
Debug.ShouldStop(131072);
officedetail.mostCurrent._functionall.runVoidMethod ("_setcornerradii",officedetail.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), officedetail.mostCurrent._tabgallery.getObject()),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 25)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 308;BA.debugLine="AddPicture.Visible=True";
Debug.ShouldStop(524288);
officedetail.mostCurrent._addpicture.runMethod(true,"setVisible",officedetail.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 309;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(1048576);
officedetail.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",officedetail.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Loading..."))));
 BA.debugLineNum = 310;BA.debugLine="ExecuteRemoteQuery(\"SELECT photo_url, upload_da";
Debug.ShouldStop(2097152);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT photo_url, upload_date FROM office_building_gallery WHERE office_building_id='"),officedetail.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("Download"));
 break; }
}
;
 BA.debugLineNum = 314;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}