
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

public class officedetail implements IRemote{
	public static officedetail mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public officedetail() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("officedetail"), "b4a.example.officedetail");
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
		pcBA = new PCBA(this, officedetail.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _lat = RemoteObject.createImmutable("");
public static RemoteObject _lng = RemoteObject.createImmutable("");
public static RemoteObject _scrollimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _clv = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imageview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _clv1 = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _scrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _titlebar = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _backarrow = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelbuildinglist = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _numfc = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _namefc = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _btngallery = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pfacility = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _listitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _officename = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _typeofoffice = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _standingyear = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _buildingarea = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _landarea = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _parkingarea = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _electricity = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _construction = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _paneltoolbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _ids = RemoteObject.createImmutable("");
public static RemoteObject _lbledit = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblfacility = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panel4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnroute = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _webviewroute = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _editbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _editfacility = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelgallery = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _tabroute = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _tabdetail = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _addpicture = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _tabhost1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.TabHostWrapper");
public static RemoteObject _tabmanager = RemoteObject.declareNull("uk.co.martinpearman.b4a.tabhostextras.TabHostExtras");
public static RemoteObject _tab_clicked = RemoteObject.createImmutable(0);
public static RemoteObject _tab_unclicked = RemoteObject.createImmutable(0);
public static RemoteObject _tabgallery = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
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
  public Object[] GetGlobals() {
		return new Object[] {"Activity",officedetail.mostCurrent._activity,"AddBuildingFacility",Debug.moduleToString(b4a.example.addbuildingfacility.class),"AddFacilityType",Debug.moduleToString(b4a.example.addfacilitytype.class),"AddPhoto",Debug.moduleToString(b4a.example.addphoto.class),"AddPicture",officedetail.mostCurrent._addpicture,"BackArrow",officedetail.mostCurrent._backarrow,"BrowseGallery",Debug.moduleToString(b4a.example.browsegallery.class),"btnGallery",officedetail.mostCurrent._btngallery,"btnRoute",officedetail.mostCurrent._btnroute,"BuildingArea",officedetail.mostCurrent._buildingarea,"BuildingList",Debug.moduleToString(b4a.example.buildinglist.class),"clv",officedetail.mostCurrent._clv,"CLV1",officedetail.mostCurrent._clv1,"Construction",officedetail.mostCurrent._construction,"editBtn",officedetail.mostCurrent._editbtn,"EditBuildingFacility",Debug.moduleToString(b4a.example.editbuildingfacility.class),"editFacility",officedetail.mostCurrent._editfacility,"EducationalBuilding",Debug.moduleToString(b4a.example.educationalbuilding.class),"EducationalDetail",Debug.moduleToString(b4a.example.educationaldetail.class),"EducationalEdit",Debug.moduleToString(b4a.example.educationaledit.class),"Electricity",officedetail.mostCurrent._electricity,"FileUtil",Debug.moduleToString(b4a.example.fileutil.class),"FunctionAll",Debug.moduleToString(b4a.example.functionall.class),"Gallery",Debug.moduleToString(b4a.example.gallery.class),"HealthBuilding",Debug.moduleToString(b4a.example.healthbuilding.class),"HealthDetail",Debug.moduleToString(b4a.example.healthdetail.class),"HealthEdit",Debug.moduleToString(b4a.example.healthedit.class),"Help",Debug.moduleToString(b4a.example.help.class),"Home",Debug.moduleToString(b4a.example.home.class),"HomeAdmin",Debug.moduleToString(b4a.example.homeadmin.class),"HouseBuilding",Debug.moduleToString(b4a.example.housebuilding.class),"HouseDetail",Debug.moduleToString(b4a.example.housedetail.class),"HttpUtils2Service",officedetail.mostCurrent._httputils2service,"ids",officedetail.mostCurrent._ids,"ImageView1",officedetail.mostCurrent._imageview1,"Label1",officedetail.mostCurrent._label1,"LandArea",officedetail.mostCurrent._landarea,"lat",officedetail._lat,"LblEdit",officedetail.mostCurrent._lbledit,"LblFacility",officedetail.mostCurrent._lblfacility,"ListItem",officedetail.mostCurrent._listitem,"lng",officedetail._lng,"LoaderImage",Debug.moduleToString(b4a.example.loaderimage.class),"Login",Debug.moduleToString(b4a.example.login.class),"Main",Debug.moduleToString(b4a.example.main.class),"MainCamera",Debug.moduleToString(b4a.example.maincamera.class),"ManualPosition",Debug.moduleToString(b4a.example.manualposition.class),"MsmeBuilding",Debug.moduleToString(b4a.example.msmebuilding.class),"MsmeDetail",Debug.moduleToString(b4a.example.msmedetail.class),"MsmeEdit",Debug.moduleToString(b4a.example.msmeedit.class),"MultipartPost",Debug.moduleToString(b4a.example.multipartpost.class),"namefc",officedetail.mostCurrent._namefc,"numfc",officedetail.mostCurrent._numfc,"OfficeBuilding",Debug.moduleToString(b4a.example.officebuilding.class),"OfficeEdit",Debug.moduleToString(b4a.example.officeedit.class),"OfficeName",officedetail.mostCurrent._officename,"Panel4",officedetail.mostCurrent._panel4,"PanelBuildingList",officedetail.mostCurrent._panelbuildinglist,"PanelButton",officedetail.mostCurrent._panelbutton,"PanelGallery",officedetail.mostCurrent._panelgallery,"PanelMap",officedetail.mostCurrent._panelmap,"PanelToolBar",officedetail.mostCurrent._paneltoolbar,"ParkingArea",officedetail.mostCurrent._parkingarea,"PFacility",officedetail.mostCurrent._pfacility,"ScrollImage",officedetail.mostCurrent._scrollimage,"ScrollView1",officedetail.mostCurrent._scrollview1,"SearchBuilding",Debug.moduleToString(b4a.example.searchbuilding.class),"searchWorship",Debug.moduleToString(b4a.example.searchworship.class),"ShowImage",Debug.moduleToString(b4a.example.showimage.class),"StandingYear",officedetail.mostCurrent._standingyear,"Starter",Debug.moduleToString(b4a.example.starter.class),"tab_clicked",officedetail._tab_clicked,"tab_unclicked",officedetail._tab_unclicked,"tabDetail",officedetail.mostCurrent._tabdetail,"tabGallery",officedetail.mostCurrent._tabgallery,"TabHost1",officedetail.mostCurrent._tabhost1,"TabManager",officedetail.mostCurrent._tabmanager,"tabRoute",officedetail.mostCurrent._tabroute,"TitleBar",officedetail.mostCurrent._titlebar,"TypeOfOffice",officedetail.mostCurrent._typeofoffice,"WebViewRoute",officedetail.mostCurrent._webviewroute,"WorshipBuilding",Debug.moduleToString(b4a.example.worshipbuilding.class),"WorshipDetail",Debug.moduleToString(b4a.example.worshipdetail.class),"WorshipEdit",Debug.moduleToString(b4a.example.worshipedit.class),"xui",officedetail._xui};
}
}