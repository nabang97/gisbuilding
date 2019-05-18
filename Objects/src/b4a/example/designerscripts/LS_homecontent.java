package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_homecontent{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelhome").vw.setWidth((int)((100d / 100 * width)));
views.get("welcomeguest").vw.setTop((int)((2d / 100 * height)));
views.get("welcomeguest").vw.setLeft((int)((0d / 100 * width)));
views.get("welcomeguest").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panel4").vw.setHeight((int)((20d / 100 * height)));
views.get("panel4").vw.setTop((int)((0d / 100 * height)));
views.get("panel4").vw.setLeft((int)((0d / 100 * width)));
views.get("panel4").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("officehome").vw.setHeight((int)((20d / 100 * height)));
views.get("worshiphome").vw.setHeight((int)((views.get("officehome").vw.getHeight())));
views.get("healthhome").vw.setHeight((int)((views.get("officehome").vw.getHeight())));
views.get("educationalhome").vw.setHeight((int)((views.get("officehome").vw.getHeight())));
views.get("msmehome").vw.setHeight((int)((views.get("officehome").vw.getHeight())));
views.get("officehome").vw.setLeft((int)((5d / 100 * width)));
views.get("officehome").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("worshiphome").vw.setLeft((int)((5d / 100 * width)));
views.get("worshiphome").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("healthhome").vw.setLeft((int)((5d / 100 * width)));
views.get("healthhome").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("educationalhome").vw.setLeft((int)((5d / 100 * width)));
views.get("educationalhome").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("msmehome").vw.setLeft((int)((5d / 100 * width)));
views.get("msmehome").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("officehome").vw.setTop((int)((3d / 100 * height)+(views.get("welcomeguest").vw.getTop())+(views.get("welcomeguest").vw.getHeight())));
views.get("worshiphome").vw.setTop((int)((views.get("officehome").vw.getTop())+(views.get("officehome").vw.getHeight())+(3d / 100 * height)));
views.get("healthhome").vw.setTop((int)((views.get("worshiphome").vw.getTop())+(views.get("worshiphome").vw.getHeight())+(3d / 100 * height)));
views.get("educationalhome").vw.setTop((int)((views.get("healthhome").vw.getTop())+(views.get("healthhome").vw.getHeight())+(3d / 100 * height)));
views.get("msmehome").vw.setTop((int)((views.get("educationalhome").vw.getTop())+(views.get("educationalhome").vw.getHeight())+(3d / 100 * height)));
views.get("label1").vw.setTop((int)((5d / 100 * height)));
views.get("label2").vw.setTop((int)((views.get("label1").vw.getTop())));
views.get("label4").vw.setTop((int)((views.get("label1").vw.getTop())));
views.get("label5").vw.setTop((int)((views.get("label1").vw.getTop())));
views.get("label6").vw.setTop((int)((views.get("label1").vw.getTop())));
views.get("panelhome").vw.setHeight((int)((views.get("msmehome").vw.getTop())+(views.get("msmehome").vw.getHeight())+(3d / 100 * height)));

}
}