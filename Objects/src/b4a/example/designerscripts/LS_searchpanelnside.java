package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_searchpanelnside{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("searchtextpanel").vw.setLeft((int)((2d / 100 * width)));
views.get("searchtextpanel").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("searchtext").vw.setLeft((int)((2d / 100 * width)));
views.get("searchtext").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
views.get("facilitybtn").vw.setLeft((int)((0d / 100 * width)));
views.get("facilitybtn").vw.setWidth((int)((96d / 100 * width) - ((0d / 100 * width))));
views.get("spinjorong").vw.setLeft((int)((2d / 100 * width)));
views.get("spinjorong").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
views.get("spintype").vw.setLeft((int)((2d / 100 * width)));
views.get("spintype").vw.setWidth((int)((94d / 100 * width) - ((2d / 100 * width))));
views.get("searchradius").vw.setLeft((int)((25d / 100 * width)));
views.get("searchradius").vw.setWidth((int)((94d / 100 * width) - ((25d / 100 * width))));
views.get("spinpanel").vw.setLeft((int)((2d / 100 * width)));
views.get("spinpanel").vw.setWidth((int)((40d / 100 * width) - ((2d / 100 * width))));
views.get("spinbuilding").vw.setLeft((int)((0d / 100 * width)));
views.get("spinbuilding").vw.setWidth((int)((39d / 100 * width) - ((0d / 100 * width))));
views.get("spinsearch").vw.setLeft((int)((0d / 100 * width)));
views.get("spinsearch").vw.setWidth((int)((28d / 100 * width) - ((0d / 100 * width))));
views.get("spinsrcpanel").vw.setLeft((int)((41d / 100 * width)));
views.get("spinsrcpanel").vw.setWidth((int)((69d / 100 * width) - ((41d / 100 * width))));
views.get("searchbtn").vw.setLeft((int)((70d / 100 * width)));
views.get("searchbtn").vw.setWidth((int)((98d / 100 * width) - ((70d / 100 * width))));
views.get("fromtext").vw.setLeft((int)((0d / 100 * width)));
views.get("fromtext").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
views.get("totext").vw.setLeft((int)((66d / 100 * width)));
views.get("totext").vw.setWidth((int)((96d / 100 * width) - ((66d / 100 * width))));
views.get("label3").vw.setLeft((int)((3d / 100 * width)));
views.get("label3").vw.setWidth((int)((25d / 100 * width) - ((3d / 100 * width))));
views.get("label1").vw.setLeft((int)((2d / 100 * width)));
views.get("label1").vw.setWidth((int)((40d / 100 * width) - ((2d / 100 * width))));
views.get("label2").vw.setLeft((int)((41d / 100 * width)));
views.get("label2").vw.setWidth((int)((69d / 100 * width) - ((41d / 100 * width))));
views.get("searchtextpanel").vw.setHeight((int)((30d / 100 * height)));
views.get("searchradius").vw.setHeight((int)((views.get("searchtextpanel").vw.getHeight())));
views.get("searchtext").vw.setHeight((int)((30d / 100 * height)));
views.get("label3").vw.setHeight((int)((views.get("searchradius").vw.getHeight())));
views.get("facilitybtn").vw.setHeight((int)((30d / 100 * height)));
views.get("fromtext").vw.setHeight((int)((views.get("searchtext").vw.getHeight())));
views.get("totext").vw.setHeight((int)((views.get("searchtext").vw.getHeight())));
views.get("lblfrom").vw.setHeight((int)((views.get("searchtext").vw.getHeight())));
views.get("lblto").vw.setHeight((int)((views.get("searchtext").vw.getHeight())));
views.get("lblsd").vw.setHeight((int)((views.get("searchtext").vw.getHeight())));
views.get("spinjorong").vw.setHeight((int)((views.get("searchtext").vw.getHeight())));
views.get("spintype").vw.setHeight((int)((views.get("searchtext").vw.getHeight())));
views.get("label1").vw.setHeight((int)((20d / 100 * height)));
views.get("label2").vw.setHeight((int)((20d / 100 * height)));
views.get("searchbtn").vw.setHeight((int)((25d / 100 * height)));
views.get("spinbuilding").vw.setHeight((int)((25d / 100 * height)));
views.get("spinsearch").vw.setHeight((int)((25d / 100 * height)));
views.get("spinpanel").vw.setHeight((int)((25d / 100 * height)));
views.get("spinsrcpanel").vw.setHeight((int)((25d / 100 * height)));
views.get("fromtext").vw.setHeight((int)((views.get("searchtext").vw.getHeight())));
views.get("totext").vw.setHeight((int)((views.get("fromtext").vw.getHeight())));
views.get("searchtextpanel").vw.setTop((int)((5d / 100 * height)));
views.get("searchtext").vw.setTop((int)((30d / 100 * height) - (views.get("searchtext").vw.getHeight())));
views.get("fromtext").vw.setTop((int)((views.get("searchtext").vw.getTop() + views.get("searchtext").vw.getHeight()) - (views.get("fromtext").vw.getHeight())));
views.get("totext").vw.setTop((int)((views.get("searchtext").vw.getTop() + views.get("searchtext").vw.getHeight()) - (views.get("totext").vw.getHeight())));
views.get("spintype").vw.setTop((int)((0d / 100 * height)));
views.get("facilitybtn").vw.setTop((int)(0d));
views.get("spinjorong").vw.setTop((int)((views.get("searchtext").vw.getTop() + views.get("searchtext").vw.getHeight()) - (views.get("spinjorong").vw.getHeight())));
views.get("label1").vw.setTop((int)((views.get("searchtextpanel").vw.getHeight())+(views.get("searchtextpanel").vw.getTop())+(5d / 100 * height)));
views.get("label2").vw.setTop((int)((views.get("label1").vw.getTop())));
views.get("spinpanel").vw.setTop((int)((views.get("searchtextpanel").vw.getHeight())+(views.get("searchtextpanel").vw.getTop())+(5d / 100 * height)+(views.get("label1").vw.getHeight())));
views.get("spinsrcpanel").vw.setTop((int)((views.get("spinpanel").vw.getTop())));
views.get("searchbtn").vw.setTop((int)((views.get("spinpanel").vw.getTop())));
views.get("spinbuilding").vw.setTop((int)((0d / 100 * height)));
views.get("spinsearch").vw.setTop((int)((0d / 100 * height)));
views.get("searchradius").vw.setTop((int)((30d / 100 * height) - (views.get("searchradius").vw.getHeight())));
views.get("label3").vw.setTop((int)((views.get("searchradius").vw.getTop() + views.get("searchradius").vw.getHeight()) - (views.get("label3").vw.getHeight())));

}
}