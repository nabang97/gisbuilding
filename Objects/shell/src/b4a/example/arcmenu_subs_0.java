package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class arcmenu_subs_0 {


public static RemoteObject  _additem(RemoteObject __ref,RemoteObject _itemimage) throws Exception{
try {
		Debug.PushSubsStack("AddItem (arcmenu) ","arcmenu",16,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("additem")) return __ref.runUserSub(false, "arcmenu","additem", __ref, _itemimage);
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
Debug.locals.put("ItemImage", _itemimage);
 BA.debugLineNum = 84;BA.debugLine="Sub AddItem(ItemImage As Bitmap)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 86;BA.debugLine="Dim img As ImageView";
Debug.ShouldStop(2097152);
_img = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("img", _img);
 BA.debugLineNum = 87;BA.debugLine="img.Initialize(\"MenuItem\")";
Debug.ShouldStop(4194304);
_img.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MenuItem")));
 BA.debugLineNum = 88;BA.debugLine="img.Bitmap = ItemImage";
Debug.ShouldStop(8388608);
_img.runMethod(false,"setBitmap",(_itemimage.getObject()));
 BA.debugLineNum = 89;BA.debugLine="img.Tag = CurrentPosition";
Debug.ShouldStop(16777216);
_img.runMethod(false,"setTag",(__ref.getField(true,"_currentposition")));
 BA.debugLineNum = 90;BA.debugLine="img.Gravity = Gravity.FILL";
Debug.ShouldStop(33554432);
_img.runMethod(true,"setGravity",arcmenu.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 91;BA.debugLine="img.Visible = False";
Debug.ShouldStop(67108864);
_img.runMethod(true,"setVisible",arcmenu.__c.getField(true,"False"));
 BA.debugLineNum = 92;BA.debugLine="MenuItems.Add(img)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_menuitems").runVoidMethod ("Add",(Object)((_img.getObject())));
 BA.debugLineNum = 94;BA.debugLine="mActivity.AddView(img, CenterX - (MenuItemWidth /";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mactivity").runVoidMethod ("AddView",(Object)((_img.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_centerx"),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_menuitemwidth"),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_centery"),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_menuitemheight"),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0))),(Object)(__ref.getField(true,"_menuitemwidth")),(Object)(__ref.getField(true,"_menuitemheight")));
 BA.debugLineNum = 96;BA.debugLine="CurrentPosition = CurrentPosition + 1";
Debug.ShouldStop(-2147483648);
__ref.setField ("_currentposition",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentposition"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 97;BA.debugLine="img.SendToBack";
Debug.ShouldStop(1);
_img.runVoidMethod ("SendToBack");
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _animitemselected_animationend(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AnimItemSelected_AnimationEnd (arcmenu) ","arcmenu",16,__ref.getField(false, "ba"),__ref,178);
if (RapidSub.canDelegate("animitemselected_animationend")) return __ref.runUserSub(false, "arcmenu","animitemselected_animationend", __ref);
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
int _i = 0;
 BA.debugLineNum = 178;BA.debugLine="Private Sub AnimItemSelected_AnimationEnd";
Debug.ShouldStop(131072);
 BA.debugLineNum = 179;BA.debugLine="Dim img As ImageView";
Debug.ShouldStop(262144);
_img = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("img", _img);
 BA.debugLineNum = 181;BA.debugLine="For i = 0 To MenuItems.Size - 1";
Debug.ShouldStop(1048576);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_menuitems").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 182;BA.debugLine="img = MenuItems.Get(i)";
Debug.ShouldStop(2097152);
_img.setObject(__ref.getField(false,"_menuitems").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 183;BA.debugLine="img.Visible = False";
Debug.ShouldStop(4194304);
_img.runMethod(true,"setVisible",arcmenu.__c.getField(true,"False"));
 BA.debugLineNum = 184;BA.debugLine="img.Invalidate";
Debug.ShouldStop(8388608);
_img.runVoidMethod ("Invalidate");
 BA.debugLineNum = 185;BA.debugLine="Animator.Stop(img)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_animator").runVoidMethod ("Stop",(Object)((_img.getObject())));
 BA.debugLineNum = 186;BA.debugLine="img.Left = CenterX - (img.Width / 2)";
Debug.ShouldStop(33554432);
_img.runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_centerx"),(RemoteObject.solve(new RemoteObject[] {_img.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0)));
 BA.debugLineNum = 187;BA.debugLine="img.Top = CenterY - (img.Height / 2)";
Debug.ShouldStop(67108864);
_img.runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_centery"),(RemoteObject.solve(new RemoteObject[] {_img.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 189;BA.debugLine="menuOpen = False";
Debug.ShouldStop(268435456);
__ref.setField ("_menuopen",arcmenu.__c.getField(true,"False"));
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _animmenuitemmove_animationend(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AnimMenuItemMove_AnimationEnd (arcmenu) ","arcmenu",16,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("animmenuitemmove_animationend")) return __ref.runUserSub(false, "arcmenu","animmenuitemmove_animationend", __ref);
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _itemposition = RemoteObject.createImmutable(0);
 BA.debugLineNum = 153;BA.debugLine="Private Sub AnimMenuItemMove_AnimationEnd";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 155;BA.debugLine="Dim img As ImageView";
Debug.ShouldStop(67108864);
_img = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("img", _img);
 BA.debugLineNum = 156;BA.debugLine="Dim ItemPosition As Int";
Debug.ShouldStop(134217728);
_itemposition = RemoteObject.createImmutable(0);Debug.locals.put("ItemPosition", _itemposition);
 BA.debugLineNum = 157;BA.debugLine="If menuOpen = False Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_menuopen"),arcmenu.__c.getField(true,"False"))) { 
 BA.debugLineNum = 158;BA.debugLine="ItemPosition = (MenuItems.Size - 1) - AnimationE";
Debug.ShouldStop(536870912);
_itemposition = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_menuitems").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)),__ref.getField(true,"_animationendcount")}, "-",1, 1);Debug.locals.put("ItemPosition", _itemposition);
 }else {
 BA.debugLineNum = 160;BA.debugLine="ItemPosition = AnimationEndCount";
Debug.ShouldStop(-2147483648);
_itemposition = __ref.getField(true,"_animationendcount");Debug.locals.put("ItemPosition", _itemposition);
 };
 BA.debugLineNum = 163;BA.debugLine="img = MenuItems.Get(ItemPosition)";
Debug.ShouldStop(4);
_img.setObject(__ref.getField(false,"_menuitems").runMethod(false,"Get",(Object)(_itemposition)));
 BA.debugLineNum = 165;BA.debugLine="If Not(menuOpen) Then img.Visible = False";
Debug.ShouldStop(16);
if (arcmenu.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_menuopen"))).<Boolean>get().booleanValue()) { 
_img.runMethod(true,"setVisible",arcmenu.__c.getField(true,"False"));};
 BA.debugLineNum = 166;BA.debugLine="img.Invalidate";
Debug.ShouldStop(32);
_img.runVoidMethod ("Invalidate");
 BA.debugLineNum = 167;BA.debugLine="AnimMenuItemMove.Stop(img)";
Debug.ShouldStop(64);
__ref.getField(false,"_animmenuitemmove").runVoidMethod ("Stop",(Object)((_img.getObject())));
 BA.debugLineNum = 168;BA.debugLine="UpdateMenuItemPosition(MenuItems.Get(ItemPosition";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.arcmenu.class, "_updatemenuitemposition",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), __ref.getField(false,"_menuitems").runMethod(false,"Get",(Object)(_itemposition))),(Object)(_itemposition));
 BA.debugLineNum = 169;BA.debugLine="If AnimationEndCount = MenuItems.Size - 1 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_animationendcount"),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_menuitems").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 170;BA.debugLine="IsAnimating = False";
Debug.ShouldStop(512);
__ref.setField ("_isanimating",arcmenu.__c.getField(true,"False"));
 BA.debugLineNum = 171;BA.debugLine="If SubExists(mModule, mEventName & \"_AnimationEn";
Debug.ShouldStop(1024);
if (arcmenu.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_AnimationEnd")))).<Boolean>get().booleanValue()) { 
arcmenu.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_AnimationEnd"))),(Object)((__ref.getField(true,"_menuopen"))));};
 }else {
 BA.debugLineNum = 173;BA.debugLine="AnimationEndCount = AnimationEndCount + 1";
Debug.ShouldStop(4096);
__ref.setField ("_animationendcount",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_animationendcount"),RemoteObject.createImmutable(1)}, "+",1, 1));
 };
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private MenuItems, MenuItemNewX, MenuItemNewY As";
arcmenu._menuitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_menuitems",arcmenu._menuitems);
arcmenu._menuitemnewx = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_menuitemnewx",arcmenu._menuitemnewx);
arcmenu._menuitemnewy = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_menuitemnewy",arcmenu._menuitemnewy);
 //BA.debugLineNum = 6;BA.debugLine="Private Animator, AnimMenuItemRotate, AnimMenuIte";
arcmenu._animator = RemoteObject.createNew ("flm.b4a.animationplus.AnimationPlusWrapper");__ref.setField("_animator",arcmenu._animator);
arcmenu._animmenuitemrotate = RemoteObject.createNew ("flm.b4a.animationplus.AnimationPlusWrapper");__ref.setField("_animmenuitemrotate",arcmenu._animmenuitemrotate);
arcmenu._animmenuitemmove = RemoteObject.createNew ("flm.b4a.animationplus.AnimationPlusWrapper");__ref.setField("_animmenuitemmove",arcmenu._animmenuitemmove);
 //BA.debugLineNum = 7;BA.debugLine="Private AnimSet As AnimationSet";
arcmenu._animset = RemoteObject.createNew ("flm.b4a.animationplus.AnimationSet");__ref.setField("_animset",arcmenu._animset);
 //BA.debugLineNum = 8;BA.debugLine="Private IsAnimating As Boolean = False";
arcmenu._isanimating = arcmenu.__c.getField(true,"False");__ref.setField("_isanimating",arcmenu._isanimating);
 //BA.debugLineNum = 9;BA.debugLine="Private staticMenuButton, animatedMenuButton As I";
arcmenu._staticmenubutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_staticmenubutton",arcmenu._staticmenubutton);
arcmenu._animatedmenubutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_animatedmenubutton",arcmenu._animatedmenubutton);
 //BA.debugLineNum = 10;BA.debugLine="Private mEventName As String";
arcmenu._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",arcmenu._meventname);
 //BA.debugLineNum = 11;BA.debugLine="Private mActivity As Activity";
arcmenu._mactivity = RemoteObject.createNew ("anywheresoftware.b4a.objects.ActivityWrapper");__ref.setField("_mactivity",arcmenu._mactivity);
 //BA.debugLineNum = 12;BA.debugLine="Private mModule As Object";
arcmenu._mmodule = RemoteObject.createNew ("Object");__ref.setField("_mmodule",arcmenu._mmodule);
 //BA.debugLineNum = 13;BA.debugLine="Private CenterX, CenterY As Int";
arcmenu._centerx = RemoteObject.createImmutable(0);__ref.setField("_centerx",arcmenu._centerx);
arcmenu._centery = RemoteObject.createImmutable(0);__ref.setField("_centery",arcmenu._centery);
 //BA.debugLineNum = 14;BA.debugLine="Private menuOpen As Boolean = False";
arcmenu._menuopen = arcmenu.__c.getField(true,"False");__ref.setField("_menuopen",arcmenu._menuopen);
 //BA.debugLineNum = 15;BA.debugLine="Private CurrentPosition As Int = 1";
arcmenu._currentposition = BA.numberCast(int.class, 1);__ref.setField("_currentposition",arcmenu._currentposition);
 //BA.debugLineNum = 16;BA.debugLine="Private AnimationEndCount As Int = 0";
arcmenu._animationendcount = BA.numberCast(int.class, 0);__ref.setField("_animationendcount",arcmenu._animationendcount);
 //BA.debugLineNum = 17;BA.debugLine="Private MenuItemAnimationDelay As Int = 80";
arcmenu._menuitemanimationdelay = BA.numberCast(int.class, 80);__ref.setField("_menuitemanimationdelay",arcmenu._menuitemanimationdelay);
 //BA.debugLineNum = 20;BA.debugLine="Private StaticMenuButtonWidth As Int = 52dip";
arcmenu._staticmenubuttonwidth = arcmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)));__ref.setField("_staticmenubuttonwidth",arcmenu._staticmenubuttonwidth);
 //BA.debugLineNum = 21;BA.debugLine="Private StaticMenuButtonHeight As Int = 52dip";
arcmenu._staticmenubuttonheight = arcmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)));__ref.setField("_staticmenubuttonheight",arcmenu._staticmenubuttonheight);
 //BA.debugLineNum = 22;BA.debugLine="Private AnimatedMenuButtonWidth As Int = 20dip";
arcmenu._animatedmenubuttonwidth = arcmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)));__ref.setField("_animatedmenubuttonwidth",arcmenu._animatedmenubuttonwidth);
 //BA.debugLineNum = 23;BA.debugLine="Private AnimatedMenuButtonHeight As Int = 20dip";
arcmenu._animatedmenubuttonheight = arcmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)));__ref.setField("_animatedmenubuttonheight",arcmenu._animatedmenubuttonheight);
 //BA.debugLineNum = 24;BA.debugLine="Private MenuItemWidth As Int = 40dip";
arcmenu._menuitemwidth = arcmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)));__ref.setField("_menuitemwidth",arcmenu._menuitemwidth);
 //BA.debugLineNum = 25;BA.debugLine="Private MenuItemHeight As Int = 40dip";
arcmenu._menuitemheight = arcmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)));__ref.setField("_menuitemheight",arcmenu._menuitemheight);
 //BA.debugLineNum = 26;BA.debugLine="Private StartDegrees As Int = -90";
arcmenu._startdegrees = BA.numberCast(int.class, -(double) (0 + 90));__ref.setField("_startdegrees",arcmenu._startdegrees);
 //BA.debugLineNum = 27;BA.debugLine="Private DegreesSpan As Int = 90";
arcmenu._degreesspan = BA.numberCast(int.class, 90);__ref.setField("_degreesspan",arcmenu._degreesspan);
 //BA.debugLineNum = 28;BA.debugLine="Private ItemRadius As Int = 120dip";
arcmenu._itemradius = arcmenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)));__ref.setField("_itemradius",arcmenu._itemradius);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getmenuitemanimation(RemoteObject __ref,RemoteObject _menuitem,RemoteObject _open) throws Exception{
try {
		Debug.PushSubsStack("GetMenuItemAnimation (arcmenu) ","arcmenu",16,__ref.getField(false, "ba"),__ref,271);
if (RapidSub.canDelegate("getmenuitemanimation")) return __ref.runUserSub(false, "arcmenu","getmenuitemanimation", __ref, _menuitem, _open);
RemoteObject _subanimset = RemoteObject.declareNull("flm.b4a.animationplus.AnimationSet");
RemoteObject _tox = RemoteObject.createImmutable(0);
RemoteObject _toy = RemoteObject.createImmutable(0);
RemoteObject _itemposition = RemoteObject.createImmutable(0);
RemoteObject _degreesperitem = RemoteObject.createImmutable(0f);
RemoteObject _degreeradians = RemoteObject.createImmutable(0f);
Debug.locals.put("MenuItem", _menuitem);
Debug.locals.put("Open", _open);
 BA.debugLineNum = 271;BA.debugLine="Private Sub GetMenuItemAnimation(MenuItem As Image";
Debug.ShouldStop(16384);
 BA.debugLineNum = 272;BA.debugLine="Dim SubAnimSet As AnimationSet";
Debug.ShouldStop(32768);
_subanimset = RemoteObject.createNew ("flm.b4a.animationplus.AnimationSet");Debug.locals.put("SubAnimSet", _subanimset);
 BA.debugLineNum = 273;BA.debugLine="Dim ToX, ToY, ItemPosition As Int";
Debug.ShouldStop(65536);
_tox = RemoteObject.createImmutable(0);Debug.locals.put("ToX", _tox);
_toy = RemoteObject.createImmutable(0);Debug.locals.put("ToY", _toy);
_itemposition = RemoteObject.createImmutable(0);Debug.locals.put("ItemPosition", _itemposition);
 BA.debugLineNum = 274;BA.debugLine="Dim DegreesPerItem, DegreeRadians As Float";
Debug.ShouldStop(131072);
_degreesperitem = RemoteObject.createImmutable(0f);Debug.locals.put("DegreesPerItem", _degreesperitem);
_degreeradians = RemoteObject.createImmutable(0f);Debug.locals.put("DegreeRadians", _degreeradians);
 BA.debugLineNum = 276;BA.debugLine="SubAnimSet.Initialize(False)";
Debug.ShouldStop(524288);
_subanimset.runVoidMethod ("Initialize",(Object)(arcmenu.__c.getField(true,"False")));
 BA.debugLineNum = 278;BA.debugLine="ItemPosition = MenuItem.Tag";
Debug.ShouldStop(2097152);
_itemposition = BA.numberCast(int.class, _menuitem.runMethod(false,"getTag"));Debug.locals.put("ItemPosition", _itemposition);
 BA.debugLineNum = 280;BA.debugLine="If DegreesSpan = 360 Then DegreesSpan = 360 - (36";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_degreesspan"),BA.numberCast(double.class, 360))) { 
__ref.setField ("_degreesspan",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),__ref.getField(false,"_menuitems").runMethod(true,"getSize")}, "/",0, 0))}, "-",1, 0)));};
 BA.debugLineNum = 282;BA.debugLine="If MenuItems.Size > 1 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_menuitems").runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 283;BA.debugLine="DegreesPerItem = DegreesSpan / (MenuItems.Size -";
Debug.ShouldStop(67108864);
_degreesperitem = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_degreesspan"),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_menuitems").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))}, "/",0, 0));Debug.locals.put("DegreesPerItem", _degreesperitem);
 }else {
 BA.debugLineNum = 285;BA.debugLine="DegreesPerItem = DegreesSpan";
Debug.ShouldStop(268435456);
_degreesperitem = BA.numberCast(float.class, __ref.getField(true,"_degreesspan"));Debug.locals.put("DegreesPerItem", _degreesperitem);
 };
 BA.debugLineNum = 287;BA.debugLine="DegreeRadians = (StartDegrees + (DegreesPerItem *";
Debug.ShouldStop(1073741824);
_degreeradians = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_startdegrees"),(RemoteObject.solve(new RemoteObject[] {_degreesperitem,(RemoteObject.solve(new RemoteObject[] {_itemposition,RemoteObject.createImmutable(1)}, "-",1, 1))}, "*",0, 0))}, "+",1, 0)),arcmenu.__c.getField(true,"cPI"),RemoteObject.createImmutable(180)}, "*/",0, 0));Debug.locals.put("DegreeRadians", _degreeradians);
 BA.debugLineNum = 289;BA.debugLine="ToY = (ItemRadius * (Cos(DegreeRadians)))";
Debug.ShouldStop(1);
_toy = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_itemradius"),(arcmenu.__c.runMethod(true,"Cos",(Object)(BA.numberCast(double.class, _degreeradians))))}, "*",0, 0)));Debug.locals.put("ToY", _toy);
 BA.debugLineNum = 290;BA.debugLine="ToX = (ItemRadius * (Sin(DegreeRadians)))";
Debug.ShouldStop(2);
_tox = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_itemradius"),(arcmenu.__c.runMethod(true,"Sin",(Object)(BA.numberCast(double.class, _degreeradians))))}, "*",0, 0)));Debug.locals.put("ToX", _tox);
 BA.debugLineNum = 291;BA.debugLine="If Open Then";
Debug.ShouldStop(4);
if (_open.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 292;BA.debugLine="MenuItem.Visible = True";
Debug.ShouldStop(8);
_menuitem.runMethod(true,"setVisible",arcmenu.__c.getField(true,"True"));
 BA.debugLineNum = 293;BA.debugLine="AnimMenuItemRotate.InitializeRotateCenter(\"\", 0,";
Debug.ShouldStop(16);
__ref.getField(false,"_animmenuitemrotate").runVoidMethod ("InitializeRotateCenter",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 360)),(Object)((_menuitem.getObject())));
 BA.debugLineNum = 294;BA.debugLine="AnimMenuItemMove.InitializeTranslate(\"AnimMenuIt";
Debug.ShouldStop(32);
__ref.getField(false,"_animmenuitemmove").runVoidMethod ("InitializeTranslate",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("AnimMenuItemMove")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _tox)),(Object)(BA.numberCast(float.class, -(double) (0 + _toy.<Integer>get().intValue()))));
 BA.debugLineNum = 295;BA.debugLine="SubAnimSet.StartOffset = MenuItemAnimationDelay";
Debug.ShouldStop(64);
_subanimset.runMethod(true,"setStartOffset",BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_menuitemanimationdelay"),_itemposition}, "*",0, 1)));
 BA.debugLineNum = 296;BA.debugLine="AnimMenuItemMove.SetInterpolator(AnimMenuItemMov";
Debug.ShouldStop(128);
__ref.getField(false,"_animmenuitemmove").runVoidMethod ("SetInterpolator",(Object)(__ref.getField(false,"_animmenuitemmove").getField(true,"INTERPOLATOR_OVERSHOOT")));
 BA.debugLineNum = 297;BA.debugLine="MenuItemNewX.Add(MenuItem.Left + ToX)";
Debug.ShouldStop(256);
__ref.getField(false,"_menuitemnewx").runVoidMethod ("Add",(Object)((RemoteObject.solve(new RemoteObject[] {_menuitem.runMethod(true,"getLeft"),_tox}, "+",1, 1))));
 BA.debugLineNum = 298;BA.debugLine="MenuItemNewY.Add(MenuItem.Top - ToY)";
Debug.ShouldStop(512);
__ref.getField(false,"_menuitemnewy").runVoidMethod ("Add",(Object)((RemoteObject.solve(new RemoteObject[] {_menuitem.runMethod(true,"getTop"),_toy}, "-",1, 1))));
 }else {
 BA.debugLineNum = 300;BA.debugLine="AnimMenuItemRotate.InitializeRotateCenter(\"\", 36";
Debug.ShouldStop(2048);
__ref.getField(false,"_animmenuitemrotate").runVoidMethod ("InitializeRotateCenter",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(float.class, 360)),(Object)(BA.numberCast(float.class, 0)),(Object)((_menuitem.getObject())));
 BA.debugLineNum = 301;BA.debugLine="AnimMenuItemMove.InitializeTranslate(\"AnimMenuIt";
Debug.ShouldStop(4096);
__ref.getField(false,"_animmenuitemmove").runVoidMethod ("InitializeTranslate",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("AnimMenuItemMove")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, -(double) (0 + _tox.<Integer>get().intValue()))),(Object)(BA.numberCast(float.class, _toy)));
 BA.debugLineNum = 302;BA.debugLine="SubAnimSet.StartOffset = MenuItemAnimationDelay";
Debug.ShouldStop(8192);
_subanimset.runMethod(true,"setStartOffset",BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_menuitemanimationdelay"),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_menuitems").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)),_itemposition}, "-",1, 1))}, "*",0, 1)));
 BA.debugLineNum = 303;BA.debugLine="AnimMenuItemMove.SetInterpolator(AnimMenuItemMov";
Debug.ShouldStop(16384);
__ref.getField(false,"_animmenuitemmove").runVoidMethod ("SetInterpolator",(Object)(__ref.getField(false,"_animmenuitemmove").getField(true,"INTERPOLATOR_ANTICIPATE")));
 BA.debugLineNum = 304;BA.debugLine="MenuItemNewX.Add(MenuItem.Left - ToX)";
Debug.ShouldStop(32768);
__ref.getField(false,"_menuitemnewx").runVoidMethod ("Add",(Object)((RemoteObject.solve(new RemoteObject[] {_menuitem.runMethod(true,"getLeft"),_tox}, "-",1, 1))));
 BA.debugLineNum = 305;BA.debugLine="MenuItemNewY.Add(MenuItem.Top + ToY)";
Debug.ShouldStop(65536);
__ref.getField(false,"_menuitemnewy").runVoidMethod ("Add",(Object)((RemoteObject.solve(new RemoteObject[] {_menuitem.runMethod(true,"getTop"),_toy}, "+",1, 1))));
 };
 BA.debugLineNum = 309;BA.debugLine="AnimMenuItemRotate.Duration = 400";
Debug.ShouldStop(1048576);
__ref.getField(false,"_animmenuitemrotate").runMethod(true,"setDuration",BA.numberCast(long.class, 400));
 BA.debugLineNum = 310;BA.debugLine="AnimMenuItemRotate.RepeatCount = 0";
Debug.ShouldStop(2097152);
__ref.getField(false,"_animmenuitemrotate").runMethod(true,"setRepeatCount",BA.numberCast(int.class, 0));
 BA.debugLineNum = 311;BA.debugLine="AnimMenuItemRotate.PersistAfter = True";
Debug.ShouldStop(4194304);
__ref.getField(false,"_animmenuitemrotate").runMethod(true,"setPersistAfter",arcmenu.__c.getField(true,"True"));
 BA.debugLineNum = 312;BA.debugLine="AnimMenuItemMove.Duration = 450";
Debug.ShouldStop(8388608);
__ref.getField(false,"_animmenuitemmove").runMethod(true,"setDuration",BA.numberCast(long.class, 450));
 BA.debugLineNum = 313;BA.debugLine="AnimMenuItemMove.RepeatCount = 0";
Debug.ShouldStop(16777216);
__ref.getField(false,"_animmenuitemmove").runMethod(true,"setRepeatCount",BA.numberCast(int.class, 0));
 BA.debugLineNum = 314;BA.debugLine="AnimMenuItemMove.PersistAfter = True";
Debug.ShouldStop(33554432);
__ref.getField(false,"_animmenuitemmove").runMethod(true,"setPersistAfter",arcmenu.__c.getField(true,"True"));
 BA.debugLineNum = 316;BA.debugLine="SubAnimSet.AddAnimation(AnimMenuItemRotate)";
Debug.ShouldStop(134217728);
_subanimset.runVoidMethod ("AddAnimation",(Object)(__ref.getField(false,"_animmenuitemrotate")));
 BA.debugLineNum = 317;BA.debugLine="SubAnimSet.AddAnimation(AnimMenuItemMove)";
Debug.ShouldStop(268435456);
_subanimset.runVoidMethod ("AddAnimation",(Object)(__ref.getField(false,"_animmenuitemmove")));
 BA.debugLineNum = 319;BA.debugLine="SubAnimSet.PersistAfter = True";
Debug.ShouldStop(1073741824);
_subanimset.runMethod(true,"setPersistAfter",arcmenu.__c.getField(true,"True"));
 BA.debugLineNum = 321;BA.debugLine="Return SubAnimSet";
Debug.ShouldStop(1);
if (true) return _subanimset;
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedanimation(RemoteObject __ref,RemoteObject _menuitem) throws Exception{
try {
		Debug.PushSubsStack("GetSelectedAnimation (arcmenu) ","arcmenu",16,__ref.getField(false, "ba"),__ref,326);
if (RapidSub.canDelegate("getselectedanimation")) return __ref.runUserSub(false, "arcmenu","getselectedanimation", __ref, _menuitem);
RemoteObject _itemposition = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _animrotate = RemoteObject.declareNull("flm.b4a.animationplus.AnimationPlusWrapper");
RemoteObject _animfade = RemoteObject.declareNull("flm.b4a.animationplus.AnimationPlusWrapper");
RemoteObject _animscale = RemoteObject.declareNull("flm.b4a.animationplus.AnimationPlusWrapper");
int _i = 0;
Debug.locals.put("MenuItem", _menuitem);
 BA.debugLineNum = 326;BA.debugLine="Private Sub GetSelectedAnimation(MenuItem As Image";
Debug.ShouldStop(32);
 BA.debugLineNum = 327;BA.debugLine="Dim ItemPosition As Int";
Debug.ShouldStop(64);
_itemposition = RemoteObject.createImmutable(0);Debug.locals.put("ItemPosition", _itemposition);
 BA.debugLineNum = 328;BA.debugLine="Dim item As ImageView";
Debug.ShouldStop(128);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("item", _item);
 BA.debugLineNum = 329;BA.debugLine="Dim AnimRotate, AnimFade, AnimScale As AnimationP";
Debug.ShouldStop(256);
_animrotate = RemoteObject.createNew ("flm.b4a.animationplus.AnimationPlusWrapper");Debug.locals.put("AnimRotate", _animrotate);
_animfade = RemoteObject.createNew ("flm.b4a.animationplus.AnimationPlusWrapper");Debug.locals.put("AnimFade", _animfade);
_animscale = RemoteObject.createNew ("flm.b4a.animationplus.AnimationPlusWrapper");Debug.locals.put("AnimScale", _animscale);
 BA.debugLineNum = 330;BA.debugLine="Dim AnimSet As AnimationSet";
Debug.ShouldStop(512);
arcmenu._animset = RemoteObject.createNew ("flm.b4a.animationplus.AnimationSet");__ref.setField("_animset",arcmenu._animset);
 BA.debugLineNum = 332;BA.debugLine="AnimSet.Initialize(False)";
Debug.ShouldStop(2048);
__ref.getField(false,"_animset").runVoidMethod ("Initialize",(Object)(arcmenu.__c.getField(true,"False")));
 BA.debugLineNum = 333;BA.debugLine="ItemPosition = MenuItem.Tag";
Debug.ShouldStop(4096);
_itemposition = BA.numberCast(int.class, _menuitem.runMethod(false,"getTag"));Debug.locals.put("ItemPosition", _itemposition);
 BA.debugLineNum = 335;BA.debugLine="For i = 0 To MenuItems.Size - 1";
Debug.ShouldStop(16384);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_menuitems").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 336;BA.debugLine="item = MenuItems.Get(i)";
Debug.ShouldStop(32768);
_item.setObject(__ref.getField(false,"_menuitems").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 337;BA.debugLine="If item.Tag = ItemPosition Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_item.runMethod(false,"getTag"),(_itemposition))) { 
 BA.debugLineNum = 339;BA.debugLine="AnimRotate.InitializeRotateCenter(\"\", 0, 360, i";
Debug.ShouldStop(262144);
_animrotate.runVoidMethod ("InitializeRotateCenter",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 360)),(Object)((_item.getObject())));
 BA.debugLineNum = 340;BA.debugLine="AnimScale.InitializeScaleCenter(\"\", 1, 1, 2, 2,";
Debug.ShouldStop(524288);
_animscale.runVoidMethod ("InitializeScaleCenter",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 2)),(Object)(BA.numberCast(float.class, 2)),(Object)((_item.getObject())));
 }else {
 BA.debugLineNum = 343;BA.debugLine="AnimRotate.InitializeRotateCenter(\"\", 360, 0, i";
Debug.ShouldStop(4194304);
_animrotate.runVoidMethod ("InitializeRotateCenter",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(float.class, 360)),(Object)(BA.numberCast(float.class, 0)),(Object)((_item.getObject())));
 BA.debugLineNum = 344;BA.debugLine="AnimScale.InitializeScaleCenter(\"\", 1, 1, 0, 0,";
Debug.ShouldStop(8388608);
_animscale.runVoidMethod ("InitializeScaleCenter",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)((_item.getObject())));
 };
 BA.debugLineNum = 347;BA.debugLine="If i = MenuItems.Size - 1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_menuitems").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 348;BA.debugLine="AnimFade.InitializeAlpha(\"AnimItemSelected\", 1,";
Debug.ShouldStop(134217728);
_animfade.runVoidMethod ("InitializeAlpha",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("AnimItemSelected")),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 0)));
 }else {
 BA.debugLineNum = 350;BA.debugLine="AnimFade.InitializeAlpha(\"\", 1, 0)";
Debug.ShouldStop(536870912);
_animfade.runVoidMethod ("InitializeAlpha",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 0)));
 };
 BA.debugLineNum = 353;BA.debugLine="AnimRotate.Duration = 200";
Debug.ShouldStop(1);
_animrotate.runMethod(true,"setDuration",BA.numberCast(long.class, 200));
 BA.debugLineNum = 354;BA.debugLine="AnimRotate.RepeatCount = 3";
Debug.ShouldStop(2);
_animrotate.runMethod(true,"setRepeatCount",BA.numberCast(int.class, 3));
 BA.debugLineNum = 355;BA.debugLine="AnimFade.Duration = 400";
Debug.ShouldStop(4);
_animfade.runMethod(true,"setDuration",BA.numberCast(long.class, 400));
 BA.debugLineNum = 356;BA.debugLine="AnimFade.RepeatCount = 0";
Debug.ShouldStop(8);
_animfade.runMethod(true,"setRepeatCount",BA.numberCast(int.class, 0));
 BA.debugLineNum = 357;BA.debugLine="AnimScale.Duration = 400";
Debug.ShouldStop(16);
_animscale.runMethod(true,"setDuration",BA.numberCast(long.class, 400));
 BA.debugLineNum = 358;BA.debugLine="AnimScale.RepeatCount = 0";
Debug.ShouldStop(32);
_animscale.runMethod(true,"setRepeatCount",BA.numberCast(int.class, 0));
 BA.debugLineNum = 360;BA.debugLine="AnimSet.Initialize(False)";
Debug.ShouldStop(128);
__ref.getField(false,"_animset").runVoidMethod ("Initialize",(Object)(arcmenu.__c.getField(true,"False")));
 BA.debugLineNum = 361;BA.debugLine="AnimSet.AddAnimation(AnimRotate)";
Debug.ShouldStop(256);
__ref.getField(false,"_animset").runVoidMethod ("AddAnimation",(Object)(_animrotate));
 BA.debugLineNum = 362;BA.debugLine="AnimSet.AddAnimation(AnimFade)";
Debug.ShouldStop(512);
__ref.getField(false,"_animset").runVoidMethod ("AddAnimation",(Object)(_animfade));
 BA.debugLineNum = 363;BA.debugLine="AnimSet.AddAnimation(AnimScale)";
Debug.ShouldStop(1024);
__ref.getField(false,"_animset").runVoidMethod ("AddAnimation",(Object)(_animscale));
 BA.debugLineNum = 364;BA.debugLine="AnimSet.SetInterpolator(AnimSet.INTERPOLATOR_DEC";
Debug.ShouldStop(2048);
__ref.getField(false,"_animset").runVoidMethod ("SetInterpolator",(Object)(__ref.getField(false,"_animset").getField(true,"INTERPOLATOR_DECELERATE")));
 BA.debugLineNum = 365;BA.debugLine="AnimSet.PersistAfter = True";
Debug.ShouldStop(4096);
__ref.getField(false,"_animset").runMethod(true,"setPersistAfter",arcmenu.__c.getField(true,"True"));
 BA.debugLineNum = 366;BA.debugLine="AnimSet.Start(item)";
Debug.ShouldStop(8192);
__ref.getField(false,"_animset").runVoidMethod ("Start",(Object)((_item.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 370;BA.debugLine="If animatedMenuButton.IsInitialized Then";
Debug.ShouldStop(131072);
if (__ref.getField(false,"_animatedmenubutton").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 371;BA.debugLine="Animator.InitializeRotateCenter(\"menuButtonRotat";
Debug.ShouldStop(262144);
__ref.getField(false,"_animator").runVoidMethod ("InitializeRotateCenter",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("menuButtonRotate")),(Object)(BA.numberCast(float.class, 45)),(Object)(BA.numberCast(float.class, 0)),(Object)((__ref.getField(false,"_animatedmenubutton").getObject())));
 BA.debugLineNum = 372;BA.debugLine="Animator.Duration = 400";
Debug.ShouldStop(524288);
__ref.getField(false,"_animator").runMethod(true,"setDuration",BA.numberCast(long.class, 400));
 BA.debugLineNum = 373;BA.debugLine="Animator.RepeatCount = 0";
Debug.ShouldStop(1048576);
__ref.getField(false,"_animator").runMethod(true,"setRepeatCount",BA.numberCast(int.class, 0));
 BA.debugLineNum = 374;BA.debugLine="Animator.PersistAfter = True";
Debug.ShouldStop(2097152);
__ref.getField(false,"_animator").runMethod(true,"setPersistAfter",arcmenu.__c.getField(true,"True"));
 BA.debugLineNum = 375;BA.debugLine="Animator.Start(animatedMenuButton)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_animator").runVoidMethod ("Start",(Object)((__ref.getField(false,"_animatedmenubutton").getObject())));
 };
 BA.debugLineNum = 377;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _activity,RemoteObject _module,RemoteObject _eventname,RemoteObject _animatedbuttonimage,RemoteObject _staticbuttonimage,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("Initialize (arcmenu) ","arcmenu",16,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "arcmenu","initialize", __ref, _ba, _activity, _module, _eventname, _animatedbuttonimage, _staticbuttonimage, _x, _y);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Activity", _activity);
Debug.locals.put("Module", _module);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("AnimatedButtonImage", _animatedbuttonimage);
Debug.locals.put("StaticButtonImage", _staticbuttonimage);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 48;BA.debugLine="Public Sub Initialize(Activity As Panel, Module As";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="CenterX = x";
Debug.ShouldStop(131072);
__ref.setField ("_centerx",_x);
 BA.debugLineNum = 51;BA.debugLine="CenterY = y";
Debug.ShouldStop(262144);
__ref.setField ("_centery",_y);
 BA.debugLineNum = 52;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(524288);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 53;BA.debugLine="mActivity = Activity";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mactivity").setObject (_activity.getObject());
 BA.debugLineNum = 54;BA.debugLine="mModule = Module";
Debug.ShouldStop(2097152);
__ref.setField ("_mmodule",_module);
 BA.debugLineNum = 56;BA.debugLine="MenuItems.Initialize";
Debug.ShouldStop(8388608);
__ref.getField(false,"_menuitems").runVoidMethod ("Initialize");
 BA.debugLineNum = 58;BA.debugLine="If StaticButtonImage.IsInitialized Then";
Debug.ShouldStop(33554432);
if (_staticbuttonimage.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 59;BA.debugLine="staticMenuButton.Initialize(\"menuButton\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_staticmenubutton").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("menuButton")));
 BA.debugLineNum = 60;BA.debugLine="staticMenuButton.Bitmap = StaticButtonImage";
Debug.ShouldStop(134217728);
__ref.getField(false,"_staticmenubutton").runMethod(false,"setBitmap",(_staticbuttonimage.getObject()));
 BA.debugLineNum = 61;BA.debugLine="staticMenuButton.Gravity = Gravity.FILL";
Debug.ShouldStop(268435456);
__ref.getField(false,"_staticmenubutton").runMethod(true,"setGravity",arcmenu.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 63;BA.debugLine="Activity.AddView(staticMenuButton, x - (StaticMe";
Debug.ShouldStop(1073741824);
_activity.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_staticmenubutton").getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_x,(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_staticmenubuttonwidth"),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_y,(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_staticmenubuttonheight"),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0))),(Object)(__ref.getField(true,"_staticmenubuttonwidth")),(Object)(__ref.getField(true,"_staticmenubuttonheight")));
 BA.debugLineNum = 64;BA.debugLine="staticMenuButton.BringToFront";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_staticmenubutton").runVoidMethod ("BringToFront");
 };
 BA.debugLineNum = 67;BA.debugLine="If AnimatedButtonImage.IsInitialized Then";
Debug.ShouldStop(4);
if (_animatedbuttonimage.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 68;BA.debugLine="animatedMenuButton.Initialize(\"menuButton\")";
Debug.ShouldStop(8);
__ref.getField(false,"_animatedmenubutton").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("menuButton")));
 BA.debugLineNum = 69;BA.debugLine="animatedMenuButton.Bitmap = AnimatedButtonImage";
Debug.ShouldStop(16);
__ref.getField(false,"_animatedmenubutton").runMethod(false,"setBitmap",(_animatedbuttonimage.getObject()));
 BA.debugLineNum = 70;BA.debugLine="animatedMenuButton.Gravity = Gravity.FILL";
Debug.ShouldStop(32);
__ref.getField(false,"_animatedmenubutton").runMethod(true,"setGravity",arcmenu.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 72;BA.debugLine="Activity.AddView(animatedMenuButton, x - (Animat";
Debug.ShouldStop(128);
_activity.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_animatedmenubutton").getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_x,(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_animatedmenubuttonwidth"),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_y,(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_animatedmenubuttonheight"),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0))),(Object)(__ref.getField(true,"_animatedmenubuttonwidth")),(Object)(__ref.getField(true,"_animatedmenubuttonheight")));
 BA.debugLineNum = 73;BA.debugLine="animatedMenuButton.BringToFront";
Debug.ShouldStop(256);
__ref.getField(false,"_animatedmenubutton").runVoidMethod ("BringToFront");
 };
 BA.debugLineNum = 76;BA.debugLine="staticMenuButton.BringToFront";
Debug.ShouldStop(2048);
__ref.getField(false,"_staticmenubutton").runVoidMethod ("BringToFront");
 BA.debugLineNum = 77;BA.debugLine="animatedMenuButton.BringToFront";
Debug.ShouldStop(4096);
__ref.getField(false,"_animatedmenubutton").runVoidMethod ("BringToFront");
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isopen(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsOpen (arcmenu) ","arcmenu",16,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("isopen")) return __ref.runUserSub(false, "arcmenu","isopen", __ref);
 BA.debugLineNum = 110;BA.debugLine="Sub IsOpen As Boolean";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="Return menuOpen";
Debug.ShouldStop(16384);
if (true) return __ref.getField(true,"_menuopen");
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menubutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("menuButton_Click (arcmenu) ","arcmenu",16,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("menubutton_click")) return __ref.runUserSub(false, "arcmenu","menubutton_click", __ref);
int _i = 0;
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
 BA.debugLineNum = 116;BA.debugLine="Private Sub menuButton_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="If Not(IsAnimating) Then";
Debug.ShouldStop(1048576);
if (arcmenu.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_isanimating"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 118;BA.debugLine="MenuItemNewX.Initialize";
Debug.ShouldStop(2097152);
__ref.getField(false,"_menuitemnewx").runVoidMethod ("Initialize");
 BA.debugLineNum = 119;BA.debugLine="MenuItemNewY.Initialize";
Debug.ShouldStop(4194304);
__ref.getField(false,"_menuitemnewy").runVoidMethod ("Initialize");
 BA.debugLineNum = 120;BA.debugLine="If menuOpen Then";
Debug.ShouldStop(8388608);
if (__ref.getField(true,"_menuopen").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 121;BA.debugLine="If animatedMenuButton.IsInitialized Then Animat";
Debug.ShouldStop(16777216);
if (__ref.getField(false,"_animatedmenubutton").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
__ref.getField(false,"_animator").runVoidMethod ("InitializeRotateCenter",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("menuButtonRotate")),(Object)(BA.numberCast(float.class, 45)),(Object)(BA.numberCast(float.class, 0)),(Object)((__ref.getField(false,"_animatedmenubutton").getObject())));};
 BA.debugLineNum = 122;BA.debugLine="For i = MenuItems.Size - 1 To 0 Step -1";
Debug.ShouldStop(33554432);
{
final int step6 = (int) (0 + -(double) (0 + 1));
final int limit6 = 0;
_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_menuitems").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 123;BA.debugLine="AnimSet = GetMenuItemAnimation(MenuItems.Get(i";
Debug.ShouldStop(67108864);
__ref.setField ("_animset",__ref.runClassMethod (b4a.example.arcmenu.class, "_getmenuitemanimation",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), __ref.getField(false,"_menuitems").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),(Object)(arcmenu.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_menuopen"))))));
 BA.debugLineNum = 124;BA.debugLine="AnimSet.Start(MenuItems.Get(i))";
Debug.ShouldStop(134217728);
__ref.getField(false,"_animset").runVoidMethod ("Start",(Object)((__ref.getField(false,"_menuitems").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 BA.debugLineNum = 125;BA.debugLine="Dim a As View";
Debug.ShouldStop(268435456);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 126;BA.debugLine="a = MenuItems.Get(i)";
Debug.ShouldStop(536870912);
_a.setObject(__ref.getField(false,"_menuitems").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 127;BA.debugLine="a.BringToFront";
Debug.ShouldStop(1073741824);
_a.runVoidMethod ("BringToFront");
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 130;BA.debugLine="If animatedMenuButton.IsInitialized Then Animat";
Debug.ShouldStop(2);
if (__ref.getField(false,"_animatedmenubutton").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
__ref.getField(false,"_animator").runVoidMethod ("InitializeRotateCenter",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("menuButtonUnRotate")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 45)),(Object)((__ref.getField(false,"_animatedmenubutton").getObject())));};
 BA.debugLineNum = 131;BA.debugLine="For i = 0 To MenuItems.Size - 1";
Debug.ShouldStop(4);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_menuitems").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 132;BA.debugLine="AnimSet = GetMenuItemAnimation(MenuItems.Get(i";
Debug.ShouldStop(8);
__ref.setField ("_animset",__ref.runClassMethod (b4a.example.arcmenu.class, "_getmenuitemanimation",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), __ref.getField(false,"_menuitems").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),(Object)(arcmenu.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_menuopen"))))));
 BA.debugLineNum = 133;BA.debugLine="AnimSet.Start(MenuItems.Get(i))";
Debug.ShouldStop(16);
__ref.getField(false,"_animset").runVoidMethod ("Start",(Object)((__ref.getField(false,"_menuitems").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 138;BA.debugLine="IsAnimating = True";
Debug.ShouldStop(512);
__ref.setField ("_isanimating",arcmenu.__c.getField(true,"True"));
 BA.debugLineNum = 139;BA.debugLine="menuOpen = Not(menuOpen)";
Debug.ShouldStop(1024);
__ref.setField ("_menuopen",arcmenu.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_menuopen"))));
 BA.debugLineNum = 140;BA.debugLine="AnimationEndCount = 0";
Debug.ShouldStop(2048);
__ref.setField ("_animationendcount",BA.numberCast(int.class, 0));
 BA.debugLineNum = 141;BA.debugLine="If animatedMenuButton.IsInitialized Then";
Debug.ShouldStop(4096);
if (__ref.getField(false,"_animatedmenubutton").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 142;BA.debugLine="Animator.Duration = 400";
Debug.ShouldStop(8192);
__ref.getField(false,"_animator").runMethod(true,"setDuration",BA.numberCast(long.class, 400));
 BA.debugLineNum = 143;BA.debugLine="Animator.RepeatCount = 0";
Debug.ShouldStop(16384);
__ref.getField(false,"_animator").runMethod(true,"setRepeatCount",BA.numberCast(int.class, 0));
 BA.debugLineNum = 144;BA.debugLine="Animator.PersistAfter = True";
Debug.ShouldStop(32768);
__ref.getField(false,"_animator").runMethod(true,"setPersistAfter",arcmenu.__c.getField(true,"True"));
 BA.debugLineNum = 145;BA.debugLine="Animator.Start(animatedMenuButton)";
Debug.ShouldStop(65536);
__ref.getField(false,"_animator").runVoidMethod ("Start",(Object)((__ref.getField(false,"_animatedmenubutton").getObject())));
 };
 };
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menuitem_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MenuItem_Click (arcmenu) ","arcmenu",16,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("menuitem_click")) return __ref.runUserSub(false, "arcmenu","menuitem_click", __ref);
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
 BA.debugLineNum = 194;BA.debugLine="Private Sub MenuItem_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 195;BA.debugLine="If SubExists(mModule, mEventName & \"_Click\") Then";
Debug.ShouldStop(4);
if (arcmenu.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Click")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 196;BA.debugLine="Dim Item As ImageView";
Debug.ShouldStop(8);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("Item", _item);
 BA.debugLineNum = 197;BA.debugLine="Item = Sender";
Debug.ShouldStop(16);
_item.setObject(arcmenu.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 198;BA.debugLine="GetSelectedAnimation(Item)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.arcmenu.class, "_getselectedanimation",(Object)(_item));
 BA.debugLineNum = 199;BA.debugLine="CallSubDelayed2(mModule, mEventName & \"_Click\",";
Debug.ShouldStop(64);
arcmenu.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Click"))),(Object)(_item.runMethod(false,"getTag")));
 };
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menuitem_longclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MenuItem_LongClick (arcmenu) ","arcmenu",16,__ref.getField(false, "ba"),__ref,205);
if (RapidSub.canDelegate("menuitem_longclick")) return __ref.runUserSub(false, "arcmenu","menuitem_longclick", __ref);
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
 BA.debugLineNum = 205;BA.debugLine="Private Sub MenuItem_LongClick";
Debug.ShouldStop(4096);
 BA.debugLineNum = 206;BA.debugLine="If SubExists(mModule, mEventName & \"_LongClick\")";
Debug.ShouldStop(8192);
if (arcmenu.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_LongClick")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 207;BA.debugLine="Dim Item As ImageView";
Debug.ShouldStop(16384);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("Item", _item);
 BA.debugLineNum = 208;BA.debugLine="Item = Sender";
Debug.ShouldStop(32768);
_item.setObject(arcmenu.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 209;BA.debugLine="CallSubDelayed2(mModule, mEventName & \"_LongClic";
Debug.ShouldStop(65536);
arcmenu.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_LongClick"))),(Object)(_item.runMethod(false,"getTag")));
 };
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setanimatedbuttondimensions(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetAnimatedButtonDimensions (arcmenu) ","arcmenu",16,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("setanimatedbuttondimensions")) return __ref.runUserSub(false, "arcmenu","setanimatedbuttondimensions", __ref, _width, _height);
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 217;BA.debugLine="Sub SetAnimatedButtonDimensions(width As Int, heig";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 218;BA.debugLine="animatedMenuButton.width = width";
Debug.ShouldStop(33554432);
__ref.getField(false,"_animatedmenubutton").runMethod(true,"setWidth",_width);
 BA.debugLineNum = 219;BA.debugLine="animatedMenuButton.height = height";
Debug.ShouldStop(67108864);
__ref.getField(false,"_animatedmenubutton").runMethod(true,"setHeight",_height);
 BA.debugLineNum = 220;BA.debugLine="animatedMenuButton.Left = CenterX - (width / 2)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_animatedmenubutton").runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_centerx"),(RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0)));
 BA.debugLineNum = 221;BA.debugLine="animatedMenuButton.Top = CenterY - (height / 2)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_animatedmenubutton").runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_centery"),(RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0)));
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdegreespan(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetDegreeSpan (arcmenu) ","arcmenu",16,__ref.getField(false, "ba"),__ref,265);
if (RapidSub.canDelegate("setdegreespan")) return __ref.runUserSub(false, "arcmenu","setdegreespan", __ref, _value);
Debug.locals.put("value", _value);
 BA.debugLineNum = 265;BA.debugLine="Sub SetDegreeSpan(value As Int)";
Debug.ShouldStop(256);
 BA.debugLineNum = 266;BA.debugLine="DegreesSpan = value";
Debug.ShouldStop(512);
__ref.setField ("_degreesspan",_value);
 BA.debugLineNum = 267;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmenuitemdimensions(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetMenuItemDimensions (arcmenu) ","arcmenu",16,__ref.getField(false, "ba"),__ref,240);
if (RapidSub.canDelegate("setmenuitemdimensions")) return __ref.runUserSub(false, "arcmenu","setmenuitemdimensions", __ref, _width, _height);
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 240;BA.debugLine="Sub SetMenuItemDimensions(width As Int, height As";
Debug.ShouldStop(32768);
 BA.debugLineNum = 241;BA.debugLine="MenuItemWidth = width";
Debug.ShouldStop(65536);
__ref.setField ("_menuitemwidth",_width);
 BA.debugLineNum = 242;BA.debugLine="MenuItemHeight = height";
Debug.ShouldStop(131072);
__ref.setField ("_menuitemheight",_height);
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmenuitemradius(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetMenuItemRadius (arcmenu) ","arcmenu",16,__ref.getField(false, "ba"),__ref,249);
if (RapidSub.canDelegate("setmenuitemradius")) return __ref.runUserSub(false, "arcmenu","setmenuitemradius", __ref, _value);
Debug.locals.put("value", _value);
 BA.debugLineNum = 249;BA.debugLine="Sub SetMenuItemRadius(value As Int)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 250;BA.debugLine="ItemRadius = value";
Debug.ShouldStop(33554432);
__ref.setField ("_itemradius",_value);
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstartdegrees(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetStartDegrees (arcmenu) ","arcmenu",16,__ref.getField(false, "ba"),__ref,257);
if (RapidSub.canDelegate("setstartdegrees")) return __ref.runUserSub(false, "arcmenu","setstartdegrees", __ref, _value);
Debug.locals.put("value", _value);
 BA.debugLineNum = 257;BA.debugLine="Sub SetStartDegrees(value As Int)";
Debug.ShouldStop(1);
 BA.debugLineNum = 258;BA.debugLine="StartDegrees = value";
Debug.ShouldStop(2);
__ref.setField ("_startdegrees",_value);
 BA.debugLineNum = 259;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstaticbuttondimensions(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetStaticButtonDimensions (arcmenu) ","arcmenu",16,__ref.getField(false, "ba"),__ref,228);
if (RapidSub.canDelegate("setstaticbuttondimensions")) return __ref.runUserSub(false, "arcmenu","setstaticbuttondimensions", __ref, _width, _height);
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 228;BA.debugLine="Sub SetStaticButtonDimensions(width As Int, height";
Debug.ShouldStop(8);
 BA.debugLineNum = 229;BA.debugLine="staticMenuButton.width = width";
Debug.ShouldStop(16);
__ref.getField(false,"_staticmenubutton").runMethod(true,"setWidth",_width);
 BA.debugLineNum = 230;BA.debugLine="staticMenuButton.height = height";
Debug.ShouldStop(32);
__ref.getField(false,"_staticmenubutton").runMethod(true,"setHeight",_height);
 BA.debugLineNum = 231;BA.debugLine="staticMenuButton.Left = CenterX - (width / 2)";
Debug.ShouldStop(64);
__ref.getField(false,"_staticmenubutton").runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_centerx"),(RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0)));
 BA.debugLineNum = 232;BA.debugLine="staticMenuButton.Top = CenterY - (height / 2)";
Debug.ShouldStop(128);
__ref.getField(false,"_staticmenubutton").runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_centery"),(RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0)));
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _toggle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Toggle (arcmenu) ","arcmenu",16,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("toggle")) return __ref.runUserSub(false, "arcmenu","toggle", __ref);
 BA.debugLineNum = 104;BA.debugLine="Sub Toggle";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="menuButton_Click";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.arcmenu.class, "_menubutton_click");
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatemenuitemposition(RemoteObject __ref,RemoteObject _item,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("UpdateMenuItemPosition (arcmenu) ","arcmenu",16,__ref.getField(false, "ba"),__ref,381);
if (RapidSub.canDelegate("updatemenuitemposition")) return __ref.runUserSub(false, "arcmenu","updatemenuitemposition", __ref, _item, _position);
Debug.locals.put("Item", _item);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 381;BA.debugLine="Private Sub UpdateMenuItemPosition(Item As ImageVi";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 382;BA.debugLine="Item.Left = MenuItemNewX.Get(Position)";
Debug.ShouldStop(536870912);
_item.runMethod(true,"setLeft",BA.numberCast(int.class, __ref.getField(false,"_menuitemnewx").runMethod(false,"Get",(Object)(_position))));
 BA.debugLineNum = 383;BA.debugLine="Item.Top = MenuItemNewY.Get(Position)";
Debug.ShouldStop(1073741824);
_item.runMethod(true,"setTop",BA.numberCast(int.class, __ref.getField(false,"_menuitemnewy").runMethod(false,"Get",(Object)(_position))));
 BA.debugLineNum = 384;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}