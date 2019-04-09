package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_officedetail{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelbuildinglist").vw.setWidth((int)((100d / 100 * width)));
views.get("panel1").vw.setHeight((int)((12d / 100 * height)));
views.get("panel1").vw.setLeft((int)((0d / 100 * width)));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("pnlname").vw.setHeight((int)((21d / 100 * height)));
views.get("pnlname").vw.setLeft((int)((4d / 100 * width)));
views.get("pnlname").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("officename").vw.setLeft((int)((4d / 100 * width)));
views.get("officename").vw.setWidth((int)((88d / 100 * width) - ((4d / 100 * width))));
views.get("label1").vw.setLeft((int)((4d / 100 * width)));
views.get("label1").vw.setWidth((int)((88d / 100 * width) - ((4d / 100 * width))));
views.get("label1").vw.setTop((int)((1d / 100 * height)));
views.get("officename").vw.setTop((int)((views.get("label1").vw.getTop())+(views.get("label1").vw.getHeight())));
views.get("panel1").vw.setTop((int)((0d / 100 * height)));
views.get("pnlname").vw.setTop((int)((2d / 100 * height)));
views.get("tabhost1").vw.setLeft((int)((0d / 100 * width)));
views.get("tabhost1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("tabhost1").vw.setTop((int)((views.get("pnlname").vw.getTop())+(views.get("pnlname").vw.getHeight())+(2d / 100 * height)));
views.get("tabhost1").vw.setHeight((int)((100d / 100 * height)));

}
}