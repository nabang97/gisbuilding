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

public class msmedetail extends Activity implements B4AActivity{
	public static msmedetail mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.msmedetail");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (msmedetail).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.msmedetail");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.msmedetail", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (msmedetail) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (msmedetail) Resume **");
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
		return msmedetail.class;
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
        BA.LogInfo("** Activity (msmedetail) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (msmedetail) Resume **");
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
public b4a.example3.customlistview _clv1 = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _titlebar = null;
public anywheresoftware.b4a.objects.LabelWrapper _backarrow = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelbuildinglist = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _numfc = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _namefc = null;
public anywheresoftware.b4a.objects.PanelWrapper _btngallery = null;
public anywheresoftware.b4a.objects.PanelWrapper _pfacility = null;
public anywheresoftware.b4a.objects.PanelWrapper _listitem = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelbutton = null;
public anywheresoftware.b4a.objects.LabelWrapper _msmename = null;
public anywheresoftware.b4a.objects.LabelWrapper _standingyear = null;
public anywheresoftware.b4a.objects.LabelWrapper _buildingarea = null;
public anywheresoftware.b4a.objects.LabelWrapper _landarea = null;
public anywheresoftware.b4a.objects.LabelWrapper _parkingarea = null;
public anywheresoftware.b4a.objects.LabelWrapper _electricity = null;
public anywheresoftware.b4a.objects.LabelWrapper _construction = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneltoolbar = null;
public static String _ids = "";
public anywheresoftware.b4a.objects.LabelWrapper _lbledit = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfacility = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel4 = null;
public anywheresoftware.b4a.objects.TabHostWrapper _tabhost1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _typeofmsme = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelmap = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnroute = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webviewroute = null;
public anywheresoftware.b4a.objects.ButtonWrapper _editbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _editfacility = null;
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
public b4a.example.housedetail _housedetail = null;
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
RDebugUtils.currentModule="msmedetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="ScrollView1.Panel.LoadLayout(\"MsmeDetail\")";
mostCurrent._scrollview1.getPanel().LoadLayout("MsmeDetail",mostCurrent.activityBA);
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="ScrollView1.Height = 100%y - ScrollView1.Top";
mostCurrent._scrollview1.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._scrollview1.getTop()));
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="PanelToolBar.Visible = False";
mostCurrent._paneltoolbar.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7143432;
 //BA.debugLineNum = 7143432;BA.debugLine="BackArrow.Visible= True";
mostCurrent._backarrow.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7143433;
 //BA.debugLineNum = 7143433;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
mostCurrent._backarrow.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"back-arrow.png").getObject()));
RDebugUtils.currentLine=7143434;
 //BA.debugLineNum = 7143434;BA.debugLine="TitleBar.Text=\"Building Detail\"";
mostCurrent._titlebar.setText(BA.ObjectToCharSequence("Building Detail"));
RDebugUtils.currentLine=7143436;
 //BA.debugLineNum = 7143436;BA.debugLine="TabHost1.AddTab(\"Map\",\"tabMap\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Map","tabMap");
RDebugUtils.currentLine=7143437;
 //BA.debugLineNum = 7143437;BA.debugLine="TabHost1.AddTab(\"Detail\",\"Msme_tabDetail\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Detail","Msme_tabDetail");
RDebugUtils.currentLine=7143438;
 //BA.debugLineNum = 7143438;BA.debugLine="TabHost1.AddTab(\"Gallery\",\"tabGallery\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Gallery","tabGallery");
RDebugUtils.currentLine=7143441;
 //BA.debugLineNum = 7143441;BA.debugLine="FunctionAll.CheckBuilding_id(MsmeBuilding.idBuild";
mostCurrent._functionall._checkbuilding_id(mostCurrent.activityBA,mostCurrent._msmebuilding._idbuilding);
RDebugUtils.currentLine=7143442;
 //BA.debugLineNum = 7143442;BA.debugLine="ids = FunctionAll.ids";
mostCurrent._ids = mostCurrent._functionall._ids;
RDebugUtils.currentLine=7143444;
 //BA.debugLineNum = 7143444;BA.debugLine="TabHost1.CurrentTab = 1";
mostCurrent._tabhost1.setCurrentTab((int) (1));
RDebugUtils.currentLine=7143446;
 //BA.debugLineNum = 7143446;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="msmedetail";
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="CallSub(Starter, \"ActivityIsPaused\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(processBA,(Object)(mostCurrent._starter.getObject()),"ActivityIsPaused");
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="msmedetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="CLV1.Clear";
mostCurrent._clv1._clear();
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="ProgressDialogShow(\"Loading...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Loading..."));
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="If TabHost1.CurrentTab == 2 Then";
if (mostCurrent._tabhost1.getCurrentTab()==2) { 
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="clv.Clear";
mostCurrent._clv._clear();
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="ExecuteRemoteQuery(\"SELECT photo_url, upload_dat";
_executeremotequery("SELECT photo_url, upload_date FROM msme_building_gallery WHERE msme_building_id='"+mostCurrent._ids+"'","Download");
 }else {
RDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.msme_building_id, D.";
_executeremotequery("SELECT D.msme_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id ='"+mostCurrent._ids+"'","FASILITAS");
RDebugUtils.currentLine=7208968;
 //BA.debugLineNum = 7208968;BA.debugLine="ExecuteRemoteQuery(\"SELECT M.msme_building_id, M.";
_executeremotequery("SELECT M.msme_building_id, M.name_of_msme_building, M.building_area, M.land_area, M.parking_area, M.standing_year, M.electricity_capacity, M.address, M.type_of_construction, M.type_of_msme, M.owner_name, M.number_of_employee, M.monthly_income, M.contact_person, ST_X(ST_Centroid(M.geom)) As longitude, ST_Y(ST_CENTROID(M.geom)) As latitude,T.name_of_type As constr, J.name_of_type As typems, ST_AsText(geom) As geom FROM msme_building As M LEFT JOIN type_of_construction As T ON M.type_of_construction=T.type_id LEFT JOIN type_of_msme As J ON M.type_of_msme=J.type_id WHERE M.msme_building_id='"+mostCurrent._ids+"'","DATA");
 };
RDebugUtils.currentLine=7208970;
 //BA.debugLineNum = 7208970;BA.debugLine="End Sub";
return "";
}
public static String  _executeremotequery(String _query,String _jobname) throws Exception{
RDebugUtils.currentModule="msmedetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "executeremotequery"))
	return (String) Debug.delegate(mostCurrent.activityBA, "executeremotequery", new Object[] {_query,_jobname});
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="Job.Initialize(JobName, Me)";
_job._initialize(processBA,_jobname,msmedetail.getObject());
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
_job._poststring(""+mostCurrent._main._server+"mobile/json.php",_query);
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="End Sub";
return "";
}
public static String  _addpicture_click() throws Exception{
RDebugUtils.currentModule="msmedetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "addpicture_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "addpicture_click", null);
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Sub AddPicture_Click";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="ToastMessageShow(\"Add photo\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Add photo"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="StartActivity(AddPhoto)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._addphoto.getObject()));
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="End Sub";
return "";
}
public static String  _backarrow_click() throws Exception{
RDebugUtils.currentModule="msmedetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "backarrow_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "backarrow_click", null);
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Sub BackArrow_Click";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createitem(int _width,String _title,String _content) throws Exception{
RDebugUtils.currentModule="msmedetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createitem"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createitem", new Object[] {_width,_title,_content});
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="p.LoadLayout(\"facility_list\")";
_p.LoadLayout("facility_list",mostCurrent.activityBA);
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, 5%y)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="numfc.Text = Title";
mostCurrent._numfc.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="namefc.Text = Content";
mostCurrent._namefc.setText(BA.ObjectToCharSequence(_content));
RDebugUtils.currentLine=7340038;
 //BA.debugLineNum = 7340038;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_p.getObject()));
RDebugUtils.currentLine=7340039;
 //BA.debugLineNum = 7340039;BA.debugLine="End Sub";
return null;
}
public static String  _editbtn_click() throws Exception{
RDebugUtils.currentModule="msmedetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "editbtn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "editbtn_click", null);
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub editBtn_Click";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="StartActivity(MsmeEdit)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._msmeedit.getObject()));
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="End Sub";
return "";
}
public static String  _editfacility_click() throws Exception{
RDebugUtils.currentModule="msmedetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "editfacility_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "editfacility_click", null);
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Sub editFacility_Click";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="StartActivity(EditBuildingFacility)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._editbuildingfacility.getObject()));
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="End Sub";
return "";
}
public static String  _imageview1_click() throws Exception{
RDebugUtils.currentModule="msmedetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imageview1_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "imageview1_click", null);
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Sub ImageView1_Click";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="iv = Sender";
_iv.setObject((android.widget.ImageView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="If iv.Background Is BitmapDrawable Then";
if (_iv.getBackground() instanceof android.graphics.drawable.BitmapDrawable) { 
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="Dim bd As BitmapDrawable";
_bd = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=7929862;
 //BA.debugLineNum = 7929862;BA.debugLine="bd = iv.Background";
_bd.setObject((android.graphics.drawable.BitmapDrawable)(_iv.getBackground()));
RDebugUtils.currentLine=7929863;
 //BA.debugLineNum = 7929863;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=7929864;
 //BA.debugLineNum = 7929864;BA.debugLine="bmp = bd.Bitmap";
_bmp.setObject((android.graphics.Bitmap)(_bd.getBitmap()));
RDebugUtils.currentLine=7929865;
 //BA.debugLineNum = 7929865;BA.debugLine="CallSubDelayed2(ShowImage, \"Show\", bmp)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._showimage.getObject()),"Show",(Object)(_bmp));
 };
RDebugUtils.currentLine=7929867;
 //BA.debugLineNum = 7929867;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="msmedetail";
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
anywheresoftware.b4a.objects.collections.List _fasilitas_array = null;
anywheresoftware.b4a.objects.LabelWrapper _notexist = null;
anywheresoftware.b4a.objects.collections.Map _a = null;
String _content = "";
int _quantity = 0;
anywheresoftware.b4a.objects.ScrollViewWrapper _sv = null;
anywheresoftware.b4a.objects.collections.List _data_array = null;
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="Log(\"Response from server :\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server :"+_res);
RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"Download","FASILITAS","DATA")) {
case 0: {
RDebugUtils.currentLine=7471114;
 //BA.debugLineNum = 7471114;BA.debugLine="Dim agn As List";
_agn = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7471115;
 //BA.debugLineNum = 7471115;BA.debugLine="agn=parser.NextArray";
_agn = _parser.NextArray();
RDebugUtils.currentLine=7471116;
 //BA.debugLineNum = 7471116;BA.debugLine="If agn.Size - 1 < 0 Then";
if (_agn.getSize()-1<0) { 
RDebugUtils.currentLine=7471117;
 //BA.debugLineNum = 7471117;BA.debugLine="Log(agn.Size)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_agn.getSize()));
RDebugUtils.currentLine=7471118;
 //BA.debugLineNum = 7471118;BA.debugLine="Dim NotFound As Label";
_notfound = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7471119;
 //BA.debugLineNum = 7471119;BA.debugLine="NotFound.Initialize(\"\")";
_notfound.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=7471120;
 //BA.debugLineNum = 7471120;BA.debugLine="PanelGallery.Color= Colors.White";
mostCurrent._panelgallery.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=7471121;
 //BA.debugLineNum = 7471121;BA.debugLine="PanelGallery.AddView(NotFound,0,0,100%x,70%y)";
mostCurrent._panelgallery.AddView((android.view.View)(_notfound.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (70),mostCurrent.activityBA));
RDebugUtils.currentLine=7471122;
 //BA.debugLineNum = 7471122;BA.debugLine="NotFound.Text = \"Picture doesn't exist\"";
_notfound.setText(BA.ObjectToCharSequence("Picture doesn't exist"));
RDebugUtils.currentLine=7471123;
 //BA.debugLineNum = 7471123;BA.debugLine="NotFound.TextSize = 15";
_notfound.setTextSize((float) (15));
RDebugUtils.currentLine=7471124;
 //BA.debugLineNum = 7471124;BA.debugLine="NotFound.Gravity = Gravity.CENTER";
_notfound.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=7471125;
 //BA.debugLineNum = 7471125;BA.debugLine="PanelGallery.Height = NotFound.Height";
mostCurrent._panelgallery.setHeight(_notfound.getHeight());
RDebugUtils.currentLine=7471126;
 //BA.debugLineNum = 7471126;BA.debugLine="TabHost1.Height = PanelGallery.Height";
mostCurrent._tabhost1.setHeight(mostCurrent._panelgallery.getHeight());
RDebugUtils.currentLine=7471127;
 //BA.debugLineNum = 7471127;BA.debugLine="Msgbox(\"Galery Foto tidak ditemukan\", \"Pering";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Galery Foto tidak ditemukan"),BA.ObjectToCharSequence("Peringatan"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=7471129;
 //BA.debugLineNum = 7471129;BA.debugLine="ScrollImage.Initialize(100%y)";
mostCurrent._scrollimage.Initialize(mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=7471130;
 //BA.debugLineNum = 7471130;BA.debugLine="PanelGallery.AddView(ScrollImage,0,0,100%x,10";
mostCurrent._panelgallery.AddView((android.view.View)(mostCurrent._scrollimage.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=7471131;
 //BA.debugLineNum = 7471131;BA.debugLine="ScrollImage.Panel.LoadLayout(\"LoaderImage\")";
mostCurrent._scrollimage.getPanel().LoadLayout("LoaderImage",mostCurrent.activityBA);
RDebugUtils.currentLine=7471132;
 //BA.debugLineNum = 7471132;BA.debugLine="For i=0 To agn.Size-1";
{
final int step27 = 1;
final int limit27 = (int) (_agn.getSize()-1);
_i = (int) (0) ;
for (;(step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27) ;_i = ((int)(0 + _i + step27))  ) {
RDebugUtils.currentLine=7471133;
 //BA.debugLineNum = 7471133;BA.debugLine="Dim w As Map";
_w = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7471134;
 //BA.debugLineNum = 7471134;BA.debugLine="w=agn.Get(i)";
_w.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_agn.Get(_i)));
RDebugUtils.currentLine=7471135;
 //BA.debugLineNum = 7471135;BA.debugLine="Dim image = w.Get(\"photo_url\") As String";
_image = BA.ObjectToString(_w.Get((Object)("photo_url")));
RDebugUtils.currentLine=7471136;
 //BA.debugLineNum = 7471136;BA.debugLine="Dim gambar = \"\"&Main.Server&\"Files/Msme/img/";
_gambar = ""+mostCurrent._main._server+"Files/Msme/img/"+_image;
RDebugUtils.currentLine=7471137;
 //BA.debugLineNum = 7471137;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7471138;
 //BA.debugLineNum = 7471138;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=7471139;
 //BA.debugLineNum = 7471139;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7471140;
 //BA.debugLineNum = 7471140;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=7471141;
 //BA.debugLineNum = 7471141;BA.debugLine="p.SetLayout(0,0,100%x,20%y)";
_p.SetLayout((int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (20),mostCurrent.activityBA));
RDebugUtils.currentLine=7471142;
 //BA.debugLineNum = 7471142;BA.debugLine="p.LoadLayout(\"listitem-image\")";
_p.LoadLayout("listitem-image",mostCurrent.activityBA);
RDebugUtils.currentLine=7471143;
 //BA.debugLineNum = 7471143;BA.debugLine="clv.Add(p,m)";
mostCurrent._clv._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(_m.getObject()));
RDebugUtils.currentLine=7471144;
 //BA.debugLineNum = 7471144;BA.debugLine="m.Put(ImageView1, gambar)";
_m.Put((Object)(mostCurrent._imageview1.getObject()),(Object)(_gambar));
RDebugUtils.currentLine=7471145;
 //BA.debugLineNum = 7471145;BA.debugLine="Log (gambar)";
anywheresoftware.b4a.keywords.Common.Log(_gambar);
RDebugUtils.currentLine=7471146;
 //BA.debugLineNum = 7471146;BA.debugLine="CallSubDelayed2(Starter, \"Download\", m)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._starter.getObject()),"Download",(Object)(_m));
 }
};
RDebugUtils.currentLine=7471148;
 //BA.debugLineNum = 7471148;BA.debugLine="ScrollView1.Height = 100%y - ScrollView1.Top";
mostCurrent._scrollview1.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._scrollview1.getTop()));
RDebugUtils.currentLine=7471149;
 //BA.debugLineNum = 7471149;BA.debugLine="ScrollImage.Panel.Height = (ImageView1.Height";
mostCurrent._scrollimage.getPanel().setHeight((int) ((mostCurrent._imageview1.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),mostCurrent.activityBA))*_agn.getSize()));
RDebugUtils.currentLine=7471150;
 //BA.debugLineNum = 7471150;BA.debugLine="ScrollImage.Height = 70%y";
mostCurrent._scrollimage.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (70),mostCurrent.activityBA));
RDebugUtils.currentLine=7471151;
 //BA.debugLineNum = 7471151;BA.debugLine="PanelGallery.Height = ScrollImage.Height";
mostCurrent._panelgallery.setHeight(mostCurrent._scrollimage.getHeight());
RDebugUtils.currentLine=7471152;
 //BA.debugLineNum = 7471152;BA.debugLine="TabHost1.Height = ScrollImage.Height";
mostCurrent._tabhost1.setHeight(mostCurrent._scrollimage.getHeight());
 };
RDebugUtils.currentLine=7471154;
 //BA.debugLineNum = 7471154;BA.debugLine="AddPicture.Initialize(\"AddPicture\")";
mostCurrent._addpicture.Initialize(mostCurrent.activityBA,"AddPicture");
RDebugUtils.currentLine=7471155;
 //BA.debugLineNum = 7471155;BA.debugLine="PanelBuildingList.AddView(AddPicture,0, TabHos";
mostCurrent._panelbuildinglist.AddView((android.view.View)(mostCurrent._addpicture.getObject()),(int) (0),(int) (mostCurrent._tabhost1.getHeight()+mostCurrent._tabhost1.getTop()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=7471156;
 //BA.debugLineNum = 7471156;BA.debugLine="PanelBuildingList.Height = AddPicture.Top + Ad";
mostCurrent._panelbuildinglist.setHeight((int) (mostCurrent._addpicture.getTop()+mostCurrent._addpicture.getHeight()));
RDebugUtils.currentLine=7471157;
 //BA.debugLineNum = 7471157;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.H";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._panelbuildinglist.getHeight());
RDebugUtils.currentLine=7471158;
 //BA.debugLineNum = 7471158;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 break; }
case 1: {
RDebugUtils.currentLine=7471161;
 //BA.debugLineNum = 7471161;BA.debugLine="Dim fasilitas_array As List";
_fasilitas_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7471162;
 //BA.debugLineNum = 7471162;BA.debugLine="fasilitas_array = parser.NextArray";
_fasilitas_array = _parser.NextArray();
RDebugUtils.currentLine=7471163;
 //BA.debugLineNum = 7471163;BA.debugLine="If fasilitas_array.Size-1 < 0 Then";
if (_fasilitas_array.getSize()-1<0) { 
RDebugUtils.currentLine=7471164;
 //BA.debugLineNum = 7471164;BA.debugLine="CLV1.AsView.Visible= False";
mostCurrent._clv1._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7471165;
 //BA.debugLineNum = 7471165;BA.debugLine="Dim NotExist As Label";
_notexist = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7471166;
 //BA.debugLineNum = 7471166;BA.debugLine="NotExist.Initialize(\"\")";
_notexist.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=7471167;
 //BA.debugLineNum = 7471167;BA.debugLine="PFacility.AddView(NotExist,LblFacility.Left,0";
mostCurrent._pfacility.AddView((android.view.View)(_notexist.getObject()),mostCurrent._lblfacility.getLeft(),(int) (0),mostCurrent._lblfacility.getWidth(),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (30),mostCurrent.activityBA));
RDebugUtils.currentLine=7471168;
 //BA.debugLineNum = 7471168;BA.debugLine="NotExist.Gravity= Gravity.CENTER";
_notexist.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=7471169;
 //BA.debugLineNum = 7471169;BA.debugLine="NotExist.Text=\"Facility doesn't not exist.\"";
_notexist.setText(BA.ObjectToCharSequence("Facility doesn't not exist."));
RDebugUtils.currentLine=7471170;
 //BA.debugLineNum = 7471170;BA.debugLine="Select TabHost1.CurrentTab";
switch (BA.switchObjectToInt(mostCurrent._tabhost1.getCurrentTab(),(int) (1))) {
case 0: {
RDebugUtils.currentLine=7471172;
 //BA.debugLineNum = 7471172;BA.debugLine="PFacility.Height= NotExist.Height + NotExis";
mostCurrent._pfacility.setHeight((int) (_notexist.getHeight()+_notexist.getTop()));
RDebugUtils.currentLine=7471173;
 //BA.debugLineNum = 7471173;BA.debugLine="TabHost1.Height = PFacility.Top+PFacility.H";
mostCurrent._tabhost1.setHeight((int) (mostCurrent._pfacility.getTop()+mostCurrent._pfacility.getHeight()));
 break; }
}
;
 }else {
RDebugUtils.currentLine=7471176;
 //BA.debugLineNum = 7471176;BA.debugLine="For i=0 To fasilitas_array.Size - 1";
{
final int step70 = 1;
final int limit70 = (int) (_fasilitas_array.getSize()-1);
_i = (int) (0) ;
for (;(step70 > 0 && _i <= limit70) || (step70 < 0 && _i >= limit70) ;_i = ((int)(0 + _i + step70))  ) {
RDebugUtils.currentLine=7471177;
 //BA.debugLineNum = 7471177;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7471178;
 //BA.debugLineNum = 7471178;BA.debugLine="a = fasilitas_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_fasilitas_array.Get(_i)));
RDebugUtils.currentLine=7471180;
 //BA.debugLineNum = 7471180;BA.debugLine="Dim content As String = a.Get(\"name_of_facili";
_content = BA.ObjectToString(_a.Get((Object)("name_of_facility")));
RDebugUtils.currentLine=7471181;
 //BA.debugLineNum = 7471181;BA.debugLine="Dim quantity As Int = a.Get(\"quantity_of_faci";
_quantity = (int)(BA.ObjectToNumber(_a.Get((Object)("quantity_of_facilities"))));
RDebugUtils.currentLine=7471182;
 //BA.debugLineNum = 7471182;BA.debugLine="CLV1.Add(CreateItem(CLV1.AsView.Width, $\"${qu";
mostCurrent._clv1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(mostCurrent._clv1._asview().getWidth(),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_quantity))+""),_content).getObject())),(Object)(""));
RDebugUtils.currentLine=7471183;
 //BA.debugLineNum = 7471183;BA.debugLine="CLV1.AsView.Height = ListItem.Height*(i+1)";
mostCurrent._clv1._asview().setHeight((int) (mostCurrent._listitem.getHeight()*(_i+1)));
 }
};
RDebugUtils.currentLine=7471185;
 //BA.debugLineNum = 7471185;BA.debugLine="Dim sv As ScrollView";
_sv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=7471186;
 //BA.debugLineNum = 7471186;BA.debugLine="CLV1.sv.Height = CLV1.AsView.Height";
mostCurrent._clv1._sv.setHeight(mostCurrent._clv1._asview().getHeight());
RDebugUtils.currentLine=7471187;
 //BA.debugLineNum = 7471187;BA.debugLine="PFacility.Height = LblFacility.Height + LblFac";
mostCurrent._pfacility.setHeight((int) (mostCurrent._lblfacility.getHeight()+mostCurrent._lblfacility.getTop()));
RDebugUtils.currentLine=7471188;
 //BA.debugLineNum = 7471188;BA.debugLine="PFacility.Height = PFacility.Height + CLV1.sv.";
mostCurrent._pfacility.setHeight((int) (mostCurrent._pfacility.getHeight()+mostCurrent._clv1._sv.getHeight()+mostCurrent._clv1._asview().getTop()));
RDebugUtils.currentLine=7471189;
 //BA.debugLineNum = 7471189;BA.debugLine="Select TabHost1.CurrentTab";
switch (BA.switchObjectToInt(mostCurrent._tabhost1.getCurrentTab(),(int) (1))) {
case 0: {
RDebugUtils.currentLine=7471191;
 //BA.debugLineNum = 7471191;BA.debugLine="TabHost1.Height =PFacility.Top+PFacility.Hei";
mostCurrent._tabhost1.setHeight((int) (mostCurrent._pfacility.getTop()+mostCurrent._pfacility.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA)));
 break; }
}
;
 };
RDebugUtils.currentLine=7471194;
 //BA.debugLineNum = 7471194;BA.debugLine="PanelBuildingList.Height = TabHost1.Height + T";
mostCurrent._panelbuildinglist.setHeight((int) (mostCurrent._tabhost1.getHeight()+mostCurrent._tabhost1.getTop()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA)));
RDebugUtils.currentLine=7471195;
 //BA.debugLineNum = 7471195;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.H";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._panelbuildinglist.getHeight());
RDebugUtils.currentLine=7471202;
 //BA.debugLineNum = 7471202;BA.debugLine="Log(content)";
anywheresoftware.b4a.keywords.Common.Log(_content);
RDebugUtils.currentLine=7471203;
 //BA.debugLineNum = 7471203;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 break; }
case 2: {
RDebugUtils.currentLine=7471206;
 //BA.debugLineNum = 7471206;BA.debugLine="Dim data_array As List";
_data_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7471207;
 //BA.debugLineNum = 7471207;BA.debugLine="data_array = parser.NextArray";
_data_array = _parser.NextArray();
RDebugUtils.currentLine=7471208;
 //BA.debugLineNum = 7471208;BA.debugLine="For i=0 To data_array.Size -1";
{
final int step94 = 1;
final int limit94 = (int) (_data_array.getSize()-1);
_i = (int) (0) ;
for (;(step94 > 0 && _i <= limit94) || (step94 < 0 && _i >= limit94) ;_i = ((int)(0 + _i + step94))  ) {
RDebugUtils.currentLine=7471209;
 //BA.debugLineNum = 7471209;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7471210;
 //BA.debugLineNum = 7471210;BA.debugLine="a = data_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_data_array.Get(_i)));
RDebugUtils.currentLine=7471211;
 //BA.debugLineNum = 7471211;BA.debugLine="lat = a.Get(\"latitude\")";
_lat = BA.ObjectToString(_a.Get((Object)("latitude")));
RDebugUtils.currentLine=7471212;
 //BA.debugLineNum = 7471212;BA.debugLine="lng = a.Get(\"longitude\")";
_lng = BA.ObjectToString(_a.Get((Object)("longitude")));
RDebugUtils.currentLine=7471213;
 //BA.debugLineNum = 7471213;BA.debugLine="Log(lat)";
anywheresoftware.b4a.keywords.Common.Log(_lat);
RDebugUtils.currentLine=7471214;
 //BA.debugLineNum = 7471214;BA.debugLine="Log(lng)";
anywheresoftware.b4a.keywords.Common.Log(_lng);
RDebugUtils.currentLine=7471216;
 //BA.debugLineNum = 7471216;BA.debugLine="MsmeName.Text = a.Get(\"name_of_msme_building\"";
mostCurrent._msmename.setText(BA.ObjectToCharSequence(_a.Get((Object)("name_of_msme_building"))));
RDebugUtils.currentLine=7471217;
 //BA.debugLineNum = 7471217;BA.debugLine="TypeOfMsme.Text = a.Get(\"typems\")";
mostCurrent._typeofmsme.setText(BA.ObjectToCharSequence(_a.Get((Object)("typems"))));
RDebugUtils.currentLine=7471218;
 //BA.debugLineNum = 7471218;BA.debugLine="StandingYear.Text = a.Get(\"standing_year\")";
mostCurrent._standingyear.setText(BA.ObjectToCharSequence(_a.Get((Object)("standing_year"))));
RDebugUtils.currentLine=7471219;
 //BA.debugLineNum = 7471219;BA.debugLine="BuildingArea.Text = a.Get(\"building_area\")";
mostCurrent._buildingarea.setText(BA.ObjectToCharSequence(_a.Get((Object)("building_area"))));
RDebugUtils.currentLine=7471220;
 //BA.debugLineNum = 7471220;BA.debugLine="LandArea.Text = a.Get(\"land_area\")";
mostCurrent._landarea.setText(BA.ObjectToCharSequence(_a.Get((Object)("land_area"))));
RDebugUtils.currentLine=7471221;
 //BA.debugLineNum = 7471221;BA.debugLine="ParkingArea.Text = a.Get(\"parking_area\")";
mostCurrent._parkingarea.setText(BA.ObjectToCharSequence(_a.Get((Object)("parking_area"))));
RDebugUtils.currentLine=7471222;
 //BA.debugLineNum = 7471222;BA.debugLine="Electricity.Text = a.Get(\"electricity_capacit";
mostCurrent._electricity.setText(BA.ObjectToCharSequence(_a.Get((Object)("electricity_capacity"))));
RDebugUtils.currentLine=7471223;
 //BA.debugLineNum = 7471223;BA.debugLine="Construction.Text = a.Get(\"constr\")";
mostCurrent._construction.setText(BA.ObjectToCharSequence(_a.Get((Object)("constr"))));
 }
};
 break; }
}
;
 };
RDebugUtils.currentLine=7471227;
 //BA.debugLineNum = 7471227;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=7471228;
 //BA.debugLineNum = 7471228;BA.debugLine="End Sub";
return "";
}
public static String  _lbledit_click() throws Exception{
RDebugUtils.currentModule="msmedetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbledit_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "lbledit_click", null);
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub LblEdit_Click";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="StartActivity(MsmeEdit)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._msmeedit.getObject()));
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="End Sub";
return "";
}
public static String  _tabhost1_tabchanged() throws Exception{
RDebugUtils.currentModule="msmedetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "tabhost1_tabchanged"))
	return (String) Debug.delegate(mostCurrent.activityBA, "tabhost1_tabchanged", null);
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub TabHost1_TabChanged";
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="Select TabHost1.CurrentTab";
switch (BA.switchObjectToInt(mostCurrent._tabhost1.getCurrentTab(),(int) (0),(int) (1),(int) (2))) {
case 0: {
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="WebViewRoute.LoadUrl(Main.Server&\"Msme/Route.ph";
mostCurrent._webviewroute.LoadUrl(mostCurrent._main._server+"Msme/Route.php?lat="+mostCurrent._main._lbllat+"&lng="+mostCurrent._main._lbllon+"&latd="+_lat+"&lngd="+_lng);
RDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="Msgbox(\"Current tab is \" & TabHost1.CurrentTab,";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Current tab is "+BA.NumberToString(mostCurrent._tabhost1.getCurrentTab())),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="Log (\"Button Top :\"&btnRoute.Top)";
anywheresoftware.b4a.keywords.Common.Log("Button Top :"+BA.NumberToString(mostCurrent._btnroute.getTop()));
RDebugUtils.currentLine=7733255;
 //BA.debugLineNum = 7733255;BA.debugLine="TabHost1.Height = btnRoute.Top + btnRoute.Heigh";
mostCurrent._tabhost1.setHeight((int) (mostCurrent._btnroute.getTop()+mostCurrent._btnroute.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA)));
RDebugUtils.currentLine=7733256;
 //BA.debugLineNum = 7733256;BA.debugLine="Log(\"tabHost height: \"&TabHost1.Height)";
anywheresoftware.b4a.keywords.Common.Log("tabHost height: "+BA.NumberToString(mostCurrent._tabhost1.getHeight()));
RDebugUtils.currentLine=7733257;
 //BA.debugLineNum = 7733257;BA.debugLine="PanelBuildingList.Height = TabHost1.Height + Ta";
mostCurrent._panelbuildinglist.setHeight((int) (mostCurrent._tabhost1.getHeight()+mostCurrent._tabhost1.getTop()));
RDebugUtils.currentLine=7733258;
 //BA.debugLineNum = 7733258;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.He";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._panelbuildinglist.getHeight());
 break; }
case 1: {
RDebugUtils.currentLine=7733260;
 //BA.debugLineNum = 7733260;BA.debugLine="CLV1.Clear";
mostCurrent._clv1._clear();
RDebugUtils.currentLine=7733261;
 //BA.debugLineNum = 7733261;BA.debugLine="ProgressDialogShow(\"Loading...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Loading..."));
RDebugUtils.currentLine=7733262;
 //BA.debugLineNum = 7733262;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.msme_building_id,";
_executeremotequery("SELECT D.msme_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_msme_building_facilities As D LEFT JOIN msme_building_facilities As F ON F.facility_id=D.facility_id WHERE D.msme_building_id ='"+mostCurrent._ids+"'","FASILITAS");
RDebugUtils.currentLine=7733263;
 //BA.debugLineNum = 7733263;BA.debugLine="ExecuteRemoteQuery(\"SELECT M.msme_building_id,";
_executeremotequery("SELECT M.msme_building_id, M.name_of_msme_building, M.building_area, M.land_area, M.parking_area, M.standing_year, M.electricity_capacity, M.address, M.type_of_construction, M.type_of_msme, M.owner_name, M.number_of_employee, M.monthly_income, M.contact_person, ST_X(ST_Centroid(M.geom)) As longitude, ST_Y(ST_CENTROID(M.geom)) As latitude,T.name_of_type As constr, J.name_of_type As typems, ST_AsText(geom) As geom FROM msme_building As M LEFT JOIN type_of_construction As T ON M.type_of_construction=T.type_id LEFT JOIN type_of_msme As J ON M.type_of_msme=J.type_id WHERE M.msme_building_id='"+mostCurrent._ids+"'","DATA");
 break; }
case 2: {
RDebugUtils.currentLine=7733265;
 //BA.debugLineNum = 7733265;BA.debugLine="ProgressDialogShow(\"Loading...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Loading..."));
RDebugUtils.currentLine=7733266;
 //BA.debugLineNum = 7733266;BA.debugLine="ExecuteRemoteQuery(\"SELECT photo_url, upload_da";
_executeremotequery("SELECT photo_url, upload_date FROM msme_building_gallery WHERE msme_building_id='"+mostCurrent._ids+"'","Download");
 break; }
}
;
RDebugUtils.currentLine=7733269;
 //BA.debugLineNum = 7733269;BA.debugLine="End Sub";
return "";
}
}