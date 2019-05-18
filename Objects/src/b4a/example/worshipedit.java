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

public class worshipedit extends Activity implements B4AActivity{
	public static worshipedit mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.worshipedit");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (worshipedit).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.worshipedit");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.worshipedit", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (worshipedit) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (worshipedit) Resume **");
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
		return worshipedit.class;
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
        BA.LogInfo("** Activity (worshipedit) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (worshipedit) Resume **");
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
public static String _fasilitas = "";
public static String _lat = "";
public static String _lng = "";
public static int _quantity_fac = 0;
public static String _ids = "";
public static String _nama = "";
public static String _tipe = "";
public static String _jenis = "";
public static String _tahun = "";
public static String _ltanah = "";
public static String _lparkir = "";
public static String _lbangunan = "";
public static String _listrik = "";
public static String _kons = "";
public static String _tipp = "";
public static String _tipname = "";
public static String _typeworship = "";
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
public static String _idisi = "";
public static String _isi = "";
public static int _arraysize2 = 0;
public b4a.example3.customlistview _clv1 = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _titlebar = null;
public anywheresoftware.b4a.objects.LabelWrapper _backarrow = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelbuildinglist = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneltoolbar = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _numfc = null;
public anywheresoftware.b4a.objects.LabelWrapper _namefc = null;
public anywheresoftware.b4a.objects.PanelWrapper _pfacility = null;
public anywheresoftware.b4a.objects.PanelWrapper _listitem = null;
public anywheresoftware.b4a.objects.LabelWrapper _worshipname = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _typeofworship = null;
public anywheresoftware.b4a.objects.collections.Map _worshipmap = null;
public anywheresoftware.b4a.objects.LabelWrapper _standingyear = null;
public anywheresoftware.b4a.objects.LabelWrapper _buildingarea = null;
public anywheresoftware.b4a.objects.LabelWrapper _landarea = null;
public anywheresoftware.b4a.objects.LabelWrapper _parkingarea = null;
public anywheresoftware.b4a.objects.LabelWrapper _electricity = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _construction = null;
public anywheresoftware.b4a.objects.collections.Map _consmap = null;
public anywheresoftware.b4a.objects.collections.Map _facmap = null;
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
RDebugUtils.currentModule="worshipedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
anywheresoftware.b4a.objects.ScrollViewWrapper _sv = null;
RDebugUtils.currentLine=29229056;
 //BA.debugLineNum = 29229056;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=29229059;
 //BA.debugLineNum = 29229059;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=29229060;
 //BA.debugLineNum = 29229060;BA.debugLine="ScrollView1.Panel.LoadLayout(\"WorshipEdit\")";
mostCurrent._scrollview1.getPanel().LoadLayout("WorshipEdit",mostCurrent.activityBA);
RDebugUtils.currentLine=29229061;
 //BA.debugLineNum = 29229061;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._panelbuildinglist.getHeight());
RDebugUtils.currentLine=29229062;
 //BA.debugLineNum = 29229062;BA.debugLine="PanelToolBar.Visible = False";
mostCurrent._paneltoolbar.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=29229063;
 //BA.debugLineNum = 29229063;BA.debugLine="SetBackgroundTintList(WorshipName, Colors.ARGB(22";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._worshipname.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=29229064;
 //BA.debugLineNum = 29229064;BA.debugLine="SetBackgroundTintList(StandingYear, Colors.ARGB(2";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._standingyear.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=29229065;
 //BA.debugLineNum = 29229065;BA.debugLine="SetBackgroundTintList(BuildingArea, Colors.ARGB(2";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._buildingarea.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=29229066;
 //BA.debugLineNum = 29229066;BA.debugLine="SetBackgroundTintList(LandArea, Colors.ARGB(225,3";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._landarea.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=29229067;
 //BA.debugLineNum = 29229067;BA.debugLine="SetBackgroundTintList(Electricity, Colors.ARGB(22";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._electricity.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=29229068;
 //BA.debugLineNum = 29229068;BA.debugLine="SetBackgroundTintList(ParkingArea, Colors.ARGB(22";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._parkingarea.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=29229070;
 //BA.debugLineNum = 29229070;BA.debugLine="BackArrow.Visible= True";
mostCurrent._backarrow.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=29229071;
 //BA.debugLineNum = 29229071;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
mostCurrent._backarrow.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"back-arrow.png").getObject()));
RDebugUtils.currentLine=29229072;
 //BA.debugLineNum = 29229072;BA.debugLine="TitleBar.Text=\"Building Detail\"";
mostCurrent._titlebar.setText(BA.ObjectToCharSequence("Building Detail"));
RDebugUtils.currentLine=29229075;
 //BA.debugLineNum = 29229075;BA.debugLine="If WorshipBuilding.nameBuilding.Length > 0 Then";
if (mostCurrent._worshipbuilding._namebuilding.length()>0) { 
RDebugUtils.currentLine=29229076;
 //BA.debugLineNum = 29229076;BA.debugLine="WorshipName.Text = WorshipBuilding.nameBuilding";
mostCurrent._worshipname.setText(BA.ObjectToCharSequence(mostCurrent._worshipbuilding._namebuilding));
RDebugUtils.currentLine=29229077;
 //BA.debugLineNum = 29229077;BA.debugLine="ids = WorshipBuilding.idBuilding";
_ids = mostCurrent._worshipbuilding._idbuilding;
RDebugUtils.currentLine=29229078;
 //BA.debugLineNum = 29229078;BA.debugLine="Log(ids)";
anywheresoftware.b4a.keywords.Common.Log(_ids);
 }else 
{RDebugUtils.currentLine=29229079;
 //BA.debugLineNum = 29229079;BA.debugLine="Else If SearchBuilding.nameBuilding.Length > 0 Th";
if (mostCurrent._searchbuilding._namebuilding.length()>0) { 
RDebugUtils.currentLine=29229080;
 //BA.debugLineNum = 29229080;BA.debugLine="WorshipName.Text = SearchBuilding.nameBuilding";
mostCurrent._worshipname.setText(BA.ObjectToCharSequence(mostCurrent._searchbuilding._namebuilding));
RDebugUtils.currentLine=29229081;
 //BA.debugLineNum = 29229081;BA.debugLine="ids = SearchBuilding.idBuilding";
_ids = mostCurrent._searchbuilding._idbuilding;
RDebugUtils.currentLine=29229082;
 //BA.debugLineNum = 29229082;BA.debugLine="Log(ids)";
anywheresoftware.b4a.keywords.Common.Log(_ids);
 }else {
RDebugUtils.currentLine=29229084;
 //BA.debugLineNum = 29229084;BA.debugLine="WorshipName.Text = \"Please press on the button a";
mostCurrent._worshipname.setText(BA.ObjectToCharSequence("Please press on the button and choose an item."));
 }}
;
RDebugUtils.currentLine=29229087;
 //BA.debugLineNum = 29229087;BA.debugLine="Dim sv As ScrollView";
_sv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=29229088;
 //BA.debugLineNum = 29229088;BA.debugLine="ScrollView1.Height=100%y";
mostCurrent._scrollview1.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=29229089;
 //BA.debugLineNum = 29229089;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._panelbuildinglist.getHeight());
RDebugUtils.currentLine=29229090;
 //BA.debugLineNum = 29229090;BA.debugLine="End Sub";
return "";
}
public static String  _setbackgroundtintlist(anywheresoftware.b4a.objects.ConcreteViewWrapper _view,int _active,int _enabled) throws Exception{
RDebugUtils.currentModule="worshipedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setbackgroundtintlist"))
	return (String) Debug.delegate(mostCurrent.activityBA, "setbackgroundtintlist", new Object[] {_view,_active,_enabled});
int[][] _states = null;
int[] _color = null;
anywheresoftware.b4j.object.JavaObject _csl = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=29425664;
 //BA.debugLineNum = 29425664;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
RDebugUtils.currentLine=29425665;
 //BA.debugLineNum = 29425665;BA.debugLine="Dim States(2,1) As Int";
_states = new int[(int) (2)][];
{
int d0 = _states.length;
int d1 = (int) (1);
for (int i0 = 0;i0 < d0;i0++) {
_states[i0] = new int[d1];
}
}
;
RDebugUtils.currentLine=29425666;
 //BA.debugLineNum = 29425666;BA.debugLine="States(0,0) = 16842908     'Active";
_states[(int) (0)][(int) (0)] = (int) (16842908);
RDebugUtils.currentLine=29425667;
 //BA.debugLineNum = 29425667;BA.debugLine="States(1,0) = 16842910    'Enabled";
_states[(int) (1)][(int) (0)] = (int) (16842910);
RDebugUtils.currentLine=29425668;
 //BA.debugLineNum = 29425668;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
_color = new int[]{_active,_enabled};
RDebugUtils.currentLine=29425669;
 //BA.debugLineNum = 29425669;BA.debugLine="Dim CSL As JavaObject";
_csl = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=29425670;
 //BA.debugLineNum = 29425670;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
_csl.InitializeNewInstance("android.content.res.ColorStateList",new Object[]{(Object)(_states),(Object)(_color)});
RDebugUtils.currentLine=29425671;
 //BA.debugLineNum = 29425671;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=29425672;
 //BA.debugLineNum = 29425672;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
_jo.InitializeStatic("android.support.v4.view.ViewCompat");
RDebugUtils.currentLine=29425673;
 //BA.debugLineNum = 29425673;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
_jo.RunMethod("setBackgroundTintList",new Object[]{(Object)(_view.getObject()),(Object)(_csl.getObject())});
RDebugUtils.currentLine=29425674;
 //BA.debugLineNum = 29425674;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="worshipedit";
RDebugUtils.currentLine=29360128;
 //BA.debugLineNum = 29360128;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=29360130;
 //BA.debugLineNum = 29360130;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="worshipedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=29294592;
 //BA.debugLineNum = 29294592;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=29294593;
 //BA.debugLineNum = 29294593;BA.debugLine="WorshipMap.Initialize";
mostCurrent._worshipmap.Initialize();
RDebugUtils.currentLine=29294594;
 //BA.debugLineNum = 29294594;BA.debugLine="ConsMap.Initialize";
mostCurrent._consmap.Initialize();
RDebugUtils.currentLine=29294595;
 //BA.debugLineNum = 29294595;BA.debugLine="FacMap.Initialize";
mostCurrent._facmap.Initialize();
RDebugUtils.currentLine=29294596;
 //BA.debugLineNum = 29294596;BA.debugLine="ExecuteRemoteQuery(\"SELECT facility_id , name_of_";
_executeremotequery("SELECT facility_id , name_of_facility as nameface FROM worship_building_facilities ORDER BY name_of_facility ASC","AllFacilities");
RDebugUtils.currentLine=29294597;
 //BA.debugLineNum = 29294597;BA.debugLine="ExecuteRemoteQuery(\"SELECT D.worship_building_id,";
_executeremotequery("SELECT D.worship_building_id, D.facility_id, D.quantity_of_facilities, F.name_of_facility FROM detail_worship_building_facilities As D LEFT JOIN worship_building_facilities As F ON F.facility_id=D.facility_id WHERE D.worship_building_id ='"+_ids+"'","FASILITAS");
RDebugUtils.currentLine=29294598;
 //BA.debugLineNum = 29294598;BA.debugLine="ExecuteRemoteQuery(\"SELECT W.worship_building_id,";
_executeremotequery("SELECT W.worship_building_id, W.name_of_worship_building, W.building_area, W.land_area, W.parking_area, W.standing_year, W.electricity_capacity, W.address, W.type_of_construction, W.type_of_worship, ST_X(ST_Centroid(W.geom)) As longitude, ST_Y(ST_CENTROID(W.geom)) As latitude, T.name_of_type As constr, J.name_of_type As typewor, ST_AsText(geom) As geom FROM worship_building As W LEFT JOIN type_of_construction As T ON W.type_of_construction=T.type_id LEFT JOIN type_of_worship As J ON W.type_of_worship=J.type_id WHERE W.worship_building_id='"+_ids+"'","DATA");
RDebugUtils.currentLine=29294599;
 //BA.debugLineNum = 29294599;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_type";
_executeremotequery("SELECT type_id, name_of_type FROM type_of_worship ORDER BY name_of_type ASC","TypeWorship");
RDebugUtils.currentLine=29294600;
 //BA.debugLineNum = 29294600;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_type";
_executeremotequery("SELECT type_id, name_of_type FROM type_of_construction ORDER BY name_of_type ASC ","Construction");
RDebugUtils.currentLine=29294603;
 //BA.debugLineNum = 29294603;BA.debugLine="End Sub";
return "";
}
public static String  _executeremotequery(String _query,String _jobname) throws Exception{
RDebugUtils.currentModule="worshipedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "executeremotequery"))
	return (String) Debug.delegate(mostCurrent.activityBA, "executeremotequery", new Object[] {_query,_jobname});
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
RDebugUtils.currentLine=29491200;
 //BA.debugLineNum = 29491200;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
RDebugUtils.currentLine=29491201;
 //BA.debugLineNum = 29491201;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=29491202;
 //BA.debugLineNum = 29491202;BA.debugLine="Job.Initialize(JobName, Me)";
_job._initialize(processBA,_jobname,worshipedit.getObject());
RDebugUtils.currentLine=29491203;
 //BA.debugLineNum = 29491203;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
_job._poststring(""+mostCurrent._main._server+"mobile/json.php",_query);
RDebugUtils.currentLine=29491204;
 //BA.debugLineNum = 29491204;BA.debugLine="End Sub";
return "";
}
public static String  _btnsavechanges_click() throws Exception{
RDebugUtils.currentModule="worshipedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsavechanges_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnsavechanges_click", null);
RDebugUtils.currentLine=29818880;
 //BA.debugLineNum = 29818880;BA.debugLine="Sub BtnSaveChanges_Click";
RDebugUtils.currentLine=29818881;
 //BA.debugLineNum = 29818881;BA.debugLine="Log(ids)";
anywheresoftware.b4a.keywords.Common.Log(_ids);
RDebugUtils.currentLine=29818882;
 //BA.debugLineNum = 29818882;BA.debugLine="If typeworship == \"\" Then";
if ((_typeworship).equals("")) { 
RDebugUtils.currentLine=29818883;
 //BA.debugLineNum = 29818883;BA.debugLine="tipe_i = tipp";
_tipe_i = (int)(Double.parseDouble(_tipp));
 }else {
RDebugUtils.currentLine=29818885;
 //BA.debugLineNum = 29818885;BA.debugLine="tipe_i = typeworship";
_tipe_i = (int)(Double.parseDouble(_typeworship));
 };
RDebugUtils.currentLine=29818888;
 //BA.debugLineNum = 29818888;BA.debugLine="lbangunan_i = BuildingArea.Text";
_lbangunan_i = (int)(Double.parseDouble(mostCurrent._buildingarea.getText()));
RDebugUtils.currentLine=29818889;
 //BA.debugLineNum = 29818889;BA.debugLine="lparkir_i = ParkingArea.Text";
_lparkir_i = (int)(Double.parseDouble(mostCurrent._parkingarea.getText()));
RDebugUtils.currentLine=29818890;
 //BA.debugLineNum = 29818890;BA.debugLine="ltanah_i = LandArea.Text";
_ltanah_i = (int)(Double.parseDouble(mostCurrent._landarea.getText()));
RDebugUtils.currentLine=29818891;
 //BA.debugLineNum = 29818891;BA.debugLine="listrik_i = Electricity.Text";
_listrik_i = (int)(Double.parseDouble(mostCurrent._electricity.getText()));
RDebugUtils.currentLine=29818892;
 //BA.debugLineNum = 29818892;BA.debugLine="tahun_i = StandingYear.Text";
_tahun_i = (int)(Double.parseDouble(mostCurrent._standingyear.getText()));
RDebugUtils.currentLine=29818894;
 //BA.debugLineNum = 29818894;BA.debugLine="If typecons == \"\" Then";
if ((_typecons).equals("")) { 
RDebugUtils.currentLine=29818895;
 //BA.debugLineNum = 29818895;BA.debugLine="cons_i = cons";
_cons_i = (int)(Double.parseDouble(_cons));
 }else {
RDebugUtils.currentLine=29818897;
 //BA.debugLineNum = 29818897;BA.debugLine="cons_i = typecons";
_cons_i = (int)(Double.parseDouble(_typecons));
 };
RDebugUtils.currentLine=29818900;
 //BA.debugLineNum = 29818900;BA.debugLine="Log(tipe_i)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_tipe_i));
RDebugUtils.currentLine=29818901;
 //BA.debugLineNum = 29818901;BA.debugLine="Log(cons_i)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_cons_i));
RDebugUtils.currentLine=29818902;
 //BA.debugLineNum = 29818902;BA.debugLine="If IsNumber(tipe_i) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(BA.NumberToString(_tipe_i))) { 
RDebugUtils.currentLine=29818903;
 //BA.debugLineNum = 29818903;BA.debugLine="Log(\"\"&tipe_i&\" is a number\")";
anywheresoftware.b4a.keywords.Common.Log(""+BA.NumberToString(_tipe_i)+" is a number");
 }else {
RDebugUtils.currentLine=29818905;
 //BA.debugLineNum = 29818905;BA.debugLine="Log(\"\"&tipe_i&\" is not a number\")";
anywheresoftware.b4a.keywords.Common.Log(""+BA.NumberToString(_tipe_i)+" is not a number");
 };
RDebugUtils.currentLine=29818907;
 //BA.debugLineNum = 29818907;BA.debugLine="ProgressDialogShow(\"loading...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("loading..."));
RDebugUtils.currentLine=29818908;
 //BA.debugLineNum = 29818908;BA.debugLine="ExecuteRemoteQuery(\"UPDATE worship_building SET n";
_executeremotequery("UPDATE worship_building SET name_of_worship_building = '"+_nama+"', type_of_worship ="+BA.NumberToString(_tipe_i)+", building_area = "+BA.NumberToString(_lbangunan_i)+", land_area = '"+BA.NumberToString(_ltanah_i)+"', parking_area = "+BA.NumberToString(_lparkir_i)+",standing_year = '"+BA.NumberToString(_tahun_i)+"', electricity_capacity = "+BA.NumberToString(_listrik_i)+", type_of_construction = "+BA.NumberToString(_cons_i)+"WHERE worship_building_id = '"+_ids+"'","Update");
RDebugUtils.currentLine=29818909;
 //BA.debugLineNum = 29818909;BA.debugLine="End Sub";
return "";
}
public static String  _construction_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="worshipedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "construction_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "construction_itemclick", new Object[] {_position,_value});
String _idc = "";
RDebugUtils.currentLine=29753344;
 //BA.debugLineNum = 29753344;BA.debugLine="Sub Construction_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=29753345;
 //BA.debugLineNum = 29753345;BA.debugLine="Dim idc As String";
_idc = "";
RDebugUtils.currentLine=29753346;
 //BA.debugLineNum = 29753346;BA.debugLine="idc = ConsMap.Get(Value)";
_idc = BA.ObjectToString(mostCurrent._consmap.Get(_value));
RDebugUtils.currentLine=29753347;
 //BA.debugLineNum = 29753347;BA.debugLine="typecons = idc";
_typecons = _idc;
RDebugUtils.currentLine=29753348;
 //BA.debugLineNum = 29753348;BA.debugLine="Log(typecons)";
anywheresoftware.b4a.keywords.Common.Log(_typecons);
RDebugUtils.currentLine=29753349;
 //BA.debugLineNum = 29753349;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createitem(int _width,String _title,String _content) throws Exception{
RDebugUtils.currentModule="worshipedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createitem"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createitem", new Object[] {_width,_title,_content});
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=29556736;
 //BA.debugLineNum = 29556736;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
RDebugUtils.currentLine=29556737;
 //BA.debugLineNum = 29556737;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=29556738;
 //BA.debugLineNum = 29556738;BA.debugLine="p.LoadLayout(\"facility_edit\")";
_p.LoadLayout("facility_edit",mostCurrent.activityBA);
RDebugUtils.currentLine=29556739;
 //BA.debugLineNum = 29556739;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width,5%y)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=29556740;
 //BA.debugLineNum = 29556740;BA.debugLine="numfc.Text = Title";
mostCurrent._numfc.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=29556741;
 //BA.debugLineNum = 29556741;BA.debugLine="namefc.Text = Content";
mostCurrent._namefc.setText(BA.ObjectToCharSequence(_content));
RDebugUtils.currentLine=29556742;
 //BA.debugLineNum = 29556742;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_p.getObject()));
RDebugUtils.currentLine=29556743;
 //BA.debugLineNum = 29556743;BA.debugLine="End Sub";
return null;
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="worshipedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parserf = null;
anywheresoftware.b4a.objects.collections.JSONParser _parserfa = null;
anywheresoftware.b4a.objects.collections.List _fasi_array = null;
int _c = 0;
anywheresoftware.b4a.objects.collections.Map _a = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _fasilitas_array = null;
int _i = 0;
String _content = "";
int _quantity = 0;
anywheresoftware.b4a.objects.collections.List _data_array = null;
anywheresoftware.b4a.objects.collections.List _type_array = null;
String _namatype = "";
String _idtype = "";
anywheresoftware.b4a.objects.collections.List _cons_array = null;
int _j = 0;
String _nama_type = "";
String _id_type = "";
RDebugUtils.currentLine=29622272;
 //BA.debugLineNum = 29622272;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=29622273;
 //BA.debugLineNum = 29622273;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=29622274;
 //BA.debugLineNum = 29622274;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=29622275;
 //BA.debugLineNum = 29622275;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
RDebugUtils.currentLine=29622276;
 //BA.debugLineNum = 29622276;BA.debugLine="Log(\"Response from server :\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server :"+_res);
RDebugUtils.currentLine=29622278;
 //BA.debugLineNum = 29622278;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"AllFacilities","FASILITAS","DATA","Update","TypeWorship","Construction")) {
case 0: {
RDebugUtils.currentLine=29622280;
 //BA.debugLineNum = 29622280;BA.debugLine="Dim parserf As JSONParser 'mengambil data dala";
_parserf = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=29622281;
 //BA.debugLineNum = 29622281;BA.debugLine="Dim parserfa As JSONParser";
_parserfa = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=29622282;
 //BA.debugLineNum = 29622282;BA.debugLine="parserf.Initialize(res)";
_parserf.Initialize(_res);
RDebugUtils.currentLine=29622283;
 //BA.debugLineNum = 29622283;BA.debugLine="Dim fasi_array As List = parserf.NextArray";
_fasi_array = new anywheresoftware.b4a.objects.collections.List();
_fasi_array = _parserf.NextArray();
RDebugUtils.currentLine=29622284;
 //BA.debugLineNum = 29622284;BA.debugLine="parserfa.Initialize(res)";
_parserfa.Initialize(_res);
RDebugUtils.currentLine=29622285;
 //BA.debugLineNum = 29622285;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=29622286;
 //BA.debugLineNum = 29622286;BA.debugLine="For c=0 To fasi_array.Size - 1";
{
final int step13 = 1;
final int limit13 = (int) (_fasi_array.getSize()-1);
_c = (int) (0) ;
for (;(step13 > 0 && _c <= limit13) || (step13 < 0 && _c >= limit13) ;_c = ((int)(0 + _c + step13))  ) {
RDebugUtils.currentLine=29622287;
 //BA.debugLineNum = 29622287;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=29622288;
 //BA.debugLineNum = 29622288;BA.debugLine="a = fasi_array.Get(c)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_fasi_array.Get(_c)));
RDebugUtils.currentLine=29622290;
 //BA.debugLineNum = 29622290;BA.debugLine="isi = a.Get(\"name_of_facility\")";
_isi = BA.ObjectToString(_a.Get((Object)("name_of_facility")));
RDebugUtils.currentLine=29622291;
 //BA.debugLineNum = 29622291;BA.debugLine="Log(\"ISI: \"&isi)";
anywheresoftware.b4a.keywords.Common.Log("ISI: "+_isi);
 }
};
RDebugUtils.currentLine=29622293;
 //BA.debugLineNum = 29622293;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 break; }
case 1: {
RDebugUtils.currentLine=29622296;
 //BA.debugLineNum = 29622296;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=29622297;
 //BA.debugLineNum = 29622297;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=29622298;
 //BA.debugLineNum = 29622298;BA.debugLine="Dim fasilitas_array As List";
_fasilitas_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=29622299;
 //BA.debugLineNum = 29622299;BA.debugLine="fasilitas_array = parser.NextArray";
_fasilitas_array = _parser.NextArray();
RDebugUtils.currentLine=29622300;
 //BA.debugLineNum = 29622300;BA.debugLine="For i=0 To fasilitas_array.Size - 1";
{
final int step25 = 1;
final int limit25 = (int) (_fasilitas_array.getSize()-1);
_i = (int) (0) ;
for (;(step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25) ;_i = ((int)(0 + _i + step25))  ) {
RDebugUtils.currentLine=29622301;
 //BA.debugLineNum = 29622301;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=29622302;
 //BA.debugLineNum = 29622302;BA.debugLine="a = fasilitas_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_fasilitas_array.Get(_i)));
RDebugUtils.currentLine=29622304;
 //BA.debugLineNum = 29622304;BA.debugLine="Dim content As String = a.Get(\"name_of_facili";
_content = BA.ObjectToString(_a.Get((Object)("name_of_facility")));
RDebugUtils.currentLine=29622305;
 //BA.debugLineNum = 29622305;BA.debugLine="Dim quantity As Int = a.Get(\"quantity_of_faci";
_quantity = (int)(BA.ObjectToNumber(_a.Get((Object)("quantity_of_facilities"))));
RDebugUtils.currentLine=29622306;
 //BA.debugLineNum = 29622306;BA.debugLine="CLV1.Add(CreateItem(CLV1.AsView.Width, $\"${qu";
mostCurrent._clv1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(mostCurrent._clv1._asview().getWidth(),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_quantity))+""),_content).getObject())),(Object)(""));
RDebugUtils.currentLine=29622307;
 //BA.debugLineNum = 29622307;BA.debugLine="CLV1.AsView.Height = ListItem.Height*(i+1)";
mostCurrent._clv1._asview().setHeight((int) (mostCurrent._listitem.getHeight()*(_i+1)));
 }
};
RDebugUtils.currentLine=29622312;
 //BA.debugLineNum = 29622312;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 break; }
case 2: {
RDebugUtils.currentLine=29622315;
 //BA.debugLineNum = 29622315;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=29622316;
 //BA.debugLineNum = 29622316;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=29622317;
 //BA.debugLineNum = 29622317;BA.debugLine="Dim data_array As List";
_data_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=29622318;
 //BA.debugLineNum = 29622318;BA.debugLine="data_array = parser.NextArray";
_data_array = _parser.NextArray();
RDebugUtils.currentLine=29622319;
 //BA.debugLineNum = 29622319;BA.debugLine="For i=0 To data_array.Size -1";
{
final int step39 = 1;
final int limit39 = (int) (_data_array.getSize()-1);
_i = (int) (0) ;
for (;(step39 > 0 && _i <= limit39) || (step39 < 0 && _i >= limit39) ;_i = ((int)(0 + _i + step39))  ) {
RDebugUtils.currentLine=29622320;
 //BA.debugLineNum = 29622320;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=29622321;
 //BA.debugLineNum = 29622321;BA.debugLine="a = data_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_data_array.Get(_i)));
RDebugUtils.currentLine=29622322;
 //BA.debugLineNum = 29622322;BA.debugLine="lat = a.Get(\"latitude\")";
_lat = BA.ObjectToString(_a.Get((Object)("latitude")));
RDebugUtils.currentLine=29622323;
 //BA.debugLineNum = 29622323;BA.debugLine="lng = a.Get(\"longitude\")";
_lng = BA.ObjectToString(_a.Get((Object)("longitude")));
RDebugUtils.currentLine=29622324;
 //BA.debugLineNum = 29622324;BA.debugLine="Log(lat)";
anywheresoftware.b4a.keywords.Common.Log(_lat);
RDebugUtils.currentLine=29622325;
 //BA.debugLineNum = 29622325;BA.debugLine="Log(lng)";
anywheresoftware.b4a.keywords.Common.Log(_lng);
RDebugUtils.currentLine=29622326;
 //BA.debugLineNum = 29622326;BA.debugLine="WorshipName.Text = a.Get(\"name_of_worship_bui";
mostCurrent._worshipname.setText(BA.ObjectToCharSequence(_a.Get((Object)("name_of_worship_building"))));
RDebugUtils.currentLine=29622327;
 //BA.debugLineNum = 29622327;BA.debugLine="tipp = a.Get(\"type_of_worship\")";
_tipp = BA.ObjectToString(_a.Get((Object)("type_of_worship")));
RDebugUtils.currentLine=29622328;
 //BA.debugLineNum = 29622328;BA.debugLine="tipname = a.Get(\"typewor\")";
_tipname = BA.ObjectToString(_a.Get((Object)("typewor")));
RDebugUtils.currentLine=29622329;
 //BA.debugLineNum = 29622329;BA.debugLine="StandingYear.Text = a.Get(\"standing_year\")";
mostCurrent._standingyear.setText(BA.ObjectToCharSequence(_a.Get((Object)("standing_year"))));
RDebugUtils.currentLine=29622330;
 //BA.debugLineNum = 29622330;BA.debugLine="BuildingArea.Text = a.Get(\"building_area\")";
mostCurrent._buildingarea.setText(BA.ObjectToCharSequence(_a.Get((Object)("building_area"))));
RDebugUtils.currentLine=29622331;
 //BA.debugLineNum = 29622331;BA.debugLine="LandArea.Text = a.Get(\"land_area\")";
mostCurrent._landarea.setText(BA.ObjectToCharSequence(_a.Get((Object)("land_area"))));
RDebugUtils.currentLine=29622332;
 //BA.debugLineNum = 29622332;BA.debugLine="ParkingArea.Text = a.Get(\"parking_area\")";
mostCurrent._parkingarea.setText(BA.ObjectToCharSequence(_a.Get((Object)("parking_area"))));
RDebugUtils.currentLine=29622333;
 //BA.debugLineNum = 29622333;BA.debugLine="Electricity.Text = a.Get(\"electricity_capacit";
mostCurrent._electricity.setText(BA.ObjectToCharSequence(_a.Get((Object)("electricity_capacity"))));
RDebugUtils.currentLine=29622334;
 //BA.debugLineNum = 29622334;BA.debugLine="cons = a.Get(\"type_of_construction\")";
_cons = BA.ObjectToString(_a.Get((Object)("type_of_construction")));
RDebugUtils.currentLine=29622335;
 //BA.debugLineNum = 29622335;BA.debugLine="consname = a.Get(\"constr\")";
_consname = BA.ObjectToString(_a.Get((Object)("constr")));
RDebugUtils.currentLine=29622336;
 //BA.debugLineNum = 29622336;BA.debugLine="Log(\"Data :\"&cons)";
anywheresoftware.b4a.keywords.Common.Log("Data :"+_cons);
RDebugUtils.currentLine=29622337;
 //BA.debugLineNum = 29622337;BA.debugLine="nama= WorshipName.Text";
_nama = mostCurrent._worshipname.getText();
RDebugUtils.currentLine=29622338;
 //BA.debugLineNum = 29622338;BA.debugLine="tahun= StandingYear.Text";
_tahun = mostCurrent._standingyear.getText();
RDebugUtils.currentLine=29622339;
 //BA.debugLineNum = 29622339;BA.debugLine="ltanah= LandArea.Text";
_ltanah = mostCurrent._landarea.getText();
RDebugUtils.currentLine=29622340;
 //BA.debugLineNum = 29622340;BA.debugLine="lparkir= ParkingArea.Text";
_lparkir = mostCurrent._parkingarea.getText();
RDebugUtils.currentLine=29622341;
 //BA.debugLineNum = 29622341;BA.debugLine="lbangunan= BuildingArea.Text";
_lbangunan = mostCurrent._buildingarea.getText();
RDebugUtils.currentLine=29622342;
 //BA.debugLineNum = 29622342;BA.debugLine="listrik= Electricity.Text";
_listrik = mostCurrent._electricity.getText();
 }
};
 break; }
case 3: {
RDebugUtils.currentLine=29622346;
 //BA.debugLineNum = 29622346;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=29622347;
 //BA.debugLineNum = 29622347;BA.debugLine="Try";
try {RDebugUtils.currentLine=29622348;
 //BA.debugLineNum = 29622348;BA.debugLine="Msgbox(\"Data has been updated! :)\",\"Success\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Data has been updated! :)"),BA.ObjectToCharSequence("Success"),mostCurrent.activityBA);
RDebugUtils.currentLine=29622349;
 //BA.debugLineNum = 29622349;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 } 
       catch (Exception e70) {
			processBA.setLastException(e70);RDebugUtils.currentLine=29622351;
 //BA.debugLineNum = 29622351;BA.debugLine="Msgbox(\"Data can not be updated :(\" , \"error\"";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Data can not be updated :("),BA.ObjectToCharSequence("error"),mostCurrent.activityBA);
 };
 break; }
case 4: {
RDebugUtils.currentLine=29622355;
 //BA.debugLineNum = 29622355;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=29622356;
 //BA.debugLineNum = 29622356;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=29622357;
 //BA.debugLineNum = 29622357;BA.debugLine="Dim type_array As List";
_type_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=29622358;
 //BA.debugLineNum = 29622358;BA.debugLine="type_array = parser.NextArray";
_type_array = _parser.NextArray();
RDebugUtils.currentLine=29622359;
 //BA.debugLineNum = 29622359;BA.debugLine="For i=0 To type_array.Size -1";
{
final int step77 = 1;
final int limit77 = (int) (_type_array.getSize()-1);
_i = (int) (0) ;
for (;(step77 > 0 && _i <= limit77) || (step77 < 0 && _i >= limit77) ;_i = ((int)(0 + _i + step77))  ) {
RDebugUtils.currentLine=29622360;
 //BA.debugLineNum = 29622360;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=29622361;
 //BA.debugLineNum = 29622361;BA.debugLine="a = type_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_type_array.Get(_i)));
RDebugUtils.currentLine=29622362;
 //BA.debugLineNum = 29622362;BA.debugLine="Dim namatype, idtype As String";
_namatype = "";
_idtype = "";
RDebugUtils.currentLine=29622363;
 //BA.debugLineNum = 29622363;BA.debugLine="namatype= a.Get(\"name_of_type\")";
_namatype = BA.ObjectToString(_a.Get((Object)("name_of_type")));
RDebugUtils.currentLine=29622364;
 //BA.debugLineNum = 29622364;BA.debugLine="idtype = a.Get(\"type_id\")";
_idtype = BA.ObjectToString(_a.Get((Object)("type_id")));
RDebugUtils.currentLine=29622365;
 //BA.debugLineNum = 29622365;BA.debugLine="TypeOfWorship.Add(namatype)";
mostCurrent._typeofworship.Add(_namatype);
RDebugUtils.currentLine=29622366;
 //BA.debugLineNum = 29622366;BA.debugLine="WorshipMap.Put(namatype,idtype)";
mostCurrent._worshipmap.Put((Object)(_namatype),(Object)(_idtype));
RDebugUtils.currentLine=29622367;
 //BA.debugLineNum = 29622367;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_namatype+" "+_idtype);
 }
};
RDebugUtils.currentLine=29622369;
 //BA.debugLineNum = 29622369;BA.debugLine="TypeOfWorship.SelectedIndex = TypeOfWorship.In";
mostCurrent._typeofworship.setSelectedIndex(mostCurrent._typeofworship.IndexOf(_tipname));
 break; }
case 5: {
RDebugUtils.currentLine=29622372;
 //BA.debugLineNum = 29622372;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=29622373;
 //BA.debugLineNum = 29622373;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=29622374;
 //BA.debugLineNum = 29622374;BA.debugLine="Dim cons_array As List";
_cons_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=29622375;
 //BA.debugLineNum = 29622375;BA.debugLine="cons_array = parser.NextArray";
_cons_array = _parser.NextArray();
RDebugUtils.currentLine=29622376;
 //BA.debugLineNum = 29622376;BA.debugLine="For j=0 To cons_array.Size -1";
{
final int step93 = 1;
final int limit93 = (int) (_cons_array.getSize()-1);
_j = (int) (0) ;
for (;(step93 > 0 && _j <= limit93) || (step93 < 0 && _j >= limit93) ;_j = ((int)(0 + _j + step93))  ) {
RDebugUtils.currentLine=29622377;
 //BA.debugLineNum = 29622377;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=29622378;
 //BA.debugLineNum = 29622378;BA.debugLine="a = cons_array.Get(j)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_cons_array.Get(_j)));
RDebugUtils.currentLine=29622379;
 //BA.debugLineNum = 29622379;BA.debugLine="Dim nama_type, id_type As String";
_nama_type = "";
_id_type = "";
RDebugUtils.currentLine=29622380;
 //BA.debugLineNum = 29622380;BA.debugLine="nama_type= a.Get(\"name_of_type\")";
_nama_type = BA.ObjectToString(_a.Get((Object)("name_of_type")));
RDebugUtils.currentLine=29622381;
 //BA.debugLineNum = 29622381;BA.debugLine="id_type = a.Get(\"type_id\")";
_id_type = BA.ObjectToString(_a.Get((Object)("type_id")));
RDebugUtils.currentLine=29622383;
 //BA.debugLineNum = 29622383;BA.debugLine="Construction.Add(nama_type)";
mostCurrent._construction.Add(_nama_type);
RDebugUtils.currentLine=29622384;
 //BA.debugLineNum = 29622384;BA.debugLine="ConsMap.Put(nama_type,id_type)";
mostCurrent._consmap.Put((Object)(_nama_type),(Object)(_id_type));
RDebugUtils.currentLine=29622385;
 //BA.debugLineNum = 29622385;BA.debugLine="Log(\"ID Map: \"&nama_type&\" \"&id_type)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_nama_type+" "+_id_type);
 }
};
RDebugUtils.currentLine=29622387;
 //BA.debugLineNum = 29622387;BA.debugLine="Construction.SelectedIndex = Construction.Inde";
mostCurrent._construction.setSelectedIndex(mostCurrent._construction.IndexOf(_consname));
 break; }
}
;
 };
RDebugUtils.currentLine=29622390;
 //BA.debugLineNum = 29622390;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=29622391;
 //BA.debugLineNum = 29622391;BA.debugLine="End Sub";
return "";
}
public static String  _typeofworship_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="worshipedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "typeofworship_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "typeofworship_itemclick", new Object[] {_position,_value});
String _id = "";
RDebugUtils.currentLine=29687808;
 //BA.debugLineNum = 29687808;BA.debugLine="Sub TypeOfWorship_ItemClick (Position As Int, Valu";
RDebugUtils.currentLine=29687809;
 //BA.debugLineNum = 29687809;BA.debugLine="Dim id As String";
_id = "";
RDebugUtils.currentLine=29687810;
 //BA.debugLineNum = 29687810;BA.debugLine="id = WorshipMap.Get(Value)";
_id = BA.ObjectToString(mostCurrent._worshipmap.Get(_value));
RDebugUtils.currentLine=29687811;
 //BA.debugLineNum = 29687811;BA.debugLine="typeworship = id";
_typeworship = _id;
RDebugUtils.currentLine=29687812;
 //BA.debugLineNum = 29687812;BA.debugLine="Log(typeworship)";
anywheresoftware.b4a.keywords.Common.Log(_typeworship);
RDebugUtils.currentLine=29687813;
 //BA.debugLineNum = 29687813;BA.debugLine="End Sub";
return "";
}
}