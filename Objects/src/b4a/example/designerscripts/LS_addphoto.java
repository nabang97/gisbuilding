package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_addphoto{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panel1").vw.setHeight((int)((100d / 100 * height)));
views.get("panel1").vw.setLeft((int)(0d));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("buttonbrowse").vw.setHeight((int)((10d / 100 * height)));
views.get("buttoncamera").vw.setHeight((int)((10d / 100 * height)));
views.get("buttonupload").vw.setHeight((int)((10d / 100 * height)));
views.get("buttonbrowse").vw.setLeft((int)((5d / 100 * width)));
views.get("buttonbrowse").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("buttoncamera").vw.setLeft((int)((5d / 100 * width)));
views.get("buttoncamera").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("buttonupload").vw.setLeft((int)((5d / 100 * width)));
views.get("buttonupload").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("imageview1").vw.setLeft((int)((5d / 100 * width)));
views.get("imageview1").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("label1").vw.setLeft((int)((5d / 100 * width)));
views.get("label1").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("buttonbrowse").vw.setTop((int)((5d / 100 * height)));
views.get("buttoncamera").vw.setTop((int)((views.get("buttonbrowse").vw.getHeight())+(views.get("buttonbrowse").vw.getTop())+(2d / 100 * height)));
views.get("imageview1").vw.setTop((int)((views.get("buttoncamera").vw.getHeight())+(views.get("buttoncamera").vw.getTop())+(2d / 100 * height)));
views.get("label1").vw.setTop((int)((views.get("buttoncamera").vw.getHeight())+(views.get("buttoncamera").vw.getTop())+(2d / 100 * height)));
views.get("imageview1").vw.setHeight((int)((views.get("panel1").vw.getHeight())-((views.get("imageview1").vw.getTop())+(views.get("buttonupload").vw.getHeight())+(7d / 100 * height))));
views.get("label1").vw.setHeight((int)((views.get("panel1").vw.getHeight())-((views.get("imageview1").vw.getTop())+(views.get("buttonupload").vw.getHeight())+(7d / 100 * height))));
views.get("buttonupload").vw.setTop((int)((views.get("imageview1").vw.getTop())+(views.get("imageview1").vw.getHeight())+(2d / 100 * height)));

}
}