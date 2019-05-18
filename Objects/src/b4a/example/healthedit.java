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

public class healthedit extends Activity implements B4AActivity{
	public static healthedit mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.healthedit");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (healthedit).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.healthedit");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.healthedit", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (healthedit) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (healthedit) Resume **");
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
		return healthedit.class;
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
        BA.LogInfo("** Activity (healthedit) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (healthedit) Resume **");
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
public static String _nama = "";
public static String _kepala = "";
public static String _tipe = "";
public static String _jenis = "";
public static String _tahun = "";
public static String _ltanah = "";
public static String _lparkir = "";
public static String _lbangunan = "";
public static String _listrik = "";
public static String _kons = "";
public static String _medic = "";
public static String _nonmedic = "";
public static String _tipp = "";
public static String _tipname = "";
public static String _typehealth = "";
public static String _cons = "";
public static String _consname = "";
public static String _typecons = "";
public static int _tipe_i = 0;
public static int _jenis_i = 0;
public static int _lbangunan_i = 0;
public static int _lparkir_i = 0;
public static int _ltanah_i = 0;
public static int _listrik_i = 0;
public static int _tahun_i = 0;
public static int _cons_i = 0;
public static int _medic_i = 0;
public static int _nonmedic_i = 0;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _titlebar = null;
public anywheresoftware.b4a.objects.LabelWrapper _backarrow = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelbuildinglist = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneltoolbar = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbledit = null;
public static String _ids = "";
public anywheresoftware.b4a.objects.SpinnerWrapper _typeofhealth = null;
public anywheresoftware.b4a.objects.LabelWrapper _headoffice = null;
public anywheresoftware.b4a.objects.LabelWrapper _nummedical = null;
public anywheresoftware.b4a.objects.LabelWrapper _numnonmedical = null;
public anywheresoftware.b4a.objects.LabelWrapper _standingyear = null;
public anywheresoftware.b4a.objects.LabelWrapper _buildingarea = null;
public anywheresoftware.b4a.objects.LabelWrapper _landarea = null;
public anywheresoftware.b4a.objects.LabelWrapper _parkingarea = null;
public anywheresoftware.b4a.objects.LabelWrapper _electricity = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _construction = null;
public anywheresoftware.b4a.objects.LabelWrapper _healthname = null;
public anywheresoftware.b4a.objects.collections.Map _healthmap = null;
public anywheresoftware.b4a.objects.collections.Map _consmap = null;
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
public b4a.example.searchworship _searchworship = null;
public b4a.example.multipartpost _multipartpost = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="healthedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
anywheresoftware.b4a.objects.ScrollViewWrapper _sv = null;
RDebugUtils.currentLine=34144256;
 //BA.debugLineNum = 34144256;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=34144258;
 //BA.debugLineNum = 34144258;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=34144259;
 //BA.debugLineNum = 34144259;BA.debugLine="ScrollView1.Panel.LoadLayout(\"HealthEdit\")";
mostCurrent._scrollview1.getPanel().LoadLayout("HealthEdit",mostCurrent.activityBA);
RDebugUtils.currentLine=34144260;
 //BA.debugLineNum = 34144260;BA.debugLine="PanelToolbar.Visible = False";
mostCurrent._paneltoolbar.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=34144261;
 //BA.debugLineNum = 34144261;BA.debugLine="LblEdit.Visible = True";
mostCurrent._lbledit.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=34144263;
 //BA.debugLineNum = 34144263;BA.debugLine="BackArrow.Visible= True";
mostCurrent._backarrow.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=34144264;
 //BA.debugLineNum = 34144264;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
mostCurrent._backarrow.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"back-arrow.png").getObject()));
RDebugUtils.currentLine=34144265;
 //BA.debugLineNum = 34144265;BA.debugLine="TitleBar.Text=\"Building Detail\"";
mostCurrent._titlebar.setText(BA.ObjectToCharSequence("Building Detail"));
RDebugUtils.currentLine=34144267;
 //BA.debugLineNum = 34144267;BA.debugLine="SetBackgroundTintList(HealthName, Colors.ARGB(225";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._healthname.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=34144268;
 //BA.debugLineNum = 34144268;BA.debugLine="SetBackgroundTintList(HeadOffice, Colors.ARGB(225";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._headoffice.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=34144269;
 //BA.debugLineNum = 34144269;BA.debugLine="SetBackgroundTintList(NumMedical, Colors.ARGB(225";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._nummedical.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=34144270;
 //BA.debugLineNum = 34144270;BA.debugLine="SetBackgroundTintList(NumNonMedical, Colors.ARGB(";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._numnonmedical.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=34144271;
 //BA.debugLineNum = 34144271;BA.debugLine="SetBackgroundTintList(StandingYear, Colors.ARGB(2";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._standingyear.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=34144272;
 //BA.debugLineNum = 34144272;BA.debugLine="SetBackgroundTintList(BuildingArea, Colors.ARGB(2";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._buildingarea.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=34144273;
 //BA.debugLineNum = 34144273;BA.debugLine="SetBackgroundTintList(LandArea, Colors.ARGB(225,3";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._landarea.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=34144274;
 //BA.debugLineNum = 34144274;BA.debugLine="SetBackgroundTintList(Electricity, Colors.ARGB(22";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._electricity.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=34144275;
 //BA.debugLineNum = 34144275;BA.debugLine="SetBackgroundTintList(ParkingArea, Colors.ARGB(22";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._parkingarea.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=34144278;
 //BA.debugLineNum = 34144278;BA.debugLine="If HealthBuilding.nameBuilding.Length > 0 Then";
if (mostCurrent._healthbuilding._namebuilding.length()>0) { 
RDebugUtils.currentLine=34144279;
 //BA.debugLineNum = 34144279;BA.debugLine="HealthName.Text = HealthBuilding.nameBuilding";
mostCurrent._healthname.setText(BA.ObjectToCharSequence(mostCurrent._healthbuilding._namebuilding));
RDebugUtils.currentLine=34144280;
 //BA.debugLineNum = 34144280;BA.debugLine="ids =HealthBuilding.idBuilding";
mostCurrent._ids = mostCurrent._healthbuilding._idbuilding;
RDebugUtils.currentLine=34144281;
 //BA.debugLineNum = 34144281;BA.debugLine="Log(ids)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._ids);
 }else 
{RDebugUtils.currentLine=34144282;
 //BA.debugLineNum = 34144282;BA.debugLine="Else If SearchBuilding.nameBuilding.Length > 0 Th";
if (mostCurrent._searchbuilding._namebuilding.length()>0) { 
RDebugUtils.currentLine=34144283;
 //BA.debugLineNum = 34144283;BA.debugLine="HealthName.Text = SearchBuilding.nameBuilding";
mostCurrent._healthname.setText(BA.ObjectToCharSequence(mostCurrent._searchbuilding._namebuilding));
RDebugUtils.currentLine=34144284;
 //BA.debugLineNum = 34144284;BA.debugLine="ids =SearchBuilding.idBuilding";
mostCurrent._ids = mostCurrent._searchbuilding._idbuilding;
RDebugUtils.currentLine=34144285;
 //BA.debugLineNum = 34144285;BA.debugLine="Log(ids)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._ids);
 }else {
RDebugUtils.currentLine=34144287;
 //BA.debugLineNum = 34144287;BA.debugLine="HealthName.Text = \"Please press on the button an";
mostCurrent._healthname.setText(BA.ObjectToCharSequence("Please press on the button and choose an item."));
 }}
;
RDebugUtils.currentLine=34144291;
 //BA.debugLineNum = 34144291;BA.debugLine="Dim sv As ScrollView";
_sv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=34144292;
 //BA.debugLineNum = 34144292;BA.debugLine="ScrollView1.Height=100%y";
mostCurrent._scrollview1.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=34144293;
 //BA.debugLineNum = 34144293;BA.debugLine="PanelBuildingList.Height = BtnSaveChanges.Top+Btn";
mostCurrent._panelbuildinglist.setHeight((int) (mostCurrent._btnsavechanges.getTop()+mostCurrent._btnsavechanges.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA)));
RDebugUtils.currentLine=34144294;
 //BA.debugLineNum = 34144294;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._panelbuildinglist.getHeight());
RDebugUtils.currentLine=34144295;
 //BA.debugLineNum = 34144295;BA.debugLine="End Sub";
return "";
}
public static String  _setbackgroundtintlist(anywheresoftware.b4a.objects.ConcreteViewWrapper _view,int _active,int _enabled) throws Exception{
RDebugUtils.currentModule="healthedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setbackgroundtintlist"))
	return (String) Debug.delegate(mostCurrent.activityBA, "setbackgroundtintlist", new Object[] {_view,_active,_enabled});
int[][] _states = null;
int[] _color = null;
anywheresoftware.b4j.object.JavaObject _csl = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=34340864;
 //BA.debugLineNum = 34340864;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
RDebugUtils.currentLine=34340865;
 //BA.debugLineNum = 34340865;BA.debugLine="Dim States(2,1) As Int";
_states = new int[(int) (2)][];
{
int d0 = _states.length;
int d1 = (int) (1);
for (int i0 = 0;i0 < d0;i0++) {
_states[i0] = new int[d1];
}
}
;
RDebugUtils.currentLine=34340866;
 //BA.debugLineNum = 34340866;BA.debugLine="States(0,0) = 16842908     'Active";
_states[(int) (0)][(int) (0)] = (int) (16842908);
RDebugUtils.currentLine=34340867;
 //BA.debugLineNum = 34340867;BA.debugLine="States(1,0) = 16842910    'Enabled";
_states[(int) (1)][(int) (0)] = (int) (16842910);
RDebugUtils.currentLine=34340868;
 //BA.debugLineNum = 34340868;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
_color = new int[]{_active,_enabled};
RDebugUtils.currentLine=34340869;
 //BA.debugLineNum = 34340869;BA.debugLine="Dim CSL As JavaObject";
_csl = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=34340870;
 //BA.debugLineNum = 34340870;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
_csl.InitializeNewInstance("android.content.res.ColorStateList",new Object[]{(Object)(_states),(Object)(_color)});
RDebugUtils.currentLine=34340871;
 //BA.debugLineNum = 34340871;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=34340872;
 //BA.debugLineNum = 34340872;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
_jo.InitializeStatic("android.support.v4.view.ViewCompat");
RDebugUtils.currentLine=34340873;
 //BA.debugLineNum = 34340873;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
_jo.RunMethod("setBackgroundTintList",new Object[]{(Object)(_view.getObject()),(Object)(_csl.getObject())});
RDebugUtils.currentLine=34340874;
 //BA.debugLineNum = 34340874;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="healthedit";
RDebugUtils.currentLine=34275328;
 //BA.debugLineNum = 34275328;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=34275330;
 //BA.debugLineNum = 34275330;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="healthedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=34209792;
 //BA.debugLineNum = 34209792;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=34209793;
 //BA.debugLineNum = 34209793;BA.debugLine="HealthMap.Initialize";
mostCurrent._healthmap.Initialize();
RDebugUtils.currentLine=34209794;
 //BA.debugLineNum = 34209794;BA.debugLine="ConsMap.Initialize";
mostCurrent._consmap.Initialize();
RDebugUtils.currentLine=34209795;
 //BA.debugLineNum = 34209795;BA.debugLine="HealthMap.Clear";
mostCurrent._healthmap.Clear();
RDebugUtils.currentLine=34209796;
 //BA.debugLineNum = 34209796;BA.debugLine="ConsMap.Clear";
mostCurrent._consmap.Clear();
RDebugUtils.currentLine=34209797;
 //BA.debugLineNum = 34209797;BA.debugLine="ProgressDialogShow(\"Loading...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Loading..."));
RDebugUtils.currentLine=34209798;
 //BA.debugLineNum = 34209798;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_type";
_executeremotequery("SELECT type_id, name_of_type FROM type_of_construction ORDER BY name_of_type ASC ","Construction");
RDebugUtils.currentLine=34209799;
 //BA.debugLineNum = 34209799;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_type";
_executeremotequery("SELECT type_id, name_of_type FROM type_of_health_building ORDER BY name_of_type ASC","TypeHealth");
RDebugUtils.currentLine=34209800;
 //BA.debugLineNum = 34209800;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.health_building_id,";
_executeremotequery("SELECT H.health_building_id, H.name_of_health_building, H.building_area, H.land_area, H.parking_area, H.standing_year, H.electricity_capacity, H.address, H.type_of_construction, H.type_of_health_building, H.name_of_head, H.number_of_medical_personnel, H.number_of_nonmedical_personnel, ST_X(ST_Centroid(H.geom)) As longitude, ST_Y(ST_CENTROID(H.geom)) As latitude,T.name_of_type As constr, J.name_of_type As typeh,ST_AsText(geom) As geom FROM health_building As H LEFT JOIN type_of_construction As T ON H.type_of_construction=T.type_id LEFT JOIN type_of_health_building As J ON H.type_of_health_building=J.type_id WHERE H.health_building_id='"+mostCurrent._ids+"'","DATA");
RDebugUtils.currentLine=34209802;
 //BA.debugLineNum = 34209802;BA.debugLine="End Sub";
return "";
}
public static String  _executeremotequery(String _query,String _jobname) throws Exception{
RDebugUtils.currentModule="healthedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "executeremotequery"))
	return (String) Debug.delegate(mostCurrent.activityBA, "executeremotequery", new Object[] {_query,_jobname});
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
RDebugUtils.currentLine=34406400;
 //BA.debugLineNum = 34406400;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
RDebugUtils.currentLine=34406401;
 //BA.debugLineNum = 34406401;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=34406402;
 //BA.debugLineNum = 34406402;BA.debugLine="Job.Initialize(JobName, Me)";
_job._initialize(processBA,_jobname,healthedit.getObject());
RDebugUtils.currentLine=34406403;
 //BA.debugLineNum = 34406403;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
_job._poststring(""+mostCurrent._main._server+"mobile/json.php",_query);
RDebugUtils.currentLine=34406404;
 //BA.debugLineNum = 34406404;BA.debugLine="End Sub";
return "";
}
public static String  _backarrow_click() throws Exception{
RDebugUtils.currentModule="healthedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "backarrow_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "backarrow_click", null);
RDebugUtils.currentLine=34537472;
 //BA.debugLineNum = 34537472;BA.debugLine="Sub BackArrow_Click";
RDebugUtils.currentLine=34537473;
 //BA.debugLineNum = 34537473;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=34537474;
 //BA.debugLineNum = 34537474;BA.debugLine="End Sub";
return "";
}
public static String  _btngallery_click() throws Exception{
RDebugUtils.currentModule="healthedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btngallery_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btngallery_click", null);
RDebugUtils.currentLine=34603008;
 //BA.debugLineNum = 34603008;BA.debugLine="Sub btnGallery_Click";
RDebugUtils.currentLine=34603011;
 //BA.debugLineNum = 34603011;BA.debugLine="End Sub";
return "";
}
public static String  _btnsavechanges_click() throws Exception{
RDebugUtils.currentModule="healthedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsavechanges_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnsavechanges_click", null);
RDebugUtils.currentLine=34799616;
 //BA.debugLineNum = 34799616;BA.debugLine="Sub BtnSaveChanges_Click";
RDebugUtils.currentLine=34799617;
 //BA.debugLineNum = 34799617;BA.debugLine="Log(ids)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._ids);
RDebugUtils.currentLine=34799618;
 //BA.debugLineNum = 34799618;BA.debugLine="If typehealth == \"\" Then";
if ((_typehealth).equals("")) { 
RDebugUtils.currentLine=34799619;
 //BA.debugLineNum = 34799619;BA.debugLine="tipe_i = tipp";
_tipe_i = (int)(Double.parseDouble(_tipp));
 }else {
RDebugUtils.currentLine=34799621;
 //BA.debugLineNum = 34799621;BA.debugLine="tipe_i = typehealth";
_tipe_i = (int)(Double.parseDouble(_typehealth));
 };
RDebugUtils.currentLine=34799624;
 //BA.debugLineNum = 34799624;BA.debugLine="lbangunan_i = BuildingArea.Text";
_lbangunan_i = (int)(Double.parseDouble(mostCurrent._buildingarea.getText()));
RDebugUtils.currentLine=34799625;
 //BA.debugLineNum = 34799625;BA.debugLine="lparkir_i = ParkingArea.Text";
_lparkir_i = (int)(Double.parseDouble(mostCurrent._parkingarea.getText()));
RDebugUtils.currentLine=34799626;
 //BA.debugLineNum = 34799626;BA.debugLine="ltanah_i = LandArea.Text";
_ltanah_i = (int)(Double.parseDouble(mostCurrent._landarea.getText()));
RDebugUtils.currentLine=34799627;
 //BA.debugLineNum = 34799627;BA.debugLine="listrik_i = Electricity.Text";
_listrik_i = (int)(Double.parseDouble(mostCurrent._electricity.getText()));
RDebugUtils.currentLine=34799628;
 //BA.debugLineNum = 34799628;BA.debugLine="tahun_i = StandingYear.Text";
_tahun_i = (int)(Double.parseDouble(mostCurrent._standingyear.getText()));
RDebugUtils.currentLine=34799629;
 //BA.debugLineNum = 34799629;BA.debugLine="medic_i = NumMedical.Text";
_medic_i = (int)(Double.parseDouble(mostCurrent._nummedical.getText()));
RDebugUtils.currentLine=34799630;
 //BA.debugLineNum = 34799630;BA.debugLine="nonmedic_i = NumNonMedical.Text";
_nonmedic_i = (int)(Double.parseDouble(mostCurrent._numnonmedical.getText()));
RDebugUtils.currentLine=34799632;
 //BA.debugLineNum = 34799632;BA.debugLine="If typecons == \"\" Then";
if ((_typecons).equals("")) { 
RDebugUtils.currentLine=34799633;
 //BA.debugLineNum = 34799633;BA.debugLine="cons_i = cons";
_cons_i = (int)(Double.parseDouble(_cons));
 }else {
RDebugUtils.currentLine=34799635;
 //BA.debugLineNum = 34799635;BA.debugLine="cons_i = typecons";
_cons_i = (int)(Double.parseDouble(_typecons));
 };
RDebugUtils.currentLine=34799638;
 //BA.debugLineNum = 34799638;BA.debugLine="Log(tipe_i)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_tipe_i));
RDebugUtils.currentLine=34799639;
 //BA.debugLineNum = 34799639;BA.debugLine="Log(cons_i)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_cons_i));
RDebugUtils.currentLine=34799640;
 //BA.debugLineNum = 34799640;BA.debugLine="If IsNumber(tipe_i) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(BA.NumberToString(_tipe_i))) { 
RDebugUtils.currentLine=34799641;
 //BA.debugLineNum = 34799641;BA.debugLine="Log(\"\"&tipe_i&\" is a number\")";
anywheresoftware.b4a.keywords.Common.Log(""+BA.NumberToString(_tipe_i)+" is a number");
 }else {
RDebugUtils.currentLine=34799643;
 //BA.debugLineNum = 34799643;BA.debugLine="Log(\"\"&tipe_i&\" is not a number\")";
anywheresoftware.b4a.keywords.Common.Log(""+BA.NumberToString(_tipe_i)+" is not a number");
 };
RDebugUtils.currentLine=34799645;
 //BA.debugLineNum = 34799645;BA.debugLine="ProgressDialogShow(\"loading...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("loading..."));
RDebugUtils.currentLine=34799646;
 //BA.debugLineNum = 34799646;BA.debugLine="ExecuteRemoteQuery(\"UPDATE health_building SET na";
_executeremotequery("UPDATE health_building SET name_of_health_building = '"+_nama+"', type_of_health_building = "+BA.NumberToString(_tipe_i)+", building_area = "+BA.NumberToString(_lbangunan_i)+",	land_area = "+BA.NumberToString(_ltanah_i)+",parking_area = "+BA.NumberToString(_lparkir_i)+",standing_year = "+BA.NumberToString(_tahun_i)+",	electricity_capacity = "+BA.NumberToString(_listrik_i)+",type_of_construction = "+BA.NumberToString(_cons_i)+",	name_of_head = '"+_kepala+"',number_of_medical_personnel = "+BA.NumberToString(_medic_i)+",number_of_nonmedical_personnel = "+BA.NumberToString(_nonmedic_i)+" WHERE health_building_id = '"+mostCurrent._ids+"'","Update");
RDebugUtils.currentLine=34799647;
 //BA.debugLineNum = 34799647;BA.debugLine="End Sub";
return "";
}
public static String  _construction_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="healthedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "construction_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "construction_itemclick", new Object[] {_position,_value});
String _idc = "";
RDebugUtils.currentLine=34734080;
 //BA.debugLineNum = 34734080;BA.debugLine="Sub Construction_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=34734081;
 //BA.debugLineNum = 34734081;BA.debugLine="Dim idc As String";
_idc = "";
RDebugUtils.currentLine=34734082;
 //BA.debugLineNum = 34734082;BA.debugLine="idc = ConsMap.Get(Value)";
_idc = BA.ObjectToString(mostCurrent._consmap.Get(_value));
RDebugUtils.currentLine=34734083;
 //BA.debugLineNum = 34734083;BA.debugLine="typecons = idc";
_typecons = _idc;
RDebugUtils.currentLine=34734084;
 //BA.debugLineNum = 34734084;BA.debugLine="Log(typecons)";
anywheresoftware.b4a.keywords.Common.Log(_typecons);
RDebugUtils.currentLine=34734085;
 //BA.debugLineNum = 34734085;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="healthedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _data_array = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _a = null;
anywheresoftware.b4a.objects.collections.List _type_array = null;
String _namatype = "";
String _idtype = "";
anywheresoftware.b4a.objects.collections.List _cons_array = null;
int _j = 0;
String _nama_type = "";
String _id_type = "";
RDebugUtils.currentLine=34471936;
 //BA.debugLineNum = 34471936;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=34471937;
 //BA.debugLineNum = 34471937;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=34471938;
 //BA.debugLineNum = 34471938;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=34471939;
 //BA.debugLineNum = 34471939;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
RDebugUtils.currentLine=34471940;
 //BA.debugLineNum = 34471940;BA.debugLine="Log(\"Response from server :\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server :"+_res);
RDebugUtils.currentLine=34471941;
 //BA.debugLineNum = 34471941;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=34471942;
 //BA.debugLineNum = 34471942;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=34471943;
 //BA.debugLineNum = 34471943;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"DATA","TypeHealth","Construction","Update")) {
case 0: {
RDebugUtils.currentLine=34471945;
 //BA.debugLineNum = 34471945;BA.debugLine="Dim data_array As List";
_data_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=34471946;
 //BA.debugLineNum = 34471946;BA.debugLine="data_array = parser.NextArray";
_data_array = _parser.NextArray();
RDebugUtils.currentLine=34471947;
 //BA.debugLineNum = 34471947;BA.debugLine="For i=0 To data_array.Size -1";
{
final int step11 = 1;
final int limit11 = (int) (_data_array.getSize()-1);
_i = (int) (0) ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
RDebugUtils.currentLine=34471948;
 //BA.debugLineNum = 34471948;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34471949;
 //BA.debugLineNum = 34471949;BA.debugLine="a = data_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_data_array.Get(_i)));
RDebugUtils.currentLine=34471950;
 //BA.debugLineNum = 34471950;BA.debugLine="lat = a.Get(\"latitude\")";
_lat = BA.ObjectToString(_a.Get((Object)("latitude")));
RDebugUtils.currentLine=34471951;
 //BA.debugLineNum = 34471951;BA.debugLine="lng = a.Get(\"longitude\")";
_lng = BA.ObjectToString(_a.Get((Object)("longitude")));
RDebugUtils.currentLine=34471952;
 //BA.debugLineNum = 34471952;BA.debugLine="Log(lat)";
anywheresoftware.b4a.keywords.Common.Log(_lat);
RDebugUtils.currentLine=34471953;
 //BA.debugLineNum = 34471953;BA.debugLine="Log(lng)";
anywheresoftware.b4a.keywords.Common.Log(_lng);
RDebugUtils.currentLine=34471954;
 //BA.debugLineNum = 34471954;BA.debugLine="HealthName.Text = a.Get(\"name_of_health_build";
mostCurrent._healthname.setText(BA.ObjectToCharSequence(_a.Get((Object)("name_of_health_building"))));
RDebugUtils.currentLine=34471955;
 //BA.debugLineNum = 34471955;BA.debugLine="tipp = a.Get(\"type_of_health_building\")";
_tipp = BA.ObjectToString(_a.Get((Object)("type_of_health_building")));
RDebugUtils.currentLine=34471956;
 //BA.debugLineNum = 34471956;BA.debugLine="tipname = a.Get(\"typeh\")";
_tipname = BA.ObjectToString(_a.Get((Object)("typeh")));
RDebugUtils.currentLine=34471957;
 //BA.debugLineNum = 34471957;BA.debugLine="Log(\"Data jenis :\"&tipp)";
anywheresoftware.b4a.keywords.Common.Log("Data jenis :"+_tipp);
RDebugUtils.currentLine=34471958;
 //BA.debugLineNum = 34471958;BA.debugLine="HeadOffice.Text = a.Get(\"name_of_head\")";
mostCurrent._headoffice.setText(BA.ObjectToCharSequence(_a.Get((Object)("name_of_head"))));
RDebugUtils.currentLine=34471959;
 //BA.debugLineNum = 34471959;BA.debugLine="NumMedical.Text = a.Get(\"number_of_medical_pe";
mostCurrent._nummedical.setText(BA.ObjectToCharSequence(_a.Get((Object)("number_of_medical_personnel"))));
RDebugUtils.currentLine=34471960;
 //BA.debugLineNum = 34471960;BA.debugLine="NumNonMedical.Text = a.Get(\"number_of_nonmedi";
mostCurrent._numnonmedical.setText(BA.ObjectToCharSequence(_a.Get((Object)("number_of_nonmedical_personnel"))));
RDebugUtils.currentLine=34471961;
 //BA.debugLineNum = 34471961;BA.debugLine="StandingYear.Text = a.Get(\"standing_year\")";
mostCurrent._standingyear.setText(BA.ObjectToCharSequence(_a.Get((Object)("standing_year"))));
RDebugUtils.currentLine=34471962;
 //BA.debugLineNum = 34471962;BA.debugLine="BuildingArea.Text = a.Get(\"building_area\")";
mostCurrent._buildingarea.setText(BA.ObjectToCharSequence(_a.Get((Object)("building_area"))));
RDebugUtils.currentLine=34471963;
 //BA.debugLineNum = 34471963;BA.debugLine="LandArea.Text = a.Get(\"land_area\")";
mostCurrent._landarea.setText(BA.ObjectToCharSequence(_a.Get((Object)("land_area"))));
RDebugUtils.currentLine=34471964;
 //BA.debugLineNum = 34471964;BA.debugLine="ParkingArea.Text = a.Get(\"parking_area\")";
mostCurrent._parkingarea.setText(BA.ObjectToCharSequence(_a.Get((Object)("parking_area"))));
RDebugUtils.currentLine=34471965;
 //BA.debugLineNum = 34471965;BA.debugLine="Electricity.Text = a.Get(\"electricity_capacit";
mostCurrent._electricity.setText(BA.ObjectToCharSequence(_a.Get((Object)("electricity_capacity"))));
RDebugUtils.currentLine=34471966;
 //BA.debugLineNum = 34471966;BA.debugLine="cons = a.Get(\"type_of_construction\")";
_cons = BA.ObjectToString(_a.Get((Object)("type_of_construction")));
RDebugUtils.currentLine=34471967;
 //BA.debugLineNum = 34471967;BA.debugLine="consname = a.Get(\"constr\")";
_consname = BA.ObjectToString(_a.Get((Object)("constr")));
 }
};
RDebugUtils.currentLine=34471969;
 //BA.debugLineNum = 34471969;BA.debugLine="If StandingYear.Text == \"null\" Then";
if ((mostCurrent._standingyear.getText()).equals("null")) { 
RDebugUtils.currentLine=34471970;
 //BA.debugLineNum = 34471970;BA.debugLine="StandingYear.Text = \"0\"";
mostCurrent._standingyear.setText(BA.ObjectToCharSequence("0"));
 };
RDebugUtils.currentLine=34471972;
 //BA.debugLineNum = 34471972;BA.debugLine="If BuildingArea.Text == \"null\" Then";
if ((mostCurrent._buildingarea.getText()).equals("null")) { 
RDebugUtils.currentLine=34471973;
 //BA.debugLineNum = 34471973;BA.debugLine="BuildingArea.Text = \"0\"";
mostCurrent._buildingarea.setText(BA.ObjectToCharSequence("0"));
 };
RDebugUtils.currentLine=34471975;
 //BA.debugLineNum = 34471975;BA.debugLine="If ParkingArea.Text == \"null\" Then";
if ((mostCurrent._parkingarea.getText()).equals("null")) { 
RDebugUtils.currentLine=34471976;
 //BA.debugLineNum = 34471976;BA.debugLine="ParkingArea.Text = \"0\"";
mostCurrent._parkingarea.setText(BA.ObjectToCharSequence("0"));
 };
RDebugUtils.currentLine=34471978;
 //BA.debugLineNum = 34471978;BA.debugLine="If Electricity.Text == \"null\" Then";
if ((mostCurrent._electricity.getText()).equals("null")) { 
RDebugUtils.currentLine=34471979;
 //BA.debugLineNum = 34471979;BA.debugLine="Electricity.Text = \"0\"";
mostCurrent._electricity.setText(BA.ObjectToCharSequence("0"));
 };
RDebugUtils.currentLine=34471981;
 //BA.debugLineNum = 34471981;BA.debugLine="If LandArea.Text == \"null\" Then";
if ((mostCurrent._landarea.getText()).equals("null")) { 
RDebugUtils.currentLine=34471982;
 //BA.debugLineNum = 34471982;BA.debugLine="LandArea.Text = \"0\"";
mostCurrent._landarea.setText(BA.ObjectToCharSequence("0"));
 };
RDebugUtils.currentLine=34471984;
 //BA.debugLineNum = 34471984;BA.debugLine="Log(\"Data konstruksi :\"&cons)";
anywheresoftware.b4a.keywords.Common.Log("Data konstruksi :"+_cons);
RDebugUtils.currentLine=34471985;
 //BA.debugLineNum = 34471985;BA.debugLine="nama=HealthName.Text";
_nama = mostCurrent._healthname.getText();
RDebugUtils.currentLine=34471986;
 //BA.debugLineNum = 34471986;BA.debugLine="kepala = HeadOffice.Text";
_kepala = mostCurrent._headoffice.getText();
RDebugUtils.currentLine=34471987;
 //BA.debugLineNum = 34471987;BA.debugLine="medic = NumMedical.Text";
_medic = mostCurrent._nummedical.getText();
RDebugUtils.currentLine=34471988;
 //BA.debugLineNum = 34471988;BA.debugLine="nonmedic = NumNonMedical.Text";
_nonmedic = mostCurrent._numnonmedical.getText();
RDebugUtils.currentLine=34471989;
 //BA.debugLineNum = 34471989;BA.debugLine="tahun= StandingYear.Text";
_tahun = mostCurrent._standingyear.getText();
RDebugUtils.currentLine=34471990;
 //BA.debugLineNum = 34471990;BA.debugLine="ltanah= LandArea.Text";
_ltanah = mostCurrent._landarea.getText();
RDebugUtils.currentLine=34471991;
 //BA.debugLineNum = 34471991;BA.debugLine="lparkir= ParkingArea.Text";
_lparkir = mostCurrent._parkingarea.getText();
RDebugUtils.currentLine=34471992;
 //BA.debugLineNum = 34471992;BA.debugLine="lbangunan= BuildingArea.Text";
_lbangunan = mostCurrent._buildingarea.getText();
RDebugUtils.currentLine=34471993;
 //BA.debugLineNum = 34471993;BA.debugLine="listrik= Electricity.Text";
_listrik = mostCurrent._electricity.getText();
RDebugUtils.currentLine=34471995;
 //BA.debugLineNum = 34471995;BA.debugLine="TypeOfHealth.SelectedIndex = TypeOfHealth.Ind";
mostCurrent._typeofhealth.setSelectedIndex(mostCurrent._typeofhealth.IndexOf(_tipname));
RDebugUtils.currentLine=34471996;
 //BA.debugLineNum = 34471996;BA.debugLine="Construction.SelectedIndex = Construction.Ind";
mostCurrent._construction.setSelectedIndex(mostCurrent._construction.IndexOf(_consname));
RDebugUtils.currentLine=34471998;
 //BA.debugLineNum = 34471998;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 break; }
case 1: {
RDebugUtils.currentLine=34472000;
 //BA.debugLineNum = 34472000;BA.debugLine="Dim type_array As List";
_type_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=34472001;
 //BA.debugLineNum = 34472001;BA.debugLine="type_array = parser.NextArray";
_type_array = _parser.NextArray();
RDebugUtils.currentLine=34472002;
 //BA.debugLineNum = 34472002;BA.debugLine="For i=0 To type_array.Size -1";
{
final int step64 = 1;
final int limit64 = (int) (_type_array.getSize()-1);
_i = (int) (0) ;
for (;(step64 > 0 && _i <= limit64) || (step64 < 0 && _i >= limit64) ;_i = ((int)(0 + _i + step64))  ) {
RDebugUtils.currentLine=34472003;
 //BA.debugLineNum = 34472003;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34472004;
 //BA.debugLineNum = 34472004;BA.debugLine="a = type_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_type_array.Get(_i)));
RDebugUtils.currentLine=34472005;
 //BA.debugLineNum = 34472005;BA.debugLine="Dim namatype, idtype As String";
_namatype = "";
_idtype = "";
RDebugUtils.currentLine=34472006;
 //BA.debugLineNum = 34472006;BA.debugLine="namatype= a.Get(\"name_of_type\")";
_namatype = BA.ObjectToString(_a.Get((Object)("name_of_type")));
RDebugUtils.currentLine=34472007;
 //BA.debugLineNum = 34472007;BA.debugLine="idtype = a.Get(\"type_id\")";
_idtype = BA.ObjectToString(_a.Get((Object)("type_id")));
RDebugUtils.currentLine=34472009;
 //BA.debugLineNum = 34472009;BA.debugLine="TypeOfHealth.Add(namatype)";
mostCurrent._typeofhealth.Add(_namatype);
RDebugUtils.currentLine=34472010;
 //BA.debugLineNum = 34472010;BA.debugLine="HealthMap.Put(namatype,idtype)";
mostCurrent._healthmap.Put((Object)(_namatype),(Object)(_idtype));
RDebugUtils.currentLine=34472011;
 //BA.debugLineNum = 34472011;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_namatype+" "+_idtype);
 }
};
 break; }
case 2: {
RDebugUtils.currentLine=34472015;
 //BA.debugLineNum = 34472015;BA.debugLine="Dim cons_array As List";
_cons_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=34472016;
 //BA.debugLineNum = 34472016;BA.debugLine="cons_array = parser.NextArray";
_cons_array = _parser.NextArray();
RDebugUtils.currentLine=34472017;
 //BA.debugLineNum = 34472017;BA.debugLine="For j=0 To cons_array.Size -1";
{
final int step77 = 1;
final int limit77 = (int) (_cons_array.getSize()-1);
_j = (int) (0) ;
for (;(step77 > 0 && _j <= limit77) || (step77 < 0 && _j >= limit77) ;_j = ((int)(0 + _j + step77))  ) {
RDebugUtils.currentLine=34472018;
 //BA.debugLineNum = 34472018;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34472019;
 //BA.debugLineNum = 34472019;BA.debugLine="a = cons_array.Get(j)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_cons_array.Get(_j)));
RDebugUtils.currentLine=34472020;
 //BA.debugLineNum = 34472020;BA.debugLine="Dim nama_type, id_type As String";
_nama_type = "";
_id_type = "";
RDebugUtils.currentLine=34472021;
 //BA.debugLineNum = 34472021;BA.debugLine="nama_type= a.Get(\"name_of_type\")";
_nama_type = BA.ObjectToString(_a.Get((Object)("name_of_type")));
RDebugUtils.currentLine=34472022;
 //BA.debugLineNum = 34472022;BA.debugLine="id_type = a.Get(\"type_id\")";
_id_type = BA.ObjectToString(_a.Get((Object)("type_id")));
RDebugUtils.currentLine=34472024;
 //BA.debugLineNum = 34472024;BA.debugLine="Construction.Add(nama_type)";
mostCurrent._construction.Add(_nama_type);
RDebugUtils.currentLine=34472025;
 //BA.debugLineNum = 34472025;BA.debugLine="ConsMap.Put(nama_type,id_type)";
mostCurrent._consmap.Put((Object)(_nama_type),(Object)(_id_type));
RDebugUtils.currentLine=34472026;
 //BA.debugLineNum = 34472026;BA.debugLine="Log(\"ID Map: \"&nama_type&\" \"&id_type)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_nama_type+" "+_id_type);
 }
};
 break; }
case 3: {
RDebugUtils.currentLine=34472030;
 //BA.debugLineNum = 34472030;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=34472031;
 //BA.debugLineNum = 34472031;BA.debugLine="Try";
try {RDebugUtils.currentLine=34472032;
 //BA.debugLineNum = 34472032;BA.debugLine="Msgbox(\"Data has been updated! :)\",\"Success\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Data has been updated! :)"),BA.ObjectToCharSequence("Success"),mostCurrent.activityBA);
RDebugUtils.currentLine=34472033;
 //BA.debugLineNum = 34472033;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 } 
       catch (Exception e93) {
			processBA.setLastException(e93);RDebugUtils.currentLine=34472035;
 //BA.debugLineNum = 34472035;BA.debugLine="Msgbox(\"Data can not be updated :(\" , \"error\"";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Data can not be updated :("),BA.ObjectToCharSequence("error"),mostCurrent.activityBA);
 };
 break; }
}
;
 };
RDebugUtils.currentLine=34472039;
 //BA.debugLineNum = 34472039;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=34472041;
 //BA.debugLineNum = 34472041;BA.debugLine="End Sub";
return "";
}
public static String  _typeofhealth_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="healthedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "typeofhealth_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "typeofhealth_itemclick", new Object[] {_position,_value});
String _id = "";
RDebugUtils.currentLine=34668544;
 //BA.debugLineNum = 34668544;BA.debugLine="Sub TypeOfHealth_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=34668545;
 //BA.debugLineNum = 34668545;BA.debugLine="Dim id As String";
_id = "";
RDebugUtils.currentLine=34668546;
 //BA.debugLineNum = 34668546;BA.debugLine="id = HealthMap.Get(Value)";
_id = BA.ObjectToString(mostCurrent._healthmap.Get(_value));
RDebugUtils.currentLine=34668547;
 //BA.debugLineNum = 34668547;BA.debugLine="typehealth = id";
_typehealth = _id;
RDebugUtils.currentLine=34668548;
 //BA.debugLineNum = 34668548;BA.debugLine="Log(typehealth)";
anywheresoftware.b4a.keywords.Common.Log(_typehealth);
RDebugUtils.currentLine=34668549;
 //BA.debugLineNum = 34668549;BA.debugLine="End Sub";
return "";
}
}