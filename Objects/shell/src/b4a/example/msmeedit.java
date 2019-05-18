
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

public class msmeedit implements IRemote{
	public static msmeedit mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public msmeedit() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("msmeedit"), "b4a.example.msmeedit");
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
		pcBA = new PCBA(this, msmeedit.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _fasilitas = RemoteObject.createImmutable("");
public static RemoteObject _lat = RemoteObject.createImmutable("");
public static RemoteObject _lng = RemoteObject.createImmutable("");
public static RemoteObject _quantity_fac = RemoteObject.createImmutable(0);
public static RemoteObject _ids = RemoteObject.createImmutable("");
public static RemoteObject _nama = RemoteObject.createImmutable("");
public static RemoteObject _tipe = RemoteObject.createImmutable("");
public static RemoteObject _jenis = RemoteObject.createImmutable("");
public static RemoteObject _tahun = RemoteObject.createImmutable("");
public static RemoteObject _ltanah = RemoteObject.createImmutable("");
public static RemoteObject _lparkir = RemoteObject.createImmutable("");
public static RemoteObject _lbangunan = RemoteObject.createImmutable("");
public static RemoteObject _listrik = RemoteObject.createImmutable("");
public static RemoteObject _kons = RemoteObject.createImmutable("");
public static RemoteObject _tipp = RemoteObject.createImmutable("");
public static RemoteObject _tipname = RemoteObject.createImmutable("");
public static RemoteObject _typemsme = RemoteObject.createImmutable("");
public static RemoteObject _cons = RemoteObject.createImmutable("");
public static RemoteObject _consname = RemoteObject.createImmutable("");
public static RemoteObject _typecons = RemoteObject.createImmutable("");
public static RemoteObject _tipe_i = RemoteObject.createImmutable(0);
public static RemoteObject _jenis_i = RemoteObject.createImmutable(0);
public static RemoteObject _lbangunan_i = RemoteObject.createImmutable(0);
public static RemoteObject _lparkir_i = RemoteObject.createImmutable(0);
public static RemoteObject _ltanah_i = RemoteObject.createImmutable(0);
public static RemoteObject _listrik_i = RemoteObject.createImmutable(0);
public static RemoteObject _tahun_i = RemoteObject.createImmutable(0);
public static RemoteObject _cons_i = RemoteObject.createImmutable(0);
public static RemoteObject _scrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _titlebar = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _backarrow = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelbuildinglist = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _msmename = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _typeofmsme = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _standingyear = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _buildingarea = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _landarea = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _parkingarea = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _electricity = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _construction = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _paneltoolbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lbledit = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _msmemap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _consmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
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
public static b4a.example.buildinglist _buildinglist = null;
public static b4a.example.help _help = null;
public static b4a.example.healthedit _healthedit = null;
public static b4a.example.searchworship _searchworship = null;
public static b4a.example.multipartpost _multipartpost = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",msmeedit.mostCurrent._activity,"AddBuildingFacility",Debug.moduleToString(b4a.example.addbuildingfacility.class),"AddFacilityType",Debug.moduleToString(b4a.example.addfacilitytype.class),"AddPhoto",Debug.moduleToString(b4a.example.addphoto.class),"BackArrow",msmeedit.mostCurrent._backarrow,"BrowseGallery",Debug.moduleToString(b4a.example.browsegallery.class),"BuildingArea",msmeedit.mostCurrent._buildingarea,"BuildingList",Debug.moduleToString(b4a.example.buildinglist.class),"cons",msmeedit._cons,"cons_i",msmeedit._cons_i,"ConsMap",msmeedit.mostCurrent._consmap,"consname",msmeedit._consname,"Construction",msmeedit.mostCurrent._construction,"EditBuildingFacility",Debug.moduleToString(b4a.example.editbuildingfacility.class),"EducationalBuilding",Debug.moduleToString(b4a.example.educationalbuilding.class),"EducationalDetail",Debug.moduleToString(b4a.example.educationaldetail.class),"EducationalEdit",Debug.moduleToString(b4a.example.educationaledit.class),"Electricity",msmeedit.mostCurrent._electricity,"fasilitas",msmeedit._fasilitas,"FileUtil",Debug.moduleToString(b4a.example.fileutil.class),"FunctionAll",Debug.moduleToString(b4a.example.functionall.class),"Gallery",Debug.moduleToString(b4a.example.gallery.class),"HealthBuilding",Debug.moduleToString(b4a.example.healthbuilding.class),"HealthDetail",Debug.moduleToString(b4a.example.healthdetail.class),"HealthEdit",Debug.moduleToString(b4a.example.healthedit.class),"Help",Debug.moduleToString(b4a.example.help.class),"Home",Debug.moduleToString(b4a.example.home.class),"HomeAdmin",Debug.moduleToString(b4a.example.homeadmin.class),"HouseBuilding",Debug.moduleToString(b4a.example.housebuilding.class),"HouseDetail",Debug.moduleToString(b4a.example.housedetail.class),"HttpUtils2Service",msmeedit.mostCurrent._httputils2service,"ids",msmeedit._ids,"jenis",msmeedit._jenis,"jenis_i",msmeedit._jenis_i,"kons",msmeedit._kons,"LandArea",msmeedit.mostCurrent._landarea,"lat",msmeedit._lat,"lbangunan",msmeedit._lbangunan,"lbangunan_i",msmeedit._lbangunan_i,"LblEdit",msmeedit.mostCurrent._lbledit,"listrik",msmeedit._listrik,"listrik_i",msmeedit._listrik_i,"lng",msmeedit._lng,"LoaderImage",Debug.moduleToString(b4a.example.loaderimage.class),"Login",Debug.moduleToString(b4a.example.login.class),"lparkir",msmeedit._lparkir,"lparkir_i",msmeedit._lparkir_i,"ltanah",msmeedit._ltanah,"ltanah_i",msmeedit._ltanah_i,"Main",Debug.moduleToString(b4a.example.main.class),"MainCamera",Debug.moduleToString(b4a.example.maincamera.class),"ManualPosition",Debug.moduleToString(b4a.example.manualposition.class),"MsmeBuilding",Debug.moduleToString(b4a.example.msmebuilding.class),"MsmeDetail",Debug.moduleToString(b4a.example.msmedetail.class),"MsmeMap",msmeedit.mostCurrent._msmemap,"MsmeName",msmeedit.mostCurrent._msmename,"MultipartPost",Debug.moduleToString(b4a.example.multipartpost.class),"nama",msmeedit._nama,"OfficeBuilding",Debug.moduleToString(b4a.example.officebuilding.class),"OfficeDetail",Debug.moduleToString(b4a.example.officedetail.class),"OfficeEdit",Debug.moduleToString(b4a.example.officeedit.class),"PanelBuildingList",msmeedit.mostCurrent._panelbuildinglist,"PanelToolBar",msmeedit.mostCurrent._paneltoolbar,"ParkingArea",msmeedit.mostCurrent._parkingarea,"quantity_fac",msmeedit._quantity_fac,"ScrollView1",msmeedit.mostCurrent._scrollview1,"SearchBuilding",Debug.moduleToString(b4a.example.searchbuilding.class),"searchWorship",Debug.moduleToString(b4a.example.searchworship.class),"ShowImage",Debug.moduleToString(b4a.example.showimage.class),"StandingYear",msmeedit.mostCurrent._standingyear,"Starter",Debug.moduleToString(b4a.example.starter.class),"tahun",msmeedit._tahun,"tahun_i",msmeedit._tahun_i,"tipe",msmeedit._tipe,"tipe_i",msmeedit._tipe_i,"tipname",msmeedit._tipname,"tipp",msmeedit._tipp,"TitleBar",msmeedit.mostCurrent._titlebar,"typecons",msmeedit._typecons,"typemsme",msmeedit._typemsme,"TypeOfMsme",msmeedit.mostCurrent._typeofmsme,"WorshipBuilding",Debug.moduleToString(b4a.example.worshipbuilding.class),"WorshipDetail",Debug.moduleToString(b4a.example.worshipdetail.class),"WorshipEdit",Debug.moduleToString(b4a.example.worshipedit.class),"xui",msmeedit._xui};
}
}