
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class arcmenu {
    public static RemoteObject myClass;
	public arcmenu() {
	}
    public static PCBA staticBA = new PCBA(null, arcmenu.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _menuitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _menuitemnewx = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _menuitemnewy = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _animator = RemoteObject.declareNull("flm.b4a.animationplus.AnimationPlusWrapper");
public static RemoteObject _animmenuitemrotate = RemoteObject.declareNull("flm.b4a.animationplus.AnimationPlusWrapper");
public static RemoteObject _animmenuitemmove = RemoteObject.declareNull("flm.b4a.animationplus.AnimationPlusWrapper");
public static RemoteObject _animset = RemoteObject.declareNull("flm.b4a.animationplus.AnimationSet");
public static RemoteObject _isanimating = RemoteObject.createImmutable(false);
public static RemoteObject _staticmenubutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _animatedmenubutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mactivity = RemoteObject.declareNull("anywheresoftware.b4a.objects.ActivityWrapper");
public static RemoteObject _mmodule = RemoteObject.declareNull("Object");
public static RemoteObject _centerx = RemoteObject.createImmutable(0);
public static RemoteObject _centery = RemoteObject.createImmutable(0);
public static RemoteObject _menuopen = RemoteObject.createImmutable(false);
public static RemoteObject _currentposition = RemoteObject.createImmutable(0);
public static RemoteObject _animationendcount = RemoteObject.createImmutable(0);
public static RemoteObject _menuitemanimationdelay = RemoteObject.createImmutable(0);
public static RemoteObject _staticmenubuttonwidth = RemoteObject.createImmutable(0);
public static RemoteObject _staticmenubuttonheight = RemoteObject.createImmutable(0);
public static RemoteObject _animatedmenubuttonwidth = RemoteObject.createImmutable(0);
public static RemoteObject _animatedmenubuttonheight = RemoteObject.createImmutable(0);
public static RemoteObject _menuitemwidth = RemoteObject.createImmutable(0);
public static RemoteObject _menuitemheight = RemoteObject.createImmutable(0);
public static RemoteObject _startdegrees = RemoteObject.createImmutable(0);
public static RemoteObject _degreesspan = RemoteObject.createImmutable(0);
public static RemoteObject _itemradius = RemoteObject.createImmutable(0);
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.officedetail _officedetail = null;
public static b4a.example.functionall _functionall = null;
public static b4a.example.searchbuilding _searchbuilding = null;
public static b4a.example.educationaldetail _educationaldetail = null;
public static b4a.example.healthdetail _healthdetail = null;
public static b4a.example.housedetail _housedetail = null;
public static b4a.example.msmedetail _msmedetail = null;
public static b4a.example.worshipdetail _worshipdetail = null;
public static b4a.example.manualposition _manualposition = null;
public static b4a.example.home _home = null;
public static b4a.example.homeadmin _homeadmin = null;
public static b4a.example.login _login = null;
public static b4a.example.addfacilitytype _addfacilitytype = null;
public static b4a.example.editbuildingfacility _editbuildingfacility = null;
public static b4a.example.addbuildingfacility _addbuildingfacility = null;
public static b4a.example.officeedit _officeedit = null;
public static b4a.example.msmebuilding _msmebuilding = null;
public static b4a.example.worshipbuilding _worshipbuilding = null;
public static b4a.example.addphoto _addphoto = null;
public static b4a.example.loaderimage _loaderimage = null;
public static b4a.example.maincamera _maincamera = null;
public static b4a.example.fileutil _fileutil = null;
public static b4a.example.showimage _showimage = null;
public static b4a.example.browsegallery _browsegallery = null;
public static b4a.example.educationaledit _educationaledit = null;
public static b4a.example.housebuilding _housebuilding = null;
public static b4a.example.worshipedit _worshipedit = null;
public static b4a.example.healthbuilding _healthbuilding = null;
public static b4a.example.gallery _gallery = null;
public static b4a.example.officebuilding _officebuilding = null;
public static b4a.example.educationalbuilding _educationalbuilding = null;
public static b4a.example.msmeedit _msmeedit = null;
public static b4a.example.buildinglist _buildinglist = null;
public static b4a.example.help _help = null;
public static b4a.example.healthedit _healthedit = null;
public static b4a.example.searchworship _searchworship = null;
public static b4a.example.multipartpost _multipartpost = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"animatedMenuButton",_ref.getField(false, "_animatedmenubutton"),"AnimatedMenuButtonHeight",_ref.getField(false, "_animatedmenubuttonheight"),"AnimatedMenuButtonWidth",_ref.getField(false, "_animatedmenubuttonwidth"),"AnimationEndCount",_ref.getField(false, "_animationendcount"),"Animator",_ref.getField(false, "_animator"),"AnimMenuItemMove",_ref.getField(false, "_animmenuitemmove"),"AnimMenuItemRotate",_ref.getField(false, "_animmenuitemrotate"),"AnimSet",_ref.getField(false, "_animset"),"CenterX",_ref.getField(false, "_centerx"),"CenterY",_ref.getField(false, "_centery"),"CurrentPosition",_ref.getField(false, "_currentposition"),"DegreesSpan",_ref.getField(false, "_degreesspan"),"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"IsAnimating",_ref.getField(false, "_isanimating"),"ItemRadius",_ref.getField(false, "_itemradius"),"mActivity",_ref.getField(false, "_mactivity"),"MenuItemAnimationDelay",_ref.getField(false, "_menuitemanimationdelay"),"MenuItemHeight",_ref.getField(false, "_menuitemheight"),"MenuItemNewX",_ref.getField(false, "_menuitemnewx"),"MenuItemNewY",_ref.getField(false, "_menuitemnewy"),"MenuItems",_ref.getField(false, "_menuitems"),"MenuItemWidth",_ref.getField(false, "_menuitemwidth"),"menuOpen",_ref.getField(false, "_menuopen"),"mEventName",_ref.getField(false, "_meventname"),"mModule",_ref.getField(false, "_mmodule"),"StartDegrees",_ref.getField(false, "_startdegrees"),"staticMenuButton",_ref.getField(false, "_staticmenubutton"),"StaticMenuButtonHeight",_ref.getField(false, "_staticmenubuttonheight"),"StaticMenuButtonWidth",_ref.getField(false, "_staticmenubuttonwidth")};
}
}