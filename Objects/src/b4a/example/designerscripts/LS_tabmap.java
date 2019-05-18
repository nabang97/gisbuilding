package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_tabmap{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelmap").vw.setHeight((int)((100d / 100 * height)));
views.get("webviewroute").vw.setHeight((int)((views.get("panelmap").vw.getHeight())));
views.get("btnroute").vw.setHeight((int)((8d / 100 * height)));
views.get("panelmap").vw.setTop((int)((2d / 100 * height)));
views.get("webviewroute").vw.setTop((int)((0d / 100 * height)));
views.get("btnroute").vw.setTop((int)((views.get("panelmap").vw.getTop())+(views.get("panelmap").vw.getHeight())+(2d / 100 * height)));
views.get("panelmap").vw.setLeft((int)((4d / 100 * width)));
views.get("panelmap").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("webviewroute").vw.setLeft((int)((4d / 100 * width)));
views.get("webviewroute").vw.setWidth((int)((88d / 100 * width) - ((4d / 100 * width))));
views.get("btnroute").vw.setLeft((int)((4d / 100 * width)));
views.get("btnroute").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));

}
}