package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_facility_list{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("listitem").vw.setWidth((int)((100d / 100 * width)));
views.get("listitem").vw.setHeight((int)((5d / 100 * height)));
views.get("numfc").vw.setLeft((int)((2d / 100 * width)));
views.get("numfc").vw.setWidth((int)((10d / 100 * width) - ((2d / 100 * width))));
views.get("namefc").vw.setLeft((int)((12d / 100 * width)));
views.get("namefc").vw.setWidth((int)((95d / 100 * width) - ((12d / 100 * width))));
views.get("numfc").vw.setTop((int)((0d / 100 * height)));
views.get("numfc").vw.setHeight((int)((5d / 100 * height) - ((0d / 100 * height))));
views.get("namefc").vw.setTop((int)((0d / 100 * height)));
views.get("namefc").vw.setHeight((int)((5d / 100 * height) - ((0d / 100 * height))));

}
}