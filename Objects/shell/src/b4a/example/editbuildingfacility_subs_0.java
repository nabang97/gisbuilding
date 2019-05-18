package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class editbuildingfacility_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (editbuildingfacility) ","editbuildingfacility",15,editbuildingfacility.mostCurrent.activityBA,editbuildingfacility.mostCurrent,40);
if (RapidSub.canDelegate("activity_create")) return b4a.example.editbuildingfacility.remoteMe.runUserSub(false, "editbuildingfacility","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 43;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(1024);
editbuildingfacility.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),editbuildingfacility.mostCurrent.activityBA);
 BA.debugLineNum = 44;BA.debugLine="ScrollView1.Panel.LoadLayout(\"EditBuildingFacilit";
Debug.ShouldStop(2048);
editbuildingfacility.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("EditBuildingFacility")),editbuildingfacility.mostCurrent.activityBA);
 BA.debugLineNum = 45;BA.debugLine="ScrollView1.Height = 100%y";
Debug.ShouldStop(4096);
editbuildingfacility.mostCurrent._scrollview1.runMethod(true,"setHeight",editbuildingfacility.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),editbuildingfacility.mostCurrent.activityBA));
 BA.debugLineNum = 46;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
Debug.ShouldStop(8192);
editbuildingfacility.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",editbuildingfacility.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 BA.debugLineNum = 48;BA.debugLine="Select Home.HomeBuilding";
Debug.ShouldStop(32768);
switch (BA.switchObjectToInt(editbuildingfacility.mostCurrent._home._homebuilding,BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Health"),BA.ObjectToString("Msme"),BA.ObjectToString("Educational"))) {
case 0: {
 BA.debugLineNum = 50;BA.debugLine="If WorshipBuilding.idBuilding.Length > 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",editbuildingfacility.mostCurrent._worshipbuilding._idbuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 51;BA.debugLine="idBuilding= WorshipBuilding.idBuilding";
Debug.ShouldStop(262144);
editbuildingfacility._idbuilding = editbuildingfacility.mostCurrent._worshipbuilding._idbuilding;
 BA.debugLineNum = 52;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(524288);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(editbuildingfacility._idbuilding));
 }else {
 BA.debugLineNum = 54;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(2097152);
editbuildingfacility.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),editbuildingfacility.mostCurrent.activityBA);
 BA.debugLineNum = 55;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4194304);
editbuildingfacility.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
case 1: {
 BA.debugLineNum = 58;BA.debugLine="If OfficeBuilding.idBuilding.Length > 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",editbuildingfacility.mostCurrent._officebuilding._idbuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 59;BA.debugLine="idBuilding= OfficeBuilding.idBuilding";
Debug.ShouldStop(67108864);
editbuildingfacility._idbuilding = editbuildingfacility.mostCurrent._officebuilding._idbuilding;
 BA.debugLineNum = 60;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(134217728);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(editbuildingfacility._idbuilding));
 }else {
 BA.debugLineNum = 62;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(536870912);
editbuildingfacility.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),editbuildingfacility.mostCurrent.activityBA);
 BA.debugLineNum = 63;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1073741824);
editbuildingfacility.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
case 2: {
 BA.debugLineNum = 66;BA.debugLine="If HealthBuilding.idBuilding.Length > 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",editbuildingfacility.mostCurrent._healthbuilding._idbuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 67;BA.debugLine="idBuilding= HealthBuilding.idBuilding";
Debug.ShouldStop(4);
editbuildingfacility._idbuilding = editbuildingfacility.mostCurrent._healthbuilding._idbuilding;
 BA.debugLineNum = 68;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(8);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(editbuildingfacility._idbuilding));
 }else {
 BA.debugLineNum = 70;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(32);
editbuildingfacility.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),editbuildingfacility.mostCurrent.activityBA);
 BA.debugLineNum = 71;BA.debugLine="Activity.Finish";
Debug.ShouldStop(64);
editbuildingfacility.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
case 3: {
 BA.debugLineNum = 74;BA.debugLine="If MsmeBuilding.idBuilding.Length > 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",editbuildingfacility.mostCurrent._msmebuilding._idbuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 75;BA.debugLine="idBuilding= MsmeBuilding.idBuilding";
Debug.ShouldStop(1024);
editbuildingfacility._idbuilding = editbuildingfacility.mostCurrent._msmebuilding._idbuilding;
 BA.debugLineNum = 76;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(2048);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(editbuildingfacility._idbuilding));
 }else {
 BA.debugLineNum = 78;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(8192);
editbuildingfacility.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),editbuildingfacility.mostCurrent.activityBA);
 BA.debugLineNum = 79;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16384);
editbuildingfacility.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
case 4: {
 BA.debugLineNum = 82;BA.debugLine="If EducationalBuilding.idBuilding.Length > 0 Th";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",editbuildingfacility.mostCurrent._educationalbuilding._idbuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 83;BA.debugLine="idBuilding= EducationalBuilding.idBuilding";
Debug.ShouldStop(262144);
editbuildingfacility._idbuilding = editbuildingfacility.mostCurrent._educationalbuilding._idbuilding;
 BA.debugLineNum = 84;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(524288);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(editbuildingfacility._idbuilding));
 }else {
 BA.debugLineNum = 86;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(2097152);
editbuildingfacility.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),editbuildingfacility.mostCurrent.activityBA);
 BA.debugLineNum = 87;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4194304);
editbuildingfacility.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
default: {
 BA.debugLineNum = 90;BA.debugLine="If SearchBuilding.idBuilding.Length > 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",editbuildingfacility.mostCurrent._searchbuilding._idbuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 91;BA.debugLine="idBuilding = SearchBuilding.idBuilding";
Debug.ShouldStop(67108864);
editbuildingfacility._idbuilding = editbuildingfacility.mostCurrent._searchbuilding._idbuilding;
 BA.debugLineNum = 92;BA.debugLine="Log(idBuilding)";
Debug.ShouldStop(134217728);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(editbuildingfacility._idbuilding));
 }else {
 BA.debugLineNum = 94;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
Debug.ShouldStop(536870912);
editbuildingfacility.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Can't get the ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error Message"))),editbuildingfacility.mostCurrent.activityBA);
 BA.debugLineNum = 95;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1073741824);
editbuildingfacility.mostCurrent._activity.runVoidMethod ("Finish");
 };
 break; }
}
;
 BA.debugLineNum = 100;BA.debugLine="Log(\"IDnyaa LOOOO: \"&idBuilding)";
Debug.ShouldStop(8);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("IDnyaa LOOOO: "),editbuildingfacility._idbuilding)));
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
		Debug.PushSubsStack("Activity_Pause (editbuildingfacility) ","editbuildingfacility",15,editbuildingfacility.mostCurrent.activityBA,editbuildingfacility.mostCurrent,108);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.editbuildingfacility.remoteMe.runUserSub(false, "editbuildingfacility","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 108;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Activity_Resume (editbuildingfacility) ","editbuildingfacility",15,editbuildingfacility.mostCurrent.activityBA,editbuildingfacility.mostCurrent,103);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.editbuildingfacility.remoteMe.runUserSub(false, "editbuildingfacility","activity_resume");
 BA.debugLineNum = 103;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="FacMap.Initialize";
Debug.ShouldStop(128);
editbuildingfacility.mostCurrent._facmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 105;BA.debugLine="RefreshData";
Debug.ShouldStop(256);
_refreshdata();
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndelete_click() throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (editbuildingfacility) ","editbuildingfacility",15,editbuildingfacility.mostCurrent.activityBA,editbuildingfacility.mostCurrent,309);
if (RapidSub.canDelegate("btndelete_click")) return b4a.example.editbuildingfacility.remoteMe.runUserSub(false, "editbuildingfacility","btndelete_click");
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 309;BA.debugLine="Sub btnDelete_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 310;BA.debugLine="Dim item As Int = CLV1.GetItemFromView(Sender)";
Debug.ShouldStop(2097152);
_item = editbuildingfacility.mostCurrent._clv1.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), editbuildingfacility.mostCurrent.__c.runMethod(false,"Sender",editbuildingfacility.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 311;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(4194304);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 312;BA.debugLine="p = CLV1.GetPanel(item)";
Debug.ShouldStop(8388608);
_p = editbuildingfacility.mostCurrent._clv1.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 313;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(16777216);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 314;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(33554432);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 315;BA.debugLine="Log(\"NAMA BUILDING: \"&a.GetView(3).Text)";
Debug.ShouldStop(67108864);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("NAMA BUILDING: "),_a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"getText"))));
 BA.debugLineNum = 316;BA.debugLine="Select Home.HomeBuilding";
Debug.ShouldStop(134217728);
switch (BA.switchObjectToInt(editbuildingfacility.mostCurrent._home._homebuilding,BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Msme"),BA.ObjectToString("Educational"),BA.ObjectToString("Health"))) {
case 0: {
 BA.debugLineNum = 318;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_worship_";
Debug.ShouldStop(536870912);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM detail_worship_building_facilities WHERE worship_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' AND facility_id = "),_a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"getText"),RemoteObject.createImmutable(" ")),RemoteObject.createImmutable("DeleteFacility"));
 break; }
case 1: {
 BA.debugLineNum = 320;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_office_b";
Debug.ShouldStop(-2147483648);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM detail_office_building_facilities WHERE office_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' and facility_id = "),_a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"getText"),RemoteObject.createImmutable("")),RemoteObject.createImmutable("DeleteFacility"));
 break; }
case 2: {
 BA.debugLineNum = 322;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_msme_bui";
Debug.ShouldStop(2);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM detail_msme_building_facilities WHERE msme_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' and facility_id = "),_a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"getText"),RemoteObject.createImmutable("")),RemoteObject.createImmutable("DeleteFacility"));
 break; }
case 3: {
 BA.debugLineNum = 324;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_educatio";
Debug.ShouldStop(8);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM detail_educational_building_facilities WHERE educational_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' and facility_id = "),_a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"getText"),RemoteObject.createImmutable("")),RemoteObject.createImmutable("DeleteFacility"));
 break; }
case 4: {
 BA.debugLineNum = 326;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_health_b";
Debug.ShouldStop(32);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM detail_health_building_facilities WHERE health_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' and facility_id = "),_a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"getText"),RemoteObject.createImmutable("")),RemoteObject.createImmutable("DeleteFacility"));
 break; }
default: {
 BA.debugLineNum = 328;BA.debugLine="Select SearchBuilding.idspin";
Debug.ShouldStop(128);
switch (BA.switchObjectToInt(editbuildingfacility.mostCurrent._searchbuilding._idspin,BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Msme"),BA.ObjectToString("Educational"),BA.ObjectToString("Health"))) {
case 0: {
 BA.debugLineNum = 330;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_worshi";
Debug.ShouldStop(512);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM detail_worship_building_facilities WHERE worship_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' AND facility_id = "),_a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"getText"),RemoteObject.createImmutable(" ")),RemoteObject.createImmutable("DeleteFacility"));
 break; }
case 1: {
 BA.debugLineNum = 332;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_office";
Debug.ShouldStop(2048);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM detail_office_building_facilities WHERE office_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' and facility_id = "),_a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"getText"),RemoteObject.createImmutable("")),RemoteObject.createImmutable("DeleteFacility"));
 break; }
case 2: {
 BA.debugLineNum = 334;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_msme_b";
Debug.ShouldStop(8192);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM detail_msme_building_facilities WHERE msme_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' and facility_id = "),_a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"getText"),RemoteObject.createImmutable("")),RemoteObject.createImmutable("DeleteFacility"));
 break; }
case 3: {
 BA.debugLineNum = 336;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_educat";
Debug.ShouldStop(32768);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM detail_educational_building_facilities WHERE educational_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' and facility_id = "),_a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"getText"),RemoteObject.createImmutable("")),RemoteObject.createImmutable("DeleteFacility"));
 break; }
case 4: {
 BA.debugLineNum = 338;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_health";
Debug.ShouldStop(131072);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM detail_health_building_facilities WHERE health_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' and facility_id = "),_a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"getText"),RemoteObject.createImmutable("")),RemoteObject.createImmutable("DeleteFacility"));
 break; }
}
;
 break; }
}
;
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("BtnSaveChanges_Click (editbuildingfacility) ","editbuildingfacility",15,editbuildingfacility.mostCurrent.activityBA,editbuildingfacility.mostCurrent,271);
if (RapidSub.canDelegate("btnsavechanges_click")) return b4a.example.editbuildingfacility.remoteMe.runUserSub(false, "editbuildingfacility","btnsavechanges_click");
RemoteObject _j = RemoteObject.createImmutable(0);
 BA.debugLineNum = 271;BA.debugLine="Sub BtnSaveChanges_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 272;BA.debugLine="ProgressDialogShow(\"updating..\")";
Debug.ShouldStop(32768);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",editbuildingfacility.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("updating.."))));
 BA.debugLineNum = 273;BA.debugLine="Log(\"beluum :\"&arraysize)";
Debug.ShouldStop(65536);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("beluum :"),editbuildingfacility._arraysize)));
 BA.debugLineNum = 274;BA.debugLine="Log(\"ini apa: \")";
Debug.ShouldStop(131072);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("ini apa: ")));
 BA.debugLineNum = 275;BA.debugLine="Dim j As Int";
Debug.ShouldStop(262144);
_j = RemoteObject.createImmutable(0);Debug.locals.put("j", _j);
 BA.debugLineNum = 276;BA.debugLine="Select Home.HomeBuilding";
Debug.ShouldStop(524288);
switch (BA.switchObjectToInt(editbuildingfacility.mostCurrent._home._homebuilding,BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Msme"),BA.ObjectToString("Educational"),BA.ObjectToString("Health"))) {
case 0: {
 break; }
case 1: {
 BA.debugLineNum = 279;BA.debugLine="For j=0 To arraysize-1";
Debug.ShouldStop(4194304);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {editbuildingfacility._arraysize,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = BA.numberCast(int.class, 0) ;
for (;(step8 > 0 && _j.<Integer>get().intValue() <= limit8) || (step8 < 0 && _j.<Integer>get().intValue() >= limit8) ;_j = RemoteObject.createImmutable((int)(0 + _j.<Integer>get().intValue() + step8))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 280;BA.debugLine="ProgressDialogShow(\"updating..\")";
Debug.ShouldStop(8388608);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",editbuildingfacility.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("updating.."))));
 BA.debugLineNum = 281;BA.debugLine="Log(\"INI DIAA : \"&CLV1.GetPanel(j).GetView(0).";
Debug.ShouldStop(16777216);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INI DIAA : "),editbuildingfacility.mostCurrent._clv1.runMethod(false,"_getpanel",(Object)(_j)).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"getText"))));
 BA.debugLineNum = 282;BA.debugLine="ExecuteRemoteQuery(\"UPDATE detail_office_build";
Debug.ShouldStop(33554432);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("UPDATE detail_office_building_facilities SET quantity_of_facilities ="),editbuildingfacility.mostCurrent._clv1.runMethod(false,"_getpanel",(Object)(_j)).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"getText"),RemoteObject.createImmutable(" WHERE office_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("Update"));
 }
}Debug.locals.put("j", _j);
;
 break; }
case 2: {
 break; }
case 3: {
 break; }
case 4: {
 break; }
default: {
 BA.debugLineNum = 288;BA.debugLine="Select SearchBuilding.idspin";
Debug.ShouldStop(-2147483648);
switch (BA.switchObjectToInt(editbuildingfacility.mostCurrent._searchbuilding._idspin,BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Msme"),BA.ObjectToString("Educational"),BA.ObjectToString("Health"))) {
case 0: {
 break; }
case 1: {
 BA.debugLineNum = 292;BA.debugLine="For j=0 To arraysize-1";
Debug.ShouldStop(8);
{
final int step20 = 1;
final int limit20 = RemoteObject.solve(new RemoteObject[] {editbuildingfacility._arraysize,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = BA.numberCast(int.class, 0) ;
for (;(step20 > 0 && _j.<Integer>get().intValue() <= limit20) || (step20 < 0 && _j.<Integer>get().intValue() >= limit20) ;_j = RemoteObject.createImmutable((int)(0 + _j.<Integer>get().intValue() + step20))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 293;BA.debugLine="Log(\"INI DIAA : \"&CLV1.GetPanel(j).GetView(0";
Debug.ShouldStop(16);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INI DIAA : "),editbuildingfacility.mostCurrent._clv1.runMethod(false,"_getpanel",(Object)(_j)).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"getText"),RemoteObject.createImmutable(" & ID:"),editbuildingfacility.mostCurrent._clv1.runMethod(false,"_getpanel",(Object)(_j)).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"getText"))));
 BA.debugLineNum = 294;BA.debugLine="ExecuteRemoteQuery(\"UPDATE detail_office_bui";
Debug.ShouldStop(32);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("UPDATE detail_office_building_facilities SET quantity_of_facilities ="),editbuildingfacility.mostCurrent._clv1.runMethod(false,"_getpanel",(Object)(_j)).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"getText"),RemoteObject.createImmutable(" WHERE office_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' and facility_id ="),editbuildingfacility.mostCurrent._clv1.runMethod(false,"_getpanel",(Object)(_j)).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"getText")),RemoteObject.createImmutable("Update"));
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 297;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(256);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 2: {
 break; }
case 3: {
 break; }
case 4: {
 break; }
}
;
 break; }
}
;
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
public static RemoteObject  _createitem(RemoteObject _width,RemoteObject _title,RemoteObject _content,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (editbuildingfacility) ","editbuildingfacility",15,editbuildingfacility.mostCurrent.activityBA,editbuildingfacility.mostCurrent,169);
if (RapidSub.canDelegate("createitem")) return b4a.example.editbuildingfacility.remoteMe.runUserSub(false, "editbuildingfacility","createitem", _width, _title, _content, _id);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Title", _title);
Debug.locals.put("Content", _content);
Debug.locals.put("id", _id);
 BA.debugLineNum = 169;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(512);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = editbuildingfacility._xui.runMethod(false,"CreatePanel",editbuildingfacility.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 171;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 100%x,6%y)";
Debug.ShouldStop(1024);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(editbuildingfacility.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),editbuildingfacility.mostCurrent.activityBA)),(Object)(editbuildingfacility.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),editbuildingfacility.mostCurrent.activityBA)));
 BA.debugLineNum = 172;BA.debugLine="p.LoadLayout(\"facility_edit\")";
Debug.ShouldStop(2048);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("facility_edit")),editbuildingfacility.mostCurrent.activityBA);
 BA.debugLineNum = 173;BA.debugLine="numfc.Text = Title";
Debug.ShouldStop(4096);
editbuildingfacility.mostCurrent._numfc.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 174;BA.debugLine="namefc.Text = Content";
Debug.ShouldStop(8192);
editbuildingfacility.mostCurrent._namefc.runMethod(true,"setText",BA.ObjectToCharSequence(_content));
 BA.debugLineNum = 175;BA.debugLine="idfaci.Text = id";
Debug.ShouldStop(16384);
editbuildingfacility.mostCurrent._idfaci.runMethod(true,"setText",BA.ObjectToCharSequence(_id));
 BA.debugLineNum = 176;BA.debugLine="SetBackgroundTintList(numfc, Colors.ARGB(225,3,15";
Debug.ShouldStop(32768);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), editbuildingfacility.mostCurrent._numfc.getObject()),editbuildingfacility.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),editbuildingfacility.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 177;BA.debugLine="Return p";
Debug.ShouldStop(65536);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executeremotequery(RemoteObject _query,RemoteObject _jobname) throws Exception{
try {
		Debug.PushSubsStack("ExecuteRemoteQuery (editbuildingfacility) ","editbuildingfacility",15,editbuildingfacility.mostCurrent.activityBA,editbuildingfacility.mostCurrent,163);
if (RapidSub.canDelegate("executeremotequery")) return b4a.example.editbuildingfacility.remoteMe.runUserSub(false, "editbuildingfacility","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 163;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(4);
 BA.debugLineNum = 164;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(8);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 165;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(16);
_job.runVoidMethod ("_initialize",editbuildingfacility.processBA,(Object)(_jobname),(Object)(editbuildingfacility.getObject()));
 BA.debugLineNum = 166;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
Debug.ShouldStop(32);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),editbuildingfacility.mostCurrent._main._server,RemoteObject.createImmutable("mobile/json.php"))),(Object)(_query));
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
 //BA.debugLineNum = 19;BA.debugLine="Private CLV1 As CustomListView";
editbuildingfacility.mostCurrent._clv1 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 20;BA.debugLine="Private ScrollView1 As ScrollView";
editbuildingfacility.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private numfc As B4XView";
editbuildingfacility.mostCurrent._numfc = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private namefc As B4XView";
editbuildingfacility.mostCurrent._namefc = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ListItem As Panel";
editbuildingfacility.mostCurrent._listitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim FacMap As Map";
editbuildingfacility.mostCurrent._facmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 27;BA.debugLine="Private Label1 As Label";
editbuildingfacility.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private LblFacility As Label";
editbuildingfacility.mostCurrent._lblfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private CLV1 As CustomListView";
editbuildingfacility.mostCurrent._clv1 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 30;BA.debugLine="Private PFacility As Panel";
editbuildingfacility.mostCurrent._pfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private BtnSaveChanges As Button";
editbuildingfacility.mostCurrent._btnsavechanges = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private PanelBuildingList As Panel";
editbuildingfacility.mostCurrent._panelbuildinglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private btnDelete As Button";
editbuildingfacility.mostCurrent._btndelete = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private Panel1 As Panel";
editbuildingfacility.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private idfaci As Label";
editbuildingfacility.mostCurrent._idfaci = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private Label3 As Label";
editbuildingfacility.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private Label2 As Label";
editbuildingfacility.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (editbuildingfacility) ","editbuildingfacility",15,editbuildingfacility.mostCurrent.activityBA,editbuildingfacility.mostCurrent,180);
if (RapidSub.canDelegate("jobdone")) return b4a.example.editbuildingfacility.remoteMe.runUserSub(false, "editbuildingfacility","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parserf = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _parserfa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _fasi_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _c = RemoteObject.createImmutable(0);
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _fasilitas_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _content = RemoteObject.createImmutable("");
RemoteObject _quantity = RemoteObject.createImmutable(0);
RemoteObject _idnya = RemoteObject.createImmutable(0);
Debug.locals.put("Job", _job);
 BA.debugLineNum = 180;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 181;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(1048576);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 182;BA.debugLine="Dim res As String";
Debug.ShouldStop(2097152);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 183;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(4194304);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 184;BA.debugLine="Log(\"Response from server :\"& res)";
Debug.ShouldStop(8388608);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 185;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(16777216);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("Update"),BA.ObjectToString("AllFacilities"),BA.ObjectToString("Facility"),BA.ObjectToString("DeleteFacility"))) {
case 0: {
 BA.debugLineNum = 187;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 189;BA.debugLine="RefreshData";
Debug.ShouldStop(268435456);
_refreshdata();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",editbuildingfacility.processBA, e10.toString()); BA.debugLineNum = 191;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1073741824);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 192;BA.debugLine="Msgbox(\"Errorr\",\"\")";
Debug.ShouldStop(-2147483648);
editbuildingfacility.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Errorr")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),editbuildingfacility.mostCurrent.activityBA);
 BA.debugLineNum = 193;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(editbuildingfacility.mostCurrent.__c.runMethod(false,"LastException",editbuildingfacility.mostCurrent.activityBA))));
 };
 break; }
case 1: {
 BA.debugLineNum = 196;BA.debugLine="Dim parserf As JSONParser 'mengambil data dala";
Debug.ShouldStop(8);
_parserf = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parserf", _parserf);
 BA.debugLineNum = 197;BA.debugLine="Dim parserfa As JSONParser";
Debug.ShouldStop(16);
_parserfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parserfa", _parserfa);
 BA.debugLineNum = 198;BA.debugLine="parserf.Initialize(res)";
Debug.ShouldStop(32);
_parserf.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 199;BA.debugLine="Dim fasi_array As List = parserf.NextArray";
Debug.ShouldStop(64);
_fasi_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_fasi_array = _parserf.runMethod(false,"NextArray");Debug.locals.put("fasi_array", _fasi_array);Debug.locals.put("fasi_array", _fasi_array);
 BA.debugLineNum = 200;BA.debugLine="parserfa.Initialize(res)";
Debug.ShouldStop(128);
_parserfa.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 201;BA.debugLine="Dim c As Int";
Debug.ShouldStop(256);
_c = RemoteObject.createImmutable(0);Debug.locals.put("c", _c);
 BA.debugLineNum = 202;BA.debugLine="If fasi_array.Size-1 < 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_fasi_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 203;BA.debugLine="Panel1.Enabled=False";
Debug.ShouldStop(1024);
editbuildingfacility.mostCurrent._panel1.runMethod(true,"setEnabled",editbuildingfacility.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 204;BA.debugLine="Panel1.Color=Colors.ARGB(225,247,247,247)";
Debug.ShouldStop(2048);
editbuildingfacility.mostCurrent._panel1.runVoidMethod ("setColor",editbuildingfacility.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 247)),(Object)(BA.numberCast(int.class, 247)),(Object)(BA.numberCast(int.class, 247))));
 BA.debugLineNum = 205;BA.debugLine="Label2.TextColor=0xFFCECECE";
Debug.ShouldStop(4096);
editbuildingfacility.mostCurrent._label2.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xffcecece));
 BA.debugLineNum = 206;BA.debugLine="Panel1.Visible=True";
Debug.ShouldStop(8192);
editbuildingfacility.mostCurrent._panel1.runMethod(true,"setVisible",editbuildingfacility.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 208;BA.debugLine="For c=0 To fasi_array.Size - 1";
Debug.ShouldStop(32768);
{
final int step27 = 1;
final int limit27 = RemoteObject.solve(new RemoteObject[] {_fasi_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_c = BA.numberCast(int.class, 0) ;
for (;(step27 > 0 && _c.<Integer>get().intValue() <= limit27) || (step27 < 0 && _c.<Integer>get().intValue() >= limit27) ;_c = RemoteObject.createImmutable((int)(0 + _c.<Integer>get().intValue() + step27))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 209;BA.debugLine="Dim a As Map";
Debug.ShouldStop(65536);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 210;BA.debugLine="a = fasi_array.Get(c)";
Debug.ShouldStop(131072);
_a.setObject(_fasi_array.runMethod(false,"Get",(Object)(_c)));
 BA.debugLineNum = 212;BA.debugLine="Dim id, name As String";
Debug.ShouldStop(524288);
_id = RemoteObject.createImmutable("");Debug.locals.put("id", _id);
_name = RemoteObject.createImmutable("");Debug.locals.put("name", _name);
 BA.debugLineNum = 213;BA.debugLine="id=a.Get(\"facility_id\")";
Debug.ShouldStop(1048576);
_id = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("facility_id")))));Debug.locals.put("id", _id);
 BA.debugLineNum = 214;BA.debugLine="name=a.Get(\"name_of_facility\")";
Debug.ShouldStop(2097152);
_name = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_facility")))));Debug.locals.put("name", _name);
 BA.debugLineNum = 215;BA.debugLine="Log(\"id: \"&id&\" | name: \"&name)";
Debug.ShouldStop(4194304);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("id: "),_id,RemoteObject.createImmutable(" | name: "),_name)));
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 217;BA.debugLine="Panel1.Enabled=True";
Debug.ShouldStop(16777216);
editbuildingfacility.mostCurrent._panel1.runMethod(true,"setEnabled",editbuildingfacility.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 218;BA.debugLine="Panel1.Color=Colors.White";
Debug.ShouldStop(33554432);
editbuildingfacility.mostCurrent._panel1.runVoidMethod ("setColor",editbuildingfacility.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 219;BA.debugLine="Label2.TextColor=Colors.Black";
Debug.ShouldStop(67108864);
editbuildingfacility.mostCurrent._label2.runMethod(true,"setTextColor",editbuildingfacility.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 220;BA.debugLine="Panel1.Visible =True";
Debug.ShouldStop(134217728);
editbuildingfacility.mostCurrent._panel1.runMethod(true,"setVisible",editbuildingfacility.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 223;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1073741824);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 2: {
 BA.debugLineNum = 225;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam";
Debug.ShouldStop(1);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 226;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(2);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 227;BA.debugLine="Dim fasilitas_array As List";
Debug.ShouldStop(4);
_fasilitas_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("fasilitas_array", _fasilitas_array);
 BA.debugLineNum = 228;BA.debugLine="fasilitas_array = parser.NextArray";
Debug.ShouldStop(8);
_fasilitas_array = _parser.runMethod(false,"NextArray");Debug.locals.put("fasilitas_array", _fasilitas_array);
 BA.debugLineNum = 229;BA.debugLine="arraysize = fasilitas_array.Size";
Debug.ShouldStop(16);
editbuildingfacility._arraysize = _fasilitas_array.runMethod(true,"getSize");
 BA.debugLineNum = 230;BA.debugLine="If fasilitas_array.Size > 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_fasilitas_array.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 231;BA.debugLine="For i=0 To fasilitas_array.Size - 1";
Debug.ShouldStop(64);
{
final int step48 = 1;
final int limit48 = RemoteObject.solve(new RemoteObject[] {_fasilitas_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step48 > 0 && _i <= limit48) || (step48 < 0 && _i >= limit48) ;_i = ((int)(0 + _i + step48))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 232;BA.debugLine="Dim a As Map";
Debug.ShouldStop(128);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 233;BA.debugLine="a = fasilitas_array.Get(i)";
Debug.ShouldStop(256);
_a.setObject(_fasilitas_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 235;BA.debugLine="Dim content As String = a.Get(\"name_of_facil";
Debug.ShouldStop(1024);
_content = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_facility")))));Debug.locals.put("content", _content);Debug.locals.put("content", _content);
 BA.debugLineNum = 236;BA.debugLine="Dim quantity As Int = a.Get(\"quantity_of_fac";
Debug.ShouldStop(2048);
_quantity = BA.numberCast(int.class, _a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("quantity_of_facilities")))));Debug.locals.put("quantity", _quantity);Debug.locals.put("quantity", _quantity);
 BA.debugLineNum = 237;BA.debugLine="Dim idnya As Int = a.Get(\"facility_id\")";
Debug.ShouldStop(4096);
_idnya = BA.numberCast(int.class, _a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("facility_id")))));Debug.locals.put("idnya", _idnya);Debug.locals.put("idnya", _idnya);
 BA.debugLineNum = 238;BA.debugLine="CLV1.Add(CreateItem(CLV1.AsView.Width, $\"${q";
Debug.ShouldStop(8192);
editbuildingfacility.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(editbuildingfacility.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getWidth"),(RemoteObject.concat(RemoteObject.createImmutable(""),editbuildingfacility.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_quantity))),RemoteObject.createImmutable(""))),_content,_idnya).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 239;BA.debugLine="CLV1.AsView.Height = ListItem.Height*(i+1)";
Debug.ShouldStop(16384);
editbuildingfacility.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {editbuildingfacility.mostCurrent._listitem.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))}, "*",0, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 242;BA.debugLine="Label3.Visible=False";
Debug.ShouldStop(131072);
editbuildingfacility.mostCurrent._label3.runMethod(true,"setVisible",editbuildingfacility.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 243;BA.debugLine="CLV1.AsView.Height = CLV1.AsView.Height + 1%y";
Debug.ShouldStop(262144);
editbuildingfacility.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {editbuildingfacility.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getHeight"),editbuildingfacility.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),editbuildingfacility.mostCurrent.activityBA)}, "+",1, 1));
 BA.debugLineNum = 244;BA.debugLine="CLV1.sv.Height = CLV1.AsView.Height";
Debug.ShouldStop(524288);
editbuildingfacility.mostCurrent._clv1.getField(false,"_sv").runMethod(true,"setHeight",editbuildingfacility.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 245;BA.debugLine="PFacility.Height = CLV1.AsView.Top + CLV1.AsV";
Debug.ShouldStop(1048576);
editbuildingfacility.mostCurrent._pfacility.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {editbuildingfacility.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getTop"),editbuildingfacility.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getHeight"),editbuildingfacility.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),editbuildingfacility.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 246;BA.debugLine="Panel1.Top=PFacility.Height+PFacility.Top+3%y";
Debug.ShouldStop(2097152);
editbuildingfacility.mostCurrent._panel1.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {editbuildingfacility.mostCurrent._pfacility.runMethod(true,"getHeight"),editbuildingfacility.mostCurrent._pfacility.runMethod(true,"getTop"),editbuildingfacility.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),editbuildingfacility.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 247;BA.debugLine="BtnSaveChanges.Top=Panel1.Top+Panel1.Height+3";
Debug.ShouldStop(4194304);
editbuildingfacility.mostCurrent._btnsavechanges.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {editbuildingfacility.mostCurrent._panel1.runMethod(true,"getTop"),editbuildingfacility.mostCurrent._panel1.runMethod(true,"getHeight"),editbuildingfacility.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),editbuildingfacility.mostCurrent.activityBA)}, "++",2, 1));
 }else {
 BA.debugLineNum = 249;BA.debugLine="Label3.Visible=True";
Debug.ShouldStop(16777216);
editbuildingfacility.mostCurrent._label3.runMethod(true,"setVisible",editbuildingfacility.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 250;BA.debugLine="Label3.Height= 15%y";
Debug.ShouldStop(33554432);
editbuildingfacility.mostCurrent._label3.runMethod(true,"setHeight",editbuildingfacility.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),editbuildingfacility.mostCurrent.activityBA));
 BA.debugLineNum = 251;BA.debugLine="Label3.Top=LblFacility.Height";
Debug.ShouldStop(67108864);
editbuildingfacility.mostCurrent._label3.runMethod(true,"setTop",editbuildingfacility.mostCurrent._lblfacility.runMethod(true,"getHeight"));
 BA.debugLineNum = 252;BA.debugLine="PFacility.Height=Label3.Top+Label3.Height";
Debug.ShouldStop(134217728);
editbuildingfacility.mostCurrent._pfacility.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {editbuildingfacility.mostCurrent._label3.runMethod(true,"getTop"),editbuildingfacility.mostCurrent._label3.runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 253;BA.debugLine="Panel1.Top=PFacility.Height+PFacility.Top+3%y";
Debug.ShouldStop(268435456);
editbuildingfacility.mostCurrent._panel1.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {editbuildingfacility.mostCurrent._pfacility.runMethod(true,"getHeight"),editbuildingfacility.mostCurrent._pfacility.runMethod(true,"getTop"),editbuildingfacility.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),editbuildingfacility.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 254;BA.debugLine="BtnSaveChanges.Top=Panel1.Top+Panel1.Height+3";
Debug.ShouldStop(536870912);
editbuildingfacility.mostCurrent._btnsavechanges.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {editbuildingfacility.mostCurrent._panel1.runMethod(true,"getTop"),editbuildingfacility.mostCurrent._panel1.runMethod(true,"getHeight"),editbuildingfacility.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),editbuildingfacility.mostCurrent.activityBA)}, "++",2, 1));
 };
 BA.debugLineNum = 257;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 3: {
 BA.debugLineNum = 259;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 260;BA.debugLine="RefreshData";
Debug.ShouldStop(8);
_refreshdata();
 BA.debugLineNum = 261;BA.debugLine="ToastMessageShow(\"Deleted\",True)";
Debug.ShouldStop(16);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Deleted")),(Object)(editbuildingfacility.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e77) {
			BA.rdebugUtils.runVoidMethod("setLastException",editbuildingfacility.processBA, e77.toString()); BA.debugLineNum = 263;BA.debugLine="Msgbox(\"Data can not be updated :(\" , \"error\"";
Debug.ShouldStop(64);
editbuildingfacility.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Data can not be updated :(")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("error"))),editbuildingfacility.mostCurrent.activityBA);
 };
 break; }
}
;
 };
 BA.debugLineNum = 268;BA.debugLine="Job.Release";
Debug.ShouldStop(2048);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 269;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel1_click() throws Exception{
try {
		Debug.PushSubsStack("Panel1_Click (editbuildingfacility) ","editbuildingfacility",15,editbuildingfacility.mostCurrent.activityBA,editbuildingfacility.mostCurrent,344);
if (RapidSub.canDelegate("panel1_click")) return b4a.example.editbuildingfacility.remoteMe.runUserSub(false, "editbuildingfacility","panel1_click");
 BA.debugLineNum = 344;BA.debugLine="Sub Panel1_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 345;BA.debugLine="StartActivity(AddBuildingFacility)";
Debug.ShouldStop(16777216);
editbuildingfacility.mostCurrent.__c.runVoidMethod ("StartActivity",editbuildingfacility.processBA,(Object)((editbuildingfacility.mostCurrent._addbuildingfacility.getObject())));
 BA.debugLineNum = 346;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
editbuildingfacility._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim ArraySize2 As Int";
editbuildingfacility._arraysize2 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 11;BA.debugLine="Dim idisi,isi As String";
editbuildingfacility._idisi = RemoteObject.createImmutable("");
editbuildingfacility._isi = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim idBuilding As String";
editbuildingfacility._idbuilding = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Dim arraysize As Int";
editbuildingfacility._arraysize = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _refreshdata() throws Exception{
try {
		Debug.PushSubsStack("RefreshData (editbuildingfacility) ","editbuildingfacility",15,editbuildingfacility.mostCurrent.activityBA,editbuildingfacility.mostCurrent,112);
if (RapidSub.canDelegate("refreshdata")) return b4a.example.editbuildingfacility.remoteMe.runUserSub(false, "editbuildingfacility","refreshdata");
 BA.debugLineNum = 112;BA.debugLine="Sub RefreshData";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="CLV1.Clear";
Debug.ShouldStop(65536);
editbuildingfacility.mostCurrent._clv1.runVoidMethod ("_clear");
 BA.debugLineNum = 114;BA.debugLine="Select Home.HomeBuilding";
Debug.ShouldStop(131072);
switch (BA.switchObjectToInt(editbuildingfacility.mostCurrent._home._homebuilding,BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Msme"),BA.ObjectToString("Educational"),BA.ObjectToString("Health"))) {
case 0: {
 BA.debugLineNum = 116;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
Debug.ShouldStop(524288);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT facility_id , name_of_facility from worship_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("') ORDER BY name_of_facility ASC")),RemoteObject.createImmutable("AllFacilities"));
 BA.debugLineNum = 117;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.worship_building_i";
Debug.ShouldStop(1048576);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.worship_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id ='"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' ORDER BY F.name_of_facility ASC")),RemoteObject.createImmutable("Facility"));
 break; }
case 1: {
 BA.debugLineNum = 119;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
Debug.ShouldStop(4194304);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT facility_id , name_of_facility from office_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("') ORDER BY name_of_facility ASC")),RemoteObject.createImmutable("AllFacilities"));
 BA.debugLineNum = 120;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.office_building_id";
Debug.ShouldStop(8388608);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.office_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' ORDER BY F.name_of_facility ASC")),RemoteObject.createImmutable("Facility"));
 break; }
case 2: {
 BA.debugLineNum = 122;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
Debug.ShouldStop(33554432);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT facility_id , name_of_facility from msme_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("') ORDER BY name_of_facility ASC")),RemoteObject.createImmutable("AllFacilities"));
 BA.debugLineNum = 123;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.msme_building_id,";
Debug.ShouldStop(67108864);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.msme_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' ORDER BY F.name_of_facility ASC")),RemoteObject.createImmutable("Facility"));
 break; }
case 3: {
 BA.debugLineNum = 125;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
Debug.ShouldStop(268435456);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT facility_id , name_of_facility from educational_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("') ORDER BY name_of_facility ASC")),RemoteObject.createImmutable("AllFacilities"));
 BA.debugLineNum = 126;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.educational_buildi";
Debug.ShouldStop(536870912);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.educational_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' ORDER BY F.name_of_facility ASC")),RemoteObject.createImmutable("Facility"));
 break; }
case 4: {
 BA.debugLineNum = 128;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
Debug.ShouldStop(-2147483648);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT facility_id , name_of_facility from health_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("') ORDER BY name_of_facility ASC")),RemoteObject.createImmutable("AllFacilities"));
 BA.debugLineNum = 129;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.health_building_id";
Debug.ShouldStop(1);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.health_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_health_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' ORDER BY F.name_of_facility ASC")),RemoteObject.createImmutable("Facility"));
 break; }
default: {
 BA.debugLineNum = 131;BA.debugLine="Select SearchBuilding.idspin";
Debug.ShouldStop(4);
switch (BA.switchObjectToInt(editbuildingfacility.mostCurrent._searchbuilding._idspin,BA.ObjectToString("Worship"),BA.ObjectToString("Office"),BA.ObjectToString("Msme"),BA.ObjectToString("Educational"),BA.ObjectToString("Health"))) {
case 0: {
 BA.debugLineNum = 133;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
Debug.ShouldStop(16);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT facility_id , name_of_facility from worship_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("') ORDER BY name_of_facility ASC")),RemoteObject.createImmutable("AllFacilities"));
 BA.debugLineNum = 134;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.worship_building";
Debug.ShouldStop(32);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.worship_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id ='"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' ORDER BY F.name_of_facility ASC")),RemoteObject.createImmutable("Facility"));
 break; }
case 1: {
 BA.debugLineNum = 136;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
Debug.ShouldStop(128);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT facility_id , name_of_facility from office_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("') ORDER BY name_of_facility ASC")),RemoteObject.createImmutable("AllFacilities"));
 BA.debugLineNum = 137;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.office_building_";
Debug.ShouldStop(256);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.office_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' ORDER BY F.name_of_facility ASC")),RemoteObject.createImmutable("Facility"));
 break; }
case 2: {
 BA.debugLineNum = 139;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
Debug.ShouldStop(1024);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT facility_id , name_of_facility from msme_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("') ORDER BY name_of_facility ASC")),RemoteObject.createImmutable("AllFacilities"));
 BA.debugLineNum = 140;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.msme_building_id";
Debug.ShouldStop(2048);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.msme_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' ORDER BY F.name_of_facility ASC")),RemoteObject.createImmutable("Facility"));
 break; }
case 3: {
 BA.debugLineNum = 142;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
Debug.ShouldStop(8192);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT facility_id , name_of_facility from educational_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("') ORDER BY name_of_facility ASC")),RemoteObject.createImmutable("AllFacilities"));
 BA.debugLineNum = 143;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.educational_buil";
Debug.ShouldStop(16384);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.educational_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' ORDER BY F.name_of_facility ASC")),RemoteObject.createImmutable("Facility"));
 break; }
case 4: {
 BA.debugLineNum = 145;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
Debug.ShouldStop(65536);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT facility_id , name_of_facility from health_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("') ORDER BY name_of_facility ASC")),RemoteObject.createImmutable("AllFacilities"));
 BA.debugLineNum = 146;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.health_building_";
Debug.ShouldStop(131072);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.health_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_health_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"),editbuildingfacility._idbuilding,RemoteObject.createImmutable("' ORDER BY F.name_of_facility ASC")),RemoteObject.createImmutable("Facility"));
 break; }
}
;
 break; }
}
;
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("SetBackgroundTintList (editbuildingfacility) ","editbuildingfacility",15,editbuildingfacility.mostCurrent.activityBA,editbuildingfacility.mostCurrent,151);
if (RapidSub.canDelegate("setbackgroundtintlist")) return b4a.example.editbuildingfacility.remoteMe.runUserSub(false, "editbuildingfacility","setbackgroundtintlist", _view, _active, _enabled);
RemoteObject _states = null;
RemoteObject _color = null;
RemoteObject _csl = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("View", _view);
Debug.locals.put("Active", _active);
Debug.locals.put("Enabled", _enabled);
 BA.debugLineNum = 151;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="Dim States(2,1) As Int";
Debug.ShouldStop(8388608);
_states = RemoteObject.createNewArray ("int", new int[] {2,1}, new Object[]{});Debug.locals.put("States", _states);
 BA.debugLineNum = 153;BA.debugLine="States(0,0) = 16842908     'Active";
Debug.ShouldStop(16777216);
_states.setArrayElement (BA.numberCast(int.class, 16842908),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 154;BA.debugLine="States(1,0) = 16842910    'Enabled";
Debug.ShouldStop(33554432);
_states.setArrayElement (BA.numberCast(int.class, 16842910),BA.numberCast(int.class, 1),BA.numberCast(int.class, 0));
 BA.debugLineNum = 155;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
Debug.ShouldStop(67108864);
_color = RemoteObject.createNewArray("int",new int[] {2},new Object[] {_active,_enabled});Debug.locals.put("Color", _color);Debug.locals.put("Color", _color);
 BA.debugLineNum = 156;BA.debugLine="Dim CSL As JavaObject";
Debug.ShouldStop(134217728);
_csl = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("CSL", _csl);
 BA.debugLineNum = 157;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
Debug.ShouldStop(268435456);
_csl.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.content.res.ColorStateList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_states),(_color)})));
 BA.debugLineNum = 158;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(536870912);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 159;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
Debug.ShouldStop(1073741824);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.support.v4.view.ViewCompat")));
 BA.debugLineNum = 160;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
Debug.ShouldStop(-2147483648);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBackgroundTintList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_view.getObject()),(_csl.getObject())})));
 BA.debugLineNum = 161;BA.debugLine="End Sub";
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