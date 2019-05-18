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

public class homeadmin extends Activity implements B4AActivity{
	public static homeadmin mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.homeadmin");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (homeadmin).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.homeadmin");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.homeadmin", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (homeadmin) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (homeadmin) Resume **");
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
		return homeadmin.class;
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
        BA.LogInfo("** Activity (homeadmin) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (homeadmin) Resume **");
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
public static String _addfac_clicked = "";
public b4a.example.arcmenu _menu = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _menubuttonstatic = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _menubuttonanimated = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelbackground = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelbar = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneltoolbar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlogout = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsearch = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _contentadmin = null;
public anywheresoftware.b4a.objects.HorizontalScrollViewWrapper _horizontalscrollview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label9 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label10 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label11 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label12 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label13 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label14 = null;
public anywheresoftware.b4a.objects.PanelWrapper _worshipbtn = null;
public anywheresoftware.b4a.objects.PanelWrapper _officebtn = null;
public anywheresoftware.b4a.objects.PanelWrapper _healthbtn = null;
public anywheresoftware.b4a.objects.PanelWrapper _educationbtn = null;
public anywheresoftware.b4a.objects.LabelWrapper _labellogout = null;
public anywheresoftware.b4a.objects.PanelWrapper _panellogout = null;
public anywheresoftware.b4a.objects.LabelWrapper _backarrow = null;
public anywheresoftware.b4a.objects.LabelWrapper _titlebar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnmap = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btninfo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button5 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button3 = null;
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
public static void  _activity_create(boolean _firsttime) throws Exception{
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(b4a.example.homeadmin parent,boolean _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
b4a.example.homeadmin parent;
boolean _firsttime;
boolean _islogin = false;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="homeadmin";
Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
if (true) return;
    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
parent.mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="ScrollView1.Panel.LoadLayout(\"HomeAdmin\")";
parent.mostCurrent._scrollview1.getPanel().LoadLayout("HomeAdmin",mostCurrent.activityBA);
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="HorizontalScrollView1.Panel.LoadLayout(\"AdminCont";
parent.mostCurrent._horizontalscrollview1.getPanel().LoadLayout("AdminContent",mostCurrent.activityBA);
RDebugUtils.currentLine=11468806;
 //BA.debugLineNum = 11468806;BA.debugLine="HorizontalScrollView1.Panel.Width = ContentAdmin.";
parent.mostCurrent._horizontalscrollview1.getPanel().setWidth((int) (parent.mostCurrent._contentadmin.getWidth()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA)));
RDebugUtils.currentLine=11468807;
 //BA.debugLineNum = 11468807;BA.debugLine="PanelBackground.Height = HorizontalScrollView1.To";
parent.mostCurrent._panelbackground.setHeight((int) (parent.mostCurrent._horizontalscrollview1.getTop()+parent.mostCurrent._horizontalscrollview1.getHeight()));
RDebugUtils.currentLine=11468808;
 //BA.debugLineNum = 11468808;BA.debugLine="ScrollView1.Panel.Height = PanelBackground.Height";
parent.mostCurrent._scrollview1.getPanel().setHeight((int) (parent.mostCurrent._panelbackground.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA)));
RDebugUtils.currentLine=11468809;
 //BA.debugLineNum = 11468809;BA.debugLine="BackArrow.Visible = False";
parent.mostCurrent._backarrow.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11468810;
 //BA.debugLineNum = 11468810;BA.debugLine="If BackArrow.Visible Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent._backarrow.getVisible()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=11468813;
 //BA.debugLineNum = 11468813;BA.debugLine="TitleBar.Left = 5%x";
parent.mostCurrent._titlebar.setLeft(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=11468816;
 //BA.debugLineNum = 11468816;BA.debugLine="Dim isLogin As Boolean";
_islogin = false;
RDebugUtils.currentLine=11468817;
 //BA.debugLineNum = 11468817;BA.debugLine="isLogin = Login.manager.GetBoolean(\"is_login\")";
_islogin = parent.mostCurrent._login._manager.GetBoolean("is_login");
RDebugUtils.currentLine=11468818;
 //BA.debugLineNum = 11468818;BA.debugLine="If isLogin Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_islogin) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=11468819;
 //BA.debugLineNum = 11468819;BA.debugLine="PanelLogout.Visible = True";
parent.mostCurrent._panellogout.setVisible(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=11468821;
 //BA.debugLineNum = 11468821;BA.debugLine="PanelLogout.Visible = False";
parent.mostCurrent._panellogout.setVisible(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;
;
RDebugUtils.currentLine=11468823;
 //BA.debugLineNum = 11468823;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";

case 12:
//if
this.state = 23;
if (parent.mostCurrent._starter._gps1.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 23;
RDebugUtils.currentLine=11468824;
 //BA.debugLineNum = 11468824;BA.debugLine="ToastMessageShow(\"Please enable the GPS device.\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please enable the GPS device."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=11468825;
 //BA.debugLineNum = 11468825;BA.debugLine="StartActivity(Starter.GPS1.LocationSettingsInten";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._starter._gps1.getLocationSettingsIntent()));
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=11468827;
 //BA.debugLineNum = 11468827;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
parent.mostCurrent._starter._rp.CheckAndRequest(processBA,parent.mostCurrent._starter._rp.PERMISSION_ACCESS_FINE_LOCATION);
RDebugUtils.currentLine=11468828;
 //BA.debugLineNum = 11468828;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, this, null);
this.state = 24;
return;
case 24:
//C
this.state = 17;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=11468829;
 //BA.debugLineNum = 11468829;BA.debugLine="If Result Then CallSubDelayed(Starter, \"StartGPS";
if (true) break;

case 17:
//if
this.state = 22;
if (_result) { 
this.state = 19;
;}if (true) break;

case 19:
//C
this.state = 22;
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._starter.getObject()),"StartGPS");
if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;

case 23:
//C
this.state = -1;
;
RDebugUtils.currentLine=11468831;
 //BA.debugLineNum = 11468831;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="homeadmin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress"))
	return (Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode});
boolean _islogin = false;
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Dim isLogin As Boolean";
_islogin = false;
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="isLogin = Login.manager.GetBoolean(\"is_login\")";
_islogin = mostCurrent._login._manager.GetBoolean("is_login");
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="Log(\"keyy: \"&KeyCodes.KEYCODE_BACK)";
anywheresoftware.b4a.keywords.Common.Log("keyy: "+BA.NumberToString(anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK));
RDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then  ' Back b";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=11796485;
 //BA.debugLineNum = 11796485;BA.debugLine="If File.Exists(Main.folder,\"datastore\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._main._folder,"datastore")) { 
RDebugUtils.currentLine=11796486;
 //BA.debugLineNum = 11796486;BA.debugLine="If Main.kvs.ContainsKey(\"role\")Then";
if (mostCurrent._main._kvs._containskey("role")) { 
RDebugUtils.currentLine=11796487;
 //BA.debugLineNum = 11796487;BA.debugLine="StopService(Starter)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._starter.getObject()));
RDebugUtils.currentLine=11796488;
 //BA.debugLineNum = 11796488;BA.debugLine="Main.ShouldIClose = True";
mostCurrent._main._shouldiclose = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=11796489;
 //BA.debugLineNum = 11796489;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 };
 };
RDebugUtils.currentLine=11796493;
 //BA.debugLineNum = 11796493;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="homeadmin";
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="homeadmin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="ExecuteRemoteQuery(\"SELECT COUNT(*) FROM house_bu";
_executeremotequery("SELECT COUNT(*) FROM house_building","CountHouse");
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="ExecuteRemoteQuery(\"SELECT COUNT(*) FROM office_b";
_executeremotequery("SELECT COUNT(*) FROM office_building","CountOffice");
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="ExecuteRemoteQuery(\"SELECT COUNT(*) FROM msme_bui";
_executeremotequery("SELECT COUNT(*) FROM msme_building","CountMsme");
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="ExecuteRemoteQuery(\"SELECT COUNT(*) FROM educatio";
_executeremotequery("SELECT COUNT(*) FROM educational_building","CountEducation");
RDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="ExecuteRemoteQuery(\"SELECT COUNT(*) FROM health_b";
_executeremotequery("SELECT COUNT(*) FROM health_building","CountHealth");
RDebugUtils.currentLine=11534342;
 //BA.debugLineNum = 11534342;BA.debugLine="ExecuteRemoteQuery(\"SELECT COUNT(*) FROM worship_";
_executeremotequery("SELECT COUNT(*) FROM worship_building","CountWorship");
RDebugUtils.currentLine=11534343;
 //BA.debugLineNum = 11534343;BA.debugLine="If File.Exists(Main.folder,\"datastore\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._main._folder,"datastore")) { 
RDebugUtils.currentLine=11534344;
 //BA.debugLineNum = 11534344;BA.debugLine="If Main.kvs.ContainsKey(\"role\") == True Then";
if (mostCurrent._main._kvs._containskey("role")==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=11534345;
 //BA.debugLineNum = 11534345;BA.debugLine="Log(\"DISINI :\"&Main.kvs.Get(\"username\"))";
anywheresoftware.b4a.keywords.Common.Log("DISINI :"+BA.ObjectToString(mostCurrent._main._kvs._get("username")));
RDebugUtils.currentLine=11534346;
 //BA.debugLineNum = 11534346;BA.debugLine="Label1.Text =\"Welcome, \"&Main.kvs.Get(\"username";
mostCurrent._label1.setText(BA.ObjectToCharSequence("Welcome, "+BA.ObjectToString(mostCurrent._main._kvs._get("username"))+""));
 };
 };
RDebugUtils.currentLine=11534350;
 //BA.debugLineNum = 11534350;BA.debugLine="End Sub";
return "";
}
public static String  _executeremotequery(String _query,String _jobname) throws Exception{
RDebugUtils.currentModule="homeadmin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "executeremotequery"))
	return (String) Debug.delegate(mostCurrent.activityBA, "executeremotequery", new Object[] {_query,_jobname});
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="Job.Initialize(JobName, Me)";
_job._initialize(processBA,_jobname,homeadmin.getObject());
RDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="Job.PostString(\"\"&Main.Server&\"mobile/json.php\",";
_job._poststring(""+mostCurrent._main._server+"mobile/json.php",_query);
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="End Sub";
return "";
}
public static String  _btninfo_click() throws Exception{
RDebugUtils.currentModule="homeadmin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btninfo_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btninfo_click", null);
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Sub BtnInfo_Click";
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="End Sub";
return "";
}
public static String  _btnlogout_click() throws Exception{
RDebugUtils.currentModule="homeadmin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlogout_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnlogout_click", null);
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Sub BtnLogout_Click";
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="Login.manager.SetBoolean(\"is_login\", False)";
mostCurrent._login._manager.SetBoolean("is_login",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11862021;
 //BA.debugLineNum = 11862021;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
RDebugUtils.currentLine=11862022;
 //BA.debugLineNum = 11862022;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=11862023;
 //BA.debugLineNum = 11862023;BA.debugLine="ToastMessageShow(\"Logout berhasil\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Logout berhasil"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11862024;
 //BA.debugLineNum = 11862024;BA.debugLine="Main.kvs.Remove(\"username\")";
mostCurrent._main._kvs._remove("username");
RDebugUtils.currentLine=11862025;
 //BA.debugLineNum = 11862025;BA.debugLine="Main.kvs.Remove(\"role\")";
mostCurrent._main._kvs._remove("role");
RDebugUtils.currentLine=11862027;
 //BA.debugLineNum = 11862027;BA.debugLine="End Sub";
return "";
}
public static String  _btnmap_click() throws Exception{
RDebugUtils.currentModule="homeadmin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnmap_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnmap_click", null);
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Sub BtnMap_Click";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="StartActivity(ManualPosition)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._manualposition.getObject()));
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="End Sub";
return "";
}
public static String  _btnsearch_click() throws Exception{
RDebugUtils.currentModule="homeadmin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsearch_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnsearch_click", null);
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Sub BtnSearch_Click";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="StartActivity(SearchBuilding)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._searchbuilding.getObject()));
RDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
RDebugUtils.currentModule="homeadmin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button1_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button1_click", null);
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Sub Button1_Click";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="AddFac_clicked = \"Worship\"";
_addfac_clicked = "Worship";
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="StartActivity(AddFacilityType)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._addfacilitytype.getObject()));
RDebugUtils.currentLine=12451843;
 //BA.debugLineNum = 12451843;BA.debugLine="End Sub";
return "";
}
public static String  _button2_click() throws Exception{
RDebugUtils.currentModule="homeadmin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button2_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button2_click", null);
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Sub Button2_Click";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="AddFac_clicked = \"Office\"";
_addfac_clicked = "Office";
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="StartActivity(AddFacilityType)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._addfacilitytype.getObject()));
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="End Sub";
return "";
}
public static String  _button3_click() throws Exception{
RDebugUtils.currentModule="homeadmin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button3_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button3_click", null);
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Sub Button3_Click";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="AddFac_clicked = \"Educational\"";
_addfac_clicked = "Educational";
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="StartActivity(AddFacilityType)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._addfacilitytype.getObject()));
RDebugUtils.currentLine=12713987;
 //BA.debugLineNum = 12713987;BA.debugLine="End Sub";
return "";
}
public static String  _button4_click() throws Exception{
RDebugUtils.currentModule="homeadmin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button4_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button4_click", null);
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Sub Button4_Click";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="AddFac_clicked = \"Health\"";
_addfac_clicked = "Health";
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="StartActivity(AddFacilityType)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._addfacilitytype.getObject()));
RDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="End Sub";
return "";
}
public static String  _button5_click() throws Exception{
RDebugUtils.currentModule="homeadmin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button5_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button5_click", null);
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Sub Button5_Click";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="AddFac_clicked = \"Msme\"";
_addfac_clicked = "Msme";
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="StartActivity(AddFacilityType)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._addfacilitytype.getObject()));
RDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="End Sub";
return "";
}
public static String  _educationbtn_click() throws Exception{
RDebugUtils.currentModule="homeadmin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "educationbtn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "educationbtn_click", null);
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Sub EducationBtn_Click";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="StartActivity(EducationalBuilding)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._educationalbuilding.getObject()));
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="End Sub";
return "";
}
public static String  _healthbtn_click() throws Exception{
RDebugUtils.currentModule="homeadmin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "healthbtn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "healthbtn_click", null);
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Sub HealthBtn_Click";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="StartActivity(HealthBuilding)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._healthbuilding.getObject()));
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="homeadmin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _data_array = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _a = null;
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="Log(\"Response from server :\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server :"+_res);
RDebugUtils.currentLine=11730949;
 //BA.debugLineNum = 11730949;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=11730950;
 //BA.debugLineNum = 11730950;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=11730951;
 //BA.debugLineNum = 11730951;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"CountHouse","CountOffice","CountWorship","CountMsme","CountEducation","CountHealth")) {
case 0: {
RDebugUtils.currentLine=11730953;
 //BA.debugLineNum = 11730953;BA.debugLine="Dim data_array As List";
_data_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11730954;
 //BA.debugLineNum = 11730954;BA.debugLine="data_array = parser.NextArray";
_data_array = _parser.NextArray();
RDebugUtils.currentLine=11730955;
 //BA.debugLineNum = 11730955;BA.debugLine="If data_array.Size > 0 Then";
if (_data_array.getSize()>0) { 
RDebugUtils.currentLine=11730956;
 //BA.debugLineNum = 11730956;BA.debugLine="For i=0 To data_array.Size - 1";
{
final int step12 = 1;
final int limit12 = (int) (_data_array.getSize()-1);
_i = (int) (0) ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
RDebugUtils.currentLine=11730957;
 //BA.debugLineNum = 11730957;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11730958;
 //BA.debugLineNum = 11730958;BA.debugLine="a = data_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_data_array.Get(_i)));
RDebugUtils.currentLine=11730960;
 //BA.debugLineNum = 11730960;BA.debugLine="Label9.Text = a.Get(\"count\")";
mostCurrent._label9.setText(BA.ObjectToCharSequence(_a.Get((Object)("count"))));
RDebugUtils.currentLine=11730961;
 //BA.debugLineNum = 11730961;BA.debugLine="Log(a.Get(\"count\"))";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_a.Get((Object)("count"))));
 }
};
 };
 break; }
case 1: {
RDebugUtils.currentLine=11730965;
 //BA.debugLineNum = 11730965;BA.debugLine="Dim data_array As List";
_data_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11730966;
 //BA.debugLineNum = 11730966;BA.debugLine="data_array = parser.NextArray";
_data_array = _parser.NextArray();
RDebugUtils.currentLine=11730967;
 //BA.debugLineNum = 11730967;BA.debugLine="If data_array.Size > 0 Then";
if (_data_array.getSize()>0) { 
RDebugUtils.currentLine=11730968;
 //BA.debugLineNum = 11730968;BA.debugLine="For i=0 To data_array.Size - 1";
{
final int step23 = 1;
final int limit23 = (int) (_data_array.getSize()-1);
_i = (int) (0) ;
for (;(step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23) ;_i = ((int)(0 + _i + step23))  ) {
RDebugUtils.currentLine=11730969;
 //BA.debugLineNum = 11730969;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11730970;
 //BA.debugLineNum = 11730970;BA.debugLine="a = data_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_data_array.Get(_i)));
RDebugUtils.currentLine=11730972;
 //BA.debugLineNum = 11730972;BA.debugLine="Label11.Text = a.Get(\"count\")";
mostCurrent._label11.setText(BA.ObjectToCharSequence(_a.Get((Object)("count"))));
RDebugUtils.currentLine=11730973;
 //BA.debugLineNum = 11730973;BA.debugLine="Log(a.Get(\"count\"))";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_a.Get((Object)("count"))));
 }
};
 };
 break; }
case 2: {
RDebugUtils.currentLine=11730977;
 //BA.debugLineNum = 11730977;BA.debugLine="Dim data_array As List";
_data_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11730978;
 //BA.debugLineNum = 11730978;BA.debugLine="data_array = parser.NextArray";
_data_array = _parser.NextArray();
RDebugUtils.currentLine=11730979;
 //BA.debugLineNum = 11730979;BA.debugLine="If data_array.Size > 0 Then";
if (_data_array.getSize()>0) { 
RDebugUtils.currentLine=11730980;
 //BA.debugLineNum = 11730980;BA.debugLine="For i=0 To data_array.Size - 1";
{
final int step34 = 1;
final int limit34 = (int) (_data_array.getSize()-1);
_i = (int) (0) ;
for (;(step34 > 0 && _i <= limit34) || (step34 < 0 && _i >= limit34) ;_i = ((int)(0 + _i + step34))  ) {
RDebugUtils.currentLine=11730981;
 //BA.debugLineNum = 11730981;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11730982;
 //BA.debugLineNum = 11730982;BA.debugLine="a = data_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_data_array.Get(_i)));
RDebugUtils.currentLine=11730984;
 //BA.debugLineNum = 11730984;BA.debugLine="Label10.Text = a.Get(\"count\")";
mostCurrent._label10.setText(BA.ObjectToCharSequence(_a.Get((Object)("count"))));
RDebugUtils.currentLine=11730985;
 //BA.debugLineNum = 11730985;BA.debugLine="Log(a.Get(\"count\"))";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_a.Get((Object)("count"))));
 }
};
 };
 break; }
case 3: {
RDebugUtils.currentLine=11730989;
 //BA.debugLineNum = 11730989;BA.debugLine="Dim data_array As List";
_data_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11730990;
 //BA.debugLineNum = 11730990;BA.debugLine="data_array = parser.NextArray";
_data_array = _parser.NextArray();
RDebugUtils.currentLine=11730991;
 //BA.debugLineNum = 11730991;BA.debugLine="If data_array.Size > 0 Then";
if (_data_array.getSize()>0) { 
RDebugUtils.currentLine=11730992;
 //BA.debugLineNum = 11730992;BA.debugLine="For i=0 To data_array.Size - 1";
{
final int step45 = 1;
final int limit45 = (int) (_data_array.getSize()-1);
_i = (int) (0) ;
for (;(step45 > 0 && _i <= limit45) || (step45 < 0 && _i >= limit45) ;_i = ((int)(0 + _i + step45))  ) {
RDebugUtils.currentLine=11730993;
 //BA.debugLineNum = 11730993;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11730994;
 //BA.debugLineNum = 11730994;BA.debugLine="a = data_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_data_array.Get(_i)));
RDebugUtils.currentLine=11730996;
 //BA.debugLineNum = 11730996;BA.debugLine="Label13.Text = a.Get(\"count\")";
mostCurrent._label13.setText(BA.ObjectToCharSequence(_a.Get((Object)("count"))));
RDebugUtils.currentLine=11730997;
 //BA.debugLineNum = 11730997;BA.debugLine="Log(a.Get(\"count\"))";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_a.Get((Object)("count"))));
 }
};
 };
 break; }
case 4: {
RDebugUtils.currentLine=11731001;
 //BA.debugLineNum = 11731001;BA.debugLine="Dim data_array As List";
_data_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11731002;
 //BA.debugLineNum = 11731002;BA.debugLine="data_array = parser.NextArray";
_data_array = _parser.NextArray();
RDebugUtils.currentLine=11731003;
 //BA.debugLineNum = 11731003;BA.debugLine="If data_array.Size > 0 Then";
if (_data_array.getSize()>0) { 
RDebugUtils.currentLine=11731004;
 //BA.debugLineNum = 11731004;BA.debugLine="For i=0 To data_array.Size - 1";
{
final int step56 = 1;
final int limit56 = (int) (_data_array.getSize()-1);
_i = (int) (0) ;
for (;(step56 > 0 && _i <= limit56) || (step56 < 0 && _i >= limit56) ;_i = ((int)(0 + _i + step56))  ) {
RDebugUtils.currentLine=11731005;
 //BA.debugLineNum = 11731005;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11731006;
 //BA.debugLineNum = 11731006;BA.debugLine="a = data_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_data_array.Get(_i)));
RDebugUtils.currentLine=11731008;
 //BA.debugLineNum = 11731008;BA.debugLine="Label12.Text = a.Get(\"count\")";
mostCurrent._label12.setText(BA.ObjectToCharSequence(_a.Get((Object)("count"))));
RDebugUtils.currentLine=11731009;
 //BA.debugLineNum = 11731009;BA.debugLine="Log(a.Get(\"count\"))";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_a.Get((Object)("count"))));
 }
};
 };
 break; }
case 5: {
RDebugUtils.currentLine=11731013;
 //BA.debugLineNum = 11731013;BA.debugLine="Dim data_array As List";
_data_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11731014;
 //BA.debugLineNum = 11731014;BA.debugLine="data_array = parser.NextArray";
_data_array = _parser.NextArray();
RDebugUtils.currentLine=11731015;
 //BA.debugLineNum = 11731015;BA.debugLine="If data_array.Size > 0 Then";
if (_data_array.getSize()>0) { 
RDebugUtils.currentLine=11731016;
 //BA.debugLineNum = 11731016;BA.debugLine="For i=0 To data_array.Size - 1";
{
final int step67 = 1;
final int limit67 = (int) (_data_array.getSize()-1);
_i = (int) (0) ;
for (;(step67 > 0 && _i <= limit67) || (step67 < 0 && _i >= limit67) ;_i = ((int)(0 + _i + step67))  ) {
RDebugUtils.currentLine=11731017;
 //BA.debugLineNum = 11731017;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11731018;
 //BA.debugLineNum = 11731018;BA.debugLine="a = data_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_data_array.Get(_i)));
RDebugUtils.currentLine=11731020;
 //BA.debugLineNum = 11731020;BA.debugLine="Label14.Text = a.Get(\"count\")";
mostCurrent._label14.setText(BA.ObjectToCharSequence(_a.Get((Object)("count"))));
RDebugUtils.currentLine=11731021;
 //BA.debugLineNum = 11731021;BA.debugLine="Log(a.Get(\"count\"))";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_a.Get((Object)("count"))));
 }
};
 };
 break; }
}
;
 };
RDebugUtils.currentLine=11731026;
 //BA.debugLineNum = 11731026;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=11731027;
 //BA.debugLineNum = 11731027;BA.debugLine="End Sub";
return "";
}
public static String  _labellogout_click() throws Exception{
RDebugUtils.currentModule="homeadmin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labellogout_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "labellogout_click", null);
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Sub Labellogout_Click";
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="Login.manager.SetBoolean(\"is_login\", False)";
mostCurrent._login._manager.SetBoolean("is_login",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12255238;
 //BA.debugLineNum = 12255238;BA.debugLine="ToastMessageShow(\"Logout berhasil\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Logout berhasil"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12255239;
 //BA.debugLineNum = 12255239;BA.debugLine="Main.kvs.Remove(\"username\")";
mostCurrent._main._kvs._remove("username");
RDebugUtils.currentLine=12255240;
 //BA.debugLineNum = 12255240;BA.debugLine="Main.kvs.Remove(\"role\")";
mostCurrent._main._kvs._remove("role");
RDebugUtils.currentLine=12255241;
 //BA.debugLineNum = 12255241;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=12255242;
 //BA.debugLineNum = 12255242;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
RDebugUtils.currentLine=12255244;
 //BA.debugLineNum = 12255244;BA.debugLine="End Sub";
return "";
}
public static String  _officebtn_click() throws Exception{
RDebugUtils.currentModule="homeadmin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "officebtn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "officebtn_click", null);
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Sub OfficeBtn_Click";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="StartActivity(OfficeBuilding)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._officebuilding.getObject()));
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="End Sub";
return "";
}
public static String  _worshipbtn_click() throws Exception{
RDebugUtils.currentModule="homeadmin";
if (Debug.shouldDelegate(mostCurrent.activityBA, "worshipbtn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "worshipbtn_click", null);
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Sub WorshipBtn_Click";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="StartActivity(WorshipBuilding)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._worshipbuilding.getObject()));
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="End Sub";
return "";
}
}