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

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
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
		return main.class;
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
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (main) Resume **");
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
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        anywheresoftware.b4a.samples.httputils2.httputils2service._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (officedetail.mostCurrent != null);
vis = vis | (searchbuilding.mostCurrent != null);
vis = vis | (educationaldetail.mostCurrent != null);
vis = vis | (healthdetail.mostCurrent != null);
vis = vis | (housedetail.mostCurrent != null);
vis = vis | (msmedetail.mostCurrent != null);
vis = vis | (worshipdetail.mostCurrent != null);
vis = vis | (manualposition.mostCurrent != null);
vis = vis | (home.mostCurrent != null);
vis = vis | (homeadmin.mostCurrent != null);
vis = vis | (login.mostCurrent != null);
vis = vis | (addfacilitytype.mostCurrent != null);
vis = vis | (editbuildingfacility.mostCurrent != null);
vis = vis | (addbuildingfacility.mostCurrent != null);
vis = vis | (officeedit.mostCurrent != null);
vis = vis | (msmebuilding.mostCurrent != null);
vis = vis | (worshipbuilding.mostCurrent != null);
vis = vis | (addphoto.mostCurrent != null);
vis = vis | (loaderimage.mostCurrent != null);
vis = vis | (maincamera.mostCurrent != null);
vis = vis | (showimage.mostCurrent != null);
vis = vis | (browsegallery.mostCurrent != null);
vis = vis | (educationaledit.mostCurrent != null);
vis = vis | (housebuilding.mostCurrent != null);
vis = vis | (worshipedit.mostCurrent != null);
vis = vis | (healthbuilding.mostCurrent != null);
vis = vis | (gallery.mostCurrent != null);
vis = vis | (officebuilding.mostCurrent != null);
vis = vis | (educationalbuilding.mostCurrent != null);
vis = vis | (msmeedit.mostCurrent != null);
vis = vis | (buildinglist.mostCurrent != null);
vis = vis | (help.mostCurrent != null);
vis = vis | (healthedit.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
 {
            Activity __a = null;
            if (officedetail.previousOne != null) {
				__a = officedetail.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(officedetail.mostCurrent == null ? null : officedetail.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (searchbuilding.previousOne != null) {
				__a = searchbuilding.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(searchbuilding.mostCurrent == null ? null : searchbuilding.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (educationaldetail.previousOne != null) {
				__a = educationaldetail.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(educationaldetail.mostCurrent == null ? null : educationaldetail.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (healthdetail.previousOne != null) {
				__a = healthdetail.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(healthdetail.mostCurrent == null ? null : healthdetail.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (housedetail.previousOne != null) {
				__a = housedetail.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(housedetail.mostCurrent == null ? null : housedetail.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (msmedetail.previousOne != null) {
				__a = msmedetail.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(msmedetail.mostCurrent == null ? null : msmedetail.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (worshipdetail.previousOne != null) {
				__a = worshipdetail.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(worshipdetail.mostCurrent == null ? null : worshipdetail.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (manualposition.previousOne != null) {
				__a = manualposition.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(manualposition.mostCurrent == null ? null : manualposition.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (home.previousOne != null) {
				__a = home.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(home.mostCurrent == null ? null : home.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (homeadmin.previousOne != null) {
				__a = homeadmin.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(homeadmin.mostCurrent == null ? null : homeadmin.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (login.previousOne != null) {
				__a = login.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(login.mostCurrent == null ? null : login.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (addfacilitytype.previousOne != null) {
				__a = addfacilitytype.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(addfacilitytype.mostCurrent == null ? null : addfacilitytype.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (editbuildingfacility.previousOne != null) {
				__a = editbuildingfacility.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(editbuildingfacility.mostCurrent == null ? null : editbuildingfacility.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (addbuildingfacility.previousOne != null) {
				__a = addbuildingfacility.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(addbuildingfacility.mostCurrent == null ? null : addbuildingfacility.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (officeedit.previousOne != null) {
				__a = officeedit.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(officeedit.mostCurrent == null ? null : officeedit.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (msmebuilding.previousOne != null) {
				__a = msmebuilding.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(msmebuilding.mostCurrent == null ? null : msmebuilding.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (worshipbuilding.previousOne != null) {
				__a = worshipbuilding.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(worshipbuilding.mostCurrent == null ? null : worshipbuilding.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (addphoto.previousOne != null) {
				__a = addphoto.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(addphoto.mostCurrent == null ? null : addphoto.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (loaderimage.previousOne != null) {
				__a = loaderimage.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(loaderimage.mostCurrent == null ? null : loaderimage.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (maincamera.previousOne != null) {
				__a = maincamera.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(maincamera.mostCurrent == null ? null : maincamera.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, fileutil.class));
 {
            Activity __a = null;
            if (showimage.previousOne != null) {
				__a = showimage.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(showimage.mostCurrent == null ? null : showimage.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (browsegallery.previousOne != null) {
				__a = browsegallery.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(browsegallery.mostCurrent == null ? null : browsegallery.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (educationaledit.previousOne != null) {
				__a = educationaledit.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(educationaledit.mostCurrent == null ? null : educationaledit.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (housebuilding.previousOne != null) {
				__a = housebuilding.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(housebuilding.mostCurrent == null ? null : housebuilding.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (worshipedit.previousOne != null) {
				__a = worshipedit.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(worshipedit.mostCurrent == null ? null : worshipedit.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (healthbuilding.previousOne != null) {
				__a = healthbuilding.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(healthbuilding.mostCurrent == null ? null : healthbuilding.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (gallery.previousOne != null) {
				__a = gallery.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(gallery.mostCurrent == null ? null : gallery.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (officebuilding.previousOne != null) {
				__a = officebuilding.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(officebuilding.mostCurrent == null ? null : officebuilding.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (educationalbuilding.previousOne != null) {
				__a = educationalbuilding.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(educationalbuilding.mostCurrent == null ? null : educationalbuilding.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (msmeedit.previousOne != null) {
				__a = msmeedit.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(msmeedit.mostCurrent == null ? null : msmeedit.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (buildinglist.previousOne != null) {
				__a = buildinglist.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(buildinglist.mostCurrent == null ? null : buildinglist.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (help.previousOne != null) {
				__a = help.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(help.mostCurrent == null ? null : help.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (healthedit.previousOne != null) {
				__a = healthedit.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(healthedit.mostCurrent == null ? null : healthedit.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

}
public anywheresoftware.b4a.keywords.Common __c = null;
public static b4a.example3.keyvaluestore _kvs = null;
public static anywheresoftware.b4a.objects.Timer _tmsplash = null;
public static String _server = "";
public static String _servermap = "";
public static String _lbllon = "";
public static String _lbllat = "";
public static String _lblspeed = "";
public static String _lblsatellites = "";
public static anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static String _folder = "";
public static boolean _shouldiclose = false;
public anywheresoftware.b4a.objects.ButtonWrapper _btnguest = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnadmin = null;
public flm.b4a.animationplus.AnimationPlusWrapper _btanim = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblwelcome = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblwelcome2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsignin = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkbox1 = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
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
public ResumableSub_Activity_Create(b4a.example.main parent,boolean _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
b4a.example.main parent;
boolean _firsttime;
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _segoeui = null;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";
Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
if (true) return;
    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="CheckLoginSession";
_checkloginsession();
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="If FirstTime Then 'jika aplikasi pertama diaktifk";
if (true) break;

case 1:
//if
this.state = 6;
if (_firsttime) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="folder = rp.GetSafeDirDefaultExternal(\"data\")";
parent._folder = parent._rp.GetSafeDirDefaultExternal("data");
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="kvs.Initialize(folder, \"datastore\")";
parent._kvs._initialize(processBA,parent._folder,"datastore");
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="Activity.LoadLayout(\"splash\")";
parent.mostCurrent._activity.LoadLayout("splash",mostCurrent.activityBA);
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="AnimSplash 'Panggil function animasi splash scre";
_animsplash();
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="tmSplash.Initialize(\"tmSplash\",3500) 'panggil ev";
parent._tmsplash.Initialize(processBA,"tmSplash",(long) (3500));
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="tmSplash.Enabled = True 'aktifkan timer";
parent._tmsplash.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="Activity.RemoveAllViews 'Hapus Design pada layou";
parent.mostCurrent._activity.RemoveAllViews();
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="Activity.LoadLayout(\"Welcome\")";
parent.mostCurrent._activity.LoadLayout("Welcome",mostCurrent.activityBA);
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="Dim Segoeui As Typeface";
_segoeui = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="Segoeui =Typeface.LoadFromAssets(\"SEGOEUI.TTF\")";
_segoeui.setObject((android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("SEGOEUI.TTF")));
RDebugUtils.currentLine=131090;
 //BA.debugLineNum = 131090;BA.debugLine="LblWelcome2.Typeface = Segoeui";
parent.mostCurrent._lblwelcome2.setTypeface((android.graphics.Typeface)(_segoeui.getObject()));
RDebugUtils.currentLine=131091;
 //BA.debugLineNum = 131091;BA.debugLine="LblSignin.Typeface = Segoeui";
parent.mostCurrent._lblsignin.setTypeface((android.graphics.Typeface)(_segoeui.getObject()));
 if (true) break;
;
RDebugUtils.currentLine=131094;
 //BA.debugLineNum = 131094;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";

case 6:
//if
this.state = 17;
if (parent.mostCurrent._starter._gps1.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 17;
RDebugUtils.currentLine=131095;
 //BA.debugLineNum = 131095;BA.debugLine="ToastMessageShow(\"Please enable the GPS device.\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please enable the GPS device."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131096;
 //BA.debugLineNum = 131096;BA.debugLine="StartActivity(Starter.GPS1.LocationSettingsInten";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._starter._gps1.getLocationSettingsIntent()));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=131098;
 //BA.debugLineNum = 131098;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
parent.mostCurrent._starter._rp.CheckAndRequest(processBA,parent.mostCurrent._starter._rp.PERMISSION_ACCESS_FINE_LOCATION);
RDebugUtils.currentLine=131099;
 //BA.debugLineNum = 131099;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, this, null);
this.state = 18;
return;
case 18:
//C
this.state = 11;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=131100;
 //BA.debugLineNum = 131100;BA.debugLine="If Result Then CallSubDelayed(Starter, \"StartGPS";
if (true) break;

case 11:
//if
this.state = 16;
if (_result) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._starter.getObject()),"StartGPS");
if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = -1;
;
RDebugUtils.currentLine=131103;
 //BA.debugLineNum = 131103;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _checkloginsession() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkloginsession"))
	return (String) Debug.delegate(mostCurrent.activityBA, "checkloginsession", null);
boolean _islogin = false;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub CheckLoginSession()";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Dim isLogin As Boolean";
_islogin = false;
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="isLogin = Login.manager.GetBoolean(\"is_login\")";
_islogin = mostCurrent._login._manager.GetBoolean("is_login");
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="If isLogin Then";
if (_islogin) { 
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="StartActivity(HomeAdmin)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homeadmin.getObject()));
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="End Sub";
return "";
}
public static String  _animsplash() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "animsplash"))
	return (String) Debug.delegate(mostCurrent.activityBA, "animsplash", null);
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub AnimSplash()";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="If btAnim.IsInitialized Then";
if (mostCurrent._btanim.IsInitialized()) { 
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="btAnim.Stop(ImageView1)";
mostCurrent._btanim.Stop((android.view.View)(mostCurrent._imageview1.getObject()));
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="Activity.Invalidate";
mostCurrent._activity.Invalidate();
 };
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="btAnim.InitializeTranslate( \"AllFunction.btAnim\",";
mostCurrent._btanim.InitializeTranslate(mostCurrent.activityBA,"AllFunction.btAnim",(float) (0),(float) (-mostCurrent._activity.getHeight()),(float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))),(float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))));
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="btAnim.SetInterpolator(btAnim.INTERPOLATOR_BOUNCE";
mostCurrent._btanim.SetInterpolator(mostCurrent._btanim.INTERPOLATOR_BOUNCE);
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="btAnim.Duration = 1500";
mostCurrent._btanim.setDuration((long) (1500));
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="btAnim.Start(ImageView1)	'Jlaankan animasi pada o";
mostCurrent._btanim.Start((android.view.View)(mostCurrent._imageview1.getObject()));
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="FunctionAll.SetAnimation(\"zoom_enter\", \"zoom_exit";
mostCurrent._functionall._setanimation(mostCurrent.activityBA,"zoom_enter","zoom_exit");
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
String _path = "";
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="If ShouldIClose = True Then";
if (_shouldiclose==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="ShouldIClose = False";
_shouldiclose = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="Dim path As String";
_path = "";
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="path =folder";
_path = _folder;
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="If File.Exists(path,\"datastore\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_path,"datastore")) { 
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="Log(\"file datastore ada\")";
anywheresoftware.b4a.keywords.Common.Log("file datastore ada");
 }else {
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="Log(\"file datastore tidak ada\")";
anywheresoftware.b4a.keywords.Common.Log("file datastore tidak ada");
 };
RDebugUtils.currentLine=393229;
 //BA.debugLineNum = 393229;BA.debugLine="End Sub";
return "";
}
public static String  _btnadmin_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnadmin_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnadmin_click", null);
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub BtnAdmin_Click";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="StartActivity(Login)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._login.getObject()));
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="FunctionAll.SetAnimation(\"zoom_enter\", \"zoom_exit";
mostCurrent._functionall._setanimation(mostCurrent.activityBA,"zoom_enter","zoom_exit");
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="End Sub";
return "";
}
public static String  _btnguest_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnguest_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnguest_click", null);
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub BtnGuest_Click";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="StartActivity(Home)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._home.getObject()));
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="FunctionAll.SetAnimation(\"zoom_enter\", \"zoom_exit";
mostCurrent._functionall._setanimation(mostCurrent.activityBA,"zoom_enter","zoom_exit");
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="End Sub";
return "";
}
public static String  _tmsplash_tick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "tmsplash_tick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "tmsplash_tick", null);
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub tmSplash_Tick";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="tmSplash.Enabled = False 'disable timer";
_tmsplash.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="Activity.RemoveAllViews 'Hapus Design pada layout";
mostCurrent._activity.RemoveAllViews();
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="Activity.LoadLayout(\"Welcome\") 'load layout lyHom";
mostCurrent._activity.LoadLayout("Welcome",mostCurrent.activityBA);
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="End Sub";
return "";
}
}