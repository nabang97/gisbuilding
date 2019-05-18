
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class searchbuilding implements IRemote{
	public static searchbuilding mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public searchbuilding() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("searchbuilding"), "b4a.example.searchbuilding");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, searchbuilding.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _lat = RemoteObject.createImmutable("");
public static RemoteObject _lng = RemoteObject.createImmutable("");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _idbuilding = RemoteObject.createImmutable("");
public static RemoteObject _namebuilding = RemoteObject.createImmutable("");
public static RemoteObject _tipp = RemoteObject.createImmutable("");
public static RemoteObject _tipname = RemoteObject.createImmutable("");
public static RemoteObject _typeoffice = RemoteObject.createImmutable("");
public static RemoteObject _cons = RemoteObject.createImmutable("");
public static RemoteObject _consname = RemoteObject.createImmutable("");
public static RemoteObject _typecons = RemoteObject.createImmutable("");
public static RemoteObject _idspin = RemoteObject.createImmutable("");
public static RemoteObject _latitude = RemoteObject.createImmutable("");
public static RemoteObject _longitude = RemoteObject.createImmutable("");
public static RemoteObject _titlebar = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _backarrow = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _scrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _webviewtest = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _panelbuildinglist = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panellistitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _clv2 = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _paneltoolbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelsearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _searchtext = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _searchtextpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _num = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _buildingname = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _searchbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _spinbuilding = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _spinnermap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _spinnermapb = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _spinnermapj = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _spinnermapt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _typesrc = RemoteObject.createImmutable("");
public static RemoteObject _jorongid = RemoteObject.createImmutable("");
public static RemoteObject _typeid = RemoteObject.createImmutable("");
public static RemoteObject _spinsearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _searchradius = RemoteObject.declareNull("anywheresoftware.b4a.objects.SeekBarWrapper");
public static RemoteObject _spinjorong = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _spintype = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _facilitybtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _idchecksub = RemoteObject.createImmutable("");
public static RemoteObject _textchecksub = RemoteObject.createImmutable("");
public static RemoteObject _lstchecks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _count = RemoteObject.createImmutable(0);
public static RemoteObject _fromtext = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _totext = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _radiusku = RemoteObject.createImmutable(0);
public static RemoteObject _label3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _datapath = RemoteObject.createImmutable("");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.officedetail _officedetail = null;
public static b4a.example.functionall _functionall = null;
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
  public Object[] GetGlobals() {
		return new Object[] {"Activity",searchbuilding.mostCurrent._activity,"AddBuildingFacility",Debug.moduleToString(b4a.example.addbuildingfacility.class),"AddFacilityType",Debug.moduleToString(b4a.example.addfacilitytype.class),"AddPhoto",Debug.moduleToString(b4a.example.addphoto.class),"BackArrow",searchbuilding.mostCurrent._backarrow,"BrowseGallery",Debug.moduleToString(b4a.example.browsegallery.class),"BtnMap",searchbuilding.mostCurrent._btnmap,"BuildingList",Debug.moduleToString(b4a.example.buildinglist.class),"Buildingname",searchbuilding.mostCurrent._buildingname,"CLV2",searchbuilding.mostCurrent._clv2,"cons",searchbuilding._cons,"consname",searchbuilding._consname,"count",searchbuilding._count,"datapath",searchbuilding.mostCurrent._datapath,"EditBuildingFacility",Debug.moduleToString(b4a.example.editbuildingfacility.class),"EducationalBuilding",Debug.moduleToString(b4a.example.educationalbuilding.class),"EducationalDetail",Debug.moduleToString(b4a.example.educationaldetail.class),"EducationalEdit",Debug.moduleToString(b4a.example.educationaledit.class),"FacilityBtn",searchbuilding.mostCurrent._facilitybtn,"FileUtil",Debug.moduleToString(b4a.example.fileutil.class),"FromText",searchbuilding.mostCurrent._fromtext,"FunctionAll",Debug.moduleToString(b4a.example.functionall.class),"Gallery",Debug.moduleToString(b4a.example.gallery.class),"HealthBuilding",Debug.moduleToString(b4a.example.healthbuilding.class),"HealthDetail",Debug.moduleToString(b4a.example.healthdetail.class),"HealthEdit",Debug.moduleToString(b4a.example.healthedit.class),"Help",Debug.moduleToString(b4a.example.help.class),"Home",Debug.moduleToString(b4a.example.home.class),"HomeAdmin",Debug.moduleToString(b4a.example.homeadmin.class),"HouseBuilding",Debug.moduleToString(b4a.example.housebuilding.class),"HouseDetail",Debug.moduleToString(b4a.example.housedetail.class),"HttpUtils2Service",searchbuilding.mostCurrent._httputils2service,"idBuilding",searchbuilding._idbuilding,"idCheckSub",searchbuilding.mostCurrent._idchecksub,"idspin",searchbuilding._idspin,"jorongid",searchbuilding.mostCurrent._jorongid,"Label3",searchbuilding.mostCurrent._label3,"lat",searchbuilding._lat,"latitude",searchbuilding._latitude,"lng",searchbuilding._lng,"LoaderImage",Debug.moduleToString(b4a.example.loaderimage.class),"Login",Debug.moduleToString(b4a.example.login.class),"longitude",searchbuilding._longitude,"lstChecks",searchbuilding.mostCurrent._lstchecks,"Main",Debug.moduleToString(b4a.example.main.class),"MainCamera",Debug.moduleToString(b4a.example.maincamera.class),"ManualPosition",Debug.moduleToString(b4a.example.manualposition.class),"MsmeBuilding",Debug.moduleToString(b4a.example.msmebuilding.class),"MsmeDetail",Debug.moduleToString(b4a.example.msmedetail.class),"MsmeEdit",Debug.moduleToString(b4a.example.msmeedit.class),"MultipartPost",Debug.moduleToString(b4a.example.multipartpost.class),"nameBuilding",searchbuilding._namebuilding,"num",searchbuilding.mostCurrent._num,"OfficeBuilding",Debug.moduleToString(b4a.example.officebuilding.class),"OfficeDetail",Debug.moduleToString(b4a.example.officedetail.class),"OfficeEdit",Debug.moduleToString(b4a.example.officeedit.class),"PanelBuildingList",searchbuilding.mostCurrent._panelbuildinglist,"PanelListItem",searchbuilding.mostCurrent._panellistitem,"PanelSearch",searchbuilding.mostCurrent._panelsearch,"PanelToolbar",searchbuilding.mostCurrent._paneltoolbar,"radiusku",searchbuilding._radiusku,"ScrollView1",searchbuilding.mostCurrent._scrollview1,"SearchBtn",searchbuilding.mostCurrent._searchbtn,"SearchRadius",searchbuilding.mostCurrent._searchradius,"SearchText",searchbuilding.mostCurrent._searchtext,"SearchTextPanel",searchbuilding.mostCurrent._searchtextpanel,"searchWorship",Debug.moduleToString(b4a.example.searchworship.class),"ShowImage",Debug.moduleToString(b4a.example.showimage.class),"SpinBuilding",searchbuilding.mostCurrent._spinbuilding,"SpinJorong",searchbuilding.mostCurrent._spinjorong,"spinnerMap",searchbuilding.mostCurrent._spinnermap,"spinnerMapB",searchbuilding.mostCurrent._spinnermapb,"spinnerMapJ",searchbuilding.mostCurrent._spinnermapj,"spinnerMapT",searchbuilding.mostCurrent._spinnermapt,"SpinSearch",searchbuilding.mostCurrent._spinsearch,"SpinType",searchbuilding.mostCurrent._spintype,"Starter",Debug.moduleToString(b4a.example.starter.class),"textCheckSub",searchbuilding.mostCurrent._textchecksub,"tipname",searchbuilding._tipname,"tipp",searchbuilding._tipp,"TitleBar",searchbuilding.mostCurrent._titlebar,"ToText",searchbuilding.mostCurrent._totext,"typecons",searchbuilding._typecons,"typeid",searchbuilding.mostCurrent._typeid,"typeoffice",searchbuilding._typeoffice,"typesrc",searchbuilding.mostCurrent._typesrc,"WebViewTest",searchbuilding.mostCurrent._webviewtest,"WorshipBuilding",Debug.moduleToString(b4a.example.worshipbuilding.class),"WorshipDetail",Debug.moduleToString(b4a.example.worshipdetail.class),"WorshipEdit",Debug.moduleToString(b4a.example.worshipedit.class),"xui",searchbuilding._xui};
}
}