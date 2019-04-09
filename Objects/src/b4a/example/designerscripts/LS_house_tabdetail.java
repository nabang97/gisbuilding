package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_house_tabdetail{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("lblfcnowner").vw.setHeight((int)((7d / 100 * height)));
views.get("fcnowner").vw.setHeight((int)((views.get("lblfcnowner").vw.getHeight())));
views.get("lblstandingyear").vw.setHeight((int)((views.get("lblfcnowner").vw.getHeight())));
views.get("standingyear").vw.setHeight((int)((views.get("lblfcnowner").vw.getHeight())));
views.get("lblbuildingtax").vw.setHeight((int)((views.get("lblfcnowner").vw.getHeight())));
views.get("buildingtax").vw.setHeight((int)((views.get("lblfcnowner").vw.getHeight())));
views.get("lbladdress").vw.setHeight((int)((views.get("lblfcnowner").vw.getHeight())));
views.get("lblelectric").vw.setHeight((int)((views.get("lblfcnowner").vw.getHeight())));
views.get("electricity").vw.setHeight((int)((views.get("lblfcnowner").vw.getHeight())));
views.get("lblcons").vw.setHeight((int)((views.get("lblfcnowner").vw.getHeight())));
views.get("construction").vw.setHeight((int)((views.get("lblfcnowner").vw.getHeight())));
views.get("label2").vw.setHeight((int)((8d / 100 * height)));
views.get("lblfcnowner").vw.setTop((int)((0d / 100 * height)));
views.get("fcnowner").vw.setTop((int)((views.get("lblfcnowner").vw.getTop())+(views.get("lblfcnowner").vw.getHeight())));
views.get("lblstandingyear").vw.setTop((int)((views.get("lblfcnowner").vw.getTop())));
views.get("standingyear").vw.setTop((int)((views.get("lblstandingyear").vw.getTop())+(views.get("lblstandingyear").vw.getHeight())));
views.get("lblbuildingtax").vw.setTop((int)((views.get("lblfcnowner").vw.getTop())));
views.get("buildingtax").vw.setTop((int)((views.get("lblbuildingtax").vw.getTop())+(views.get("lblbuildingtax").vw.getHeight())));
views.get("lbladdress").vw.setTop((int)((views.get("lblfcnowner").vw.getTop())));
views.get("address").vw.setTop((int)((views.get("lbladdress").vw.getTop())+(views.get("lbladdress").vw.getHeight())));
views.get("lblelectric").vw.setTop((int)((views.get("lblfcnowner").vw.getTop())));
views.get("electricity").vw.setTop((int)((views.get("lblelectric").vw.getTop())+(views.get("lblelectric").vw.getHeight())));
views.get("lblcons").vw.setTop((int)((views.get("lblfcnowner").vw.getTop())));
views.get("construction").vw.setTop((int)((views.get("lblcons").vw.getTop())+(views.get("lblcons").vw.getHeight())));
views.get("panel4").vw.setLeft((int)((4d / 100 * width)));
views.get("panel4").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
views.get("paneltypeoffice").vw.setHeight((int)((views.get("fcnowner").vw.getTop())+(views.get("fcnowner").vw.getHeight())));
views.get("panel2").vw.setHeight((int)((views.get("standingyear").vw.getTop())+(views.get("standingyear").vw.getHeight())));
views.get("panel3").vw.setHeight((int)((views.get("address").vw.getTop())+(views.get("address").vw.getHeight())));
views.get("panelelectricity").vw.setHeight((int)((views.get("construction").vw.getTop())+(views.get("construction").vw.getHeight())));
views.get("lblfcnowner").vw.setLeft((int)((0d / 100 * width)));
views.get("lblfcnowner").vw.setWidth((int)((84d / 100 * width) - ((0d / 100 * width))));
views.get("fcnowner").vw.setLeft((int)((0d / 100 * width)));
views.get("fcnowner").vw.setWidth((int)((84d / 100 * width) - ((0d / 100 * width))));
views.get("lblstandingyear").vw.setLeft((int)((0d / 100 * width)));
views.get("lblstandingyear").vw.setWidth((int)((42d / 100 * width) - ((0d / 100 * width))));
views.get("standingyear").vw.setLeft((int)((0d / 100 * width)));
views.get("standingyear").vw.setWidth((int)((42d / 100 * width) - ((0d / 100 * width))));
views.get("lblbuildingtax").vw.setLeft((int)((42d / 100 * width)));
views.get("lblbuildingtax").vw.setWidth((int)((84d / 100 * width) - ((42d / 100 * width))));
views.get("buildingtax").vw.setLeft((int)((42d / 100 * width)));
views.get("buildingtax").vw.setWidth((int)((84d / 100 * width) - ((42d / 100 * width))));
views.get("lbladdress").vw.setLeft((int)((0d / 100 * width)));
views.get("lbladdress").vw.setWidth((int)((84d / 100 * width) - ((0d / 100 * width))));
views.get("address").vw.setLeft((int)((0d / 100 * width)));
views.get("address").vw.setWidth((int)((84d / 100 * width) - ((0d / 100 * width))));
views.get("lblelectric").vw.setLeft((int)((0d / 100 * width)));
views.get("lblelectric").vw.setWidth((int)((42d / 100 * width) - ((0d / 100 * width))));
views.get("electricity").vw.setLeft((int)((0d / 100 * width)));
views.get("electricity").vw.setWidth((int)((42d / 100 * width) - ((0d / 100 * width))));
views.get("lblcons").vw.setLeft((int)((42d / 100 * width)));
views.get("lblcons").vw.setWidth((int)((84d / 100 * width) - ((42d / 100 * width))));
views.get("construction").vw.setLeft((int)((42d / 100 * width)));
views.get("construction").vw.setWidth((int)((84d / 100 * width) - ((42d / 100 * width))));
views.get("label2").vw.setLeft((int)((4d / 100 * width)));
views.get("label2").vw.setWidth((int)((88d / 100 * width) - ((4d / 100 * width))));
views.get("paneltypeoffice").vw.setLeft((int)((4d / 100 * width)));
views.get("paneltypeoffice").vw.setWidth((int)((88d / 100 * width) - ((4d / 100 * width))));
views.get("panel2").vw.setLeft((int)((4d / 100 * width)));
views.get("panel2").vw.setWidth((int)((88d / 100 * width) - ((4d / 100 * width))));
views.get("panel3").vw.setLeft((int)((4d / 100 * width)));
views.get("panel3").vw.setWidth((int)((88d / 100 * width) - ((4d / 100 * width))));
views.get("panelelectricity").vw.setLeft((int)((4d / 100 * width)));
views.get("panelelectricity").vw.setWidth((int)((88d / 100 * width) - ((4d / 100 * width))));
views.get("panel4").vw.setTop((int)((2d / 100 * height)));
views.get("label2").vw.setTop((int)((2d / 100 * height)));
views.get("paneltypeoffice").vw.setTop((int)((views.get("label2").vw.getTop())+(views.get("label2").vw.getHeight())+(2d / 100 * height)));
views.get("panel2").vw.setTop((int)((views.get("paneltypeoffice").vw.getTop())+(views.get("paneltypeoffice").vw.getHeight())+(2d / 100 * height)));
views.get("panel3").vw.setTop((int)((views.get("panel2").vw.getTop())+(views.get("panel2").vw.getHeight())+(2d / 100 * height)));
views.get("panelelectricity").vw.setTop((int)((views.get("panel3").vw.getTop())+(views.get("panel3").vw.getHeight())+(2d / 100 * height)));
views.get("panel4").vw.setHeight((int)((views.get("panelelectricity").vw.getTop())+(views.get("panelelectricity").vw.getHeight())+(4d / 100 * height)));

}
}