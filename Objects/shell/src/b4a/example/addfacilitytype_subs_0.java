package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class addfacilitytype_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (addfacilitytype) ","addfacilitytype",14,addfacilitytype.mostCurrent.activityBA,addfacilitytype.mostCurrent,35);
if (RapidSub.canDelegate("activity_create")) return b4a.example.addfacilitytype.remoteMe.runUserSub(false, "addfacilitytype","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(16);
addfacilitytype.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),addfacilitytype.mostCurrent.activityBA);
 BA.debugLineNum = 38;BA.debugLine="ScrollView1.Panel.LoadLayout(\"AddFacilityType\")";
Debug.ShouldStop(32);
addfacilitytype.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("AddFacilityType")),addfacilitytype.mostCurrent.activityBA);
 BA.debugLineNum = 39;BA.debugLine="ScrollView1.Height = 100%y - (PanelBar.Height + P";
Debug.ShouldStop(64);
addfacilitytype.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {addfacilitytype.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),addfacilitytype.mostCurrent.activityBA),(RemoteObject.solve(new RemoteObject[] {addfacilitytype.mostCurrent._panelbar.runMethod(true,"getHeight"),addfacilitytype.mostCurrent._paneltoolbar.runMethod(true,"getHeight")}, "+",1, 1))}, "-",1, 1));
 BA.debugLineNum = 40;BA.debugLine="PanelAddFacility.Height = ScrollView1.Height";
Debug.ShouldStop(128);
addfacilitytype.mostCurrent._paneladdfacility.runMethod(true,"setHeight",addfacilitytype.mostCurrent._scrollview1.runMethod(true,"getHeight"));
 BA.debugLineNum = 41;BA.debugLine="ScrollView1.panel.Height = PanelAddFacility.Heigh";
Debug.ShouldStop(256);
addfacilitytype.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",addfacilitytype.mostCurrent._paneladdfacility.runMethod(true,"getHeight"));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Activity_Pause (addfacilitytype) ","addfacilitytype",14,addfacilitytype.mostCurrent.activityBA,addfacilitytype.mostCurrent,51);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.addfacilitytype.remoteMe.runUserSub(false, "addfacilitytype","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 51;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Activity_Resume (addfacilitytype) ","addfacilitytype",14,addfacilitytype.mostCurrent.activityBA,addfacilitytype.mostCurrent,46);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.addfacilitytype.remoteMe.runUserSub(false, "addfacilitytype","activity_resume");
 BA.debugLineNum = 46;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="CLVFac.Clear";
Debug.ShouldStop(16384);
addfacilitytype.mostCurrent._clvfac.runVoidMethod ("_clear");
 BA.debugLineNum = 48;BA.debugLine="FunctionAll.ExecuteRemoteQuery(\"SELECT * FROM wor";
Debug.ShouldStop(32768);
addfacilitytype.mostCurrent._functionall.runVoidMethod ("_executeremotequery",addfacilitytype.mostCurrent.activityBA,(Object)(BA.ObjectToString("SELECT * FROM worship_building_facilities ORDER BY name_of_facility ASC")),(Object)(BA.ObjectToString("Worship")),(Object)(addfacilitytype.getObject()));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnadd_click() throws Exception{
try {
		Debug.PushSubsStack("BtnAdd_Click (addfacilitytype) ","addfacilitytype",14,addfacilitytype.mostCurrent.activityBA,addfacilitytype.mostCurrent,172);
if (RapidSub.canDelegate("btnadd_click")) return b4a.example.addfacilitytype.remoteMe.runUserSub(false, "addfacilitytype","btnadd_click");
 BA.debugLineNum = 172;BA.debugLine="Sub BtnAdd_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 173;BA.debugLine="If EditName.Text <> \"\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("!",addfacilitytype.mostCurrent._editname.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 174;BA.debugLine="ProgressDialogShow(\"Adding facility..\")";
Debug.ShouldStop(8192);
addfacilitytype.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",addfacilitytype.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Adding facility.."))));
 BA.debugLineNum = 175;BA.debugLine="FunctionAll.ExecuteRemoteQuery(\"SELECT MAX(facil";
Debug.ShouldStop(16384);
addfacilitytype.mostCurrent._functionall.runVoidMethod ("_executeremotequery",addfacilitytype.mostCurrent.activityBA,(Object)(BA.ObjectToString("SELECT MAX(facility_id) AS id FROM worship_building_facilities")),(Object)(BA.ObjectToString("AddFacility")),(Object)(addfacilitytype.getObject()));
 }else {
 BA.debugLineNum = 177;BA.debugLine="Msgbox(\"Fill the blank\",\"\")";
Debug.ShouldStop(65536);
addfacilitytype.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Fill the blank")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),addfacilitytype.mostCurrent.activityBA);
 };
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btndelete_click() throws Exception{
ResumableSub_btnDelete_Click rsub = new ResumableSub_btnDelete_Click(null);
rsub.resume(null, null);
}
public static class ResumableSub_btnDelete_Click extends BA.ResumableSub {
public ResumableSub_btnDelete_Click(b4a.example.addfacilitytype parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.addfacilitytype parent;
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (addfacilitytype) ","addfacilitytype",14,addfacilitytype.mostCurrent.activityBA,addfacilitytype.mostCurrent,153);
if (RapidSub.canDelegate("btndelete_click")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 154;BA.debugLine="Dim item As Int = CLVFac.GetItemFromView(Sender)";
Debug.ShouldStop(33554432);
_item = parent.mostCurrent._clvfac.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent.__c.runMethod(false,"Sender",addfacilitytype.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 155;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(67108864);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 156;BA.debugLine="p = CLVFac.GetPanel(item)";
Debug.ShouldStop(134217728);
_p = parent.mostCurrent._clvfac.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 157;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(268435456);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 158;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(536870912);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 159;BA.debugLine="idelete= a.GetView(2).Text";
Debug.ShouldStop(1073741824);
parent._idelete = BA.numberCast(int.class, _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"getText"));
 BA.debugLineNum = 160;BA.debugLine="Log(\"NAMA BUILDING: \"&a.GetView(2).Text)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("NAMA BUILDING: "),_a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"getText"))));
 BA.debugLineNum = 161;BA.debugLine="Msgbox2Async(\"Are you sure to delete all faciliti";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Are you sure to delete all facilities consist "),_a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"getText"),RemoteObject.createImmutable("?")))),(Object)(BA.ObjectToCharSequence("Caution")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("No")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),addfacilitytype.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 162;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", addfacilitytype.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 163;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 164;BA.debugLine="Log(\"YES\")";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("YES")));
 BA.debugLineNum = 165;BA.debugLine="ProgressDialogShow(\"deleting..\")";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",addfacilitytype.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("deleting.."))));
 BA.debugLineNum = 166;BA.debugLine="FunctionAll.ExecuteRemoteQuery(\"DELETE FROM deta";
Debug.ShouldStop(32);
parent.mostCurrent._functionall.runVoidMethod ("_executeremotequery",addfacilitytype.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM detail_worship_building_facilities WHERE facility_id="),parent._idelete)),(Object)(BA.ObjectToString("DeleteAll")),(Object)(addfacilitytype.getObject()));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 168;BA.debugLine="Log(\"CANCEL\")";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("CANCEL")));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _clvfac_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLVFac_ItemClick (addfacilitytype) ","addfacilitytype",14,addfacilitytype.mostCurrent.activityBA,addfacilitytype.mostCurrent,149);
if (RapidSub.canDelegate("clvfac_itemclick")) return b4a.example.addfacilitytype.remoteMe.runUserSub(false, "addfacilitytype","clvfac_itemclick", _index, _value);
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 149;BA.debugLine="Sub CLVFac_ItemClick (Index As Int, Value As Objec";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("CreateItem (addfacilitytype) ","addfacilitytype",14,addfacilitytype.mostCurrent.activityBA,addfacilitytype.mostCurrent,55);
if (RapidSub.canDelegate("createitem")) return b4a.example.addfacilitytype.remoteMe.runUserSub(false, "addfacilitytype","createitem", _width, _title, _content, _id);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Title", _title);
Debug.locals.put("Content", _content);
Debug.locals.put("id", _id);
 BA.debugLineNum = 55;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(8388608);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = addfacilitytype._xui.runMethod(false,"CreatePanel",addfacilitytype.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 57;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 100%x,10%x)";
Debug.ShouldStop(16777216);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(addfacilitytype.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),addfacilitytype.mostCurrent.activityBA)),(Object)(addfacilitytype.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),addfacilitytype.mostCurrent.activityBA)));
 BA.debugLineNum = 58;BA.debugLine="p.LoadLayout(\"facility_type_list\")";
Debug.ShouldStop(33554432);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("facility_type_list")),addfacilitytype.mostCurrent.activityBA);
 BA.debugLineNum = 59;BA.debugLine="PnlQuantity.Text = Title";
Debug.ShouldStop(67108864);
addfacilitytype.mostCurrent._pnlquantity.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 60;BA.debugLine="namefc.Text = Content";
Debug.ShouldStop(134217728);
addfacilitytype.mostCurrent._namefc.runMethod(true,"setText",BA.ObjectToCharSequence(_content));
 BA.debugLineNum = 61;BA.debugLine="idfaci.Text = id";
Debug.ShouldStop(268435456);
addfacilitytype.mostCurrent._idfaci.runMethod(true,"setText",BA.ObjectToCharSequence(_id));
 BA.debugLineNum = 63;BA.debugLine="Return p";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private ScrollView1 As ScrollView";
addfacilitytype.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private Label1 As Label";
addfacilitytype.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private PanelName As Panel";
addfacilitytype.mostCurrent._panelname = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private PanelAddPanel As Panel";
addfacilitytype.mostCurrent._paneladdpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private PanelAddFacility As Panel";
addfacilitytype.mostCurrent._paneladdfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private PanelBar As Panel";
addfacilitytype.mostCurrent._panelbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private PanelToolBar As Panel";
addfacilitytype.mostCurrent._paneltoolbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private PnListFac As Panel";
addfacilitytype.mostCurrent._pnlistfac = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private CLVFac As CustomListView";
addfacilitytype.mostCurrent._clvfac = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 24;BA.debugLine="Private numfc As B4XView";
addfacilitytype.mostCurrent._numfc = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private namefc As B4XView";
addfacilitytype.mostCurrent._namefc = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private idfaci As Label";
addfacilitytype.mostCurrent._idfaci = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private PnlQuantity As Label";
addfacilitytype.mostCurrent._pnlquantity = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private ListItem As Panel";
addfacilitytype.mostCurrent._listitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private btnDelete As Button";
addfacilitytype.mostCurrent._btndelete = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Dim idelete As Int";
addfacilitytype._idelete = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 31;BA.debugLine="Private BtnAdd As Button";
addfacilitytype.mostCurrent._btnadd = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private EditName As Label";
addfacilitytype.mostCurrent._editname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (addfacilitytype) ","addfacilitytype",14,addfacilitytype.mostCurrent.activityBA,addfacilitytype.mostCurrent,66);
if (RapidSub.canDelegate("jobdone")) return b4a.example.addfacilitytype.remoteMe.runUserSub(false, "addfacilitytype","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _fasi_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _c = RemoteObject.createImmutable(0);
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _id2 = RemoteObject.createImmutable(0);
Debug.locals.put("Job", _job);
 BA.debugLineNum = 66;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(4);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 68;BA.debugLine="Dim res As String";
Debug.ShouldStop(8);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 69;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(16);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 70;BA.debugLine="Log(\"Response from server :\"& res)";
Debug.ShouldStop(32);
addfacilitytype.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 71;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(64);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 72;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(128);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 73;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(256);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("Worship"),BA.ObjectToString("DeleteAll"),BA.ObjectToString("Delete"),BA.ObjectToString("AddFacility"),BA.ObjectToString("AddSuccess"))) {
case 0: {
 BA.debugLineNum = 75;BA.debugLine="Log(\"success\")";
Debug.ShouldStop(1024);
addfacilitytype.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("success")));
 BA.debugLineNum = 76;BA.debugLine="Dim fasi_array As List = parser.NextArray";
Debug.ShouldStop(2048);
_fasi_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_fasi_array = _parser.runMethod(false,"NextArray");Debug.locals.put("fasi_array", _fasi_array);Debug.locals.put("fasi_array", _fasi_array);
 BA.debugLineNum = 77;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(4096);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 78;BA.debugLine="Dim c As Int";
Debug.ShouldStop(8192);
_c = RemoteObject.createImmutable(0);Debug.locals.put("c", _c);
 BA.debugLineNum = 79;BA.debugLine="For c=0 To fasi_array.Size - 1";
Debug.ShouldStop(16384);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {_fasi_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_c = BA.numberCast(int.class, 0) ;
for (;(step13 > 0 && _c.<Integer>get().intValue() <= limit13) || (step13 < 0 && _c.<Integer>get().intValue() >= limit13) ;_c = RemoteObject.createImmutable((int)(0 + _c.<Integer>get().intValue() + step13))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 80;BA.debugLine="Dim a As Map";
Debug.ShouldStop(32768);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 81;BA.debugLine="a = fasi_array.Get(c)";
Debug.ShouldStop(65536);
_a.setObject(_fasi_array.runMethod(false,"Get",(Object)(_c)));
 BA.debugLineNum = 83;BA.debugLine="Dim id, name As String";
Debug.ShouldStop(262144);
_id = RemoteObject.createImmutable("");Debug.locals.put("id", _id);
_name = RemoteObject.createImmutable("");Debug.locals.put("name", _name);
 BA.debugLineNum = 84;BA.debugLine="id=a.Get(\"facility_id\")";
Debug.ShouldStop(524288);
_id = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("facility_id")))));Debug.locals.put("id", _id);
 BA.debugLineNum = 85;BA.debugLine="name=a.Get(\"name_of_facility\")";
Debug.ShouldStop(1048576);
_name = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name_of_facility")))));Debug.locals.put("name", _name);
 BA.debugLineNum = 86;BA.debugLine="Log(\"id: \"&id&\" | name: \"&name)";
Debug.ShouldStop(2097152);
addfacilitytype.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("id: "),_id,RemoteObject.createImmutable(" | name: "),_name)));
 BA.debugLineNum = 87;BA.debugLine="CLVFac.Add(CreateItem(CLVFac.AsView.Width, $\"";
Debug.ShouldStop(4194304);
addfacilitytype.mostCurrent._clvfac.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(addfacilitytype.mostCurrent._clvfac.runMethod(false,"_asview").runMethod(true,"getWidth"),(RemoteObject.concat(RemoteObject.createImmutable(""),addfacilitytype.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(1)}, "+",1, 1)))),RemoteObject.createImmutable(""))),_name,BA.numberCast(int.class, (RemoteObject.concat(RemoteObject.createImmutable(""),addfacilitytype.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_id))),RemoteObject.createImmutable(""))))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 89;BA.debugLine="CLVFac.AsView.Height = (ListItem.Height+0.6%x";
Debug.ShouldStop(16777216);
addfacilitytype.mostCurrent._clvfac.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {addfacilitytype.mostCurrent._listitem.runMethod(true,"getHeight"),addfacilitytype.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0.6)),addfacilitytype.mostCurrent.activityBA)}, "+",1, 1)),_fasi_array.runMethod(true,"getSize")}, "*",0, 1));
 BA.debugLineNum = 90;BA.debugLine="CLVFac.sv.Height = CLVFac.AsView.Height";
Debug.ShouldStop(33554432);
addfacilitytype.mostCurrent._clvfac.getField(false,"_sv").runMethod(true,"setHeight",addfacilitytype.mostCurrent._clvfac.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 91;BA.debugLine="PnListFac.Height =CLVFac.AsView.Height";
Debug.ShouldStop(67108864);
addfacilitytype.mostCurrent._pnlistfac.runMethod(true,"setHeight",addfacilitytype.mostCurrent._clvfac.runMethod(false,"_asview").runMethod(true,"getHeight"));
 break; }
case 1: {
 BA.debugLineNum = 93;BA.debugLine="Dim fasi_array As List = parser.NextArray";
Debug.ShouldStop(268435456);
_fasi_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_fasi_array = _parser.runMethod(false,"NextArray");Debug.locals.put("fasi_array", _fasi_array);Debug.locals.put("fasi_array", _fasi_array);
 BA.debugLineNum = 94;BA.debugLine="If fasi_array.Size = 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_fasi_array.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 95;BA.debugLine="FunctionAll.ExecuteRemoteQuery(\"DELETE FROM w";
Debug.ShouldStop(1073741824);
addfacilitytype.mostCurrent._functionall.runVoidMethod ("_executeremotequery",addfacilitytype.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM worship_building_facilities WHERE facility_id="),addfacilitytype._idelete)),(Object)(BA.ObjectToString("Delete")),(Object)(addfacilitytype.getObject()));
 }else {
 BA.debugLineNum = 97;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1);
addfacilitytype.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 98;BA.debugLine="Msgbox(\"Ada Error\"& Job.ErrorMessage,\"Error\")";
Debug.ShouldStop(2);
addfacilitytype.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Ada Error"),_job.getField(true,"_errormessage")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),addfacilitytype.mostCurrent.activityBA);
 };
 break; }
case 2: {
 BA.debugLineNum = 102;BA.debugLine="Dim fasi_array As List = parser.NextArray";
Debug.ShouldStop(32);
_fasi_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_fasi_array = _parser.runMethod(false,"NextArray");Debug.locals.put("fasi_array", _fasi_array);Debug.locals.put("fasi_array", _fasi_array);
 BA.debugLineNum = 103;BA.debugLine="If fasi_array.Size = 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_fasi_array.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 104;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 105;BA.debugLine="CLVFac.Clear";
Debug.ShouldStop(256);
addfacilitytype.mostCurrent._clvfac.runVoidMethod ("_clear");
 BA.debugLineNum = 106;BA.debugLine="FunctionAll.ExecuteRemoteQuery(\"SELECT * FRO";
Debug.ShouldStop(512);
addfacilitytype.mostCurrent._functionall.runVoidMethod ("_executeremotequery",addfacilitytype.mostCurrent.activityBA,(Object)(BA.ObjectToString("SELECT * FROM worship_building_facilities ORDER BY name_of_facility ASC")),(Object)(BA.ObjectToString("Worship")),(Object)(addfacilitytype.getObject()));
 BA.debugLineNum = 107;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1024);
addfacilitytype.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 108;BA.debugLine="ToastMessageShow(\"Deleted\",False)";
Debug.ShouldStop(2048);
addfacilitytype.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Deleted")),(Object)(addfacilitytype.mostCurrent.__c.getField(true,"False")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e42) {
			BA.rdebugUtils.runVoidMethod("setLastException",addfacilitytype.processBA, e42.toString()); BA.debugLineNum = 110;BA.debugLine="Msgbox(\"Error ???\" , \"error\" )";
Debug.ShouldStop(8192);
addfacilitytype.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error ???")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("error"))),addfacilitytype.mostCurrent.activityBA);
 BA.debugLineNum = 111;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
addfacilitytype.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(addfacilitytype.mostCurrent.__c.runMethod(false,"LastException",addfacilitytype.mostCurrent.activityBA))));
 };
 }else {
 BA.debugLineNum = 114;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 115;BA.debugLine="Msgbox(\"can't update data\" , \"Failed\" )";
Debug.ShouldStop(262144);
addfacilitytype.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("can't update data")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Failed"))),addfacilitytype.mostCurrent.activityBA);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e49) {
			BA.rdebugUtils.runVoidMethod("setLastException",addfacilitytype.processBA, e49.toString()); BA.debugLineNum = 117;BA.debugLine="Msgbox(\"Error ???\" , \"error\" )";
Debug.ShouldStop(1048576);
addfacilitytype.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error ???")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("error"))),addfacilitytype.mostCurrent.activityBA);
 BA.debugLineNum = 118;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
addfacilitytype.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(addfacilitytype.mostCurrent.__c.runMethod(false,"LastException",addfacilitytype.mostCurrent.activityBA))));
 };
 };
 break; }
case 3: {
 BA.debugLineNum = 122;BA.debugLine="Dim fasi_array As List = parser.NextArray";
Debug.ShouldStop(33554432);
_fasi_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_fasi_array = _parser.runMethod(false,"NextArray");Debug.locals.put("fasi_array", _fasi_array);Debug.locals.put("fasi_array", _fasi_array);
 BA.debugLineNum = 123;BA.debugLine="Dim c As Int";
Debug.ShouldStop(67108864);
_c = RemoteObject.createImmutable(0);Debug.locals.put("c", _c);
 BA.debugLineNum = 124;BA.debugLine="For c=0 To fasi_array.Size - 1";
Debug.ShouldStop(134217728);
{
final int step56 = 1;
final int limit56 = RemoteObject.solve(new RemoteObject[] {_fasi_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_c = BA.numberCast(int.class, 0) ;
for (;(step56 > 0 && _c.<Integer>get().intValue() <= limit56) || (step56 < 0 && _c.<Integer>get().intValue() >= limit56) ;_c = RemoteObject.createImmutable((int)(0 + _c.<Integer>get().intValue() + step56))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 125;BA.debugLine="Dim a As Map";
Debug.ShouldStop(268435456);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 126;BA.debugLine="a = fasi_array.Get(c)";
Debug.ShouldStop(536870912);
_a.setObject(_fasi_array.runMethod(false,"Get",(Object)(_c)));
 BA.debugLineNum = 128;BA.debugLine="Dim id As String";
Debug.ShouldStop(-2147483648);
_id = RemoteObject.createImmutable("");Debug.locals.put("id", _id);
 BA.debugLineNum = 129;BA.debugLine="id = a.Get(\"id\")";
Debug.ShouldStop(1);
_id = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);
 BA.debugLineNum = 130;BA.debugLine="Log(id)";
Debug.ShouldStop(2);
addfacilitytype.mostCurrent.__c.runVoidMethod ("Log",(Object)(_id));
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 132;BA.debugLine="Dim id2 As Int =id + 1";
Debug.ShouldStop(8);
_id2 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _id),RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("id2", _id2);Debug.locals.put("id2", _id2);
 BA.debugLineNum = 133;BA.debugLine="FunctionAll.ExecuteRemoteQuery(\"INSERT INTO wo";
Debug.ShouldStop(16);
addfacilitytype.mostCurrent._functionall.runVoidMethod ("_executeremotequery",addfacilitytype.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO worship_building_facilities (facility_id, name_of_facility) VALUES ("),_id2,RemoteObject.createImmutable(",'"),addfacilitytype.mostCurrent._editname.runMethod(true,"getText"),RemoteObject.createImmutable("')"))),(Object)(BA.ObjectToString("AddSuccess")),(Object)(addfacilitytype.getObject()));
 break; }
case 4: {
 BA.debugLineNum = 135;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 136;BA.debugLine="CLVFac.Clear";
Debug.ShouldStop(128);
addfacilitytype.mostCurrent._clvfac.runVoidMethod ("_clear");
 BA.debugLineNum = 137;BA.debugLine="FunctionAll.ExecuteRemoteQuery(\"SELECT * FROM";
Debug.ShouldStop(256);
addfacilitytype.mostCurrent._functionall.runVoidMethod ("_executeremotequery",addfacilitytype.mostCurrent.activityBA,(Object)(BA.ObjectToString("SELECT * FROM worship_building_facilities ORDER BY name_of_facility ASC")),(Object)(BA.ObjectToString("Worship")),(Object)(addfacilitytype.getObject()));
 BA.debugLineNum = 138;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
addfacilitytype.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 139;BA.debugLine="ToastMessageShow(\"Added!\",False)";
Debug.ShouldStop(1024);
addfacilitytype.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Added!")),(Object)(addfacilitytype.mostCurrent.__c.getField(true,"False")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e72) {
			BA.rdebugUtils.runVoidMethod("setLastException",addfacilitytype.processBA, e72.toString()); BA.debugLineNum = 141;BA.debugLine="ToastMessageShow(\"Failed!\",False)";
Debug.ShouldStop(4096);
addfacilitytype.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Failed!")),(Object)(addfacilitytype.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 142;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
addfacilitytype.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(addfacilitytype.mostCurrent.__c.runMethod(false,"LastException",addfacilitytype.mostCurrent.activityBA))));
 };
 break; }
}
;
 };
 BA.debugLineNum = 146;BA.debugLine="Job.Release";
Debug.ShouldStop(131072);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
addfacilitytype._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}