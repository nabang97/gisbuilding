package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class showimage_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (showimage) ","showimage",25,showimage.mostCurrent.activityBA,showimage.mostCurrent,15);
if (RapidSub.canDelegate("activity_create")) return b4a.example.showimage.remoteMe.runUserSub(false, "showimage","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 15;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 19;BA.debugLine="ImageShow.Initialize(\"ImageShow\")";
Debug.ShouldStop(262144);
showimage.mostCurrent._imageshow.runVoidMethod ("Initialize",showimage.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ImageShow")));
 BA.debugLineNum = 20;BA.debugLine="Activity.AddView(ImageShow, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(524288);
showimage.mostCurrent._activity.runVoidMethod ("AddView",(Object)((showimage.mostCurrent._imageshow.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(showimage.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),showimage.mostCurrent.activityBA)),(Object)(showimage.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),showimage.mostCurrent.activityBA)));
 BA.debugLineNum = 21;BA.debugLine="ImageShow.Gravity=Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(1048576);
showimage.mostCurrent._imageshow.runMethod(true,"setGravity",showimage.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"));
 BA.debugLineNum = 22;BA.debugLine="If mBmp.IsInitialized Then";
Debug.ShouldStop(2097152);
if (showimage._mbmp.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 23;BA.debugLine="ImageShow.SetBitmap(mBmp)";
Debug.ShouldStop(4194304);
showimage.mostCurrent._imageshow.runVoidMethod ("SetBitmap",showimage.mostCurrent.activityBA,(Object)((showimage._mbmp.getObject())));
 };
 BA.debugLineNum = 25;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(16777216);
if (_firsttime.<Boolean>get().booleanValue()) { 
 };
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (showimage) ","showimage",25,showimage.mostCurrent.activityBA,showimage.mostCurrent,30);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.showimage.remoteMe.runUserSub(false, "showimage","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="TouchImageViewRect=ImageShow.GetDestRect";
Debug.ShouldStop(1073741824);
showimage._touchimageviewrect = showimage.mostCurrent._imageshow.runMethod(false,"GetDestRect");
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlog_click() throws Exception{
try {
		Debug.PushSubsStack("CreateLog_Click (showimage) ","showimage",25,showimage.mostCurrent.activityBA,showimage.mostCurrent,34);
if (RapidSub.canDelegate("createlog_click")) return b4a.example.showimage.remoteMe.runUserSub(false, "showimage","createlog_click");
 BA.debugLineNum = 34;BA.debugLine="Sub CreateLog_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="ImageShow.CreateLog";
Debug.ShouldStop(4);
showimage.mostCurrent._imageshow.runVoidMethod ("CreateLog");
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 12;BA.debugLine="Dim ImageShow As TouchImageView";
showimage.mostCurrent._imageshow = RemoteObject.createNew ("uk.co.martinpearman.b4a.touchimageview.TouchImageViewWrapper");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imageshow_click(RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("ImageShow_Click (showimage) ","showimage",25,showimage.mostCurrent.activityBA,showimage.mostCurrent,38);
if (RapidSub.canDelegate("imageshow_click")) return b4a.example.showimage.remoteMe.runUserSub(false, "showimage","imageshow_click", _x, _y);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 38;BA.debugLine="Sub ImageShow_Click(X As Int, Y As Int)";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Log(\"Click X=\"&X&\", Y=\"&Y)";
Debug.ShouldStop(64);
showimage.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Click X="),_x,RemoteObject.createImmutable(", Y="),_y)));
 BA.debugLineNum = 43;BA.debugLine="ImageShow.PreScale(1.05, X, Y)";
Debug.ShouldStop(1024);
showimage.mostCurrent._imageshow.runVoidMethod ("PreScale",(Object)(BA.numberCast(float.class, 1.05)),(Object)(_x),(Object)(_y));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imageshow_longclick(RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("ImageShow_LongClick (showimage) ","showimage",25,showimage.mostCurrent.activityBA,showimage.mostCurrent,46);
if (RapidSub.canDelegate("imageshow_longclick")) return b4a.example.showimage.remoteMe.runUserSub(false, "showimage","imageshow_longclick", _x, _y);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 46;BA.debugLine="Sub ImageShow_LongClick(X As Int, Y As Int)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Log(\"LongClick X=\"&X&\", Y=\"&Y)";
Debug.ShouldStop(16384);
showimage.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("LongClick X="),_x,RemoteObject.createImmutable(", Y="),_y)));
 BA.debugLineNum = 51;BA.debugLine="ImageShow.PreScale(1/ImageShow.ScaleX, X, Y)";
Debug.ShouldStop(262144);
showimage.mostCurrent._imageshow.runVoidMethod ("PreScale",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),showimage.mostCurrent._imageshow.runMethod(true,"getScaleX")}, "/",0, 0))),(Object)(_x),(Object)(_y));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private mBmp As Bitmap";
showimage._mbmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 8;BA.debugLine="Dim SourceImageRect, TouchImageViewRect As Rect";
showimage._sourceimagerect = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
showimage._touchimageviewrect = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _show(RemoteObject _bmp) throws Exception{
try {
		Debug.PushSubsStack("Show (showimage) ","showimage",25,showimage.mostCurrent.activityBA,showimage.mostCurrent,54);
if (RapidSub.canDelegate("show")) return b4a.example.showimage.remoteMe.runUserSub(false, "showimage","show", _bmp);
Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 54;BA.debugLine="Sub Show(bmp As Bitmap)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 72;BA.debugLine="mBmp = bmp";
Debug.ShouldStop(128);
showimage._mbmp = _bmp;
 BA.debugLineNum = 73;BA.debugLine="ImageShow.SetBitmap(mBmp)";
Debug.ShouldStop(256);
showimage.mostCurrent._imageshow.runVoidMethod ("SetBitmap",showimage.mostCurrent.activityBA,(Object)((showimage._mbmp.getObject())));
 BA.debugLineNum = 74;BA.debugLine="SourceImageRect.Initialize(0,0,mBmp.Width, mBmp.H";
Debug.ShouldStop(512);
showimage._sourceimagerect.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(showimage._mbmp.runMethod(true,"getWidth")),(Object)(showimage._mbmp.runMethod(true,"getHeight")));
 BA.debugLineNum = 75;BA.debugLine="TouchImageViewRect.Initialize(0,0,100%x,100%y)";
Debug.ShouldStop(1024);
showimage._touchimageviewrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(showimage.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),showimage.mostCurrent.activityBA)),(Object)(showimage.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),showimage.mostCurrent.activityBA)));
 BA.debugLineNum = 76;BA.debugLine="ImageShow.ScaleSrcRectToDestRect(SourceImageRect,";
Debug.ShouldStop(2048);
showimage.mostCurrent._imageshow.runVoidMethod ("ScaleSrcRectToDestRect",(Object)((showimage._sourceimagerect.getObject())),(Object)((showimage._touchimageviewrect.getObject())),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}