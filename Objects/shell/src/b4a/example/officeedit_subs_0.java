package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class officeedit_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (officeedit) ","officeedit",18,officeedit.mostCurrent.activityBA,officeedit.mostCurrent,46);
if (RapidSub.canDelegate("activity_create")) return b4a.example.officeedit.remoteMe.runUserSub(false, "officeedit","activity_create", _firsttime);
RemoteObject _sv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 46;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 49;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(65536);
officeedit.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),officeedit.mostCurrent.activityBA);
 BA.debugLineNum = 50;BA.debugLine="ScrollView1.Panel.LoadLayout(\"OfficeEdit\")";
Debug.ShouldStop(131072);
officeedit.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("OfficeEdit")),officeedit.mostCurrent.activityBA);
 BA.debugLineNum = 51;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
Debug.ShouldStop(262144);
officeedit.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",officeedit.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 BA.debugLineNum = 52;BA.debugLine="PanelToolBar.Visible = False";
Debug.ShouldStop(524288);
officeedit.mostCurrent._paneltoolbar.runMethod(true,"setVisible",officeedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 53;BA.debugLine="SetBackgroundTintList(OfficeName, Colors.ARGB(225";
Debug.ShouldStop(1048576);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), officeedit.mostCurrent._officename.getObject()),officeedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),officeedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 54;BA.debugLine="SetBackgroundTintList(StandingYear, Colors.ARGB(2";
Debug.ShouldStop(2097152);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), officeedit.mostCurrent._standingyear.getObject()),officeedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),officeedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 55;BA.debugLine="SetBackgroundTintList(BuildingArea, Colors.ARGB(2";
Debug.ShouldStop(4194304);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), officeedit.mostCurrent._buildingarea.getObject()),officeedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),officeedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 56;BA.debugLine="SetBackgroundTintList(LandArea, Colors.ARGB(225,3";
Debug.ShouldStop(8388608);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), officeedit.mostCurrent._landarea.getObject()),officeedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),officeedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 57;BA.debugLine="SetBackgroundTintList(Electricity, Colors.ARGB(22";
Debug.ShouldStop(16777216);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), officeedit.mostCurrent._electricity.getObject()),officeedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),officeedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 58;BA.debugLine="SetBackgroundTintList(ParkingArea, Colors.ARGB(22";
Debug.ShouldStop(33554432);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), officeedit.mostCurrent._parkingarea.getObject()),officeedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),officeedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 60;BA.debugLine="BackArrow.Visible= True";
Debug.ShouldStop(134217728);
officeedit.mostCurrent._backarrow.runMethod(true,"setVisible",officeedit.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 61;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(268435456);
officeedit.mostCurrent._backarrow.runVoidMethod ("SetBackgroundImageNew",(Object)((officeedit.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(officeedit.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("back-arrow.png"))).getObject())));
 BA.debugLineNum = 62;BA.debugLine="TitleBar.Text=\"Building Detail\"";
Debug.ShouldStop(536870912);
officeedit.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("Building Detail"));
 BA.debugLineNum = 65;BA.debugLine="If OfficeBuilding.nameBuilding.Length > 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",officeedit.mostCurrent._officebuilding._namebuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 66;BA.debugLine="OfficeName.Text = OfficeBuilding.nameBuilding";
Debug.ShouldStop(2);
officeedit.mostCurrent._officename.runMethod(true,"setText",BA.ObjectToCharSequence(officeedit.mostCurrent._officebuilding._namebuilding));
 BA.debugLineNum = 67;BA.debugLine="ids = WorshipBuilding.idBuilding";
Debug.ShouldStop(4);
officeedit._ids = officeedit.mostCurrent._worshipbuilding._idbuilding;
 BA.debugLineNum = 68;BA.debugLine="Log(ids)";
Debug.ShouldStop(8);
officeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(officeedit._ids));
 }else 
{ BA.debugLineNum = 69;BA.debugLine="Else If SearchBuilding.nameBuilding.Length > 0 Th";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",officeedit.mostCurrent._searchbuilding._namebuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 70;BA.debugLine="OfficeName.Text = SearchBuilding.nameBuilding";
Debug.ShouldStop(32);
officeedit.mostCurrent._officename.runMethod(true,"setText",BA.ObjectToCharSequence(officeedit.mostCurrent._searchbuilding._namebuilding));
 BA.debugLineNum = 71;BA.debugLine="ids = SearchBuilding.idBuilding";
Debug.ShouldStop(64);
officeedit._ids = officeedit.mostCurrent._searchbuilding._idbuilding;
 BA.debugLineNum = 72;BA.debugLine="Log(ids)";
Debug.ShouldStop(128);
officeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(officeedit._ids));
 }else {
 BA.debugLineNum = 74;BA.debugLine="OfficeName.Text = \"Please press on the button an";
Debug.ShouldStop(512);
officeedit.mostCurrent._officename.runMethod(true,"setText",BA.ObjectToCharSequence("Please press on the button and choose an item."));
 }}
;
 BA.debugLineNum = 77;BA.debugLine="Dim sv As ScrollView";
Debug.ShouldStop(4096);
_sv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");Debug.locals.put("sv", _sv);
 BA.debugLineNum = 78;BA.debugLine="ScrollView1.Height=100%y";
Debug.ShouldStop(8192);
officeedit.mostCurrent._scrollview1.runMethod(true,"setHeight",officeedit.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),officeedit.mostCurrent.activityBA));
 BA.debugLineNum = 79;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
Debug.ShouldStop(16384);
officeedit.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",officeedit.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (officeedit) ","officeedit",18,officeedit.mostCurrent.activityBA,officeedit.mostCurrent,93);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.officeedit.remoteMe.runUserSub(false, "officeedit","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 93;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Activity_Resume (officeedit) ","officeedit",18,officeedit.mostCurrent.activityBA,officeedit.mostCurrent,82);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.officeedit.remoteMe.runUserSub(false, "officeedit","activity_resume");
 BA.debugLineNum = 82;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="OfficeMap.Initialize";
Debug.ShouldStop(262144);
officeedit.mostCurrent._officemap.runVoidMethod ("Initialize");
 BA.debugLineNum = 84;BA.debugLine="ConsMap.Initialize";
Debug.ShouldStop(524288);
officeedit.mostCurrent._consmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 85;BA.debugLine="OfficeMap.Clear";
Debug.ShouldStop(1048576);
officeedit.mostCurrent._officemap.runVoidMethod ("Clear");
 BA.debugLineNum = 86;BA.debugLine="ConsMap.Clear";
Debug.ShouldStop(2097152);
officeedit.mostCurrent._consmap.runVoidMethod ("Clear");
 BA.debugLineNum = 87;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(4194304);
officeedit.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",officeedit.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Loading..."))));
 BA.debugLineNum = 88;BA.debugLine="ExecuteRemoteQuery(\"SELECT O.office_building_id,";
Debug.ShouldStop(8388608);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT O.office_building_id, O.name_of_office_building, O.building_area, O.land_area, O.parking_area, O.standing_year, O.electricity_capacity, O.address, O.type_of_construction, O.type_of_office, ST_X(ST_Centroid(O.geom)) As longitude, ST_Y(ST_CENTROID(O.geom)) As latitude,T.name_of_type As constr, J.name_of_type As typeof,	ST_AsText(geom) As geom	FROM office_building As O LEFT JOIN type_of_construction As T ON O.type_of_construction=T.type_id LEFT JOIN type_of_office As J ON O.type_of_office=J.type_id WHERE O.office_building_id='"),officeedit._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("DATA"));
 BA.debugLineNum = 89;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_type";
Debug.ShouldStop(16777216);
_executeremotequery(BA.ObjectToString("SELECT type_id, name_of_type FROM type_of_office ORDER BY name_of_type ASC"),RemoteObject.createImmutable("TypeOffice"));
 BA.debugLineNum = 90;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_type";
Debug.ShouldStop(33554432);
_executeremotequery(BA.ObjectToString("SELECT type_id, name_of_type FROM type_of_construction ORDER BY name_of_type ASC "),RemoteObject.createImmutable("Construction"));
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
public static RemoteObject  _btngallery_click() throws Exception{
try {
		Debug.PushSubsStack("btnGallery_Click (officeedit) ","officeedit",18,officeedit.mostCurrent.activityBA,officeedit.mostCurrent,210);
if (RapidSub.canDelegate("btngallery_click")) return b4a.example.officeedit.remoteMe.runUserSub(false, "officeedit","btngallery_click");
 BA.debugLineNum = 210;BA.debugLine="Sub btnGallery_Click";
Debug.ShouldStop(131072);
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
public static RemoteObject  _btnsavechanges_click() throws Exception{
try {
		Debug.PushSubsStack("BtnSaveChanges_Click (officeedit) ","officeedit",18,officeedit.mostCurrent.activityBA,officeedit.mostCurrent,228);
if (RapidSub.canDelegate("btnsavechanges_click")) return b4a.example.officeedit.remoteMe.runUserSub(false, "officeedit","btnsavechanges_click");
 BA.debugLineNum = 228;BA.debugLine="Sub BtnSaveChanges_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 229;BA.debugLine="Log(ids)";
Debug.ShouldStop(16);
officeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(officeedit._ids));
 BA.debugLineNum = 230;BA.debugLine="If typeoffice == \"\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",officeedit._typeoffice,BA.ObjectToString(""))) { 
 BA.debugLineNum = 231;BA.debugLine="tipe_i = tipp";
Debug.ShouldStop(64);
officeedit._tipe_i = BA.numberCast(int.class, officeedit._tipp);
 }else {
 BA.debugLineNum = 233;BA.debugLine="tipe_i = typeoffice";
Debug.ShouldStop(256);
officeedit._tipe_i = BA.numberCast(int.class, officeedit._typeoffice);
 };
 BA.debugLineNum = 236;BA.debugLine="lbangunan_i = BuildingArea.Text";
Debug.ShouldStop(2048);
officeedit._lbangunan_i = BA.numberCast(int.class, officeedit.mostCurrent._buildingarea.runMethod(true,"getText"));
 BA.debugLineNum = 237;BA.debugLine="lparkir_i = ParkingArea.Text";
Debug.ShouldStop(4096);
officeedit._lparkir_i = BA.numberCast(int.class, officeedit.mostCurrent._parkingarea.runMethod(true,"getText"));
 BA.debugLineNum = 238;BA.debugLine="ltanah_i = LandArea.Text";
Debug.ShouldStop(8192);
officeedit._ltanah_i = BA.numberCast(int.class, officeedit.mostCurrent._landarea.runMethod(true,"getText"));
 BA.debugLineNum = 239;BA.debugLine="listrik_i = Electricity.Text";
Debug.ShouldStop(16384);
officeedit._listrik_i = BA.numberCast(int.class, officeedit.mostCurrent._electricity.runMethod(true,"getText"));
 BA.debugLineNum = 240;BA.debugLine="tahun_i = StandingYear.Text";
Debug.ShouldStop(32768);
officeedit._tahun_i = BA.numberCast(int.class, officeedit.mostCurrent._standingyear.runMethod(true,"getText"));
 BA.debugLineNum = 242;BA.debugLine="If typecons == \"\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",officeedit._typecons,BA.ObjectToString(""))) { 
 BA.debugLineNum = 243;BA.debugLine="cons_i = cons";
Debug.ShouldStop(262144);
officeedit._cons_i = BA.numberCast(int.class, officeedit._cons);
 }else {
 BA.debugLineNum = 245;BA.debugLine="cons_i = typecons";
Debug.ShouldStop(1048576);
officeedit._cons_i = BA.numberCast(int.class, officeedit._typecons);
 };
 BA.debugLineNum = 248;BA.debugLine="Log(tipe_i)";
Debug.ShouldStop(8388608);
officeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(officeedit._tipe_i)));
 BA.debugLineNum = 249;BA.debugLine="Log(cons_i)";
Debug.ShouldStop(16777216);
officeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(officeedit._cons_i)));
 BA.debugLineNum = 250;BA.debugLine="If IsNumber(tipe_i) Then";
Debug.ShouldStop(33554432);
if (officeedit.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(BA.NumberToString(officeedit._tipe_i))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 251;BA.debugLine="Log(\"\"&tipe_i&\" is a number\")";
Debug.ShouldStop(67108864);
officeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),officeedit._tipe_i,RemoteObject.createImmutable(" is a number"))));
 }else {
 BA.debugLineNum = 253;BA.debugLine="Log(\"\"&tipe_i&\" is not a number\")";
Debug.ShouldStop(268435456);
officeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),officeedit._tipe_i,RemoteObject.createImmutable(" is not a number"))));
 };
 BA.debugLineNum = 255;BA.debugLine="ProgressDialogShow(\"loading...\")";
Debug.ShouldStop(1073741824);
officeedit.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",officeedit.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("loading..."))));
 BA.debugLineNum = 256;BA.debugLine="ExecuteRemoteQuery(\"UPDATE office_building SET na";
Debug.ShouldStop(-2147483648);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("UPDATE office_building SET name_of_office_building = '"),officeedit._nama,RemoteObject.createImmutable("', type_of_office = "),officeedit._tipe_i,RemoteObject.createImmutable(", building_area = "),officeedit._lbangunan_i,RemoteObject.createImmutable(", land_area = "),officeedit._ltanah_i,RemoteObject.createImmutable(", parking_area = "),officeedit._lparkir_i,RemoteObject.createImmutable(", standing_year = '"),officeedit._tahun_i,RemoteObject.createImmutable("', electricity_capacity = "),officeedit._listrik_i,RemoteObject.createImmutable(", type_of_construction = "),officeedit._cons_i,RemoteObject.createImmutable(" WHERE office_building_id = '"),officeedit._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("Update"));
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
public static RemoteObject  _construction_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Construction_ItemClick (officeedit) ","officeedit",18,officeedit.mostCurrent.activityBA,officeedit.mostCurrent,221);
if (RapidSub.canDelegate("construction_itemclick")) return b4a.example.officeedit.remoteMe.runUserSub(false, "officeedit","construction_itemclick", _position, _value);
RemoteObject _idc = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 221;BA.debugLine="Sub Construction_ItemClick (Position As Int, Value";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 222;BA.debugLine="Dim idc As String";
Debug.ShouldStop(536870912);
_idc = RemoteObject.createImmutable("");Debug.locals.put("idc", _idc);
 BA.debugLineNum = 223;BA.debugLine="idc = ConsMap.Get(Value)";
Debug.ShouldStop(1073741824);
_idc = BA.ObjectToString(officeedit.mostCurrent._consmap.runMethod(false,"Get",(Object)(_value)));Debug.locals.put("idc", _idc);
 BA.debugLineNum = 224;BA.debugLine="typecons = idc";
Debug.ShouldStop(-2147483648);
officeedit._typecons = _idc;
 BA.debugLineNum = 225;BA.debugLine="Log(typecons)";
Debug.ShouldStop(1);
officeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(officeedit._typecons));
 BA.debugLineNum = 226;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ExecuteRemoteQuery (officeedit) ","officeedit",18,officeedit.mostCurrent.activityBA,officeedit.mostCurrent,109);
if (RapidSub.canDelegate("executeremotequery")) return b4a.example.officeedit.remoteMe.runUserSub(false, "officeedit","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 109;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(8192);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 111;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(16384);
_job.runVoidMethod ("_initialize",officeedit.processBA,(Object)(_jobname),(Object)(officeedit.getObject()));
 BA.debugLineNum = 112;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
Debug.ShouldStop(32768);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),officeedit.mostCurrent._main._server,RemoteObject.createImmutable("mobile/json.php"))),(Object)(_query));
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 26;BA.debugLine="Private ScrollView1 As ScrollView";
officeedit.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private TitleBar As Label";
officeedit.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private BackArrow As Label";
officeedit.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private PanelBuildingList As Panel";
officeedit.mostCurrent._panelbuildinglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private PanelToolBar As Panel";
officeedit.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Dim OfficeName As Label";
officeedit.mostCurrent._officename = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private TypeOfOffice As Spinner";
officeedit.mostCurrent._typeofoffice = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private StandingYear As Label";
officeedit.mostCurrent._standingyear = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private BuildingArea As Label";
officeedit.mostCurrent._buildingarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private LandArea As Label";
officeedit.mostCurrent._landarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private ParkingArea As Label";
officeedit.mostCurrent._parkingarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private Electricity As Label";
officeedit.mostCurrent._electricity = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private Construction As Spinner";
officeedit.mostCurrent._construction = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private PanelToolBar As Panel";
officeedit.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Dim OfficeMap As Map";
officeedit.mostCurrent._officemap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 42;BA.debugLine="Dim ConsMap As Map";
officeedit.mostCurrent._consmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 43;BA.debugLine="Private BtnSaveChanges As Button";
officeedit.mostCurrent._btnsavechanges = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (officeedit) ","officeedit",18,officeedit.mostCurrent.activityBA,officeedit.mostCurrent,115);
if (RapidSub.canDelegate("jobdone")) return b4a.example.officeedit.remoteMe.runUserSub(false, "officeedit","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _data_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _type_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _namatype = RemoteObject.createImmutable("");
RemoteObject _idtype = RemoteObject.createImmutable("");
RemoteObject _cons_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _j = 0;
RemoteObject _nama_type = RemoteObject.createImmutable("");
RemoteObject _id_type = RemoteObject.createImmutable("");
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
officeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 120;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(8388608);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 121;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(16777216);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 122;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("DATA"),BA.ObjectToString("Update"),BA.ObjectToString("TypeOffice"),BA.ObjectToString("Construction"))) {
case 0: {
 BA.debugLineNum = 124;BA.debugLine="Dim data_array As List";
Debug.ShouldStop(134217728);
_data_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 125;BA.debugLine="data_array = parser.NextArray";
Debug.ShouldStop(268435456);
_data_array = _parser.runMethod(false,"NextArray");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 126;BA.debugLine="For i=0 To data_array.Size -1";
Debug.ShouldStop(536870912);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_data_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 127;BA.debugLine="Dim a As Map";
Debug.ShouldStop(1073741824);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 128;BA.debugLine="a = data_array.Get(i)";
Debug.ShouldStop(-2147483648);
_a.setObject(_data_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 129;BA.debugLine="lat = a.Get(\"latitude\")";
Debug.ShouldStop(1);
officeedit._lat = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("latitude")))));
 BA.debugLineNum = 130;BA.debugLine="lng = a.Get(\"longitude\")";
Debug.ShouldStop(2);
officeedit._lng = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("longitude")))));
 BA.debugLineNum = 131;BA.debugLine="Log(lat)";
Debug.ShouldStop(4);
officeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(officeedit._lat));
 BA.debugLineNum = 132;BA.debugLine="Log(lng)";
Debug.ShouldStop(8);
officeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(officeedit._lng));
 BA.debugLineNum = 133;BA.debugLine="OfficeName.Text = a.Get(\"name_of_office_build";
Debug.ShouldStop(16);
officeedit.mostCurrent._officename.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_office_building"))))));
 BA.debugLineNum = 134;BA.debugLine="tipp = a.Get(\"type_of_office\")";
Debug.ShouldStop(32);
officeedit._tipp = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_of_office")))));
 BA.debugLineNum = 135;BA.debugLine="tipname = a.Get(\"typeof\")";
Debug.ShouldStop(64);
officeedit._tipname = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("typeof")))));
 BA.debugLineNum = 136;BA.debugLine="Log(\"Data jenis :\"&tipp)";
Debug.ShouldStop(128);
officeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Data jenis :"),officeedit._tipp)));
 BA.debugLineNum = 137;BA.debugLine="StandingYear.Text = a.Get(\"standing_year\")";
Debug.ShouldStop(256);
officeedit.mostCurrent._standingyear.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("standing_year"))))));
 BA.debugLineNum = 138;BA.debugLine="BuildingArea.Text = a.Get(\"building_area\")";
Debug.ShouldStop(512);
officeedit.mostCurrent._buildingarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("building_area"))))));
 BA.debugLineNum = 139;BA.debugLine="LandArea.Text = a.Get(\"land_area\")";
Debug.ShouldStop(1024);
officeedit.mostCurrent._landarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("land_area"))))));
 BA.debugLineNum = 140;BA.debugLine="ParkingArea.Text = a.Get(\"parking_area\")";
Debug.ShouldStop(2048);
officeedit.mostCurrent._parkingarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parking_area"))))));
 BA.debugLineNum = 141;BA.debugLine="Electricity.Text = a.Get(\"electricity_capacit";
Debug.ShouldStop(4096);
officeedit.mostCurrent._electricity.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("electricity_capacity"))))));
 BA.debugLineNum = 142;BA.debugLine="cons = a.Get(\"type_of_construction\")";
Debug.ShouldStop(8192);
officeedit._cons = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_of_construction")))));
 BA.debugLineNum = 143;BA.debugLine="consname = a.Get(\"constr\")";
Debug.ShouldStop(16384);
officeedit._consname = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("constr")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 145;BA.debugLine="If StandingYear.Text == \"\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",officeedit.mostCurrent._standingyear.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 146;BA.debugLine="StandingYear.Text = \"0\"";
Debug.ShouldStop(131072);
officeedit.mostCurrent._standingyear.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 };
 BA.debugLineNum = 148;BA.debugLine="If BuildingArea.Text == \"\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",officeedit.mostCurrent._buildingarea.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 149;BA.debugLine="BuildingArea.Text = \"0\"";
Debug.ShouldStop(1048576);
officeedit.mostCurrent._buildingarea.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 };
 BA.debugLineNum = 151;BA.debugLine="If ParkingArea.Text == \"\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",officeedit.mostCurrent._parkingarea.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 152;BA.debugLine="ParkingArea.Text = \"0\"";
Debug.ShouldStop(8388608);
officeedit.mostCurrent._parkingarea.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 };
 BA.debugLineNum = 154;BA.debugLine="If Electricity.Text == \"\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",officeedit.mostCurrent._electricity.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 155;BA.debugLine="Electricity.Text = \"0\"";
Debug.ShouldStop(67108864);
officeedit.mostCurrent._electricity.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 };
 BA.debugLineNum = 157;BA.debugLine="Log(\"Data konstruksi :\"&cons)";
Debug.ShouldStop(268435456);
officeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Data konstruksi :"),officeedit._cons)));
 BA.debugLineNum = 158;BA.debugLine="nama=OfficeName.Text";
Debug.ShouldStop(536870912);
officeedit._nama = officeedit.mostCurrent._officename.runMethod(true,"getText");
 BA.debugLineNum = 159;BA.debugLine="tahun= StandingYear.Text";
Debug.ShouldStop(1073741824);
officeedit._tahun = officeedit.mostCurrent._standingyear.runMethod(true,"getText");
 BA.debugLineNum = 160;BA.debugLine="ltanah= LandArea.Text";
Debug.ShouldStop(-2147483648);
officeedit._ltanah = officeedit.mostCurrent._landarea.runMethod(true,"getText");
 BA.debugLineNum = 161;BA.debugLine="lparkir= ParkingArea.Text";
Debug.ShouldStop(1);
officeedit._lparkir = officeedit.mostCurrent._parkingarea.runMethod(true,"getText");
 BA.debugLineNum = 162;BA.debugLine="lbangunan= BuildingArea.Text";
Debug.ShouldStop(2);
officeedit._lbangunan = officeedit.mostCurrent._buildingarea.runMethod(true,"getText");
 BA.debugLineNum = 163;BA.debugLine="listrik= Electricity.Text";
Debug.ShouldStop(4);
officeedit._listrik = officeedit.mostCurrent._electricity.runMethod(true,"getText");
 BA.debugLineNum = 164;BA.debugLine="TypeOfOffice.SelectedIndex = TypeOfOffice.Ind";
Debug.ShouldStop(8);
officeedit.mostCurrent._typeofoffice.runMethod(true,"setSelectedIndex",officeedit.mostCurrent._typeofoffice.runMethod(true,"IndexOf",(Object)(officeedit._tipname)));
 BA.debugLineNum = 165;BA.debugLine="Construction.SelectedIndex = Construction.Ind";
Debug.ShouldStop(16);
officeedit.mostCurrent._construction.runMethod(true,"setSelectedIndex",officeedit.mostCurrent._construction.runMethod(true,"IndexOf",(Object)(officeedit._consname)));
 BA.debugLineNum = 166;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32);
officeedit.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 1: {
 BA.debugLineNum = 168;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(128);
officeedit.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 169;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 170;BA.debugLine="Msgbox(\"Data has been updated! :)\",\"Success\")";
Debug.ShouldStop(512);
officeedit.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Data has been updated! :)")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Success"))),officeedit.mostCurrent.activityBA);
 BA.debugLineNum = 171;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1024);
officeedit.mostCurrent._activity.runVoidMethod ("Finish");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e58) {
			BA.rdebugUtils.runVoidMethod("setLastException",officeedit.processBA, e58.toString()); BA.debugLineNum = 173;BA.debugLine="Msgbox(\"Data can not be updated :(\" , \"error\"";
Debug.ShouldStop(4096);
officeedit.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Data can not be updated :(")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("error"))),officeedit.mostCurrent.activityBA);
 };
 break; }
case 2: {
 BA.debugLineNum = 177;BA.debugLine="Dim type_array As List";
Debug.ShouldStop(65536);
_type_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("type_array", _type_array);
 BA.debugLineNum = 178;BA.debugLine="type_array = parser.NextArray";
Debug.ShouldStop(131072);
_type_array = _parser.runMethod(false,"NextArray");Debug.locals.put("type_array", _type_array);
 BA.debugLineNum = 179;BA.debugLine="For i=0 To type_array.Size -1";
Debug.ShouldStop(262144);
{
final int step63 = 1;
final int limit63 = RemoteObject.solve(new RemoteObject[] {_type_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step63 > 0 && _i <= limit63) || (step63 < 0 && _i >= limit63) ;_i = ((int)(0 + _i + step63))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 180;BA.debugLine="Dim a As Map";
Debug.ShouldStop(524288);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 181;BA.debugLine="a = type_array.Get(i)";
Debug.ShouldStop(1048576);
_a.setObject(_type_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 182;BA.debugLine="Dim namatype, idtype As String";
Debug.ShouldStop(2097152);
_namatype = RemoteObject.createImmutable("");Debug.locals.put("namatype", _namatype);
_idtype = RemoteObject.createImmutable("");Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 183;BA.debugLine="namatype= a.Get(\"name_of_type\")";
Debug.ShouldStop(4194304);
_namatype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_type")))));Debug.locals.put("namatype", _namatype);
 BA.debugLineNum = 184;BA.debugLine="idtype = a.Get(\"type_id\")";
Debug.ShouldStop(8388608);
_idtype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_id")))));Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 186;BA.debugLine="TypeOfOffice.Add(namatype)";
Debug.ShouldStop(33554432);
officeedit.mostCurrent._typeofoffice.runVoidMethod ("Add",(Object)(_namatype));
 BA.debugLineNum = 187;BA.debugLine="OfficeMap.Put(namatype,idtype)";
Debug.ShouldStop(67108864);
officeedit.mostCurrent._officemap.runVoidMethod ("Put",(Object)((_namatype)),(Object)((_idtype)));
 BA.debugLineNum = 188;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
Debug.ShouldStop(134217728);
officeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ID Map: "),_namatype,RemoteObject.createImmutable(" "),_idtype)));
 }
}Debug.locals.put("i", _i);
;
 break; }
case 3: {
 BA.debugLineNum = 192;BA.debugLine="Dim cons_array As List";
Debug.ShouldStop(-2147483648);
_cons_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("cons_array", _cons_array);
 BA.debugLineNum = 193;BA.debugLine="cons_array = parser.NextArray";
Debug.ShouldStop(1);
_cons_array = _parser.runMethod(false,"NextArray");Debug.locals.put("cons_array", _cons_array);
 BA.debugLineNum = 194;BA.debugLine="For j=0 To cons_array.Size -1";
Debug.ShouldStop(2);
{
final int step76 = 1;
final int limit76 = RemoteObject.solve(new RemoteObject[] {_cons_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step76 > 0 && _j <= limit76) || (step76 < 0 && _j >= limit76) ;_j = ((int)(0 + _j + step76))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 195;BA.debugLine="Dim a As Map";
Debug.ShouldStop(4);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 196;BA.debugLine="a = cons_array.Get(j)";
Debug.ShouldStop(8);
_a.setObject(_cons_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _j))));
 BA.debugLineNum = 197;BA.debugLine="Dim nama_type, id_type As String";
Debug.ShouldStop(16);
_nama_type = RemoteObject.createImmutable("");Debug.locals.put("nama_type", _nama_type);
_id_type = RemoteObject.createImmutable("");Debug.locals.put("id_type", _id_type);
 BA.debugLineNum = 198;BA.debugLine="nama_type= a.Get(\"name_of_type\")";
Debug.ShouldStop(32);
_nama_type = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_type")))));Debug.locals.put("nama_type", _nama_type);
 BA.debugLineNum = 199;BA.debugLine="id_type = a.Get(\"type_id\")";
Debug.ShouldStop(64);
_id_type = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_id")))));Debug.locals.put("id_type", _id_type);
 BA.debugLineNum = 201;BA.debugLine="Construction.Add(nama_type)";
Debug.ShouldStop(256);
officeedit.mostCurrent._construction.runVoidMethod ("Add",(Object)(_nama_type));
 BA.debugLineNum = 202;BA.debugLine="ConsMap.Put(nama_type,id_type)";
Debug.ShouldStop(512);
officeedit.mostCurrent._consmap.runVoidMethod ("Put",(Object)((_nama_type)),(Object)((_id_type)));
 BA.debugLineNum = 203;BA.debugLine="Log(\"ID Map: \"&nama_type&\" \"&id_type)";
Debug.ShouldStop(1024);
officeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ID Map: "),_nama_type,RemoteObject.createImmutable(" "),_id_type)));
 }
}Debug.locals.put("j", _j);
;
 break; }
}
;
 };
 BA.debugLineNum = 207;BA.debugLine="Job.Release";
Debug.ShouldStop(16384);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
officeedit._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim fasilitas, lat, lng As String";
officeedit._fasilitas = RemoteObject.createImmutable("");
officeedit._lat = RemoteObject.createImmutable("");
officeedit._lng = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim quantity_fac As Int";
officeedit._quantity_fac = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 12;BA.debugLine="Dim ids As String";
officeedit._ids = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="ids = \"\"";
officeedit._ids = BA.ObjectToString("");
 //BA.debugLineNum = 14;BA.debugLine="Dim nama,tipe, jenis, tahun,ltanah,lparkir,lbangu";
officeedit._nama = RemoteObject.createImmutable("");
officeedit._tipe = RemoteObject.createImmutable("");
officeedit._jenis = RemoteObject.createImmutable("");
officeedit._tahun = RemoteObject.createImmutable("");
officeedit._ltanah = RemoteObject.createImmutable("");
officeedit._lparkir = RemoteObject.createImmutable("");
officeedit._lbangunan = RemoteObject.createImmutable("");
officeedit._listrik = RemoteObject.createImmutable("");
officeedit._kons = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="nama= \"\"";
officeedit._nama = BA.ObjectToString("");
 //BA.debugLineNum = 16;BA.debugLine="tipe = \"\"";
officeedit._tipe = BA.ObjectToString("");
 //BA.debugLineNum = 17;BA.debugLine="jenis= \"\"";
officeedit._jenis = BA.ObjectToString("");
 //BA.debugLineNum = 18;BA.debugLine="Dim tipp,tipname,typeoffice,cons,consname,typecon";
officeedit._tipp = RemoteObject.createImmutable("");
officeedit._tipname = RemoteObject.createImmutable("");
officeedit._typeoffice = RemoteObject.createImmutable("");
officeedit._cons = RemoteObject.createImmutable("");
officeedit._consname = RemoteObject.createImmutable("");
officeedit._typecons = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Dim tipe_i , jenis_i, lbangunan_i, lparkir_i,ltan";
officeedit._tipe_i = RemoteObject.createImmutable(0);
officeedit._jenis_i = RemoteObject.createImmutable(0);
officeedit._lbangunan_i = RemoteObject.createImmutable(0);
officeedit._lparkir_i = RemoteObject.createImmutable(0);
officeedit._ltanah_i = RemoteObject.createImmutable(0);
officeedit._listrik_i = RemoteObject.createImmutable(0);
officeedit._tahun_i = RemoteObject.createImmutable(0);
officeedit._cons_i = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setbackgroundtintlist(RemoteObject _view,RemoteObject _active,RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundTintList (officeedit) ","officeedit",18,officeedit.mostCurrent.activityBA,officeedit.mostCurrent,97);
if (RapidSub.canDelegate("setbackgroundtintlist")) return b4a.example.officeedit.remoteMe.runUserSub(false, "officeedit","setbackgroundtintlist", _view, _active, _enabled);
RemoteObject _states = null;
RemoteObject _color = null;
RemoteObject _csl = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("View", _view);
Debug.locals.put("Active", _active);
Debug.locals.put("Enabled", _enabled);
 BA.debugLineNum = 97;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="Dim States(2,1) As Int";
Debug.ShouldStop(2);
_states = RemoteObject.createNewArray ("int", new int[] {2,1}, new Object[]{});Debug.locals.put("States", _states);
 BA.debugLineNum = 99;BA.debugLine="States(0,0) = 16842908     'Active";
Debug.ShouldStop(4);
_states.setArrayElement (BA.numberCast(int.class, 16842908),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 100;BA.debugLine="States(1,0) = 16842910    'Enabled";
Debug.ShouldStop(8);
_states.setArrayElement (BA.numberCast(int.class, 16842910),BA.numberCast(int.class, 1),BA.numberCast(int.class, 0));
 BA.debugLineNum = 101;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
Debug.ShouldStop(16);
_color = RemoteObject.createNewArray("int",new int[] {2},new Object[] {_active,_enabled});Debug.locals.put("Color", _color);Debug.locals.put("Color", _color);
 BA.debugLineNum = 102;BA.debugLine="Dim CSL As JavaObject";
Debug.ShouldStop(32);
_csl = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("CSL", _csl);
 BA.debugLineNum = 103;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
Debug.ShouldStop(64);
_csl.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.content.res.ColorStateList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_states),(_color)})));
 BA.debugLineNum = 104;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(128);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 105;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
Debug.ShouldStop(256);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.support.v4.view.ViewCompat")));
 BA.debugLineNum = 106;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
Debug.ShouldStop(512);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBackgroundTintList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_view.getObject()),(_csl.getObject())})));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _typeofoffice_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("TypeOfOffice_ItemClick (officeedit) ","officeedit",18,officeedit.mostCurrent.activityBA,officeedit.mostCurrent,214);
if (RapidSub.canDelegate("typeofoffice_itemclick")) return b4a.example.officeedit.remoteMe.runUserSub(false, "officeedit","typeofoffice_itemclick", _position, _value);
RemoteObject _id = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 214;BA.debugLine="Sub TypeOfOffice_ItemClick (Position As Int, Value";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 215;BA.debugLine="Dim id As String";
Debug.ShouldStop(4194304);
_id = RemoteObject.createImmutable("");Debug.locals.put("id", _id);
 BA.debugLineNum = 216;BA.debugLine="id = OfficeMap.Get(Value)";
Debug.ShouldStop(8388608);
_id = BA.ObjectToString(officeedit.mostCurrent._officemap.runMethod(false,"Get",(Object)(_value)));Debug.locals.put("id", _id);
 BA.debugLineNum = 217;BA.debugLine="typeoffice = id";
Debug.ShouldStop(16777216);
officeedit._typeoffice = _id;
 BA.debugLineNum = 218;BA.debugLine="Log(typeoffice)";
Debug.ShouldStop(33554432);
officeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(officeedit._typeoffice));
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}