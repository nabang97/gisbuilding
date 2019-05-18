package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class login extends Activity implements B4AActivity{
	public static login mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.login");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (login).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.login");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.login", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (login) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (login) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return login.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (login) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
			if (mostCurrent == null || mostCurrent != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (login) Resume **");
		    processBA.raiseEvent(mostCurrent._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static de.amberhome.objects.preferenceactivity.PreferenceManager _manager = null;
public static String _username = "";
public anywheresoftware.b4a.objects.EditTextWrapper _editusername = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editpass = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkbox1 = null;
public static String _md5string = "";
public static String _password = "";
public static String _role = "";
public anywheresoftware.b4a.objects.ButtonWrapper _btnlogin = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.officedetail _officedetail = null;
public b4a.example.functionall _functionall = null;
public b4a.example.searchbuilding _searchbuilding = null;
public b4a.example.educationaldetail _educationaldetail = null;
public b4a.example.healthdetail _healthdetail = null;
public b4a.example.housedetail _housedetail = null;
public b4a.example.msmedetail _msmedetail = null;
public b4a.example.worshipdetail _worshipdetail = null;
public b4a.example.manualposition _manualposition = null;
public b4a.example.home _home = null;
public b4a.example.homeadmin _homeadmin = null;
public b4a.example.addfacilitytype _addfacilitytype = null;
public b4a.example.editbuildingfacility _editbuildingfacility = null;
public b4a.example.addbuildingfacility _addbuildingfacility = null;
public b4a.example.officeedit _officeedit = null;
public b4a.example.msmebuilding _msmebuilding = null;
public b4a.example.worshipbuilding _worshipbuilding = null;
public b4a.example.addphoto _addphoto = null;
public b4a.example.loaderimage _loaderimage = null;
public b4a.example.maincamera _maincamera = null;
public b4a.example.fileutil _fileutil = null;
public b4a.example.showimage _showimage = null;
public b4a.example.browsegallery _browsegallery = null;
public b4a.example.educationaledit _educationaledit = null;
public b4a.example.housebuilding _housebuilding = null;
public b4a.example.worshipedit _worshipedit = null;
public b4a.example.healthbuilding _healthbuilding = null;
public b4a.example.gallery _gallery = null;
public b4a.example.officebuilding _officebuilding = null;
public b4a.example.educationalbuilding _educationalbuilding = null;
public b4a.example.msmeedit _msmeedit = null;
public b4a.example.buildinglist _buildinglist = null;
public b4a.example.help _help = null;
public b4a.example.healthedit _healthedit = null;
public b4a.example.searchworship _searchworship = null;
public b4a.example.multipartpost _multipartpost = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="Activity.LoadLayout(\"login_layout\")";
mostCurrent._activity.LoadLayout("login_layout",mostCurrent.activityBA);
RDebugUtils.currentLine=12910597;
 //BA.debugLineNum = 12910597;BA.debugLine="SetBackgroundTintList(EditUsername, Colors.Transp";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._editusername.getObject())),anywheresoftware.b4a.keywords.Common.Colors.Transparent,anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=12910598;
 //BA.debugLineNum = 12910598;BA.debugLine="SetBackgroundTintList(EditPass, Colors.Transparen";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._editpass.getObject())),anywheresoftware.b4a.keywords.Common.Colors.Transparent,anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=12910600;
 //BA.debugLineNum = 12910600;BA.debugLine="End Sub";
return "";
}
public static String  _setbackgroundtintlist(anywheresoftware.b4a.objects.ConcreteViewWrapper _view,int _active,int _enabled) throws Exception{
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setbackgroundtintlist"))
	return (String) Debug.delegate(mostCurrent.activityBA, "setbackgroundtintlist", new Object[] {_view,_active,_enabled});
int[][] _states = null;
int[] _color = null;
anywheresoftware.b4j.object.JavaObject _csl = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="Dim States(2,1) As Int";
_states = new int[(int) (2)][];
{
int d0 = _states.length;
int d1 = (int) (1);
for (int i0 = 0;i0 < d0;i0++) {
_states[i0] = new int[d1];
}
}
;
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="States(0,0) = 16842908     'Active";
_states[(int) (0)][(int) (0)] = (int) (16842908);
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="States(1,0) = 16842910    'Enabled";
_states[(int) (1)][(int) (0)] = (int) (16842910);
RDebugUtils.currentLine=13041668;
 //BA.debugLineNum = 13041668;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
_color = new int[]{_active,_enabled};
RDebugUtils.currentLine=13041669;
 //BA.debugLineNum = 13041669;BA.debugLine="Dim CSL As JavaObject";
_csl = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=13041670;
 //BA.debugLineNum = 13041670;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
_csl.InitializeNewInstance("android.content.res.ColorStateList",new Object[]{(Object)(_states),(Object)(_color)});
RDebugUtils.currentLine=13041671;
 //BA.debugLineNum = 13041671;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=13041672;
 //BA.debugLineNum = 13041672;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
_jo.InitializeStatic("android.support.v4.view.ViewCompat");
RDebugUtils.currentLine=13041673;
 //BA.debugLineNum = 13041673;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
_jo.RunMethod("setBackgroundTintList",new Object[]{(Object)(_view.getObject()),(Object)(_csl.getObject())});
RDebugUtils.currentLine=13041674;
 //BA.debugLineNum = 13041674;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="login";
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="End Sub";
return "";
}
public static String  _btnlogin_click() throws Exception{
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlogin_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnlogin_click", null);
String _pi = "";
anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper _md = null;
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bytecon = null;
byte[] _passwordhash = null;
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Sub Btnlogin_Click";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="Private pi As String";
_pi = "";
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="pi = EditPass.Text";
_pi = mostCurrent._editpass.getText();
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="Dim md As MessageDigest";
_md = new anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper();
RDebugUtils.currentLine=13434884;
 //BA.debugLineNum = 13434884;BA.debugLine="Dim ByteCon As ByteConverter";
_bytecon = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=13434885;
 //BA.debugLineNum = 13434885;BA.debugLine="Dim passwordhash() As Byte";
_passwordhash = new byte[(int) (0)];
;
RDebugUtils.currentLine=13434886;
 //BA.debugLineNum = 13434886;BA.debugLine="passwordhash = md.GetMessageDigest(pi.GetBytes(\"U";
_passwordhash = _md.GetMessageDigest(_pi.getBytes("UTF8"),"MD5");
RDebugUtils.currentLine=13434887;
 //BA.debugLineNum = 13434887;BA.debugLine="md5string = ByteCon.HexFromBytes(passwordhash)";
mostCurrent._md5string = _bytecon.HexFromBytes(_passwordhash);
RDebugUtils.currentLine=13434888;
 //BA.debugLineNum = 13434888;BA.debugLine="md5string = md5string.ToLowerCase";
mostCurrent._md5string = mostCurrent._md5string.toLowerCase();
RDebugUtils.currentLine=13434889;
 //BA.debugLineNum = 13434889;BA.debugLine="Log(md5string)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._md5string);
RDebugUtils.currentLine=13434890;
 //BA.debugLineNum = 13434890;BA.debugLine="ExecuteRemoteQuery(\"SELECT * FROM user_account wh";
_executeremotequery("SELECT * FROM user_account where username='"+mostCurrent._editusername.getText()+"' and password='"+mostCurrent._md5string+"'","Data");
RDebugUtils.currentLine=13434891;
 //BA.debugLineNum = 13434891;BA.debugLine="End Sub";
return "";
}
public static String  _executeremotequery(String _query,String _jobname) throws Exception{
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "executeremotequery"))
	return (String) Debug.delegate(mostCurrent.activityBA, "executeremotequery", new Object[] {_query,_jobname});
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="Job.Initialize(JobName, Me)";
_job._initialize(processBA,_jobname,login.getObject());
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
_job._poststring(""+mostCurrent._main._server+"mobile/json.php",_query);
RDebugUtils.currentLine=13172740;
 //BA.debugLineNum = 13172740;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox1_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkbox1_checkedchange"))
	return (String) Debug.delegate(mostCurrent.activityBA, "checkbox1_checkedchange", new Object[] {_checked});
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Sub CheckBox1_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _data_array = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _a = null;
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="Log(\"Response from server :\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server :"+_res);
RDebugUtils.currentLine=13238277;
 //BA.debugLineNum = 13238277;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=13238278;
 //BA.debugLineNum = 13238278;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=13238279;
 //BA.debugLineNum = 13238279;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"Data")) {
case 0: {
RDebugUtils.currentLine=13238281;
 //BA.debugLineNum = 13238281;BA.debugLine="Dim data_array As List";
_data_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13238282;
 //BA.debugLineNum = 13238282;BA.debugLine="data_array = parser.NextArray";
_data_array = _parser.NextArray();
RDebugUtils.currentLine=13238283;
 //BA.debugLineNum = 13238283;BA.debugLine="If data_array.Size > 0 Then";
if (_data_array.getSize()>0) { 
RDebugUtils.currentLine=13238284;
 //BA.debugLineNum = 13238284;BA.debugLine="For i=0 To data_array.Size - 1";
{
final int step12 = 1;
final int limit12 = (int) (_data_array.getSize()-1);
_i = (int) (0) ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
RDebugUtils.currentLine=13238285;
 //BA.debugLineNum = 13238285;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13238286;
 //BA.debugLineNum = 13238286;BA.debugLine="a = data_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_data_array.Get(_i)));
RDebugUtils.currentLine=13238288;
 //BA.debugLineNum = 13238288;BA.debugLine="username = a.Get(\"username\")";
_username = BA.ObjectToString(_a.Get((Object)("username")));
RDebugUtils.currentLine=13238289;
 //BA.debugLineNum = 13238289;BA.debugLine="password = a.Get(\"password\")";
mostCurrent._password = BA.ObjectToString(_a.Get((Object)("password")));
RDebugUtils.currentLine=13238290;
 //BA.debugLineNum = 13238290;BA.debugLine="role = a.Get(\"role\")";
mostCurrent._role = BA.ObjectToString(_a.Get((Object)("role")));
 }
};
RDebugUtils.currentLine=13238292;
 //BA.debugLineNum = 13238292;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=13238293;
 //BA.debugLineNum = 13238293;BA.debugLine="Msgbox(\"Hai, \" & EditUsername.Text & CRLF & _";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Hai, "+mostCurrent._editusername.getText()+anywheresoftware.b4a.keywords.Common.CRLF+"Selamat datang di My AutoLogin."),BA.ObjectToCharSequence("Login Sukses"),mostCurrent.activityBA);
RDebugUtils.currentLine=13238295;
 //BA.debugLineNum = 13238295;BA.debugLine="Main.kvs.Put(\"username\", username)";
mostCurrent._main._kvs._put("username",(Object)(_username));
RDebugUtils.currentLine=13238296;
 //BA.debugLineNum = 13238296;BA.debugLine="Main.kvs.Put(\"role\", role)";
mostCurrent._main._kvs._put("role",(Object)(mostCurrent._role));
RDebugUtils.currentLine=13238297;
 //BA.debugLineNum = 13238297;BA.debugLine="Log(\"DISINI :\"&Main.kvs.Get(\"username\")&\" | R";
anywheresoftware.b4a.keywords.Common.Log("DISINI :"+BA.ObjectToString(mostCurrent._main._kvs._get("username"))+" | Role: "+BA.ObjectToString(mostCurrent._main._kvs._get("role")));
RDebugUtils.currentLine=13238299;
 //BA.debugLineNum = 13238299;BA.debugLine="If CheckBox1.Checked Then";
if (mostCurrent._checkbox1.getChecked()) { 
RDebugUtils.currentLine=13238300;
 //BA.debugLineNum = 13238300;BA.debugLine="SetLoginSession(True)";
_setloginsession(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=13238302;
 //BA.debugLineNum = 13238302;BA.debugLine="SetLoginSession(False)";
_setloginsession(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=13238304;
 //BA.debugLineNum = 13238304;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=13238305;
 //BA.debugLineNum = 13238305;BA.debugLine="StartActivity(HomeAdmin)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homeadmin.getObject()));
 }else {
RDebugUtils.currentLine=13238308;
 //BA.debugLineNum = 13238308;BA.debugLine="Msgbox(\"Username atau Password salah.\", \"Logi";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Username atau Password salah."),BA.ObjectToCharSequence("Login Gagal"),mostCurrent.activityBA);
 };
 break; }
}
;
 };
RDebugUtils.currentLine=13238312;
 //BA.debugLineNum = 13238312;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=13238313;
 //BA.debugLineNum = 13238313;BA.debugLine="End Sub";
return "";
}
public static String  _setloginsession(boolean _checked) throws Exception{
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setloginsession"))
	return (String) Debug.delegate(mostCurrent.activityBA, "setloginsession", new Object[] {_checked});
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Sub SetLoginSession(Checked As Boolean)";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="manager.SetBoolean(\"is_login\", True)";
_manager.SetBoolean("is_login",anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="manager.SetBoolean(\"is_login\", False)";
_manager.SetBoolean("is_login",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=12976134;
 //BA.debugLineNum = 12976134;BA.debugLine="End Sub";
return "";
}
}