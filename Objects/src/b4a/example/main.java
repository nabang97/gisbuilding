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

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
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
		return main.class;
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
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (main) Resume **");
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

public anywheresoftware.b4a.keywords.Common __c = null;
public static b4a.example3.keyvaluestore _kvs = null;
public static anywheresoftware.b4a.objects.Timer _tmsplash = null;
public static String _server = "";
public static String _servermap = "";
public static String _lbllon = "";
public static String _lbllat = "";
public static String _lblspeed = "";
public static String _lblsatellites = "";
public anywheresoftware.b4a.objects.ButtonWrapper _btnguest = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnadmin = null;
public flm.b4a.animationplus.AnimationPlusWrapper _btanim = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblwelcome = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblwelcome2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsignin = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkbox1 = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.starter _starter = null;
public b4a.example.editbuildingfacility _editbuildingfacility = null;
public b4a.example.addbuildingfacility _addbuildingfacility = null;
public b4a.example.educationaledit _educationaledit = null;
public b4a.example.educationaldetail _educationaldetail = null;
public b4a.example.searchbuilding _searchbuilding = null;
public b4a.example.maincamera _maincamera = null;
public b4a.example.homeadmin _homeadmin = null;
public b4a.example.worshipdetail _worshipdetail = null;
public b4a.example.worshipedit _worshipedit = null;
public b4a.example.login _login = null;
public b4a.example.worshipbuilding _worshipbuilding = null;
public b4a.example.housebuilding _housebuilding = null;
public b4a.example.healthdetail _healthdetail = null;
public b4a.example.msmedetail _msmedetail = null;
public b4a.example.officedetail _officedetail = null;
public b4a.example.housedetail _housedetail = null;
public b4a.example.home _home = null;
public b4a.example.healthbuilding _healthbuilding = null;
public b4a.example.gallery _gallery = null;
public b4a.example.officebuilding _officebuilding = null;
public b4a.example.educationalbuilding _educationalbuilding = null;
public b4a.example.msmebuilding _msmebuilding = null;
public b4a.example.officeedit _officeedit = null;
public b4a.example.msmeedit _msmeedit = null;
public b4a.example.buildinglist _buildinglist = null;
public b4a.example.maplocation _maplocation = null;
public b4a.example.help _help = null;
public b4a.example.healthedit _healthedit = null;
public b4a.example.searchworship _searchworship = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (editbuildingfacility.mostCurrent != null);
vis = vis | (addbuildingfacility.mostCurrent != null);
vis = vis | (educationaledit.mostCurrent != null);
vis = vis | (educationaldetail.mostCurrent != null);
vis = vis | (searchbuilding.mostCurrent != null);
vis = vis | (maincamera.mostCurrent != null);
vis = vis | (homeadmin.mostCurrent != null);
vis = vis | (worshipdetail.mostCurrent != null);
vis = vis | (worshipedit.mostCurrent != null);
vis = vis | (login.mostCurrent != null);
vis = vis | (worshipbuilding.mostCurrent != null);
vis = vis | (housebuilding.mostCurrent != null);
vis = vis | (healthdetail.mostCurrent != null);
vis = vis | (msmedetail.mostCurrent != null);
vis = vis | (officedetail.mostCurrent != null);
vis = vis | (housedetail.mostCurrent != null);
vis = vis | (home.mostCurrent != null);
vis = vis | (healthbuilding.mostCurrent != null);
vis = vis | (gallery.mostCurrent != null);
vis = vis | (officebuilding.mostCurrent != null);
vis = vis | (educationalbuilding.mostCurrent != null);
vis = vis | (msmebuilding.mostCurrent != null);
vis = vis | (officeedit.mostCurrent != null);
vis = vis | (msmeedit.mostCurrent != null);
vis = vis | (buildinglist.mostCurrent != null);
vis = vis | (maplocation.mostCurrent != null);
vis = vis | (help.mostCurrent != null);
vis = vis | (healthedit.mostCurrent != null);
return vis;}
public static void  _activity_create(boolean _firsttime) throws Exception{
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(b4a.example.main parent,boolean _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
b4a.example.main parent;
boolean _firsttime;
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _segoeui = null;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 51;BA.debugLine="CheckLoginSession";
_checkloginsession();
 //BA.debugLineNum = 52;BA.debugLine="If FirstTime Then 'jika aplikasi pertama diaktifk";
if (true) break;

case 1:
//if
this.state = 6;
if (_firsttime) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 53;BA.debugLine="kvs.Initialize(File.DirInternal, \"datastore\")";
parent._kvs._initialize(processBA,anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"datastore");
 //BA.debugLineNum = 54;BA.debugLine="Activity.LoadLayout(\"splash\")";
parent.mostCurrent._activity.LoadLayout("splash",mostCurrent.activityBA);
 //BA.debugLineNum = 55;BA.debugLine="AnimSplash 'Panggil function animasi splash scre";
_animsplash();
 //BA.debugLineNum = 56;BA.debugLine="tmSplash.Initialize(\"tmSplash\",3500) 'panggil ev";
parent._tmsplash.Initialize(processBA,"tmSplash",(long) (3500));
 //BA.debugLineNum = 57;BA.debugLine="tmSplash.Enabled = True 'aktifkan timer";
parent._tmsplash.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 59;BA.debugLine="Activity.RemoveAllViews 'Hapus Design pada layou";
parent.mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 60;BA.debugLine="Activity.LoadLayout(\"Welcome\")";
parent.mostCurrent._activity.LoadLayout("Welcome",mostCurrent.activityBA);
 //BA.debugLineNum = 61;BA.debugLine="Dim Segoeui As Typeface";
_segoeui = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
 //BA.debugLineNum = 62;BA.debugLine="Segoeui =Typeface.LoadFromAssets(\"SEGOEUI.TTF\")";
_segoeui.setObject((android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("SEGOEUI.TTF")));
 //BA.debugLineNum = 66;BA.debugLine="LblWelcome2.Typeface = Segoeui";
parent.mostCurrent._lblwelcome2.setTypeface((android.graphics.Typeface)(_segoeui.getObject()));
 //BA.debugLineNum = 67;BA.debugLine="LblSignin.Typeface = Segoeui";
parent.mostCurrent._lblsignin.setTypeface((android.graphics.Typeface)(_segoeui.getObject()));
 if (true) break;
;
 //BA.debugLineNum = 70;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";

case 6:
//if
this.state = 17;
if (parent.mostCurrent._starter._gps1.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 17;
 //BA.debugLineNum = 71;BA.debugLine="ToastMessageShow(\"Please enable the GPS device.\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please enable the GPS device."),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 72;BA.debugLine="StartActivity(Starter.GPS1.LocationSettingsInten";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._starter._gps1.getLocationSettingsIntent()));
 if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 74;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
parent.mostCurrent._starter._rp.CheckAndRequest(processBA,parent.mostCurrent._starter._rp.PERMISSION_ACCESS_FINE_LOCATION);
 //BA.debugLineNum = 75;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, this, null);
this.state = 18;
return;
case 18:
//C
this.state = 11;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 //BA.debugLineNum = 76;BA.debugLine="If Result Then CallSubDelayed(Starter, \"StartGPS";
if (true) break;

case 11:
//if
this.state = 16;
if (_result) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._starter.getObject()),"StartGPS");
if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = -1;
;
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _activity_permissionresult(String _permission,boolean _result) throws Exception{
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 109;BA.debugLine="SetAnimation(\"zoom_enter\", \"zoom_exit\")";
_setanimation("zoom_enter","zoom_exit");
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public static String  _animsplash() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub AnimSplash()";
 //BA.debugLineNum = 95;BA.debugLine="If btAnim.IsInitialized Then";
if (mostCurrent._btanim.IsInitialized()) { 
 //BA.debugLineNum = 96;BA.debugLine="btAnim.Stop(ImageView1)";
mostCurrent._btanim.Stop((android.view.View)(mostCurrent._imageview1.getObject()));
 //BA.debugLineNum = 97;BA.debugLine="Activity.Invalidate";
mostCurrent._activity.Invalidate();
 };
 //BA.debugLineNum = 99;BA.debugLine="btAnim.InitializeTranslate( \"AllFunction.btAnim\",";
mostCurrent._btanim.InitializeTranslate(mostCurrent.activityBA,"AllFunction.btAnim",(float) (0),(float) (-mostCurrent._activity.getHeight()),(float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))),(float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))));
 //BA.debugLineNum = 100;BA.debugLine="btAnim.SetInterpolator(btAnim.INTERPOLATOR_BOUNCE";
mostCurrent._btanim.SetInterpolator(mostCurrent._btanim.INTERPOLATOR_BOUNCE);
 //BA.debugLineNum = 101;BA.debugLine="btAnim.Duration = 1500";
mostCurrent._btanim.setDuration((long) (1500));
 //BA.debugLineNum = 102;BA.debugLine="btAnim.Start(ImageView1)	'Jlaankan animasi pada o";
mostCurrent._btanim.Start((android.view.View)(mostCurrent._imageview1.getObject()));
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public static String  _btnadmin_click() throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub BtnAdmin_Click";
 //BA.debugLineNum = 184;BA.debugLine="StartActivity(Login)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._login.getObject()));
 //BA.debugLineNum = 185;BA.debugLine="SetAnimation(\"zoom_enter\", \"zoom_exit\")";
_setanimation("zoom_enter","zoom_exit");
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return "";
}
public static String  _btnguest_click() throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub BtnGuest_Click";
 //BA.debugLineNum = 179;BA.debugLine="StartActivity(Home)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._home.getObject()));
 //BA.debugLineNum = 180;BA.debugLine="SetAnimation(\"zoom_enter\", \"zoom_exit\")";
_setanimation("zoom_enter","zoom_exit");
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return "";
}
public static String  _checkloginsession() throws Exception{
boolean _islogin = false;
 //BA.debugLineNum = 79;BA.debugLine="Sub CheckLoginSession()";
 //BA.debugLineNum = 80;BA.debugLine="Dim isLogin As Boolean";
_islogin = false;
 //BA.debugLineNum = 81;BA.debugLine="isLogin = Login.manager.GetBoolean(\"is_login\")";
_islogin = mostCurrent._login._manager.GetBoolean("is_login");
 //BA.debugLineNum = 83;BA.debugLine="If isLogin Then";
if (_islogin) { 
 //BA.debugLineNum = 84;BA.debugLine="StartActivity(HomeAdmin)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homeadmin.getObject()));
 //BA.debugLineNum = 85;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 38;BA.debugLine="Private BtnGuest As Button";
mostCurrent._btnguest = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private BtnAdmin As Button";
mostCurrent._btnadmin = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Public btAnim As AnimationPlus  'animasi object b";
mostCurrent._btanim = new flm.b4a.animationplus.AnimationPlusWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private LblWelcome As Label";
mostCurrent._lblwelcome = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private LblWelcome2 As Label";
mostCurrent._lblwelcome2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private LblSignin As Label";
mostCurrent._lblsignin = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private ImageView1 As ImageView";
mostCurrent._imageview1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private CheckBox1 As CheckBox";
mostCurrent._checkbox1 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public static String  _gpsstatus(anywheresoftware.b4a.objects.collections.List _satellites) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
anywheresoftware.b4a.gps.GpsSatelliteWrapper _satellite = null;
 //BA.debugLineNum = 112;BA.debugLine="Public Sub GpsStatus (Satellites As List)";
 //BA.debugLineNum = 113;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 114;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 115;BA.debugLine="sb.Append(\"Satellites:\").Append(CRLF)";
_sb.Append("Satellites:").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 116;BA.debugLine="For i = 0 To Satellites.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_satellites.getSize()-1);
_i = (int) (0) ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
 //BA.debugLineNum = 117;BA.debugLine="Dim Satellite As GPSSatellite = Satellites.Get(i";
_satellite = new anywheresoftware.b4a.gps.GpsSatelliteWrapper();
_satellite.setObject((android.location.GpsSatellite)(_satellites.Get(_i)));
 //BA.debugLineNum = 118;BA.debugLine="sb.Append(CRLF).Append(Satellite.Prn).Append($\"";
_sb.Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(BA.NumberToString(_satellite.getPrn())).Append((" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.2",(Object)(_satellite.getSnr()))+"")).Append(" ").Append(BA.ObjectToString(_satellite.getUsedInFix()));
 //BA.debugLineNum = 119;BA.debugLine="sb.Append(\" \").Append($\" $1.2{Satellite.Azimuth}";
_sb.Append(" ").Append((" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.2",(Object)(_satellite.getAzimuth()))+"")).Append((" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.2",(Object)(_satellite.getElevation()))+""));
 }
};
 //BA.debugLineNum = 121;BA.debugLine="lblSatellites = sb.ToString";
_lblsatellites = _sb.ToString();
 //BA.debugLineNum = 122;BA.debugLine="Log(lblSatellites)";
anywheresoftware.b4a.keywords.Common.Log(_lblsatellites);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public static String  _locationchanged(anywheresoftware.b4a.gps.LocationWrapper _location1) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Public Sub LocationChanged(Location1 As Location)";
 //BA.debugLineNum = 126;BA.debugLine="lblLat = \"Lat = \" & Location1.ConvertToMinutes(Lo";
_lbllat = "Lat = "+_location1.ConvertToMinutes(_location1.getLatitude());
 //BA.debugLineNum = 127;BA.debugLine="lblLon = \"Lon = \" & Location1.ConvertToMinutes(Lo";
_lbllon = "Lon = "+_location1.ConvertToMinutes(_location1.getLongitude());
 //BA.debugLineNum = 128;BA.debugLine="lblSpeed= $\"Speed = $1.2{Location1.Speed} m/s \"$";
_lblspeed = ("Speed = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.2",(Object)(_location1.getSpeed()))+" m/s ");
 //BA.debugLineNum = 130;BA.debugLine="Log(\"Speed : \"&lblSpeed)";
anywheresoftware.b4a.keywords.Common.Log("Speed : "+_lblspeed);
 //BA.debugLineNum = 131;BA.debugLine="Log(\"Lat : \"&lblLat)";
anywheresoftware.b4a.keywords.Common.Log("Lat : "+_lbllat);
 //BA.debugLineNum = 132;BA.debugLine="Log(\"Long : \"&lblLon)";
anywheresoftware.b4a.keywords.Common.Log("Long : "+_lbllon);
 //BA.debugLineNum = 133;BA.debugLine="kvs.Put(\"lat\",lblLat)";
_kvs._put("lat",(Object)(_lbllat));
 //BA.debugLineNum = 134;BA.debugLine="kvs.Put(\"Long\",lblLon)";
_kvs._put("Long",(Object)(_lbllon));
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        anywheresoftware.b4a.samples.httputils2.httputils2service._process_globals();
main._process_globals();
starter._process_globals();
editbuildingfacility._process_globals();
addbuildingfacility._process_globals();
educationaledit._process_globals();
educationaldetail._process_globals();
searchbuilding._process_globals();
maincamera._process_globals();
homeadmin._process_globals();
worshipdetail._process_globals();
worshipedit._process_globals();
login._process_globals();
worshipbuilding._process_globals();
housebuilding._process_globals();
healthdetail._process_globals();
msmedetail._process_globals();
officedetail._process_globals();
housedetail._process_globals();
home._process_globals();
healthbuilding._process_globals();
gallery._process_globals();
officebuilding._process_globals();
educationalbuilding._process_globals();
msmebuilding._process_globals();
officeedit._process_globals();
msmeedit._process_globals();
buildinglist._process_globals();
maplocation._process_globals();
help._process_globals();
healthedit._process_globals();
searchworship._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 21;BA.debugLine="Dim kvs As KeyValueStore";
_kvs = new b4a.example3.keyvaluestore();
 //BA.debugLineNum = 25;BA.debugLine="Dim tmSplash As Timer 'timer untuk animasi splash";
_tmsplash = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 26;BA.debugLine="Dim Server As String = \"https://a0982b8e.ngrok.io";
_server = "https://a0982b8e.ngrok.io/gisbuilding_mobile/";
 //BA.debugLineNum = 27;BA.debugLine="Dim ServerMap As String = Server";
_servermap = _server;
 //BA.debugLineNum = 28;BA.debugLine="Dim lblLon As String";
_lbllon = "";
 //BA.debugLineNum = 29;BA.debugLine="Dim lblLat As String";
_lbllat = "";
 //BA.debugLineNum = 30;BA.debugLine="Dim lblSpeed As String";
_lblspeed = "";
 //BA.debugLineNum = 31;BA.debugLine="Dim lblSatellites As String";
_lblsatellites = "";
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static String  _setanimation(String _inanimation,String _outanimation) throws Exception{
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
String _package = "";
int _in = 0;
int _out = 0;
 //BA.debugLineNum = 167;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
 //BA.debugLineNum = 168;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 169;BA.debugLine="Dim package As String";
_package = "";
 //BA.debugLineNum = 170;BA.debugLine="Dim in, out As Int";
_in = 0;
_out = 0;
 //BA.debugLineNum = 171;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
_package = BA.ObjectToString(_r.GetStaticField("anywheresoftware.b4a.BA","packageName"));
 //BA.debugLineNum = 172;BA.debugLine="in = r.GetStaticField(package & \".R$anim\", InAnim";
_in = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_inanimation)));
 //BA.debugLineNum = 173;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
_out = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_outanimation)));
 //BA.debugLineNum = 174;BA.debugLine="r.Target = r.GetActivity";
_r.Target = (Object)(_r.GetActivity(processBA));
 //BA.debugLineNum = 175;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
_r.RunMethod4("overridePendingTransition",new Object[]{(Object)(_in),(Object)(_out)},new String[]{"java.lang.int","java.lang.int"});
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public static String  _tmsplash_tick() throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub tmSplash_Tick";
 //BA.debugLineNum = 89;BA.debugLine="tmSplash.Enabled = False 'disable timer";
_tmsplash.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 90;BA.debugLine="Activity.RemoveAllViews 'Hapus Design pada layout";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 91;BA.debugLine="Activity.LoadLayout(\"Welcome\") 'load layout lyHom";
mostCurrent._activity.LoadLayout("Welcome",mostCurrent.activityBA);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
}
