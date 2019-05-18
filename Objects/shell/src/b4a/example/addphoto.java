
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

public class addphoto implements IRemote{
	public static addphoto mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public addphoto() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("addphoto"), "b4a.example.addphoto");
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
		pcBA = new PCBA(this, addphoto.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _temp = RemoteObject.createImmutable("");
public static RemoteObject _hc = RemoteObject.declareNull("anywheresoftware.b4h.okhttp.OkHttpClientWrapper");
public static RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
public static RemoteObject _base64con = RemoteObject.declareNull("simplysoftware.base64image.base64image");
public static RemoteObject _chooser = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.ContentChooser");
public static RemoteObject _cc = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.ContentChooser");
public static RemoteObject _ion = RemoteObject.declareNull("Object");
public static RemoteObject _buttonbrowse = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttoncamera = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _imageview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _buttonupload = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _namefile = RemoteObject.createImmutable("");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _mbmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _folder = RemoteObject.createImmutable("");
public static RemoteObject _idbuilding = RemoteObject.createImmutable("");
public static RemoteObject _buildingtype = RemoteObject.createImmutable("");
public static RemoteObject _paneltoolbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _titlebar = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _backarrow = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _scrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
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
		return new Object[] {"Activity",addphoto.mostCurrent._activity,"AddBuildingFacility",Debug.moduleToString(b4a.example.addbuildingfacility.class),"AddFacilityType",Debug.moduleToString(b4a.example.addfacilitytype.class),"BackArrow",addphoto.mostCurrent._backarrow,"Base64Con",addphoto._base64con,"BrowseGallery",Debug.moduleToString(b4a.example.browsegallery.class),"BuildingList",Debug.moduleToString(b4a.example.buildinglist.class),"buildingtype",addphoto.mostCurrent._buildingtype,"ButtonBrowse",addphoto.mostCurrent._buttonbrowse,"ButtonCamera",addphoto.mostCurrent._buttoncamera,"ButtonUpload",addphoto.mostCurrent._buttonupload,"cc",addphoto._cc,"chooser",addphoto._chooser,"EditBuildingFacility",Debug.moduleToString(b4a.example.editbuildingfacility.class),"EducationalBuilding",Debug.moduleToString(b4a.example.educationalbuilding.class),"EducationalDetail",Debug.moduleToString(b4a.example.educationaldetail.class),"EducationalEdit",Debug.moduleToString(b4a.example.educationaledit.class),"FileUtil",Debug.moduleToString(b4a.example.fileutil.class),"folder",addphoto.mostCurrent._folder,"FunctionAll",Debug.moduleToString(b4a.example.functionall.class),"Gallery",Debug.moduleToString(b4a.example.gallery.class),"hc",addphoto._hc,"HealthBuilding",Debug.moduleToString(b4a.example.healthbuilding.class),"HealthDetail",Debug.moduleToString(b4a.example.healthdetail.class),"HealthEdit",Debug.moduleToString(b4a.example.healthedit.class),"Help",Debug.moduleToString(b4a.example.help.class),"Home",Debug.moduleToString(b4a.example.home.class),"HomeAdmin",Debug.moduleToString(b4a.example.homeadmin.class),"HouseBuilding",Debug.moduleToString(b4a.example.housebuilding.class),"HouseDetail",Debug.moduleToString(b4a.example.housedetail.class),"HttpUtils2Service",addphoto.mostCurrent._httputils2service,"idBuilding",addphoto.mostCurrent._idbuilding,"ImageView1",addphoto.mostCurrent._imageview1,"ion",addphoto._ion,"Label1",addphoto.mostCurrent._label1,"LoaderImage",Debug.moduleToString(b4a.example.loaderimage.class),"Login",Debug.moduleToString(b4a.example.login.class),"Main",Debug.moduleToString(b4a.example.main.class),"MainCamera",Debug.moduleToString(b4a.example.maincamera.class),"ManualPosition",Debug.moduleToString(b4a.example.manualposition.class),"mBmp",addphoto.mostCurrent._mbmp,"MsmeBuilding",Debug.moduleToString(b4a.example.msmebuilding.class),"MsmeDetail",Debug.moduleToString(b4a.example.msmedetail.class),"MsmeEdit",Debug.moduleToString(b4a.example.msmeedit.class),"MultipartPost",Debug.moduleToString(b4a.example.multipartpost.class),"namefile",addphoto.mostCurrent._namefile,"OfficeBuilding",Debug.moduleToString(b4a.example.officebuilding.class),"OfficeDetail",Debug.moduleToString(b4a.example.officedetail.class),"OfficeEdit",Debug.moduleToString(b4a.example.officeedit.class),"out",addphoto._out,"PanelToolBar",addphoto.mostCurrent._paneltoolbar,"rp",addphoto.mostCurrent._rp,"ScrollView1",addphoto.mostCurrent._scrollview1,"SearchBuilding",Debug.moduleToString(b4a.example.searchbuilding.class),"searchWorship",Debug.moduleToString(b4a.example.searchworship.class),"ShowImage",Debug.moduleToString(b4a.example.showimage.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"temp",addphoto._temp,"TitleBar",addphoto.mostCurrent._titlebar,"WorshipBuilding",Debug.moduleToString(b4a.example.worshipbuilding.class),"WorshipDetail",Debug.moduleToString(b4a.example.worshipdetail.class),"WorshipEdit",Debug.moduleToString(b4a.example.worshipedit.class)};
}
}