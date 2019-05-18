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

public class addbuildingfacility extends Activity implements B4AActivity{
	public static addbuildingfacility mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.addbuildingfacility");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (addbuildingfacility).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.addbuildingfacility");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.addbuildingfacility", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (addbuildingfacility) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (addbuildingfacility) Resume **");
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
		return addbuildingfacility.class;
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
        BA.LogInfo("** Activity (addbuildingfacility) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (addbuildingfacility) Resume **");
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
public static String _idbuilding = "";
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelbuildinglist = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneleditfacility = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editquantity = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneleditquanity = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblquantity = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelspinnerfacility = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnamefacility = null;
public anywheresoftware.b4a.objects.collections.Map _spinfac = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnamefacility = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnaddfacility = null;
public static String _idspin = "";
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
RDebugUtils.currentModule="addbuildingfacility";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=16384003;
 //BA.debugLineNum = 16384003;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="ScrollView1.Panel.LoadLayout(\"AddBuildingFacility";
mostCurrent._scrollview1.getPanel().LoadLayout("AddBuildingFacility",mostCurrent.activityBA);
RDebugUtils.currentLine=16384005;
 //BA.debugLineNum = 16384005;BA.debugLine="ScrollView1.Height = 100%y";
mostCurrent._scrollview1.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=16384006;
 //BA.debugLineNum = 16384006;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._panelbuildinglist.getHeight());
RDebugUtils.currentLine=16384007;
 //BA.debugLineNum = 16384007;BA.debugLine="SetBackgroundTintList(editQuantity, Colors.ARGB(2";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._editquantity.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=16384009;
 //BA.debugLineNum = 16384009;BA.debugLine="Select Home.HomeBuilding";
switch (BA.switchObjectToInt(mostCurrent._home._homebuilding,"Worship","Office","Health","Msme","Educational")) {
case 0: {
RDebugUtils.currentLine=16384011;
 //BA.debugLineNum = 16384011;BA.debugLine="If WorshipBuilding.nameBuilding.Length > 0 Then";
if (mostCurrent._worshipbuilding._namebuilding.length()>0) { 
RDebugUtils.currentLine=16384012;
 //BA.debugLineNum = 16384012;BA.debugLine="idBuilding= WorshipBuilding.nameBuilding";
_idbuilding = mostCurrent._worshipbuilding._namebuilding;
RDebugUtils.currentLine=16384013;
 //BA.debugLineNum = 16384013;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
RDebugUtils.currentLine=16384015;
 //BA.debugLineNum = 16384015;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=16384016;
 //BA.debugLineNum = 16384016;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 1: {
RDebugUtils.currentLine=16384019;
 //BA.debugLineNum = 16384019;BA.debugLine="If OfficeBuilding.nameBuilding.Length > 0 Then";
if (mostCurrent._officebuilding._namebuilding.length()>0) { 
RDebugUtils.currentLine=16384020;
 //BA.debugLineNum = 16384020;BA.debugLine="idBuilding= OfficeBuilding.nameBuilding";
_idbuilding = mostCurrent._officebuilding._namebuilding;
RDebugUtils.currentLine=16384021;
 //BA.debugLineNum = 16384021;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
RDebugUtils.currentLine=16384023;
 //BA.debugLineNum = 16384023;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=16384024;
 //BA.debugLineNum = 16384024;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 2: {
RDebugUtils.currentLine=16384027;
 //BA.debugLineNum = 16384027;BA.debugLine="If HealthBuilding.nameBuilding.Length > 0 Then";
if (mostCurrent._healthbuilding._namebuilding.length()>0) { 
RDebugUtils.currentLine=16384028;
 //BA.debugLineNum = 16384028;BA.debugLine="idBuilding= HealthBuilding.nameBuilding";
_idbuilding = mostCurrent._healthbuilding._namebuilding;
RDebugUtils.currentLine=16384029;
 //BA.debugLineNum = 16384029;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
RDebugUtils.currentLine=16384031;
 //BA.debugLineNum = 16384031;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=16384032;
 //BA.debugLineNum = 16384032;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 3: {
RDebugUtils.currentLine=16384035;
 //BA.debugLineNum = 16384035;BA.debugLine="If MsmeBuilding.nameBuilding.Length > 0 Then";
if (mostCurrent._msmebuilding._namebuilding.length()>0) { 
RDebugUtils.currentLine=16384036;
 //BA.debugLineNum = 16384036;BA.debugLine="idBuilding= MsmeBuilding.nameBuilding";
_idbuilding = mostCurrent._msmebuilding._namebuilding;
RDebugUtils.currentLine=16384037;
 //BA.debugLineNum = 16384037;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
RDebugUtils.currentLine=16384039;
 //BA.debugLineNum = 16384039;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=16384040;
 //BA.debugLineNum = 16384040;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 4: {
RDebugUtils.currentLine=16384043;
 //BA.debugLineNum = 16384043;BA.debugLine="If EducationalBuilding.nameBuilding.Length > 0";
if (mostCurrent._educationalbuilding._namebuilding.length()>0) { 
RDebugUtils.currentLine=16384044;
 //BA.debugLineNum = 16384044;BA.debugLine="idBuilding= EducationalBuilding.nameBuilding";
_idbuilding = mostCurrent._educationalbuilding._namebuilding;
RDebugUtils.currentLine=16384045;
 //BA.debugLineNum = 16384045;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
RDebugUtils.currentLine=16384047;
 //BA.debugLineNum = 16384047;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=16384048;
 //BA.debugLineNum = 16384048;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
default: {
RDebugUtils.currentLine=16384051;
 //BA.debugLineNum = 16384051;BA.debugLine="If SearchBuilding.nameBuilding.Length > 0 Then";
if (mostCurrent._searchbuilding._namebuilding.length()>0) { 
RDebugUtils.currentLine=16384052;
 //BA.debugLineNum = 16384052;BA.debugLine="idBuilding = SearchBuilding.idBuilding";
_idbuilding = mostCurrent._searchbuilding._idbuilding;
RDebugUtils.currentLine=16384053;
 //BA.debugLineNum = 16384053;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
RDebugUtils.currentLine=16384055;
 //BA.debugLineNum = 16384055;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=16384056;
 //BA.debugLineNum = 16384056;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
}
;
RDebugUtils.currentLine=16384060;
 //BA.debugLineNum = 16384060;BA.debugLine="Log(\"IDnyaa LOOOO: \"&idBuilding)";
anywheresoftware.b4a.keywords.Common.Log("IDnyaa LOOOO: "+_idbuilding);
RDebugUtils.currentLine=16384062;
 //BA.debugLineNum = 16384062;BA.debugLine="End Sub";
return "";
}
public static String  _setbackgroundtintlist(anywheresoftware.b4a.objects.ConcreteViewWrapper _view,int _active,int _enabled) throws Exception{
RDebugUtils.currentModule="addbuildingfacility";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setbackgroundtintlist"))
	return (String) Debug.delegate(mostCurrent.activityBA, "setbackgroundtintlist", new Object[] {_view,_active,_enabled});
int[][] _states = null;
int[] _color = null;
anywheresoftware.b4j.object.JavaObject _csl = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="Dim States(2,1) As Int";
_states = new int[(int) (2)][];
{
int d0 = _states.length;
int d1 = (int) (1);
for (int i0 = 0;i0 < d0;i0++) {
_states[i0] = new int[d1];
}
}
;
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="States(0,0) = 16842908     'Active";
_states[(int) (0)][(int) (0)] = (int) (16842908);
RDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="States(1,0) = 16842910    'Enabled";
_states[(int) (1)][(int) (0)] = (int) (16842910);
RDebugUtils.currentLine=16580612;
 //BA.debugLineNum = 16580612;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
_color = new int[]{_active,_enabled};
RDebugUtils.currentLine=16580613;
 //BA.debugLineNum = 16580613;BA.debugLine="Dim CSL As JavaObject";
_csl = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=16580614;
 //BA.debugLineNum = 16580614;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
_csl.InitializeNewInstance("android.content.res.ColorStateList",new Object[]{(Object)(_states),(Object)(_color)});
RDebugUtils.currentLine=16580615;
 //BA.debugLineNum = 16580615;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=16580616;
 //BA.debugLineNum = 16580616;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
_jo.InitializeStatic("android.support.v4.view.ViewCompat");
RDebugUtils.currentLine=16580617;
 //BA.debugLineNum = 16580617;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
_jo.RunMethod("setBackgroundTintList",new Object[]{(Object)(_view.getObject()),(Object)(_csl.getObject())});
RDebugUtils.currentLine=16580618;
 //BA.debugLineNum = 16580618;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="addbuildingfacility";
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="addbuildingfacility";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="ProgressDialogShow(\"Loading...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Loading..."));
RDebugUtils.currentLine=16449539;
 //BA.debugLineNum = 16449539;BA.debugLine="SpinFac.Initialize";
mostCurrent._spinfac.Initialize();
RDebugUtils.currentLine=16449540;
 //BA.debugLineNum = 16449540;BA.debugLine="Select Home.HomeBuilding";
switch (BA.switchObjectToInt(mostCurrent._home._homebuilding,"Worship","Office","Msme","Educational","Health")) {
case 0: {
RDebugUtils.currentLine=16449542;
 //BA.debugLineNum = 16449542;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from worship_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 break; }
case 1: {
RDebugUtils.currentLine=16449544;
 //BA.debugLineNum = 16449544;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from office_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 break; }
case 2: {
RDebugUtils.currentLine=16449546;
 //BA.debugLineNum = 16449546;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from msme_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 break; }
case 3: {
RDebugUtils.currentLine=16449548;
 //BA.debugLineNum = 16449548;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from educational_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 break; }
case 4: {
RDebugUtils.currentLine=16449550;
 //BA.debugLineNum = 16449550;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from health_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 break; }
default: {
RDebugUtils.currentLine=16449552;
 //BA.debugLineNum = 16449552;BA.debugLine="Select SearchBuilding.idspin";
switch (BA.switchObjectToInt(mostCurrent._searchbuilding._idspin,"Worship","Office","Msme","Educational","Health")) {
case 0: {
RDebugUtils.currentLine=16449554;
 //BA.debugLineNum = 16449554;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from worship_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 break; }
case 1: {
RDebugUtils.currentLine=16449556;
 //BA.debugLineNum = 16449556;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from office_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 break; }
case 2: {
RDebugUtils.currentLine=16449558;
 //BA.debugLineNum = 16449558;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from msme_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 break; }
case 3: {
RDebugUtils.currentLine=16449560;
 //BA.debugLineNum = 16449560;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from educational_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 break; }
case 4: {
RDebugUtils.currentLine=16449562;
 //BA.debugLineNum = 16449562;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from health_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 break; }
}
;
 break; }
}
;
RDebugUtils.currentLine=16449565;
 //BA.debugLineNum = 16449565;BA.debugLine="End Sub";
return "";
}
public static String  _executeremotequery(String _query,String _jobname) throws Exception{
RDebugUtils.currentModule="addbuildingfacility";
if (Debug.shouldDelegate(mostCurrent.activityBA, "executeremotequery"))
	return (String) Debug.delegate(mostCurrent.activityBA, "executeremotequery", new Object[] {_query,_jobname});
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="Job.Initialize(JobName, Me)";
_job._initialize(processBA,_jobname,addbuildingfacility.getObject());
RDebugUtils.currentLine=16646147;
 //BA.debugLineNum = 16646147;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
_job._poststring(""+mostCurrent._main._server+"mobile/json.php",_query);
RDebugUtils.currentLine=16646148;
 //BA.debugLineNum = 16646148;BA.debugLine="End Sub";
return "";
}
public static String  _btnaddfacility_click() throws Exception{
RDebugUtils.currentModule="addbuildingfacility";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnaddfacility_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnaddfacility_click", null);
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Sub btnAddFacility_Click";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="Select Home.HomeBuilding";
switch (BA.switchObjectToInt(mostCurrent._home._homebuilding,"Worship","Office","Msme","Educational","Health")) {
case 0: {
RDebugUtils.currentLine=16842755;
 //BA.debugLineNum = 16842755;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_worship_";
_executeremotequery("INSERT INTO detail_worship_building_facilities (worship_building_id, facility_id, quantity_of_facilities) VALUES ('"+_idbuilding+"',"+mostCurrent._idspin+","+mostCurrent._editquantity.getText()+")","AddFacility");
 break; }
case 1: {
RDebugUtils.currentLine=16842757;
 //BA.debugLineNum = 16842757;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_office_b";
_executeremotequery("INSERT INTO detail_office_building_facilities (office_building_id, facility_id, quantity_of_facilities) VALUES ('"+_idbuilding+"', "+mostCurrent._idspin+", "+mostCurrent._editquantity.getText()+")","AddFacility");
 break; }
case 2: {
RDebugUtils.currentLine=16842759;
 //BA.debugLineNum = 16842759;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_msme_bui";
_executeremotequery("INSERT INTO detail_msme_building_facilities (msme_building_id, facility_id, quantity_of_facilities) VALUES ('"+_idbuilding+"', "+mostCurrent._idspin+", "+mostCurrent._editquantity.getText()+")","AddFacility");
 break; }
case 3: {
RDebugUtils.currentLine=16842761;
 //BA.debugLineNum = 16842761;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_educatio";
_executeremotequery("INSERT INTO detail_educational_building_facilities (educational_building_id, facility_id, quantity_of_facilities) VALUES ('"+_idbuilding+"', "+mostCurrent._idspin+", "+mostCurrent._editquantity.getText()+")","AddFacility");
 break; }
case 4: {
RDebugUtils.currentLine=16842763;
 //BA.debugLineNum = 16842763;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_health_b";
_executeremotequery("INSERT INTO detail_health_building_facilities (health_building_id, facility_id, quantity_of_facilities) VALUES ('"+_idbuilding+"', "+mostCurrent._idspin+", "+mostCurrent._editquantity.getText()+")","AddFacility");
 break; }
default: {
RDebugUtils.currentLine=16842765;
 //BA.debugLineNum = 16842765;BA.debugLine="Select SearchBuilding.idspin";
switch (BA.switchObjectToInt(mostCurrent._searchbuilding._idspin,"Worship","Office","Msme","Educational","Health")) {
case 0: {
RDebugUtils.currentLine=16842767;
 //BA.debugLineNum = 16842767;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_worshi";
_executeremotequery("INSERT INTO detail_worship_building_facilities (worship_building_id, facility_id, quantity_of_facilities) VALUES ('"+_idbuilding+"',"+mostCurrent._idspin+","+mostCurrent._editquantity.getText()+")","AddFacility");
 break; }
case 1: {
RDebugUtils.currentLine=16842769;
 //BA.debugLineNum = 16842769;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_office";
_executeremotequery("INSERT INTO detail_office_building_facilities (office_building_id, facility_id, quantity_of_facilities) VALUES ('"+_idbuilding+"', "+mostCurrent._idspin+", "+mostCurrent._editquantity.getText()+")","AddFacility");
 break; }
case 2: {
RDebugUtils.currentLine=16842771;
 //BA.debugLineNum = 16842771;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_msme_b";
_executeremotequery("INSERT INTO detail_msme_building_facilities (msme_building_id, facility_id, quantity_of_facilities) VALUES ('"+_idbuilding+"', "+mostCurrent._idspin+", "+mostCurrent._editquantity.getText()+")","AddFacility");
 break; }
case 3: {
RDebugUtils.currentLine=16842773;
 //BA.debugLineNum = 16842773;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_educat";
_executeremotequery("INSERT INTO detail_educational_building_facilities (educational_building_id, facility_id, quantity_of_facilities) VALUES ('"+_idbuilding+"', "+mostCurrent._idspin+", "+mostCurrent._editquantity.getText()+")","AddFacility");
 break; }
case 4: {
RDebugUtils.currentLine=16842775;
 //BA.debugLineNum = 16842775;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_health";
_executeremotequery("INSERT INTO detail_health_building_facilities (health_building_id, facility_id, quantity_of_facilities) VALUES ('"+_idbuilding+"', "+mostCurrent._idspin+", "+mostCurrent._editquantity.getText()+")","AddFacility");
 break; }
}
;
 break; }
}
;
RDebugUtils.currentLine=16842779;
 //BA.debugLineNum = 16842779;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="addbuildingfacility";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parserf = null;
anywheresoftware.b4a.objects.collections.JSONParser _parserfa = null;
anywheresoftware.b4a.objects.collections.List _fasi_array = null;
int _c = 0;
anywheresoftware.b4a.objects.collections.Map _a = null;
String _id = "";
String _name = "";
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=16711683;
 //BA.debugLineNum = 16711683;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk s";
_res = _job._getstring();
RDebugUtils.currentLine=16711684;
 //BA.debugLineNum = 16711684;BA.debugLine="Log(\"Response from server :\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server :"+_res);
RDebugUtils.currentLine=16711685;
 //BA.debugLineNum = 16711685;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"AllFacilities","AddFacility")) {
case 0: {
RDebugUtils.currentLine=16711687;
 //BA.debugLineNum = 16711687;BA.debugLine="Dim parserf As JSONParser 'mengambil data dala";
_parserf = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=16711688;
 //BA.debugLineNum = 16711688;BA.debugLine="Dim parserfa As JSONParser";
_parserfa = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=16711689;
 //BA.debugLineNum = 16711689;BA.debugLine="parserf.Initialize(res)";
_parserf.Initialize(_res);
RDebugUtils.currentLine=16711690;
 //BA.debugLineNum = 16711690;BA.debugLine="Dim fasi_array As List = parserf.NextArray";
_fasi_array = new anywheresoftware.b4a.objects.collections.List();
_fasi_array = _parserf.NextArray();
RDebugUtils.currentLine=16711691;
 //BA.debugLineNum = 16711691;BA.debugLine="parserfa.Initialize(res)";
_parserfa.Initialize(_res);
RDebugUtils.currentLine=16711692;
 //BA.debugLineNum = 16711692;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=16711693;
 //BA.debugLineNum = 16711693;BA.debugLine="If fasi_array.Size > 0 Then";
if (_fasi_array.getSize()>0) { 
RDebugUtils.currentLine=16711694;
 //BA.debugLineNum = 16711694;BA.debugLine="For c=0 To fasi_array.Size - 1";
{
final int step14 = 1;
final int limit14 = (int) (_fasi_array.getSize()-1);
_c = (int) (0) ;
for (;(step14 > 0 && _c <= limit14) || (step14 < 0 && _c >= limit14) ;_c = ((int)(0 + _c + step14))  ) {
RDebugUtils.currentLine=16711695;
 //BA.debugLineNum = 16711695;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=16711696;
 //BA.debugLineNum = 16711696;BA.debugLine="a = fasi_array.Get(c)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_fasi_array.Get(_c)));
RDebugUtils.currentLine=16711698;
 //BA.debugLineNum = 16711698;BA.debugLine="Dim id, name As String";
_id = "";
_name = "";
RDebugUtils.currentLine=16711699;
 //BA.debugLineNum = 16711699;BA.debugLine="id=a.Get(\"facility_id\")";
_id = BA.ObjectToString(_a.Get((Object)("facility_id")));
RDebugUtils.currentLine=16711700;
 //BA.debugLineNum = 16711700;BA.debugLine="name=a.Get(\"name_of_facility\")";
_name = BA.ObjectToString(_a.Get((Object)("name_of_facility")));
RDebugUtils.currentLine=16711701;
 //BA.debugLineNum = 16711701;BA.debugLine="SpinNameFacility.Add(name)";
mostCurrent._spinnamefacility.Add(_name);
RDebugUtils.currentLine=16711702;
 //BA.debugLineNum = 16711702;BA.debugLine="SpinFac.Put(name,id)";
mostCurrent._spinfac.Put((Object)(_name),(Object)(_id));
RDebugUtils.currentLine=16711703;
 //BA.debugLineNum = 16711703;BA.debugLine="Log(\"id: \"&id&\" | name: \"&name)";
anywheresoftware.b4a.keywords.Common.Log("id: "+_id+" | name: "+_name);
 }
};
RDebugUtils.currentLine=16711705;
 //BA.debugLineNum = 16711705;BA.debugLine="idspin = SpinFac.GetValueAt(0)";
mostCurrent._idspin = BA.ObjectToString(mostCurrent._spinfac.GetValueAt((int) (0)));
RDebugUtils.currentLine=16711706;
 //BA.debugLineNum = 16711706;BA.debugLine="Log(idspin)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._idspin);
 }else {
 };
RDebugUtils.currentLine=16711710;
 //BA.debugLineNum = 16711710;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 break; }
case 1: {
RDebugUtils.currentLine=16711712;
 //BA.debugLineNum = 16711712;BA.debugLine="Try";
try {RDebugUtils.currentLine=16711713;
 //BA.debugLineNum = 16711713;BA.debugLine="Msgbox(\"Data has been updated! :)\",\"Success\"";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Data has been updated! :)"),BA.ObjectToCharSequence("Success"),mostCurrent.activityBA);
RDebugUtils.currentLine=16711714;
 //BA.debugLineNum = 16711714;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 } 
       catch (Exception e34) {
			processBA.setLastException(e34);RDebugUtils.currentLine=16711716;
 //BA.debugLineNum = 16711716;BA.debugLine="Msgbox(\"Data can not be updated :(\" , \"error";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Data can not be updated :("),BA.ObjectToCharSequence("error"),mostCurrent.activityBA);
 };
 break; }
}
;
 };
RDebugUtils.currentLine=16711720;
 //BA.debugLineNum = 16711720;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=16711721;
 //BA.debugLineNum = 16711721;BA.debugLine="End Sub";
return "";
}
public static String  _spinnamefacility_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="addbuildingfacility";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinnamefacility_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "spinnamefacility_itemclick", new Object[] {_position,_value});
String _idc = "";
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Sub SpinNameFacility_ItemClick (Position As Int, V";
RDebugUtils.currentLine=16777217;
 //BA.debugLineNum = 16777217;BA.debugLine="Dim idc As String";
_idc = "";
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="idc = SpinFac.Get(Value)";
_idc = BA.ObjectToString(mostCurrent._spinfac.Get(_value));
RDebugUtils.currentLine=16777219;
 //BA.debugLineNum = 16777219;BA.debugLine="idspin = idc";
mostCurrent._idspin = _idc;
RDebugUtils.currentLine=16777220;
 //BA.debugLineNum = 16777220;BA.debugLine="End Sub";
return "";
}
}