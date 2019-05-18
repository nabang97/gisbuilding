package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_buildinglisttwo{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelbuildinglist").vw.setWidth((int)((100d / 100 * width)));
views.get("num").vw.setHeight((int)((100d / 100 * height)));
views.get("buildingname").vw.setHeight((int)((50d / 100 * height)));
views.get("distance").vw.setHeight((int)((views.get("buildingname").vw.getHeight())));
views.get("panellistitem").vw.setTop((int)((0d / 100 * height)));
views.get("num").vw.setTop((int)((0d / 100 * height)));
views.get("buildingname").vw.setTop((int)((0d / 100 * height)));
views.get("distance").vw.setTop((int)((views.get("buildingname").vw.getTop())+(views.get("buildingname").vw.getHeight())));
views.get("imageview1").vw.setTop((int)((20d / 100 * height)));
views.get("panellistitem").vw.setHeight((int)((views.get("distance").vw.getTop())+(views.get("distance").vw.getHeight())));
views.get("panelbuildinglist").vw.setHeight((int)((views.get("panellistitem").vw.getHeight())));
views.get("linelist").vw.setHeight((int)((0.5d / 100 * height)));
views.get("linelist").vw.setTop((int)((views.get("distance").vw.getTop())+((views.get("distance").vw.getHeight())-(views.get("linelist").vw.getHeight()))));
views.get("panellistitem").vw.setLeft((int)((0d / 100 * width)));
views.get("panellistitem").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("num").vw.setLeft((int)((2d / 100 * width)));
views.get("num").vw.setWidth((int)((18d / 100 * width) - ((2d / 100 * width))));
views.get("buildingname").vw.setLeft((int)((20d / 100 * width)));
views.get("buildingname").vw.setWidth((int)((75d / 100 * width) - ((20d / 100 * width))));
views.get("distance").vw.setLeft((int)((20d / 100 * width)));
views.get("distance").vw.setWidth((int)((75d / 100 * width) - ((20d / 100 * width))));
views.get("imageview1").vw.setLeft((int)((83d / 100 * width)));
views.get("imageview1").vw.setWidth((int)((95d / 100 * width) - ((83d / 100 * width))));

}
}