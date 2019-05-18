package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_card1{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panel1").vw.setLeft((int)((2d / 100 * width)));
views.get("panel1").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("panel1").vw.setTop((int)((2d / 100 * height)));
views.get("panel1").vw.setHeight((int)((30d / 100 * height) - ((2d / 100 * height))));
views.get("label1").vw.setTop((int)((6d / 100 * height)));

}
}