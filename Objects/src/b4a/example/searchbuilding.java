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

public class searchbuilding extends Activity implements B4AActivity{
	public static searchbuilding mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.searchbuilding");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (searchbuilding).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.searchbuilding");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.searchbuilding", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (searchbuilding) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (searchbuilding) Resume **");
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
		return searchbuilding.class;
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
        BA.LogInfo("** Activity (searchbuilding) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (searchbuilding) Resume **");
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
public static String _lat = "";
public static String _lng = "";
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static String _idbuilding = "";
public static String _namebuilding = "";
public static String _tipp = "";
public static String _tipname = "";
public static String _typeoffice = "";
public static String _cons = "";
public static String _consname = "";
public static String _typecons = "";
public static String _idspin = "";
public static String _latitude = "";
public static String _longitude = "";
public anywheresoftware.b4a.objects.LabelWrapper _titlebar = null;
public anywheresoftware.b4a.objects.LabelWrapper _backarrow = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webviewtest = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelbuildinglist = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _panellistitem = null;
public b4a.example3.customlistview _clv2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneltoolbar = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelsearch = null;
public anywheresoftware.b4a.objects.EditTextWrapper _searchtext = null;
public anywheresoftware.b4a.objects.PanelWrapper _searchtextpanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _num = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _buildingname = null;
public anywheresoftware.b4a.objects.ButtonWrapper _searchbtn = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinbuilding = null;
public anywheresoftware.b4a.objects.collections.Map _spinnermap = null;
public anywheresoftware.b4a.objects.collections.Map _spinnermapb = null;
public anywheresoftware.b4a.objects.collections.Map _spinnermapj = null;
public anywheresoftware.b4a.objects.collections.Map _spinnermapt = null;
public static String _typesrc = "";
public static String _jorongid = "";
public static String _typeid = "";
public anywheresoftware.b4a.objects.SpinnerWrapper _spinsearch = null;
public anywheresoftware.b4a.objects.SeekBarWrapper _searchradius = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinjorong = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spintype = null;
public anywheresoftware.b4a.objects.ButtonWrapper _facilitybtn = null;
public static String _idchecksub = "";
public static String _textchecksub = "";
public anywheresoftware.b4a.objects.collections.List _lstchecks = null;
public static int _count = 0;
public anywheresoftware.b4a.objects.EditTextWrapper _fromtext = null;
public anywheresoftware.b4a.objects.EditTextWrapper _totext = null;
public static int _radiusku = 0;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnmap = null;
public static String _datapath = "";
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.officedetail _officedetail = null;
public b4a.example.functionall _functionall = null;
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
public b4a.example.healthedit _healthedit = null;
public b4a.example.searchworship _searchworship = null;
public b4a.example.multipartpost _multipartpost = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="searchbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
int _topsearch = 0;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="ScrollView1.Panel.Width=100%y";
mostCurrent._scrollview1.getPanel().setWidth(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="ScrollView1.Panel.LoadLayout(\"clvBuildingList\")";
mostCurrent._scrollview1.getPanel().LoadLayout("clvBuildingList",mostCurrent.activityBA);
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="ScrollView1.Color =Colors.White";
mostCurrent._scrollview1.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="If ManualPosition.lat == 0 Or ManualPosition.lng";
if (mostCurrent._manualposition._lat==0 || mostCurrent._manualposition._lng==0) { 
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="Msgbox(\"GPS can't find your location. Try to res";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("GPS can't find your location. Try to restart the application or open the application outside the room."),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="latitude = -0.3209284";
_latitude = BA.NumberToString(-0.3209284);
RDebugUtils.currentLine=2949131;
 //BA.debugLineNum = 2949131;BA.debugLine="longitude = 100.3484996";
_longitude = BA.NumberToString(100.3484996);
 }else {
RDebugUtils.currentLine=2949133;
 //BA.debugLineNum = 2949133;BA.debugLine="latitude = ManualPosition.lat";
_latitude = BA.NumberToString(mostCurrent._manualposition._lat);
RDebugUtils.currentLine=2949134;
 //BA.debugLineNum = 2949134;BA.debugLine="longitude = ManualPosition.lng";
_longitude = BA.NumberToString(mostCurrent._manualposition._lng);
 };
RDebugUtils.currentLine=2949136;
 //BA.debugLineNum = 2949136;BA.debugLine="Log(\"Firsttime : \"&lat&\",\"&lng)";
anywheresoftware.b4a.keywords.Common.Log("Firsttime : "+_lat+","+_lng);
RDebugUtils.currentLine=2949137;
 //BA.debugLineNum = 2949137;BA.debugLine="BackArrow.Visible= False";
mostCurrent._backarrow.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2949138;
 //BA.debugLineNum = 2949138;BA.debugLine="TitleBar.Text=\"Search Building\"";
mostCurrent._titlebar.setText(BA.ObjectToCharSequence("Search Building"));
RDebugUtils.currentLine=2949139;
 //BA.debugLineNum = 2949139;BA.debugLine="TitleBar.Left = 5%x";
mostCurrent._titlebar.setLeft(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=2949140;
 //BA.debugLineNum = 2949140;BA.debugLine="Home.HomeBuilding = \"\"";
mostCurrent._home._homebuilding = "";
RDebugUtils.currentLine=2949142;
 //BA.debugLineNum = 2949142;BA.debugLine="WebViewTest.Initialize(\"\")";
mostCurrent._webviewtest.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=2949143;
 //BA.debugLineNum = 2949143;BA.debugLine="Activity.AddView(WebViewTest,0,6%y,100%x,35%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._webviewtest.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (35),mostCurrent.activityBA));
RDebugUtils.currentLine=2949144;
 //BA.debugLineNum = 2949144;BA.debugLine="WebViewTest.LoadURL(Main.Server&\"index.php\")";
mostCurrent._webviewtest.LoadUrl(mostCurrent._main._server+"index.php");
RDebugUtils.currentLine=2949147;
 //BA.debugLineNum = 2949147;BA.debugLine="Dim TopSearch As Int";
_topsearch = 0;
RDebugUtils.currentLine=2949148;
 //BA.debugLineNum = 2949148;BA.debugLine="TopSearch = WebViewTest.Height + WebViewTest.Top";
_topsearch = (int) (mostCurrent._webviewtest.getHeight()+mostCurrent._webviewtest.getTop());
RDebugUtils.currentLine=2949149;
 //BA.debugLineNum = 2949149;BA.debugLine="PanelSearch.Initialize(\"PanelSearch\")";
mostCurrent._panelsearch.Initialize(mostCurrent.activityBA,"PanelSearch");
RDebugUtils.currentLine=2949150;
 //BA.debugLineNum = 2949150;BA.debugLine="Activity.AddView(PanelSearch,0,TopSearch,100%x,15";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelsearch.getObject()),(int) (0),_topsearch,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=2949153;
 //BA.debugLineNum = 2949153;BA.debugLine="PanelSearch.LoadLayout(\"SearchPanelnside\")";
mostCurrent._panelsearch.LoadLayout("SearchPanelnside",mostCurrent.activityBA);
RDebugUtils.currentLine=2949154;
 //BA.debugLineNum = 2949154;BA.debugLine="PanelSearch.Color= Colors.RGB(209,209,209)";
mostCurrent._panelsearch.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (209),(int) (209),(int) (209)));
RDebugUtils.currentLine=2949155;
 //BA.debugLineNum = 2949155;BA.debugLine="SetBackgroundTintList(SearchText, Colors.Transpar";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._searchtext.getObject())),anywheresoftware.b4a.keywords.Common.Colors.Transparent,anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=2949156;
 //BA.debugLineNum = 2949156;BA.debugLine="CreateSpinBuilding_Item";
_createspinbuilding_item();
RDebugUtils.currentLine=2949157;
 //BA.debugLineNum = 2949157;BA.debugLine="SpinSearch.Clear";
mostCurrent._spinsearch.Clear();
RDebugUtils.currentLine=2949158;
 //BA.debugLineNum = 2949158;BA.debugLine="CLV2.AsView.Height = 0";
mostCurrent._clv2._asview().setHeight((int) (0));
RDebugUtils.currentLine=2949160;
 //BA.debugLineNum = 2949160;BA.debugLine="End Sub";
return "";
}
public static String  _setbackgroundtintlist(anywheresoftware.b4a.objects.ConcreteViewWrapper _view,int _active,int _enabled) throws Exception{
RDebugUtils.currentModule="searchbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setbackgroundtintlist"))
	return (String) Debug.delegate(mostCurrent.activityBA, "setbackgroundtintlist", new Object[] {_view,_active,_enabled});
int[][] _states = null;
int[] _color = null;
anywheresoftware.b4j.object.JavaObject _csl = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Dim States(2,1) As Int";
_states = new int[(int) (2)][];
{
int d0 = _states.length;
int d1 = (int) (1);
for (int i0 = 0;i0 < d0;i0++) {
_states[i0] = new int[d1];
}
}
;
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="States(0,0) = 16842908     'Active";
_states[(int) (0)][(int) (0)] = (int) (16842908);
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="States(1,0) = 16842910    'Enabled";
_states[(int) (1)][(int) (0)] = (int) (16842910);
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
_color = new int[]{_active,_enabled};
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="Dim CSL As JavaObject";
_csl = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
_csl.InitializeNewInstance("android.content.res.ColorStateList",new Object[]{(Object)(_states),(Object)(_color)});
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
_jo.InitializeStatic("android.support.v4.view.ViewCompat");
RDebugUtils.currentLine=3342345;
 //BA.debugLineNum = 3342345;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
_jo.RunMethod("setBackgroundTintList",new Object[]{(Object)(_view.getObject()),(Object)(_csl.getObject())});
RDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="End Sub";
return "";
}
public static String  _createspinbuilding_item() throws Exception{
RDebugUtils.currentModule="searchbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createspinbuilding_item"))
	return (String) Debug.delegate(mostCurrent.activityBA, "createspinbuilding_item", null);
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub CreateSpinBuilding_Item";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="spinnerMapB.Initialize";
mostCurrent._spinnermapb.Initialize();
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="SpinBuilding.add(\"Select Building Type\")";
mostCurrent._spinbuilding.Add("Select Building Type");
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="SpinBuilding.Add(\"All Building\")";
mostCurrent._spinbuilding.Add("All Building");
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="spinnerMapB.Put(\"All Building\",\"All\")";
mostCurrent._spinnermapb.Put((Object)("All Building"),(Object)("All"));
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="SpinBuilding.Add(\"Office Building\")";
mostCurrent._spinbuilding.Add("Office Building");
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="spinnerMapB.Put(\"Office Building\",\"Office\")";
mostCurrent._spinnermapb.Put((Object)("Office Building"),(Object)("Office"));
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="SpinBuilding.Add(\"Worship Building\")";
mostCurrent._spinbuilding.Add("Worship Building");
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="spinnerMapB.Put(\"Worship Building\",\"Worship\")";
mostCurrent._spinnermapb.Put((Object)("Worship Building"),(Object)("Worship"));
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="SpinBuilding.Add(\"House Building\")";
mostCurrent._spinbuilding.Add("House Building");
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="spinnerMapB.Put(\"House Building\",\"House\")";
mostCurrent._spinnermapb.Put((Object)("House Building"),(Object)("House"));
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="SpinBuilding.Add(\"Educational Building\")";
mostCurrent._spinbuilding.Add("Educational Building");
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="spinnerMapB.Put(\"Educational Building\",\"Education";
mostCurrent._spinnermapb.Put((Object)("Educational Building"),(Object)("Educational"));
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="SpinBuilding.Add(\"Health Building\")";
mostCurrent._spinbuilding.Add("Health Building");
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="spinnerMapB.Put(\"Health Building\",\"Health\")";
mostCurrent._spinnermapb.Put((Object)("Health Building"),(Object)("Health"));
RDebugUtils.currentLine=3145743;
 //BA.debugLineNum = 3145743;BA.debugLine="SpinBuilding.Add(\"Msme Building\")";
mostCurrent._spinbuilding.Add("Msme Building");
RDebugUtils.currentLine=3145744;
 //BA.debugLineNum = 3145744;BA.debugLine="spinnerMapB.Put(\"Msme Building\",\"Msme\")";
mostCurrent._spinnermapb.Put((Object)("Msme Building"),(Object)("Msme"));
RDebugUtils.currentLine=3145745;
 //BA.debugLineNum = 3145745;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="searchbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress"))
	return (Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode});
boolean _islogin = false;
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Dim isLogin As Boolean";
_islogin = false;
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="isLogin = Login.manager.GetBoolean(\"is_login\")";
_islogin = mostCurrent._login._manager.GetBoolean("is_login");
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="Log(\"keyy: \"&KeyCodes.KEYCODE_BACK)";
anywheresoftware.b4a.keywords.Common.Log("keyy: "+BA.NumberToString(anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK));
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then  ' Back b";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="If File.Exists(Main.folder,\"datastore\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._main._folder,"datastore")) { 
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="If Main.kvs.ContainsKey(\"role\")Then";
if (mostCurrent._main._kvs._containskey("role")) { 
RDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="StopService(Starter)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._starter.getObject()));
RDebugUtils.currentLine=4259848;
 //BA.debugLineNum = 4259848;BA.debugLine="Main.ShouldIClose = True";
mostCurrent._main._shouldiclose = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4259849;
 //BA.debugLineNum = 4259849;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 };
 };
RDebugUtils.currentLine=4259853;
 //BA.debugLineNum = 4259853;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="searchbuilding";
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="searchbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="End Sub";
return "";
}
public static String  _btnhome_click() throws Exception{
RDebugUtils.currentModule="searchbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnhome_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnhome_click", null);
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub BtnHome_Click";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="If File.Exists(Main.folder,\"datastore\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._main._folder,"datastore")) { 
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="If Main.kvs.ContainsKey(\"role\") == True Then";
if (mostCurrent._main._kvs._containskey("role")==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="StartActivity(HomeAdmin)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homeadmin.getObject()));
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="StartActivity(Home)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._home.getObject()));
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 };
RDebugUtils.currentLine=3801098;
 //BA.debugLineNum = 3801098;BA.debugLine="End Sub";
return "";
}
public static String  _btnmap_click() throws Exception{
RDebugUtils.currentModule="searchbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnmap_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnmap_click", null);
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Sub BtnMap_Click";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="StartActivity(ManualPosition)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._manualposition.getObject()));
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="End Sub";
return "";
}
public static String  _btnsearch_click() throws Exception{
RDebugUtils.currentModule="searchbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsearch_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnsearch_click", null);
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub BtnSearch_Click";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Activity_Create(True)";
_activity_create(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="End Sub";
return "";
}
public static String  _clv2_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="searchbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clv2_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "clv2_itemclick", new Object[] {_index,_value});
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub CLV2_ItemClick (Index As Int, Value As Object)";
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="idBuilding = Value 'store the value in the proces";
_idbuilding = BA.ObjectToString(_value);
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createitem(int _width,String _title,String _content) throws Exception{
RDebugUtils.currentModule="searchbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createitem"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createitem", new Object[] {_width,_title,_content});
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 100%x,10%y)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="p.LoadLayout(\"BuildingListTwo\")";
_p.LoadLayout("BuildingListTwo",mostCurrent.activityBA);
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="num.Text = Title";
mostCurrent._num.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="Buildingname.Text = Content";
mostCurrent._buildingname.setText(BA.ObjectToCharSequence(_content));
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_p.getObject()));
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="End Sub";
return null;
}
public static String  _createspintype_item() throws Exception{
RDebugUtils.currentModule="searchbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createspintype_item"))
	return (String) Debug.delegate(mostCurrent.activityBA, "createspintype_item", null);
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub CreateSpinType_Item";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="spinnerMapT.Initialize";
mostCurrent._spinnermapt.Initialize();
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"model","type","jorong","construction","status","tribe","village","datuk","education")) {
case 0: {
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="SpinType.add(\"Select Building Model \")";
mostCurrent._spintype.Add("Select Building Model ");
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="SpinType.add(\"Rumah Gadang\")";
mostCurrent._spintype.Add("Rumah Gadang");
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="spinnerMapT.Put(\"Rumah Gadang\",\"rg\")";
mostCurrent._spinnermapt.Put((Object)("Rumah Gadang"),(Object)("rg"));
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="SpinType.add(\"Dutch Building\")";
mostCurrent._spintype.Add("Dutch Building");
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="spinnerMapT.Put(\"Dutch Building\",\"db\")";
mostCurrent._spinnermapt.Put((Object)("Dutch Building"),(Object)("db"));
RDebugUtils.currentLine=3211273;
 //BA.debugLineNum = 3211273;BA.debugLine="SpinType.add(\"Other\")";
mostCurrent._spintype.Add("Other");
RDebugUtils.currentLine=3211274;
 //BA.debugLineNum = 3211274;BA.debugLine="spinnerMapT.Put(\"Other\",\"ot\")";
mostCurrent._spinnermapt.Put((Object)("Other"),(Object)("ot"));
 break; }
case 1: {
RDebugUtils.currentLine=3211276;
 //BA.debugLineNum = 3211276;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"Worship","Office","Msme","Educational","Health")) {
case 0: {
RDebugUtils.currentLine=3211278;
 //BA.debugLineNum = 3211278;BA.debugLine="SpinType.add(\"Select Type \"&idspin)";
mostCurrent._spintype.Add("Select Type "+_idspin);
RDebugUtils.currentLine=3211279;
 //BA.debugLineNum = 3211279;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_t";
_executeremotequery("SELECT type_id, name_of_type FROM type_of_worship ORDER BY name_of_type ASC","ShowType");
 break; }
case 1: {
RDebugUtils.currentLine=3211281;
 //BA.debugLineNum = 3211281;BA.debugLine="SpinType.add(\"Select Type \"&idspin)";
mostCurrent._spintype.Add("Select Type "+_idspin);
RDebugUtils.currentLine=3211282;
 //BA.debugLineNum = 3211282;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_t";
_executeremotequery("SELECT type_id, name_of_type FROM type_of_office ORDER BY name_of_type ASC","ShowType");
 break; }
case 2: {
RDebugUtils.currentLine=3211284;
 //BA.debugLineNum = 3211284;BA.debugLine="SpinType.add(\"Select Type \"&idspin)";
mostCurrent._spintype.Add("Select Type "+_idspin);
RDebugUtils.currentLine=3211285;
 //BA.debugLineNum = 3211285;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_t";
_executeremotequery("SELECT type_id, name_of_type FROM type_of_msme ORDER BY name_of_type ASC","ShowType");
 break; }
case 3: {
RDebugUtils.currentLine=3211287;
 //BA.debugLineNum = 3211287;BA.debugLine="SpinType.add(\"Select Type \"&idspin)";
mostCurrent._spintype.Add("Select Type "+_idspin);
RDebugUtils.currentLine=3211288;
 //BA.debugLineNum = 3211288;BA.debugLine="ExecuteRemoteQuery(\"SELECT level_id, name_of_";
_executeremotequery("SELECT level_id, name_of_level FROM level_of_education ORDER BY name_of_level ASC","ShowType");
 break; }
case 4: {
RDebugUtils.currentLine=3211290;
 //BA.debugLineNum = 3211290;BA.debugLine="SpinType.add(\"Select Type \"&idspin)";
mostCurrent._spintype.Add("Select Type "+_idspin);
RDebugUtils.currentLine=3211291;
 //BA.debugLineNum = 3211291;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_t";
_executeremotequery("SELECT type_id, name_of_type FROM type_of_health_building ORDER BY name_of_type ASC","ShowType");
 break; }
}
;
 break; }
case 2: {
RDebugUtils.currentLine=3211294;
 //BA.debugLineNum = 3211294;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"Worship","Office","Health","Msme","Educational")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: {
RDebugUtils.currentLine=3211296;
 //BA.debugLineNum = 3211296;BA.debugLine="SpinType.add(\"Select Jorong \"&idspin)";
mostCurrent._spintype.Add("Select Jorong "+_idspin);
RDebugUtils.currentLine=3211297;
 //BA.debugLineNum = 3211297;BA.debugLine="ExecuteRemoteQuery(\"SELECT jorong_id, name_of";
_executeremotequery("SELECT jorong_id, name_of_jorong FROM jorong ORDER BY name_of_jorong ASC","ShowJorong");
 break; }
}
;
 break; }
case 3: {
RDebugUtils.currentLine=3211300;
 //BA.debugLineNum = 3211300;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"Worship","Office","Health","Msme","Educational","House")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
RDebugUtils.currentLine=3211302;
 //BA.debugLineNum = 3211302;BA.debugLine="SpinType.add(\"Select Construction\")";
mostCurrent._spintype.Add("Select Construction");
RDebugUtils.currentLine=3211303;
 //BA.debugLineNum = 3211303;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_t";
_executeremotequery("SELECT type_id, name_of_type FROM type_of_construction ORDER BY name_of_type ASC ","ShowConstruction");
 break; }
}
;
 break; }
case 4: {
RDebugUtils.currentLine=3211306;
 //BA.debugLineNum = 3211306;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"Educational")) {
case 0: {
RDebugUtils.currentLine=3211308;
 //BA.debugLineNum = 3211308;BA.debugLine="SpinType.add(\"Select School Type\")";
mostCurrent._spintype.Add("Select School Type");
RDebugUtils.currentLine=3211309;
 //BA.debugLineNum = 3211309;BA.debugLine="SpinType.Add(\"Public School\")";
mostCurrent._spintype.Add("Public School");
RDebugUtils.currentLine=3211310;
 //BA.debugLineNum = 3211310;BA.debugLine="spinnerMapT.Put(\"Public School\",\"1\")";
mostCurrent._spinnermapt.Put((Object)("Public School"),(Object)("1"));
RDebugUtils.currentLine=3211311;
 //BA.debugLineNum = 3211311;BA.debugLine="SpinType.Add(\"Private School\")";
mostCurrent._spintype.Add("Private School");
RDebugUtils.currentLine=3211312;
 //BA.debugLineNum = 3211312;BA.debugLine="spinnerMapT.Put(\"Private School\",\"0\")";
mostCurrent._spinnermapt.Put((Object)("Private School"),(Object)("0"));
 break; }
}
;
 break; }
case 5: {
RDebugUtils.currentLine=3211315;
 //BA.debugLineNum = 3211315;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"House")) {
case 0: {
RDebugUtils.currentLine=3211317;
 //BA.debugLineNum = 3211317;BA.debugLine="SpinType.add(\"Select Tribe\")";
mostCurrent._spintype.Add("Select Tribe");
RDebugUtils.currentLine=3211318;
 //BA.debugLineNum = 3211318;BA.debugLine="ExecuteRemoteQuery (\"SELECT tribe_id, name_of";
_executeremotequery("SELECT tribe_id, name_of_tribe FROM tribe ORDER by name_of_tribe ASC","ShowTribe");
 break; }
}
;
 break; }
case 6: {
RDebugUtils.currentLine=3211321;
 //BA.debugLineNum = 3211321;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"House")) {
case 0: {
RDebugUtils.currentLine=3211323;
 //BA.debugLineNum = 3211323;BA.debugLine="SpinType.add(\"Select Village\")";
mostCurrent._spintype.Add("Select Village");
RDebugUtils.currentLine=3211324;
 //BA.debugLineNum = 3211324;BA.debugLine="ExecuteRemoteQuery (\"SELECT village_id, villag";
_executeremotequery("SELECT village_id, village_name FROM village ORDER by village_name ASC","ShowVillage");
 break; }
}
;
 break; }
case 7: {
RDebugUtils.currentLine=3211327;
 //BA.debugLineNum = 3211327;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"House")) {
case 0: {
RDebugUtils.currentLine=3211329;
 //BA.debugLineNum = 3211329;BA.debugLine="SpinType.add(\"Select Datuk\")";
mostCurrent._spintype.Add("Select Datuk");
RDebugUtils.currentLine=3211330;
 //BA.debugLineNum = 3211330;BA.debugLine="ExecuteRemoteQuery (\"SELECT datuk_id, datuk_n";
_executeremotequery("SELECT datuk_id, datuk_name FROM datuk ORDER by datuk_name ASC","ShowDatuk");
 break; }
}
;
 break; }
case 8: {
RDebugUtils.currentLine=3211333;
 //BA.debugLineNum = 3211333;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"House")) {
case 0: {
RDebugUtils.currentLine=3211335;
 //BA.debugLineNum = 3211335;BA.debugLine="SpinType.add(\"Select Educational Level\")";
mostCurrent._spintype.Add("Select Educational Level");
RDebugUtils.currentLine=3211336;
 //BA.debugLineNum = 3211336;BA.debugLine="ExecuteRemoteQuery(\"SELECT education_id, educ";
_executeremotequery("SELECT education_id, educational_level FROM education ORDER by educational_level ASC","ShowEducation");
 break; }
}
;
 break; }
}
;
RDebugUtils.currentLine=3211339;
 //BA.debugLineNum = 3211339;BA.debugLine="End Sub";
return "";
}
public static String  _executeremotequery(String _query,String _jobname) throws Exception{
RDebugUtils.currentModule="searchbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "executeremotequery"))
	return (String) Debug.delegate(mostCurrent.activityBA, "executeremotequery", new Object[] {_query,_jobname});
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="Job.Initialize(JobName, Me)";
_job._initialize(processBA,_jobname,searchbuilding.getObject());
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
_job._poststring(""+mostCurrent._main._server+"mobile/json.php",_query);
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="ProgressDialogShow(\"load data from server....\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("load data from server...."));
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="End Sub";
return "";
}
public static String  _facilitybtn_click() throws Exception{
RDebugUtils.currentModule="searchbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "facilitybtn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "facilitybtn_click", null);
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub FacilityBtn_Click";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"facility")) {
case 0: {
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"Worship","Office","Health","Educational","Msme")) {
case 0: {
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="ExecuteRemoteQuery(\"SELECT * FROM worship_buil";
_executeremotequery("SELECT * FROM worship_building_facilities ORDER BY name_of_facility ASC","ShowFacility");
 break; }
case 1: {
RDebugUtils.currentLine=4063239;
 //BA.debugLineNum = 4063239;BA.debugLine="ExecuteRemoteQuery(\"SELECT * FROM office_build";
_executeremotequery("SELECT * FROM office_building_facilities ORDER BY name_of_facility ASC","ShowFacility");
 break; }
case 2: {
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="ExecuteRemoteQuery(\"SELECT * FROM health_build";
_executeremotequery("SELECT * FROM health_building_facilities ORDER BY name_of_facility ASC","ShowFacility");
 break; }
case 3: {
RDebugUtils.currentLine=4063243;
 //BA.debugLineNum = 4063243;BA.debugLine="ExecuteRemoteQuery(\"SELECT * FROM educational_";
_executeremotequery("SELECT * FROM educational_building_facilities ORDER BY name_of_facility ASC","ShowFacility");
 break; }
case 4: {
RDebugUtils.currentLine=4063245;
 //BA.debugLineNum = 4063245;BA.debugLine="ExecuteRemoteQuery(\"SELECT * FROM msme_buildin";
_executeremotequery("SELECT * FROM msme_building_facilities ORDER BY name_of_facility ASC","ShowFacility");
 break; }
}
;
 break; }
}
;
RDebugUtils.currentLine=4063248;
 //BA.debugLineNum = 4063248;BA.debugLine="End Sub";
return "";
}
public static void  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
ResumableSub_JobDone rsub = new ResumableSub_JobDone(null,_job);
rsub.resume(processBA, null);
}
public static class ResumableSub_JobDone extends BA.ResumableSub {
public ResumableSub_JobDone(b4a.example.searchbuilding parent,anywheresoftware.b4a.samples.httputils2.httpjob _job) {
this.parent = parent;
this._job = _job;
}
b4a.example.searchbuilding parent;
anywheresoftware.b4a.samples.httputils2.httpjob _job;
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _education_array = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _a = null;
String _namatype = "";
String _idtype = "";
anywheresoftware.b4a.objects.collections.List _village_array = null;
anywheresoftware.b4a.objects.collections.List _datuk_array = null;
anywheresoftware.b4a.objects.collections.List _tribe_array = null;
anywheresoftware.b4a.objects.collections.List _facility_array = null;
anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _cd = null;
anywheresoftware.b4a.objects.ScrollViewWrapper _scrollviewfac = null;
Object _sf = null;
int _arraynow = 0;
int _c = 0;
anywheresoftware.b4a.objects.collections.Map _f = null;
String _contentt = "";
String _contentid = "";
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chk = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl1 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _result = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sc = null;
String _chksub = "";
String _idcheck = "";
String _textcheck = "";
String _stridcheck = "";
String _strtextcheck = "";
anywheresoftware.b4a.objects.collections.List _jorong_array = null;
anywheresoftware.b4a.objects.collections.List _type_array = null;
anywheresoftware.b4a.objects.collections.List _cons_array = null;
anywheresoftware.b4a.objects.collections.List _worship_array = null;
String _number = "";
String _nama = "";
anywheresoftware.b4a.objects.collections.List _office_array = null;
anywheresoftware.b4a.objects.collections.List _health_array = null;
anywheresoftware.b4a.objects.collections.List _msme_array = null;
anywheresoftware.b4a.objects.collections.List _house_array = null;
int step11;
int limit11;
int step25;
int limit25;
int step39;
int limit39;
int step53;
int limit53;
int step75;
int limit75;
int step111;
int limit111;
int step143;
int limit143;
int step157;
int limit157;
int step177;
int limit177;
int step195;
int limit195;
int step223;
int limit223;
int step253;
int limit253;
int step283;
int limit283;
int step313;
int limit313;
int step343;
int limit343;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="searchbuilding";
Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
if (true) return;
    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="If Job.Success Then";
if (true) break;

case 1:
//if
this.state = 151;
if (_job._success) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="Log(\"Response from server :\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server :"+_res);
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="Select Job.JobName";
if (true) break;

case 4:
//select
this.state = 150;
switch (BA.switchObjectToInt(_job._jobname,"ShowEducation","ShowVillage","ShowDatuk","ShowTribe","ShowFacility","ShowJorong","ShowType","ShowConstruction","Worship","Office","Educational","Health","Msme","House")) {
case 0: {
this.state = 6;
if (true) break;
}
case 1: {
this.state = 12;
if (true) break;
}
case 2: {
this.state = 18;
if (true) break;
}
case 3: {
this.state = 24;
if (true) break;
}
case 4: {
this.state = 30;
if (true) break;
}
case 5: {
this.state = 55;
if (true) break;
}
case 6: {
this.state = 61;
if (true) break;
}
case 7: {
this.state = 73;
if (true) break;
}
case 8: {
this.state = 79;
if (true) break;
}
case 9: {
this.state = 91;
if (true) break;
}
case 10: {
this.state = 103;
if (true) break;
}
case 11: {
this.state = 115;
if (true) break;
}
case 12: {
this.state = 127;
if (true) break;
}
case 13: {
this.state = 139;
if (true) break;
}
}
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=3473418;
 //BA.debugLineNum = 3473418;BA.debugLine="Dim education_array As List";
_education_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3473419;
 //BA.debugLineNum = 3473419;BA.debugLine="education_array = parser.NextArray";
_education_array = _parser.NextArray();
RDebugUtils.currentLine=3473420;
 //BA.debugLineNum = 3473420;BA.debugLine="For i=0 To education_array.Size -1";
if (true) break;

case 7:
//for
this.state = 10;
step11 = 1;
limit11 = (int) (_education_array.getSize()-1);
_i = (int) (0) ;
this.state = 152;
if (true) break;

case 152:
//C
this.state = 10;
if ((step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11)) this.state = 9;
if (true) break;

case 153:
//C
this.state = 152;
_i = ((int)(0 + _i + step11)) ;
if (true) break;

case 9:
//C
this.state = 153;
RDebugUtils.currentLine=3473421;
 //BA.debugLineNum = 3473421;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3473422;
 //BA.debugLineNum = 3473422;BA.debugLine="a = education_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_education_array.Get(_i)));
RDebugUtils.currentLine=3473423;
 //BA.debugLineNum = 3473423;BA.debugLine="Dim namatype, idtype As String";
_namatype = "";
_idtype = "";
RDebugUtils.currentLine=3473424;
 //BA.debugLineNum = 3473424;BA.debugLine="namatype= a.Get(\"educational_level\")";
_namatype = BA.ObjectToString(_a.Get((Object)("educational_level")));
RDebugUtils.currentLine=3473425;
 //BA.debugLineNum = 3473425;BA.debugLine="idtype = a.Get(\"education_id\")";
_idtype = BA.ObjectToString(_a.Get((Object)("education_id")));
RDebugUtils.currentLine=3473427;
 //BA.debugLineNum = 3473427;BA.debugLine="SpinType.Add(namatype)";
parent.mostCurrent._spintype.Add(_namatype);
RDebugUtils.currentLine=3473428;
 //BA.debugLineNum = 3473428;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
parent.mostCurrent._spinnermapt.Put((Object)(_namatype),(Object)(_idtype));
RDebugUtils.currentLine=3473429;
 //BA.debugLineNum = 3473429;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_namatype+" "+_idtype);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 150;
;
RDebugUtils.currentLine=3473432;
 //BA.debugLineNum = 3473432;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=3473434;
 //BA.debugLineNum = 3473434;BA.debugLine="Dim village_array As List";
_village_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3473435;
 //BA.debugLineNum = 3473435;BA.debugLine="village_array = parser.NextArray";
_village_array = _parser.NextArray();
RDebugUtils.currentLine=3473436;
 //BA.debugLineNum = 3473436;BA.debugLine="For i=0 To village_array.Size -1";
if (true) break;

case 13:
//for
this.state = 16;
step25 = 1;
limit25 = (int) (_village_array.getSize()-1);
_i = (int) (0) ;
this.state = 154;
if (true) break;

case 154:
//C
this.state = 16;
if ((step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25)) this.state = 15;
if (true) break;

case 155:
//C
this.state = 154;
_i = ((int)(0 + _i + step25)) ;
if (true) break;

case 15:
//C
this.state = 155;
RDebugUtils.currentLine=3473437;
 //BA.debugLineNum = 3473437;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3473438;
 //BA.debugLineNum = 3473438;BA.debugLine="a = village_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_village_array.Get(_i)));
RDebugUtils.currentLine=3473439;
 //BA.debugLineNum = 3473439;BA.debugLine="Dim namatype, idtype As String";
_namatype = "";
_idtype = "";
RDebugUtils.currentLine=3473440;
 //BA.debugLineNum = 3473440;BA.debugLine="namatype= a.Get(\"village_name\")";
_namatype = BA.ObjectToString(_a.Get((Object)("village_name")));
RDebugUtils.currentLine=3473441;
 //BA.debugLineNum = 3473441;BA.debugLine="idtype = a.Get(\"village_id\")";
_idtype = BA.ObjectToString(_a.Get((Object)("village_id")));
RDebugUtils.currentLine=3473443;
 //BA.debugLineNum = 3473443;BA.debugLine="SpinType.Add(namatype)";
parent.mostCurrent._spintype.Add(_namatype);
RDebugUtils.currentLine=3473444;
 //BA.debugLineNum = 3473444;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
parent.mostCurrent._spinnermapt.Put((Object)(_namatype),(Object)(_idtype));
RDebugUtils.currentLine=3473445;
 //BA.debugLineNum = 3473445;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_namatype+" "+_idtype);
 if (true) break;
if (true) break;

case 16:
//C
this.state = 150;
;
RDebugUtils.currentLine=3473448;
 //BA.debugLineNum = 3473448;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=3473450;
 //BA.debugLineNum = 3473450;BA.debugLine="Dim datuk_array As List";
_datuk_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3473451;
 //BA.debugLineNum = 3473451;BA.debugLine="datuk_array = parser.NextArray";
_datuk_array = _parser.NextArray();
RDebugUtils.currentLine=3473452;
 //BA.debugLineNum = 3473452;BA.debugLine="For i=0 To datuk_array.Size -1";
if (true) break;

case 19:
//for
this.state = 22;
step39 = 1;
limit39 = (int) (_datuk_array.getSize()-1);
_i = (int) (0) ;
this.state = 156;
if (true) break;

case 156:
//C
this.state = 22;
if ((step39 > 0 && _i <= limit39) || (step39 < 0 && _i >= limit39)) this.state = 21;
if (true) break;

case 157:
//C
this.state = 156;
_i = ((int)(0 + _i + step39)) ;
if (true) break;

case 21:
//C
this.state = 157;
RDebugUtils.currentLine=3473453;
 //BA.debugLineNum = 3473453;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3473454;
 //BA.debugLineNum = 3473454;BA.debugLine="a = datuk_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_datuk_array.Get(_i)));
RDebugUtils.currentLine=3473455;
 //BA.debugLineNum = 3473455;BA.debugLine="Dim namatype, idtype As String";
_namatype = "";
_idtype = "";
RDebugUtils.currentLine=3473456;
 //BA.debugLineNum = 3473456;BA.debugLine="namatype= a.Get(\"datuk_name\")";
_namatype = BA.ObjectToString(_a.Get((Object)("datuk_name")));
RDebugUtils.currentLine=3473457;
 //BA.debugLineNum = 3473457;BA.debugLine="idtype = a.Get(\"datuk_id\")";
_idtype = BA.ObjectToString(_a.Get((Object)("datuk_id")));
RDebugUtils.currentLine=3473459;
 //BA.debugLineNum = 3473459;BA.debugLine="SpinType.Add(namatype)";
parent.mostCurrent._spintype.Add(_namatype);
RDebugUtils.currentLine=3473460;
 //BA.debugLineNum = 3473460;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
parent.mostCurrent._spinnermapt.Put((Object)(_namatype),(Object)(_idtype));
RDebugUtils.currentLine=3473461;
 //BA.debugLineNum = 3473461;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_namatype+" "+_idtype);
 if (true) break;
if (true) break;

case 22:
//C
this.state = 150;
;
RDebugUtils.currentLine=3473463;
 //BA.debugLineNum = 3473463;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=3473465;
 //BA.debugLineNum = 3473465;BA.debugLine="Dim tribe_array As List";
_tribe_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3473466;
 //BA.debugLineNum = 3473466;BA.debugLine="tribe_array = parser.NextArray";
_tribe_array = _parser.NextArray();
RDebugUtils.currentLine=3473467;
 //BA.debugLineNum = 3473467;BA.debugLine="For i=0 To tribe_array.Size -1";
if (true) break;

case 25:
//for
this.state = 28;
step53 = 1;
limit53 = (int) (_tribe_array.getSize()-1);
_i = (int) (0) ;
this.state = 158;
if (true) break;

case 158:
//C
this.state = 28;
if ((step53 > 0 && _i <= limit53) || (step53 < 0 && _i >= limit53)) this.state = 27;
if (true) break;

case 159:
//C
this.state = 158;
_i = ((int)(0 + _i + step53)) ;
if (true) break;

case 27:
//C
this.state = 159;
RDebugUtils.currentLine=3473468;
 //BA.debugLineNum = 3473468;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3473469;
 //BA.debugLineNum = 3473469;BA.debugLine="a = tribe_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_tribe_array.Get(_i)));
RDebugUtils.currentLine=3473470;
 //BA.debugLineNum = 3473470;BA.debugLine="Dim namatype, idtype As String";
_namatype = "";
_idtype = "";
RDebugUtils.currentLine=3473471;
 //BA.debugLineNum = 3473471;BA.debugLine="namatype= a.Get(\"name_of_tribe\")";
_namatype = BA.ObjectToString(_a.Get((Object)("name_of_tribe")));
RDebugUtils.currentLine=3473472;
 //BA.debugLineNum = 3473472;BA.debugLine="idtype = a.Get(\"tribe_id\")";
_idtype = BA.ObjectToString(_a.Get((Object)("tribe_id")));
RDebugUtils.currentLine=3473474;
 //BA.debugLineNum = 3473474;BA.debugLine="SpinType.Add(namatype)";
parent.mostCurrent._spintype.Add(_namatype);
RDebugUtils.currentLine=3473475;
 //BA.debugLineNum = 3473475;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
parent.mostCurrent._spinnermapt.Put((Object)(_namatype),(Object)(_idtype));
RDebugUtils.currentLine=3473476;
 //BA.debugLineNum = 3473476;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_namatype+" "+_idtype);
 if (true) break;
if (true) break;

case 28:
//C
this.state = 150;
;
RDebugUtils.currentLine=3473478;
 //BA.debugLineNum = 3473478;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=3473480;
 //BA.debugLineNum = 3473480;BA.debugLine="Dim facility_array As List";
_facility_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3473481;
 //BA.debugLineNum = 3473481;BA.debugLine="facility_array = parser.NextArray";
_facility_array = _parser.NextArray();
RDebugUtils.currentLine=3473483;
 //BA.debugLineNum = 3473483;BA.debugLine="Dim cd As CustomLayoutDialog";
_cd = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog();
RDebugUtils.currentLine=3473484;
 //BA.debugLineNum = 3473484;BA.debugLine="Dim ScrollViewFac As ScrollView";
_scrollviewfac = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=3473486;
 //BA.debugLineNum = 3473486;BA.debugLine="lstChecks.Initialize";
parent.mostCurrent._lstchecks.Initialize();
RDebugUtils.currentLine=3473487;
 //BA.debugLineNum = 3473487;BA.debugLine="ScrollViewFac.Initialize(50%y)";
_scrollviewfac.Initialize(mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA));
RDebugUtils.currentLine=3473489;
 //BA.debugLineNum = 3473489;BA.debugLine="Dim sf As Object";
_sf = new Object();
RDebugUtils.currentLine=3473490;
 //BA.debugLineNum = 3473490;BA.debugLine="sf = cd.ShowAsync(\"Choose facility\", \"OK\", \"Ca";
_sf = _cd.ShowAsync("Choose facility","OK","Cancel","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3473492;
 //BA.debugLineNum = 3473492;BA.debugLine="Dim arraynow As Int";
_arraynow = 0;
RDebugUtils.currentLine=3473493;
 //BA.debugLineNum = 3473493;BA.debugLine="arraynow = facility_array.Size";
_arraynow = _facility_array.getSize();
RDebugUtils.currentLine=3473494;
 //BA.debugLineNum = 3473494;BA.debugLine="For c=0 To arraynow-1";
if (true) break;

case 31:
//for
this.state = 34;
step75 = 1;
limit75 = (int) (_arraynow-1);
_c = (int) (0) ;
this.state = 160;
if (true) break;

case 160:
//C
this.state = 34;
if ((step75 > 0 && _c <= limit75) || (step75 < 0 && _c >= limit75)) this.state = 33;
if (true) break;

case 161:
//C
this.state = 160;
_c = ((int)(0 + _c + step75)) ;
if (true) break;

case 33:
//C
this.state = 161;
RDebugUtils.currentLine=3473495;
 //BA.debugLineNum = 3473495;BA.debugLine="Dim f As Map";
_f = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3473496;
 //BA.debugLineNum = 3473496;BA.debugLine="f = facility_array.Get(c)";
_f.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_facility_array.Get(_c)));
RDebugUtils.currentLine=3473498;
 //BA.debugLineNum = 3473498;BA.debugLine="Dim Contentt As String";
_contentt = "";
RDebugUtils.currentLine=3473499;
 //BA.debugLineNum = 3473499;BA.debugLine="Dim Contentid As String";
_contentid = "";
RDebugUtils.currentLine=3473500;
 //BA.debugLineNum = 3473500;BA.debugLine="Contentid = f.Get(\"facility_id\")";
_contentid = BA.ObjectToString(_f.Get((Object)("facility_id")));
RDebugUtils.currentLine=3473501;
 //BA.debugLineNum = 3473501;BA.debugLine="Contentt = f.Get(\"name_of_facility\")";
_contentt = BA.ObjectToString(_f.Get((Object)("name_of_facility")));
RDebugUtils.currentLine=3473502;
 //BA.debugLineNum = 3473502;BA.debugLine="Dim chk As CheckBox";
_chk = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=3473503;
 //BA.debugLineNum = 3473503;BA.debugLine="chk.Initialize(\"\")";
_chk.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=3473504;
 //BA.debugLineNum = 3473504;BA.debugLine="chk.Text = Contentid&Contentt";
_chk.setText(BA.ObjectToCharSequence(_contentid+_contentt));
RDebugUtils.currentLine=3473505;
 //BA.debugLineNum = 3473505;BA.debugLine="chk.TextColor= Colors.Transparent";
_chk.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=3473506;
 //BA.debugLineNum = 3473506;BA.debugLine="Dim lbl1 As Label";
_lbl1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3473507;
 //BA.debugLineNum = 3473507;BA.debugLine="lbl1.Initialize(\"\")";
_lbl1.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=3473508;
 //BA.debugLineNum = 3473508;BA.debugLine="lbl1.Text = Contentt";
_lbl1.setText(BA.ObjectToCharSequence(_contentt));
RDebugUtils.currentLine=3473509;
 //BA.debugLineNum = 3473509;BA.debugLine="lbl1.TextColor = Colors.Black";
_lbl1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=3473510;
 //BA.debugLineNum = 3473510;BA.debugLine="lbl1.Gravity = Gravity.CENTER_VERTICAL";
_lbl1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=3473511;
 //BA.debugLineNum = 3473511;BA.debugLine="lstChecks.Add(chk)";
parent.mostCurrent._lstchecks.Add((Object)(_chk.getObject()));
RDebugUtils.currentLine=3473512;
 //BA.debugLineNum = 3473512;BA.debugLine="ScrollViewFac.Panel.AddView(chk, 0, 5%y * (c";
_scrollviewfac.getPanel().AddView((android.view.View)(_chk.getObject()),(int) (0),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA)*(_c)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=3473513;
 //BA.debugLineNum = 3473513;BA.debugLine="ScrollViewFac.Panel.AddView(lbl1, 10%x, 5%y";
_scrollviewfac.getPanel().AddView((android.view.View)(_lbl1.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA)*(_c)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=3473514;
 //BA.debugLineNum = 3473514;BA.debugLine="Log(\"fasilitas :\"&Contentt&\" ID:\"&Contentid&\"";
anywheresoftware.b4a.keywords.Common.Log("fasilitas :"+_contentt+" ID:"+_contentid+"");
 if (true) break;
if (true) break;

case 34:
//C
this.state = 35;
;
RDebugUtils.currentLine=3473516;
 //BA.debugLineNum = 3473516;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=3473517;
 //BA.debugLineNum = 3473517;BA.debugLine="cd.SetSize(100%x, 80%y)";
_cd.SetSize(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (80),mostCurrent.activityBA));
RDebugUtils.currentLine=3473518;
 //BA.debugLineNum = 3473518;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
anywheresoftware.b4a.keywords.Common.WaitFor("dialog_ready", processBA, this, _sf);
this.state = 162;
return;
case 162:
//C
this.state = 35;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[0];
;
RDebugUtils.currentLine=3473519;
 //BA.debugLineNum = 3473519;BA.debugLine="pnl.AddView(ScrollViewFac,0,5%y,100%x,50%y)";
_pnl.AddView((android.view.View)(_scrollviewfac.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA));
RDebugUtils.currentLine=3473520;
 //BA.debugLineNum = 3473520;BA.debugLine="ScrollViewFac.Panel.Height = lstChecks.Size *";
_scrollviewfac.getPanel().setHeight((int) (parent.mostCurrent._lstchecks.getSize()*anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA)));
RDebugUtils.currentLine=3473521;
 //BA.debugLineNum = 3473521;BA.debugLine="Log(lstChecks.Size)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(parent.mostCurrent._lstchecks.getSize()));
RDebugUtils.currentLine=3473523;
 //BA.debugLineNum = 3473523;BA.debugLine="pnl.Color=Colors.White";
_pnl.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=3473524;
 //BA.debugLineNum = 3473524;BA.debugLine="ScrollViewFac.Color= Colors.White";
_scrollviewfac.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=3473527;
 //BA.debugLineNum = 3473527;BA.debugLine="Wait For (sf) Dialog_Result(Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("dialog_result", processBA, this, _sf);
this.state = 163;
return;
case 163:
//C
this.state = 35;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=3473528;
 //BA.debugLineNum = 3473528;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 35:
//if
this.state = 53;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 37;
}else {
this.state = 52;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=3473529;
 //BA.debugLineNum = 3473529;BA.debugLine="Log(\"BERHASIL DOOONG\")";
anywheresoftware.b4a.keywords.Common.Log("BERHASIL DOOONG");
RDebugUtils.currentLine=3473530;
 //BA.debugLineNum = 3473530;BA.debugLine="Dim sb,sc As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_sc = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=3473531;
 //BA.debugLineNum = 3473531;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=3473532;
 //BA.debugLineNum = 3473532;BA.debugLine="sc.Initialize";
_sc.Initialize();
RDebugUtils.currentLine=3473533;
 //BA.debugLineNum = 3473533;BA.debugLine="count = 0";
parent._count = (int) (0);
RDebugUtils.currentLine=3473534;
 //BA.debugLineNum = 3473534;BA.debugLine="For i = 0 To lstChecks.Size - 1";
if (true) break;

case 38:
//for
this.state = 50;
step111 = 1;
limit111 = (int) (parent.mostCurrent._lstchecks.getSize()-1);
_i = (int) (0) ;
this.state = 164;
if (true) break;

case 164:
//C
this.state = 50;
if ((step111 > 0 && _i <= limit111) || (step111 < 0 && _i >= limit111)) this.state = 40;
if (true) break;

case 165:
//C
this.state = 164;
_i = ((int)(0 + _i + step111)) ;
if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=3473535;
 //BA.debugLineNum = 3473535;BA.debugLine="Dim chk As CheckBox";
_chk = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=3473536;
 //BA.debugLineNum = 3473536;BA.debugLine="chk = lstChecks.Get(i)";
_chk.setObject((android.widget.CheckBox)(parent.mostCurrent._lstchecks.Get(_i)));
RDebugUtils.currentLine=3473537;
 //BA.debugLineNum = 3473537;BA.debugLine="Dim chkSub As String";
_chksub = "";
RDebugUtils.currentLine=3473538;
 //BA.debugLineNum = 3473538;BA.debugLine="chkSub = chk.Text";
_chksub = _chk.getText();
RDebugUtils.currentLine=3473539;
 //BA.debugLineNum = 3473539;BA.debugLine="Dim idCheck,textCheck As String";
_idcheck = "";
_textcheck = "";
RDebugUtils.currentLine=3473540;
 //BA.debugLineNum = 3473540;BA.debugLine="If Contentid.Length == 1 Then";
if (true) break;

case 41:
//if
this.state = 46;
if (_contentid.length()==1) { 
this.state = 43;
}else {
this.state = 45;
}if (true) break;

case 43:
//C
this.state = 46;
RDebugUtils.currentLine=3473541;
 //BA.debugLineNum = 3473541;BA.debugLine="idCheck = chkSub.SubString2(0,1)";
_idcheck = _chksub.substring((int) (0),(int) (1));
RDebugUtils.currentLine=3473542;
 //BA.debugLineNum = 3473542;BA.debugLine="textCheck = chkSub.SubString(1)";
_textcheck = _chksub.substring((int) (1));
 if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=3473544;
 //BA.debugLineNum = 3473544;BA.debugLine="idCheck = chkSub.SubString2(0,2)";
_idcheck = _chksub.substring((int) (0),(int) (2));
RDebugUtils.currentLine=3473545;
 //BA.debugLineNum = 3473545;BA.debugLine="textCheck = chkSub.SubString(2)";
_textcheck = _chksub.substring((int) (2));
 if (true) break;
;
RDebugUtils.currentLine=3473548;
 //BA.debugLineNum = 3473548;BA.debugLine="If chk.Checked Then";

case 46:
//if
this.state = 49;
if (_chk.getChecked()) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=3473549;
 //BA.debugLineNum = 3473549;BA.debugLine="sb.Append(idCheck&\",\")";
_sb.Append(_idcheck+",");
RDebugUtils.currentLine=3473550;
 //BA.debugLineNum = 3473550;BA.debugLine="sc.Append(textCheck&\",\")";
_sc.Append(_textcheck+",");
RDebugUtils.currentLine=3473551;
 //BA.debugLineNum = 3473551;BA.debugLine="count = count + 1";
parent._count = (int) (parent._count+1);
 if (true) break;

case 49:
//C
this.state = 165;
;
 if (true) break;
if (true) break;

case 50:
//C
this.state = 53;
;
RDebugUtils.currentLine=3473555;
 //BA.debugLineNum = 3473555;BA.debugLine="Dim stridCheck,strtextCheck As String";
_stridcheck = "";
_strtextcheck = "";
RDebugUtils.currentLine=3473556;
 //BA.debugLineNum = 3473556;BA.debugLine="stridCheck = sb.ToString";
_stridcheck = _sb.ToString();
RDebugUtils.currentLine=3473557;
 //BA.debugLineNum = 3473557;BA.debugLine="strtextCheck = sc.ToString";
_strtextcheck = _sc.ToString();
RDebugUtils.currentLine=3473559;
 //BA.debugLineNum = 3473559;BA.debugLine="idCheckSub= stridCheck.SubString2(0,stridChec";
parent.mostCurrent._idchecksub = _stridcheck.substring((int) (0),(int) (_stridcheck.length()-1));
RDebugUtils.currentLine=3473560;
 //BA.debugLineNum = 3473560;BA.debugLine="textCheckSub= strtextCheck.SubString2(0,strte";
parent.mostCurrent._textchecksub = _strtextcheck.substring((int) (0),(int) (_strtextcheck.length()-1));
RDebugUtils.currentLine=3473561;
 //BA.debugLineNum = 3473561;BA.debugLine="Log(\"length id: \"&idCheckSub.Length&\" | \"& id";
anywheresoftware.b4a.keywords.Common.Log("length id: "+BA.NumberToString(parent.mostCurrent._idchecksub.length())+" | "+parent.mostCurrent._idchecksub);
RDebugUtils.currentLine=3473562;
 //BA.debugLineNum = 3473562;BA.debugLine="Log(\"length text: \"&textCheckSub.Length&\" | \"";
anywheresoftware.b4a.keywords.Common.Log("length text: "+BA.NumberToString(parent.mostCurrent._textchecksub.length())+" | "+parent.mostCurrent._textchecksub);
 if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=3473564;
 //BA.debugLineNum = 3473564;BA.debugLine="Log(\"CANCEL DONG\")";
anywheresoftware.b4a.keywords.Common.Log("CANCEL DONG");
 if (true) break;

case 53:
//C
this.state = 150;
;
 if (true) break;

case 55:
//C
this.state = 56;
RDebugUtils.currentLine=3473577;
 //BA.debugLineNum = 3473577;BA.debugLine="Dim jorong_array As List";
_jorong_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3473578;
 //BA.debugLineNum = 3473578;BA.debugLine="jorong_array = parser.NextArray";
_jorong_array = _parser.NextArray();
RDebugUtils.currentLine=3473579;
 //BA.debugLineNum = 3473579;BA.debugLine="For i=0 To jorong_array.Size -1";
if (true) break;

case 56:
//for
this.state = 59;
step143 = 1;
limit143 = (int) (_jorong_array.getSize()-1);
_i = (int) (0) ;
this.state = 166;
if (true) break;

case 166:
//C
this.state = 59;
if ((step143 > 0 && _i <= limit143) || (step143 < 0 && _i >= limit143)) this.state = 58;
if (true) break;

case 167:
//C
this.state = 166;
_i = ((int)(0 + _i + step143)) ;
if (true) break;

case 58:
//C
this.state = 167;
RDebugUtils.currentLine=3473580;
 //BA.debugLineNum = 3473580;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3473581;
 //BA.debugLineNum = 3473581;BA.debugLine="a = jorong_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_jorong_array.Get(_i)));
RDebugUtils.currentLine=3473582;
 //BA.debugLineNum = 3473582;BA.debugLine="Dim namatype, idtype As String";
_namatype = "";
_idtype = "";
RDebugUtils.currentLine=3473583;
 //BA.debugLineNum = 3473583;BA.debugLine="namatype= a.Get(\"name_of_jorong\")";
_namatype = BA.ObjectToString(_a.Get((Object)("name_of_jorong")));
RDebugUtils.currentLine=3473584;
 //BA.debugLineNum = 3473584;BA.debugLine="idtype = a.Get(\"jorong_id\")";
_idtype = BA.ObjectToString(_a.Get((Object)("jorong_id")));
RDebugUtils.currentLine=3473586;
 //BA.debugLineNum = 3473586;BA.debugLine="SpinType.Add(namatype)";
parent.mostCurrent._spintype.Add(_namatype);
RDebugUtils.currentLine=3473587;
 //BA.debugLineNum = 3473587;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
parent.mostCurrent._spinnermapt.Put((Object)(_namatype),(Object)(_idtype));
RDebugUtils.currentLine=3473588;
 //BA.debugLineNum = 3473588;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_namatype+" "+_idtype);
 if (true) break;
if (true) break;

case 59:
//C
this.state = 150;
;
RDebugUtils.currentLine=3473590;
 //BA.debugLineNum = 3473590;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 61:
//C
this.state = 62;
RDebugUtils.currentLine=3473592;
 //BA.debugLineNum = 3473592;BA.debugLine="Dim type_array As List";
_type_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3473593;
 //BA.debugLineNum = 3473593;BA.debugLine="type_array = parser.NextArray";
_type_array = _parser.NextArray();
RDebugUtils.currentLine=3473594;
 //BA.debugLineNum = 3473594;BA.debugLine="For i=0 To type_array.Size -1";
if (true) break;

case 62:
//for
this.state = 71;
step157 = 1;
limit157 = (int) (_type_array.getSize()-1);
_i = (int) (0) ;
this.state = 168;
if (true) break;

case 168:
//C
this.state = 71;
if ((step157 > 0 && _i <= limit157) || (step157 < 0 && _i >= limit157)) this.state = 64;
if (true) break;

case 169:
//C
this.state = 168;
_i = ((int)(0 + _i + step157)) ;
if (true) break;

case 64:
//C
this.state = 65;
RDebugUtils.currentLine=3473595;
 //BA.debugLineNum = 3473595;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3473596;
 //BA.debugLineNum = 3473596;BA.debugLine="a = type_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_type_array.Get(_i)));
RDebugUtils.currentLine=3473597;
 //BA.debugLineNum = 3473597;BA.debugLine="Dim namatype, idtype As String";
_namatype = "";
_idtype = "";
RDebugUtils.currentLine=3473598;
 //BA.debugLineNum = 3473598;BA.debugLine="Select idspin";
if (true) break;

case 65:
//select
this.state = 70;
switch (BA.switchObjectToInt(parent._idspin,"Worship","Office","Msme","Health","Educational")) {
case 0: 
case 1: 
case 2: 
case 3: {
this.state = 67;
if (true) break;
}
case 4: {
this.state = 69;
if (true) break;
}
}
if (true) break;

case 67:
//C
this.state = 70;
RDebugUtils.currentLine=3473600;
 //BA.debugLineNum = 3473600;BA.debugLine="namatype= a.Get(\"name_of_type\")";
_namatype = BA.ObjectToString(_a.Get((Object)("name_of_type")));
RDebugUtils.currentLine=3473601;
 //BA.debugLineNum = 3473601;BA.debugLine="idtype = a.Get(\"type_id\")";
_idtype = BA.ObjectToString(_a.Get((Object)("type_id")));
 if (true) break;

case 69:
//C
this.state = 70;
RDebugUtils.currentLine=3473603;
 //BA.debugLineNum = 3473603;BA.debugLine="namatype= a.Get(\"name_of_level\")";
_namatype = BA.ObjectToString(_a.Get((Object)("name_of_level")));
RDebugUtils.currentLine=3473604;
 //BA.debugLineNum = 3473604;BA.debugLine="idtype = a.Get(\"level_id\")";
_idtype = BA.ObjectToString(_a.Get((Object)("level_id")));
 if (true) break;

case 70:
//C
this.state = 169;
;
RDebugUtils.currentLine=3473607;
 //BA.debugLineNum = 3473607;BA.debugLine="SpinType.Add(namatype)";
parent.mostCurrent._spintype.Add(_namatype);
RDebugUtils.currentLine=3473608;
 //BA.debugLineNum = 3473608;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
parent.mostCurrent._spinnermapt.Put((Object)(_namatype),(Object)(_idtype));
RDebugUtils.currentLine=3473609;
 //BA.debugLineNum = 3473609;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_namatype+" "+_idtype);
 if (true) break;
if (true) break;

case 71:
//C
this.state = 150;
;
RDebugUtils.currentLine=3473611;
 //BA.debugLineNum = 3473611;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=3473613;
 //BA.debugLineNum = 3473613;BA.debugLine="Dim cons_array As List";
_cons_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3473614;
 //BA.debugLineNum = 3473614;BA.debugLine="cons_array = parser.NextArray";
_cons_array = _parser.NextArray();
RDebugUtils.currentLine=3473615;
 //BA.debugLineNum = 3473615;BA.debugLine="For i=0 To cons_array.Size -1";
if (true) break;

case 74:
//for
this.state = 77;
step177 = 1;
limit177 = (int) (_cons_array.getSize()-1);
_i = (int) (0) ;
this.state = 170;
if (true) break;

case 170:
//C
this.state = 77;
if ((step177 > 0 && _i <= limit177) || (step177 < 0 && _i >= limit177)) this.state = 76;
if (true) break;

case 171:
//C
this.state = 170;
_i = ((int)(0 + _i + step177)) ;
if (true) break;

case 76:
//C
this.state = 171;
RDebugUtils.currentLine=3473616;
 //BA.debugLineNum = 3473616;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3473617;
 //BA.debugLineNum = 3473617;BA.debugLine="a = cons_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_cons_array.Get(_i)));
RDebugUtils.currentLine=3473618;
 //BA.debugLineNum = 3473618;BA.debugLine="Dim namatype, idtype As String";
_namatype = "";
_idtype = "";
RDebugUtils.currentLine=3473619;
 //BA.debugLineNum = 3473619;BA.debugLine="namatype= a.Get(\"name_of_type\")";
_namatype = BA.ObjectToString(_a.Get((Object)("name_of_type")));
RDebugUtils.currentLine=3473620;
 //BA.debugLineNum = 3473620;BA.debugLine="idtype = a.Get(\"type_id\")";
_idtype = BA.ObjectToString(_a.Get((Object)("type_id")));
RDebugUtils.currentLine=3473622;
 //BA.debugLineNum = 3473622;BA.debugLine="SpinType.Add(namatype)";
parent.mostCurrent._spintype.Add(_namatype);
RDebugUtils.currentLine=3473623;
 //BA.debugLineNum = 3473623;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
parent.mostCurrent._spinnermapt.Put((Object)(_namatype),(Object)(_idtype));
RDebugUtils.currentLine=3473624;
 //BA.debugLineNum = 3473624;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_namatype+" "+_idtype);
 if (true) break;
if (true) break;

case 77:
//C
this.state = 150;
;
RDebugUtils.currentLine=3473626;
 //BA.debugLineNum = 3473626;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 79:
//C
this.state = 80;
RDebugUtils.currentLine=3473628;
 //BA.debugLineNum = 3473628;BA.debugLine="Dim worship_array As List";
_worship_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3473629;
 //BA.debugLineNum = 3473629;BA.debugLine="worship_array = parser.NextArray";
_worship_array = _parser.NextArray();
RDebugUtils.currentLine=3473630;
 //BA.debugLineNum = 3473630;BA.debugLine="If worship_array.Size-1 < 0 Then";
if (true) break;

case 80:
//if
this.state = 89;
if (_worship_array.getSize()-1<0) { 
this.state = 82;
}else {
this.state = 84;
}if (true) break;

case 82:
//C
this.state = 89;
RDebugUtils.currentLine=3473631;
 //BA.debugLineNum = 3473631;BA.debugLine="Msgbox(\"Not Found\",\"Warning\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Not Found"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
RDebugUtils.currentLine=3473632;
 //BA.debugLineNum = 3473632;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=3473634;
 //BA.debugLineNum = 3473634;BA.debugLine="For i=0 To worship_array.Size - 1";
if (true) break;

case 85:
//for
this.state = 88;
step195 = 1;
limit195 = (int) (_worship_array.getSize()-1);
_i = (int) (0) ;
this.state = 172;
if (true) break;

case 172:
//C
this.state = 88;
if ((step195 > 0 && _i <= limit195) || (step195 < 0 && _i >= limit195)) this.state = 87;
if (true) break;

case 173:
//C
this.state = 172;
_i = ((int)(0 + _i + step195)) ;
if (true) break;

case 87:
//C
this.state = 173;
RDebugUtils.currentLine=3473635;
 //BA.debugLineNum = 3473635;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3473636;
 //BA.debugLineNum = 3473636;BA.debugLine="a = worship_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_worship_array.Get(_i)));
RDebugUtils.currentLine=3473638;
 //BA.debugLineNum = 3473638;BA.debugLine="lat = a.Get(\"latitude\")";
parent._lat = BA.ObjectToString(_a.Get((Object)("latitude")));
RDebugUtils.currentLine=3473639;
 //BA.debugLineNum = 3473639;BA.debugLine="lng = a.Get(\"longitude\")";
parent._lng = BA.ObjectToString(_a.Get((Object)("longitude")));
RDebugUtils.currentLine=3473640;
 //BA.debugLineNum = 3473640;BA.debugLine="Log(lat)";
anywheresoftware.b4a.keywords.Common.Log(parent._lat);
RDebugUtils.currentLine=3473641;
 //BA.debugLineNum = 3473641;BA.debugLine="Log(lng)";
anywheresoftware.b4a.keywords.Common.Log(parent._lng);
RDebugUtils.currentLine=3473642;
 //BA.debugLineNum = 3473642;BA.debugLine="Dim number As String";
_number = "";
RDebugUtils.currentLine=3473643;
 //BA.debugLineNum = 3473643;BA.debugLine="Dim nama As String";
_nama = "";
RDebugUtils.currentLine=3473644;
 //BA.debugLineNum = 3473644;BA.debugLine="number = a.Get(\"worship_building_id\")";
_number = BA.ObjectToString(_a.Get((Object)("worship_building_id")));
RDebugUtils.currentLine=3473645;
 //BA.debugLineNum = 3473645;BA.debugLine="nama = a.Get(\"name_of_worship_building\")";
_nama = BA.ObjectToString(_a.Get((Object)("name_of_worship_building")));
RDebugUtils.currentLine=3473646;
 //BA.debugLineNum = 3473646;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, number";
parent.mostCurrent._clv2._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(parent.mostCurrent._clv2._asview().getWidth(),_number,_nama).getObject())),(Object)(""));
 if (true) break;
if (true) break;

case 88:
//C
this.state = 89;
;
RDebugUtils.currentLine=3473650;
 //BA.debugLineNum = 3473650;BA.debugLine="CLV2.sv.Height = (PanelBuildingList.Height+0.";
parent.mostCurrent._clv2._sv.setHeight((int) ((parent.mostCurrent._panelbuildinglist.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0.5),mostCurrent.activityBA))*_worship_array.getSize()));
RDebugUtils.currentLine=3473651;
 //BA.debugLineNum = 3473651;BA.debugLine="ScrollView1.Top = WebViewTest.Height + WebVie";
parent.mostCurrent._scrollview1.setTop((int) (parent.mostCurrent._webviewtest.getHeight()+parent.mostCurrent._webviewtest.getTop()+parent.mostCurrent._panelsearch.getHeight()));
RDebugUtils.currentLine=3473652;
 //BA.debugLineNum = 3473652;BA.debugLine="ScrollView1.Height = 100%y - (ScrollView1.Top";
parent.mostCurrent._scrollview1.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-(parent.mostCurrent._scrollview1.getTop()+parent.mostCurrent._paneltoolbar.getHeight())));
RDebugUtils.currentLine=3473653;
 //BA.debugLineNum = 3473653;BA.debugLine="CLV2.AsView.Height = CLV2.sv.Height";
parent.mostCurrent._clv2._asview().setHeight(parent.mostCurrent._clv2._sv.getHeight());
RDebugUtils.currentLine=3473654;
 //BA.debugLineNum = 3473654;BA.debugLine="ScrollView1.Panel.Height = CLV2.AsView.Height";
parent.mostCurrent._scrollview1.getPanel().setHeight(parent.mostCurrent._clv2._asview().getHeight());
RDebugUtils.currentLine=3473655;
 //BA.debugLineNum = 3473655;BA.debugLine="Log(nama)";
anywheresoftware.b4a.keywords.Common.Log(_nama);
RDebugUtils.currentLine=3473656;
 //BA.debugLineNum = 3473656;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 89:
//C
this.state = 150;
;
 if (true) break;

case 91:
//C
this.state = 92;
RDebugUtils.currentLine=3473659;
 //BA.debugLineNum = 3473659;BA.debugLine="Dim office_array As List";
_office_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3473660;
 //BA.debugLineNum = 3473660;BA.debugLine="office_array = parser.NextArray";
_office_array = _parser.NextArray();
RDebugUtils.currentLine=3473661;
 //BA.debugLineNum = 3473661;BA.debugLine="If office_array.Size -1 < 0 Then";
if (true) break;

case 92:
//if
this.state = 101;
if (_office_array.getSize()-1<0) { 
this.state = 94;
}else {
this.state = 96;
}if (true) break;

case 94:
//C
this.state = 101;
RDebugUtils.currentLine=3473662;
 //BA.debugLineNum = 3473662;BA.debugLine="Msgbox(\"Not Found\",\"Warning\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Not Found"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
RDebugUtils.currentLine=3473663;
 //BA.debugLineNum = 3473663;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 96:
//C
this.state = 97;
RDebugUtils.currentLine=3473665;
 //BA.debugLineNum = 3473665;BA.debugLine="For i=0 To office_array.Size - 1";
if (true) break;

case 97:
//for
this.state = 100;
step223 = 1;
limit223 = (int) (_office_array.getSize()-1);
_i = (int) (0) ;
this.state = 174;
if (true) break;

case 174:
//C
this.state = 100;
if ((step223 > 0 && _i <= limit223) || (step223 < 0 && _i >= limit223)) this.state = 99;
if (true) break;

case 175:
//C
this.state = 174;
_i = ((int)(0 + _i + step223)) ;
if (true) break;

case 99:
//C
this.state = 175;
RDebugUtils.currentLine=3473666;
 //BA.debugLineNum = 3473666;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3473667;
 //BA.debugLineNum = 3473667;BA.debugLine="a = office_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_office_array.Get(_i)));
RDebugUtils.currentLine=3473669;
 //BA.debugLineNum = 3473669;BA.debugLine="lat = a.Get(\"latitude\")";
parent._lat = BA.ObjectToString(_a.Get((Object)("latitude")));
RDebugUtils.currentLine=3473670;
 //BA.debugLineNum = 3473670;BA.debugLine="lng = a.Get(\"longitude\")";
parent._lng = BA.ObjectToString(_a.Get((Object)("longitude")));
RDebugUtils.currentLine=3473671;
 //BA.debugLineNum = 3473671;BA.debugLine="Log(lat)";
anywheresoftware.b4a.keywords.Common.Log(parent._lat);
RDebugUtils.currentLine=3473672;
 //BA.debugLineNum = 3473672;BA.debugLine="Log(lng)";
anywheresoftware.b4a.keywords.Common.Log(parent._lng);
RDebugUtils.currentLine=3473673;
 //BA.debugLineNum = 3473673;BA.debugLine="Dim number As String";
_number = "";
RDebugUtils.currentLine=3473674;
 //BA.debugLineNum = 3473674;BA.debugLine="Dim nama As String";
_nama = "";
RDebugUtils.currentLine=3473675;
 //BA.debugLineNum = 3473675;BA.debugLine="number = a.Get(\"office_building_id\")";
_number = BA.ObjectToString(_a.Get((Object)("office_building_id")));
RDebugUtils.currentLine=3473676;
 //BA.debugLineNum = 3473676;BA.debugLine="nama = a.Get(\"name_of_office_building\")";
_nama = BA.ObjectToString(_a.Get((Object)("name_of_office_building")));
RDebugUtils.currentLine=3473677;
 //BA.debugLineNum = 3473677;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, numbe";
parent.mostCurrent._clv2._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(parent.mostCurrent._clv2._asview().getWidth(),_number,_nama).getObject())),(Object)(""));
RDebugUtils.currentLine=3473678;
 //BA.debugLineNum = 3473678;BA.debugLine="CLV2.AsView.Height = PanelListItem.Height*(i";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._panellistitem.getHeight()*(_i+1)));
 if (true) break;
if (true) break;

case 100:
//C
this.state = 101;
;
RDebugUtils.currentLine=3473681;
 //BA.debugLineNum = 3473681;BA.debugLine="CLV2.AsView.Height = PanelBuildingList.Height";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._panelbuildinglist.getHeight()*_office_array.getSize()));
RDebugUtils.currentLine=3473682;
 //BA.debugLineNum = 3473682;BA.debugLine="ScrollView1.Top = WebViewTest.Height + WebVie";
parent.mostCurrent._scrollview1.setTop((int) (parent.mostCurrent._webviewtest.getHeight()+parent.mostCurrent._webviewtest.getTop()+parent.mostCurrent._panelsearch.getHeight()));
RDebugUtils.currentLine=3473683;
 //BA.debugLineNum = 3473683;BA.debugLine="CLV2.AsView.Height = CLV2.AsView.Height + 4%y";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._clv2._asview().getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA)));
RDebugUtils.currentLine=3473684;
 //BA.debugLineNum = 3473684;BA.debugLine="CLV2.sv.Height = CLV2.AsView.Height";
parent.mostCurrent._clv2._sv.setHeight(parent.mostCurrent._clv2._asview().getHeight());
RDebugUtils.currentLine=3473685;
 //BA.debugLineNum = 3473685;BA.debugLine="ScrollView1.Panel.Height = CLV2.sv.Height";
parent.mostCurrent._scrollview1.getPanel().setHeight(parent.mostCurrent._clv2._sv.getHeight());
RDebugUtils.currentLine=3473686;
 //BA.debugLineNum = 3473686;BA.debugLine="ScrollView1.Height = 100%y - (ScrollView1.Top";
parent.mostCurrent._scrollview1.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-(parent.mostCurrent._scrollview1.getTop()+parent.mostCurrent._paneltoolbar.getHeight())));
RDebugUtils.currentLine=3473687;
 //BA.debugLineNum = 3473687;BA.debugLine="Log(nama)";
anywheresoftware.b4a.keywords.Common.Log(_nama);
RDebugUtils.currentLine=3473688;
 //BA.debugLineNum = 3473688;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 101:
//C
this.state = 150;
;
 if (true) break;

case 103:
//C
this.state = 104;
RDebugUtils.currentLine=3473691;
 //BA.debugLineNum = 3473691;BA.debugLine="Dim education_array As List";
_education_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3473692;
 //BA.debugLineNum = 3473692;BA.debugLine="education_array = parser.NextArray";
_education_array = _parser.NextArray();
RDebugUtils.currentLine=3473693;
 //BA.debugLineNum = 3473693;BA.debugLine="If education_array.Size -1 < 0 Then";
if (true) break;

case 104:
//if
this.state = 113;
if (_education_array.getSize()-1<0) { 
this.state = 106;
}else {
this.state = 108;
}if (true) break;

case 106:
//C
this.state = 113;
RDebugUtils.currentLine=3473694;
 //BA.debugLineNum = 3473694;BA.debugLine="Msgbox(\"Not Found\",\"Warning\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Not Found"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
RDebugUtils.currentLine=3473695;
 //BA.debugLineNum = 3473695;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 108:
//C
this.state = 109;
RDebugUtils.currentLine=3473697;
 //BA.debugLineNum = 3473697;BA.debugLine="For i=0 To education_array.Size - 1";
if (true) break;

case 109:
//for
this.state = 112;
step253 = 1;
limit253 = (int) (_education_array.getSize()-1);
_i = (int) (0) ;
this.state = 176;
if (true) break;

case 176:
//C
this.state = 112;
if ((step253 > 0 && _i <= limit253) || (step253 < 0 && _i >= limit253)) this.state = 111;
if (true) break;

case 177:
//C
this.state = 176;
_i = ((int)(0 + _i + step253)) ;
if (true) break;

case 111:
//C
this.state = 177;
RDebugUtils.currentLine=3473698;
 //BA.debugLineNum = 3473698;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3473699;
 //BA.debugLineNum = 3473699;BA.debugLine="a = education_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_education_array.Get(_i)));
RDebugUtils.currentLine=3473701;
 //BA.debugLineNum = 3473701;BA.debugLine="lat = a.Get(\"latitude\")";
parent._lat = BA.ObjectToString(_a.Get((Object)("latitude")));
RDebugUtils.currentLine=3473702;
 //BA.debugLineNum = 3473702;BA.debugLine="lng = a.Get(\"longitude\")";
parent._lng = BA.ObjectToString(_a.Get((Object)("longitude")));
RDebugUtils.currentLine=3473703;
 //BA.debugLineNum = 3473703;BA.debugLine="Log(lat)";
anywheresoftware.b4a.keywords.Common.Log(parent._lat);
RDebugUtils.currentLine=3473704;
 //BA.debugLineNum = 3473704;BA.debugLine="Log(lng)";
anywheresoftware.b4a.keywords.Common.Log(parent._lng);
RDebugUtils.currentLine=3473705;
 //BA.debugLineNum = 3473705;BA.debugLine="Dim number As String";
_number = "";
RDebugUtils.currentLine=3473706;
 //BA.debugLineNum = 3473706;BA.debugLine="Dim nama As String";
_nama = "";
RDebugUtils.currentLine=3473707;
 //BA.debugLineNum = 3473707;BA.debugLine="number = a.Get(\"educational_building_id\")";
_number = BA.ObjectToString(_a.Get((Object)("educational_building_id")));
RDebugUtils.currentLine=3473708;
 //BA.debugLineNum = 3473708;BA.debugLine="nama = a.Get(\"name_of_educational_building\")";
_nama = BA.ObjectToString(_a.Get((Object)("name_of_educational_building")));
RDebugUtils.currentLine=3473709;
 //BA.debugLineNum = 3473709;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, numbe";
parent.mostCurrent._clv2._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(parent.mostCurrent._clv2._asview().getWidth(),_number,_nama).getObject())),(Object)(""));
RDebugUtils.currentLine=3473710;
 //BA.debugLineNum = 3473710;BA.debugLine="CLV2.AsView.Height = PanelListItem.Height*(i";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._panellistitem.getHeight()*(_i+1)));
 if (true) break;
if (true) break;

case 112:
//C
this.state = 113;
;
RDebugUtils.currentLine=3473713;
 //BA.debugLineNum = 3473713;BA.debugLine="CLV2.AsView.Height = PanelBuildingList.Height";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._panelbuildinglist.getHeight()*_education_array.getSize()));
RDebugUtils.currentLine=3473714;
 //BA.debugLineNum = 3473714;BA.debugLine="ScrollView1.Top = WebViewTest.Height + WebVie";
parent.mostCurrent._scrollview1.setTop((int) (parent.mostCurrent._webviewtest.getHeight()+parent.mostCurrent._webviewtest.getTop()+parent.mostCurrent._panelsearch.getHeight()));
RDebugUtils.currentLine=3473715;
 //BA.debugLineNum = 3473715;BA.debugLine="CLV2.AsView.Height = CLV2.AsView.Height + 4%y";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._clv2._asview().getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA)));
RDebugUtils.currentLine=3473716;
 //BA.debugLineNum = 3473716;BA.debugLine="CLV2.sv.Height = CLV2.AsView.Height";
parent.mostCurrent._clv2._sv.setHeight(parent.mostCurrent._clv2._asview().getHeight());
RDebugUtils.currentLine=3473717;
 //BA.debugLineNum = 3473717;BA.debugLine="ScrollView1.Panel.Height = CLV2.sv.Height";
parent.mostCurrent._scrollview1.getPanel().setHeight(parent.mostCurrent._clv2._sv.getHeight());
RDebugUtils.currentLine=3473718;
 //BA.debugLineNum = 3473718;BA.debugLine="ScrollView1.Height = 100%y - (ScrollView1.Top";
parent.mostCurrent._scrollview1.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-(parent.mostCurrent._scrollview1.getTop()+parent.mostCurrent._paneltoolbar.getHeight())));
RDebugUtils.currentLine=3473719;
 //BA.debugLineNum = 3473719;BA.debugLine="Log(nama)";
anywheresoftware.b4a.keywords.Common.Log(_nama);
RDebugUtils.currentLine=3473720;
 //BA.debugLineNum = 3473720;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 113:
//C
this.state = 150;
;
 if (true) break;

case 115:
//C
this.state = 116;
RDebugUtils.currentLine=3473723;
 //BA.debugLineNum = 3473723;BA.debugLine="Dim health_array As List";
_health_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3473724;
 //BA.debugLineNum = 3473724;BA.debugLine="health_array = parser.NextArray";
_health_array = _parser.NextArray();
RDebugUtils.currentLine=3473725;
 //BA.debugLineNum = 3473725;BA.debugLine="If health_array.Size-1 < 0 Then";
if (true) break;

case 116:
//if
this.state = 125;
if (_health_array.getSize()-1<0) { 
this.state = 118;
}else {
this.state = 120;
}if (true) break;

case 118:
//C
this.state = 125;
RDebugUtils.currentLine=3473726;
 //BA.debugLineNum = 3473726;BA.debugLine="Msgbox(\"Not Found\",\"Warning\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Not Found"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
RDebugUtils.currentLine=3473727;
 //BA.debugLineNum = 3473727;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 120:
//C
this.state = 121;
RDebugUtils.currentLine=3473729;
 //BA.debugLineNum = 3473729;BA.debugLine="For i=0 To health_array.Size - 1";
if (true) break;

case 121:
//for
this.state = 124;
step283 = 1;
limit283 = (int) (_health_array.getSize()-1);
_i = (int) (0) ;
this.state = 178;
if (true) break;

case 178:
//C
this.state = 124;
if ((step283 > 0 && _i <= limit283) || (step283 < 0 && _i >= limit283)) this.state = 123;
if (true) break;

case 179:
//C
this.state = 178;
_i = ((int)(0 + _i + step283)) ;
if (true) break;

case 123:
//C
this.state = 179;
RDebugUtils.currentLine=3473730;
 //BA.debugLineNum = 3473730;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3473731;
 //BA.debugLineNum = 3473731;BA.debugLine="a = health_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_health_array.Get(_i)));
RDebugUtils.currentLine=3473733;
 //BA.debugLineNum = 3473733;BA.debugLine="lat = a.Get(\"latitude\")";
parent._lat = BA.ObjectToString(_a.Get((Object)("latitude")));
RDebugUtils.currentLine=3473734;
 //BA.debugLineNum = 3473734;BA.debugLine="lng = a.Get(\"longitude\")";
parent._lng = BA.ObjectToString(_a.Get((Object)("longitude")));
RDebugUtils.currentLine=3473735;
 //BA.debugLineNum = 3473735;BA.debugLine="Log(lat)";
anywheresoftware.b4a.keywords.Common.Log(parent._lat);
RDebugUtils.currentLine=3473736;
 //BA.debugLineNum = 3473736;BA.debugLine="Log(lng)";
anywheresoftware.b4a.keywords.Common.Log(parent._lng);
RDebugUtils.currentLine=3473737;
 //BA.debugLineNum = 3473737;BA.debugLine="Dim number As String";
_number = "";
RDebugUtils.currentLine=3473738;
 //BA.debugLineNum = 3473738;BA.debugLine="Dim nama As String";
_nama = "";
RDebugUtils.currentLine=3473739;
 //BA.debugLineNum = 3473739;BA.debugLine="number = a.Get(\"health_building_id\")";
_number = BA.ObjectToString(_a.Get((Object)("health_building_id")));
RDebugUtils.currentLine=3473740;
 //BA.debugLineNum = 3473740;BA.debugLine="nama = a.Get(\"name_of_health_building\")";
_nama = BA.ObjectToString(_a.Get((Object)("name_of_health_building")));
RDebugUtils.currentLine=3473741;
 //BA.debugLineNum = 3473741;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, numbe";
parent.mostCurrent._clv2._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(parent.mostCurrent._clv2._asview().getWidth(),_number,_nama).getObject())),(Object)(""));
RDebugUtils.currentLine=3473742;
 //BA.debugLineNum = 3473742;BA.debugLine="CLV2.AsView.Height = PanelListItem.Height*(i";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._panellistitem.getHeight()*(_i+1)));
 if (true) break;
if (true) break;

case 124:
//C
this.state = 125;
;
RDebugUtils.currentLine=3473745;
 //BA.debugLineNum = 3473745;BA.debugLine="CLV2.AsView.Height = PanelBuildingList.Height";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._panelbuildinglist.getHeight()*_health_array.getSize()));
RDebugUtils.currentLine=3473746;
 //BA.debugLineNum = 3473746;BA.debugLine="ScrollView1.Top = WebViewTest.Height + WebVie";
parent.mostCurrent._scrollview1.setTop((int) (parent.mostCurrent._webviewtest.getHeight()+parent.mostCurrent._webviewtest.getTop()+parent.mostCurrent._panelsearch.getHeight()));
RDebugUtils.currentLine=3473747;
 //BA.debugLineNum = 3473747;BA.debugLine="CLV2.AsView.Height = CLV2.AsView.Height + 4%y";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._clv2._asview().getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA)));
RDebugUtils.currentLine=3473748;
 //BA.debugLineNum = 3473748;BA.debugLine="CLV2.sv.Height = CLV2.AsView.Height";
parent.mostCurrent._clv2._sv.setHeight(parent.mostCurrent._clv2._asview().getHeight());
RDebugUtils.currentLine=3473749;
 //BA.debugLineNum = 3473749;BA.debugLine="ScrollView1.Panel.Height = CLV2.sv.Height";
parent.mostCurrent._scrollview1.getPanel().setHeight(parent.mostCurrent._clv2._sv.getHeight());
RDebugUtils.currentLine=3473750;
 //BA.debugLineNum = 3473750;BA.debugLine="ScrollView1.Height = 100%y - (ScrollView1.Top";
parent.mostCurrent._scrollview1.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-(parent.mostCurrent._scrollview1.getTop()+parent.mostCurrent._paneltoolbar.getHeight())));
RDebugUtils.currentLine=3473751;
 //BA.debugLineNum = 3473751;BA.debugLine="Log(nama)";
anywheresoftware.b4a.keywords.Common.Log(_nama);
RDebugUtils.currentLine=3473752;
 //BA.debugLineNum = 3473752;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 125:
//C
this.state = 150;
;
 if (true) break;

case 127:
//C
this.state = 128;
RDebugUtils.currentLine=3473755;
 //BA.debugLineNum = 3473755;BA.debugLine="Dim msme_array As List";
_msme_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3473756;
 //BA.debugLineNum = 3473756;BA.debugLine="msme_array = parser.NextArray";
_msme_array = _parser.NextArray();
RDebugUtils.currentLine=3473757;
 //BA.debugLineNum = 3473757;BA.debugLine="If msme_array.Size-1 < 0 Then";
if (true) break;

case 128:
//if
this.state = 137;
if (_msme_array.getSize()-1<0) { 
this.state = 130;
}else {
this.state = 132;
}if (true) break;

case 130:
//C
this.state = 137;
RDebugUtils.currentLine=3473758;
 //BA.debugLineNum = 3473758;BA.debugLine="Msgbox(\"Not Found\",\"Warning\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Not Found"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
RDebugUtils.currentLine=3473759;
 //BA.debugLineNum = 3473759;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 132:
//C
this.state = 133;
RDebugUtils.currentLine=3473761;
 //BA.debugLineNum = 3473761;BA.debugLine="For i=0 To msme_array.Size - 1";
if (true) break;

case 133:
//for
this.state = 136;
step313 = 1;
limit313 = (int) (_msme_array.getSize()-1);
_i = (int) (0) ;
this.state = 180;
if (true) break;

case 180:
//C
this.state = 136;
if ((step313 > 0 && _i <= limit313) || (step313 < 0 && _i >= limit313)) this.state = 135;
if (true) break;

case 181:
//C
this.state = 180;
_i = ((int)(0 + _i + step313)) ;
if (true) break;

case 135:
//C
this.state = 181;
RDebugUtils.currentLine=3473762;
 //BA.debugLineNum = 3473762;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3473763;
 //BA.debugLineNum = 3473763;BA.debugLine="a = msme_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_msme_array.Get(_i)));
RDebugUtils.currentLine=3473765;
 //BA.debugLineNum = 3473765;BA.debugLine="lat = a.Get(\"latitude\")";
parent._lat = BA.ObjectToString(_a.Get((Object)("latitude")));
RDebugUtils.currentLine=3473766;
 //BA.debugLineNum = 3473766;BA.debugLine="lng = a.Get(\"longitude\")";
parent._lng = BA.ObjectToString(_a.Get((Object)("longitude")));
RDebugUtils.currentLine=3473767;
 //BA.debugLineNum = 3473767;BA.debugLine="Log(lat)";
anywheresoftware.b4a.keywords.Common.Log(parent._lat);
RDebugUtils.currentLine=3473768;
 //BA.debugLineNum = 3473768;BA.debugLine="Log(lng)";
anywheresoftware.b4a.keywords.Common.Log(parent._lng);
RDebugUtils.currentLine=3473769;
 //BA.debugLineNum = 3473769;BA.debugLine="Dim number As String";
_number = "";
RDebugUtils.currentLine=3473770;
 //BA.debugLineNum = 3473770;BA.debugLine="Dim nama As String";
_nama = "";
RDebugUtils.currentLine=3473771;
 //BA.debugLineNum = 3473771;BA.debugLine="number = a.Get(\"msme_building_id\")";
_number = BA.ObjectToString(_a.Get((Object)("msme_building_id")));
RDebugUtils.currentLine=3473772;
 //BA.debugLineNum = 3473772;BA.debugLine="nama = a.Get(\"name_of_msme_building\")";
_nama = BA.ObjectToString(_a.Get((Object)("name_of_msme_building")));
RDebugUtils.currentLine=3473773;
 //BA.debugLineNum = 3473773;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, numbe";
parent.mostCurrent._clv2._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(parent.mostCurrent._clv2._asview().getWidth(),_number,_nama).getObject())),(Object)(""));
RDebugUtils.currentLine=3473774;
 //BA.debugLineNum = 3473774;BA.debugLine="CLV2.AsView.Height = PanelListItem.Height*(i";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._panellistitem.getHeight()*(_i+1)));
 if (true) break;
if (true) break;

case 136:
//C
this.state = 137;
;
RDebugUtils.currentLine=3473777;
 //BA.debugLineNum = 3473777;BA.debugLine="CLV2.AsView.Height = PanelBuildingList.Height";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._panelbuildinglist.getHeight()*_msme_array.getSize()));
RDebugUtils.currentLine=3473778;
 //BA.debugLineNum = 3473778;BA.debugLine="ScrollView1.Top = WebViewTest.Height + WebVie";
parent.mostCurrent._scrollview1.setTop((int) (parent.mostCurrent._webviewtest.getHeight()+parent.mostCurrent._webviewtest.getTop()+parent.mostCurrent._panelsearch.getHeight()));
RDebugUtils.currentLine=3473779;
 //BA.debugLineNum = 3473779;BA.debugLine="CLV2.AsView.Height = CLV2.AsView.Height + 4%y";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._clv2._asview().getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA)));
RDebugUtils.currentLine=3473780;
 //BA.debugLineNum = 3473780;BA.debugLine="CLV2.sv.Height = CLV2.AsView.Height";
parent.mostCurrent._clv2._sv.setHeight(parent.mostCurrent._clv2._asview().getHeight());
RDebugUtils.currentLine=3473781;
 //BA.debugLineNum = 3473781;BA.debugLine="ScrollView1.Panel.Height = CLV2.sv.Height";
parent.mostCurrent._scrollview1.getPanel().setHeight(parent.mostCurrent._clv2._sv.getHeight());
RDebugUtils.currentLine=3473782;
 //BA.debugLineNum = 3473782;BA.debugLine="ScrollView1.Height = 100%y - (ScrollView1.Top";
parent.mostCurrent._scrollview1.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-(parent.mostCurrent._scrollview1.getTop()+parent.mostCurrent._paneltoolbar.getHeight())));
RDebugUtils.currentLine=3473783;
 //BA.debugLineNum = 3473783;BA.debugLine="Log(nama)";
anywheresoftware.b4a.keywords.Common.Log(_nama);
RDebugUtils.currentLine=3473784;
 //BA.debugLineNum = 3473784;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 137:
//C
this.state = 150;
;
 if (true) break;

case 139:
//C
this.state = 140;
RDebugUtils.currentLine=3473787;
 //BA.debugLineNum = 3473787;BA.debugLine="Dim house_array As List";
_house_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3473788;
 //BA.debugLineNum = 3473788;BA.debugLine="house_array = parser.NextArray";
_house_array = _parser.NextArray();
RDebugUtils.currentLine=3473789;
 //BA.debugLineNum = 3473789;BA.debugLine="If house_array.Size-1 < 0 Then";
if (true) break;

case 140:
//if
this.state = 149;
if (_house_array.getSize()-1<0) { 
this.state = 142;
}else {
this.state = 144;
}if (true) break;

case 142:
//C
this.state = 149;
RDebugUtils.currentLine=3473790;
 //BA.debugLineNum = 3473790;BA.debugLine="Msgbox(\"Not Found\",\"Warning\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Not Found"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
RDebugUtils.currentLine=3473791;
 //BA.debugLineNum = 3473791;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 144:
//C
this.state = 145;
RDebugUtils.currentLine=3473793;
 //BA.debugLineNum = 3473793;BA.debugLine="For i=0 To house_array.Size - 1";
if (true) break;

case 145:
//for
this.state = 148;
step343 = 1;
limit343 = (int) (_house_array.getSize()-1);
_i = (int) (0) ;
this.state = 182;
if (true) break;

case 182:
//C
this.state = 148;
if ((step343 > 0 && _i <= limit343) || (step343 < 0 && _i >= limit343)) this.state = 147;
if (true) break;

case 183:
//C
this.state = 182;
_i = ((int)(0 + _i + step343)) ;
if (true) break;

case 147:
//C
this.state = 183;
RDebugUtils.currentLine=3473794;
 //BA.debugLineNum = 3473794;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3473795;
 //BA.debugLineNum = 3473795;BA.debugLine="a = house_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_house_array.Get(_i)));
RDebugUtils.currentLine=3473797;
 //BA.debugLineNum = 3473797;BA.debugLine="lat = a.Get(\"latitude\")";
parent._lat = BA.ObjectToString(_a.Get((Object)("latitude")));
RDebugUtils.currentLine=3473798;
 //BA.debugLineNum = 3473798;BA.debugLine="lng = a.Get(\"longitude\")";
parent._lng = BA.ObjectToString(_a.Get((Object)("longitude")));
RDebugUtils.currentLine=3473799;
 //BA.debugLineNum = 3473799;BA.debugLine="Log(lat)";
anywheresoftware.b4a.keywords.Common.Log(parent._lat);
RDebugUtils.currentLine=3473800;
 //BA.debugLineNum = 3473800;BA.debugLine="Log(lng)";
anywheresoftware.b4a.keywords.Common.Log(parent._lng);
RDebugUtils.currentLine=3473801;
 //BA.debugLineNum = 3473801;BA.debugLine="Dim number As String";
_number = "";
RDebugUtils.currentLine=3473802;
 //BA.debugLineNum = 3473802;BA.debugLine="Dim nama As String";
_nama = "";
RDebugUtils.currentLine=3473803;
 //BA.debugLineNum = 3473803;BA.debugLine="number = a.Get(\"house_building_id\")";
_number = BA.ObjectToString(_a.Get((Object)("house_building_id")));
RDebugUtils.currentLine=3473804;
 //BA.debugLineNum = 3473804;BA.debugLine="nama = a.Get(\"fcn_owner\")";
_nama = BA.ObjectToString(_a.Get((Object)("fcn_owner")));
RDebugUtils.currentLine=3473805;
 //BA.debugLineNum = 3473805;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, numbe";
parent.mostCurrent._clv2._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(parent.mostCurrent._clv2._asview().getWidth(),_number,_nama).getObject())),(Object)(""));
 if (true) break;
if (true) break;

case 148:
//C
this.state = 149;
;
RDebugUtils.currentLine=3473809;
 //BA.debugLineNum = 3473809;BA.debugLine="CLV2.sv.Height = (PanelBuildingList.Height +";
parent.mostCurrent._clv2._sv.setHeight((int) ((parent.mostCurrent._panelbuildinglist.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0.2),mostCurrent.activityBA))*_house_array.getSize()));
RDebugUtils.currentLine=3473810;
 //BA.debugLineNum = 3473810;BA.debugLine="ScrollView1.Top = WebViewTest.Height + WebVie";
parent.mostCurrent._scrollview1.setTop((int) (parent.mostCurrent._webviewtest.getHeight()+parent.mostCurrent._webviewtest.getTop()+parent.mostCurrent._panelsearch.getHeight()));
RDebugUtils.currentLine=3473811;
 //BA.debugLineNum = 3473811;BA.debugLine="ScrollView1.Height = 100%y - (ScrollView1.Top";
parent.mostCurrent._scrollview1.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-(parent.mostCurrent._scrollview1.getTop()+parent.mostCurrent._paneltoolbar.getHeight())));
RDebugUtils.currentLine=3473812;
 //BA.debugLineNum = 3473812;BA.debugLine="CLV2.AsView.Height = CLV2.sv.Height";
parent.mostCurrent._clv2._asview().setHeight(parent.mostCurrent._clv2._sv.getHeight());
RDebugUtils.currentLine=3473813;
 //BA.debugLineNum = 3473813;BA.debugLine="ScrollView1.Panel.Height = CLV2.AsView.Height";
parent.mostCurrent._scrollview1.getPanel().setHeight(parent.mostCurrent._clv2._asview().getHeight());
RDebugUtils.currentLine=3473814;
 //BA.debugLineNum = 3473814;BA.debugLine="Log(nama)";
anywheresoftware.b4a.keywords.Common.Log(_nama);
RDebugUtils.currentLine=3473815;
 //BA.debugLineNum = 3473815;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 149:
//C
this.state = 150;
;
 if (true) break;

case 150:
//C
this.state = 151;
;
 if (true) break;

case 151:
//C
this.state = -1;
;
RDebugUtils.currentLine=3473819;
 //BA.debugLineNum = 3473819;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=3473821;
 //BA.debugLineNum = 3473821;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _panellistitem_click() throws Exception{
RDebugUtils.currentModule="searchbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panellistitem_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "panellistitem_click", null);
int _item = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _a = null;
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub PanelListItem_Click";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Dim item As Int = CLV2.GetItemFromView(Sender)";
_item = mostCurrent._clv2._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA))));
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="p = CLV2.GetPanel(item)";
_p = mostCurrent._clv2._getpanel(_item);
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="Dim a As B4XView";
_a = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="a = p.GetView(0)";
_a = _p.GetView((int) (0));
RDebugUtils.currentLine=3538951;
 //BA.debugLineNum = 3538951;BA.debugLine="idBuilding = a.GetView(0).GetView(0).Text";
_idbuilding = _a.GetView((int) (0)).GetView((int) (0)).getText();
RDebugUtils.currentLine=3538953;
 //BA.debugLineNum = 3538953;BA.debugLine="nameBuilding = a.GetView(0).GetView(1).Text";
_namebuilding = _a.GetView((int) (0)).GetView((int) (1)).getText();
RDebugUtils.currentLine=3538954;
 //BA.debugLineNum = 3538954;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"Office","Worship","Educational","Msme","Health","House")) {
case 0: {
RDebugUtils.currentLine=3538956;
 //BA.debugLineNum = 3538956;BA.debugLine="StartActivity(OfficeDetail)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._officedetail.getObject()));
 break; }
case 1: {
RDebugUtils.currentLine=3538958;
 //BA.debugLineNum = 3538958;BA.debugLine="StartActivity(WorshipDetail)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._worshipdetail.getObject()));
 break; }
case 2: {
RDebugUtils.currentLine=3538960;
 //BA.debugLineNum = 3538960;BA.debugLine="StartActivity(EducationalDetail)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._educationaldetail.getObject()));
 break; }
case 3: {
RDebugUtils.currentLine=3538962;
 //BA.debugLineNum = 3538962;BA.debugLine="StartActivity(MsmeDetail)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._msmedetail.getObject()));
 break; }
case 4: {
RDebugUtils.currentLine=3538964;
 //BA.debugLineNum = 3538964;BA.debugLine="StartActivity(HealthDetail)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._healthdetail.getObject()));
 break; }
case 5: {
RDebugUtils.currentLine=3538966;
 //BA.debugLineNum = 3538966;BA.debugLine="StartActivity(HouseDetail)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._housedetail.getObject()));
 break; }
}
;
RDebugUtils.currentLine=3538969;
 //BA.debugLineNum = 3538969;BA.debugLine="End Sub";
return "";
}
public static String  _searchbtn_click() throws Exception{
RDebugUtils.currentModule="searchbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "searchbtn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "searchbtn_click", null);
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub SearchBtn_Click";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="CLV2.Clear";
mostCurrent._clv2._clear();
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"name")) {
case 0: {
 break; }
}
;
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="Log(SearchText.Text)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._searchtext.getText());
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"All","Worship","Office","Health","Educational","Msme","House")) {
case 0: {
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"model")) {
case 0: {
RDebugUtils.currentLine=3670026;
 //BA.debugLineNum = 3670026;BA.debugLine="Msgbox(\"Query belum ada :(\",\"WARNING!\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Query belum ada :("),BA.ObjectToCharSequence("WARNING!"),mostCurrent.activityBA);
 break; }
}
;
 break; }
case 1: {
RDebugUtils.currentLine=3670029;
 //BA.debugLineNum = 3670029;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"name","type","jorong","construction","facility","land area","building area","radius","standing year")) {
case 0: {
RDebugUtils.currentLine=3670031;
 //BA.debugLineNum = 3670031;BA.debugLine="If SearchText.Text == \"\" Then";
if ((mostCurrent._searchtext.getText()).equals("")) { 
RDebugUtils.currentLine=3670032;
 //BA.debugLineNum = 3670032;BA.debugLine="Msgbox(\"Field is empty! Please write somethi";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Field is empty! Please write something in search field."),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=3670033;
 //BA.debugLineNum = 3670033;BA.debugLine="Else If idspin == \"null\" Or idspin == \"\" Then";
if ((_idspin).equals("null") || (_idspin).equals("")) { 
RDebugUtils.currentLine=3670034;
 //BA.debugLineNum = 3670034;BA.debugLine="Msgbox(\"Select the building type to continue";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the building type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=3670035;
 //BA.debugLineNum = 3670035;BA.debugLine="Else If typesrc == \"null\" Or typesrc == \"\" Th";
if ((mostCurrent._typesrc).equals("null") || (mostCurrent._typesrc).equals("")) { 
RDebugUtils.currentLine=3670036;
 //BA.debugLineNum = 3670036;BA.debugLine="Msgbox(\"Select the search type to continue y";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the search type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=3670037;
 //BA.debugLineNum = 3670037;BA.debugLine="Else If SearchText.Text == \"\" And idspin == \"";
if ((mostCurrent._searchtext.getText()).equals("") && (_idspin).equals("") && (mostCurrent._typesrc).equals("")) { 
RDebugUtils.currentLine=3670038;
 //BA.debugLineNum = 3670038;BA.debugLine="Msgbox(\"Please complete all fields!\",\"Warnin";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please complete all fields!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670040;
 //BA.debugLineNum = 3670040;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._searchtext.getText());
RDebugUtils.currentLine=3670041;
 //BA.debugLineNum = 3670041;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_";
_executeremotequery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM worship_building WHERE upper(name_of_worship_building) like '%"+mostCurrent._searchtext.getText().toUpperCase()+"%' ORDER BY name_of_worship_building",_idspin);
 }}}}
;
 break; }
case 1: {
RDebugUtils.currentLine=3670045;
 //BA.debugLineNum = 3670045;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
RDebugUtils.currentLine=3670046;
 //BA.debugLineNum = 3670046;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670048;
 //BA.debugLineNum = 3670048;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670049;
 //BA.debugLineNum = 3670049;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_";
_executeremotequery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM worship_building WHERE type_of_worship = '"+mostCurrent._typeid+"' order by name_of_worship_building",_idspin);
 };
 break; }
case 2: {
RDebugUtils.currentLine=3670053;
 //BA.debugLineNum = 3670053;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
RDebugUtils.currentLine=3670054;
 //BA.debugLineNum = 3670054;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670056;
 //BA.debugLineNum = 3670056;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670057;
 //BA.debugLineNum = 3670057;BA.debugLine="ExecuteRemoteQuery(\"SELECT W.worship_buildin";
_executeremotequery("SELECT W.worship_building_id, W.name_of_worship_building, W.geom, ST_X(ST_CENTROID(W.geom)) As longitude, ST_Y(ST_CENTROID(W.geom)) As latitude	FROM worship_building As W, jorong As J	WHERE ST_CONTAINS(J.geom, W.geom) And J.jorong_id='"+mostCurrent._typeid+"'",_idspin);
 };
 break; }
case 3: {
RDebugUtils.currentLine=3670060;
 //BA.debugLineNum = 3670060;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
RDebugUtils.currentLine=3670061;
 //BA.debugLineNum = 3670061;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670063;
 //BA.debugLineNum = 3670063;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670064;
 //BA.debugLineNum = 3670064;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_";
_executeremotequery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM worship_building WHERE type_of_construction = '"+mostCurrent._typeid+"' order by name_of_worship_building",_idspin);
 };
 break; }
case 4: {
RDebugUtils.currentLine=3670067;
 //BA.debugLineNum = 3670067;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&id";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._idchecksub);
RDebugUtils.currentLine=3670068;
 //BA.debugLineNum = 3670068;BA.debugLine="ExecuteRemoteQuery(\"SELECT M.worship_buildin";
_executeremotequery("SELECT M.worship_building_id, M.name_of_worship_building, ST_X(ST_Centroid(M.geom)) AS lng, ST_Y(ST_CENTROID(M.geom)) AS lat FROM worship_building As M	JOIN detail_worship_building_facilities As F on M.worship_building_id=F.worship_building_id	WHERE F.facility_id IN ("+mostCurrent._idchecksub+") GROUP BY F.worship_building_id, M.worship_building_id, M.name_of_worship_building HAVING COUNT(*) = "+BA.NumberToString(_count)+"",_idspin);
 break; }
case 5: {
RDebugUtils.currentLine=3670070;
 //BA.debugLineNum = 3670070;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?awal="+mostCurrent._fromtext.getText()+"&akhir="+mostCurrent._totext.getText());
RDebugUtils.currentLine=3670071;
 //BA.debugLineNum = 3670071;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_i";
_executeremotequery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM worship_building WHERE land_area BETWEEN "+mostCurrent._fromtext.getText()+" AND "+mostCurrent._totext.getText()+" ORDER BY name_of_worship_building",_idspin);
 break; }
case 6: {
RDebugUtils.currentLine=3670073;
 //BA.debugLineNum = 3670073;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?awal="+mostCurrent._fromtext.getText()+"&akhir="+mostCurrent._totext.getText());
RDebugUtils.currentLine=3670074;
 //BA.debugLineNum = 3670074;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_i";
_executeremotequery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM worship_building WHERE building_area BETWEEN "+mostCurrent._fromtext.getText()+" AND "+mostCurrent._totext.getText()+" ORDER BY name_of_worship_building",_idspin);
 break; }
case 7: {
RDebugUtils.currentLine=3670076;
 //BA.debugLineNum = 3670076;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/index_"+mostCurrent._typesrc+".php?lat="+_latitude+"&lng="+_longitude+"&rad="+BA.NumberToString(_radiusku));
RDebugUtils.currentLine=3670077;
 //BA.debugLineNum = 3670077;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_i";
_executeremotequery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_CENTROID(geom)) as lon, ST_Y(ST_CENTROID(geom)) as lat, ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("+_longitude+" "+_latitude+")',-1), geom) as jarak	FROM worship_building where ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("+_longitude+" "+_latitude+")',-1), geom) <= "+BA.NumberToString(_radiusku)+" ORDER BY jarak",_idspin);
 break; }
case 8: {
RDebugUtils.currentLine=3670079;
 //BA.debugLineNum = 3670079;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?awal="+mostCurrent._fromtext.getText()+"&akhir="+mostCurrent._totext.getText());
RDebugUtils.currentLine=3670080;
 //BA.debugLineNum = 3670080;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_i";
_executeremotequery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM worship_building WHERE standing_year BETWEEN "+mostCurrent._fromtext.getText()+" AND "+mostCurrent._totext.getText()+" ORDER BY name_of_worship_building",_idspin);
 break; }
}
;
 break; }
case 2: {
RDebugUtils.currentLine=3670083;
 //BA.debugLineNum = 3670083;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"name","type","jorong","construction","facility","radius")) {
case 0: {
RDebugUtils.currentLine=3670085;
 //BA.debugLineNum = 3670085;BA.debugLine="If SearchText.Text == \"\" Then";
if ((mostCurrent._searchtext.getText()).equals("")) { 
RDebugUtils.currentLine=3670086;
 //BA.debugLineNum = 3670086;BA.debugLine="Msgbox(\"Field is empty! Please write somethi";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Field is empty! Please write something in search field."),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=3670087;
 //BA.debugLineNum = 3670087;BA.debugLine="Else If idspin == \"null\" Or idspin == \"\" Then";
if ((_idspin).equals("null") || (_idspin).equals("")) { 
RDebugUtils.currentLine=3670088;
 //BA.debugLineNum = 3670088;BA.debugLine="Msgbox(\"Select the building type to continue";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the building type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=3670089;
 //BA.debugLineNum = 3670089;BA.debugLine="Else If typesrc == \"null\" Or typesrc == \"\" Th";
if ((mostCurrent._typesrc).equals("null") || (mostCurrent._typesrc).equals("")) { 
RDebugUtils.currentLine=3670090;
 //BA.debugLineNum = 3670090;BA.debugLine="Msgbox(\"Select the search type to continue y";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the search type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=3670091;
 //BA.debugLineNum = 3670091;BA.debugLine="Else If SearchText.Text == \"\" And idspin == \"";
if ((mostCurrent._searchtext.getText()).equals("") && (_idspin).equals("") && (mostCurrent._typesrc).equals("")) { 
RDebugUtils.currentLine=3670092;
 //BA.debugLineNum = 3670092;BA.debugLine="Msgbox(\"Please complete all fields!\",\"Warnin";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please complete all fields!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670094;
 //BA.debugLineNum = 3670094;BA.debugLine="ExecuteRemoteQuery(\"SELECT office_building_i";
_executeremotequery("SELECT office_building_id, name_of_office_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM office_building WHERE upper(name_of_office_building) like '%"+mostCurrent._searchtext.getText().toUpperCase()+"%' ORDER BY name_of_office_building",_idspin);
RDebugUtils.currentLine=3670095;
 //BA.debugLineNum = 3670095;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
 }}}}
;
 break; }
case 1: {
RDebugUtils.currentLine=3670098;
 //BA.debugLineNum = 3670098;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
RDebugUtils.currentLine=3670099;
 //BA.debugLineNum = 3670099;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670101;
 //BA.debugLineNum = 3670101;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670102;
 //BA.debugLineNum = 3670102;BA.debugLine="ExecuteRemoteQuery(\"SELECT office_building_i";
_executeremotequery("SELECT office_building_id, name_of_office_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM office_building WHERE type_of_office = '"+mostCurrent._typeid+"' order by name_of_office_building",_idspin);
 };
 break; }
case 2: {
RDebugUtils.currentLine=3670106;
 //BA.debugLineNum = 3670106;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
RDebugUtils.currentLine=3670107;
 //BA.debugLineNum = 3670107;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670109;
 //BA.debugLineNum = 3670109;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670110;
 //BA.debugLineNum = 3670110;BA.debugLine="ExecuteRemoteQuery(\"SELECT O.office_building";
_executeremotequery("SELECT O.office_building_id, O.name_of_office_building, O.geom,	ST_X(ST_CENTROID(O.geom)) As longitude, ST_Y(ST_CENTROID(O.geom)) As latitude FROM office_building As O, jorong As J WHERE ST_CONTAINS(J.geom, O.geom) And J.jorong_id='"+mostCurrent._typeid+"'",_idspin);
 };
 break; }
case 3: {
RDebugUtils.currentLine=3670114;
 //BA.debugLineNum = 3670114;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670115;
 //BA.debugLineNum = 3670115;BA.debugLine="ExecuteRemoteQuery(\"SELECT office_building_id";
_executeremotequery("SELECT office_building_id, name_of_office_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM office_building WHERE type_of_construction = '"+mostCurrent._typeid+"' order by name_of_office_building",_idspin);
 break; }
case 4: {
RDebugUtils.currentLine=3670118;
 //BA.debugLineNum = 3670118;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._idchecksub);
RDebugUtils.currentLine=3670119;
 //BA.debugLineNum = 3670119;BA.debugLine="ExecuteRemoteQuery(\"SELECT O.office_building";
_executeremotequery("SELECT O.office_building_id, O.name_of_office_building, ST_X(ST_Centroid(O.geom)) AS lng, ST_Y(ST_CENTROID(O.geom)) AS lat FROM office_building As O JOIN detail_office_building_facilities As F on O.office_building_id=F.office_building_id WHERE F.facility_id IN ("+mostCurrent._idchecksub+") GROUP BY F.office_building_id, O.office_building_id, O.name_of_office_building HAVING COUNT(*) = "+BA.NumberToString(_count)+"",_idspin);
 break; }
case 5: {
RDebugUtils.currentLine=3670121;
 //BA.debugLineNum = 3670121;BA.debugLine="If Main.kvs.ContainsKey(\"Lat\") == False And M";
if (mostCurrent._main._kvs._containskey("Lat")==anywheresoftware.b4a.keywords.Common.False && mostCurrent._main._kvs._containskey("Long")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3670122;
 //BA.debugLineNum = 3670122;BA.debugLine="Msgbox(\"Your location haven't been set\",\"Err";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Your location haven't been set"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670127;
 //BA.debugLineNum = 3670127;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/index_"+mostCurrent._typesrc+".php?lat="+_latitude+"&lng="+_longitude+"&rad="+BA.NumberToString(_radiusku));
RDebugUtils.currentLine=3670128;
 //BA.debugLineNum = 3670128;BA.debugLine="ExecuteRemoteQuery(\"SELECT office_building_i";
_executeremotequery("SELECT office_building_id, name_of_office_building ,ST_X(ST_CENTROID(geom)) as lon, ST_Y(ST_CENTROID(geom)) as lat, ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("+_longitude+" "+_latitude+")',-1), geom) as jarak FROM office_building where ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("+_longitude+" "+_latitude+")',-1),	geom) <= "+BA.NumberToString(_radiusku)+" ORDER BY jarak",_idspin);
 };
 break; }
}
;
 break; }
case 3: {
RDebugUtils.currentLine=3670133;
 //BA.debugLineNum = 3670133;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"name","type","jorong","construction","facility","radius")) {
case 0: {
RDebugUtils.currentLine=3670135;
 //BA.debugLineNum = 3670135;BA.debugLine="If SearchText.Text == \"\" Then";
if ((mostCurrent._searchtext.getText()).equals("")) { 
RDebugUtils.currentLine=3670136;
 //BA.debugLineNum = 3670136;BA.debugLine="Msgbox(\"Field is empty! Please write somethi";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Field is empty! Please write something in search field."),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=3670137;
 //BA.debugLineNum = 3670137;BA.debugLine="Else If idspin == \"null\" Or idspin == \"\" Then";
if ((_idspin).equals("null") || (_idspin).equals("")) { 
RDebugUtils.currentLine=3670138;
 //BA.debugLineNum = 3670138;BA.debugLine="Msgbox(\"Select the building type to continue";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the building type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=3670139;
 //BA.debugLineNum = 3670139;BA.debugLine="Else If typesrc == \"null\" Or typesrc == \"\" Th";
if ((mostCurrent._typesrc).equals("null") || (mostCurrent._typesrc).equals("")) { 
RDebugUtils.currentLine=3670140;
 //BA.debugLineNum = 3670140;BA.debugLine="Msgbox(\"Select the search type to continue y";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the search type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=3670141;
 //BA.debugLineNum = 3670141;BA.debugLine="Else If SearchText.Text == \"\" And idspin == \"";
if ((mostCurrent._searchtext.getText()).equals("") && (_idspin).equals("") && (mostCurrent._typesrc).equals("")) { 
RDebugUtils.currentLine=3670142;
 //BA.debugLineNum = 3670142;BA.debugLine="Msgbox(\"Please complete all fields!\",\"Warnin";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please complete all fields!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670144;
 //BA.debugLineNum = 3670144;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670145;
 //BA.debugLineNum = 3670145;BA.debugLine="ExecuteRemoteQuery(\"SELECT health_building_i";
_executeremotequery("SELECT health_building_id, name_of_health_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM health_building WHERE name_of_health_building like '%"+mostCurrent._searchtext.getText().toUpperCase()+"%' ORDER BY name_of_health_building",_idspin);
 }}}}
;
 break; }
case 1: {
RDebugUtils.currentLine=3670149;
 //BA.debugLineNum = 3670149;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
RDebugUtils.currentLine=3670150;
 //BA.debugLineNum = 3670150;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670152;
 //BA.debugLineNum = 3670152;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670153;
 //BA.debugLineNum = 3670153;BA.debugLine="ExecuteRemoteQuery(\"SELECT health_building_i";
_executeremotequery("SELECT health_building_id, name_of_health_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM health_building WHERE type_of_health_building = '"+mostCurrent._typeid+"' order by name_of_health_building",_idspin);
 };
 break; }
case 2: {
RDebugUtils.currentLine=3670157;
 //BA.debugLineNum = 3670157;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
RDebugUtils.currentLine=3670158;
 //BA.debugLineNum = 3670158;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670160;
 //BA.debugLineNum = 3670160;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670161;
 //BA.debugLineNum = 3670161;BA.debugLine="ExecuteRemoteQuery(\"SELECT W.health_building";
_executeremotequery("SELECT W.health_building_id, W.name_of_health_building, W.geom, ST_X(ST_CENTROID(W.geom)) As longitude,	ST_Y(ST_CENTROID(W.geom)) As latitude FROM health_building As W, jorong As J WHERE ST_CONTAINS(J.geom, W.geom) And J.jorong_id='"+mostCurrent._typeid+"'",_idspin);
 };
 break; }
case 3: {
RDebugUtils.currentLine=3670165;
 //BA.debugLineNum = 3670165;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
RDebugUtils.currentLine=3670166;
 //BA.debugLineNum = 3670166;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670168;
 //BA.debugLineNum = 3670168;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670169;
 //BA.debugLineNum = 3670169;BA.debugLine="ExecuteRemoteQuery(\"SELECT health_building_i";
_executeremotequery("SELECT health_building_id, name_of_health_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM health_building WHERE type_of_construction = '"+mostCurrent._typeid+"' order by name_of_health_building",_idspin);
 };
 break; }
case 4: {
RDebugUtils.currentLine=3670172;
 //BA.debugLineNum = 3670172;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._idchecksub);
RDebugUtils.currentLine=3670173;
 //BA.debugLineNum = 3670173;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.health_building";
_executeremotequery("SELECT H.health_building_id, H.name_of_health_building, ST_X(ST_Centroid(H.geom)) AS lng, ST_Y(ST_CENTROID(H.geom)) AS lat FROM health_building As H JOIN detail_health_building_facilities As F on H.health_building_id=F.health_building_id WHERE F.facility_id IN ("+mostCurrent._idchecksub+") GROUP BY F.health_building_id, H.health_building_id, H.name_of_health_building HAVING COUNT(*) = "+BA.NumberToString(_count)+"",_idspin);
 break; }
case 5: {
RDebugUtils.currentLine=3670175;
 //BA.debugLineNum = 3670175;BA.debugLine="If Main.kvs.ContainsKey(\"Lat\") == False And M";
if (mostCurrent._main._kvs._containskey("Lat")==anywheresoftware.b4a.keywords.Common.False && mostCurrent._main._kvs._containskey("Long")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3670176;
 //BA.debugLineNum = 3670176;BA.debugLine="Msgbox(\"Your location haven't been set\",\"Err";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Your location haven't been set"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670178;
 //BA.debugLineNum = 3670178;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/index_"+mostCurrent._typesrc+".php?lat="+_latitude+"&lng="+_longitude+"&rad="+BA.NumberToString(_radiusku));
RDebugUtils.currentLine=3670179;
 //BA.debugLineNum = 3670179;BA.debugLine="ExecuteRemoteQuery(\"SELECT health_building_i";
_executeremotequery("SELECT health_building_id, name_of_health_building ,ST_X(ST_CENTROID(geom)) as lon, ST_Y(ST_CENTROID(geom)) as lat,	ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("+_longitude+" "+_latitude+")',-1), geom) as jarak FROM health_building where ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("+_longitude+" "+_latitude+")',-1),	geom) <= "+BA.NumberToString(_radiusku)+" ORDER BY jarak",_idspin);
 };
 break; }
}
;
 break; }
case 4: {
RDebugUtils.currentLine=3670184;
 //BA.debugLineNum = 3670184;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"name","type","jorong","status","facility","land area","building area","radius")) {
case 0: {
RDebugUtils.currentLine=3670186;
 //BA.debugLineNum = 3670186;BA.debugLine="If SearchText.Text == \"\" Then";
if ((mostCurrent._searchtext.getText()).equals("")) { 
RDebugUtils.currentLine=3670187;
 //BA.debugLineNum = 3670187;BA.debugLine="Msgbox(\"Field is empty! Please write somethi";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Field is empty! Please write something in search field."),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=3670188;
 //BA.debugLineNum = 3670188;BA.debugLine="Else If idspin == \"null\" Or idspin == \"\" Then";
if ((_idspin).equals("null") || (_idspin).equals("")) { 
RDebugUtils.currentLine=3670189;
 //BA.debugLineNum = 3670189;BA.debugLine="Msgbox(\"Select the building type to continue";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the building type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=3670190;
 //BA.debugLineNum = 3670190;BA.debugLine="Else If typesrc == \"null\" Or typesrc == \"\" Th";
if ((mostCurrent._typesrc).equals("null") || (mostCurrent._typesrc).equals("")) { 
RDebugUtils.currentLine=3670191;
 //BA.debugLineNum = 3670191;BA.debugLine="Msgbox(\"Select the search type to continue y";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the search type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=3670192;
 //BA.debugLineNum = 3670192;BA.debugLine="Else If SearchText.Text == \"\" And idspin == \"";
if ((mostCurrent._searchtext.getText()).equals("") && (_idspin).equals("") && (mostCurrent._typesrc).equals("")) { 
RDebugUtils.currentLine=3670193;
 //BA.debugLineNum = 3670193;BA.debugLine="Msgbox(\"Please complete all fields!\",\"Warnin";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please complete all fields!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670195;
 //BA.debugLineNum = 3670195;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670196;
 //BA.debugLineNum = 3670196;BA.debugLine="ExecuteRemoteQuery(\"SELECT educational_build";
_executeremotequery("SELECT educational_building_id, name_of_educational_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM educational_building WHERE name_of_educational_building like '%"+mostCurrent._searchtext.getText().toUpperCase()+"%' ORDER BY name_of_educational_building",_idspin);
 }}}}
;
 break; }
case 1: {
RDebugUtils.currentLine=3670200;
 //BA.debugLineNum = 3670200;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
RDebugUtils.currentLine=3670201;
 //BA.debugLineNum = 3670201;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670203;
 //BA.debugLineNum = 3670203;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670204;
 //BA.debugLineNum = 3670204;BA.debugLine="ExecuteRemoteQuery(\"SELECT educational_build";
_executeremotequery("SELECT educational_building_id, name_of_educational_building, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM educational_building WHERE id_level_of_education = '"+mostCurrent._typeid+"' order by name_of_educational_building",_idspin);
 };
 break; }
case 2: {
RDebugUtils.currentLine=3670208;
 //BA.debugLineNum = 3670208;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
RDebugUtils.currentLine=3670209;
 //BA.debugLineNum = 3670209;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670211;
 //BA.debugLineNum = 3670211;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670212;
 //BA.debugLineNum = 3670212;BA.debugLine="ExecuteRemoteQuery(\"SELECT W.educational_bui";
_executeremotequery("SELECT W.educational_building_id, W.name_of_educational_building, W.geom, ST_X(ST_CENTROID(W.geom)) As longitude, ST_Y(ST_CENTROID(W.geom)) As latitude FROM educational_building As W, jorong As J WHERE ST_CONTAINS(J.geom, W.geom) And J.jorong_id='"+mostCurrent._typeid+"'",_idspin);
 };
 break; }
case 3: {
RDebugUtils.currentLine=3670216;
 //BA.debugLineNum = 3670216;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
RDebugUtils.currentLine=3670217;
 //BA.debugLineNum = 3670217;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670219;
 //BA.debugLineNum = 3670219;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670220;
 //BA.debugLineNum = 3670220;BA.debugLine="ExecuteRemoteQuery(\"Select educational_build";
_executeremotequery("Select educational_building_id, name_of_educational_building, ST_X(ST_Centroid(geom)) As longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM educational_building WHERE school_type = '"+mostCurrent._typeid+"' order by name_of_educational_building",_idspin);
 };
 break; }
case 4: {
RDebugUtils.currentLine=3670224;
 //BA.debugLineNum = 3670224;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._idchecksub);
RDebugUtils.currentLine=3670225;
 //BA.debugLineNum = 3670225;BA.debugLine="ExecuteRemoteQuery(\"SELECT E.educational_bui";
_executeremotequery("SELECT E.educational_building_id, E.name_of_educational_building, ST_X(ST_Centroid(E.geom)) AS lng, ST_Y(ST_CENTROID(E.geom)) AS lat FROM educational_building As E JOIN detail_educational_building_facilities As F on E.educational_building_id=F.educational_building_id	WHERE F.facility_id IN ("+mostCurrent._idchecksub+") GROUP BY F.educational_building_id, E.educational_building_id, E.name_of_educational_building HAVING COUNT(*) = "+BA.NumberToString(_count)+"",_idspin);
 break; }
case 5: {
RDebugUtils.currentLine=3670227;
 //BA.debugLineNum = 3670227;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?awal="+mostCurrent._fromtext.getText()+"&akhir="+mostCurrent._totext.getText());
RDebugUtils.currentLine=3670228;
 //BA.debugLineNum = 3670228;BA.debugLine="ExecuteRemoteQuery(\"SELECT educational_buildi";
_executeremotequery("SELECT educational_building_id, name_of_educational_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM educational_building WHERE land_area BETWEEN "+mostCurrent._fromtext.getText()+" AND "+mostCurrent._totext.getText()+" ORDER BY name_of_educational_building",_idspin);
 break; }
case 6: {
RDebugUtils.currentLine=3670230;
 //BA.debugLineNum = 3670230;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?awal="+mostCurrent._fromtext.getText()+"&akhir="+mostCurrent._totext.getText());
RDebugUtils.currentLine=3670231;
 //BA.debugLineNum = 3670231;BA.debugLine="ExecuteRemoteQuery(\"SELECT educational_buildi";
_executeremotequery("SELECT educational_building_id, name_of_educational_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM educational_building WHERE building_area BETWEEN "+mostCurrent._fromtext.getText()+" AND "+mostCurrent._totext.getText()+" ORDER BY name_of_educational_building",_idspin);
 break; }
case 7: {
RDebugUtils.currentLine=3670233;
 //BA.debugLineNum = 3670233;BA.debugLine="If Main.kvs.ContainsKey(\"Lat\") == False And M";
if (mostCurrent._main._kvs._containskey("Lat")==anywheresoftware.b4a.keywords.Common.False && mostCurrent._main._kvs._containskey("Long")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3670234;
 //BA.debugLineNum = 3670234;BA.debugLine="Msgbox(\"Your location haven't been set\",\"Err";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Your location haven't been set"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670236;
 //BA.debugLineNum = 3670236;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/index_"+mostCurrent._typesrc+".php?lat="+_latitude+"&lng="+_longitude+"&rad="+BA.NumberToString(_radiusku));
RDebugUtils.currentLine=3670237;
 //BA.debugLineNum = 3670237;BA.debugLine="ExecuteRemoteQuery(\"SELECT educational_build";
_executeremotequery("SELECT educational_building_id, name_of_educational_building ,ST_X(ST_CENTROID(geom)) as lon, ST_Y(ST_CENTROID(geom)) as lat, ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("+_longitude+" "+_latitude+")',-1), geom) as jarak	FROM educational_building where ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("+_longitude+" "+_latitude+")',-1), geom) <= "+BA.NumberToString(_radiusku)+" ORDER BY jarak",_idspin);
 };
 break; }
}
;
 break; }
case 5: {
RDebugUtils.currentLine=3670242;
 //BA.debugLineNum = 3670242;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"name","type","jorong","construction","facility","radius","income")) {
case 0: {
RDebugUtils.currentLine=3670244;
 //BA.debugLineNum = 3670244;BA.debugLine="If SearchText.Text == \"\" Then";
if ((mostCurrent._searchtext.getText()).equals("")) { 
RDebugUtils.currentLine=3670245;
 //BA.debugLineNum = 3670245;BA.debugLine="Msgbox(\"Field is empty! Please write somethi";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Field is empty! Please write something in search field."),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=3670246;
 //BA.debugLineNum = 3670246;BA.debugLine="Else If idspin == \"null\" Or idspin == \"\" Then";
if ((_idspin).equals("null") || (_idspin).equals("")) { 
RDebugUtils.currentLine=3670247;
 //BA.debugLineNum = 3670247;BA.debugLine="Msgbox(\"Select the building type to continue";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the building type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=3670248;
 //BA.debugLineNum = 3670248;BA.debugLine="Else If typesrc == \"null\" Or typesrc == \"\" Th";
if ((mostCurrent._typesrc).equals("null") || (mostCurrent._typesrc).equals("")) { 
RDebugUtils.currentLine=3670249;
 //BA.debugLineNum = 3670249;BA.debugLine="Msgbox(\"Select the search type to continue y";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the search type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=3670250;
 //BA.debugLineNum = 3670250;BA.debugLine="Else If SearchText.Text == \"\" And idspin == \"";
if ((mostCurrent._searchtext.getText()).equals("") && (_idspin).equals("") && (mostCurrent._typesrc).equals("")) { 
RDebugUtils.currentLine=3670251;
 //BA.debugLineNum = 3670251;BA.debugLine="Msgbox(\"Please complete all fields!\",\"Warnin";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please complete all fields!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670253;
 //BA.debugLineNum = 3670253;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670254;
 //BA.debugLineNum = 3670254;BA.debugLine="ExecuteRemoteQuery(\"SELECT msme_building_id,";
_executeremotequery("SELECT msme_building_id, name_of_msme_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM msme_building WHERE upper(name_of_msme_building) like '%"+mostCurrent._searchtext.getText().toUpperCase()+"%' order by name_of_msme_building",_idspin);
 }}}}
;
 break; }
case 1: {
RDebugUtils.currentLine=3670258;
 //BA.debugLineNum = 3670258;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
RDebugUtils.currentLine=3670259;
 //BA.debugLineNum = 3670259;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670261;
 //BA.debugLineNum = 3670261;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670262;
 //BA.debugLineNum = 3670262;BA.debugLine="ExecuteRemoteQuery(\"SELECT msme_building_id,";
_executeremotequery("SELECT msme_building_id, name_of_msme_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM msme_building WHERE type_of_msme = '"+mostCurrent._typeid+"' order by name_of_msme_building",_idspin);
 };
 break; }
case 2: {
RDebugUtils.currentLine=3670266;
 //BA.debugLineNum = 3670266;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
RDebugUtils.currentLine=3670267;
 //BA.debugLineNum = 3670267;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670269;
 //BA.debugLineNum = 3670269;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670270;
 //BA.debugLineNum = 3670270;BA.debugLine="ExecuteRemoteQuery(\"SELECT M.msme_building_i";
_executeremotequery("SELECT M.msme_building_id, M.name_of_msme_building, M.geom, ST_X(ST_CENTROID(M.geom)) As longitude, ST_Y(ST_CENTROID(M.geom)) As latitude FROM msme_building As M, jorong As J WHERE ST_CONTAINS(J.geom, M.geom) And J.jorong_id='"+mostCurrent._typeid+"'",_idspin);
 };
 break; }
case 3: {
RDebugUtils.currentLine=3670274;
 //BA.debugLineNum = 3670274;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
RDebugUtils.currentLine=3670275;
 //BA.debugLineNum = 3670275;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670277;
 //BA.debugLineNum = 3670277;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670278;
 //BA.debugLineNum = 3670278;BA.debugLine="ExecuteRemoteQuery(\"SELECT msme_building_id,";
_executeremotequery("SELECT msme_building_id, name_of_msme_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM msme_building WHERE type_of_construction = '"+mostCurrent._typeid+"' order by name_of_msme_building",_idspin);
 };
 break; }
case 4: {
RDebugUtils.currentLine=3670282;
 //BA.debugLineNum = 3670282;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._idchecksub);
RDebugUtils.currentLine=3670283;
 //BA.debugLineNum = 3670283;BA.debugLine="ExecuteRemoteQuery(\"Select M.msme_building_i";
_executeremotequery("Select M.msme_building_id, M.name_of_msme_building, ST_X(ST_Centroid(M.geom)) As lng, ST_Y(ST_CENTROID(M.geom)) As lat FROM msme_building As M JOIN detail_msme_building_facilities As F on M.msme_building_id=F.msme_building_id WHERE F.facility_id IN ("+mostCurrent._idchecksub+") GROUP BY F.msme_building_id, M.msme_building_id, M.name_of_msme_building HAVING COUNT(*) = "+BA.NumberToString(_count)+"",_idspin);
 break; }
case 5: {
RDebugUtils.currentLine=3670285;
 //BA.debugLineNum = 3670285;BA.debugLine="If Main.kvs.ContainsKey(\"Lat\") == False And M";
if (mostCurrent._main._kvs._containskey("Lat")==anywheresoftware.b4a.keywords.Common.False && mostCurrent._main._kvs._containskey("Long")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3670286;
 //BA.debugLineNum = 3670286;BA.debugLine="Msgbox(\"Your location haven't been set\",\"Err";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Your location haven't been set"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670288;
 //BA.debugLineNum = 3670288;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/index_"+mostCurrent._typesrc+".php?lat="+_latitude+"&lng="+_longitude+"&rad="+BA.NumberToString(_radiusku));
RDebugUtils.currentLine=3670289;
 //BA.debugLineNum = 3670289;BA.debugLine="ExecuteRemoteQuery(\"SELECT msme_building_id,";
_executeremotequery("SELECT msme_building_id, name_of_msme_building ,ST_X(ST_CENTROID(geom)) as lon, ST_Y(ST_CENTROID(geom)) as lat,	ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("+_longitude+" "+_latitude+")',-1), geom) as jarak FROM msme_building where ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("+_longitude+" "+_latitude+")',-1), geom) <= "+BA.NumberToString(_radiusku)+" ORDER BY jarak",_idspin);
 };
 break; }
case 6: {
RDebugUtils.currentLine=3670292;
 //BA.debugLineNum = 3670292;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?awal="+mostCurrent._fromtext.getText()+"&akhir="+mostCurrent._totext.getText());
RDebugUtils.currentLine=3670293;
 //BA.debugLineNum = 3670293;BA.debugLine="ExecuteRemoteQuery(\"SELECT msme_building_id,";
_executeremotequery("SELECT msme_building_id, name_of_msme_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) AS latitude FROM msme_building WHERE monthly_income BETWEEN "+mostCurrent._fromtext.getText()+" AND "+mostCurrent._totext.getText()+" ORDER BY name_of_msme_building",_idspin);
 break; }
}
;
 break; }
case 6: {
RDebugUtils.currentLine=3670297;
 //BA.debugLineNum = 3670297;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"id","owner","occupant","fcn owner","fcn occupant","income","tribe","village","datuk","construction","standing year","electric capacity","empty","inhabited","education")) {
case 0: {
RDebugUtils.currentLine=3670299;
 //BA.debugLineNum = 3670299;BA.debugLine="If SearchText.Text == \"\" Then";
if ((mostCurrent._searchtext.getText()).equals("")) { 
RDebugUtils.currentLine=3670300;
 //BA.debugLineNum = 3670300;BA.debugLine="Msgbox(\"Field is empty! Please write somethi";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Field is empty! Please write something in search field."),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=3670301;
 //BA.debugLineNum = 3670301;BA.debugLine="Else If idspin == \"null\" Or idspin == \"\" Then";
if ((_idspin).equals("null") || (_idspin).equals("")) { 
RDebugUtils.currentLine=3670302;
 //BA.debugLineNum = 3670302;BA.debugLine="Msgbox(\"Select the building type to continue";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the building type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=3670303;
 //BA.debugLineNum = 3670303;BA.debugLine="Else If typesrc == \"null\" Or typesrc == \"\" Th";
if ((mostCurrent._typesrc).equals("null") || (mostCurrent._typesrc).equals("")) { 
RDebugUtils.currentLine=3670304;
 //BA.debugLineNum = 3670304;BA.debugLine="Msgbox(\"Select the search type to continue y";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the search type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=3670305;
 //BA.debugLineNum = 3670305;BA.debugLine="Else If SearchText.Text == \"\" And idspin == \"";
if ((mostCurrent._searchtext.getText()).equals("") && (_idspin).equals("") && (mostCurrent._typesrc).equals("")) { 
RDebugUtils.currentLine=3670306;
 //BA.debugLineNum = 3670306;BA.debugLine="Msgbox(\"Please complete all fields!\",\"Warnin";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please complete all fields!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3670308;
 //BA.debugLineNum = 3670308;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._searchtext.getText());
RDebugUtils.currentLine=3670309;
 //BA.debugLineNum = 3670309;BA.debugLine="ExecuteRemoteQuery(\"SELECT house_building_id";
_executeremotequery("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM house_building WHERE upper(house_building_id) like '%"+mostCurrent._searchtext.getText().toUpperCase()+"%' ORDER BY house_building_id",_idspin);
 }}}}
;
 break; }
case 1: {
RDebugUtils.currentLine=3670312;
 //BA.debugLineNum = 3670312;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._searchtext.getText());
RDebugUtils.currentLine=3670313;
 //BA.debugLineNum = 3670313;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
_executeremotequery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN house_building_owner As O ON H.fcn_owner=O.national_identity_number	WHERE upper(O.owner_name) LIKE'%"+mostCurrent._searchtext.getText().toUpperCase()+"%' ORDER BY house_building_id",_idspin);
 break; }
case 2: {
RDebugUtils.currentLine=3670315;
 //BA.debugLineNum = 3670315;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._searchtext.getText());
RDebugUtils.currentLine=3670316;
 //BA.debugLineNum = 3670316;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
_executeremotequery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id	WHERE upper(O.head_of_family) LIKE '%"+mostCurrent._searchtext.getText().toUpperCase()+"%' ORDER BY house_building_id",_idspin);
 break; }
case 3: {
RDebugUtils.currentLine=3670318;
 //BA.debugLineNum = 3670318;BA.debugLine="Msgbox(\"Query belum ada\", \"WARNING\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Query belum ada"),BA.ObjectToCharSequence("WARNING"),mostCurrent.activityBA);
 break; }
case 4: {
RDebugUtils.currentLine=3670320;
 //BA.debugLineNum = 3670320;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?fcn="+mostCurrent._searchtext.getText());
RDebugUtils.currentLine=3670321;
 //BA.debugLineNum = 3670321;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
_executeremotequery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id WHERE upper(O.family_card_number) LIKE '%"+mostCurrent._searchtext.getText().toUpperCase()+"%' ORDER BY house_building_id",_idspin);
 break; }
case 5: {
RDebugUtils.currentLine=3670323;
 //BA.debugLineNum = 3670323;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?awal="+mostCurrent._fromtext.getText()+"&akhir="+mostCurrent._totext.getText());
RDebugUtils.currentLine=3670324;
 //BA.debugLineNum = 3670324;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
_executeremotequery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id	WHERE income BETWEEN "+mostCurrent._fromtext.getText()+" AND "+mostCurrent._totext.getText()+" ORDER BY house_building_id",_idspin);
 break; }
case 6: {
RDebugUtils.currentLine=3670326;
 //BA.debugLineNum = 3670326;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670327;
 //BA.debugLineNum = 3670327;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
_executeremotequery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id JOIN datuk As D ON O.datuk_id=D.datuk_id JOIN tribe As T ON D.tribe_id=T.tribe_id WHERE D.tribe_id = "+mostCurrent._typeid+" ORDER BY house_building_id",_idspin);
 break; }
case 7: {
RDebugUtils.currentLine=3670329;
 //BA.debugLineNum = 3670329;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670330;
 //BA.debugLineNum = 3670330;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
_executeremotequery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id WHERE village_id = "+mostCurrent._typeid+" ORDER BY house_building_id",_idspin);
 break; }
case 8: {
RDebugUtils.currentLine=3670332;
 //BA.debugLineNum = 3670332;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670333;
 //BA.debugLineNum = 3670333;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
_executeremotequery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id	WHERE datuk_id = "+mostCurrent._typeid+" ORDER BY house_building_id",_idspin);
 break; }
case 9: {
RDebugUtils.currentLine=3670335;
 //BA.debugLineNum = 3670335;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670336;
 //BA.debugLineNum = 3670336;BA.debugLine="ExecuteRemoteQuery(\"SELECT house_building_id,";
_executeremotequery("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) AS latitude	FROM house_building WHERE type_of_construction = "+mostCurrent._typeid+" ORDER BY house_building_id",_idspin);
 break; }
case 10: {
RDebugUtils.currentLine=3670338;
 //BA.debugLineNum = 3670338;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?awal="+mostCurrent._fromtext.getText()+"&akhir="+mostCurrent._totext.getText());
RDebugUtils.currentLine=3670339;
 //BA.debugLineNum = 3670339;BA.debugLine="ExecuteRemoteQuery(\"SELECT house_building_id,";
_executeremotequery("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM house_building WHERE standing_year BETWEEN "+mostCurrent._fromtext.getText()+" AND "+mostCurrent._totext.getText()+" ORDER BY house_building_id",_idspin);
 break; }
case 11: {
RDebugUtils.currentLine=3670341;
 //BA.debugLineNum = 3670341;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?awal="+mostCurrent._fromtext.getText()+"&akhir="+mostCurrent._totext.getText());
RDebugUtils.currentLine=3670342;
 //BA.debugLineNum = 3670342;BA.debugLine="ExecuteRemoteQuery(\"SELECT house_building_id,";
_executeremotequery("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) AS latitude	FROM house_building WHERE electricity_capacity BETWEEN "+mostCurrent._fromtext.getText()+" AND "+mostCurrent._totext.getText()+" ORDER BY house_building_id",_idspin);
 break; }
case 12: {
RDebugUtils.currentLine=3670344;
 //BA.debugLineNum = 3670344;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php");
RDebugUtils.currentLine=3670345;
 //BA.debugLineNum = 3670345;BA.debugLine="ExecuteRemoteQuery(\"SELECT house_building_id,";
_executeremotequery("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM house_building WHERE building_status=0",_idspin);
 break; }
case 13: {
RDebugUtils.currentLine=3670347;
 //BA.debugLineNum = 3670347;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php");
RDebugUtils.currentLine=3670348;
 //BA.debugLineNum = 3670348;BA.debugLine="ExecuteRemoteQuery(\"SELECT house_building_id,";
_executeremotequery("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) AS latitude FROM house_building WHERE building_status=1",_idspin);
 break; }
case 14: {
RDebugUtils.currentLine=3670350;
 //BA.debugLineNum = 3670350;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
RDebugUtils.currentLine=3670351;
 //BA.debugLineNum = 3670351;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
_executeremotequery("SELECT H.house_building_id, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id	WHERE educational_id = "+mostCurrent._typeid+" ORDER BY house_building_id",_idspin);
 break; }
}
;
 break; }
}
;
RDebugUtils.currentLine=3670356;
 //BA.debugLineNum = 3670356;BA.debugLine="End Sub";
return "";
}
public static String  _searchradius_valuechanged(int _value,boolean _userchanged) throws Exception{
RDebugUtils.currentModule="searchbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "searchradius_valuechanged"))
	return (String) Debug.delegate(mostCurrent.activityBA, "searchradius_valuechanged", new Object[] {_value,_userchanged});
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Sub SearchRadius_ValueChanged (Value As Int, UserC";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="If UserChanged Then";
if (_userchanged) { 
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="radiusku = Value";
_radiusku = _value;
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="Label3.Text = Value";
mostCurrent._label3.setText(BA.ObjectToCharSequence(_value));
 };
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="Label3.Text = Value&\" m\"";
mostCurrent._label3.setText(BA.ObjectToCharSequence(BA.NumberToString(_value)+" m"));
RDebugUtils.currentLine=4128774;
 //BA.debugLineNum = 4128774;BA.debugLine="Log(radiusku)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_radiusku));
RDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="End Sub";
return "";
}
public static String  _spinbuilding_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="searchbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinbuilding_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "spinbuilding_itemclick", new Object[] {_position,_value});
String _id = "";
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub SpinBuilding_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="Dim id As String";
_id = "";
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="id = spinnerMapB.Get(Value)";
_id = BA.ObjectToString(mostCurrent._spinnermapb.Get(_value));
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="idspin = id";
_idspin = _id;
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="Log(idspin)";
anywheresoftware.b4a.keywords.Common.Log(_idspin);
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="SpinSearch.Clear";
mostCurrent._spinsearch.Clear();
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="spinnerMap.Initialize";
mostCurrent._spinnermap.Initialize();
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"All","Worship","Msme","Office","Health","House","Educational")) {
case 0: {
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="SpinSearch.Enabled = True";
mostCurrent._spinsearch.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3866634;
 //BA.debugLineNum = 3866634;BA.debugLine="SpinSearch.add(\"Select Search Type\")";
mostCurrent._spinsearch.Add("Select Search Type");
RDebugUtils.currentLine=3866635;
 //BA.debugLineNum = 3866635;BA.debugLine="SpinSearch.Add(\"Model\")";
mostCurrent._spinsearch.Add("Model");
RDebugUtils.currentLine=3866636;
 //BA.debugLineNum = 3866636;BA.debugLine="spinnerMap.Put(\"Model\",\"model\")";
mostCurrent._spinnermap.Put((Object)("Model"),(Object)("model"));
 break; }
case 1: {
RDebugUtils.currentLine=3866639;
 //BA.debugLineNum = 3866639;BA.debugLine="SpinSearch.Enabled = True";
mostCurrent._spinsearch.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3866640;
 //BA.debugLineNum = 3866640;BA.debugLine="SpinSearch.add(\"Select Search Type\")";
mostCurrent._spinsearch.Add("Select Search Type");
RDebugUtils.currentLine=3866641;
 //BA.debugLineNum = 3866641;BA.debugLine="SpinSearch.Add(\"Name\")";
mostCurrent._spinsearch.Add("Name");
RDebugUtils.currentLine=3866642;
 //BA.debugLineNum = 3866642;BA.debugLine="spinnerMap.Put(\"Name\",\"name\")";
mostCurrent._spinnermap.Put((Object)("Name"),(Object)("name"));
RDebugUtils.currentLine=3866643;
 //BA.debugLineNum = 3866643;BA.debugLine="SpinSearch.Add(\"Radius\")";
mostCurrent._spinsearch.Add("Radius");
RDebugUtils.currentLine=3866644;
 //BA.debugLineNum = 3866644;BA.debugLine="spinnerMap.Put(\"Radius\",\"radius\")";
mostCurrent._spinnermap.Put((Object)("Radius"),(Object)("radius"));
RDebugUtils.currentLine=3866645;
 //BA.debugLineNum = 3866645;BA.debugLine="SpinSearch.Add(\"Type\")";
mostCurrent._spinsearch.Add("Type");
RDebugUtils.currentLine=3866646;
 //BA.debugLineNum = 3866646;BA.debugLine="spinnerMap.Put(\"Type\",\"type\")";
mostCurrent._spinnermap.Put((Object)("Type"),(Object)("type"));
RDebugUtils.currentLine=3866647;
 //BA.debugLineNum = 3866647;BA.debugLine="SpinSearch.Add(\"Jorong\")";
mostCurrent._spinsearch.Add("Jorong");
RDebugUtils.currentLine=3866648;
 //BA.debugLineNum = 3866648;BA.debugLine="spinnerMap.Put(\"Jorong\",\"jorong\")";
mostCurrent._spinnermap.Put((Object)("Jorong"),(Object)("jorong"));
RDebugUtils.currentLine=3866649;
 //BA.debugLineNum = 3866649;BA.debugLine="SpinSearch.Add(\"Construction\")";
mostCurrent._spinsearch.Add("Construction");
RDebugUtils.currentLine=3866650;
 //BA.debugLineNum = 3866650;BA.debugLine="spinnerMap.Put(\"Construction\",\"construction\")";
mostCurrent._spinnermap.Put((Object)("Construction"),(Object)("construction"));
RDebugUtils.currentLine=3866651;
 //BA.debugLineNum = 3866651;BA.debugLine="SpinSearch.Add(\"Facility\")";
mostCurrent._spinsearch.Add("Facility");
RDebugUtils.currentLine=3866652;
 //BA.debugLineNum = 3866652;BA.debugLine="spinnerMap.Put(\"Facility\",\"facility\")";
mostCurrent._spinnermap.Put((Object)("Facility"),(Object)("facility"));
RDebugUtils.currentLine=3866653;
 //BA.debugLineNum = 3866653;BA.debugLine="SpinSearch.Add(\"Land Area\")";
mostCurrent._spinsearch.Add("Land Area");
RDebugUtils.currentLine=3866654;
 //BA.debugLineNum = 3866654;BA.debugLine="spinnerMap.Put(\"Land Area\",\"land area\")";
mostCurrent._spinnermap.Put((Object)("Land Area"),(Object)("land area"));
RDebugUtils.currentLine=3866655;
 //BA.debugLineNum = 3866655;BA.debugLine="SpinSearch.Add(\"Building Area\")";
mostCurrent._spinsearch.Add("Building Area");
RDebugUtils.currentLine=3866656;
 //BA.debugLineNum = 3866656;BA.debugLine="spinnerMap.Put(\"Building Area\",\"building area\")";
mostCurrent._spinnermap.Put((Object)("Building Area"),(Object)("building area"));
RDebugUtils.currentLine=3866657;
 //BA.debugLineNum = 3866657;BA.debugLine="SpinSearch.Add(\"Standing Year\")";
mostCurrent._spinsearch.Add("Standing Year");
RDebugUtils.currentLine=3866658;
 //BA.debugLineNum = 3866658;BA.debugLine="spinnerMap.Put(\"Standing Year\",\"standing year\")";
mostCurrent._spinnermap.Put((Object)("Standing Year"),(Object)("standing year"));
 break; }
case 2: 
case 3: {
RDebugUtils.currentLine=3866661;
 //BA.debugLineNum = 3866661;BA.debugLine="SpinSearch.Enabled = True";
mostCurrent._spinsearch.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3866662;
 //BA.debugLineNum = 3866662;BA.debugLine="SpinSearch.add(\"Select Search Type\")";
mostCurrent._spinsearch.Add("Select Search Type");
RDebugUtils.currentLine=3866663;
 //BA.debugLineNum = 3866663;BA.debugLine="SpinSearch.Add(\"Name\")";
mostCurrent._spinsearch.Add("Name");
RDebugUtils.currentLine=3866664;
 //BA.debugLineNum = 3866664;BA.debugLine="spinnerMap.Put(\"Name\",\"name\")";
mostCurrent._spinnermap.Put((Object)("Name"),(Object)("name"));
RDebugUtils.currentLine=3866665;
 //BA.debugLineNum = 3866665;BA.debugLine="SpinSearch.Add(\"Radius\")";
mostCurrent._spinsearch.Add("Radius");
RDebugUtils.currentLine=3866666;
 //BA.debugLineNum = 3866666;BA.debugLine="spinnerMap.Put(\"Radius\",\"radius\")";
mostCurrent._spinnermap.Put((Object)("Radius"),(Object)("radius"));
RDebugUtils.currentLine=3866667;
 //BA.debugLineNum = 3866667;BA.debugLine="SpinSearch.Add(\"Type\")";
mostCurrent._spinsearch.Add("Type");
RDebugUtils.currentLine=3866668;
 //BA.debugLineNum = 3866668;BA.debugLine="spinnerMap.Put(\"Type\",\"type\")";
mostCurrent._spinnermap.Put((Object)("Type"),(Object)("type"));
RDebugUtils.currentLine=3866669;
 //BA.debugLineNum = 3866669;BA.debugLine="SpinSearch.Add(\"Jorong\")";
mostCurrent._spinsearch.Add("Jorong");
RDebugUtils.currentLine=3866670;
 //BA.debugLineNum = 3866670;BA.debugLine="spinnerMap.Put(\"Jorong\",\"jorong\")";
mostCurrent._spinnermap.Put((Object)("Jorong"),(Object)("jorong"));
RDebugUtils.currentLine=3866671;
 //BA.debugLineNum = 3866671;BA.debugLine="If File.Exists(datapath,\"datastore\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._datapath,"datastore")) { 
RDebugUtils.currentLine=3866672;
 //BA.debugLineNum = 3866672;BA.debugLine="If Main.kvs.ContainsKey(\"role\") == True Then";
if (mostCurrent._main._kvs._containskey("role")==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=3866673;
 //BA.debugLineNum = 3866673;BA.debugLine="SpinSearch.Add(\"Income\")";
mostCurrent._spinsearch.Add("Income");
RDebugUtils.currentLine=3866674;
 //BA.debugLineNum = 3866674;BA.debugLine="spinnerMap.Put(\"Income\",\"income\")";
mostCurrent._spinnermap.Put((Object)("Income"),(Object)("income"));
 };
 };
RDebugUtils.currentLine=3866677;
 //BA.debugLineNum = 3866677;BA.debugLine="SpinSearch.Add(\"Construction\")";
mostCurrent._spinsearch.Add("Construction");
RDebugUtils.currentLine=3866678;
 //BA.debugLineNum = 3866678;BA.debugLine="spinnerMap.Put(\"Construction\",\"construction\")";
mostCurrent._spinnermap.Put((Object)("Construction"),(Object)("construction"));
RDebugUtils.currentLine=3866679;
 //BA.debugLineNum = 3866679;BA.debugLine="SpinSearch.Add(\"Facility\")";
mostCurrent._spinsearch.Add("Facility");
RDebugUtils.currentLine=3866680;
 //BA.debugLineNum = 3866680;BA.debugLine="spinnerMap.Put(\"Facility\",\"facility\")";
mostCurrent._spinnermap.Put((Object)("Facility"),(Object)("facility"));
 break; }
case 4: {
RDebugUtils.currentLine=3866683;
 //BA.debugLineNum = 3866683;BA.debugLine="SpinSearch.Enabled = True";
mostCurrent._spinsearch.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3866684;
 //BA.debugLineNum = 3866684;BA.debugLine="SpinSearch.add(\"Select Search Type\")";
mostCurrent._spinsearch.Add("Select Search Type");
RDebugUtils.currentLine=3866685;
 //BA.debugLineNum = 3866685;BA.debugLine="SpinSearch.Add(\"Name\")";
mostCurrent._spinsearch.Add("Name");
RDebugUtils.currentLine=3866686;
 //BA.debugLineNum = 3866686;BA.debugLine="spinnerMap.Put(\"Name\",\"name\")";
mostCurrent._spinnermap.Put((Object)("Name"),(Object)("name"));
RDebugUtils.currentLine=3866687;
 //BA.debugLineNum = 3866687;BA.debugLine="SpinSearch.Add(\"Radius\")";
mostCurrent._spinsearch.Add("Radius");
RDebugUtils.currentLine=3866688;
 //BA.debugLineNum = 3866688;BA.debugLine="spinnerMap.Put(\"Radius\",\"radius\")";
mostCurrent._spinnermap.Put((Object)("Radius"),(Object)("radius"));
RDebugUtils.currentLine=3866689;
 //BA.debugLineNum = 3866689;BA.debugLine="SpinSearch.Add(\"Type\")";
mostCurrent._spinsearch.Add("Type");
RDebugUtils.currentLine=3866690;
 //BA.debugLineNum = 3866690;BA.debugLine="spinnerMap.Put(\"Type\",\"type\")";
mostCurrent._spinnermap.Put((Object)("Type"),(Object)("type"));
RDebugUtils.currentLine=3866691;
 //BA.debugLineNum = 3866691;BA.debugLine="SpinSearch.Add(\"Jorong\")";
mostCurrent._spinsearch.Add("Jorong");
RDebugUtils.currentLine=3866692;
 //BA.debugLineNum = 3866692;BA.debugLine="spinnerMap.Put(\"Jorong\",\"jorong\")";
mostCurrent._spinnermap.Put((Object)("Jorong"),(Object)("jorong"));
RDebugUtils.currentLine=3866693;
 //BA.debugLineNum = 3866693;BA.debugLine="SpinSearch.Add(\"Facility\")";
mostCurrent._spinsearch.Add("Facility");
RDebugUtils.currentLine=3866694;
 //BA.debugLineNum = 3866694;BA.debugLine="spinnerMap.Put(\"Facility\",\"facility\")";
mostCurrent._spinnermap.Put((Object)("Facility"),(Object)("facility"));
 break; }
case 5: {
RDebugUtils.currentLine=3866697;
 //BA.debugLineNum = 3866697;BA.debugLine="SpinSearch.Enabled = True";
mostCurrent._spinsearch.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3866698;
 //BA.debugLineNum = 3866698;BA.debugLine="SpinSearch.add(\"Select Search Type\")";
mostCurrent._spinsearch.Add("Select Search Type");
RDebugUtils.currentLine=3866699;
 //BA.debugLineNum = 3866699;BA.debugLine="SpinSearch.Add(\"ID Rumah\")";
mostCurrent._spinsearch.Add("ID Rumah");
RDebugUtils.currentLine=3866700;
 //BA.debugLineNum = 3866700;BA.debugLine="spinnerMap.Put(\"ID Rumah\",\"id\")";
mostCurrent._spinnermap.Put((Object)("ID Rumah"),(Object)("id"));
RDebugUtils.currentLine=3866701;
 //BA.debugLineNum = 3866701;BA.debugLine="If File.Exists(datapath,\"datastore\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._datapath,"datastore")) { 
RDebugUtils.currentLine=3866702;
 //BA.debugLineNum = 3866702;BA.debugLine="If Main.kvs.ContainsKey(\"role\") Then";
if (mostCurrent._main._kvs._containskey("role")) { 
RDebugUtils.currentLine=3866703;
 //BA.debugLineNum = 3866703;BA.debugLine="SpinSearch.Add(\"Owner\")";
mostCurrent._spinsearch.Add("Owner");
RDebugUtils.currentLine=3866704;
 //BA.debugLineNum = 3866704;BA.debugLine="spinnerMap.Put(\"Owner\",\"owner\")";
mostCurrent._spinnermap.Put((Object)("Owner"),(Object)("owner"));
RDebugUtils.currentLine=3866705;
 //BA.debugLineNum = 3866705;BA.debugLine="SpinSearch.Add(\"Occupant\")";
mostCurrent._spinsearch.Add("Occupant");
RDebugUtils.currentLine=3866706;
 //BA.debugLineNum = 3866706;BA.debugLine="spinnerMap.Put(\"Occupant\",\"occupant\")";
mostCurrent._spinnermap.Put((Object)("Occupant"),(Object)("occupant"));
RDebugUtils.currentLine=3866707;
 //BA.debugLineNum = 3866707;BA.debugLine="SpinSearch.Add(\"FCN Owner\")";
mostCurrent._spinsearch.Add("FCN Owner");
RDebugUtils.currentLine=3866708;
 //BA.debugLineNum = 3866708;BA.debugLine="spinnerMap.Put(\"FCN Owner\",\"fcn owner\")";
mostCurrent._spinnermap.Put((Object)("FCN Owner"),(Object)("fcn owner"));
RDebugUtils.currentLine=3866709;
 //BA.debugLineNum = 3866709;BA.debugLine="SpinSearch.Add(\"FCN Occupant\")";
mostCurrent._spinsearch.Add("FCN Occupant");
RDebugUtils.currentLine=3866710;
 //BA.debugLineNum = 3866710;BA.debugLine="spinnerMap.Put(\"FCN Occupant\",\"fcn occupant\")";
mostCurrent._spinnermap.Put((Object)("FCN Occupant"),(Object)("fcn occupant"));
RDebugUtils.currentLine=3866711;
 //BA.debugLineNum = 3866711;BA.debugLine="SpinSearch.Add(\"Income\")";
mostCurrent._spinsearch.Add("Income");
RDebugUtils.currentLine=3866712;
 //BA.debugLineNum = 3866712;BA.debugLine="spinnerMap.Put(\"Income\",\"income\")";
mostCurrent._spinnermap.Put((Object)("Income"),(Object)("income"));
RDebugUtils.currentLine=3866713;
 //BA.debugLineNum = 3866713;BA.debugLine="SpinSearch.Add(\"Datuk\")";
mostCurrent._spinsearch.Add("Datuk");
RDebugUtils.currentLine=3866714;
 //BA.debugLineNum = 3866714;BA.debugLine="spinnerMap.Put(\"Datuk\",\"datuk\")";
mostCurrent._spinnermap.Put((Object)("Datuk"),(Object)("datuk"));
RDebugUtils.currentLine=3866715;
 //BA.debugLineNum = 3866715;BA.debugLine="SpinSearch.Add(\"Tribe\")";
mostCurrent._spinsearch.Add("Tribe");
RDebugUtils.currentLine=3866716;
 //BA.debugLineNum = 3866716;BA.debugLine="spinnerMap.Put(\"Tribe\",\"tribe\")";
mostCurrent._spinnermap.Put((Object)("Tribe"),(Object)("tribe"));
RDebugUtils.currentLine=3866717;
 //BA.debugLineNum = 3866717;BA.debugLine="SpinSearch.Add(\"Village\")";
mostCurrent._spinsearch.Add("Village");
RDebugUtils.currentLine=3866718;
 //BA.debugLineNum = 3866718;BA.debugLine="spinnerMap.Put(\"Village\",\"village\")";
mostCurrent._spinnermap.Put((Object)("Village"),(Object)("village"));
RDebugUtils.currentLine=3866719;
 //BA.debugLineNum = 3866719;BA.debugLine="SpinSearch.Add(\"Construction\")";
mostCurrent._spinsearch.Add("Construction");
RDebugUtils.currentLine=3866720;
 //BA.debugLineNum = 3866720;BA.debugLine="spinnerMap.Put(\"Construction\",\"construction\")";
mostCurrent._spinnermap.Put((Object)("Construction"),(Object)("construction"));
RDebugUtils.currentLine=3866721;
 //BA.debugLineNum = 3866721;BA.debugLine="SpinSearch.Add(\"Standing Year\")";
mostCurrent._spinsearch.Add("Standing Year");
RDebugUtils.currentLine=3866722;
 //BA.debugLineNum = 3866722;BA.debugLine="spinnerMap.Put(\"Standing Year\",\"standing year";
mostCurrent._spinnermap.Put((Object)("Standing Year"),(Object)("standing year"));
RDebugUtils.currentLine=3866723;
 //BA.debugLineNum = 3866723;BA.debugLine="SpinSearch.Add(\"Electric Capacity\")";
mostCurrent._spinsearch.Add("Electric Capacity");
RDebugUtils.currentLine=3866724;
 //BA.debugLineNum = 3866724;BA.debugLine="spinnerMap.Put(\"Electric Capacity\",\"electric";
mostCurrent._spinnermap.Put((Object)("Electric Capacity"),(Object)("electric capacity"));
RDebugUtils.currentLine=3866725;
 //BA.debugLineNum = 3866725;BA.debugLine="SpinSearch.Add(\"Education\")";
mostCurrent._spinsearch.Add("Education");
RDebugUtils.currentLine=3866726;
 //BA.debugLineNum = 3866726;BA.debugLine="spinnerMap.Put(\"Education\",\"education\")";
mostCurrent._spinnermap.Put((Object)("Education"),(Object)("education"));
RDebugUtils.currentLine=3866727;
 //BA.debugLineNum = 3866727;BA.debugLine="SpinSearch.Add(\"Inhabited House\")";
mostCurrent._spinsearch.Add("Inhabited House");
RDebugUtils.currentLine=3866728;
 //BA.debugLineNum = 3866728;BA.debugLine="spinnerMap.Put(\"Inhabited House\",\"inhabited\")";
mostCurrent._spinnermap.Put((Object)("Inhabited House"),(Object)("inhabited"));
RDebugUtils.currentLine=3866729;
 //BA.debugLineNum = 3866729;BA.debugLine="SpinSearch.Add(\"Empty House\")";
mostCurrent._spinsearch.Add("Empty House");
RDebugUtils.currentLine=3866730;
 //BA.debugLineNum = 3866730;BA.debugLine="spinnerMap.Put(\"Empty House\",\"empty\")";
mostCurrent._spinnermap.Put((Object)("Empty House"),(Object)("empty"));
 };
 };
 break; }
case 6: {
RDebugUtils.currentLine=3866735;
 //BA.debugLineNum = 3866735;BA.debugLine="SpinSearch.Enabled = True";
mostCurrent._spinsearch.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3866736;
 //BA.debugLineNum = 3866736;BA.debugLine="SpinSearch.add(\"Select Search Type\")";
mostCurrent._spinsearch.Add("Select Search Type");
RDebugUtils.currentLine=3866737;
 //BA.debugLineNum = 3866737;BA.debugLine="SpinSearch.Add(\"Name\")";
mostCurrent._spinsearch.Add("Name");
RDebugUtils.currentLine=3866738;
 //BA.debugLineNum = 3866738;BA.debugLine="spinnerMap.Put(\"Name\",\"name\")";
mostCurrent._spinnermap.Put((Object)("Name"),(Object)("name"));
RDebugUtils.currentLine=3866739;
 //BA.debugLineNum = 3866739;BA.debugLine="SpinSearch.Add(\"Radius\")";
mostCurrent._spinsearch.Add("Radius");
RDebugUtils.currentLine=3866740;
 //BA.debugLineNum = 3866740;BA.debugLine="spinnerMap.Put(\"Radius\",\"radius\")";
mostCurrent._spinnermap.Put((Object)("Radius"),(Object)("radius"));
RDebugUtils.currentLine=3866741;
 //BA.debugLineNum = 3866741;BA.debugLine="SpinSearch.Add(\"Type\")";
mostCurrent._spinsearch.Add("Type");
RDebugUtils.currentLine=3866742;
 //BA.debugLineNum = 3866742;BA.debugLine="spinnerMap.Put(\"Type\",\"type\")";
mostCurrent._spinnermap.Put((Object)("Type"),(Object)("type"));
RDebugUtils.currentLine=3866743;
 //BA.debugLineNum = 3866743;BA.debugLine="SpinSearch.Add(\"Status\")";
mostCurrent._spinsearch.Add("Status");
RDebugUtils.currentLine=3866744;
 //BA.debugLineNum = 3866744;BA.debugLine="spinnerMap.Put(\"Status\",\"status\")";
mostCurrent._spinnermap.Put((Object)("Status"),(Object)("status"));
RDebugUtils.currentLine=3866745;
 //BA.debugLineNum = 3866745;BA.debugLine="SpinSearch.Add(\"Jorong\")";
mostCurrent._spinsearch.Add("Jorong");
RDebugUtils.currentLine=3866746;
 //BA.debugLineNum = 3866746;BA.debugLine="spinnerMap.Put(\"Jorong\",\"jorong\")";
mostCurrent._spinnermap.Put((Object)("Jorong"),(Object)("jorong"));
RDebugUtils.currentLine=3866747;
 //BA.debugLineNum = 3866747;BA.debugLine="SpinSearch.Add(\"Construction\")";
mostCurrent._spinsearch.Add("Construction");
RDebugUtils.currentLine=3866748;
 //BA.debugLineNum = 3866748;BA.debugLine="spinnerMap.Put(\"Construction\",\"construction\")";
mostCurrent._spinnermap.Put((Object)("Construction"),(Object)("construction"));
RDebugUtils.currentLine=3866749;
 //BA.debugLineNum = 3866749;BA.debugLine="SpinSearch.Add(\"Facility\")";
mostCurrent._spinsearch.Add("Facility");
RDebugUtils.currentLine=3866750;
 //BA.debugLineNum = 3866750;BA.debugLine="spinnerMap.Put(\"Facility\",\"facility\")";
mostCurrent._spinnermap.Put((Object)("Facility"),(Object)("facility"));
RDebugUtils.currentLine=3866751;
 //BA.debugLineNum = 3866751;BA.debugLine="SpinSearch.Add(\"Land Area\")";
mostCurrent._spinsearch.Add("Land Area");
RDebugUtils.currentLine=3866752;
 //BA.debugLineNum = 3866752;BA.debugLine="spinnerMap.Put(\"Land Area\",\"land area\")";
mostCurrent._spinnermap.Put((Object)("Land Area"),(Object)("land area"));
RDebugUtils.currentLine=3866753;
 //BA.debugLineNum = 3866753;BA.debugLine="SpinSearch.Add(\"Building Area\")";
mostCurrent._spinsearch.Add("Building Area");
RDebugUtils.currentLine=3866754;
 //BA.debugLineNum = 3866754;BA.debugLine="spinnerMap.Put(\"Building Area\",\"building area\")";
mostCurrent._spinnermap.Put((Object)("Building Area"),(Object)("building area"));
 break; }
default: {
RDebugUtils.currentLine=3866757;
 //BA.debugLineNum = 3866757;BA.debugLine="SpinSearch.Clear";
mostCurrent._spinsearch.Clear();
RDebugUtils.currentLine=3866758;
 //BA.debugLineNum = 3866758;BA.debugLine="SpinJorong.Clear";
mostCurrent._spinjorong.Clear();
RDebugUtils.currentLine=3866759;
 //BA.debugLineNum = 3866759;BA.debugLine="SpinSearch.Enabled = False";
mostCurrent._spinsearch.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3866760;
 //BA.debugLineNum = 3866760;BA.debugLine="SpinJorong.Visible = False";
mostCurrent._spinjorong.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3866761;
 //BA.debugLineNum = 3866761;BA.debugLine="SearchRadius.Visible = False";
mostCurrent._searchradius.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3866762;
 //BA.debugLineNum = 3866762;BA.debugLine="SearchText.Visible = True";
mostCurrent._searchtext.setVisible(anywheresoftware.b4a.keywords.Common.True);
 break; }
}
;
RDebugUtils.currentLine=3866765;
 //BA.debugLineNum = 3866765;BA.debugLine="SpinSearch.SelectedIndex=0";
mostCurrent._spinsearch.setSelectedIndex((int) (0));
RDebugUtils.currentLine=3866766;
 //BA.debugLineNum = 3866766;BA.debugLine="SpinJorong.Clear";
mostCurrent._spinjorong.Clear();
RDebugUtils.currentLine=3866767;
 //BA.debugLineNum = 3866767;BA.debugLine="SpinType.Clear";
mostCurrent._spintype.Clear();
RDebugUtils.currentLine=3866768;
 //BA.debugLineNum = 3866768;BA.debugLine="End Sub";
return "";
}
public static String  _spinsearch_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="searchbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinsearch_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "spinsearch_itemclick", new Object[] {_position,_value});
String _id = "";
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub SpinSearch_ItemClick (Position As Int, Value A";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Dim id As String";
_id = "";
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="id = spinnerMap.Get(Value)";
_id = BA.ObjectToString(mostCurrent._spinnermap.Get(_value));
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="typesrc = id";
mostCurrent._typesrc = _id;
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="Log(typesrc)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._typesrc);
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="SpinJorong.SelectedIndex = 0";
mostCurrent._spinjorong.setSelectedIndex((int) (0));
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"null","radius","jorong","type","construction","status","model","tribe","village","datuk","education","facility","land area","building area","standing year","income","electric capacity")) {
case 0: {
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="Label3.Visible=False";
mostCurrent._label3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="FromText.Visible=False";
mostCurrent._fromtext.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="ToText.Visible=False";
mostCurrent._totext.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932171;
 //BA.debugLineNum = 3932171;BA.debugLine="FacilityBtn.Visible=False";
mostCurrent._facilitybtn.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932172;
 //BA.debugLineNum = 3932172;BA.debugLine="SearchText.Enabled = False";
mostCurrent._searchtext.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932173;
 //BA.debugLineNum = 3932173;BA.debugLine="SearchText.Visible = True";
mostCurrent._searchtext.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3932174;
 //BA.debugLineNum = 3932174;BA.debugLine="SearchRadius.Visible = False";
mostCurrent._searchradius.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932175;
 //BA.debugLineNum = 3932175;BA.debugLine="SpinJorong.Visible = False";
mostCurrent._spinjorong.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932176;
 //BA.debugLineNum = 3932176;BA.debugLine="SpinType.Visible = False";
mostCurrent._spintype.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932177;
 //BA.debugLineNum = 3932177;BA.debugLine="SearchTextPanel.Color = Colors.White";
mostCurrent._searchtextpanel.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=3932178;
 //BA.debugLineNum = 3932178;BA.debugLine="SearchText.Text = \"\"";
mostCurrent._searchtext.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3932179;
 //BA.debugLineNum = 3932179;BA.debugLine="SpinJorong.Clear";
mostCurrent._spinjorong.Clear();
RDebugUtils.currentLine=3932180;
 //BA.debugLineNum = 3932180;BA.debugLine="SpinType.Clear";
mostCurrent._spintype.Clear();
 break; }
case 1: {
RDebugUtils.currentLine=3932183;
 //BA.debugLineNum = 3932183;BA.debugLine="Label3.Visible=True";
mostCurrent._label3.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3932184;
 //BA.debugLineNum = 3932184;BA.debugLine="FromText.Visible=False";
mostCurrent._fromtext.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932185;
 //BA.debugLineNum = 3932185;BA.debugLine="ToText.Visible=False";
mostCurrent._totext.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932186;
 //BA.debugLineNum = 3932186;BA.debugLine="FacilityBtn.Visible=False";
mostCurrent._facilitybtn.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932187;
 //BA.debugLineNum = 3932187;BA.debugLine="SearchText.Visible = False";
mostCurrent._searchtext.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932188;
 //BA.debugLineNum = 3932188;BA.debugLine="SpinJorong.Visible = False";
mostCurrent._spinjorong.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932189;
 //BA.debugLineNum = 3932189;BA.debugLine="SearchRadius.Visible = True";
mostCurrent._searchradius.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3932190;
 //BA.debugLineNum = 3932190;BA.debugLine="SearchRadius.Max = 10000";
mostCurrent._searchradius.setMax((int) (10000));
RDebugUtils.currentLine=3932191;
 //BA.debugLineNum = 3932191;BA.debugLine="SpinType.Visible = False";
mostCurrent._spintype.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932192;
 //BA.debugLineNum = 3932192;BA.debugLine="SpinType.Clear";
mostCurrent._spintype.Clear();
RDebugUtils.currentLine=3932193;
 //BA.debugLineNum = 3932193;BA.debugLine="SearchTextPanel.Color = Colors.Transparent";
mostCurrent._searchtextpanel.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=3932194;
 //BA.debugLineNum = 3932194;BA.debugLine="SpinJorong.Clear";
mostCurrent._spinjorong.Clear();
 break; }
case 2: 
case 3: 
case 4: 
case 5: 
case 6: 
case 7: 
case 8: 
case 9: 
case 10: {
RDebugUtils.currentLine=3932197;
 //BA.debugLineNum = 3932197;BA.debugLine="FromText.Visible=False";
mostCurrent._fromtext.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932198;
 //BA.debugLineNum = 3932198;BA.debugLine="ToText.Visible=False";
mostCurrent._totext.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932199;
 //BA.debugLineNum = 3932199;BA.debugLine="SearchTextPanel.Color = Colors.White";
mostCurrent._searchtextpanel.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=3932200;
 //BA.debugLineNum = 3932200;BA.debugLine="SpinType.Visible = True";
mostCurrent._spintype.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3932201;
 //BA.debugLineNum = 3932201;BA.debugLine="SpinType.Clear";
mostCurrent._spintype.Clear();
RDebugUtils.currentLine=3932202;
 //BA.debugLineNum = 3932202;BA.debugLine="CreateSpinType_Item";
_createspintype_item();
RDebugUtils.currentLine=3932203;
 //BA.debugLineNum = 3932203;BA.debugLine="FacilityBtn.Visible=False";
mostCurrent._facilitybtn.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932204;
 //BA.debugLineNum = 3932204;BA.debugLine="SearchText.Visible = False";
mostCurrent._searchtext.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932205;
 //BA.debugLineNum = 3932205;BA.debugLine="SearchRadius.Visible = False";
mostCurrent._searchradius.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932206;
 //BA.debugLineNum = 3932206;BA.debugLine="SpinJorong.Visible = False";
mostCurrent._spinjorong.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932207;
 //BA.debugLineNum = 3932207;BA.debugLine="Label3.Visible=False";
mostCurrent._label3.setVisible(anywheresoftware.b4a.keywords.Common.False);
 break; }
case 11: {
RDebugUtils.currentLine=3932210;
 //BA.debugLineNum = 3932210;BA.debugLine="Label3.Visible=False";
mostCurrent._label3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932211;
 //BA.debugLineNum = 3932211;BA.debugLine="FromText.Visible=False";
mostCurrent._fromtext.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932212;
 //BA.debugLineNum = 3932212;BA.debugLine="ToText.Visible=False";
mostCurrent._totext.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932213;
 //BA.debugLineNum = 3932213;BA.debugLine="FacilityBtn.Visible=True";
mostCurrent._facilitybtn.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3932214;
 //BA.debugLineNum = 3932214;BA.debugLine="SearchText.Visible = False";
mostCurrent._searchtext.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932215;
 //BA.debugLineNum = 3932215;BA.debugLine="SearchRadius.Visible = False";
mostCurrent._searchradius.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932216;
 //BA.debugLineNum = 3932216;BA.debugLine="SpinJorong.Visible = False";
mostCurrent._spinjorong.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932217;
 //BA.debugLineNum = 3932217;BA.debugLine="SpinType.Visible = False";
mostCurrent._spintype.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932218;
 //BA.debugLineNum = 3932218;BA.debugLine="SearchTextPanel.Color = Colors.Transparent";
mostCurrent._searchtextpanel.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=3932219;
 //BA.debugLineNum = 3932219;BA.debugLine="SpinJorong.Clear";
mostCurrent._spinjorong.Clear();
RDebugUtils.currentLine=3932220;
 //BA.debugLineNum = 3932220;BA.debugLine="SpinType.Clear";
mostCurrent._spintype.Clear();
 break; }
case 12: 
case 13: 
case 14: 
case 15: 
case 16: {
RDebugUtils.currentLine=3932223;
 //BA.debugLineNum = 3932223;BA.debugLine="Label3.Visible=False";
mostCurrent._label3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932224;
 //BA.debugLineNum = 3932224;BA.debugLine="FromText.Visible=True";
mostCurrent._fromtext.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3932225;
 //BA.debugLineNum = 3932225;BA.debugLine="ToText.Visible=True";
mostCurrent._totext.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3932226;
 //BA.debugLineNum = 3932226;BA.debugLine="FromText.Text=\"\"";
mostCurrent._fromtext.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3932227;
 //BA.debugLineNum = 3932227;BA.debugLine="ToText.Text=\"\"";
mostCurrent._totext.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3932228;
 //BA.debugLineNum = 3932228;BA.debugLine="FacilityBtn.Visible=False";
mostCurrent._facilitybtn.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932229;
 //BA.debugLineNum = 3932229;BA.debugLine="SearchText.Visible = False";
mostCurrent._searchtext.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932230;
 //BA.debugLineNum = 3932230;BA.debugLine="SearchRadius.Visible = False";
mostCurrent._searchradius.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932231;
 //BA.debugLineNum = 3932231;BA.debugLine="SpinJorong.Visible = False";
mostCurrent._spinjorong.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932232;
 //BA.debugLineNum = 3932232;BA.debugLine="SpinType.Visible = False";
mostCurrent._spintype.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932233;
 //BA.debugLineNum = 3932233;BA.debugLine="SearchTextPanel.Color = Colors.Transparent";
mostCurrent._searchtextpanel.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=3932234;
 //BA.debugLineNum = 3932234;BA.debugLine="SpinJorong.Clear";
mostCurrent._spinjorong.Clear();
RDebugUtils.currentLine=3932235;
 //BA.debugLineNum = 3932235;BA.debugLine="SpinType.Clear";
mostCurrent._spintype.Clear();
 break; }
default: {
RDebugUtils.currentLine=3932238;
 //BA.debugLineNum = 3932238;BA.debugLine="Label3.Visible=False";
mostCurrent._label3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932239;
 //BA.debugLineNum = 3932239;BA.debugLine="FromText.Visible=False";
mostCurrent._fromtext.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932240;
 //BA.debugLineNum = 3932240;BA.debugLine="ToText.Visible=False";
mostCurrent._totext.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932241;
 //BA.debugLineNum = 3932241;BA.debugLine="FacilityBtn.Visible=False";
mostCurrent._facilitybtn.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932242;
 //BA.debugLineNum = 3932242;BA.debugLine="SearchText.Visible = True";
mostCurrent._searchtext.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3932243;
 //BA.debugLineNum = 3932243;BA.debugLine="SearchRadius.Visible = False";
mostCurrent._searchradius.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932244;
 //BA.debugLineNum = 3932244;BA.debugLine="SpinJorong.Visible = False";
mostCurrent._spinjorong.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932245;
 //BA.debugLineNum = 3932245;BA.debugLine="SpinType.Visible = False";
mostCurrent._spintype.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932246;
 //BA.debugLineNum = 3932246;BA.debugLine="SearchTextPanel.Color = Colors.White";
mostCurrent._searchtextpanel.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=3932247;
 //BA.debugLineNum = 3932247;BA.debugLine="SearchText.Text = \"\"";
mostCurrent._searchtext.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3932248;
 //BA.debugLineNum = 3932248;BA.debugLine="SpinJorong.Clear";
mostCurrent._spinjorong.Clear();
RDebugUtils.currentLine=3932249;
 //BA.debugLineNum = 3932249;BA.debugLine="SpinType.Clear";
mostCurrent._spintype.Clear();
 break; }
}
;
RDebugUtils.currentLine=3932251;
 //BA.debugLineNum = 3932251;BA.debugLine="End Sub";
return "";
}
public static String  _spintype_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="searchbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spintype_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "spintype_itemclick", new Object[] {_position,_value});
String _id = "";
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub SpinType_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Dim id As String";
_id = "";
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="id = spinnerMapT.Get(Value)";
_id = BA.ObjectToString(mostCurrent._spinnermapt.Get(_value));
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="typeid = id";
mostCurrent._typeid = _id;
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="Log(typeid)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._typeid);
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="End Sub";
return "";
}
}