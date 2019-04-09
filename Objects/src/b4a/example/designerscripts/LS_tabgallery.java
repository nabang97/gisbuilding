package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_tabgallery{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelgallery").vw.setHeight((int)((100d / 100 * height)));
views.get("panelgallery").vw.setTop((int)((0d / 100 * height)));
views.get("panelgallery").vw.setLeft((int)((0d / 100 * width)));
views.get("panelgallery").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));

}
}