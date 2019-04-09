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

public class msmeedit extends Activity implements B4AActivity{
	public static msmeedit mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.msmeedit");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (msmeedit).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.msmeedit");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.msmeedit", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (msmeedit) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (msmeedit) Resume **");
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
		return msmeedit.class;
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
        BA.LogInfo("** Activity (msmeedit) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (msmeedit) Resume **");
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
public static String _typemsme = "";
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
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _titlebar = null;
public anywheresoftware.b4a.objects.LabelWrapper _backarrow = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelbuildinglist = null;
public anywheresoftware.b4a.objects.LabelWrapper _msmename = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _typeofmsme = null;
public anywheresoftware.b4a.objects.LabelWrapper _standingyear = null;
public anywheresoftware.b4a.objects.LabelWrapper _buildingarea = null;
public anywheresoftware.b4a.objects.LabelWrapper _landarea = null;
public anywheresoftware.b4a.objects.LabelWrapper _parkingarea = null;
public anywheresoftware.b4a.objects.LabelWrapper _electricity = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _construction = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneltoolbar = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbledit = null;
public anywheresoftware.b4a.objects.collections.Map _msmemap = null;
public anywheresoftware.b4a.objects.collections.Map _consmap = null;
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
public b4a.example.housedetail _housedetail = null;
public b4a.example.home _home = null;
public b4a.example.healthbuilding _healthbuilding = null;
public b4a.example.gallery _gallery = null;
public b4a.example.officebuilding _officebuilding = null;
public b4a.example.educationalbuilding _educationalbuilding = null;
public b4a.example.msmebuilding _msmebuilding = null;
public b4a.example.officeedit _officeedit = null;
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
anywheresoftware.b4a.objects.ScrollViewWrapper _sv = null;
 //BA.debugLineNum = 46;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 49;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
 //BA.debugLineNum = 50;BA.debugLine="ScrollView1.Panel.LoadLayout(\"MsmeEdit\")";
mostCurrent._scrollview1.getPanel().LoadLayout("MsmeEdit",mostCurrent.activityBA);
 //BA.debugLineNum = 51;BA.debugLine="PanelToolBar.Visible = False";
mostCurrent._paneltoolbar.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 53;BA.debugLine="SetBackgroundTintList(MsmeName, Colors.ARGB(225,3";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._msmename.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
 //BA.debugLineNum = 54;BA.debugLine="SetBackgroundTintList(StandingYear, Colors.ARGB(2";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._standingyear.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
 //BA.debugLineNum = 55;BA.debugLine="SetBackgroundTintList(BuildingArea, Colors.ARGB(2";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._buildingarea.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
 //BA.debugLineNum = 56;BA.debugLine="SetBackgroundTintList(LandArea, Colors.ARGB(225,3";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._landarea.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
 //BA.debugLineNum = 57;BA.debugLine="SetBackgroundTintList(Electricity, Colors.ARGB(22";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._electricity.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
 //BA.debugLineNum = 58;BA.debugLine="SetBackgroundTintList(ParkingArea, Colors.ARGB(22";
_setbackgroundtintlist((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._parkingarea.getObject())),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (225),(int) (3),(int) (155),(int) (230)),anywheresoftware.b4a.keywords.Common.Colors.LightGray);
 //BA.debugLineNum = 61;BA.debugLine="BackArrow.Visible= True";
mostCurrent._backarrow.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 62;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
mostCurrent._backarrow.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"back-arrow.png").getObject()));
 //BA.debugLineNum = 63;BA.debugLine="TitleBar.Text=\"Edit Detail\"";
mostCurrent._titlebar.setText(BA.ObjectToCharSequence("Edit Detail"));
 //BA.debugLineNum = 65;BA.debugLine="If MsmeBuilding.nameBuilding.Length > 0 Then";
if (mostCurrent._msmebuilding._namebuilding.length()>0) { 
 //BA.debugLineNum = 66;BA.debugLine="MsmeName.Text = MsmeBuilding.nameBuilding";
mostCurrent._msmename.setText(BA.ObjectToCharSequence(mostCurrent._msmebuilding._namebuilding));
 //BA.debugLineNum = 67;BA.debugLine="ids = MsmeBuilding.idBuilding";
_ids = mostCurrent._msmebuilding._idbuilding;
 //BA.debugLineNum = 68;BA.debugLine="Log(\"Nama :\"& MsmeName.Text)";
anywheresoftware.b4a.keywords.Common.Log("Nama :"+mostCurrent._msmename.getText());
 }else if(mostCurrent._searchbuilding._namebuilding.length()>0) { 
 //BA.debugLineNum = 70;BA.debugLine="MsmeName.Text = SearchBuilding.nameBuilding";
mostCurrent._msmename.setText(BA.ObjectToCharSequence(mostCurrent._searchbuilding._namebuilding));
 //BA.debugLineNum = 71;BA.debugLine="ids = SearchBuilding.idBuilding";
_ids = mostCurrent._searchbuilding._idbuilding;
 //BA.debugLineNum = 72;BA.debugLine="Log(\"Nama :\"&ids)";
anywheresoftware.b4a.keywords.Common.Log("Nama :"+_ids);
 }else {
 //BA.debugLineNum = 74;BA.debugLine="MsmeName.Text = \"Please press on the button and";
mostCurrent._msmename.setText(BA.ObjectToCharSequence("Please press on the button and choose an item."));
 };
 //BA.debugLineNum = 77;BA.debugLine="Dim sv As ScrollView";
_sv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 78;BA.debugLine="ScrollView1.Height=100%y";
mostCurrent._scrollview1.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 79;BA.debugLine="ScrollView1.Panel.Height = PanelBuildingList.Heig";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._panelbuildinglist.getHeight());
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 83;BA.debugLine="MsmeMap.Initialize";
mostCurrent._msmemap.Initialize();
 //BA.debugLineNum = 84;BA.debugLine="ConsMap.Initialize";
mostCurrent._consmap.Initialize();
 //BA.debugLineNum = 85;BA.debugLine="MsmeMap.Clear";
mostCurrent._msmemap.Clear();
 //BA.debugLineNum = 86;BA.debugLine="ConsMap.Clear";
mostCurrent._consmap.Clear();
 //BA.debugLineNum = 87;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_type";
_executeremotequery("SELECT type_id, name_of_type FROM type_of_construction ORDER BY name_of_type ASC ","Construction");
 //BA.debugLineNum = 88;BA.debugLine="ExecuteRemoteQuery(\"SELECT type_id, name_of_type";
_executeremotequery("SELECT type_id, name_of_type FROM type_of_msme ORDER BY name_of_type ASC","TypeMsme");
 //BA.debugLineNum = 89;BA.debugLine="ExecuteRemoteQuery(\"SELECT M.msme_building_id, M.";
_executeremotequery("SELECT M.msme_building_id, M.name_of_msme_building, M.building_area, M.land_area, M.parking_area, M.standing_year, M.electricity_capacity, M.address, M.type_of_construction, M.type_of_msme, M.owner_name, M.number_of_employee, M.monthly_income, M.contact_person, ST_X(ST_Centroid(M.geom)) As longitude, ST_Y(ST_CENTROID(M.geom)) As latitude,T.name_of_type As constr, J.name_of_type As typems, ST_AsText(geom) As geom FROM msme_building As M LEFT JOIN type_of_construction As T ON M.type_of_construction=T.type_id LEFT JOIN type_of_msme As J ON M.type_of_msme=J.type_id WHERE M.msme_building_id='"+_ids+"'","DATA");
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public static String  _btngallery_click() throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub btnGallery_Click";
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return "";
}
public static String  _btnsavechanges_click() throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub BtnSaveChanges_Click";
 //BA.debugLineNum = 230;BA.debugLine="Log(ids)";
anywheresoftware.b4a.keywords.Common.Log(_ids);
 //BA.debugLineNum = 231;BA.debugLine="If typemsme == \"\" Then";
if ((_typemsme).equals("")) { 
 //BA.debugLineNum = 232;BA.debugLine="tipe_i = tipp";
_tipe_i = (int)(Double.parseDouble(_tipp));
 }else {
 //BA.debugLineNum = 234;BA.debugLine="tipe_i = typemsme";
_tipe_i = (int)(Double.parseDouble(_typemsme));
 };
 //BA.debugLineNum = 237;BA.debugLine="lbangunan_i = BuildingArea.Text";
_lbangunan_i = (int)(Double.parseDouble(mostCurrent._buildingarea.getText()));
 //BA.debugLineNum = 238;BA.debugLine="lparkir_i = ParkingArea.Text";
_lparkir_i = (int)(Double.parseDouble(mostCurrent._parkingarea.getText()));
 //BA.debugLineNum = 239;BA.debugLine="ltanah_i = LandArea.Text";
_ltanah_i = (int)(Double.parseDouble(mostCurrent._landarea.getText()));
 //BA.debugLineNum = 240;BA.debugLine="listrik_i = Electricity.Text";
_listrik_i = (int)(Double.parseDouble(mostCurrent._electricity.getText()));
 //BA.debugLineNum = 241;BA.debugLine="tahun_i = StandingYear.Text";
_tahun_i = (int)(Double.parseDouble(mostCurrent._standingyear.getText()));
 //BA.debugLineNum = 243;BA.debugLine="If typecons == \"\" Then";
if ((_typecons).equals("")) { 
 //BA.debugLineNum = 244;BA.debugLine="cons_i = cons";
_cons_i = (int)(Double.parseDouble(_cons));
 }else {
 //BA.debugLineNum = 246;BA.debugLine="cons_i = typecons";
_cons_i = (int)(Double.parseDouble(_typecons));
 };
 //BA.debugLineNum = 249;BA.debugLine="Log(tipe_i)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_tipe_i));
 //BA.debugLineNum = 250;BA.debugLine="Log(cons_i)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_cons_i));
 //BA.debugLineNum = 251;BA.debugLine="If IsNumber(tipe_i) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(BA.NumberToString(_tipe_i))) { 
 //BA.debugLineNum = 252;BA.debugLine="Log(\"\"&tipe_i&\" is a number\")";
anywheresoftware.b4a.keywords.Common.Log(""+BA.NumberToString(_tipe_i)+" is a number");
 }else {
 //BA.debugLineNum = 254;BA.debugLine="Log(\"\"&tipe_i&\" is not a number\")";
anywheresoftware.b4a.keywords.Common.Log(""+BA.NumberToString(_tipe_i)+" is not a number");
 };
 //BA.debugLineNum = 256;BA.debugLine="ProgressDialogShow(\"loading...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("loading..."));
 //BA.debugLineNum = 257;BA.debugLine="ExecuteRemoteQuery(\"UPDATE msme_building SET name";
_executeremotequery("UPDATE msme_building SET name_of_msme_building = '"+_nama+"', type_of_msme = "+BA.NumberToString(_tipe_i)+", building_area = "+BA.NumberToString(_lbangunan_i)+", land_area = "+BA.NumberToString(_ltanah_i)+", parking_area = "+BA.NumberToString(_lparkir_i)+", standing_year = '"+BA.NumberToString(_tahun_i)+"', electricity_capacity = "+BA.NumberToString(_listrik_i)+", type_of_construction = "+BA.NumberToString(_cons_i)+" WHERE msme_building_id = '"+_ids+"'","Update");
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return "";
}
public static String  _construction_itemclick(int _position,Object _value) throws Exception{
String _idc = "";
 //BA.debugLineNum = 222;BA.debugLine="Sub Construction_ItemClick (Position As Int, Value";
 //BA.debugLineNum = 223;BA.debugLine="Dim idc As String";
_idc = "";
 //BA.debugLineNum = 224;BA.debugLine="idc = ConsMap.Get(Value)";
_idc = BA.ObjectToString(mostCurrent._consmap.Get(_value));
 //BA.debugLineNum = 225;BA.debugLine="typecons = idc";
_typecons = _idc;
 //BA.debugLineNum = 226;BA.debugLine="Log(typecons)";
anywheresoftware.b4a.keywords.Common.Log(_typecons);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return "";
}
public static String  _executeremotequery(String _query,String _jobname) throws Exception{
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
 //BA.debugLineNum = 108;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
 //BA.debugLineNum = 109;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
 //BA.debugLineNum = 110;BA.debugLine="Job.Initialize(JobName, Me)";
_job._initialize(processBA,_jobname,msmeedit.getObject());
 //BA.debugLineNum = 111;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
_job._poststring(""+mostCurrent._main._server+"mobile/json.php",_query);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Private ScrollView1 As ScrollView";
mostCurrent._scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private TitleBar As Label";
mostCurrent._titlebar = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private BackArrow As Label";
mostCurrent._backarrow = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private PanelBuildingList As Panel";
mostCurrent._panelbuildinglist = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Dim MsmeName As Label";
mostCurrent._msmename = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private TypeOfMsme As Spinner";
mostCurrent._typeofmsme = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private StandingYear As Label";
mostCurrent._standingyear = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private BuildingArea As Label";
mostCurrent._buildingarea = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private LandArea As Label";
mostCurrent._landarea = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private ParkingArea As Label";
mostCurrent._parkingarea = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private Electricity As Label";
mostCurrent._electricity = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private Construction As Spinner";
mostCurrent._construction = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private PanelToolBar As Panel";
mostCurrent._paneltoolbar = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Dim ids As String";
_ids = "";
 //BA.debugLineNum = 41;BA.debugLine="Private LblEdit As Label";
mostCurrent._lbledit = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Dim MsmeMap As Map";
mostCurrent._msmemap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 43;BA.debugLine="Dim ConsMap As Map";
mostCurrent._consmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
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
 //BA.debugLineNum = 114;BA.debugLine="Sub JobDone(Job As HttpJob)";
 //BA.debugLineNum = 115;BA.debugLine="If Job.Success Then";
if (_job._success) { 
 //BA.debugLineNum = 116;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 117;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
 //BA.debugLineNum = 118;BA.debugLine="Log(\"Response from server :\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server :"+_res);
 //BA.debugLineNum = 119;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 120;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
 //BA.debugLineNum = 121;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"DATA","Update","TypeMsme","Construction")) {
case 0: {
 //BA.debugLineNum = 123;BA.debugLine="Dim data_array As List";
_data_array = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 124;BA.debugLine="data_array = parser.NextArray";
_data_array = _parser.NextArray();
 //BA.debugLineNum = 125;BA.debugLine="For i=0 To data_array.Size -1";
{
final int step11 = 1;
final int limit11 = (int) (_data_array.getSize()-1);
_i = (int) (0) ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
 //BA.debugLineNum = 126;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 127;BA.debugLine="a = data_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_data_array.Get(_i)));
 //BA.debugLineNum = 128;BA.debugLine="lat = a.Get(\"latitude\")";
_lat = BA.ObjectToString(_a.Get((Object)("latitude")));
 //BA.debugLineNum = 129;BA.debugLine="lng = a.Get(\"longitude\")";
_lng = BA.ObjectToString(_a.Get((Object)("longitude")));
 //BA.debugLineNum = 130;BA.debugLine="Log(lat)";
anywheresoftware.b4a.keywords.Common.Log(_lat);
 //BA.debugLineNum = 131;BA.debugLine="Log(lng)";
anywheresoftware.b4a.keywords.Common.Log(_lng);
 //BA.debugLineNum = 132;BA.debugLine="MsmeName.Text = a.Get(\"name_of_msme_building\"";
mostCurrent._msmename.setText(BA.ObjectToCharSequence(_a.Get((Object)("name_of_msme_building"))));
 //BA.debugLineNum = 133;BA.debugLine="tipp = a.Get(\"type_of_msme\")";
_tipp = BA.ObjectToString(_a.Get((Object)("type_of_msme")));
 //BA.debugLineNum = 134;BA.debugLine="tipname = a.Get(\"typems\")";
_tipname = BA.ObjectToString(_a.Get((Object)("typems")));
 //BA.debugLineNum = 136;BA.debugLine="StandingYear.Text = a.Get(\"standing_year\")";
mostCurrent._standingyear.setText(BA.ObjectToCharSequence(_a.Get((Object)("standing_year"))));
 //BA.debugLineNum = 137;BA.debugLine="BuildingArea.Text = a.Get(\"building_area\")";
mostCurrent._buildingarea.setText(BA.ObjectToCharSequence(_a.Get((Object)("building_area"))));
 //BA.debugLineNum = 138;BA.debugLine="LandArea.Text = a.Get(\"land_area\")";
mostCurrent._landarea.setText(BA.ObjectToCharSequence(_a.Get((Object)("land_area"))));
 //BA.debugLineNum = 139;BA.debugLine="ParkingArea.Text = a.Get(\"parking_area\")";
mostCurrent._parkingarea.setText(BA.ObjectToCharSequence(_a.Get((Object)("parking_area"))));
 //BA.debugLineNum = 140;BA.debugLine="Electricity.Text = a.Get(\"electricity_capacit";
mostCurrent._electricity.setText(BA.ObjectToCharSequence(_a.Get((Object)("electricity_capacity"))));
 //BA.debugLineNum = 141;BA.debugLine="cons = a.Get(\"type_of_construction\")";
_cons = BA.ObjectToString(_a.Get((Object)("type_of_construction")));
 //BA.debugLineNum = 142;BA.debugLine="consname = a.Get(\"constr\")";
_consname = BA.ObjectToString(_a.Get((Object)("constr")));
 }
};
 //BA.debugLineNum = 144;BA.debugLine="If StandingYear.Text == \"null\" Then";
if ((mostCurrent._standingyear.getText()).equals("null")) { 
 //BA.debugLineNum = 145;BA.debugLine="StandingYear.Text = \"0\"";
mostCurrent._standingyear.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 147;BA.debugLine="If BuildingArea.Text == \"null\" Then";
if ((mostCurrent._buildingarea.getText()).equals("null")) { 
 //BA.debugLineNum = 148;BA.debugLine="BuildingArea.Text = \"0\"";
mostCurrent._buildingarea.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 150;BA.debugLine="If ParkingArea.Text == \"null\" Then";
if ((mostCurrent._parkingarea.getText()).equals("null")) { 
 //BA.debugLineNum = 151;BA.debugLine="ParkingArea.Text = \"0\"";
mostCurrent._parkingarea.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 153;BA.debugLine="If Electricity.Text == \"null\" Then";
if ((mostCurrent._electricity.getText()).equals("null")) { 
 //BA.debugLineNum = 154;BA.debugLine="Electricity.Text = \"0\"";
mostCurrent._electricity.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 156;BA.debugLine="If LandArea.Text == \"null\" Then";
if ((mostCurrent._landarea.getText()).equals("null")) { 
 //BA.debugLineNum = 157;BA.debugLine="LandArea.Text = \"0\"";
mostCurrent._landarea.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 159;BA.debugLine="Log(\"Data jenis :\"&tipname)";
anywheresoftware.b4a.keywords.Common.Log("Data jenis :"+_tipname);
 //BA.debugLineNum = 160;BA.debugLine="Log(\"Data konstruksi :\"&consname)";
anywheresoftware.b4a.keywords.Common.Log("Data konstruksi :"+_consname);
 //BA.debugLineNum = 161;BA.debugLine="nama=MsmeName.Text";
_nama = mostCurrent._msmename.getText();
 //BA.debugLineNum = 162;BA.debugLine="tahun= StandingYear.Text";
_tahun = mostCurrent._standingyear.getText();
 //BA.debugLineNum = 163;BA.debugLine="ltanah= LandArea.Text";
_ltanah = mostCurrent._landarea.getText();
 //BA.debugLineNum = 164;BA.debugLine="lparkir= ParkingArea.Text";
_lparkir = mostCurrent._parkingarea.getText();
 //BA.debugLineNum = 165;BA.debugLine="lbangunan= BuildingArea.Text";
_lbangunan = mostCurrent._buildingarea.getText();
 //BA.debugLineNum = 166;BA.debugLine="listrik= Electricity.Text";
_listrik = mostCurrent._electricity.getText();
 //BA.debugLineNum = 167;BA.debugLine="TypeOfMsme.SelectedIndex = TypeOfMsme.IndexOf";
mostCurrent._typeofmsme.setSelectedIndex(mostCurrent._typeofmsme.IndexOf(_tipname));
 //BA.debugLineNum = 168;BA.debugLine="Construction.SelectedIndex = Construction.Ind";
mostCurrent._construction.setSelectedIndex(mostCurrent._construction.IndexOf(_consname));
 //BA.debugLineNum = 169;BA.debugLine="Log(\"SELECTED CONS : \"&Construction.SelectedI";
anywheresoftware.b4a.keywords.Common.Log("SELECTED CONS : "+BA.NumberToString(mostCurrent._construction.getSelectedIndex()));
 break; }
case 1: {
 //BA.debugLineNum = 171;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 172;BA.debugLine="Try";
try { //BA.debugLineNum = 173;BA.debugLine="Msgbox(\"Data has been updated! :)\",\"Success\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Data has been updated! :)"),BA.ObjectToCharSequence("Success"),mostCurrent.activityBA);
 //BA.debugLineNum = 174;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 } 
       catch (Exception e61) {
			processBA.setLastException(e61); //BA.debugLineNum = 176;BA.debugLine="Msgbox(\"Data can not be updated :(\" , \"error\"";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Data can not be updated :("),BA.ObjectToCharSequence("error"),mostCurrent.activityBA);
 };
 break; }
case 2: {
 //BA.debugLineNum = 180;BA.debugLine="Dim type_array As List";
_type_array = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 181;BA.debugLine="type_array = parser.NextArray";
_type_array = _parser.NextArray();
 //BA.debugLineNum = 182;BA.debugLine="For i=0 To type_array.Size -1";
{
final int step66 = 1;
final int limit66 = (int) (_type_array.getSize()-1);
_i = (int) (0) ;
for (;(step66 > 0 && _i <= limit66) || (step66 < 0 && _i >= limit66) ;_i = ((int)(0 + _i + step66))  ) {
 //BA.debugLineNum = 183;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 184;BA.debugLine="a = type_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_type_array.Get(_i)));
 //BA.debugLineNum = 185;BA.debugLine="Dim namatype, idtype As String";
_namatype = "";
_idtype = "";
 //BA.debugLineNum = 186;BA.debugLine="namatype= a.Get(\"name_of_type\")";
_namatype = BA.ObjectToString(_a.Get((Object)("name_of_type")));
 //BA.debugLineNum = 187;BA.debugLine="idtype = a.Get(\"type_id\")";
_idtype = BA.ObjectToString(_a.Get((Object)("type_id")));
 //BA.debugLineNum = 188;BA.debugLine="TypeOfMsme.Add(namatype)";
mostCurrent._typeofmsme.Add(_namatype);
 //BA.debugLineNum = 189;BA.debugLine="MsmeMap.Put(namatype,idtype)";
mostCurrent._msmemap.Put((Object)(_namatype),(Object)(_idtype));
 //BA.debugLineNum = 190;BA.debugLine="Log(\"ID Map: \"&namatype&\" \"&idtype)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_namatype+" "+_idtype);
 }
};
 break; }
case 3: {
 //BA.debugLineNum = 194;BA.debugLine="Dim cons_array As List";
_cons_array = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 195;BA.debugLine="cons_array = parser.NextArray";
_cons_array = _parser.NextArray();
 //BA.debugLineNum = 196;BA.debugLine="For j=0 To cons_array.Size -1";
{
final int step79 = 1;
final int limit79 = (int) (_cons_array.getSize()-1);
_j = (int) (0) ;
for (;(step79 > 0 && _j <= limit79) || (step79 < 0 && _j >= limit79) ;_j = ((int)(0 + _j + step79))  ) {
 //BA.debugLineNum = 197;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 198;BA.debugLine="a = cons_array.Get(j)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_cons_array.Get(_j)));
 //BA.debugLineNum = 199;BA.debugLine="Dim nama_type, id_type As String";
_nama_type = "";
_id_type = "";
 //BA.debugLineNum = 200;BA.debugLine="nama_type= a.Get(\"name_of_type\")";
_nama_type = BA.ObjectToString(_a.Get((Object)("name_of_type")));
 //BA.debugLineNum = 201;BA.debugLine="id_type = a.Get(\"type_id\")";
_id_type = BA.ObjectToString(_a.Get((Object)("type_id")));
 //BA.debugLineNum = 202;BA.debugLine="Construction.Add(nama_type)";
mostCurrent._construction.Add(_nama_type);
 //BA.debugLineNum = 203;BA.debugLine="ConsMap.Put(nama_type,id_type)";
mostCurrent._consmap.Put((Object)(_nama_type),(Object)(_id_type));
 //BA.debugLineNum = 204;BA.debugLine="Log(\"ID Map: \"&nama_type&\" \"&id_type)";
anywheresoftware.b4a.keywords.Common.Log("ID Map: "+_nama_type+" "+_id_type);
 }
};
 break; }
}
;
 };
 //BA.debugLineNum = 208;BA.debugLine="Job.Release";
_job._release();
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 10;BA.debugLine="Dim fasilitas, lat, lng As String";
_fasilitas = "";
_lat = "";
_lng = "";
 //BA.debugLineNum = 11;BA.debugLine="Dim quantity_fac As Int";
_quantity_fac = 0;
 //BA.debugLineNum = 12;BA.debugLine="Dim ids As String";
_ids = "";
 //BA.debugLineNum = 13;BA.debugLine="ids = \"\"";
_ids = "";
 //BA.debugLineNum = 14;BA.debugLine="Dim nama,tipe, jenis, tahun,ltanah,lparkir,lbangu";
_nama = "";
_tipe = "";
_jenis = "";
_tahun = "";
_ltanah = "";
_lparkir = "";
_lbangunan = "";
_listrik = "";
_kons = "";
 //BA.debugLineNum = 15;BA.debugLine="nama= \"\"";
_nama = "";
 //BA.debugLineNum = 16;BA.debugLine="tipe = \"\"";
_tipe = "";
 //BA.debugLineNum = 17;BA.debugLine="jenis= \"\"";
_jenis = "";
 //BA.debugLineNum = 18;BA.debugLine="Dim tipp,tipname,typemsme,cons,consname,typecons";
_tipp = "";
_tipname = "";
_typemsme = "";
_cons = "";
_consname = "";
_typecons = "";
 //BA.debugLineNum = 19;BA.debugLine="Dim tipe_i , jenis_i, lbangunan_i, lparkir_i,ltan";
_tipe_i = 0;
_jenis_i = 0;
_lbangunan_i = 0;
_lparkir_i = 0;
_ltanah_i = 0;
_listrik_i = 0;
_tahun_i = 0;
_cons_i = 0;
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public static String  _setbackgroundtintlist(anywheresoftware.b4a.objects.ConcreteViewWrapper _view,int _active,int _enabled) throws Exception{
int[][] _states = null;
int[] _color = null;
anywheresoftware.b4j.object.JavaObject _csl = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 96;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
 //BA.debugLineNum = 97;BA.debugLine="Dim States(2,1) As Int";
_states = new int[(int) (2)][];
{
int d0 = _states.length;
int d1 = (int) (1);
for (int i0 = 0;i0 < d0;i0++) {
_states[i0] = new int[d1];
}
}
;
 //BA.debugLineNum = 98;BA.debugLine="States(0,0) = 16842908     'Active";
_states[(int) (0)][(int) (0)] = (int) (16842908);
 //BA.debugLineNum = 99;BA.debugLine="States(1,0) = 16842910    'Enabled";
_states[(int) (1)][(int) (0)] = (int) (16842910);
 //BA.debugLineNum = 100;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
_color = new int[]{_active,_enabled};
 //BA.debugLineNum = 101;BA.debugLine="Dim CSL As JavaObject";
_csl = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 102;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
_csl.InitializeNewInstance("android.content.res.ColorStateList",new Object[]{(Object)(_states),(Object)(_color)});
 //BA.debugLineNum = 103;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 104;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
_jo.InitializeStatic("android.support.v4.view.ViewCompat");
 //BA.debugLineNum = 105;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
_jo.RunMethod("setBackgroundTintList",new Object[]{(Object)(_view.getObject()),(Object)(_csl.getObject())});
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public static String  _typeofmsme_itemclick(int _position,Object _value) throws Exception{
String _id = "";
 //BA.debugLineNum = 215;BA.debugLine="Sub TypeOfMsme_ItemClick (Position As Int, Value A";
 //BA.debugLineNum = 216;BA.debugLine="Dim id As String";
_id = "";
 //BA.debugLineNum = 217;BA.debugLine="id = MsmeMap.Get(Value)";
_id = BA.ObjectToString(mostCurrent._msmemap.Get(_value));
 //BA.debugLineNum = 218;BA.debugLine="typemsme = id";
_typemsme = _id;
 //BA.debugLineNum = 219;BA.debugLine="Log(typemsme)";
anywheresoftware.b4a.keywords.Common.Log(_typemsme);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return "";
}
}
