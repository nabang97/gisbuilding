package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class login_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (login) ","login",13,login.mostCurrent.activityBA,login.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) return b4a.example.login.remoteMe.runUserSub(false, "login","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 34;BA.debugLine="Activity.LoadLayout(\"login_layout\")";
Debug.ShouldStop(2);
login.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("login_layout")),login.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="SetBackgroundTintList(EditUsername, Colors.Transp";
Debug.ShouldStop(4);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), login.mostCurrent._editusername.getObject()),login.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"),login.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 36;BA.debugLine="SetBackgroundTintList(EditPass, Colors.Transparen";
Debug.ShouldStop(8);
_setbackgroundtintlist(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), login.mostCurrent._editpass.getObject()),login.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"),login.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Pause (login) ","login",13,login.mostCurrent.activityBA,login.mostCurrent,111);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.login.remoteMe.runUserSub(false, "login","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 111;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16384);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (login) ","login",13,login.mostCurrent.activityBA,login.mostCurrent,59);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.login.remoteMe.runUserSub(false, "login","activity_resume");
 BA.debugLineNum = 59;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlogin_click() throws Exception{
try {
		Debug.PushSubsStack("Btnlogin_Click (login) ","login",13,login.mostCurrent.activityBA,login.mostCurrent,120);
if (RapidSub.canDelegate("btnlogin_click")) return b4a.example.login.remoteMe.runUserSub(false, "login","btnlogin_click");
RemoteObject _pi = RemoteObject.createImmutable("");
RemoteObject _md = RemoteObject.declareNull("anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper");
RemoteObject _bytecon = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
RemoteObject _passwordhash = null;
 BA.debugLineNum = 120;BA.debugLine="Sub Btnlogin_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="Private pi As String";
Debug.ShouldStop(16777216);
_pi = RemoteObject.createImmutable("");Debug.locals.put("pi", _pi);
 BA.debugLineNum = 122;BA.debugLine="pi = EditPass.Text";
Debug.ShouldStop(33554432);
_pi = login.mostCurrent._editpass.runMethod(true,"getText");Debug.locals.put("pi", _pi);
 BA.debugLineNum = 123;BA.debugLine="Dim md As MessageDigest";
Debug.ShouldStop(67108864);
_md = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper");Debug.locals.put("md", _md);
 BA.debugLineNum = 124;BA.debugLine="Dim ByteCon As ByteConverter";
Debug.ShouldStop(134217728);
_bytecon = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("ByteCon", _bytecon);
 BA.debugLineNum = 125;BA.debugLine="Dim passwordhash() As Byte";
Debug.ShouldStop(268435456);
_passwordhash = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("passwordhash", _passwordhash);
 BA.debugLineNum = 126;BA.debugLine="passwordhash = md.GetMessageDigest(pi.GetBytes(\"U";
Debug.ShouldStop(536870912);
_passwordhash = _md.runMethod(false,"GetMessageDigest",(Object)(_pi.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))),(Object)(RemoteObject.createImmutable("MD5")));Debug.locals.put("passwordhash", _passwordhash);
 BA.debugLineNum = 127;BA.debugLine="md5string = ByteCon.HexFromBytes(passwordhash)";
Debug.ShouldStop(1073741824);
login.mostCurrent._md5string = _bytecon.runMethod(true,"HexFromBytes",(Object)(_passwordhash));
 BA.debugLineNum = 128;BA.debugLine="md5string = md5string.ToLowerCase";
Debug.ShouldStop(-2147483648);
login.mostCurrent._md5string = login.mostCurrent._md5string.runMethod(true,"toLowerCase");
 BA.debugLineNum = 129;BA.debugLine="Log(md5string)";
Debug.ShouldStop(1);
login.mostCurrent.__c.runVoidMethod ("Log",(Object)(login.mostCurrent._md5string));
 BA.debugLineNum = 130;BA.debugLine="ExecuteRemoteQuery(\"SELECT * FROM user_account wh";
Debug.ShouldStop(2);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM user_account where username='"),login.mostCurrent._editusername.runMethod(true,"getText"),RemoteObject.createImmutable("' and password='"),login.mostCurrent._md5string,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("Data"));
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkbox1_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CheckBox1_CheckedChange (login) ","login",13,login.mostCurrent.activityBA,login.mostCurrent,115);
if (RapidSub.canDelegate("checkbox1_checkedchange")) return b4a.example.login.remoteMe.runUserSub(false, "login","checkbox1_checkedchange", _checked);
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 115;BA.debugLine="Sub CheckBox1_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("ExecuteRemoteQuery (login) ","login",13,login.mostCurrent.activityBA,login.mostCurrent,62);
if (RapidSub.canDelegate("executeremotequery")) return b4a.example.login.remoteMe.runUserSub(false, "login","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 62;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(1073741824);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 64;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(-2147483648);
_job.runVoidMethod ("_initialize",login.processBA,(Object)(_jobname),(Object)(login.getObject()));
 BA.debugLineNum = 65;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
Debug.ShouldStop(1);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),login.mostCurrent._main._server,RemoteObject.createImmutable("mobile/json.php"))),(Object)(_query));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
 //BA.debugLineNum = 18;BA.debugLine="Private EditUsername As EditText";
login.mostCurrent._editusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private EditPass As EditText";
login.mostCurrent._editpass = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private CheckBox1 As CheckBox";
login.mostCurrent._checkbox1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim md5string As String";
login.mostCurrent._md5string = RemoteObject.createImmutable("");
 //BA.debugLineNum = 24;BA.debugLine="Private password As String";
login.mostCurrent._password = RemoteObject.createImmutable("");
 //BA.debugLineNum = 25;BA.debugLine="Private role As String";
login.mostCurrent._role = RemoteObject.createImmutable("");
 //BA.debugLineNum = 26;BA.debugLine="Private Btnlogin As Button";
login.mostCurrent._btnlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (login) ","login",13,login.mostCurrent.activityBA,login.mostCurrent,68);
if (RapidSub.canDelegate("jobdone")) return b4a.example.login.remoteMe.runUserSub(false, "login","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _data_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 68;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(16);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 70;BA.debugLine="Dim res As String";
Debug.ShouldStop(32);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 71;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(64);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 72;BA.debugLine="Log(\"Response from server :\"& res)";
Debug.ShouldStop(128);
login.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 73;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(256);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 74;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(512);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 75;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(1024);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("Data"))) {
case 0: {
 BA.debugLineNum = 77;BA.debugLine="Dim data_array As List";
Debug.ShouldStop(4096);
_data_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 78;BA.debugLine="data_array = parser.NextArray";
Debug.ShouldStop(8192);
_data_array = _parser.runMethod(false,"NextArray");Debug.locals.put("data_array", _data_array);
 BA.debugLineNum = 79;BA.debugLine="If data_array.Size > 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_data_array.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 80;BA.debugLine="For i=0 To data_array.Size - 1";
Debug.ShouldStop(32768);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_data_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 81;BA.debugLine="Dim a As Map";
Debug.ShouldStop(65536);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 82;BA.debugLine="a = data_array.Get(i)";
Debug.ShouldStop(131072);
_a.setObject(_data_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 84;BA.debugLine="username = a.Get(\"username\")";
Debug.ShouldStop(524288);
login._username = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));
 BA.debugLineNum = 85;BA.debugLine="password = a.Get(\"password\")";
Debug.ShouldStop(1048576);
login.mostCurrent._password = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("password")))));
 BA.debugLineNum = 86;BA.debugLine="role = a.Get(\"role\")";
Debug.ShouldStop(2097152);
login.mostCurrent._role = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("role")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 88;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8388608);
login.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 89;BA.debugLine="Msgbox(\"Hai, \" & EditUsername.Text & CRLF & _";
Debug.ShouldStop(16777216);
login.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Hai, "),login.mostCurrent._editusername.runMethod(true,"getText"),login.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Selamat datang di My AutoLogin.")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Login Sukses"))),login.mostCurrent.activityBA);
 BA.debugLineNum = 91;BA.debugLine="Main.kvs.Put(\"username\", username)";
Debug.ShouldStop(67108864);
login.mostCurrent._main._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("username")),(Object)((login._username)));
 BA.debugLineNum = 92;BA.debugLine="Main.kvs.Put(\"role\", role)";
Debug.ShouldStop(134217728);
login.mostCurrent._main._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("role")),(Object)((login.mostCurrent._role)));
 BA.debugLineNum = 93;BA.debugLine="Log(\"DISINI :\"&Main.kvs.Get(\"username\")&\" | R";
Debug.ShouldStop(268435456);
login.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DISINI :"),login.mostCurrent._main._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("username"))),RemoteObject.createImmutable(" | Role: "),login.mostCurrent._main._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("role"))))));
 BA.debugLineNum = 95;BA.debugLine="If CheckBox1.Checked Then";
Debug.ShouldStop(1073741824);
if (login.mostCurrent._checkbox1.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 96;BA.debugLine="SetLoginSession(True)";
Debug.ShouldStop(-2147483648);
_setloginsession(login.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 98;BA.debugLine="SetLoginSession(False)";
Debug.ShouldStop(2);
_setloginsession(login.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 100;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
login.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 101;BA.debugLine="StartActivity(HomeAdmin)";
Debug.ShouldStop(16);
login.mostCurrent.__c.runVoidMethod ("StartActivity",login.processBA,(Object)((login.mostCurrent._homeadmin.getObject())));
 }else {
 BA.debugLineNum = 104;BA.debugLine="Msgbox(\"Username atau Password salah.\", \"Logi";
Debug.ShouldStop(128);
login.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Username atau Password salah.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Login Gagal"))),login.mostCurrent.activityBA);
 };
 break; }
}
;
 };
 BA.debugLineNum = 108;BA.debugLine="Job.Release";
Debug.ShouldStop(2048);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 109;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Dim manager As AHPreferenceManager";
login._manager = RemoteObject.createNew ("de.amberhome.objects.preferenceactivity.PreferenceManager");
 //BA.debugLineNum = 11;BA.debugLine="Dim username As String";
login._username = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setbackgroundtintlist(RemoteObject _view,RemoteObject _active,RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundTintList (login) ","login",13,login.mostCurrent.activityBA,login.mostCurrent,47);
if (RapidSub.canDelegate("setbackgroundtintlist")) return b4a.example.login.remoteMe.runUserSub(false, "login","setbackgroundtintlist", _view, _active, _enabled);
RemoteObject _states = null;
RemoteObject _color = null;
RemoteObject _csl = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("View", _view);
Debug.locals.put("Active", _active);
Debug.locals.put("Enabled", _enabled);
 BA.debugLineNum = 47;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Dim States(2,1) As Int";
Debug.ShouldStop(32768);
_states = RemoteObject.createNewArray ("int", new int[] {2,1}, new Object[]{});Debug.locals.put("States", _states);
 BA.debugLineNum = 49;BA.debugLine="States(0,0) = 16842908     'Active";
Debug.ShouldStop(65536);
_states.setArrayElement (BA.numberCast(int.class, 16842908),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 50;BA.debugLine="States(1,0) = 16842910    'Enabled";
Debug.ShouldStop(131072);
_states.setArrayElement (BA.numberCast(int.class, 16842910),BA.numberCast(int.class, 1),BA.numberCast(int.class, 0));
 BA.debugLineNum = 51;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
Debug.ShouldStop(262144);
_color = RemoteObject.createNewArray("int",new int[] {2},new Object[] {_active,_enabled});Debug.locals.put("Color", _color);Debug.locals.put("Color", _color);
 BA.debugLineNum = 52;BA.debugLine="Dim CSL As JavaObject";
Debug.ShouldStop(524288);
_csl = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("CSL", _csl);
 BA.debugLineNum = 53;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
Debug.ShouldStop(1048576);
_csl.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.content.res.ColorStateList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_states),(_color)})));
 BA.debugLineNum = 54;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(2097152);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 55;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
Debug.ShouldStop(4194304);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.support.v4.view.ViewCompat")));
 BA.debugLineNum = 56;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
Debug.ShouldStop(8388608);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBackgroundTintList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_view.getObject()),(_csl.getObject())})));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setloginsession(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SetLoginSession (login) ","login",13,login.mostCurrent.activityBA,login.mostCurrent,39);
if (RapidSub.canDelegate("setloginsession")) return b4a.example.login.remoteMe.runUserSub(false, "login","setloginsession", _checked);
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 39;BA.debugLine="Sub SetLoginSession(Checked As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="If Checked Then";
Debug.ShouldStop(128);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 41;BA.debugLine="manager.SetBoolean(\"is_login\", True)";
Debug.ShouldStop(256);
login._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("is_login")),(Object)(login.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 43;BA.debugLine="manager.SetBoolean(\"is_login\", False)";
Debug.ShouldStop(1024);
login._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("is_login")),(Object)(login.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}