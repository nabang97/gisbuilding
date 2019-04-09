package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class arcmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.arcmenu");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.arcmenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.List _menuitems = null;
public anywheresoftware.b4a.objects.collections.List _menuitemnewx = null;
public anywheresoftware.b4a.objects.collections.List _menuitemnewy = null;
public flm.b4a.animationplus.AnimationPlusWrapper _animator = null;
public flm.b4a.animationplus.AnimationPlusWrapper _animmenuitemrotate = null;
public flm.b4a.animationplus.AnimationPlusWrapper _animmenuitemmove = null;
public flm.b4a.animationplus.AnimationSet _animset = null;
public boolean _isanimating = false;
public anywheresoftware.b4a.objects.ImageViewWrapper _staticmenubutton = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _animatedmenubutton = null;
public String _meventname = "";
public anywheresoftware.b4a.objects.ActivityWrapper _mactivity = null;
public Object _mmodule = null;
public int _centerx = 0;
public int _centery = 0;
public boolean _menuopen = false;
public int _currentposition = 0;
public int _animationendcount = 0;
public int _menuitemanimationdelay = 0;
public int _staticmenubuttonwidth = 0;
public int _staticmenubuttonheight = 0;
public int _animatedmenubuttonwidth = 0;
public int _animatedmenubuttonheight = 0;
public int _menuitemwidth = 0;
public int _menuitemheight = 0;
public int _startdegrees = 0;
public int _degreesspan = 0;
public int _itemradius = 0;
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
public b4a.example.msmeedit _msmeedit = null;
public b4a.example.buildinglist _buildinglist = null;
public b4a.example.maplocation _maplocation = null;
public b4a.example.help _help = null;
public b4a.example.healthedit _healthedit = null;
public b4a.example.searchworship _searchworship = null;
public String  _additem(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _itemimage) throws Exception{
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
 //BA.debugLineNum = 81;BA.debugLine="Sub AddItem(ItemImage As Bitmap)";
 //BA.debugLineNum = 83;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 84;BA.debugLine="img.Initialize(\"MenuItem\")";
_img.Initialize(ba,"MenuItem");
 //BA.debugLineNum = 85;BA.debugLine="img.Bitmap = ItemImage";
_img.setBitmap((android.graphics.Bitmap)(_itemimage.getObject()));
 //BA.debugLineNum = 86;BA.debugLine="img.Tag = CurrentPosition";
_img.setTag((Object)(_currentposition));
 //BA.debugLineNum = 87;BA.debugLine="img.Gravity = Gravity.FILL";
_img.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 88;BA.debugLine="img.Visible = False";
_img.setVisible(__c.False);
 //BA.debugLineNum = 89;BA.debugLine="MenuItems.Add(img)";
_menuitems.Add((Object)(_img.getObject()));
 //BA.debugLineNum = 91;BA.debugLine="mActivity.AddView(img, CenterX - (MenuItemWidth /";
_mactivity.AddView((android.view.View)(_img.getObject()),(int) (_centerx-(_menuitemwidth/(double)2)),(int) (_centery-(_menuitemheight/(double)2)),_menuitemwidth,_menuitemheight);
 //BA.debugLineNum = 93;BA.debugLine="CurrentPosition = CurrentPosition + 1";
_currentposition = (int) (_currentposition+1);
 //BA.debugLineNum = 94;BA.debugLine="img.SendToBack";
_img.SendToBack();
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _animitemselected_animationend() throws Exception{
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
int _i = 0;
 //BA.debugLineNum = 172;BA.debugLine="Private Sub AnimItemSelected_AnimationEnd";
 //BA.debugLineNum = 173;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 175;BA.debugLine="For i = 0 To MenuItems.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_menuitems.getSize()-1);
_i = (int) (0) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
 //BA.debugLineNum = 176;BA.debugLine="img = MenuItems.Get(i)";
_img.setObject((android.widget.ImageView)(_menuitems.Get(_i)));
 //BA.debugLineNum = 177;BA.debugLine="img.Visible = False";
_img.setVisible(__c.False);
 //BA.debugLineNum = 178;BA.debugLine="img.Invalidate";
_img.Invalidate();
 //BA.debugLineNum = 179;BA.debugLine="Animator.Stop(img)";
_animator.Stop((android.view.View)(_img.getObject()));
 //BA.debugLineNum = 180;BA.debugLine="img.Left = CenterX - (img.Width / 2)";
_img.setLeft((int) (_centerx-(_img.getWidth()/(double)2)));
 //BA.debugLineNum = 181;BA.debugLine="img.Top = CenterY - (img.Height / 2)";
_img.setTop((int) (_centery-(_img.getHeight()/(double)2)));
 }
};
 //BA.debugLineNum = 183;BA.debugLine="menuOpen = False";
_menuopen = __c.False;
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public String  _animmenuitemmove_animationend() throws Exception{
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
int _itemposition = 0;
 //BA.debugLineNum = 147;BA.debugLine="Private Sub AnimMenuItemMove_AnimationEnd";
 //BA.debugLineNum = 149;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 150;BA.debugLine="Dim ItemPosition As Int";
_itemposition = 0;
 //BA.debugLineNum = 151;BA.debugLine="If menuOpen = False Then";
if (_menuopen==__c.False) { 
 //BA.debugLineNum = 152;BA.debugLine="ItemPosition = (MenuItems.Size - 1) - AnimationE";
_itemposition = (int) ((_menuitems.getSize()-1)-_animationendcount);
 }else {
 //BA.debugLineNum = 154;BA.debugLine="ItemPosition = AnimationEndCount";
_itemposition = _animationendcount;
 };
 //BA.debugLineNum = 157;BA.debugLine="img = MenuItems.Get(ItemPosition)";
_img.setObject((android.widget.ImageView)(_menuitems.Get(_itemposition)));
 //BA.debugLineNum = 159;BA.debugLine="If Not(menuOpen) Then img.Visible = False";
if (__c.Not(_menuopen)) { 
_img.setVisible(__c.False);};
 //BA.debugLineNum = 160;BA.debugLine="img.Invalidate";
_img.Invalidate();
 //BA.debugLineNum = 161;BA.debugLine="AnimMenuItemMove.Stop(img)";
_animmenuitemmove.Stop((android.view.View)(_img.getObject()));
 //BA.debugLineNum = 162;BA.debugLine="UpdateMenuItemPosition(MenuItems.Get(ItemPosition";
_updatemenuitemposition((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_menuitems.Get(_itemposition))),_itemposition);
 //BA.debugLineNum = 163;BA.debugLine="If AnimationEndCount = MenuItems.Size - 1 Then";
if (_animationendcount==_menuitems.getSize()-1) { 
 //BA.debugLineNum = 164;BA.debugLine="IsAnimating = False";
_isanimating = __c.False;
 //BA.debugLineNum = 165;BA.debugLine="If SubExists(mModule, mEventName & \"_AnimationEn";
if (__c.SubExists(ba,_mmodule,_meventname+"_AnimationEnd")) { 
__c.CallSubDelayed2(ba,_mmodule,_meventname+"_AnimationEnd",(Object)(_menuopen));};
 }else {
 //BA.debugLineNum = 167;BA.debugLine="AnimationEndCount = AnimationEndCount + 1";
_animationendcount = (int) (_animationendcount+1);
 };
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private MenuItems, MenuItemNewX, MenuItemNewY As";
_menuitems = new anywheresoftware.b4a.objects.collections.List();
_menuitemnewx = new anywheresoftware.b4a.objects.collections.List();
_menuitemnewy = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Private Animator, AnimMenuItemRotate, AnimMenuIte";
_animator = new flm.b4a.animationplus.AnimationPlusWrapper();
_animmenuitemrotate = new flm.b4a.animationplus.AnimationPlusWrapper();
_animmenuitemmove = new flm.b4a.animationplus.AnimationPlusWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private AnimSet As AnimationSet";
_animset = new flm.b4a.animationplus.AnimationSet();
 //BA.debugLineNum = 8;BA.debugLine="Private IsAnimating As Boolean = False";
_isanimating = __c.False;
 //BA.debugLineNum = 9;BA.debugLine="Private staticMenuButton, animatedMenuButton As I";
_staticmenubutton = new anywheresoftware.b4a.objects.ImageViewWrapper();
_animatedmenubutton = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private mEventName As String";
_meventname = "";
 //BA.debugLineNum = 11;BA.debugLine="Private mActivity As Activity";
_mactivity = new anywheresoftware.b4a.objects.ActivityWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private mModule As Object";
_mmodule = new Object();
 //BA.debugLineNum = 13;BA.debugLine="Private CenterX, CenterY As Int";
_centerx = 0;
_centery = 0;
 //BA.debugLineNum = 14;BA.debugLine="Private menuOpen As Boolean = False";
_menuopen = __c.False;
 //BA.debugLineNum = 15;BA.debugLine="Private CurrentPosition As Int = 1";
_currentposition = (int) (1);
 //BA.debugLineNum = 16;BA.debugLine="Private AnimationEndCount As Int = 0";
_animationendcount = (int) (0);
 //BA.debugLineNum = 17;BA.debugLine="Private MenuItemAnimationDelay As Int = 80";
_menuitemanimationdelay = (int) (80);
 //BA.debugLineNum = 20;BA.debugLine="Private StaticMenuButtonWidth As Int = 52dip";
_staticmenubuttonwidth = __c.DipToCurrent((int) (52));
 //BA.debugLineNum = 21;BA.debugLine="Private StaticMenuButtonHeight As Int = 52dip";
_staticmenubuttonheight = __c.DipToCurrent((int) (52));
 //BA.debugLineNum = 22;BA.debugLine="Private AnimatedMenuButtonWidth As Int = 20dip";
_animatedmenubuttonwidth = __c.DipToCurrent((int) (20));
 //BA.debugLineNum = 23;BA.debugLine="Private AnimatedMenuButtonHeight As Int = 20dip";
_animatedmenubuttonheight = __c.DipToCurrent((int) (20));
 //BA.debugLineNum = 24;BA.debugLine="Private MenuItemWidth As Int = 40dip";
_menuitemwidth = __c.DipToCurrent((int) (40));
 //BA.debugLineNum = 25;BA.debugLine="Private MenuItemHeight As Int = 40dip";
_menuitemheight = __c.DipToCurrent((int) (40));
 //BA.debugLineNum = 26;BA.debugLine="Private StartDegrees As Int = -90";
_startdegrees = (int) (-90);
 //BA.debugLineNum = 27;BA.debugLine="Private DegreesSpan As Int = 90";
_degreesspan = (int) (90);
 //BA.debugLineNum = 28;BA.debugLine="Private ItemRadius As Int = 120dip";
_itemradius = __c.DipToCurrent((int) (120));
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public flm.b4a.animationplus.AnimationSet  _getmenuitemanimation(anywheresoftware.b4a.objects.ImageViewWrapper _menuitem,boolean _open) throws Exception{
flm.b4a.animationplus.AnimationSet _subanimset = null;
int _tox = 0;
int _toy = 0;
int _itemposition = 0;
float _degreesperitem = 0f;
float _degreeradians = 0f;
 //BA.debugLineNum = 265;BA.debugLine="Private Sub GetMenuItemAnimation(MenuItem As Image";
 //BA.debugLineNum = 266;BA.debugLine="Dim SubAnimSet As AnimationSet";
_subanimset = new flm.b4a.animationplus.AnimationSet();
 //BA.debugLineNum = 267;BA.debugLine="Dim ToX, ToY, ItemPosition As Int";
_tox = 0;
_toy = 0;
_itemposition = 0;
 //BA.debugLineNum = 268;BA.debugLine="Dim DegreesPerItem, DegreeRadians As Float";
_degreesperitem = 0f;
_degreeradians = 0f;
 //BA.debugLineNum = 270;BA.debugLine="SubAnimSet.Initialize(False)";
_subanimset.Initialize(__c.False);
 //BA.debugLineNum = 272;BA.debugLine="ItemPosition = MenuItem.Tag";
_itemposition = (int)(BA.ObjectToNumber(_menuitem.getTag()));
 //BA.debugLineNum = 274;BA.debugLine="If DegreesSpan = 360 Then DegreesSpan = 360 - (36";
if (_degreesspan==360) { 
_degreesspan = (int) (360-(360/(double)_menuitems.getSize()));};
 //BA.debugLineNum = 276;BA.debugLine="If MenuItems.Size > 1 Then";
if (_menuitems.getSize()>1) { 
 //BA.debugLineNum = 277;BA.debugLine="DegreesPerItem = DegreesSpan / (MenuItems.Size -";
_degreesperitem = (float) (_degreesspan/(double)(_menuitems.getSize()-1));
 }else {
 //BA.debugLineNum = 279;BA.debugLine="DegreesPerItem = DegreesSpan";
_degreesperitem = (float) (_degreesspan);
 };
 //BA.debugLineNum = 281;BA.debugLine="DegreeRadians = (StartDegrees + (DegreesPerItem *";
_degreeradians = (float) ((_startdegrees+(_degreesperitem*(_itemposition-1)))*__c.cPI/(double)180);
 //BA.debugLineNum = 283;BA.debugLine="ToY = (ItemRadius * (Cos(DegreeRadians)))";
_toy = (int) ((_itemradius*(__c.Cos(_degreeradians))));
 //BA.debugLineNum = 284;BA.debugLine="ToX = (ItemRadius * (Sin(DegreeRadians)))";
_tox = (int) ((_itemradius*(__c.Sin(_degreeradians))));
 //BA.debugLineNum = 285;BA.debugLine="If Open Then";
if (_open) { 
 //BA.debugLineNum = 286;BA.debugLine="MenuItem.Visible = True";
_menuitem.setVisible(__c.True);
 //BA.debugLineNum = 287;BA.debugLine="AnimMenuItemRotate.InitializeRotateCenter(\"\", 0,";
_animmenuitemrotate.InitializeRotateCenter(ba,"",(float) (0),(float) (360),(android.view.View)(_menuitem.getObject()));
 //BA.debugLineNum = 288;BA.debugLine="AnimMenuItemMove.InitializeTranslate(\"AnimMenuIt";
_animmenuitemmove.InitializeTranslate(ba,"AnimMenuItemMove",(float) (0),(float) (0),(float) (_tox),(float) (-_toy));
 //BA.debugLineNum = 289;BA.debugLine="SubAnimSet.StartOffset = MenuItemAnimationDelay";
_subanimset.setStartOffset((long) (_menuitemanimationdelay*_itemposition));
 //BA.debugLineNum = 290;BA.debugLine="AnimMenuItemMove.SetInterpolator(AnimMenuItemMov";
_animmenuitemmove.SetInterpolator(_animmenuitemmove.INTERPOLATOR_OVERSHOOT);
 //BA.debugLineNum = 291;BA.debugLine="MenuItemNewX.Add(MenuItem.Left + ToX)";
_menuitemnewx.Add((Object)(_menuitem.getLeft()+_tox));
 //BA.debugLineNum = 292;BA.debugLine="MenuItemNewY.Add(MenuItem.Top - ToY)";
_menuitemnewy.Add((Object)(_menuitem.getTop()-_toy));
 }else {
 //BA.debugLineNum = 294;BA.debugLine="AnimMenuItemRotate.InitializeRotateCenter(\"\", 36";
_animmenuitemrotate.InitializeRotateCenter(ba,"",(float) (360),(float) (0),(android.view.View)(_menuitem.getObject()));
 //BA.debugLineNum = 295;BA.debugLine="AnimMenuItemMove.InitializeTranslate(\"AnimMenuIt";
_animmenuitemmove.InitializeTranslate(ba,"AnimMenuItemMove",(float) (0),(float) (0),(float) (-_tox),(float) (_toy));
 //BA.debugLineNum = 296;BA.debugLine="SubAnimSet.StartOffset = MenuItemAnimationDelay";
_subanimset.setStartOffset((long) (_menuitemanimationdelay*((_menuitems.getSize()-1)-_itemposition)));
 //BA.debugLineNum = 297;BA.debugLine="AnimMenuItemMove.SetInterpolator(AnimMenuItemMov";
_animmenuitemmove.SetInterpolator(_animmenuitemmove.INTERPOLATOR_ANTICIPATE);
 //BA.debugLineNum = 298;BA.debugLine="MenuItemNewX.Add(MenuItem.Left - ToX)";
_menuitemnewx.Add((Object)(_menuitem.getLeft()-_tox));
 //BA.debugLineNum = 299;BA.debugLine="MenuItemNewY.Add(MenuItem.Top + ToY)";
_menuitemnewy.Add((Object)(_menuitem.getTop()+_toy));
 };
 //BA.debugLineNum = 303;BA.debugLine="AnimMenuItemRotate.Duration = 400";
_animmenuitemrotate.setDuration((long) (400));
 //BA.debugLineNum = 304;BA.debugLine="AnimMenuItemRotate.RepeatCount = 0";
_animmenuitemrotate.setRepeatCount((int) (0));
 //BA.debugLineNum = 305;BA.debugLine="AnimMenuItemRotate.PersistAfter = True";
_animmenuitemrotate.setPersistAfter(__c.True);
 //BA.debugLineNum = 306;BA.debugLine="AnimMenuItemMove.Duration = 450";
_animmenuitemmove.setDuration((long) (450));
 //BA.debugLineNum = 307;BA.debugLine="AnimMenuItemMove.RepeatCount = 0";
_animmenuitemmove.setRepeatCount((int) (0));
 //BA.debugLineNum = 308;BA.debugLine="AnimMenuItemMove.PersistAfter = True";
_animmenuitemmove.setPersistAfter(__c.True);
 //BA.debugLineNum = 310;BA.debugLine="SubAnimSet.AddAnimation(AnimMenuItemRotate)";
_subanimset.AddAnimation(_animmenuitemrotate);
 //BA.debugLineNum = 311;BA.debugLine="SubAnimSet.AddAnimation(AnimMenuItemMove)";
_subanimset.AddAnimation(_animmenuitemmove);
 //BA.debugLineNum = 313;BA.debugLine="SubAnimSet.PersistAfter = True";
_subanimset.setPersistAfter(__c.True);
 //BA.debugLineNum = 315;BA.debugLine="Return SubAnimSet";
if (true) return _subanimset;
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return null;
}
public String  _getselectedanimation(anywheresoftware.b4a.objects.ImageViewWrapper _menuitem) throws Exception{
int _itemposition = 0;
anywheresoftware.b4a.objects.ImageViewWrapper _item = null;
flm.b4a.animationplus.AnimationPlusWrapper _animrotate = null;
flm.b4a.animationplus.AnimationPlusWrapper _animfade = null;
flm.b4a.animationplus.AnimationPlusWrapper _animscale = null;
int _i = 0;
 //BA.debugLineNum = 320;BA.debugLine="Private Sub GetSelectedAnimation(MenuItem As Image";
 //BA.debugLineNum = 321;BA.debugLine="Dim ItemPosition As Int";
_itemposition = 0;
 //BA.debugLineNum = 322;BA.debugLine="Dim item As ImageView";
_item = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 323;BA.debugLine="Dim AnimRotate, AnimFade, AnimScale As AnimationP";
_animrotate = new flm.b4a.animationplus.AnimationPlusWrapper();
_animfade = new flm.b4a.animationplus.AnimationPlusWrapper();
_animscale = new flm.b4a.animationplus.AnimationPlusWrapper();
 //BA.debugLineNum = 324;BA.debugLine="Dim AnimSet As AnimationSet";
_animset = new flm.b4a.animationplus.AnimationSet();
 //BA.debugLineNum = 326;BA.debugLine="AnimSet.Initialize(False)";
_animset.Initialize(__c.False);
 //BA.debugLineNum = 327;BA.debugLine="ItemPosition = MenuItem.Tag";
_itemposition = (int)(BA.ObjectToNumber(_menuitem.getTag()));
 //BA.debugLineNum = 329;BA.debugLine="For i = 0 To MenuItems.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_menuitems.getSize()-1);
_i = (int) (0) ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
 //BA.debugLineNum = 330;BA.debugLine="item = MenuItems.Get(i)";
_item.setObject((android.widget.ImageView)(_menuitems.Get(_i)));
 //BA.debugLineNum = 331;BA.debugLine="If item.Tag = ItemPosition Then";
if ((_item.getTag()).equals((Object)(_itemposition))) { 
 //BA.debugLineNum = 333;BA.debugLine="AnimRotate.InitializeRotateCenter(\"\", 0, 360, i";
_animrotate.InitializeRotateCenter(ba,"",(float) (0),(float) (360),(android.view.View)(_item.getObject()));
 //BA.debugLineNum = 334;BA.debugLine="AnimScale.InitializeScaleCenter(\"\", 1, 1, 2, 2,";
_animscale.InitializeScaleCenter(ba,"",(float) (1),(float) (1),(float) (2),(float) (2),(android.view.View)(_item.getObject()));
 }else {
 //BA.debugLineNum = 337;BA.debugLine="AnimRotate.InitializeRotateCenter(\"\", 360, 0, i";
_animrotate.InitializeRotateCenter(ba,"",(float) (360),(float) (0),(android.view.View)(_item.getObject()));
 //BA.debugLineNum = 338;BA.debugLine="AnimScale.InitializeScaleCenter(\"\", 1, 1, 0, 0,";
_animscale.InitializeScaleCenter(ba,"",(float) (1),(float) (1),(float) (0),(float) (0),(android.view.View)(_item.getObject()));
 };
 //BA.debugLineNum = 341;BA.debugLine="If i = MenuItems.Size - 1 Then";
if (_i==_menuitems.getSize()-1) { 
 //BA.debugLineNum = 342;BA.debugLine="AnimFade.InitializeAlpha(\"AnimItemSelected\", 1,";
_animfade.InitializeAlpha(ba,"AnimItemSelected",(float) (1),(float) (0));
 }else {
 //BA.debugLineNum = 344;BA.debugLine="AnimFade.InitializeAlpha(\"\", 1, 0)";
_animfade.InitializeAlpha(ba,"",(float) (1),(float) (0));
 };
 //BA.debugLineNum = 347;BA.debugLine="AnimRotate.Duration = 200";
_animrotate.setDuration((long) (200));
 //BA.debugLineNum = 348;BA.debugLine="AnimRotate.RepeatCount = 3";
_animrotate.setRepeatCount((int) (3));
 //BA.debugLineNum = 349;BA.debugLine="AnimFade.Duration = 400";
_animfade.setDuration((long) (400));
 //BA.debugLineNum = 350;BA.debugLine="AnimFade.RepeatCount = 0";
_animfade.setRepeatCount((int) (0));
 //BA.debugLineNum = 351;BA.debugLine="AnimScale.Duration = 400";
_animscale.setDuration((long) (400));
 //BA.debugLineNum = 352;BA.debugLine="AnimScale.RepeatCount = 0";
_animscale.setRepeatCount((int) (0));
 //BA.debugLineNum = 354;BA.debugLine="AnimSet.Initialize(False)";
_animset.Initialize(__c.False);
 //BA.debugLineNum = 355;BA.debugLine="AnimSet.AddAnimation(AnimRotate)";
_animset.AddAnimation(_animrotate);
 //BA.debugLineNum = 356;BA.debugLine="AnimSet.AddAnimation(AnimFade)";
_animset.AddAnimation(_animfade);
 //BA.debugLineNum = 357;BA.debugLine="AnimSet.AddAnimation(AnimScale)";
_animset.AddAnimation(_animscale);
 //BA.debugLineNum = 358;BA.debugLine="AnimSet.SetInterpolator(AnimSet.INTERPOLATOR_DEC";
_animset.SetInterpolator(_animset.INTERPOLATOR_DECELERATE);
 //BA.debugLineNum = 359;BA.debugLine="AnimSet.PersistAfter = True";
_animset.setPersistAfter(__c.True);
 //BA.debugLineNum = 360;BA.debugLine="AnimSet.Start(item)";
_animset.Start((android.view.View)(_item.getObject()));
 }
};
 //BA.debugLineNum = 364;BA.debugLine="If animatedMenuButton.IsInitialized Then";
if (_animatedmenubutton.IsInitialized()) { 
 //BA.debugLineNum = 365;BA.debugLine="Animator.InitializeRotateCenter(\"menuButtonRotat";
_animator.InitializeRotateCenter(ba,"menuButtonRotate",(float) (45),(float) (0),(android.view.View)(_animatedmenubutton.getObject()));
 //BA.debugLineNum = 366;BA.debugLine="Animator.Duration = 400";
_animator.setDuration((long) (400));
 //BA.debugLineNum = 367;BA.debugLine="Animator.RepeatCount = 0";
_animator.setRepeatCount((int) (0));
 //BA.debugLineNum = 368;BA.debugLine="Animator.PersistAfter = True";
_animator.setPersistAfter(__c.True);
 //BA.debugLineNum = 369;BA.debugLine="Animator.Start(animatedMenuButton)";
_animator.Start((android.view.View)(_animatedmenubutton.getObject()));
 };
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.PanelWrapper _activity,Object _module,String _eventname,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _animatedbuttonimage,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _staticbuttonimage,int _x,int _y) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 48;BA.debugLine="Public Sub Initialize(Activity As Panel, Module As";
 //BA.debugLineNum = 50;BA.debugLine="CenterX = x";
_centerx = _x;
 //BA.debugLineNum = 51;BA.debugLine="CenterY = y";
_centery = _y;
 //BA.debugLineNum = 52;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 53;BA.debugLine="mActivity = Activity";
_mactivity.setObject((anywheresoftware.b4a.BALayout)(_activity.getObject()));
 //BA.debugLineNum = 54;BA.debugLine="mModule = Module";
_mmodule = _module;
 //BA.debugLineNum = 56;BA.debugLine="MenuItems.Initialize";
_menuitems.Initialize();
 //BA.debugLineNum = 58;BA.debugLine="If StaticButtonImage.IsInitialized Then";
if (_staticbuttonimage.IsInitialized()) { 
 //BA.debugLineNum = 59;BA.debugLine="staticMenuButton.Initialize(\"menuButton\")";
_staticmenubutton.Initialize(ba,"menuButton");
 //BA.debugLineNum = 60;BA.debugLine="staticMenuButton.Bitmap = StaticButtonImage";
_staticmenubutton.setBitmap((android.graphics.Bitmap)(_staticbuttonimage.getObject()));
 //BA.debugLineNum = 61;BA.debugLine="staticMenuButton.Gravity = Gravity.FILL";
_staticmenubutton.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 63;BA.debugLine="Activity.AddView(staticMenuButton, x - (StaticMe";
_activity.AddView((android.view.View)(_staticmenubutton.getObject()),(int) (_x-(_staticmenubuttonwidth/(double)2)),(int) (_y-(_staticmenubuttonheight/(double)2)),_staticmenubuttonwidth,_staticmenubuttonheight);
 };
 //BA.debugLineNum = 66;BA.debugLine="If AnimatedButtonImage.IsInitialized Then";
if (_animatedbuttonimage.IsInitialized()) { 
 //BA.debugLineNum = 67;BA.debugLine="animatedMenuButton.Initialize(\"menuButton\")";
_animatedmenubutton.Initialize(ba,"menuButton");
 //BA.debugLineNum = 68;BA.debugLine="animatedMenuButton.Bitmap = AnimatedButtonImage";
_animatedmenubutton.setBitmap((android.graphics.Bitmap)(_animatedbuttonimage.getObject()));
 //BA.debugLineNum = 69;BA.debugLine="animatedMenuButton.Gravity = Gravity.FILL";
_animatedmenubutton.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 71;BA.debugLine="Activity.AddView(animatedMenuButton, x - (Animat";
_activity.AddView((android.view.View)(_animatedmenubutton.getObject()),(int) (_x-(_animatedmenubuttonwidth/(double)2)),(int) (_y-(_animatedmenubuttonheight/(double)2)),_animatedmenubuttonwidth,_animatedmenubuttonheight);
 //BA.debugLineNum = 72;BA.debugLine="animatedMenuButton.BringToFront";
_animatedmenubutton.BringToFront();
 };
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public boolean  _isopen() throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub IsOpen As Boolean";
 //BA.debugLineNum = 108;BA.debugLine="Return menuOpen";
if (true) return _menuopen;
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return false;
}
public String  _menubutton_click() throws Exception{
int _i = 0;
 //BA.debugLineNum = 113;BA.debugLine="Private Sub menuButton_Click";
 //BA.debugLineNum = 114;BA.debugLine="If Not(IsAnimating) Then";
if (__c.Not(_isanimating)) { 
 //BA.debugLineNum = 115;BA.debugLine="MenuItemNewX.Initialize";
_menuitemnewx.Initialize();
 //BA.debugLineNum = 116;BA.debugLine="MenuItemNewY.Initialize";
_menuitemnewy.Initialize();
 //BA.debugLineNum = 117;BA.debugLine="If menuOpen Then";
if (_menuopen) { 
 //BA.debugLineNum = 118;BA.debugLine="If animatedMenuButton.IsInitialized Then Animat";
if (_animatedmenubutton.IsInitialized()) { 
_animator.InitializeRotateCenter(ba,"menuButtonRotate",(float) (45),(float) (0),(android.view.View)(_animatedmenubutton.getObject()));};
 //BA.debugLineNum = 119;BA.debugLine="For i = MenuItems.Size - 1 To 0 Step -1";
{
final int step6 = (int) (-1);
final int limit6 = (int) (0);
_i = (int) (_menuitems.getSize()-1) ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
 //BA.debugLineNum = 120;BA.debugLine="AnimSet = GetMenuItemAnimation(MenuItems.Get(i";
_animset = _getmenuitemanimation((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_menuitems.Get(_i))),__c.Not(_menuopen));
 //BA.debugLineNum = 121;BA.debugLine="AnimSet.Start(MenuItems.Get(i))";
_animset.Start((android.view.View)(_menuitems.Get(_i)));
 }
};
 }else {
 //BA.debugLineNum = 124;BA.debugLine="If animatedMenuButton.IsInitialized Then Animat";
if (_animatedmenubutton.IsInitialized()) { 
_animator.InitializeRotateCenter(ba,"menuButtonUnRotate",(float) (0),(float) (45),(android.view.View)(_animatedmenubutton.getObject()));};
 //BA.debugLineNum = 125;BA.debugLine="For i = 0 To MenuItems.Size - 1";
{
final int step12 = 1;
final int limit12 = (int) (_menuitems.getSize()-1);
_i = (int) (0) ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
 //BA.debugLineNum = 126;BA.debugLine="AnimSet = GetMenuItemAnimation(MenuItems.Get(i";
_animset = _getmenuitemanimation((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_menuitems.Get(_i))),__c.Not(_menuopen));
 //BA.debugLineNum = 127;BA.debugLine="AnimSet.Start(MenuItems.Get(i))";
_animset.Start((android.view.View)(_menuitems.Get(_i)));
 }
};
 };
 //BA.debugLineNum = 132;BA.debugLine="IsAnimating = True";
_isanimating = __c.True;
 //BA.debugLineNum = 133;BA.debugLine="menuOpen = Not(menuOpen)";
_menuopen = __c.Not(_menuopen);
 //BA.debugLineNum = 134;BA.debugLine="AnimationEndCount = 0";
_animationendcount = (int) (0);
 //BA.debugLineNum = 135;BA.debugLine="If animatedMenuButton.IsInitialized Then";
if (_animatedmenubutton.IsInitialized()) { 
 //BA.debugLineNum = 136;BA.debugLine="Animator.Duration = 400";
_animator.setDuration((long) (400));
 //BA.debugLineNum = 137;BA.debugLine="Animator.RepeatCount = 0";
_animator.setRepeatCount((int) (0));
 //BA.debugLineNum = 138;BA.debugLine="Animator.PersistAfter = True";
_animator.setPersistAfter(__c.True);
 //BA.debugLineNum = 139;BA.debugLine="Animator.Start(animatedMenuButton)";
_animator.Start((android.view.View)(_animatedmenubutton.getObject()));
 };
 };
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public String  _menuitem_click() throws Exception{
anywheresoftware.b4a.objects.ImageViewWrapper _item = null;
 //BA.debugLineNum = 188;BA.debugLine="Private Sub MenuItem_Click";
 //BA.debugLineNum = 189;BA.debugLine="If SubExists(mModule, mEventName & \"_Click\") Then";
if (__c.SubExists(ba,_mmodule,_meventname+"_Click")) { 
 //BA.debugLineNum = 190;BA.debugLine="Dim Item As ImageView";
_item = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 191;BA.debugLine="Item = Sender";
_item.setObject((android.widget.ImageView)(__c.Sender(ba)));
 //BA.debugLineNum = 192;BA.debugLine="GetSelectedAnimation(Item)";
_getselectedanimation(_item);
 //BA.debugLineNum = 193;BA.debugLine="CallSubDelayed2(mModule, mEventName & \"_Click\",";
__c.CallSubDelayed2(ba,_mmodule,_meventname+"_Click",_item.getTag());
 };
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return "";
}
public String  _menuitem_longclick() throws Exception{
anywheresoftware.b4a.objects.ImageViewWrapper _item = null;
 //BA.debugLineNum = 199;BA.debugLine="Private Sub MenuItem_LongClick";
 //BA.debugLineNum = 200;BA.debugLine="If SubExists(mModule, mEventName & \"_LongClick\")";
if (__c.SubExists(ba,_mmodule,_meventname+"_LongClick")) { 
 //BA.debugLineNum = 201;BA.debugLine="Dim Item As ImageView";
_item = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 202;BA.debugLine="Item = Sender";
_item.setObject((android.widget.ImageView)(__c.Sender(ba)));
 //BA.debugLineNum = 203;BA.debugLine="CallSubDelayed2(mModule, mEventName & \"_LongClic";
__c.CallSubDelayed2(ba,_mmodule,_meventname+"_LongClick",_item.getTag());
 };
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return "";
}
public String  _setanimatedbuttondimensions(int _width,int _height) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub SetAnimatedButtonDimensions(width As Int, heig";
 //BA.debugLineNum = 212;BA.debugLine="animatedMenuButton.width = width";
_animatedmenubutton.setWidth(_width);
 //BA.debugLineNum = 213;BA.debugLine="animatedMenuButton.height = height";
_animatedmenubutton.setHeight(_height);
 //BA.debugLineNum = 214;BA.debugLine="animatedMenuButton.Left = CenterX - (width / 2)";
_animatedmenubutton.setLeft((int) (_centerx-(_width/(double)2)));
 //BA.debugLineNum = 215;BA.debugLine="animatedMenuButton.Top = CenterY - (height / 2)";
_animatedmenubutton.setTop((int) (_centery-(_height/(double)2)));
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return "";
}
public String  _setdegreespan(int _value) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetDegreeSpan(value As Int)";
 //BA.debugLineNum = 260;BA.debugLine="DegreesSpan = value";
_degreesspan = _value;
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return "";
}
public String  _setmenuitemdimensions(int _width,int _height) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub SetMenuItemDimensions(width As Int, height As";
 //BA.debugLineNum = 235;BA.debugLine="MenuItemWidth = width";
_menuitemwidth = _width;
 //BA.debugLineNum = 236;BA.debugLine="MenuItemHeight = height";
_menuitemheight = _height;
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return "";
}
public String  _setmenuitemradius(int _value) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub SetMenuItemRadius(value As Int)";
 //BA.debugLineNum = 244;BA.debugLine="ItemRadius = value";
_itemradius = _value;
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return "";
}
public String  _setstartdegrees(int _value) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub SetStartDegrees(value As Int)";
 //BA.debugLineNum = 252;BA.debugLine="StartDegrees = value";
_startdegrees = _value;
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return "";
}
public String  _setstaticbuttondimensions(int _width,int _height) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub SetStaticButtonDimensions(width As Int, height";
 //BA.debugLineNum = 223;BA.debugLine="staticMenuButton.width = width";
_staticmenubutton.setWidth(_width);
 //BA.debugLineNum = 224;BA.debugLine="staticMenuButton.height = height";
_staticmenubutton.setHeight(_height);
 //BA.debugLineNum = 225;BA.debugLine="staticMenuButton.Left = CenterX - (width / 2)";
_staticmenubutton.setLeft((int) (_centerx-(_width/(double)2)));
 //BA.debugLineNum = 226;BA.debugLine="staticMenuButton.Top = CenterY - (height / 2)";
_staticmenubutton.setTop((int) (_centery-(_height/(double)2)));
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return "";
}
public String  _toggle() throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub Toggle";
 //BA.debugLineNum = 102;BA.debugLine="menuButton_Click";
_menubutton_click();
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _updatemenuitemposition(anywheresoftware.b4a.objects.ImageViewWrapper _item,int _position) throws Exception{
 //BA.debugLineNum = 375;BA.debugLine="Private Sub UpdateMenuItemPosition(Item As ImageVi";
 //BA.debugLineNum = 376;BA.debugLine="Item.Left = MenuItemNewX.Get(Position)";
_item.setLeft((int)(BA.ObjectToNumber(_menuitemnewx.Get(_position))));
 //BA.debugLineNum = 377;BA.debugLine="Item.Top = MenuItemNewY.Get(Position)";
_item.setTop((int)(BA.ObjectToNumber(_menuitemnewy.Get(_position))));
 //BA.debugLineNum = 378;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
