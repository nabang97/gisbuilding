package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_clvbuildinglist{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("clv2").vw.setLeft((int)((0d / 100 * width)));
views.get("clv2").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("clv2").vw.setTop((int)((0d / 100 * height)));
views.get("clv2").vw.setHeight((int)((100d / 100 * height) - ((0d / 100 * height))));

}
}