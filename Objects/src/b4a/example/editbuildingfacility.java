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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.editbuildingfacility");
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



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static int _arraysize2 = 0;
public static String _idisi = "";
public static String _isi = "";
public static String _idbuilding = "";
public static int _arraysize = 0;
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
RDebugUtils.currentModule="editbuildingfacility";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="ScrollView1.Panel.LoadLayout(\"EditBuildingFacilit";
mostCurrent._scrollview1.getPanel().LoadLayout("EditBuildingFacility",mostCurrent.activityBA);
RDebugUtils.currentLine=14286853;
 //BA.debugLineNum = 14286853;BA.debugLine="ScrollView1.Height = 100%y";
mostCurrent._scrollview1.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=14286854;
 //BA.debugLineNum = 14286854;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._panelbuildinglist.getHeight());
RDebugUtils.currentLine=14286856;
 //BA.debugLineNum = 14286856;BA.debugLine="Select Home.HomeBuilding";
switch (BA.switchObjectToInt(mostCurrent._home._homebuilding,"Worship","Office","Health","Msme","Educational")) {
case 0: {
RDebugUtils.currentLine=14286858;
 //BA.debugLineNum = 14286858;BA.debugLine="If WorshipBuilding.idBuilding.Length > 0 Then";
if (mostCurrent._worshipbuilding._idbuilding.length()>0) { 
RDebugUtils.currentLine=14286859;
 //BA.debugLineNum = 14286859;BA.debugLine="idBuilding= WorshipBuilding.idBuilding";
_idbuilding = mostCurrent._worshipbuilding._idbuilding;
RDebugUtils.currentLine=14286860;
 //BA.debugLineNum = 14286860;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
RDebugUtils.currentLine=14286862;
 //BA.debugLineNum = 14286862;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=14286863;
 //BA.debugLineNum = 14286863;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 1: {
RDebugUtils.currentLine=14286866;
 //BA.debugLineNum = 14286866;BA.debugLine="If OfficeBuilding.idBuilding.Length > 0 Then";
if (mostCurrent._officebuilding._idbuilding.length()>0) { 
RDebugUtils.currentLine=14286867;
 //BA.debugLineNum = 14286867;BA.debugLine="idBuilding= OfficeBuilding.idBuilding";
_idbuilding = mostCurrent._officebuilding._idbuilding;
RDebugUtils.currentLine=14286868;
 //BA.debugLineNum = 14286868;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
RDebugUtils.currentLine=14286870;
 //BA.debugLineNum = 14286870;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=14286871;
 //BA.debugLineNum = 14286871;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 2: {
RDebugUtils.currentLine=14286874;
 //BA.debugLineNum = 14286874;BA.debugLine="If HealthBuilding.idBuilding.Length > 0 Then";
if (mostCurrent._healthbuilding._idbuilding.length()>0) { 
RDebugUtils.currentLine=14286875;
 //BA.debugLineNum = 14286875;BA.debugLine="idBuilding= HealthBuilding.idBuilding";
_idbuilding = mostCurrent._healthbuilding._idbuilding;
RDebugUtils.currentLine=14286876;
 //BA.debugLineNum = 14286876;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
RDebugUtils.currentLine=14286878;
 //BA.debugLineNum = 14286878;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=14286879;
 //BA.debugLineNum = 14286879;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 3: {
RDebugUtils.currentLine=14286882;
 //BA.debugLineNum = 14286882;BA.debugLine="If MsmeBuilding.idBuilding.Length > 0 Then";
if (mostCurrent._msmebuilding._idbuilding.length()>0) { 
RDebugUtils.currentLine=14286883;
 //BA.debugLineNum = 14286883;BA.debugLine="idBuilding= MsmeBuilding.idBuilding";
_idbuilding = mostCurrent._msmebuilding._idbuilding;
RDebugUtils.currentLine=14286884;
 //BA.debugLineNum = 14286884;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
RDebugUtils.currentLine=14286886;
 //BA.debugLineNum = 14286886;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=14286887;
 //BA.debugLineNum = 14286887;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 4: {
RDebugUtils.currentLine=14286890;
 //BA.debugLineNum = 14286890;BA.debugLine="If EducationalBuilding.idBuilding.Length > 0 Th";
if (mostCurrent._educationalbuilding._idbuilding.length()>0) { 
RDebugUtils.currentLine=14286891;
 //BA.debugLineNum = 14286891;BA.debugLine="idBuilding= EducationalBuilding.idBuilding";
_idbuilding = mostCurrent._educationalbuilding._idbuilding;
RDebugUtils.currentLine=14286892;
 //BA.debugLineNum = 14286892;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
RDebugUtils.currentLine=14286894;
 //BA.debugLineNum = 14286894;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=14286895;
 //BA.debugLineNum = 14286895;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
default: {
RDebugUtils.currentLine=14286898;
 //BA.debugLineNum = 14286898;BA.debugLine="If SearchBuilding.idBuilding.Length > 0 Then";
if (mostCurrent._searchbuilding._idbuilding.length()>0) { 
RDebugUtils.currentLine=14286899;
 //BA.debugLineNum = 14286899;BA.debugLine="idBuilding = SearchBuilding.idBuilding";
_idbuilding = mostCurrent._searchbuilding._idbuilding;
RDebugUtils.currentLine=14286900;
 //BA.debugLineNum = 14286900;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(_idbuilding);
 }else {
RDebugUtils.currentLine=14286902;
 //BA.debugLineNum = 14286902;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=14286903;
 //BA.debugLineNum = 14286903;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
}
;
RDebugUtils.currentLine=14286908;
 //BA.debugLineNum = 14286908;BA.debugLine="Log(\"IDnyaa LOOOO: \"&idBuilding)";
anywheresoftware.b4a.keywords.Common.Log("IDnyaa LOOOO: "+_idbuilding);
RDebugUtils.currentLine=14286909;
 //BA.debugLineNum = 14286909;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="editbuildingfacility";
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="editbuildingfacility";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="FacMap.Initialize";
mostCurrent._facmap.Initialize();
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="RefreshData";
_refreshdata();
RDebugUtils.currentLine=14352387;
 //BA.debugLineNum = 14352387;BA.debugLine="End Sub";
return "";
}
public static String  _refreshdata() throws Exception{
RDebugUtils.currentModule="editbuildingfacility";
if (Debug.shouldDelegate(mostCurrent.activityBA, "refreshdata"))
	return (String) Debug.delegate(mostCurrent.activityBA, "refreshdata", null);
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Sub RefreshData";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="CLV1.Clear";
mostCurrent._clv1._clear();
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="Select Home.HomeBuilding";
switch (BA.switchObjectToInt(mostCurrent._home._homebuilding,"Worship","Office","Msme","Educational","Health")) {
case 0: {
RDebugUtils.currentLine=14483460;
 //BA.debugLineNum = 14483460;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from worship_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
RDebugUtils.currentLine=14483461;
 //BA.debugLineNum = 14483461;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.worship_building_i";
_executeremotequery("SELECT D.worship_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id ='"+_idbuilding+"' ORDER BY F.name_of_facility ASC","Facility");
 break; }
case 1: {
RDebugUtils.currentLine=14483463;
 //BA.debugLineNum = 14483463;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from office_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
RDebugUtils.currentLine=14483464;
 //BA.debugLineNum = 14483464;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.office_building_id";
_executeremotequery("SELECT D.office_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"+_idbuilding+"' ORDER BY F.name_of_facility ASC","Facility");
 break; }
case 2: {
RDebugUtils.currentLine=14483466;
 //BA.debugLineNum = 14483466;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from msme_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
RDebugUtils.currentLine=14483467;
 //BA.debugLineNum = 14483467;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.msme_building_id,";
_executeremotequery("SELECT D.msme_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"+_idbuilding+"' ORDER BY F.name_of_facility ASC","Facility");
 break; }
case 3: {
RDebugUtils.currentLine=14483469;
 //BA.debugLineNum = 14483469;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from educational_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
RDebugUtils.currentLine=14483470;
 //BA.debugLineNum = 14483470;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.educational_buildi";
_executeremotequery("SELECT D.educational_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"+_idbuilding+"' ORDER BY F.name_of_facility ASC","Facility");
 break; }
case 4: {
RDebugUtils.currentLine=14483472;
 //BA.debugLineNum = 14483472;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_id";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from health_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
RDebugUtils.currentLine=14483473;
 //BA.debugLineNum = 14483473;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.health_building_id";
_executeremotequery("SELECT D.health_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_health_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"+_idbuilding+"' ORDER BY F.name_of_facility ASC","Facility");
 break; }
default: {
RDebugUtils.currentLine=14483475;
 //BA.debugLineNum = 14483475;BA.debugLine="Select SearchBuilding.idspin";
switch (BA.switchObjectToInt(mostCurrent._searchbuilding._idspin,"Worship","Office","Msme","Educational","Health")) {
case 0: {
RDebugUtils.currentLine=14483477;
 //BA.debugLineNum = 14483477;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from worship_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
RDebugUtils.currentLine=14483478;
 //BA.debugLineNum = 14483478;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.worship_building";
_executeremotequery("SELECT D.worship_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id ='"+_idbuilding+"' ORDER BY F.name_of_facility ASC","Facility");
 break; }
case 1: {
RDebugUtils.currentLine=14483480;
 //BA.debugLineNum = 14483480;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from office_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
RDebugUtils.currentLine=14483481;
 //BA.debugLineNum = 14483481;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.office_building_";
_executeremotequery("SELECT D.office_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_office_building_facilities As D LEFT JOIN office_building_facilities As F ON F.facility_id=D.facility_id WHERE D.office_building_id = '"+_idbuilding+"' ORDER BY F.name_of_facility ASC","Facility");
 break; }
case 2: {
RDebugUtils.currentLine=14483483;
 //BA.debugLineNum = 14483483;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from msme_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
RDebugUtils.currentLine=14483484;
 //BA.debugLineNum = 14483484;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.msme_building_id";
_executeremotequery("SELECT D.msme_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id = '"+_idbuilding+"' ORDER BY F.name_of_facility ASC","Facility");
 break; }
case 3: {
RDebugUtils.currentLine=14483486;
 //BA.debugLineNum = 14483486;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from educational_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
RDebugUtils.currentLine=14483487;
 //BA.debugLineNum = 14483487;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.educational_buil";
_executeremotequery("SELECT D.educational_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id = '"+_idbuilding+"' ORDER BY F.name_of_facility ASC","Facility");
 break; }
case 4: {
RDebugUtils.currentLine=14483489;
 //BA.debugLineNum = 14483489;BA.debugLine="ExecuteRemoteQuery(\"SELECT DISTINCT facility_";
_executeremotequery("SELECT DISTINCT facility_id , name_of_facility from health_building_facilities WHERE name_of_facility NOT IN (SELECT DISTINCT F.name_of_facility  FROM detail_health_building_facilities As D LEFT JOIN health_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"+_idbuilding+"') ORDER BY name_of_facility ASC","AllFacilities");
RDebugUtils.currentLine=14483490;
 //BA.debugLineNum = 14483490;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.health_building_";
_executeremotequery("SELECT D.health_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_health_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.health_building_id = '"+_idbuilding+"' ORDER BY F.name_of_facility ASC","Facility");
 break; }
}
;
 break; }
}
;
RDebugUtils.currentLine=14483493;
 //BA.debugLineNum = 14483493;BA.debugLine="End Sub";
return "";
}
public static String  _btndelete_click() throws Exception{
RDebugUtils.currentModule="editbuildingfacility";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btndelete_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btndelete_click", null);
int _item = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _a = null;
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Sub btnDelete_Click";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="Dim item As Int = CLV1.GetItemFromView(Sender)";
_item = mostCurrent._clv1._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA))));
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="p = CLV1.GetPanel(item)";
_p = mostCurrent._clv1._getpanel(_item);
RDebugUtils.currentLine=14876676;
 //BA.debugLineNum = 14876676;BA.debugLine="Dim a As B4XView";
_a = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=14876677;
 //BA.debugLineNum = 14876677;BA.debugLine="a = p.GetView(0)";
_a = _p.GetView((int) (0));
RDebugUtils.currentLine=14876678;
 //BA.debugLineNum = 14876678;BA.debugLine="Log(\"NAMA BUILDING: \"&a.GetView(3).Text)";
anywheresoftware.b4a.keywords.Common.Log("NAMA BUILDING: "+_a.GetView((int) (3)).getText());
RDebugUtils.currentLine=14876679;
 //BA.debugLineNum = 14876679;BA.debugLine="Select Home.HomeBuilding";
switch (BA.switchObjectToInt(mostCurrent._home._homebuilding,"Worship","Office","Msme","Educational","Health")) {
case 0: {
RDebugUtils.currentLine=14876681;
 //BA.debugLineNum = 14876681;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_worship_";
_executeremotequery("DELETE FROM detail_worship_building_facilities WHERE worship_building_id = '"+_idbuilding+"' AND facility_id = "+_a.GetView((int) (3)).getText()+" ","DeleteFacility");
 break; }
case 1: {
RDebugUtils.currentLine=14876683;
 //BA.debugLineNum = 14876683;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_office_b";
_executeremotequery("DELETE FROM detail_office_building_facilities WHERE office_building_id = '"+_idbuilding+"' and facility_id = "+_a.GetView((int) (3)).getText()+"","DeleteFacility");
 break; }
case 2: {
RDebugUtils.currentLine=14876685;
 //BA.debugLineNum = 14876685;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_msme_bui";
_executeremotequery("DELETE FROM detail_msme_building_facilities WHERE msme_building_id = '"+_idbuilding+"' and facility_id = "+_a.GetView((int) (3)).getText()+"","DeleteFacility");
 break; }
case 3: {
RDebugUtils.currentLine=14876687;
 //BA.debugLineNum = 14876687;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_educatio";
_executeremotequery("DELETE FROM detail_educational_building_facilities WHERE educational_building_id = '"+_idbuilding+"' and facility_id = "+_a.GetView((int) (3)).getText()+"","DeleteFacility");
 break; }
case 4: {
RDebugUtils.currentLine=14876689;
 //BA.debugLineNum = 14876689;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_health_b";
_executeremotequery("DELETE FROM detail_health_building_facilities WHERE health_building_id = '"+_idbuilding+"' and facility_id = "+_a.GetView((int) (3)).getText()+"","DeleteFacility");
 break; }
default: {
RDebugUtils.currentLine=14876691;
 //BA.debugLineNum = 14876691;BA.debugLine="Select SearchBuilding.idspin";
switch (BA.switchObjectToInt(mostCurrent._searchbuilding._idspin,"Worship","Office","Msme","Educational","Health")) {
case 0: {
RDebugUtils.currentLine=14876693;
 //BA.debugLineNum = 14876693;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_worshi";
_executeremotequery("DELETE FROM detail_worship_building_facilities WHERE worship_building_id = '"+_idbuilding+"' AND facility_id = "+_a.GetView((int) (3)).getText()+" ","DeleteFacility");
 break; }
case 1: {
RDebugUtils.currentLine=14876695;
 //BA.debugLineNum = 14876695;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_office";
_executeremotequery("DELETE FROM detail_office_building_facilities WHERE office_building_id = '"+_idbuilding+"' and facility_id = "+_a.GetView((int) (3)).getText()+"","DeleteFacility");
 break; }
case 2: {
RDebugUtils.currentLine=14876697;
 //BA.debugLineNum = 14876697;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_msme_b";
_executeremotequery("DELETE FROM detail_msme_building_facilities WHERE msme_building_id = '"+_idbuilding+"' and facility_id = "+_a.GetView((int) (3)).getText()+"","DeleteFacility");
 break; }
case 3: {
RDebugUtils.currentLine=14876699;
 //BA.debugLineNum = 14876699;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_educat";
_executeremotequery("DELETE FROM detail_educational_building_facilities WHERE educational_building_id = '"+_idbuilding+"' and facility_id = "+_a.GetView((int) (3)).getText()+"","DeleteFacility");
 break; }
case 4: {
RDebugUtils.currentLine=14876701;
 //BA.debugLineNum = 14876701;BA.debugLine="ExecuteRemoteQuery(\"DELETE FROM detail_health";
_executeremotequery("DELETE FROM detail_health_building_facilities WHERE health_building_id = '"+_idbuilding+"' and facility_id = "+_a.GetView((int) (3)).getText()+"","DeleteFacility");
 break; }
}
;
 break; }
}
;
RDebugUtils.currentLine=14876705;
 //BA.debugLineNum = 14876705;BA.debugLine="End Sub";
return "";
}
public static String  _executeremotequery(String _query,String _jobname) throws Exception{
RDebugUtils.currentModule="editbuildingfacility";
if (Debug.shouldDelegate(mostCurrent.activityBA, "executeremotequery"))
	return (String) Debug.delegate(mostCurrent.activityBA, "executeremotequery", new Object[] {_query,_jobname});
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="Job.Initialize(JobName, Me)";
_job._initialize(processBA,_jobname,editbuildingfacility.getObject());
RDebugUtils.currentLine=14614531;
 //BA.debugLineNum = 14614531;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
_job._poststring(""+mostCurrent._main._server+"mobile/json.php",_query);
RDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="End Sub";
return "";
}
public static String  _btnsavechanges_click() throws Exception{
RDebugUtils.currentModule="editbuildingfacility";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsavechanges_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnsavechanges_click", null);
int _j = 0;
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Sub BtnSaveChanges_Click";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="ProgressDialogShow(\"updating..\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("updating.."));
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="Log(\"beluum :\"&arraysize)";
anywheresoftware.b4a.keywords.Common.Log("beluum :"+BA.NumberToString(_arraysize));
RDebugUtils.currentLine=14811139;
 //BA.debugLineNum = 14811139;BA.debugLine="Log(\"ini apa: \")";
anywheresoftware.b4a.keywords.Common.Log("ini apa: ");
RDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="Dim j As Int";
_j = 0;
RDebugUtils.currentLine=14811141;
 //BA.debugLineNum = 14811141;BA.debugLine="Select Home.HomeBuilding";
switch (BA.switchObjectToInt(mostCurrent._home._homebuilding,"Worship","Office","Msme","Educational","Health")) {
case 0: {
 break; }
case 1: {
RDebugUtils.currentLine=14811144;
 //BA.debugLineNum = 14811144;BA.debugLine="For j=0 To arraysize-1";
{
final int step8 = 1;
final int limit8 = (int) (_arraysize-1);
_j = (int) (0) ;
for (;(step8 > 0 && _j <= limit8) || (step8 < 0 && _j >= limit8) ;_j = ((int)(0 + _j + step8))  ) {
RDebugUtils.currentLine=14811145;
 //BA.debugLineNum = 14811145;BA.debugLine="ProgressDialogShow(\"updating..\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("updating.."));
RDebugUtils.currentLine=14811146;
 //BA.debugLineNum = 14811146;BA.debugLine="Log(\"INI DIAA : \"&CLV1.GetPanel(j).GetView(0).";
anywheresoftware.b4a.keywords.Common.Log("INI DIAA : "+mostCurrent._clv1._getpanel(_j).GetView((int) (0)).GetView((int) (1)).GetView((int) (0)).getText());
RDebugUtils.currentLine=14811147;
 //BA.debugLineNum = 14811147;BA.debugLine="ExecuteRemoteQuery(\"UPDATE detail_office_build";
_executeremotequery("UPDATE detail_office_building_facilities SET quantity_of_facilities ="+mostCurrent._clv1._getpanel(_j).GetView((int) (0)).GetView((int) (1)).GetView((int) (0)).getText()+" WHERE office_building_id = '"+_idbuilding+"'","Update");
 }
};
 break; }
case 2: {
 break; }
case 3: {
 break; }
case 4: {
 break; }
default: {
RDebugUtils.currentLine=14811153;
 //BA.debugLineNum = 14811153;BA.debugLine="Select SearchBuilding.idspin";
switch (BA.switchObjectToInt(mostCurrent._searchbuilding._idspin,"Worship","Office","Msme","Educational","Health")) {
case 0: {
 break; }
case 1: {
RDebugUtils.currentLine=14811157;
 //BA.debugLineNum = 14811157;BA.debugLine="For j=0 To arraysize-1";
{
final int step20 = 1;
final int limit20 = (int) (_arraysize-1);
_j = (int) (0) ;
for (;(step20 > 0 && _j <= limit20) || (step20 < 0 && _j >= limit20) ;_j = ((int)(0 + _j + step20))  ) {
RDebugUtils.currentLine=14811158;
 //BA.debugLineNum = 14811158;BA.debugLine="Log(\"INI DIAA : \"&CLV1.GetPanel(j).GetView(0";
anywheresoftware.b4a.keywords.Common.Log("INI DIAA : "+mostCurrent._clv1._getpanel(_j).GetView((int) (0)).GetView((int) (1)).GetView((int) (0)).getText()+" & ID:"+mostCurrent._clv1._getpanel(_j).GetView((int) (0)).GetView((int) (3)).getText());
RDebugUtils.currentLine=14811159;
 //BA.debugLineNum = 14811159;BA.debugLine="ExecuteRemoteQuery(\"UPDATE detail_office_bui";
_executeremotequery("UPDATE detail_office_building_facilities SET quantity_of_facilities ="+mostCurrent._clv1._getpanel(_j).GetView((int) (0)).GetView((int) (1)).GetView((int) (0)).getText()+" WHERE office_building_id = '"+_idbuilding+"' and facility_id ="+mostCurrent._clv1._getpanel(_j).GetView((int) (0)).GetView((int) (3)).getText(),"Update");
 }
};
RDebugUtils.currentLine=14811162;
 //BA.debugLineNum = 14811162;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 break; }
case 2: {
 break; }
case 3: {
 break; }
case 4: {
 break; }
}
;
 break; }
}
;
RDebugUtils.currentLine=14811172;
 //BA.debugLineNum = 14811172;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createitem(int _width,String _title,String _content,int _id) throws Exception{
RDebugUtils.currentModule="editbuildingfacility";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createitem"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createitem", new Object[] {_width,_title,_content,_id});
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 100%x,6%y)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6),mostCurrent.activityBA));
RDebugUtils.currentLine=14680067;
 //BA.debugLineNum = 14680067;BA.debugLine="p.LoadLayout(\"facility_edit\")";
_p.LoadLayout("facility_edit",mostCurrent.activityBA);
RDebugUtils.currentLine=14680068;
 //BA.debugLineNum = 14680068;BA.debugLine="numfc.Text = Title";
mostCurrent._numfc.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=14680069;
 //BA.debugLineNum = 14680069;BA.debugLine="namefc.Text = Content";
mostCurrent._namefc.setText(BA.ObjectToCharSequence(_content));
RDebugUtils.currentLine=14680070;
 //BA.debugLineNum = 14680070;BA.debugLine="idfaci.Text = id";
mostCurrent._idfaci.setText(BA.ObjectToCharSequence(_id));
RDebugUtils.currentLine=14680071;
 //BA.debugLineNum = 14680071;BA.debugLine="SetBackgroundTintList(numfc, Colors.ARGB(225,3,15";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._numfc.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=14680072;
 //BA.debugLineNum = 14680072;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_p.getObject()));
RDebugUtils.currentLine=14680073;
 //BA.debugLineNum = 14680073;BA.debugLine="End Sub";
return null;
}
public static String  _setbackgroundtintlist(anywheresoftware.b4a.objects.ConcreteViewWrapper _view,int _active,int _enabled) throws Exception{
RDebugUtils.currentModule="editbuildingfacility";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setbackgroundtintlist"))
	return (String) Debug.delegate(mostCurrent.activityBA, "setbackgroundtintlist", new Object[] {_view,_active,_enabled});
int[][] _states = null;
int[] _color = null;
anywheresoftware.b4j.object.JavaObject _csl = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Dim States(2,1) As Int";
_states = new int[(int) (2)][];
{
int d0 = _states.length;
int d1 = (int) (1);
for (int i0 = 0;i0 < d0;i0++) {
_states[i0] = new int[d1];
}
}
;
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="States(0,0) = 16842908     'Active";
_states[(int) (0)][(int) (0)] = (int) (16842908);
RDebugUtils.currentLine=14548995;
 //BA.debugLineNum = 14548995;BA.debugLine="States(1,0) = 16842910    'Enabled";
_states[(int) (1)][(int) (0)] = (int) (16842910);
RDebugUtils.currentLine=14548996;
 //BA.debugLineNum = 14548996;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
_color = new int[]{_active,_enabled};
RDebugUtils.currentLine=14548997;
 //BA.debugLineNum = 14548997;BA.debugLine="Dim CSL As JavaObject";
_csl = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=14548998;
 //BA.debugLineNum = 14548998;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
_csl.InitializeNewInstance("android.content.res.ColorStateList",new Object[]{(Object)(_states),(Object)(_color)});
RDebugUtils.currentLine=14548999;
 //BA.debugLineNum = 14548999;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=14549000;
 //BA.debugLineNum = 14549000;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
_jo.InitializeStatic("android.support.v4.view.ViewCompat");
RDebugUtils.currentLine=14549001;
 //BA.debugLineNum = 14549001;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
_jo.RunMethod("setBackgroundTintList",new Object[]{(Object)(_view.getObject()),(Object)(_csl.getObject())});
RDebugUtils.currentLine=14549002;
 //BA.debugLineNum = 14549002;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="editbuildingfacility";
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
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _fasilitas_array = null;
int _i = 0;
String _content = "";
int _quantity = 0;
int _idnya = 0;
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=14745603;
 //BA.debugLineNum = 14745603;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
RDebugUtils.currentLine=14745604;
 //BA.debugLineNum = 14745604;BA.debugLine="Log(\"Response from server :\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server :"+_res);
RDebugUtils.currentLine=14745605;
 //BA.debugLineNum = 14745605;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"Update","AllFacilities","Facility","DeleteFacility")) {
case 0: {
RDebugUtils.currentLine=14745607;
 //BA.debugLineNum = 14745607;BA.debugLine="Try";
try {RDebugUtils.currentLine=14745609;
 //BA.debugLineNum = 14745609;BA.debugLine="RefreshData";
_refreshdata();
 } 
       catch (Exception e10) {
			processBA.setLastException(e10);RDebugUtils.currentLine=14745611;
 //BA.debugLineNum = 14745611;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=14745612;
 //BA.debugLineNum = 14745612;BA.debugLine="Msgbox(\"Errorr\",\"\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Errorr"),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
RDebugUtils.currentLine=14745613;
 //BA.debugLineNum = 14745613;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 };
 break; }
case 1: {
RDebugUtils.currentLine=14745616;
 //BA.debugLineNum = 14745616;BA.debugLine="Dim parserf As JSONParser 'mengambil data dala";
_parserf = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=14745617;
 //BA.debugLineNum = 14745617;BA.debugLine="Dim parserfa As JSONParser";
_parserfa = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=14745618;
 //BA.debugLineNum = 14745618;BA.debugLine="parserf.Initialize(res)";
_parserf.Initialize(_res);
RDebugUtils.currentLine=14745619;
 //BA.debugLineNum = 14745619;BA.debugLine="Dim fasi_array As List = parserf.NextArray";
_fasi_array = new anywheresoftware.b4a.objects.collections.List();
_fasi_array = _parserf.NextArray();
RDebugUtils.currentLine=14745620;
 //BA.debugLineNum = 14745620;BA.debugLine="parserfa.Initialize(res)";
_parserfa.Initialize(_res);
RDebugUtils.currentLine=14745621;
 //BA.debugLineNum = 14745621;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=14745622;
 //BA.debugLineNum = 14745622;BA.debugLine="If fasi_array.Size-1 < 0 Then";
if (_fasi_array.getSize()-1<0) { 
RDebugUtils.currentLine=14745623;
 //BA.debugLineNum = 14745623;BA.debugLine="Panel1.Enabled=False";
mostCurrent._panel1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14745624;
 //BA.debugLineNum = 14745624;BA.debugLine="Panel1.Color=Colors.ARGB(225,247,247,247)";
mostCurrent._panel1.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (247),(int) (247),(int) (247)));
RDebugUtils.currentLine=14745625;
 //BA.debugLineNum = 14745625;BA.debugLine="Label2.TextColor=0xFFCECECE";
mostCurrent._label2.setTextColor((int) (0xffcecece));
RDebugUtils.currentLine=14745626;
 //BA.debugLineNum = 14745626;BA.debugLine="Panel1.Visible=True";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=14745628;
 //BA.debugLineNum = 14745628;BA.debugLine="For c=0 To fasi_array.Size - 1";
{
final int step27 = 1;
final int limit27 = (int) (_fasi_array.getSize()-1);
_c = (int) (0) ;
for (;(step27 > 0 && _c <= limit27) || (step27 < 0 && _c >= limit27) ;_c = ((int)(0 + _c + step27))  ) {
RDebugUtils.currentLine=14745629;
 //BA.debugLineNum = 14745629;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14745630;
 //BA.debugLineNum = 14745630;BA.debugLine="a = fasi_array.Get(c)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_fasi_array.Get(_c)));
RDebugUtils.currentLine=14745632;
 //BA.debugLineNum = 14745632;BA.debugLine="Dim id, name As String";
_id = "";
_name = "";
RDebugUtils.currentLine=14745633;
 //BA.debugLineNum = 14745633;BA.debugLine="id=a.Get(\"facility_id\")";
_id = BA.ObjectToString(_a.Get((Object)("facility_id")));
RDebugUtils.currentLine=14745634;
 //BA.debugLineNum = 14745634;BA.debugLine="name=a.Get(\"name_of_facility\")";
_name = BA.ObjectToString(_a.Get((Object)("name_of_facility")));
RDebugUtils.currentLine=14745635;
 //BA.debugLineNum = 14745635;BA.debugLine="Log(\"id: \"&id&\" | name: \"&name)";
anywheresoftware.b4a.keywords.Common.Log("id: "+_id+" | name: "+_name);
 }
};
RDebugUtils.currentLine=14745637;
 //BA.debugLineNum = 14745637;BA.debugLine="Panel1.Enabled=True";
mostCurrent._panel1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=14745638;
 //BA.debugLineNum = 14745638;BA.debugLine="Panel1.Color=Colors.White";
mostCurrent._panel1.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=14745639;
 //BA.debugLineNum = 14745639;BA.debugLine="Label2.TextColor=Colors.Black";
mostCurrent._label2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=14745640;
 //BA.debugLineNum = 14745640;BA.debugLine="Panel1.Visible =True";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=14745643;
 //BA.debugLineNum = 14745643;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 break; }
case 2: {
RDebugUtils.currentLine=14745645;
 //BA.debugLineNum = 14745645;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=14745646;
 //BA.debugLineNum = 14745646;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=14745647;
 //BA.debugLineNum = 14745647;BA.debugLine="Dim fasilitas_array As List";
_fasilitas_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14745648;
 //BA.debugLineNum = 14745648;BA.debugLine="fasilitas_array = parser.NextArray";
_fasilitas_array = _parser.NextArray();
RDebugUtils.currentLine=14745649;
 //BA.debugLineNum = 14745649;BA.debugLine="arraysize = fasilitas_array.Size";
_arraysize = _fasilitas_array.getSize();
RDebugUtils.currentLine=14745650;
 //BA.debugLineNum = 14745650;BA.debugLine="If fasilitas_array.Size > 0 Then";
if (_fasilitas_array.getSize()>0) { 
RDebugUtils.currentLine=14745651;
 //BA.debugLineNum = 14745651;BA.debugLine="For i=0 To fasilitas_array.Size - 1";
{
final int step48 = 1;
final int limit48 = (int) (_fasilitas_array.getSize()-1);
_i = (int) (0) ;
for (;(step48 > 0 && _i <= limit48) || (step48 < 0 && _i >= limit48) ;_i = ((int)(0 + _i + step48))  ) {
RDebugUtils.currentLine=14745652;
 //BA.debugLineNum = 14745652;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14745653;
 //BA.debugLineNum = 14745653;BA.debugLine="a = fasilitas_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_fasilitas_array.Get(_i)));
RDebugUtils.currentLine=14745655;
 //BA.debugLineNum = 14745655;BA.debugLine="Dim content As String = a.Get(\"name_of_facil";
_content = BA.ObjectToString(_a.Get((Object)("name_of_facility")));
RDebugUtils.currentLine=14745656;
 //BA.debugLineNum = 14745656;BA.debugLine="Dim quantity As Int = a.Get(\"quantity_of_fac";
_quantity = (int)(BA.ObjectToNumber(_a.Get((Object)("quantity_of_facilities"))));
RDebugUtils.currentLine=14745657;
 //BA.debugLineNum = 14745657;BA.debugLine="Dim idnya As Int = a.Get(\"facility_id\")";
_idnya = (int)(BA.ObjectToNumber(_a.Get((Object)("facility_id"))));
RDebugUtils.currentLine=14745658;
 //BA.debugLineNum = 14745658;BA.debugLine="CLV1.Add(CreateItem(CLV1.AsView.Width, $\"${q";
mostCurrent._clv1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(mostCurrent._clv1._asview().getWidth(),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_quantity))+""),_content,_idnya).getObject())),(Object)(""));
RDebugUtils.currentLine=14745659;
 //BA.debugLineNum = 14745659;BA.debugLine="CLV1.AsView.Height = ListItem.Height*(i+1)";
mostCurrent._clv1._asview().setHeight((int) (mostCurrent._listitem.getHeight()*(_i+1)));
 }
};
RDebugUtils.currentLine=14745662;
 //BA.debugLineNum = 14745662;BA.debugLine="Label3.Visible=False";
mostCurrent._label3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14745663;
 //BA.debugLineNum = 14745663;BA.debugLine="CLV1.AsView.Height = CLV1.AsView.Height + 1%y";
mostCurrent._clv1._asview().setHeight((int) (mostCurrent._clv1._asview().getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA)));
RDebugUtils.currentLine=14745664;
 //BA.debugLineNum = 14745664;BA.debugLine="CLV1.sv.Height = CLV1.AsView.Height";
mostCurrent._clv1._sv.setHeight(mostCurrent._clv1._asview().getHeight());
RDebugUtils.currentLine=14745665;
 //BA.debugLineNum = 14745665;BA.debugLine="PFacility.Height = CLV1.AsView.Top + CLV1.AsV";
mostCurrent._pfacility.setHeight((int) (mostCurrent._clv1._asview().getTop()+mostCurrent._clv1._asview().getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA)));
RDebugUtils.currentLine=14745666;
 //BA.debugLineNum = 14745666;BA.debugLine="Panel1.Top=PFacility.Height+PFacility.Top+3%y";
mostCurrent._panel1.setTop((int) (mostCurrent._pfacility.getHeight()+mostCurrent._pfacility.getTop()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),mostCurrent.activityBA)));
RDebugUtils.currentLine=14745667;
 //BA.debugLineNum = 14745667;BA.debugLine="BtnSaveChanges.Top=Panel1.Top+Panel1.Height+3";
mostCurrent._btnsavechanges.setTop((int) (mostCurrent._panel1.getTop()+mostCurrent._panel1.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),mostCurrent.activityBA)));
 }else {
RDebugUtils.currentLine=14745669;
 //BA.debugLineNum = 14745669;BA.debugLine="Label3.Visible=True";
mostCurrent._label3.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=14745670;
 //BA.debugLineNum = 14745670;BA.debugLine="Label3.Height= 15%y";
mostCurrent._label3.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=14745671;
 //BA.debugLineNum = 14745671;BA.debugLine="Label3.Top=LblFacility.Height";
mostCurrent._label3.setTop(mostCurrent._lblfacility.getHeight());
RDebugUtils.currentLine=14745672;
 //BA.debugLineNum = 14745672;BA.debugLine="PFacility.Height=Label3.Top+Label3.Height";
mostCurrent._pfacility.setHeight((int) (mostCurrent._label3.getTop()+mostCurrent._label3.getHeight()));
RDebugUtils.currentLine=14745673;
 //BA.debugLineNum = 14745673;BA.debugLine="Panel1.Top=PFacility.Height+PFacility.Top+3%y";
mostCurrent._panel1.setTop((int) (mostCurrent._pfacility.getHeight()+mostCurrent._pfacility.getTop()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),mostCurrent.activityBA)));
RDebugUtils.currentLine=14745674;
 //BA.debugLineNum = 14745674;BA.debugLine="BtnSaveChanges.Top=Panel1.Top+Panel1.Height+3";
mostCurrent._btnsavechanges.setTop((int) (mostCurrent._panel1.getTop()+mostCurrent._panel1.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),mostCurrent.activityBA)));
 };
RDebugUtils.currentLine=14745677;
 //BA.debugLineNum = 14745677;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 break; }
case 3: {
RDebugUtils.currentLine=14745679;
 //BA.debugLineNum = 14745679;BA.debugLine="Try";
try {RDebugUtils.currentLine=14745680;
 //BA.debugLineNum = 14745680;BA.debugLine="RefreshData";
_refreshdata();
RDebugUtils.currentLine=14745681;
 //BA.debugLineNum = 14745681;BA.debugLine="ToastMessageShow(\"Deleted\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Deleted"),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e77) {
			processBA.setLastException(e77);RDebugUtils.currentLine=14745683;
 //BA.debugLineNum = 14745683;BA.debugLine="Msgbox(\"Data can not be updated :(\" , \"error\"";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Data can not be updated :("),BA.ObjectToCharSequence("error"),mostCurrent.activityBA);
 };
 break; }
}
;
 };
RDebugUtils.currentLine=14745688;
 //BA.debugLineNum = 14745688;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=14745689;
 //BA.debugLineNum = 14745689;BA.debugLine="End Sub";
return "";
}
public static String  _panel1_click() throws Exception{
RDebugUtils.currentModule="editbuildingfacility";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panel1_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "panel1_click", null);
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Sub Panel1_Click";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="StartActivity(AddBuildingFacility)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._addbuildingfacility.getObject()));
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="End Sub";
return "";
}
}