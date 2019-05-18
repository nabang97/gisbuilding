package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_maplocation{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panel1").vw.setWidth((int)((100d / 100 * width)));
views.get("panel1").vw.setTop((int)((0d / 100 * height)));
views.get("webview1").vw.setTop((int)((6d / 100 * height)));
views.get("webview1").vw.setHeight((int)((100d / 100 * height)-(views.get("webview1").vw.getTop())));
views.get("webview1").vw.setLeft((int)((0d / 100 * width)));
views.get("webview1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panel2").vw.setTop((int)(0-(2d / 100 * height)));
views.get("panel2").vw.setHeight((int)((12d / 100 * height)));
views.get("panel2").vw.setLeft((int)((0d / 100 * width)));
views.get("panel2").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panel3").vw.setTop((int)(((views.get("panel2").vw.getHeight())/2d)-(2.5d / 100 * height)));
views.get("panel3").vw.setLeft((int)((4d / 100 * width)));
views.get("panel3").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("btnposition").vw.setTop((int)((0d / 100 * height)));
views.get("btnposition").vw.setLeft((int)((3d / 100 * width)));
views.get("btnposition").vw.setWidth((int)((23d / 100 * width) - ((3d / 100 * width))));
views.get("imageposition").vw.setTop((int)((2d / 100 * width)));
views.get("imageposition").vw.setWidth((int)((5d / 100 * width)));
views.get("imageposition").vw.setHeight((int)((8d / 100 * width)));
views.get("imageposition").vw.setLeft((int)((views.get("btnposition").vw.getWidth())/2d-(views.get("imageposition").vw.getWidth())/2d));
views.get("label1").vw.setTop((int)((views.get("imageposition").vw.getTop())+(views.get("imageposition").vw.getHeight())));
views.get("label1").vw.setHeight((int)((5d / 100 * width)));
views.get("label1").vw.setWidth((int)((views.get("btnposition").vw.getWidth())));
views.get("btnposition").vw.setHeight((int)((views.get("label1").vw.getHeight())+(views.get("label1").vw.getTop())));
views.get("btnmanual").vw.setTop((int)((views.get("btnposition").vw.getTop())));
views.get("btnmanual").vw.setWidth((int)((views.get("btnposition").vw.getWidth())));
views.get("btnmanual").vw.setLeft((int)((25d / 100 * width)));
views.get("btnmanual").vw.setWidth((int)((45d / 100 * width) - ((25d / 100 * width))));
views.get("btnmanual").vw.setHeight((int)((views.get("label1").vw.getHeight())+(views.get("label1").vw.getTop())));
views.get("imagemanual").vw.setTop((int)((views.get("imageposition").vw.getTop())));
views.get("imagemanual").vw.setLeft((int)((6.5d / 100 * width)));
views.get("imagemanual").vw.setWidth((int)((13.5d / 100 * width) - ((6.5d / 100 * width))));
views.get("imagemanual").vw.setHeight((int)((views.get("imageposition").vw.getHeight())));
views.get("label2").vw.setTop((int)((views.get("imagemanual").vw.getTop())+((views.get("imagemanual").vw.getHeight()))));
views.get("label2").vw.setHeight((int)((views.get("label1").vw.getHeight())));
views.get("label2").vw.setWidth((int)((views.get("btnmanual").vw.getWidth())));
views.get("btnlegend").vw.setTop((int)((views.get("btnmanual").vw.getTop())));
views.get("btnlegend").vw.setWidth((int)((views.get("btnmanual").vw.getWidth())));
views.get("btnlegend").vw.setLeft((int)((47d / 100 * width)));
views.get("btnlegend").vw.setWidth((int)((67d / 100 * width) - ((47d / 100 * width))));
views.get("btnlegend").vw.setHeight((int)((views.get("btnmanual").vw.getHeight())));
views.get("imagelegend").vw.setTop((int)((views.get("imageposition").vw.getTop())));
views.get("imagelegend").vw.setHeight((int)((views.get("imageposition").vw.getHeight())));
views.get("imagelegend").vw.setWidth((int)((views.get("imagelegend").vw.getHeight())));
views.get("imagelegend").vw.setLeft((int)(((views.get("btnlegend").vw.getWidth())/2d)-((views.get("imagelegend").vw.getWidth())/2d)));
views.get("label3").vw.setTop((int)((views.get("label1").vw.getTop())));
views.get("label3").vw.setHeight((int)((views.get("label1").vw.getHeight())));
views.get("label3").vw.setWidth((int)((views.get("btnmanual").vw.getWidth())));
views.get("btnrefresh").vw.setTop((int)((views.get("btnlegend").vw.getTop())));
views.get("btnrefresh").vw.setWidth((int)((views.get("btnlegend").vw.getWidth())));
views.get("btnrefresh").vw.setLeft((int)((69d / 100 * width)));
views.get("btnrefresh").vw.setWidth((int)((89d / 100 * width) - ((69d / 100 * width))));
views.get("btnrefresh").vw.setHeight((int)((views.get("btnlegend").vw.getHeight())));
views.get("imagerefresh").vw.setTop((int)((views.get("imageposition").vw.getTop())));
views.get("imagerefresh").vw.setHeight((int)((views.get("imageposition").vw.getHeight())));
views.get("imagerefresh").vw.setWidth((int)((views.get("imagerefresh").vw.getHeight())));
views.get("imagerefresh").vw.setLeft((int)(((views.get("btnrefresh").vw.getWidth())/2d)-((views.get("imagerefresh").vw.getWidth())/2d)));
views.get("label4").vw.setTop((int)((views.get("label1").vw.getTop())));
views.get("label4").vw.setHeight((int)((views.get("label1").vw.getHeight())));
views.get("label4").vw.setLeft((int)((0d / 100 * width)));
views.get("label4").vw.setWidth((int)((20d / 100 * width) - ((0d / 100 * width))));
views.get("panel3").vw.setHeight((int)((views.get("btnposition").vw.getTop())+(views.get("btnposition").vw.getHeight())+(2d / 100 * width)));
views.get("btnsavelocation").vw.setHeight((int)((8d / 100 * height)));
views.get("btnsavelocation").vw.setLeft((int)((4d / 100 * width)));
views.get("btnsavelocation").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("legend").vw.setLeft((int)((4d / 100 * width)));
views.get("legend").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("closebtn").vw.setTop((int)((2d / 100 * width)));
views.get("closebtn").vw.setHeight((int)((10d / 100 * width)));
views.get("closebtn").vw.setWidth((int)((10d / 100 * width)));
views.get("closebtn").vw.setLeft((int)((80d / 100 * width)));
views.get("legendhouse").vw.setTop((int)((10d / 100 * width)));
views.get("legendhouse").vw.setLeft((int)((2d / 100 * width)));
views.get("legendhouse").vw.setWidth((int)((5d / 100 * width)));
views.get("legendhouse").vw.setHeight((int)((5d / 100 * width)));
views.get("label6").vw.setTop((int)((views.get("legendhouse").vw.getTop())));
views.get("label6").vw.setLeft((int)((views.get("legendhouse").vw.getLeft())+(views.get("legendhouse").vw.getWidth())+(2d / 100 * width)));
views.get("label6").vw.setWidth((int)((20d / 100 * width)));
views.get("label6").vw.setHeight((int)((5d / 100 * width)));
views.get("legendworship").vw.setTop((int)((views.get("legendhouse").vw.getTop())+(views.get("legendhouse").vw.getHeight())+(2d / 100 * width)));
views.get("legendworship").vw.setLeft((int)((2d / 100 * width)));
views.get("legendworship").vw.setWidth((int)((5d / 100 * width)));
views.get("legendworship").vw.setHeight((int)((5d / 100 * width)));
views.get("label8").vw.setTop((int)((views.get("legendhouse").vw.getTop())+(views.get("legendhouse").vw.getHeight())+(2d / 100 * width)));
views.get("label8").vw.setLeft((int)((views.get("legendworship").vw.getLeft())+(views.get("legendworship").vw.getWidth())+(2d / 100 * width)));
views.get("label8").vw.setWidth((int)((views.get("label6").vw.getWidth())));
views.get("label8").vw.setHeight((int)((5d / 100 * width)));
views.get("legendmsme").vw.setTop((int)((views.get("legendworship").vw.getTop())+(views.get("legendworship").vw.getHeight())+(2d / 100 * width)));
views.get("legendmsme").vw.setLeft((int)((2d / 100 * width)));
views.get("legendmsme").vw.setWidth((int)((5d / 100 * width)));
views.get("legendmsme").vw.setHeight((int)((5d / 100 * width)));
views.get("label10").vw.setTop((int)((views.get("legendmsme").vw.getTop())));
views.get("label10").vw.setLeft((int)((views.get("legendworship").vw.getLeft())+(views.get("legendworship").vw.getWidth())+(2d / 100 * width)));
views.get("label10").vw.setWidth((int)((views.get("label6").vw.getWidth())));
views.get("label10").vw.setHeight((int)((5d / 100 * width)));
views.get("legendedu").vw.setTop((int)((views.get("legendhouse").vw.getTop())));
views.get("legendedu").vw.setLeft((int)((views.get("label6").vw.getLeft())+(views.get("label6").vw.getWidth())+(3d / 100 * width)));
views.get("legendedu").vw.setWidth((int)((views.get("legendhouse").vw.getWidth())));
views.get("legendedu").vw.setHeight((int)((views.get("legendhouse").vw.getHeight())));
views.get("label5").vw.setTop((int)((views.get("legendedu").vw.getTop())));
views.get("label5").vw.setLeft((int)((views.get("legendedu").vw.getLeft())+(views.get("legendedu").vw.getWidth())+(2d / 100 * width)));
views.get("label5").vw.setWidth((int)((views.get("label6").vw.getWidth())));
views.get("label5").vw.setHeight((int)((5d / 100 * width)));
views.get("legendhealth").vw.setTop((int)((views.get("legendedu").vw.getTop())+(views.get("legendedu").vw.getHeight())+(2d / 100 * width)));
views.get("legendhealth").vw.setLeft((int)((views.get("label8").vw.getLeft())+(views.get("label8").vw.getWidth())+(3d / 100 * width)));
views.get("legendhealth").vw.setWidth((int)((views.get("legendhouse").vw.getWidth())));
views.get("legendhealth").vw.setHeight((int)((views.get("legendhouse").vw.getHeight())));
views.get("label7").vw.setTop((int)((views.get("legendhealth").vw.getTop())));
views.get("label7").vw.setLeft((int)((views.get("legendhealth").vw.getLeft())+(views.get("legendhealth").vw.getWidth())+(2d / 100 * width)));
views.get("label7").vw.setWidth((int)((views.get("label6").vw.getWidth())));
views.get("label7").vw.setHeight((int)((5d / 100 * width)));
views.get("legendoffice").vw.setTop((int)((views.get("legendhealth").vw.getTop())+(views.get("legendhealth").vw.getHeight())+(2d / 100 * width)));
views.get("legendoffice").vw.setLeft((int)((views.get("label10").vw.getLeft())+(views.get("label10").vw.getWidth())+(3d / 100 * width)));
views.get("legendoffice").vw.setWidth((int)((views.get("legendhouse").vw.getWidth())));
views.get("legendoffice").vw.setHeight((int)((views.get("legendhouse").vw.getHeight())));
views.get("label9").vw.setTop((int)((views.get("legendoffice").vw.getTop())));
views.get("label9").vw.setLeft((int)((views.get("legendoffice").vw.getLeft())+(views.get("legendoffice").vw.getWidth())+(2d / 100 * width)));
views.get("label9").vw.setWidth((int)((views.get("label6").vw.getWidth())));
views.get("label9").vw.setHeight((int)((5d / 100 * width)));
views.get("j1").vw.setTop((int)((views.get("legendhouse").vw.getTop())));
views.get("j1").vw.setLeft((int)((views.get("label5").vw.getLeft())+(views.get("label5").vw.getWidth())+(3d / 100 * width)));
views.get("j1").vw.setWidth((int)((views.get("legendhouse").vw.getWidth())));
views.get("j1").vw.setHeight((int)((views.get("legendhouse").vw.getHeight())));
views.get("j2").vw.setTop((int)((views.get("legendhouse").vw.getTop())+(views.get("j1").vw.getHeight())+(2d / 100 * width)));
views.get("j2").vw.setLeft((int)((views.get("label5").vw.getLeft())+(views.get("label5").vw.getWidth())+(3d / 100 * width)));
//BA.debugLineNum = 151;BA.debugLine="j2.Width=legendhouse.Width"[MapLocation/General script]
views.get("j2").vw.setWidth((int)((views.get("legendhouse").vw.getWidth())));
//BA.debugLineNum = 152;BA.debugLine="j2.Height = legendhouse.Height"[MapLocation/General script]
views.get("j2").vw.setHeight((int)((views.get("legendhouse").vw.getHeight())));
//BA.debugLineNum = 154;BA.debugLine="j3.Top = j2.Top + j2.Height + 2%x"[MapLocation/General script]
views.get("j3").vw.setTop((int)((views.get("j2").vw.getTop())+(views.get("j2").vw.getHeight())+(2d / 100 * width)));
//BA.debugLineNum = 155;BA.debugLine="j3.Left=Label5.Left + Label5.Width + 3%x"[MapLocation/General script]
views.get("j3").vw.setLeft((int)((views.get("label5").vw.getLeft())+(views.get("label5").vw.getWidth())+(3d / 100 * width)));
//BA.debugLineNum = 156;BA.debugLine="j3.Width=legendhouse.Width"[MapLocation/General script]
views.get("j3").vw.setWidth((int)((views.get("legendhouse").vw.getWidth())));
//BA.debugLineNum = 157;BA.debugLine="j3.Height = legendhouse.Height"[MapLocation/General script]
views.get("j3").vw.setHeight((int)((views.get("legendhouse").vw.getHeight())));
//BA.debugLineNum = 159;BA.debugLine="Legend.Height = Label10.Top + Label10.Height + 2%y"[MapLocation/General script]
views.get("legend").vw.setHeight((int)((views.get("label10").vw.getTop())+(views.get("label10").vw.getHeight())+(2d / 100 * height)));

}
}