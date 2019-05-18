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

public class worshipbuilding extends Activity implements B4AActivity{
	public static worshipbuilding mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.worshipbuilding");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (worshipbuilding).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.worshipbuilding");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.worshipbuilding", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (worshipbuilding) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (worshipbuilding) Resume **");
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
		return worshipbuilding.class;
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
        BA.LogInfo("** Activity (worshipbuilding) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (worshipbuilding) Resume **");
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
public static String _idbuilding = "";
public static String _namebuilding = "";
public anywheresoftware.b4a.objects.LabelWrapper _titlebar = null;
public anywheresoftware.b4a.objects.LabelWrapper _backarrow = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webviewtest = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelbuildinglist = null;
public b4a.example3.customlistview _clv2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _num = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _buildingname = null;
public anywheresoftware.b4a.objects.PanelWrapper _panellistitem = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnhome = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsearch = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btninfo = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneltoolbar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndelete = null;
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
RDebugUtils.currentModule="worshipbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=18546691;
 //BA.debugLineNum = 18546691;BA.debugLine="ScrollView1.Panel.Width=100%y";
mostCurrent._scrollview1.getPanel().setWidth(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=18546692;
 //BA.debugLineNum = 18546692;BA.debugLine="ScrollView1.Panel.LoadLayout(\"clvBuildingList\")";
mostCurrent._scrollview1.getPanel().LoadLayout("clvBuildingList",mostCurrent.activityBA);
RDebugUtils.currentLine=18546693;
 //BA.debugLineNum = 18546693;BA.debugLine="PanelToolBar.Visible = False";
mostCurrent._paneltoolbar.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=18546696;
 //BA.debugLineNum = 18546696;BA.debugLine="BackArrow.Visible= True";
mostCurrent._backarrow.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=18546697;
 //BA.debugLineNum = 18546697;BA.debugLine="BackArrow.SetBackgroundImage(LoadBitmap(File.DirA";
mostCurrent._backarrow.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"back-arrow.png").getObject()));
RDebugUtils.currentLine=18546698;
 //BA.debugLineNum = 18546698;BA.debugLine="TitleBar.Text=\"Building List\"";
mostCurrent._titlebar.setText(BA.ObjectToCharSequence("Building List"));
RDebugUtils.currentLine=18546701;
 //BA.debugLineNum = 18546701;BA.debugLine="WebViewTest.Initialize(\"\")";
mostCurrent._webviewtest.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=18546702;
 //BA.debugLineNum = 18546702;BA.debugLine="Activity.AddView(WebViewTest,0,6%y,100%x,50%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._webviewtest.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA));
RDebugUtils.currentLine=18546703;
 //BA.debugLineNum = 18546703;BA.debugLine="WebViewTest.LoadURL(Main.Server&\"worship_building";
mostCurrent._webviewtest.LoadUrl(mostCurrent._main._server+"worship_building.php");
RDebugUtils.currentLine=18546706;
 //BA.debugLineNum = 18546706;BA.debugLine="ScrollView1.Panel.Height = CLV2.sv.Height";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._clv2._sv.getHeight());
RDebugUtils.currentLine=18546707;
 //BA.debugLineNum = 18546707;BA.debugLine="ScrollView1.Top = WebViewTest.Height+WebViewTest.";
mostCurrent._scrollview1.setTop((int) (mostCurrent._webviewtest.getHeight()+mostCurrent._webviewtest.getTop()));
RDebugUtils.currentLine=18546710;
 //BA.debugLineNum = 18546710;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="worshipbuilding";
RDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="End Sub";
return "";
}
public static void  _activity_resume() throws Exception{
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(b4a.example.worshipbuilding parent) {
this.parent = parent;
}
b4a.example.worshipbuilding parent;
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="worshipbuilding";
Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
if (true) return;
    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="CLV2.Clear";
parent.mostCurrent._clv2._clear();
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="Dim j As HttpJob";
_j = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=18612227;
 //BA.debugLineNum = 18612227;BA.debugLine="j.Initialize(\"\",Me)";
_j._initialize(processBA,"",worshipbuilding.getObject());
RDebugUtils.currentLine=18612228;
 //BA.debugLineNum = 18612228;BA.debugLine="j.Download(Main.Server&\"mobile/datat4ibadah.php\")";
_j._download(parent.mostCurrent._main._server+"mobile/datat4ibadah.php");
RDebugUtils.currentLine=18612229;
 //BA.debugLineNum = 18612229;BA.debugLine="ProgressDialogShow2(\"Downloading...\",False)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("Downloading..."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=18612230;
 //BA.debugLineNum = 18612230;BA.debugLine="Wait For (j) JobDone (j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_j));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_j = (anywheresoftware.b4a.samples.httputils2.httpjob) result[0];
;
RDebugUtils.currentLine=18612231;
 //BA.debugLineNum = 18612231;BA.debugLine="JobDone(j)";
_jobdone(_j);
RDebugUtils.currentLine=18612232;
 //BA.debugLineNum = 18612232;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _j) throws Exception{
RDebugUtils.currentModule="worshipbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_j});
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _features = null;
anywheresoftware.b4a.objects.collections.Map _colfeatures = null;
anywheresoftware.b4a.objects.collections.Map _properties = null;
String _nama = "";
String _id = "";
String _content = "";
String _type = "";
RDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Sub JobDone(j As HttpJob)";
RDebugUtils.currentLine=18874369;
 //BA.debugLineNum = 18874369;BA.debugLine="If j.Success Then";
if (_j._success) { 
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="Log(j.GetString)";
anywheresoftware.b4a.keywords.Common.Log(_j._getstring());
RDebugUtils.currentLine=18874371;
 //BA.debugLineNum = 18874371;BA.debugLine="If j.GetString.Length == 0 Then";
if (_j._getstring().length()==0) { 
RDebugUtils.currentLine=18874372;
 //BA.debugLineNum = 18874372;BA.debugLine="Msgbox(\"Data Not Found\", \"Warning\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Data Not Found"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
RDebugUtils.currentLine=18874373;
 //BA.debugLineNum = 18874373;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
RDebugUtils.currentLine=18874375;
 //BA.debugLineNum = 18874375;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=18874376;
 //BA.debugLineNum = 18874376;BA.debugLine="parser.Initialize(j.GetString)";
_parser.Initialize(_j._getstring());
RDebugUtils.currentLine=18874377;
 //BA.debugLineNum = 18874377;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=18874378;
 //BA.debugLineNum = 18874378;BA.debugLine="Dim features As List = root.Get(\"features\")";
_features = new anywheresoftware.b4a.objects.collections.List();
_features.setObject((java.util.List)(_root.Get((Object)("features"))));
RDebugUtils.currentLine=18874379;
 //BA.debugLineNum = 18874379;BA.debugLine="For Each colfeatures As Map In features";
_colfeatures = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group11 = _features;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_colfeatures.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group11.Get(index11)));
RDebugUtils.currentLine=18874381;
 //BA.debugLineNum = 18874381;BA.debugLine="Dim properties As Map = colfeatures.Get(\"proper";
_properties = new anywheresoftware.b4a.objects.collections.Map();
_properties.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_colfeatures.Get((Object)("properties"))));
RDebugUtils.currentLine=18874382;
 //BA.debugLineNum = 18874382;BA.debugLine="Dim nama As String = properties.Get(\"nama\")";
_nama = BA.ObjectToString(_properties.Get((Object)("nama")));
RDebugUtils.currentLine=18874383;
 //BA.debugLineNum = 18874383;BA.debugLine="Dim id As String = properties.Get(\"id\")";
_id = BA.ObjectToString(_properties.Get((Object)("id")));
RDebugUtils.currentLine=18874384;
 //BA.debugLineNum = 18874384;BA.debugLine="Dim content As String = nama";
_content = _nama;
RDebugUtils.currentLine=18874386;
 //BA.debugLineNum = 18874386;BA.debugLine="CLV2.Add(CreateItem(CLV2.AsView.Width, id, cont";
mostCurrent._clv2._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(mostCurrent._clv2._asview().getWidth(),_id,_content).getObject())),(Object)(""));
RDebugUtils.currentLine=18874387;
 //BA.debugLineNum = 18874387;BA.debugLine="CLV2.AsView.Height = PanelListItem.Height* CLV2";
mostCurrent._clv2._asview().setHeight((int) (mostCurrent._panellistitem.getHeight()*mostCurrent._clv2._getsize()));
 }
};
RDebugUtils.currentLine=18874389;
 //BA.debugLineNum = 18874389;BA.debugLine="Dim Type As String = root.Get(\"type\")";
_type = BA.ObjectToString(_root.Get((Object)("type")));
RDebugUtils.currentLine=18874391;
 //BA.debugLineNum = 18874391;BA.debugLine="ScrollView1.Height = 100%y - WebViewTest.Height";
mostCurrent._scrollview1.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._webviewtest.getHeight()-mostCurrent._paneltoolbar.getHeight()));
RDebugUtils.currentLine=18874392;
 //BA.debugLineNum = 18874392;BA.debugLine="CLV2.sv.Height = CLV2.AsView.Height";
mostCurrent._clv2._sv.setHeight(mostCurrent._clv2._asview().getHeight());
RDebugUtils.currentLine=18874393;
 //BA.debugLineNum = 18874393;BA.debugLine="ScrollView1.Panel.Height = CLV2.AsView.Height";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._clv2._asview().getHeight());
RDebugUtils.currentLine=18874394;
 //BA.debugLineNum = 18874394;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 };
 }else {
RDebugUtils.currentLine=18874397;
 //BA.debugLineNum = 18874397;BA.debugLine="Log(\"Error\" & j.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("Error"+_j._errormessage);
RDebugUtils.currentLine=18874398;
 //BA.debugLineNum = 18874398;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 };
RDebugUtils.currentLine=18874400;
 //BA.debugLineNum = 18874400;BA.debugLine="j.Release";
_j._release();
RDebugUtils.currentLine=18874401;
 //BA.debugLineNum = 18874401;BA.debugLine="End Sub";
return "";
}
public static String  _backarrow_click() throws Exception{
RDebugUtils.currentModule="worshipbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "backarrow_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "backarrow_click", null);
RDebugUtils.currentLine=19070976;
 //BA.debugLineNum = 19070976;BA.debugLine="Sub BackArrow_Click";
RDebugUtils.currentLine=19070977;
 //BA.debugLineNum = 19070977;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=19070978;
 //BA.debugLineNum = 19070978;BA.debugLine="End Sub";
return "";
}
public static String  _btnhome_click() throws Exception{
RDebugUtils.currentModule="worshipbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnhome_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnhome_click", null);
RDebugUtils.currentLine=19136512;
 //BA.debugLineNum = 19136512;BA.debugLine="Sub BtnHome_Click";
RDebugUtils.currentLine=19136514;
 //BA.debugLineNum = 19136514;BA.debugLine="End Sub";
return "";
}
public static String  _btninfo_click() throws Exception{
RDebugUtils.currentModule="worshipbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btninfo_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btninfo_click", null);
RDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Sub BtnInfo_Click";
RDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="End Sub";
return "";
}
public static String  _btnmap_click() throws Exception{
RDebugUtils.currentModule="worshipbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnmap_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnmap_click", null);
RDebugUtils.currentLine=19202048;
 //BA.debugLineNum = 19202048;BA.debugLine="Sub BtnMap_Click";
RDebugUtils.currentLine=19202050;
 //BA.debugLineNum = 19202050;BA.debugLine="End Sub";
return "";
}
public static String  _btnsearch_click() throws Exception{
RDebugUtils.currentModule="worshipbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsearch_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnsearch_click", null);
RDebugUtils.currentLine=19267584;
 //BA.debugLineNum = 19267584;BA.debugLine="Sub BtnSearch_Click";
RDebugUtils.currentLine=19267586;
 //BA.debugLineNum = 19267586;BA.debugLine="End Sub";
return "";
}
public static String  _buildingname_click() throws Exception{
RDebugUtils.currentModule="worshipbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buildingname_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buildingname_click", null);
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Sub BuildingName_Click";
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="End Sub";
return "";
}
public static String  _clv2_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="worshipbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clv2_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "clv2_itemclick", new Object[] {_index,_value});
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Sub CLV2_ItemClick (Index As Int, Value As Object)";
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="idBuilding = Value 'store the value in the proces";
_idbuilding = BA.ObjectToString(_value);
RDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="StartActivity(WorshipDetail)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._worshipdetail.getObject()));
RDebugUtils.currentLine=18808836;
 //BA.debugLineNum = 18808836;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createitem(int _width,String _title,String _content) throws Exception{
RDebugUtils.currentModule="worshipbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createitem"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createitem", new Object[] {_width,_title,_content});
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="p.LoadLayout(\"BuildingListTwo\")";
_p.LoadLayout("BuildingListTwo",mostCurrent.activityBA);
RDebugUtils.currentLine=18743299;
 //BA.debugLineNum = 18743299;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, PanelListItem";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,mostCurrent._panellistitem.getHeight());
RDebugUtils.currentLine=18743300;
 //BA.debugLineNum = 18743300;BA.debugLine="Num.Text = Title";
mostCurrent._num.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=18743301;
 //BA.debugLineNum = 18743301;BA.debugLine="BuildingName.Text = Content";
mostCurrent._buildingname.setText(BA.ObjectToCharSequence(_content));
RDebugUtils.currentLine=18743302;
 //BA.debugLineNum = 18743302;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_p.getObject()));
RDebugUtils.currentLine=18743303;
 //BA.debugLineNum = 18743303;BA.debugLine="End Sub";
return null;
}
public static String  _panellistitem_click() throws Exception{
RDebugUtils.currentModule="worshipbuilding";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panellistitem_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "panellistitem_click", null);
int _item = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _a = null;
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Sub PanelListItem_Click";
RDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="Dim item As Int = CLV2.GetItemFromView(Sender)";
_item = mostCurrent._clv2._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA))));
RDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=19005443;
 //BA.debugLineNum = 19005443;BA.debugLine="p = CLV2.GetPanel(item)";
_p = mostCurrent._clv2._getpanel(_item);
RDebugUtils.currentLine=19005444;
 //BA.debugLineNum = 19005444;BA.debugLine="Dim a As B4XView";
_a = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=19005445;
 //BA.debugLineNum = 19005445;BA.debugLine="a = p.GetView(0)";
_a = _p.GetView((int) (0));
RDebugUtils.currentLine=19005447;
 //BA.debugLineNum = 19005447;BA.debugLine="idBuilding = a.GetView(0).GetView(0).Text";
_idbuilding = _a.GetView((int) (0)).GetView((int) (0)).getText();
RDebugUtils.currentLine=19005449;
 //BA.debugLineNum = 19005449;BA.debugLine="nameBuilding = a.GetView(0).GetView(1).Text";
_namebuilding = _a.GetView((int) (0)).GetView((int) (1)).getText();
RDebugUtils.currentLine=19005450;
 //BA.debugLineNum = 19005450;BA.debugLine="Log(\"NAMA BUILDING: \"&nameBuilding)";
anywheresoftware.b4a.keywords.Common.Log("NAMA BUILDING: "+_namebuilding);
RDebugUtils.currentLine=19005451;
 //BA.debugLineNum = 19005451;BA.debugLine="StartActivity(WorshipDetail)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._worshipdetail.getObject()));
RDebugUtils.currentLine=19005452;
 //BA.debugLineNum = 19005452;BA.debugLine="End Sub";
return "";
}
}