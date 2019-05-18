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

public class addfacilitytype extends Activity implements B4AActivity{
	public static addfacilitytype mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.addfacilitytype");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (addfacilitytype).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.addfacilitytype");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.addfacilitytype", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (addfacilitytype) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (addfacilitytype) Resume **");
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
		return addfacilitytype.class;
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
        BA.LogInfo("** Activity (addfacilitytype) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (addfacilitytype) Resume **");
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
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelname = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneladdpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneladdfacility = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelbar = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneltoolbar = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlistfac = null;
public b4a.example3.customlistview _clvfac = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _numfc = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _namefc = null;
public anywheresoftware.b4a.objects.LabelWrapper _idfaci = null;
public anywheresoftware.b4a.objects.LabelWrapper _pnlquantity = null;
public anywheresoftware.b4a.objects.PanelWrapper _listitem = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndelete = null;
public static int _idelete = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _btnadd = null;
public anywheresoftware.b4a.objects.LabelWrapper _editname = null;
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
RDebugUtils.currentModule="addfacilitytype";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=13631491;
 //BA.debugLineNum = 13631491;BA.debugLine="ScrollView1.Panel.LoadLayout(\"AddFacilityType\")";
mostCurrent._scrollview1.getPanel().LoadLayout("AddFacilityType",mostCurrent.activityBA);
RDebugUtils.currentLine=13631492;
 //BA.debugLineNum = 13631492;BA.debugLine="ScrollView1.Height = 100%y - (PanelBar.Height + P";
mostCurrent._scrollview1.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-(mostCurrent._panelbar.getHeight()+mostCurrent._paneltoolbar.getHeight())));
RDebugUtils.currentLine=13631493;
 //BA.debugLineNum = 13631493;BA.debugLine="PanelAddFacility.Height = ScrollView1.Height";
mostCurrent._paneladdfacility.setHeight(mostCurrent._scrollview1.getHeight());
RDebugUtils.currentLine=13631494;
 //BA.debugLineNum = 13631494;BA.debugLine="ScrollView1.panel.Height = PanelAddFacility.Heigh";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._paneladdfacility.getHeight());
RDebugUtils.currentLine=13631497;
 //BA.debugLineNum = 13631497;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="addfacilitytype";
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="addfacilitytype";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="CLVFac.Clear";
mostCurrent._clvfac._clear();
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="FunctionAll.ExecuteRemoteQuery(\"SELECT * FROM wor";
mostCurrent._functionall._executeremotequery(mostCurrent.activityBA,"SELECT * FROM worship_building_facilities ORDER BY name_of_facility ASC","Worship",addfacilitytype.getObject());
RDebugUtils.currentLine=13697027;
 //BA.debugLineNum = 13697027;BA.debugLine="End Sub";
return "";
}
public static String  _btnadd_click() throws Exception{
RDebugUtils.currentModule="addfacilitytype";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnadd_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnadd_click", null);
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Sub BtnAdd_Click";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="If EditName.Text <> \"\" Then";
if ((mostCurrent._editname.getText()).equals("") == false) { 
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="ProgressDialogShow(\"Adding facility..\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Adding facility.."));
RDebugUtils.currentLine=14090243;
 //BA.debugLineNum = 14090243;BA.debugLine="FunctionAll.ExecuteRemoteQuery(\"SELECT MAX(facil";
mostCurrent._functionall._executeremotequery(mostCurrent.activityBA,"SELECT MAX(facility_id) AS id FROM worship_building_facilities","AddFacility",addfacilitytype.getObject());
 }else {
RDebugUtils.currentLine=14090245;
 //BA.debugLineNum = 14090245;BA.debugLine="Msgbox(\"Fill the blank\",\"\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Fill the blank"),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
 };
RDebugUtils.currentLine=14090248;
 //BA.debugLineNum = 14090248;BA.debugLine="End Sub";
return "";
}
public static void  _btndelete_click() throws Exception{
ResumableSub_btnDelete_Click rsub = new ResumableSub_btnDelete_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnDelete_Click extends BA.ResumableSub {
public ResumableSub_btnDelete_Click(b4a.example.addfacilitytype parent) {
this.parent = parent;
}
b4a.example.addfacilitytype parent;
int _item = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _a = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="addfacilitytype";
Debug.delegate(mostCurrent.activityBA, "btndelete_click", null);
if (true) return;
    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="Dim item As Int = CLVFac.GetItemFromView(Sender)";
_item = parent.mostCurrent._clvfac._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA))));
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="p = CLVFac.GetPanel(item)";
_p = parent.mostCurrent._clvfac._getpanel(_item);
RDebugUtils.currentLine=14024708;
 //BA.debugLineNum = 14024708;BA.debugLine="Dim a As B4XView";
_a = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=14024709;
 //BA.debugLineNum = 14024709;BA.debugLine="a = p.GetView(0)";
_a = _p.GetView((int) (0));
RDebugUtils.currentLine=14024710;
 //BA.debugLineNum = 14024710;BA.debugLine="idelete= a.GetView(2).Text";
parent._idelete = (int)(Double.parseDouble(_a.GetView((int) (2)).getText()));
RDebugUtils.currentLine=14024711;
 //BA.debugLineNum = 14024711;BA.debugLine="Log(\"NAMA BUILDING: \"&a.GetView(2).Text)";
anywheresoftware.b4a.keywords.Common.Log("NAMA BUILDING: "+_a.GetView((int) (2)).getText());
RDebugUtils.currentLine=14024712;
 //BA.debugLineNum = 14024712;BA.debugLine="Msgbox2Async(\"Are you sure to delete all faciliti";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Are you sure to delete all facilities consist "+_a.GetView((int) (0)).getText()+"?"),BA.ObjectToCharSequence("Caution"),"Yes","Cancel","No",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14024713;
 //BA.debugLineNum = 14024713;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=14024714;
 //BA.debugLineNum = 14024714;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=14024715;
 //BA.debugLineNum = 14024715;BA.debugLine="Log(\"YES\")";
anywheresoftware.b4a.keywords.Common.Log("YES");
RDebugUtils.currentLine=14024716;
 //BA.debugLineNum = 14024716;BA.debugLine="ProgressDialogShow(\"deleting..\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("deleting.."));
RDebugUtils.currentLine=14024717;
 //BA.debugLineNum = 14024717;BA.debugLine="FunctionAll.ExecuteRemoteQuery(\"DELETE FROM deta";
parent.mostCurrent._functionall._executeremotequery(mostCurrent.activityBA,"DELETE FROM detail_worship_building_facilities WHERE facility_id="+BA.NumberToString(parent._idelete),"DeleteAll",addfacilitytype.getObject());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=14024719;
 //BA.debugLineNum = 14024719;BA.debugLine="Log(\"CANCEL\")";
anywheresoftware.b4a.keywords.Common.Log("CANCEL");
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=14024721;
 //BA.debugLineNum = 14024721;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _clvfac_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="addfacilitytype";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clvfac_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "clvfac_itemclick", new Object[] {_index,_value});
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Sub CLVFac_ItemClick (Index As Int, Value As Objec";
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createitem(int _width,String _title,String _content,int _id) throws Exception{
RDebugUtils.currentModule="addfacilitytype";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createitem"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createitem", new Object[] {_width,_title,_content,_id});
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Private Sub CreateItem(Width As Int, Title As Stri";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 100%x,10%x)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=13828099;
 //BA.debugLineNum = 13828099;BA.debugLine="p.LoadLayout(\"facility_type_list\")";
_p.LoadLayout("facility_type_list",mostCurrent.activityBA);
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="PnlQuantity.Text = Title";
mostCurrent._pnlquantity.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=13828101;
 //BA.debugLineNum = 13828101;BA.debugLine="namefc.Text = Content";
mostCurrent._namefc.setText(BA.ObjectToCharSequence(_content));
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="idfaci.Text = id";
mostCurrent._idfaci.setText(BA.ObjectToCharSequence(_id));
RDebugUtils.currentLine=13828104;
 //BA.debugLineNum = 13828104;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_p.getObject()));
RDebugUtils.currentLine=13828105;
 //BA.debugLineNum = 13828105;BA.debugLine="End Sub";
return null;
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="addfacilitytype";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _fasi_array = null;
int _c = 0;
anywheresoftware.b4a.objects.collections.Map _a = null;
String _id = "";
String _name = "";
int _id2 = 0;
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
RDebugUtils.currentLine=13893636;
 //BA.debugLineNum = 13893636;BA.debugLine="Log(\"Response from server :\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server :"+_res);
RDebugUtils.currentLine=13893637;
 //BA.debugLineNum = 13893637;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=13893638;
 //BA.debugLineNum = 13893638;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=13893639;
 //BA.debugLineNum = 13893639;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"Worship","DeleteAll","Delete","AddFacility","AddSuccess")) {
case 0: {
RDebugUtils.currentLine=13893641;
 //BA.debugLineNum = 13893641;BA.debugLine="Log(\"success\")";
anywheresoftware.b4a.keywords.Common.Log("success");
RDebugUtils.currentLine=13893642;
 //BA.debugLineNum = 13893642;BA.debugLine="Dim fasi_array As List = parser.NextArray";
_fasi_array = new anywheresoftware.b4a.objects.collections.List();
_fasi_array = _parser.NextArray();
RDebugUtils.currentLine=13893643;
 //BA.debugLineNum = 13893643;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=13893644;
 //BA.debugLineNum = 13893644;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=13893645;
 //BA.debugLineNum = 13893645;BA.debugLine="For c=0 To fasi_array.Size - 1";
{
final int step13 = 1;
final int limit13 = (int) (_fasi_array.getSize()-1);
_c = (int) (0) ;
for (;(step13 > 0 && _c <= limit13) || (step13 < 0 && _c >= limit13) ;_c = ((int)(0 + _c + step13))  ) {
RDebugUtils.currentLine=13893646;
 //BA.debugLineNum = 13893646;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13893647;
 //BA.debugLineNum = 13893647;BA.debugLine="a = fasi_array.Get(c)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_fasi_array.Get(_c)));
RDebugUtils.currentLine=13893649;
 //BA.debugLineNum = 13893649;BA.debugLine="Dim id, name As String";
_id = "";
_name = "";
RDebugUtils.currentLine=13893650;
 //BA.debugLineNum = 13893650;BA.debugLine="id=a.Get(\"facility_id\")";
_id = BA.ObjectToString(_a.Get((Object)("facility_id")));
RDebugUtils.currentLine=13893651;
 //BA.debugLineNum = 13893651;BA.debugLine="name=a.Get(\"name_of_facility\")";
_name = BA.ObjectToString(_a.Get((Object)("name_of_facility")));
RDebugUtils.currentLine=13893652;
 //BA.debugLineNum = 13893652;BA.debugLine="Log(\"id: \"&id&\" | name: \"&name)";
anywheresoftware.b4a.keywords.Common.Log("id: "+_id+" | name: "+_name);
RDebugUtils.currentLine=13893653;
 //BA.debugLineNum = 13893653;BA.debugLine="CLVFac.Add(CreateItem(CLVFac.AsView.Width, $\"";
mostCurrent._clvfac._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(mostCurrent._clvfac._asview().getWidth(),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_c+1))+""),_name,(int)(Double.parseDouble((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_id))+"")))).getObject())),(Object)(""));
 }
};
RDebugUtils.currentLine=13893655;
 //BA.debugLineNum = 13893655;BA.debugLine="CLVFac.AsView.Height = (ListItem.Height+0.6%x";
mostCurrent._clvfac._asview().setHeight((int) ((mostCurrent._listitem.getHeight()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0.6),mostCurrent.activityBA))*_fasi_array.getSize()));
RDebugUtils.currentLine=13893656;
 //BA.debugLineNum = 13893656;BA.debugLine="CLVFac.sv.Height = CLVFac.AsView.Height";
mostCurrent._clvfac._sv.setHeight(mostCurrent._clvfac._asview().getHeight());
RDebugUtils.currentLine=13893657;
 //BA.debugLineNum = 13893657;BA.debugLine="PnListFac.Height =CLVFac.AsView.Height";
mostCurrent._pnlistfac.setHeight(mostCurrent._clvfac._asview().getHeight());
 break; }
case 1: {
RDebugUtils.currentLine=13893659;
 //BA.debugLineNum = 13893659;BA.debugLine="Dim fasi_array As List = parser.NextArray";
_fasi_array = new anywheresoftware.b4a.objects.collections.List();
_fasi_array = _parser.NextArray();
RDebugUtils.currentLine=13893660;
 //BA.debugLineNum = 13893660;BA.debugLine="If fasi_array.Size = 0 Then";
if (_fasi_array.getSize()==0) { 
RDebugUtils.currentLine=13893661;
 //BA.debugLineNum = 13893661;BA.debugLine="FunctionAll.ExecuteRemoteQuery(\"DELETE FROM w";
mostCurrent._functionall._executeremotequery(mostCurrent.activityBA,"DELETE FROM worship_building_facilities WHERE facility_id="+BA.NumberToString(_idelete),"Delete",addfacilitytype.getObject());
 }else {
RDebugUtils.currentLine=13893663;
 //BA.debugLineNum = 13893663;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=13893664;
 //BA.debugLineNum = 13893664;BA.debugLine="Msgbox(\"Ada Error\"& Job.ErrorMessage,\"Error\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Ada Error"+_job._errormessage),BA.ObjectToCharSequence("Error"),mostCurrent.activityBA);
 };
 break; }
case 2: {
RDebugUtils.currentLine=13893668;
 //BA.debugLineNum = 13893668;BA.debugLine="Dim fasi_array As List = parser.NextArray";
_fasi_array = new anywheresoftware.b4a.objects.collections.List();
_fasi_array = _parser.NextArray();
RDebugUtils.currentLine=13893669;
 //BA.debugLineNum = 13893669;BA.debugLine="If fasi_array.Size = 0 Then";
if (_fasi_array.getSize()==0) { 
RDebugUtils.currentLine=13893670;
 //BA.debugLineNum = 13893670;BA.debugLine="Try";
try {RDebugUtils.currentLine=13893671;
 //BA.debugLineNum = 13893671;BA.debugLine="CLVFac.Clear";
mostCurrent._clvfac._clear();
RDebugUtils.currentLine=13893672;
 //BA.debugLineNum = 13893672;BA.debugLine="FunctionAll.ExecuteRemoteQuery(\"SELECT * FRO";
mostCurrent._functionall._executeremotequery(mostCurrent.activityBA,"SELECT * FROM worship_building_facilities ORDER BY name_of_facility ASC","Worship",addfacilitytype.getObject());
RDebugUtils.currentLine=13893673;
 //BA.debugLineNum = 13893673;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=13893674;
 //BA.debugLineNum = 13893674;BA.debugLine="ToastMessageShow(\"Deleted\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Deleted"),anywheresoftware.b4a.keywords.Common.False);
 } 
       catch (Exception e42) {
			processBA.setLastException(e42);RDebugUtils.currentLine=13893676;
 //BA.debugLineNum = 13893676;BA.debugLine="Msgbox(\"Error ???\" , \"error\" )";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Error ???"),BA.ObjectToCharSequence("error"),mostCurrent.activityBA);
RDebugUtils.currentLine=13893677;
 //BA.debugLineNum = 13893677;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 };
 }else {
RDebugUtils.currentLine=13893680;
 //BA.debugLineNum = 13893680;BA.debugLine="Try";
try {RDebugUtils.currentLine=13893681;
 //BA.debugLineNum = 13893681;BA.debugLine="Msgbox(\"can't update data\" , \"Failed\" )";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("can't update data"),BA.ObjectToCharSequence("Failed"),mostCurrent.activityBA);
 } 
       catch (Exception e49) {
			processBA.setLastException(e49);RDebugUtils.currentLine=13893683;
 //BA.debugLineNum = 13893683;BA.debugLine="Msgbox(\"Error ???\" , \"error\" )";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Error ???"),BA.ObjectToCharSequence("error"),mostCurrent.activityBA);
RDebugUtils.currentLine=13893684;
 //BA.debugLineNum = 13893684;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 };
 };
 break; }
case 3: {
RDebugUtils.currentLine=13893688;
 //BA.debugLineNum = 13893688;BA.debugLine="Dim fasi_array As List = parser.NextArray";
_fasi_array = new anywheresoftware.b4a.objects.collections.List();
_fasi_array = _parser.NextArray();
RDebugUtils.currentLine=13893689;
 //BA.debugLineNum = 13893689;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=13893690;
 //BA.debugLineNum = 13893690;BA.debugLine="For c=0 To fasi_array.Size - 1";
{
final int step56 = 1;
final int limit56 = (int) (_fasi_array.getSize()-1);
_c = (int) (0) ;
for (;(step56 > 0 && _c <= limit56) || (step56 < 0 && _c >= limit56) ;_c = ((int)(0 + _c + step56))  ) {
RDebugUtils.currentLine=13893691;
 //BA.debugLineNum = 13893691;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13893692;
 //BA.debugLineNum = 13893692;BA.debugLine="a = fasi_array.Get(c)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_fasi_array.Get(_c)));
RDebugUtils.currentLine=13893694;
 //BA.debugLineNum = 13893694;BA.debugLine="Dim id As String";
_id = "";
RDebugUtils.currentLine=13893695;
 //BA.debugLineNum = 13893695;BA.debugLine="id = a.Get(\"id\")";
_id = BA.ObjectToString(_a.Get((Object)("id")));
RDebugUtils.currentLine=13893696;
 //BA.debugLineNum = 13893696;BA.debugLine="Log(id)";
anywheresoftware.b4a.keywords.Common.Log(_id);
 }
};
RDebugUtils.currentLine=13893698;
 //BA.debugLineNum = 13893698;BA.debugLine="Dim id2 As Int =id + 1";
_id2 = (int) ((double)(Double.parseDouble(_id))+1);
RDebugUtils.currentLine=13893699;
 //BA.debugLineNum = 13893699;BA.debugLine="FunctionAll.ExecuteRemoteQuery(\"INSERT INTO wo";
mostCurrent._functionall._executeremotequery(mostCurrent.activityBA,"INSERT INTO worship_building_facilities (facility_id, name_of_facility) VALUES ("+BA.NumberToString(_id2)+",'"+mostCurrent._editname.getText()+"')","AddSuccess",addfacilitytype.getObject());
 break; }
case 4: {
RDebugUtils.currentLine=13893701;
 //BA.debugLineNum = 13893701;BA.debugLine="Try";
try {RDebugUtils.currentLine=13893702;
 //BA.debugLineNum = 13893702;BA.debugLine="CLVFac.Clear";
mostCurrent._clvfac._clear();
RDebugUtils.currentLine=13893703;
 //BA.debugLineNum = 13893703;BA.debugLine="FunctionAll.ExecuteRemoteQuery(\"SELECT * FROM";
mostCurrent._functionall._executeremotequery(mostCurrent.activityBA,"SELECT * FROM worship_building_facilities ORDER BY name_of_facility ASC","Worship",addfacilitytype.getObject());
RDebugUtils.currentLine=13893704;
 //BA.debugLineNum = 13893704;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=13893705;
 //BA.debugLineNum = 13893705;BA.debugLine="ToastMessageShow(\"Added!\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Added!"),anywheresoftware.b4a.keywords.Common.False);
 } 
       catch (Exception e72) {
			processBA.setLastException(e72);RDebugUtils.currentLine=13893707;
 //BA.debugLineNum = 13893707;BA.debugLine="ToastMessageShow(\"Failed!\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Failed!"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=13893708;
 //BA.debugLineNum = 13893708;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 };
 break; }
}
;
 };
RDebugUtils.currentLine=13893712;
 //BA.debugLineNum = 13893712;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=13893713;
 //BA.debugLineNum = 13893713;BA.debugLine="End Sub";
return "";
}
}