package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_mainscrollview{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelbar").vw.setLeft((int)((0d / 100 * width)));
views.get("panelbar").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panelbar").vw.setTop((int)((0d / 100 * height)));
views.get("panelbar").vw.setHeight((int)((8d / 100 * height) - ((0d / 100 * height))));
views.get("paneltoolbar").vw.setTop((int)((92d / 100 * height)));
views.get("paneltoolbar").vw.setHeight((int)((100d / 100 * height) - ((92d / 100 * height))));
views.get("btnhome").vw.setHeight((int)((6d / 100 * height)));
views.get("btnhome").vw.setLeft((int)((0d / 100 * width)));
views.get("btnhome").vw.setWidth((int)((25d / 100 * width) - ((0d / 100 * width))));
views.get("btnmap").vw.setHeight((int)((views.get("btnhome").vw.getHeight())));
views.get("btnmap").vw.setLeft((int)((25d / 100 * width)));
views.get("btnmap").vw.setWidth((int)((50d / 100 * width) - ((25d / 100 * width))));
views.get("btnsearch").vw.setHeight((int)((views.get("btnhome").vw.getHeight())));
views.get("btnsearch").vw.setLeft((int)((50d / 100 * width)));
views.get("btnsearch").vw.setWidth((int)((75d / 100 * width) - ((50d / 100 * width))));
views.get("btninfo").vw.setHeight((int)((views.get("btnhome").vw.getHeight())));
views.get("btninfo").vw.setLeft((int)((75d / 100 * width)));
views.get("btninfo").vw.setWidth((int)((100d / 100 * width) - ((75d / 100 * width))));
views.get("titlebar").vw.setLeft((int)((15d / 100 * width)));
views.get("titlebar").vw.setWidth((int)((85d / 100 * width) - ((15d / 100 * width))));
views.get("titlebar").vw.setTop((int)((2d / 100 * height)));
views.get("titlebar").vw.setHeight((int)((6d / 100 * height) - ((2d / 100 * height))));
views.get("panellogout").vw.setLeft((int)((70d / 100 * width)));
views.get("panellogout").vw.setWidth((int)((98d / 100 * width) - ((70d / 100 * width))));
views.get("panellogout").vw.setTop((int)((2d / 100 * height)));
views.get("panellogout").vw.setHeight((int)((6d / 100 * height) - ((2d / 100 * height))));
views.get("labellogout").vw.setTop((int)((0d / 100 * height)));
views.get("labellogout").vw.setHeight((int)((4d / 100 * height) - ((0d / 100 * height))));
views.get("labellogout").vw.setLeft((int)((0d / 100 * width)));
views.get("labellogout").vw.setWidth((int)((28d / 100 * width) - ((0d / 100 * width))));
views.get("backarrow").vw.setLeft((int)((5d / 100 * width)));
views.get("backarrow").vw.setLeft((int)((5d / 100 * width)));
views.get("backarrow").vw.setWidth((int)((10d / 100 * width) - ((5d / 100 * width))));
views.get("backarrow").vw.setTop((int)((3d / 100 * height)));
views.get("backarrow").vw.setHeight((int)((5d / 100 * height) - ((3d / 100 * height))));
views.get("scrollview1").vw.setTop((int)((8d / 100 * height)));
views.get("scrollview1").vw.setHeight((int)((100d / 100 * height)-((views.get("scrollview1").vw.getTop())+(8d / 100 * height))));

}
}