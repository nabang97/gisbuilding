package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_facility_edit{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("listitem").vw.setHeight((int)((100d / 100 * height)));
views.get("listitem").vw.setLeft((int)((0d / 100 * width)));
views.get("listitem").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("numfc").vw.setLeft((int)((0d / 100 * width)));
views.get("numfc").vw.setWidth((int)((12d / 100 * width) - ((0d / 100 * width))));
views.get("pnlquantity").vw.setLeft((int)((2d / 100 * width)));
views.get("pnlquantity").vw.setWidth((int)((14d / 100 * width) - ((2d / 100 * width))));
views.get("namefc").vw.setLeft((int)((16d / 100 * width)));
views.get("namefc").vw.setWidth((int)((60d / 100 * width) - ((16d / 100 * width))));
views.get("btndelete").vw.setLeft((int)((75d / 100 * width)));
views.get("btndelete").vw.setWidth((int)((80d / 100 * width) - ((75d / 100 * width))));
views.get("numfc").vw.setTop((int)((0d / 100 * height)));
views.get("numfc").vw.setHeight((int)((90d / 100 * height) - ((0d / 100 * height))));
views.get("pnlquantity").vw.setTop((int)((10d / 100 * height)));
views.get("pnlquantity").vw.setHeight((int)((90d / 100 * height) - ((10d / 100 * height))));
views.get("btndelete").vw.setTop((int)((20d / 100 * height)));
views.get("btndelete").vw.setHeight((int)((80d / 100 * height) - ((20d / 100 * height))));
views.get("namefc").vw.setTop((int)((10d / 100 * height)));
views.get("namefc").vw.setHeight((int)((90d / 100 * height) - ((10d / 100 * height))));

}
}