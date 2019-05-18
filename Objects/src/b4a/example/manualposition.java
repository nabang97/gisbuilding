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

public class manualposition extends Activity implements B4AActivity{
	public static manualposition mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.manualposition");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (manualposition).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.manualposition");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.manualposition", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (manualposition) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (manualposition) Resume **");
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
		return manualposition.class;
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
        BA.LogInfo("** Activity (manualposition) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (manualposition) Resume **");
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
public static double _lat = 0;
public static double _lng = 0;
public static double _latnew = 0;
public static double _lngnew = 0;
public static double _savedlat = 0;
public static double _savedlng = 0;
public static double _latgps = 0;
public static double _lnggps = 0;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneltoolbar = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnposition = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageposition = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagemanual = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagelegend = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagerefresh = null;
public anywheresoftware.b4a.objects.LabelWrapper _titlebar = null;
public anywheresoftware.b4a.objects.LabelWrapper _backarrow = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsavelocation = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnhome = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnmap = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsearch = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btninfo = null;
public static double _latpos = 0;
public static double _lngpos = 0;
public static double _latman = 0;
public static double _lngman = 0;
public anywheresoftware.b4a.objects.PanelWrapper _panelbar = null;
public anywheresoftware.b4a.objects.PanelWrapper _legend = null;
public anywheresoftware.b4a.objects.ButtonWrapper _closebtn = null;
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
public b4a.example.healthedit _healthedit = null;
public b4a.example.searchworship _searchworship = null;
public b4a.example.multipartpost _multipartpost = null;
public static String  _gpsstatus(String _satellites) throws Exception{
RDebugUtils.currentModule="manualposition";
if (Debug.shouldDelegate(mostCurrent.activityBA, "gpsstatus"))
	return (String) Debug.delegate(mostCurrent.activityBA, "gpsstatus", new Object[] {_satellites});
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Public Sub GpsStatus (Satellites As String)";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="Log(\"dari manual position: \"&Satellites)";
anywheresoftware.b4a.keywords.Common.Log("dari manual position: "+_satellites);
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="End Sub";
return "";
}
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="manualposition";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="ScrollView1.Panel.Width=100%x";
mostCurrent._scrollview1.getPanel().setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="ScrollView1.Panel.LoadLayout(\"MapLocation\")";
mostCurrent._scrollview1.getPanel().LoadLayout("MapLocation",mostCurrent.activityBA);
RDebugUtils.currentLine=9109510;
 //BA.debugLineNum = 9109510;BA.debugLine="BackArrow.Visible= False";
mostCurrent._backarrow.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9109511;
 //BA.debugLineNum = 9109511;BA.debugLine="TitleBar.Text=\"Your Position\"";
mostCurrent._titlebar.setText(BA.ObjectToCharSequence("Your Position"));
RDebugUtils.currentLine=9109512;
 //BA.debugLineNum = 9109512;BA.debugLine="manager.SetBoolean(\"legend\",False)";
_manager.SetBoolean("legend",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9109513;
 //BA.debugLineNum = 9109513;BA.debugLine="manager.SetBoolean(\"position_click\", True)";
_manager.SetBoolean("position_click",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9109514;
 //BA.debugLineNum = 9109514;BA.debugLine="WebView1.Height= 100%y - (PanelToolBar.Height + P";
mostCurrent._webview1.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-(mostCurrent._paneltoolbar.getHeight()+mostCurrent._panelbar.getHeight()+mostCurrent._webview1.getTop())));
RDebugUtils.currentLine=9109515;
 //BA.debugLineNum = 9109515;BA.debugLine="Panel1.Height = WebView1.Height + WebView1.Top";
mostCurrent._panel1.setHeight((int) (mostCurrent._webview1.getHeight()+mostCurrent._webview1.getTop()));
RDebugUtils.currentLine=9109516;
 //BA.debugLineNum = 9109516;BA.debugLine="btnSaveLocation.Top = 100%y - 25%y";
mostCurrent._btnsavelocation.setTop((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (25),mostCurrent.activityBA)));
RDebugUtils.currentLine=9109517;
 //BA.debugLineNum = 9109517;BA.debugLine="Legend.Top = 100%y - (26%y + Legend.Height)";
mostCurrent._legend.setTop((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (26),mostCurrent.activityBA)+mostCurrent._legend.getHeight())));
RDebugUtils.currentLine=9109518;
 //BA.debugLineNum = 9109518;BA.debugLine="ScrollView1.Panel.Height = Panel1.Height";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._panel1.getHeight());
RDebugUtils.currentLine=9109519;
 //BA.debugLineNum = 9109519;BA.debugLine="Legend.Visible = False";
mostCurrent._legend.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9109521;
 //BA.debugLineNum = 9109521;BA.debugLine="ScrollView1.Height = Panel1.Height";
mostCurrent._scrollview1.setHeight(mostCurrent._panel1.getHeight());
RDebugUtils.currentLine=9109522;
 //BA.debugLineNum = 9109522;BA.debugLine="If latGps == 0 Or latGps == 0 Then";
if (_latgps==0 || _latgps==0) { 
RDebugUtils.currentLine=9109523;
 //BA.debugLineNum = 9109523;BA.debugLine="Msgbox(\"GPS can't find your location. Try to ref";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("GPS can't find your location. Try to refresh or open the application outside the room."),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
RDebugUtils.currentLine=9109524;
 //BA.debugLineNum = 9109524;BA.debugLine="lat = -0.3209284";
_lat = -0.3209284;
RDebugUtils.currentLine=9109525;
 //BA.debugLineNum = 9109525;BA.debugLine="lng = 100.3484996";
_lng = 100.3484996;
 }else {
RDebugUtils.currentLine=9109527;
 //BA.debugLineNum = 9109527;BA.debugLine="lat = latGps";
_lat = _latgps;
RDebugUtils.currentLine=9109528;
 //BA.debugLineNum = 9109528;BA.debugLine="lng = lngGps";
_lng = _lnggps;
 };
RDebugUtils.currentLine=9109531;
 //BA.debugLineNum = 9109531;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="manualposition";
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="manualposition";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
uk.co.martinpearman.b4a.webviewextras.WebViewExtras _webviewextras1 = null;
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="Log(\"Firsttime : \"&lat&\",\"&lng)";
anywheresoftware.b4a.keywords.Common.Log("Firsttime : "+BA.NumberToString(_lat)+","+BA.NumberToString(_lng));
RDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="Dim WebViewExtras1 As WebViewExtras";
_webviewextras1 = new uk.co.martinpearman.b4a.webviewextras.WebViewExtras();
RDebugUtils.currentLine=9175046;
 //BA.debugLineNum = 9175046;BA.debugLine="WebViewExtras1.addJavascriptInterface(WebView1, \"";
_webviewextras1.addJavascriptInterface(mostCurrent.activityBA,(android.webkit.WebView)(mostCurrent._webview1.getObject()),"B4A");
RDebugUtils.currentLine=9175047;
 //BA.debugLineNum = 9175047;BA.debugLine="WebView1.LoadUrl(Main.Server&\"user_position.php?l";
mostCurrent._webview1.LoadUrl(mostCurrent._main._server+"user_position.php?lat="+BA.NumberToString(_lat)+"&lng="+BA.NumberToString(_lng)+"&legend="+BA.ObjectToString(_manager.GetBoolean("legend")));
RDebugUtils.currentLine=9175048;
 //BA.debugLineNum = 9175048;BA.debugLine="End Sub";
return "";
}
public static String  _btnhome_click() throws Exception{
RDebugUtils.currentModule="manualposition";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnhome_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnhome_click", null);
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Sub BtnHome_Click";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="If File.Exists(Main.folder,\"datastore\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._main._folder,"datastore")) { 
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="If Main.kvs.ContainsKey(\"role\") == True Then";
if (mostCurrent._main._kvs._containskey("role")==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=10092548;
 //BA.debugLineNum = 10092548;BA.debugLine="StartActivity(HomeAdmin)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homeadmin.getObject()));
RDebugUtils.currentLine=10092549;
 //BA.debugLineNum = 10092549;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
RDebugUtils.currentLine=10092552;
 //BA.debugLineNum = 10092552;BA.debugLine="StartActivity(Home)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._home.getObject()));
RDebugUtils.currentLine=10092553;
 //BA.debugLineNum = 10092553;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 };
RDebugUtils.currentLine=10092556;
 //BA.debugLineNum = 10092556;BA.debugLine="End Sub";
return "";
}
public static String  _btninfo_click() throws Exception{
RDebugUtils.currentModule="manualposition";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btninfo_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btninfo_click", null);
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Sub BtnInfo_Click";
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="End Sub";
return "";
}
public static String  _btnmap_click() throws Exception{
RDebugUtils.currentModule="manualposition";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnmap_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnmap_click", null);
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Sub BtnMap_Click";
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="End Sub";
return "";
}
public static String  _btnposition_click() throws Exception{
RDebugUtils.currentModule="manualposition";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnposition_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnposition_click", null);
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Sub btnPosition_Click";
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="End Sub";
return "";
}
public static String  _btnsavelocation_click() throws Exception{
RDebugUtils.currentModule="manualposition";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsavelocation_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnsavelocation_click", null);
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Sub btnSaveLocation_Click";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="If manager.GetBoolean(\"manual_click\") Then";
if (_manager.GetBoolean("manual_click")) { 
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="If latnew <> 0 Or lngnew <> 0 Then";
if (_latnew!=0 || _lngnew!=0) { 
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="lat = latnew";
_lat = _latnew;
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="lng = lngnew";
_lng = _lngnew;
 }else {
RDebugUtils.currentLine=10027014;
 //BA.debugLineNum = 10027014;BA.debugLine="lat = lat";
_lat = _lat;
RDebugUtils.currentLine=10027015;
 //BA.debugLineNum = 10027015;BA.debugLine="lng = lng";
_lng = _lng;
 };
RDebugUtils.currentLine=10027017;
 //BA.debugLineNum = 10027017;BA.debugLine="manager.SetBoolean(\"manual_clicked\",True)";
_manager.SetBoolean("manual_clicked",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=10027018;
 //BA.debugLineNum = 10027018;BA.debugLine="manager.SetBoolean(\"posisi_clicked\",False)";
_manager.SetBoolean("posisi_clicked",anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=10027019;
 //BA.debugLineNum = 10027019;BA.debugLine="Else if manager.GetBoolean(\"position_click\") Then";
if (_manager.GetBoolean("position_click")) { 
RDebugUtils.currentLine=10027020;
 //BA.debugLineNum = 10027020;BA.debugLine="If latGps <> 0  Or lngGps <> 0 Then";
if (_latgps!=0 || _lnggps!=0) { 
RDebugUtils.currentLine=10027021;
 //BA.debugLineNum = 10027021;BA.debugLine="Msgbox(\"GPS can't find your location. Try to re";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("GPS can't find your location. Try to restart the application or open the application outside the room."),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
RDebugUtils.currentLine=10027022;
 //BA.debugLineNum = 10027022;BA.debugLine="lat = latpos";
_lat = _latpos;
RDebugUtils.currentLine=10027023;
 //BA.debugLineNum = 10027023;BA.debugLine="lng = lngpos";
_lng = _lngpos;
 }else {
RDebugUtils.currentLine=10027025;
 //BA.debugLineNum = 10027025;BA.debugLine="lat = latGps";
_lat = _latgps;
RDebugUtils.currentLine=10027026;
 //BA.debugLineNum = 10027026;BA.debugLine="lng = lngGps";
_lng = _lnggps;
 };
RDebugUtils.currentLine=10027028;
 //BA.debugLineNum = 10027028;BA.debugLine="manager.SetBoolean(\"posisi_clicked\",True)";
_manager.SetBoolean("posisi_clicked",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=10027029;
 //BA.debugLineNum = 10027029;BA.debugLine="manager.SetBoolean(\"manual_clicked\",False)";
_manager.SetBoolean("manual_clicked",anywheresoftware.b4a.keywords.Common.False);
 }}
;
RDebugUtils.currentLine=10027032;
 //BA.debugLineNum = 10027032;BA.debugLine="Log(\"saved:\"&lat&\",\"&lng)";
anywheresoftware.b4a.keywords.Common.Log("saved:"+BA.NumberToString(_lat)+","+BA.NumberToString(_lng));
RDebugUtils.currentLine=10027033;
 //BA.debugLineNum = 10027033;BA.debugLine="Log(\"posisi_clicked: \"&manager.GetBoolean(\"posisi";
anywheresoftware.b4a.keywords.Common.Log("posisi_clicked: "+BA.ObjectToString(_manager.GetBoolean("posisi_clicked")));
RDebugUtils.currentLine=10027034;
 //BA.debugLineNum = 10027034;BA.debugLine="Log(\"manual_clicked: \"&manager.GetBoolean(\"manual";
anywheresoftware.b4a.keywords.Common.Log("manual_clicked: "+BA.ObjectToString(_manager.GetBoolean("manual_clicked")));
RDebugUtils.currentLine=10027035;
 //BA.debugLineNum = 10027035;BA.debugLine="Msgbox(\"Your Location has been saved (\"&lat&\",\"&l";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Your Location has been saved ("+BA.NumberToString(_lat)+","+BA.NumberToString(_lng)+")"),BA.ObjectToCharSequence("Successful"),mostCurrent.activityBA);
RDebugUtils.currentLine=10027036;
 //BA.debugLineNum = 10027036;BA.debugLine="End Sub";
return "";
}
public static String  _btnsearch_click() throws Exception{
RDebugUtils.currentModule="manualposition";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsearch_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnsearch_click", null);
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Sub BtnSearch_Click";
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="StartActivity(SearchBuilding)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._searchbuilding.getObject()));
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="End Sub";
return "";
}
public static String  _closebtn_click() throws Exception{
RDebugUtils.currentModule="manualposition";
if (Debug.shouldDelegate(mostCurrent.activityBA, "closebtn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "closebtn_click", null);
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Sub closebtn_Click";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Legend.Visible = False";
mostCurrent._legend.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="End Sub";
return "";
}
public static String  _imagelegend_click() throws Exception{
RDebugUtils.currentModule="manualposition";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imagelegend_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "imagelegend_click", null);
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Sub ImageLegend_Click";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="Legend.Visible = True";
mostCurrent._legend.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="End Sub";
return "";
}
public static String  _imagemanual_click() throws Exception{
RDebugUtils.currentModule="manualposition";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imagemanual_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "imagemanual_click", null);
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Sub ImageManual_Click";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="If manager.GetBoolean(\"manual_clicked\") Then";
if (_manager.GetBoolean("manual_clicked")) { 
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="latman = lat";
_latman = _lat;
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="lngman = lng";
_lngman = _lng;
 }else {
RDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="latman = latpos";
_latman = _latpos;
RDebugUtils.currentLine=9830406;
 //BA.debugLineNum = 9830406;BA.debugLine="lngman = lngpos";
_lngman = _lngpos;
 };
RDebugUtils.currentLine=9830408;
 //BA.debugLineNum = 9830408;BA.debugLine="WebView1.LoadUrl(Main.Server&\"manual_position.php";
mostCurrent._webview1.LoadUrl(mostCurrent._main._server+"manual_position.php?lat="+BA.NumberToString(_latman)+"&lng="+BA.NumberToString(_lngman)+"&legend="+BA.ObjectToString(_manager.GetBoolean("legend")));
RDebugUtils.currentLine=9830409;
 //BA.debugLineNum = 9830409;BA.debugLine="manager.SetBoolean(\"manual_click\", True)";
_manager.SetBoolean("manual_click",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9830410;
 //BA.debugLineNum = 9830410;BA.debugLine="manager.SetBoolean(\"position_click\", False)";
_manager.SetBoolean("position_click",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9830411;
 //BA.debugLineNum = 9830411;BA.debugLine="End Sub";
return "";
}
public static String  _imageposition_click() throws Exception{
RDebugUtils.currentModule="manualposition";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imageposition_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "imageposition_click", null);
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Sub ImagePosition_Click";
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="If latGps ==0  Or lngGps == 0 Then";
if (_latgps==0 || _lnggps==0) { 
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="latpos = lat";
_latpos = _lat;
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="lngpos = lng";
_lngpos = _lng;
 }else {
RDebugUtils.currentLine=9764871;
 //BA.debugLineNum = 9764871;BA.debugLine="latpos = latGps";
_latpos = _latgps;
RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="lngpos = lngGps";
_lngpos = _lnggps;
 };
RDebugUtils.currentLine=9764874;
 //BA.debugLineNum = 9764874;BA.debugLine="WebView1.LoadUrl(Main.Server&\"user_position.php?l";
mostCurrent._webview1.LoadUrl(mostCurrent._main._server+"user_position.php?lat="+BA.NumberToString(_latpos)+"&lng="+BA.NumberToString(_lngpos)+"&legend="+BA.ObjectToString(_manager.GetBoolean("legend")));
RDebugUtils.currentLine=9764875;
 //BA.debugLineNum = 9764875;BA.debugLine="manager.SetBoolean(\"position_click\", True)";
_manager.SetBoolean("position_click",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9764876;
 //BA.debugLineNum = 9764876;BA.debugLine="manager.SetBoolean(\"manual_click\", False)";
_manager.SetBoolean("manual_click",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9764877;
 //BA.debugLineNum = 9764877;BA.debugLine="End Sub";
return "";
}
public static String  _imagerefresh_click() throws Exception{
RDebugUtils.currentModule="manualposition";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imagerefresh_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "imagerefresh_click", null);
boolean _manualclick = false;
boolean _positionclick = false;
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Sub ImageRefresh_Click";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="CallSubDelayed(Starter, \"StartGPS\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._starter.getObject()),"StartGPS");
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="Dim manualclick, positionClick As Boolean";
_manualclick = false;
_positionclick = false;
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="positionClick = manager.GetBoolean(\"position_clic";
_positionclick = _manager.GetBoolean("position_click");
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="manualclick = manager.GetBoolean(\"manual_click\")";
_manualclick = _manager.GetBoolean("manual_click");
RDebugUtils.currentLine=9961478;
 //BA.debugLineNum = 9961478;BA.debugLine="If positionClick Then";
if (_positionclick) { 
RDebugUtils.currentLine=9961479;
 //BA.debugLineNum = 9961479;BA.debugLine="WebView1.LoadUrl(Main.Server&\"user_position.php?";
mostCurrent._webview1.LoadUrl(mostCurrent._main._server+"user_position.php?lat="+BA.NumberToString(_latpos)+"&lng="+BA.NumberToString(_lngpos)+"&legend="+BA.ObjectToString(_manager.GetBoolean("legend")));
 }else 
{RDebugUtils.currentLine=9961480;
 //BA.debugLineNum = 9961480;BA.debugLine="Else If manualclick Then";
if (_manualclick) { 
RDebugUtils.currentLine=9961481;
 //BA.debugLineNum = 9961481;BA.debugLine="WebView1.LoadUrl(Main.Server&\"manual_position.ph";
mostCurrent._webview1.LoadUrl(mostCurrent._main._server+"manual_position.php?lat="+BA.NumberToString(_lat)+"&lng="+BA.NumberToString(_lng)+"&legend="+BA.ObjectToString(_manager.GetBoolean("legend")));
 }else {
RDebugUtils.currentLine=9961483;
 //BA.debugLineNum = 9961483;BA.debugLine="WebView1.LoadUrl(Main.Server&\"user_position.php?";
mostCurrent._webview1.LoadUrl(mostCurrent._main._server+"user_position.php?lat="+BA.NumberToString(_lat)+"&lng="+BA.NumberToString(_lng)+"&legend="+BA.ObjectToString(_manager.GetBoolean("legend")));
 }}
;
RDebugUtils.currentLine=9961485;
 //BA.debugLineNum = 9961485;BA.debugLine="End Sub";
return "";
}
public static String  _legend_status(String _str) throws Exception{
RDebugUtils.currentModule="manualposition";
if (Debug.shouldDelegate(mostCurrent.activityBA, "legend_status"))
	return (String) Debug.delegate(mostCurrent.activityBA, "legend_status", new Object[] {_str});
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Sub Legend_Status(Str As String)";
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="Log(Str)";
anywheresoftware.b4a.keywords.Common.Log(_str);
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="If Str == \"false\" Then";
if ((_str).equals("false")) { 
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="manager.SetBoolean(\"legend\",False)";
_manager.SetBoolean("legend",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="Log(manager.GetBoolean(\"legend\"))";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_manager.GetBoolean("legend")));
RDebugUtils.currentLine=9633799;
 //BA.debugLineNum = 9633799;BA.debugLine="End Sub";
return "";
}
public static String  _locationchanged(String _latitude,String _longitude) throws Exception{
RDebugUtils.currentModule="manualposition";
if (Debug.shouldDelegate(mostCurrent.activityBA, "locationchanged"))
	return (String) Debug.delegate(mostCurrent.activityBA, "locationchanged", new Object[] {_latitude,_longitude});
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Public Sub LocationChanged(Latitude As String, Lon";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Log(\"Location:\"&Latitude&\",\"&Longitude)";
anywheresoftware.b4a.keywords.Common.Log("Location:"+_latitude+","+_longitude);
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="latGps = Latitude";
_latgps = (double)(Double.parseDouble(_latitude));
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="lngGps = Longitude";
_lnggps = (double)(Double.parseDouble(_longitude));
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="End Sub";
return "";
}
public static String  _marker_address(String _address) throws Exception{
RDebugUtils.currentModule="manualposition";
if (Debug.shouldDelegate(mostCurrent.activityBA, "marker_address"))
	return (String) Debug.delegate(mostCurrent.activityBA, "marker_address", new Object[] {_address});
String _stat = "";
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Sub Marker_Address(Address As String)";
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="Dim stat As String = Address";
_stat = _address;
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="Log(stat)";
anywheresoftware.b4a.keywords.Common.Log(_stat);
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="End Sub";
return "";
}
public static String  _marker_dragend(String _newlatitude,String _newlongitude) throws Exception{
RDebugUtils.currentModule="manualposition";
if (Debug.shouldDelegate(mostCurrent.activityBA, "marker_dragend"))
	return (String) Debug.delegate(mostCurrent.activityBA, "marker_dragend", new Object[] {_newlatitude,_newlongitude});
double _latitude = 0;
double _longititude = 0;
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Sub Marker_DragEnd(NewLatitude As String, NewLongi";
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="Dim Latitude As Double=NewLatitude";
_latitude = (double)(Double.parseDouble(_newlatitude));
RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="Dim Longititude As Double=NewLongitude";
_longititude = (double)(Double.parseDouble(_newlongitude));
RDebugUtils.currentLine=9437188;
 //BA.debugLineNum = 9437188;BA.debugLine="Main.kvs.Put(\"Position Manual\",Latitude&\",\"&Longi";
mostCurrent._main._kvs._put("Position Manual",(Object)(BA.NumberToString(_latitude)+","+BA.NumberToString(_longititude)));
RDebugUtils.currentLine=9437189;
 //BA.debugLineNum = 9437189;BA.debugLine="latnew = Latitude";
_latnew = _latitude;
RDebugUtils.currentLine=9437190;
 //BA.debugLineNum = 9437190;BA.debugLine="lngnew = Longititude";
_lngnew = _longititude;
RDebugUtils.currentLine=9437191;
 //BA.debugLineNum = 9437191;BA.debugLine="Log(\"The user has dragged the Marker to (\"&latnew";
anywheresoftware.b4a.keywords.Common.Log("The user has dragged the Marker to ("+BA.NumberToString(_latnew)+", "+BA.NumberToString(_lngnew)+")");
RDebugUtils.currentLine=9437192;
 //BA.debugLineNum = 9437192;BA.debugLine="End Sub";
return "";
}
public static String  _marker_dragging(String _status) throws Exception{
RDebugUtils.currentModule="manualposition";
if (Debug.shouldDelegate(mostCurrent.activityBA, "marker_dragging"))
	return (String) Debug.delegate(mostCurrent.activityBA, "marker_dragging", new Object[] {_status});
String _stat = "";
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Sub Marker_Dragging(Status As String)";
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="Dim stat As String = Status";
_stat = _status;
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="ToastMessageShow(stat,False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_stat),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="End Sub";
return "";
}
}