
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

public class healthdetail implements IRemote{
	public static healthdetail mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public healthdetail() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("healthdetail"), "b4a.example.healthdetail");
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
		pcBA = new PCBA(this, healthdetail.class);
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
public static RemoteObject _pfacility = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _listitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _paneltoolbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lbledit = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblfacility = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panel4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _tabhost1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.TabHostWrapper");
public static RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _bmp2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _ids = RemoteObject.createImmutable("");
public static RemoteObject _typeofhealth = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _headoffice = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _nummedical = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _numnonmedical = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _standingyear = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _buildingarea = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _landarea = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _parkingarea = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _electricity = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _construction = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _healthname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnroute = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _webviewroute = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _editbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _editfacility = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelgallery = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _addpicture = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.officedetail _officedetail = null;
public static b4a.example.functionall _functionall = null;
public static b4a.example.searchbuilding _searchbuilding = null;
public static b4a.example.educationaldetail _educationaldetail = null;
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
		return new Object[] {"Activity",healthdetail.mostCurrent._activity,"AddBuildingFacility",Debug.moduleToString(b4a.example.addbuildingfacility.class),"AddFacilityType",Debug.moduleToString(b4a.example.addfacilitytype.class),"AddPhoto",Debug.moduleToString(b4a.example.addphoto.class),"AddPicture",healthdetail.mostCurrent._addpicture,"BackArrow",healthdetail.mostCurrent._backarrow,"bmp1",healthdetail.mostCurrent._bmp1,"bmp2",healthdetail.mostCurrent._bmp2,"BrowseGallery",Debug.moduleToString(b4a.example.browsegallery.class),"btnRoute",healthdetail.mostCurrent._btnroute,"BuildingArea",healthdetail.mostCurrent._buildingarea,"BuildingList",Debug.moduleToString(b4a.example.buildinglist.class),"clv",healthdetail.mostCurrent._clv,"CLV1",healthdetail.mostCurrent._clv1,"Construction",healthdetail.mostCurrent._construction,"editBtn",healthdetail.mostCurrent._editbtn,"EditBuildingFacility",Debug.moduleToString(b4a.example.editbuildingfacility.class),"editFacility",healthdetail.mostCurrent._editfacility,"EducationalBuilding",Debug.moduleToString(b4a.example.educationalbuilding.class),"EducationalDetail",Debug.moduleToString(b4a.example.educationaldetail.class),"EducationalEdit",Debug.moduleToString(b4a.example.educationaledit.class),"Electricity",healthdetail.mostCurrent._electricity,"FileUtil",Debug.moduleToString(b4a.example.fileutil.class),"FunctionAll",Debug.moduleToString(b4a.example.functionall.class),"Gallery",Debug.moduleToString(b4a.example.gallery.class),"HeadOffice",healthdetail.mostCurrent._headoffice,"HealthBuilding",Debug.moduleToString(b4a.example.healthbuilding.class),"HealthEdit",Debug.moduleToString(b4a.example.healthedit.class),"HealthName",healthdetail.mostCurrent._healthname,"Help",Debug.moduleToString(b4a.example.help.class),"Home",Debug.moduleToString(b4a.example.home.class),"HomeAdmin",Debug.moduleToString(b4a.example.homeadmin.class),"HouseBuilding",Debug.moduleToString(b4a.example.housebuilding.class),"HouseDetail",Debug.moduleToString(b4a.example.housedetail.class),"HttpUtils2Service",healthdetail.mostCurrent._httputils2service,"ids",healthdetail.mostCurrent._ids,"ImageView1",healthdetail.mostCurrent._imageview1,"Label1",healthdetail.mostCurrent._label1,"LandArea",healthdetail.mostCurrent._landarea,"lat",healthdetail._lat,"LblEdit",healthdetail.mostCurrent._lbledit,"LblFacility",healthdetail.mostCurrent._lblfacility,"ListItem",healthdetail.mostCurrent._listitem,"lng",healthdetail._lng,"LoaderImage",Debug.moduleToString(b4a.example.loaderimage.class),"Login",Debug.moduleToString(b4a.example.login.class),"Main",Debug.moduleToString(b4a.example.main.class),"MainCamera",Debug.moduleToString(b4a.example.maincamera.class),"ManualPosition",Debug.moduleToString(b4a.example.manualposition.class),"MsmeBuilding",Debug.moduleToString(b4a.example.msmebuilding.class),"MsmeDetail",Debug.moduleToString(b4a.example.msmedetail.class),"MsmeEdit",Debug.moduleToString(b4a.example.msmeedit.class),"MultipartPost",Debug.moduleToString(b4a.example.multipartpost.class),"namefc",healthdetail.mostCurrent._namefc,"numfc",healthdetail.mostCurrent._numfc,"NumMedical",healthdetail.mostCurrent._nummedical,"NumNonMedical",healthdetail.mostCurrent._numnonmedical,"OfficeBuilding",Debug.moduleToString(b4a.example.officebuilding.class),"OfficeDetail",Debug.moduleToString(b4a.example.officedetail.class),"OfficeEdit",Debug.moduleToString(b4a.example.officeedit.class),"Panel4",healthdetail.mostCurrent._panel4,"PanelBuildingList",healthdetail.mostCurrent._panelbuildinglist,"PanelButton",healthdetail.mostCurrent._panelbutton,"PanelGallery",healthdetail.mostCurrent._panelgallery,"PanelMap",healthdetail.mostCurrent._panelmap,"PanelToolbar",healthdetail.mostCurrent._paneltoolbar,"ParkingArea",healthdetail.mostCurrent._parkingarea,"PFacility",healthdetail.mostCurrent._pfacility,"ScrollImage",healthdetail.mostCurrent._scrollimage,"ScrollView1",healthdetail.mostCurrent._scrollview1,"SearchBuilding",Debug.moduleToString(b4a.example.searchbuilding.class),"searchWorship",Debug.moduleToString(b4a.example.searchworship.class),"ShowImage",Debug.moduleToString(b4a.example.showimage.class),"StandingYear",healthdetail.mostCurrent._standingyear,"Starter",Debug.moduleToString(b4a.example.starter.class),"TabHost1",healthdetail.mostCurrent._tabhost1,"TitleBar",healthdetail.mostCurrent._titlebar,"TypeOfHealth",healthdetail.mostCurrent._typeofhealth,"WebViewRoute",healthdetail.mostCurrent._webviewroute,"WorshipBuilding",Debug.moduleToString(b4a.example.worshipbuilding.class),"WorshipDetail",Debug.moduleToString(b4a.example.worshipdetail.class),"WorshipEdit",Debug.moduleToString(b4a.example.worshipedit.class),"xui",healthdetail._xui};
}
}