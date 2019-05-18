
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

public class homeadmin implements IRemote{
	public static homeadmin mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public homeadmin() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("homeadmin"), "b4a.example.homeadmin");
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
		pcBA = new PCBA(this, homeadmin.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _addfac_clicked = RemoteObject.createImmutable("");
public static RemoteObject _menu = RemoteObject.declareNull("b4a.example.arcmenu");
public static RemoteObject _menubuttonstatic = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _menubuttonanimated = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _scrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _panelbackground = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _paneltoolbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnlogout = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnsearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panel2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _contentadmin = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _horizontalscrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");
public static RemoteObject _label9 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label10 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label11 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label12 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label13 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label14 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _worshipbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _officebtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _healthbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _educationbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _labellogout = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panellogout = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _backarrow = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _titlebar = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btninfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _button4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _button2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _button5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _button3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
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
		return new Object[] {"Activity",homeadmin.mostCurrent._activity,"AddBuildingFacility",Debug.moduleToString(b4a.example.addbuildingfacility.class),"AddFac_clicked",homeadmin._addfac_clicked,"AddFacilityType",Debug.moduleToString(b4a.example.addfacilitytype.class),"AddPhoto",Debug.moduleToString(b4a.example.addphoto.class),"BackArrow",homeadmin.mostCurrent._backarrow,"BrowseGallery",Debug.moduleToString(b4a.example.browsegallery.class),"BtnInfo",homeadmin.mostCurrent._btninfo,"BtnLogout",homeadmin.mostCurrent._btnlogout,"BtnMap",homeadmin.mostCurrent._btnmap,"BtnSearch",homeadmin.mostCurrent._btnsearch,"BuildingList",Debug.moduleToString(b4a.example.buildinglist.class),"Button1",homeadmin.mostCurrent._button1,"Button2",homeadmin.mostCurrent._button2,"Button3",homeadmin.mostCurrent._button3,"Button4",homeadmin.mostCurrent._button4,"Button5",homeadmin.mostCurrent._button5,"ContentAdmin",homeadmin.mostCurrent._contentadmin,"EditBuildingFacility",Debug.moduleToString(b4a.example.editbuildingfacility.class),"EducationalBuilding",Debug.moduleToString(b4a.example.educationalbuilding.class),"EducationalDetail",Debug.moduleToString(b4a.example.educationaldetail.class),"EducationalEdit",Debug.moduleToString(b4a.example.educationaledit.class),"EducationBtn",homeadmin.mostCurrent._educationbtn,"FileUtil",Debug.moduleToString(b4a.example.fileutil.class),"FunctionAll",Debug.moduleToString(b4a.example.functionall.class),"Gallery",Debug.moduleToString(b4a.example.gallery.class),"HealthBtn",homeadmin.mostCurrent._healthbtn,"HealthBuilding",Debug.moduleToString(b4a.example.healthbuilding.class),"HealthDetail",Debug.moduleToString(b4a.example.healthdetail.class),"HealthEdit",Debug.moduleToString(b4a.example.healthedit.class),"Help",Debug.moduleToString(b4a.example.help.class),"Home",Debug.moduleToString(b4a.example.home.class),"HorizontalScrollView1",homeadmin.mostCurrent._horizontalscrollview1,"HouseBuilding",Debug.moduleToString(b4a.example.housebuilding.class),"HouseDetail",Debug.moduleToString(b4a.example.housedetail.class),"HttpUtils2Service",homeadmin.mostCurrent._httputils2service,"Label1",homeadmin.mostCurrent._label1,"Label10",homeadmin.mostCurrent._label10,"Label11",homeadmin.mostCurrent._label11,"Label12",homeadmin.mostCurrent._label12,"Label13",homeadmin.mostCurrent._label13,"Label14",homeadmin.mostCurrent._label14,"Label9",homeadmin.mostCurrent._label9,"Labellogout",homeadmin.mostCurrent._labellogout,"LoaderImage",Debug.moduleToString(b4a.example.loaderimage.class),"Login",Debug.moduleToString(b4a.example.login.class),"Main",Debug.moduleToString(b4a.example.main.class),"MainCamera",Debug.moduleToString(b4a.example.maincamera.class),"ManualPosition",Debug.moduleToString(b4a.example.manualposition.class),"menu",homeadmin.mostCurrent._menu,"menuButtonAnimated",homeadmin.mostCurrent._menubuttonanimated,"menuButtonStatic",homeadmin.mostCurrent._menubuttonstatic,"MsmeBuilding",Debug.moduleToString(b4a.example.msmebuilding.class),"MsmeDetail",Debug.moduleToString(b4a.example.msmedetail.class),"MsmeEdit",Debug.moduleToString(b4a.example.msmeedit.class),"MultipartPost",Debug.moduleToString(b4a.example.multipartpost.class),"OfficeBtn",homeadmin.mostCurrent._officebtn,"OfficeBuilding",Debug.moduleToString(b4a.example.officebuilding.class),"OfficeDetail",Debug.moduleToString(b4a.example.officedetail.class),"OfficeEdit",Debug.moduleToString(b4a.example.officeedit.class),"Panel1",homeadmin.mostCurrent._panel1,"Panel2",homeadmin.mostCurrent._panel2,"PanelBackground",homeadmin.mostCurrent._panelbackground,"PanelBar",homeadmin.mostCurrent._panelbar,"PanelLogout",homeadmin.mostCurrent._panellogout,"PanelToolBar",homeadmin.mostCurrent._paneltoolbar,"ScrollView1",homeadmin.mostCurrent._scrollview1,"SearchBuilding",Debug.moduleToString(b4a.example.searchbuilding.class),"searchWorship",Debug.moduleToString(b4a.example.searchworship.class),"ShowImage",Debug.moduleToString(b4a.example.showimage.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"TitleBar",homeadmin.mostCurrent._titlebar,"WorshipBtn",homeadmin.mostCurrent._worshipbtn,"WorshipBuilding",Debug.moduleToString(b4a.example.worshipbuilding.class),"WorshipDetail",Debug.moduleToString(b4a.example.worshipdetail.class),"WorshipEdit",Debug.moduleToString(b4a.example.worshipedit.class)};
}
}