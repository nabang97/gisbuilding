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
views.get("tabhost1").vw.setLeft((int)((5d / 100 * width)));
views.get("tabhost1").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("tabhost1").vw.setTop((int)((views.get("pnlname").vw.getTop())+(views.get("pnlname").vw.getHeight())+(5d / 100 * width)));
views.get("tabhost1").vw.setHeight((int)((100d / 100 * height)));
views.get("panelback").vw.setTop((int)((views.get("tabhost1").vw.getTop())-(1d / 100 * width)));
views.get("panelback").vw.setHeight((int)((15d / 100 * width)));
views.get("panelback").vw.setLeft((int)((5d / 100 * width)));
views.get("panelback").vw.setWidth((int)((90d / 100 * width)));
views.get("tabroute").vw.setTop((int)((0d / 100 * width)));
views.get("tabdetail").vw.setTop((int)((0d / 100 * width)));
views.get("tabgallery").vw.setTop((int)((0d / 100 * width)));
views.get("tabroute").vw.setHeight((int)((views.get("panelback").vw.getHeight())));
views.get("tabdetail").vw.setHeight((int)((views.get("panelback").vw.getHeight())));
views.get("tabgallery").vw.setHeight((int)((views.get("panelback").vw.getHeight())));
views.get("tabroute").vw.setLeft((int)((0d / 100 * width)));
views.get("tabroute").vw.setWidth((int)((30d / 100 * width)));
views.get("tabdetail").vw.setLeft((int)((views.get("tabroute").vw.getWidth())));
views.get("tabdetail").vw.setWidth((int)((views.get("tabroute").vw.getWidth())));
views.get("tabgallery").vw.setLeft((int)((views.get("tabdetail").vw.getLeft())+(views.get("tabdetail").vw.getWidth())));
views.get("tabgallery").vw.setWidth((int)((views.get("tabroute").vw.getWidth())));

}
}