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
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.searchbuilding");
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
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.editbuildingfacility _editbuildingfacility = null;
public b4a.example.addbuildingfacility _addbuildingfacility = null;
public b4a.example.educationaledit _educationaledit = null;
public b4a.example.educationaldetail _educationaldetail = null;
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
int _topsearch = 0;
 //BA.debugLineNum = 65;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 68;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
 //BA.debugLineNum = 69;BA.debugLine="ScrollView1.Panel.Width=100%y";
mostCurrent._scrollview1.getPanel().setWidth(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 70;BA.debugLine="ScrollView1.Panel.LoadLayout(\"clvBuildingList\")";
mostCurrent._scrollview1.getPanel().LoadLayout("clvBuildingList",mostCurrent.activityBA);
 //BA.debugLineNum = 71;BA.debugLine="ScrollView1.Color =Colors.White";
mostCurrent._scrollview1.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 73;BA.debugLine="BackArrow.Visible= False";
mostCurrent._backarrow.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 74;BA.debugLine="TitleBar.Text=\"Search Building\"";
mostCurrent._titlebar.setText(BA.ObjectToCharSequence("Search Building"));
 //BA.debugLineNum = 75;BA.debugLine="TitleBar.Left = 5%x";
mostCurrent._titlebar.setLeft(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA));
 //BA.debugLineNum = 76;BA.debugLine="Home.HomeBuilding = \"null\"";
mostCurrent._home._homebuilding = "null";
 //BA.debugLineNum = 78;BA.debugLine="WebViewTest.Initialize(\"\")";
mostCurrent._webviewtest.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 79;BA.debugLine="Activity.AddView(WebViewTest,0,6%y,100%x,35%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._webviewtest.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (35),mostCurrent.activityBA));
 //BA.debugLineNum = 80;BA.debugLine="WebViewTest.LoadURL(\"https://acc663a9.ngrok.io/gi";
mostCurrent._webviewtest.LoadUrl("https://acc663a9.ngrok.io/gisbuilding/index.php");
 //BA.debugLineNum = 83;BA.debugLine="Dim TopSearch As Int";
_topsearch = 0;
 //BA.debugLineNum = 84;BA.debugLine="TopSearch = WebViewTest.Height + WebViewTest.Top";
_topsearch = (int) (mostCurrent._webviewtest.getHeight()+mostCurrent._webviewtest.getTop());
 //BA.debugLineNum = 85;BA.debugLine="PanelSearch.Initialize(\"PanelSearch\")";
mostCurrent._panelsearch.Initialize(mostCurrent.activityBA,"PanelSearch");
 //BA.debugLineNum = 86;BA.debugLine="Activity.AddView(PanelSearch,0,TopSearch,100%x,15";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._panelsearch.getObject()),(int) (0),_topsearch,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA));
 //BA.debugLineNum = 89;BA.debugLine="PanelSearch.LoadLayout(\"SearchPanelnside\")";
mostCurrent._panelsearch.LoadLayout("SearchPanelnside",mostCurrent.activityBA);
 //BA.debugLineNum = 90;BA.debugLine="PanelSearch.Color= Colors.RGB(209,209,209)";
mostCurrent._panelsearch.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (209),(int) (209),(int) (209)));
 //BA.debugLineNum = 91;BA.debugLine="SetBackgroundTintList(SearchText, Colors.Transpar";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._searchtext.getObject())),anywheresoftware.b4a.keywords.Common.Colors.Transparent,anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 92;BA.debugLine="CreateSpinBuilding_Item";
_createspinbuilding_item();
 //BA.debugLineNum = 93;BA.debugLine="SpinSearch.Clear";
mostCurrent._spinsearch.Clear();
 //BA.debugLineNum = 94;BA.debugLine="CLV2.AsView.Height = 0";
mostCurrent._clv2._asview().setHeight((int) (0));
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public static String  _btnhome_click() throws Exception{
 //BA.debugLineNum = 986;BA.debugLine="Sub BtnHome_Click";
 //BA.debugLineNum = 987;BA.debugLine="StartActivity(Home)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._home.getObject()));
 //BA.debugLineNum = 988;BA.debugLine="End Sub";
return "";
}
public static String  _btnsearch_click() throws Exception{
 //BA.debugLineNum = 982;BA.debugLine="Sub BtnSearch_Click";
 //BA.debugLineNum = 983;BA.debugLine="Activity_Create(True)";
_activity_create(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 984;BA.debugLine="End Sub";
return "";
}
public static String  _clv2_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 684;BA.debugLine="Sub CLV2_ItemClick (Index As Int, Value As Object)";
 //BA.debugLineNum = 686;BA.debugLine="idBuilding = Value 'store the value in the proces";
_idbuilding = BA.ObjectToString(_value);
 //BA.debugLineNum = 687;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createitem(int _width,String _title,String _content) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 211;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
 //BA.debugLineNum = 212;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(processBA,"");
 //BA.debugLineNum = 213;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 100%x,10%y)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
 //BA.debugLineNum = 214;BA.debugLine="p.LoadLayout(\"BuildingListTwo\")";
_p.LoadLayout("BuildingListTwo",mostCurrent.activityBA);
 //BA.debugLineNum = 215;BA.debugLine="num.Text = Title";
mostCurrent._num.setText(BA.ObjectToCharSequence(_title));
 //BA.debugLineNum = 216;BA.debugLine="Buildingname.Text = Content";
mostCurrent._buildingname.setText(BA.ObjectToCharSequence(_content));
 //BA.debugLineNum = 217;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_p.getObject()));
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public static String  _createspinbuilding_item() throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub CreateSpinBuilding_Item";
 //BA.debugLineNum = 106;BA.debugLine="spinnerMapB.Initialize";
mostCurrent._spinnermapb.Initialize();
 //BA.debugLineNum = 107;BA.debugLine="SpinBuilding.add(\"Select Building Type\")";
mostCurrent._spinbuilding.Add("Select Building Type");
 //BA.debugLineNum = 108;BA.debugLine="SpinBuilding.Add(\"All Building\")";
mostCurrent._spinbuilding.Add("All Building");
 //BA.debugLineNum = 109;BA.debugLine="spinnerMapB.Put(\"All Building\",\"All\")";
mostCurrent._spinnermapb.Put((Object)("All Building"),(Object)("All"));
 //BA.debugLineNum = 110;BA.debugLine="SpinBuilding.Add(\"Office Building\")";
mostCurrent._spinbuilding.Add("Office Building");
 //BA.debugLineNum = 111;BA.debugLine="spinnerMapB.Put(\"Office Building\",\"Office\")";
mostCurrent._spinnermapb.Put((Object)("Office Building"),(Object)("Office"));
 //BA.debugLineNum = 112;BA.debugLine="SpinBuilding.Add(\"Worship Building\")";
mostCurrent._spinbuilding.Add("Worship Building");
 //BA.debugLineNum = 113;BA.debugLine="spinnerMapB.Put(\"Worship Building\",\"Worship\")";
mostCurrent._spinnermapb.Put((Object)("Worship Building"),(Object)("Worship"));
 //BA.debugLineNum = 115;BA.debugLine="If File.Exists(File.DirInternal,\"datastore\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"datastore")) { 
 //BA.debugLineNum = 116;BA.debugLine="If Main.kvs.ContainsKey(\"role\") == True Then";
if (mostCurrent._main._kvs._containskey("role")==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 117;BA.debugLine="SpinBuilding.Add(\"House Building\")";
mostCurrent._spinbuilding.Add("House Building");
 //BA.debugLineNum = 118;BA.debugLine="spinnerMapB.Put(\"House Building\",\"House\")";
mostCurrent._spinnermapb.Put((Object)("House Building"),(Object)("House"));
 }else {
 };
 }else {
 };
 //BA.debugLineNum = 126;BA.debugLine="SpinBuilding.Add(\"Educational Building\")";
mostCurrent._spinbuilding.Add("Educational Building");
 //BA.debugLineNum = 127;BA.debugLine="spinnerMapB.Put(\"Educational Building\",\"Education";
mostCurrent._spinnermapb.Put((Object)("Educational Building"),(Object)("Educational"));
 //BA.debugLineNum = 128;BA.debugLine="SpinBuilding.Add(\"Health Building\")";
mostCurrent._spinbuilding.Add("Health Building");
 //BA.debugLineNum = 129;BA.debugLine="spinnerMapB.Put(\"Health Building\",\"Health\")";
mostCurrent._spinnermapb.Put((Object)("Health Building"),(Object)("Health"));
 //BA.debugLineNum = 130;BA.debugLine="SpinBuilding.Add(\"Msme Building\")";
mostCurrent._spinbuilding.Add("Msme Building");
 //BA.debugLineNum = 131;BA.debugLine="spinnerMapB.Put(\"Msme Building\",\"Msme\")";
mostCurrent._spinnermapb.Put((Object)("Msme Building"),(Object)("Msme"));
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public static String  _createspintype_item() throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub CreateSpinType_Item";
 //BA.debugLineNum = 135;BA.debugLine="spinnerMapT.Initialize";
mostCurrent._spinnermapt.Initialize();
 //BA.debugLineNum = 136;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"model","type","jorong","construction","status","tribe","village","datuk","education")) {
case 0: {
 //BA.debugLineNum = 138;BA.debugLine="SpinType.add(\"Select Building Model \")";
mostCurrent._spintype.Add("Select Building Model ");
 //BA.debugLineNum = 139;BA.debugLine="SpinType.add(\"Rumah Gadang\")";
mostCurrent._spintype.Add("Rumah Gadang");
 //BA.debugLineNum = 140;BA.debugLine="spinnerMapT.Put(\"Rumah Gadang\",\"rg\")";
mostCurrent._spinnermapt.Put((Object)("Rumah Gadang"),(Object)("rg"));
 //BA.debugLineNum = 141;BA.debugLine="SpinType.add(\"Dutch Building\")";
mostCurrent._spintype.Add("Dutch Building");
 //BA.debugLineNum = 142;BA.debugLine="spinnerMapT.Put(\"Dutch Building\",\"db\")";
mostCurrent._spinnermapt.Put((Object)("Dutch Building"),(Object)("db"));
 //BA.debugLineNum = 143;BA.debugLine="SpinType.add(\"Other\")";
mostCurrent._spintype.Add("Other");
 //BA.debugLineNum = 144;BA.debugLine="spinnerMapT.Put(\"Other\",\"ot\")";
mostCurrent._spinnermapt.Put((Object)("Other"),(Object)("ot"));
 break; }
case 1: {
 //BA.debugLineNum = 146;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"Worship","Office","Msme","Educational","Health")) {
case 0: {
 //BA.debugLineNum = 148;BA.debugLine="SpinType.add(\"Select Type \"&idspin)";
mostCurrent._spintype.Add("Select Type "+_idspin);
 //BA.debugLineNum = 149;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_t";
_executeremotequery("SELECT type_id, name_of_type FROM type_of_worship ORDER BY name_of_type ASC","ShowType");
 break; }
case 1: {
 //BA.debugLineNum = 151;BA.debugLine="SpinType.add(\"Select Type \"&idspin)";
mostCurrent._spintype.Add("Select Type "+_idspin);
 //BA.debugLineNum = 152;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_t";
_executeremotequery("SELECT type_id, name_of_type FROM type_of_office ORDER BY name_of_type ASC","ShowType");
 break; }
case 2: {
 //BA.debugLineNum = 154;BA.debugLine="SpinType.add(\"Select Type \"&idspin)";
mostCurrent._spintype.Add("Select Type "+_idspin);
 //BA.debugLineNum = 155;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_t";
_executeremotequery("SELECT type_id, name_of_type FROM type_of_msme ORDER BY name_of_type ASC","ShowType");
 break; }
case 3: {
 //BA.debugLineNum = 157;BA.debugLine="SpinType.add(\"Select Type \"&idspin)";
mostCurrent._spintype.Add("Select Type "+_idspin);
 //BA.debugLineNum = 158;BA.debugLine="ExecuteRemoteQuery(\"SELECT level_id, name_of_";
_executeremotequery("SELECT level_id, name_of_level FROM level_of_education ORDER BY name_of_level ASC","ShowType");
 break; }
case 4: {
 //BA.debugLineNum = 160;BA.debugLine="SpinType.add(\"Select Type \"&idspin)";
mostCurrent._spintype.Add("Select Type "+_idspin);
 //BA.debugLineNum = 161;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_t";
_executeremotequery("SELECT type_id, name_of_type FROM type_of_health_building ORDER BY name_of_type ASC","ShowType");
 break; }
}
;
 break; }
case 2: {
 //BA.debugLineNum = 164;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"Worship","Office","Health","Msme","Educational")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: {
 //BA.debugLineNum = 166;BA.debugLine="SpinType.add(\"Select Jorong \"&idspin)";
mostCurrent._spintype.Add("Select Jorong "+_idspin);
 //BA.debugLineNum = 167;BA.debugLine="ExecuteRemoteQuery(\"SELECT jorong_id, name_of";
_executeremotequery("SELECT jorong_id, name_of_jorong FROM jorong ORDER BY name_of_jorong ASC","ShowJorong");
 break; }
}
;
 break; }
case 3: {
 //BA.debugLineNum = 170;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"Worship","Office","Health","Msme","Educational","House")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
 //BA.debugLineNum = 172;BA.debugLine="SpinType.add(\"Select Construction\")";
mostCurrent._spintype.Add("Select Construction");
 //BA.debugLineNum = 173;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_t";
_executeremotequery("SELECT type_id, name_of_type FROM type_of_construction ORDER BY name_of_type ASC ","ShowConstruction");
 break; }
}
;
 break; }
case 4: {
 //BA.debugLineNum = 176;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"Educational")) {
case 0: {
 //BA.debugLineNum = 178;BA.debugLine="SpinType.add(\"Select School Type\")";
mostCurrent._spintype.Add("Select School Type");
 //BA.debugLineNum = 179;BA.debugLine="SpinType.Add(\"Public School\")";
mostCurrent._spintype.Add("Public School");
 //BA.debugLineNum = 180;BA.debugLine="spinnerMapT.Put(\"Public School\",\"1\")";
mostCurrent._spinnermapt.Put((Object)("Public School"),(Object)("1"));
 //BA.debugLineNum = 181;BA.debugLine="SpinType.Add(\"Private School\")";
mostCurrent._spintype.Add("Private School");
 //BA.debugLineNum = 182;BA.debugLine="spinnerMapT.Put(\"Private School\",\"0\")";
mostCurrent._spinnermapt.Put((Object)("Private School"),(Object)("0"));
 break; }
}
;
 break; }
case 5: {
 //BA.debugLineNum = 185;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"House")) {
case 0: {
 //BA.debugLineNum = 187;BA.debugLine="SpinType.add(\"Select Tribe\")";
mostCurrent._spintype.Add("Select Tribe");
 //BA.debugLineNum = 188;BA.debugLine="ExecuteRemoteQuery (\"SELECT tribe_id, name_of";
_executeremotequery("SELECT tribe_id, name_of_tribe FROM tribe ORDER by name_of_tribe ASC","ShowTribe");
 break; }
}
;
 break; }
case 6: {
 //BA.debugLineNum = 191;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"House")) {
case 0: {
 //BA.debugLineNum = 193;BA.debugLine="SpinType.add(\"Select Village\")";
mostCurrent._spintype.Add("Select Village");
 //BA.debugLineNum = 194;BA.debugLine="ExecuteRemoteQuery (\"SELECT village_id, villag";
_executeremotequery("SELECT village_id, village_name FROM village ORDER by village_name ASC","ShowVillage");
 break; }
}
;
 break; }
case 7: {
 //BA.debugLineNum = 197;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"House")) {
case 0: {
 //BA.debugLineNum = 199;BA.debugLine="SpinType.add(\"Select Datuk\")";
mostCurrent._spintype.Add("Select Datuk");
 //BA.debugLineNum = 200;BA.debugLine="ExecuteRemoteQuery (\"SELECT datuk_id, datuk_n";
_executeremotequery("SELECT datuk_id, datuk_name FROM datuk ORDER by datuk_name ASC","ShowDatuk");
 break; }
}
;
 break; }
case 8: {
 //BA.debugLineNum = 203;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"House")) {
case 0: {
 //BA.debugLineNum = 205;BA.debugLine="SpinType.add(\"Select Educational Level\")";
mostCurrent._spintype.Add("Select Educational Level");
 //BA.debugLineNum = 206;BA.debugLine="ExecuteRemoteQuery(\"SELECT education_id, educ";
_executeremotequery("SELECT education_id, educational_level FROM education ORDER by educational_level ASC","ShowEducation");
 break; }
}
;
 break; }
}
;
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return "";
}
public static String  _executeremotequery(String _query,String _jobname) throws Exception{
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
 //BA.debugLineNum = 232;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
 //BA.debugLineNum = 233;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
 //BA.debugLineNum = 234;BA.debugLine="Job.Initialize(JobName, Me)";
_job._initialize(processBA,_jobname,searchbuilding.getObject());
 //BA.debugLineNum = 235;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
_job._poststring(""+mostCurrent._main._server+"mobile/json.php",_query);
 //BA.debugLineNum = 236;BA.debugLine="ProgressDialogShow(\"load data from server....\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("load data from server...."));
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return "";
}
public static String  _facilitybtn_click() throws Exception{
 //BA.debugLineNum = 1236;BA.debugLine="Sub FacilityBtn_Click";
 //BA.debugLineNum = 1237;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"facility")) {
case 0: {
 //BA.debugLineNum = 1239;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"Worship","Office","Health","Educational","Msme")) {
case 0: {
 //BA.debugLineNum = 1241;BA.debugLine="ExecuteRemoteQuery(\"SELECT * FROM worship_buil";
_executeremotequery("SELECT * FROM worship_building_facilities ORDER BY name_of_facility ASC","ShowFacility");
 break; }
case 1: {
 //BA.debugLineNum = 1243;BA.debugLine="ExecuteRemoteQuery(\"SELECT * FROM office_build";
_executeremotequery("SELECT * FROM office_building_facilities ORDER BY name_of_facility ASC","ShowFacility");
 break; }
case 2: {
 //BA.debugLineNum = 1245;BA.debugLine="ExecuteRemoteQuery(\"SELECT * FROM health_build";
_executeremotequery("SELECT * FROM health_building_facilities ORDER BY name_of_facility ASC","ShowFacility");
 break; }
case 3: {
 //BA.debugLineNum = 1247;BA.debugLine="ExecuteRemoteQuery(\"SELECT * FROM educational_";
_executeremotequery("SELECT * FROM educational_building_facilities ORDER BY name_of_facility ASC","ShowFacility");
 break; }
case 4: {
 //BA.debugLineNum = 1249;BA.debugLine="ExecuteRemoteQuery(\"SELECT * FROM msme_buildin";
_executeremotequery("SELECT * FROM msme_building_facilities ORDER BY name_of_facility ASC","ShowFacility");
 break; }
}
;
 break; }
}
;
 //BA.debugLineNum = 1252;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 22;BA.debugLine="Private TitleBar As Label";
mostCurrent._titlebar = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private BackArrow As Label";
mostCurrent._backarrow = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private ScrollView1 As ScrollView";
mostCurrent._scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Dim WebViewTest As WebView";
mostCurrent._webviewtest = new anywheresoftware.b4a.objects.WebViewWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private PanelBuildingList As Panel";
mostCurrent._panelbuildinglist = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private PanelListItem As B4XView";
mostCurrent._panellistitem = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private CLV2 As CustomListView";
mostCurrent._clv2 = new b4a.example3.customlistview();
 //BA.debugLineNum = 29;BA.debugLine="Private PanelToolbar As Panel";
mostCurrent._paneltoolbar = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private PanelSearch As Panel";
mostCurrent._panelsearch = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private SearchText As EditText";
mostCurrent._searchtext = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private SearchTextPanel As Panel";
mostCurrent._searchtextpanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private num As B4XView";
mostCurrent._num = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private Buildingname As B4XView";
mostCurrent._buildingname = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private PanelListItem As B4XView";
mostCurrent._panellistitem = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private SearchBtn As Button";
mostCurrent._searchbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private SpinBuilding As Spinner";
mostCurrent._spinbuilding = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Dim spinnerMap As Map";
mostCurrent._spinnermap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 44;BA.debugLine="Dim spinnerMapB As Map";
mostCurrent._spinnermapb = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 45;BA.debugLine="Dim spinnerMapJ As Map";
mostCurrent._spinnermapj = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 46;BA.debugLine="Dim spinnerMapT As Map";
mostCurrent._spinnermapt = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 47;BA.debugLine="Dim typesrc As String";
mostCurrent._typesrc = "";
 //BA.debugLineNum = 48;BA.debugLine="Dim jorongid As String";
mostCurrent._jorongid = "";
 //BA.debugLineNum = 49;BA.debugLine="Dim typeid As String";
mostCurrent._typeid = "";
 //BA.debugLineNum = 50;BA.debugLine="Private SpinSearch As Spinner";
mostCurrent._spinsearch = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Private SearchRadius As SeekBar";
mostCurrent._searchradius = new anywheresoftware.b4a.objects.SeekBarWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Private SpinJorong As Spinner";
mostCurrent._spinjorong = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private SpinType As Spinner";
mostCurrent._spintype = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 54;BA.debugLine="Private FacilityBtn As Button";
mostCurrent._facilitybtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 55;BA.debugLine="Dim idCheckSub As String";
mostCurrent._idchecksub = "";
 //BA.debugLineNum = 56;BA.debugLine="Dim textCheckSub As String";
mostCurrent._textchecksub = "";
 //BA.debugLineNum = 57;BA.debugLine="Dim lstChecks As List";
mostCurrent._lstchecks = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 58;BA.debugLine="Dim count As Int";
_count = 0;
 //BA.debugLineNum = 59;BA.debugLine="Private FromText As EditText";
mostCurrent._fromtext = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 60;BA.debugLine="Private ToText As EditText";
mostCurrent._totext = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 61;BA.debugLine="Dim radiusku As Int";
_radiusku = 0;
 //BA.debugLineNum = 62;BA.debugLine="Private Label3 As Label";
mostCurrent._label3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
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
int step225;
int limit225;
int step255;
int limit255;
int step285;
int limit285;
int step315;
int limit315;
int step345;
int limit345;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 241;BA.debugLine="If Job.Success Then";
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
 //BA.debugLineNum = 242;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 243;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
 //BA.debugLineNum = 244;BA.debugLine="Log(\"Response from server :\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server :"+_res);
 //BA.debugLineNum = 245;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 246;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
 //BA.debugLineNum = 247;BA.debugLine="Select Job.JobName";
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
 //BA.debugLineNum = 249;BA.debugLine="Dim education_array As List";
_education_array = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 250;BA.debugLine="education_array = parser.NextArray";
_education_array = _parser.NextArray();
 //BA.debugLineNum = 251;BA.debugLine="For i=0 To education_array.Size -1";
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
 //BA.debugLineNum = 252;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 253;BA.debugLine="a = education_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_education_array.Get(_i)));
 //BA.debugLineNum = 254;BA.debugLine="Dim namatype, idtype As String";
_namatype = "";
_idtype = "";
 //BA.debugLineNum = 255;BA.debugLine="namatype= a.Get(\"educational_level\")";
_namatype = BA.ObjectToString(_a.Get((Object)("educational_level")));
 //BA.debugLineNum = 256;BA.debugLine="idtype = a.Get(\"education_id\")";
_idtype = BA.ObjectToString(_a.Get((Object)("education_id")));
 //BA.debugLineNum = 258;BA.debugLine="SpinType.Add(namatype)";
parent.mostCurrent._spintype.Add(_namatype);
 //BA.debugLineNum = 259;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
parent.mostCurrent._spinnermapt.Put((Object)(_namatype),(Object)(_idtype));
 //BA.debugLineNum = 260;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_namatype+" "+_idtype);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 150;
;
 //BA.debugLineNum = 263;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 265;BA.debugLine="Dim village_array As List";
_village_array = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 266;BA.debugLine="village_array = parser.NextArray";
_village_array = _parser.NextArray();
 //BA.debugLineNum = 267;BA.debugLine="For i=0 To village_array.Size -1";
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
 //BA.debugLineNum = 268;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 269;BA.debugLine="a = village_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_village_array.Get(_i)));
 //BA.debugLineNum = 270;BA.debugLine="Dim namatype, idtype As String";
_namatype = "";
_idtype = "";
 //BA.debugLineNum = 271;BA.debugLine="namatype= a.Get(\"village_name\")";
_namatype = BA.ObjectToString(_a.Get((Object)("village_name")));
 //BA.debugLineNum = 272;BA.debugLine="idtype = a.Get(\"village_id\")";
_idtype = BA.ObjectToString(_a.Get((Object)("village_id")));
 //BA.debugLineNum = 274;BA.debugLine="SpinType.Add(namatype)";
parent.mostCurrent._spintype.Add(_namatype);
 //BA.debugLineNum = 275;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
parent.mostCurrent._spinnermapt.Put((Object)(_namatype),(Object)(_idtype));
 //BA.debugLineNum = 276;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_namatype+" "+_idtype);
 if (true) break;
if (true) break;

case 16:
//C
this.state = 150;
;
 //BA.debugLineNum = 279;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 281;BA.debugLine="Dim datuk_array As List";
_datuk_array = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 282;BA.debugLine="datuk_array = parser.NextArray";
_datuk_array = _parser.NextArray();
 //BA.debugLineNum = 283;BA.debugLine="For i=0 To datuk_array.Size -1";
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
 //BA.debugLineNum = 284;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 285;BA.debugLine="a = datuk_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_datuk_array.Get(_i)));
 //BA.debugLineNum = 286;BA.debugLine="Dim namatype, idtype As String";
_namatype = "";
_idtype = "";
 //BA.debugLineNum = 287;BA.debugLine="namatype= a.Get(\"datuk_name\")";
_namatype = BA.ObjectToString(_a.Get((Object)("datuk_name")));
 //BA.debugLineNum = 288;BA.debugLine="idtype = a.Get(\"datuk_id\")";
_idtype = BA.ObjectToString(_a.Get((Object)("datuk_id")));
 //BA.debugLineNum = 290;BA.debugLine="SpinType.Add(namatype)";
parent.mostCurrent._spintype.Add(_namatype);
 //BA.debugLineNum = 291;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
parent.mostCurrent._spinnermapt.Put((Object)(_namatype),(Object)(_idtype));
 //BA.debugLineNum = 292;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_namatype+" "+_idtype);
 if (true) break;
if (true) break;

case 22:
//C
this.state = 150;
;
 //BA.debugLineNum = 294;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 296;BA.debugLine="Dim tribe_array As List";
_tribe_array = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 297;BA.debugLine="tribe_array = parser.NextArray";
_tribe_array = _parser.NextArray();
 //BA.debugLineNum = 298;BA.debugLine="For i=0 To tribe_array.Size -1";
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
 //BA.debugLineNum = 299;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 300;BA.debugLine="a = tribe_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_tribe_array.Get(_i)));
 //BA.debugLineNum = 301;BA.debugLine="Dim namatype, idtype As String";
_namatype = "";
_idtype = "";
 //BA.debugLineNum = 302;BA.debugLine="namatype= a.Get(\"name_of_tribe\")";
_namatype = BA.ObjectToString(_a.Get((Object)("name_of_tribe")));
 //BA.debugLineNum = 303;BA.debugLine="idtype = a.Get(\"tribe_id\")";
_idtype = BA.ObjectToString(_a.Get((Object)("tribe_id")));
 //BA.debugLineNum = 305;BA.debugLine="SpinType.Add(namatype)";
parent.mostCurrent._spintype.Add(_namatype);
 //BA.debugLineNum = 306;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
parent.mostCurrent._spinnermapt.Put((Object)(_namatype),(Object)(_idtype));
 //BA.debugLineNum = 307;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_namatype+" "+_idtype);
 if (true) break;
if (true) break;

case 28:
//C
this.state = 150;
;
 //BA.debugLineNum = 309;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 30:
//C
this.state = 31;
 //BA.debugLineNum = 311;BA.debugLine="Dim facility_array As List";
_facility_array = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 312;BA.debugLine="facility_array = parser.NextArray";
_facility_array = _parser.NextArray();
 //BA.debugLineNum = 314;BA.debugLine="Dim cd As CustomLayoutDialog";
_cd = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog();
 //BA.debugLineNum = 315;BA.debugLine="Dim ScrollViewFac As ScrollView";
_scrollviewfac = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 317;BA.debugLine="lstChecks.Initialize";
parent.mostCurrent._lstchecks.Initialize();
 //BA.debugLineNum = 318;BA.debugLine="ScrollViewFac.Initialize(50%y)";
_scrollviewfac.Initialize(mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA));
 //BA.debugLineNum = 320;BA.debugLine="Dim sf As Object";
_sf = new Object();
 //BA.debugLineNum = 321;BA.debugLine="sf = cd.ShowAsync(\"Choose facility\", \"OK\", \"Ca";
_sf = _cd.ShowAsync("Choose facility","OK","Cancel","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 323;BA.debugLine="Dim arraynow As Int";
_arraynow = 0;
 //BA.debugLineNum = 324;BA.debugLine="arraynow = facility_array.Size";
_arraynow = _facility_array.getSize();
 //BA.debugLineNum = 325;BA.debugLine="For c=0 To arraynow-1";
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
 //BA.debugLineNum = 326;BA.debugLine="Dim f As Map";
_f = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 327;BA.debugLine="f = facility_array.Get(c)";
_f.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_facility_array.Get(_c)));
 //BA.debugLineNum = 329;BA.debugLine="Dim Contentt As String";
_contentt = "";
 //BA.debugLineNum = 330;BA.debugLine="Dim Contentid As String";
_contentid = "";
 //BA.debugLineNum = 331;BA.debugLine="Contentid = f.Get(\"facility_id\")";
_contentid = BA.ObjectToString(_f.Get((Object)("facility_id")));
 //BA.debugLineNum = 332;BA.debugLine="Contentt = f.Get(\"name_of_facility\")";
_contentt = BA.ObjectToString(_f.Get((Object)("name_of_facility")));
 //BA.debugLineNum = 333;BA.debugLine="Dim chk As CheckBox";
_chk = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 334;BA.debugLine="chk.Initialize(\"\")";
_chk.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 335;BA.debugLine="chk.Text = Contentid&Contentt";
_chk.setText(BA.ObjectToCharSequence(_contentid+_contentt));
 //BA.debugLineNum = 336;BA.debugLine="chk.TextColor= Colors.Transparent";
_chk.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 337;BA.debugLine="Dim lbl1 As Label";
_lbl1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 338;BA.debugLine="lbl1.Initialize(\"\")";
_lbl1.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 339;BA.debugLine="lbl1.Text = Contentt";
_lbl1.setText(BA.ObjectToCharSequence(_contentt));
 //BA.debugLineNum = 340;BA.debugLine="lbl1.TextColor = Colors.Black";
_lbl1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 //BA.debugLineNum = 341;BA.debugLine="lbl1.Gravity = Gravity.CENTER_VERTICAL";
_lbl1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 342;BA.debugLine="lstChecks.Add(chk)";
parent.mostCurrent._lstchecks.Add((Object)(_chk.getObject()));
 //BA.debugLineNum = 343;BA.debugLine="ScrollViewFac.Panel.AddView(chk, 0, 5%y * (c";
_scrollviewfac.getPanel().AddView((android.view.View)(_chk.getObject()),(int) (0),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA)*(_c)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
 //BA.debugLineNum = 344;BA.debugLine="ScrollViewFac.Panel.AddView(lbl1, 10%x, 5%y";
_scrollviewfac.getPanel().AddView((android.view.View)(_lbl1.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA)*(_c)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
 //BA.debugLineNum = 345;BA.debugLine="Log(\"fasilitas :\"&Contentt&\" ID:\"&Contentid&\"";
anywheresoftware.b4a.keywords.Common.Log("fasilitas :"+_contentt+" ID:"+_contentid+"");
 if (true) break;
if (true) break;

case 34:
//C
this.state = 35;
;
 //BA.debugLineNum = 347;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 348;BA.debugLine="cd.SetSize(100%x, 80%y)";
_cd.SetSize(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (80),mostCurrent.activityBA));
 //BA.debugLineNum = 349;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
anywheresoftware.b4a.keywords.Common.WaitFor("dialog_ready", processBA, this, _sf);
this.state = 162;
return;
case 162:
//C
this.state = 35;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[0];
;
 //BA.debugLineNum = 350;BA.debugLine="pnl.AddView(ScrollViewFac,0,5%y,100%x,50%y)";
_pnl.AddView((android.view.View)(_scrollviewfac.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA));
 //BA.debugLineNum = 351;BA.debugLine="ScrollViewFac.Panel.Height = lstChecks.Size *";
_scrollviewfac.getPanel().setHeight((int) (parent.mostCurrent._lstchecks.getSize()*anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA)));
 //BA.debugLineNum = 352;BA.debugLine="Log(lstChecks.Size)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(parent.mostCurrent._lstchecks.getSize()));
 //BA.debugLineNum = 354;BA.debugLine="pnl.Color=Colors.White";
_pnl.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 355;BA.debugLine="ScrollViewFac.Color= Colors.White";
_scrollviewfac.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 358;BA.debugLine="Wait For (sf) Dialog_Result(Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("dialog_result", processBA, this, _sf);
this.state = 163;
return;
case 163:
//C
this.state = 35;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 359;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
 //BA.debugLineNum = 360;BA.debugLine="Log(\"BERHASIL DOOONG\")";
anywheresoftware.b4a.keywords.Common.Log("BERHASIL DOOONG");
 //BA.debugLineNum = 361;BA.debugLine="Dim sb,sc As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_sc = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 362;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 363;BA.debugLine="sc.Initialize";
_sc.Initialize();
 //BA.debugLineNum = 364;BA.debugLine="count = 0";
parent._count = (int) (0);
 //BA.debugLineNum = 365;BA.debugLine="For i = 0 To lstChecks.Size - 1";
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
 //BA.debugLineNum = 366;BA.debugLine="Dim chk As CheckBox";
_chk = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 367;BA.debugLine="chk = lstChecks.Get(i)";
_chk.setObject((android.widget.CheckBox)(parent.mostCurrent._lstchecks.Get(_i)));
 //BA.debugLineNum = 368;BA.debugLine="Dim chkSub As String";
_chksub = "";
 //BA.debugLineNum = 369;BA.debugLine="chkSub = chk.Text";
_chksub = _chk.getText();
 //BA.debugLineNum = 370;BA.debugLine="Dim idCheck,textCheck As String";
_idcheck = "";
_textcheck = "";
 //BA.debugLineNum = 371;BA.debugLine="If Contentid.Length == 1 Then";
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
 //BA.debugLineNum = 372;BA.debugLine="idCheck = chkSub.SubString2(0,1)";
_idcheck = _chksub.substring((int) (0),(int) (1));
 //BA.debugLineNum = 373;BA.debugLine="textCheck = chkSub.SubString(1)";
_textcheck = _chksub.substring((int) (1));
 if (true) break;

case 45:
//C
this.state = 46;
 //BA.debugLineNum = 375;BA.debugLine="idCheck = chkSub.SubString2(0,2)";
_idcheck = _chksub.substring((int) (0),(int) (2));
 //BA.debugLineNum = 376;BA.debugLine="textCheck = chkSub.SubString(2)";
_textcheck = _chksub.substring((int) (2));
 if (true) break;
;
 //BA.debugLineNum = 379;BA.debugLine="If chk.Checked Then";

case 46:
//if
this.state = 49;
if (_chk.getChecked()) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
 //BA.debugLineNum = 380;BA.debugLine="sb.Append(idCheck&\",\")";
_sb.Append(_idcheck+",");
 //BA.debugLineNum = 381;BA.debugLine="sc.Append(textCheck&\",\")";
_sc.Append(_textcheck+",");
 //BA.debugLineNum = 382;BA.debugLine="count = count + 1";
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
 //BA.debugLineNum = 386;BA.debugLine="Dim stridCheck,strtextCheck As String";
_stridcheck = "";
_strtextcheck = "";
 //BA.debugLineNum = 387;BA.debugLine="stridCheck = sb.ToString";
_stridcheck = _sb.ToString();
 //BA.debugLineNum = 388;BA.debugLine="strtextCheck = sc.ToString";
_strtextcheck = _sc.ToString();
 //BA.debugLineNum = 390;BA.debugLine="idCheckSub= stridCheck.SubString2(0,stridChec";
parent.mostCurrent._idchecksub = _stridcheck.substring((int) (0),(int) (_stridcheck.length()-1));
 //BA.debugLineNum = 391;BA.debugLine="textCheckSub= strtextCheck.SubString2(0,strte";
parent.mostCurrent._textchecksub = _strtextcheck.substring((int) (0),(int) (_strtextcheck.length()-1));
 //BA.debugLineNum = 392;BA.debugLine="Log(\"length id: \"&idCheckSub.Length&\" | \"& id";
anywheresoftware.b4a.keywords.Common.Log("length id: "+BA.NumberToString(parent.mostCurrent._idchecksub.length())+" | "+parent.mostCurrent._idchecksub);
 //BA.debugLineNum = 393;BA.debugLine="Log(\"length text: \"&textCheckSub.Length&\" | \"";
anywheresoftware.b4a.keywords.Common.Log("length text: "+BA.NumberToString(parent.mostCurrent._textchecksub.length())+" | "+parent.mostCurrent._textchecksub);
 if (true) break;

case 52:
//C
this.state = 53;
 //BA.debugLineNum = 395;BA.debugLine="Log(\"CANCEL DONG\")";
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
 //BA.debugLineNum = 408;BA.debugLine="Dim jorong_array As List";
_jorong_array = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 409;BA.debugLine="jorong_array = parser.NextArray";
_jorong_array = _parser.NextArray();
 //BA.debugLineNum = 410;BA.debugLine="For i=0 To jorong_array.Size -1";
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
 //BA.debugLineNum = 411;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 412;BA.debugLine="a = jorong_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_jorong_array.Get(_i)));
 //BA.debugLineNum = 413;BA.debugLine="Dim namatype, idtype As String";
_namatype = "";
_idtype = "";
 //BA.debugLineNum = 414;BA.debugLine="namatype= a.Get(\"name_of_jorong\")";
_namatype = BA.ObjectToString(_a.Get((Object)("name_of_jorong")));
 //BA.debugLineNum = 415;BA.debugLine="idtype = a.Get(\"jorong_id\")";
_idtype = BA.ObjectToString(_a.Get((Object)("jorong_id")));
 //BA.debugLineNum = 417;BA.debugLine="SpinType.Add(namatype)";
parent.mostCurrent._spintype.Add(_namatype);
 //BA.debugLineNum = 418;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
parent.mostCurrent._spinnermapt.Put((Object)(_namatype),(Object)(_idtype));
 //BA.debugLineNum = 419;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_namatype+" "+_idtype);
 if (true) break;
if (true) break;

case 59:
//C
this.state = 150;
;
 //BA.debugLineNum = 421;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 61:
//C
this.state = 62;
 //BA.debugLineNum = 423;BA.debugLine="Dim type_array As List";
_type_array = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 424;BA.debugLine="type_array = parser.NextArray";
_type_array = _parser.NextArray();
 //BA.debugLineNum = 425;BA.debugLine="For i=0 To type_array.Size -1";
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
 //BA.debugLineNum = 426;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 427;BA.debugLine="a = type_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_type_array.Get(_i)));
 //BA.debugLineNum = 428;BA.debugLine="Dim namatype, idtype As String";
_namatype = "";
_idtype = "";
 //BA.debugLineNum = 429;BA.debugLine="Select idspin";
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
 //BA.debugLineNum = 431;BA.debugLine="namatype= a.Get(\"name_of_type\")";
_namatype = BA.ObjectToString(_a.Get((Object)("name_of_type")));
 //BA.debugLineNum = 432;BA.debugLine="idtype = a.Get(\"type_id\")";
_idtype = BA.ObjectToString(_a.Get((Object)("type_id")));
 if (true) break;

case 69:
//C
this.state = 70;
 //BA.debugLineNum = 434;BA.debugLine="namatype= a.Get(\"name_of_level\")";
_namatype = BA.ObjectToString(_a.Get((Object)("name_of_level")));
 //BA.debugLineNum = 435;BA.debugLine="idtype = a.Get(\"level_id\")";
_idtype = BA.ObjectToString(_a.Get((Object)("level_id")));
 if (true) break;

case 70:
//C
this.state = 169;
;
 //BA.debugLineNum = 438;BA.debugLine="SpinType.Add(namatype)";
parent.mostCurrent._spintype.Add(_namatype);
 //BA.debugLineNum = 439;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
parent.mostCurrent._spinnermapt.Put((Object)(_namatype),(Object)(_idtype));
 //BA.debugLineNum = 440;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_namatype+" "+_idtype);
 if (true) break;
if (true) break;

case 71:
//C
this.state = 150;
;
 //BA.debugLineNum = 442;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 73:
//C
this.state = 74;
 //BA.debugLineNum = 444;BA.debugLine="Dim cons_array As List";
_cons_array = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 445;BA.debugLine="cons_array = parser.NextArray";
_cons_array = _parser.NextArray();
 //BA.debugLineNum = 446;BA.debugLine="For i=0 To cons_array.Size -1";
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
 //BA.debugLineNum = 447;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 448;BA.debugLine="a = cons_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_cons_array.Get(_i)));
 //BA.debugLineNum = 449;BA.debugLine="Dim namatype, idtype As String";
_namatype = "";
_idtype = "";
 //BA.debugLineNum = 450;BA.debugLine="namatype= a.Get(\"name_of_type\")";
_namatype = BA.ObjectToString(_a.Get((Object)("name_of_type")));
 //BA.debugLineNum = 451;BA.debugLine="idtype = a.Get(\"type_id\")";
_idtype = BA.ObjectToString(_a.Get((Object)("type_id")));
 //BA.debugLineNum = 453;BA.debugLine="SpinType.Add(namatype)";
parent.mostCurrent._spintype.Add(_namatype);
 //BA.debugLineNum = 454;BA.debugLine="spinnerMapT.Put(namatype,idtype)";
parent.mostCurrent._spinnermapt.Put((Object)(_namatype),(Object)(_idtype));
 //BA.debugLineNum = 455;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_namatype+" "+_idtype);
 if (true) break;
if (true) break;

case 77:
//C
this.state = 150;
;
 //BA.debugLineNum = 457;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 79:
//C
this.state = 80;
 //BA.debugLineNum = 459;BA.debugLine="Dim worship_array As List";
_worship_array = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 460;BA.debugLine="worship_array = parser.NextArray";
_worship_array = _parser.NextArray();
 //BA.debugLineNum = 461;BA.debugLine="If worship_array.Size = 0 Then";
if (true) break;

case 80:
//if
this.state = 89;
if (_worship_array.getSize()==0) { 
this.state = 82;
}else {
this.state = 84;
}if (true) break;

case 82:
//C
this.state = 89;
 //BA.debugLineNum = 462;BA.debugLine="Msgbox(\"Not Found\",\"Warning\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Not Found"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 //BA.debugLineNum = 463;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 84:
//C
this.state = 85;
 //BA.debugLineNum = 465;BA.debugLine="For i=0 To worship_array.Size - 1";
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
 //BA.debugLineNum = 466;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 467;BA.debugLine="a = worship_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_worship_array.Get(_i)));
 //BA.debugLineNum = 469;BA.debugLine="lat = a.Get(\"latitude\")";
parent._lat = BA.ObjectToString(_a.Get((Object)("latitude")));
 //BA.debugLineNum = 470;BA.debugLine="lng = a.Get(\"longitude\")";
parent._lng = BA.ObjectToString(_a.Get((Object)("longitude")));
 //BA.debugLineNum = 471;BA.debugLine="Log(lat)";
anywheresoftware.b4a.keywords.Common.Log(parent._lat);
 //BA.debugLineNum = 472;BA.debugLine="Log(lng)";
anywheresoftware.b4a.keywords.Common.Log(parent._lng);
 //BA.debugLineNum = 473;BA.debugLine="Dim number As String";
_number = "";
 //BA.debugLineNum = 474;BA.debugLine="Dim nama As String";
_nama = "";
 //BA.debugLineNum = 475;BA.debugLine="number = a.Get(\"worship_building_id\")";
_number = BA.ObjectToString(_a.Get((Object)("worship_building_id")));
 //BA.debugLineNum = 476;BA.debugLine="nama = a.Get(\"name_of_worship_building\")";
_nama = BA.ObjectToString(_a.Get((Object)("name_of_worship_building")));
 //BA.debugLineNum = 477;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, number";
parent.mostCurrent._clv2._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(parent.mostCurrent._clv2._asview().getWidth(),_number,_nama).getObject())),(Object)(""));
 //BA.debugLineNum = 478;BA.debugLine="CLV2.AsView.Height = PanelBuildingList.Height";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._panelbuildinglist.getHeight()*(_i+1)));
 if (true) break;
if (true) break;

case 88:
//C
this.state = 89;
;
 //BA.debugLineNum = 481;BA.debugLine="CLV2.AsView.Height = PanelBuildingList.Height";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._panelbuildinglist.getHeight()*_worship_array.getSize()));
 //BA.debugLineNum = 482;BA.debugLine="ScrollView1.Top = WebViewTest.Height + WebVie";
parent.mostCurrent._scrollview1.setTop((int) (parent.mostCurrent._webviewtest.getHeight()+parent.mostCurrent._webviewtest.getTop()+parent.mostCurrent._panelsearch.getHeight()));
 //BA.debugLineNum = 483;BA.debugLine="CLV2.AsView.Height = CLV2.AsView.Height + 4%y";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._clv2._asview().getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA)));
 //BA.debugLineNum = 484;BA.debugLine="CLV2.sv.Height = CLV2.AsView.Height";
parent.mostCurrent._clv2._sv.setHeight(parent.mostCurrent._clv2._asview().getHeight());
 //BA.debugLineNum = 485;BA.debugLine="ScrollView1.Panel.Height = CLV2.sv.Height";
parent.mostCurrent._scrollview1.getPanel().setHeight(parent.mostCurrent._clv2._sv.getHeight());
 //BA.debugLineNum = 486;BA.debugLine="ScrollView1.Height = 100%y - (ScrollView1.Top";
parent.mostCurrent._scrollview1.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-(parent.mostCurrent._scrollview1.getTop()+parent.mostCurrent._paneltoolbar.getHeight())));
 //BA.debugLineNum = 487;BA.debugLine="Log(nama)";
anywheresoftware.b4a.keywords.Common.Log(_nama);
 //BA.debugLineNum = 488;BA.debugLine="ProgressDialogHide";
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
 //BA.debugLineNum = 491;BA.debugLine="Dim office_array As List";
_office_array = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 492;BA.debugLine="office_array = parser.NextArray";
_office_array = _parser.NextArray();
 //BA.debugLineNum = 493;BA.debugLine="If office_array.Size = 0 Then";
if (true) break;

case 92:
//if
this.state = 101;
if (_office_array.getSize()==0) { 
this.state = 94;
}else {
this.state = 96;
}if (true) break;

case 94:
//C
this.state = 101;
 //BA.debugLineNum = 494;BA.debugLine="Msgbox(\"Not Found\",\"Warning\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Not Found"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 //BA.debugLineNum = 495;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 96:
//C
this.state = 97;
 //BA.debugLineNum = 497;BA.debugLine="For i=0 To office_array.Size - 1";
if (true) break;

case 97:
//for
this.state = 100;
step225 = 1;
limit225 = (int) (_office_array.getSize()-1);
_i = (int) (0) ;
this.state = 174;
if (true) break;

case 174:
//C
this.state = 100;
if ((step225 > 0 && _i <= limit225) || (step225 < 0 && _i >= limit225)) this.state = 99;
if (true) break;

case 175:
//C
this.state = 174;
_i = ((int)(0 + _i + step225)) ;
if (true) break;

case 99:
//C
this.state = 175;
 //BA.debugLineNum = 498;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 499;BA.debugLine="a = office_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_office_array.Get(_i)));
 //BA.debugLineNum = 501;BA.debugLine="lat = a.Get(\"latitude\")";
parent._lat = BA.ObjectToString(_a.Get((Object)("latitude")));
 //BA.debugLineNum = 502;BA.debugLine="lng = a.Get(\"longitude\")";
parent._lng = BA.ObjectToString(_a.Get((Object)("longitude")));
 //BA.debugLineNum = 503;BA.debugLine="Log(lat)";
anywheresoftware.b4a.keywords.Common.Log(parent._lat);
 //BA.debugLineNum = 504;BA.debugLine="Log(lng)";
anywheresoftware.b4a.keywords.Common.Log(parent._lng);
 //BA.debugLineNum = 505;BA.debugLine="Dim number As String";
_number = "";
 //BA.debugLineNum = 506;BA.debugLine="Dim nama As String";
_nama = "";
 //BA.debugLineNum = 507;BA.debugLine="number = a.Get(\"office_building_id\")";
_number = BA.ObjectToString(_a.Get((Object)("office_building_id")));
 //BA.debugLineNum = 508;BA.debugLine="nama = a.Get(\"name_of_office_building\")";
_nama = BA.ObjectToString(_a.Get((Object)("name_of_office_building")));
 //BA.debugLineNum = 509;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, numbe";
parent.mostCurrent._clv2._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(parent.mostCurrent._clv2._asview().getWidth(),_number,_nama).getObject())),(Object)(""));
 //BA.debugLineNum = 510;BA.debugLine="CLV2.AsView.Height = PanelListItem.Height*(i";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._panellistitem.getHeight()*(_i+1)));
 if (true) break;
if (true) break;

case 100:
//C
this.state = 101;
;
 //BA.debugLineNum = 513;BA.debugLine="CLV2.AsView.Height = PanelBuildingList.Height";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._panelbuildinglist.getHeight()*_office_array.getSize()));
 //BA.debugLineNum = 514;BA.debugLine="ScrollView1.Top = WebViewTest.Height + WebVie";
parent.mostCurrent._scrollview1.setTop((int) (parent.mostCurrent._webviewtest.getHeight()+parent.mostCurrent._webviewtest.getTop()+parent.mostCurrent._panelsearch.getHeight()));
 //BA.debugLineNum = 515;BA.debugLine="CLV2.AsView.Height = CLV2.AsView.Height + 4%y";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._clv2._asview().getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA)));
 //BA.debugLineNum = 516;BA.debugLine="CLV2.sv.Height = CLV2.AsView.Height";
parent.mostCurrent._clv2._sv.setHeight(parent.mostCurrent._clv2._asview().getHeight());
 //BA.debugLineNum = 517;BA.debugLine="ScrollView1.Panel.Height = CLV2.sv.Height";
parent.mostCurrent._scrollview1.getPanel().setHeight(parent.mostCurrent._clv2._sv.getHeight());
 //BA.debugLineNum = 518;BA.debugLine="ScrollView1.Height = 100%y - (ScrollView1.Top";
parent.mostCurrent._scrollview1.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-(parent.mostCurrent._scrollview1.getTop()+parent.mostCurrent._paneltoolbar.getHeight())));
 //BA.debugLineNum = 519;BA.debugLine="Log(nama)";
anywheresoftware.b4a.keywords.Common.Log(_nama);
 //BA.debugLineNum = 520;BA.debugLine="ProgressDialogHide";
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
 //BA.debugLineNum = 523;BA.debugLine="Dim education_array As List";
_education_array = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 524;BA.debugLine="education_array = parser.NextArray";
_education_array = _parser.NextArray();
 //BA.debugLineNum = 525;BA.debugLine="If education_array.Size = 0 Then";
if (true) break;

case 104:
//if
this.state = 113;
if (_education_array.getSize()==0) { 
this.state = 106;
}else {
this.state = 108;
}if (true) break;

case 106:
//C
this.state = 113;
 //BA.debugLineNum = 526;BA.debugLine="Msgbox(\"Not Found\",\"Warning\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Not Found"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 //BA.debugLineNum = 527;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 108:
//C
this.state = 109;
 //BA.debugLineNum = 529;BA.debugLine="For i=0 To education_array.Size - 1";
if (true) break;

case 109:
//for
this.state = 112;
step255 = 1;
limit255 = (int) (_education_array.getSize()-1);
_i = (int) (0) ;
this.state = 176;
if (true) break;

case 176:
//C
this.state = 112;
if ((step255 > 0 && _i <= limit255) || (step255 < 0 && _i >= limit255)) this.state = 111;
if (true) break;

case 177:
//C
this.state = 176;
_i = ((int)(0 + _i + step255)) ;
if (true) break;

case 111:
//C
this.state = 177;
 //BA.debugLineNum = 530;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 531;BA.debugLine="a = education_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_education_array.Get(_i)));
 //BA.debugLineNum = 533;BA.debugLine="lat = a.Get(\"latitude\")";
parent._lat = BA.ObjectToString(_a.Get((Object)("latitude")));
 //BA.debugLineNum = 534;BA.debugLine="lng = a.Get(\"longitude\")";
parent._lng = BA.ObjectToString(_a.Get((Object)("longitude")));
 //BA.debugLineNum = 535;BA.debugLine="Log(lat)";
anywheresoftware.b4a.keywords.Common.Log(parent._lat);
 //BA.debugLineNum = 536;BA.debugLine="Log(lng)";
anywheresoftware.b4a.keywords.Common.Log(parent._lng);
 //BA.debugLineNum = 537;BA.debugLine="Dim number As String";
_number = "";
 //BA.debugLineNum = 538;BA.debugLine="Dim nama As String";
_nama = "";
 //BA.debugLineNum = 539;BA.debugLine="number = a.Get(\"educational_building_id\")";
_number = BA.ObjectToString(_a.Get((Object)("educational_building_id")));
 //BA.debugLineNum = 540;BA.debugLine="nama = a.Get(\"name_of_educational_building\")";
_nama = BA.ObjectToString(_a.Get((Object)("name_of_educational_building")));
 //BA.debugLineNum = 541;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, numbe";
parent.mostCurrent._clv2._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(parent.mostCurrent._clv2._asview().getWidth(),_number,_nama).getObject())),(Object)(""));
 //BA.debugLineNum = 542;BA.debugLine="CLV2.AsView.Height = PanelListItem.Height*(i";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._panellistitem.getHeight()*(_i+1)));
 if (true) break;
if (true) break;

case 112:
//C
this.state = 113;
;
 //BA.debugLineNum = 545;BA.debugLine="CLV2.AsView.Height = PanelBuildingList.Height";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._panelbuildinglist.getHeight()*_education_array.getSize()));
 //BA.debugLineNum = 546;BA.debugLine="ScrollView1.Top = WebViewTest.Height + WebVie";
parent.mostCurrent._scrollview1.setTop((int) (parent.mostCurrent._webviewtest.getHeight()+parent.mostCurrent._webviewtest.getTop()+parent.mostCurrent._panelsearch.getHeight()));
 //BA.debugLineNum = 547;BA.debugLine="CLV2.AsView.Height = CLV2.AsView.Height + 4%y";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._clv2._asview().getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA)));
 //BA.debugLineNum = 548;BA.debugLine="CLV2.sv.Height = CLV2.AsView.Height";
parent.mostCurrent._clv2._sv.setHeight(parent.mostCurrent._clv2._asview().getHeight());
 //BA.debugLineNum = 549;BA.debugLine="ScrollView1.Panel.Height = CLV2.sv.Height";
parent.mostCurrent._scrollview1.getPanel().setHeight(parent.mostCurrent._clv2._sv.getHeight());
 //BA.debugLineNum = 550;BA.debugLine="ScrollView1.Height = 100%y - (ScrollView1.Top";
parent.mostCurrent._scrollview1.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-(parent.mostCurrent._scrollview1.getTop()+parent.mostCurrent._paneltoolbar.getHeight())));
 //BA.debugLineNum = 551;BA.debugLine="Log(nama)";
anywheresoftware.b4a.keywords.Common.Log(_nama);
 //BA.debugLineNum = 552;BA.debugLine="ProgressDialogHide";
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
 //BA.debugLineNum = 555;BA.debugLine="Dim health_array As List";
_health_array = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 556;BA.debugLine="health_array = parser.NextArray";
_health_array = _parser.NextArray();
 //BA.debugLineNum = 557;BA.debugLine="If health_array.Size = 0 Then";
if (true) break;

case 116:
//if
this.state = 125;
if (_health_array.getSize()==0) { 
this.state = 118;
}else {
this.state = 120;
}if (true) break;

case 118:
//C
this.state = 125;
 //BA.debugLineNum = 558;BA.debugLine="Msgbox(\"Not Found\",\"Warning\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Not Found"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 //BA.debugLineNum = 559;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 120:
//C
this.state = 121;
 //BA.debugLineNum = 561;BA.debugLine="For i=0 To health_array.Size - 1";
if (true) break;

case 121:
//for
this.state = 124;
step285 = 1;
limit285 = (int) (_health_array.getSize()-1);
_i = (int) (0) ;
this.state = 178;
if (true) break;

case 178:
//C
this.state = 124;
if ((step285 > 0 && _i <= limit285) || (step285 < 0 && _i >= limit285)) this.state = 123;
if (true) break;

case 179:
//C
this.state = 178;
_i = ((int)(0 + _i + step285)) ;
if (true) break;

case 123:
//C
this.state = 179;
 //BA.debugLineNum = 562;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 563;BA.debugLine="a = health_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_health_array.Get(_i)));
 //BA.debugLineNum = 565;BA.debugLine="lat = a.Get(\"latitude\")";
parent._lat = BA.ObjectToString(_a.Get((Object)("latitude")));
 //BA.debugLineNum = 566;BA.debugLine="lng = a.Get(\"longitude\")";
parent._lng = BA.ObjectToString(_a.Get((Object)("longitude")));
 //BA.debugLineNum = 567;BA.debugLine="Log(lat)";
anywheresoftware.b4a.keywords.Common.Log(parent._lat);
 //BA.debugLineNum = 568;BA.debugLine="Log(lng)";
anywheresoftware.b4a.keywords.Common.Log(parent._lng);
 //BA.debugLineNum = 569;BA.debugLine="Dim number As String";
_number = "";
 //BA.debugLineNum = 570;BA.debugLine="Dim nama As String";
_nama = "";
 //BA.debugLineNum = 571;BA.debugLine="number = a.Get(\"health_building_id\")";
_number = BA.ObjectToString(_a.Get((Object)("health_building_id")));
 //BA.debugLineNum = 572;BA.debugLine="nama = a.Get(\"name_of_health_building\")";
_nama = BA.ObjectToString(_a.Get((Object)("name_of_health_building")));
 //BA.debugLineNum = 573;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, numbe";
parent.mostCurrent._clv2._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(parent.mostCurrent._clv2._asview().getWidth(),_number,_nama).getObject())),(Object)(""));
 //BA.debugLineNum = 574;BA.debugLine="CLV2.AsView.Height = PanelListItem.Height*(i";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._panellistitem.getHeight()*(_i+1)));
 if (true) break;
if (true) break;

case 124:
//C
this.state = 125;
;
 //BA.debugLineNum = 577;BA.debugLine="CLV2.AsView.Height = PanelBuildingList.Height";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._panelbuildinglist.getHeight()*_health_array.getSize()));
 //BA.debugLineNum = 578;BA.debugLine="ScrollView1.Top = WebViewTest.Height + WebVie";
parent.mostCurrent._scrollview1.setTop((int) (parent.mostCurrent._webviewtest.getHeight()+parent.mostCurrent._webviewtest.getTop()+parent.mostCurrent._panelsearch.getHeight()));
 //BA.debugLineNum = 579;BA.debugLine="CLV2.AsView.Height = CLV2.AsView.Height + 4%y";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._clv2._asview().getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA)));
 //BA.debugLineNum = 580;BA.debugLine="CLV2.sv.Height = CLV2.AsView.Height";
parent.mostCurrent._clv2._sv.setHeight(parent.mostCurrent._clv2._asview().getHeight());
 //BA.debugLineNum = 581;BA.debugLine="ScrollView1.Panel.Height = CLV2.sv.Height";
parent.mostCurrent._scrollview1.getPanel().setHeight(parent.mostCurrent._clv2._sv.getHeight());
 //BA.debugLineNum = 582;BA.debugLine="ScrollView1.Height = 100%y - (ScrollView1.Top";
parent.mostCurrent._scrollview1.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-(parent.mostCurrent._scrollview1.getTop()+parent.mostCurrent._paneltoolbar.getHeight())));
 //BA.debugLineNum = 583;BA.debugLine="Log(nama)";
anywheresoftware.b4a.keywords.Common.Log(_nama);
 //BA.debugLineNum = 584;BA.debugLine="ProgressDialogHide";
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
 //BA.debugLineNum = 587;BA.debugLine="Dim msme_array As List";
_msme_array = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 588;BA.debugLine="msme_array = parser.NextArray";
_msme_array = _parser.NextArray();
 //BA.debugLineNum = 589;BA.debugLine="If msme_array.Size = 0 Then";
if (true) break;

case 128:
//if
this.state = 137;
if (_msme_array.getSize()==0) { 
this.state = 130;
}else {
this.state = 132;
}if (true) break;

case 130:
//C
this.state = 137;
 //BA.debugLineNum = 590;BA.debugLine="Msgbox(\"Not Found\",\"Warning\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Not Found"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 //BA.debugLineNum = 591;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 132:
//C
this.state = 133;
 //BA.debugLineNum = 593;BA.debugLine="For i=0 To msme_array.Size - 1";
if (true) break;

case 133:
//for
this.state = 136;
step315 = 1;
limit315 = (int) (_msme_array.getSize()-1);
_i = (int) (0) ;
this.state = 180;
if (true) break;

case 180:
//C
this.state = 136;
if ((step315 > 0 && _i <= limit315) || (step315 < 0 && _i >= limit315)) this.state = 135;
if (true) break;

case 181:
//C
this.state = 180;
_i = ((int)(0 + _i + step315)) ;
if (true) break;

case 135:
//C
this.state = 181;
 //BA.debugLineNum = 594;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 595;BA.debugLine="a = msme_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_msme_array.Get(_i)));
 //BA.debugLineNum = 597;BA.debugLine="lat = a.Get(\"latitude\")";
parent._lat = BA.ObjectToString(_a.Get((Object)("latitude")));
 //BA.debugLineNum = 598;BA.debugLine="lng = a.Get(\"longitude\")";
parent._lng = BA.ObjectToString(_a.Get((Object)("longitude")));
 //BA.debugLineNum = 599;BA.debugLine="Log(lat)";
anywheresoftware.b4a.keywords.Common.Log(parent._lat);
 //BA.debugLineNum = 600;BA.debugLine="Log(lng)";
anywheresoftware.b4a.keywords.Common.Log(parent._lng);
 //BA.debugLineNum = 601;BA.debugLine="Dim number As String";
_number = "";
 //BA.debugLineNum = 602;BA.debugLine="Dim nama As String";
_nama = "";
 //BA.debugLineNum = 603;BA.debugLine="number = a.Get(\"msme_building_id\")";
_number = BA.ObjectToString(_a.Get((Object)("msme_building_id")));
 //BA.debugLineNum = 604;BA.debugLine="nama = a.Get(\"name_of_msme_building\")";
_nama = BA.ObjectToString(_a.Get((Object)("name_of_msme_building")));
 //BA.debugLineNum = 605;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, numbe";
parent.mostCurrent._clv2._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(parent.mostCurrent._clv2._asview().getWidth(),_number,_nama).getObject())),(Object)(""));
 //BA.debugLineNum = 606;BA.debugLine="CLV2.AsView.Height = PanelListItem.Height*(i";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._panellistitem.getHeight()*(_i+1)));
 if (true) break;
if (true) break;

case 136:
//C
this.state = 137;
;
 //BA.debugLineNum = 609;BA.debugLine="CLV2.AsView.Height = PanelBuildingList.Height";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._panelbuildinglist.getHeight()*_msme_array.getSize()));
 //BA.debugLineNum = 610;BA.debugLine="ScrollView1.Top = WebViewTest.Height + WebVie";
parent.mostCurrent._scrollview1.setTop((int) (parent.mostCurrent._webviewtest.getHeight()+parent.mostCurrent._webviewtest.getTop()+parent.mostCurrent._panelsearch.getHeight()));
 //BA.debugLineNum = 611;BA.debugLine="CLV2.AsView.Height = CLV2.AsView.Height + 4%y";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._clv2._asview().getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA)));
 //BA.debugLineNum = 612;BA.debugLine="CLV2.sv.Height = CLV2.AsView.Height";
parent.mostCurrent._clv2._sv.setHeight(parent.mostCurrent._clv2._asview().getHeight());
 //BA.debugLineNum = 613;BA.debugLine="ScrollView1.Panel.Height = CLV2.sv.Height";
parent.mostCurrent._scrollview1.getPanel().setHeight(parent.mostCurrent._clv2._sv.getHeight());
 //BA.debugLineNum = 614;BA.debugLine="ScrollView1.Height = 100%y - (ScrollView1.Top";
parent.mostCurrent._scrollview1.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-(parent.mostCurrent._scrollview1.getTop()+parent.mostCurrent._paneltoolbar.getHeight())));
 //BA.debugLineNum = 615;BA.debugLine="Log(nama)";
anywheresoftware.b4a.keywords.Common.Log(_nama);
 //BA.debugLineNum = 616;BA.debugLine="ProgressDialogHide";
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
 //BA.debugLineNum = 620;BA.debugLine="Dim house_array As List";
_house_array = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 621;BA.debugLine="house_array = parser.NextArray";
_house_array = _parser.NextArray();
 //BA.debugLineNum = 622;BA.debugLine="If house_array.Size = 0 Then";
if (true) break;

case 140:
//if
this.state = 149;
if (_house_array.getSize()==0) { 
this.state = 142;
}else {
this.state = 144;
}if (true) break;

case 142:
//C
this.state = 149;
 //BA.debugLineNum = 623;BA.debugLine="Msgbox(\"Not Found\",\"Warning\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Not Found"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 //BA.debugLineNum = 624;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 144:
//C
this.state = 145;
 //BA.debugLineNum = 626;BA.debugLine="For i=0 To house_array.Size - 1";
if (true) break;

case 145:
//for
this.state = 148;
step345 = 1;
limit345 = (int) (_house_array.getSize()-1);
_i = (int) (0) ;
this.state = 182;
if (true) break;

case 182:
//C
this.state = 148;
if ((step345 > 0 && _i <= limit345) || (step345 < 0 && _i >= limit345)) this.state = 147;
if (true) break;

case 183:
//C
this.state = 182;
_i = ((int)(0 + _i + step345)) ;
if (true) break;

case 147:
//C
this.state = 183;
 //BA.debugLineNum = 627;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 628;BA.debugLine="a = house_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_house_array.Get(_i)));
 //BA.debugLineNum = 630;BA.debugLine="lat = a.Get(\"latitude\")";
parent._lat = BA.ObjectToString(_a.Get((Object)("latitude")));
 //BA.debugLineNum = 631;BA.debugLine="lng = a.Get(\"longitude\")";
parent._lng = BA.ObjectToString(_a.Get((Object)("longitude")));
 //BA.debugLineNum = 632;BA.debugLine="Log(lat)";
anywheresoftware.b4a.keywords.Common.Log(parent._lat);
 //BA.debugLineNum = 633;BA.debugLine="Log(lng)";
anywheresoftware.b4a.keywords.Common.Log(parent._lng);
 //BA.debugLineNum = 634;BA.debugLine="Dim number As String";
_number = "";
 //BA.debugLineNum = 635;BA.debugLine="Dim nama As String";
_nama = "";
 //BA.debugLineNum = 636;BA.debugLine="number = a.Get(\"house_building_id\")";
_number = BA.ObjectToString(_a.Get((Object)("house_building_id")));
 //BA.debugLineNum = 637;BA.debugLine="nama = a.Get(\"fcn_owner\")";
_nama = BA.ObjectToString(_a.Get((Object)("fcn_owner")));
 //BA.debugLineNum = 638;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, numbe";
parent.mostCurrent._clv2._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(parent.mostCurrent._clv2._asview().getWidth(),_number,_nama).getObject())),(Object)(""));
 if (true) break;
if (true) break;

case 148:
//C
this.state = 149;
;
 //BA.debugLineNum = 642;BA.debugLine="CLV2.AsView.Height = PanelBuildingList.Height";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._panelbuildinglist.getHeight()*_house_array.getSize()));
 //BA.debugLineNum = 643;BA.debugLine="ScrollView1.Top = WebViewTest.Height + WebVie";
parent.mostCurrent._scrollview1.setTop((int) (parent.mostCurrent._webviewtest.getHeight()+parent.mostCurrent._webviewtest.getTop()+parent.mostCurrent._panelsearch.getHeight()));
 //BA.debugLineNum = 644;BA.debugLine="CLV2.AsView.Height = CLV2.AsView.Height + 4%y";
parent.mostCurrent._clv2._asview().setHeight((int) (parent.mostCurrent._clv2._asview().getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA)));
 //BA.debugLineNum = 645;BA.debugLine="CLV2.sv.Height = CLV2.AsView.Height";
parent.mostCurrent._clv2._sv.setHeight(parent.mostCurrent._clv2._asview().getHeight());
 //BA.debugLineNum = 646;BA.debugLine="ScrollView1.Panel.Height = CLV2.sv.Height";
parent.mostCurrent._scrollview1.getPanel().setHeight(parent.mostCurrent._clv2._sv.getHeight());
 //BA.debugLineNum = 647;BA.debugLine="ScrollView1.Height = 100%y - (ScrollView1.Top";
parent.mostCurrent._scrollview1.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-(parent.mostCurrent._scrollview1.getTop()+parent.mostCurrent._paneltoolbar.getHeight())));
 //BA.debugLineNum = 648;BA.debugLine="Log(nama)";
anywheresoftware.b4a.keywords.Common.Log(_nama);
 //BA.debugLineNum = 649;BA.debugLine="ProgressDialogHide";
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
 //BA.debugLineNum = 653;BA.debugLine="Job.Release";
_job._release();
 //BA.debugLineNum = 655;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _dialog_ready(anywheresoftware.b4a.objects.PanelWrapper _pnl) throws Exception{
}
public static void  _dialog_result(int _result) throws Exception{
}
public static String  _panellistitem_click() throws Exception{
int _item = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _a = null;
 //BA.debugLineNum = 657;BA.debugLine="Sub PanelListItem_Click";
 //BA.debugLineNum = 658;BA.debugLine="Dim item As Int = CLV2.GetItemFromView(Sender)";
_item = mostCurrent._clv2._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA))));
 //BA.debugLineNum = 659;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 660;BA.debugLine="p = CLV2.GetPanel(item)";
_p = mostCurrent._clv2._getpanel(_item);
 //BA.debugLineNum = 661;BA.debugLine="Dim a As B4XView";
_a = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 662;BA.debugLine="a = p.GetView(0)";
_a = _p.GetView((int) (0));
 //BA.debugLineNum = 664;BA.debugLine="idBuilding = a.GetView(0).GetView(0).Text";
_idbuilding = _a.GetView((int) (0)).GetView((int) (0)).getText();
 //BA.debugLineNum = 666;BA.debugLine="nameBuilding = a.GetView(0).GetView(1).Text";
_namebuilding = _a.GetView((int) (0)).GetView((int) (1)).getText();
 //BA.debugLineNum = 667;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"Office","Worship","Educational","Msme","Health","House")) {
case 0: {
 //BA.debugLineNum = 669;BA.debugLine="StartActivity(OfficeDetail)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._officedetail.getObject()));
 break; }
case 1: {
 //BA.debugLineNum = 671;BA.debugLine="StartActivity(WorshipDetail)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._worshipdetail.getObject()));
 break; }
case 2: {
 //BA.debugLineNum = 673;BA.debugLine="StartActivity(EducationalDetail)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._educationaldetail.getObject()));
 break; }
case 3: {
 //BA.debugLineNum = 675;BA.debugLine="StartActivity(MsmeDetail)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._msmedetail.getObject()));
 break; }
case 4: {
 //BA.debugLineNum = 677;BA.debugLine="StartActivity(HealthDetail)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._healthdetail.getObject()));
 break; }
case 5: {
 //BA.debugLineNum = 679;BA.debugLine="StartActivity(HouseDetail)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._housedetail.getObject()));
 break; }
}
;
 //BA.debugLineNum = 682;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim lat, lng As String";
_lat = "";
_lng = "";
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Dim idBuilding As String";
_idbuilding = "";
 //BA.debugLineNum = 12;BA.debugLine="Dim nameBuilding As String";
_namebuilding = "";
 //BA.debugLineNum = 13;BA.debugLine="idBuilding=\"\"";
_idbuilding = "";
 //BA.debugLineNum = 14;BA.debugLine="nameBuilding=\"\"";
_namebuilding = "";
 //BA.debugLineNum = 15;BA.debugLine="Dim tipp,tipname,typeoffice,cons,consname,typecon";
_tipp = "";
_tipname = "";
_typeoffice = "";
_cons = "";
_consname = "";
_typecons = "";
 //BA.debugLineNum = 16;BA.debugLine="Dim idspin As String";
_idspin = "";
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public static String  _searchbtn_click() throws Exception{
 //BA.debugLineNum = 689;BA.debugLine="Sub SearchBtn_Click";
 //BA.debugLineNum = 690;BA.debugLine="CLV2.Clear";
mostCurrent._clv2._clear();
 //BA.debugLineNum = 691;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"name")) {
case 0: {
 break; }
}
;
 //BA.debugLineNum = 694;BA.debugLine="Log(SearchText.Text)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._searchtext.getText());
 //BA.debugLineNum = 695;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"All","Worship","Office","Health","Educational","Msme","House")) {
case 0: {
 //BA.debugLineNum = 697;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"model")) {
case 0: {
 //BA.debugLineNum = 699;BA.debugLine="Msgbox(\"Query belum ada :(\",\"WARNING!\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Query belum ada :("),BA.ObjectToCharSequence("WARNING!"),mostCurrent.activityBA);
 break; }
}
;
 break; }
case 1: {
 //BA.debugLineNum = 702;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"name","type","jorong","construction","facility","land area","building area","radius","standing year")) {
case 0: {
 //BA.debugLineNum = 704;BA.debugLine="If SearchText.Text == \"\" Then";
if ((mostCurrent._searchtext.getText()).equals("")) { 
 //BA.debugLineNum = 705;BA.debugLine="Msgbox(\"Field is empty! Please write somethi";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Field is empty! Please write something in search field."),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else if((_idspin).equals("null") || (_idspin).equals("")) { 
 //BA.debugLineNum = 707;BA.debugLine="Msgbox(\"Select the building type to continue";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the building type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else if((mostCurrent._typesrc).equals("null") || (mostCurrent._typesrc).equals("")) { 
 //BA.debugLineNum = 709;BA.debugLine="Msgbox(\"Select the search type to continue y";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the search type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else if((mostCurrent._searchtext.getText()).equals("") && (_idspin).equals("") && (mostCurrent._typesrc).equals("")) { 
 //BA.debugLineNum = 711;BA.debugLine="Msgbox(\"Please complete all fields!\",\"Warnin";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please complete all fields!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 713;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_";
_executeremotequery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM worship_building WHERE upper(name_of_worship_building) like '%"+mostCurrent._searchtext.getText().toUpperCase()+"%' ORDER BY name_of_worship_building",_idspin);
 //BA.debugLineNum = 714;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._searchtext.getText());
 };
 break; }
case 1: {
 //BA.debugLineNum = 717;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
 //BA.debugLineNum = 718;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 720;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_";
_executeremotequery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM worship_building WHERE type_of_worship = '"+mostCurrent._typeid+"' order by name_of_worship_building",_idspin);
 //BA.debugLineNum = 721;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
 };
 break; }
case 2: {
 //BA.debugLineNum = 724;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
 //BA.debugLineNum = 725;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 727;BA.debugLine="ExecuteRemoteQuery(\"SELECT W.worship_buildin";
_executeremotequery("SELECT W.worship_building_id, W.name_of_worship_building, W.geom, ST_X(ST_CENTROID(W.geom)) As longitude, ST_Y(ST_CENTROID(W.geom)) As latitude	FROM worship_building As W, jorong As J	WHERE ST_CONTAINS(J.geom, W.geom) And J.jorong_id='"+mostCurrent._typeid+"'",_idspin);
 //BA.debugLineNum = 728;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
 };
 break; }
case 3: {
 //BA.debugLineNum = 731;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
 //BA.debugLineNum = 732;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 734;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_";
_executeremotequery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM worship_building WHERE type_of_construction = '"+mostCurrent._typeid+"' order by name_of_worship_building",_idspin);
 //BA.debugLineNum = 735;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
 };
 break; }
case 4: {
 //BA.debugLineNum = 738;BA.debugLine="ExecuteRemoteQuery(\"SELECT M.worship_buildin";
_executeremotequery("SELECT M.worship_building_id, M.name_of_worship_building, ST_X(ST_Centroid(M.geom)) AS lng, ST_Y(ST_CENTROID(M.geom)) AS lat FROM worship_building As M	JOIN detail_worship_building_facilities As F on M.worship_building_id=F.worship_building_id	WHERE F.facility_id IN ("+mostCurrent._idchecksub+") GROUP BY F.worship_building_id, M.worship_building_id, M.name_of_worship_building HAVING COUNT(*) = "+BA.NumberToString(_count)+"",_idspin);
 break; }
case 5: {
 //BA.debugLineNum = 740;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_i";
_executeremotequery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM worship_building WHERE land_area BETWEEN "+mostCurrent._fromtext.getText()+" AND "+mostCurrent._totext.getText()+" ORDER BY name_of_worship_building",_idspin);
 break; }
case 6: {
 //BA.debugLineNum = 742;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_i";
_executeremotequery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM worship_building WHERE building_area BETWEEN "+mostCurrent._fromtext.getText()+" AND "+mostCurrent._totext.getText()+" ORDER BY name_of_worship_building",_idspin);
 break; }
case 7: {
 //BA.debugLineNum = 744;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_i";
_executeremotequery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_CENTROID(geom)) as lon, ST_Y(ST_CENTROID(geom)) as lat, ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("+mostCurrent._main._lbllon+" "+mostCurrent._main._lbllat+")',-1), geom) as jarak	FROM worship_building where ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("+mostCurrent._main._lbllon+" "+mostCurrent._main._lbllat+")',-1), geom) <= "+BA.NumberToString(_radiusku)+" ORDER BY jarak",_idspin);
 break; }
case 8: {
 //BA.debugLineNum = 746;BA.debugLine="ExecuteRemoteQuery(\"SELECT worship_building_i";
_executeremotequery("SELECT worship_building_id, name_of_worship_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM worship_building WHERE standing_year BETWEEN "+mostCurrent._fromtext.getText()+" AND "+mostCurrent._totext.getText()+" ORDER BY name_of_worship_building",_idspin);
 break; }
}
;
 break; }
case 2: {
 //BA.debugLineNum = 749;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"name","type","jorong","construction","facility","radius")) {
case 0: {
 //BA.debugLineNum = 751;BA.debugLine="If SearchText.Text == \"\" Then";
if ((mostCurrent._searchtext.getText()).equals("")) { 
 //BA.debugLineNum = 752;BA.debugLine="Msgbox(\"Field is empty! Please write somethi";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Field is empty! Please write something in search field."),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else if((_idspin).equals("null") || (_idspin).equals("")) { 
 //BA.debugLineNum = 754;BA.debugLine="Msgbox(\"Select the building type to continue";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the building type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else if((mostCurrent._typesrc).equals("null") || (mostCurrent._typesrc).equals("")) { 
 //BA.debugLineNum = 756;BA.debugLine="Msgbox(\"Select the search type to continue y";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the search type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else if((mostCurrent._searchtext.getText()).equals("") && (_idspin).equals("") && (mostCurrent._typesrc).equals("")) { 
 //BA.debugLineNum = 758;BA.debugLine="Msgbox(\"Please complete all fields!\",\"Warnin";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please complete all fields!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 760;BA.debugLine="ExecuteRemoteQuery(\"SELECT office_building_i";
_executeremotequery("SELECT office_building_id, name_of_office_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM office_building WHERE upper(name_of_office_building) like '%"+mostCurrent._searchtext.getText().toUpperCase()+"%' ORDER BY name_of_office_building",_idspin);
 //BA.debugLineNum = 761;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
 };
 break; }
case 1: {
 //BA.debugLineNum = 764;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
 //BA.debugLineNum = 765;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 767;BA.debugLine="ExecuteRemoteQuery(\"SELECT office_building_i";
_executeremotequery("SELECT office_building_id, name_of_office_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM office_building WHERE type_of_office = '"+mostCurrent._typeid+"' order by name_of_office_building",_idspin);
 //BA.debugLineNum = 768;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
 };
 break; }
case 2: {
 //BA.debugLineNum = 771;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
 //BA.debugLineNum = 772;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 774;BA.debugLine="ExecuteRemoteQuery(\"SELECT O.office_building";
_executeremotequery("SELECT O.office_building_id, O.name_of_office_building, O.geom,	ST_X(ST_CENTROID(O.geom)) As longitude, ST_Y(ST_CENTROID(O.geom)) As latitude FROM office_building As O, jorong As J WHERE ST_CONTAINS(J.geom, O.geom) And J.jorong_id='"+mostCurrent._typeid+"'",_idspin);
 //BA.debugLineNum = 775;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
 };
 break; }
case 3: {
 //BA.debugLineNum = 778;BA.debugLine="ExecuteRemoteQuery(\"SELECT office_building_id";
_executeremotequery("SELECT office_building_id, name_of_office_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM office_building WHERE type_of_construction = '"+mostCurrent._typeid+"' order by name_of_office_building",_idspin);
 //BA.debugLineNum = 779;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&idsp";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
 break; }
case 4: {
 //BA.debugLineNum = 781;BA.debugLine="ExecuteRemoteQuery(\"SELECT O.office_building";
_executeremotequery("SELECT O.office_building_id, O.name_of_office_building, ST_X(ST_Centroid(O.geom)) AS lng, ST_Y(ST_CENTROID(O.geom)) AS lat FROM office_building As O JOIN detail_office_building_facilities As F on O.office_building_id=F.office_building_id WHERE F.facility_id IN ("+mostCurrent._idchecksub+") GROUP BY F.office_building_id, O.office_building_id, O.name_of_office_building HAVING COUNT(*) = "+BA.NumberToString(_count)+"",_idspin);
 break; }
case 5: {
 //BA.debugLineNum = 783;BA.debugLine="If Main.kvs.ContainsKey(\"Lat\") == False And M";
if (mostCurrent._main._kvs._containskey("Lat")==anywheresoftware.b4a.keywords.Common.False && mostCurrent._main._kvs._containskey("Long")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 784;BA.debugLine="Msgbox(\"Your location haven't been set\",\"Err";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Your location haven't been set"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 786;BA.debugLine="ExecuteRemoteQuery(\"SELECT office_building_id";
_executeremotequery("SELECT office_building_id, name_of_office_building ,ST_X(ST_CENTROID(geom)) as lon, ST_Y(ST_CENTROID(geom)) as lat, ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("+mostCurrent._main._lbllon+" "+mostCurrent._main._lbllat+")',-1), geom) as jarak FROM office_building where ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("+mostCurrent._main._lbllon+" "+mostCurrent._main._lbllat+")',-1),	geom) <= "+BA.NumberToString(_radiusku)+" ORDER BY jarak",_idspin);
 };
 break; }
}
;
 break; }
case 3: {
 //BA.debugLineNum = 791;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"name","type","jorong","construction","facility","radius")) {
case 0: {
 //BA.debugLineNum = 793;BA.debugLine="If SearchText.Text == \"\" Then";
if ((mostCurrent._searchtext.getText()).equals("")) { 
 //BA.debugLineNum = 794;BA.debugLine="Msgbox(\"Field is empty! Please write somethi";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Field is empty! Please write something in search field."),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else if((_idspin).equals("null") || (_idspin).equals("")) { 
 //BA.debugLineNum = 796;BA.debugLine="Msgbox(\"Select the building type to continue";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the building type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else if((mostCurrent._typesrc).equals("null") || (mostCurrent._typesrc).equals("")) { 
 //BA.debugLineNum = 798;BA.debugLine="Msgbox(\"Select the search type to continue y";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the search type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else if((mostCurrent._searchtext.getText()).equals("") && (_idspin).equals("") && (mostCurrent._typesrc).equals("")) { 
 //BA.debugLineNum = 800;BA.debugLine="Msgbox(\"Please complete all fields!\",\"Warnin";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please complete all fields!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 802;BA.debugLine="ExecuteRemoteQuery(\"SELECT health_building_i";
_executeremotequery("SELECT health_building_id, name_of_health_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM health_building WHERE name_of_health_building like '%"+mostCurrent._searchtext.getText().toUpperCase()+"%' ORDER BY name_of_health_building",_idspin);
 //BA.debugLineNum = 803;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
 };
 break; }
case 1: {
 //BA.debugLineNum = 806;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
 //BA.debugLineNum = 807;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 809;BA.debugLine="ExecuteRemoteQuery(\"SELECT health_building_i";
_executeremotequery("SELECT health_building_id, name_of_health_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM health_building WHERE type_of_health_building = '"+mostCurrent._typeid+"' order by name_of_health_building",_idspin);
 //BA.debugLineNum = 810;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
 };
 break; }
case 2: {
 //BA.debugLineNum = 813;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
 //BA.debugLineNum = 814;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 816;BA.debugLine="ExecuteRemoteQuery(\"SELECT W.health_building";
_executeremotequery("SELECT W.health_building_id, W.name_of_health_building, W.geom, ST_X(ST_CENTROID(W.geom)) As longitude,	ST_Y(ST_CENTROID(W.geom)) As latitude FROM health_building As W, jorong As J WHERE ST_CONTAINS(J.geom, W.geom) And J.jorong_id='"+mostCurrent._typeid+"'",_idspin);
 //BA.debugLineNum = 817;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
 };
 break; }
case 3: {
 //BA.debugLineNum = 820;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
 //BA.debugLineNum = 821;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 823;BA.debugLine="ExecuteRemoteQuery(\"SELECT health_building_i";
_executeremotequery("SELECT health_building_id, name_of_health_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM health_building WHERE type_of_construction = '"+mostCurrent._typeid+"' order by name_of_health_building",_idspin);
 //BA.debugLineNum = 824;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
 };
 break; }
case 4: {
 //BA.debugLineNum = 827;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.health_building";
_executeremotequery("SELECT H.health_building_id, H.name_of_health_building, ST_X(ST_Centroid(H.geom)) AS lng, ST_Y(ST_CENTROID(H.geom)) AS lat FROM health_building As H JOIN detail_health_building_facilities As F on H.health_building_id=F.health_building_id WHERE F.facility_id IN ("+mostCurrent._idchecksub+") GROUP BY F.health_building_id, H.health_building_id, H.name_of_health_building HAVING COUNT(*) = "+BA.NumberToString(_count)+"",_idspin);
 break; }
case 5: {
 //BA.debugLineNum = 829;BA.debugLine="If Main.kvs.ContainsKey(\"Lat\") == False And M";
if (mostCurrent._main._kvs._containskey("Lat")==anywheresoftware.b4a.keywords.Common.False && mostCurrent._main._kvs._containskey("Long")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 830;BA.debugLine="Msgbox(\"Your location haven't been set\",\"Err";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Your location haven't been set"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 832;BA.debugLine="ExecuteRemoteQuery(\"SELECT health_building_id";
_executeremotequery("SELECT health_building_id, name_of_health_building ,ST_X(ST_CENTROID(geom)) as lon, ST_Y(ST_CENTROID(geom)) as lat,	ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("+mostCurrent._main._lbllon+" "+mostCurrent._main._lbllat+")',-1), geom) as jarak FROM health_building where ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("+mostCurrent._main._lbllon+" "+mostCurrent._main._lbllat+")',-1),	geom) <= "+BA.NumberToString(_radiusku)+" ORDER BY jarak",_idspin);
 };
 break; }
}
;
 break; }
case 4: {
 //BA.debugLineNum = 837;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"name","type","jorong","status","facility","land area","building area","radius")) {
case 0: {
 //BA.debugLineNum = 839;BA.debugLine="If SearchText.Text == \"\" Then";
if ((mostCurrent._searchtext.getText()).equals("")) { 
 //BA.debugLineNum = 840;BA.debugLine="Msgbox(\"Field is empty! Please write somethi";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Field is empty! Please write something in search field."),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else if((_idspin).equals("null") || (_idspin).equals("")) { 
 //BA.debugLineNum = 842;BA.debugLine="Msgbox(\"Select the building type to continue";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the building type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else if((mostCurrent._typesrc).equals("null") || (mostCurrent._typesrc).equals("")) { 
 //BA.debugLineNum = 844;BA.debugLine="Msgbox(\"Select the search type to continue y";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the search type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else if((mostCurrent._searchtext.getText()).equals("") && (_idspin).equals("") && (mostCurrent._typesrc).equals("")) { 
 //BA.debugLineNum = 846;BA.debugLine="Msgbox(\"Please complete all fields!\",\"Warnin";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please complete all fields!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 848;BA.debugLine="ExecuteRemoteQuery(\"SELECT educational_build";
_executeremotequery("SELECT educational_building_id, name_of_educational_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM educational_building WHERE name_of_educational_building like '%"+mostCurrent._searchtext.getText().toUpperCase()+"%' ORDER BY name_of_educational_building",_idspin);
 //BA.debugLineNum = 849;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
 };
 break; }
case 1: {
 //BA.debugLineNum = 852;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
 //BA.debugLineNum = 853;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 855;BA.debugLine="ExecuteRemoteQuery(\"SELECT educational_build";
_executeremotequery("SELECT educational_building_id, name_of_educational_building, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM educational_building WHERE id_level_of_education = '"+mostCurrent._typeid+"' order by name_of_educational_building",_idspin);
 //BA.debugLineNum = 856;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
 };
 break; }
case 2: {
 //BA.debugLineNum = 859;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
 //BA.debugLineNum = 860;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 862;BA.debugLine="ExecuteRemoteQuery(\"SELECT W.educational_bui";
_executeremotequery("SELECT W.educational_building_id, W.name_of_educational_building, W.geom, ST_X(ST_CENTROID(W.geom)) As longitude, ST_Y(ST_CENTROID(W.geom)) As latitude FROM educational_building As W, jorong As J WHERE ST_CONTAINS(J.geom, W.geom) And J.jorong_id='"+mostCurrent._typeid+"'",_idspin);
 //BA.debugLineNum = 863;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
 };
 break; }
case 3: {
 //BA.debugLineNum = 866;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
 //BA.debugLineNum = 867;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 869;BA.debugLine="ExecuteRemoteQuery(\"Select educational_build";
_executeremotequery("Select educational_building_id, name_of_educational_building, ST_X(ST_Centroid(geom)) As longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM educational_building WHERE school_type = '"+mostCurrent._typeid+"' order by name_of_educational_building",_idspin);
 //BA.debugLineNum = 870;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
 };
 break; }
case 4: {
 //BA.debugLineNum = 873;BA.debugLine="ExecuteRemoteQuery(\"SELECT E.educational_bui";
_executeremotequery("SELECT E.educational_building_id, E.name_of_educational_building, ST_X(ST_Centroid(E.geom)) AS lng, ST_Y(ST_CENTROID(E.geom)) AS lat FROM educational_building As E JOIN detail_educational_building_facilities As F on E.educational_building_id=F.educational_building_id	WHERE F.facility_id IN ("+mostCurrent._idchecksub+") GROUP BY F.educational_building_id, E.educational_building_id, E.name_of_educational_building HAVING COUNT(*) = "+BA.NumberToString(_count)+"",_idspin);
 break; }
case 5: {
 //BA.debugLineNum = 875;BA.debugLine="ExecuteRemoteQuery(\"SELECT educational_buildi";
_executeremotequery("SELECT educational_building_id, name_of_educational_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM educational_building WHERE land_area BETWEEN "+mostCurrent._fromtext.getText()+" AND "+mostCurrent._totext.getText()+" ORDER BY name_of_educational_building",_idspin);
 break; }
case 6: {
 //BA.debugLineNum = 877;BA.debugLine="ExecuteRemoteQuery(\"SELECT educational_buildi";
_executeremotequery("SELECT educational_building_id, name_of_educational_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM educational_building WHERE building_area BETWEEN "+mostCurrent._fromtext.getText()+" AND "+mostCurrent._totext.getText()+" ORDER BY name_of_educational_building",_idspin);
 break; }
case 7: {
 //BA.debugLineNum = 879;BA.debugLine="If Main.kvs.ContainsKey(\"Lat\") == False And M";
if (mostCurrent._main._kvs._containskey("Lat")==anywheresoftware.b4a.keywords.Common.False && mostCurrent._main._kvs._containskey("Long")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 880;BA.debugLine="Msgbox(\"Your location haven't been set\",\"Err";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Your location haven't been set"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 882;BA.debugLine="ExecuteRemoteQuery(\"SELECT educational_buildi";
_executeremotequery("SELECT educational_building_id, name_of_educational_building ,ST_X(ST_CENTROID(geom)) as lon, ST_Y(ST_CENTROID(geom)) as lat, ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("+mostCurrent._main._lbllon+" "+mostCurrent._main._lbllat+")',-1), geom) as jarak	FROM educational_building where ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("+mostCurrent._main._lbllon+" "+mostCurrent._main._lbllat+")',-1), geom) <= "+BA.NumberToString(_radiusku)+" ORDER BY jarak",_idspin);
 };
 break; }
}
;
 break; }
case 5: {
 //BA.debugLineNum = 887;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"name","type","jorong","construction","facility","radius","income")) {
case 0: {
 //BA.debugLineNum = 889;BA.debugLine="If SearchText.Text == \"\" Then";
if ((mostCurrent._searchtext.getText()).equals("")) { 
 //BA.debugLineNum = 890;BA.debugLine="Msgbox(\"Field is empty! Please write somethi";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Field is empty! Please write something in search field."),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else if((_idspin).equals("null") || (_idspin).equals("")) { 
 //BA.debugLineNum = 892;BA.debugLine="Msgbox(\"Select the building type to continue";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the building type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else if((mostCurrent._typesrc).equals("null") || (mostCurrent._typesrc).equals("")) { 
 //BA.debugLineNum = 894;BA.debugLine="Msgbox(\"Select the search type to continue y";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the search type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else if((mostCurrent._searchtext.getText()).equals("") && (_idspin).equals("") && (mostCurrent._typesrc).equals("")) { 
 //BA.debugLineNum = 896;BA.debugLine="Msgbox(\"Please complete all fields!\",\"Warnin";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please complete all fields!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 898;BA.debugLine="ExecuteRemoteQuery(\"SELECT msme_building_id,";
_executeremotequery("SELECT msme_building_id, name_of_msme_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM msme_building WHERE upper(name_of_msme_building) like '%"+mostCurrent._searchtext.getText().toUpperCase()+"%' order by name_of_msme_building",_idspin);
 //BA.debugLineNum = 899;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
 };
 break; }
case 1: {
 //BA.debugLineNum = 902;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
 //BA.debugLineNum = 903;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 905;BA.debugLine="ExecuteRemoteQuery(\"SELECT msme_building_id,";
_executeremotequery("SELECT msme_building_id, name_of_msme_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM msme_building WHERE type_of_msme = '"+mostCurrent._typeid+"' order by name_of_msme_building",_idspin);
 //BA.debugLineNum = 906;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
 };
 break; }
case 2: {
 //BA.debugLineNum = 909;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
 //BA.debugLineNum = 910;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 912;BA.debugLine="ExecuteRemoteQuery(\"SELECT M.msme_building_i";
_executeremotequery("SELECT M.msme_building_id, M.name_of_msme_building, M.geom, ST_X(ST_CENTROID(M.geom)) As longitude, ST_Y(ST_CENTROID(M.geom)) As latitude FROM msme_building As M, jorong As J WHERE ST_CONTAINS(J.geom, M.geom) And J.jorong_id='"+mostCurrent._typeid+"'",_idspin);
 //BA.debugLineNum = 913;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
 };
 break; }
case 3: {
 //BA.debugLineNum = 916;BA.debugLine="If SpinType.SelectedIndex == 0 Then";
if (mostCurrent._spintype.getSelectedIndex()==0) { 
 //BA.debugLineNum = 917;BA.debugLine="Msgbox(\"Please select type of educational bu";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please select type of educational building"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 919;BA.debugLine="ExecuteRemoteQuery(\"SELECT msme_building_id,";
_executeremotequery("SELECT msme_building_id, name_of_msme_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM msme_building WHERE type_of_construction = '"+mostCurrent._typeid+"' order by name_of_msme_building",_idspin);
 //BA.debugLineNum = 920;BA.debugLine="WebViewTest.LoadUrl(\"\"&Main.ServerMap&\"\"&ids";
mostCurrent._webviewtest.LoadUrl(""+mostCurrent._main._servermap+""+_idspin+"/search_"+mostCurrent._typesrc+".php?"+mostCurrent._typesrc+"="+mostCurrent._typeid);
 };
 break; }
case 4: {
 //BA.debugLineNum = 923;BA.debugLine="ExecuteRemoteQuery(\"Select M.msme_building_i";
_executeremotequery("Select M.msme_building_id, M.name_of_msme_building, ST_X(ST_Centroid(M.geom)) As lng, ST_Y(ST_CENTROID(M.geom)) As lat FROM msme_building As M JOIN detail_msme_building_facilities As F on M.msme_building_id=F.msme_building_id WHERE F.facility_id IN ("+mostCurrent._idchecksub+") GROUP BY F.msme_building_id, M.msme_building_id, M.name_of_msme_building HAVING COUNT(*) = "+BA.NumberToString(_count)+"",_idspin);
 break; }
case 5: {
 //BA.debugLineNum = 925;BA.debugLine="If Main.kvs.ContainsKey(\"Lat\") == False And M";
if (mostCurrent._main._kvs._containskey("Lat")==anywheresoftware.b4a.keywords.Common.False && mostCurrent._main._kvs._containskey("Long")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 926;BA.debugLine="Msgbox(\"Your location haven't been set\",\"Err";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Your location haven't been set"),BA.ObjectToCharSequence("Error Message"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 928;BA.debugLine="ExecuteRemoteQuery(\"SELECT msme_building_id,";
_executeremotequery("SELECT msme_building_id, name_of_msme_building ,ST_X(ST_CENTROID(geom)) as lon, ST_Y(ST_CENTROID(geom)) as lat,	ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("+mostCurrent._main._lbllon+" "+mostCurrent._main._lbllat+")',-1), geom) as jarak FROM msme_building where ST_DISTANCE_SPHERE(ST_GeomFromText('POINT("+mostCurrent._main._lbllon+" "+mostCurrent._main._lbllat+")',-1), geom) <= "+BA.NumberToString(_radiusku)+" ORDER BY jarak",_idspin);
 };
 break; }
case 6: {
 //BA.debugLineNum = 931;BA.debugLine="ExecuteRemoteQuery(\"SELECT msme_building_id,";
_executeremotequery("SELECT msme_building_id, name_of_msme_building ,ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) AS latitude FROM msme_building WHERE monthly_income BETWEEN "+mostCurrent._fromtext.getText()+" AND "+mostCurrent._totext.getText()+" ORDER BY name_of_msme_building",_idspin);
 break; }
}
;
 break; }
case 6: {
 //BA.debugLineNum = 935;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"id","owner","occupant","fcn owner","fcn occupant","income","tribe","village","datuk","construction","standing year","electric capacity","empty","inhabited","education")) {
case 0: {
 //BA.debugLineNum = 937;BA.debugLine="If SearchText.Text == \"\" Then";
if ((mostCurrent._searchtext.getText()).equals("")) { 
 //BA.debugLineNum = 938;BA.debugLine="Msgbox(\"Field is empty! Please write somethi";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Field is empty! Please write something in search field."),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else if((_idspin).equals("null") || (_idspin).equals("")) { 
 //BA.debugLineNum = 940;BA.debugLine="Msgbox(\"Select the building type to continue";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the building type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else if((mostCurrent._typesrc).equals("null") || (mostCurrent._typesrc).equals("")) { 
 //BA.debugLineNum = 942;BA.debugLine="Msgbox(\"Select the search type to continue y";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Select the search type to continue your searching!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else if((mostCurrent._searchtext.getText()).equals("") && (_idspin).equals("") && (mostCurrent._typesrc).equals("")) { 
 //BA.debugLineNum = 944;BA.debugLine="Msgbox(\"Please complete all fields!\",\"Warnin";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please complete all fields!"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 946;BA.debugLine="ExecuteRemoteQuery(\"SELECT house_building_id";
_executeremotequery("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM house_building WHERE upper(house_building_id) like '%"+mostCurrent._searchtext.getText().toUpperCase()+"%' ORDER BY house_building_id",_idspin);
 };
 break; }
case 1: {
 //BA.debugLineNum = 949;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
_executeremotequery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN house_building_owner As O ON H.fcn_owner=O.national_identity_number	WHERE upper(O.owner_name) LIKE'%"+mostCurrent._searchtext.getText().toUpperCase()+"%' ORDER BY house_building_id",_idspin);
 break; }
case 2: {
 //BA.debugLineNum = 951;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
_executeremotequery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id	WHERE upper(O.head_of_family) LIKE '%"+mostCurrent._searchtext.getText().toUpperCase()+"%' ORDER BY house_building_id",_idspin);
 break; }
case 3: {
 //BA.debugLineNum = 953;BA.debugLine="Msgbox(\"Query belum ada\", \"WARNING\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Query belum ada"),BA.ObjectToCharSequence("WARNING"),mostCurrent.activityBA);
 break; }
case 4: {
 //BA.debugLineNum = 955;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
_executeremotequery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id WHERE upper(O.family_card_number) LIKE '%"+mostCurrent._searchtext.getText().toUpperCase()+"%' ORDER BY house_building_id",_idspin);
 break; }
case 5: {
 //BA.debugLineNum = 957;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
_executeremotequery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id	WHERE income BETWEEN "+mostCurrent._fromtext.getText()+" AND "+mostCurrent._totext.getText()+" ORDER BY house_building_id",_idspin);
 break; }
case 6: {
 //BA.debugLineNum = 959;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
_executeremotequery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id JOIN datuk As D ON O.datuk_id=D.datuk_id JOIN tribe As T ON D.tribe_id=T.tribe_id WHERE D.tribe_id = "+mostCurrent._typeid+" ORDER BY house_building_id",_idspin);
 break; }
case 7: {
 //BA.debugLineNum = 961;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
_executeremotequery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id WHERE village_id = "+mostCurrent._typeid+" ORDER BY house_building_id",_idspin);
 break; }
case 8: {
 //BA.debugLineNum = 963;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
_executeremotequery("SELECT H.house_building_id, fcn_owner, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id	WHERE datuk_id = "+mostCurrent._typeid+" ORDER BY house_building_id",_idspin);
 break; }
case 9: {
 //BA.debugLineNum = 965;BA.debugLine="ExecuteRemoteQuery(\"SELECT house_building_id,";
_executeremotequery("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) AS latitude	FROM house_building WHERE type_of_construction = "+mostCurrent._typeid+" ORDER BY house_building_id",_idspin);
 break; }
case 10: {
 //BA.debugLineNum = 967;BA.debugLine="ExecuteRemoteQuery(\"SELECT house_building_id,";
_executeremotequery("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude FROM house_building WHERE standing_year BETWEEN "+mostCurrent._fromtext.getText()+" AND "+mostCurrent._totext.getText()+" ORDER BY house_building_id",_idspin);
 break; }
case 11: {
 //BA.debugLineNum = 969;BA.debugLine="ExecuteRemoteQuery(\"SELECT house_building_id,";
_executeremotequery("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) AS latitude	FROM house_building WHERE electricity_capacity BETWEEN "+mostCurrent._fromtext.getText()+" AND "+mostCurrent._totext.getText()+" ORDER BY house_building_id",_idspin);
 break; }
case 12: {
 //BA.debugLineNum = 971;BA.debugLine="ExecuteRemoteQuery(\"SELECT house_building_id,";
_executeremotequery("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude	FROM house_building WHERE building_status=0",_idspin);
 break; }
case 13: {
 //BA.debugLineNum = 973;BA.debugLine="ExecuteRemoteQuery(\"SELECT house_building_id,";
_executeremotequery("SELECT house_building_id, fcn_owner, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) AS latitude FROM house_building WHERE building_status=1",_idspin);
 break; }
case 14: {
 //BA.debugLineNum = 975;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.house_building_i";
_executeremotequery("SELECT H.house_building_id, ST_X(ST_Centroid(H.geom)) AS longitude, ST_Y(ST_CENTROID(H.geom)) AS latitude FROM house_building As H JOIN householder As O ON H.house_building_id=O.house_building_id	WHERE educational_id = "+mostCurrent._typeid+" ORDER BY house_building_id",_idspin);
 break; }
}
;
 break; }
}
;
 //BA.debugLineNum = 980;BA.debugLine="End Sub";
return "";
}
public static String  _searchradius_valuechanged(int _value,boolean _userchanged) throws Exception{
 //BA.debugLineNum = 1255;BA.debugLine="Sub SearchRadius_ValueChanged (Value As Int, UserC";
 //BA.debugLineNum = 1256;BA.debugLine="If UserChanged Then";
if (_userchanged) { 
 //BA.debugLineNum = 1257;BA.debugLine="radiusku = Value";
_radiusku = _value;
 //BA.debugLineNum = 1258;BA.debugLine="Label3.Text = Value";
mostCurrent._label3.setText(BA.ObjectToCharSequence(_value));
 };
 //BA.debugLineNum = 1260;BA.debugLine="Label3.Text = Value&\" m\"";
mostCurrent._label3.setText(BA.ObjectToCharSequence(BA.NumberToString(_value)+" m"));
 //BA.debugLineNum = 1261;BA.debugLine="Log(radiusku)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_radiusku));
 //BA.debugLineNum = 1262;BA.debugLine="End Sub";
return "";
}
public static String  _setbackgroundtintlist(anywheresoftware.b4a.objects.ConcreteViewWrapper _view,int _active,int _enabled) throws Exception{
int[][] _states = null;
int[] _color = null;
anywheresoftware.b4j.object.JavaObject _csl = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 220;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
 //BA.debugLineNum = 221;BA.debugLine="Dim States(2,1) As Int";
_states = new int[(int) (2)][];
{
int d0 = _states.length;
int d1 = (int) (1);
for (int i0 = 0;i0 < d0;i0++) {
_states[i0] = new int[d1];
}
}
;
 //BA.debugLineNum = 222;BA.debugLine="States(0,0) = 16842908     'Active";
_states[(int) (0)][(int) (0)] = (int) (16842908);
 //BA.debugLineNum = 223;BA.debugLine="States(1,0) = 16842910    'Enabled";
_states[(int) (1)][(int) (0)] = (int) (16842910);
 //BA.debugLineNum = 224;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
_color = new int[]{_active,_enabled};
 //BA.debugLineNum = 225;BA.debugLine="Dim CSL As JavaObject";
_csl = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 226;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
_csl.InitializeNewInstance("android.content.res.ColorStateList",new Object[]{(Object)(_states),(Object)(_color)});
 //BA.debugLineNum = 227;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 228;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
_jo.InitializeStatic("android.support.v4.view.ViewCompat");
 //BA.debugLineNum = 229;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
_jo.RunMethod("setBackgroundTintList",new Object[]{(Object)(_view.getObject()),(Object)(_csl.getObject())});
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return "";
}
public static String  _spinbuilding_itemclick(int _position,Object _value) throws Exception{
String _id = "";
 //BA.debugLineNum = 990;BA.debugLine="Sub SpinBuilding_ItemClick (Position As Int, Value";
 //BA.debugLineNum = 991;BA.debugLine="Dim id As String";
_id = "";
 //BA.debugLineNum = 992;BA.debugLine="id = spinnerMapB.Get(Value)";
_id = BA.ObjectToString(mostCurrent._spinnermapb.Get(_value));
 //BA.debugLineNum = 993;BA.debugLine="idspin = id";
_idspin = _id;
 //BA.debugLineNum = 994;BA.debugLine="Log(idspin)";
anywheresoftware.b4a.keywords.Common.Log(_idspin);
 //BA.debugLineNum = 995;BA.debugLine="SpinSearch.Clear";
mostCurrent._spinsearch.Clear();
 //BA.debugLineNum = 996;BA.debugLine="spinnerMap.Initialize";
mostCurrent._spinnermap.Initialize();
 //BA.debugLineNum = 997;BA.debugLine="Select idspin";
switch (BA.switchObjectToInt(_idspin,"All","Worship","Msme","Office","Health","House","Educational")) {
case 0: {
 //BA.debugLineNum = 999;BA.debugLine="SpinSearch.Enabled = True";
mostCurrent._spinsearch.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1000;BA.debugLine="SpinSearch.add(\"Select Search Type\")";
mostCurrent._spinsearch.Add("Select Search Type");
 //BA.debugLineNum = 1001;BA.debugLine="SpinSearch.Add(\"Model\")";
mostCurrent._spinsearch.Add("Model");
 //BA.debugLineNum = 1002;BA.debugLine="spinnerMap.Put(\"Model\",\"model\")";
mostCurrent._spinnermap.Put((Object)("Model"),(Object)("model"));
 break; }
case 1: {
 //BA.debugLineNum = 1005;BA.debugLine="SpinSearch.Enabled = True";
mostCurrent._spinsearch.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1006;BA.debugLine="SpinSearch.add(\"Select Search Type\")";
mostCurrent._spinsearch.Add("Select Search Type");
 //BA.debugLineNum = 1007;BA.debugLine="SpinSearch.Add(\"Name\")";
mostCurrent._spinsearch.Add("Name");
 //BA.debugLineNum = 1008;BA.debugLine="spinnerMap.Put(\"Name\",\"name\")";
mostCurrent._spinnermap.Put((Object)("Name"),(Object)("name"));
 //BA.debugLineNum = 1009;BA.debugLine="SpinSearch.Add(\"Radius\")";
mostCurrent._spinsearch.Add("Radius");
 //BA.debugLineNum = 1010;BA.debugLine="spinnerMap.Put(\"Radius\",\"radius\")";
mostCurrent._spinnermap.Put((Object)("Radius"),(Object)("radius"));
 //BA.debugLineNum = 1011;BA.debugLine="SpinSearch.Add(\"Type\")";
mostCurrent._spinsearch.Add("Type");
 //BA.debugLineNum = 1012;BA.debugLine="spinnerMap.Put(\"Type\",\"type\")";
mostCurrent._spinnermap.Put((Object)("Type"),(Object)("type"));
 //BA.debugLineNum = 1013;BA.debugLine="SpinSearch.Add(\"Jorong\")";
mostCurrent._spinsearch.Add("Jorong");
 //BA.debugLineNum = 1014;BA.debugLine="spinnerMap.Put(\"Jorong\",\"jorong\")";
mostCurrent._spinnermap.Put((Object)("Jorong"),(Object)("jorong"));
 //BA.debugLineNum = 1015;BA.debugLine="SpinSearch.Add(\"Construction\")";
mostCurrent._spinsearch.Add("Construction");
 //BA.debugLineNum = 1016;BA.debugLine="spinnerMap.Put(\"Construction\",\"construction\")";
mostCurrent._spinnermap.Put((Object)("Construction"),(Object)("construction"));
 //BA.debugLineNum = 1017;BA.debugLine="SpinSearch.Add(\"Facility\")";
mostCurrent._spinsearch.Add("Facility");
 //BA.debugLineNum = 1018;BA.debugLine="spinnerMap.Put(\"Facility\",\"facility\")";
mostCurrent._spinnermap.Put((Object)("Facility"),(Object)("facility"));
 //BA.debugLineNum = 1019;BA.debugLine="SpinSearch.Add(\"Land Area\")";
mostCurrent._spinsearch.Add("Land Area");
 //BA.debugLineNum = 1020;BA.debugLine="spinnerMap.Put(\"Land Area\",\"land area\")";
mostCurrent._spinnermap.Put((Object)("Land Area"),(Object)("land area"));
 //BA.debugLineNum = 1021;BA.debugLine="SpinSearch.Add(\"Building Area\")";
mostCurrent._spinsearch.Add("Building Area");
 //BA.debugLineNum = 1022;BA.debugLine="spinnerMap.Put(\"Building Area\",\"building area\")";
mostCurrent._spinnermap.Put((Object)("Building Area"),(Object)("building area"));
 //BA.debugLineNum = 1023;BA.debugLine="SpinSearch.Add(\"Standing Year\")";
mostCurrent._spinsearch.Add("Standing Year");
 //BA.debugLineNum = 1024;BA.debugLine="spinnerMap.Put(\"Standing Year\",\"standing year\")";
mostCurrent._spinnermap.Put((Object)("Standing Year"),(Object)("standing year"));
 break; }
case 2: 
case 3: {
 //BA.debugLineNum = 1027;BA.debugLine="SpinSearch.Enabled = True";
mostCurrent._spinsearch.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1028;BA.debugLine="SpinSearch.add(\"Select Search Type\")";
mostCurrent._spinsearch.Add("Select Search Type");
 //BA.debugLineNum = 1029;BA.debugLine="SpinSearch.Add(\"Name\")";
mostCurrent._spinsearch.Add("Name");
 //BA.debugLineNum = 1030;BA.debugLine="spinnerMap.Put(\"Name\",\"name\")";
mostCurrent._spinnermap.Put((Object)("Name"),(Object)("name"));
 //BA.debugLineNum = 1031;BA.debugLine="SpinSearch.Add(\"Radius\")";
mostCurrent._spinsearch.Add("Radius");
 //BA.debugLineNum = 1032;BA.debugLine="spinnerMap.Put(\"Radius\",\"radius\")";
mostCurrent._spinnermap.Put((Object)("Radius"),(Object)("radius"));
 //BA.debugLineNum = 1033;BA.debugLine="SpinSearch.Add(\"Type\")";
mostCurrent._spinsearch.Add("Type");
 //BA.debugLineNum = 1034;BA.debugLine="spinnerMap.Put(\"Type\",\"type\")";
mostCurrent._spinnermap.Put((Object)("Type"),(Object)("type"));
 //BA.debugLineNum = 1035;BA.debugLine="SpinSearch.Add(\"Jorong\")";
mostCurrent._spinsearch.Add("Jorong");
 //BA.debugLineNum = 1036;BA.debugLine="spinnerMap.Put(\"Jorong\",\"jorong\")";
mostCurrent._spinnermap.Put((Object)("Jorong"),(Object)("jorong"));
 //BA.debugLineNum = 1037;BA.debugLine="If File.Exists(File.DirInternal,\"datastore\") Th";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"datastore")) { 
 //BA.debugLineNum = 1038;BA.debugLine="If Main.kvs.ContainsKey(\"role\") == True Then";
if (mostCurrent._main._kvs._containskey("role")==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 1039;BA.debugLine="SpinSearch.Add(\"Income\")";
mostCurrent._spinsearch.Add("Income");
 //BA.debugLineNum = 1040;BA.debugLine="spinnerMap.Put(\"Income\",\"income\")";
mostCurrent._spinnermap.Put((Object)("Income"),(Object)("income"));
 };
 };
 //BA.debugLineNum = 1043;BA.debugLine="SpinSearch.Add(\"Construction\")";
mostCurrent._spinsearch.Add("Construction");
 //BA.debugLineNum = 1044;BA.debugLine="spinnerMap.Put(\"Construction\",\"construction\")";
mostCurrent._spinnermap.Put((Object)("Construction"),(Object)("construction"));
 //BA.debugLineNum = 1045;BA.debugLine="SpinSearch.Add(\"Facility\")";
mostCurrent._spinsearch.Add("Facility");
 //BA.debugLineNum = 1046;BA.debugLine="spinnerMap.Put(\"Facility\",\"facility\")";
mostCurrent._spinnermap.Put((Object)("Facility"),(Object)("facility"));
 break; }
case 4: {
 //BA.debugLineNum = 1049;BA.debugLine="SpinSearch.Enabled = True";
mostCurrent._spinsearch.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1050;BA.debugLine="SpinSearch.add(\"Select Search Type\")";
mostCurrent._spinsearch.Add("Select Search Type");
 //BA.debugLineNum = 1051;BA.debugLine="SpinSearch.Add(\"Name\")";
mostCurrent._spinsearch.Add("Name");
 //BA.debugLineNum = 1052;BA.debugLine="spinnerMap.Put(\"Name\",\"name\")";
mostCurrent._spinnermap.Put((Object)("Name"),(Object)("name"));
 //BA.debugLineNum = 1053;BA.debugLine="SpinSearch.Add(\"Radius\")";
mostCurrent._spinsearch.Add("Radius");
 //BA.debugLineNum = 1054;BA.debugLine="spinnerMap.Put(\"Radius\",\"radius\")";
mostCurrent._spinnermap.Put((Object)("Radius"),(Object)("radius"));
 //BA.debugLineNum = 1055;BA.debugLine="SpinSearch.Add(\"Type\")";
mostCurrent._spinsearch.Add("Type");
 //BA.debugLineNum = 1056;BA.debugLine="spinnerMap.Put(\"Type\",\"type\")";
mostCurrent._spinnermap.Put((Object)("Type"),(Object)("type"));
 //BA.debugLineNum = 1057;BA.debugLine="SpinSearch.Add(\"Jorong\")";
mostCurrent._spinsearch.Add("Jorong");
 //BA.debugLineNum = 1058;BA.debugLine="spinnerMap.Put(\"Jorong\",\"jorong\")";
mostCurrent._spinnermap.Put((Object)("Jorong"),(Object)("jorong"));
 //BA.debugLineNum = 1059;BA.debugLine="SpinSearch.Add(\"Facility\")";
mostCurrent._spinsearch.Add("Facility");
 //BA.debugLineNum = 1060;BA.debugLine="spinnerMap.Put(\"Facility\",\"facility\")";
mostCurrent._spinnermap.Put((Object)("Facility"),(Object)("facility"));
 break; }
case 5: {
 //BA.debugLineNum = 1063;BA.debugLine="SpinSearch.Enabled = True";
mostCurrent._spinsearch.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1064;BA.debugLine="SpinSearch.add(\"Select Search Type\")";
mostCurrent._spinsearch.Add("Select Search Type");
 //BA.debugLineNum = 1065;BA.debugLine="SpinSearch.Add(\"ID Rumah\")";
mostCurrent._spinsearch.Add("ID Rumah");
 //BA.debugLineNum = 1066;BA.debugLine="spinnerMap.Put(\"ID Rumah\",\"id\")";
mostCurrent._spinnermap.Put((Object)("ID Rumah"),(Object)("id"));
 //BA.debugLineNum = 1067;BA.debugLine="If File.Exists(File.DirInternal,\"datastore\") Th";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"datastore")) { 
 //BA.debugLineNum = 1068;BA.debugLine="If Main.kvs.ContainsKey(\"role\") == True Then";
if (mostCurrent._main._kvs._containskey("role")==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 1069;BA.debugLine="SpinSearch.Add(\"Owner\")";
mostCurrent._spinsearch.Add("Owner");
 //BA.debugLineNum = 1070;BA.debugLine="spinnerMap.Put(\"Owner\",\"owner\")";
mostCurrent._spinnermap.Put((Object)("Owner"),(Object)("owner"));
 //BA.debugLineNum = 1071;BA.debugLine="SpinSearch.Add(\"Occupant\")";
mostCurrent._spinsearch.Add("Occupant");
 //BA.debugLineNum = 1072;BA.debugLine="spinnerMap.Put(\"Occupant\",\"occupant\")";
mostCurrent._spinnermap.Put((Object)("Occupant"),(Object)("occupant"));
 //BA.debugLineNum = 1073;BA.debugLine="SpinSearch.Add(\"FCN Owner\")";
mostCurrent._spinsearch.Add("FCN Owner");
 //BA.debugLineNum = 1074;BA.debugLine="spinnerMap.Put(\"FCN Owner\",\"fcn owner\")";
mostCurrent._spinnermap.Put((Object)("FCN Owner"),(Object)("fcn owner"));
 //BA.debugLineNum = 1075;BA.debugLine="SpinSearch.Add(\"FCN Occupant\")";
mostCurrent._spinsearch.Add("FCN Occupant");
 //BA.debugLineNum = 1076;BA.debugLine="spinnerMap.Put(\"FCN Occupant\",\"fcn occupant\")";
mostCurrent._spinnermap.Put((Object)("FCN Occupant"),(Object)("fcn occupant"));
 //BA.debugLineNum = 1077;BA.debugLine="SpinSearch.Add(\"Income\")";
mostCurrent._spinsearch.Add("Income");
 //BA.debugLineNum = 1078;BA.debugLine="spinnerMap.Put(\"Income\",\"income\")";
mostCurrent._spinnermap.Put((Object)("Income"),(Object)("income"));
 //BA.debugLineNum = 1079;BA.debugLine="SpinSearch.Add(\"Datuk\")";
mostCurrent._spinsearch.Add("Datuk");
 //BA.debugLineNum = 1080;BA.debugLine="spinnerMap.Put(\"Datuk\",\"datuk\")";
mostCurrent._spinnermap.Put((Object)("Datuk"),(Object)("datuk"));
 //BA.debugLineNum = 1081;BA.debugLine="SpinSearch.Add(\"Tribe\")";
mostCurrent._spinsearch.Add("Tribe");
 //BA.debugLineNum = 1082;BA.debugLine="spinnerMap.Put(\"Tribe\",\"tribe\")";
mostCurrent._spinnermap.Put((Object)("Tribe"),(Object)("tribe"));
 //BA.debugLineNum = 1083;BA.debugLine="SpinSearch.Add(\"Village\")";
mostCurrent._spinsearch.Add("Village");
 //BA.debugLineNum = 1084;BA.debugLine="spinnerMap.Put(\"Village\",\"village\")";
mostCurrent._spinnermap.Put((Object)("Village"),(Object)("village"));
 //BA.debugLineNum = 1085;BA.debugLine="SpinSearch.Add(\"Construction\")";
mostCurrent._spinsearch.Add("Construction");
 //BA.debugLineNum = 1086;BA.debugLine="spinnerMap.Put(\"Construction\",\"construction\")";
mostCurrent._spinnermap.Put((Object)("Construction"),(Object)("construction"));
 //BA.debugLineNum = 1087;BA.debugLine="SpinSearch.Add(\"Standing Year\")";
mostCurrent._spinsearch.Add("Standing Year");
 //BA.debugLineNum = 1088;BA.debugLine="spinnerMap.Put(\"Standing Year\",\"standing year";
mostCurrent._spinnermap.Put((Object)("Standing Year"),(Object)("standing year"));
 //BA.debugLineNum = 1089;BA.debugLine="SpinSearch.Add(\"Electric Capacity\")";
mostCurrent._spinsearch.Add("Electric Capacity");
 //BA.debugLineNum = 1090;BA.debugLine="spinnerMap.Put(\"Electric Capacity\",\"electric";
mostCurrent._spinnermap.Put((Object)("Electric Capacity"),(Object)("electric capacity"));
 //BA.debugLineNum = 1091;BA.debugLine="SpinSearch.Add(\"Education\")";
mostCurrent._spinsearch.Add("Education");
 //BA.debugLineNum = 1092;BA.debugLine="spinnerMap.Put(\"Education\",\"education\")";
mostCurrent._spinnermap.Put((Object)("Education"),(Object)("education"));
 //BA.debugLineNum = 1093;BA.debugLine="SpinSearch.Add(\"Inhabited House\")";
mostCurrent._spinsearch.Add("Inhabited House");
 //BA.debugLineNum = 1094;BA.debugLine="spinnerMap.Put(\"Inhabited House\",\"inhabited\")";
mostCurrent._spinnermap.Put((Object)("Inhabited House"),(Object)("inhabited"));
 //BA.debugLineNum = 1095;BA.debugLine="SpinSearch.Add(\"Empty House\")";
mostCurrent._spinsearch.Add("Empty House");
 //BA.debugLineNum = 1096;BA.debugLine="spinnerMap.Put(\"Empty House\",\"empty\")";
mostCurrent._spinnermap.Put((Object)("Empty House"),(Object)("empty"));
 };
 };
 break; }
case 6: {
 //BA.debugLineNum = 1101;BA.debugLine="SpinSearch.Enabled = True";
mostCurrent._spinsearch.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1102;BA.debugLine="SpinSearch.add(\"Select Search Type\")";
mostCurrent._spinsearch.Add("Select Search Type");
 //BA.debugLineNum = 1103;BA.debugLine="SpinSearch.Add(\"Name\")";
mostCurrent._spinsearch.Add("Name");
 //BA.debugLineNum = 1104;BA.debugLine="spinnerMap.Put(\"Name\",\"name\")";
mostCurrent._spinnermap.Put((Object)("Name"),(Object)("name"));
 //BA.debugLineNum = 1105;BA.debugLine="SpinSearch.Add(\"Radius\")";
mostCurrent._spinsearch.Add("Radius");
 //BA.debugLineNum = 1106;BA.debugLine="spinnerMap.Put(\"Radius\",\"radius\")";
mostCurrent._spinnermap.Put((Object)("Radius"),(Object)("radius"));
 //BA.debugLineNum = 1107;BA.debugLine="SpinSearch.Add(\"Type\")";
mostCurrent._spinsearch.Add("Type");
 //BA.debugLineNum = 1108;BA.debugLine="spinnerMap.Put(\"Type\",\"type\")";
mostCurrent._spinnermap.Put((Object)("Type"),(Object)("type"));
 //BA.debugLineNum = 1109;BA.debugLine="SpinSearch.Add(\"Status\")";
mostCurrent._spinsearch.Add("Status");
 //BA.debugLineNum = 1110;BA.debugLine="spinnerMap.Put(\"Status\",\"status\")";
mostCurrent._spinnermap.Put((Object)("Status"),(Object)("status"));
 //BA.debugLineNum = 1111;BA.debugLine="SpinSearch.Add(\"Jorong\")";
mostCurrent._spinsearch.Add("Jorong");
 //BA.debugLineNum = 1112;BA.debugLine="spinnerMap.Put(\"Jorong\",\"jorong\")";
mostCurrent._spinnermap.Put((Object)("Jorong"),(Object)("jorong"));
 //BA.debugLineNum = 1113;BA.debugLine="SpinSearch.Add(\"Construction\")";
mostCurrent._spinsearch.Add("Construction");
 //BA.debugLineNum = 1114;BA.debugLine="spinnerMap.Put(\"Construction\",\"construction\")";
mostCurrent._spinnermap.Put((Object)("Construction"),(Object)("construction"));
 //BA.debugLineNum = 1115;BA.debugLine="SpinSearch.Add(\"Facility\")";
mostCurrent._spinsearch.Add("Facility");
 //BA.debugLineNum = 1116;BA.debugLine="spinnerMap.Put(\"Facility\",\"facility\")";
mostCurrent._spinnermap.Put((Object)("Facility"),(Object)("facility"));
 //BA.debugLineNum = 1117;BA.debugLine="SpinSearch.Add(\"Land Area\")";
mostCurrent._spinsearch.Add("Land Area");
 //BA.debugLineNum = 1118;BA.debugLine="spinnerMap.Put(\"Land Area\",\"land area\")";
mostCurrent._spinnermap.Put((Object)("Land Area"),(Object)("land area"));
 //BA.debugLineNum = 1119;BA.debugLine="SpinSearch.Add(\"Building Area\")";
mostCurrent._spinsearch.Add("Building Area");
 //BA.debugLineNum = 1120;BA.debugLine="spinnerMap.Put(\"Building Area\",\"building area\")";
mostCurrent._spinnermap.Put((Object)("Building Area"),(Object)("building area"));
 break; }
default: {
 //BA.debugLineNum = 1123;BA.debugLine="SpinSearch.Clear";
mostCurrent._spinsearch.Clear();
 //BA.debugLineNum = 1124;BA.debugLine="SpinJorong.Clear";
mostCurrent._spinjorong.Clear();
 //BA.debugLineNum = 1125;BA.debugLine="SpinSearch.Enabled = False";
mostCurrent._spinsearch.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1126;BA.debugLine="SpinJorong.Visible = False";
mostCurrent._spinjorong.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1127;BA.debugLine="SearchRadius.Visible = False";
mostCurrent._searchradius.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1128;BA.debugLine="SearchText.Visible = True";
mostCurrent._searchtext.setVisible(anywheresoftware.b4a.keywords.Common.True);
 break; }
}
;
 //BA.debugLineNum = 1131;BA.debugLine="SpinSearch.SelectedIndex=0";
mostCurrent._spinsearch.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1132;BA.debugLine="SpinJorong.Clear";
mostCurrent._spinjorong.Clear();
 //BA.debugLineNum = 1133;BA.debugLine="SpinType.Clear";
mostCurrent._spintype.Clear();
 //BA.debugLineNum = 1134;BA.debugLine="End Sub";
return "";
}
public static String  _spinsearch_itemclick(int _position,Object _value) throws Exception{
String _id = "";
 //BA.debugLineNum = 1136;BA.debugLine="Sub SpinSearch_ItemClick (Position As Int, Value A";
 //BA.debugLineNum = 1137;BA.debugLine="Dim id As String";
_id = "";
 //BA.debugLineNum = 1138;BA.debugLine="id = spinnerMap.Get(Value)";
_id = BA.ObjectToString(mostCurrent._spinnermap.Get(_value));
 //BA.debugLineNum = 1139;BA.debugLine="typesrc = id";
mostCurrent._typesrc = _id;
 //BA.debugLineNum = 1140;BA.debugLine="Log(typesrc)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._typesrc);
 //BA.debugLineNum = 1141;BA.debugLine="SpinJorong.SelectedIndex = 0";
mostCurrent._spinjorong.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1142;BA.debugLine="Select typesrc";
switch (BA.switchObjectToInt(mostCurrent._typesrc,"null","radius","jorong","type","construction","status","model","tribe","village","datuk","education","facility","land area","building area","standing year","income","electric capacity")) {
case 0: {
 //BA.debugLineNum = 1144;BA.debugLine="Label3.Visible=False";
mostCurrent._label3.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1145;BA.debugLine="FromText.Visible=False";
mostCurrent._fromtext.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1146;BA.debugLine="ToText.Visible=False";
mostCurrent._totext.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1147;BA.debugLine="FacilityBtn.Visible=False";
mostCurrent._facilitybtn.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1148;BA.debugLine="SearchText.Enabled = False";
mostCurrent._searchtext.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1149;BA.debugLine="SearchText.Visible = True";
mostCurrent._searchtext.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1150;BA.debugLine="SearchRadius.Visible = False";
mostCurrent._searchradius.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1151;BA.debugLine="SpinJorong.Visible = False";
mostCurrent._spinjorong.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1152;BA.debugLine="SpinType.Visible = False";
mostCurrent._spintype.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1153;BA.debugLine="SearchTextPanel.Color = Colors.White";
mostCurrent._searchtextpanel.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 1154;BA.debugLine="SearchText.Text = \"\"";
mostCurrent._searchtext.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1155;BA.debugLine="SpinJorong.Clear";
mostCurrent._spinjorong.Clear();
 //BA.debugLineNum = 1156;BA.debugLine="SpinType.Clear";
mostCurrent._spintype.Clear();
 break; }
case 1: {
 //BA.debugLineNum = 1159;BA.debugLine="Label3.Visible=True";
mostCurrent._label3.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1160;BA.debugLine="FromText.Visible=False";
mostCurrent._fromtext.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1161;BA.debugLine="ToText.Visible=False";
mostCurrent._totext.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1162;BA.debugLine="FacilityBtn.Visible=False";
mostCurrent._facilitybtn.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1163;BA.debugLine="SearchText.Visible = False";
mostCurrent._searchtext.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1164;BA.debugLine="SpinJorong.Visible = False";
mostCurrent._spinjorong.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1165;BA.debugLine="SearchRadius.Visible = True";
mostCurrent._searchradius.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1166;BA.debugLine="SearchRadius.Max = 10000";
mostCurrent._searchradius.setMax((int) (10000));
 //BA.debugLineNum = 1167;BA.debugLine="SpinType.Visible = False";
mostCurrent._spintype.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1168;BA.debugLine="SpinType.Clear";
mostCurrent._spintype.Clear();
 //BA.debugLineNum = 1169;BA.debugLine="SearchTextPanel.Color = Colors.Transparent";
mostCurrent._searchtextpanel.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 1170;BA.debugLine="SpinJorong.Clear";
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
 //BA.debugLineNum = 1173;BA.debugLine="FromText.Visible=False";
mostCurrent._fromtext.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1174;BA.debugLine="ToText.Visible=False";
mostCurrent._totext.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1175;BA.debugLine="SearchTextPanel.Color = Colors.White";
mostCurrent._searchtextpanel.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 1176;BA.debugLine="SpinType.Visible = True";
mostCurrent._spintype.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1177;BA.debugLine="SpinType.Clear";
mostCurrent._spintype.Clear();
 //BA.debugLineNum = 1178;BA.debugLine="CreateSpinType_Item";
_createspintype_item();
 //BA.debugLineNum = 1179;BA.debugLine="FacilityBtn.Visible=False";
mostCurrent._facilitybtn.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1180;BA.debugLine="SearchText.Visible = False";
mostCurrent._searchtext.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1181;BA.debugLine="SearchRadius.Visible = False";
mostCurrent._searchradius.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1182;BA.debugLine="SpinJorong.Visible = False";
mostCurrent._spinjorong.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1183;BA.debugLine="Label3.Visible=False";
mostCurrent._label3.setVisible(anywheresoftware.b4a.keywords.Common.False);
 break; }
case 11: {
 //BA.debugLineNum = 1186;BA.debugLine="Label3.Visible=False";
mostCurrent._label3.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1187;BA.debugLine="FromText.Visible=False";
mostCurrent._fromtext.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1188;BA.debugLine="ToText.Visible=False";
mostCurrent._totext.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1189;BA.debugLine="FacilityBtn.Visible=True";
mostCurrent._facilitybtn.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1190;BA.debugLine="SearchText.Visible = False";
mostCurrent._searchtext.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1191;BA.debugLine="SearchRadius.Visible = False";
mostCurrent._searchradius.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1192;BA.debugLine="SpinJorong.Visible = False";
mostCurrent._spinjorong.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1193;BA.debugLine="SpinType.Visible = False";
mostCurrent._spintype.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1194;BA.debugLine="SearchTextPanel.Color = Colors.Transparent";
mostCurrent._searchtextpanel.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 1195;BA.debugLine="SpinJorong.Clear";
mostCurrent._spinjorong.Clear();
 //BA.debugLineNum = 1196;BA.debugLine="SpinType.Clear";
mostCurrent._spintype.Clear();
 break; }
case 12: 
case 13: 
case 14: 
case 15: 
case 16: {
 //BA.debugLineNum = 1199;BA.debugLine="Label3.Visible=False";
mostCurrent._label3.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1200;BA.debugLine="FromText.Visible=True";
mostCurrent._fromtext.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1201;BA.debugLine="ToText.Visible=True";
mostCurrent._totext.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1202;BA.debugLine="FromText.Text=\"\"";
mostCurrent._fromtext.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1203;BA.debugLine="ToText.Text=\"\"";
mostCurrent._totext.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1204;BA.debugLine="FacilityBtn.Visible=False";
mostCurrent._facilitybtn.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1205;BA.debugLine="SearchText.Visible = False";
mostCurrent._searchtext.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1206;BA.debugLine="SearchRadius.Visible = False";
mostCurrent._searchradius.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1207;BA.debugLine="SpinJorong.Visible = False";
mostCurrent._spinjorong.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1208;BA.debugLine="SpinType.Visible = False";
mostCurrent._spintype.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1209;BA.debugLine="SearchTextPanel.Color = Colors.Transparent";
mostCurrent._searchtextpanel.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 1210;BA.debugLine="SpinJorong.Clear";
mostCurrent._spinjorong.Clear();
 //BA.debugLineNum = 1211;BA.debugLine="SpinType.Clear";
mostCurrent._spintype.Clear();
 break; }
default: {
 //BA.debugLineNum = 1214;BA.debugLine="Label3.Visible=False";
mostCurrent._label3.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1215;BA.debugLine="FromText.Visible=False";
mostCurrent._fromtext.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1216;BA.debugLine="ToText.Visible=False";
mostCurrent._totext.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1217;BA.debugLine="FacilityBtn.Visible=False";
mostCurrent._facilitybtn.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1218;BA.debugLine="SearchText.Visible = True";
mostCurrent._searchtext.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1219;BA.debugLine="SearchRadius.Visible = False";
mostCurrent._searchradius.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1220;BA.debugLine="SpinJorong.Visible = False";
mostCurrent._spinjorong.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1221;BA.debugLine="SpinType.Visible = False";
mostCurrent._spintype.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1222;BA.debugLine="SearchTextPanel.Color = Colors.White";
mostCurrent._searchtextpanel.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 1223;BA.debugLine="SearchText.Text = \"\"";
mostCurrent._searchtext.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1224;BA.debugLine="SpinJorong.Clear";
mostCurrent._spinjorong.Clear();
 //BA.debugLineNum = 1225;BA.debugLine="SpinType.Clear";
mostCurrent._spintype.Clear();
 break; }
}
;
 //BA.debugLineNum = 1227;BA.debugLine="End Sub";
return "";
}
public static String  _spintype_itemclick(int _position,Object _value) throws Exception{
String _id = "";
 //BA.debugLineNum = 1229;BA.debugLine="Sub SpinType_ItemClick (Position As Int, Value As";
 //BA.debugLineNum = 1230;BA.debugLine="Dim id As String";
_id = "";
 //BA.debugLineNum = 1231;BA.debugLine="id = spinnerMapT.Get(Value)";
_id = BA.ObjectToString(mostCurrent._spinnermapt.Get(_value));
 //BA.debugLineNum = 1232;BA.debugLine="typeid = id";
mostCurrent._typeid = _id;
 //BA.debugLineNum = 1233;BA.debugLine="Log(typeid)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._typeid);
 //BA.debugLineNum = 1234;BA.debugLine="End Sub";
return "";
}
}
