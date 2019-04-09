package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_welcome{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelwelcome").vw.setWidth((int)((100d / 100 * width)));
views.get("panelwelcome").vw.setHeight((int)((100d / 100 * height)));
views.get("lblwelcome").vw.setHeight((int)((10d / 100 * height)));
views.get("lblwelcome2").vw.setHeight((int)((10d / 100 * height)));
views.get("imagelogo").vw.setHeight((int)((12d / 100 * height)));
views.get("btnadmin").vw.setWidth((int)((40d / 100 * width)));
views.get("btnguest").vw.setWidth((int)((40d / 100 * width)));
views.get("imagelogo").vw.setLeft((int)((35d / 100 * width)));
views.get("imagelogo").vw.setWidth((int)((65d / 100 * width) - ((35d / 100 * width))));
views.get("lblwelcome").vw.setLeft((int)((5d / 100 * width)));
views.get("lblwelcome").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("lblwelcome2").vw.setLeft((int)((10d / 100 * width)));
views.get("lblwelcome2").vw.setWidth((int)((90d / 100 * width) - ((10d / 100 * width))));
views.get("lblsignin").vw.setLeft((int)((5d / 100 * width)));
views.get("lblsignin").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("btnguest").vw.setLeft((int)((5d / 100 * width)));
views.get("btnguest").vw.setWidth((int)((45d / 100 * width) - ((5d / 100 * width))));
views.get("btnadmin").vw.setLeft((int)((55d / 100 * width)));
views.get("btnadmin").vw.setWidth((int)((95d / 100 * width) - ((55d / 100 * width))));
views.get("imagelogo").vw.setTop((int)((10d / 100 * height)));
views.get("imagelogo").vw.setHeight((int)((23d / 100 * height) - ((10d / 100 * height))));
views.get("lblwelcome").vw.setTop((int)((24d / 100 * height)));
views.get("lblwelcome").vw.setHeight((int)((34d / 100 * height) - ((24d / 100 * height))));
views.get("lblwelcome2").vw.setTop((int)((31d / 100 * height)));
views.get("lblwelcome2").vw.setHeight((int)((41d / 100 * height) - ((31d / 100 * height))));
views.get("lblsignin").vw.setTop((int)((70d / 100 * height)));
views.get("lblsignin").vw.setHeight((int)((75d / 100 * height) - ((70d / 100 * height))));
views.get("btnadmin").vw.setTop((int)((75d / 100 * height)));
views.get("btnadmin").vw.setHeight((int)((80d / 100 * height) - ((75d / 100 * height))));
views.get("btnguest").vw.setTop((int)((75d / 100 * height)));
views.get("btnguest").vw.setHeight((int)((80d / 100 * height) - ((75d / 100 * height))));

}
}