package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_worshipedit{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelbuildinglist").vw.setWidth((int)((100d / 100 * width)));
views.get("label1").vw.setHeight((int)((8d / 100 * height)));
views.get("label1").vw.setTop((int)((2d / 100 * height)));
views.get("label1").vw.setLeft((int)((5d / 100 * width)));
views.get("label1").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("worshiplabel").vw.setHeight((int)((5d / 100 * height)));
views.get("worshiplabel").vw.setTop((int)((views.get("label1").vw.getTop())+(views.get("label1").vw.getHeight())+(2d / 100 * height)));
views.get("worshiplabel").vw.setLeft((int)((5d / 100 * width)));
views.get("worshiplabel").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("panel1").vw.setHeight((int)((7d / 100 * height)));
views.get("panel1").vw.setLeft((int)((5d / 100 * width)));
views.get("panel1").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("panel1").vw.setTop((int)((views.get("worshiplabel").vw.getTop())+(views.get("worshiplabel").vw.getHeight())));
views.get("worshipname").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("worshipname").vw.setLeft((int)((0d / 100 * width)));
views.get("worshipname").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
views.get("worshipname").vw.setTop((int)((0d / 100 * height)));
views.get("lbltypeofworship").vw.setHeight((int)((views.get("worshiplabel").vw.getHeight())));
views.get("lbltypeofworship").vw.setLeft((int)((5d / 100 * width)));
views.get("lbltypeofworship").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("lbltypeofworship").vw.setTop((int)((views.get("panel1").vw.getTop())+(views.get("panel1").vw.getHeight())+(2d / 100 * height)));
views.get("paneltypeworship").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("paneltypeworship").vw.setTop((int)((views.get("lbltypeofworship").vw.getTop())+(views.get("lbltypeofworship").vw.getHeight())));
views.get("paneltypeworship").vw.setLeft((int)((5d / 100 * width)));
views.get("paneltypeworship").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("typeofworship").vw.setHeight((int)((views.get("paneltypeworship").vw.getHeight())));
views.get("typeofworship").vw.setTop((int)((views.get("worshipname").vw.getTop())));
views.get("typeofworship").vw.setLeft((int)((0d / 100 * width)));
views.get("typeofworship").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
views.get("lblstandingyear").vw.setHeight((int)((views.get("lbltypeofworship").vw.getHeight())));
views.get("lblstandingyear").vw.setTop((int)((views.get("paneltypeworship").vw.getTop())+(views.get("paneltypeworship").vw.getHeight())+(2d / 100 * height)));
views.get("lblstandingyear").vw.setLeft((int)((5d / 100 * width)));
views.get("lblstandingyear").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("panel2").vw.setHeight((int)((views.get("paneltypeworship").vw.getHeight())));
views.get("panel2").vw.setTop((int)((views.get("lblstandingyear").vw.getTop())+(views.get("lblstandingyear").vw.getHeight())));
views.get("panel2").vw.setLeft((int)((5d / 100 * width)));
views.get("panel2").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("lblbuildingarea").vw.setTop((int)((views.get("panel2").vw.getTop())+(views.get("panel2").vw.getHeight())+(2d / 100 * height)));
views.get("lblbuildingarea").vw.setHeight((int)((views.get("lblstandingyear").vw.getHeight())));
views.get("lblbuildingarea").vw.setLeft((int)((5d / 100 * width)));
views.get("lblbuildingarea").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("standingyear").vw.setHeight((int)((views.get("panel2").vw.getHeight())));
views.get("standingyear").vw.setTop((int)((views.get("typeofworship").vw.getTop())));
views.get("standingyear").vw.setLeft((int)((0d / 100 * width)));
views.get("standingyear").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
views.get("panel4").vw.setTop((int)((views.get("lblbuildingarea").vw.getTop())+(views.get("lblbuildingarea").vw.getHeight())));
views.get("panel4").vw.setHeight((int)((views.get("panel2").vw.getHeight())));
views.get("panel4").vw.setLeft((int)((5d / 100 * width)));
views.get("panel4").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("buildingarea").vw.setLeft((int)((0d / 100 * width)));
views.get("buildingarea").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
views.get("buildingarea").vw.setTop((int)((views.get("standingyear").vw.getTop())));
views.get("buildingarea").vw.setHeight((int)((views.get("panel4").vw.getHeight())));
views.get("lbllandarea").vw.setHeight((int)((views.get("lblbuildingarea").vw.getHeight())));
views.get("lbllandarea").vw.setTop((int)((views.get("panel4").vw.getTop())+(views.get("panel4").vw.getHeight())+(2d / 100 * height)));
views.get("lbllandarea").vw.setLeft((int)((5d / 100 * width)));
views.get("lbllandarea").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("panel3").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("panel3").vw.setTop((int)((views.get("lbllandarea").vw.getTop())+(views.get("lbllandarea").vw.getHeight())));
views.get("panel3").vw.setLeft((int)((5d / 100 * width)));
views.get("panel3").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("landarea").vw.setHeight((int)((views.get("panel3").vw.getHeight())));
views.get("landarea").vw.setTop((int)((views.get("buildingarea").vw.getTop())));
views.get("landarea").vw.setLeft((int)((0d / 100 * width)));
views.get("landarea").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
views.get("lblparkingarea").vw.setHeight((int)((views.get("lblbuildingarea").vw.getHeight())));
views.get("lblparkingarea").vw.setTop((int)((views.get("panel3").vw.getTop())+(views.get("panel3").vw.getHeight())+(2d / 100 * height)));
views.get("lblparkingarea").vw.setLeft((int)((5d / 100 * width)));
views.get("lblparkingarea").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("panel5").vw.setHeight((int)((views.get("panel3").vw.getHeight())));
views.get("panel5").vw.setTop((int)((views.get("lblparkingarea").vw.getTop())+(views.get("lblparkingarea").vw.getHeight())));
views.get("panel5").vw.setLeft((int)((5d / 100 * width)));
views.get("panel5").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("parkingarea").vw.setHeight((int)((views.get("panel5").vw.getHeight())));
views.get("parkingarea").vw.setTop((int)((views.get("landarea").vw.getTop())));
views.get("parkingarea").vw.setLeft((int)((0d / 100 * width)));
views.get("parkingarea").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
views.get("lblelectric").vw.setTop((int)((views.get("panel5").vw.getTop())+(views.get("panel5").vw.getHeight())+(2d / 100 * height)));
views.get("lblelectric").vw.setHeight((int)((views.get("lblparkingarea").vw.getHeight())));
views.get("lblelectric").vw.setLeft((int)((5d / 100 * width)));
views.get("lblelectric").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("panelelectricity").vw.setTop((int)((views.get("lblelectric").vw.getTop())+(views.get("lblelectric").vw.getHeight())));
views.get("panelelectricity").vw.setLeft((int)((5d / 100 * width)));
views.get("panelelectricity").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("panelelectricity").vw.setHeight((int)((views.get("panel5").vw.getHeight())));
views.get("electricity").vw.setTop((int)((views.get("parkingarea").vw.getTop())));
views.get("electricity").vw.setHeight((int)((views.get("panelelectricity").vw.getHeight())));
views.get("electricity").vw.setLeft((int)((0d / 100 * width)));
views.get("electricity").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
views.get("lblcons").vw.setTop((int)((views.get("panelelectricity").vw.getTop())+(views.get("panelelectricity").vw.getHeight())+(2d / 100 * height)));
views.get("lblcons").vw.setHeight((int)((views.get("lblelectric").vw.getHeight())));
views.get("lblcons").vw.setLeft((int)((5d / 100 * width)));
views.get("lblcons").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("panel6").vw.setTop((int)((views.get("lblcons").vw.getTop())+(views.get("lblcons").vw.getHeight())));
views.get("panel6").vw.setLeft((int)((5d / 100 * width)));
views.get("panel6").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("panel6").vw.setHeight((int)((views.get("panelelectricity").vw.getHeight())));
views.get("construction").vw.setHeight((int)((views.get("panel6").vw.getHeight())));
views.get("construction").vw.setTop((int)((views.get("electricity").vw.getTop())));
views.get("construction").vw.setLeft((int)((0d / 100 * width)));
views.get("construction").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
views.get("btnsavechanges").vw.setTop((int)((views.get("panel6").vw.getTop())+(views.get("panel6").vw.getHeight())+(5d / 100 * height)));
views.get("btnsavechanges").vw.setHeight((int)((8d / 100 * height)));
views.get("btnsavechanges").vw.setLeft((int)((5d / 100 * width)));
views.get("btnsavechanges").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("panelbuildinglist").vw.setHeight((int)((views.get("btnsavechanges").vw.getTop())+(views.get("btnsavechanges").vw.getHeight())+(3d / 100 * height)));
views.get("pfacility").vw.setTop((int)((views.get("btnsavechanges").vw.getTop())+(views.get("btnsavechanges").vw.getHeight())+(2d / 100 * height)));

}
}