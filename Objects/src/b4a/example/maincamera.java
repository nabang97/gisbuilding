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

public class maincamera extends Activity implements B4AActivity{
	public static maincamera mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.maincamera");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (maincamera).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.maincamera");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.maincamera", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (maincamera) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (maincamera) Resume **");
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
		return maincamera.class;
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
        BA.LogInfo("** Activity (maincamera) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (maincamera) Resume **");
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
public static boolean _frontcamera = false;
public static boolean _videomode = false;
public static String _videofiledir = "";
public static String _videofilename = "";
public static int _mytaskindex = 0;
public static anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public b4a.example.camex2 _cam = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlcamera = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlpicture = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlbackground = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btneffects = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnscene = null;
public anywheresoftware.b4a.objects.collections.List _buttons = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnautoexposure = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnfocus = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _progressbar1 = null;
public static boolean _openstate = false;
public static boolean _busystate = false;
public anywheresoftware.b4a.objects.ButtonWrapper _btnrecord = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnmode = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncamera = null;
public anywheresoftware.b4a.objects.SeekBarWrapper _barzoom = null;
public anywheresoftware.b4a.objects.ButtonWrapper _saveimgbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _cancelsavebtn = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.editbuildingfacility _editbuildingfacility = null;
public b4a.example.addbuildingfacility _addbuildingfacility = null;
public b4a.example.educationaledit _educationaledit = null;
public b4a.example.educationaldetail _educationaldetail = null;
public b4a.example.searchbuilding _searchbuilding = null;
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
 //BA.debugLineNum = 38;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 39;BA.debugLine="VideoFileDir = rp.GetSafeDirDefaultExternal(\"\")";
_videofiledir = _rp.GetSafeDirDefaultExternal("");
 //BA.debugLineNum = 40;BA.debugLine="VideoFileName = \"1.mp4\"";
_videofilename = "1.mp4";
 //BA.debugLineNum = 41;BA.debugLine="Activity.LoadLayout(\"1\")";
mostCurrent._activity.LoadLayout("1",mostCurrent.activityBA);
 //BA.debugLineNum = 42;BA.debugLine="Activity.LoadLayout(\"StillPicture\")";
mostCurrent._activity.LoadLayout("StillPicture",mostCurrent.activityBA);
 //BA.debugLineNum = 43;BA.debugLine="cam.Initialize(pnlCamera)";
mostCurrent._cam._initialize(mostCurrent.activityBA,mostCurrent._pnlcamera);
 //BA.debugLineNum = 44;BA.debugLine="Log(cam.SupportedHardwareLevel)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._cam._getsupportedhardwarelevel());
 //BA.debugLineNum = 45;BA.debugLine="buttons = Array(btnScene, btnAutoExposure, btnEff";
mostCurrent._buttons = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(mostCurrent._btnscene.getObject()),(Object)(mostCurrent._btnautoexposure.getObject()),(Object)(mostCurrent._btneffects.getObject()),(Object)(mostCurrent._btnfocus.getObject()),(Object)(mostCurrent._btnmode.getObject())});
 //BA.debugLineNum = 46;BA.debugLine="SetState(False, False, VideoMode)";
_setstate(anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,_videomode);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 97;BA.debugLine="cam.Stop";
mostCurrent._cam._stop();
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 50;BA.debugLine="OpenCamera(frontCamera)";
_opencamera(_frontcamera);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public static String  _barzoom_valuechanged(int _value,boolean _userchanged) throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _originalsize = null;
float _zoom = 0f;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _crop = null;
int _newwidth = 0;
int _newheight = 0;
 //BA.debugLineNum = 231;BA.debugLine="Sub barZoom_ValueChanged (Value As Int, UserChange";
 //BA.debugLineNum = 232;BA.debugLine="Dim OriginalSize As Rect = cam.ActiveArraySize";
_originalsize = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
_originalsize = mostCurrent._cam._getactivearraysize();
 //BA.debugLineNum = 233;BA.debugLine="Dim Zoom As Float = 1 + Value / 100 * (cam.MaxDig";
_zoom = (float) (1+_value/(double)100*(mostCurrent._cam._getmaxdigitalzoom()-1));
 //BA.debugLineNum = 234;BA.debugLine="Dim Crop As Rect";
_crop = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
 //BA.debugLineNum = 235;BA.debugLine="Dim NewWidth As Int = OriginalSize.Width / Zoom";
_newwidth = (int) (_originalsize.getWidth()/(double)_zoom);
 //BA.debugLineNum = 236;BA.debugLine="Dim NewHeight As Int = OriginalSize.Height / Zoom";
_newheight = (int) (_originalsize.getHeight()/(double)_zoom);
 //BA.debugLineNum = 237;BA.debugLine="Crop.Initialize(OriginalSize.CenterX - NewWidth /";
_crop.Initialize((int) (_originalsize.getCenterX()-_newwidth/(double)2),(int) (_originalsize.getCenterY()-_newheight/(double)2),(int) (_originalsize.getCenterX()+_newwidth/(double)2),(int) (_originalsize.getCenterY()+_newheight/(double)2));
 //BA.debugLineNum = 239;BA.debugLine="cam.PreviewCropRegion = Crop";
mostCurrent._cam._setpreviewcropregion(_crop);
 //BA.debugLineNum = 240;BA.debugLine="cam.StartPreview(MyTaskIndex, VideoMode)";
mostCurrent._cam._startpreview(_mytaskindex,_videomode);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return "";
}
public static String  _btnautoexposure_click() throws Exception{
anywheresoftware.b4a.objects.collections.List _flashes = null;
int _i = 0;
 //BA.debugLineNum = 188;BA.debugLine="Sub btnAutoExposure_Click";
 //BA.debugLineNum = 189;BA.debugLine="Dim flashes As List = cam.SupportedAutoExposureMo";
_flashes = new anywheresoftware.b4a.objects.collections.List();
_flashes = mostCurrent._cam._getsupportedautoexposuremodes();
 //BA.debugLineNum = 190;BA.debugLine="Dim i As Int = flashes.IndexOf(cam.AutoExposureMo";
_i = _flashes.IndexOf((Object)(mostCurrent._cam._getautoexposuremode()));
 //BA.debugLineNum = 191;BA.debugLine="i = (i + 1) Mod flashes.Size";
_i = (int) ((_i+1)%_flashes.getSize());
 //BA.debugLineNum = 192;BA.debugLine="cam.AutoExposureMode = flashes.Get(i)";
mostCurrent._cam._setautoexposuremode(BA.ObjectToString(_flashes.Get(_i)));
 //BA.debugLineNum = 193;BA.debugLine="btnAutoExposure.Text = flashes.Get(i)";
mostCurrent._btnautoexposure.setText(BA.ObjectToCharSequence(_flashes.Get(_i)));
 //BA.debugLineNum = 194;BA.debugLine="cam.StartPreview(MyTaskIndex, VideoMode)";
mostCurrent._cam._startpreview(_mytaskindex,_videomode);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return "";
}
public static String  _btncamera_click() throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub btnCamera_Click";
 //BA.debugLineNum = 92;BA.debugLine="frontCamera = Not(frontCamera)";
_frontcamera = anywheresoftware.b4a.keywords.Common.Not(_frontcamera);
 //BA.debugLineNum = 93;BA.debugLine="OpenCamera(frontCamera)";
_opencamera(_frontcamera);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public static String  _btneffects_click() throws Exception{
anywheresoftware.b4a.objects.collections.List _effects = null;
int _i = 0;
 //BA.debugLineNum = 170;BA.debugLine="Sub btnEffects_Click";
 //BA.debugLineNum = 171;BA.debugLine="Dim effects As List = cam.SupportedEffectModes";
_effects = new anywheresoftware.b4a.objects.collections.List();
_effects = mostCurrent._cam._getsupportedeffectmodes();
 //BA.debugLineNum = 172;BA.debugLine="Dim i As Int = effects.IndexOf(cam.EffectMode)";
_i = _effects.IndexOf((Object)(mostCurrent._cam._geteffectmode()));
 //BA.debugLineNum = 173;BA.debugLine="i = (i + 1) Mod effects.Size";
_i = (int) ((_i+1)%_effects.getSize());
 //BA.debugLineNum = 174;BA.debugLine="cam.EffectMode = effects.Get(i)";
mostCurrent._cam._seteffectmode(BA.ObjectToString(_effects.Get(_i)));
 //BA.debugLineNum = 175;BA.debugLine="btnEffects.Text = effects.Get(i)";
mostCurrent._btneffects.setText(BA.ObjectToCharSequence(_effects.Get(_i)));
 //BA.debugLineNum = 176;BA.debugLine="cam.StartPreview(MyTaskIndex, VideoMode)";
mostCurrent._cam._startpreview(_mytaskindex,_videomode);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return "";
}
public static String  _btnfocus_click() throws Exception{
anywheresoftware.b4a.objects.collections.List _focuses = null;
int _i = 0;
 //BA.debugLineNum = 197;BA.debugLine="Sub btnFocus_Click";
 //BA.debugLineNum = 198;BA.debugLine="Dim focuses As List = cam.SupportedFocusModes";
_focuses = new anywheresoftware.b4a.objects.collections.List();
_focuses = mostCurrent._cam._getsupportedfocusmodes();
 //BA.debugLineNum = 199;BA.debugLine="Dim i As Int = focuses.IndexOf(cam.FocusMode)";
_i = _focuses.IndexOf((Object)(mostCurrent._cam._getfocusmode()));
 //BA.debugLineNum = 200;BA.debugLine="i = (i + 1) Mod focuses.Size";
_i = (int) ((_i+1)%_focuses.getSize());
 //BA.debugLineNum = 201;BA.debugLine="cam.FocusMode = focuses.Get(i)";
mostCurrent._cam._setfocusmode(BA.ObjectToString(_focuses.Get(_i)));
 //BA.debugLineNum = 202;BA.debugLine="btnFocus.Text = focuses.Get(i)";
mostCurrent._btnfocus.setText(BA.ObjectToCharSequence(_focuses.Get(_i)));
 //BA.debugLineNum = 203;BA.debugLine="cam.StartPreview(MyTaskIndex, VideoMode)";
mostCurrent._cam._startpreview(_mytaskindex,_videomode);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return "";
}
public static void  _btnmode_click() throws Exception{
ResumableSub_btnMode_Click rsub = new ResumableSub_btnMode_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnMode_Click extends BA.ResumableSub {
public ResumableSub_btnMode_Click(b4a.example.maincamera parent) {
this.parent = parent;
}
b4a.example.maincamera parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 101;BA.debugLine="VideoMode = Not(VideoMode)";
parent._videomode = anywheresoftware.b4a.keywords.Common.Not(parent._videomode);
 //BA.debugLineNum = 102;BA.debugLine="If VideoMode Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent._videomode) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 103;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_RECORD_AUDIO)";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_RECORD_AUDIO);
 //BA.debugLineNum = 104;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, this, null);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 //BA.debugLineNum = 105;BA.debugLine="If Result = False Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_result==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 106;BA.debugLine="ToastMessageShow(\"No permission!\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No permission!"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 107;BA.debugLine="VideoMode = False";
parent._videomode = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 110;BA.debugLine="SetState(openstate, busystate, VideoMode)";
_setstate(parent._openstate,parent._busystate,parent._videomode);
 //BA.debugLineNum = 111;BA.debugLine="PrepareSurface";
_preparesurface();
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _activity_permissionresult(String _permission,boolean _result) throws Exception{
}
public static String  _btnrecord_click() throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub btnRecord_Click";
 //BA.debugLineNum = 115;BA.debugLine="If VideoMode Then";
if (_videomode) { 
 //BA.debugLineNum = 116;BA.debugLine="CaptureVideo";
_capturevideo();
 }else {
 //BA.debugLineNum = 118;BA.debugLine="TakePicture";
_takepicture();
 };
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public static String  _btnscene_click() throws Exception{
anywheresoftware.b4a.objects.collections.List _scenes = null;
int _i = 0;
 //BA.debugLineNum = 179;BA.debugLine="Sub btnScene_Click";
 //BA.debugLineNum = 180;BA.debugLine="Dim scenes As List = cam.SupportedSceneModes";
_scenes = new anywheresoftware.b4a.objects.collections.List();
_scenes = mostCurrent._cam._getsupportedscenemodes();
 //BA.debugLineNum = 181;BA.debugLine="Dim i As Int = scenes.IndexOf(cam.SceneMode)";
_i = _scenes.IndexOf((Object)(mostCurrent._cam._getscenemode()));
 //BA.debugLineNum = 182;BA.debugLine="i = (i + 1) Mod scenes.Size";
_i = (int) ((_i+1)%_scenes.getSize());
 //BA.debugLineNum = 183;BA.debugLine="cam.SceneMode = scenes.Get(i)";
mostCurrent._cam._setscenemode(BA.ObjectToString(_scenes.Get(_i)));
 //BA.debugLineNum = 184;BA.debugLine="btnScene.Text = scenes.Get(i)";
mostCurrent._btnscene.setText(BA.ObjectToCharSequence(_scenes.Get(_i)));
 //BA.debugLineNum = 185;BA.debugLine="cam.StartPreview(MyTaskIndex, VideoMode)";
mostCurrent._cam._startpreview(_mytaskindex,_videomode);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return "";
}
public static String  _cancelsavebtn_click() throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub CancelSaveBtn_Click";
 //BA.debugLineNum = 255;BA.debugLine="pnlBackground.Visible = False";
mostCurrent._pnlbackground.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return "";
}
public static void  _capturevideo() throws Exception{
ResumableSub_CaptureVideo rsub = new ResumableSub_CaptureVideo(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CaptureVideo extends BA.ResumableSub {
public ResumableSub_CaptureVideo(b4a.example.maincamera parent) {
this.parent = parent;
}
b4a.example.maincamera parent;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 123;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 //BA.debugLineNum = 124;BA.debugLine="SetState(openstate, True, VideoMode)";
_setstate(parent._openstate,anywheresoftware.b4a.keywords.Common.True,parent._videomode);
 //BA.debugLineNum = 125;BA.debugLine="If cam.RecordingVideo = False Then";
if (true) break;

case 4:
//if
this.state = 9;
if (parent.mostCurrent._cam._recordingvideo==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 126;BA.debugLine="cam.StartVideoRecording (MyTaskIndex)";
parent.mostCurrent._cam._startvideorecording(parent._mytaskindex);
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 128;BA.debugLine="cam.StopVideoRecording (MyTaskIndex)";
parent.mostCurrent._cam._stopvideorecording(parent._mytaskindex);
 //BA.debugLineNum = 129;BA.debugLine="File.Copy(VideoFileDir, \"temp-\" & VideoFileName";
anywheresoftware.b4a.keywords.Common.File.Copy(parent._videofiledir,"temp-"+parent._videofilename,parent._videofiledir,parent._videofilename);
 //BA.debugLineNum = 130;BA.debugLine="ToastMessageShow($\"Video file saved: $1.2{File.";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(("Video file saved: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.2",(Object)(anywheresoftware.b4a.keywords.Common.File.Size(parent._videofiledir,parent._videofilename)/(double)1024/(double)1024))+" MB")),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 131;BA.debugLine="Wait For (PrepareSurface) Complete (Success As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _preparesurface());
this.state = 13;
return;
case 13:
//C
this.state = 9;
_success = (Boolean) result[0];
;
 //BA.debugLineNum = 132;BA.debugLine="SetState(openstate, False, VideoMode)";
_setstate(parent._openstate,anywheresoftware.b4a.keywords.Common.False,parent._videomode);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 //BA.debugLineNum = 136;BA.debugLine="HandleError(LastException)";
_handleerror(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static void  _complete(boolean _success) throws Exception{
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private cam As CamEx2";
mostCurrent._cam = new b4a.example.camex2();
 //BA.debugLineNum = 20;BA.debugLine="Private pnlCamera As Panel";
mostCurrent._pnlcamera = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private pnlPicture As Panel";
mostCurrent._pnlpicture = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private pnlBackground As Panel";
mostCurrent._pnlbackground = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private btnEffects As Button";
mostCurrent._btneffects = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private btnScene As Button";
mostCurrent._btnscene = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private buttons As List";
mostCurrent._buttons = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 26;BA.debugLine="Private btnAutoExposure As Button";
mostCurrent._btnautoexposure = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private btnFocus As Button";
mostCurrent._btnfocus = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private ProgressBar1 As ProgressBar";
mostCurrent._progressbar1 = new anywheresoftware.b4a.objects.ProgressBarWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private openstate, busystate As Boolean";
_openstate = false;
_busystate = false;
 //BA.debugLineNum = 30;BA.debugLine="Private btnRecord As Button";
mostCurrent._btnrecord = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private btnMode As Button";
mostCurrent._btnmode = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private btnCamera As Button";
mostCurrent._btncamera = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private barZoom As SeekBar";
mostCurrent._barzoom = new anywheresoftware.b4a.objects.SeekBarWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private SaveImgBtn As Button";
mostCurrent._saveimgbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private CancelSaveBtn As Button";
mostCurrent._cancelsavebtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public static String  _handleerror(anywheresoftware.b4a.objects.B4AException _error) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub HandleError (Error As Exception)";
 //BA.debugLineNum = 141;BA.debugLine="Log(\"Error: \" & Error)";
anywheresoftware.b4a.keywords.Common.Log("Error: "+BA.ObjectToString(_error));
 //BA.debugLineNum = 142;BA.debugLine="ToastMessageShow(Error, True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_error.getObject()),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 143;BA.debugLine="OpenCamera(frontCamera)";
_opencamera(_frontcamera);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public static void  _opencamera(boolean _front) throws Exception{
ResumableSub_OpenCamera rsub = new ResumableSub_OpenCamera(null,_front);
rsub.resume(processBA, null);
}
public static class ResumableSub_OpenCamera extends BA.ResumableSub {
public ResumableSub_OpenCamera(b4a.example.maincamera parent,boolean _front) {
this.parent = parent;
this._front = _front;
}
b4a.example.maincamera parent;
boolean _front;
String _permission = "";
boolean _result = false;
int _taskindex = 0;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 55;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_CAMERA);
 //BA.debugLineNum = 56;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, this, null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 //BA.debugLineNum = 57;BA.debugLine="If Result = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 58;BA.debugLine="ToastMessageShow(\"No permission!\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No permission!"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 59;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 62;BA.debugLine="SetState(False, False, VideoMode)";
_setstate(anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,parent._videomode);
 //BA.debugLineNum = 63;BA.debugLine="Wait For (cam.OpenCamera(front)) Complete (TaskIn";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._cam._opencamera(_front));
this.state = 14;
return;
case 14:
//C
this.state = 5;
_taskindex = (Integer) result[0];
;
 //BA.debugLineNum = 64;BA.debugLine="If TaskIndex > 0 Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_taskindex>0) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 65;BA.debugLine="MyTaskIndex = TaskIndex 'hold this index. It wil";
parent._mytaskindex = _taskindex;
 //BA.debugLineNum = 66;BA.debugLine="Wait For(PrepareSurface) Complete (Success As Bo";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _preparesurface());
this.state = 15;
return;
case 15:
//C
this.state = 8;
_success = (Boolean) result[0];
;
 if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 68;BA.debugLine="Log(\"Start success: \" & Success)";
anywheresoftware.b4a.keywords.Common.Log("Start success: "+BA.ObjectToString(_success));
 //BA.debugLineNum = 69;BA.debugLine="SetState(Success, False, VideoMode)";
_setstate(_success,anywheresoftware.b4a.keywords.Common.False,parent._videomode);
 //BA.debugLineNum = 70;BA.debugLine="If Success = False Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_success==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 71;BA.debugLine="ToastMessageShow(\"Failed to open camera\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Failed to open camera"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _pnlpicture_click() throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub pnlPicture_Click";
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparesurface() throws Exception{
ResumableSub_PrepareSurface rsub = new ResumableSub_PrepareSurface(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareSurface extends BA.ResumableSub {
public ResumableSub_PrepareSurface(b4a.example.maincamera parent) {
this.parent = parent;
}
b4a.example.maincamera parent;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 76;BA.debugLine="SetState(False, busystate, VideoMode)";
_setstate(anywheresoftware.b4a.keywords.Common.False,parent._busystate,parent._videomode);
 //BA.debugLineNum = 78;BA.debugLine="If VideoMode Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._videomode) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 79;BA.debugLine="cam.PreviewSize.Initialize(640, 480)";
parent.mostCurrent._cam._previewsize.Initialize((int) (640),(int) (480));
 //BA.debugLineNum = 81;BA.debugLine="Wait For (cam.PrepareSurfaceForVideo(MyTaskIndex";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._cam._preparesurfaceforvideo(parent._mytaskindex,parent._videofiledir,"temp-"+parent._videofilename));
this.state = 12;
return;
case 12:
//C
this.state = 6;
_success = (Boolean) result[0];
;
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 83;BA.debugLine="cam.PreviewSize.Initialize(1920, 1080)";
parent.mostCurrent._cam._previewsize.Initialize((int) (1920),(int) (1080));
 //BA.debugLineNum = 84;BA.debugLine="Wait For (cam.PrepareSurface(MyTaskIndex)) Compl";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._cam._preparesurface(parent._mytaskindex));
this.state = 13;
return;
case 13:
//C
this.state = 6;
_success = (Boolean) result[0];
;
 if (true) break;
;
 //BA.debugLineNum = 86;BA.debugLine="If Success Then cam.StartPreview(MyTaskIndex, Vid";

case 6:
//if
this.state = 11;
if (_success) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
parent.mostCurrent._cam._startpreview(parent._mytaskindex,parent._videomode);
if (true) break;

case 11:
//C
this.state = -1;
;
 //BA.debugLineNum = 87;BA.debugLine="SetState(Success, busystate, VideoMode)";
_setstate(_success,parent._busystate,parent._videomode);
 //BA.debugLineNum = 88;BA.debugLine="Return Success";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_success));return;};
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private frontCamera As Boolean = False";
_frontcamera = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 10;BA.debugLine="Private VideoMode As Boolean = False";
_videomode = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 11;BA.debugLine="Private VideoFileDir, VideoFileName As String";
_videofiledir = "";
_videofilename = "";
 //BA.debugLineNum = 12;BA.debugLine="Private MyTaskIndex As Int";
_mytaskindex = 0;
 //BA.debugLineNum = 13;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public static void  _saveimgbtn_click() throws Exception{
ResumableSub_SaveImgBtn_Click rsub = new ResumableSub_SaveImgBtn_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_SaveImgBtn_Click extends BA.ResumableSub {
public ResumableSub_SaveImgBtn_Click(b4a.example.maincamera parent) {
this.parent = parent;
}
b4a.example.maincamera parent;
byte[] _data = null;
String _tanggal = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 245;BA.debugLine="Wait For(cam.FocusAndTakePicture(MyTaskIndex)) Co";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._cam._focusandtakepicture(parent._mytaskindex));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_data = (byte[]) result[0];
;
 //BA.debugLineNum = 246;BA.debugLine="Dim tanggal As String";
_tanggal = "";
 //BA.debugLineNum = 247;BA.debugLine="DateTime.DateFormat=\"dd-mm-yyyy hh:mm:ss.s\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd-mm-yyyy hh:mm:ss.s");
 //BA.debugLineNum = 248;BA.debugLine="tanggal = DateTime.Date(DateTime.now)";
_tanggal = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 249;BA.debugLine="cam.DataToFile(data, VideoFileDir, tanggal&\".jpg\"";
parent.mostCurrent._cam._datatofile(_data,parent._videofiledir,_tanggal+".jpg");
 //BA.debugLineNum = 250;BA.debugLine="ToastMessageShow(\"Image Saved!\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Image Saved!"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 251;BA.debugLine="pnlBackground.Visible = False";
parent.mostCurrent._pnlbackground.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setstate(boolean _open,boolean _busy,boolean _video) throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
String _btnrecordtext = "";
 //BA.debugLineNum = 207;BA.debugLine="Sub SetState(Open As Boolean, Busy As Boolean, Vid";
 //BA.debugLineNum = 208;BA.debugLine="For Each b As Button In buttons";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = mostCurrent._buttons;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b.setObject((android.widget.Button)(group1.Get(index1)));
 //BA.debugLineNum = 209;BA.debugLine="b.Visible = Open And Not(Busy)";
_b.setVisible(_open && anywheresoftware.b4a.keywords.Common.Not(_busy));
 }
};
 //BA.debugLineNum = 211;BA.debugLine="btnCamera.Visible = Not(Busy)";
mostCurrent._btncamera.setVisible(anywheresoftware.b4a.keywords.Common.Not(_busy));
 //BA.debugLineNum = 212;BA.debugLine="btnRecord.Visible = Open And (Video Or Not(Busy))";
mostCurrent._btnrecord.setVisible(_open && (_video || anywheresoftware.b4a.keywords.Common.Not(_busy)));
 //BA.debugLineNum = 213;BA.debugLine="openstate = Open";
_openstate = _open;
 //BA.debugLineNum = 214;BA.debugLine="ProgressBar1.Visible = Busy";
mostCurrent._progressbar1.setVisible(_busy);
 //BA.debugLineNum = 215;BA.debugLine="busystate = Busy";
_busystate = _busy;
 //BA.debugLineNum = 216;BA.debugLine="VideoMode = Video";
_videomode = _video;
 //BA.debugLineNum = 217;BA.debugLine="barZoom.Visible = Open";
mostCurrent._barzoom.setVisible(_open);
 //BA.debugLineNum = 218;BA.debugLine="Dim btnRecordText As String";
_btnrecordtext = "";
 //BA.debugLineNum = 219;BA.debugLine="If VideoMode Then";
if (_videomode) { 
 //BA.debugLineNum = 220;BA.debugLine="If Busy Then";
if (_busy) { 
 //BA.debugLineNum = 221;BA.debugLine="btnRecordText = Chr(0xF04D)";
_btnrecordtext = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf04d)));
 }else {
 //BA.debugLineNum = 223;BA.debugLine="btnRecordText = Chr(0xF03D)";
_btnrecordtext = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf03d)));
 };
 }else {
 //BA.debugLineNum = 226;BA.debugLine="btnRecordText = Chr(0xF030)";
_btnrecordtext = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf030)));
 };
 //BA.debugLineNum = 228;BA.debugLine="btnRecord.Text = btnRecordText";
mostCurrent._btnrecord.setText(BA.ObjectToCharSequence(_btnrecordtext));
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return "";
}
public static void  _takepicture() throws Exception{
ResumableSub_TakePicture rsub = new ResumableSub_TakePicture(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_TakePicture extends BA.ResumableSub {
public ResumableSub_TakePicture(b4a.example.maincamera parent) {
this.parent = parent;
}
b4a.example.maincamera parent;
byte[] _data = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 147;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 //BA.debugLineNum = 148;BA.debugLine="SetState(openstate, True, VideoMode)";
_setstate(parent._openstate,anywheresoftware.b4a.keywords.Common.True,parent._videomode);
 //BA.debugLineNum = 149;BA.debugLine="Wait For(cam.FocusAndTakePicture(MyTaskIndex)) C";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._cam._focusandtakepicture(parent._mytaskindex));
this.state = 7;
return;
case 7:
//C
this.state = 6;
_data = (byte[]) result[0];
;
 //BA.debugLineNum = 150;BA.debugLine="SetState(openstate, False, VideoMode)";
_setstate(parent._openstate,anywheresoftware.b4a.keywords.Common.False,parent._videomode);
 //BA.debugLineNum = 151;BA.debugLine="Dim bmp As Bitmap = cam.DataToBitmap(data)";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = parent.mostCurrent._cam._datatobitmap(_data);
 //BA.debugLineNum = 152;BA.debugLine="Log(\"Picture taken: \" & bmp) 'ignore";
anywheresoftware.b4a.keywords.Common.Log("Picture taken: "+BA.ObjectToString(_bmp));
 //BA.debugLineNum = 153;BA.debugLine="pnlBackground.SetVisibleAnimated(100, True)";
parent.mostCurrent._pnlbackground.SetVisibleAnimated((int) (100),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 154;BA.debugLine="pnlPicture.SetBackgroundImage(bmp.Resize(pnlPict";
parent.mostCurrent._pnlpicture.SetBackgroundImageNew((android.graphics.Bitmap)(_bmp.Resize((float) (parent.mostCurrent._pnlpicture.getWidth()),(float) (parent.mostCurrent._pnlpicture.getHeight()),anywheresoftware.b4a.keywords.Common.True).getObject())).setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 //BA.debugLineNum = 161;BA.debugLine="HandleError(LastException)";
_handleerror(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA));
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
}
