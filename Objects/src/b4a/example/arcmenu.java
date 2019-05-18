package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class arcmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.arcmenu");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public String  _additem(b4a.example.arcmenu __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _itemimage) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "additem"))
	return (String) Debug.delegate(ba, "additem", new Object[] {_itemimage});
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Sub AddItem(ItemImage As Bitmap)";
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="img.Initialize(\"MenuItem\")";
_img.Initialize(ba,"MenuItem");
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="img.Bitmap = ItemImage";
_img.setBitmap((android.graphics.Bitmap)(_itemimage.getObject()));
RDebugUtils.currentLine=15138821;
 //BA.debugLineNum = 15138821;BA.debugLine="img.Tag = CurrentPosition";
_img.setTag((Object)(__ref._currentposition));
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="img.Gravity = Gravity.FILL";
_img.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=15138823;
 //BA.debugLineNum = 15138823;BA.debugLine="img.Visible = False";
_img.setVisible(__c.False);
RDebugUtils.currentLine=15138824;
 //BA.debugLineNum = 15138824;BA.debugLine="MenuItems.Add(img)";
__ref._menuitems.Add((Object)(_img.getObject()));
RDebugUtils.currentLine=15138826;
 //BA.debugLineNum = 15138826;BA.debugLine="mActivity.AddView(img, CenterX - (MenuItemWidth /";
__ref._mactivity.AddView((android.view.View)(_img.getObject()),(int) (__ref._centerx-(__ref._menuitemwidth/(double)2)),(int) (__ref._centery-(__ref._menuitemheight/(double)2)),__ref._menuitemwidth,__ref._menuitemheight);
RDebugUtils.currentLine=15138828;
 //BA.debugLineNum = 15138828;BA.debugLine="CurrentPosition = CurrentPosition + 1";
__ref._currentposition = (int) (__ref._currentposition+1);
RDebugUtils.currentLine=15138829;
 //BA.debugLineNum = 15138829;BA.debugLine="img.SendToBack";
_img.SendToBack();
RDebugUtils.currentLine=15138831;
 //BA.debugLineNum = 15138831;BA.debugLine="End Sub";
return "";
}
public String  _animitemselected_animationend(b4a.example.arcmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "animitemselected_animationend"))
	return (String) Debug.delegate(ba, "animitemselected_animationend", null);
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
int _i = 0;
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Private Sub AnimItemSelected_AnimationEnd";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=15466499;
 //BA.debugLineNum = 15466499;BA.debugLine="For i = 0 To MenuItems.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._menuitems.getSize()-1);
_i = (int) (0) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
RDebugUtils.currentLine=15466500;
 //BA.debugLineNum = 15466500;BA.debugLine="img = MenuItems.Get(i)";
_img.setObject((android.widget.ImageView)(__ref._menuitems.Get(_i)));
RDebugUtils.currentLine=15466501;
 //BA.debugLineNum = 15466501;BA.debugLine="img.Visible = False";
_img.setVisible(__c.False);
RDebugUtils.currentLine=15466502;
 //BA.debugLineNum = 15466502;BA.debugLine="img.Invalidate";
_img.Invalidate();
RDebugUtils.currentLine=15466503;
 //BA.debugLineNum = 15466503;BA.debugLine="Animator.Stop(img)";
__ref._animator.Stop((android.view.View)(_img.getObject()));
RDebugUtils.currentLine=15466504;
 //BA.debugLineNum = 15466504;BA.debugLine="img.Left = CenterX - (img.Width / 2)";
_img.setLeft((int) (__ref._centerx-(_img.getWidth()/(double)2)));
RDebugUtils.currentLine=15466505;
 //BA.debugLineNum = 15466505;BA.debugLine="img.Top = CenterY - (img.Height / 2)";
_img.setTop((int) (__ref._centery-(_img.getHeight()/(double)2)));
 }
};
RDebugUtils.currentLine=15466507;
 //BA.debugLineNum = 15466507;BA.debugLine="menuOpen = False";
__ref._menuopen = __c.False;
RDebugUtils.currentLine=15466508;
 //BA.debugLineNum = 15466508;BA.debugLine="End Sub";
return "";
}
public String  _animmenuitemmove_animationend(b4a.example.arcmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "animmenuitemmove_animationend"))
	return (String) Debug.delegate(ba, "animmenuitemmove_animationend", null);
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
int _itemposition = 0;
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Private Sub AnimMenuItemMove_AnimationEnd";
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=15400963;
 //BA.debugLineNum = 15400963;BA.debugLine="Dim ItemPosition As Int";
_itemposition = 0;
RDebugUtils.currentLine=15400964;
 //BA.debugLineNum = 15400964;BA.debugLine="If menuOpen = False Then";
if (__ref._menuopen==__c.False) { 
RDebugUtils.currentLine=15400965;
 //BA.debugLineNum = 15400965;BA.debugLine="ItemPosition = (MenuItems.Size - 1) - AnimationE";
_itemposition = (int) ((__ref._menuitems.getSize()-1)-__ref._animationendcount);
 }else {
RDebugUtils.currentLine=15400967;
 //BA.debugLineNum = 15400967;BA.debugLine="ItemPosition = AnimationEndCount";
_itemposition = __ref._animationendcount;
 };
RDebugUtils.currentLine=15400970;
 //BA.debugLineNum = 15400970;BA.debugLine="img = MenuItems.Get(ItemPosition)";
_img.setObject((android.widget.ImageView)(__ref._menuitems.Get(_itemposition)));
RDebugUtils.currentLine=15400972;
 //BA.debugLineNum = 15400972;BA.debugLine="If Not(menuOpen) Then img.Visible = False";
if (__c.Not(__ref._menuopen)) { 
_img.setVisible(__c.False);};
RDebugUtils.currentLine=15400973;
 //BA.debugLineNum = 15400973;BA.debugLine="img.Invalidate";
_img.Invalidate();
RDebugUtils.currentLine=15400974;
 //BA.debugLineNum = 15400974;BA.debugLine="AnimMenuItemMove.Stop(img)";
__ref._animmenuitemmove.Stop((android.view.View)(_img.getObject()));
RDebugUtils.currentLine=15400975;
 //BA.debugLineNum = 15400975;BA.debugLine="UpdateMenuItemPosition(MenuItems.Get(ItemPosition";
__ref._updatemenuitemposition(null,(anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(__ref._menuitems.Get(_itemposition))),_itemposition);
RDebugUtils.currentLine=15400976;
 //BA.debugLineNum = 15400976;BA.debugLine="If AnimationEndCount = MenuItems.Size - 1 Then";
if (__ref._animationendcount==__ref._menuitems.getSize()-1) { 
RDebugUtils.currentLine=15400977;
 //BA.debugLineNum = 15400977;BA.debugLine="IsAnimating = False";
__ref._isanimating = __c.False;
RDebugUtils.currentLine=15400978;
 //BA.debugLineNum = 15400978;BA.debugLine="If SubExists(mModule, mEventName & \"_AnimationEn";
if (__c.SubExists(ba,__ref._mmodule,__ref._meventname+"_AnimationEnd")) { 
__c.CallSubDelayed2(ba,__ref._mmodule,__ref._meventname+"_AnimationEnd",(Object)(__ref._menuopen));};
 }else {
RDebugUtils.currentLine=15400980;
 //BA.debugLineNum = 15400980;BA.debugLine="AnimationEndCount = AnimationEndCount + 1";
__ref._animationendcount = (int) (__ref._animationendcount+1);
 };
RDebugUtils.currentLine=15400983;
 //BA.debugLineNum = 15400983;BA.debugLine="End Sub";
return "";
}
public String  _updatemenuitemposition(b4a.example.arcmenu __ref,anywheresoftware.b4a.objects.ImageViewWrapper _item,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "updatemenuitemposition"))
	return (String) Debug.delegate(ba, "updatemenuitemposition", new Object[] {_item,_position});
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Private Sub UpdateMenuItemPosition(Item As ImageVi";
RDebugUtils.currentLine=16187393;
 //BA.debugLineNum = 16187393;BA.debugLine="Item.Left = MenuItemNewX.Get(Position)";
_item.setLeft((int)(BA.ObjectToNumber(__ref._menuitemnewx.Get(_position))));
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="Item.Top = MenuItemNewY.Get(Position)";
_item.setTop((int)(BA.ObjectToNumber(__ref._menuitemnewy.Get(_position))));
RDebugUtils.currentLine=16187395;
 //BA.debugLineNum = 16187395;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.arcmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="Private MenuItems, MenuItemNewX, MenuItemNewY As";
_menuitems = new anywheresoftware.b4a.objects.collections.List();
_menuitemnewx = new anywheresoftware.b4a.objects.collections.List();
_menuitemnewy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15007748;
 //BA.debugLineNum = 15007748;BA.debugLine="Private Animator, AnimMenuItemRotate, AnimMenuIte";
_animator = new flm.b4a.animationplus.AnimationPlusWrapper();
_animmenuitemrotate = new flm.b4a.animationplus.AnimationPlusWrapper();
_animmenuitemmove = new flm.b4a.animationplus.AnimationPlusWrapper();
RDebugUtils.currentLine=15007749;
 //BA.debugLineNum = 15007749;BA.debugLine="Private AnimSet As AnimationSet";
_animset = new flm.b4a.animationplus.AnimationSet();
RDebugUtils.currentLine=15007750;
 //BA.debugLineNum = 15007750;BA.debugLine="Private IsAnimating As Boolean = False";
_isanimating = __c.False;
RDebugUtils.currentLine=15007751;
 //BA.debugLineNum = 15007751;BA.debugLine="Private staticMenuButton, animatedMenuButton As I";
_staticmenubutton = new anywheresoftware.b4a.objects.ImageViewWrapper();
_animatedmenubutton = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=15007752;
 //BA.debugLineNum = 15007752;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=15007753;
 //BA.debugLineNum = 15007753;BA.debugLine="Private mActivity As Activity";
_mactivity = new anywheresoftware.b4a.objects.ActivityWrapper();
RDebugUtils.currentLine=15007754;
 //BA.debugLineNum = 15007754;BA.debugLine="Private mModule As Object";
_mmodule = new Object();
RDebugUtils.currentLine=15007755;
 //BA.debugLineNum = 15007755;BA.debugLine="Private CenterX, CenterY As Int";
_centerx = 0;
_centery = 0;
RDebugUtils.currentLine=15007756;
 //BA.debugLineNum = 15007756;BA.debugLine="Private menuOpen As Boolean = False";
_menuopen = __c.False;
RDebugUtils.currentLine=15007757;
 //BA.debugLineNum = 15007757;BA.debugLine="Private CurrentPosition As Int = 1";
_currentposition = (int) (1);
RDebugUtils.currentLine=15007758;
 //BA.debugLineNum = 15007758;BA.debugLine="Private AnimationEndCount As Int = 0";
_animationendcount = (int) (0);
RDebugUtils.currentLine=15007759;
 //BA.debugLineNum = 15007759;BA.debugLine="Private MenuItemAnimationDelay As Int = 80";
_menuitemanimationdelay = (int) (80);
RDebugUtils.currentLine=15007762;
 //BA.debugLineNum = 15007762;BA.debugLine="Private StaticMenuButtonWidth As Int = 52dip";
_staticmenubuttonwidth = __c.DipToCurrent((int) (52));
RDebugUtils.currentLine=15007763;
 //BA.debugLineNum = 15007763;BA.debugLine="Private StaticMenuButtonHeight As Int = 52dip";
_staticmenubuttonheight = __c.DipToCurrent((int) (52));
RDebugUtils.currentLine=15007764;
 //BA.debugLineNum = 15007764;BA.debugLine="Private AnimatedMenuButtonWidth As Int = 20dip";
_animatedmenubuttonwidth = __c.DipToCurrent((int) (20));
RDebugUtils.currentLine=15007765;
 //BA.debugLineNum = 15007765;BA.debugLine="Private AnimatedMenuButtonHeight As Int = 20dip";
_animatedmenubuttonheight = __c.DipToCurrent((int) (20));
RDebugUtils.currentLine=15007766;
 //BA.debugLineNum = 15007766;BA.debugLine="Private MenuItemWidth As Int = 40dip";
_menuitemwidth = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=15007767;
 //BA.debugLineNum = 15007767;BA.debugLine="Private MenuItemHeight As Int = 40dip";
_menuitemheight = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=15007768;
 //BA.debugLineNum = 15007768;BA.debugLine="Private StartDegrees As Int = -90";
_startdegrees = (int) (-90);
RDebugUtils.currentLine=15007769;
 //BA.debugLineNum = 15007769;BA.debugLine="Private DegreesSpan As Int = 90";
_degreesspan = (int) (90);
RDebugUtils.currentLine=15007770;
 //BA.debugLineNum = 15007770;BA.debugLine="Private ItemRadius As Int = 120dip";
_itemradius = __c.DipToCurrent((int) (120));
RDebugUtils.currentLine=15007773;
 //BA.debugLineNum = 15007773;BA.debugLine="End Sub";
return "";
}
public flm.b4a.animationplus.AnimationSet  _getmenuitemanimation(b4a.example.arcmenu __ref,anywheresoftware.b4a.objects.ImageViewWrapper _menuitem,boolean _open) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "getmenuitemanimation"))
	return (flm.b4a.animationplus.AnimationSet) Debug.delegate(ba, "getmenuitemanimation", new Object[] {_menuitem,_open});
flm.b4a.animationplus.AnimationSet _subanimset = null;
int _tox = 0;
int _toy = 0;
int _itemposition = 0;
float _degreesperitem = 0f;
float _degreeradians = 0f;
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Private Sub GetMenuItemAnimation(MenuItem As Image";
RDebugUtils.currentLine=16056321;
 //BA.debugLineNum = 16056321;BA.debugLine="Dim SubAnimSet As AnimationSet";
_subanimset = new flm.b4a.animationplus.AnimationSet();
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="Dim ToX, ToY, ItemPosition As Int";
_tox = 0;
_toy = 0;
_itemposition = 0;
RDebugUtils.currentLine=16056323;
 //BA.debugLineNum = 16056323;BA.debugLine="Dim DegreesPerItem, DegreeRadians As Float";
_degreesperitem = 0f;
_degreeradians = 0f;
RDebugUtils.currentLine=16056325;
 //BA.debugLineNum = 16056325;BA.debugLine="SubAnimSet.Initialize(False)";
_subanimset.Initialize(__c.False);
RDebugUtils.currentLine=16056327;
 //BA.debugLineNum = 16056327;BA.debugLine="ItemPosition = MenuItem.Tag";
_itemposition = (int)(BA.ObjectToNumber(_menuitem.getTag()));
RDebugUtils.currentLine=16056329;
 //BA.debugLineNum = 16056329;BA.debugLine="If DegreesSpan = 360 Then DegreesSpan = 360 - (36";
if (__ref._degreesspan==360) { 
__ref._degreesspan = (int) (360-(360/(double)__ref._menuitems.getSize()));};
RDebugUtils.currentLine=16056331;
 //BA.debugLineNum = 16056331;BA.debugLine="If MenuItems.Size > 1 Then";
if (__ref._menuitems.getSize()>1) { 
RDebugUtils.currentLine=16056332;
 //BA.debugLineNum = 16056332;BA.debugLine="DegreesPerItem = DegreesSpan / (MenuItems.Size -";
_degreesperitem = (float) (__ref._degreesspan/(double)(__ref._menuitems.getSize()-1));
 }else {
RDebugUtils.currentLine=16056334;
 //BA.debugLineNum = 16056334;BA.debugLine="DegreesPerItem = DegreesSpan";
_degreesperitem = (float) (__ref._degreesspan);
 };
RDebugUtils.currentLine=16056336;
 //BA.debugLineNum = 16056336;BA.debugLine="DegreeRadians = (StartDegrees + (DegreesPerItem *";
_degreeradians = (float) ((__ref._startdegrees+(_degreesperitem*(_itemposition-1)))*__c.cPI/(double)180);
RDebugUtils.currentLine=16056338;
 //BA.debugLineNum = 16056338;BA.debugLine="ToY = (ItemRadius * (Cos(DegreeRadians)))";
_toy = (int) ((__ref._itemradius*(__c.Cos(_degreeradians))));
RDebugUtils.currentLine=16056339;
 //BA.debugLineNum = 16056339;BA.debugLine="ToX = (ItemRadius * (Sin(DegreeRadians)))";
_tox = (int) ((__ref._itemradius*(__c.Sin(_degreeradians))));
RDebugUtils.currentLine=16056340;
 //BA.debugLineNum = 16056340;BA.debugLine="If Open Then";
if (_open) { 
RDebugUtils.currentLine=16056341;
 //BA.debugLineNum = 16056341;BA.debugLine="MenuItem.Visible = True";
_menuitem.setVisible(__c.True);
RDebugUtils.currentLine=16056342;
 //BA.debugLineNum = 16056342;BA.debugLine="AnimMenuItemRotate.InitializeRotateCenter(\"\", 0,";
__ref._animmenuitemrotate.InitializeRotateCenter(ba,"",(float) (0),(float) (360),(android.view.View)(_menuitem.getObject()));
RDebugUtils.currentLine=16056343;
 //BA.debugLineNum = 16056343;BA.debugLine="AnimMenuItemMove.InitializeTranslate(\"AnimMenuIt";
__ref._animmenuitemmove.InitializeTranslate(ba,"AnimMenuItemMove",(float) (0),(float) (0),(float) (_tox),(float) (-_toy));
RDebugUtils.currentLine=16056344;
 //BA.debugLineNum = 16056344;BA.debugLine="SubAnimSet.StartOffset = MenuItemAnimationDelay";
_subanimset.setStartOffset((long) (__ref._menuitemanimationdelay*_itemposition));
RDebugUtils.currentLine=16056345;
 //BA.debugLineNum = 16056345;BA.debugLine="AnimMenuItemMove.SetInterpolator(AnimMenuItemMov";
__ref._animmenuitemmove.SetInterpolator(__ref._animmenuitemmove.INTERPOLATOR_OVERSHOOT);
RDebugUtils.currentLine=16056346;
 //BA.debugLineNum = 16056346;BA.debugLine="MenuItemNewX.Add(MenuItem.Left + ToX)";
__ref._menuitemnewx.Add((Object)(_menuitem.getLeft()+_tox));
RDebugUtils.currentLine=16056347;
 //BA.debugLineNum = 16056347;BA.debugLine="MenuItemNewY.Add(MenuItem.Top - ToY)";
__ref._menuitemnewy.Add((Object)(_menuitem.getTop()-_toy));
 }else {
RDebugUtils.currentLine=16056349;
 //BA.debugLineNum = 16056349;BA.debugLine="AnimMenuItemRotate.InitializeRotateCenter(\"\", 36";
__ref._animmenuitemrotate.InitializeRotateCenter(ba,"",(float) (360),(float) (0),(android.view.View)(_menuitem.getObject()));
RDebugUtils.currentLine=16056350;
 //BA.debugLineNum = 16056350;BA.debugLine="AnimMenuItemMove.InitializeTranslate(\"AnimMenuIt";
__ref._animmenuitemmove.InitializeTranslate(ba,"AnimMenuItemMove",(float) (0),(float) (0),(float) (-_tox),(float) (_toy));
RDebugUtils.currentLine=16056351;
 //BA.debugLineNum = 16056351;BA.debugLine="SubAnimSet.StartOffset = MenuItemAnimationDelay";
_subanimset.setStartOffset((long) (__ref._menuitemanimationdelay*((__ref._menuitems.getSize()-1)-_itemposition)));
RDebugUtils.currentLine=16056352;
 //BA.debugLineNum = 16056352;BA.debugLine="AnimMenuItemMove.SetInterpolator(AnimMenuItemMov";
__ref._animmenuitemmove.SetInterpolator(__ref._animmenuitemmove.INTERPOLATOR_ANTICIPATE);
RDebugUtils.currentLine=16056353;
 //BA.debugLineNum = 16056353;BA.debugLine="MenuItemNewX.Add(MenuItem.Left - ToX)";
__ref._menuitemnewx.Add((Object)(_menuitem.getLeft()-_tox));
RDebugUtils.currentLine=16056354;
 //BA.debugLineNum = 16056354;BA.debugLine="MenuItemNewY.Add(MenuItem.Top + ToY)";
__ref._menuitemnewy.Add((Object)(_menuitem.getTop()+_toy));
 };
RDebugUtils.currentLine=16056358;
 //BA.debugLineNum = 16056358;BA.debugLine="AnimMenuItemRotate.Duration = 400";
__ref._animmenuitemrotate.setDuration((long) (400));
RDebugUtils.currentLine=16056359;
 //BA.debugLineNum = 16056359;BA.debugLine="AnimMenuItemRotate.RepeatCount = 0";
__ref._animmenuitemrotate.setRepeatCount((int) (0));
RDebugUtils.currentLine=16056360;
 //BA.debugLineNum = 16056360;BA.debugLine="AnimMenuItemRotate.PersistAfter = True";
__ref._animmenuitemrotate.setPersistAfter(__c.True);
RDebugUtils.currentLine=16056361;
 //BA.debugLineNum = 16056361;BA.debugLine="AnimMenuItemMove.Duration = 450";
__ref._animmenuitemmove.setDuration((long) (450));
RDebugUtils.currentLine=16056362;
 //BA.debugLineNum = 16056362;BA.debugLine="AnimMenuItemMove.RepeatCount = 0";
__ref._animmenuitemmove.setRepeatCount((int) (0));
RDebugUtils.currentLine=16056363;
 //BA.debugLineNum = 16056363;BA.debugLine="AnimMenuItemMove.PersistAfter = True";
__ref._animmenuitemmove.setPersistAfter(__c.True);
RDebugUtils.currentLine=16056365;
 //BA.debugLineNum = 16056365;BA.debugLine="SubAnimSet.AddAnimation(AnimMenuItemRotate)";
_subanimset.AddAnimation(__ref._animmenuitemrotate);
RDebugUtils.currentLine=16056366;
 //BA.debugLineNum = 16056366;BA.debugLine="SubAnimSet.AddAnimation(AnimMenuItemMove)";
_subanimset.AddAnimation(__ref._animmenuitemmove);
RDebugUtils.currentLine=16056368;
 //BA.debugLineNum = 16056368;BA.debugLine="SubAnimSet.PersistAfter = True";
_subanimset.setPersistAfter(__c.True);
RDebugUtils.currentLine=16056370;
 //BA.debugLineNum = 16056370;BA.debugLine="Return SubAnimSet";
if (true) return _subanimset;
RDebugUtils.currentLine=16056371;
 //BA.debugLineNum = 16056371;BA.debugLine="End Sub";
return null;
}
public String  _getselectedanimation(b4a.example.arcmenu __ref,anywheresoftware.b4a.objects.ImageViewWrapper _menuitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "getselectedanimation"))
	return (String) Debug.delegate(ba, "getselectedanimation", new Object[] {_menuitem});
int _itemposition = 0;
anywheresoftware.b4a.objects.ImageViewWrapper _item = null;
flm.b4a.animationplus.AnimationPlusWrapper _animrotate = null;
flm.b4a.animationplus.AnimationPlusWrapper _animfade = null;
flm.b4a.animationplus.AnimationPlusWrapper _animscale = null;
int _i = 0;
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Private Sub GetSelectedAnimation(MenuItem As Image";
RDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="Dim ItemPosition As Int";
_itemposition = 0;
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="Dim item As ImageView";
_item = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=16121859;
 //BA.debugLineNum = 16121859;BA.debugLine="Dim AnimRotate, AnimFade, AnimScale As AnimationP";
_animrotate = new flm.b4a.animationplus.AnimationPlusWrapper();
_animfade = new flm.b4a.animationplus.AnimationPlusWrapper();
_animscale = new flm.b4a.animationplus.AnimationPlusWrapper();
RDebugUtils.currentLine=16121860;
 //BA.debugLineNum = 16121860;BA.debugLine="Dim AnimSet As AnimationSet";
_animset = new flm.b4a.animationplus.AnimationSet();
RDebugUtils.currentLine=16121862;
 //BA.debugLineNum = 16121862;BA.debugLine="AnimSet.Initialize(False)";
__ref._animset.Initialize(__c.False);
RDebugUtils.currentLine=16121863;
 //BA.debugLineNum = 16121863;BA.debugLine="ItemPosition = MenuItem.Tag";
_itemposition = (int)(BA.ObjectToNumber(_menuitem.getTag()));
RDebugUtils.currentLine=16121865;
 //BA.debugLineNum = 16121865;BA.debugLine="For i = 0 To MenuItems.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._menuitems.getSize()-1);
_i = (int) (0) ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
RDebugUtils.currentLine=16121866;
 //BA.debugLineNum = 16121866;BA.debugLine="item = MenuItems.Get(i)";
_item.setObject((android.widget.ImageView)(__ref._menuitems.Get(_i)));
RDebugUtils.currentLine=16121867;
 //BA.debugLineNum = 16121867;BA.debugLine="If item.Tag = ItemPosition Then";
if ((_item.getTag()).equals((Object)(_itemposition))) { 
RDebugUtils.currentLine=16121869;
 //BA.debugLineNum = 16121869;BA.debugLine="AnimRotate.InitializeRotateCenter(\"\", 0, 360, i";
_animrotate.InitializeRotateCenter(ba,"",(float) (0),(float) (360),(android.view.View)(_item.getObject()));
RDebugUtils.currentLine=16121870;
 //BA.debugLineNum = 16121870;BA.debugLine="AnimScale.InitializeScaleCenter(\"\", 1, 1, 2, 2,";
_animscale.InitializeScaleCenter(ba,"",(float) (1),(float) (1),(float) (2),(float) (2),(android.view.View)(_item.getObject()));
 }else {
RDebugUtils.currentLine=16121873;
 //BA.debugLineNum = 16121873;BA.debugLine="AnimRotate.InitializeRotateCenter(\"\", 360, 0, i";
_animrotate.InitializeRotateCenter(ba,"",(float) (360),(float) (0),(android.view.View)(_item.getObject()));
RDebugUtils.currentLine=16121874;
 //BA.debugLineNum = 16121874;BA.debugLine="AnimScale.InitializeScaleCenter(\"\", 1, 1, 0, 0,";
_animscale.InitializeScaleCenter(ba,"",(float) (1),(float) (1),(float) (0),(float) (0),(android.view.View)(_item.getObject()));
 };
RDebugUtils.currentLine=16121877;
 //BA.debugLineNum = 16121877;BA.debugLine="If i = MenuItems.Size - 1 Then";
if (_i==__ref._menuitems.getSize()-1) { 
RDebugUtils.currentLine=16121878;
 //BA.debugLineNum = 16121878;BA.debugLine="AnimFade.InitializeAlpha(\"AnimItemSelected\", 1,";
_animfade.InitializeAlpha(ba,"AnimItemSelected",(float) (1),(float) (0));
 }else {
RDebugUtils.currentLine=16121880;
 //BA.debugLineNum = 16121880;BA.debugLine="AnimFade.InitializeAlpha(\"\", 1, 0)";
_animfade.InitializeAlpha(ba,"",(float) (1),(float) (0));
 };
RDebugUtils.currentLine=16121883;
 //BA.debugLineNum = 16121883;BA.debugLine="AnimRotate.Duration = 200";
_animrotate.setDuration((long) (200));
RDebugUtils.currentLine=16121884;
 //BA.debugLineNum = 16121884;BA.debugLine="AnimRotate.RepeatCount = 3";
_animrotate.setRepeatCount((int) (3));
RDebugUtils.currentLine=16121885;
 //BA.debugLineNum = 16121885;BA.debugLine="AnimFade.Duration = 400";
_animfade.setDuration((long) (400));
RDebugUtils.currentLine=16121886;
 //BA.debugLineNum = 16121886;BA.debugLine="AnimFade.RepeatCount = 0";
_animfade.setRepeatCount((int) (0));
RDebugUtils.currentLine=16121887;
 //BA.debugLineNum = 16121887;BA.debugLine="AnimScale.Duration = 400";
_animscale.setDuration((long) (400));
RDebugUtils.currentLine=16121888;
 //BA.debugLineNum = 16121888;BA.debugLine="AnimScale.RepeatCount = 0";
_animscale.setRepeatCount((int) (0));
RDebugUtils.currentLine=16121890;
 //BA.debugLineNum = 16121890;BA.debugLine="AnimSet.Initialize(False)";
__ref._animset.Initialize(__c.False);
RDebugUtils.currentLine=16121891;
 //BA.debugLineNum = 16121891;BA.debugLine="AnimSet.AddAnimation(AnimRotate)";
__ref._animset.AddAnimation(_animrotate);
RDebugUtils.currentLine=16121892;
 //BA.debugLineNum = 16121892;BA.debugLine="AnimSet.AddAnimation(AnimFade)";
__ref._animset.AddAnimation(_animfade);
RDebugUtils.currentLine=16121893;
 //BA.debugLineNum = 16121893;BA.debugLine="AnimSet.AddAnimation(AnimScale)";
__ref._animset.AddAnimation(_animscale);
RDebugUtils.currentLine=16121894;
 //BA.debugLineNum = 16121894;BA.debugLine="AnimSet.SetInterpolator(AnimSet.INTERPOLATOR_DEC";
__ref._animset.SetInterpolator(__ref._animset.INTERPOLATOR_DECELERATE);
RDebugUtils.currentLine=16121895;
 //BA.debugLineNum = 16121895;BA.debugLine="AnimSet.PersistAfter = True";
__ref._animset.setPersistAfter(__c.True);
RDebugUtils.currentLine=16121896;
 //BA.debugLineNum = 16121896;BA.debugLine="AnimSet.Start(item)";
__ref._animset.Start((android.view.View)(_item.getObject()));
 }
};
RDebugUtils.currentLine=16121900;
 //BA.debugLineNum = 16121900;BA.debugLine="If animatedMenuButton.IsInitialized Then";
if (__ref._animatedmenubutton.IsInitialized()) { 
RDebugUtils.currentLine=16121901;
 //BA.debugLineNum = 16121901;BA.debugLine="Animator.InitializeRotateCenter(\"menuButtonRotat";
__ref._animator.InitializeRotateCenter(ba,"menuButtonRotate",(float) (45),(float) (0),(android.view.View)(__ref._animatedmenubutton.getObject()));
RDebugUtils.currentLine=16121902;
 //BA.debugLineNum = 16121902;BA.debugLine="Animator.Duration = 400";
__ref._animator.setDuration((long) (400));
RDebugUtils.currentLine=16121903;
 //BA.debugLineNum = 16121903;BA.debugLine="Animator.RepeatCount = 0";
__ref._animator.setRepeatCount((int) (0));
RDebugUtils.currentLine=16121904;
 //BA.debugLineNum = 16121904;BA.debugLine="Animator.PersistAfter = True";
__ref._animator.setPersistAfter(__c.True);
RDebugUtils.currentLine=16121905;
 //BA.debugLineNum = 16121905;BA.debugLine="Animator.Start(animatedMenuButton)";
__ref._animator.Start((android.view.View)(__ref._animatedmenubutton.getObject()));
 };
RDebugUtils.currentLine=16121907;
 //BA.debugLineNum = 16121907;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.arcmenu __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.PanelWrapper _activity,Object _module,String _eventname,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _animatedbuttonimage,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _staticbuttonimage,int _x,int _y) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba,_activity,_module,_eventname,_animatedbuttonimage,_staticbuttonimage,_x,_y});
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Public Sub Initialize(Activity As Panel, Module As";
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="CenterX = x";
__ref._centerx = _x;
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="CenterY = y";
__ref._centery = _y;
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=15073285;
 //BA.debugLineNum = 15073285;BA.debugLine="mActivity = Activity";
__ref._mactivity.setObject((anywheresoftware.b4a.BALayout)(_activity.getObject()));
RDebugUtils.currentLine=15073286;
 //BA.debugLineNum = 15073286;BA.debugLine="mModule = Module";
__ref._mmodule = _module;
RDebugUtils.currentLine=15073288;
 //BA.debugLineNum = 15073288;BA.debugLine="MenuItems.Initialize";
__ref._menuitems.Initialize();
RDebugUtils.currentLine=15073290;
 //BA.debugLineNum = 15073290;BA.debugLine="If StaticButtonImage.IsInitialized Then";
if (_staticbuttonimage.IsInitialized()) { 
RDebugUtils.currentLine=15073291;
 //BA.debugLineNum = 15073291;BA.debugLine="staticMenuButton.Initialize(\"menuButton\")";
__ref._staticmenubutton.Initialize(ba,"menuButton");
RDebugUtils.currentLine=15073292;
 //BA.debugLineNum = 15073292;BA.debugLine="staticMenuButton.Bitmap = StaticButtonImage";
__ref._staticmenubutton.setBitmap((android.graphics.Bitmap)(_staticbuttonimage.getObject()));
RDebugUtils.currentLine=15073293;
 //BA.debugLineNum = 15073293;BA.debugLine="staticMenuButton.Gravity = Gravity.FILL";
__ref._staticmenubutton.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=15073295;
 //BA.debugLineNum = 15073295;BA.debugLine="Activity.AddView(staticMenuButton, x - (StaticMe";
_activity.AddView((android.view.View)(__ref._staticmenubutton.getObject()),(int) (_x-(__ref._staticmenubuttonwidth/(double)2)),(int) (_y-(__ref._staticmenubuttonheight/(double)2)),__ref._staticmenubuttonwidth,__ref._staticmenubuttonheight);
RDebugUtils.currentLine=15073296;
 //BA.debugLineNum = 15073296;BA.debugLine="staticMenuButton.BringToFront";
__ref._staticmenubutton.BringToFront();
 };
RDebugUtils.currentLine=15073299;
 //BA.debugLineNum = 15073299;BA.debugLine="If AnimatedButtonImage.IsInitialized Then";
if (_animatedbuttonimage.IsInitialized()) { 
RDebugUtils.currentLine=15073300;
 //BA.debugLineNum = 15073300;BA.debugLine="animatedMenuButton.Initialize(\"menuButton\")";
__ref._animatedmenubutton.Initialize(ba,"menuButton");
RDebugUtils.currentLine=15073301;
 //BA.debugLineNum = 15073301;BA.debugLine="animatedMenuButton.Bitmap = AnimatedButtonImage";
__ref._animatedmenubutton.setBitmap((android.graphics.Bitmap)(_animatedbuttonimage.getObject()));
RDebugUtils.currentLine=15073302;
 //BA.debugLineNum = 15073302;BA.debugLine="animatedMenuButton.Gravity = Gravity.FILL";
__ref._animatedmenubutton.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=15073304;
 //BA.debugLineNum = 15073304;BA.debugLine="Activity.AddView(animatedMenuButton, x - (Animat";
_activity.AddView((android.view.View)(__ref._animatedmenubutton.getObject()),(int) (_x-(__ref._animatedmenubuttonwidth/(double)2)),(int) (_y-(__ref._animatedmenubuttonheight/(double)2)),__ref._animatedmenubuttonwidth,__ref._animatedmenubuttonheight);
RDebugUtils.currentLine=15073305;
 //BA.debugLineNum = 15073305;BA.debugLine="animatedMenuButton.BringToFront";
__ref._animatedmenubutton.BringToFront();
 };
RDebugUtils.currentLine=15073308;
 //BA.debugLineNum = 15073308;BA.debugLine="staticMenuButton.BringToFront";
__ref._staticmenubutton.BringToFront();
RDebugUtils.currentLine=15073309;
 //BA.debugLineNum = 15073309;BA.debugLine="animatedMenuButton.BringToFront";
__ref._animatedmenubutton.BringToFront();
RDebugUtils.currentLine=15073310;
 //BA.debugLineNum = 15073310;BA.debugLine="End Sub";
return "";
}
public boolean  _isopen(b4a.example.arcmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "isopen"))
	return (Boolean) Debug.delegate(ba, "isopen", null);
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Sub IsOpen As Boolean";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="Return menuOpen";
if (true) return __ref._menuopen;
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="End Sub";
return false;
}
public String  _menubutton_click(b4a.example.arcmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "menubutton_click"))
	return (String) Debug.delegate(ba, "menubutton_click", null);
int _i = 0;
anywheresoftware.b4a.objects.ConcreteViewWrapper _a = null;
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Private Sub menuButton_Click";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="If Not(IsAnimating) Then";
if (__c.Not(__ref._isanimating)) { 
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="MenuItemNewX.Initialize";
__ref._menuitemnewx.Initialize();
RDebugUtils.currentLine=15335427;
 //BA.debugLineNum = 15335427;BA.debugLine="MenuItemNewY.Initialize";
__ref._menuitemnewy.Initialize();
RDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="If menuOpen Then";
if (__ref._menuopen) { 
RDebugUtils.currentLine=15335429;
 //BA.debugLineNum = 15335429;BA.debugLine="If animatedMenuButton.IsInitialized Then Animat";
if (__ref._animatedmenubutton.IsInitialized()) { 
__ref._animator.InitializeRotateCenter(ba,"menuButtonRotate",(float) (45),(float) (0),(android.view.View)(__ref._animatedmenubutton.getObject()));};
RDebugUtils.currentLine=15335430;
 //BA.debugLineNum = 15335430;BA.debugLine="For i = MenuItems.Size - 1 To 0 Step -1";
{
final int step6 = (int) (-1);
final int limit6 = (int) (0);
_i = (int) (__ref._menuitems.getSize()-1) ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
RDebugUtils.currentLine=15335431;
 //BA.debugLineNum = 15335431;BA.debugLine="AnimSet = GetMenuItemAnimation(MenuItems.Get(i";
__ref._animset = __ref._getmenuitemanimation(null,(anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(__ref._menuitems.Get(_i))),__c.Not(__ref._menuopen));
RDebugUtils.currentLine=15335432;
 //BA.debugLineNum = 15335432;BA.debugLine="AnimSet.Start(MenuItems.Get(i))";
__ref._animset.Start((android.view.View)(__ref._menuitems.Get(_i)));
RDebugUtils.currentLine=15335433;
 //BA.debugLineNum = 15335433;BA.debugLine="Dim a As View";
_a = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=15335434;
 //BA.debugLineNum = 15335434;BA.debugLine="a = MenuItems.Get(i)";
_a.setObject((android.view.View)(__ref._menuitems.Get(_i)));
RDebugUtils.currentLine=15335435;
 //BA.debugLineNum = 15335435;BA.debugLine="a.BringToFront";
_a.BringToFront();
 }
};
 }else {
RDebugUtils.currentLine=15335438;
 //BA.debugLineNum = 15335438;BA.debugLine="If animatedMenuButton.IsInitialized Then Animat";
if (__ref._animatedmenubutton.IsInitialized()) { 
__ref._animator.InitializeRotateCenter(ba,"menuButtonUnRotate",(float) (0),(float) (45),(android.view.View)(__ref._animatedmenubutton.getObject()));};
RDebugUtils.currentLine=15335439;
 //BA.debugLineNum = 15335439;BA.debugLine="For i = 0 To MenuItems.Size - 1";
{
final int step15 = 1;
final int limit15 = (int) (__ref._menuitems.getSize()-1);
_i = (int) (0) ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
RDebugUtils.currentLine=15335440;
 //BA.debugLineNum = 15335440;BA.debugLine="AnimSet = GetMenuItemAnimation(MenuItems.Get(i";
__ref._animset = __ref._getmenuitemanimation(null,(anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(__ref._menuitems.Get(_i))),__c.Not(__ref._menuopen));
RDebugUtils.currentLine=15335441;
 //BA.debugLineNum = 15335441;BA.debugLine="AnimSet.Start(MenuItems.Get(i))";
__ref._animset.Start((android.view.View)(__ref._menuitems.Get(_i)));
 }
};
 };
RDebugUtils.currentLine=15335446;
 //BA.debugLineNum = 15335446;BA.debugLine="IsAnimating = True";
__ref._isanimating = __c.True;
RDebugUtils.currentLine=15335447;
 //BA.debugLineNum = 15335447;BA.debugLine="menuOpen = Not(menuOpen)";
__ref._menuopen = __c.Not(__ref._menuopen);
RDebugUtils.currentLine=15335448;
 //BA.debugLineNum = 15335448;BA.debugLine="AnimationEndCount = 0";
__ref._animationendcount = (int) (0);
RDebugUtils.currentLine=15335449;
 //BA.debugLineNum = 15335449;BA.debugLine="If animatedMenuButton.IsInitialized Then";
if (__ref._animatedmenubutton.IsInitialized()) { 
RDebugUtils.currentLine=15335450;
 //BA.debugLineNum = 15335450;BA.debugLine="Animator.Duration = 400";
__ref._animator.setDuration((long) (400));
RDebugUtils.currentLine=15335451;
 //BA.debugLineNum = 15335451;BA.debugLine="Animator.RepeatCount = 0";
__ref._animator.setRepeatCount((int) (0));
RDebugUtils.currentLine=15335452;
 //BA.debugLineNum = 15335452;BA.debugLine="Animator.PersistAfter = True";
__ref._animator.setPersistAfter(__c.True);
RDebugUtils.currentLine=15335453;
 //BA.debugLineNum = 15335453;BA.debugLine="Animator.Start(animatedMenuButton)";
__ref._animator.Start((android.view.View)(__ref._animatedmenubutton.getObject()));
 };
 };
RDebugUtils.currentLine=15335457;
 //BA.debugLineNum = 15335457;BA.debugLine="End Sub";
return "";
}
public String  _menuitem_click(b4a.example.arcmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "menuitem_click"))
	return (String) Debug.delegate(ba, "menuitem_click", null);
anywheresoftware.b4a.objects.ImageViewWrapper _item = null;
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Private Sub MenuItem_Click";
RDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="If SubExists(mModule, mEventName & \"_Click\") Then";
if (__c.SubExists(ba,__ref._mmodule,__ref._meventname+"_Click")) { 
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="Dim Item As ImageView";
_item = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=15532035;
 //BA.debugLineNum = 15532035;BA.debugLine="Item = Sender";
_item.setObject((android.widget.ImageView)(__c.Sender(ba)));
RDebugUtils.currentLine=15532036;
 //BA.debugLineNum = 15532036;BA.debugLine="GetSelectedAnimation(Item)";
__ref._getselectedanimation(null,_item);
RDebugUtils.currentLine=15532037;
 //BA.debugLineNum = 15532037;BA.debugLine="CallSubDelayed2(mModule, mEventName & \"_Click\",";
__c.CallSubDelayed2(ba,__ref._mmodule,__ref._meventname+"_Click",_item.getTag());
 };
RDebugUtils.currentLine=15532039;
 //BA.debugLineNum = 15532039;BA.debugLine="End Sub";
return "";
}
public String  _menuitem_longclick(b4a.example.arcmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "menuitem_longclick"))
	return (String) Debug.delegate(ba, "menuitem_longclick", null);
anywheresoftware.b4a.objects.ImageViewWrapper _item = null;
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Private Sub MenuItem_LongClick";
RDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="If SubExists(mModule, mEventName & \"_LongClick\")";
if (__c.SubExists(ba,__ref._mmodule,__ref._meventname+"_LongClick")) { 
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="Dim Item As ImageView";
_item = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=15597571;
 //BA.debugLineNum = 15597571;BA.debugLine="Item = Sender";
_item.setObject((android.widget.ImageView)(__c.Sender(ba)));
RDebugUtils.currentLine=15597572;
 //BA.debugLineNum = 15597572;BA.debugLine="CallSubDelayed2(mModule, mEventName & \"_LongClic";
__c.CallSubDelayed2(ba,__ref._mmodule,__ref._meventname+"_LongClick",_item.getTag());
 };
RDebugUtils.currentLine=15597574;
 //BA.debugLineNum = 15597574;BA.debugLine="End Sub";
return "";
}
public String  _setanimatedbuttondimensions(b4a.example.arcmenu __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "setanimatedbuttondimensions"))
	return (String) Debug.delegate(ba, "setanimatedbuttondimensions", new Object[] {_width,_height});
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Sub SetAnimatedButtonDimensions(width As Int, heig";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="animatedMenuButton.width = width";
__ref._animatedmenubutton.setWidth(_width);
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="animatedMenuButton.height = height";
__ref._animatedmenubutton.setHeight(_height);
RDebugUtils.currentLine=15663107;
 //BA.debugLineNum = 15663107;BA.debugLine="animatedMenuButton.Left = CenterX - (width / 2)";
__ref._animatedmenubutton.setLeft((int) (__ref._centerx-(_width/(double)2)));
RDebugUtils.currentLine=15663108;
 //BA.debugLineNum = 15663108;BA.debugLine="animatedMenuButton.Top = CenterY - (height / 2)";
__ref._animatedmenubutton.setTop((int) (__ref._centery-(_height/(double)2)));
RDebugUtils.currentLine=15663109;
 //BA.debugLineNum = 15663109;BA.debugLine="End Sub";
return "";
}
public String  _setdegreespan(b4a.example.arcmenu __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "setdegreespan"))
	return (String) Debug.delegate(ba, "setdegreespan", new Object[] {_value});
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Sub SetDegreeSpan(value As Int)";
RDebugUtils.currentLine=15990785;
 //BA.debugLineNum = 15990785;BA.debugLine="DegreesSpan = value";
__ref._degreesspan = _value;
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="End Sub";
return "";
}
public String  _setmenuitemdimensions(b4a.example.arcmenu __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "setmenuitemdimensions"))
	return (String) Debug.delegate(ba, "setmenuitemdimensions", new Object[] {_width,_height});
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Sub SetMenuItemDimensions(width As Int, height As";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="MenuItemWidth = width";
__ref._menuitemwidth = _width;
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="MenuItemHeight = height";
__ref._menuitemheight = _height;
RDebugUtils.currentLine=15794179;
 //BA.debugLineNum = 15794179;BA.debugLine="End Sub";
return "";
}
public String  _setmenuitemradius(b4a.example.arcmenu __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "setmenuitemradius"))
	return (String) Debug.delegate(ba, "setmenuitemradius", new Object[] {_value});
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Sub SetMenuItemRadius(value As Int)";
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="ItemRadius = value";
__ref._itemradius = _value;
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="End Sub";
return "";
}
public String  _setstartdegrees(b4a.example.arcmenu __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "setstartdegrees"))
	return (String) Debug.delegate(ba, "setstartdegrees", new Object[] {_value});
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Sub SetStartDegrees(value As Int)";
RDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="StartDegrees = value";
__ref._startdegrees = _value;
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="End Sub";
return "";
}
public String  _setstaticbuttondimensions(b4a.example.arcmenu __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "setstaticbuttondimensions"))
	return (String) Debug.delegate(ba, "setstaticbuttondimensions", new Object[] {_width,_height});
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Sub SetStaticButtonDimensions(width As Int, height";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="staticMenuButton.width = width";
__ref._staticmenubutton.setWidth(_width);
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="staticMenuButton.height = height";
__ref._staticmenubutton.setHeight(_height);
RDebugUtils.currentLine=15728643;
 //BA.debugLineNum = 15728643;BA.debugLine="staticMenuButton.Left = CenterX - (width / 2)";
__ref._staticmenubutton.setLeft((int) (__ref._centerx-(_width/(double)2)));
RDebugUtils.currentLine=15728644;
 //BA.debugLineNum = 15728644;BA.debugLine="staticMenuButton.Top = CenterY - (height / 2)";
__ref._staticmenubutton.setTop((int) (__ref._centery-(_height/(double)2)));
RDebugUtils.currentLine=15728645;
 //BA.debugLineNum = 15728645;BA.debugLine="End Sub";
return "";
}
public String  _toggle(b4a.example.arcmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="arcmenu";
if (Debug.shouldDelegate(ba, "toggle"))
	return (String) Debug.delegate(ba, "toggle", null);
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Sub Toggle";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="menuButton_Click";
__ref._menubutton_click(null);
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="End Sub";
return "";
}
}