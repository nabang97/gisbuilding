package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class addbuildingfacility_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (addbuildingfacility) ","addbuildingfacility",17,addbuildingfacility.mostCurrent.activityBA,addbuildingfacility.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) return b4a.example.addbuildingfacility.remoteMe.runUserSub(false, "addbuildingfacility","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(1);
addbuildingfacility.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),addbuildingfacility.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="ScrollView1.Panel.LoadLayout(\"AddBuildingFacility";
Debug.ShouldStop(2);
addbuildingfacility.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("AddBuildingFacility")),addbuildingfacility.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="ScrollView1.Height = 100%y";
Debug.ShouldStop(4);
addbuildingfacility.mostCurrent._scrollview1.runMethod(true,"setHeight",addbuildingfacility.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),addbuildingfacility.mostCurrent.activityBA));
 BA.debugLineNum = 36;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
Debug.ShouldStop(8);
addbuildingfacility.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",addbuildingfacility.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 BA.debugLineNum = 37;BA.debugLine="SetBackgroundTintList(editQuantity, Colors.ARGB(2";
Debug.ShouldStop(16);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), addbuildingfacility.mostCurrent._editquantity.getObject()),addbuildingfacility.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),addbuildingfacility.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 39;BA.debugLine="Select Home.HomeBuilding";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(addbuildingfacility.mostCurrent._home._homebuilding,BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Health"),BA.ObjectToString("Msme"),BA.ObjectToString("Educational"))) {
case 0: {
 BA.debugLineNum = 41;BA.debugLine="If WorshipBuilding.nameBuilding.Length > 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",addbuildingfacility.mostCurrent._worshipbuilding._namebuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 42;BA.debugLine="idBuilding= WorshipBuilding.nameBuilding";
Debug.ShouldStop(512);
addbuildingfacility._idbuilding = addbuildingfacility.mostCurrent._worshipbuilding._namebuilding;
 BA.debugLineNum = 43;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(1024);
addbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(addbuildingfacility._idbuilding));
 }else {
 BA.debugLineNum = 45;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(4096);
addbuildingfacility.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),addbuildingfacility.mostCurrent.activityBA);
 BA.debugLineNum = 46;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
addbuildingfacility.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
case 1: {
 BA.debugLineNum = 49;BA.debugLine="If OfficeBuilding.nameBuilding.Length > 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",addbuildingfacility.mostCurrent._officebuilding._namebuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 50;BA.debugLine="idBuilding= OfficeBuilding.nameBuilding";
Debug.ShouldStop(131072);
addbuildingfacility._idbuilding = addbuildingfacility.mostCurrent._officebuilding._namebuilding;
 BA.debugLineNum = 51;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(262144);
addbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(addbuildingfacility._idbuilding));
 }else {
 BA.debugLineNum = 53;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(1048576);
addbuildingfacility.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),addbuildingfacility.mostCurrent.activityBA);
 BA.debugLineNum = 54;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2097152);
addbuildingfacility.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
case 2: {
 BA.debugLineNum = 57;BA.debugLine="If HealthBuilding.nameBuilding.Length > 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",addbuildingfacility.mostCurrent._healthbuilding._namebuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 58;BA.debugLine="idBuilding= HealthBuilding.nameBuilding";
Debug.ShouldStop(33554432);
addbuildingfacility._idbuilding = addbuildingfacility.mostCurrent._healthbuilding._namebuilding;
 BA.debugLineNum = 59;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(67108864);
addbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(addbuildingfacility._idbuilding));
 }else {
 BA.debugLineNum = 61;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(268435456);
addbuildingfacility.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),addbuildingfacility.mostCurrent.activityBA);
 BA.debugLineNum = 62;BA.debugLine="Activity.Finish";
Debug.ShouldStop(536870912);
addbuildingfacility.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
case 3: {
 BA.debugLineNum = 65;BA.debugLine="If MsmeBuilding.nameBuilding.Length > 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",addbuildingfacility.mostCurrent._msmebuilding._namebuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 66;BA.debugLine="idBuilding= MsmeBuilding.nameBuilding";
Debug.ShouldStop(2);
addbuildingfacility._idbuilding = addbuildingfacility.mostCurrent._msmebuilding._namebuilding;
 BA.debugLineNum = 67;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(4);
addbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(addbuildingfacility._idbuilding));
 }else {
 BA.debugLineNum = 69;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(16);
addbuildingfacility.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),addbuildingfacility.mostCurrent.activityBA);
 BA.debugLineNum = 70;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32);
addbuildingfacility.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
case 4: {
 BA.debugLineNum = 73;BA.debugLine="If EducationalBuilding.nameBuilding.Length > 0";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",addbuildingfacility.mostCurrent._educationalbuilding._namebuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 74;BA.debugLine="idBuilding= EducationalBuilding.nameBuilding";
Debug.ShouldStop(512);
addbuildingfacility._idbuilding = addbuildingfacility.mostCurrent._educationalbuilding._namebuilding;
 BA.debugLineNum = 75;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(1024);
addbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(addbuildingfacility._idbuilding));
 }else {
 BA.debugLineNum = 77;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(4096);
addbuildingfacility.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),addbuildingfacility.mostCurrent.activityBA);
 BA.debugLineNum = 78;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
addbuildingfacility.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
default: {
 BA.debugLineNum = 81;BA.debugLine="If SearchBuilding.nameBuilding.Length > 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",addbuildingfacility.mostCurrent._searchbuilding._namebuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 82;BA.debugLine="idBuilding = SearchBuilding.idBuilding";
Debug.ShouldStop(131072);
addbuildingfacility._idbuilding = addbuildingfacility.mostCurrent._searchbuilding._idbuilding;
 BA.debugLineNum = 83;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(262144);
addbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(addbuildingfacility._idbuilding));
 }else {
 BA.debugLineNum = 85;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(1048576);
addbuildingfacility.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),addbuildingfacility.mostCurrent.activityBA);
 BA.debugLineNum = 86;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2097152);
addbuildingfacility.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
}
;
 BA.debugLineNum = 90;BA.debugLine="Log(\"IDnyaa LOOOO: \"&idBuilding)";
Debug.ShouldStop(33554432);
addbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("IDnyaa LOOOO: "),addbuildingfacility._idbuilding)));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (addbuildingfacility) ","addbuildingfacility",17,addbuildingfacility.mostCurrent.activityBA,addbuildingfacility.mostCurrent,125);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.addbuildingfacility.remoteMe.runUserSub(false, "addbuildingfacility","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 125;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(268435456);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (addbuildingfacility) ","addbuildingfacility",17,addbuildingfacility.mostCurrent.activityBA,addbuildingfacility.mostCurrent,94);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.addbuildingfacility.remoteMe.runUserSub(false, "addbuildingfacility","activity_resume");
 BA.debugLineNum = 94;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(1073741824);
addbuildingfacility.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",addbuildingfacility.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Loading..."))));
 BA.debugLineNum = 97;BA.debugLine="SpinFac.Initialize";
Debug.ShouldStop(1);
addbuildingfacility.mostCurrent._spinfac.runVoidMethod ("Initialize");
 BA.debugLineNum = 98;BA.debugLine="Select Home.HomeBuilding";
Debug.ShouldStop(2);
switch (BA.switchObjectToInt(addbuildingfacility.mostCurrent._home._homebuilding,BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Msme"),BA.ObjectToString("Educational"),BA.ObjectToString("Health"))) {
case 0: {
 BA.debugLineNum = 100;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
Debug.ShouldStop(8);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT facility_id , name_of_facility from worship_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id = '"),addbuildingfacility._idbuilding,RemoteObject.createImmutable("') ORDER BY name_of_facility ASC")),RemoteObject.createImmutable("AllFacilities"));
 break; }
case 1: {
 BA.debugLineNum = 102;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
Debug.ShouldStop(32);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT facility_id , name_of_facility from office_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"),addbuildingfacility._idbuilding,RemoteObject.createImmutable("') ORDER BY name_of_facility ASC")),RemoteObject.createImmutable("AllFacilities"));
 break; }
case 2: {
 BA.debugLineNum = 104;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
Debug.ShouldStop(128);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT facility_id , name_of_facility from msme_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"),addbuildingfacility._idbuilding,RemoteObject.createImmutable("') ORDER BY name_of_facility ASC")),RemoteObject.createImmutable("AllFacilities"));
 break; }
case 3: {
 BA.debugLineNum = 106;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
Debug.ShouldStop(512);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT facility_id , name_of_facility from educational_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"),addbuildingfacility._idbuilding,RemoteObject.createImmutable("') ORDER BY name_of_facility ASC")),RemoteObject.createImmutable("AllFacilities"));
 break; }
case 4: {
 BA.debugLineNum = 108;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
Debug.ShouldStop(2048);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT facility_id , name_of_facility from health_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"),addbuildingfacility._idbuilding,RemoteObject.createImmutable("') ORDER BY name_of_facility ASC")),RemoteObject.createImmutable("AllFacilities"));
 break; }
default: {
 BA.debugLineNum = 110;BA.debugLine="Select SearchBuilding.idspin";
Debug.ShouldStop(8192);
switch (BA.switchObjectToInt(addbuildingfacility.mostCurrent._searchbuilding._idspin,BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Msme"),BA.ObjectToString("Educational"),BA.ObjectToString("Health"))) {
case 0: {
 BA.debugLineNum = 112;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
Debug.ShouldStop(32768);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT facility_id , name_of_facility from worship_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id = '"),addbuildingfacility._idbuilding,RemoteObject.createImmutable("') ORDER BY name_of_facility ASC")),RemoteObject.createImmutable("AllFacilities"));
 break; }
case 1: {
 BA.debugLineNum = 114;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
Debug.ShouldStop(131072);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT facility_id , name_of_facility from office_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"),addbuildingfacility._idbuilding,RemoteObject.createImmutable("') ORDER BY name_of_facility ASC")),RemoteObject.createImmutable("AllFacilities"));
 break; }
case 2: {
 BA.debugLineNum = 116;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
Debug.ShouldStop(524288);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT facility_id , name_of_facility from msme_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"),addbuildingfacility._idbuilding,RemoteObject.createImmutable("') ORDER BY name_of_facility ASC")),RemoteObject.createImmutable("AllFacilities"));
 break; }
case 3: {
 BA.debugLineNum = 118;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
Debug.ShouldStop(2097152);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT facility_id , name_of_facility from educational_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"),addbuildingfacility._idbuilding,RemoteObject.createImmutable("') ORDER BY name_of_facility ASC")),RemoteObject.createImmutable("AllFacilities"));
 break; }
case 4: {
 BA.debugLineNum = 120;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
Debug.ShouldStop(8388608);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT facility_id , name_of_facility from health_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"),addbuildingfacility._idbuilding,RemoteObject.createImmutable("') ORDER BY name_of_facility ASC")),RemoteObject.createImmutable("AllFacilities"));
 break; }
}
;
 break; }
}
;
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnaddfacility_click() throws Exception{
try {
		Debug.PushSubsStack("btnAddFacility_Click (addbuildingfacility) ","addbuildingfacility",17,addbuildingfacility.mostCurrent.activityBA,addbuildingfacility.mostCurrent,195);
if (RapidSub.canDelegate("btnaddfacility_click")) return b4a.example.addbuildingfacility.remoteMe.runUserSub(false, "addbuildingfacility","btnaddfacility_click");
 BA.debugLineNum = 195;BA.debugLine="Sub btnAddFacility_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 196;BA.debugLine="Select Home.HomeBuilding";
Debug.ShouldStop(8);
switch (BA.switchObjectToInt(addbuildingfacility.mostCurrent._home._homebuilding,BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Msme"),BA.ObjectToString("Educational"),BA.ObjectToString("Health"))) {
case 0: {
 BA.debugLineNum = 198;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_worship_";
Debug.ShouldStop(32);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO detail_worship_building_facilities (worship_building_id, facility_id, quantity_of_facilities) VALUES ('"),addbuildingfacility._idbuilding,RemoteObject.createImmutable("',"),addbuildingfacility.mostCurrent._idspin,RemoteObject.createImmutable(","),addbuildingfacility.mostCurrent._editquantity.runMethod(true,"getText"),RemoteObject.createImmutable(")")),RemoteObject.createImmutable("AddFacility"));
 break; }
case 1: {
 BA.debugLineNum = 200;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_office_b";
Debug.ShouldStop(128);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO detail_office_building_facilities (office_building_id, facility_id, quantity_of_facilities) VALUES ('"),addbuildingfacility._idbuilding,RemoteObject.createImmutable("', "),addbuildingfacility.mostCurrent._idspin,RemoteObject.createImmutable(", "),addbuildingfacility.mostCurrent._editquantity.runMethod(true,"getText"),RemoteObject.createImmutable(")")),RemoteObject.createImmutable("AddFacility"));
 break; }
case 2: {
 BA.debugLineNum = 202;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_msme_bui";
Debug.ShouldStop(512);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO detail_msme_building_facilities (msme_building_id, facility_id, quantity_of_facilities) VALUES ('"),addbuildingfacility._idbuilding,RemoteObject.createImmutable("', "),addbuildingfacility.mostCurrent._idspin,RemoteObject.createImmutable(", "),addbuildingfacility.mostCurrent._editquantity.runMethod(true,"getText"),RemoteObject.createImmutable(")")),RemoteObject.createImmutable("AddFacility"));
 break; }
case 3: {
 BA.debugLineNum = 204;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_educatio";
Debug.ShouldStop(2048);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO detail_educational_building_facilities (educational_building_id, facility_id, quantity_of_facilities) VALUES ('"),addbuildingfacility._idbuilding,RemoteObject.createImmutable("', "),addbuildingfacility.mostCurrent._idspin,RemoteObject.createImmutable(", "),addbuildingfacility.mostCurrent._editquantity.runMethod(true,"getText"),RemoteObject.createImmutable(")")),RemoteObject.createImmutable("AddFacility"));
 break; }
case 4: {
 BA.debugLineNum = 206;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_health_b";
Debug.ShouldStop(8192);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO detail_health_building_facilities (health_building_id, facility_id, quantity_of_facilities) VALUES ('"),addbuildingfacility._idbuilding,RemoteObject.createImmutable("', "),addbuildingfacility.mostCurrent._idspin,RemoteObject.createImmutable(", "),addbuildingfacility.mostCurrent._editquantity.runMethod(true,"getText"),RemoteObject.createImmutable(")")),RemoteObject.createImmutable("AddFacility"));
 break; }
default: {
 BA.debugLineNum = 208;BA.debugLine="Select SearchBuilding.idspin";
Debug.ShouldStop(32768);
switch (BA.switchObjectToInt(addbuildingfacility.mostCurrent._searchbuilding._idspin,BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Msme"),BA.ObjectToString("Educational"),BA.ObjectToString("Health"))) {
case 0: {
 BA.debugLineNum = 210;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_worshi";
Debug.ShouldStop(131072);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO detail_worship_building_facilities (worship_building_id, facility_id, quantity_of_facilities) VALUES ('"),addbuildingfacility._idbuilding,RemoteObject.createImmutable("',"),addbuildingfacility.mostCurrent._idspin,RemoteObject.createImmutable(","),addbuildingfacility.mostCurrent._editquantity.runMethod(true,"getText"),RemoteObject.createImmutable(")")),RemoteObject.createImmutable("AddFacility"));
 break; }
case 1: {
 BA.debugLineNum = 212;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_office";
Debug.ShouldStop(524288);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO detail_office_building_facilities (office_building_id, facility_id, quantity_of_facilities) VALUES ('"),addbuildingfacility._idbuilding,RemoteObject.createImmutable("', "),addbuildingfacility.mostCurrent._idspin,RemoteObject.createImmutable(", "),addbuildingfacility.mostCurrent._editquantity.runMethod(true,"getText"),RemoteObject.createImmutable(")")),RemoteObject.createImmutable("AddFacility"));
 break; }
case 2: {
 BA.debugLineNum = 214;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_msme_b";
Debug.ShouldStop(2097152);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO detail_msme_building_facilities (msme_building_id, facility_id, quantity_of_facilities) VALUES ('"),addbuildingfacility._idbuilding,RemoteObject.createImmutable("', "),addbuildingfacility.mostCurrent._idspin,RemoteObject.createImmutable(", "),addbuildingfacility.mostCurrent._editquantity.runMethod(true,"getText"),RemoteObject.createImmutable(")")),RemoteObject.createImmutable("AddFacility"));
 break; }
case 3: {
 BA.debugLineNum = 216;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_educat";
Debug.ShouldStop(8388608);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO detail_educational_building_facilities (educational_building_id, facility_id, quantity_of_facilities) VALUES ('"),addbuildingfacility._idbuilding,RemoteObject.createImmutable("', "),addbuildingfacility.mostCurrent._idspin,RemoteObject.createImmutable(", "),addbuildingfacility.mostCurrent._editquantity.runMethod(true,"getText"),RemoteObject.createImmutable(")")),RemoteObject.createImmutable("AddFacility"));
 break; }
case 4: {
 BA.debugLineNum = 218;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_health";
Debug.ShouldStop(33554432);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO detail_health_building_facilities (health_building_id, facility_id, quantity_of_facilities) VALUES ('"),addbuildingfacility._idbuilding,RemoteObject.createImmutable("', "),addbuildingfacility.mostCurrent._idspin,RemoteObject.createImmutable(", "),addbuildingfacility.mostCurrent._editquantity.runMethod(true,"getText"),RemoteObject.createImmutable(")")),RemoteObject.createImmutable("AddFacility"));
 break; }
}
;
 break; }
}
;
 BA.debugLineNum = 222;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ExecuteRemoteQuery (addbuildingfacility) ","addbuildingfacility",17,addbuildingfacility.mostCurrent.activityBA,addbuildingfacility.mostCurrent,140);
if (RapidSub.canDelegate("executeremotequery")) return b4a.example.addbuildingfacility.remoteMe.runUserSub(false, "addbuildingfacility","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 140;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(2048);
 BA.debugLineNum = 141;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(4096);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 142;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(8192);
_job.runVoidMethod ("_initialize",addbuildingfacility.processBA,(Object)(_jobname),(Object)(addbuildingfacility.getObject()));
 BA.debugLineNum = 143;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
Debug.ShouldStop(16384);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),addbuildingfacility.mostCurrent._main._server,RemoteObject.createImmutable("mobile/json.php"))),(Object)(_query));
 BA.debugLineNum = 144;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 16;BA.debugLine="Private ScrollView1 As ScrollView";
addbuildingfacility.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private PanelBuildingList As Panel";
addbuildingfacility.mostCurrent._panelbuildinglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private PanelEditFacility As Panel";
addbuildingfacility.mostCurrent._paneleditfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private editQuantity As EditText";
addbuildingfacility.mostCurrent._editquantity = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private PanelEditQuanity As Panel";
addbuildingfacility.mostCurrent._paneleditquanity = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private LblQuantity As Label";
addbuildingfacility.mostCurrent._lblquantity = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private PanelSpinnerFacility As Panel";
addbuildingfacility.mostCurrent._panelspinnerfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private SpinNameFacility As Spinner";
addbuildingfacility.mostCurrent._spinnamefacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private SpinFac As Map";
addbuildingfacility.mostCurrent._spinfac = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 25;BA.debugLine="Private lblNameFacility As Label";
addbuildingfacility.mostCurrent._lblnamefacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private btnAddFacility As Button";
addbuildingfacility.mostCurrent._btnaddfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim idspin As String";
addbuildingfacility.mostCurrent._idspin = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (addbuildingfacility) ","addbuildingfacility",17,addbuildingfacility.mostCurrent.activityBA,addbuildingfacility.mostCurrent,146);
if (RapidSub.canDelegate("jobdone")) return b4a.example.addbuildingfacility.remoteMe.runUserSub(false, "addbuildingfacility","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parserf = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _parserfa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _fasi_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _c = RemoteObject.createImmutable(0);
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 146;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(262144);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 148;BA.debugLine="Dim res As String";
Debug.ShouldStop(524288);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 149;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk s";
Debug.ShouldStop(1048576);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 150;BA.debugLine="Log(\"Response from server :\"& res)";
Debug.ShouldStop(2097152);
addbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 151;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(4194304);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("AllFacilities"),BA.ObjectToString("AddFacility"))) {
case 0: {
 BA.debugLineNum = 153;BA.debugLine="Dim parserf As JSONParser 'mengambil data dala";
Debug.ShouldStop(16777216);
_parserf = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parserf", _parserf);
 BA.debugLineNum = 154;BA.debugLine="Dim parserfa As JSONParser";
Debug.ShouldStop(33554432);
_parserfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parserfa", _parserfa);
 BA.debugLineNum = 155;BA.debugLine="parserf.Initialize(res)";
Debug.ShouldStop(67108864);
_parserf.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 156;BA.debugLine="Dim fasi_array As List = parserf.NextArray";
Debug.ShouldStop(134217728);
_fasi_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_fasi_array = _parserf.runMethod(false,"NextArray");Debug.locals.put("fasi_array", _fasi_array);Debug.locals.put("fasi_array", _fasi_array);
 BA.debugLineNum = 157;BA.debugLine="parserfa.Initialize(res)";
Debug.ShouldStop(268435456);
_parserfa.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 158;BA.debugLine="Dim c As Int";
Debug.ShouldStop(536870912);
_c = RemoteObject.createImmutable(0);Debug.locals.put("c", _c);
 BA.debugLineNum = 159;BA.debugLine="If fasi_array.Size > 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_fasi_array.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 160;BA.debugLine="For c=0 To fasi_array.Size - 1";
Debug.ShouldStop(-2147483648);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_fasi_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_c = BA.numberCast(int.class, 0) ;
for (;(step14 > 0 && _c.<Integer>get().intValue() <= limit14) || (step14 < 0 && _c.<Integer>get().intValue() >= limit14) ;_c = RemoteObject.createImmutable((int)(0 + _c.<Integer>get().intValue() + step14))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 161;BA.debugLine="Dim a As Map";
Debug.ShouldStop(1);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 162;BA.debugLine="a = fasi_array.Get(c)";
Debug.ShouldStop(2);
_a.setObject(_fasi_array.runMethod(false,"Get",(Object)(_c)));
 BA.debugLineNum = 164;BA.debugLine="Dim id, name As String";
Debug.ShouldStop(8);
_id = RemoteObject.createImmutable("");Debug.locals.put("id", _id);
_name = RemoteObject.createImmutable("");Debug.locals.put("name", _name);
 BA.debugLineNum = 165;BA.debugLine="id=a.Get(\"facility_id\")";
Debug.ShouldStop(16);
_id = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("facility_id")))));Debug.locals.put("id", _id);
 BA.debugLineNum = 166;BA.debugLine="name=a.Get(\"name_of_facility\")";
Debug.ShouldStop(32);
_name = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_facility")))));Debug.locals.put("name", _name);
 BA.debugLineNum = 167;BA.debugLine="SpinNameFacility.Add(name)";
Debug.ShouldStop(64);
addbuildingfacility.mostCurrent._spinnamefacility.runVoidMethod ("Add",(Object)(_name));
 BA.debugLineNum = 168;BA.debugLine="SpinFac.Put(name,id)";
Debug.ShouldStop(128);
addbuildingfacility.mostCurrent._spinfac.runVoidMethod ("Put",(Object)((_name)),(Object)((_id)));
 BA.debugLineNum = 169;BA.debugLine="Log(\"id: \"&id&\" | name: \"&name)";
Debug.ShouldStop(256);
addbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("id: "),_id,RemoteObject.createImmutable(" | name: "),_name)));
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 171;BA.debugLine="idspin = SpinFac.GetValueAt(0)";
Debug.ShouldStop(1024);
addbuildingfacility.mostCurrent._idspin = BA.ObjectToString(addbuildingfacility.mostCurrent._spinfac.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 172;BA.debugLine="Log(idspin)";
Debug.ShouldStop(2048);
addbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(addbuildingfacility.mostCurrent._idspin));
 }else {
 };
 BA.debugLineNum = 176;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32768);
addbuildingfacility.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 1: {
 BA.debugLineNum = 178;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 179;BA.debugLine="Msgbox(\"Data has been updated! :)\",\"Success\"";
Debug.ShouldStop(262144);
addbuildingfacility.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Data has been updated! :)")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Success"))),addbuildingfacility.mostCurrent.activityBA);
 BA.debugLineNum = 180;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
addbuildingfacility.mostCurrent._activity.runVoidMethod ("Finish");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e34) {
			BA.rdebugUtils.runVoidMethod("setLastException",addbuildingfacility.processBA, e34.toString()); BA.debugLineNum = 182;BA.debugLine="Msgbox(\"Data can not be updated :(\" , \"error";
Debug.ShouldStop(2097152);
addbuildingfacility.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Data can not be updated :(")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("error"))),addbuildingfacility.mostCurrent.activityBA);
 };
 break; }
}
;
 };
 BA.debugLineNum = 186;BA.debugLine="Job.Release";
Debug.ShouldStop(33554432);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 187;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 10;BA.debugLine="Dim idBuilding As String";
addbuildingfacility._idbuilding = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setbackgroundtintlist(RemoteObject _view,RemoteObject _active,RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundTintList (addbuildingfacility) ","addbuildingfacility",17,addbuildingfacility.mostCurrent.activityBA,addbuildingfacility.mostCurrent,128);
if (RapidSub.canDelegate("setbackgroundtintlist")) return b4a.example.addbuildingfacility.remoteMe.runUserSub(false, "addbuildingfacility","setbackgroundtintlist", _view, _active, _enabled);
RemoteObject _states = null;
RemoteObject _color = null;
RemoteObject _csl = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("View", _view);
Debug.locals.put("Active", _active);
Debug.locals.put("Enabled", _enabled);
 BA.debugLineNum = 128;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="Dim States(2,1) As Int";
Debug.ShouldStop(1);
_states = RemoteObject.createNewArray ("int", new int[] {2,1}, new Object[]{});Debug.locals.put("States", _states);
 BA.debugLineNum = 130;BA.debugLine="States(0,0) = 16842908     'Active";
Debug.ShouldStop(2);
_states.setArrayElement (BA.numberCast(int.class, 16842908),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 131;BA.debugLine="States(1,0) = 16842910    'Enabled";
Debug.ShouldStop(4);
_states.setArrayElement (BA.numberCast(int.class, 16842910),BA.numberCast(int.class, 1),BA.numberCast(int.class, 0));
 BA.debugLineNum = 132;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
Debug.ShouldStop(8);
_color = RemoteObject.createNewArray("int",new int[] {2},new Object[] {_active,_enabled});Debug.locals.put("Color", _color);Debug.locals.put("Color", _color);
 BA.debugLineNum = 133;BA.debugLine="Dim CSL As JavaObject";
Debug.ShouldStop(16);
_csl = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("CSL", _csl);
 BA.debugLineNum = 134;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
Debug.ShouldStop(32);
_csl.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.content.res.ColorStateList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_states),(_color)})));
 BA.debugLineNum = 135;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(64);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 136;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
Debug.ShouldStop(128);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.support.v4.view.ViewCompat")));
 BA.debugLineNum = 137;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
Debug.ShouldStop(256);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBackgroundTintList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_view.getObject()),(_csl.getObject())})));
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinnamefacility_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinNameFacility_ItemClick (addbuildingfacility) ","addbuildingfacility",17,addbuildingfacility.mostCurrent.activityBA,addbuildingfacility.mostCurrent,189);
if (RapidSub.canDelegate("spinnamefacility_itemclick")) return b4a.example.addbuildingfacility.remoteMe.runUserSub(false, "addbuildingfacility","spinnamefacility_itemclick", _position, _value);
RemoteObject _idc = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 189;BA.debugLine="Sub SpinNameFacility_ItemClick (Position As Int, V";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 190;BA.debugLine="Dim idc As String";
Debug.ShouldStop(536870912);
_idc = RemoteObject.createImmutable("");Debug.locals.put("idc", _idc);
 BA.debugLineNum = 191;BA.debugLine="idc = SpinFac.Get(Value)";
Debug.ShouldStop(1073741824);
_idc = BA.ObjectToString(addbuildingfacility.mostCurrent._spinfac.runMethod(false,"Get",(Object)(_value)));Debug.locals.put("idc", _idc);
 BA.debugLineNum = 192;BA.debugLine="idspin = idc";
Debug.ShouldStop(-2147483648);
addbuildingfacility.mostCurrent._idspin = _idc;
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
}