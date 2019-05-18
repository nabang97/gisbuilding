package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_editbuildingfacility{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelbuildinglist").vw.setWidth((int)((100d / 100 * width)));
views.get("label1").vw.setHeight((int)((8d / 100 * height)));
views.get("label1").vw.setTop((int)((2d / 100 * height)));
views.get("label1").vw.setLeft((int)((5d / 100 * width)));
views.get("label1").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("lblfacility").vw.setLeft((int)((5d / 100 * width)));
views.get("lblfacility").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("lblfacility").vw.setHeight((int)((5d / 100 * height)));
views.get("lblfacility").vw.setTop((int)((0d / 100 * height)));
views.get("clv1").vw.setLeft((int)((5d / 100 * width)));
views.get("clv1").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("clv1").vw.setTop((int)((views.get("lblfacility").vw.getHeight())+(views.get("lblfacility").vw.getTop())));
views.get("pfacility").vw.setTop((int)((views.get("label1").vw.getTop())+(views.get("label1").vw.getHeight())+(2d / 100 * height)));
views.get("pfacility").vw.setLeft((int)((0d / 100 * width)));
views.get("pfacility").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("pfacility").vw.setHeight((int)((views.get("clv1").vw.getTop())+(views.get("clv1").vw.getHeight())));
views.get("panel1").vw.setHeight((int)((10d / 100 * height)));
views.get("panel1").vw.setLeft((int)((0d / 100 * width)));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panel1").vw.setTop((int)((views.get("pfacility").vw.getHeight())+(views.get("pfacility").vw.getTop())+(3d / 100 * height)));
views.get("label2").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("label2").vw.setLeft((int)((5d / 100 * width)));
views.get("label2").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("label2").vw.setTop((int)((0d / 100 * height)));
views.get("label3").vw.setLeft((int)((5d / 100 * width)));
views.get("label3").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("btnsavechanges").vw.setHeight((int)((8d / 100 * height)));
views.get("btnsavechanges").vw.setLeft((int)((5d / 100 * width)));
views.get("btnsavechanges").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("btnsavechanges").vw.setTop((int)((views.get("panel1").vw.getTop())+(views.get("panel1").vw.getHeight())+(3d / 100 * height)));

}
}