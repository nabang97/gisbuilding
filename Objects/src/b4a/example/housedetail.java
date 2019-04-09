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

public class housedetail extends Activity implements B4AActivity{
	public static housedetail mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.housedetail");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (housedetail).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.housedetail");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.housedetail", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (housedetail) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (housedetail) Resume **");
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
		return housedetail.class;
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
        BA.LogInfo("** Activity (housedetail) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (housedetail) Resume **");
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
public static String _lat = "";
public static String _lng = "";
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _titlebar = null;
public anywheresoftware.b4a.objects.LabelWrapper _backarrow = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelbuildinglist = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelbutton = null;
public anywheresoftware.b4a.objects.LabelWrapper _houseid = null;
public anywheresoftware.b4a.objects.LabelWrapper _standingyear = null;
public anywheresoftware.b4a.objects.LabelWrapper _buildingtax = null;
public anywheresoftware.b4a.objects.LabelWrapper _electricity = null;
public anywheresoftware.b4a.objects.LabelWrapper _construction = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneltoolbar = null;
public static String _ids = "";
public anywheresoftware.b4a.objects.LabelWrapper _lbledit = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel4 = null;
public anywheresoftware.b4a.objects.TabHostWrapper _tabhost1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelmap = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnroute = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webviewroute = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfcnowner = null;
public anywheresoftware.b4a.objects.LabelWrapper _fcnowner = null;
public anywheresoftware.b4a.objects.LabelWrapper _address = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblstandingyear = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblbuildingtax = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbladdress = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblelectric = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcons = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.editbuildingfacility _editbuildingfacility = null;
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
 //BA.debugLineNum = 46;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 48;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
 //BA.debugLineNum = 49;BA.debugLine="ScrollView1.Panel.LoadLayout(\"HouseDetail\")";
mostCurrent._scrollview1.getPanel().LoadLayout("HouseDetail",mostCurrent.activityBA);
 //BA.debugLineNum = 50;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._panelbuildinglist.getHeight());
 //BA.debugLineNum = 51;BA.debugLine="PanelToolBar.Visible = False";
mostCurrent._paneltoolbar.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 53;BA.debugLine="BackArrow.Visible= True";
mostCurrent._backarrow.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 54;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
mostCurrent._backarrow.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"back-arrow.png").getObject()));
 //BA.debugLineNum = 55;BA.debugLine="TitleBar.Text=\"Building Detail\"";
mostCurrent._titlebar.setText(BA.ObjectToCharSequence("Building Detail"));
 //BA.debugLineNum = 57;BA.debugLine="TabHost1.AddTab(\"Map\",\"tabMap\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Map","tabMap");
 //BA.debugLineNum = 58;BA.debugLine="TabHost1.AddTab(\"Detail\",\"House_tabDetail\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Detail","House_tabDetail");
 //BA.debugLineNum = 59;BA.debugLine="TabHost1.AddTab(\"Gallery\",\"tabGallery\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Gallery","tabGallery");
 //BA.debugLineNum = 62;BA.debugLine="If SearchBuilding.nameBuilding.Length > 0 Then";
if (mostCurrent._searchbuilding._namebuilding.length()>0) { 
 //BA.debugLineNum = 63;BA.debugLine="HouseID.Text = SearchBuilding.nameBuilding";
mostCurrent._houseid.setText(BA.ObjectToCharSequence(mostCurrent._searchbuilding._namebuilding));
 //BA.debugLineNum = 64;BA.debugLine="ids = SearchBuilding.idBuilding";
mostCurrent._ids = mostCurrent._searchbuilding._idbuilding;
 //BA.debugLineNum = 65;BA.debugLine="Log(ids)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._ids);
 }else {
 //BA.debugLineNum = 67;BA.debugLine="HouseID.Text = \"Please press on the button and c";
mostCurrent._houseid.setText(BA.ObjectToCharSequence("Please press on the button and choose an item."));
 };
 //BA.debugLineNum = 70;BA.debugLine="TabHost1.CurrentTab = 1";
mostCurrent._tabhost1.setCurrentTab((int) (1));
 //BA.debugLineNum = 71;BA.debugLine="Log(\"Height awal: \"&Address.Height)";
anywheresoftware.b4a.keywords.Common.Log("Height awal: "+BA.NumberToString(mostCurrent._address.getHeight()));
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 80;BA.debugLine="ProgressDialogShow(\"loading...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("loading..."));
 //BA.debugLineNum = 81;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.fcn_owner, H.address";
_executeremotequery("SELECT H.fcn_owner, H.address, H.standing_year, H.land_building_tax, H.type_of_construction, H.electricity_capacity, H.tap_water, H.building_status,ST_X(ST_Centroid(H.geom)) As longitude, ST_Y(ST_CENTROID(H.geom)) As latitude, ST_AsText(H.geom) As geom,T.name_of_type As jkonstruksi, O.*	FROM house_building As H LEFT JOIN type_of_construction As T ON H.type_of_construction=T.type_id JOIN house_building_owner As O ON H.fcn_owner=O.national_identity_number WHERE H.house_building_id='"+mostCurrent._ids+"' ","DATA");
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public static String  _backarrow_click() throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub BackArrow_Click";
 //BA.debugLineNum = 134;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public static String  _executeremotequery(String _query,String _jobname) throws Exception{
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
 //BA.debugLineNum = 74;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
 //BA.debugLineNum = 75;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
 //BA.debugLineNum = 76;BA.debugLine="Job.Initialize(JobName, Me)";
_job._initialize(processBA,_jobname,housedetail.getObject());
 //BA.debugLineNum = 77;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
_job._poststring(""+mostCurrent._main._server+"mobile/json.php",_query);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private ScrollView1 As ScrollView";
mostCurrent._scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private TitleBar As Label";
mostCurrent._titlebar = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private BackArrow As Label";
mostCurrent._backarrow = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private PanelBuildingList As Panel";
mostCurrent._panelbuildinglist = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private PanelButton As Panel";
mostCurrent._panelbutton = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim HouseID As Label";
mostCurrent._houseid = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private StandingYear As Label";
mostCurrent._standingyear = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private BuildingTax As Label";
mostCurrent._buildingtax = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private Electricity As Label";
mostCurrent._electricity = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private Construction As Label";
mostCurrent._construction = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private PanelToolBar As Panel";
mostCurrent._paneltoolbar = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Dim ids As String";
mostCurrent._ids = "";
 //BA.debugLineNum = 29;BA.debugLine="Private LblEdit As Label";
mostCurrent._lbledit = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private Panel4 As Panel";
mostCurrent._panel4 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Dim TabHost1 As TabHost";
mostCurrent._tabhost1 = new anywheresoftware.b4a.objects.TabHostWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private PanelMap As Panel";
mostCurrent._panelmap = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private btnRoute As Button";
mostCurrent._btnroute = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private WebViewRoute As WebView";
mostCurrent._webviewroute = new anywheresoftware.b4a.objects.WebViewWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private LblFcnOwner As Label";
mostCurrent._lblfcnowner = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private FcnOwner As Label";
mostCurrent._fcnowner = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private Address As Label";
mostCurrent._address = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private LblStandingYear As Label";
mostCurrent._lblstandingyear = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private LblBuildingTax As Label";
mostCurrent._lblbuildingtax = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private LblAddress As Label";
mostCurrent._lbladdress = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private LblElectric As Label";
mostCurrent._lblelectric = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private LblCons As Label";
mostCurrent._lblcons = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private Label2 As Label";
mostCurrent._label2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _data_array = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _a = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
int _heightlabel = 0;
 //BA.debugLineNum = 88;BA.debugLine="Sub JobDone(Job As HttpJob)";
 //BA.debugLineNum = 89;BA.debugLine="If Job.Success Then";
if (_job._success) { 
 //BA.debugLineNum = 90;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 91;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
 //BA.debugLineNum = 92;BA.debugLine="Log(\"Response from server :\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server :"+_res);
 //BA.debugLineNum = 93;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 94;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
 //BA.debugLineNum = 95;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"DATA")) {
case 0: {
 //BA.debugLineNum = 98;BA.debugLine="Dim data_array As List";
_data_array = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 99;BA.debugLine="data_array = parser.NextArray";
_data_array = _parser.NextArray();
 //BA.debugLineNum = 100;BA.debugLine="For i=0 To data_array.Size -1";
{
final int step11 = 1;
final int limit11 = (int) (_data_array.getSize()-1);
_i = (int) (0) ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
 //BA.debugLineNum = 101;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 102;BA.debugLine="a = data_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_data_array.Get(_i)));
 //BA.debugLineNum = 103;BA.debugLine="lat = a.Get(\"latitude\")";
_lat = BA.ObjectToString(_a.Get((Object)("latitude")));
 //BA.debugLineNum = 104;BA.debugLine="lng = a.Get(\"longitude\")";
_lng = BA.ObjectToString(_a.Get((Object)("longitude")));
 //BA.debugLineNum = 105;BA.debugLine="Log(lat)";
anywheresoftware.b4a.keywords.Common.Log(_lat);
 //BA.debugLineNum = 106;BA.debugLine="Log(lng)";
anywheresoftware.b4a.keywords.Common.Log(_lng);
 //BA.debugLineNum = 107;BA.debugLine="FcnOwner.Text = a.Get (\"fcn_owner\")";
mostCurrent._fcnowner.setText(BA.ObjectToCharSequence(_a.Get((Object)("fcn_owner"))));
 //BA.debugLineNum = 108;BA.debugLine="StandingYear.Text = a.Get(\"standing_year\")";
mostCurrent._standingyear.setText(BA.ObjectToCharSequence(_a.Get((Object)("standing_year"))));
 //BA.debugLineNum = 109;BA.debugLine="Address.Text = a.Get(\"address\")";
mostCurrent._address.setText(BA.ObjectToCharSequence(_a.Get((Object)("address"))));
 //BA.debugLineNum = 110;BA.debugLine="BuildingTax.Text = a.Get(\"land_building_tax\")";
mostCurrent._buildingtax.setText(BA.ObjectToCharSequence(_a.Get((Object)("land_building_tax"))));
 //BA.debugLineNum = 111;BA.debugLine="Electricity.Text = a.Get(\"electricity_capacit";
mostCurrent._electricity.setText(BA.ObjectToCharSequence(_a.Get((Object)("electricity_capacity"))));
 //BA.debugLineNum = 112;BA.debugLine="Construction.Text = a.Get(\"jkonstruksi\")";
mostCurrent._construction.setText(BA.ObjectToCharSequence(_a.Get((Object)("jkonstruksi"))));
 }
};
 //BA.debugLineNum = 114;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 115;BA.debugLine="Dim heightlabel As Int";
_heightlabel = 0;
 //BA.debugLineNum = 116;BA.debugLine="heightlabel = su.MeasureMultilineTextHeight(Ad";
_heightlabel = _su.MeasureMultilineTextHeight((android.widget.TextView)(mostCurrent._address.getObject()),BA.ObjectToCharSequence(mostCurrent._address.getText()));
 //BA.debugLineNum = 117;BA.debugLine="Log(\"Height akhir: \"&heightlabel)";
anywheresoftware.b4a.keywords.Common.Log("Height akhir: "+BA.NumberToString(_heightlabel));
 //BA.debugLineNum = 118;BA.debugLine="Address.Height= heightlabel";
mostCurrent._address.setHeight(_heightlabel);
 //BA.debugLineNum = 119;BA.debugLine="Select TabHost1.CurrentTab";
switch (BA.switchObjectToInt(mostCurrent._tabhost1.getCurrentTab(),(int) (1))) {
case 0: {
 //BA.debugLineNum = 121;BA.debugLine="TabHost1.Height = Panel4.Top + Panel4.Height";
mostCurrent._tabhost1.setHeight((int) (mostCurrent._panel4.getTop()+mostCurrent._panel4.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA)));
 break; }
}
;
 //BA.debugLineNum = 124;BA.debugLine="PanelBuildingList.Height = TabHost1.Height + T";
mostCurrent._panelbuildinglist.setHeight((int) (mostCurrent._tabhost1.getHeight()+mostCurrent._tabhost1.getTop()));
 //BA.debugLineNum = 125;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.H";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._panelbuildinglist.getHeight());
 //BA.debugLineNum = 126;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 break; }
}
;
 };
 //BA.debugLineNum = 130;BA.debugLine="Job.Release";
_job._release();
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public static String  _lbledit_click() throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub LblEdit_Click";
 //BA.debugLineNum = 138;BA.debugLine="StartActivity(OfficeEdit)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._officeedit.getObject()));
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 10;BA.debugLine="Dim lat, lng As String";
_lat = "";
_lng = "";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public static String  _tabhost1_tabchanged() throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub TabHost1_TabChanged";
 //BA.debugLineNum = 143;BA.debugLine="Select TabHost1.CurrentTab";
switch (BA.switchObjectToInt(mostCurrent._tabhost1.getCurrentTab(),(int) (0),(int) (1),(int) (2))) {
case 0: {
 //BA.debugLineNum = 145;BA.debugLine="WebViewRoute.LoadUrl(\"https://www.google.com/ma";
mostCurrent._webviewroute.LoadUrl("https://www.google.com/maps/@-0.8206655,100.3217247,15z");
 //BA.debugLineNum = 146;BA.debugLine="Msgbox(\"Current tab is \" & TabHost1.CurrentTab,";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Current tab is "+BA.NumberToString(mostCurrent._tabhost1.getCurrentTab())),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
 //BA.debugLineNum = 147;BA.debugLine="Log (\"Button Top :\"&btnRoute.Top)";
anywheresoftware.b4a.keywords.Common.Log("Button Top :"+BA.NumberToString(mostCurrent._btnroute.getTop()));
 //BA.debugLineNum = 148;BA.debugLine="TabHost1.Height = btnRoute.Top + btnRoute.Heigh";
mostCurrent._tabhost1.setHeight((int) (mostCurrent._btnroute.getTop()+mostCurrent._btnroute.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA)));
 //BA.debugLineNum = 149;BA.debugLine="Log(\"tabHost height: \"&TabHost1.Height)";
anywheresoftware.b4a.keywords.Common.Log("tabHost height: "+BA.NumberToString(mostCurrent._tabhost1.getHeight()));
 //BA.debugLineNum = 150;BA.debugLine="PanelBuildingList.Height = TabHost1.Height + Ta";
mostCurrent._panelbuildinglist.setHeight((int) (mostCurrent._tabhost1.getHeight()+mostCurrent._tabhost1.getTop()));
 //BA.debugLineNum = 151;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.He";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._panelbuildinglist.getHeight());
 //BA.debugLineNum = 152;BA.debugLine="ScrollView1.Height = ScrollView1.Panel.Height";
mostCurrent._scrollview1.setHeight(mostCurrent._scrollview1.getPanel().getHeight());
 break; }
case 1: {
 break; }
case 2: {
 //BA.debugLineNum = 156;BA.debugLine="Msgbox(\"Current tab is \" & TabHost1.CurrentTab,";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Current tab is "+BA.NumberToString(mostCurrent._tabhost1.getCurrentTab())),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
 break; }
}
;
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return "";
}
}