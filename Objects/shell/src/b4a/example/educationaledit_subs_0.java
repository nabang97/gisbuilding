package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class educationaledit_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (educationaledit) ","educationaledit",27,educationaledit.mostCurrent.activityBA,educationaledit.mostCurrent,48);
if (RapidSub.canDelegate("activity_create")) return b4a.example.educationaledit.remoteMe.runUserSub(false, "educationaledit","activity_create", _firsttime);
RemoteObject _sv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(131072);
educationaledit.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),educationaledit.mostCurrent.activityBA);
 BA.debugLineNum = 51;BA.debugLine="ScrollView1.Panel.LoadLayout(\"EducationalEdit\")";
Debug.ShouldStop(262144);
educationaledit.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("EducationalEdit")),educationaledit.mostCurrent.activityBA);
 BA.debugLineNum = 52;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
Debug.ShouldStop(524288);
educationaledit.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",educationaledit.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 BA.debugLineNum = 53;BA.debugLine="PanelToolbar.Visible = False";
Debug.ShouldStop(1048576);
educationaledit.mostCurrent._paneltoolbar.runMethod(true,"setVisible",educationaledit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 55;BA.debugLine="SetBackgroundTintList(EducationName, Colors.ARGB(";
Debug.ShouldStop(4194304);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), educationaledit.mostCurrent._educationname.getObject()),educationaledit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),educationaledit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 56;BA.debugLine="SetBackgroundTintList(Headmaster, Colors.ARGB(225";
Debug.ShouldStop(8388608);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), educationaledit.mostCurrent._headmaster.getObject()),educationaledit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),educationaledit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 57;BA.debugLine="SetBackgroundTintList(NumTeacher, Colors.ARGB(225";
Debug.ShouldStop(16777216);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), educationaledit.mostCurrent._numteacher.getObject()),educationaledit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),educationaledit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 58;BA.debugLine="SetBackgroundTintList(NumStudent, Colors.ARGB(225";
Debug.ShouldStop(33554432);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), educationaledit.mostCurrent._numstudent.getObject()),educationaledit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),educationaledit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 59;BA.debugLine="SetBackgroundTintList(StandingYear, Colors.ARGB(2";
Debug.ShouldStop(67108864);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), educationaledit.mostCurrent._standingyear.getObject()),educationaledit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),educationaledit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 60;BA.debugLine="SetBackgroundTintList(BuildingArea, Colors.ARGB(2";
Debug.ShouldStop(134217728);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), educationaledit.mostCurrent._buildingarea.getObject()),educationaledit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),educationaledit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 61;BA.debugLine="SetBackgroundTintList(LandArea, Colors.ARGB(225,3";
Debug.ShouldStop(268435456);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), educationaledit.mostCurrent._landarea.getObject()),educationaledit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),educationaledit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 62;BA.debugLine="SetBackgroundTintList(Electricity, Colors.ARGB(22";
Debug.ShouldStop(536870912);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), educationaledit.mostCurrent._electricity.getObject()),educationaledit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),educationaledit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 63;BA.debugLine="SetBackgroundTintList(ParkingArea, Colors.ARGB(22";
Debug.ShouldStop(1073741824);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), educationaledit.mostCurrent._parkingarea.getObject()),educationaledit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),educationaledit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 66;BA.debugLine="BackArrow.Visible= True";
Debug.ShouldStop(2);
educationaledit.mostCurrent._backarrow.runMethod(true,"setVisible",educationaledit.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 67;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(4);
educationaledit.mostCurrent._backarrow.runVoidMethod ("SetBackgroundImageNew",(Object)((educationaledit.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(educationaledit.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("back-arrow.png"))).getObject())));
 BA.debugLineNum = 68;BA.debugLine="TitleBar.Text=\"Building Detail\"";
Debug.ShouldStop(8);
educationaledit.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("Building Detail"));
 BA.debugLineNum = 71;BA.debugLine="If EducationalBuilding.nameBuilding.Length > 0 Th";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",educationaledit.mostCurrent._educationalbuilding._namebuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 72;BA.debugLine="EducationName.Text = EducationalBuilding.nameBui";
Debug.ShouldStop(128);
educationaledit.mostCurrent._educationname.runMethod(true,"setText",BA.ObjectToCharSequence(educationaledit.mostCurrent._educationalbuilding._namebuilding));
 BA.debugLineNum = 73;BA.debugLine="ids =EducationalBuilding.idBuilding";
Debug.ShouldStop(256);
educationaledit.mostCurrent._ids = educationaledit.mostCurrent._educationalbuilding._idbuilding;
 BA.debugLineNum = 74;BA.debugLine="Log(ids)";
Debug.ShouldStop(512);
educationaledit.mostCurrent.__c.runVoidMethod ("Log",(Object)(educationaledit.mostCurrent._ids));
 }else 
{ BA.debugLineNum = 75;BA.debugLine="Else If SearchBuilding.nameBuilding.Length > 0 Th";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",educationaledit.mostCurrent._searchbuilding._namebuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 76;BA.debugLine="EducationName.Text = SearchBuilding.nameBuilding";
Debug.ShouldStop(2048);
educationaledit.mostCurrent._educationname.runMethod(true,"setText",BA.ObjectToCharSequence(educationaledit.mostCurrent._searchbuilding._namebuilding));
 BA.debugLineNum = 77;BA.debugLine="ids =SearchBuilding.idBuilding";
Debug.ShouldStop(4096);
educationaledit.mostCurrent._ids = educationaledit.mostCurrent._searchbuilding._idbuilding;
 BA.debugLineNum = 78;BA.debugLine="Log(ids)";
Debug.ShouldStop(8192);
educationaledit.mostCurrent.__c.runVoidMethod ("Log",(Object)(educationaledit.mostCurrent._ids));
 }else {
 BA.debugLineNum = 80;BA.debugLine="EducationName.Text = \"Please press on the button";
Debug.ShouldStop(32768);
educationaledit.mostCurrent._educationname.runMethod(true,"setText",BA.ObjectToCharSequence("Please press on the button and choose an item."));
 }}
;
 BA.debugLineNum = 83;BA.debugLine="EduMap.Initialize";
Debug.ShouldStop(262144);
educationaledit.mostCurrent._edumap.runVoidMethod ("Initialize");
 BA.debugLineNum = 84;BA.debugLine="ConsMap.Initialize";
Debug.ShouldStop(524288);
educationaledit.mostCurrent._consmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 85;BA.debugLine="LevelMap.Initialize";
Debug.ShouldStop(1048576);
educationaledit.mostCurrent._levelmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 87;BA.debugLine="Dim sv As ScrollView";
Debug.ShouldStop(4194304);
_sv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");Debug.locals.put("sv", _sv);
 BA.debugLineNum = 88;BA.debugLine="ScrollView1.Height=100%y";
Debug.ShouldStop(8388608);
educationaledit.mostCurrent._scrollview1.runMethod(true,"setHeight",educationaledit.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),educationaledit.mostCurrent.activityBA));
 BA.debugLineNum = 89;BA.debugLine="PanelBuildingList.Height=BtnSaveChanges.Top+BtnSa";
Debug.ShouldStop(16777216);
educationaledit.mostCurrent._panelbuildinglist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {educationaledit.mostCurrent._btnsavechanges.runMethod(true,"getTop"),educationaledit.mostCurrent._btnsavechanges.runMethod(true,"getHeight"),educationaledit.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),educationaledit.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 90;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
Debug.ShouldStop(33554432);
educationaledit.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",educationaledit.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
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
		Debug.PushSubsStack("Activity_Pause (educationaledit) ","educationaledit",27,educationaledit.mostCurrent.activityBA,educationaledit.mostCurrent,105);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.educationaledit.remoteMe.runUserSub(false, "educationaledit","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 105;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(256);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (educationaledit) ","educationaledit",27,educationaledit.mostCurrent.activityBA,educationaledit.mostCurrent,93);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.educationaledit.remoteMe.runUserSub(false, "educationaledit","activity_resume");
 BA.debugLineNum = 93;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="EduMap.Clear";
Debug.ShouldStop(536870912);
educationaledit.mostCurrent._edumap.runVoidMethod ("Clear");
 BA.debugLineNum = 95;BA.debugLine="ConsMap.Clear";
Debug.ShouldStop(1073741824);
educationaledit.mostCurrent._consmap.runVoidMethod ("Clear");
 BA.debugLineNum = 96;BA.debugLine="LevelMap.Clear";
Debug.ShouldStop(-2147483648);
educationaledit.mostCurrent._levelmap.runVoidMethod ("Clear");
 BA.debugLineNum = 97;BA.debugLine="CreateSchoolLevel";
Debug.ShouldStop(1);
_createschoollevel();
 BA.debugLineNum = 98;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(2);
educationaledit.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",educationaledit.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Loading..."))));
 BA.debugLineNum = 99;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.educational_building";
Debug.ShouldStop(4);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.educational_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id ='"),educationaledit.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("FASILITAS"));
 BA.debugLineNum = 100;BA.debugLine="ExecuteRemoteQuery(\"SELECT E.educational_building";
Debug.ShouldStop(8);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT E.educational_building_id, E.name_of_educational_building, E.building_area, E.land_area, E.parking_area, E.standing_year, E.electricity_capacity, E.address, E.type_of_construction, E.id_level_of_education, E.headmaster_name, E.total_students, E.total_teachers, E.school_type,ST_X(ST_Centroid(E.geom)) As longitude, ST_Y(ST_CENTROID(E.geom)) As latitude, T.name_of_type As constr, L.name_of_level As level, ST_AsText(geom) As geom FROM educational_building As E	LEFT JOIN type_of_construction As T ON E.type_of_construction=T.type_id	LEFT JOIN level_of_education As L ON E.id_level_of_education=L.level_id	WHERE E.educational_building_id='"),educationaledit.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("DATA"));
 BA.debugLineNum = 101;BA.debugLine="ExecuteRemoteQuery(\"SELECT level_id, name_of_leve";
Debug.ShouldStop(16);
_executeremotequery(BA.ObjectToString("SELECT level_id, name_of_level FROM level_of_education ORDER BY name_of_level ASC"),RemoteObject.createImmutable("TypeEducation"));
 BA.debugLineNum = 102;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_type";
Debug.ShouldStop(32);
_executeremotequery(BA.ObjectToString("SELECT type_id, name_of_type FROM type_of_construction ORDER BY name_of_type ASC "),RemoteObject.createImmutable("Construction"));
 BA.debugLineNum = 103;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("BackArrow_Click (educationaledit) ","educationaledit",27,educationaledit.mostCurrent.activityBA,educationaledit.mostCurrent,239);
if (RapidSub.canDelegate("backarrow_click")) return b4a.example.educationaledit.remoteMe.runUserSub(false, "educationaledit","backarrow_click");
 BA.debugLineNum = 239;BA.debugLine="Sub BackArrow_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 240;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
educationaledit.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _btngallery_click() throws Exception{
try {
		Debug.PushSubsStack("btnGallery_Click (educationaledit) ","educationaledit",27,educationaledit.mostCurrent.activityBA,educationaledit.mostCurrent,264);
if (RapidSub.canDelegate("btngallery_click")) return b4a.example.educationaledit.remoteMe.runUserSub(false, "educationaledit","btngallery_click");
 BA.debugLineNum = 264;BA.debugLine="Sub btnGallery_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("BtnSaveChanges_Click (educationaledit) ","educationaledit",27,educationaledit.mostCurrent.activityBA,educationaledit.mostCurrent,268);
if (RapidSub.canDelegate("btnsavechanges_click")) return b4a.example.educationaledit.remoteMe.runUserSub(false, "educationaledit","btnsavechanges_click");
 BA.debugLineNum = 268;BA.debugLine="Sub BtnSaveChanges_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 269;BA.debugLine="Log(ids)";
Debug.ShouldStop(4096);
educationaledit.mostCurrent.__c.runVoidMethod ("Log",(Object)(educationaledit.mostCurrent._ids));
 BA.debugLineNum = 270;BA.debugLine="If idtype == \"\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",educationaledit._idtype,BA.ObjectToString(""))) { 
 BA.debugLineNum = 271;BA.debugLine="tipe_i = typeschool";
Debug.ShouldStop(16384);
educationaledit._tipe_i = BA.numberCast(int.class, educationaledit._typeschool);
 }else {
 BA.debugLineNum = 273;BA.debugLine="tipe_i = idtype";
Debug.ShouldStop(65536);
educationaledit._tipe_i = BA.numberCast(int.class, educationaledit._idtype);
 };
 BA.debugLineNum = 276;BA.debugLine="lbangunan_i = BuildingArea.Text";
Debug.ShouldStop(524288);
educationaledit._lbangunan_i = BA.numberCast(int.class, educationaledit.mostCurrent._buildingarea.runMethod(true,"getText"));
 BA.debugLineNum = 277;BA.debugLine="lparkir_i = ParkingArea.Text";
Debug.ShouldStop(1048576);
educationaledit._lparkir_i = BA.numberCast(int.class, educationaledit.mostCurrent._parkingarea.runMethod(true,"getText"));
 BA.debugLineNum = 278;BA.debugLine="ltanah_i = LandArea.Text";
Debug.ShouldStop(2097152);
educationaledit._ltanah_i = BA.numberCast(int.class, educationaledit.mostCurrent._landarea.runMethod(true,"getText"));
 BA.debugLineNum = 279;BA.debugLine="listrik_i = Electricity.Text";
Debug.ShouldStop(4194304);
educationaledit._listrik_i = BA.numberCast(int.class, educationaledit.mostCurrent._electricity.runMethod(true,"getText"));
 BA.debugLineNum = 280;BA.debugLine="tahun_i = StandingYear.Text";
Debug.ShouldStop(8388608);
educationaledit._tahun_i = BA.numberCast(int.class, educationaledit.mostCurrent._standingyear.runMethod(true,"getText"));
 BA.debugLineNum = 281;BA.debugLine="teacher_i = NumTeacher.Text";
Debug.ShouldStop(16777216);
educationaledit._teacher_i = BA.numberCast(int.class, educationaledit.mostCurrent._numteacher.runMethod(true,"getText"));
 BA.debugLineNum = 282;BA.debugLine="student_i = NumStudent.Text";
Debug.ShouldStop(33554432);
educationaledit._student_i = BA.numberCast(int.class, educationaledit.mostCurrent._numstudent.runMethod(true,"getText"));
 BA.debugLineNum = 284;BA.debugLine="If idlevel == \"\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",educationaledit._idlevel,BA.ObjectToString(""))) { 
 BA.debugLineNum = 285;BA.debugLine="level_i = level";
Debug.ShouldStop(268435456);
educationaledit._level_i = BA.numberCast(int.class, educationaledit._level);
 }else {
 BA.debugLineNum = 287;BA.debugLine="level_i = idlevel";
Debug.ShouldStop(1073741824);
educationaledit._level_i = BA.numberCast(int.class, educationaledit._idlevel);
 };
 BA.debugLineNum = 290;BA.debugLine="If idcons == \"\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",educationaledit._idcons,BA.ObjectToString(""))) { 
 BA.debugLineNum = 291;BA.debugLine="cons_i = cons";
Debug.ShouldStop(4);
educationaledit._cons_i = BA.numberCast(int.class, educationaledit._cons);
 }else {
 BA.debugLineNum = 293;BA.debugLine="cons_i = idcons";
Debug.ShouldStop(16);
educationaledit._cons_i = BA.numberCast(int.class, educationaledit._idcons);
 };
 BA.debugLineNum = 296;BA.debugLine="Log(tipe_i)";
Debug.ShouldStop(128);
educationaledit.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(educationaledit._tipe_i)));
 BA.debugLineNum = 297;BA.debugLine="Log(cons_i)";
Debug.ShouldStop(256);
educationaledit.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(educationaledit._cons_i)));
 BA.debugLineNum = 298;BA.debugLine="If IsNumber(tipe_i) Then";
Debug.ShouldStop(512);
if (educationaledit.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(BA.NumberToString(educationaledit._tipe_i))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 299;BA.debugLine="Log(\"\"&tipe_i&\" is a number\")";
Debug.ShouldStop(1024);
educationaledit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),educationaledit._tipe_i,RemoteObject.createImmutable(" is a number"))));
 }else {
 BA.debugLineNum = 301;BA.debugLine="Log(\"\"&tipe_i&\" is not a number\")";
Debug.ShouldStop(4096);
educationaledit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),educationaledit._tipe_i,RemoteObject.createImmutable(" is not a number"))));
 };
 BA.debugLineNum = 303;BA.debugLine="ProgressDialogShow(\"loading...\")";
Debug.ShouldStop(16384);
educationaledit.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",educationaledit.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("loading..."))));
 BA.debugLineNum = 304;BA.debugLine="ExecuteRemoteQuery(\"UPDATE educational_building S";
Debug.ShouldStop(32768);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("UPDATE educational_building SET	name_of_educational_building = '"),educationaledit.mostCurrent._educationname.runMethod(true,"getText"),RemoteObject.createImmutable("', headmaster_name = '"),educationaledit.mostCurrent._headmaster.runMethod(true,"getText"),RemoteObject.createImmutable("', total_students = "),educationaledit._student_i,RemoteObject.createImmutable(", total_teachers = "),educationaledit._teacher_i,RemoteObject.createImmutable(", school_type = "),educationaledit._tipe_i,RemoteObject.createImmutable(", id_level_of_education = "),educationaledit._level_i,RemoteObject.createImmutable(", standing_year = "),educationaledit._tahun_i,RemoteObject.createImmutable(",building_area = "),educationaledit._lbangunan_i,RemoteObject.createImmutable(",land_area = "),educationaledit._ltanah_i,RemoteObject.createImmutable(",parking_area = "),educationaledit._lparkir_i,RemoteObject.createImmutable(", electricity_capacity = "),educationaledit._listrik_i,RemoteObject.createImmutable(", type_of_construction = "),educationaledit._cons_i,RemoteObject.createImmutable("	WHERE educational_building_id = '"),educationaledit.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("Update"));
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
public static RemoteObject  _construction_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Construction_ItemClick (educationaledit) ","educationaledit",27,educationaledit.mostCurrent.activityBA,educationaledit.mostCurrent,257);
if (RapidSub.canDelegate("construction_itemclick")) return b4a.example.educationaledit.remoteMe.runUserSub(false, "educationaledit","construction_itemclick", _position, _value);
RemoteObject _id = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 257;BA.debugLine="Sub Construction_ItemClick (Position As Int, Value";
Debug.ShouldStop(1);
 BA.debugLineNum = 258;BA.debugLine="Dim id As String";
Debug.ShouldStop(2);
_id = RemoteObject.createImmutable("");Debug.locals.put("id", _id);
 BA.debugLineNum = 259;BA.debugLine="id = ConsMap.Get(Value)";
Debug.ShouldStop(4);
_id = BA.ObjectToString(educationaledit.mostCurrent._consmap.runMethod(false,"Get",(Object)(_value)));Debug.locals.put("id", _id);
 BA.debugLineNum = 260;BA.debugLine="idcons = id";
Debug.ShouldStop(8);
educationaledit._idcons = _id;
 BA.debugLineNum = 261;BA.debugLine="Log(idcons)";
Debug.ShouldStop(16);
educationaledit.mostCurrent.__c.runVoidMethod ("Log",(Object)(educationaledit._idcons));
 BA.debugLineNum = 262;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createschoollevel() throws Exception{
try {
		Debug.PushSubsStack("CreateSchoolLevel (educationaledit) ","educationaledit",27,educationaledit.mostCurrent.activityBA,educationaledit.mostCurrent,121);
if (RapidSub.canDelegate("createschoollevel")) return b4a.example.educationaledit.remoteMe.runUserSub(false, "educationaledit","createschoollevel");
 BA.debugLineNum = 121;BA.debugLine="Sub CreateSchoolLevel";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="TypeOfEducation.Add(\"Private School\")";
Debug.ShouldStop(33554432);
educationaledit.mostCurrent._typeofeducation.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Private School")));
 BA.debugLineNum = 123;BA.debugLine="EduMap.Put(\"Private School\",\"0\")";
Debug.ShouldStop(67108864);
educationaledit.mostCurrent._edumap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Private School"))),(Object)((RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 124;BA.debugLine="TypeOfEducation.Add(\"Public School\")";
Debug.ShouldStop(134217728);
educationaledit.mostCurrent._typeofeducation.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Public School")));
 BA.debugLineNum = 125;BA.debugLine="EduMap.Put(\"Public School\",\"1\")";
Debug.ShouldStop(268435456);
educationaledit.mostCurrent._edumap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Public School"))),(Object)((RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("ExecuteRemoteQuery (educationaledit) ","educationaledit",27,educationaledit.mostCurrent.activityBA,educationaledit.mostCurrent,128);
if (RapidSub.canDelegate("executeremotequery")) return b4a.example.educationaledit.remoteMe.runUserSub(false, "educationaledit","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 128;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(1);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 130;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(2);
_job.runVoidMethod ("_initialize",educationaledit.processBA,(Object)(_jobname),(Object)(educationaledit.getObject()));
 BA.debugLineNum = 131;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
Debug.ShouldStop(4);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),educationaledit.mostCurrent._main._server,RemoteObject.createImmutable("mobile/json.php"))),(Object)(_query));
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private ScrollView1 As ScrollView";
educationaledit.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private TitleBar As Label";
educationaledit.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private BackArrow As Label";
educationaledit.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private PanelBuildingList As Panel";
educationaledit.mostCurrent._panelbuildinglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private LblEdit As Label";
educationaledit.mostCurrent._lbledit = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private StandingYear As Label";
educationaledit.mostCurrent._standingyear = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private BuildingArea As Label";
educationaledit.mostCurrent._buildingarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private LandArea As Label";
educationaledit.mostCurrent._landarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private ParkingArea As Label";
educationaledit.mostCurrent._parkingarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private Electricity As Label";
educationaledit.mostCurrent._electricity = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private Construction As Spinner";
educationaledit.mostCurrent._construction = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Dim EducationName As Label";
educationaledit.mostCurrent._educationname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private TypeOfEducation As Spinner";
educationaledit.mostCurrent._typeofeducation = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private schoollevel As Spinner";
educationaledit.mostCurrent._schoollevel = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private Headmaster As Label";
educationaledit.mostCurrent._headmaster = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private NumTeacher As Label";
educationaledit.mostCurrent._numteacher = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private NumStudent As Label";
educationaledit.mostCurrent._numstudent = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private PanelToolbar As Panel";
educationaledit.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Dim ids As String";
educationaledit.mostCurrent._ids = RemoteObject.createImmutable("");
 //BA.debugLineNum = 41;BA.debugLine="Dim EduMap As Map";
educationaledit.mostCurrent._edumap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 42;BA.debugLine="Dim ConsMap As Map";
educationaledit.mostCurrent._consmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 43;BA.debugLine="Dim LevelMap As Map";
educationaledit.mostCurrent._levelmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 45;BA.debugLine="Private BtnSaveChanges As Button";
educationaledit.mostCurrent._btnsavechanges = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (educationaledit) ","educationaledit",27,educationaledit.mostCurrent.activityBA,educationaledit.mostCurrent,134);
if (RapidSub.canDelegate("jobdone")) return b4a.example.educationaledit.remoteMe.runUserSub(false, "educationaledit","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _data_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _type_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _namatype = RemoteObject.createImmutable("");
RemoteObject _id_type = RemoteObject.createImmutable("");
RemoteObject _cons_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _j = 0;
RemoteObject _nama_type = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 134;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(64);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 136;BA.debugLine="Dim res As String";
Debug.ShouldStop(128);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 137;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(256);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 138;BA.debugLine="Log(\"Response:\"& res)";
Debug.ShouldStop(512);
educationaledit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response:"),_res)));
 BA.debugLineNum = 139;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(1024);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 140;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(2048);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 141;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(4096);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("DATA"),BA.ObjectToString("TypeEducation"),BA.ObjectToString("Construction"),BA.ObjectToString("Update"))) {
case 0: {
 BA.debugLineNum = 143;BA.debugLine="Dim data_array As List";
Debug.ShouldStop(16384);
_data_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 144;BA.debugLine="data_array = parser.NextArray";
Debug.ShouldStop(32768);
_data_array = _parser.runMethod(false,"NextArray");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 145;BA.debugLine="For i=0 To data_array.Size -1";
Debug.ShouldStop(65536);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_data_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 146;BA.debugLine="Dim a As Map";
Debug.ShouldStop(131072);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 147;BA.debugLine="a = data_array.Get(i)";
Debug.ShouldStop(262144);
_a.setObject(_data_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 148;BA.debugLine="lat = a.Get(\"latitude\")";
Debug.ShouldStop(524288);
educationaledit._lat = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("latitude")))));
 BA.debugLineNum = 149;BA.debugLine="lng = a.Get(\"longitude\")";
Debug.ShouldStop(1048576);
educationaledit._lng = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("longitude")))));
 BA.debugLineNum = 150;BA.debugLine="Log(lat)";
Debug.ShouldStop(2097152);
educationaledit.mostCurrent.__c.runVoidMethod ("Log",(Object)(educationaledit._lat));
 BA.debugLineNum = 151;BA.debugLine="Log(lng)";
Debug.ShouldStop(4194304);
educationaledit.mostCurrent.__c.runVoidMethod ("Log",(Object)(educationaledit._lng));
 BA.debugLineNum = 153;BA.debugLine="EducationName.Text = a.Get(\"name_of_education";
Debug.ShouldStop(16777216);
educationaledit.mostCurrent._educationname.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_educational_building"))))));
 BA.debugLineNum = 154;BA.debugLine="Headmaster.Text = a.Get(\"headmaster_name\")";
Debug.ShouldStop(33554432);
educationaledit.mostCurrent._headmaster.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("headmaster_name"))))));
 BA.debugLineNum = 155;BA.debugLine="NumTeacher.Text = a.Get(\"total_teachers\")";
Debug.ShouldStop(67108864);
educationaledit.mostCurrent._numteacher.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_teachers"))))));
 BA.debugLineNum = 156;BA.debugLine="NumStudent.Text = a.Get(\"total_students\")";
Debug.ShouldStop(134217728);
educationaledit.mostCurrent._numstudent.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_students"))))));
 BA.debugLineNum = 157;BA.debugLine="StandingYear.Text = a.Get(\"standing_year\")";
Debug.ShouldStop(268435456);
educationaledit.mostCurrent._standingyear.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("standing_year"))))));
 BA.debugLineNum = 158;BA.debugLine="BuildingArea.Text = a.Get(\"building_area\")";
Debug.ShouldStop(536870912);
educationaledit.mostCurrent._buildingarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("building_area"))))));
 BA.debugLineNum = 159;BA.debugLine="LandArea.Text = a.Get(\"land_area\")";
Debug.ShouldStop(1073741824);
educationaledit.mostCurrent._landarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("land_area"))))));
 BA.debugLineNum = 160;BA.debugLine="ParkingArea.Text = a.Get(\"parking_area\")";
Debug.ShouldStop(-2147483648);
educationaledit.mostCurrent._parkingarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parking_area"))))));
 BA.debugLineNum = 161;BA.debugLine="Electricity.Text = a.Get(\"electricity_capacit";
Debug.ShouldStop(1);
educationaledit.mostCurrent._electricity.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("electricity_capacity"))))));
 BA.debugLineNum = 162;BA.debugLine="level = a.Get(\"id_level_of_education\")";
Debug.ShouldStop(2);
educationaledit._level = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_level_of_education")))));
 BA.debugLineNum = 163;BA.debugLine="levelname = a.Get(\"level\")";
Debug.ShouldStop(4);
educationaledit._levelname = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("level")))));
 BA.debugLineNum = 164;BA.debugLine="typeschool = a.Get(\"school_type\")";
Debug.ShouldStop(8);
educationaledit._typeschool = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("school_type")))));
 BA.debugLineNum = 165;BA.debugLine="cons = a.Get(\"type_of_construction\")";
Debug.ShouldStop(16);
educationaledit._cons = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_of_construction")))));
 BA.debugLineNum = 166;BA.debugLine="consname = a.Get(\"constr\")";
Debug.ShouldStop(32);
educationaledit._consname = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("constr")))));
 BA.debugLineNum = 167;BA.debugLine="Select typeschool";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(educationaledit._typeschool,BA.ObjectToString("0"),BA.ObjectToString("1"))) {
case 0: {
 BA.debugLineNum = 169;BA.debugLine="typeschoolname = \"Private School\"";
Debug.ShouldStop(256);
educationaledit._typeschoolname = BA.ObjectToString("Private School");
 break; }
case 1: {
 BA.debugLineNum = 171;BA.debugLine="typeschoolname = \"Public School\"";
Debug.ShouldStop(1024);
educationaledit._typeschoolname = BA.ObjectToString("Public School");
 break; }
}
;
 BA.debugLineNum = 173;BA.debugLine="Log(typeschoolname)";
Debug.ShouldStop(4096);
educationaledit.mostCurrent.__c.runVoidMethod ("Log",(Object)(educationaledit._typeschoolname));
 BA.debugLineNum = 175;BA.debugLine="If StandingYear.Text == \"null\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",educationaledit.mostCurrent._standingyear.runMethod(true,"getText"),BA.ObjectToString("null"))) { 
 BA.debugLineNum = 176;BA.debugLine="StandingYear.Text = \"0\"";
Debug.ShouldStop(32768);
educationaledit.mostCurrent._standingyear.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 };
 BA.debugLineNum = 178;BA.debugLine="If BuildingArea.Text == \"null\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",educationaledit.mostCurrent._buildingarea.runMethod(true,"getText"),BA.ObjectToString("null"))) { 
 BA.debugLineNum = 179;BA.debugLine="BuildingArea.Text = \"0\"";
Debug.ShouldStop(262144);
educationaledit.mostCurrent._buildingarea.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 };
 BA.debugLineNum = 181;BA.debugLine="If ParkingArea.Text == \"null\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",educationaledit.mostCurrent._parkingarea.runMethod(true,"getText"),BA.ObjectToString("null"))) { 
 BA.debugLineNum = 182;BA.debugLine="ParkingArea.Text = \"0\"";
Debug.ShouldStop(2097152);
educationaledit.mostCurrent._parkingarea.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 };
 BA.debugLineNum = 184;BA.debugLine="If Electricity.Text == \"null\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",educationaledit.mostCurrent._electricity.runMethod(true,"getText"),BA.ObjectToString("null"))) { 
 BA.debugLineNum = 185;BA.debugLine="Electricity.Text = \"0\"";
Debug.ShouldStop(16777216);
educationaledit.mostCurrent._electricity.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 };
 BA.debugLineNum = 187;BA.debugLine="If LandArea.Text == \"null\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",educationaledit.mostCurrent._landarea.runMethod(true,"getText"),BA.ObjectToString("null"))) { 
 BA.debugLineNum = 188;BA.debugLine="LandArea.Text = \"0\"";
Debug.ShouldStop(134217728);
educationaledit.mostCurrent._landarea.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 191;BA.debugLine="schoollevel.SelectedIndex = schoollevel.IndexO";
Debug.ShouldStop(1073741824);
educationaledit.mostCurrent._schoollevel.runMethod(true,"setSelectedIndex",educationaledit.mostCurrent._schoollevel.runMethod(true,"IndexOf",(Object)(educationaledit._levelname)));
 BA.debugLineNum = 192;BA.debugLine="TypeOfEducation.SelectedIndex = TypeOfEducatio";
Debug.ShouldStop(-2147483648);
educationaledit.mostCurrent._typeofeducation.runMethod(true,"setSelectedIndex",educationaledit.mostCurrent._typeofeducation.runMethod(true,"IndexOf",(Object)(educationaledit._typeschoolname)));
 BA.debugLineNum = 193;BA.debugLine="Construction.SelectedIndex = Construction.Inde";
Debug.ShouldStop(1);
educationaledit.mostCurrent._construction.runMethod(true,"setSelectedIndex",educationaledit.mostCurrent._construction.runMethod(true,"IndexOf",(Object)(educationaledit._consname)));
 BA.debugLineNum = 194;BA.debugLine="Log(\"TYpe: \"&TypeOfEducation.SelectedIndex&\" L";
Debug.ShouldStop(2);
educationaledit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("TYpe: "),educationaledit.mostCurrent._typeofeducation.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(" Level: "),educationaledit.mostCurrent._schoollevel.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(" COns :"),educationaledit.mostCurrent._construction.runMethod(true,"getSelectedIndex"))));
 BA.debugLineNum = 195;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4);
educationaledit.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 1: {
 BA.debugLineNum = 198;BA.debugLine="Dim type_array As List";
Debug.ShouldStop(32);
_type_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("type_array", _type_array);
 BA.debugLineNum = 199;BA.debugLine="type_array = parser.NextArray";
Debug.ShouldStop(64);
_type_array = _parser.runMethod(false,"NextArray");Debug.locals.put("type_array", _type_array);
 BA.debugLineNum = 200;BA.debugLine="For i=0 To type_array.Size -1";
Debug.ShouldStop(128);
{
final int step63 = 1;
final int limit63 = RemoteObject.solve(new RemoteObject[] {_type_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step63 > 0 && _i <= limit63) || (step63 < 0 && _i >= limit63) ;_i = ((int)(0 + _i + step63))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 201;BA.debugLine="Dim a As Map";
Debug.ShouldStop(256);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 202;BA.debugLine="a = type_array.Get(i)";
Debug.ShouldStop(512);
_a.setObject(_type_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 203;BA.debugLine="Dim namatype, id_type As String";
Debug.ShouldStop(1024);
_namatype = RemoteObject.createImmutable("");Debug.locals.put("namatype", _namatype);
_id_type = RemoteObject.createImmutable("");Debug.locals.put("id_type", _id_type);
 BA.debugLineNum = 204;BA.debugLine="namatype= a.Get(\"name_of_level\")";
Debug.ShouldStop(2048);
_namatype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_level")))));Debug.locals.put("namatype", _namatype);
 BA.debugLineNum = 205;BA.debugLine="id_type = a.Get(\"level_id\")";
Debug.ShouldStop(4096);
_id_type = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("level_id")))));Debug.locals.put("id_type", _id_type);
 BA.debugLineNum = 206;BA.debugLine="schoollevel.Add(namatype)";
Debug.ShouldStop(8192);
educationaledit.mostCurrent._schoollevel.runVoidMethod ("Add",(Object)(_namatype));
 BA.debugLineNum = 207;BA.debugLine="LevelMap.Put(namatype,id_type)";
Debug.ShouldStop(16384);
educationaledit.mostCurrent._levelmap.runVoidMethod ("Put",(Object)((_namatype)),(Object)((_id_type)));
 BA.debugLineNum = 208;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&id_type)";
Debug.ShouldStop(32768);
educationaledit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ID Map: "),_namatype,RemoteObject.createImmutable(" "),_id_type)));
 }
}Debug.locals.put("i", _i);
;
 break; }
case 2: {
 BA.debugLineNum = 212;BA.debugLine="Dim cons_array As List";
Debug.ShouldStop(524288);
_cons_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("cons_array", _cons_array);
 BA.debugLineNum = 213;BA.debugLine="cons_array = parser.NextArray";
Debug.ShouldStop(1048576);
_cons_array = _parser.runMethod(false,"NextArray");Debug.locals.put("cons_array", _cons_array);
 BA.debugLineNum = 214;BA.debugLine="For j=0 To cons_array.Size -1";
Debug.ShouldStop(2097152);
{
final int step76 = 1;
final int limit76 = RemoteObject.solve(new RemoteObject[] {_cons_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step76 > 0 && _j <= limit76) || (step76 < 0 && _j >= limit76) ;_j = ((int)(0 + _j + step76))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 215;BA.debugLine="Dim a As Map";
Debug.ShouldStop(4194304);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 216;BA.debugLine="a = cons_array.Get(j)";
Debug.ShouldStop(8388608);
_a.setObject(_cons_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _j))));
 BA.debugLineNum = 217;BA.debugLine="Dim nama_type, id_type As String";
Debug.ShouldStop(16777216);
_nama_type = RemoteObject.createImmutable("");Debug.locals.put("nama_type", _nama_type);
_id_type = RemoteObject.createImmutable("");Debug.locals.put("id_type", _id_type);
 BA.debugLineNum = 218;BA.debugLine="nama_type= a.Get(\"name_of_type\")";
Debug.ShouldStop(33554432);
_nama_type = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_type")))));Debug.locals.put("nama_type", _nama_type);
 BA.debugLineNum = 219;BA.debugLine="id_type  = a.Get(\"type_id\")";
Debug.ShouldStop(67108864);
_id_type = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_id")))));Debug.locals.put("id_type", _id_type);
 BA.debugLineNum = 220;BA.debugLine="Construction.Add(nama_type)";
Debug.ShouldStop(134217728);
educationaledit.mostCurrent._construction.runVoidMethod ("Add",(Object)(_nama_type));
 BA.debugLineNum = 221;BA.debugLine="ConsMap.Put(nama_type, id_type )";
Debug.ShouldStop(268435456);
educationaledit.mostCurrent._consmap.runVoidMethod ("Put",(Object)((_nama_type)),(Object)((_id_type)));
 BA.debugLineNum = 222;BA.debugLine="Log(\"ID Map: \"&nama_type&\" \"& id_type )";
Debug.ShouldStop(536870912);
educationaledit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ID Map: "),_nama_type,RemoteObject.createImmutable(" "),_id_type)));
 }
}Debug.locals.put("j", _j);
;
 break; }
case 3: {
 BA.debugLineNum = 226;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2);
educationaledit.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 227;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 228;BA.debugLine="Msgbox(\"Data has been updated! :)\",\"Success\")";
Debug.ShouldStop(8);
educationaledit.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Data has been updated! :)")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Success"))),educationaledit.mostCurrent.activityBA);
 BA.debugLineNum = 229;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
educationaledit.mostCurrent._activity.runVoidMethod ("Finish");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e92) {
			BA.rdebugUtils.runVoidMethod("setLastException",educationaledit.processBA, e92.toString()); BA.debugLineNum = 231;BA.debugLine="Msgbox(\"Data can not be updated :(\" , \"error\"";
Debug.ShouldStop(64);
educationaledit.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Data can not be updated :(")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("error"))),educationaledit.mostCurrent.activityBA);
 };
 break; }
}
;
 };
 BA.debugLineNum = 235;BA.debugLine="Job.Release";
Debug.ShouldStop(1024);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
educationaledit._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim lat, lng As String";
educationaledit._lat = RemoteObject.createImmutable("");
educationaledit._lng = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim level,levelname,typeschool, typeschoolname,co";
educationaledit._level = RemoteObject.createImmutable("");
educationaledit._levelname = RemoteObject.createImmutable("");
educationaledit._typeschool = RemoteObject.createImmutable("");
educationaledit._typeschoolname = RemoteObject.createImmutable("");
educationaledit._cons = RemoteObject.createImmutable("");
educationaledit._consname = RemoteObject.createImmutable("");
educationaledit._typecons = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim idlevel, idcons, idtype As String";
educationaledit._idlevel = RemoteObject.createImmutable("");
educationaledit._idcons = RemoteObject.createImmutable("");
educationaledit._idtype = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Dim tipe_i , level_i, lbangunan_i, lparkir_i,ltan";
educationaledit._tipe_i = RemoteObject.createImmutable(0);
educationaledit._level_i = RemoteObject.createImmutable(0);
educationaledit._lbangunan_i = RemoteObject.createImmutable(0);
educationaledit._lparkir_i = RemoteObject.createImmutable(0);
educationaledit._ltanah_i = RemoteObject.createImmutable(0);
educationaledit._listrik_i = RemoteObject.createImmutable(0);
educationaledit._tahun_i = RemoteObject.createImmutable(0);
educationaledit._cons_i = RemoteObject.createImmutable(0);
educationaledit._teacher_i = RemoteObject.createImmutable(0);
educationaledit._student_i = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _schoollevel_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SchoolLevel_ItemClick (educationaledit) ","educationaledit",27,educationaledit.mostCurrent.activityBA,educationaledit.mostCurrent,250);
if (RapidSub.canDelegate("schoollevel_itemclick")) return b4a.example.educationaledit.remoteMe.runUserSub(false, "educationaledit","schoollevel_itemclick", _position, _value);
RemoteObject _id = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 250;BA.debugLine="Sub SchoolLevel_ItemClick (Position As Int, Value";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 251;BA.debugLine="Dim id As String";
Debug.ShouldStop(67108864);
_id = RemoteObject.createImmutable("");Debug.locals.put("id", _id);
 BA.debugLineNum = 252;BA.debugLine="id = LevelMap.Get(Value)";
Debug.ShouldStop(134217728);
_id = BA.ObjectToString(educationaledit.mostCurrent._levelmap.runMethod(false,"Get",(Object)(_value)));Debug.locals.put("id", _id);
 BA.debugLineNum = 253;BA.debugLine="idlevel = id";
Debug.ShouldStop(268435456);
educationaledit._idlevel = _id;
 BA.debugLineNum = 254;BA.debugLine="Log(idlevel)";
Debug.ShouldStop(536870912);
educationaledit.mostCurrent.__c.runVoidMethod ("Log",(Object)(educationaledit._idlevel));
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
public static RemoteObject  _setbackgroundtintlist(RemoteObject _view,RemoteObject _active,RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundTintList (educationaledit) ","educationaledit",27,educationaledit.mostCurrent.activityBA,educationaledit.mostCurrent,109);
if (RapidSub.canDelegate("setbackgroundtintlist")) return b4a.example.educationaledit.remoteMe.runUserSub(false, "educationaledit","setbackgroundtintlist", _view, _active, _enabled);
RemoteObject _states = null;
RemoteObject _color = null;
RemoteObject _csl = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("View", _view);
Debug.locals.put("Active", _active);
Debug.locals.put("Enabled", _enabled);
 BA.debugLineNum = 109;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="Dim States(2,1) As Int";
Debug.ShouldStop(8192);
_states = RemoteObject.createNewArray ("int", new int[] {2,1}, new Object[]{});Debug.locals.put("States", _states);
 BA.debugLineNum = 111;BA.debugLine="States(0,0) = 16842908     'Active";
Debug.ShouldStop(16384);
_states.setArrayElement (BA.numberCast(int.class, 16842908),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 112;BA.debugLine="States(1,0) = 16842910    'Enabled";
Debug.ShouldStop(32768);
_states.setArrayElement (BA.numberCast(int.class, 16842910),BA.numberCast(int.class, 1),BA.numberCast(int.class, 0));
 BA.debugLineNum = 113;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
Debug.ShouldStop(65536);
_color = RemoteObject.createNewArray("int",new int[] {2},new Object[] {_active,_enabled});Debug.locals.put("Color", _color);Debug.locals.put("Color", _color);
 BA.debugLineNum = 114;BA.debugLine="Dim CSL As JavaObject";
Debug.ShouldStop(131072);
_csl = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("CSL", _csl);
 BA.debugLineNum = 115;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
Debug.ShouldStop(262144);
_csl.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.content.res.ColorStateList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_states),(_color)})));
 BA.debugLineNum = 116;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(524288);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 117;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
Debug.ShouldStop(1048576);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.support.v4.view.ViewCompat")));
 BA.debugLineNum = 118;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
Debug.ShouldStop(2097152);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBackgroundTintList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_view.getObject()),(_csl.getObject())})));
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
public static RemoteObject  _typeofeducation_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("TypeOfEducation_ItemClick (educationaledit) ","educationaledit",27,educationaledit.mostCurrent.activityBA,educationaledit.mostCurrent,243);
if (RapidSub.canDelegate("typeofeducation_itemclick")) return b4a.example.educationaledit.remoteMe.runUserSub(false, "educationaledit","typeofeducation_itemclick", _position, _value);
RemoteObject _id = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 243;BA.debugLine="Sub TypeOfEducation_ItemClick (Position As Int, Va";
Debug.ShouldStop(262144);
 BA.debugLineNum = 244;BA.debugLine="Dim id As String";
Debug.ShouldStop(524288);
_id = RemoteObject.createImmutable("");Debug.locals.put("id", _id);
 BA.debugLineNum = 245;BA.debugLine="id = EduMap.Get(Value)";
Debug.ShouldStop(1048576);
_id = BA.ObjectToString(educationaledit.mostCurrent._edumap.runMethod(false,"Get",(Object)(_value)));Debug.locals.put("id", _id);
 BA.debugLineNum = 246;BA.debugLine="idtype = id";
Debug.ShouldStop(2097152);
educationaledit._idtype = _id;
 BA.debugLineNum = 247;BA.debugLine="Log(idtype)";
Debug.ShouldStop(4194304);
educationaledit.mostCurrent.__c.runVoidMethod ("Log",(Object)(educationaledit._idtype));
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}