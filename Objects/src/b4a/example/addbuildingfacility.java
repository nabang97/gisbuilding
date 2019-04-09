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
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.addbuildingfacility");
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
public b4a.example.editbuildingfacility _editbuildingfacility = null;
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

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
 //BA.debugLineNum = 34;BA.debugLine="ScrollView1.Panel.LoadLayout(\"AddBuildingFacility";
mostCurrent._scrollview1.getPanel().LoadLayout("AddBuildingFacility",mostCurrent.activityBA);
 //BA.debugLineNum = 35;BA.debugLine="ScrollView1.Height = 100%y";
mostCurrent._scrollview1.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 36;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._panelbuildinglist.getHeight());
 //BA.debugLineNum = 37;BA.debugLine="SetBackgroundTintList(editQuantity, Colors.ARGB(2";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._editquantity.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
 //BA.debugLineNum = 39;BA.debugLine="Select Home.HomeBuilding";
switch (BA.switchObjectToInt(mostCurrent._home._homebuilding,"Worship","Office","Health","Msme","Educational")) {
case 0: {
 //BA.debugLineNum = 41;BA.debugLine="If WorshipBuilding.nameBuilding.Length > 0 Then";
if (mostCurrent._worshipbuilding._namebuilding.length()>0) { 
 //BA.debugLineNum = 42;BA.debugLine="idBuilding= WorshipBuilding.nameBuilding";
_idbuilding = mostCurrent._worshipbuilding._namebuilding;
 //BA.debugLineNum = 43;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
 //BA.debugLineNum = 45;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
 //BA.debugLineNum = 46;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 1: {
 //BA.debugLineNum = 49;BA.debugLine="If OfficeBuilding.nameBuilding.Length > 0 Then";
if (mostCurrent._officebuilding._namebuilding.length()>0) { 
 //BA.debugLineNum = 50;BA.debugLine="idBuilding= OfficeBuilding.nameBuilding";
_idbuilding = mostCurrent._officebuilding._namebuilding;
 //BA.debugLineNum = 51;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
 //BA.debugLineNum = 53;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
 //BA.debugLineNum = 54;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 2: {
 //BA.debugLineNum = 57;BA.debugLine="If HealthBuilding.nameBuilding.Length > 0 Then";
if (mostCurrent._healthbuilding._namebuilding.length()>0) { 
 //BA.debugLineNum = 58;BA.debugLine="idBuilding= HealthBuilding.nameBuilding";
_idbuilding = mostCurrent._healthbuilding._namebuilding;
 //BA.debugLineNum = 59;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
 //BA.debugLineNum = 61;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
 //BA.debugLineNum = 62;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 3: {
 //BA.debugLineNum = 65;BA.debugLine="If MsmeBuilding.nameBuilding.Length > 0 Then";
if (mostCurrent._msmebuilding._namebuilding.length()>0) { 
 //BA.debugLineNum = 66;BA.debugLine="idBuilding= MsmeBuilding.nameBuilding";
_idbuilding = mostCurrent._msmebuilding._namebuilding;
 //BA.debugLineNum = 67;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
 //BA.debugLineNum = 69;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
 //BA.debugLineNum = 70;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 4: {
 //BA.debugLineNum = 73;BA.debugLine="If EducationalBuilding.nameBuilding.Length > 0";
if (mostCurrent._educationalbuilding._namebuilding.length()>0) { 
 //BA.debugLineNum = 74;BA.debugLine="idBuilding= EducationalBuilding.nameBuilding";
_idbuilding = mostCurrent._educationalbuilding._namebuilding;
 //BA.debugLineNum = 75;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
 //BA.debugLineNum = 77;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
 //BA.debugLineNum = 78;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
default: {
 //BA.debugLineNum = 81;BA.debugLine="If SearchBuilding.nameBuilding.Length > 0 Then";
if (mostCurrent._searchbuilding._namebuilding.length()>0) { 
 //BA.debugLineNum = 82;BA.debugLine="idBuilding = SearchBuilding.idBuilding";
_idbuilding = mostCurrent._searchbuilding._idbuilding;
 //BA.debugLineNum = 83;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
 //BA.debugLineNum = 85;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
 //BA.debugLineNum = 86;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
}
;
 //BA.debugLineNum = 90;BA.debugLine="Log(\"IDnyaa LOOOO: \"&idBuilding)";
anywheresoftware.b4a.keywords.Common.Log("IDnyaa LOOOO: "+_idbuilding);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 95;BA.debugLine="ProgressDialogShow(\"Loading...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Loading..."));
 //BA.debugLineNum = 97;BA.debugLine="SpinFac.Initialize";
mostCurrent._spinfac.Initialize();
 //BA.debugLineNum = 98;BA.debugLine="Select Home.HomeBuilding";
switch (BA.switchObjectToInt(mostCurrent._home._homebuilding,"Worship","Office","Msme","Educational","Health")) {
case 0: {
 //BA.debugLineNum = 100;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from worship_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 break; }
case 1: {
 //BA.debugLineNum = 102;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from office_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 break; }
case 2: {
 //BA.debugLineNum = 104;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from msme_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 break; }
case 3: {
 //BA.debugLineNum = 106;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from educational_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 break; }
case 4: {
 //BA.debugLineNum = 108;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from health_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 break; }
default: {
 //BA.debugLineNum = 110;BA.debugLine="Select SearchBuilding.idspin";
switch (BA.switchObjectToInt(mostCurrent._searchbuilding._idspin,"Worship","Office","Msme","Educational","Health")) {
case 0: {
 //BA.debugLineNum = 112;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from worship_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 break; }
case 1: {
 //BA.debugLineNum = 114;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from office_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 break; }
case 2: {
 //BA.debugLineNum = 116;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from msme_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 break; }
case 3: {
 //BA.debugLineNum = 118;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from educational_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 break; }
case 4: {
 //BA.debugLineNum = 120;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from health_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 break; }
}
;
 break; }
}
;
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public static String  _btnaddfacility_click() throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub btnAddFacility_Click";
 //BA.debugLineNum = 196;BA.debugLine="Select Home.HomeBuilding";
switch (BA.switchObjectToInt(mostCurrent._home._homebuilding,"Worship","Office","Msme","Educational","Health")) {
case 0: {
 //BA.debugLineNum = 198;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_worship_";
_executeremotequery("INSERT INTO detail_worship_building_facilities (worship_building_id, facility_id, quantity_of_facilities) VALUES ('"+_idbuilding+"',"+mostCurrent._idspin+","+mostCurrent._editquantity.getText()+")","AddFacility");
 break; }
case 1: {
 //BA.debugLineNum = 200;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_office_b";
_executeremotequery("INSERT INTO detail_office_building_facilities (office_building_id, facility_id, quantity_of_facilities) VALUES ('"+_idbuilding+"', "+mostCurrent._idspin+", "+mostCurrent._editquantity.getText()+")","AddFacility");
 break; }
case 2: {
 //BA.debugLineNum = 202;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_msme_bui";
_executeremotequery("INSERT INTO detail_msme_building_facilities (msme_building_id, facility_id, quantity_of_facilities) VALUES ('"+_idbuilding+"', "+mostCurrent._idspin+", "+mostCurrent._editquantity.getText()+")","AddFacility");
 break; }
case 3: {
 //BA.debugLineNum = 204;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_educatio";
_executeremotequery("INSERT INTO detail_educational_building_facilities (educational_building_id, facility_id, quantity_of_facilities) VALUES ('"+_idbuilding+"', "+mostCurrent._idspin+", "+mostCurrent._editquantity.getText()+")","AddFacility");
 break; }
case 4: {
 //BA.debugLineNum = 206;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_health_b";
_executeremotequery("INSERT INTO detail_health_building_facilities (health_building_id, facility_id, quantity_of_facilities) VALUES ('"+_idbuilding+"', "+mostCurrent._idspin+", "+mostCurrent._editquantity.getText()+")","AddFacility");
 break; }
default: {
 //BA.debugLineNum = 208;BA.debugLine="Select SearchBuilding.idspin";
switch (BA.switchObjectToInt(mostCurrent._searchbuilding._idspin,"Worship","Office","Msme","Educational","Health")) {
case 0: {
 //BA.debugLineNum = 210;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_worshi";
_executeremotequery("INSERT INTO detail_worship_building_facilities (worship_building_id, facility_id, quantity_of_facilities) VALUES ('"+_idbuilding+"',"+mostCurrent._idspin+","+mostCurrent._editquantity.getText()+")","AddFacility");
 break; }
case 1: {
 //BA.debugLineNum = 212;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_office";
_executeremotequery("INSERT INTO detail_office_building_facilities (office_building_id, facility_id, quantity_of_facilities) VALUES ('"+_idbuilding+"', "+mostCurrent._idspin+", "+mostCurrent._editquantity.getText()+")","AddFacility");
 break; }
case 2: {
 //BA.debugLineNum = 214;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_msme_b";
_executeremotequery("INSERT INTO detail_msme_building_facilities (msme_building_id, facility_id, quantity_of_facilities) VALUES ('"+_idbuilding+"', "+mostCurrent._idspin+", "+mostCurrent._editquantity.getText()+")","AddFacility");
 break; }
case 3: {
 //BA.debugLineNum = 216;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_educat";
_executeremotequery("INSERT INTO detail_educational_building_facilities (educational_building_id, facility_id, quantity_of_facilities) VALUES ('"+_idbuilding+"', "+mostCurrent._idspin+", "+mostCurrent._editquantity.getText()+")","AddFacility");
 break; }
case 4: {
 //BA.debugLineNum = 218;BA.debugLine="ExecuteRemoteQuery(\"INSERT INTO detail_health";
_executeremotequery("INSERT INTO detail_health_building_facilities (health_building_id, facility_id, quantity_of_facilities) VALUES ('"+_idbuilding+"', "+mostCurrent._idspin+", "+mostCurrent._editquantity.getText()+")","AddFacility");
 break; }
}
;
 break; }
}
;
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return "";
}
public static String  _executeremotequery(String _query,String _jobname) throws Exception{
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
 //BA.debugLineNum = 140;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
 //BA.debugLineNum = 141;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
 //BA.debugLineNum = 142;BA.debugLine="Job.Initialize(JobName, Me)";
_job._initialize(processBA,_jobname,addbuildingfacility.getObject());
 //BA.debugLineNum = 143;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
_job._poststring(""+mostCurrent._main._server+"mobile/json.php",_query);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private ScrollView1 As ScrollView";
mostCurrent._scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private PanelBuildingList As Panel";
mostCurrent._panelbuildinglist = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private PanelEditFacility As Panel";
mostCurrent._paneleditfacility = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private editQuantity As EditText";
mostCurrent._editquantity = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private PanelEditQuanity As Panel";
mostCurrent._paneleditquanity = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private LblQuantity As Label";
mostCurrent._lblquantity = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private PanelSpinnerFacility As Panel";
mostCurrent._panelspinnerfacility = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private SpinNameFacility As Spinner";
mostCurrent._spinnamefacility = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private SpinFac As Map";
mostCurrent._spinfac = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 25;BA.debugLine="Private lblNameFacility As Label";
mostCurrent._lblnamefacility = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private btnAddFacility As Button";
mostCurrent._btnaddfacility = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Dim idspin As String";
mostCurrent._idspin = "";
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parserf = null;
anywheresoftware.b4a.objects.collections.JSONParser _parserfa = null;
anywheresoftware.b4a.objects.collections.List _fasi_array = null;
int _c = 0;
anywheresoftware.b4a.objects.collections.Map _a = null;
String _id = "";
String _name = "";
 //BA.debugLineNum = 146;BA.debugLine="Sub JobDone(Job As HttpJob)";
 //BA.debugLineNum = 147;BA.debugLine="If Job.Success Then";
if (_job._success) { 
 //BA.debugLineNum = 148;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 149;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk s";
_res = _job._getstring();
 //BA.debugLineNum = 150;BA.debugLine="Log(\"Response from server :\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server :"+_res);
 //BA.debugLineNum = 151;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"AllFacilities","AddFacility")) {
case 0: {
 //BA.debugLineNum = 153;BA.debugLine="Dim parserf As JSONParser 'mengambil data dala";
_parserf = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 154;BA.debugLine="Dim parserfa As JSONParser";
_parserfa = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 155;BA.debugLine="parserf.Initialize(res)";
_parserf.Initialize(_res);
 //BA.debugLineNum = 156;BA.debugLine="Dim fasi_array As List = parserf.NextArray";
_fasi_array = new anywheresoftware.b4a.objects.collections.List();
_fasi_array = _parserf.NextArray();
 //BA.debugLineNum = 157;BA.debugLine="parserfa.Initialize(res)";
_parserfa.Initialize(_res);
 //BA.debugLineNum = 158;BA.debugLine="Dim c As Int";
_c = 0;
 //BA.debugLineNum = 159;BA.debugLine="If fasi_array.Size > 0 Then";
if (_fasi_array.getSize()>0) { 
 //BA.debugLineNum = 160;BA.debugLine="For c=0 To fasi_array.Size - 1";
{
final int step14 = 1;
final int limit14 = (int) (_fasi_array.getSize()-1);
_c = (int) (0) ;
for (;(step14 > 0 && _c <= limit14) || (step14 < 0 && _c >= limit14) ;_c = ((int)(0 + _c + step14))  ) {
 //BA.debugLineNum = 161;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 162;BA.debugLine="a = fasi_array.Get(c)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_fasi_array.Get(_c)));
 //BA.debugLineNum = 164;BA.debugLine="Dim id, name As String";
_id = "";
_name = "";
 //BA.debugLineNum = 165;BA.debugLine="id=a.Get(\"facility_id\")";
_id = BA.ObjectToString(_a.Get((Object)("facility_id")));
 //BA.debugLineNum = 166;BA.debugLine="name=a.Get(\"name_of_facility\")";
_name = BA.ObjectToString(_a.Get((Object)("name_of_facility")));
 //BA.debugLineNum = 167;BA.debugLine="SpinNameFacility.Add(name)";
mostCurrent._spinnamefacility.Add(_name);
 //BA.debugLineNum = 168;BA.debugLine="SpinFac.Put(name,id)";
mostCurrent._spinfac.Put((Object)(_name),(Object)(_id));
 //BA.debugLineNum = 169;BA.debugLine="Log(\"id: \"&id&\" | name: \"&name)";
anywheresoftware.b4a.keywords.Common.Log("id: "+_id+" | name: "+_name);
 }
};
 //BA.debugLineNum = 171;BA.debugLine="idspin = SpinFac.GetValueAt(0)";
mostCurrent._idspin = BA.ObjectToString(mostCurrent._spinfac.GetValueAt((int) (0)));
 //BA.debugLineNum = 172;BA.debugLine="Log(idspin)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._idspin);
 }else {
 };
 //BA.debugLineNum = 176;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 break; }
case 1: {
 //BA.debugLineNum = 178;BA.debugLine="Try";
try { //BA.debugLineNum = 179;BA.debugLine="Msgbox(\"Data has been updated! :)\",\"Success\"";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Data has been updated! :)"),BA.ObjectToCharSequence("Success"),mostCurrent.activityBA);
 //BA.debugLineNum = 180;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 } 
       catch (Exception e34) {
			processBA.setLastException(e34); //BA.debugLineNum = 182;BA.debugLine="Msgbox(\"Data can not be updated :(\" , \"error";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Data can not be updated :("),BA.ObjectToCharSequence("error"),mostCurrent.activityBA);
 };
 break; }
}
;
 };
 //BA.debugLineNum = 186;BA.debugLine="Job.Release";
_job._release();
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Dim idBuilding As String";
_idbuilding = "";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public static String  _setbackgroundtintlist(anywheresoftware.b4a.objects.ConcreteViewWrapper _view,int _active,int _enabled) throws Exception{
int[][] _states = null;
int[] _color = null;
anywheresoftware.b4j.object.JavaObject _csl = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 128;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
 //BA.debugLineNum = 129;BA.debugLine="Dim States(2,1) As Int";
_states = new int[(int) (2)][];
{
int d0 = _states.length;
int d1 = (int) (1);
for (int i0 = 0;i0 < d0;i0++) {
_states[i0] = new int[d1];
}
}
;
 //BA.debugLineNum = 130;BA.debugLine="States(0,0) = 16842908     'Active";
_states[(int) (0)][(int) (0)] = (int) (16842908);
 //BA.debugLineNum = 131;BA.debugLine="States(1,0) = 16842910    'Enabled";
_states[(int) (1)][(int) (0)] = (int) (16842910);
 //BA.debugLineNum = 132;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
_color = new int[]{_active,_enabled};
 //BA.debugLineNum = 133;BA.debugLine="Dim CSL As JavaObject";
_csl = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 134;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
_csl.InitializeNewInstance("android.content.res.ColorStateList",new Object[]{(Object)(_states),(Object)(_color)});
 //BA.debugLineNum = 135;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 136;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
_jo.InitializeStatic("android.support.v4.view.ViewCompat");
 //BA.debugLineNum = 137;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
_jo.RunMethod("setBackgroundTintList",new Object[]{(Object)(_view.getObject()),(Object)(_csl.getObject())});
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return "";
}
public static String  _spinnamefacility_itemclick(int _position,Object _value) throws Exception{
String _idc = "";
 //BA.debugLineNum = 189;BA.debugLine="Sub SpinNameFacility_ItemClick (Position As Int, V";
 //BA.debugLineNum = 190;BA.debugLine="Dim idc As String";
_idc = "";
 //BA.debugLineNum = 191;BA.debugLine="idc = SpinFac.Get(Value)";
_idc = BA.ObjectToString(mostCurrent._spinfac.Get(_value));
 //BA.debugLineNum = 192;BA.debugLine="idspin = idc";
mostCurrent._idspin = _idc;
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
}
