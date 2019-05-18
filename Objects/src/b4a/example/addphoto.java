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

public class addphoto extends Activity implements B4AActivity{
	public static addphoto mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.addphoto");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (addphoto).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.addphoto");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.addphoto", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (addphoto) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (addphoto) Resume **");
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
		return addphoto.class;
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
        BA.LogInfo("** Activity (addphoto) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (addphoto) Resume **");
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
public static String _temp = "";
public static anywheresoftware.b4h.okhttp.OkHttpClientWrapper _hc = null;
public static anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
public static simplysoftware.base64image.base64image _base64con = null;
public static anywheresoftware.b4a.phone.Phone.ContentChooser _chooser = null;
public static anywheresoftware.b4a.phone.Phone.ContentChooser _cc = null;
public static Object _ion = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonbrowse = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttoncamera = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonupload = null;
public static String _namefile = "";
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _mbmp = null;
public static String _folder = "";
public static String _idbuilding = "";
public static String _buildingtype = "";
public anywheresoftware.b4a.objects.PanelWrapper _paneltoolbar = null;
public anywheresoftware.b4a.objects.LabelWrapper _titlebar = null;
public anywheresoftware.b4a.objects.LabelWrapper _backarrow = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
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
RDebugUtils.currentModule="addphoto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="ScrollView1.Panel.LoadLayout(\"AddPhoto\")";
mostCurrent._scrollview1.getPanel().LoadLayout("AddPhoto",mostCurrent.activityBA);
RDebugUtils.currentLine=19529732;
 //BA.debugLineNum = 19529732;BA.debugLine="ScrollView1.Height = 100%y - ScrollView1.Top";
mostCurrent._scrollview1.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._scrollview1.getTop()));
RDebugUtils.currentLine=19529733;
 //BA.debugLineNum = 19529733;BA.debugLine="PanelToolBar.Visible = False";
mostCurrent._paneltoolbar.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19529734;
 //BA.debugLineNum = 19529734;BA.debugLine="Base64Con.Initialize";
_base64con._initialize(processBA);
RDebugUtils.currentLine=19529736;
 //BA.debugLineNum = 19529736;BA.debugLine="BackArrow.Visible= True";
mostCurrent._backarrow.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19529737;
 //BA.debugLineNum = 19529737;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
mostCurrent._backarrow.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"back-arrow.png").getObject()));
RDebugUtils.currentLine=19529738;
 //BA.debugLineNum = 19529738;BA.debugLine="TitleBar.Text=\"Upload Photo\"";
mostCurrent._titlebar.setText(BA.ObjectToCharSequence("Upload Photo"));
RDebugUtils.currentLine=19529740;
 //BA.debugLineNum = 19529740;BA.debugLine="ImageView1.Gravity=Gravity.CENTER";
mostCurrent._imageview1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=19529741;
 //BA.debugLineNum = 19529741;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
RDebugUtils.currentLine=19529742;
 //BA.debugLineNum = 19529742;BA.debugLine="temp = rp.GetSafeDirDefaultExternal(\"temp\")";
_temp = mostCurrent._rp.GetSafeDirDefaultExternal("temp");
RDebugUtils.currentLine=19529743;
 //BA.debugLineNum = 19529743;BA.debugLine="folder = rp.GetSafeDirDefaultExternal(\"uploads\")";
mostCurrent._folder = mostCurrent._rp.GetSafeDirDefaultExternal("uploads");
RDebugUtils.currentLine=19529744;
 //BA.debugLineNum = 19529744;BA.debugLine="hc.Initialize(\"hc\")";
_hc.Initialize("hc");
RDebugUtils.currentLine=19529745;
 //BA.debugLineNum = 19529745;BA.debugLine="chooser.Initialize(\"chooser\")";
_chooser.Initialize("chooser");
 };
RDebugUtils.currentLine=19529747;
 //BA.debugLineNum = 19529747;BA.debugLine="If Home.HomeBuilding.Length > 0 Then";
if (mostCurrent._home._homebuilding.length()>0) { 
RDebugUtils.currentLine=19529748;
 //BA.debugLineNum = 19529748;BA.debugLine="Log(Home.HomeBuilding)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._home._homebuilding);
RDebugUtils.currentLine=19529749;
 //BA.debugLineNum = 19529749;BA.debugLine="Select Home.HomeBuilding";
switch (BA.switchObjectToInt(mostCurrent._home._homebuilding,"Worship","Office","Health","Msme","Educational")) {
case 0: {
RDebugUtils.currentLine=19529751;
 //BA.debugLineNum = 19529751;BA.debugLine="If WorshipBuilding.idBuilding.Length > 0 Then";
if (mostCurrent._worshipbuilding._idbuilding.length()>0) { 
RDebugUtils.currentLine=19529752;
 //BA.debugLineNum = 19529752;BA.debugLine="idBuilding= WorshipBuilding.idBuilding";
mostCurrent._idbuilding = mostCurrent._worshipbuilding._idbuilding;
RDebugUtils.currentLine=19529753;
 //BA.debugLineNum = 19529753;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._idbuilding);
 }else {
RDebugUtils.currentLine=19529755;
 //BA.debugLineNum = 19529755;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=19529756;
 //BA.debugLineNum = 19529756;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 1: {
RDebugUtils.currentLine=19529759;
 //BA.debugLineNum = 19529759;BA.debugLine="If OfficeBuilding.idBuilding.Length > 0 Then";
if (mostCurrent._officebuilding._idbuilding.length()>0) { 
RDebugUtils.currentLine=19529760;
 //BA.debugLineNum = 19529760;BA.debugLine="idBuilding= OfficeBuilding.idBuilding";
mostCurrent._idbuilding = mostCurrent._officebuilding._idbuilding;
RDebugUtils.currentLine=19529761;
 //BA.debugLineNum = 19529761;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._idbuilding);
 }else {
RDebugUtils.currentLine=19529763;
 //BA.debugLineNum = 19529763;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=19529764;
 //BA.debugLineNum = 19529764;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 2: {
RDebugUtils.currentLine=19529767;
 //BA.debugLineNum = 19529767;BA.debugLine="If HealthBuilding.idBuilding.Length > 0 Then";
if (mostCurrent._healthbuilding._idbuilding.length()>0) { 
RDebugUtils.currentLine=19529768;
 //BA.debugLineNum = 19529768;BA.debugLine="idBuilding= HealthBuilding.idBuilding";
mostCurrent._idbuilding = mostCurrent._healthbuilding._idbuilding;
RDebugUtils.currentLine=19529769;
 //BA.debugLineNum = 19529769;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._idbuilding);
 }else {
RDebugUtils.currentLine=19529771;
 //BA.debugLineNum = 19529771;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=19529772;
 //BA.debugLineNum = 19529772;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 3: {
RDebugUtils.currentLine=19529775;
 //BA.debugLineNum = 19529775;BA.debugLine="If MsmeBuilding.idBuilding.Length > 0 Then";
if (mostCurrent._msmebuilding._idbuilding.length()>0) { 
RDebugUtils.currentLine=19529776;
 //BA.debugLineNum = 19529776;BA.debugLine="idBuilding= MsmeBuilding.idBuilding";
mostCurrent._idbuilding = mostCurrent._msmebuilding._idbuilding;
RDebugUtils.currentLine=19529777;
 //BA.debugLineNum = 19529777;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._idbuilding);
 }else {
RDebugUtils.currentLine=19529779;
 //BA.debugLineNum = 19529779;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=19529780;
 //BA.debugLineNum = 19529780;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
case 4: {
RDebugUtils.currentLine=19529783;
 //BA.debugLineNum = 19529783;BA.debugLine="If EducationalBuilding.idBuilding.Length > 0 T";
if (mostCurrent._educationalbuilding._idbuilding.length()>0) { 
RDebugUtils.currentLine=19529784;
 //BA.debugLineNum = 19529784;BA.debugLine="idBuilding= EducationalBuilding.idBuilding";
mostCurrent._idbuilding = mostCurrent._educationalbuilding._idbuilding;
RDebugUtils.currentLine=19529785;
 //BA.debugLineNum = 19529785;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._idbuilding);
 }else {
RDebugUtils.currentLine=19529787;
 //BA.debugLineNum = 19529787;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=19529788;
 //BA.debugLineNum = 19529788;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 break; }
default: {
RDebugUtils.currentLine=19529791;
 //BA.debugLineNum = 19529791;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=19529792;
 //BA.debugLineNum = 19529792;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 break; }
}
;
 }else 
{RDebugUtils.currentLine=19529794;
 //BA.debugLineNum = 19529794;BA.debugLine="Else If SearchBuilding.idspin.Length > 0 Then";
if (mostCurrent._searchbuilding._idspin.length()>0) { 
RDebugUtils.currentLine=19529795;
 //BA.debugLineNum = 19529795;BA.debugLine="buildingtype = SearchBuilding.idspin";
mostCurrent._buildingtype = mostCurrent._searchbuilding._idspin;
RDebugUtils.currentLine=19529796;
 //BA.debugLineNum = 19529796;BA.debugLine="Log(buildingtype)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._buildingtype);
RDebugUtils.currentLine=19529797;
 //BA.debugLineNum = 19529797;BA.debugLine="If SearchBuilding.idBuilding.Length > 0 Then";
if (mostCurrent._searchbuilding._idbuilding.length()>0) { 
RDebugUtils.currentLine=19529798;
 //BA.debugLineNum = 19529798;BA.debugLine="idBuilding = SearchBuilding.idBuilding";
mostCurrent._idbuilding = mostCurrent._searchbuilding._idbuilding;
RDebugUtils.currentLine=19529799;
 //BA.debugLineNum = 19529799;BA.debugLine="Log(idBuilding)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._idbuilding);
 }else {
RDebugUtils.currentLine=19529801;
 //BA.debugLineNum = 19529801;BA.debugLine="Msgbox(\"Can't get the ID\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Can't get the ID"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=19529802;
 //BA.debugLineNum = 19529802;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 }}
;
RDebugUtils.currentLine=19529806;
 //BA.debugLineNum = 19529806;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="addphoto";
RDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="End Sub";
return "";
}
public static String  _activity_permissionresult(String _permission,boolean _result) throws Exception{
RDebugUtils.currentModule="addphoto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_permissionresult"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_permissionresult", new Object[] {_permission,_result});
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="If Permission = rp.PERMISSION_ACCESS_FINE_LOCATIO";
if ((_permission).equals(mostCurrent._rp.PERMISSION_ACCESS_FINE_LOCATION)) { 
 };
RDebugUtils.currentLine=20054019;
 //BA.debugLineNum = 20054019;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="addphoto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=19595266;
 //BA.debugLineNum = 19595266;BA.debugLine="End Sub";
return "";
}
public static void  _buttonbrowse_click() throws Exception{
ResumableSub_ButtonBrowse_Click rsub = new ResumableSub_ButtonBrowse_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_ButtonBrowse_Click extends BA.ResumableSub {
public ResumableSub_ButtonBrowse_Click(b4a.example.addphoto parent) {
this.parent = parent;
}
b4a.example.addphoto parent;
anywheresoftware.b4a.objects.collections.List _list_files = null;
int _i = 0;
String _permission = "";
boolean _result = false;
anywheresoftware.b4a.objects.IntentWrapper _a = null;
int step5;
int limit5;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="addphoto";
Debug.delegate(mostCurrent.activityBA, "buttonbrowse_click", null);
if (true) return;
    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="Dim list_files As List";
_list_files = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="list_files.Initialize";
_list_files.Initialize();
RDebugUtils.currentLine=19726339;
 //BA.debugLineNum = 19726339;BA.debugLine="list_files = File.ListFiles(temp)";
_list_files = anywheresoftware.b4a.keywords.Common.File.ListFiles(parent._temp);
RDebugUtils.currentLine=19726340;
 //BA.debugLineNum = 19726340;BA.debugLine="Log(list_files.Size)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_list_files.getSize()));
RDebugUtils.currentLine=19726341;
 //BA.debugLineNum = 19726341;BA.debugLine="For i= 0 To list_files.Size-1";
if (true) break;

case 1:
//for
this.state = 4;
step5 = 1;
limit5 = (int) (_list_files.getSize()-1);
_i = (int) (0) ;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 4;
if ((step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5)) this.state = 3;
if (true) break;

case 10:
//C
this.state = 9;
_i = ((int)(0 + _i + step5)) ;
if (true) break;

case 3:
//C
this.state = 10;
RDebugUtils.currentLine=19726342;
 //BA.debugLineNum = 19726342;BA.debugLine="File.Delete(temp,list_files.Get(i))";
anywheresoftware.b4a.keywords.Common.File.Delete(parent._temp,BA.ObjectToString(_list_files.Get(_i)));
RDebugUtils.currentLine=19726343;
 //BA.debugLineNum = 19726343;BA.debugLine="Log(list_files.size)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_list_files.getSize()));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=19726349;
 //BA.debugLineNum = 19726349;BA.debugLine="Log(\"IDnyaa LOOOO: \"&idBuilding)";
anywheresoftware.b4a.keywords.Common.Log("IDnyaa LOOOO: "+parent.mostCurrent._idbuilding);
RDebugUtils.currentLine=19726350;
 //BA.debugLineNum = 19726350;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_READ_EXTERNAL_ST";
parent.mostCurrent._rp.CheckAndRequest(processBA,parent.mostCurrent._rp.PERMISSION_READ_EXTERNAL_STORAGE);
RDebugUtils.currentLine=19726351;
 //BA.debugLineNum = 19726351;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, this, null);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=19726352;
 //BA.debugLineNum = 19726352;BA.debugLine="If Result Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_result) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=19726353;
 //BA.debugLineNum = 19726353;BA.debugLine="Dim a As Intent";
_a = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=19726355;
 //BA.debugLineNum = 19726355;BA.debugLine="a.Initialize(a.ACTION_PICK, \"content://media/ext";
_a.Initialize(_a.ACTION_PICK,"content://media/external/images/media/");
RDebugUtils.currentLine=19726356;
 //BA.debugLineNum = 19726356;BA.debugLine="a.PutExtra(\"android.intent.extra.ALLOW_MULTIPLE\"";
_a.PutExtra("android.intent.extra.ALLOW_MULTIPLE",(Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=19726357;
 //BA.debugLineNum = 19726357;BA.debugLine="a.SetType(\"image/*\")";
_a.SetType("image/*");
RDebugUtils.currentLine=19726358;
 //BA.debugLineNum = 19726358;BA.debugLine="StartActivityForResult(a)";
_startactivityforresult(_a);
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=19726360;
 //BA.debugLineNum = 19726360;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _startactivityforresult(anywheresoftware.b4a.objects.IntentWrapper _i) throws Exception{
RDebugUtils.currentModule="addphoto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startactivityforresult"))
	return (String) Debug.delegate(mostCurrent.activityBA, "startactivityforresult", new Object[] {_i});
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Sub StartActivityForResult(i As Intent)";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="Dim jo As JavaObject = GetBA";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_getba()));
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
_ion = _jo.CreateEvent(processBA,"anywheresoftware.b4a.IOnActivityResult","ion",anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=20119555;
 //BA.debugLineNum = 20119555;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array As O";
_jo.RunMethod("startActivityForResult",new Object[]{_ion,(Object)(_i.getObject())});
RDebugUtils.currentLine=20119556;
 //BA.debugLineNum = 20119556;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncamera_click() throws Exception{
RDebugUtils.currentModule="addphoto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttoncamera_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttoncamera_click", null);
anywheresoftware.b4a.objects.collections.List _list_files = null;
int _i = 0;
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Sub ButtonCamera_Click";
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="ToastMessageShow(\"fileee: \"&namefile,False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("fileee: "+mostCurrent._namefile),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="Dim list_files As List";
_list_files = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=20185091;
 //BA.debugLineNum = 20185091;BA.debugLine="list_files.Initialize";
_list_files.Initialize();
RDebugUtils.currentLine=20185092;
 //BA.debugLineNum = 20185092;BA.debugLine="list_files = File.ListFiles(temp)";
_list_files = anywheresoftware.b4a.keywords.Common.File.ListFiles(_temp);
RDebugUtils.currentLine=20185093;
 //BA.debugLineNum = 20185093;BA.debugLine="Log(list_files.Size)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_list_files.getSize()));
RDebugUtils.currentLine=20185094;
 //BA.debugLineNum = 20185094;BA.debugLine="For i= 0 To list_files.Size-1";
{
final int step6 = 1;
final int limit6 = (int) (_list_files.getSize()-1);
_i = (int) (0) ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
RDebugUtils.currentLine=20185095;
 //BA.debugLineNum = 20185095;BA.debugLine="File.Delete(temp,list_files.Get(i))";
anywheresoftware.b4a.keywords.Common.File.Delete(_temp,BA.ObjectToString(_list_files.Get(_i)));
RDebugUtils.currentLine=20185096;
 //BA.debugLineNum = 20185096;BA.debugLine="Log(list_files.size)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_list_files.getSize()));
 }
};
RDebugUtils.currentLine=20185098;
 //BA.debugLineNum = 20185098;BA.debugLine="StartActivity(MainCamera)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._maincamera.getObject()));
RDebugUtils.currentLine=20185100;
 //BA.debugLineNum = 20185100;BA.debugLine="End Sub";
return "";
}
public static String  _buttonupload_click() throws Exception{
RDebugUtils.currentModule="addphoto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonupload_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonupload_click", null);
String _tanggal = "";
String _baseim = "";
String _filenamefile = "";
String _filename = "";
anywheresoftware.b4a.objects.collections.List _files = null;
b4a.example.multipartpost._filedata _fd = null;
anywheresoftware.b4a.objects.collections.Map _nv = null;
anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest _req = null;
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Sub ButtonUpload_Click";
RDebugUtils.currentLine=20381697;
 //BA.debugLineNum = 20381697;BA.debugLine="ToastMessageShow(\"fileee: \"&namefile,False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("fileee: "+mostCurrent._namefile),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20381699;
 //BA.debugLineNum = 20381699;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=20381700;
 //BA.debugLineNum = 20381700;BA.debugLine="Dim tanggal As String";
_tanggal = "";
RDebugUtils.currentLine=20381701;
 //BA.debugLineNum = 20381701;BA.debugLine="tanggal = DateTime.Date(DateTime.now)";
_tanggal = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=20381702;
 //BA.debugLineNum = 20381702;BA.debugLine="Log(tanggal)";
anywheresoftware.b4a.keywords.Common.Log(_tanggal);
RDebugUtils.currentLine=20381703;
 //BA.debugLineNum = 20381703;BA.debugLine="Dim baseim As String";
_baseim = "";
RDebugUtils.currentLine=20381704;
 //BA.debugLineNum = 20381704;BA.debugLine="baseim = Base64Con.EncodeFromImage(temp,namefile)";
_baseim = _base64con._encodefromimage(_temp,mostCurrent._namefile);
RDebugUtils.currentLine=20381705;
 //BA.debugLineNum = 20381705;BA.debugLine="Log (\"BASE64: \"&baseim)";
anywheresoftware.b4a.keywords.Common.Log("BASE64: "+_baseim);
RDebugUtils.currentLine=20381707;
 //BA.debugLineNum = 20381707;BA.debugLine="Dim filenamefile , filename As String";
_filenamefile = "";
_filename = "";
RDebugUtils.currentLine=20381708;
 //BA.debugLineNum = 20381708;BA.debugLine="filenamefile = namefile";
_filenamefile = mostCurrent._namefile;
RDebugUtils.currentLine=20381709;
 //BA.debugLineNum = 20381709;BA.debugLine="Log(\"COBA :\"&filenamefile.SubString2(0, filenamef";
anywheresoftware.b4a.keywords.Common.Log("COBA :"+_filenamefile.substring((int) (0),(int) (_filenamefile.length()-4)));
RDebugUtils.currentLine=20381710;
 //BA.debugLineNum = 20381710;BA.debugLine="filename = filenamefile.SubString2(0, filenamefil";
_filename = _filenamefile.substring((int) (0),(int) (_filenamefile.length()-4));
RDebugUtils.currentLine=20381711;
 //BA.debugLineNum = 20381711;BA.debugLine="Dim files As List";
_files = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=20381712;
 //BA.debugLineNum = 20381712;BA.debugLine="files.Initialize";
_files.Initialize();
RDebugUtils.currentLine=20381713;
 //BA.debugLineNum = 20381713;BA.debugLine="Dim fd As FileData";
_fd = new b4a.example.multipartpost._filedata();
RDebugUtils.currentLine=20381714;
 //BA.debugLineNum = 20381714;BA.debugLine="fd.Initialize";
_fd.Initialize();
RDebugUtils.currentLine=20381715;
 //BA.debugLineNum = 20381715;BA.debugLine="fd.Dir = temp";
_fd.Dir = _temp;
RDebugUtils.currentLine=20381716;
 //BA.debugLineNum = 20381716;BA.debugLine="fd.FileName = filenamefile";
_fd.FileName = _filenamefile;
RDebugUtils.currentLine=20381717;
 //BA.debugLineNum = 20381717;BA.debugLine="fd.KeyName = filename";
_fd.KeyName = _filename;
RDebugUtils.currentLine=20381718;
 //BA.debugLineNum = 20381718;BA.debugLine="fd.ContentType = \"application/octet-stream\"";
_fd.ContentType = "application/octet-stream";
RDebugUtils.currentLine=20381719;
 //BA.debugLineNum = 20381719;BA.debugLine="files.Add(fd)";
_files.Add((Object)(_fd));
RDebugUtils.currentLine=20381720;
 //BA.debugLineNum = 20381720;BA.debugLine="Dim NV As Map";
_nv = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=20381721;
 //BA.debugLineNum = 20381721;BA.debugLine="NV.Initialize";
_nv.Initialize();
RDebugUtils.currentLine=20381722;
 //BA.debugLineNum = 20381722;BA.debugLine="NV.Put(\"buildingtype\", buildingtype)";
_nv.Put((Object)("buildingtype"),(Object)(mostCurrent._buildingtype));
RDebugUtils.currentLine=20381723;
 //BA.debugLineNum = 20381723;BA.debugLine="NV.Put(\"tanggal\", tanggal)";
_nv.Put((Object)("tanggal"),(Object)(_tanggal));
RDebugUtils.currentLine=20381724;
 //BA.debugLineNum = 20381724;BA.debugLine="NV.Put(\"idbang\", idBuilding)";
_nv.Put((Object)("idbang"),(Object)(mostCurrent._idbuilding));
RDebugUtils.currentLine=20381725;
 //BA.debugLineNum = 20381725;BA.debugLine="NV.Put(\"keyname\", filename)";
_nv.Put((Object)("keyname"),(Object)(_filename));
RDebugUtils.currentLine=20381726;
 //BA.debugLineNum = 20381726;BA.debugLine="NV.Put(\"action\", \"upload\")";
_nv.Put((Object)("action"),(Object)("upload"));
RDebugUtils.currentLine=20381727;
 //BA.debugLineNum = 20381727;BA.debugLine="Dim req As OkHttpRequest";
_req = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest();
RDebugUtils.currentLine=20381728;
 //BA.debugLineNum = 20381728;BA.debugLine="ProgressDialogShow(\"uploading...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("uploading..."));
RDebugUtils.currentLine=20381729;
 //BA.debugLineNum = 20381729;BA.debugLine="req = MultipartPost.CreatePostRequest(Main.Server";
_req = mostCurrent._multipartpost._createpostrequest(mostCurrent.activityBA,mostCurrent._main._server+"multipartpost.php",_nv,_files);
RDebugUtils.currentLine=20381730;
 //BA.debugLineNum = 20381730;BA.debugLine="hc.Execute(req, 1)";
_hc.Execute(processBA,_req,(int) (1));
RDebugUtils.currentLine=20381731;
 //BA.debugLineNum = 20381731;BA.debugLine="End Sub";
return "";
}
public static String  _cc_result(boolean _success,String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="addphoto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cc_result"))
	return (String) Debug.delegate(mostCurrent.activityBA, "cc_result", new Object[] {_success,_dir,_filename});
String _tanggal = "";
String _namafile = "";
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Sub CC_Result (Success As Boolean, Dir As String,";
RDebugUtils.currentLine=19791873;
 //BA.debugLineNum = 19791873;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=19791875;
 //BA.debugLineNum = 19791875;BA.debugLine="Log(\"GET PATH: \"&GetPathFromContentResult(FileN";
anywheresoftware.b4a.keywords.Common.Log("GET PATH: "+_getpathfromcontentresult(_filename));
RDebugUtils.currentLine=19791876;
 //BA.debugLineNum = 19791876;BA.debugLine="DateTime.DateFormat=\"ddmmyyy-hhmmss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("ddmmyyy-hhmmss");
RDebugUtils.currentLine=19791877;
 //BA.debugLineNum = 19791877;BA.debugLine="Dim tanggal As String";
_tanggal = "";
RDebugUtils.currentLine=19791878;
 //BA.debugLineNum = 19791878;BA.debugLine="tanggal = DateTime.Date(DateTime.now)";
_tanggal = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=19791879;
 //BA.debugLineNum = 19791879;BA.debugLine="Dim namafile As String";
_namafile = "";
RDebugUtils.currentLine=19791880;
 //BA.debugLineNum = 19791880;BA.debugLine="namafile = idBuilding&\"-\"&tanggal&\".jpg\"";
_namafile = mostCurrent._idbuilding+"-"+_tanggal+".jpg";
RDebugUtils.currentLine=19791882;
 //BA.debugLineNum = 19791882;BA.debugLine="File.Copy(Dir,FileName,temp,namafile)";
anywheresoftware.b4a.keywords.Common.File.Copy(_dir,_filename,_temp,_namafile);
RDebugUtils.currentLine=19791883;
 //BA.debugLineNum = 19791883;BA.debugLine="ShowPicture(namafile)";
_showpicture(_namafile);
 };
RDebugUtils.currentLine=19791885;
 //BA.debugLineNum = 19791885;BA.debugLine="End Sub";
return "";
}
public static String  _getpathfromcontentresult(String _uristring) throws Exception{
RDebugUtils.currentModule="addphoto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getpathfromcontentresult"))
	return (String) Debug.delegate(mostCurrent.activityBA, "getpathfromcontentresult", new Object[] {_uristring});
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper _uri1 = null;
String[] _proj = null;
anywheresoftware.b4a.objects.ContentResolverWrapper _cr = null;
int _i = 0;
String _id = "";
String _res = "";
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Sub GetPathFromContentResult(UriString As String)";
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="If UriString.StartsWith(\"/\") Then Return UriStrin";
if (_uristring.startsWith("/")) { 
if (true) return _uristring;};
RDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="Dim Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=19857411;
 //BA.debugLineNum = 19857411;BA.debugLine="Dim Uri1 As Uri";
_uri1 = new anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper();
RDebugUtils.currentLine=19857412;
 //BA.debugLineNum = 19857412;BA.debugLine="Dim Proj() As String = Array As String(\"_data\")";
_proj = new String[]{"_data"};
RDebugUtils.currentLine=19857413;
 //BA.debugLineNum = 19857413;BA.debugLine="Dim cr As ContentResolver";
_cr = new anywheresoftware.b4a.objects.ContentResolverWrapper();
RDebugUtils.currentLine=19857414;
 //BA.debugLineNum = 19857414;BA.debugLine="cr.Initialize(\"\")";
_cr.Initialize("");
RDebugUtils.currentLine=19857415;
 //BA.debugLineNum = 19857415;BA.debugLine="If UriString.StartsWith(\"content://com.android.pr";
if (_uristring.startsWith("content://com.android.providers.media.documents")) { 
RDebugUtils.currentLine=19857416;
 //BA.debugLineNum = 19857416;BA.debugLine="Dim i As Int = UriString.IndexOf(\"%3A\")";
_i = _uristring.indexOf("%3A");
RDebugUtils.currentLine=19857417;
 //BA.debugLineNum = 19857417;BA.debugLine="Dim id As String = UriString.SubString(i + 3)";
_id = _uristring.substring((int) (_i+3));
RDebugUtils.currentLine=19857418;
 //BA.debugLineNum = 19857418;BA.debugLine="Uri1.Parse(\"content://media/external/images/medi";
_uri1.Parse("content://media/external/images/media");
RDebugUtils.currentLine=19857419;
 //BA.debugLineNum = 19857419;BA.debugLine="Cursor1 = cr.Query(Uri1, Proj, \"_id = ?\", Array";
_cursor1 = _cr.Query(_uri1,_proj,"_id = ?",new String[]{_id},"");
 }else {
RDebugUtils.currentLine=19857421;
 //BA.debugLineNum = 19857421;BA.debugLine="Uri1.Parse(UriString)";
_uri1.Parse(_uristring);
RDebugUtils.currentLine=19857422;
 //BA.debugLineNum = 19857422;BA.debugLine="Cursor1 = cr.Query(Uri1, Proj, \"\", Null, \"\")";
_cursor1 = _cr.Query(_uri1,_proj,"",(String[])(anywheresoftware.b4a.keywords.Common.Null),"");
 };
RDebugUtils.currentLine=19857424;
 //BA.debugLineNum = 19857424;BA.debugLine="Cursor1.Position = 0";
_cursor1.setPosition((int) (0));
RDebugUtils.currentLine=19857425;
 //BA.debugLineNum = 19857425;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=19857426;
 //BA.debugLineNum = 19857426;BA.debugLine="res = Cursor1.GetString(\"_data\")";
_res = _cursor1.GetString("_data");
RDebugUtils.currentLine=19857427;
 //BA.debugLineNum = 19857427;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=19857428;
 //BA.debugLineNum = 19857428;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=19857451;
 //BA.debugLineNum = 19857451;BA.debugLine="End Sub";
return "";
}
public static String  _showpicture(String _filename) throws Exception{
RDebugUtils.currentModule="addphoto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showpicture"))
	return (String) Debug.delegate(mostCurrent.activityBA, "showpicture", new Object[] {_filename});
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
float _bmpratio = 0f;
float _viewratio = 0f;
int _newheight = 0;
int _newwidth = 0;
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Sub ShowPicture(FileName As String)";
RDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="ImageView1.Visible=True";
mostCurrent._imageview1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19922946;
 //BA.debugLineNum = 19922946;BA.debugLine="Label1.Visible=False";
mostCurrent._label1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19922947;
 //BA.debugLineNum = 19922947;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=19922948;
 //BA.debugLineNum = 19922948;BA.debugLine="bmp = LoadBitmap(temp,FileName)";
_bmp = anywheresoftware.b4a.keywords.Common.LoadBitmap(_temp,_filename);
RDebugUtils.currentLine=19922949;
 //BA.debugLineNum = 19922949;BA.debugLine="If bmp.Height > bmp.Width Then";
if (_bmp.getHeight()>_bmp.getWidth()) { 
RDebugUtils.currentLine=19922950;
 //BA.debugLineNum = 19922950;BA.debugLine="Dim bmpRatio As Float = bmp.Width / bmp.Height";
_bmpratio = (float) (_bmp.getWidth()/(double)_bmp.getHeight());
RDebugUtils.currentLine=19922951;
 //BA.debugLineNum = 19922951;BA.debugLine="Dim viewRatio As Float = ImageView1.Width / Imag";
_viewratio = (float) (mostCurrent._imageview1.getWidth()/(double)mostCurrent._imageview1.getHeight());
RDebugUtils.currentLine=19922952;
 //BA.debugLineNum = 19922952;BA.debugLine="If viewRatio > bmpRatio Then";
if (_viewratio>_bmpratio) { 
RDebugUtils.currentLine=19922953;
 //BA.debugLineNum = 19922953;BA.debugLine="Dim NewHeight As Int = bmp.Width / viewRatio";
_newheight = (int) (_bmp.getWidth()/(double)_viewratio);
RDebugUtils.currentLine=19922954;
 //BA.debugLineNum = 19922954;BA.debugLine="bmp = bmp.Crop(0, bmp.Height / 2 - NewHeight /";
_bmp = _bmp.Crop((int) (0),(int) (_bmp.getHeight()/(double)2-_newheight/(double)2),_bmp.getWidth(),_newheight);
 }else 
{RDebugUtils.currentLine=19922955;
 //BA.debugLineNum = 19922955;BA.debugLine="Else if viewRatio < bmpRatio Then";
if (_viewratio<_bmpratio) { 
RDebugUtils.currentLine=19922956;
 //BA.debugLineNum = 19922956;BA.debugLine="Dim NewWidth As Int = bmp.Height * viewRatio";
_newwidth = (int) (_bmp.getHeight()*_viewratio);
RDebugUtils.currentLine=19922957;
 //BA.debugLineNum = 19922957;BA.debugLine="bmp = bmp.Crop(bmp.Width / 2 - NewWidth / 2, 0,";
_bmp = _bmp.Crop((int) (_bmp.getWidth()/(double)2-_newwidth/(double)2),(int) (0),_newwidth,_bmp.getHeight());
 }}
;
RDebugUtils.currentLine=19922959;
 //BA.debugLineNum = 19922959;BA.debugLine="mBmp = bmp";
mostCurrent._mbmp = _bmp;
RDebugUtils.currentLine=19922960;
 //BA.debugLineNum = 19922960;BA.debugLine="ImageView1.Bitmap = mBmp.Resize(ImageView1.Width";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(mostCurrent._mbmp.Resize((float) (mostCurrent._imageview1.getWidth()),(float) (mostCurrent._imageview1.getHeight()),anywheresoftware.b4a.keywords.Common.True).getObject()));
 }else {
RDebugUtils.currentLine=19922962;
 //BA.debugLineNum = 19922962;BA.debugLine="mBmp = bmp";
mostCurrent._mbmp = _bmp;
RDebugUtils.currentLine=19922963;
 //BA.debugLineNum = 19922963;BA.debugLine="ImageView1.Bitmap = mBmp.Resize(ImageView1.Width";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(mostCurrent._mbmp.Resize((float) (mostCurrent._imageview1.getWidth()),(float) (mostCurrent._imageview1.getHeight()),anywheresoftware.b4a.keywords.Common.True).getObject()));
 };
RDebugUtils.currentLine=19922965;
 //BA.debugLineNum = 19922965;BA.debugLine="namefile = FileName";
mostCurrent._namefile = _filename;
RDebugUtils.currentLine=19922966;
 //BA.debugLineNum = 19922966;BA.debugLine="End Sub";
return "";
}
public static Object  _getba() throws Exception{
RDebugUtils.currentModule="addphoto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getba"))
	return (Object) Debug.delegate(mostCurrent.activityBA, "getba", null);
anywheresoftware.b4j.object.JavaObject _jo = null;
String _cls = "";
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Sub GetBA As Object";
RDebugUtils.currentLine=20250625;
 //BA.debugLineNum = 20250625;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="Dim cls As String = Me";
_cls = BA.ObjectToString(addphoto.getObject());
RDebugUtils.currentLine=20250627;
 //BA.debugLineNum = 20250627;BA.debugLine="cls = cls.SubString(\"class \".Length)";
_cls = _cls.substring("class ".length());
RDebugUtils.currentLine=20250628;
 //BA.debugLineNum = 20250628;BA.debugLine="jo.InitializeStatic(cls)";
_jo.InitializeStatic(_cls);
RDebugUtils.currentLine=20250629;
 //BA.debugLineNum = 20250629;BA.debugLine="Return jo.GetField(\"processBA\")";
if (true) return _jo.GetField("processBA");
RDebugUtils.currentLine=20250630;
 //BA.debugLineNum = 20250630;BA.debugLine="End Sub";
return null;
}
public static String  _hc_responseerror(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,String _reason,int _statuscode,int _taskid) throws Exception{
RDebugUtils.currentModule="addphoto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hc_responseerror"))
	return (String) Debug.delegate(mostCurrent.activityBA, "hc_responseerror", new Object[] {_response,_reason,_statuscode,_taskid});
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Sub hc_ResponseError (Response As OkHttpResponse,";
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=20447235;
 //BA.debugLineNum = 20447235;BA.debugLine="If Response <> Null Then";
if (_response!= null) { 
RDebugUtils.currentLine=20447236;
 //BA.debugLineNum = 20447236;BA.debugLine="Msgbox(\"Upload file failed!\",\"Error Message\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Upload file failed!"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
RDebugUtils.currentLine=20447237;
 //BA.debugLineNum = 20447237;BA.debugLine="ImageView1.Visible=False";
mostCurrent._imageview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20447238;
 //BA.debugLineNum = 20447238;BA.debugLine="Label1.Visible =True";
mostCurrent._label1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20447239;
 //BA.debugLineNum = 20447239;BA.debugLine="Label1.Text = \"failed\"";
mostCurrent._label1.setText(BA.ObjectToCharSequence("failed"));
RDebugUtils.currentLine=20447240;
 //BA.debugLineNum = 20447240;BA.debugLine="Log(Reason)";
anywheresoftware.b4a.keywords.Common.Log(_reason);
 };
RDebugUtils.currentLine=20447242;
 //BA.debugLineNum = 20447242;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responsesuccess(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,int _taskid) throws Exception{
RDebugUtils.currentModule="addphoto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hc_responsesuccess"))
	return (String) Debug.delegate(mostCurrent.activityBA, "hc_responsesuccess", new Object[] {_response,_taskid});
anywheresoftware.b4a.objects.collections.List _list_files = null;
int _i = 0;
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Sub hc_ResponseSuccess (Response As OkHttpResponse";
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="out.InitializeToBytesArray(0) ' I expect less tha";
_out.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="Response.GetAsynchronously(\"Response\", out, True,";
_response.GetAsynchronously(processBA,"Response",(java.io.OutputStream)(_out.getObject()),anywheresoftware.b4a.keywords.Common.True,_taskid);
RDebugUtils.currentLine=20512771;
 //BA.debugLineNum = 20512771;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=20512772;
 //BA.debugLineNum = 20512772;BA.debugLine="ImageView1.Visible=False";
mostCurrent._imageview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20512773;
 //BA.debugLineNum = 20512773;BA.debugLine="Label1.Visible =True";
mostCurrent._label1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20512774;
 //BA.debugLineNum = 20512774;BA.debugLine="Label1.Text = \"Image has successfully been upload";
mostCurrent._label1.setText(BA.ObjectToCharSequence("Image has successfully been uploaded!"));
RDebugUtils.currentLine=20512775;
 //BA.debugLineNum = 20512775;BA.debugLine="Log(\"response: \" & Response.ErrorResponse)";
anywheresoftware.b4a.keywords.Common.Log("response: "+_response.getErrorResponse());
RDebugUtils.currentLine=20512777;
 //BA.debugLineNum = 20512777;BA.debugLine="Dim list_files As List";
_list_files = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=20512778;
 //BA.debugLineNum = 20512778;BA.debugLine="list_files.Initialize";
_list_files.Initialize();
RDebugUtils.currentLine=20512779;
 //BA.debugLineNum = 20512779;BA.debugLine="list_files = File.ListFiles(temp)";
_list_files = anywheresoftware.b4a.keywords.Common.File.ListFiles(_temp);
RDebugUtils.currentLine=20512780;
 //BA.debugLineNum = 20512780;BA.debugLine="Log(list_files.Size)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_list_files.getSize()));
RDebugUtils.currentLine=20512781;
 //BA.debugLineNum = 20512781;BA.debugLine="For i= 0 To list_files.Size-1";
{
final int step12 = 1;
final int limit12 = (int) (_list_files.getSize()-1);
_i = (int) (0) ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
RDebugUtils.currentLine=20512782;
 //BA.debugLineNum = 20512782;BA.debugLine="File.Delete(temp,list_files.Get(i))";
anywheresoftware.b4a.keywords.Common.File.Delete(_temp,BA.ObjectToString(_list_files.Get(_i)));
RDebugUtils.currentLine=20512783;
 //BA.debugLineNum = 20512783;BA.debugLine="Log(list_files.size)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_list_files.getSize()));
 }
};
RDebugUtils.currentLine=20512787;
 //BA.debugLineNum = 20512787;BA.debugLine="End Sub";
return "";
}
public static Object  _ion_event(String _methodname,Object[] _args) throws Exception{
RDebugUtils.currentModule="addphoto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ion_event"))
	return (Object) Debug.delegate(mostCurrent.activityBA, "ion_event", new Object[] {_methodname,_args});
anywheresoftware.b4a.objects.IntentWrapper _i = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.collections.List _uris = null;
anywheresoftware.b4j.object.JavaObject _clipdata = null;
int _count = 0;
int _i2 = 0;
anywheresoftware.b4j.object.JavaObject _item = null;
int _urisize = 0;
int _c = 0;
String _urst = "";
String _realpath = "";
int _lastidx = 0;
String _pathonly = "";
String _namefilee = "";
String _newname = "";
String _oldname = "";
String _filenamefile = "";
String _filename = "";
String _extensi = "";
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Sub ion_Event (MethodName As String, Args() As Obj";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="If Args(0) = -1 Then 'resultCode = RESULT_OK";
if ((_args[(int) (0)]).equals((Object)(-1))) { 
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="Dim i As Intent = Args(1)";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
_i.setObject((android.content.Intent)(_args[(int) (1)]));
RDebugUtils.currentLine=19988483;
 //BA.debugLineNum = 19988483;BA.debugLine="Dim jo As JavaObject = i";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_i.getObject()));
RDebugUtils.currentLine=19988485;
 //BA.debugLineNum = 19988485;BA.debugLine="Dim uris As List";
_uris = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19988486;
 //BA.debugLineNum = 19988486;BA.debugLine="uris.Initialize";
_uris.Initialize();
RDebugUtils.currentLine=19988487;
 //BA.debugLineNum = 19988487;BA.debugLine="Dim clipdata As JavaObject = jo.RunMethod(\"getCl";
_clipdata = new anywheresoftware.b4j.object.JavaObject();
_clipdata.setObject((java.lang.Object)(_jo.RunMethod("getClipData",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=19988488;
 //BA.debugLineNum = 19988488;BA.debugLine="If clipdata.IsInitialized Then";
if (_clipdata.IsInitialized()) { 
RDebugUtils.currentLine=19988489;
 //BA.debugLineNum = 19988489;BA.debugLine="Dim count As Int = clipdata.RunMethod(\"getItemC";
_count = (int)(BA.ObjectToNumber(_clipdata.RunMethod("getItemCount",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=19988490;
 //BA.debugLineNum = 19988490;BA.debugLine="For i2 = 0 To count -1";
{
final int step9 = 1;
final int limit9 = (int) (_count-1);
_i2 = (int) (0) ;
for (;(step9 > 0 && _i2 <= limit9) || (step9 < 0 && _i2 >= limit9) ;_i2 = ((int)(0 + _i2 + step9))  ) {
RDebugUtils.currentLine=19988491;
 //BA.debugLineNum = 19988491;BA.debugLine="Dim item As JavaObject = clipdata.RunMethod(\"g";
_item = new anywheresoftware.b4j.object.JavaObject();
_item.setObject((java.lang.Object)(_clipdata.RunMethod("getItemAt",new Object[]{(Object)(_i2)})));
RDebugUtils.currentLine=19988492;
 //BA.debugLineNum = 19988492;BA.debugLine="uris.Add(item.RunMethod(\"getUri\", Null))";
_uris.Add(_item.RunMethod("getUri",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 }
};
 }else {
RDebugUtils.currentLine=19988495;
 //BA.debugLineNum = 19988495;BA.debugLine="uris.Add(i.GetData)";
_uris.Add((Object)(_i.GetData()));
 };
RDebugUtils.currentLine=19988497;
 //BA.debugLineNum = 19988497;BA.debugLine="Log(uris)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_uris));
RDebugUtils.currentLine=19988498;
 //BA.debugLineNum = 19988498;BA.debugLine="Dim urisize As Int = uris.Size";
_urisize = _uris.getSize();
RDebugUtils.currentLine=19988499;
 //BA.debugLineNum = 19988499;BA.debugLine="For c=0 To urisize-1";
{
final int step18 = 1;
final int limit18 = (int) (_urisize-1);
_c = (int) (0) ;
for (;(step18 > 0 && _c <= limit18) || (step18 < 0 && _c >= limit18) ;_c = ((int)(0 + _c + step18))  ) {
RDebugUtils.currentLine=19988500;
 //BA.debugLineNum = 19988500;BA.debugLine="Dim urst,realpath As String";
_urst = "";
_realpath = "";
RDebugUtils.currentLine=19988501;
 //BA.debugLineNum = 19988501;BA.debugLine="urst= uris.Get(c)";
_urst = BA.ObjectToString(_uris.Get(_c));
RDebugUtils.currentLine=19988502;
 //BA.debugLineNum = 19988502;BA.debugLine="Log(\"PATH:\"& GetPathFromContentResult(urst))";
anywheresoftware.b4a.keywords.Common.Log("PATH:"+_getpathfromcontentresult(_urst));
RDebugUtils.currentLine=19988503;
 //BA.debugLineNum = 19988503;BA.debugLine="realpath = GetPathFromContentResult(urst)";
_realpath = _getpathfromcontentresult(_urst);
RDebugUtils.currentLine=19988504;
 //BA.debugLineNum = 19988504;BA.debugLine="Log(realpath.LastIndexOf(\"/\"))";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_realpath.lastIndexOf("/")));
RDebugUtils.currentLine=19988505;
 //BA.debugLineNum = 19988505;BA.debugLine="Dim lastidx As Int = realpath.LastIndexOf(\"/\")";
_lastidx = _realpath.lastIndexOf("/");
RDebugUtils.currentLine=19988506;
 //BA.debugLineNum = 19988506;BA.debugLine="Dim pathonly As String = realpath.SubString2(0,";
_pathonly = _realpath.substring((int) (0),_lastidx);
RDebugUtils.currentLine=19988507;
 //BA.debugLineNum = 19988507;BA.debugLine="Dim namefilee As String = realpath.SubString2(l";
_namefilee = _realpath.substring((int) (_lastidx+1),_realpath.length());
RDebugUtils.currentLine=19988508;
 //BA.debugLineNum = 19988508;BA.debugLine="Log(\"NAMAA :\"&namefilee)";
anywheresoftware.b4a.keywords.Common.Log("NAMAA :"+_namefilee);
RDebugUtils.currentLine=19988509;
 //BA.debugLineNum = 19988509;BA.debugLine="If File.Exists(temp,namefilee) Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_temp,_namefilee)) { 
RDebugUtils.currentLine=19988510;
 //BA.debugLineNum = 19988510;BA.debugLine="Dim newname,oldname As String";
_newname = "";
_oldname = "";
RDebugUtils.currentLine=19988511;
 //BA.debugLineNum = 19988511;BA.debugLine="oldname = namefilee";
_oldname = _namefilee;
RDebugUtils.currentLine=19988512;
 //BA.debugLineNum = 19988512;BA.debugLine="Do While File.Exists(temp,oldname) == True";
while (anywheresoftware.b4a.keywords.Common.File.Exists(_temp,_oldname)==anywheresoftware.b4a.keywords.Common.True) {
RDebugUtils.currentLine=19988513;
 //BA.debugLineNum = 19988513;BA.debugLine="Dim filenamefile , filename, extensi As Strin";
_filenamefile = "";
_filename = "";
_extensi = "";
RDebugUtils.currentLine=19988514;
 //BA.debugLineNum = 19988514;BA.debugLine="filenamefile = oldname";
_filenamefile = _oldname;
RDebugUtils.currentLine=19988515;
 //BA.debugLineNum = 19988515;BA.debugLine="Log(\"COBA :\"&filenamefile.SubString2(0, filen";
anywheresoftware.b4a.keywords.Common.Log("COBA :"+_filenamefile.substring((int) (0),(int) (_filenamefile.length()-4)));
RDebugUtils.currentLine=19988516;
 //BA.debugLineNum = 19988516;BA.debugLine="filename = filenamefile.SubString2(0, filenam";
_filename = _filenamefile.substring((int) (0),(int) (_filenamefile.length()-4));
RDebugUtils.currentLine=19988517;
 //BA.debugLineNum = 19988517;BA.debugLine="extensi = filenamefile.SubString2(filename.Le";
_extensi = _filenamefile.substring(_filename.length(),_filenamefile.length());
RDebugUtils.currentLine=19988518;
 //BA.debugLineNum = 19988518;BA.debugLine="Log(\"name: \"&filename)";
anywheresoftware.b4a.keywords.Common.Log("name: "+_filename);
RDebugUtils.currentLine=19988519;
 //BA.debugLineNum = 19988519;BA.debugLine="Log(\"extention: \"&extensi)";
anywheresoftware.b4a.keywords.Common.Log("extention: "+_extensi);
RDebugUtils.currentLine=19988520;
 //BA.debugLineNum = 19988520;BA.debugLine="newname=filename&\"(copy)\"&extensi";
_newname = _filename+"(copy)"+_extensi;
RDebugUtils.currentLine=19988521;
 //BA.debugLineNum = 19988521;BA.debugLine="oldname=newname";
_oldname = _newname;
 }
;
RDebugUtils.currentLine=19988525;
 //BA.debugLineNum = 19988525;BA.debugLine="File.Copy(pathonly,namefilee,temp,newname)";
anywheresoftware.b4a.keywords.Common.File.Copy(_pathonly,_namefilee,_temp,_newname);
RDebugUtils.currentLine=19988526;
 //BA.debugLineNum = 19988526;BA.debugLine="Log(\"DONE\")";
anywheresoftware.b4a.keywords.Common.Log("DONE");
 }else {
RDebugUtils.currentLine=19988528;
 //BA.debugLineNum = 19988528;BA.debugLine="File.Copy(pathonly,namefilee,temp,namefilee)";
anywheresoftware.b4a.keywords.Common.File.Copy(_pathonly,_namefilee,_temp,_namefilee);
 };
 }
};
 };
RDebugUtils.currentLine=19988532;
 //BA.debugLineNum = 19988532;BA.debugLine="Return Null";
if (true) return anywheresoftware.b4a.keywords.Common.Null;
RDebugUtils.currentLine=19988533;
 //BA.debugLineNum = 19988533;BA.debugLine="End Sub";
return null;
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="addphoto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"Upload Success")) {
case 0: {
RDebugUtils.currentLine=20316164;
 //BA.debugLineNum = 20316164;BA.debugLine="Log(\"Uploaded file success!!!\")";
anywheresoftware.b4a.keywords.Common.Log("Uploaded file success!!!");
RDebugUtils.currentLine=20316165;
 //BA.debugLineNum = 20316165;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 break; }
}
;
 }else {
RDebugUtils.currentLine=20316168;
 //BA.debugLineNum = 20316168;BA.debugLine="Msgbox(\"gagal\",\"WARNING\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("gagal"),BA.ObjectToCharSequence("WARNING"),mostCurrent.activityBA);
 };
RDebugUtils.currentLine=20316170;
 //BA.debugLineNum = 20316170;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=20316171;
 //BA.debugLineNum = 20316171;BA.debugLine="End Sub";
return "";
}
public static String  _response_streamfinish(boolean _success,int _taskid) throws Exception{
RDebugUtils.currentModule="addphoto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "response_streamfinish"))
	return (String) Debug.delegate(mostCurrent.activityBA, "response_streamfinish", new Object[] {_success,_taskid});
byte[] _another_buffer = null;
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Sub Response_StreamFinish (Success As Boolean, Tas";
RDebugUtils.currentLine=20578305;
 //BA.debugLineNum = 20578305;BA.debugLine="Dim another_buffer () As Byte";
_another_buffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="another_buffer = out.ToBytesArray";
_another_buffer = _out.ToBytesArray();
RDebugUtils.currentLine=20578307;
 //BA.debugLineNum = 20578307;BA.debugLine="Log (BytesToString(another_buffer, 0, another_buf";
anywheresoftware.b4a.keywords.Common.Log(anywheresoftware.b4a.keywords.Common.BytesToString(_another_buffer,(int) (0),_another_buffer.length,"UTF8"));
RDebugUtils.currentLine=20578308;
 //BA.debugLineNum = 20578308;BA.debugLine="End Sub";
return "";
}
}