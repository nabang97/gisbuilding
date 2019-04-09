package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_buildinglist{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelbuildinglist").vw.setWidth((int)((100d / 100 * width)));
views.get("panelbuildinglist").vw.setHeight((int)((30d / 100 * height)));
views.get("panellistitem").vw.setLeft((int)((0d / 100 * width)));
views.get("panellistitem").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panellistitem").vw.setTop((int)((0d / 100 * height)));
views.get("panellistitem").vw.setHeight((int)((15d / 100 * height) - ((0d / 100 * height))));
views.get("num").vw.setLeft((int)((5d / 100 * width)));
views.get("num").vw.setWidth((int)((10d / 100 * width) - ((5d / 100 * width))));
views.get("buildingname").vw.setLeft((int)((15d / 100 * width)));
views.get("buildingname").vw.setWidth((int)((70d / 100 * width) - ((15d / 100 * width))));
views.get("distance").vw.setLeft((int)((15d / 100 * width)));
views.get("distance").vw.setWidth((int)((70d / 100 * width) - ((15d / 100 * width))));
views.get("imageview1").vw.setLeft((int)((83d / 100 * width)));
views.get("imageview1").vw.setWidth((int)((95d / 100 * width) - ((83d / 100 * width))));
views.get("num").vw.setTop((int)((2d / 100 * height)));
views.get("num").vw.setHeight((int)((12d / 100 * height) - ((2d / 100 * height))));
views.get("buildingname").vw.setTop((int)((2d / 100 * height)));
views.get("buildingname").vw.setHeight((int)((7d / 100 * height) - ((2d / 100 * height))));
views.get("distance").vw.setTop((int)((7d / 100 * height)));
views.get("distance").vw.setHeight((int)((12d / 100 * height) - ((7d / 100 * height))));
views.get("imageview1").vw.setTop((int)((2d / 100 * height)));
views.get("imageview1").vw.setHeight((int)((10d / 100 * height) - ((2d / 100 * height))));
views.get("linelist").vw.setLeft((int)((0d / 100 * width)));
views.get("linelist").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("linelist").vw.setTop((int)((14.9d / 100 * height)));
views.get("linelist").vw.setHeight((int)((0.1d / 100 * height) - ((14.9d / 100 * height))));

}
}