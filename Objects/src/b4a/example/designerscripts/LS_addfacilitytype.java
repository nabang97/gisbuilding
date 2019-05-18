package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_addfacilitytype{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("paneladdfacility").vw.setTop((int)((0d / 100 * height)));
views.get("paneladdfacility").vw.setLeft((int)((0d / 100 * width)));
views.get("paneladdfacility").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("paneladdpanel").vw.setLeft((int)((0d / 100 * width)));
views.get("paneladdpanel").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("label1").vw.setTop((int)((5d / 100 * width)));
views.get("label1").vw.setLeft((int)((4d / 100 * width)));
views.get("label1").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("label1").vw.setHeight((int)((8d / 100 * width)));
views.get("panelname").vw.setTop((int)((views.get("label1").vw.getTop())+(views.get("label1").vw.getHeight())+(2d / 100 * width)));
views.get("panelname").vw.setLeft((int)((4d / 100 * width)));
views.get("panelname").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("panelname").vw.setHeight((int)((10d / 100 * width)));
views.get("editname").vw.setTop((int)((0d / 100 * width)));
views.get("editname").vw.setLeft((int)((0d / 100 * width)));
views.get("editname").vw.setWidth((int)((92d / 100 * width) - ((0d / 100 * width))));
views.get("editname").vw.setHeight((int)((10d / 100 * width)));
views.get("btnadd").vw.setLeft((int)((4d / 100 * width)));
views.get("btnadd").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("btnadd").vw.setHeight((int)((10d / 100 * width)));
views.get("btnadd").vw.setTop((int)((views.get("panelname").vw.getTop())+(views.get("panelname").vw.getHeight())+(5d / 100 * width)));
views.get("paneladdpanel").vw.setHeight((int)((views.get("btnadd").vw.getTop())+(views.get("btnadd").vw.getHeight())+(5d / 100 * width)));
views.get("pnlistfac").vw.setLeft((int)((0d / 100 * width)));
views.get("pnlistfac").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("pnlistfac").vw.setTop((int)((views.get("paneladdpanel").vw.getTop())+(views.get("paneladdpanel").vw.getHeight())+(5d / 100 * width)));
views.get("clvfac").vw.setTop((int)((0d / 100 * height)));
views.get("clvfac").vw.setLeft((int)((5d / 100 * width)));
views.get("clvfac").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("clvfac").vw.setHeight((int)((views.get("pnlistfac").vw.getHeight())));

}
}