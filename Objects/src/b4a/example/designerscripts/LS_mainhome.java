package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_mainhome{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelbar").vw.setLeft((int)((0d / 100 * width)));
views.get("panelbar").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("redline").vw.setLeft((int)((0d / 100 * width)));
views.get("redline").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panelbar").vw.setTop((int)((0d / 100 * height)));
views.get("panelbar").vw.setHeight((int)((6d / 100 * height) - ((0d / 100 * height))));
views.get("clv1").vw.setTop((int)((6d / 100 * height)));
views.get("clv1").vw.setHeight((int)((94d / 100 * height) - ((6d / 100 * height))));
views.get("paneltoolbar").vw.setTop((int)((94d / 100 * height)));
views.get("paneltoolbar").vw.setHeight((int)((6d / 100 * height) - ((94d / 100 * height))));
views.get("redline").vw.setTop((int)((0d / 100 * height)));
views.get("titlebar").vw.setLeft((int)((15d / 100 * width)));
views.get("titlebar").vw.setWidth((int)((85d / 100 * width) - ((15d / 100 * width))));
views.get("titlebar").vw.setTop((int)((1d / 100 * height)));
views.get("titlebar").vw.setHeight((int)((5d / 100 * height) - ((1d / 100 * height))));
views.get("backarrow").vw.setLeft((int)((5d / 100 * width)));
views.get("backarrow").vw.setLeft((int)((5d / 100 * width)));
views.get("backarrow").vw.setWidth((int)((10d / 100 * width) - ((5d / 100 * width))));
views.get("backarrow").vw.setTop((int)((2d / 100 * height)));
views.get("backarrow").vw.setHeight((int)((4d / 100 * height) - ((2d / 100 * height))));

}
}