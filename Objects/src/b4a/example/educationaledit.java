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

public class educationaledit extends Activity implements B4AActivity{
	public static educationaledit mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.educationaledit");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (educationaledit).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.educationaledit");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.educationaledit", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (educationaledit) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (educationaledit) Resume **");
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
		return educationaledit.class;
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
        BA.LogInfo("** Activity (educationaledit) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (educationaledit) Resume **");
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
public static String _lat = "";
public static String _lng = "";
public static String _level = "";
public static String _levelname = "";
public static String _typeschool = "";
public static String _typeschoolname = "";
public static String _cons = "";
public static String _consname = "";
public static String _typecons = "";
public static String _idlevel = "";
public static String _idcons = "";
public static String _idtype = "";
public static int _tipe_i = 0;
public static int _level_i = 0;
public static int _lbangunan_i = 0;
public static int _lparkir_i = 0;
public static int _ltanah_i = 0;
public static int _listrik_i = 0;
public static int _tahun_i = 0;
public static int _cons_i = 0;
public static int _teacher_i = 0;
public static int _student_i = 0;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _titlebar = null;
public anywheresoftware.b4a.objects.LabelWrapper _backarrow = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelbuildinglist = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbledit = null;
public anywheresoftware.b4a.objects.LabelWrapper _standingyear = null;
public anywheresoftware.b4a.objects.LabelWrapper _buildingarea = null;
public anywheresoftware.b4a.objects.LabelWrapper _landarea = null;
public anywheresoftware.b4a.objects.LabelWrapper _parkingarea = null;
public anywheresoftware.b4a.objects.LabelWrapper _electricity = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _construction = null;
public anywheresoftware.b4a.objects.LabelWrapper _educationname = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _typeofeducation = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _schoollevel = null;
public anywheresoftware.b4a.objects.LabelWrapper _headmaster = null;
public anywheresoftware.b4a.objects.LabelWrapper _numteacher = null;
public anywheresoftware.b4a.objects.LabelWrapper _numstudent = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneltoolbar = null;
public static String _ids = "";
public anywheresoftware.b4a.objects.collections.Map _edumap = null;
public anywheresoftware.b4a.objects.collections.Map _consmap = null;
public anywheresoftware.b4a.objects.collections.Map _levelmap = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsavechanges = null;
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
public b4a.example.maincamera _maincamera = null;
public b4a.example.fileutil _fileutil = null;
public b4a.example.showimage _showimage = null;
public b4a.example.browsegallery _browsegallery = null;
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
RDebugUtils.currentModule="educationaledit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
anywheresoftware.b4a.objects.ScrollViewWrapper _sv = null;
RDebugUtils.currentLine=23986176;
 //BA.debugLineNum = 23986176;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=23986178;
 //BA.debugLineNum = 23986178;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=23986179;
 //BA.debugLineNum = 23986179;BA.debugLine="ScrollView1.Panel.LoadLayout(\"EducationalEdit\")";
mostCurrent._scrollview1.getPanel().LoadLayout("EducationalEdit",mostCurrent.activityBA);
RDebugUtils.currentLine=23986180;
 //BA.debugLineNum = 23986180;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._panelbuildinglist.getHeight());
RDebugUtils.currentLine=23986181;
 //BA.debugLineNum = 23986181;BA.debugLine="PanelToolbar.Visible = False";
mostCurrent._paneltoolbar.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23986183;
 //BA.debugLineNum = 23986183;BA.debugLine="SetBackgroundTintList(EducationName, Colors.ARGB(";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._educationname.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=23986184;
 //BA.debugLineNum = 23986184;BA.debugLine="SetBackgroundTintList(Headmaster, Colors.ARGB(225";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._headmaster.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=23986185;
 //BA.debugLineNum = 23986185;BA.debugLine="SetBackgroundTintList(NumTeacher, Colors.ARGB(225";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._numteacher.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=23986186;
 //BA.debugLineNum = 23986186;BA.debugLine="SetBackgroundTintList(NumStudent, Colors.ARGB(225";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._numstudent.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=23986187;
 //BA.debugLineNum = 23986187;BA.debugLine="SetBackgroundTintList(StandingYear, Colors.ARGB(2";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._standingyear.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=23986188;
 //BA.debugLineNum = 23986188;BA.debugLine="SetBackgroundTintList(BuildingArea, Colors.ARGB(2";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._buildingarea.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=23986189;
 //BA.debugLineNum = 23986189;BA.debugLine="SetBackgroundTintList(LandArea, Colors.ARGB(225,3";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._landarea.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=23986190;
 //BA.debugLineNum = 23986190;BA.debugLine="SetBackgroundTintList(Electricity, Colors.ARGB(22";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._electricity.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=23986191;
 //BA.debugLineNum = 23986191;BA.debugLine="SetBackgroundTintList(ParkingArea, Colors.ARGB(22";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._parkingarea.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=23986194;
 //BA.debugLineNum = 23986194;BA.debugLine="BackArrow.Visible= True";
mostCurrent._backarrow.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23986195;
 //BA.debugLineNum = 23986195;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
mostCurrent._backarrow.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"back-arrow.png").getObject()));
RDebugUtils.currentLine=23986196;
 //BA.debugLineNum = 23986196;BA.debugLine="TitleBar.Text=\"Building Detail\"";
mostCurrent._titlebar.setText(BA.ObjectToCharSequence("Building Detail"));
RDebugUtils.currentLine=23986199;
 //BA.debugLineNum = 23986199;BA.debugLine="If EducationalBuilding.nameBuilding.Length > 0 Th";
if (mostCurrent._educationalbuilding._namebuilding.length()>0) { 
RDebugUtils.currentLine=23986200;
 //BA.debugLineNum = 23986200;BA.debugLine="EducationName.Text = EducationalBuilding.nameBui";
mostCurrent._educationname.setText(BA.ObjectToCharSequence(mostCurrent._educationalbuilding._namebuilding));
RDebugUtils.currentLine=23986201;
 //BA.debugLineNum = 23986201;BA.debugLine="ids =EducationalBuilding.idBuilding";
mostCurrent._ids = mostCurrent._educationalbuilding._idbuilding;
RDebugUtils.currentLine=23986202;
 //BA.debugLineNum = 23986202;BA.debugLine="Log(ids)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._ids);
 }else 
{RDebugUtils.currentLine=23986203;
 //BA.debugLineNum = 23986203;BA.debugLine="Else If SearchBuilding.nameBuilding.Length > 0 Th";
if (mostCurrent._searchbuilding._namebuilding.length()>0) { 
RDebugUtils.currentLine=23986204;
 //BA.debugLineNum = 23986204;BA.debugLine="EducationName.Text = SearchBuilding.nameBuilding";
mostCurrent._educationname.setText(BA.ObjectToCharSequence(mostCurrent._searchbuilding._namebuilding));
RDebugUtils.currentLine=23986205;
 //BA.debugLineNum = 23986205;BA.debugLine="ids =SearchBuilding.idBuilding";
mostCurrent._ids = mostCurrent._searchbuilding._idbuilding;
RDebugUtils.currentLine=23986206;
 //BA.debugLineNum = 23986206;BA.debugLine="Log(ids)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._ids);
 }else {
RDebugUtils.currentLine=23986208;
 //BA.debugLineNum = 23986208;BA.debugLine="EducationName.Text = \"Please press on the button";
mostCurrent._educationname.setText(BA.ObjectToCharSequence("Please press on the button and choose an item."));
 }}
;
RDebugUtils.currentLine=23986211;
 //BA.debugLineNum = 23986211;BA.debugLine="EduMap.Initialize";
mostCurrent._edumap.Initialize();
RDebugUtils.currentLine=23986212;
 //BA.debugLineNum = 23986212;BA.debugLine="ConsMap.Initialize";
mostCurrent._consmap.Initialize();
RDebugUtils.currentLine=23986213;
 //BA.debugLineNum = 23986213;BA.debugLine="LevelMap.Initialize";
mostCurrent._levelmap.Initialize();
RDebugUtils.currentLine=23986215;
 //BA.debugLineNum = 23986215;BA.debugLine="Dim sv As ScrollView";
_sv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=23986216;
 //BA.debugLineNum = 23986216;BA.debugLine="ScrollView1.Height=100%y";
mostCurrent._scrollview1.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=23986217;
 //BA.debugLineNum = 23986217;BA.debugLine="PanelBuildingList.Height=BtnSaveChanges.Top+BtnSa";
mostCurrent._panelbuildinglist.setHeight((int) (mostCurrent._btnsavechanges.getTop()+mostCurrent._btnsavechanges.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA)));
RDebugUtils.currentLine=23986218;
 //BA.debugLineNum = 23986218;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._panelbuildinglist.getHeight());
RDebugUtils.currentLine=23986219;
 //BA.debugLineNum = 23986219;BA.debugLine="End Sub";
return "";
}
public static String  _setbackgroundtintlist(anywheresoftware.b4a.objects.ConcreteViewWrapper _view,int _active,int _enabled) throws Exception{
RDebugUtils.currentModule="educationaledit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setbackgroundtintlist"))
	return (String) Debug.delegate(mostCurrent.activityBA, "setbackgroundtintlist", new Object[] {_view,_active,_enabled});
int[][] _states = null;
int[] _color = null;
anywheresoftware.b4j.object.JavaObject _csl = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=24182784;
 //BA.debugLineNum = 24182784;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
RDebugUtils.currentLine=24182785;
 //BA.debugLineNum = 24182785;BA.debugLine="Dim States(2,1) As Int";
_states = new int[(int) (2)][];
{
int d0 = _states.length;
int d1 = (int) (1);
for (int i0 = 0;i0 < d0;i0++) {
_states[i0] = new int[d1];
}
}
;
RDebugUtils.currentLine=24182786;
 //BA.debugLineNum = 24182786;BA.debugLine="States(0,0) = 16842908     'Active";
_states[(int) (0)][(int) (0)] = (int) (16842908);
RDebugUtils.currentLine=24182787;
 //BA.debugLineNum = 24182787;BA.debugLine="States(1,0) = 16842910    'Enabled";
_states[(int) (1)][(int) (0)] = (int) (16842910);
RDebugUtils.currentLine=24182788;
 //BA.debugLineNum = 24182788;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
_color = new int[]{_active,_enabled};
RDebugUtils.currentLine=24182789;
 //BA.debugLineNum = 24182789;BA.debugLine="Dim CSL As JavaObject";
_csl = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=24182790;
 //BA.debugLineNum = 24182790;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
_csl.InitializeNewInstance("android.content.res.ColorStateList",new Object[]{(Object)(_states),(Object)(_color)});
RDebugUtils.currentLine=24182791;
 //BA.debugLineNum = 24182791;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=24182792;
 //BA.debugLineNum = 24182792;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
_jo.InitializeStatic("android.support.v4.view.ViewCompat");
RDebugUtils.currentLine=24182793;
 //BA.debugLineNum = 24182793;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
_jo.RunMethod("setBackgroundTintList",new Object[]{(Object)(_view.getObject()),(Object)(_csl.getObject())});
RDebugUtils.currentLine=24182794;
 //BA.debugLineNum = 24182794;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="educationaledit";
RDebugUtils.currentLine=24117248;
 //BA.debugLineNum = 24117248;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=24117250;
 //BA.debugLineNum = 24117250;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="educationaledit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=24051712;
 //BA.debugLineNum = 24051712;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=24051713;
 //BA.debugLineNum = 24051713;BA.debugLine="EduMap.Clear";
mostCurrent._edumap.Clear();
RDebugUtils.currentLine=24051714;
 //BA.debugLineNum = 24051714;BA.debugLine="ConsMap.Clear";
mostCurrent._consmap.Clear();
RDebugUtils.currentLine=24051715;
 //BA.debugLineNum = 24051715;BA.debugLine="LevelMap.Clear";
mostCurrent._levelmap.Clear();
RDebugUtils.currentLine=24051716;
 //BA.debugLineNum = 24051716;BA.debugLine="CreateSchoolLevel";
_createschoollevel();
RDebugUtils.currentLine=24051717;
 //BA.debugLineNum = 24051717;BA.debugLine="ProgressDialogShow(\"Loading...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Loading..."));
RDebugUtils.currentLine=24051718;
 //BA.debugLineNum = 24051718;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.educational_building";
_executeremotequery("SELECT D.educational_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_educational_building_facilities As D LEFT JOIN educational_building_facilities As F ON F.facility_id=D.facility_id WHERE D.educational_building_id ='"+mostCurrent._ids+"'","FASILITAS");
RDebugUtils.currentLine=24051719;
 //BA.debugLineNum = 24051719;BA.debugLine="ExecuteRemoteQuery(\"SELECT E.educational_building";
_executeremotequery("SELECT E.educational_building_id, E.name_of_educational_building, E.building_area, E.land_area, E.parking_area, E.standing_year, E.electricity_capacity, E.address, E.type_of_construction, E.id_level_of_education, E.headmaster_name, E.total_students, E.total_teachers, E.school_type,ST_X(ST_Centroid(E.geom)) As longitude, ST_Y(ST_CENTROID(E.geom)) As latitude, T.name_of_type As constr, L.name_of_level As level, ST_AsText(geom) As geom FROM educational_building As E	LEFT JOIN type_of_construction As T ON E.type_of_construction=T.type_id	LEFT JOIN level_of_education As L ON E.id_level_of_education=L.level_id	WHERE E.educational_building_id='"+mostCurrent._ids+"'","DATA");
RDebugUtils.currentLine=24051720;
 //BA.debugLineNum = 24051720;BA.debugLine="ExecuteRemoteQuery(\"SELECT level_id, name_of_leve";
_executeremotequery("SELECT level_id, name_of_level FROM level_of_education ORDER BY name_of_level ASC","TypeEducation");
RDebugUtils.currentLine=24051721;
 //BA.debugLineNum = 24051721;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_type";
_executeremotequery("SELECT type_id, name_of_type FROM type_of_construction ORDER BY name_of_type ASC ","Construction");
RDebugUtils.currentLine=24051722;
 //BA.debugLineNum = 24051722;BA.debugLine="End Sub";
return "";
}
public static String  _createschoollevel() throws Exception{
RDebugUtils.currentModule="educationaledit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createschoollevel"))
	return (String) Debug.delegate(mostCurrent.activityBA, "createschoollevel", null);
RDebugUtils.currentLine=24248320;
 //BA.debugLineNum = 24248320;BA.debugLine="Sub CreateSchoolLevel";
RDebugUtils.currentLine=24248321;
 //BA.debugLineNum = 24248321;BA.debugLine="TypeOfEducation.Add(\"Private School\")";
mostCurrent._typeofeducation.Add("Private School");
RDebugUtils.currentLine=24248322;
 //BA.debugLineNum = 24248322;BA.debugLine="EduMap.Put(\"Private School\",\"0\")";
mostCurrent._edumap.Put((Object)("Private School"),(Object)("0"));
RDebugUtils.currentLine=24248323;
 //BA.debugLineNum = 24248323;BA.debugLine="TypeOfEducation.Add(\"Public School\")";
mostCurrent._typeofeducation.Add("Public School");
RDebugUtils.currentLine=24248324;
 //BA.debugLineNum = 24248324;BA.debugLine="EduMap.Put(\"Public School\",\"1\")";
mostCurrent._edumap.Put((Object)("Public School"),(Object)("1"));
RDebugUtils.currentLine=24248325;
 //BA.debugLineNum = 24248325;BA.debugLine="End Sub";
return "";
}
public static String  _executeremotequery(String _query,String _jobname) throws Exception{
RDebugUtils.currentModule="educationaledit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "executeremotequery"))
	return (String) Debug.delegate(mostCurrent.activityBA, "executeremotequery", new Object[] {_query,_jobname});
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
RDebugUtils.currentLine=24313856;
 //BA.debugLineNum = 24313856;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
RDebugUtils.currentLine=24313857;
 //BA.debugLineNum = 24313857;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=24313858;
 //BA.debugLineNum = 24313858;BA.debugLine="Job.Initialize(JobName, Me)";
_job._initialize(processBA,_jobname,educationaledit.getObject());
RDebugUtils.currentLine=24313859;
 //BA.debugLineNum = 24313859;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
_job._poststring(""+mostCurrent._main._server+"mobile/json.php",_query);
RDebugUtils.currentLine=24313860;
 //BA.debugLineNum = 24313860;BA.debugLine="End Sub";
return "";
}
public static String  _backarrow_click() throws Exception{
RDebugUtils.currentModule="educationaledit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "backarrow_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "backarrow_click", null);
RDebugUtils.currentLine=24444928;
 //BA.debugLineNum = 24444928;BA.debugLine="Sub BackArrow_Click";
RDebugUtils.currentLine=24444929;
 //BA.debugLineNum = 24444929;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=24444930;
 //BA.debugLineNum = 24444930;BA.debugLine="End Sub";
return "";
}
public static String  _btngallery_click() throws Exception{
RDebugUtils.currentModule="educationaledit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btngallery_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btngallery_click", null);
RDebugUtils.currentLine=24707072;
 //BA.debugLineNum = 24707072;BA.debugLine="Sub btnGallery_Click";
RDebugUtils.currentLine=24707074;
 //BA.debugLineNum = 24707074;BA.debugLine="End Sub";
return "";
}
public static String  _btnsavechanges_click() throws Exception{
RDebugUtils.currentModule="educationaledit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsavechanges_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnsavechanges_click", null);
RDebugUtils.currentLine=24772608;
 //BA.debugLineNum = 24772608;BA.debugLine="Sub BtnSaveChanges_Click";
RDebugUtils.currentLine=24772609;
 //BA.debugLineNum = 24772609;BA.debugLine="Log(ids)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._ids);
RDebugUtils.currentLine=24772610;
 //BA.debugLineNum = 24772610;BA.debugLine="If idtype == \"\" Then";
if ((_idtype).equals("")) { 
RDebugUtils.currentLine=24772611;
 //BA.debugLineNum = 24772611;BA.debugLine="tipe_i = typeschool";
_tipe_i = (int)(Double.parseDouble(_typeschool));
 }else {
RDebugUtils.currentLine=24772613;
 //BA.debugLineNum = 24772613;BA.debugLine="tipe_i = idtype";
_tipe_i = (int)(Double.parseDouble(_idtype));
 };
RDebugUtils.currentLine=24772616;
 //BA.debugLineNum = 24772616;BA.debugLine="lbangunan_i = BuildingArea.Text";
_lbangunan_i = (int)(Double.parseDouble(mostCurrent._buildingarea.getText()));
RDebugUtils.currentLine=24772617;
 //BA.debugLineNum = 24772617;BA.debugLine="lparkir_i = ParkingArea.Text";
_lparkir_i = (int)(Double.parseDouble(mostCurrent._parkingarea.getText()));
RDebugUtils.currentLine=24772618;
 //BA.debugLineNum = 24772618;BA.debugLine="ltanah_i = LandArea.Text";
_ltanah_i = (int)(Double.parseDouble(mostCurrent._landarea.getText()));
RDebugUtils.currentLine=24772619;
 //BA.debugLineNum = 24772619;BA.debugLine="listrik_i = Electricity.Text";
_listrik_i = (int)(Double.parseDouble(mostCurrent._electricity.getText()));
RDebugUtils.currentLine=24772620;
 //BA.debugLineNum = 24772620;BA.debugLine="tahun_i = StandingYear.Text";
_tahun_i = (int)(Double.parseDouble(mostCurrent._standingyear.getText()));
RDebugUtils.currentLine=24772621;
 //BA.debugLineNum = 24772621;BA.debugLine="teacher_i = NumTeacher.Text";
_teacher_i = (int)(Double.parseDouble(mostCurrent._numteacher.getText()));
RDebugUtils.currentLine=24772622;
 //BA.debugLineNum = 24772622;BA.debugLine="student_i = NumStudent.Text";
_student_i = (int)(Double.parseDouble(mostCurrent._numstudent.getText()));
RDebugUtils.currentLine=24772624;
 //BA.debugLineNum = 24772624;BA.debugLine="If idlevel == \"\" Then";
if ((_idlevel).equals("")) { 
RDebugUtils.currentLine=24772625;
 //BA.debugLineNum = 24772625;BA.debugLine="level_i = level";
_level_i = (int)(Double.parseDouble(_level));
 }else {
RDebugUtils.currentLine=24772627;
 //BA.debugLineNum = 24772627;BA.debugLine="level_i = idlevel";
_level_i = (int)(Double.parseDouble(_idlevel));
 };
RDebugUtils.currentLine=24772630;
 //BA.debugLineNum = 24772630;BA.debugLine="If idcons == \"\" Then";
if ((_idcons).equals("")) { 
RDebugUtils.currentLine=24772631;
 //BA.debugLineNum = 24772631;BA.debugLine="cons_i = cons";
_cons_i = (int)(Double.parseDouble(_cons));
 }else {
RDebugUtils.currentLine=24772633;
 //BA.debugLineNum = 24772633;BA.debugLine="cons_i = idcons";
_cons_i = (int)(Double.parseDouble(_idcons));
 };
RDebugUtils.currentLine=24772636;
 //BA.debugLineNum = 24772636;BA.debugLine="Log(tipe_i)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_tipe_i));
RDebugUtils.currentLine=24772637;
 //BA.debugLineNum = 24772637;BA.debugLine="Log(cons_i)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_cons_i));
RDebugUtils.currentLine=24772638;
 //BA.debugLineNum = 24772638;BA.debugLine="If IsNumber(tipe_i) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(BA.NumberToString(_tipe_i))) { 
RDebugUtils.currentLine=24772639;
 //BA.debugLineNum = 24772639;BA.debugLine="Log(\"\"&tipe_i&\" is a number\")";
anywheresoftware.b4a.keywords.Common.Log(""+BA.NumberToString(_tipe_i)+" is a number");
 }else {
RDebugUtils.currentLine=24772641;
 //BA.debugLineNum = 24772641;BA.debugLine="Log(\"\"&tipe_i&\" is not a number\")";
anywheresoftware.b4a.keywords.Common.Log(""+BA.NumberToString(_tipe_i)+" is not a number");
 };
RDebugUtils.currentLine=24772643;
 //BA.debugLineNum = 24772643;BA.debugLine="ProgressDialogShow(\"loading...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("loading..."));
RDebugUtils.currentLine=24772644;
 //BA.debugLineNum = 24772644;BA.debugLine="ExecuteRemoteQuery(\"UPDATE educational_building S";
_executeremotequery("UPDATE educational_building SET	name_of_educational_building = '"+mostCurrent._educationname.getText()+"', headmaster_name = '"+mostCurrent._headmaster.getText()+"', total_students = "+BA.NumberToString(_student_i)+", total_teachers = "+BA.NumberToString(_teacher_i)+", school_type = "+BA.NumberToString(_tipe_i)+", id_level_of_education = "+BA.NumberToString(_level_i)+", standing_year = "+BA.NumberToString(_tahun_i)+",building_area = "+BA.NumberToString(_lbangunan_i)+",land_area = "+BA.NumberToString(_ltanah_i)+",parking_area = "+BA.NumberToString(_lparkir_i)+", electricity_capacity = "+BA.NumberToString(_listrik_i)+", type_of_construction = "+BA.NumberToString(_cons_i)+"	WHERE educational_building_id = '"+mostCurrent._ids+"'","Update");
RDebugUtils.currentLine=24772646;
 //BA.debugLineNum = 24772646;BA.debugLine="End Sub";
return "";
}
public static String  _construction_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="educationaledit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "construction_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "construction_itemclick", new Object[] {_position,_value});
String _id = "";
RDebugUtils.currentLine=24641536;
 //BA.debugLineNum = 24641536;BA.debugLine="Sub Construction_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=24641537;
 //BA.debugLineNum = 24641537;BA.debugLine="Dim id As String";
_id = "";
RDebugUtils.currentLine=24641538;
 //BA.debugLineNum = 24641538;BA.debugLine="id = ConsMap.Get(Value)";
_id = BA.ObjectToString(mostCurrent._consmap.Get(_value));
RDebugUtils.currentLine=24641539;
 //BA.debugLineNum = 24641539;BA.debugLine="idcons = id";
_idcons = _id;
RDebugUtils.currentLine=24641540;
 //BA.debugLineNum = 24641540;BA.debugLine="Log(idcons)";
anywheresoftware.b4a.keywords.Common.Log(_idcons);
RDebugUtils.currentLine=24641541;
 //BA.debugLineNum = 24641541;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="educationaledit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _data_array = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _a = null;
anywheresoftware.b4a.objects.collections.List _type_array = null;
String _namatype = "";
String _id_type = "";
anywheresoftware.b4a.objects.collections.List _cons_array = null;
int _j = 0;
String _nama_type = "";
RDebugUtils.currentLine=24379392;
 //BA.debugLineNum = 24379392;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=24379393;
 //BA.debugLineNum = 24379393;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=24379395;
 //BA.debugLineNum = 24379395;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
RDebugUtils.currentLine=24379396;
 //BA.debugLineNum = 24379396;BA.debugLine="Log(\"Response:\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response:"+_res);
RDebugUtils.currentLine=24379397;
 //BA.debugLineNum = 24379397;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=24379398;
 //BA.debugLineNum = 24379398;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=24379399;
 //BA.debugLineNum = 24379399;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"DATA","TypeEducation","Construction","Update")) {
case 0: {
RDebugUtils.currentLine=24379401;
 //BA.debugLineNum = 24379401;BA.debugLine="Dim data_array As List";
_data_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=24379402;
 //BA.debugLineNum = 24379402;BA.debugLine="data_array = parser.NextArray";
_data_array = _parser.NextArray();
RDebugUtils.currentLine=24379403;
 //BA.debugLineNum = 24379403;BA.debugLine="For i=0 To data_array.Size -1";
{
final int step11 = 1;
final int limit11 = (int) (_data_array.getSize()-1);
_i = (int) (0) ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
RDebugUtils.currentLine=24379404;
 //BA.debugLineNum = 24379404;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24379405;
 //BA.debugLineNum = 24379405;BA.debugLine="a = data_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_data_array.Get(_i)));
RDebugUtils.currentLine=24379406;
 //BA.debugLineNum = 24379406;BA.debugLine="lat = a.Get(\"latitude\")";
_lat = BA.ObjectToString(_a.Get((Object)("latitude")));
RDebugUtils.currentLine=24379407;
 //BA.debugLineNum = 24379407;BA.debugLine="lng = a.Get(\"longitude\")";
_lng = BA.ObjectToString(_a.Get((Object)("longitude")));
RDebugUtils.currentLine=24379408;
 //BA.debugLineNum = 24379408;BA.debugLine="Log(lat)";
anywheresoftware.b4a.keywords.Common.Log(_lat);
RDebugUtils.currentLine=24379409;
 //BA.debugLineNum = 24379409;BA.debugLine="Log(lng)";
anywheresoftware.b4a.keywords.Common.Log(_lng);
RDebugUtils.currentLine=24379411;
 //BA.debugLineNum = 24379411;BA.debugLine="EducationName.Text = a.Get(\"name_of_education";
mostCurrent._educationname.setText(BA.ObjectToCharSequence(_a.Get((Object)("name_of_educational_building"))));
RDebugUtils.currentLine=24379412;
 //BA.debugLineNum = 24379412;BA.debugLine="Headmaster.Text = a.Get(\"headmaster_name\")";
mostCurrent._headmaster.setText(BA.ObjectToCharSequence(_a.Get((Object)("headmaster_name"))));
RDebugUtils.currentLine=24379413;
 //BA.debugLineNum = 24379413;BA.debugLine="NumTeacher.Text = a.Get(\"total_teachers\")";
mostCurrent._numteacher.setText(BA.ObjectToCharSequence(_a.Get((Object)("total_teachers"))));
RDebugUtils.currentLine=24379414;
 //BA.debugLineNum = 24379414;BA.debugLine="NumStudent.Text = a.Get(\"total_students\")";
mostCurrent._numstudent.setText(BA.ObjectToCharSequence(_a.Get((Object)("total_students"))));
RDebugUtils.currentLine=24379415;
 //BA.debugLineNum = 24379415;BA.debugLine="StandingYear.Text = a.Get(\"standing_year\")";
mostCurrent._standingyear.setText(BA.ObjectToCharSequence(_a.Get((Object)("standing_year"))));
RDebugUtils.currentLine=24379416;
 //BA.debugLineNum = 24379416;BA.debugLine="BuildingArea.Text = a.Get(\"building_area\")";
mostCurrent._buildingarea.setText(BA.ObjectToCharSequence(_a.Get((Object)("building_area"))));
RDebugUtils.currentLine=24379417;
 //BA.debugLineNum = 24379417;BA.debugLine="LandArea.Text = a.Get(\"land_area\")";
mostCurrent._landarea.setText(BA.ObjectToCharSequence(_a.Get((Object)("land_area"))));
RDebugUtils.currentLine=24379418;
 //BA.debugLineNum = 24379418;BA.debugLine="ParkingArea.Text = a.Get(\"parking_area\")";
mostCurrent._parkingarea.setText(BA.ObjectToCharSequence(_a.Get((Object)("parking_area"))));
RDebugUtils.currentLine=24379419;
 //BA.debugLineNum = 24379419;BA.debugLine="Electricity.Text = a.Get(\"electricity_capacit";
mostCurrent._electricity.setText(BA.ObjectToCharSequence(_a.Get((Object)("electricity_capacity"))));
RDebugUtils.currentLine=24379420;
 //BA.debugLineNum = 24379420;BA.debugLine="level = a.Get(\"id_level_of_education\")";
_level = BA.ObjectToString(_a.Get((Object)("id_level_of_education")));
RDebugUtils.currentLine=24379421;
 //BA.debugLineNum = 24379421;BA.debugLine="levelname = a.Get(\"level\")";
_levelname = BA.ObjectToString(_a.Get((Object)("level")));
RDebugUtils.currentLine=24379422;
 //BA.debugLineNum = 24379422;BA.debugLine="typeschool = a.Get(\"school_type\")";
_typeschool = BA.ObjectToString(_a.Get((Object)("school_type")));
RDebugUtils.currentLine=24379423;
 //BA.debugLineNum = 24379423;BA.debugLine="cons = a.Get(\"type_of_construction\")";
_cons = BA.ObjectToString(_a.Get((Object)("type_of_construction")));
RDebugUtils.currentLine=24379424;
 //BA.debugLineNum = 24379424;BA.debugLine="consname = a.Get(\"constr\")";
_consname = BA.ObjectToString(_a.Get((Object)("constr")));
RDebugUtils.currentLine=24379425;
 //BA.debugLineNum = 24379425;BA.debugLine="Select typeschool";
switch (BA.switchObjectToInt(_typeschool,"0","1")) {
case 0: {
RDebugUtils.currentLine=24379427;
 //BA.debugLineNum = 24379427;BA.debugLine="typeschoolname = \"Private School\"";
_typeschoolname = "Private School";
 break; }
case 1: {
RDebugUtils.currentLine=24379429;
 //BA.debugLineNum = 24379429;BA.debugLine="typeschoolname = \"Public School\"";
_typeschoolname = "Public School";
 break; }
}
;
RDebugUtils.currentLine=24379431;
 //BA.debugLineNum = 24379431;BA.debugLine="Log(typeschoolname)";
anywheresoftware.b4a.keywords.Common.Log(_typeschoolname);
RDebugUtils.currentLine=24379433;
 //BA.debugLineNum = 24379433;BA.debugLine="If StandingYear.Text == \"null\" Then";
if ((mostCurrent._standingyear.getText()).equals("null")) { 
RDebugUtils.currentLine=24379434;
 //BA.debugLineNum = 24379434;BA.debugLine="StandingYear.Text = \"0\"";
mostCurrent._standingyear.setText(BA.ObjectToCharSequence("0"));
 };
RDebugUtils.currentLine=24379436;
 //BA.debugLineNum = 24379436;BA.debugLine="If BuildingArea.Text == \"null\" Then";
if ((mostCurrent._buildingarea.getText()).equals("null")) { 
RDebugUtils.currentLine=24379437;
 //BA.debugLineNum = 24379437;BA.debugLine="BuildingArea.Text = \"0\"";
mostCurrent._buildingarea.setText(BA.ObjectToCharSequence("0"));
 };
RDebugUtils.currentLine=24379439;
 //BA.debugLineNum = 24379439;BA.debugLine="If ParkingArea.Text == \"null\" Then";
if ((mostCurrent._parkingarea.getText()).equals("null")) { 
RDebugUtils.currentLine=24379440;
 //BA.debugLineNum = 24379440;BA.debugLine="ParkingArea.Text = \"0\"";
mostCurrent._parkingarea.setText(BA.ObjectToCharSequence("0"));
 };
RDebugUtils.currentLine=24379442;
 //BA.debugLineNum = 24379442;BA.debugLine="If Electricity.Text == \"null\" Then";
if ((mostCurrent._electricity.getText()).equals("null")) { 
RDebugUtils.currentLine=24379443;
 //BA.debugLineNum = 24379443;BA.debugLine="Electricity.Text = \"0\"";
mostCurrent._electricity.setText(BA.ObjectToCharSequence("0"));
 };
RDebugUtils.currentLine=24379445;
 //BA.debugLineNum = 24379445;BA.debugLine="If LandArea.Text == \"null\" Then";
if ((mostCurrent._landarea.getText()).equals("null")) { 
RDebugUtils.currentLine=24379446;
 //BA.debugLineNum = 24379446;BA.debugLine="LandArea.Text = \"0\"";
mostCurrent._landarea.setText(BA.ObjectToCharSequence("0"));
 };
 }
};
RDebugUtils.currentLine=24379449;
 //BA.debugLineNum = 24379449;BA.debugLine="schoollevel.SelectedIndex = schoollevel.IndexO";
mostCurrent._schoollevel.setSelectedIndex(mostCurrent._schoollevel.IndexOf(_levelname));
RDebugUtils.currentLine=24379450;
 //BA.debugLineNum = 24379450;BA.debugLine="TypeOfEducation.SelectedIndex = TypeOfEducatio";
mostCurrent._typeofeducation.setSelectedIndex(mostCurrent._typeofeducation.IndexOf(_typeschoolname));
RDebugUtils.currentLine=24379451;
 //BA.debugLineNum = 24379451;BA.debugLine="Construction.SelectedIndex = Construction.Inde";
mostCurrent._construction.setSelectedIndex(mostCurrent._construction.IndexOf(_consname));
RDebugUtils.currentLine=24379452;
 //BA.debugLineNum = 24379452;BA.debugLine="Log(\"TYpe: \"&TypeOfEducation.SelectedIndex&\" L";
anywheresoftware.b4a.keywords.Common.Log("TYpe: "+BA.NumberToString(mostCurrent._typeofeducation.getSelectedIndex())+" Level: "+BA.NumberToString(mostCurrent._schoollevel.getSelectedIndex())+" COns :"+BA.NumberToString(mostCurrent._construction.getSelectedIndex()));
RDebugUtils.currentLine=24379453;
 //BA.debugLineNum = 24379453;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 break; }
case 1: {
RDebugUtils.currentLine=24379456;
 //BA.debugLineNum = 24379456;BA.debugLine="Dim type_array As List";
_type_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=24379457;
 //BA.debugLineNum = 24379457;BA.debugLine="type_array = parser.NextArray";
_type_array = _parser.NextArray();
RDebugUtils.currentLine=24379458;
 //BA.debugLineNum = 24379458;BA.debugLine="For i=0 To type_array.Size -1";
{
final int step63 = 1;
final int limit63 = (int) (_type_array.getSize()-1);
_i = (int) (0) ;
for (;(step63 > 0 && _i <= limit63) || (step63 < 0 && _i >= limit63) ;_i = ((int)(0 + _i + step63))  ) {
RDebugUtils.currentLine=24379459;
 //BA.debugLineNum = 24379459;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24379460;
 //BA.debugLineNum = 24379460;BA.debugLine="a = type_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_type_array.Get(_i)));
RDebugUtils.currentLine=24379461;
 //BA.debugLineNum = 24379461;BA.debugLine="Dim namatype, id_type As String";
_namatype = "";
_id_type = "";
RDebugUtils.currentLine=24379462;
 //BA.debugLineNum = 24379462;BA.debugLine="namatype= a.Get(\"name_of_level\")";
_namatype = BA.ObjectToString(_a.Get((Object)("name_of_level")));
RDebugUtils.currentLine=24379463;
 //BA.debugLineNum = 24379463;BA.debugLine="id_type = a.Get(\"level_id\")";
_id_type = BA.ObjectToString(_a.Get((Object)("level_id")));
RDebugUtils.currentLine=24379464;
 //BA.debugLineNum = 24379464;BA.debugLine="schoollevel.Add(namatype)";
mostCurrent._schoollevel.Add(_namatype);
RDebugUtils.currentLine=24379465;
 //BA.debugLineNum = 24379465;BA.debugLine="LevelMap.Put(namatype,id_type)";
mostCurrent._levelmap.Put((Object)(_namatype),(Object)(_id_type));
RDebugUtils.currentLine=24379466;
 //BA.debugLineNum = 24379466;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&id_type)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_namatype+" "+_id_type);
 }
};
 break; }
case 2: {
RDebugUtils.currentLine=24379470;
 //BA.debugLineNum = 24379470;BA.debugLine="Dim cons_array As List";
_cons_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=24379471;
 //BA.debugLineNum = 24379471;BA.debugLine="cons_array = parser.NextArray";
_cons_array = _parser.NextArray();
RDebugUtils.currentLine=24379472;
 //BA.debugLineNum = 24379472;BA.debugLine="For j=0 To cons_array.Size -1";
{
final int step76 = 1;
final int limit76 = (int) (_cons_array.getSize()-1);
_j = (int) (0) ;
for (;(step76 > 0 && _j <= limit76) || (step76 < 0 && _j >= limit76) ;_j = ((int)(0 + _j + step76))  ) {
RDebugUtils.currentLine=24379473;
 //BA.debugLineNum = 24379473;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24379474;
 //BA.debugLineNum = 24379474;BA.debugLine="a = cons_array.Get(j)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_cons_array.Get(_j)));
RDebugUtils.currentLine=24379475;
 //BA.debugLineNum = 24379475;BA.debugLine="Dim nama_type, id_type As String";
_nama_type = "";
_id_type = "";
RDebugUtils.currentLine=24379476;
 //BA.debugLineNum = 24379476;BA.debugLine="nama_type= a.Get(\"name_of_type\")";
_nama_type = BA.ObjectToString(_a.Get((Object)("name_of_type")));
RDebugUtils.currentLine=24379477;
 //BA.debugLineNum = 24379477;BA.debugLine="id_type  = a.Get(\"type_id\")";
_id_type = BA.ObjectToString(_a.Get((Object)("type_id")));
RDebugUtils.currentLine=24379478;
 //BA.debugLineNum = 24379478;BA.debugLine="Construction.Add(nama_type)";
mostCurrent._construction.Add(_nama_type);
RDebugUtils.currentLine=24379479;
 //BA.debugLineNum = 24379479;BA.debugLine="ConsMap.Put(nama_type, id_type )";
mostCurrent._consmap.Put((Object)(_nama_type),(Object)(_id_type));
RDebugUtils.currentLine=24379480;
 //BA.debugLineNum = 24379480;BA.debugLine="Log(\"ID Map: \"&nama_type&\" \"& id_type )";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_nama_type+" "+_id_type);
 }
};
 break; }
case 3: {
RDebugUtils.currentLine=24379484;
 //BA.debugLineNum = 24379484;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=24379485;
 //BA.debugLineNum = 24379485;BA.debugLine="Try";
try {RDebugUtils.currentLine=24379486;
 //BA.debugLineNum = 24379486;BA.debugLine="Msgbox(\"Data has been updated! :)\",\"Success\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Data has been updated! :)"),BA.ObjectToCharSequence("Success"),mostCurrent.activityBA);
RDebugUtils.currentLine=24379487;
 //BA.debugLineNum = 24379487;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 } 
       catch (Exception e92) {
			processBA.setLastException(e92);RDebugUtils.currentLine=24379489;
 //BA.debugLineNum = 24379489;BA.debugLine="Msgbox(\"Data can not be updated :(\" , \"error\"";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Data can not be updated :("),BA.ObjectToCharSequence("error"),mostCurrent.activityBA);
 };
 break; }
}
;
 };
RDebugUtils.currentLine=24379493;
 //BA.debugLineNum = 24379493;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=24379495;
 //BA.debugLineNum = 24379495;BA.debugLine="End Sub";
return "";
}
public static String  _schoollevel_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="educationaledit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "schoollevel_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "schoollevel_itemclick", new Object[] {_position,_value});
String _id = "";
RDebugUtils.currentLine=24576000;
 //BA.debugLineNum = 24576000;BA.debugLine="Sub SchoolLevel_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=24576001;
 //BA.debugLineNum = 24576001;BA.debugLine="Dim id As String";
_id = "";
RDebugUtils.currentLine=24576002;
 //BA.debugLineNum = 24576002;BA.debugLine="id = LevelMap.Get(Value)";
_id = BA.ObjectToString(mostCurrent._levelmap.Get(_value));
RDebugUtils.currentLine=24576003;
 //BA.debugLineNum = 24576003;BA.debugLine="idlevel = id";
_idlevel = _id;
RDebugUtils.currentLine=24576004;
 //BA.debugLineNum = 24576004;BA.debugLine="Log(idlevel)";
anywheresoftware.b4a.keywords.Common.Log(_idlevel);
RDebugUtils.currentLine=24576005;
 //BA.debugLineNum = 24576005;BA.debugLine="End Sub";
return "";
}
public static String  _typeofeducation_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="educationaledit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "typeofeducation_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "typeofeducation_itemclick", new Object[] {_position,_value});
String _id = "";
RDebugUtils.currentLine=24510464;
 //BA.debugLineNum = 24510464;BA.debugLine="Sub TypeOfEducation_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=24510465;
 //BA.debugLineNum = 24510465;BA.debugLine="Dim id As String";
_id = "";
RDebugUtils.currentLine=24510466;
 //BA.debugLineNum = 24510466;BA.debugLine="id = EduMap.Get(Value)";
_id = BA.ObjectToString(mostCurrent._edumap.Get(_value));
RDebugUtils.currentLine=24510467;
 //BA.debugLineNum = 24510467;BA.debugLine="idtype = id";
_idtype = _id;
RDebugUtils.currentLine=24510468;
 //BA.debugLineNum = 24510468;BA.debugLine="Log(idtype)";
anywheresoftware.b4a.keywords.Common.Log(_idtype);
RDebugUtils.currentLine=24510469;
 //BA.debugLineNum = 24510469;BA.debugLine="End Sub";
return "";
}
}