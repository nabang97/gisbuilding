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

public class editbuildingfacility extends Activity implements B4AActivity{
	public static editbuildingfacility mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.editbuildingfacility");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (editbuildingfacility).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.editbuildingfacility");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.editbuildingfacility", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (editbuildingfacility) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (editbuildingfacility) Resume **");
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
		return editbuildingfacility.class;
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
        BA.LogInfo("** Activity (editbuildingfacility) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (editbuildingfacility) Resume **");
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
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static int _arraysize2 = 0;
public static String _idisi = "";
public static String _isi = "";
public static String _idbuilding = "";
public b4a.example3.customlistview _clv1 = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _numfc = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _namefc = null;
public anywheresoftware.b4a.objects.PanelWrapper _listitem = null;
public anywheresoftware.b4a.objects.collections.Map _facmap = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfacility = null;
public anywheresoftware.b4a.objects.PanelWrapper _pfacility = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsavechanges = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelbuildinglist = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndelete = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _idfaci = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
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

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 42;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
 //BA.debugLineNum = 43;BA.debugLine="ScrollView1.Panel.LoadLayout(\"EditBuildingFacilit";
mostCurrent._scrollview1.getPanel().LoadLayout("EditBuildingFacility",mostCurrent.activityBA);
 //BA.debugLineNum = 44;BA.debugLine="ScrollView1.Height = 100%y";
mostCurrent._scrollview1.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 45;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._panelbuildinglist.getHeight());
 //BA.debugLineNum = 47;BA.debugLine="Select Home.HomeBuilding";
switch (BA.switchObjectToInt(mostCurrent._home._homebuilding,"Worship","Office","Health","Msme","Educational")) {
case 0: {
 //BA.debugLineNum = 49;BA.debugLine="If WorshipBuilding.nameBuilding.Length > 0 Then";
if (mostCurrent._worshipbuilding._namebuilding.length()>0) { 
 //BA.debugLineNum = 50;BA.debugLine="idBuilding= WorshipBuilding.nameBuilding";
_idbuilding = mostCurrent._worshipbuilding._namebuilding;
 //BA.debugLineNum = 51;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
 //BA.debugLineNum = 53;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
 //BA.debugLineNum = 54;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 1: {
 //BA.debugLineNum = 57;BA.debugLine="If OfficeBuilding.nameBuilding.Length > 0 Then";
if (mostCurrent._officebuilding._namebuilding.length()>0) { 
 //BA.debugLineNum = 58;BA.debugLine="idBuilding= OfficeBuilding.nameBuilding";
_idbuilding = mostCurrent._officebuilding._namebuilding;
 //BA.debugLineNum = 59;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
 //BA.debugLineNum = 61;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
 //BA.debugLineNum = 62;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 2: {
 //BA.debugLineNum = 65;BA.debugLine="If HealthBuilding.nameBuilding.Length > 0 Then";
if (mostCurrent._healthbuilding._namebuilding.length()>0) { 
 //BA.debugLineNum = 66;BA.debugLine="idBuilding= HealthBuilding.nameBuilding";
_idbuilding = mostCurrent._healthbuilding._namebuilding;
 //BA.debugLineNum = 67;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
 //BA.debugLineNum = 69;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
 //BA.debugLineNum = 70;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 3: {
 //BA.debugLineNum = 73;BA.debugLine="If MsmeBuilding.nameBuilding.Length > 0 Then";
if (mostCurrent._msmebuilding._namebuilding.length()>0) { 
 //BA.debugLineNum = 74;BA.debugLine="idBuilding= MsmeBuilding.nameBuilding";
_idbuilding = mostCurrent._msmebuilding._namebuilding;
 //BA.debugLineNum = 75;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
 //BA.debugLineNum = 77;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
 //BA.debugLineNum = 78;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 4: {
 //BA.debugLineNum = 81;BA.debugLine="If EducationalBuilding.nameBuilding.Length > 0";
if (mostCurrent._educationalbuilding._namebuilding.length()>0) { 
 //BA.debugLineNum = 82;BA.debugLine="idBuilding= EducationalBuilding.nameBuilding";
_idbuilding = mostCurrent._educationalbuilding._namebuilding;
 //BA.debugLineNum = 83;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
 //BA.debugLineNum = 85;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
 //BA.debugLineNum = 86;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
default: {
 //BA.debugLineNum = 89;BA.debugLine="If SearchBuilding.nameBuilding.Length > 0 Then";
if (mostCurrent._searchbuilding._namebuilding.length()>0) { 
 //BA.debugLineNum = 90;BA.debugLine="idBuilding = SearchBuilding.idBuilding";
_idbuilding = mostCurrent._searchbuilding._idbuilding;
 //BA.debugLineNum = 91;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
 //BA.debugLineNum = 93;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
 //BA.debugLineNum = 94;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
}
;
 //BA.debugLineNum = 99;BA.debugLine="Log(\"IDnyaa LOOOO: \"&idBuilding)";
anywheresoftware.b4a.keywords.Common.Log("IDnyaa LOOOO: "+_idbuilding);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 103;BA.debugLine="CLV1.Clear";
mostCurrent._clv1._clear();
 //BA.debugLineNum = 104;BA.debugLine="FacMap.Initialize";
mostCurrent._facmap.Initialize();
 //BA.debugLineNum = 105;BA.debugLine="Select Home.HomeBuilding";
switch (BA.switchObjectToInt(mostCurrent._home._homebuilding,"Worship","Office","Msme","Educational","Health")) {
case 0: {
 //BA.debugLineNum = 107;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from worship_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 //BA.debugLineNum = 108;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.worship_building_i";
_executeremotequery("SELECT D.worship_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id ='"+_idbuilding+"'","Facility");
 break; }
case 1: {
 //BA.debugLineNum = 110;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from office_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 //BA.debugLineNum = 111;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.office_building_id";
_executeremotequery("SELECT D.office_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"+_idbuilding+"'","Facility");
 break; }
case 2: {
 //BA.debugLineNum = 113;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from msme_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 //BA.debugLineNum = 114;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.msme_building_id,";
_executeremotequery("SELECT D.msme_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"+_idbuilding+"'","Facility");
 break; }
case 3: {
 //BA.debugLineNum = 116;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from educational_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 //BA.debugLineNum = 117;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.educational_buildi";
_executeremotequery("SELECT D.educational_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"+_idbuilding+"'","Facility");
 break; }
case 4: {
 //BA.debugLineNum = 119;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from health_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 //BA.debugLineNum = 120;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.health_building_id";
_executeremotequery("SELECT D.health_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_health_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"+_idbuilding+"'","Facility");
 break; }
default: {
 //BA.debugLineNum = 122;BA.debugLine="Select SearchBuilding.idspin";
switch (BA.switchObjectToInt(mostCurrent._searchbuilding._idspin,"Worship","Office","Msme","Educational","Health")) {
case 0: {
 //BA.debugLineNum = 124;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from worship_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 //BA.debugLineNum = 125;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.worship_building";
_executeremotequery("SELECT D.worship_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id ='"+_idbuilding+"'","Facility");
 break; }
case 1: {
 //BA.debugLineNum = 127;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from office_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 //BA.debugLineNum = 128;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.office_building_";
_executeremotequery("SELECT D.office_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"+_idbuilding+"'","Facility");
 break; }
case 2: {
 //BA.debugLineNum = 130;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from msme_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 //BA.debugLineNum = 131;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.msme_building_id";
_executeremotequery("SELECT D.msme_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"+_idbuilding+"'","Facility");
 break; }
case 3: {
 //BA.debugLineNum = 133;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from educational_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 //BA.debugLineNum = 134;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.educational_buil";
_executeremotequery("SELECT D.educational_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"+_idbuilding+"'","Facility");
 break; }
case 4: {
 //BA.debugLineNum = 136;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from health_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 //BA.debugLineNum = 137;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.health_building_";
_executeremotequery("SELECT D.health_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_health_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"+_idbuilding+"'","Facility");
 break; }
}
;
 break; }
}
;
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public static String  _btndelete_click() throws Exception{
int _item = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _a = null;
 //BA.debugLineNum = 292;BA.debugLine="Sub btnDelete_Click";
 //BA.debugLineNum = 293;BA.debugLine="Dim item As Int = CLV1.GetItemFromView(Sender)";
_item = mostCurrent._clv1._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA))));
 //BA.debugLineNum = 294;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 295;BA.debugLine="p = CLV1.GetPanel(item)";
_p = mostCurrent._clv1._getpanel(_item);
 //BA.debugLineNum = 296;BA.debugLine="Dim a As B4XView";
_a = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 297;BA.debugLine="a = p.GetView(0)";
_a = _p.GetView((int) (0));
 //BA.debugLineNum = 298;BA.debugLine="Log(\"NAMA BUILDING: \"&a.GetView(3).Text)";
anywheresoftware.b4a.keywords.Common.Log("NAMA BUILDING: "+_a.GetView((int) (3)).getText());
 //BA.debugLineNum = 299;BA.debugLine="Select Home.HomeBuilding";
switch (BA.switchObjectToInt(mostCurrent._home._homebuilding,"Worship","Office","Msme","Educational","Health")) {
case 0: {
 //BA.debugLineNum = 301;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_worship_";
_executeremotequery("DELETE FROM detail_worship_building_facilities WHERE worship_building_id = '"+_idbuilding+"' AND facility_id = "+_a.GetView((int) (3)).getText()+" ","DeleteFacility");
 break; }
case 1: {
 //BA.debugLineNum = 303;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_office_b";
_executeremotequery("DELETE FROM detail_office_building_facilities WHERE office_building_id = '"+_idbuilding+"' and facility_id = "+_a.GetView((int) (3)).getText()+"","DeleteFacility");
 break; }
case 2: {
 //BA.debugLineNum = 305;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_msme_bui";
_executeremotequery("DELETE FROM detail_msme_building_facilities WHERE msme_building_id = '"+_idbuilding+"' and facility_id = "+_a.GetView((int) (3)).getText()+"","DeleteFacility");
 break; }
case 3: {
 //BA.debugLineNum = 307;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_educatio";
_executeremotequery("DELETE FROM detail_educational_building_facilities WHERE educational_building_id = '"+_idbuilding+"' and facility_id = "+_a.GetView((int) (3)).getText()+"","DeleteFacility");
 break; }
case 4: {
 //BA.debugLineNum = 309;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_health_b";
_executeremotequery("DELETE FROM detail_health_building_facilities WHERE health_building_id = '"+_idbuilding+"' and facility_id = "+_a.GetView((int) (3)).getText()+"","DeleteFacility");
 break; }
default: {
 //BA.debugLineNum = 311;BA.debugLine="Select SearchBuilding.idspin";
switch (BA.switchObjectToInt(mostCurrent._searchbuilding._idspin,"Worship","Office","Msme","Educational","Health")) {
case 0: {
 //BA.debugLineNum = 313;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_worshi";
_executeremotequery("DELETE FROM detail_worship_building_facilities WHERE worship_building_id = '"+_idbuilding+"' AND facility_id = "+_a.GetView((int) (3)).getText()+" ","DeleteFacility");
 break; }
case 1: {
 //BA.debugLineNum = 315;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_office";
_executeremotequery("DELETE FROM detail_office_building_facilities WHERE office_building_id = '"+_idbuilding+"' and facility_id = "+_a.GetView((int) (3)).getText()+"","DeleteFacility");
 break; }
case 2: {
 //BA.debugLineNum = 317;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_msme_b";
_executeremotequery("DELETE FROM detail_msme_building_facilities WHERE msme_building_id = '"+_idbuilding+"' and facility_id = "+_a.GetView((int) (3)).getText()+"","DeleteFacility");
 break; }
case 3: {
 //BA.debugLineNum = 319;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_educat";
_executeremotequery("DELETE FROM detail_educational_building_facilities WHERE educational_building_id = '"+_idbuilding+"' and facility_id = "+_a.GetView((int) (3)).getText()+"","DeleteFacility");
 break; }
case 4: {
 //BA.debugLineNum = 321;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_health";
_executeremotequery("DELETE FROM detail_health_building_facilities WHERE health_building_id = '"+_idbuilding+"' and facility_id = "+_a.GetView((int) (3)).getText()+"","DeleteFacility");
 break; }
}
;
 break; }
}
;
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return "";
}
public static String  _btnsavechanges_click() throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Sub BtnSaveChanges_Click";
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createitem(int _width,String _title,String _content,int _id) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 164;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
 //BA.debugLineNum = 165;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(processBA,"");
 //BA.debugLineNum = 166;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 100%x,6%y)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6),mostCurrent.activityBA));
 //BA.debugLineNum = 167;BA.debugLine="p.LoadLayout(\"facility_edit\")";
_p.LoadLayout("facility_edit",mostCurrent.activityBA);
 //BA.debugLineNum = 168;BA.debugLine="numfc.Text = Title";
mostCurrent._numfc.setText(BA.ObjectToCharSequence(_title));
 //BA.debugLineNum = 169;BA.debugLine="namefc.Text = Content";
mostCurrent._namefc.setText(BA.ObjectToCharSequence(_content));
 //BA.debugLineNum = 170;BA.debugLine="idfaci.Text = id";
mostCurrent._idfaci.setText(BA.ObjectToCharSequence(_id));
 //BA.debugLineNum = 171;BA.debugLine="SetBackgroundTintList(numfc, Colors.ARGB(225,3,15";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._numfc.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
 //BA.debugLineNum = 172;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_p.getObject()));
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public static String  _executeremotequery(String _query,String _jobname) throws Exception{
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
 //BA.debugLineNum = 158;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
 //BA.debugLineNum = 159;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
 //BA.debugLineNum = 160;BA.debugLine="Job.Initialize(JobName, Me)";
_job._initialize(processBA,_jobname,editbuildingfacility.getObject());
 //BA.debugLineNum = 161;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
_job._poststring(""+mostCurrent._main._server+"mobile/json.php",_query);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private CLV1 As CustomListView";
mostCurrent._clv1 = new b4a.example3.customlistview();
 //BA.debugLineNum = 19;BA.debugLine="Private ScrollView1 As ScrollView";
mostCurrent._scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private numfc As B4XView";
mostCurrent._numfc = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private namefc As B4XView";
mostCurrent._namefc = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private ListItem As Panel";
mostCurrent._listitem = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Dim FacMap As Map";
mostCurrent._facmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 26;BA.debugLine="Private Label1 As Label";
mostCurrent._label1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private LblFacility As Label";
mostCurrent._lblfacility = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private CLV1 As CustomListView";
mostCurrent._clv1 = new b4a.example3.customlistview();
 //BA.debugLineNum = 29;BA.debugLine="Private PFacility As Panel";
mostCurrent._pfacility = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private BtnSaveChanges As Button";
mostCurrent._btnsavechanges = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private PanelBuildingList As Panel";
mostCurrent._panelbuildinglist = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private btnDelete As Button";
mostCurrent._btndelete = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private Panel1 As Panel";
mostCurrent._panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private idfaci As Label";
mostCurrent._idfaci = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private Label3 As Label";
mostCurrent._label3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private Label2 As Label";
mostCurrent._label2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
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
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _fasilitas_array = null;
int _i = 0;
String _content = "";
int _quantity = 0;
int _idnya = 0;
 //BA.debugLineNum = 175;BA.debugLine="Sub JobDone(Job As HttpJob)";
 //BA.debugLineNum = 176;BA.debugLine="If Job.Success Then";
if (_job._success) { 
 //BA.debugLineNum = 177;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 178;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
 //BA.debugLineNum = 179;BA.debugLine="Log(\"Response from server :\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server :"+_res);
 //BA.debugLineNum = 180;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"AllFacilities","Facility","DeleteFacility")) {
case 0: {
 //BA.debugLineNum = 182;BA.debugLine="Dim parserf As JSONParser 'mengambil data dala";
_parserf = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 183;BA.debugLine="Dim parserfa As JSONParser";
_parserfa = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 184;BA.debugLine="parserf.Initialize(res)";
_parserf.Initialize(_res);
 //BA.debugLineNum = 185;BA.debugLine="Dim fasi_array As List = parserf.NextArray";
_fasi_array = new anywheresoftware.b4a.objects.collections.List();
_fasi_array = _parserf.NextArray();
 //BA.debugLineNum = 186;BA.debugLine="parserfa.Initialize(res)";
_parserfa.Initialize(_res);
 //BA.debugLineNum = 187;BA.debugLine="Dim c As Int";
_c = 0;
 //BA.debugLineNum = 188;BA.debugLine="If fasi_array.Size > 0 Then";
if (_fasi_array.getSize()>0) { 
 //BA.debugLineNum = 189;BA.debugLine="For c=0 To fasi_array.Size - 1";
{
final int step14 = 1;
final int limit14 = (int) (_fasi_array.getSize()-1);
_c = (int) (0) ;
for (;(step14 > 0 && _c <= limit14) || (step14 < 0 && _c >= limit14) ;_c = ((int)(0 + _c + step14))  ) {
 //BA.debugLineNum = 190;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 191;BA.debugLine="a = fasi_array.Get(c)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_fasi_array.Get(_c)));
 //BA.debugLineNum = 193;BA.debugLine="Dim id, name As String";
_id = "";
_name = "";
 //BA.debugLineNum = 194;BA.debugLine="id=a.Get(\"facility_id\")";
_id = BA.ObjectToString(_a.Get((Object)("facility_id")));
 //BA.debugLineNum = 195;BA.debugLine="name=a.Get(\"name_of_facility\")";
_name = BA.ObjectToString(_a.Get((Object)("name_of_facility")));
 //BA.debugLineNum = 196;BA.debugLine="Log(\"id: \"&id&\" | name: \"&name)";
anywheresoftware.b4a.keywords.Common.Log("id: "+_id+" | name: "+_name);
 }
};
 //BA.debugLineNum = 198;BA.debugLine="Panel1.Enabled=True";
mostCurrent._panel1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 199;BA.debugLine="Panel1.Color=Colors.White";
mostCurrent._panel1.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 200;BA.debugLine="Label2.TextColor=Colors.Black";
mostCurrent._label2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 }else {
 //BA.debugLineNum = 202;BA.debugLine="Panel1.Enabled=False";
mostCurrent._panel1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 203;BA.debugLine="Panel1.Color=Colors.ARGB(225,247,247,247)";
mostCurrent._panel1.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (247),(int) (247),(int) (247)));
 //BA.debugLineNum = 204;BA.debugLine="Label2.TextColor=0xFFCECECE";
mostCurrent._label2.setTextColor((int) (0xffcecece));
 };
 //BA.debugLineNum = 206;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 break; }
case 1: {
 //BA.debugLineNum = 208;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 209;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
 //BA.debugLineNum = 210;BA.debugLine="Dim fasilitas_array As List";
_fasilitas_array = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 211;BA.debugLine="fasilitas_array = parser.NextArray";
_fasilitas_array = _parser.NextArray();
 //BA.debugLineNum = 212;BA.debugLine="If fasilitas_array.Size > 0 Then";
if (_fasilitas_array.getSize()>0) { 
 //BA.debugLineNum = 213;BA.debugLine="For i=0 To fasilitas_array.Size - 1";
{
final int step37 = 1;
final int limit37 = (int) (_fasilitas_array.getSize()-1);
_i = (int) (0) ;
for (;(step37 > 0 && _i <= limit37) || (step37 < 0 && _i >= limit37) ;_i = ((int)(0 + _i + step37))  ) {
 //BA.debugLineNum = 214;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 215;BA.debugLine="a = fasilitas_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_fasilitas_array.Get(_i)));
 //BA.debugLineNum = 217;BA.debugLine="Dim content As String = a.Get(\"name_of_facil";
_content = BA.ObjectToString(_a.Get((Object)("name_of_facility")));
 //BA.debugLineNum = 218;BA.debugLine="Dim quantity As Int = a.Get(\"quantity_of_fac";
_quantity = (int)(BA.ObjectToNumber(_a.Get((Object)("quantity_of_facilities"))));
 //BA.debugLineNum = 219;BA.debugLine="Dim idnya As Int = a.Get(\"facility_id\")";
_idnya = (int)(BA.ObjectToNumber(_a.Get((Object)("facility_id"))));
 //BA.debugLineNum = 220;BA.debugLine="CLV1.Add(CreateItem(CLV1.AsView.Width, $\"${q";
mostCurrent._clv1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(mostCurrent._clv1._asview().getWidth(),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_quantity))+""),_content,_idnya).getObject())),(Object)(""));
 //BA.debugLineNum = 221;BA.debugLine="CLV1.AsView.Height = ListItem.Height*(i+1)";
mostCurrent._clv1._asview().setHeight((int) (mostCurrent._listitem.getHeight()*(_i+1)));
 }
};
 //BA.debugLineNum = 224;BA.debugLine="Label3.Visible=False";
mostCurrent._label3.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 225;BA.debugLine="CLV1.AsView.Height = CLV1.AsView.Height + 1%y";
mostCurrent._clv1._asview().setHeight((int) (mostCurrent._clv1._asview().getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA)));
 //BA.debugLineNum = 226;BA.debugLine="CLV1.sv.Height = CLV1.AsView.Height";
mostCurrent._clv1._sv.setHeight(mostCurrent._clv1._asview().getHeight());
 //BA.debugLineNum = 227;BA.debugLine="PFacility.Height = CLV1.AsView.Top + CLV1.AsV";
mostCurrent._pfacility.setHeight((int) (mostCurrent._clv1._asview().getTop()+mostCurrent._clv1._asview().getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA)));
 //BA.debugLineNum = 228;BA.debugLine="Panel1.Top=PFacility.Height+PFacility.Top+3%y";
mostCurrent._panel1.setTop((int) (mostCurrent._pfacility.getHeight()+mostCurrent._pfacility.getTop()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),mostCurrent.activityBA)));
 //BA.debugLineNum = 229;BA.debugLine="BtnSaveChanges.Top=Panel1.Top+Panel1.Height+3";
mostCurrent._btnsavechanges.setTop((int) (mostCurrent._panel1.getTop()+mostCurrent._panel1.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),mostCurrent.activityBA)));
 }else {
 //BA.debugLineNum = 231;BA.debugLine="Label3.Visible=True";
mostCurrent._label3.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 232;BA.debugLine="Label3.Height= 15%y";
mostCurrent._label3.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA));
 //BA.debugLineNum = 233;BA.debugLine="Label3.Top=LblFacility.Height";
mostCurrent._label3.setTop(mostCurrent._lblfacility.getHeight());
 //BA.debugLineNum = 234;BA.debugLine="PFacility.Height=Label3.Top+Label3.Height";
mostCurrent._pfacility.setHeight((int) (mostCurrent._label3.getTop()+mostCurrent._label3.getHeight()));
 //BA.debugLineNum = 235;BA.debugLine="Panel1.Top=PFacility.Height+PFacility.Top+3%y";
mostCurrent._panel1.setTop((int) (mostCurrent._pfacility.getHeight()+mostCurrent._pfacility.getTop()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),mostCurrent.activityBA)));
 //BA.debugLineNum = 236;BA.debugLine="BtnSaveChanges.Top=Panel1.Top+Panel1.Height+3";
mostCurrent._btnsavechanges.setTop((int) (mostCurrent._panel1.getTop()+mostCurrent._panel1.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),mostCurrent.activityBA)));
 };
 //BA.debugLineNum = 239;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 break; }
case 2: {
 //BA.debugLineNum = 241;BA.debugLine="Try";
try { //BA.debugLineNum = 242;BA.debugLine="CLV1.Clear";
mostCurrent._clv1._clear();
 //BA.debugLineNum = 243;BA.debugLine="Select Home.HomeBuilding";
switch (BA.switchObjectToInt(mostCurrent._home._homebuilding,"Worship","Office","Msme","Educational","Health")) {
case 0: {
 //BA.debugLineNum = 245;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from worship_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 //BA.debugLineNum = 246;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.worship_building";
_executeremotequery("SELECT D.worship_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id ='"+_idbuilding+"'","Facility");
 break; }
case 1: {
 //BA.debugLineNum = 248;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from office_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 //BA.debugLineNum = 249;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.office_building_";
_executeremotequery("SELECT D.office_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"+_idbuilding+"'","Facility");
 break; }
case 2: {
 //BA.debugLineNum = 251;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from msme_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 //BA.debugLineNum = 252;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.msme_building_id";
_executeremotequery("SELECT D.msme_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"+_idbuilding+"'","Facility");
 break; }
case 3: {
 //BA.debugLineNum = 254;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from educational_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 //BA.debugLineNum = 255;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.educational_buil";
_executeremotequery("SELECT D.educational_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"+_idbuilding+"'","Facility");
 break; }
case 4: {
 //BA.debugLineNum = 257;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from health_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 //BA.debugLineNum = 258;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.health_building_";
_executeremotequery("SELECT D.health_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_health_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"+_idbuilding+"'","Facility");
 break; }
default: {
 //BA.debugLineNum = 260;BA.debugLine="Select SearchBuilding.idspin";
switch (BA.switchObjectToInt(mostCurrent._searchbuilding._idspin,"Worship","Office","Msme","Educational","Health")) {
case 0: {
 //BA.debugLineNum = 262;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facilit";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from worship_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 //BA.debugLineNum = 263;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.worship_buildi";
_executeremotequery("SELECT D.worship_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id ='"+_idbuilding+"'","Facility");
 break; }
case 1: {
 //BA.debugLineNum = 265;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facilit";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from office_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 //BA.debugLineNum = 266;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.office_buildin";
_executeremotequery("SELECT D.office_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"+_idbuilding+"'","Facility");
 break; }
case 2: {
 //BA.debugLineNum = 268;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facilit";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from msme_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 //BA.debugLineNum = 269;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.msme_building_";
_executeremotequery("SELECT D.msme_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"+_idbuilding+"'","Facility");
 break; }
case 3: {
 //BA.debugLineNum = 271;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facilit";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from educational_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 //BA.debugLineNum = 272;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.educational_bu";
_executeremotequery("SELECT D.educational_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"+_idbuilding+"'","Facility");
 break; }
case 4: {
 //BA.debugLineNum = 274;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facilit";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from health_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
 //BA.debugLineNum = 275;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.health_buildin";
_executeremotequery("SELECT D.health_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_health_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"+_idbuilding+"'","Facility");
 break; }
}
;
 break; }
}
;
 //BA.debugLineNum = 278;BA.debugLine="ToastMessageShow(\"Deleted\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Deleted"),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e101) {
			processBA.setLastException(e101); //BA.debugLineNum = 280;BA.debugLine="Msgbox(\"Data can not be updated :(\" , \"error\"";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Data can not be updated :("),BA.ObjectToCharSequence("error"),mostCurrent.activityBA);
 };
 break; }
}
;
 };
 //BA.debugLineNum = 285;BA.debugLine="Job.Release";
_job._release();
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return "";
}
public static String  _panel1_click() throws Exception{
 //BA.debugLineNum = 327;BA.debugLine="Sub Panel1_Click";
 //BA.debugLineNum = 328;BA.debugLine="StartActivity(AddBuildingFacility)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._addbuildingfacility.getObject()));
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 10;BA.debugLine="Dim ArraySize2 As Int";
_arraysize2 = 0;
 //BA.debugLineNum = 11;BA.debugLine="Dim idisi,isi As String";
_idisi = "";
_isi = "";
 //BA.debugLineNum = 12;BA.debugLine="Dim idBuilding As String";
_idbuilding = "";
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public static String  _setbackgroundtintlist(anywheresoftware.b4a.objects.ConcreteViewWrapper _view,int _active,int _enabled) throws Exception{
int[][] _states = null;
int[] _color = null;
anywheresoftware.b4j.object.JavaObject _csl = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 146;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
 //BA.debugLineNum = 147;BA.debugLine="Dim States(2,1) As Int";
_states = new int[(int) (2)][];
{
int d0 = _states.length;
int d1 = (int) (1);
for (int i0 = 0;i0 < d0;i0++) {
_states[i0] = new int[d1];
}
}
;
 //BA.debugLineNum = 148;BA.debugLine="States(0,0) = 16842908     'Active";
_states[(int) (0)][(int) (0)] = (int) (16842908);
 //BA.debugLineNum = 149;BA.debugLine="States(1,0) = 16842910    'Enabled";
_states[(int) (1)][(int) (0)] = (int) (16842910);
 //BA.debugLineNum = 150;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
_color = new int[]{_active,_enabled};
 //BA.debugLineNum = 151;BA.debugLine="Dim CSL As JavaObject";
_csl = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 152;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
_csl.InitializeNewInstance("android.content.res.ColorStateList",new Object[]{(Object)(_states),(Object)(_color)});
 //BA.debugLineNum = 153;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 154;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
_jo.InitializeStatic("android.support.v4.view.ViewCompat");
 //BA.debugLineNum = 155;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
_jo.RunMethod("setBackgroundTintList",new Object[]{(Object)(_view.getObject()),(Object)(_csl.getObject())});
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return "";
}
}
