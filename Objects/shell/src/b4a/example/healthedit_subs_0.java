package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class healthedit_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (healthedit) ","healthedit",38,healthedit.mostCurrent.activityBA,healthedit.mostCurrent,48);
if (RapidSub.canDelegate("activity_create")) return b4a.example.healthedit.remoteMe.runUserSub(false, "healthedit","activity_create", _firsttime);
RemoteObject _sv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(131072);
healthedit.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),healthedit.mostCurrent.activityBA);
 BA.debugLineNum = 51;BA.debugLine="ScrollView1.Panel.LoadLayout(\"HealthEdit\")";
Debug.ShouldStop(262144);
healthedit.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("HealthEdit")),healthedit.mostCurrent.activityBA);
 BA.debugLineNum = 52;BA.debugLine="PanelToolbar.Visible = False";
Debug.ShouldStop(524288);
healthedit.mostCurrent._paneltoolbar.runMethod(true,"setVisible",healthedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 53;BA.debugLine="LblEdit.Visible = True";
Debug.ShouldStop(1048576);
healthedit.mostCurrent._lbledit.runMethod(true,"setVisible",healthedit.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 55;BA.debugLine="BackArrow.Visible= True";
Debug.ShouldStop(4194304);
healthedit.mostCurrent._backarrow.runMethod(true,"setVisible",healthedit.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 56;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(8388608);
healthedit.mostCurrent._backarrow.runVoidMethod ("SetBackgroundImageNew",(Object)((healthedit.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(healthedit.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("back-arrow.png"))).getObject())));
 BA.debugLineNum = 57;BA.debugLine="TitleBar.Text=\"Building Detail\"";
Debug.ShouldStop(16777216);
healthedit.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("Building Detail"));
 BA.debugLineNum = 59;BA.debugLine="SetBackgroundTintList(HealthName, Colors.ARGB(225";
Debug.ShouldStop(67108864);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), healthedit.mostCurrent._healthname.getObject()),healthedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),healthedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 60;BA.debugLine="SetBackgroundTintList(HeadOffice, Colors.ARGB(225";
Debug.ShouldStop(134217728);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), healthedit.mostCurrent._headoffice.getObject()),healthedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),healthedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 61;BA.debugLine="SetBackgroundTintList(NumMedical, Colors.ARGB(225";
Debug.ShouldStop(268435456);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), healthedit.mostCurrent._nummedical.getObject()),healthedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),healthedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 62;BA.debugLine="SetBackgroundTintList(NumNonMedical, Colors.ARGB(";
Debug.ShouldStop(536870912);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), healthedit.mostCurrent._numnonmedical.getObject()),healthedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),healthedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 63;BA.debugLine="SetBackgroundTintList(StandingYear, Colors.ARGB(2";
Debug.ShouldStop(1073741824);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), healthedit.mostCurrent._standingyear.getObject()),healthedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),healthedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 64;BA.debugLine="SetBackgroundTintList(BuildingArea, Colors.ARGB(2";
Debug.ShouldStop(-2147483648);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), healthedit.mostCurrent._buildingarea.getObject()),healthedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),healthedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 65;BA.debugLine="SetBackgroundTintList(LandArea, Colors.ARGB(225,3";
Debug.ShouldStop(1);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), healthedit.mostCurrent._landarea.getObject()),healthedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),healthedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 66;BA.debugLine="SetBackgroundTintList(Electricity, Colors.ARGB(22";
Debug.ShouldStop(2);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), healthedit.mostCurrent._electricity.getObject()),healthedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),healthedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 67;BA.debugLine="SetBackgroundTintList(ParkingArea, Colors.ARGB(22";
Debug.ShouldStop(4);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), healthedit.mostCurrent._parkingarea.getObject()),healthedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),healthedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 70;BA.debugLine="If HealthBuilding.nameBuilding.Length > 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",healthedit.mostCurrent._healthbuilding._namebuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 71;BA.debugLine="HealthName.Text = HealthBuilding.nameBuilding";
Debug.ShouldStop(64);
healthedit.mostCurrent._healthname.runMethod(true,"setText",BA.ObjectToCharSequence(healthedit.mostCurrent._healthbuilding._namebuilding));
 BA.debugLineNum = 72;BA.debugLine="ids =HealthBuilding.idBuilding";
Debug.ShouldStop(128);
healthedit.mostCurrent._ids = healthedit.mostCurrent._healthbuilding._idbuilding;
 BA.debugLineNum = 73;BA.debugLine="Log(ids)";
Debug.ShouldStop(256);
healthedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(healthedit.mostCurrent._ids));
 }else 
{ BA.debugLineNum = 74;BA.debugLine="Else If SearchBuilding.nameBuilding.Length > 0 Th";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",healthedit.mostCurrent._searchbuilding._namebuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 75;BA.debugLine="HealthName.Text = SearchBuilding.nameBuilding";
Debug.ShouldStop(1024);
healthedit.mostCurrent._healthname.runMethod(true,"setText",BA.ObjectToCharSequence(healthedit.mostCurrent._searchbuilding._namebuilding));
 BA.debugLineNum = 76;BA.debugLine="ids =SearchBuilding.idBuilding";
Debug.ShouldStop(2048);
healthedit.mostCurrent._ids = healthedit.mostCurrent._searchbuilding._idbuilding;
 BA.debugLineNum = 77;BA.debugLine="Log(ids)";
Debug.ShouldStop(4096);
healthedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(healthedit.mostCurrent._ids));
 }else {
 BA.debugLineNum = 79;BA.debugLine="HealthName.Text = \"Please press on the button an";
Debug.ShouldStop(16384);
healthedit.mostCurrent._healthname.runMethod(true,"setText",BA.ObjectToCharSequence("Please press on the button and choose an item."));
 }}
;
 BA.debugLineNum = 83;BA.debugLine="Dim sv As ScrollView";
Debug.ShouldStop(262144);
_sv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");Debug.locals.put("sv", _sv);
 BA.debugLineNum = 84;BA.debugLine="ScrollView1.Height=100%y";
Debug.ShouldStop(524288);
healthedit.mostCurrent._scrollview1.runMethod(true,"setHeight",healthedit.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),healthedit.mostCurrent.activityBA));
 BA.debugLineNum = 85;BA.debugLine="PanelBuildingList.Height = BtnSaveChanges.Top+Btn";
Debug.ShouldStop(1048576);
healthedit.mostCurrent._panelbuildinglist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {healthedit.mostCurrent._btnsavechanges.runMethod(true,"getTop"),healthedit.mostCurrent._btnsavechanges.runMethod(true,"getHeight"),healthedit.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),healthedit.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 86;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
Debug.ShouldStop(2097152);
healthedit.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",healthedit.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (healthedit) ","healthedit",38,healthedit.mostCurrent.activityBA,healthedit.mostCurrent,101);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.healthedit.remoteMe.runUserSub(false, "healthedit","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 101;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (healthedit) ","healthedit",38,healthedit.mostCurrent.activityBA,healthedit.mostCurrent,89);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.healthedit.remoteMe.runUserSub(false, "healthedit","activity_resume");
 BA.debugLineNum = 89;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="HealthMap.Initialize";
Debug.ShouldStop(33554432);
healthedit.mostCurrent._healthmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 91;BA.debugLine="ConsMap.Initialize";
Debug.ShouldStop(67108864);
healthedit.mostCurrent._consmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 92;BA.debugLine="HealthMap.Clear";
Debug.ShouldStop(134217728);
healthedit.mostCurrent._healthmap.runVoidMethod ("Clear");
 BA.debugLineNum = 93;BA.debugLine="ConsMap.Clear";
Debug.ShouldStop(268435456);
healthedit.mostCurrent._consmap.runVoidMethod ("Clear");
 BA.debugLineNum = 94;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(536870912);
healthedit.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",healthedit.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Loading..."))));
 BA.debugLineNum = 95;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_type";
Debug.ShouldStop(1073741824);
_executeremotequery(BA.ObjectToString("SELECT type_id, name_of_type FROM type_of_construction ORDER BY name_of_type ASC "),RemoteObject.createImmutable("Construction"));
 BA.debugLineNum = 96;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_type";
Debug.ShouldStop(-2147483648);
_executeremotequery(BA.ObjectToString("SELECT type_id, name_of_type FROM type_of_health_building ORDER BY name_of_type ASC"),RemoteObject.createImmutable("TypeHealth"));
 BA.debugLineNum = 97;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.health_building_id,";
Debug.ShouldStop(1);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT H.health_building_id, H.name_of_health_building, H.building_area, H.land_area, H.parking_area, H.standing_year, H.electricity_capacity, H.address, H.type_of_construction, H.type_of_health_building, H.name_of_head, H.number_of_medical_personnel, H.number_of_nonmedical_personnel, ST_X(ST_Centroid(H.geom)) As longitude, ST_Y(ST_CENTROID(H.geom)) As latitude,T.name_of_type As constr, J.name_of_type As typeh,ST_AsText(geom) As geom FROM health_building As H LEFT JOIN type_of_construction As T ON H.type_of_construction=T.type_id LEFT JOIN type_of_health_building As J ON H.type_of_health_building=J.type_id WHERE H.health_building_id='"),healthedit.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("DATA"));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("BackArrow_Click (healthedit) ","healthedit",38,healthedit.mostCurrent.activityBA,healthedit.mostCurrent,230);
if (RapidSub.canDelegate("backarrow_click")) return b4a.example.healthedit.remoteMe.runUserSub(false, "healthedit","backarrow_click");
 BA.debugLineNum = 230;BA.debugLine="Sub BackArrow_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 231;BA.debugLine="Activity.Finish";
Debug.ShouldStop(64);
healthedit.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("btnGallery_Click (healthedit) ","healthedit",38,healthedit.mostCurrent.activityBA,healthedit.mostCurrent,234);
if (RapidSub.canDelegate("btngallery_click")) return b4a.example.healthedit.remoteMe.runUserSub(false, "healthedit","btngallery_click");
 BA.debugLineNum = 234;BA.debugLine="Sub btnGallery_Click";
Debug.ShouldStop(512);
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
public static RemoteObject  _btnsavechanges_click() throws Exception{
try {
		Debug.PushSubsStack("BtnSaveChanges_Click (healthedit) ","healthedit",38,healthedit.mostCurrent.activityBA,healthedit.mostCurrent,253);
if (RapidSub.canDelegate("btnsavechanges_click")) return b4a.example.healthedit.remoteMe.runUserSub(false, "healthedit","btnsavechanges_click");
 BA.debugLineNum = 253;BA.debugLine="Sub BtnSaveChanges_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 254;BA.debugLine="Log(ids)";
Debug.ShouldStop(536870912);
healthedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(healthedit.mostCurrent._ids));
 BA.debugLineNum = 255;BA.debugLine="If typehealth == \"\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",healthedit._typehealth,BA.ObjectToString(""))) { 
 BA.debugLineNum = 256;BA.debugLine="tipe_i = tipp";
Debug.ShouldStop(-2147483648);
healthedit._tipe_i = BA.numberCast(int.class, healthedit._tipp);
 }else {
 BA.debugLineNum = 258;BA.debugLine="tipe_i = typehealth";
Debug.ShouldStop(2);
healthedit._tipe_i = BA.numberCast(int.class, healthedit._typehealth);
 };
 BA.debugLineNum = 261;BA.debugLine="lbangunan_i = BuildingArea.Text";
Debug.ShouldStop(16);
healthedit._lbangunan_i = BA.numberCast(int.class, healthedit.mostCurrent._buildingarea.runMethod(true,"getText"));
 BA.debugLineNum = 262;BA.debugLine="lparkir_i = ParkingArea.Text";
Debug.ShouldStop(32);
healthedit._lparkir_i = BA.numberCast(int.class, healthedit.mostCurrent._parkingarea.runMethod(true,"getText"));
 BA.debugLineNum = 263;BA.debugLine="ltanah_i = LandArea.Text";
Debug.ShouldStop(64);
healthedit._ltanah_i = BA.numberCast(int.class, healthedit.mostCurrent._landarea.runMethod(true,"getText"));
 BA.debugLineNum = 264;BA.debugLine="listrik_i = Electricity.Text";
Debug.ShouldStop(128);
healthedit._listrik_i = BA.numberCast(int.class, healthedit.mostCurrent._electricity.runMethod(true,"getText"));
 BA.debugLineNum = 265;BA.debugLine="tahun_i = StandingYear.Text";
Debug.ShouldStop(256);
healthedit._tahun_i = BA.numberCast(int.class, healthedit.mostCurrent._standingyear.runMethod(true,"getText"));
 BA.debugLineNum = 266;BA.debugLine="medic_i = NumMedical.Text";
Debug.ShouldStop(512);
healthedit._medic_i = BA.numberCast(int.class, healthedit.mostCurrent._nummedical.runMethod(true,"getText"));
 BA.debugLineNum = 267;BA.debugLine="nonmedic_i = NumNonMedical.Text";
Debug.ShouldStop(1024);
healthedit._nonmedic_i = BA.numberCast(int.class, healthedit.mostCurrent._numnonmedical.runMethod(true,"getText"));
 BA.debugLineNum = 269;BA.debugLine="If typecons == \"\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",healthedit._typecons,BA.ObjectToString(""))) { 
 BA.debugLineNum = 270;BA.debugLine="cons_i = cons";
Debug.ShouldStop(8192);
healthedit._cons_i = BA.numberCast(int.class, healthedit._cons);
 }else {
 BA.debugLineNum = 272;BA.debugLine="cons_i = typecons";
Debug.ShouldStop(32768);
healthedit._cons_i = BA.numberCast(int.class, healthedit._typecons);
 };
 BA.debugLineNum = 275;BA.debugLine="Log(tipe_i)";
Debug.ShouldStop(262144);
healthedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(healthedit._tipe_i)));
 BA.debugLineNum = 276;BA.debugLine="Log(cons_i)";
Debug.ShouldStop(524288);
healthedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(healthedit._cons_i)));
 BA.debugLineNum = 277;BA.debugLine="If IsNumber(tipe_i) Then";
Debug.ShouldStop(1048576);
if (healthedit.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(BA.NumberToString(healthedit._tipe_i))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 278;BA.debugLine="Log(\"\"&tipe_i&\" is a number\")";
Debug.ShouldStop(2097152);
healthedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),healthedit._tipe_i,RemoteObject.createImmutable(" is a number"))));
 }else {
 BA.debugLineNum = 280;BA.debugLine="Log(\"\"&tipe_i&\" is not a number\")";
Debug.ShouldStop(8388608);
healthedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),healthedit._tipe_i,RemoteObject.createImmutable(" is not a number"))));
 };
 BA.debugLineNum = 282;BA.debugLine="ProgressDialogShow(\"loading...\")";
Debug.ShouldStop(33554432);
healthedit.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",healthedit.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("loading..."))));
 BA.debugLineNum = 283;BA.debugLine="ExecuteRemoteQuery(\"UPDATE health_building SET na";
Debug.ShouldStop(67108864);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("UPDATE health_building SET name_of_health_building = '"),healthedit._nama,RemoteObject.createImmutable("', type_of_health_building = "),healthedit._tipe_i,RemoteObject.createImmutable(", building_area = "),healthedit._lbangunan_i,RemoteObject.createImmutable(",	land_area = "),healthedit._ltanah_i,RemoteObject.createImmutable(",parking_area = "),healthedit._lparkir_i,RemoteObject.createImmutable(",standing_year = "),healthedit._tahun_i,RemoteObject.createImmutable(",	electricity_capacity = "),healthedit._listrik_i,RemoteObject.createImmutable(",type_of_construction = "),healthedit._cons_i,RemoteObject.createImmutable(",	name_of_head = '"),healthedit._kepala,RemoteObject.createImmutable("',number_of_medical_personnel = "),healthedit._medic_i,RemoteObject.createImmutable(",number_of_nonmedical_personnel = "),healthedit._nonmedic_i,RemoteObject.createImmutable(" WHERE health_building_id = '"),healthedit.mostCurrent._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("Update"));
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Construction_ItemClick (healthedit) ","healthedit",38,healthedit.mostCurrent.activityBA,healthedit.mostCurrent,246);
if (RapidSub.canDelegate("construction_itemclick")) return b4a.example.healthedit.remoteMe.runUserSub(false, "healthedit","construction_itemclick", _position, _value);
RemoteObject _idc = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 246;BA.debugLine="Sub Construction_ItemClick (Position As Int, Value";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 247;BA.debugLine="Dim idc As String";
Debug.ShouldStop(4194304);
_idc = RemoteObject.createImmutable("");Debug.locals.put("idc", _idc);
 BA.debugLineNum = 248;BA.debugLine="idc = ConsMap.Get(Value)";
Debug.ShouldStop(8388608);
_idc = BA.ObjectToString(healthedit.mostCurrent._consmap.runMethod(false,"Get",(Object)(_value)));Debug.locals.put("idc", _idc);
 BA.debugLineNum = 249;BA.debugLine="typecons = idc";
Debug.ShouldStop(16777216);
healthedit._typecons = _idc;
 BA.debugLineNum = 250;BA.debugLine="Log(typecons)";
Debug.ShouldStop(33554432);
healthedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(healthedit._typecons));
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
public static RemoteObject  _executeremotequery(RemoteObject _query,RemoteObject _jobname) throws Exception{
try {
		Debug.PushSubsStack("ExecuteRemoteQuery (healthedit) ","healthedit",38,healthedit.mostCurrent.activityBA,healthedit.mostCurrent,117);
if (RapidSub.canDelegate("executeremotequery")) return b4a.example.healthedit.remoteMe.runUserSub(false, "healthedit","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 117;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(2097152);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 119;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(4194304);
_job.runVoidMethod ("_initialize",healthedit.processBA,(Object)(_jobname),(Object)(healthedit.getObject()));
 BA.debugLineNum = 120;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
Debug.ShouldStop(8388608);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),healthedit.mostCurrent._main._server,RemoteObject.createImmutable("mobile/json.php"))),(Object)(_query));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 22;BA.debugLine="Private ScrollView1 As ScrollView";
healthedit.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private TitleBar As Label";
healthedit.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private BackArrow As Label";
healthedit.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private PanelBuildingList As Panel";
healthedit.mostCurrent._panelbuildinglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private PanelToolbar As Panel";
healthedit.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private LblEdit As Label";
healthedit.mostCurrent._lbledit = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Dim ids As String";
healthedit.mostCurrent._ids = RemoteObject.createImmutable("");
 //BA.debugLineNum = 31;BA.debugLine="Private TypeOfHealth As Spinner";
healthedit.mostCurrent._typeofhealth = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private HeadOffice As Label";
healthedit.mostCurrent._headoffice = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private NumMedical As Label";
healthedit.mostCurrent._nummedical = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private NumNonMedical As Label";
healthedit.mostCurrent._numnonmedical = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private StandingYear As Label";
healthedit.mostCurrent._standingyear = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private BuildingArea As Label";
healthedit.mostCurrent._buildingarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private LandArea As Label";
healthedit.mostCurrent._landarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private ParkingArea As Label";
healthedit.mostCurrent._parkingarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private Electricity As Label";
healthedit.mostCurrent._electricity = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private Construction As Spinner";
healthedit.mostCurrent._construction = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private HealthName As Label";
healthedit.mostCurrent._healthname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Dim HealthMap As Map";
healthedit.mostCurrent._healthmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 44;BA.debugLine="Dim ConsMap As Map";
healthedit.mostCurrent._consmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 45;BA.debugLine="Private BtnSaveChanges As Button";
healthedit.mostCurrent._btnsavechanges = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (healthedit) ","healthedit",38,healthedit.mostCurrent.activityBA,healthedit.mostCurrent,123);
if (RapidSub.canDelegate("jobdone")) return b4a.example.healthedit.remoteMe.runUserSub(false, "healthedit","jobdone", _job);
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
 BA.debugLineNum = 123;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(134217728);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 125;BA.debugLine="Dim res As String";
Debug.ShouldStop(268435456);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 126;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(536870912);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 127;BA.debugLine="Log(\"Response from server :\"& res)";
Debug.ShouldStop(1073741824);
healthedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 128;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(-2147483648);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 129;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(1);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 130;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(2);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("DATA"),BA.ObjectToString("TypeHealth"),BA.ObjectToString("Construction"),BA.ObjectToString("Update"))) {
case 0: {
 BA.debugLineNum = 132;BA.debugLine="Dim data_array As List";
Debug.ShouldStop(8);
_data_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 133;BA.debugLine="data_array = parser.NextArray";
Debug.ShouldStop(16);
_data_array = _parser.runMethod(false,"NextArray");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 134;BA.debugLine="For i=0 To data_array.Size -1";
Debug.ShouldStop(32);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_data_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 135;BA.debugLine="Dim a As Map";
Debug.ShouldStop(64);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 136;BA.debugLine="a = data_array.Get(i)";
Debug.ShouldStop(128);
_a.setObject(_data_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 137;BA.debugLine="lat = a.Get(\"latitude\")";
Debug.ShouldStop(256);
healthedit._lat = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("latitude")))));
 BA.debugLineNum = 138;BA.debugLine="lng = a.Get(\"longitude\")";
Debug.ShouldStop(512);
healthedit._lng = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("longitude")))));
 BA.debugLineNum = 139;BA.debugLine="Log(lat)";
Debug.ShouldStop(1024);
healthedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(healthedit._lat));
 BA.debugLineNum = 140;BA.debugLine="Log(lng)";
Debug.ShouldStop(2048);
healthedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(healthedit._lng));
 BA.debugLineNum = 141;BA.debugLine="HealthName.Text = a.Get(\"name_of_health_build";
Debug.ShouldStop(4096);
healthedit.mostCurrent._healthname.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_health_building"))))));
 BA.debugLineNum = 142;BA.debugLine="tipp = a.Get(\"type_of_health_building\")";
Debug.ShouldStop(8192);
healthedit._tipp = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_of_health_building")))));
 BA.debugLineNum = 143;BA.debugLine="tipname = a.Get(\"typeh\")";
Debug.ShouldStop(16384);
healthedit._tipname = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("typeh")))));
 BA.debugLineNum = 144;BA.debugLine="Log(\"Data jenis :\"&tipp)";
Debug.ShouldStop(32768);
healthedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Data jenis :"),healthedit._tipp)));
 BA.debugLineNum = 145;BA.debugLine="HeadOffice.Text = a.Get(\"name_of_head\")";
Debug.ShouldStop(65536);
healthedit.mostCurrent._headoffice.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_head"))))));
 BA.debugLineNum = 146;BA.debugLine="NumMedical.Text = a.Get(\"number_of_medical_pe";
Debug.ShouldStop(131072);
healthedit.mostCurrent._nummedical.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("number_of_medical_personnel"))))));
 BA.debugLineNum = 147;BA.debugLine="NumNonMedical.Text = a.Get(\"number_of_nonmedi";
Debug.ShouldStop(262144);
healthedit.mostCurrent._numnonmedical.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("number_of_nonmedical_personnel"))))));
 BA.debugLineNum = 148;BA.debugLine="StandingYear.Text = a.Get(\"standing_year\")";
Debug.ShouldStop(524288);
healthedit.mostCurrent._standingyear.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("standing_year"))))));
 BA.debugLineNum = 149;BA.debugLine="BuildingArea.Text = a.Get(\"building_area\")";
Debug.ShouldStop(1048576);
healthedit.mostCurrent._buildingarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("building_area"))))));
 BA.debugLineNum = 150;BA.debugLine="LandArea.Text = a.Get(\"land_area\")";
Debug.ShouldStop(2097152);
healthedit.mostCurrent._landarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("land_area"))))));
 BA.debugLineNum = 151;BA.debugLine="ParkingArea.Text = a.Get(\"parking_area\")";
Debug.ShouldStop(4194304);
healthedit.mostCurrent._parkingarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parking_area"))))));
 BA.debugLineNum = 152;BA.debugLine="Electricity.Text = a.Get(\"electricity_capacit";
Debug.ShouldStop(8388608);
healthedit.mostCurrent._electricity.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("electricity_capacity"))))));
 BA.debugLineNum = 153;BA.debugLine="cons = a.Get(\"type_of_construction\")";
Debug.ShouldStop(16777216);
healthedit._cons = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_of_construction")))));
 BA.debugLineNum = 154;BA.debugLine="consname = a.Get(\"constr\")";
Debug.ShouldStop(33554432);
healthedit._consname = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("constr")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 156;BA.debugLine="If StandingYear.Text == \"null\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",healthedit.mostCurrent._standingyear.runMethod(true,"getText"),BA.ObjectToString("null"))) { 
 BA.debugLineNum = 157;BA.debugLine="StandingYear.Text = \"0\"";
Debug.ShouldStop(268435456);
healthedit.mostCurrent._standingyear.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 };
 BA.debugLineNum = 159;BA.debugLine="If BuildingArea.Text == \"null\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",healthedit.mostCurrent._buildingarea.runMethod(true,"getText"),BA.ObjectToString("null"))) { 
 BA.debugLineNum = 160;BA.debugLine="BuildingArea.Text = \"0\"";
Debug.ShouldStop(-2147483648);
healthedit.mostCurrent._buildingarea.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 };
 BA.debugLineNum = 162;BA.debugLine="If ParkingArea.Text == \"null\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",healthedit.mostCurrent._parkingarea.runMethod(true,"getText"),BA.ObjectToString("null"))) { 
 BA.debugLineNum = 163;BA.debugLine="ParkingArea.Text = \"0\"";
Debug.ShouldStop(4);
healthedit.mostCurrent._parkingarea.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 };
 BA.debugLineNum = 165;BA.debugLine="If Electricity.Text == \"null\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",healthedit.mostCurrent._electricity.runMethod(true,"getText"),BA.ObjectToString("null"))) { 
 BA.debugLineNum = 166;BA.debugLine="Electricity.Text = \"0\"";
Debug.ShouldStop(32);
healthedit.mostCurrent._electricity.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 };
 BA.debugLineNum = 168;BA.debugLine="If LandArea.Text == \"null\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",healthedit.mostCurrent._landarea.runMethod(true,"getText"),BA.ObjectToString("null"))) { 
 BA.debugLineNum = 169;BA.debugLine="LandArea.Text = \"0\"";
Debug.ShouldStop(256);
healthedit.mostCurrent._landarea.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 };
 BA.debugLineNum = 171;BA.debugLine="Log(\"Data konstruksi :\"&cons)";
Debug.ShouldStop(1024);
healthedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Data konstruksi :"),healthedit._cons)));
 BA.debugLineNum = 172;BA.debugLine="nama=HealthName.Text";
Debug.ShouldStop(2048);
healthedit._nama = healthedit.mostCurrent._healthname.runMethod(true,"getText");
 BA.debugLineNum = 173;BA.debugLine="kepala = HeadOffice.Text";
Debug.ShouldStop(4096);
healthedit._kepala = healthedit.mostCurrent._headoffice.runMethod(true,"getText");
 BA.debugLineNum = 174;BA.debugLine="medic = NumMedical.Text";
Debug.ShouldStop(8192);
healthedit._medic = healthedit.mostCurrent._nummedical.runMethod(true,"getText");
 BA.debugLineNum = 175;BA.debugLine="nonmedic = NumNonMedical.Text";
Debug.ShouldStop(16384);
healthedit._nonmedic = healthedit.mostCurrent._numnonmedical.runMethod(true,"getText");
 BA.debugLineNum = 176;BA.debugLine="tahun= StandingYear.Text";
Debug.ShouldStop(32768);
healthedit._tahun = healthedit.mostCurrent._standingyear.runMethod(true,"getText");
 BA.debugLineNum = 177;BA.debugLine="ltanah= LandArea.Text";
Debug.ShouldStop(65536);
healthedit._ltanah = healthedit.mostCurrent._landarea.runMethod(true,"getText");
 BA.debugLineNum = 178;BA.debugLine="lparkir= ParkingArea.Text";
Debug.ShouldStop(131072);
healthedit._lparkir = healthedit.mostCurrent._parkingarea.runMethod(true,"getText");
 BA.debugLineNum = 179;BA.debugLine="lbangunan= BuildingArea.Text";
Debug.ShouldStop(262144);
healthedit._lbangunan = healthedit.mostCurrent._buildingarea.runMethod(true,"getText");
 BA.debugLineNum = 180;BA.debugLine="listrik= Electricity.Text";
Debug.ShouldStop(524288);
healthedit._listrik = healthedit.mostCurrent._electricity.runMethod(true,"getText");
 BA.debugLineNum = 182;BA.debugLine="TypeOfHealth.SelectedIndex = TypeOfHealth.Ind";
Debug.ShouldStop(2097152);
healthedit.mostCurrent._typeofhealth.runMethod(true,"setSelectedIndex",healthedit.mostCurrent._typeofhealth.runMethod(true,"IndexOf",(Object)(healthedit._tipname)));
 BA.debugLineNum = 183;BA.debugLine="Construction.SelectedIndex = Construction.Ind";
Debug.ShouldStop(4194304);
healthedit.mostCurrent._construction.runMethod(true,"setSelectedIndex",healthedit.mostCurrent._construction.runMethod(true,"IndexOf",(Object)(healthedit._consname)));
 BA.debugLineNum = 185;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16777216);
healthedit.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 1: {
 BA.debugLineNum = 187;BA.debugLine="Dim type_array As List";
Debug.ShouldStop(67108864);
_type_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("type_array", _type_array);
 BA.debugLineNum = 188;BA.debugLine="type_array = parser.NextArray";
Debug.ShouldStop(134217728);
_type_array = _parser.runMethod(false,"NextArray");Debug.locals.put("type_array", _type_array);
 BA.debugLineNum = 189;BA.debugLine="For i=0 To type_array.Size -1";
Debug.ShouldStop(268435456);
{
final int step64 = 1;
final int limit64 = RemoteObject.solve(new RemoteObject[] {_type_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step64 > 0 && _i <= limit64) || (step64 < 0 && _i >= limit64) ;_i = ((int)(0 + _i + step64))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 190;BA.debugLine="Dim a As Map";
Debug.ShouldStop(536870912);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 191;BA.debugLine="a = type_array.Get(i)";
Debug.ShouldStop(1073741824);
_a.setObject(_type_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 192;BA.debugLine="Dim namatype, idtype As String";
Debug.ShouldStop(-2147483648);
_namatype = RemoteObject.createImmutable("");Debug.locals.put("namatype", _namatype);
_idtype = RemoteObject.createImmutable("");Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 193;BA.debugLine="namatype= a.Get(\"name_of_type\")";
Debug.ShouldStop(1);
_namatype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_type")))));Debug.locals.put("namatype", _namatype);
 BA.debugLineNum = 194;BA.debugLine="idtype = a.Get(\"type_id\")";
Debug.ShouldStop(2);
_idtype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_id")))));Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 196;BA.debugLine="TypeOfHealth.Add(namatype)";
Debug.ShouldStop(8);
healthedit.mostCurrent._typeofhealth.runVoidMethod ("Add",(Object)(_namatype));
 BA.debugLineNum = 197;BA.debugLine="HealthMap.Put(namatype,idtype)";
Debug.ShouldStop(16);
healthedit.mostCurrent._healthmap.runVoidMethod ("Put",(Object)((_namatype)),(Object)((_idtype)));
 BA.debugLineNum = 198;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
Debug.ShouldStop(32);
healthedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ID Map: "),_namatype,RemoteObject.createImmutable(" "),_idtype)));
 }
}Debug.locals.put("i", _i);
;
 break; }
case 2: {
 BA.debugLineNum = 202;BA.debugLine="Dim cons_array As List";
Debug.ShouldStop(512);
_cons_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("cons_array", _cons_array);
 BA.debugLineNum = 203;BA.debugLine="cons_array = parser.NextArray";
Debug.ShouldStop(1024);
_cons_array = _parser.runMethod(false,"NextArray");Debug.locals.put("cons_array", _cons_array);
 BA.debugLineNum = 204;BA.debugLine="For j=0 To cons_array.Size -1";
Debug.ShouldStop(2048);
{
final int step77 = 1;
final int limit77 = RemoteObject.solve(new RemoteObject[] {_cons_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step77 > 0 && _j <= limit77) || (step77 < 0 && _j >= limit77) ;_j = ((int)(0 + _j + step77))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 205;BA.debugLine="Dim a As Map";
Debug.ShouldStop(4096);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 206;BA.debugLine="a = cons_array.Get(j)";
Debug.ShouldStop(8192);
_a.setObject(_cons_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _j))));
 BA.debugLineNum = 207;BA.debugLine="Dim nama_type, id_type As String";
Debug.ShouldStop(16384);
_nama_type = RemoteObject.createImmutable("");Debug.locals.put("nama_type", _nama_type);
_id_type = RemoteObject.createImmutable("");Debug.locals.put("id_type", _id_type);
 BA.debugLineNum = 208;BA.debugLine="nama_type= a.Get(\"name_of_type\")";
Debug.ShouldStop(32768);
_nama_type = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_type")))));Debug.locals.put("nama_type", _nama_type);
 BA.debugLineNum = 209;BA.debugLine="id_type = a.Get(\"type_id\")";
Debug.ShouldStop(65536);
_id_type = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_id")))));Debug.locals.put("id_type", _id_type);
 BA.debugLineNum = 211;BA.debugLine="Construction.Add(nama_type)";
Debug.ShouldStop(262144);
healthedit.mostCurrent._construction.runVoidMethod ("Add",(Object)(_nama_type));
 BA.debugLineNum = 212;BA.debugLine="ConsMap.Put(nama_type,id_type)";
Debug.ShouldStop(524288);
healthedit.mostCurrent._consmap.runVoidMethod ("Put",(Object)((_nama_type)),(Object)((_id_type)));
 BA.debugLineNum = 213;BA.debugLine="Log(\"ID Map: \"&nama_type&\" \"&id_type)";
Debug.ShouldStop(1048576);
healthedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ID Map: "),_nama_type,RemoteObject.createImmutable(" "),_id_type)));
 }
}Debug.locals.put("j", _j);
;
 break; }
case 3: {
 BA.debugLineNum = 217;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16777216);
healthedit.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 218;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 219;BA.debugLine="Msgbox(\"Data has been updated! :)\",\"Success\")";
Debug.ShouldStop(67108864);
healthedit.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Data has been updated! :)")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Success"))),healthedit.mostCurrent.activityBA);
 BA.debugLineNum = 220;BA.debugLine="Activity.Finish";
Debug.ShouldStop(134217728);
healthedit.mostCurrent._activity.runVoidMethod ("Finish");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e93) {
			BA.rdebugUtils.runVoidMethod("setLastException",healthedit.processBA, e93.toString()); BA.debugLineNum = 222;BA.debugLine="Msgbox(\"Data can not be updated :(\" , \"error\"";
Debug.ShouldStop(536870912);
healthedit.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Data can not be updated :(")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("error"))),healthedit.mostCurrent.activityBA);
 };
 break; }
}
;
 };
 BA.debugLineNum = 226;BA.debugLine="Job.Release";
Debug.ShouldStop(2);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
healthedit._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim lat, lng As String";
healthedit._lat = RemoteObject.createImmutable("");
healthedit._lng = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim nama,kepala,tipe, jenis, tahun,ltanah,lparkir";
healthedit._nama = RemoteObject.createImmutable("");
healthedit._kepala = RemoteObject.createImmutable("");
healthedit._tipe = RemoteObject.createImmutable("");
healthedit._jenis = RemoteObject.createImmutable("");
healthedit._tahun = RemoteObject.createImmutable("");
healthedit._ltanah = RemoteObject.createImmutable("");
healthedit._lparkir = RemoteObject.createImmutable("");
healthedit._lbangunan = RemoteObject.createImmutable("");
healthedit._listrik = RemoteObject.createImmutable("");
healthedit._kons = RemoteObject.createImmutable("");
healthedit._medic = RemoteObject.createImmutable("");
healthedit._nonmedic = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="nama= \"\"";
healthedit._nama = BA.ObjectToString("");
 //BA.debugLineNum = 13;BA.debugLine="tipe = \"\"";
healthedit._tipe = BA.ObjectToString("");
 //BA.debugLineNum = 14;BA.debugLine="jenis= \"\"";
healthedit._jenis = BA.ObjectToString("");
 //BA.debugLineNum = 15;BA.debugLine="Dim tipp,tipname,typehealth,cons,consname,typecon";
healthedit._tipp = RemoteObject.createImmutable("");
healthedit._tipname = RemoteObject.createImmutable("");
healthedit._typehealth = RemoteObject.createImmutable("");
healthedit._cons = RemoteObject.createImmutable("");
healthedit._consname = RemoteObject.createImmutable("");
healthedit._typecons = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Dim tipe_i , jenis_i, lbangunan_i, lparkir_i,ltan";
healthedit._tipe_i = RemoteObject.createImmutable(0);
healthedit._jenis_i = RemoteObject.createImmutable(0);
healthedit._lbangunan_i = RemoteObject.createImmutable(0);
healthedit._lparkir_i = RemoteObject.createImmutable(0);
healthedit._ltanah_i = RemoteObject.createImmutable(0);
healthedit._listrik_i = RemoteObject.createImmutable(0);
healthedit._tahun_i = RemoteObject.createImmutable(0);
healthedit._cons_i = RemoteObject.createImmutable(0);
healthedit._medic_i = RemoteObject.createImmutable(0);
healthedit._nonmedic_i = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setbackgroundtintlist(RemoteObject _view,RemoteObject _active,RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundTintList (healthedit) ","healthedit",38,healthedit.mostCurrent.activityBA,healthedit.mostCurrent,105);
if (RapidSub.canDelegate("setbackgroundtintlist")) return b4a.example.healthedit.remoteMe.runUserSub(false, "healthedit","setbackgroundtintlist", _view, _active, _enabled);
RemoteObject _states = null;
RemoteObject _color = null;
RemoteObject _csl = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("View", _view);
Debug.locals.put("Active", _active);
Debug.locals.put("Enabled", _enabled);
 BA.debugLineNum = 105;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="Dim States(2,1) As Int";
Debug.ShouldStop(512);
_states = RemoteObject.createNewArray ("int", new int[] {2,1}, new Object[]{});Debug.locals.put("States", _states);
 BA.debugLineNum = 107;BA.debugLine="States(0,0) = 16842908     'Active";
Debug.ShouldStop(1024);
_states.setArrayElement (BA.numberCast(int.class, 16842908),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 108;BA.debugLine="States(1,0) = 16842910    'Enabled";
Debug.ShouldStop(2048);
_states.setArrayElement (BA.numberCast(int.class, 16842910),BA.numberCast(int.class, 1),BA.numberCast(int.class, 0));
 BA.debugLineNum = 109;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
Debug.ShouldStop(4096);
_color = RemoteObject.createNewArray("int",new int[] {2},new Object[] {_active,_enabled});Debug.locals.put("Color", _color);Debug.locals.put("Color", _color);
 BA.debugLineNum = 110;BA.debugLine="Dim CSL As JavaObject";
Debug.ShouldStop(8192);
_csl = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("CSL", _csl);
 BA.debugLineNum = 111;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
Debug.ShouldStop(16384);
_csl.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.content.res.ColorStateList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_states),(_color)})));
 BA.debugLineNum = 112;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(32768);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 113;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
Debug.ShouldStop(65536);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.support.v4.view.ViewCompat")));
 BA.debugLineNum = 114;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
Debug.ShouldStop(131072);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBackgroundTintList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_view.getObject()),(_csl.getObject())})));
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
public static RemoteObject  _typeofhealth_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("TypeOfHealth_ItemClick (healthedit) ","healthedit",38,healthedit.mostCurrent.activityBA,healthedit.mostCurrent,239);
if (RapidSub.canDelegate("typeofhealth_itemclick")) return b4a.example.healthedit.remoteMe.runUserSub(false, "healthedit","typeofhealth_itemclick", _position, _value);
RemoteObject _id = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 239;BA.debugLine="Sub TypeOfHealth_ItemClick (Position As Int, Value";
Debug.ShouldStop(16384);
 BA.debugLineNum = 240;BA.debugLine="Dim id As String";
Debug.ShouldStop(32768);
_id = RemoteObject.createImmutable("");Debug.locals.put("id", _id);
 BA.debugLineNum = 241;BA.debugLine="id = HealthMap.Get(Value)";
Debug.ShouldStop(65536);
_id = BA.ObjectToString(healthedit.mostCurrent._healthmap.runMethod(false,"Get",(Object)(_value)));Debug.locals.put("id", _id);
 BA.debugLineNum = 242;BA.debugLine="typehealth = id";
Debug.ShouldStop(131072);
healthedit._typehealth = _id;
 BA.debugLineNum = 243;BA.debugLine="Log(typehealth)";
Debug.ShouldStop(262144);
healthedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(healthedit._typehealth));
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
}