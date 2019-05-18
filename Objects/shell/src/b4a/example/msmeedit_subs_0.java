package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class msmeedit_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (msmeedit) ","msmeedit",35,msmeedit.mostCurrent.activityBA,msmeedit.mostCurrent,46);
if (RapidSub.canDelegate("activity_create")) return b4a.example.msmeedit.remoteMe.runUserSub(false, "msmeedit","activity_create", _firsttime);
RemoteObject _sv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 46;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 49;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(65536);
msmeedit.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),msmeedit.mostCurrent.activityBA);
 BA.debugLineNum = 50;BA.debugLine="ScrollView1.Panel.LoadLayout(\"MsmeEdit\")";
Debug.ShouldStop(131072);
msmeedit.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MsmeEdit")),msmeedit.mostCurrent.activityBA);
 BA.debugLineNum = 51;BA.debugLine="PanelToolBar.Visible = False";
Debug.ShouldStop(262144);
msmeedit.mostCurrent._paneltoolbar.runMethod(true,"setVisible",msmeedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 53;BA.debugLine="SetBackgroundTintList(MsmeName, Colors.ARGB(225,3";
Debug.ShouldStop(1048576);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), msmeedit.mostCurrent._msmename.getObject()),msmeedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),msmeedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 54;BA.debugLine="SetBackgroundTintList(StandingYear, Colors.ARGB(2";
Debug.ShouldStop(2097152);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), msmeedit.mostCurrent._standingyear.getObject()),msmeedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),msmeedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 55;BA.debugLine="SetBackgroundTintList(BuildingArea, Colors.ARGB(2";
Debug.ShouldStop(4194304);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), msmeedit.mostCurrent._buildingarea.getObject()),msmeedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),msmeedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 56;BA.debugLine="SetBackgroundTintList(LandArea, Colors.ARGB(225,3";
Debug.ShouldStop(8388608);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), msmeedit.mostCurrent._landarea.getObject()),msmeedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),msmeedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 57;BA.debugLine="SetBackgroundTintList(Electricity, Colors.ARGB(22";
Debug.ShouldStop(16777216);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), msmeedit.mostCurrent._electricity.getObject()),msmeedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),msmeedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 58;BA.debugLine="SetBackgroundTintList(ParkingArea, Colors.ARGB(22";
Debug.ShouldStop(33554432);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), msmeedit.mostCurrent._parkingarea.getObject()),msmeedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 225)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 230))),msmeedit.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 61;BA.debugLine="BackArrow.Visible= True";
Debug.ShouldStop(268435456);
msmeedit.mostCurrent._backarrow.runMethod(true,"setVisible",msmeedit.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 62;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(536870912);
msmeedit.mostCurrent._backarrow.runVoidMethod ("SetBackgroundImageNew",(Object)((msmeedit.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(msmeedit.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("back-arrow.png"))).getObject())));
 BA.debugLineNum = 63;BA.debugLine="TitleBar.Text=\"Edit Detail\"";
Debug.ShouldStop(1073741824);
msmeedit.mostCurrent._titlebar.runMethod(true,"setText",BA.ObjectToCharSequence("Edit Detail"));
 BA.debugLineNum = 65;BA.debugLine="If MsmeBuilding.nameBuilding.Length > 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",msmeedit.mostCurrent._msmebuilding._namebuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 66;BA.debugLine="MsmeName.Text = MsmeBuilding.nameBuilding";
Debug.ShouldStop(2);
msmeedit.mostCurrent._msmename.runMethod(true,"setText",BA.ObjectToCharSequence(msmeedit.mostCurrent._msmebuilding._namebuilding));
 BA.debugLineNum = 67;BA.debugLine="ids = MsmeBuilding.idBuilding";
Debug.ShouldStop(4);
msmeedit._ids = msmeedit.mostCurrent._msmebuilding._idbuilding;
 BA.debugLineNum = 68;BA.debugLine="Log(\"Nama :\"& MsmeName.Text)";
Debug.ShouldStop(8);
msmeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Nama :"),msmeedit.mostCurrent._msmename.runMethod(true,"getText"))));
 }else 
{ BA.debugLineNum = 69;BA.debugLine="Else If SearchBuilding.nameBuilding.Length > 0 Th";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",msmeedit.mostCurrent._searchbuilding._namebuilding.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 70;BA.debugLine="MsmeName.Text = SearchBuilding.nameBuilding";
Debug.ShouldStop(32);
msmeedit.mostCurrent._msmename.runMethod(true,"setText",BA.ObjectToCharSequence(msmeedit.mostCurrent._searchbuilding._namebuilding));
 BA.debugLineNum = 71;BA.debugLine="ids = SearchBuilding.idBuilding";
Debug.ShouldStop(64);
msmeedit._ids = msmeedit.mostCurrent._searchbuilding._idbuilding;
 BA.debugLineNum = 72;BA.debugLine="Log(\"Nama :\"&ids)";
Debug.ShouldStop(128);
msmeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Nama :"),msmeedit._ids)));
 }else {
 BA.debugLineNum = 74;BA.debugLine="MsmeName.Text = \"Please press on the button and";
Debug.ShouldStop(512);
msmeedit.mostCurrent._msmename.runMethod(true,"setText",BA.ObjectToCharSequence("Please press on the button and choose an item."));
 }}
;
 BA.debugLineNum = 77;BA.debugLine="Dim sv As ScrollView";
Debug.ShouldStop(4096);
_sv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");Debug.locals.put("sv", _sv);
 BA.debugLineNum = 78;BA.debugLine="ScrollView1.Height=100%y";
Debug.ShouldStop(8192);
msmeedit.mostCurrent._scrollview1.runMethod(true,"setHeight",msmeedit.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),msmeedit.mostCurrent.activityBA));
 BA.debugLineNum = 79;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
Debug.ShouldStop(16384);
msmeedit.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",msmeedit.mostCurrent._panelbuildinglist.runMethod(true,"getHeight"));
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
		Debug.PushSubsStack("Activity_Pause (msmeedit) ","msmeedit",35,msmeedit.mostCurrent.activityBA,msmeedit.mostCurrent,92);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.msmeedit.remoteMe.runUserSub(false, "msmeedit","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 92;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Resume (msmeedit) ","msmeedit",35,msmeedit.mostCurrent.activityBA,msmeedit.mostCurrent,82);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.msmeedit.remoteMe.runUserSub(false, "msmeedit","activity_resume");
 BA.debugLineNum = 82;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="MsmeMap.Initialize";
Debug.ShouldStop(262144);
msmeedit.mostCurrent._msmemap.runVoidMethod ("Initialize");
 BA.debugLineNum = 84;BA.debugLine="ConsMap.Initialize";
Debug.ShouldStop(524288);
msmeedit.mostCurrent._consmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 85;BA.debugLine="MsmeMap.Clear";
Debug.ShouldStop(1048576);
msmeedit.mostCurrent._msmemap.runVoidMethod ("Clear");
 BA.debugLineNum = 86;BA.debugLine="ConsMap.Clear";
Debug.ShouldStop(2097152);
msmeedit.mostCurrent._consmap.runVoidMethod ("Clear");
 BA.debugLineNum = 87;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_type";
Debug.ShouldStop(4194304);
_executeremotequery(BA.ObjectToString("SELECT type_id, name_of_type FROM type_of_construction ORDER BY name_of_type ASC "),RemoteObject.createImmutable("Construction"));
 BA.debugLineNum = 88;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_type";
Debug.ShouldStop(8388608);
_executeremotequery(BA.ObjectToString("SELECT type_id, name_of_type FROM type_of_msme ORDER BY name_of_type ASC"),RemoteObject.createImmutable("TypeMsme"));
 BA.debugLineNum = 89;BA.debugLine="ExecuteRemoteQuery(\"SELECT M.msme_building_id, M.";
Debug.ShouldStop(16777216);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT M.msme_building_id, M.name_of_msme_building, M.building_area, M.land_area, M.parking_area, M.standing_year, M.electricity_capacity, M.address, M.type_of_construction, M.type_of_msme, M.owner_name, M.number_of_employee, M.monthly_income, M.contact_person, ST_X(ST_Centroid(M.geom)) As longitude, ST_Y(ST_CENTROID(M.geom)) As latitude,T.name_of_type As constr, J.name_of_type As typems, ST_AsText(geom) As geom FROM msme_building As M LEFT JOIN type_of_construction As T ON M.type_of_construction=T.type_id LEFT JOIN type_of_msme As J ON M.type_of_msme=J.type_id WHERE M.msme_building_id='"),msmeedit._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("DATA"));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("btnGallery_Click (msmeedit) ","msmeedit",35,msmeedit.mostCurrent.activityBA,msmeedit.mostCurrent,211);
if (RapidSub.canDelegate("btngallery_click")) return b4a.example.msmeedit.remoteMe.runUserSub(false, "msmeedit","btngallery_click");
 BA.debugLineNum = 211;BA.debugLine="Sub btnGallery_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("BtnSaveChanges_Click (msmeedit) ","msmeedit",35,msmeedit.mostCurrent.activityBA,msmeedit.mostCurrent,229);
if (RapidSub.canDelegate("btnsavechanges_click")) return b4a.example.msmeedit.remoteMe.runUserSub(false, "msmeedit","btnsavechanges_click");
 BA.debugLineNum = 229;BA.debugLine="Sub BtnSaveChanges_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 230;BA.debugLine="Log(ids)";
Debug.ShouldStop(32);
msmeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(msmeedit._ids));
 BA.debugLineNum = 231;BA.debugLine="If typemsme == \"\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",msmeedit._typemsme,BA.ObjectToString(""))) { 
 BA.debugLineNum = 232;BA.debugLine="tipe_i = tipp";
Debug.ShouldStop(128);
msmeedit._tipe_i = BA.numberCast(int.class, msmeedit._tipp);
 }else {
 BA.debugLineNum = 234;BA.debugLine="tipe_i = typemsme";
Debug.ShouldStop(512);
msmeedit._tipe_i = BA.numberCast(int.class, msmeedit._typemsme);
 };
 BA.debugLineNum = 237;BA.debugLine="lbangunan_i = BuildingArea.Text";
Debug.ShouldStop(4096);
msmeedit._lbangunan_i = BA.numberCast(int.class, msmeedit.mostCurrent._buildingarea.runMethod(true,"getText"));
 BA.debugLineNum = 238;BA.debugLine="lparkir_i = ParkingArea.Text";
Debug.ShouldStop(8192);
msmeedit._lparkir_i = BA.numberCast(int.class, msmeedit.mostCurrent._parkingarea.runMethod(true,"getText"));
 BA.debugLineNum = 239;BA.debugLine="ltanah_i = LandArea.Text";
Debug.ShouldStop(16384);
msmeedit._ltanah_i = BA.numberCast(int.class, msmeedit.mostCurrent._landarea.runMethod(true,"getText"));
 BA.debugLineNum = 240;BA.debugLine="listrik_i = Electricity.Text";
Debug.ShouldStop(32768);
msmeedit._listrik_i = BA.numberCast(int.class, msmeedit.mostCurrent._electricity.runMethod(true,"getText"));
 BA.debugLineNum = 241;BA.debugLine="tahun_i = StandingYear.Text";
Debug.ShouldStop(65536);
msmeedit._tahun_i = BA.numberCast(int.class, msmeedit.mostCurrent._standingyear.runMethod(true,"getText"));
 BA.debugLineNum = 243;BA.debugLine="If typecons == \"\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",msmeedit._typecons,BA.ObjectToString(""))) { 
 BA.debugLineNum = 244;BA.debugLine="cons_i = cons";
Debug.ShouldStop(524288);
msmeedit._cons_i = BA.numberCast(int.class, msmeedit._cons);
 }else {
 BA.debugLineNum = 246;BA.debugLine="cons_i = typecons";
Debug.ShouldStop(2097152);
msmeedit._cons_i = BA.numberCast(int.class, msmeedit._typecons);
 };
 BA.debugLineNum = 249;BA.debugLine="Log(tipe_i)";
Debug.ShouldStop(16777216);
msmeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(msmeedit._tipe_i)));
 BA.debugLineNum = 250;BA.debugLine="Log(cons_i)";
Debug.ShouldStop(33554432);
msmeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(msmeedit._cons_i)));
 BA.debugLineNum = 251;BA.debugLine="If IsNumber(tipe_i) Then";
Debug.ShouldStop(67108864);
if (msmeedit.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(BA.NumberToString(msmeedit._tipe_i))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 252;BA.debugLine="Log(\"\"&tipe_i&\" is a number\")";
Debug.ShouldStop(134217728);
msmeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),msmeedit._tipe_i,RemoteObject.createImmutable(" is a number"))));
 }else {
 BA.debugLineNum = 254;BA.debugLine="Log(\"\"&tipe_i&\" is not a number\")";
Debug.ShouldStop(536870912);
msmeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),msmeedit._tipe_i,RemoteObject.createImmutable(" is not a number"))));
 };
 BA.debugLineNum = 256;BA.debugLine="ProgressDialogShow(\"loading...\")";
Debug.ShouldStop(-2147483648);
msmeedit.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",msmeedit.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("loading..."))));
 BA.debugLineNum = 257;BA.debugLine="ExecuteRemoteQuery(\"UPDATE msme_building SET name";
Debug.ShouldStop(1);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("UPDATE msme_building SET name_of_msme_building = '"),msmeedit._nama,RemoteObject.createImmutable("', type_of_msme = "),msmeedit._tipe_i,RemoteObject.createImmutable(", building_area = "),msmeedit._lbangunan_i,RemoteObject.createImmutable(", land_area = "),msmeedit._ltanah_i,RemoteObject.createImmutable(", parking_area = "),msmeedit._lparkir_i,RemoteObject.createImmutable(", standing_year = '"),msmeedit._tahun_i,RemoteObject.createImmutable("', electricity_capacity = "),msmeedit._listrik_i,RemoteObject.createImmutable(", type_of_construction = "),msmeedit._cons_i,RemoteObject.createImmutable(" WHERE msme_building_id = '"),msmeedit._ids,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("Update"));
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
		Debug.PushSubsStack("Construction_ItemClick (msmeedit) ","msmeedit",35,msmeedit.mostCurrent.activityBA,msmeedit.mostCurrent,222);
if (RapidSub.canDelegate("construction_itemclick")) return b4a.example.msmeedit.remoteMe.runUserSub(false, "msmeedit","construction_itemclick", _position, _value);
RemoteObject _idc = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 222;BA.debugLine="Sub Construction_ItemClick (Position As Int, Value";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 223;BA.debugLine="Dim idc As String";
Debug.ShouldStop(1073741824);
_idc = RemoteObject.createImmutable("");Debug.locals.put("idc", _idc);
 BA.debugLineNum = 224;BA.debugLine="idc = ConsMap.Get(Value)";
Debug.ShouldStop(-2147483648);
_idc = BA.ObjectToString(msmeedit.mostCurrent._consmap.runMethod(false,"Get",(Object)(_value)));Debug.locals.put("idc", _idc);
 BA.debugLineNum = 225;BA.debugLine="typecons = idc";
Debug.ShouldStop(1);
msmeedit._typecons = _idc;
 BA.debugLineNum = 226;BA.debugLine="Log(typecons)";
Debug.ShouldStop(2);
msmeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(msmeedit._typecons));
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("ExecuteRemoteQuery (msmeedit) ","msmeedit",35,msmeedit.mostCurrent.activityBA,msmeedit.mostCurrent,108);
if (RapidSub.canDelegate("executeremotequery")) return b4a.example.msmeedit.remoteMe.runUserSub(false, "msmeedit","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 108;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(4096);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 110;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(8192);
_job.runVoidMethod ("_initialize",msmeedit.processBA,(Object)(_jobname),(Object)(msmeedit.getObject()));
 BA.debugLineNum = 111;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
Debug.ShouldStop(16384);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),msmeedit.mostCurrent._main._server,RemoteObject.createImmutable("mobile/json.php"))),(Object)(_query));
 BA.debugLineNum = 112;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 22;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Private ScrollView1 As ScrollView";
msmeedit.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private TitleBar As Label";
msmeedit.mostCurrent._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private BackArrow As Label";
msmeedit.mostCurrent._backarrow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private PanelBuildingList As Panel";
msmeedit.mostCurrent._panelbuildinglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Dim MsmeName As Label";
msmeedit.mostCurrent._msmename = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private TypeOfMsme As Spinner";
msmeedit.mostCurrent._typeofmsme = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private StandingYear As Label";
msmeedit.mostCurrent._standingyear = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private BuildingArea As Label";
msmeedit.mostCurrent._buildingarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private LandArea As Label";
msmeedit.mostCurrent._landarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private ParkingArea As Label";
msmeedit.mostCurrent._parkingarea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private Electricity As Label";
msmeedit.mostCurrent._electricity = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private Construction As Spinner";
msmeedit.mostCurrent._construction = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private PanelToolBar As Panel";
msmeedit.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Dim ids As String";
msmeedit._ids = RemoteObject.createImmutable("");
 //BA.debugLineNum = 41;BA.debugLine="Private LblEdit As Label";
msmeedit.mostCurrent._lbledit = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Dim MsmeMap As Map";
msmeedit.mostCurrent._msmemap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 43;BA.debugLine="Dim ConsMap As Map";
msmeedit.mostCurrent._consmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (msmeedit) ","msmeedit",35,msmeedit.mostCurrent.activityBA,msmeedit.mostCurrent,114);
if (RapidSub.canDelegate("jobdone")) return b4a.example.msmeedit.remoteMe.runUserSub(false, "msmeedit","jobdone", _job);
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
 BA.debugLineNum = 114;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(262144);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 116;BA.debugLine="Dim res As String";
Debug.ShouldStop(524288);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 117;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(1048576);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 118;BA.debugLine="Log(\"Response from server :\"& res)";
Debug.ShouldStop(2097152);
msmeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 119;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(4194304);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 120;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(8388608);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 121;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(16777216);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("DATA"),BA.ObjectToString("Update"),BA.ObjectToString("TypeMsme"),BA.ObjectToString("Construction"))) {
case 0: {
 BA.debugLineNum = 123;BA.debugLine="Dim data_array As List";
Debug.ShouldStop(67108864);
_data_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 124;BA.debugLine="data_array = parser.NextArray";
Debug.ShouldStop(134217728);
_data_array = _parser.runMethod(false,"NextArray");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 125;BA.debugLine="For i=0 To data_array.Size -1";
Debug.ShouldStop(268435456);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_data_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 126;BA.debugLine="Dim a As Map";
Debug.ShouldStop(536870912);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 127;BA.debugLine="a = data_array.Get(i)";
Debug.ShouldStop(1073741824);
_a.setObject(_data_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 128;BA.debugLine="lat = a.Get(\"latitude\")";
Debug.ShouldStop(-2147483648);
msmeedit._lat = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("latitude")))));
 BA.debugLineNum = 129;BA.debugLine="lng = a.Get(\"longitude\")";
Debug.ShouldStop(1);
msmeedit._lng = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("longitude")))));
 BA.debugLineNum = 130;BA.debugLine="Log(lat)";
Debug.ShouldStop(2);
msmeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(msmeedit._lat));
 BA.debugLineNum = 131;BA.debugLine="Log(lng)";
Debug.ShouldStop(4);
msmeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(msmeedit._lng));
 BA.debugLineNum = 132;BA.debugLine="MsmeName.Text = a.Get(\"name_of_msme_building\"";
Debug.ShouldStop(8);
msmeedit.mostCurrent._msmename.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_msme_building"))))));
 BA.debugLineNum = 133;BA.debugLine="tipp = a.Get(\"type_of_msme\")";
Debug.ShouldStop(16);
msmeedit._tipp = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_of_msme")))));
 BA.debugLineNum = 134;BA.debugLine="tipname = a.Get(\"typems\")";
Debug.ShouldStop(32);
msmeedit._tipname = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("typems")))));
 BA.debugLineNum = 136;BA.debugLine="StandingYear.Text = a.Get(\"standing_year\")";
Debug.ShouldStop(128);
msmeedit.mostCurrent._standingyear.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("standing_year"))))));
 BA.debugLineNum = 137;BA.debugLine="BuildingArea.Text = a.Get(\"building_area\")";
Debug.ShouldStop(256);
msmeedit.mostCurrent._buildingarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("building_area"))))));
 BA.debugLineNum = 138;BA.debugLine="LandArea.Text = a.Get(\"land_area\")";
Debug.ShouldStop(512);
msmeedit.mostCurrent._landarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("land_area"))))));
 BA.debugLineNum = 139;BA.debugLine="ParkingArea.Text = a.Get(\"parking_area\")";
Debug.ShouldStop(1024);
msmeedit.mostCurrent._parkingarea.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parking_area"))))));
 BA.debugLineNum = 140;BA.debugLine="Electricity.Text = a.Get(\"electricity_capacit";
Debug.ShouldStop(2048);
msmeedit.mostCurrent._electricity.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("electricity_capacity"))))));
 BA.debugLineNum = 141;BA.debugLine="cons = a.Get(\"type_of_construction\")";
Debug.ShouldStop(4096);
msmeedit._cons = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_of_construction")))));
 BA.debugLineNum = 142;BA.debugLine="consname = a.Get(\"constr\")";
Debug.ShouldStop(8192);
msmeedit._consname = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("constr")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 144;BA.debugLine="If StandingYear.Text == \"null\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",msmeedit.mostCurrent._standingyear.runMethod(true,"getText"),BA.ObjectToString("null"))) { 
 BA.debugLineNum = 145;BA.debugLine="StandingYear.Text = \"0\"";
Debug.ShouldStop(65536);
msmeedit.mostCurrent._standingyear.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 };
 BA.debugLineNum = 147;BA.debugLine="If BuildingArea.Text == \"null\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",msmeedit.mostCurrent._buildingarea.runMethod(true,"getText"),BA.ObjectToString("null"))) { 
 BA.debugLineNum = 148;BA.debugLine="BuildingArea.Text = \"0\"";
Debug.ShouldStop(524288);
msmeedit.mostCurrent._buildingarea.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 };
 BA.debugLineNum = 150;BA.debugLine="If ParkingArea.Text == \"null\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",msmeedit.mostCurrent._parkingarea.runMethod(true,"getText"),BA.ObjectToString("null"))) { 
 BA.debugLineNum = 151;BA.debugLine="ParkingArea.Text = \"0\"";
Debug.ShouldStop(4194304);
msmeedit.mostCurrent._parkingarea.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 };
 BA.debugLineNum = 153;BA.debugLine="If Electricity.Text == \"null\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",msmeedit.mostCurrent._electricity.runMethod(true,"getText"),BA.ObjectToString("null"))) { 
 BA.debugLineNum = 154;BA.debugLine="Electricity.Text = \"0\"";
Debug.ShouldStop(33554432);
msmeedit.mostCurrent._electricity.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 };
 BA.debugLineNum = 156;BA.debugLine="If LandArea.Text == \"null\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",msmeedit.mostCurrent._landarea.runMethod(true,"getText"),BA.ObjectToString("null"))) { 
 BA.debugLineNum = 157;BA.debugLine="LandArea.Text = \"0\"";
Debug.ShouldStop(268435456);
msmeedit.mostCurrent._landarea.runMethod(true,"setText",BA.ObjectToCharSequence("0"));
 };
 BA.debugLineNum = 159;BA.debugLine="Log(\"Data jenis :\"&tipname)";
Debug.ShouldStop(1073741824);
msmeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Data jenis :"),msmeedit._tipname)));
 BA.debugLineNum = 160;BA.debugLine="Log(\"Data konstruksi :\"&consname)";
Debug.ShouldStop(-2147483648);
msmeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Data konstruksi :"),msmeedit._consname)));
 BA.debugLineNum = 161;BA.debugLine="nama=MsmeName.Text";
Debug.ShouldStop(1);
msmeedit._nama = msmeedit.mostCurrent._msmename.runMethod(true,"getText");
 BA.debugLineNum = 162;BA.debugLine="tahun= StandingYear.Text";
Debug.ShouldStop(2);
msmeedit._tahun = msmeedit.mostCurrent._standingyear.runMethod(true,"getText");
 BA.debugLineNum = 163;BA.debugLine="ltanah= LandArea.Text";
Debug.ShouldStop(4);
msmeedit._ltanah = msmeedit.mostCurrent._landarea.runMethod(true,"getText");
 BA.debugLineNum = 164;BA.debugLine="lparkir= ParkingArea.Text";
Debug.ShouldStop(8);
msmeedit._lparkir = msmeedit.mostCurrent._parkingarea.runMethod(true,"getText");
 BA.debugLineNum = 165;BA.debugLine="lbangunan= BuildingArea.Text";
Debug.ShouldStop(16);
msmeedit._lbangunan = msmeedit.mostCurrent._buildingarea.runMethod(true,"getText");
 BA.debugLineNum = 166;BA.debugLine="listrik= Electricity.Text";
Debug.ShouldStop(32);
msmeedit._listrik = msmeedit.mostCurrent._electricity.runMethod(true,"getText");
 BA.debugLineNum = 167;BA.debugLine="TypeOfMsme.SelectedIndex = TypeOfMsme.IndexOf";
Debug.ShouldStop(64);
msmeedit.mostCurrent._typeofmsme.runMethod(true,"setSelectedIndex",msmeedit.mostCurrent._typeofmsme.runMethod(true,"IndexOf",(Object)(msmeedit._tipname)));
 BA.debugLineNum = 168;BA.debugLine="Construction.SelectedIndex = Construction.Ind";
Debug.ShouldStop(128);
msmeedit.mostCurrent._construction.runMethod(true,"setSelectedIndex",msmeedit.mostCurrent._construction.runMethod(true,"IndexOf",(Object)(msmeedit._consname)));
 BA.debugLineNum = 169;BA.debugLine="Log(\"SELECTED CONS : \"&Construction.SelectedI";
Debug.ShouldStop(256);
msmeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECTED CONS : "),msmeedit.mostCurrent._construction.runMethod(true,"getSelectedIndex"))));
 break; }
case 1: {
 BA.debugLineNum = 171;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1024);
msmeedit.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 172;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 173;BA.debugLine="Msgbox(\"Data has been updated! :)\",\"Success\")";
Debug.ShouldStop(4096);
msmeedit.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Data has been updated! :)")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Success"))),msmeedit.mostCurrent.activityBA);
 BA.debugLineNum = 174;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
msmeedit.mostCurrent._activity.runVoidMethod ("Finish");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e61) {
			BA.rdebugUtils.runVoidMethod("setLastException",msmeedit.processBA, e61.toString()); BA.debugLineNum = 176;BA.debugLine="Msgbox(\"Data can not be updated :(\" , \"error\"";
Debug.ShouldStop(32768);
msmeedit.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Data can not be updated :(")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("error"))),msmeedit.mostCurrent.activityBA);
 };
 break; }
case 2: {
 BA.debugLineNum = 180;BA.debugLine="Dim type_array As List";
Debug.ShouldStop(524288);
_type_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("type_array", _type_array);
 BA.debugLineNum = 181;BA.debugLine="type_array = parser.NextArray";
Debug.ShouldStop(1048576);
_type_array = _parser.runMethod(false,"NextArray");Debug.locals.put("type_array", _type_array);
 BA.debugLineNum = 182;BA.debugLine="For i=0 To type_array.Size -1";
Debug.ShouldStop(2097152);
{
final int step66 = 1;
final int limit66 = RemoteObject.solve(new RemoteObject[] {_type_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step66 > 0 && _i <= limit66) || (step66 < 0 && _i >= limit66) ;_i = ((int)(0 + _i + step66))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 183;BA.debugLine="Dim a As Map";
Debug.ShouldStop(4194304);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 184;BA.debugLine="a = type_array.Get(i)";
Debug.ShouldStop(8388608);
_a.setObject(_type_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 185;BA.debugLine="Dim namatype, idtype As String";
Debug.ShouldStop(16777216);
_namatype = RemoteObject.createImmutable("");Debug.locals.put("namatype", _namatype);
_idtype = RemoteObject.createImmutable("");Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 186;BA.debugLine="namatype= a.Get(\"name_of_type\")";
Debug.ShouldStop(33554432);
_namatype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_type")))));Debug.locals.put("namatype", _namatype);
 BA.debugLineNum = 187;BA.debugLine="idtype = a.Get(\"type_id\")";
Debug.ShouldStop(67108864);
_idtype = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_id")))));Debug.locals.put("idtype", _idtype);
 BA.debugLineNum = 188;BA.debugLine="TypeOfMsme.Add(namatype)";
Debug.ShouldStop(134217728);
msmeedit.mostCurrent._typeofmsme.runVoidMethod ("Add",(Object)(_namatype));
 BA.debugLineNum = 189;BA.debugLine="MsmeMap.Put(namatype,idtype)";
Debug.ShouldStop(268435456);
msmeedit.mostCurrent._msmemap.runVoidMethod ("Put",(Object)((_namatype)),(Object)((_idtype)));
 BA.debugLineNum = 190;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
Debug.ShouldStop(536870912);
msmeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ID Map: "),_namatype,RemoteObject.createImmutable(" "),_idtype)));
 }
}Debug.locals.put("i", _i);
;
 break; }
case 3: {
 BA.debugLineNum = 194;BA.debugLine="Dim cons_array As List";
Debug.ShouldStop(2);
_cons_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("cons_array", _cons_array);
 BA.debugLineNum = 195;BA.debugLine="cons_array = parser.NextArray";
Debug.ShouldStop(4);
_cons_array = _parser.runMethod(false,"NextArray");Debug.locals.put("cons_array", _cons_array);
 BA.debugLineNum = 196;BA.debugLine="For j=0 To cons_array.Size -1";
Debug.ShouldStop(8);
{
final int step79 = 1;
final int limit79 = RemoteObject.solve(new RemoteObject[] {_cons_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step79 > 0 && _j <= limit79) || (step79 < 0 && _j >= limit79) ;_j = ((int)(0 + _j + step79))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 197;BA.debugLine="Dim a As Map";
Debug.ShouldStop(16);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 198;BA.debugLine="a = cons_array.Get(j)";
Debug.ShouldStop(32);
_a.setObject(_cons_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _j))));
 BA.debugLineNum = 199;BA.debugLine="Dim nama_type, id_type As String";
Debug.ShouldStop(64);
_nama_type = RemoteObject.createImmutable("");Debug.locals.put("nama_type", _nama_type);
_id_type = RemoteObject.createImmutable("");Debug.locals.put("id_type", _id_type);
 BA.debugLineNum = 200;BA.debugLine="nama_type= a.Get(\"name_of_type\")";
Debug.ShouldStop(128);
_nama_type = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_type")))));Debug.locals.put("nama_type", _nama_type);
 BA.debugLineNum = 201;BA.debugLine="id_type = a.Get(\"type_id\")";
Debug.ShouldStop(256);
_id_type = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type_id")))));Debug.locals.put("id_type", _id_type);
 BA.debugLineNum = 202;BA.debugLine="Construction.Add(nama_type)";
Debug.ShouldStop(512);
msmeedit.mostCurrent._construction.runVoidMethod ("Add",(Object)(_nama_type));
 BA.debugLineNum = 203;BA.debugLine="ConsMap.Put(nama_type,id_type)";
Debug.ShouldStop(1024);
msmeedit.mostCurrent._consmap.runVoidMethod ("Put",(Object)((_nama_type)),(Object)((_id_type)));
 BA.debugLineNum = 204;BA.debugLine="Log(\"ID Map: \"&nama_type&\" \"&id_type)";
Debug.ShouldStop(2048);
msmeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ID Map: "),_nama_type,RemoteObject.createImmutable(" "),_id_type)));
 }
}Debug.locals.put("j", _j);
;
 break; }
}
;
 };
 BA.debugLineNum = 208;BA.debugLine="Job.Release";
Debug.ShouldStop(32768);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
msmeedit._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim fasilitas, lat, lng As String";
msmeedit._fasilitas = RemoteObject.createImmutable("");
msmeedit._lat = RemoteObject.createImmutable("");
msmeedit._lng = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim quantity_fac As Int";
msmeedit._quantity_fac = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 12;BA.debugLine="Dim ids As String";
msmeedit._ids = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="ids = \"\"";
msmeedit._ids = BA.ObjectToString("");
 //BA.debugLineNum = 14;BA.debugLine="Dim nama,tipe, jenis, tahun,ltanah,lparkir,lbangu";
msmeedit._nama = RemoteObject.createImmutable("");
msmeedit._tipe = RemoteObject.createImmutable("");
msmeedit._jenis = RemoteObject.createImmutable("");
msmeedit._tahun = RemoteObject.createImmutable("");
msmeedit._ltanah = RemoteObject.createImmutable("");
msmeedit._lparkir = RemoteObject.createImmutable("");
msmeedit._lbangunan = RemoteObject.createImmutable("");
msmeedit._listrik = RemoteObject.createImmutable("");
msmeedit._kons = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="nama= \"\"";
msmeedit._nama = BA.ObjectToString("");
 //BA.debugLineNum = 16;BA.debugLine="tipe = \"\"";
msmeedit._tipe = BA.ObjectToString("");
 //BA.debugLineNum = 17;BA.debugLine="jenis= \"\"";
msmeedit._jenis = BA.ObjectToString("");
 //BA.debugLineNum = 18;BA.debugLine="Dim tipp,tipname,typemsme,cons,consname,typecons";
msmeedit._tipp = RemoteObject.createImmutable("");
msmeedit._tipname = RemoteObject.createImmutable("");
msmeedit._typemsme = RemoteObject.createImmutable("");
msmeedit._cons = RemoteObject.createImmutable("");
msmeedit._consname = RemoteObject.createImmutable("");
msmeedit._typecons = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Dim tipe_i , jenis_i, lbangunan_i, lparkir_i,ltan";
msmeedit._tipe_i = RemoteObject.createImmutable(0);
msmeedit._jenis_i = RemoteObject.createImmutable(0);
msmeedit._lbangunan_i = RemoteObject.createImmutable(0);
msmeedit._lparkir_i = RemoteObject.createImmutable(0);
msmeedit._ltanah_i = RemoteObject.createImmutable(0);
msmeedit._listrik_i = RemoteObject.createImmutable(0);
msmeedit._tahun_i = RemoteObject.createImmutable(0);
msmeedit._cons_i = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setbackgroundtintlist(RemoteObject _view,RemoteObject _active,RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundTintList (msmeedit) ","msmeedit",35,msmeedit.mostCurrent.activityBA,msmeedit.mostCurrent,96);
if (RapidSub.canDelegate("setbackgroundtintlist")) return b4a.example.msmeedit.remoteMe.runUserSub(false, "msmeedit","setbackgroundtintlist", _view, _active, _enabled);
RemoteObject _states = null;
RemoteObject _color = null;
RemoteObject _csl = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("View", _view);
Debug.locals.put("Active", _active);
Debug.locals.put("Enabled", _enabled);
 BA.debugLineNum = 96;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Dim States(2,1) As Int";
Debug.ShouldStop(1);
_states = RemoteObject.createNewArray ("int", new int[] {2,1}, new Object[]{});Debug.locals.put("States", _states);
 BA.debugLineNum = 98;BA.debugLine="States(0,0) = 16842908     'Active";
Debug.ShouldStop(2);
_states.setArrayElement (BA.numberCast(int.class, 16842908),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 99;BA.debugLine="States(1,0) = 16842910    'Enabled";
Debug.ShouldStop(4);
_states.setArrayElement (BA.numberCast(int.class, 16842910),BA.numberCast(int.class, 1),BA.numberCast(int.class, 0));
 BA.debugLineNum = 100;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
Debug.ShouldStop(8);
_color = RemoteObject.createNewArray("int",new int[] {2},new Object[] {_active,_enabled});Debug.locals.put("Color", _color);Debug.locals.put("Color", _color);
 BA.debugLineNum = 101;BA.debugLine="Dim CSL As JavaObject";
Debug.ShouldStop(16);
_csl = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("CSL", _csl);
 BA.debugLineNum = 102;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
Debug.ShouldStop(32);
_csl.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.content.res.ColorStateList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_states),(_color)})));
 BA.debugLineNum = 103;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(64);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 104;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
Debug.ShouldStop(128);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.support.v4.view.ViewCompat")));
 BA.debugLineNum = 105;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
Debug.ShouldStop(256);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBackgroundTintList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_view.getObject()),(_csl.getObject())})));
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
public static RemoteObject  _typeofmsme_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("TypeOfMsme_ItemClick (msmeedit) ","msmeedit",35,msmeedit.mostCurrent.activityBA,msmeedit.mostCurrent,215);
if (RapidSub.canDelegate("typeofmsme_itemclick")) return b4a.example.msmeedit.remoteMe.runUserSub(false, "msmeedit","typeofmsme_itemclick", _position, _value);
RemoteObject _id = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 215;BA.debugLine="Sub TypeOfMsme_ItemClick (Position As Int, Value A";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 216;BA.debugLine="Dim id As String";
Debug.ShouldStop(8388608);
_id = RemoteObject.createImmutable("");Debug.locals.put("id", _id);
 BA.debugLineNum = 217;BA.debugLine="id = MsmeMap.Get(Value)";
Debug.ShouldStop(16777216);
_id = BA.ObjectToString(msmeedit.mostCurrent._msmemap.runMethod(false,"Get",(Object)(_value)));Debug.locals.put("id", _id);
 BA.debugLineNum = 218;BA.debugLine="typemsme = id";
Debug.ShouldStop(33554432);
msmeedit._typemsme = _id;
 BA.debugLineNum = 219;BA.debugLine="Log(typemsme)";
Debug.ShouldStop(67108864);
msmeedit.mostCurrent.__c.runVoidMethod ("Log",(Object)(msmeedit._typemsme));
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}