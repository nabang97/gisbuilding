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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.housedetail");
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
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollimage = null;
public b4a.example3.customlistview _clv = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
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
public anywheresoftware.b4a.objects.PanelWrapper _panelgallery = null;
public anywheresoftware.b4a.objects.ButtonWrapper _addpicture = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.officedetail _officedetail = null;
public b4a.example.functionall _functionall = null;
public b4a.example.searchbuilding _searchbuilding = null;
public b4a.example.educationaldetail _educationaldetail = null;
public b4a.example.healthdetail _healthdetail = null;
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
RDebugUtils.currentModule="housedetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="ScrollView1.Panel.LoadLayout(\"HouseDetail\")";
mostCurrent._scrollview1.getPanel().LoadLayout("HouseDetail",mostCurrent.activityBA);
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="ScrollView1.Height = 100%y - ScrollView1.Top";
mostCurrent._scrollview1.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._scrollview1.getTop()));
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="PanelToolBar.Visible = False";
mostCurrent._paneltoolbar.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="BackArrow.Visible= True";
mostCurrent._backarrow.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6357000;
 //BA.debugLineNum = 6357000;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
mostCurrent._backarrow.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"back-arrow.png").getObject()));
RDebugUtils.currentLine=6357001;
 //BA.debugLineNum = 6357001;BA.debugLine="TitleBar.Text=\"Building Detail\"";
mostCurrent._titlebar.setText(BA.ObjectToCharSequence("Building Detail"));
RDebugUtils.currentLine=6357003;
 //BA.debugLineNum = 6357003;BA.debugLine="TabHost1.AddTab(\"Map\",\"tabMap\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Map","tabMap");
RDebugUtils.currentLine=6357004;
 //BA.debugLineNum = 6357004;BA.debugLine="TabHost1.AddTab(\"Detail\",\"House_tabDetail\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Detail","House_tabDetail");
RDebugUtils.currentLine=6357005;
 //BA.debugLineNum = 6357005;BA.debugLine="TabHost1.AddTab(\"Gallery\",\"tabGallery\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Gallery","tabGallery");
RDebugUtils.currentLine=6357008;
 //BA.debugLineNum = 6357008;BA.debugLine="If SearchBuilding.nameBuilding.Length > 0 Then";
if (mostCurrent._searchbuilding._namebuilding.length()>0) { 
RDebugUtils.currentLine=6357009;
 //BA.debugLineNum = 6357009;BA.debugLine="HouseID.Text = SearchBuilding.nameBuilding";
mostCurrent._houseid.setText(BA.ObjectToCharSequence(mostCurrent._searchbuilding._namebuilding));
RDebugUtils.currentLine=6357010;
 //BA.debugLineNum = 6357010;BA.debugLine="ids = SearchBuilding.idBuilding";
mostCurrent._ids = mostCurrent._searchbuilding._idbuilding;
RDebugUtils.currentLine=6357011;
 //BA.debugLineNum = 6357011;BA.debugLine="Log(ids)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._ids);
 }else {
RDebugUtils.currentLine=6357013;
 //BA.debugLineNum = 6357013;BA.debugLine="HouseID.Text = \"Please press on the button and c";
mostCurrent._houseid.setText(BA.ObjectToCharSequence("Please press on the button and choose an item."));
 };
RDebugUtils.currentLine=6357016;
 //BA.debugLineNum = 6357016;BA.debugLine="TabHost1.CurrentTab = 1";
mostCurrent._tabhost1.setCurrentTab((int) (1));
RDebugUtils.currentLine=6357017;
 //BA.debugLineNum = 6357017;BA.debugLine="AddPicture.Initialize(\"AddPicture\")";
mostCurrent._addpicture.Initialize(mostCurrent.activityBA,"AddPicture");
RDebugUtils.currentLine=6357019;
 //BA.debugLineNum = 6357019;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="housedetail";
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="CallSub(Starter, \"ActivityIsPaused\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(processBA,(Object)(mostCurrent._starter.getObject()),"ActivityIsPaused");
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="housedetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="ProgressDialogShow(\"Loading...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Loading..."));
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="If TabHost1.CurrentTab == 2 Then";
if (mostCurrent._tabhost1.getCurrentTab()==2) { 
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="clv.Clear";
mostCurrent._clv._clear();
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="ExecuteRemoteQuery(\"SELECT photo_url, upload_dat";
_executeremotequery("SELECT photo_url, upload_date FROM house_building_gallery WHERE house_building_id='"+mostCurrent._ids+"'","Download");
 }else {
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.fcn_owner, H.address";
_executeremotequery("SELECT H.fcn_owner, H.address, H.standing_year, H.land_building_tax, H.type_of_construction, H.electricity_capacity, H.tap_water, H.building_status,ST_X(ST_Centroid(H.geom)) As longitude, ST_Y(ST_CENTROID(H.geom)) As latitude, ST_AsText(H.geom) As geom,T.name_of_type As jkonstruksi, O.*	FROM house_building As H LEFT JOIN type_of_construction As T ON H.type_of_construction=T.type_id JOIN house_building_owner As O ON H.fcn_owner=O.national_identity_number WHERE H.house_building_id='"+mostCurrent._ids+"' ","DATA");
 };
RDebugUtils.currentLine=6488072;
 //BA.debugLineNum = 6488072;BA.debugLine="End Sub";
return "";
}
public static String  _executeremotequery(String _query,String _jobname) throws Exception{
RDebugUtils.currentModule="housedetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "executeremotequery"))
	return (String) Debug.delegate(mostCurrent.activityBA, "executeremotequery", new Object[] {_query,_jobname});
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="Job.Initialize(JobName, Me)";
_job._initialize(processBA,_jobname,housedetail.getObject());
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
_job._poststring(""+mostCurrent._main._server+"mobile/json.php",_query);
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="End Sub";
return "";
}
public static String  _addpicture_click() throws Exception{
RDebugUtils.currentModule="housedetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "addpicture_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "addpicture_click", null);
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub AddPicture_Click";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="ToastMessageShow(\"Add photo\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Add photo"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="StartActivity(AddPhoto)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._addphoto.getObject()));
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="End Sub";
return "";
}
public static String  _backarrow_click() throws Exception{
RDebugUtils.currentModule="housedetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "backarrow_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "backarrow_click", null);
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub BackArrow_Click";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="End Sub";
return "";
}
public static String  _imageview1_click() throws Exception{
RDebugUtils.currentModule="housedetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imageview1_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "imageview1_click", null);
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub ImageView1_Click";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="iv = Sender";
_iv.setObject((android.widget.ImageView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="If iv.Background Is BitmapDrawable Then";
if (_iv.getBackground() instanceof android.graphics.drawable.BitmapDrawable) { 
RDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="Dim bd As BitmapDrawable";
_bd = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="bd = iv.Background";
_bd.setObject((android.graphics.drawable.BitmapDrawable)(_iv.getBackground()));
RDebugUtils.currentLine=6946823;
 //BA.debugLineNum = 6946823;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=6946824;
 //BA.debugLineNum = 6946824;BA.debugLine="bmp = bd.Bitmap";
_bmp.setObject((android.graphics.Bitmap)(_bd.getBitmap()));
RDebugUtils.currentLine=6946825;
 //BA.debugLineNum = 6946825;BA.debugLine="CallSubDelayed2(ShowImage, \"Show\", bmp)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._showimage.getObject()),"Show",(Object)(_bmp));
 };
RDebugUtils.currentLine=6946827;
 //BA.debugLineNum = 6946827;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="housedetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _agn = null;
anywheresoftware.b4a.objects.LabelWrapper _notfound = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _w = null;
String _image = "";
String _gambar = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.collections.List _data_array = null;
anywheresoftware.b4a.objects.collections.Map _a = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
int _heightlabel = 0;
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="Log(\"Response from server :\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server :"+_res);
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=6619143;
 //BA.debugLineNum = 6619143;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"Download","DATA")) {
case 0: {
RDebugUtils.currentLine=6619146;
 //BA.debugLineNum = 6619146;BA.debugLine="Dim agn As List";
_agn = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6619147;
 //BA.debugLineNum = 6619147;BA.debugLine="agn=parser.NextArray";
_agn = _parser.NextArray();
RDebugUtils.currentLine=6619148;
 //BA.debugLineNum = 6619148;BA.debugLine="If agn.Size - 1 < 0 Then";
if (_agn.getSize()-1<0) { 
RDebugUtils.currentLine=6619149;
 //BA.debugLineNum = 6619149;BA.debugLine="Log(agn.Size)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_agn.getSize()));
RDebugUtils.currentLine=6619150;
 //BA.debugLineNum = 6619150;BA.debugLine="Dim NotFound As Label";
_notfound = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6619151;
 //BA.debugLineNum = 6619151;BA.debugLine="NotFound.Initialize(\"\")";
_notfound.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=6619152;
 //BA.debugLineNum = 6619152;BA.debugLine="PanelGallery.Color= Colors.White";
mostCurrent._panelgallery.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=6619153;
 //BA.debugLineNum = 6619153;BA.debugLine="PanelGallery.AddView(NotFound,0,0,100%x,70%y)";
mostCurrent._panelgallery.AddView((android.view.View)(_notfound.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (70),mostCurrent.activityBA));
RDebugUtils.currentLine=6619154;
 //BA.debugLineNum = 6619154;BA.debugLine="NotFound.Text = \"Picture doesn't exist\"";
_notfound.setText(BA.ObjectToCharSequence("Picture doesn't exist"));
RDebugUtils.currentLine=6619155;
 //BA.debugLineNum = 6619155;BA.debugLine="NotFound.TextSize = 15";
_notfound.setTextSize((float) (15));
RDebugUtils.currentLine=6619156;
 //BA.debugLineNum = 6619156;BA.debugLine="NotFound.Gravity = Gravity.CENTER";
_notfound.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=6619157;
 //BA.debugLineNum = 6619157;BA.debugLine="PanelGallery.Height = NotFound.Height";
mostCurrent._panelgallery.setHeight(_notfound.getHeight());
RDebugUtils.currentLine=6619158;
 //BA.debugLineNum = 6619158;BA.debugLine="TabHost1.Height = PanelGallery.Height";
mostCurrent._tabhost1.setHeight(mostCurrent._panelgallery.getHeight());
RDebugUtils.currentLine=6619159;
 //BA.debugLineNum = 6619159;BA.debugLine="Msgbox(\"Galery Foto tidak ditemukan\", \"Pering";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Galery Foto tidak ditemukan"),BA.ObjectToCharSequence("Peringatan"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=6619161;
 //BA.debugLineNum = 6619161;BA.debugLine="ScrollImage.Initialize(100%y)";
mostCurrent._scrollimage.Initialize(mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=6619162;
 //BA.debugLineNum = 6619162;BA.debugLine="PanelGallery.AddView(ScrollImage,0,0,100%x,10";
mostCurrent._panelgallery.AddView((android.view.View)(mostCurrent._scrollimage.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=6619163;
 //BA.debugLineNum = 6619163;BA.debugLine="ScrollImage.Panel.LoadLayout(\"LoaderImage\")";
mostCurrent._scrollimage.getPanel().LoadLayout("LoaderImage",mostCurrent.activityBA);
RDebugUtils.currentLine=6619164;
 //BA.debugLineNum = 6619164;BA.debugLine="For i=0 To agn.Size-1";
{
final int step27 = 1;
final int limit27 = (int) (_agn.getSize()-1);
_i = (int) (0) ;
for (;(step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27) ;_i = ((int)(0 + _i + step27))  ) {
RDebugUtils.currentLine=6619165;
 //BA.debugLineNum = 6619165;BA.debugLine="Dim w As Map";
_w = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6619166;
 //BA.debugLineNum = 6619166;BA.debugLine="w=agn.Get(i)";
_w.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_agn.Get(_i)));
RDebugUtils.currentLine=6619167;
 //BA.debugLineNum = 6619167;BA.debugLine="Dim image = w.Get(\"photo_url\") As String";
_image = BA.ObjectToString(_w.Get((Object)("photo_url")));
RDebugUtils.currentLine=6619168;
 //BA.debugLineNum = 6619168;BA.debugLine="Dim gambar = \"\"&Main.Server&\"Files/House/img";
_gambar = ""+mostCurrent._main._server+"Files/House/img/"+_image;
RDebugUtils.currentLine=6619169;
 //BA.debugLineNum = 6619169;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6619170;
 //BA.debugLineNum = 6619170;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=6619171;
 //BA.debugLineNum = 6619171;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6619172;
 //BA.debugLineNum = 6619172;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=6619173;
 //BA.debugLineNum = 6619173;BA.debugLine="p.SetLayout(0,0,100%x,20%y)";
_p.SetLayout((int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (20),mostCurrent.activityBA));
RDebugUtils.currentLine=6619174;
 //BA.debugLineNum = 6619174;BA.debugLine="p.LoadLayout(\"listitem-image\")";
_p.LoadLayout("listitem-image",mostCurrent.activityBA);
RDebugUtils.currentLine=6619175;
 //BA.debugLineNum = 6619175;BA.debugLine="clv.Add(p,m)";
mostCurrent._clv._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(_m.getObject()));
RDebugUtils.currentLine=6619176;
 //BA.debugLineNum = 6619176;BA.debugLine="m.Put(ImageView1, gambar)";
_m.Put((Object)(mostCurrent._imageview1.getObject()),(Object)(_gambar));
RDebugUtils.currentLine=6619177;
 //BA.debugLineNum = 6619177;BA.debugLine="Log (gambar)";
anywheresoftware.b4a.keywords.Common.Log(_gambar);
RDebugUtils.currentLine=6619178;
 //BA.debugLineNum = 6619178;BA.debugLine="CallSubDelayed2(Starter, \"Download\", m)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._starter.getObject()),"Download",(Object)(_m));
 }
};
RDebugUtils.currentLine=6619180;
 //BA.debugLineNum = 6619180;BA.debugLine="ScrollView1.Height = 100%y - ScrollView1.Top";
mostCurrent._scrollview1.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._scrollview1.getTop()));
RDebugUtils.currentLine=6619181;
 //BA.debugLineNum = 6619181;BA.debugLine="ScrollImage.Panel.Height = (ImageView1.Height";
mostCurrent._scrollimage.getPanel().setHeight((int) ((mostCurrent._imageview1.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),mostCurrent.activityBA))*_agn.getSize()));
RDebugUtils.currentLine=6619182;
 //BA.debugLineNum = 6619182;BA.debugLine="ScrollImage.Height = 70%y";
mostCurrent._scrollimage.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (70),mostCurrent.activityBA));
RDebugUtils.currentLine=6619183;
 //BA.debugLineNum = 6619183;BA.debugLine="PanelGallery.Height = ScrollImage.Height";
mostCurrent._panelgallery.setHeight(mostCurrent._scrollimage.getHeight());
RDebugUtils.currentLine=6619184;
 //BA.debugLineNum = 6619184;BA.debugLine="TabHost1.Height = ScrollImage.Height";
mostCurrent._tabhost1.setHeight(mostCurrent._scrollimage.getHeight());
 };
RDebugUtils.currentLine=6619186;
 //BA.debugLineNum = 6619186;BA.debugLine="AddPicture.RemoveView";
mostCurrent._addpicture.RemoveView();
RDebugUtils.currentLine=6619187;
 //BA.debugLineNum = 6619187;BA.debugLine="PanelBuildingList.AddView(AddPicture,0, TabHos";
mostCurrent._panelbuildinglist.AddView((android.view.View)(mostCurrent._addpicture.getObject()),(int) (0),(int) (mostCurrent._tabhost1.getHeight()+mostCurrent._tabhost1.getTop()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=6619188;
 //BA.debugLineNum = 6619188;BA.debugLine="PanelBuildingList.Height = AddPicture.Top + Ad";
mostCurrent._panelbuildinglist.setHeight((int) (mostCurrent._addpicture.getTop()+mostCurrent._addpicture.getHeight()));
RDebugUtils.currentLine=6619189;
 //BA.debugLineNum = 6619189;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.H";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._panelbuildinglist.getHeight());
RDebugUtils.currentLine=6619190;
 //BA.debugLineNum = 6619190;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 break; }
case 1: {
RDebugUtils.currentLine=6619193;
 //BA.debugLineNum = 6619193;BA.debugLine="Dim data_array As List";
_data_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6619194;
 //BA.debugLineNum = 6619194;BA.debugLine="data_array = parser.NextArray";
_data_array = _parser.NextArray();
RDebugUtils.currentLine=6619195;
 //BA.debugLineNum = 6619195;BA.debugLine="For i=0 To data_array.Size -1";
{
final int step57 = 1;
final int limit57 = (int) (_data_array.getSize()-1);
_i = (int) (0) ;
for (;(step57 > 0 && _i <= limit57) || (step57 < 0 && _i >= limit57) ;_i = ((int)(0 + _i + step57))  ) {
RDebugUtils.currentLine=6619196;
 //BA.debugLineNum = 6619196;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6619197;
 //BA.debugLineNum = 6619197;BA.debugLine="a = data_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_data_array.Get(_i)));
RDebugUtils.currentLine=6619198;
 //BA.debugLineNum = 6619198;BA.debugLine="lat = a.Get(\"latitude\")";
_lat = BA.ObjectToString(_a.Get((Object)("latitude")));
RDebugUtils.currentLine=6619199;
 //BA.debugLineNum = 6619199;BA.debugLine="lng = a.Get(\"longitude\")";
_lng = BA.ObjectToString(_a.Get((Object)("longitude")));
RDebugUtils.currentLine=6619200;
 //BA.debugLineNum = 6619200;BA.debugLine="Log(lat)";
anywheresoftware.b4a.keywords.Common.Log(_lat);
RDebugUtils.currentLine=6619201;
 //BA.debugLineNum = 6619201;BA.debugLine="Log(lng)";
anywheresoftware.b4a.keywords.Common.Log(_lng);
RDebugUtils.currentLine=6619202;
 //BA.debugLineNum = 6619202;BA.debugLine="FcnOwner.Text = a.Get (\"fcn_owner\")";
mostCurrent._fcnowner.setText(BA.ObjectToCharSequence(_a.Get((Object)("fcn_owner"))));
RDebugUtils.currentLine=6619203;
 //BA.debugLineNum = 6619203;BA.debugLine="StandingYear.Text = a.Get(\"standing_year\")";
mostCurrent._standingyear.setText(BA.ObjectToCharSequence(_a.Get((Object)("standing_year"))));
RDebugUtils.currentLine=6619204;
 //BA.debugLineNum = 6619204;BA.debugLine="Address.Text = a.Get(\"address\")";
mostCurrent._address.setText(BA.ObjectToCharSequence(_a.Get((Object)("address"))));
RDebugUtils.currentLine=6619205;
 //BA.debugLineNum = 6619205;BA.debugLine="BuildingTax.Text = a.Get(\"land_building_tax\")";
mostCurrent._buildingtax.setText(BA.ObjectToCharSequence(_a.Get((Object)("land_building_tax"))));
RDebugUtils.currentLine=6619206;
 //BA.debugLineNum = 6619206;BA.debugLine="Electricity.Text = a.Get(\"electricity_capacit";
mostCurrent._electricity.setText(BA.ObjectToCharSequence(_a.Get((Object)("electricity_capacity"))));
RDebugUtils.currentLine=6619207;
 //BA.debugLineNum = 6619207;BA.debugLine="Construction.Text = a.Get(\"jkonstruksi\")";
mostCurrent._construction.setText(BA.ObjectToCharSequence(_a.Get((Object)("jkonstruksi"))));
 }
};
RDebugUtils.currentLine=6619209;
 //BA.debugLineNum = 6619209;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=6619210;
 //BA.debugLineNum = 6619210;BA.debugLine="Dim heightlabel As Int";
_heightlabel = 0;
RDebugUtils.currentLine=6619211;
 //BA.debugLineNum = 6619211;BA.debugLine="heightlabel = su.MeasureMultilineTextHeight(Ad";
_heightlabel = _su.MeasureMultilineTextHeight((android.widget.TextView)(mostCurrent._address.getObject()),BA.ObjectToCharSequence(mostCurrent._address.getText()));
RDebugUtils.currentLine=6619212;
 //BA.debugLineNum = 6619212;BA.debugLine="Log(\"Height akhir: \"&heightlabel)";
anywheresoftware.b4a.keywords.Common.Log("Height akhir: "+BA.NumberToString(_heightlabel));
RDebugUtils.currentLine=6619213;
 //BA.debugLineNum = 6619213;BA.debugLine="Address.Height= heightlabel";
mostCurrent._address.setHeight(_heightlabel);
RDebugUtils.currentLine=6619214;
 //BA.debugLineNum = 6619214;BA.debugLine="Select TabHost1.CurrentTab";
switch (BA.switchObjectToInt(mostCurrent._tabhost1.getCurrentTab(),(int) (1))) {
case 0: {
RDebugUtils.currentLine=6619216;
 //BA.debugLineNum = 6619216;BA.debugLine="TabHost1.Height = Panel4.Top + Panel4.Height";
mostCurrent._tabhost1.setHeight((int) (mostCurrent._panel4.getTop()+mostCurrent._panel4.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA)));
 break; }
}
;
RDebugUtils.currentLine=6619219;
 //BA.debugLineNum = 6619219;BA.debugLine="PanelBuildingList.Height = TabHost1.Height + T";
mostCurrent._panelbuildinglist.setHeight((int) (mostCurrent._tabhost1.getHeight()+mostCurrent._tabhost1.getTop()));
RDebugUtils.currentLine=6619220;
 //BA.debugLineNum = 6619220;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.H";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._panelbuildinglist.getHeight());
RDebugUtils.currentLine=6619221;
 //BA.debugLineNum = 6619221;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 break; }
}
;
 };
RDebugUtils.currentLine=6619225;
 //BA.debugLineNum = 6619225;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=6619226;
 //BA.debugLineNum = 6619226;BA.debugLine="End Sub";
return "";
}
public static String  _lbledit_click() throws Exception{
RDebugUtils.currentModule="housedetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbledit_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "lbledit_click", null);
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Sub LblEdit_Click";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="StartActivity(OfficeEdit)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._officeedit.getObject()));
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="End Sub";
return "";
}
public static String  _tabhost1_tabchanged() throws Exception{
RDebugUtils.currentModule="housedetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "tabhost1_tabchanged"))
	return (String) Debug.delegate(mostCurrent.activityBA, "tabhost1_tabchanged", null);
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub TabHost1_TabChanged";
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="Select TabHost1.CurrentTab";
switch (BA.switchObjectToInt(mostCurrent._tabhost1.getCurrentTab(),(int) (0),(int) (1),(int) (2))) {
case 0: {
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="WebViewRoute.LoadUrl(Main.Server&\"House/Route.p";
mostCurrent._webviewroute.LoadUrl(mostCurrent._main._server+"House/Route.php?lat="+mostCurrent._main._lbllat+"&lng="+mostCurrent._main._lbllon+"&latd="+_lat+"&lngd="+_lng);
RDebugUtils.currentLine=6881285;
 //BA.debugLineNum = 6881285;BA.debugLine="Msgbox(\"Current tab is \" & TabHost1.CurrentTab,";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Current tab is "+BA.NumberToString(mostCurrent._tabhost1.getCurrentTab())),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="Log (\"Button Top :\"&btnRoute.Top)";
anywheresoftware.b4a.keywords.Common.Log("Button Top :"+BA.NumberToString(mostCurrent._btnroute.getTop()));
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="TabHost1.Height = btnRoute.Top + btnRoute.Heigh";
mostCurrent._tabhost1.setHeight((int) (mostCurrent._btnroute.getTop()+mostCurrent._btnroute.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA)));
RDebugUtils.currentLine=6881288;
 //BA.debugLineNum = 6881288;BA.debugLine="AddPicture.Visible=False";
mostCurrent._addpicture.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6881289;
 //BA.debugLineNum = 6881289;BA.debugLine="Log(\"tabHost height: \"&TabHost1.Height)";
anywheresoftware.b4a.keywords.Common.Log("tabHost height: "+BA.NumberToString(mostCurrent._tabhost1.getHeight()));
RDebugUtils.currentLine=6881290;
 //BA.debugLineNum = 6881290;BA.debugLine="PanelBuildingList.Height = TabHost1.Height + Ta";
mostCurrent._panelbuildinglist.setHeight((int) (mostCurrent._tabhost1.getHeight()+mostCurrent._tabhost1.getTop()));
RDebugUtils.currentLine=6881291;
 //BA.debugLineNum = 6881291;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.He";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._panelbuildinglist.getHeight());
 break; }
case 1: {
RDebugUtils.currentLine=6881293;
 //BA.debugLineNum = 6881293;BA.debugLine="AddPicture.Visible=False";
mostCurrent._addpicture.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6881294;
 //BA.debugLineNum = 6881294;BA.debugLine="ProgressDialogShow(\"Loading...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Loading..."));
RDebugUtils.currentLine=6881295;
 //BA.debugLineNum = 6881295;BA.debugLine="ExecuteRemoteQuery(\"SELECT H.fcn_owner, H.addre";
_executeremotequery("SELECT H.fcn_owner, H.address, H.standing_year, H.land_building_tax, H.type_of_construction, H.electricity_capacity, H.tap_water, H.building_status,ST_X(ST_Centroid(H.geom)) As longitude, ST_Y(ST_CENTROID(H.geom)) As latitude, ST_AsText(H.geom) As geom,T.name_of_type As jkonstruksi, O.*	FROM house_building As H LEFT JOIN type_of_construction As T ON H.type_of_construction=T.type_id JOIN house_building_owner As O ON H.fcn_owner=O.national_identity_number WHERE H.house_building_id='"+mostCurrent._ids+"' ","DATA");
 break; }
case 2: {
RDebugUtils.currentLine=6881297;
 //BA.debugLineNum = 6881297;BA.debugLine="AddPicture.Visible=True";
mostCurrent._addpicture.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6881298;
 //BA.debugLineNum = 6881298;BA.debugLine="ProgressDialogShow(\"Loading...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Loading..."));
RDebugUtils.currentLine=6881299;
 //BA.debugLineNum = 6881299;BA.debugLine="ExecuteRemoteQuery(\"SELECT photo_url, upload_da";
_executeremotequery("SELECT photo_url, upload_date FROM house_building_gallery WHERE house_building_id='"+mostCurrent._ids+"'","Download");
 break; }
}
;
RDebugUtils.currentLine=6881302;
 //BA.debugLineNum = 6881302;BA.debugLine="End Sub";
return "";
}
}