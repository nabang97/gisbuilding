package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class multipartpost {
private static multipartpost mostCurrent = new multipartpost();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public static class _filedata{
public boolean IsInitialized;
public String Dir;
public String FileName;
public String KeyName;
public String ContentType;
public void Initialize() {
IsInitialized = true;
Dir = "";
FileName = "";
KeyName = "";
ContentType = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
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
public static anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest  _createpostrequest(anywheresoftware.b4a.BA _ba,String _url,anywheresoftware.b4a.objects.collections.Map _namevalues,anywheresoftware.b4a.objects.collections.List _files) throws Exception{
RDebugUtils.currentModule="multipartpost";
if (Debug.shouldDelegate(null, "createpostrequest"))
	return (anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest) Debug.delegate(null, "createpostrequest", new Object[] {_ba,_url,_namevalues,_files});
String _boundary = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream = null;
String _eol = "";
byte[] _b = null;
String _key = "";
String _value = "";
int _i = 0;
b4a.example.multipartpost._filedata _fd = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest _request = null;
RDebugUtils.currentLine=34996224;
 //BA.debugLineNum = 34996224;BA.debugLine="Sub CreatePostRequest(URL As String, NameValues As";
RDebugUtils.currentLine=34996225;
 //BA.debugLineNum = 34996225;BA.debugLine="Dim boundary As String";
_boundary = "";
RDebugUtils.currentLine=34996226;
 //BA.debugLineNum = 34996226;BA.debugLine="boundary = \"---------------------------1461124740";
_boundary = "---------------------------1461124740692";
RDebugUtils.currentLine=34996227;
 //BA.debugLineNum = 34996227;BA.debugLine="Dim stream As OutputStream";
_stream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=34996228;
 //BA.debugLineNum = 34996228;BA.debugLine="stream.InitializeToBytesArray(20)";
_stream.InitializeToBytesArray((int) (20));
RDebugUtils.currentLine=34996229;
 //BA.debugLineNum = 34996229;BA.debugLine="Dim EOL As String";
_eol = "";
RDebugUtils.currentLine=34996230;
 //BA.debugLineNum = 34996230;BA.debugLine="EOL = Chr(13) & Chr(10) 'CRLF constant matches An";
_eol = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13)))+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (10)));
RDebugUtils.currentLine=34996231;
 //BA.debugLineNum = 34996231;BA.debugLine="Dim b() As Byte";
_b = new byte[(int) (0)];
;
RDebugUtils.currentLine=34996232;
 //BA.debugLineNum = 34996232;BA.debugLine="If NameValues <> Null And NameValues.IsInitialize";
if (_namevalues!= null && _namevalues.IsInitialized()) { 
RDebugUtils.currentLine=34996234;
 //BA.debugLineNum = 34996234;BA.debugLine="Dim key, value As String";
_key = "";
_value = "";
RDebugUtils.currentLine=34996235;
 //BA.debugLineNum = 34996235;BA.debugLine="For i = 0 To NameValues.Size - 1";
{
final int step10 = 1;
final int limit10 = (int) (_namevalues.getSize()-1);
_i = (int) (0) ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
RDebugUtils.currentLine=34996236;
 //BA.debugLineNum = 34996236;BA.debugLine="key = NameValues.GetKeyAt(i)";
_key = BA.ObjectToString(_namevalues.GetKeyAt(_i));
RDebugUtils.currentLine=34996237;
 //BA.debugLineNum = 34996237;BA.debugLine="value = NameValues.GetValueAt(i)";
_value = BA.ObjectToString(_namevalues.GetValueAt(_i));
RDebugUtils.currentLine=34996238;
 //BA.debugLineNum = 34996238;BA.debugLine="b = (\"--\" & boundary & EOL & \"Content-Dispositi";
_b = ("--"+_boundary+_eol+"Content-Disposition: form-data; name="+anywheresoftware.b4a.keywords.Common.QUOTE+_key+anywheresoftware.b4a.keywords.Common.QUOTE+_eol+_eol+_value+_eol).getBytes("UTF8");
RDebugUtils.currentLine=34996240;
 //BA.debugLineNum = 34996240;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
 }
};
 };
RDebugUtils.currentLine=34996243;
 //BA.debugLineNum = 34996243;BA.debugLine="If Files <> Null And Files.IsInitialized Then";
if (_files!= null && _files.IsInitialized()) { 
RDebugUtils.currentLine=34996245;
 //BA.debugLineNum = 34996245;BA.debugLine="Dim FD As FileData";
_fd = new b4a.example.multipartpost._filedata();
RDebugUtils.currentLine=34996246;
 //BA.debugLineNum = 34996246;BA.debugLine="For i = 0 To Files.Size - 1";
{
final int step19 = 1;
final int limit19 = (int) (_files.getSize()-1);
_i = (int) (0) ;
for (;(step19 > 0 && _i <= limit19) || (step19 < 0 && _i >= limit19) ;_i = ((int)(0 + _i + step19))  ) {
RDebugUtils.currentLine=34996247;
 //BA.debugLineNum = 34996247;BA.debugLine="FD = Files.Get(i)";
_fd = (b4a.example.multipartpost._filedata)(_files.Get(_i));
RDebugUtils.currentLine=34996248;
 //BA.debugLineNum = 34996248;BA.debugLine="b = (\"--\" & boundary & EOL & \"Content-Dispositi";
_b = ("--"+_boundary+_eol+"Content-Disposition: form-data; name="+anywheresoftware.b4a.keywords.Common.QUOTE+_fd.KeyName+anywheresoftware.b4a.keywords.Common.QUOTE+"; filename="+anywheresoftware.b4a.keywords.Common.QUOTE+_fd.FileName+anywheresoftware.b4a.keywords.Common.QUOTE+_eol+"Content-Type: "+_fd.ContentType+_eol+_eol).getBytes("UTF8");
RDebugUtils.currentLine=34996251;
 //BA.debugLineNum = 34996251;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=34996252;
 //BA.debugLineNum = 34996252;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=34996253;
 //BA.debugLineNum = 34996253;BA.debugLine="In = File.OpenInput(FD.Dir, FD.FileName)";
_in = anywheresoftware.b4a.keywords.Common.File.OpenInput(_fd.Dir,_fd.FileName);
RDebugUtils.currentLine=34996254;
 //BA.debugLineNum = 34996254;BA.debugLine="File.Copy2(In, stream) 'read the file and write";
anywheresoftware.b4a.keywords.Common.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_stream.getObject()));
RDebugUtils.currentLine=34996255;
 //BA.debugLineNum = 34996255;BA.debugLine="b = EOL.GetBytes(\"UTF8\")";
_b = _eol.getBytes("UTF8");
RDebugUtils.currentLine=34996256;
 //BA.debugLineNum = 34996256;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
 }
};
 };
RDebugUtils.currentLine=34996259;
 //BA.debugLineNum = 34996259;BA.debugLine="b = (EOL & \"--\" & boundary & \"--\" & EOL).GetBytes";
_b = (_eol+"--"+_boundary+"--"+_eol).getBytes("UTF8");
RDebugUtils.currentLine=34996260;
 //BA.debugLineNum = 34996260;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=34996261;
 //BA.debugLineNum = 34996261;BA.debugLine="b = stream.ToBytesArray";
_b = _stream.ToBytesArray();
RDebugUtils.currentLine=34996263;
 //BA.debugLineNum = 34996263;BA.debugLine="Dim request As OkHttpRequest";
_request = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest();
RDebugUtils.currentLine=34996264;
 //BA.debugLineNum = 34996264;BA.debugLine="request.InitializePost2(URL, b)";
_request.InitializePost2(_url,_b);
RDebugUtils.currentLine=34996265;
 //BA.debugLineNum = 34996265;BA.debugLine="request.SetContentType(\"multipart/form-data; boun";
_request.SetContentType("multipart/form-data; boundary="+_boundary);
RDebugUtils.currentLine=34996266;
 //BA.debugLineNum = 34996266;BA.debugLine="request.SetContentEncoding(\"UTF8\")";
_request.SetContentEncoding("UTF8");
RDebugUtils.currentLine=34996267;
 //BA.debugLineNum = 34996267;BA.debugLine="Return request";
if (true) return _request;
RDebugUtils.currentLine=34996268;
 //BA.debugLineNum = 34996268;BA.debugLine="End Sub";
return null;
}
}