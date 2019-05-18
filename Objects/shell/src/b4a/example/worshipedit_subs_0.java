package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class worshipedit_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (worshipedit) ","worshipedit",30,worshipedit.mostCurrent.activityBA,worshipedit.mostCurrent,55);
if (RapidSub.canDelegate("activity_create")) return b4a.example.worshipedit.remoteMe.runUserSub(false, "worshipedit","activity_create", _firsttime);
RemoteObject _sv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 55;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 58;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(33554432);
worshipedit.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),worshipedit.mostCurrent.activityBA);
 BA.debugLineNum = 59;BA.debugLine="ScrollView1.Panel.LoadLayout(\"WorshipEdit\")";
Debug.ShouldStop(67108864);
worshipedit.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("WorshipEdit")),worshipedit.mostCurrent.activityBA);
 BA.debugLineNum = 60;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
Debug.ShouldStop(134217728);
worshipedit.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",worshipedit.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 BA.debugLineNum = 61;BA.debugLine="PanelToolBar.Visible = False";
Debug.ShouldStop(268435456);
worshipedit.mostCurrent._paneltoolbar.runMethod(true,"setVisible",worshipedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 62;BA.debugLine="SetBackgroundTintList(WorshipName, Colors.ARGB(22";
Debug.ShouldStop(536870912);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), worshipedit.mostCurrent._worshipname.getObject()),worshipedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),worshipedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 63;BA.debugLine="SetBackgroundTintList(StandingYear, Colors.ARGB(2";
Debug.ShouldStop(1073741824);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), worshipedit.mostCurrent._standingyear.getObject()),worshipedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),worshipedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 64;BA.debugLine="SetBackgroundTintList(BuildingArea, Colors.ARGB(2";
Debug.ShouldStop(-2147483648);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), worshipedit.mostCurrent._buildingarea.getObject()),worshipedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),worshipedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 65;BA.debugLine="SetBackgroundTintList(LandArea, Colors.ARGB(225,3";
Debug.ShouldStop(1);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), worshipedit.mostCurrent._landarea.getObject()),worshipedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),worshipedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 66;BA.debugLine="SetBackgroundTintList(Electricity, Colors.ARGB(22";
Debug.ShouldStop(2);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), worshipedit.mostCurrent._electricity.getObject()),worshipedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),worshipedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 67;BA.debugLine="SetBackgroundTintList(ParkingArea, Colors.ARGB(22";
Debug.ShouldStop(4);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), worshipedit.mostCurrent._parkingarea.getObject()),worshipedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),worshipedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 69;BA.debugLine="BackArrow.Visible= True";
Debug.ShouldStop(16);
worshipedit.mostCurrent._backarrow.runMethod(true,"setVisible",worshipedit.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 70;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(32);
worshipedit.mostCurrent._backarrow.runVoidMethod ("SetBackgroundImageNew",(Object)((worshipedit.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(worshipedit.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("back-arrow.png"))).getObject())));
 BA.debugLineNum = 71;BA.debugLine="TitleBar.Text=\"Building Detail\"";
Debug.ShouldStop(64);
worshipedit.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("Building Detail"));
 BA.debugLineNum = 74;BA.debugLine="If WorshipBuilding.nameBuilding.Length > 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",worshipedit.mostCurrent._worshipbuilding._namebuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 75;BA.debugLine="WorshipName.Text = WorshipBuilding.nameBuilding";
Debug.ShouldStop(1024);
worshipedit.mostCurrent._worshipname.runMethod(true,"setText",BA.ObjectToCharSequence(worshipedit.mostCurrent._worshipbuilding._namebuilding));
 BA.debugLineNum = 76;BA.debugLine="ids = WorshipBuilding.idBuilding";
Debug.ShouldStop(2048);
worshipedit._ids = worshipedit.mostCurrent._worshipbuilding._idbuilding;
 BA.debugLineNum = 77;BA.debugLine="Log(ids)";
Debug.ShouldStop(4096);
worshipedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(worshipedit._ids));
 }else 
{ BA.debugLineNum = 78;BA.debugLine="Else If SearchBuilding.nameBuilding.Length > 0 Th";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",worshipedit.mostCurrent._searchbuilding._namebuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 79;BA.debugLine="WorshipName.Text = SearchBuilding.nameBuilding";
Debug.ShouldStop(16384);
worshipedit.mostCurrent._worshipname.runMethod(true,"setText",BA.ObjectToCharSequence(worshipedit.mostCurrent._searchbuilding._namebuilding));
 BA.debugLineNum = 80;BA.debugLine="ids = SearchBuilding.idBuilding";
Debug.ShouldStop(32768);
worshipedit._ids = worshipedit.mostCurrent._searchbuilding._idbuilding;
 BA.debugLineNum = 81;BA.debugLine="Log(ids)";
Debug.ShouldStop(65536);
worshipedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(worshipedit._ids));
 }else {
 BA.debugLineNum = 83;BA.debugLine="WorshipName.Text = \"Please press on the button a";
Debug.ShouldStop(262144);
worshipedit.mostCurrent._worshipname.runMethod(true,"setText",BA.ObjectToCharSequence("Please press on the button and choose an item."));
 }}
;
 BA.debugLineNum = 86;BA.debugLine="Dim sv As ScrollView";
Debug.ShouldStop(2097152);
_sv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");Debug.locals.put("sv", _sv);
 BA.debugLineNum = 87;BA.debugLine="ScrollView1.Height=100%y";
Debug.ShouldStop(4194304);
worshipedit.mostCurrent._scrollview1.runMethod(true,"setHeight",worshipedit.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),worshipedit.mostCurrent.activityBA));
 BA.debugLineNum = 88;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
Debug.ShouldStop(8388608);
worshipedit.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",worshipedit.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Pause (worshipedit) ","worshipedit",30,worshipedit.mostCurrent.activityBA,worshipedit.mostCurrent,104);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.worshipedit.remoteMe.runUserSub(false, "worshipedit","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 104;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(128);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (worshipedit) ","worshipedit",30,worshipedit.mostCurrent.activityBA,worshipedit.mostCurrent,91);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.worshipedit.remoteMe.runUserSub(false, "worshipedit","activity_resume");
 BA.debugLineNum = 91;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="WorshipMap.Initialize";
Debug.ShouldStop(134217728);
worshipedit.mostCurrent._worshipmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 93;BA.debugLine="ConsMap.Initialize";
Debug.ShouldStop(268435456);
worshipedit.mostCurrent._consmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 94;BA.debugLine="FacMap.Initialize";
Debug.ShouldStop(536870912);
worshipedit.mostCurrent._facmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 95;BA.debugLine="ExecuteRemoteQuery(\"SELECT facility_id , name_of_";
Debug.ShouldStop(1073741824);
_executeremotequery(BA.ObjectToString("SELECT facility_id , name_of_facility as nameface FROM worship_building_facilities ORDER BY name_of_facility ASC"),RemoteObject.createImmutable("AllFacilities"));
 BA.debugLineNum = 96;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.worship_building_id,";
Debug.ShouldStop(-2147483648);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT D.worship_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id ='"),worshipedit._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("FASILITAS"));
 BA.debugLineNum = 97;BA.debugLine="ExecuteRemoteQuery(\"SELECT W.worship_building_id,";
Debug.ShouldStop(1);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT W.worship_building_id, W.name_of_worship_building, W.building_area, W.land_area, W.parking_area, W.standing_year, W.electricity_capacity, W.address, W.type_of_construction, W.type_of_worship, ST_X(ST_Centroid(W.geom)) As longitude, ST_Y(ST_CENTROID(W.geom)) As latitude, T.name_of_type As constr, J.name_of_type As typewor, ST_AsText(geom) As geom FROM worship_building As W LEFT JOIN type_of_construction As T ON W.type_of_construction=T.type_id LEFT JOIN type_of_worship As J ON W.type_of_worship=J.type_id WHERE W.worship_building_id='"),worshipedit._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("DATA"));
 BA.debugLineNum = 98;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_type";
Debug.ShouldStop(2);
_executeremotequery(BA.ObjectToString("SELECT type_id, name_of_type FROM type_of_worship ORDER BY name_of_type ASC"),RemoteObject.createImmutable("TypeWorship"));
 BA.debugLineNum = 99;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_type";
Debug.ShouldStop(4);
_executeremotequery(BA.ObjectToString("SELECT type_id, name_of_type FROM type_of_construction ORDER BY name_of_type ASC "),RemoteObject.createImmutable("Construction"));
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
public static RemoteObject  _btnsavechanges_click() throws Exception{
try {
		Debug.PushSubsStack("BtnSaveChanges_Click (worshipedit) ","worshipedit",30,worshipedit.mostCurrent.activityBA,worshipedit.mostCurrent,271);
if (RapidSub.canDelegate("btnsavechanges_click")) return b4a.example.worshipedit.remoteMe.runUserSub(false, "worshipedit","btnsavechanges_click");
 BA.debugLineNum = 271;BA.debugLine="Sub BtnSaveChanges_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 272;BA.debugLine="Log(ids)";
Debug.ShouldStop(32768);
worshipedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(worshipedit._ids));
 BA.debugLineNum = 273;BA.debugLine="If typeworship == \"\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",worshipedit._typeworship,BA.ObjectToString(""))) { 
 BA.debugLineNum = 274;BA.debugLine="tipe_i = tipp";
Debug.ShouldStop(131072);
worshipedit._tipe_i = BA.numberCast(int.class, worshipedit._tipp);
 }else {
 BA.debugLineNum = 276;BA.debugLine="tipe_i = typeworship";
Debug.ShouldStop(524288);
worshipedit._tipe_i = BA.numberCast(int.class, worshipedit._typeworship);
 };
 BA.debugLineNum = 279;BA.debugLine="lbangunan_i = BuildingArea.Text";
Debug.ShouldStop(4194304);
worshipedit._lbangunan_i = BA.numberCast(int.class, worshipedit.mostCurrent._buildingarea.runMethod(true,"getText"));
 BA.debugLineNum = 280;BA.debugLine="lparkir_i = ParkingArea.Text";
Debug.ShouldStop(8388608);
worshipedit._lparkir_i = BA.numberCast(int.class, worshipedit.mostCurrent._parkingarea.runMethod(true,"getText"));
 BA.debugLineNum = 281;BA.debugLine="ltanah_i = LandArea.Text";
Debug.ShouldStop(16777216);
worshipedit._ltanah_i = BA.numberCast(int.class, worshipedit.mostCurrent._landarea.runMethod(true,"getText"));
 BA.debugLineNum = 282;BA.debugLine="listrik_i = Electricity.Text";
Debug.ShouldStop(33554432);
worshipedit._listrik_i = BA.numberCast(int.class, worshipedit.mostCurrent._electricity.runMethod(true,"getText"));
 BA.debugLineNum = 283;BA.debugLine="tahun_i = StandingYear.Text";
Debug.ShouldStop(67108864);
worshipedit._tahun_i = BA.numberCast(int.class, worshipedit.mostCurrent._standingyear.runMethod(true,"getText"));
 BA.debugLineNum = 285;BA.debugLine="If typecons == \"\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",worshipedit._typecons,BA.ObjectToString(""))) { 
 BA.debugLineNum = 286;BA.debugLine="cons_i = cons";
Debug.ShouldStop(536870912);
worshipedit._cons_i = BA.numberCast(int.class, worshipedit._cons);
 }else {
 BA.debugLineNum = 288;BA.debugLine="cons_i = typecons";
Debug.ShouldStop(-2147483648);
worshipedit._cons_i = BA.numberCast(int.class, worshipedit._typecons);
 };
 BA.debugLineNum = 291;BA.debugLine="Log(tipe_i)";
Debug.ShouldStop(4);
worshipedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(worshipedit._tipe_i)));
 BA.debugLineNum = 292;BA.debugLine="Log(cons_i)";
Debug.ShouldStop(8);
worshipedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(worshipedit._cons_i)));
 BA.debugLineNum = 293;BA.debugLine="If IsNumber(tipe_i) Then";
Debug.ShouldStop(16);
if (worshipedit.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(BA.NumberToString(worshipedit._tipe_i))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 294;BA.debugLine="Log(\"\"&tipe_i&\" is a number\")";
Debug.ShouldStop(32);
worshipedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),worshipedit._tipe_i,RemoteObject.createImmutable(" is a number"))));
 }else {
 BA.debugLineNum = 296;BA.debugLine="Log(\"\"&tipe_i&\" is not a number\")";
Debug.ShouldStop(128);
worshipedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),worshipedit._tipe_i,RemoteObject.createImmutable(" is not a number"))));
 };
 BA.debugLineNum = 298;BA.debugLine="ProgressDialogShow(\"loading...\")";
Debug.ShouldStop(512);
worshipedit.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",worshipedit.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("loading..."))));
 BA.debugLineNum = 299;BA.debugLine="ExecuteRemoteQuery(\"UPDATE worship_building SET n";
Debug.ShouldStop(1024);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("UPDATE worship_building SET name_of_worship_building = '"),worshipedit._nama,RemoteObject.createImmutable("', type_of_worship ="),worshipedit._tipe_i,RemoteObject.createImmutable(", building_area = "),worshipedit._lbangunan_i,RemoteObject.createImmutable(", land_area = '"),worshipedit._ltanah_i,RemoteObject.createImmutable("', parking_area = "),worshipedit._lparkir_i,RemoteObject.createImmutable(",standing_year = '"),worshipedit._tahun_i,RemoteObject.createImmutable("', electricity_capacity = "),worshipedit._listrik_i,RemoteObject.createImmutable(", type_of_construction = "),worshipedit._cons_i,RemoteObject.createImmutable("WHERE worship_building_id = '"),worshipedit._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("Update"));
 BA.debugLineNum = 300;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Construction_ItemClick (worshipedit) ","worshipedit",30,worshipedit.mostCurrent.activityBA,worshipedit.mostCurrent,264);
if (RapidSub.canDelegate("construction_itemclick")) return b4a.example.worshipedit.remoteMe.runUserSub(false, "worshipedit","construction_itemclick", _position, _value);
RemoteObject _idc = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 264;BA.debugLine="Sub Construction_ItemClick (Position As Int, Value";
Debug.ShouldStop(128);
 BA.debugLineNum = 265;BA.debugLine="Dim idc As String";
Debug.ShouldStop(256);
_idc = RemoteObject.createImmutable("");Debug.locals.put("idc", _idc);
 BA.debugLineNum = 266;BA.debugLine="idc = ConsMap.Get(Value)";
Debug.ShouldStop(512);
_idc = BA.ObjectToString(worshipedit.mostCurrent._consmap.runMethod(false,"Get",(Object)(_value)));Debug.locals.put("idc", _idc);
 BA.debugLineNum = 267;BA.debugLine="typecons = idc";
Debug.ShouldStop(1024);
worshipedit._typecons = _idc;
 BA.debugLineNum = 268;BA.debugLine="Log(typecons)";
Debug.ShouldStop(2048);
worshipedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(worshipedit._typecons));
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
public static RemoteObject  _createitem(RemoteObject _width,RemoteObject _title,RemoteObject _content) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (worshipedit) ","worshipedit",30,worshipedit.mostCurrent.activityBA,worshipedit.mostCurrent,127);
if (RapidSub.canDelegate("createitem")) return b4a.example.worshipedit.remoteMe.runUserSub(false, "worshipedit","createitem", _width, _title, _content);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Title", _title);
Debug.locals.put("Content", _content);
 BA.debugLineNum = 127;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(-2147483648);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = worshipedit._xui.runMethod(false,"CreatePanel",worshipedit.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 129;BA.debugLine="p.LoadLayout(\"facility_edit\")";
Debug.ShouldStop(1);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("facility_edit")),worshipedit.mostCurrent.activityBA);
 BA.debugLineNum = 130;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width,5%y)";
Debug.ShouldStop(2);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(worshipedit.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),worshipedit.mostCurrent.activityBA)));
 BA.debugLineNum = 131;BA.debugLine="numfc.Text = Title";
Debug.ShouldStop(4);
worshipedit.mostCurrent._numfc.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 132;BA.debugLine="namefc.Text = Content";
Debug.ShouldStop(8);
worshipedit.mostCurrent._namefc.runMethod(true,"setText",BA.ObjectToCharSequence(_content));
 BA.debugLineNum = 133;BA.debugLine="Return p";
Debug.ShouldStop(16);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("ExecuteRemoteQuery (worshipedit) ","worshipedit",30,worshipedit.mostCurrent.activityBA,worshipedit.mostCurrent,120);
if (RapidSub.canDelegate("executeremotequery")) return b4a.example.worshipedit.remoteMe.runUserSub(false, "worshipedit","executeremotequery", _query, _jobname);
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
_job.runVoidMethod ("_initialize",worshipedit.processBA,(Object)(_jobname),(Object)(worshipedit.getObject()));
 BA.debugLineNum = 123;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
Debug.ShouldStop(67108864);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),worshipedit.mostCurrent._main._server,RemoteObject.createImmutable("mobile/json.php"))),(Object)(_query));
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
 //BA.debugLineNum = 25;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 28;BA.debugLine="Private CLV1 As CustomListView";
worshipedit.mostCurrent._clv1 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 29;BA.debugLine="Private ScrollView1 As ScrollView";
worshipedit.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private TitleBar As Label";
worshipedit.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private BackArrow As Label";
worshipedit.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private PanelBuildingList As Panel";
worshipedit.mostCurrent._panelbuildinglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private PanelToolBar As Panel";
worshipedit.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private numfc As B4XView";
worshipedit.mostCurrent._numfc = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private namefc As Label";
worshipedit.mostCurrent._namefc = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private PFacility As Panel";
worshipedit.mostCurrent._pfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private ListItem As Panel";
worshipedit.mostCurrent._listitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Dim WorshipName As Label";
worshipedit.mostCurrent._worshipname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private TypeOfWorship As Spinner";
worshipedit.mostCurrent._typeofworship = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Dim WorshipMap As Map";
worshipedit.mostCurrent._worshipmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 43;BA.debugLine="Private StandingYear As Label";
worshipedit.mostCurrent._standingyear = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private BuildingArea As Label";
worshipedit.mostCurrent._buildingarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private LandArea As Label";
worshipedit.mostCurrent._landarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private ParkingArea As Label";
worshipedit.mostCurrent._parkingarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private Electricity As Label";
worshipedit.mostCurrent._electricity = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private Construction As Spinner";
worshipedit.mostCurrent._construction = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Dim ConsMap As Map";
worshipedit.mostCurrent._consmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 50;BA.debugLine="Dim FacMap As Map";
worshipedit.mostCurrent._facmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 52;BA.debugLine="Private BtnSaveChanges As Button";
worshipedit.mostCurrent._btnsavechanges = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (worshipedit) ","worshipedit",30,worshipedit.mostCurrent.activityBA,worshipedit.mostCurrent,136);
if (RapidSub.canDelegate("jobdone")) return b4a.example.worshipedit.remoteMe.runUserSub(false, "worshipedit","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parserf = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _parserfa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _fasi_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _c = RemoteObject.createImmutable(0);
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _fasilitas_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _content = RemoteObject.createImmutable("");
RemoteObject _quantity = RemoteObject.createImmutable(0);
RemoteObject _data_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _type_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _namatype = RemoteObject.createImmutable("");
RemoteObject _idtype = RemoteObject.createImmutable("");
RemoteObject _cons_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _j = 0;
RemoteObject _nama_type = RemoteObject.createImmutable("");
RemoteObject _id_type = RemoteObject.createImmutable("");
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
worshipedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 142;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(8192);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("AllFacilities"),BA.ObjectToString("FASILITAS"),BA.ObjectToString("DATA"),BA.ObjectToString("Update"),BA.ObjectToString("TypeWorship"),BA.ObjectToString("Construction"))) {
case 0: {
 BA.debugLineNum = 144;BA.debugLine="Dim parserf As JSONParser 'mengambil data dala";
Debug.ShouldStop(32768);
_parserf = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parserf", _parserf);
 BA.debugLineNum = 145;BA.debugLine="Dim parserfa As JSONParser";
Debug.ShouldStop(65536);
_parserfa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parserfa", _parserfa);
 BA.debugLineNum = 146;BA.debugLine="parserf.Initialize(res)";
Debug.ShouldStop(131072);
_parserf.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 147;BA.debugLine="Dim fasi_array As List = parserf.NextArray";
Debug.ShouldStop(262144);
_fasi_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_fasi_array = _parserf.runMethod(false,"NextArray");Debug.locals.put("fasi_array", _fasi_array);Debug.locals.put("fasi_array", _fasi_array);
 BA.debugLineNum = 148;BA.debugLine="parserfa.Initialize(res)";
Debug.ShouldStop(524288);
_parserfa.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 149;BA.debugLine="Dim c As Int";
Debug.ShouldStop(1048576);
_c = RemoteObject.createImmutable(0);Debug.locals.put("c", _c);
 BA.debugLineNum = 150;BA.debugLine="For c=0 To fasi_array.Size - 1";
Debug.ShouldStop(2097152);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {_fasi_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_c = BA.numberCast(int.class, 0) ;
for (;(step13 > 0 && _c.<Integer>get().intValue() <= limit13) || (step13 < 0 && _c.<Integer>get().intValue() >= limit13) ;_c = RemoteObject.createImmutable((int)(0 + _c.<Integer>get().intValue() + step13))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 151;BA.debugLine="Dim a As Map";
Debug.ShouldStop(4194304);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 152;BA.debugLine="a = fasi_array.Get(c)";
Debug.ShouldStop(8388608);
_a.setObject(_fasi_array.runMethod(false,"Get",(Object)(_c)));
 BA.debugLineNum = 154;BA.debugLine="isi = a.Get(\"name_of_facility\")";
Debug.ShouldStop(33554432);
worshipedit._isi = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_facility")))));
 BA.debugLineNum = 155;BA.debugLine="Log(\"ISI: \"&isi)";
Debug.ShouldStop(67108864);
worshipedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ISI: "),worshipedit._isi)));
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 157;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(268435456);
worshipedit.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 1: {
 BA.debugLineNum = 160;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam";
Debug.ShouldStop(-2147483648);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 161;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(1);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 162;BA.debugLine="Dim fasilitas_array As List";
Debug.ShouldStop(2);
_fasilitas_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("fasilitas_array", _fasilitas_array);
 BA.debugLineNum = 163;BA.debugLine="fasilitas_array = parser.NextArray";
Debug.ShouldStop(4);
_fasilitas_array = _parser.runMethod(false,"NextArray");Debug.locals.put("fasilitas_array", _fasilitas_array);
 BA.debugLineNum = 164;BA.debugLine="For i=0 To fasilitas_array.Size - 1";
Debug.ShouldStop(8);
{
final int step25 = 1;
final int limit25 = RemoteObject.solve(new RemoteObject[] {_fasilitas_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25) ;_i = ((int)(0 + _i + step25))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 165;BA.debugLine="Dim a As Map";
Debug.ShouldStop(16);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 166;BA.debugLine="a = fasilitas_array.Get(i)";
Debug.ShouldStop(32);
_a.setObject(_fasilitas_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 168;BA.debugLine="Dim content As String = a.Get(\"name_of_facili";
Debug.ShouldStop(128);
_content = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_facility")))));Debug.locals.put("content", _content);Debug.locals.put("content", _content);
 BA.debugLineNum = 169;BA.debugLine="Dim quantity As Int = a.Get(\"quantity_of_faci";
Debug.ShouldStop(256);
_quantity = BA.numberCast(int.class, _a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("quantity_of_facilities")))));Debug.locals.put("quantity", _quantity);Debug.locals.put("quantity", _quantity);
 BA.debugLineNum = 170;BA.debugLine="CLV1.Add(CreateItem(CLV1.AsView.Width, $\"${qu";
Debug.ShouldStop(512);
worshipedit.mostCurrent._clv1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(worshipedit.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"getWidth"),(RemoteObject.concat(RemoteObject.createImmutable(""),worshipedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_quantity))),RemoteObject.createImmutable(""))),_content).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 171;BA.debugLine="CLV1.AsView.Height = ListItem.Height*(i+1)";
Debug.ShouldStop(1024);
worshipedit.mostCurrent._clv1.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {worshipedit.mostCurrent._listitem.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))}, "*",0, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 176;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32768);
worshipedit.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 2: {
 BA.debugLineNum = 179;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam";
Debug.ShouldStop(262144);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 180;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(524288);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 181;BA.debugLine="Dim data_array As List";
Debug.ShouldStop(1048576);
_data_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 182;BA.debugLine="data_array = parser.NextArray";
Debug.ShouldStop(2097152);
_data_array = _parser.runMethod(false,"NextArray");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 183;BA.debugLine="For i=0 To data_array.Size -1";
Debug.ShouldStop(4194304);
{
final int step39 = 1;
final int limit39 = RemoteObject.solve(new RemoteObject[] {_data_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step39 > 0 && _i <= limit39) || (step39 < 0 && _i >= limit39) ;_i = ((int)(0 + _i + step39))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 184;BA.debugLine="Dim a As Map";
Debug.ShouldStop(8388608);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 185;BA.debugLine="a = data_array.Get(i)";
Debug.ShouldStop(16777216);
_a.setObject(_data_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 186;BA.debugLine="lat = a.Get(\"latitude\")";
Debug.ShouldStop(33554432);
worshipedit._lat = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("latitude")))));
 BA.debugLineNum = 187;BA.debugLine="lng = a.Get(\"longitude\")";
Debug.ShouldStop(67108864);
worshipedit._lng = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("longitude")))));
 BA.debugLineNum = 188;BA.debugLine="Log(lat)";
Debug.ShouldStop(134217728);
worshipedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(worshipedit._lat));
 BA.debugLineNum = 189;BA.debugLine="Log(lng)";
Debug.ShouldStop(268435456);
worshipedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(worshipedit._lng));
 BA.debugLineNum = 190;BA.debugLine="WorshipName.Text = a.Get(\"name_of_worship_bui";
Debug.ShouldStop(536870912);
worshipedit.mostCurrent._worshipname.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_worship_building"))))));
 BA.debugLineNum = 191;BA.debugLine="tipp = a.Get(\"type_of_worship\")";
Debug.ShouldStop(1073741824);
worshipedit._tipp = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_of_worship")))));
 BA.debugLineNum = 192;BA.debugLine="tipname = a.Get(\"typewor\")";
Debug.ShouldStop(-2147483648);
worshipedit._tipname = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("typewor")))));
 BA.debugLineNum = 193;BA.debugLine="StandingYear.Text = a.Get(\"standing_year\")";
Debug.ShouldStop(1);
worshipedit.mostCurrent._standingyear.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("standing_year"))))));
 BA.debugLineNum = 194;BA.debugLine="BuildingArea.Text = a.Get(\"building_area\")";
Debug.ShouldStop(2);
worshipedit.mostCurrent._buildingarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("building_area"))))));
 BA.debugLineNum = 195;BA.debugLine="LandArea.Text = a.Get(\"land_area\")";
Debug.ShouldStop(4);
worshipedit.mostCurrent._landarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("land_area"))))));
 BA.debugLineNum = 196;BA.debugLine="ParkingArea.Text = a.Get(\"parking_area\")";
Debug.ShouldStop(8);
worshipedit.mostCurrent._parkingarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parking_area"))))));
 BA.debugLineNum = 197;BA.debugLine="Electricity.Text = a.Get(\"electricity_capacit";
Debug.ShouldStop(16);
worshipedit.mostCurrent._electricity.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("electricity_capacity"))))));
 BA.debugLineNum = 198;BA.debugLine="cons = a.Get(\"type_of_construction\")";
Debug.ShouldStop(32);
worshipedit._cons = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_of_construction")))));
 BA.debugLineNum = 199;BA.debugLine="consname = a.Get(\"constr\")";
Debug.ShouldStop(64);
worshipedit._consname = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("constr")))));
 BA.debugLineNum = 200;BA.debugLine="Log(\"Data :\"&cons)";
Debug.ShouldStop(128);
worshipedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Data :"),worshipedit._cons)));
 BA.debugLineNum = 201;BA.debugLine="nama= WorshipName.Text";
Debug.ShouldStop(256);
worshipedit._nama = worshipedit.mostCurrent._worshipname.runMethod(true,"getText");
 BA.debugLineNum = 202;BA.debugLine="tahun= StandingYear.Text";
Debug.ShouldStop(512);
worshipedit._tahun = worshipedit.mostCurrent._standingyear.runMethod(true,"getText");
 BA.debugLineNum = 203;BA.debugLine="ltanah= LandArea.Text";
Debug.ShouldStop(1024);
worshipedit._ltanah = worshipedit.mostCurrent._landarea.runMethod(true,"getText");
 BA.debugLineNum = 204;BA.debugLine="lparkir= ParkingArea.Text";
Debug.ShouldStop(2048);
worshipedit._lparkir = worshipedit.mostCurrent._parkingarea.runMethod(true,"getText");
 BA.debugLineNum = 205;BA.debugLine="lbangunan= BuildingArea.Text";
Debug.ShouldStop(4096);
worshipedit._lbangunan = worshipedit.mostCurrent._buildingarea.runMethod(true,"getText");
 BA.debugLineNum = 206;BA.debugLine="listrik= Electricity.Text";
Debug.ShouldStop(8192);
worshipedit._listrik = worshipedit.mostCurrent._electricity.runMethod(true,"getText");
 }
}Debug.locals.put("i", _i);
;
 break; }
case 3: {
 BA.debugLineNum = 210;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(131072);
worshipedit.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 211;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 212;BA.debugLine="Msgbox(\"Data has been updated! :)\",\"Success\")";
Debug.ShouldStop(524288);
worshipedit.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Data has been updated! :)")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Success"))),worshipedit.mostCurrent.activityBA);
 BA.debugLineNum = 213;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
worshipedit.mostCurrent._activity.runVoidMethod ("Finish");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e70) {
			BA.rdebugUtils.runVoidMethod("setLastException",worshipedit.processBA, e70.toString()); BA.debugLineNum = 215;BA.debugLine="Msgbox(\"Data can not be updated :(\" , \"error\"";
Debug.ShouldStop(4194304);
worshipedit.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Data can not be updated :(")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("error"))),worshipedit.mostCurrent.activityBA);
 };
 break; }
case 4: {
 BA.debugLineNum = 219;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam";
Debug.ShouldStop(67108864);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 220;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(134217728);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 221;BA.debugLine="Dim type_array As List";
Debug.ShouldStop(268435456);
_type_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("type_array", _type_array);
 BA.debugLineNum = 222;BA.debugLine="type_array = parser.NextArray";
Debug.ShouldStop(536870912);
_type_array = _parser.runMethod(false,"NextArray");Debug.locals.put("type_array", _type_array);
 BA.debugLineNum = 223;BA.debugLine="For i=0 To type_array.Size -1";
Debug.ShouldStop(1073741824);
{
final int step77 = 1;
final int limit77 = RemoteObject.solve(new RemoteObject[] {_type_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step77 > 0 && _i <= limit77) || (step77 < 0 && _i >= limit77) ;_i = ((int)(0 + _i + step77))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 224;BA.debugLine="Dim a As Map";
Debug.ShouldStop(-2147483648);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 225;BA.debugLine="a = type_array.Get(i)";
Debug.ShouldStop(1);
_a.setObject(_type_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 226;BA.debugLine="Dim namatype, idtype As String";
Debug.ShouldStop(2);
_namatype = RemoteObject.createImmutable("");Debug.locals.put("namatype", _namatype);
_idtype = RemoteObject.createImmutable("");Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 227;BA.debugLine="namatype= a.Get(\"name_of_type\")";
Debug.ShouldStop(4);
_namatype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_type")))));Debug.locals.put("namatype", _namatype);
 BA.debugLineNum = 228;BA.debugLine="idtype = a.Get(\"type_id\")";
Debug.ShouldStop(8);
_idtype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_id")))));Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 229;BA.debugLine="TypeOfWorship.Add(namatype)";
Debug.ShouldStop(16);
worshipedit.mostCurrent._typeofworship.runVoidMethod ("Add",(Object)(_namatype));
 BA.debugLineNum = 230;BA.debugLine="WorshipMap.Put(namatype,idtype)";
Debug.ShouldStop(32);
worshipedit.mostCurrent._worshipmap.runVoidMethod ("Put",(Object)((_namatype)),(Object)((_idtype)));
 BA.debugLineNum = 231;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
Debug.ShouldStop(64);
worshipedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ID Map: "),_namatype,RemoteObject.createImmutable(" "),_idtype)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 233;BA.debugLine="TypeOfWorship.SelectedIndex = TypeOfWorship.In";
Debug.ShouldStop(256);
worshipedit.mostCurrent._typeofworship.runMethod(true,"setSelectedIndex",worshipedit.mostCurrent._typeofworship.runMethod(true,"IndexOf",(Object)(worshipedit._tipname)));
 break; }
case 5: {
 BA.debugLineNum = 236;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam";
Debug.ShouldStop(2048);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 237;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(4096);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 238;BA.debugLine="Dim cons_array As List";
Debug.ShouldStop(8192);
_cons_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("cons_array", _cons_array);
 BA.debugLineNum = 239;BA.debugLine="cons_array = parser.NextArray";
Debug.ShouldStop(16384);
_cons_array = _parser.runMethod(false,"NextArray");Debug.locals.put("cons_array", _cons_array);
 BA.debugLineNum = 240;BA.debugLine="For j=0 To cons_array.Size -1";
Debug.ShouldStop(32768);
{
final int step93 = 1;
final int limit93 = RemoteObject.solve(new RemoteObject[] {_cons_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step93 > 0 && _j <= limit93) || (step93 < 0 && _j >= limit93) ;_j = ((int)(0 + _j + step93))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 241;BA.debugLine="Dim a As Map";
Debug.ShouldStop(65536);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 242;BA.debugLine="a = cons_array.Get(j)";
Debug.ShouldStop(131072);
_a.setObject(_cons_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _j))));
 BA.debugLineNum = 243;BA.debugLine="Dim nama_type, id_type As String";
Debug.ShouldStop(262144);
_nama_type = RemoteObject.createImmutable("");Debug.locals.put("nama_type", _nama_type);
_id_type = RemoteObject.createImmutable("");Debug.locals.put("id_type", _id_type);
 BA.debugLineNum = 244;BA.debugLine="nama_type= a.Get(\"name_of_type\")";
Debug.ShouldStop(524288);
_nama_type = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_type")))));Debug.locals.put("nama_type", _nama_type);
 BA.debugLineNum = 245;BA.debugLine="id_type = a.Get(\"type_id\")";
Debug.ShouldStop(1048576);
_id_type = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_id")))));Debug.locals.put("id_type", _id_type);
 BA.debugLineNum = 247;BA.debugLine="Construction.Add(nama_type)";
Debug.ShouldStop(4194304);
worshipedit.mostCurrent._construction.runVoidMethod ("Add",(Object)(_nama_type));
 BA.debugLineNum = 248;BA.debugLine="ConsMap.Put(nama_type,id_type)";
Debug.ShouldStop(8388608);
worshipedit.mostCurrent._consmap.runVoidMethod ("Put",(Object)((_nama_type)),(Object)((_id_type)));
 BA.debugLineNum = 249;BA.debugLine="Log(\"ID Map: \"&nama_type&\" \"&id_type)";
Debug.ShouldStop(16777216);
worshipedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ID Map: "),_nama_type,RemoteObject.createImmutable(" "),_id_type)));
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 251;BA.debugLine="Construction.SelectedIndex = Construction.Inde";
Debug.ShouldStop(67108864);
worshipedit.mostCurrent._construction.runMethod(true,"setSelectedIndex",worshipedit.mostCurrent._construction.runMethod(true,"IndexOf",(Object)(worshipedit._consname)));
 break; }
}
;
 };
 BA.debugLineNum = 254;BA.debugLine="Job.Release";
Debug.ShouldStop(536870912);
_job.runVoidMethod ("_release");
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
worshipedit._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim fasilitas, lat, lng As String";
worshipedit._fasilitas = RemoteObject.createImmutable("");
worshipedit._lat = RemoteObject.createImmutable("");
worshipedit._lng = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim quantity_fac As Int";
worshipedit._quantity_fac = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 12;BA.debugLine="Dim ids As String";
worshipedit._ids = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="ids = \"\"";
worshipedit._ids = BA.ObjectToString("");
 //BA.debugLineNum = 14;BA.debugLine="Dim nama,tipe, jenis, tahun,ltanah,lparkir,lbangu";
worshipedit._nama = RemoteObject.createImmutable("");
worshipedit._tipe = RemoteObject.createImmutable("");
worshipedit._jenis = RemoteObject.createImmutable("");
worshipedit._tahun = RemoteObject.createImmutable("");
worshipedit._ltanah = RemoteObject.createImmutable("");
worshipedit._lparkir = RemoteObject.createImmutable("");
worshipedit._lbangunan = RemoteObject.createImmutable("");
worshipedit._listrik = RemoteObject.createImmutable("");
worshipedit._kons = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="nama= \"\"";
worshipedit._nama = BA.ObjectToString("");
 //BA.debugLineNum = 16;BA.debugLine="tipe = \"\"";
worshipedit._tipe = BA.ObjectToString("");
 //BA.debugLineNum = 17;BA.debugLine="jenis= \"\"";
worshipedit._jenis = BA.ObjectToString("");
 //BA.debugLineNum = 18;BA.debugLine="Dim tipp,tipname,typeworship,cons,consname,typeco";
worshipedit._tipp = RemoteObject.createImmutable("");
worshipedit._tipname = RemoteObject.createImmutable("");
worshipedit._typeworship = RemoteObject.createImmutable("");
worshipedit._cons = RemoteObject.createImmutable("");
worshipedit._consname = RemoteObject.createImmutable("");
worshipedit._typecons = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Dim tipe_i , jenis_i, lbangunan_i, lparkir_i,ltan";
worshipedit._tipe_i = RemoteObject.createImmutable(0);
worshipedit._jenis_i = RemoteObject.createImmutable(0);
worshipedit._lbangunan_i = RemoteObject.createImmutable(0);
worshipedit._lparkir_i = RemoteObject.createImmutable(0);
worshipedit._ltanah_i = RemoteObject.createImmutable(0);
worshipedit._listrik_i = RemoteObject.createImmutable(0);
worshipedit._tahun_i = RemoteObject.createImmutable(0);
worshipedit._cons_i = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 20;BA.debugLine="Dim idisi,isi As String";
worshipedit._idisi = RemoteObject.createImmutable("");
worshipedit._isi = RemoteObject.createImmutable("");
 //BA.debugLineNum = 21;BA.debugLine="Dim ArraySize2 As Int";
worshipedit._arraysize2 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setbackgroundtintlist(RemoteObject _view,RemoteObject _active,RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundTintList (worshipedit) ","worshipedit",30,worshipedit.mostCurrent.activityBA,worshipedit.mostCurrent,108);
if (RapidSub.canDelegate("setbackgroundtintlist")) return b4a.example.worshipedit.remoteMe.runUserSub(false, "worshipedit","setbackgroundtintlist", _view, _active, _enabled);
RemoteObject _states = null;
RemoteObject _color = null;
RemoteObject _csl = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("View", _view);
Debug.locals.put("Active", _active);
Debug.locals.put("Enabled", _enabled);
 BA.debugLineNum = 108;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="Dim States(2,1) As Int";
Debug.ShouldStop(4096);
_states = RemoteObject.createNewArray ("int", new int[] {2,1}, new Object[]{});Debug.locals.put("States", _states);
 BA.debugLineNum = 110;BA.debugLine="States(0,0) = 16842908     'Active";
Debug.ShouldStop(8192);
_states.setArrayElement (BA.numberCast(int.class, 16842908),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 111;BA.debugLine="States(1,0) = 16842910    'Enabled";
Debug.ShouldStop(16384);
_states.setArrayElement (BA.numberCast(int.class, 16842910),BA.numberCast(int.class, 1),BA.numberCast(int.class, 0));
 BA.debugLineNum = 112;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
Debug.ShouldStop(32768);
_color = RemoteObject.createNewArray("int",new int[] {2},new Object[] {_active,_enabled});Debug.locals.put("Color", _color);Debug.locals.put("Color", _color);
 BA.debugLineNum = 113;BA.debugLine="Dim CSL As JavaObject";
Debug.ShouldStop(65536);
_csl = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("CSL", _csl);
 BA.debugLineNum = 114;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
Debug.ShouldStop(131072);
_csl.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.content.res.ColorStateList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_states),(_color)})));
 BA.debugLineNum = 115;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(262144);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 116;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
Debug.ShouldStop(524288);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.support.v4.view.ViewCompat")));
 BA.debugLineNum = 117;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
Debug.ShouldStop(1048576);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBackgroundTintList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_view.getObject()),(_csl.getObject())})));
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _typeofworship_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("TypeOfWorship_ItemClick (worshipedit) ","worshipedit",30,worshipedit.mostCurrent.activityBA,worshipedit.mostCurrent,257);
if (RapidSub.canDelegate("typeofworship_itemclick")) return b4a.example.worshipedit.remoteMe.runUserSub(false, "worshipedit","typeofworship_itemclick", _position, _value);
RemoteObject _id = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 257;BA.debugLine="Sub TypeOfWorship_ItemClick (Position As Int, Valu";
Debug.ShouldStop(1);
 BA.debugLineNum = 258;BA.debugLine="Dim id As String";
Debug.ShouldStop(2);
_id = RemoteObject.createImmutable("");Debug.locals.put("id", _id);
 BA.debugLineNum = 259;BA.debugLine="id = WorshipMap.Get(Value)";
Debug.ShouldStop(4);
_id = BA.ObjectToString(worshipedit.mostCurrent._worshipmap.runMethod(false,"Get",(Object)(_value)));Debug.locals.put("id", _id);
 BA.debugLineNum = 260;BA.debugLine="typeworship = id";
Debug.ShouldStop(8);
worshipedit._typeworship = _id;
 BA.debugLineNum = 261;BA.debugLine="Log(typeworship)";
Debug.ShouldStop(16);
worshipedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(worshipedit._typeworship));
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
}