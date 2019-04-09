package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_login_layout{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panellogin").vw.setHeight((int)((100d / 100 * height)));
views.get("panellogin").vw.setWidth((int)((100d / 100 * width)));
views.get("imagelogo").vw.setHeight((int)((10d / 100 * height)));
views.get("editusername").vw.setLeft((int)((2d / 100 * width)));
views.get("editusername").vw.setWidth((int)((58d / 100 * width) - ((2d / 100 * width))));
views.get("editusername").vw.setTop((int)((0d / 100 * height)));
views.get("editusername").vw.setHeight((int)((5d / 100 * height) - ((0d / 100 * height))));
views.get("editpass").vw.setLeft((int)((2d / 100 * width)));
views.get("editpass").vw.setWidth((int)((58d / 100 * width) - ((2d / 100 * width))));
views.get("editpass").vw.setTop((int)((0d / 100 * height)));
views.get("editpass").vw.setHeight((int)((5d / 100 * height) - ((0d / 100 * height))));
views.get("imagelogo").vw.setLeft((int)((35d / 100 * width)));
views.get("imagelogo").vw.setWidth((int)((65d / 100 * width) - ((35d / 100 * width))));
views.get("lbllogin").vw.setLeft((int)((20d / 100 * width)));
views.get("lbllogin").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
views.get("lbladmin").vw.setLeft((int)((5d / 100 * width)));
views.get("lbladmin").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("pnleditusername").vw.setLeft((int)((20d / 100 * width)));
views.get("pnleditusername").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
views.get("pnleditpass").vw.setLeft((int)((20d / 100 * width)));
views.get("pnleditpass").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
views.get("forgetpass").vw.setLeft((int)((5d / 100 * width)));
views.get("forgetpass").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("btnlogin").vw.setLeft((int)((20d / 100 * width)));
views.get("btnlogin").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
views.get("checkbox1").vw.setLeft((int)((30d / 100 * width)));
views.get("checkbox1").vw.setWidth((int)((70d / 100 * width) - ((30d / 100 * width))));
views.get("imagelogo").vw.setTop((int)((10d / 100 * height)));
views.get("imagelogo").vw.setHeight((int)((23d / 100 * height) - ((10d / 100 * height))));
views.get("lbllogin").vw.setTop((int)((24d / 100 * height)));
views.get("lbllogin").vw.setHeight((int)((35d / 100 * height) - ((24d / 100 * height))));
views.get("lbladmin").vw.setTop((int)((45d / 100 * height)));
views.get("lbladmin").vw.setHeight((int)((48d / 100 * height) - ((45d / 100 * height))));
views.get("pnleditusername").vw.setTop((int)((50d / 100 * height)));
views.get("pnleditusername").vw.setHeight((int)((55d / 100 * height) - ((50d / 100 * height))));
views.get("pnleditpass").vw.setTop((int)((57d / 100 * height)));
views.get("pnleditpass").vw.setHeight((int)((62d / 100 * height) - ((57d / 100 * height))));
views.get("forgetpass").vw.setTop((int)((65d / 100 * height)));
views.get("forgetpass").vw.setHeight((int)((70d / 100 * height) - ((65d / 100 * height))));
views.get("btnlogin").vw.setTop((int)((70d / 100 * height)));
views.get("btnlogin").vw.setHeight((int)((75d / 100 * height) - ((70d / 100 * height))));
views.get("checkbox1").vw.setTop((int)((76d / 100 * height)));
views.get("checkbox1").vw.setHeight((int)((80d / 100 * height) - ((76d / 100 * height))));

}
}