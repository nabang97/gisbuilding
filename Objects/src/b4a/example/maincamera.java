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

public class maincamera extends Activity implements B4AActivity{
	public static maincamera mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.maincamera");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (maincamera).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.maincamera");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.maincamera", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (maincamera) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (maincamera) Resume **");
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
		return maincamera.class;
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
        BA.LogInfo("** Activity (maincamera) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (maincamera) Resume **");
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
public static boolean _frontcamera = false;
public static boolean _videomode = false;
public static String _videofiledir = "";
public static String _videofilename = "";
public static int _mytaskindex = 0;
public static anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static String _namefile = "";
public b4a.example.camex2 _cam = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlcamera = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlpicture = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlbackground = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btneffects = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnscene = null;
public anywheresoftware.b4a.objects.collections.List _buttons = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnautoexposure = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnfocus = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _progressbar1 = null;
public static boolean _openstate = false;
public static boolean _busystate = false;
public anywheresoftware.b4a.objects.ButtonWrapper _btnrecord = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnmode = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncamera = null;
public anywheresoftware.b4a.objects.SeekBarWrapper _barzoom = null;
public anywheresoftware.b4a.objects.ButtonWrapper _saveimgbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _cancelsavebtn = null;
public static String _idbuilding = "";
public static String _buildingtype = "";
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
public b4a.example.login _login = null;
public b4a.example.addfacilitytype _addfacilitytype = null;
public b4a.example.editbuildingfacility _editbuildingfacility = null;
public b4a.example.addbuildingfacility _addbuildingfacility = null;
public b4a.example.officeedit _officeedit = null;
public b4a.example.msmebuilding _msmebuilding = null;
public b4a.example.worshipbuilding _worshipbuilding = null;
public b4a.example.addphoto _addphoto = null;
public b4a.example.loaderimage _loaderimage = null;
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
RDebugUtils.currentModule="maincamera";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="VideoFileDir = rp.GetSafeDirDefaultExternal(\"temp";
_videofiledir = _rp.GetSafeDirDefaultExternal("temp");
RDebugUtils.currentLine=21364739;
 //BA.debugLineNum = 21364739;BA.debugLine="Activity.LoadLayout(\"1\")";
mostCurrent._activity.LoadLayout("1",mostCurrent.activityBA);
RDebugUtils.currentLine=21364740;
 //BA.debugLineNum = 21364740;BA.debugLine="Activity.LoadLayout(\"StillPicture\")";
mostCurrent._activity.LoadLayout("StillPicture",mostCurrent.activityBA);
RDebugUtils.currentLine=21364741;
 //BA.debugLineNum = 21364741;BA.debugLine="cam.Initialize(pnlCamera)";
mostCurrent._cam._initialize(null,mostCurrent.activityBA,mostCurrent._pnlcamera);
RDebugUtils.currentLine=21364742;
 //BA.debugLineNum = 21364742;BA.debugLine="Log(cam.SupportedHardwareLevel)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._cam._getsupportedhardwarelevel(null));
RDebugUtils.currentLine=21364743;
 //BA.debugLineNum = 21364743;BA.debugLine="buttons = Array(btnScene, btnAutoExposure, btnEff";
mostCurrent._buttons = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(mostCurrent._btnscene.getObject()),(Object)(mostCurrent._btnautoexposure.getObject()),(Object)(mostCurrent._btneffects.getObject()),(Object)(mostCurrent._btnfocus.getObject()),(Object)(mostCurrent._btnmode.getObject())});
RDebugUtils.currentLine=21364744;
 //BA.debugLineNum = 21364744;BA.debugLine="SetState(False, False, VideoMode)";
_setstate(anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,_videomode);
RDebugUtils.currentLine=21364746;
 //BA.debugLineNum = 21364746;BA.debugLine="If Home.HomeBuilding.Length > 0 Then";
if (mostCurrent._home._homebuilding.length()>0) { 
RDebugUtils.currentLine=21364747;
 //BA.debugLineNum = 21364747;BA.debugLine="Log(Home.HomeBuilding)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._home._homebuilding);
RDebugUtils.currentLine=21364748;
 //BA.debugLineNum = 21364748;BA.debugLine="Select Home.HomeBuilding";
switch (BA.switchObjectToInt(mostCurrent._home._homebuilding,"Worship","Office","Health","Msme","Educational")) {
case 0: {
RDebugUtils.currentLine=21364750;
 //BA.debugLineNum = 21364750;BA.debugLine="If WorshipBuilding.idBuilding.Length > 0 Then";
if (mostCurrent._worshipbuilding._idbuilding.length()>0) { 
RDebugUtils.currentLine=21364751;
 //BA.debugLineNum = 21364751;BA.debugLine="idBuilding= WorshipBuilding.idBuilding";
mostCurrent._idbuilding = mostCurrent._worshipbuilding._idbuilding;
RDebugUtils.currentLine=21364752;
 //BA.debugLineNum = 21364752;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._idbuilding);
 }else {
RDebugUtils.currentLine=21364754;
 //BA.debugLineNum = 21364754;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=21364755;
 //BA.debugLineNum = 21364755;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 1: {
RDebugUtils.currentLine=21364758;
 //BA.debugLineNum = 21364758;BA.debugLine="If OfficeBuilding.idBuilding.Length > 0 Then";
if (mostCurrent._officebuilding._idbuilding.length()>0) { 
RDebugUtils.currentLine=21364759;
 //BA.debugLineNum = 21364759;BA.debugLine="idBuilding= OfficeBuilding.idBuilding";
mostCurrent._idbuilding = mostCurrent._officebuilding._idbuilding;
RDebugUtils.currentLine=21364760;
 //BA.debugLineNum = 21364760;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._idbuilding);
 }else {
RDebugUtils.currentLine=21364762;
 //BA.debugLineNum = 21364762;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=21364763;
 //BA.debugLineNum = 21364763;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 2: {
RDebugUtils.currentLine=21364766;
 //BA.debugLineNum = 21364766;BA.debugLine="If HealthBuilding.idBuilding.Length > 0 Then";
if (mostCurrent._healthbuilding._idbuilding.length()>0) { 
RDebugUtils.currentLine=21364767;
 //BA.debugLineNum = 21364767;BA.debugLine="idBuilding= HealthBuilding.idBuilding";
mostCurrent._idbuilding = mostCurrent._healthbuilding._idbuilding;
RDebugUtils.currentLine=21364768;
 //BA.debugLineNum = 21364768;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._idbuilding);
 }else {
RDebugUtils.currentLine=21364770;
 //BA.debugLineNum = 21364770;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=21364771;
 //BA.debugLineNum = 21364771;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 3: {
RDebugUtils.currentLine=21364774;
 //BA.debugLineNum = 21364774;BA.debugLine="If MsmeBuilding.idBuilding.Length > 0 Then";
if (mostCurrent._msmebuilding._idbuilding.length()>0) { 
RDebugUtils.currentLine=21364775;
 //BA.debugLineNum = 21364775;BA.debugLine="idBuilding= MsmeBuilding.idBuilding";
mostCurrent._idbuilding = mostCurrent._msmebuilding._idbuilding;
RDebugUtils.currentLine=21364776;
 //BA.debugLineNum = 21364776;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._idbuilding);
 }else {
RDebugUtils.currentLine=21364778;
 //BA.debugLineNum = 21364778;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=21364779;
 //BA.debugLineNum = 21364779;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 4: {
RDebugUtils.currentLine=21364782;
 //BA.debugLineNum = 21364782;BA.debugLine="If EducationalBuilding.idBuilding.Length > 0 T";
if (mostCurrent._educationalbuilding._idbuilding.length()>0) { 
RDebugUtils.currentLine=21364783;
 //BA.debugLineNum = 21364783;BA.debugLine="idBuilding= EducationalBuilding.idBuilding";
mostCurrent._idbuilding = mostCurrent._educationalbuilding._idbuilding;
RDebugUtils.currentLine=21364784;
 //BA.debugLineNum = 21364784;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._idbuilding);
 }else {
RDebugUtils.currentLine=21364786;
 //BA.debugLineNum = 21364786;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=21364787;
 //BA.debugLineNum = 21364787;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
default: {
RDebugUtils.currentLine=21364790;
 //BA.debugLineNum = 21364790;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=21364791;
 //BA.debugLineNum = 21364791;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 break; }
}
;
 }else 
{RDebugUtils.currentLine=21364793;
 //BA.debugLineNum = 21364793;BA.debugLine="Else If SearchBuilding.idspin.Length > 0 Then";
if (mostCurrent._searchbuilding._idspin.length()>0) { 
RDebugUtils.currentLine=21364794;
 //BA.debugLineNum = 21364794;BA.debugLine="buildingtype = SearchBuilding.idspin";
mostCurrent._buildingtype = mostCurrent._searchbuilding._idspin;
RDebugUtils.currentLine=21364795;
 //BA.debugLineNum = 21364795;BA.debugLine="Log(buildingtype)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._buildingtype);
RDebugUtils.currentLine=21364796;
 //BA.debugLineNum = 21364796;BA.debugLine="If SearchBuilding.idBuilding.Length > 0 Then";
if (mostCurrent._searchbuilding._idbuilding.length()>0) { 
RDebugUtils.currentLine=21364797;
 //BA.debugLineNum = 21364797;BA.debugLine="idBuilding = SearchBuilding.idBuilding";
mostCurrent._idbuilding = mostCurrent._searchbuilding._idbuilding;
RDebugUtils.currentLine=21364798;
 //BA.debugLineNum = 21364798;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._idbuilding);
 }else {
RDebugUtils.currentLine=21364800;
 //BA.debugLineNum = 21364800;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=21364801;
 //BA.debugLineNum = 21364801;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 }}
;
RDebugUtils.currentLine=21364804;
 //BA.debugLineNum = 21364804;BA.debugLine="End Sub";
return "";
}
public static String  _setstate(boolean _open,boolean _busy,boolean _video) throws Exception{
RDebugUtils.currentModule="maincamera";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setstate"))
	return (String) Debug.delegate(mostCurrent.activityBA, "setstate", new Object[] {_open,_busy,_video});
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
String _btnrecordtext = "";
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Sub SetState(Open As Boolean, Busy As Boolean, Vid";
RDebugUtils.currentLine=22413313;
 //BA.debugLineNum = 22413313;BA.debugLine="For Each b As Button In buttons";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = mostCurrent._buttons;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b.setObject((android.widget.Button)(group1.Get(index1)));
RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="b.Visible = Open And Not(Busy)";
_b.setVisible(_open && anywheresoftware.b4a.keywords.Common.Not(_busy));
 }
};
RDebugUtils.currentLine=22413316;
 //BA.debugLineNum = 22413316;BA.debugLine="btnCamera.Visible = Not(Busy)";
mostCurrent._btncamera.setVisible(anywheresoftware.b4a.keywords.Common.Not(_busy));
RDebugUtils.currentLine=22413317;
 //BA.debugLineNum = 22413317;BA.debugLine="btnRecord.Visible = Open And (Video Or Not(Busy))";
mostCurrent._btnrecord.setVisible(_open && (_video || anywheresoftware.b4a.keywords.Common.Not(_busy)));
RDebugUtils.currentLine=22413318;
 //BA.debugLineNum = 22413318;BA.debugLine="openstate = Open";
_openstate = _open;
RDebugUtils.currentLine=22413319;
 //BA.debugLineNum = 22413319;BA.debugLine="ProgressBar1.Visible = Busy";
mostCurrent._progressbar1.setVisible(_busy);
RDebugUtils.currentLine=22413320;
 //BA.debugLineNum = 22413320;BA.debugLine="busystate = Busy";
_busystate = _busy;
RDebugUtils.currentLine=22413321;
 //BA.debugLineNum = 22413321;BA.debugLine="VideoMode = Video";
_videomode = _video;
RDebugUtils.currentLine=22413322;
 //BA.debugLineNum = 22413322;BA.debugLine="barZoom.Visible = Open";
mostCurrent._barzoom.setVisible(_open);
RDebugUtils.currentLine=22413323;
 //BA.debugLineNum = 22413323;BA.debugLine="Dim btnRecordText As String";
_btnrecordtext = "";
RDebugUtils.currentLine=22413324;
 //BA.debugLineNum = 22413324;BA.debugLine="If VideoMode Then";
if (_videomode) { 
RDebugUtils.currentLine=22413325;
 //BA.debugLineNum = 22413325;BA.debugLine="If Busy Then";
if (_busy) { 
RDebugUtils.currentLine=22413326;
 //BA.debugLineNum = 22413326;BA.debugLine="btnRecordText = Chr(0xF04D)";
_btnrecordtext = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf04d)));
 }else {
RDebugUtils.currentLine=22413328;
 //BA.debugLineNum = 22413328;BA.debugLine="btnRecordText = Chr(0xF03D)";
_btnrecordtext = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf03d)));
 };
 }else {
RDebugUtils.currentLine=22413331;
 //BA.debugLineNum = 22413331;BA.debugLine="btnRecordText = Chr(0xF030)";
_btnrecordtext = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf030)));
 };
RDebugUtils.currentLine=22413333;
 //BA.debugLineNum = 22413333;BA.debugLine="btnRecord.Text = btnRecordText";
mostCurrent._btnrecord.setText(BA.ObjectToCharSequence(_btnrecordtext));
RDebugUtils.currentLine=22413334;
 //BA.debugLineNum = 22413334;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="maincamera";
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="cam.Stop";
mostCurrent._cam._stop(null);
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="maincamera";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="OpenCamera(frontCamera)";
_opencamera(_frontcamera);
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="End Sub";
return "";
}
public static void  _opencamera(boolean _front) throws Exception{
ResumableSub_OpenCamera rsub = new ResumableSub_OpenCamera(null,_front);
rsub.resume(processBA, null);
}
public static class ResumableSub_OpenCamera extends BA.ResumableSub {
public ResumableSub_OpenCamera(b4a.example.maincamera parent,boolean _front) {
this.parent = parent;
this._front = _front;
}
b4a.example.maincamera parent;
boolean _front;
String _permission = "";
boolean _result = false;
int _taskindex = 0;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="maincamera";
Debug.delegate(mostCurrent.activityBA, "opencamera", new Object[] {_front});
if (true) return;
    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_CAMERA);
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, this, null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="If Result = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="ToastMessageShow(\"No permission!\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No permission!"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21495813;
 //BA.debugLineNum = 21495813;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=21495816;
 //BA.debugLineNum = 21495816;BA.debugLine="SetState(False, False, VideoMode)";
_setstate(anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,parent._videomode);
RDebugUtils.currentLine=21495817;
 //BA.debugLineNum = 21495817;BA.debugLine="Wait For (cam.OpenCamera(front)) Complete (TaskIn";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._cam._opencamera(null,_front));
this.state = 14;
return;
case 14:
//C
this.state = 5;
_taskindex = (Integer) result[0];
;
RDebugUtils.currentLine=21495818;
 //BA.debugLineNum = 21495818;BA.debugLine="If TaskIndex > 0 Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_taskindex>0) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=21495819;
 //BA.debugLineNum = 21495819;BA.debugLine="MyTaskIndex = TaskIndex 'hold this index. It wil";
parent._mytaskindex = _taskindex;
RDebugUtils.currentLine=21495820;
 //BA.debugLineNum = 21495820;BA.debugLine="Wait For(PrepareSurface) Complete (Success As Bo";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _preparesurface());
this.state = 15;
return;
case 15:
//C
this.state = 8;
_success = (Boolean) result[0];
;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=21495822;
 //BA.debugLineNum = 21495822;BA.debugLine="Log(\"Start success: \" & Success)";
anywheresoftware.b4a.keywords.Common.Log("Start success: "+BA.ObjectToString(_success));
RDebugUtils.currentLine=21495823;
 //BA.debugLineNum = 21495823;BA.debugLine="SetState(Success, False, VideoMode)";
_setstate(_success,anywheresoftware.b4a.keywords.Common.False,parent._videomode);
RDebugUtils.currentLine=21495824;
 //BA.debugLineNum = 21495824;BA.debugLine="If Success = False Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_success==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=21495825;
 //BA.debugLineNum = 21495825;BA.debugLine="ToastMessageShow(\"Failed to open camera\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Failed to open camera"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=21495827;
 //BA.debugLineNum = 21495827;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _barzoom_valuechanged(int _value,boolean _userchanged) throws Exception{
RDebugUtils.currentModule="maincamera";
if (Debug.shouldDelegate(mostCurrent.activityBA, "barzoom_valuechanged"))
	return (String) Debug.delegate(mostCurrent.activityBA, "barzoom_valuechanged", new Object[] {_value,_userchanged});
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _originalsize = null;
float _zoom = 0f;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _crop = null;
int _newwidth = 0;
int _newheight = 0;
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Sub barZoom_ValueChanged (Value As Int, UserChange";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="Dim OriginalSize As Rect = cam.ActiveArraySize";
_originalsize = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
_originalsize = mostCurrent._cam._getactivearraysize(null);
RDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="Dim Zoom As Float = 1 + Value / 100 * (cam.MaxDig";
_zoom = (float) (1+_value/(double)100*(mostCurrent._cam._getmaxdigitalzoom(null)-1));
RDebugUtils.currentLine=22478851;
 //BA.debugLineNum = 22478851;BA.debugLine="Dim Crop As Rect";
_crop = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=22478852;
 //BA.debugLineNum = 22478852;BA.debugLine="Dim NewWidth As Int = OriginalSize.Width / Zoom";
_newwidth = (int) (_originalsize.getWidth()/(double)_zoom);
RDebugUtils.currentLine=22478853;
 //BA.debugLineNum = 22478853;BA.debugLine="Dim NewHeight As Int = OriginalSize.Height / Zoom";
_newheight = (int) (_originalsize.getHeight()/(double)_zoom);
RDebugUtils.currentLine=22478854;
 //BA.debugLineNum = 22478854;BA.debugLine="Crop.Initialize(OriginalSize.CenterX - NewWidth /";
_crop.Initialize((int) (_originalsize.getCenterX()-_newwidth/(double)2),(int) (_originalsize.getCenterY()-_newheight/(double)2),(int) (_originalsize.getCenterX()+_newwidth/(double)2),(int) (_originalsize.getCenterY()+_newheight/(double)2));
RDebugUtils.currentLine=22478856;
 //BA.debugLineNum = 22478856;BA.debugLine="cam.PreviewCropRegion = Crop";
mostCurrent._cam._setpreviewcropregion(null,_crop);
RDebugUtils.currentLine=22478857;
 //BA.debugLineNum = 22478857;BA.debugLine="cam.StartPreview(MyTaskIndex, VideoMode)";
mostCurrent._cam._startpreview(null,_mytaskindex,_videomode);
RDebugUtils.currentLine=22478858;
 //BA.debugLineNum = 22478858;BA.debugLine="End Sub";
return "";
}
public static String  _btnautoexposure_click() throws Exception{
RDebugUtils.currentModule="maincamera";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnautoexposure_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnautoexposure_click", null);
anywheresoftware.b4a.objects.collections.List _flashes = null;
int _i = 0;
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Sub btnAutoExposure_Click";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="Dim flashes As List = cam.SupportedAutoExposureMo";
_flashes = new anywheresoftware.b4a.objects.collections.List();
_flashes = mostCurrent._cam._getsupportedautoexposuremodes(null);
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="Dim i As Int = flashes.IndexOf(cam.AutoExposureMo";
_i = _flashes.IndexOf((Object)(mostCurrent._cam._getautoexposuremode(null)));
RDebugUtils.currentLine=22282243;
 //BA.debugLineNum = 22282243;BA.debugLine="i = (i + 1) Mod flashes.Size";
_i = (int) ((_i+1)%_flashes.getSize());
RDebugUtils.currentLine=22282244;
 //BA.debugLineNum = 22282244;BA.debugLine="cam.AutoExposureMode = flashes.Get(i)";
mostCurrent._cam._setautoexposuremode(null,BA.ObjectToString(_flashes.Get(_i)));
RDebugUtils.currentLine=22282245;
 //BA.debugLineNum = 22282245;BA.debugLine="btnAutoExposure.Text = flashes.Get(i)";
mostCurrent._btnautoexposure.setText(BA.ObjectToCharSequence(_flashes.Get(_i)));
RDebugUtils.currentLine=22282246;
 //BA.debugLineNum = 22282246;BA.debugLine="cam.StartPreview(MyTaskIndex, VideoMode)";
mostCurrent._cam._startpreview(null,_mytaskindex,_videomode);
RDebugUtils.currentLine=22282247;
 //BA.debugLineNum = 22282247;BA.debugLine="End Sub";
return "";
}
public static String  _btncamera_click() throws Exception{
RDebugUtils.currentModule="maincamera";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncamera_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btncamera_click", null);
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Sub btnCamera_Click";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="frontCamera = Not(frontCamera)";
_frontcamera = anywheresoftware.b4a.keywords.Common.Not(_frontcamera);
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="OpenCamera(frontCamera)";
_opencamera(_frontcamera);
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="End Sub";
return "";
}
public static String  _btneffects_click() throws Exception{
RDebugUtils.currentModule="maincamera";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btneffects_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btneffects_click", null);
anywheresoftware.b4a.objects.collections.List _effects = null;
int _i = 0;
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Sub btnEffects_Click";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="Dim effects As List = cam.SupportedEffectModes";
_effects = new anywheresoftware.b4a.objects.collections.List();
_effects = mostCurrent._cam._getsupportedeffectmodes(null);
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="Dim i As Int = effects.IndexOf(cam.EffectMode)";
_i = _effects.IndexOf((Object)(mostCurrent._cam._geteffectmode(null)));
RDebugUtils.currentLine=22151171;
 //BA.debugLineNum = 22151171;BA.debugLine="i = (i + 1) Mod effects.Size";
_i = (int) ((_i+1)%_effects.getSize());
RDebugUtils.currentLine=22151172;
 //BA.debugLineNum = 22151172;BA.debugLine="cam.EffectMode = effects.Get(i)";
mostCurrent._cam._seteffectmode(null,BA.ObjectToString(_effects.Get(_i)));
RDebugUtils.currentLine=22151173;
 //BA.debugLineNum = 22151173;BA.debugLine="btnEffects.Text = effects.Get(i)";
mostCurrent._btneffects.setText(BA.ObjectToCharSequence(_effects.Get(_i)));
RDebugUtils.currentLine=22151174;
 //BA.debugLineNum = 22151174;BA.debugLine="cam.StartPreview(MyTaskIndex, VideoMode)";
mostCurrent._cam._startpreview(null,_mytaskindex,_videomode);
RDebugUtils.currentLine=22151175;
 //BA.debugLineNum = 22151175;BA.debugLine="End Sub";
return "";
}
public static String  _btnfocus_click() throws Exception{
RDebugUtils.currentModule="maincamera";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnfocus_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnfocus_click", null);
anywheresoftware.b4a.objects.collections.List _focuses = null;
int _i = 0;
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Sub btnFocus_Click";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="Dim focuses As List = cam.SupportedFocusModes";
_focuses = new anywheresoftware.b4a.objects.collections.List();
_focuses = mostCurrent._cam._getsupportedfocusmodes(null);
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="Dim i As Int = focuses.IndexOf(cam.FocusMode)";
_i = _focuses.IndexOf((Object)(mostCurrent._cam._getfocusmode(null)));
RDebugUtils.currentLine=22347779;
 //BA.debugLineNum = 22347779;BA.debugLine="i = (i + 1) Mod focuses.Size";
_i = (int) ((_i+1)%_focuses.getSize());
RDebugUtils.currentLine=22347780;
 //BA.debugLineNum = 22347780;BA.debugLine="cam.FocusMode = focuses.Get(i)";
mostCurrent._cam._setfocusmode(null,BA.ObjectToString(_focuses.Get(_i)));
RDebugUtils.currentLine=22347781;
 //BA.debugLineNum = 22347781;BA.debugLine="btnFocus.Text = focuses.Get(i)";
mostCurrent._btnfocus.setText(BA.ObjectToCharSequence(_focuses.Get(_i)));
RDebugUtils.currentLine=22347782;
 //BA.debugLineNum = 22347782;BA.debugLine="cam.StartPreview(MyTaskIndex, VideoMode)";
mostCurrent._cam._startpreview(null,_mytaskindex,_videomode);
RDebugUtils.currentLine=22347783;
 //BA.debugLineNum = 22347783;BA.debugLine="End Sub";
return "";
}
public static void  _btnmode_click() throws Exception{
ResumableSub_btnMode_Click rsub = new ResumableSub_btnMode_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnMode_Click extends BA.ResumableSub {
public ResumableSub_btnMode_Click(b4a.example.maincamera parent) {
this.parent = parent;
}
b4a.example.maincamera parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="maincamera";
Debug.delegate(mostCurrent.activityBA, "btnmode_click", null);
if (true) return;
    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="VideoMode = Not(VideoMode)";
parent._videomode = anywheresoftware.b4a.keywords.Common.Not(parent._videomode);
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="If VideoMode Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent._videomode) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=21757955;
 //BA.debugLineNum = 21757955;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_RECORD_AUDIO)";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_RECORD_AUDIO);
RDebugUtils.currentLine=21757956;
 //BA.debugLineNum = 21757956;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, this, null);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=21757957;
 //BA.debugLineNum = 21757957;BA.debugLine="If Result = False Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_result==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=21757958;
 //BA.debugLineNum = 21757958;BA.debugLine="ToastMessageShow(\"No permission!\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No permission!"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21757959;
 //BA.debugLineNum = 21757959;BA.debugLine="VideoMode = False";
parent._videomode = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=21757962;
 //BA.debugLineNum = 21757962;BA.debugLine="SetState(openstate, busystate, VideoMode)";
_setstate(parent._openstate,parent._busystate,parent._videomode);
RDebugUtils.currentLine=21757963;
 //BA.debugLineNum = 21757963;BA.debugLine="PrepareSurface";
_preparesurface();
RDebugUtils.currentLine=21757964;
 //BA.debugLineNum = 21757964;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparesurface() throws Exception{
ResumableSub_PrepareSurface rsub = new ResumableSub_PrepareSurface(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareSurface extends BA.ResumableSub {
public ResumableSub_PrepareSurface(b4a.example.maincamera parent) {
this.parent = parent;
}
b4a.example.maincamera parent;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="maincamera";
Debug.delegate(mostCurrent.activityBA, "preparesurface", null);
if (true) return;
    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="SetState(False, busystate, VideoMode)";
_setstate(anywheresoftware.b4a.keywords.Common.False,parent._busystate,parent._videomode);
RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="If VideoMode Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._videomode) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="cam.PreviewSize.Initialize(640, 480)";
parent.mostCurrent._cam._previewsize.Initialize((int) (640),(int) (480));
RDebugUtils.currentLine=21561350;
 //BA.debugLineNum = 21561350;BA.debugLine="Wait For (cam.PrepareSurfaceForVideo(MyTaskIndex";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._cam._preparesurfaceforvideo(null,parent._mytaskindex,parent._videofiledir,"temp-"+parent._videofilename));
this.state = 12;
return;
case 12:
//C
this.state = 6;
_success = (Boolean) result[0];
;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=21561352;
 //BA.debugLineNum = 21561352;BA.debugLine="cam.PreviewSize.Initialize(1920, 1080)";
parent.mostCurrent._cam._previewsize.Initialize((int) (1920),(int) (1080));
RDebugUtils.currentLine=21561353;
 //BA.debugLineNum = 21561353;BA.debugLine="Wait For (cam.PrepareSurface(MyTaskIndex)) Compl";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._cam._preparesurface(null,parent._mytaskindex));
this.state = 13;
return;
case 13:
//C
this.state = 6;
_success = (Boolean) result[0];
;
 if (true) break;
;
RDebugUtils.currentLine=21561355;
 //BA.debugLineNum = 21561355;BA.debugLine="If Success Then cam.StartPreview(MyTaskIndex, Vid";

case 6:
//if
this.state = 11;
if (_success) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
parent.mostCurrent._cam._startpreview(null,parent._mytaskindex,parent._videomode);
if (true) break;

case 11:
//C
this.state = -1;
;
RDebugUtils.currentLine=21561356;
 //BA.debugLineNum = 21561356;BA.debugLine="SetState(Success, busystate, VideoMode)";
_setstate(_success,parent._busystate,parent._videomode);
RDebugUtils.currentLine=21561357;
 //BA.debugLineNum = 21561357;BA.debugLine="Return Success";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_success));return;};
RDebugUtils.currentLine=21561358;
 //BA.debugLineNum = 21561358;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnrecord_click() throws Exception{
RDebugUtils.currentModule="maincamera";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnrecord_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnrecord_click", null);
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Sub btnRecord_Click";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="If VideoMode Then";
if (_videomode) { 
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="CaptureVideo";
_capturevideo();
 }else {
RDebugUtils.currentLine=21823492;
 //BA.debugLineNum = 21823492;BA.debugLine="TakePicture";
_takepicture();
 };
RDebugUtils.currentLine=21823494;
 //BA.debugLineNum = 21823494;BA.debugLine="End Sub";
return "";
}
public static void  _capturevideo() throws Exception{
ResumableSub_CaptureVideo rsub = new ResumableSub_CaptureVideo(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CaptureVideo extends BA.ResumableSub {
public ResumableSub_CaptureVideo(b4a.example.maincamera parent) {
this.parent = parent;
}
b4a.example.maincamera parent;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="maincamera";
Debug.delegate(mostCurrent.activityBA, "capturevideo", null);
if (true) return;
    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="SetState(openstate, True, VideoMode)";
_setstate(parent._openstate,anywheresoftware.b4a.keywords.Common.True,parent._videomode);
RDebugUtils.currentLine=21889027;
 //BA.debugLineNum = 21889027;BA.debugLine="If cam.RecordingVideo = False Then";
if (true) break;

case 4:
//if
this.state = 9;
if (parent.mostCurrent._cam._recordingvideo==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=21889028;
 //BA.debugLineNum = 21889028;BA.debugLine="cam.StartVideoRecording (MyTaskIndex)";
parent.mostCurrent._cam._startvideorecording(null,parent._mytaskindex);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=21889030;
 //BA.debugLineNum = 21889030;BA.debugLine="cam.StopVideoRecording (MyTaskIndex)";
parent.mostCurrent._cam._stopvideorecording(null,parent._mytaskindex);
RDebugUtils.currentLine=21889031;
 //BA.debugLineNum = 21889031;BA.debugLine="File.Copy(VideoFileDir, \"temp-\" & VideoFileName";
anywheresoftware.b4a.keywords.Common.File.Copy(parent._videofiledir,"temp-"+parent._videofilename,parent._videofiledir,parent._videofilename);
RDebugUtils.currentLine=21889032;
 //BA.debugLineNum = 21889032;BA.debugLine="ToastMessageShow($\"Video file saved: $1.2{File.";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(("Video file saved: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.2",(Object)(anywheresoftware.b4a.keywords.Common.File.Size(parent._videofiledir,parent._videofilename)/(double)1024/(double)1024))+" MB")),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21889033;
 //BA.debugLineNum = 21889033;BA.debugLine="Wait For (PrepareSurface) Complete (Success As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _preparesurface());
this.state = 13;
return;
case 13:
//C
this.state = 9;
_success = (Boolean) result[0];
;
RDebugUtils.currentLine=21889034;
 //BA.debugLineNum = 21889034;BA.debugLine="SetState(openstate, False, VideoMode)";
_setstate(parent._openstate,anywheresoftware.b4a.keywords.Common.False,parent._videomode);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=21889038;
 //BA.debugLineNum = 21889038;BA.debugLine="HandleError(LastException)";
_handleerror(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=21889040;
 //BA.debugLineNum = 21889040;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static void  _takepicture() throws Exception{
ResumableSub_TakePicture rsub = new ResumableSub_TakePicture(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_TakePicture extends BA.ResumableSub {
public ResumableSub_TakePicture(b4a.example.maincamera parent) {
this.parent = parent;
}
b4a.example.maincamera parent;
byte[] _data = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="maincamera";
Debug.delegate(mostCurrent.activityBA, "takepicture", null);
if (true) return;
    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="SetState(openstate, True, VideoMode)";
_setstate(parent._openstate,anywheresoftware.b4a.keywords.Common.True,parent._videomode);
RDebugUtils.currentLine=22020099;
 //BA.debugLineNum = 22020099;BA.debugLine="Wait For(cam.FocusAndTakePicture(MyTaskIndex)) C";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._cam._focusandtakepicture(null,parent._mytaskindex));
this.state = 7;
return;
case 7:
//C
this.state = 6;
_data = (byte[]) result[0];
;
RDebugUtils.currentLine=22020100;
 //BA.debugLineNum = 22020100;BA.debugLine="SetState(openstate, False, VideoMode)";
_setstate(parent._openstate,anywheresoftware.b4a.keywords.Common.False,parent._videomode);
RDebugUtils.currentLine=22020101;
 //BA.debugLineNum = 22020101;BA.debugLine="Dim bmp As Bitmap = cam.DataToBitmap(data)";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = parent.mostCurrent._cam._datatobitmap(null,_data);
RDebugUtils.currentLine=22020102;
 //BA.debugLineNum = 22020102;BA.debugLine="Log(\"Picture taken: \" & bmp) 'ignore";
anywheresoftware.b4a.keywords.Common.Log("Picture taken: "+BA.ObjectToString(_bmp));
RDebugUtils.currentLine=22020103;
 //BA.debugLineNum = 22020103;BA.debugLine="pnlBackground.SetVisibleAnimated(100, True)";
parent.mostCurrent._pnlbackground.SetVisibleAnimated((int) (100),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22020104;
 //BA.debugLineNum = 22020104;BA.debugLine="pnlPicture.SetBackgroundImage(bmp.Resize(pnlPict";
parent.mostCurrent._pnlpicture.SetBackgroundImageNew((android.graphics.Bitmap)(_bmp.Resize((float) (parent.mostCurrent._pnlpicture.getWidth()),(float) (parent.mostCurrent._pnlpicture.getHeight()),anywheresoftware.b4a.keywords.Common.True).getObject())).setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=22020111;
 //BA.debugLineNum = 22020111;BA.debugLine="HandleError(LastException)";
_handleerror(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA));
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=22020114;
 //BA.debugLineNum = 22020114;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static String  _btnscene_click() throws Exception{
RDebugUtils.currentModule="maincamera";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnscene_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnscene_click", null);
anywheresoftware.b4a.objects.collections.List _scenes = null;
int _i = 0;
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Sub btnScene_Click";
RDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="Dim scenes As List = cam.SupportedSceneModes";
_scenes = new anywheresoftware.b4a.objects.collections.List();
_scenes = mostCurrent._cam._getsupportedscenemodes(null);
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="Dim i As Int = scenes.IndexOf(cam.SceneMode)";
_i = _scenes.IndexOf((Object)(mostCurrent._cam._getscenemode(null)));
RDebugUtils.currentLine=22216707;
 //BA.debugLineNum = 22216707;BA.debugLine="i = (i + 1) Mod scenes.Size";
_i = (int) ((_i+1)%_scenes.getSize());
RDebugUtils.currentLine=22216708;
 //BA.debugLineNum = 22216708;BA.debugLine="cam.SceneMode = scenes.Get(i)";
mostCurrent._cam._setscenemode(null,BA.ObjectToString(_scenes.Get(_i)));
RDebugUtils.currentLine=22216709;
 //BA.debugLineNum = 22216709;BA.debugLine="btnScene.Text = scenes.Get(i)";
mostCurrent._btnscene.setText(BA.ObjectToCharSequence(_scenes.Get(_i)));
RDebugUtils.currentLine=22216710;
 //BA.debugLineNum = 22216710;BA.debugLine="cam.StartPreview(MyTaskIndex, VideoMode)";
mostCurrent._cam._startpreview(null,_mytaskindex,_videomode);
RDebugUtils.currentLine=22216711;
 //BA.debugLineNum = 22216711;BA.debugLine="End Sub";
return "";
}
public static String  _cancelsavebtn_click() throws Exception{
RDebugUtils.currentModule="maincamera";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cancelsavebtn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "cancelsavebtn_click", null);
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Sub CancelSaveBtn_Click";
RDebugUtils.currentLine=22609921;
 //BA.debugLineNum = 22609921;BA.debugLine="pnlBackground.Visible = False";
mostCurrent._pnlbackground.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="End Sub";
return "";
}
public static String  _handleerror(anywheresoftware.b4a.objects.B4AException _error) throws Exception{
RDebugUtils.currentModule="maincamera";
if (Debug.shouldDelegate(mostCurrent.activityBA, "handleerror"))
	return (String) Debug.delegate(mostCurrent.activityBA, "handleerror", new Object[] {_error});
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Sub HandleError (Error As Exception)";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="Log(\"Error: \" & Error)";
anywheresoftware.b4a.keywords.Common.Log("Error: "+BA.ObjectToString(_error));
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="ToastMessageShow(Error, True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_error.getObject()),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21954563;
 //BA.debugLineNum = 21954563;BA.debugLine="OpenCamera(frontCamera)";
_opencamera(_frontcamera);
RDebugUtils.currentLine=21954564;
 //BA.debugLineNum = 21954564;BA.debugLine="End Sub";
return "";
}
public static String  _pnlpicture_click() throws Exception{
RDebugUtils.currentModule="maincamera";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnlpicture_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "pnlpicture_click", null);
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Sub pnlPicture_Click";
RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="End Sub";
return "";
}
public static void  _saveimgbtn_click() throws Exception{
ResumableSub_SaveImgBtn_Click rsub = new ResumableSub_SaveImgBtn_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_SaveImgBtn_Click extends BA.ResumableSub {
public ResumableSub_SaveImgBtn_Click(b4a.example.maincamera parent) {
this.parent = parent;
}
b4a.example.maincamera parent;
byte[] _data = null;
String _tanggal = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="maincamera";
Debug.delegate(mostCurrent.activityBA, "saveimgbtn_click", null);
if (true) return;
    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=22544385;
 //BA.debugLineNum = 22544385;BA.debugLine="Wait For(cam.FocusAndTakePicture(MyTaskIndex)) Co";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._cam._focusandtakepicture(null,parent._mytaskindex));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_data = (byte[]) result[0];
;
RDebugUtils.currentLine=22544386;
 //BA.debugLineNum = 22544386;BA.debugLine="Dim tanggal As String";
_tanggal = "";
RDebugUtils.currentLine=22544387;
 //BA.debugLineNum = 22544387;BA.debugLine="DateTime.DateFormat=\"ddmmyyy-hhmmss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("ddmmyyy-hhmmss");
RDebugUtils.currentLine=22544388;
 //BA.debugLineNum = 22544388;BA.debugLine="tanggal = DateTime.Date(DateTime.now)";
_tanggal = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=22544389;
 //BA.debugLineNum = 22544389;BA.debugLine="namefile = idBuilding&\"-\"&tanggal&\".jpg\"";
parent._namefile = parent.mostCurrent._idbuilding+"-"+_tanggal+".jpg";
RDebugUtils.currentLine=22544390;
 //BA.debugLineNum = 22544390;BA.debugLine="cam.DataToFile(data, VideoFileDir,namefile)";
parent.mostCurrent._cam._datatofile(null,_data,parent._videofiledir,parent._namefile);
RDebugUtils.currentLine=22544392;
 //BA.debugLineNum = 22544392;BA.debugLine="ToastMessageShow(\"Image Saved!\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Image Saved!"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22544393;
 //BA.debugLineNum = 22544393;BA.debugLine="pnlBackground.Visible = False";
parent.mostCurrent._pnlbackground.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22544394;
 //BA.debugLineNum = 22544394;BA.debugLine="CallSubDelayed2(AddPhoto,\"ShowPicture\",namefile)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(parent.mostCurrent._addphoto.getObject()),"ShowPicture",(Object)(parent._namefile));
RDebugUtils.currentLine=22544395;
 //BA.debugLineNum = 22544395;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}