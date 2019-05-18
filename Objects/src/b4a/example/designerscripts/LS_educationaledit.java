package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_educationaledit{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelbuildinglist").vw.setWidth((int)((100d / 100 * width)));
views.get("label1").vw.setHeight((int)((8d / 100 * height)));
views.get("label1").vw.setTop((int)((2d / 100 * height)));
views.get("label1").vw.setLeft((int)((5d / 100 * width)));
views.get("label1").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("educationlabel").vw.setHeight((int)((5d / 100 * height)));
views.get("educationlabel").vw.setTop((int)((views.get("label1").vw.getTop())+(views.get("label1").vw.getHeight())+(2d / 100 * height)));
views.get("educationlabel").vw.setLeft((int)((5d / 100 * width)));
views.get("educationlabel").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("panel1").vw.setHeight((int)((7d / 100 * height)));
views.get("panel1").vw.setLeft((int)((5d / 100 * width)));
views.get("panel1").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("panel1").vw.setTop((int)((views.get("educationlabel").vw.getTop())+(views.get("educationlabel").vw.getHeight())));
views.get("educationname").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("educationname").vw.setLeft((int)((0d / 100 * width)));
views.get("educationname").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
views.get("educationname").vw.setTop((int)((0d / 100 * height)));
views.get("lbltypeofeducation").vw.setHeight((int)((views.get("educationlabel").vw.getHeight())));
views.get("lbltypeofeducation").vw.setLeft((int)((5d / 100 * width)));
views.get("lbltypeofeducation").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("lbltypeofeducation").vw.setTop((int)((views.get("panel1").vw.getTop())+(views.get("panel1").vw.getHeight())+(2d / 100 * height)));
views.get("paneltypeeducation").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("paneltypeeducation").vw.setTop((int)((views.get("lbltypeofeducation").vw.getTop())+(views.get("lbltypeofeducation").vw.getHeight())));
views.get("paneltypeeducation").vw.setLeft((int)((5d / 100 * width)));
views.get("paneltypeeducation").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("typeofeducation").vw.setHeight((int)((views.get("paneltypeeducation").vw.getHeight())));
views.get("typeofeducation").vw.setTop((int)((views.get("educationname").vw.getTop())));
views.get("typeofeducation").vw.setLeft((int)((0d / 100 * width)));
views.get("typeofeducation").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
views.get("lblschoollevel").vw.setHeight((int)((views.get("lbltypeofeducation").vw.getHeight())));
views.get("lblschoollevel").vw.setLeft((int)((5d / 100 * width)));
views.get("lblschoollevel").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("lblschoollevel").vw.setTop((int)((views.get("paneltypeeducation").vw.getTop())+(views.get("paneltypeeducation").vw.getHeight())+(2d / 100 * height)));
views.get("panel8").vw.setHeight((int)((views.get("paneltypeeducation").vw.getHeight())));
views.get("panel8").vw.setTop((int)((views.get("lblschoollevel").vw.getTop())+(views.get("lblschoollevel").vw.getHeight())));
views.get("panel8").vw.setLeft((int)((5d / 100 * width)));
views.get("panel8").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("schoollevel").vw.setHeight((int)((views.get("typeofeducation").vw.getHeight())));
views.get("schoollevel").vw.setTop((int)((views.get("typeofeducation").vw.getTop())));
views.get("schoollevel").vw.setLeft((int)((0d / 100 * width)));
views.get("schoollevel").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
views.get("lblheadmaster").vw.setHeight((int)((views.get("lbltypeofeducation").vw.getHeight())));
views.get("lblheadmaster").vw.setLeft((int)((5d / 100 * width)));
views.get("lblheadmaster").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("lblheadmaster").vw.setTop((int)((views.get("panel8").vw.getTop())+(views.get("panel8").vw.getHeight())+(2d / 100 * height)));
views.get("pnlhead").vw.setHeight((int)((views.get("panel8").vw.getHeight())));
views.get("pnlhead").vw.setTop((int)((views.get("lblheadmaster").vw.getTop())+(views.get("lblheadmaster").vw.getHeight())));
views.get("pnlhead").vw.setLeft((int)((5d / 100 * width)));
views.get("pnlhead").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("headmaster").vw.setHeight((int)((views.get("schoollevel").vw.getHeight())));
views.get("headmaster").vw.setTop((int)((views.get("schoollevel").vw.getTop())));
views.get("headmaster").vw.setLeft((int)((0d / 100 * width)));
views.get("headmaster").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
views.get("lblteacher").vw.setHeight((int)((views.get("lblheadmaster").vw.getHeight())));
views.get("lblteacher").vw.setLeft((int)((5d / 100 * width)));
views.get("lblteacher").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("lblteacher").vw.setTop((int)((views.get("pnlhead").vw.getTop())+(views.get("pnlhead").vw.getHeight())+(2d / 100 * height)));
views.get("pnltcs").vw.setHeight((int)((views.get("pnlhead").vw.getHeight())));
views.get("pnltcs").vw.setTop((int)((views.get("lblteacher").vw.getTop())+(views.get("lblteacher").vw.getHeight())));
views.get("pnltcs").vw.setLeft((int)((5d / 100 * width)));
views.get("pnltcs").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("numteacher").vw.setHeight((int)((views.get("headmaster").vw.getHeight())));
views.get("numteacher").vw.setTop((int)((views.get("headmaster").vw.getTop())));
views.get("numteacher").vw.setLeft((int)((0d / 100 * width)));
views.get("numteacher").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
views.get("lblstudent").vw.setHeight((int)((views.get("lblteacher").vw.getHeight())));
views.get("lblstudent").vw.setLeft((int)((5d / 100 * width)));
views.get("lblstudent").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("lblstudent").vw.setTop((int)((views.get("pnltcs").vw.getTop())+(views.get("pnltcs").vw.getHeight())+(2d / 100 * height)));
views.get("panel4").vw.setHeight((int)((views.get("pnltcs").vw.getHeight())));
views.get("panel4").vw.setTop((int)((views.get("lblstudent").vw.getTop())+(views.get("lblstudent").vw.getHeight())));
views.get("panel4").vw.setLeft((int)((5d / 100 * width)));
views.get("panel4").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("numstudent").vw.setHeight((int)((views.get("numteacher").vw.getHeight())));
views.get("numstudent").vw.setTop((int)((views.get("numteacher").vw.getTop())));
views.get("numstudent").vw.setLeft((int)((0d / 100 * width)));
views.get("numstudent").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
views.get("lblstandingyear").vw.setHeight((int)((views.get("lblstudent").vw.getHeight())));
views.get("lblstandingyear").vw.setLeft((int)((5d / 100 * width)));
views.get("lblstandingyear").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("lblstandingyear").vw.setTop((int)((views.get("panel4").vw.getTop())+(views.get("panel4").vw.getHeight())+(2d / 100 * height)));
views.get("panel2").vw.setHeight((int)((views.get("panel4").vw.getHeight())));
views.get("panel2").vw.setTop((int)((views.get("lblstandingyear").vw.getTop())+(views.get("lblstandingyear").vw.getHeight())));
views.get("panel2").vw.setLeft((int)((5d / 100 * width)));
views.get("panel2").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("standingyear").vw.setHeight((int)((views.get("numstudent").vw.getHeight())));
views.get("standingyear").vw.setTop((int)((views.get("numstudent").vw.getTop())));
views.get("standingyear").vw.setLeft((int)((0d / 100 * width)));
views.get("standingyear").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
views.get("lblbuildingarea").vw.setTop((int)((views.get("panel2").vw.getTop())+(views.get("panel2").vw.getHeight())+(2d / 100 * height)));
views.get("lblbuildingarea").vw.setHeight((int)((views.get("lblstandingyear").vw.getHeight())));
views.get("lblbuildingarea").vw.setLeft((int)((5d / 100 * width)));
views.get("lblbuildingarea").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("panel5").vw.setTop((int)((views.get("lblbuildingarea").vw.getTop())+(views.get("lblbuildingarea").vw.getHeight())));
views.get("panel5").vw.setHeight((int)((views.get("panel2").vw.getHeight())));
views.get("panel5").vw.setLeft((int)((5d / 100 * width)));
views.get("panel5").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("buildingarea").vw.setLeft((int)((0d / 100 * width)));
views.get("buildingarea").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
views.get("buildingarea").vw.setTop((int)((views.get("standingyear").vw.getTop())));
views.get("buildingarea").vw.setHeight((int)((views.get("standingyear").vw.getHeight())));
views.get("lbllandarea").vw.setHeight((int)((views.get("lblbuildingarea").vw.getHeight())));
views.get("lbllandarea").vw.setTop((int)((views.get("panel5").vw.getTop())+(views.get("panel5").vw.getHeight())+(2d / 100 * height)));
views.get("lbllandarea").vw.setLeft((int)((5d / 100 * width)));
views.get("lbllandarea").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("panel3").vw.setHeight((int)((views.get("panel5").vw.getHeight())));
views.get("panel3").vw.setTop((int)((views.get("lbllandarea").vw.getTop())+(views.get("lbllandarea").vw.getHeight())));
views.get("panel3").vw.setLeft((int)((5d / 100 * width)));
views.get("panel3").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("landarea").vw.setHeight((int)((views.get("buildingarea").vw.getHeight())));
views.get("landarea").vw.setTop((int)((views.get("buildingarea").vw.getTop())));
views.get("landarea").vw.setLeft((int)((0d / 100 * width)));
views.get("landarea").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
views.get("lblparkingarea").vw.setHeight((int)((views.get("lblbuildingarea").vw.getHeight())));
views.get("lblparkingarea").vw.setTop((int)((views.get("panel3").vw.getTop())+(views.get("panel3").vw.getHeight())+(2d / 100 * height)));
views.get("lblparkingarea").vw.setLeft((int)((5d / 100 * width)));
views.get("lblparkingarea").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("panel6").vw.setHeight((int)((views.get("panel3").vw.getHeight())));
views.get("panel6").vw.setTop((int)((views.get("lblparkingarea").vw.getTop())+(views.get("lblparkingarea").vw.getHeight())));
views.get("panel6").vw.setLeft((int)((5d / 100 * width)));
views.get("panel6").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("parkingarea").vw.setHeight((int)((views.get("panel6").vw.getHeight())));
views.get("parkingarea").vw.setTop((int)((views.get("landarea").vw.getTop())));
views.get("parkingarea").vw.setLeft((int)((0d / 100 * width)));
views.get("parkingarea").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
views.get("lblelectric").vw.setTop((int)((views.get("panel6").vw.getTop())+(views.get("panel6").vw.getHeight())+(2d / 100 * height)));
views.get("lblelectric").vw.setHeight((int)((views.get("lblparkingarea").vw.getHeight())));
views.get("lblelectric").vw.setLeft((int)((5d / 100 * width)));
views.get("lblelectric").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("panelelectricity").vw.setTop((int)((views.get("lblelectric").vw.getTop())+(views.get("lblelectric").vw.getHeight())));
views.get("panelelectricity").vw.setLeft((int)((5d / 100 * width)));
views.get("panelelectricity").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("panelelectricity").vw.setHeight((int)((views.get("panel6").vw.getHeight())));
views.get("electricity").vw.setTop((int)((views.get("parkingarea").vw.getTop())));
views.get("electricity").vw.setHeight((int)((views.get("panelelectricity").vw.getHeight())));
//BA.debugLineNum = 140;BA.debugLine="Electricity.SetLeftAndRight(0%x,90%x)"[EducationalEdit/General script]
views.get("electricity").vw.setLeft((int)((0d / 100 * width)));
views.get("electricity").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 142;BA.debugLine="LblCons.Top=PanelElectricity.Top+PanelElectricity.Height +2%y"[EducationalEdit/General script]
views.get("lblcons").vw.setTop((int)((views.get("panelelectricity").vw.getTop())+(views.get("panelelectricity").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 143;BA.debugLine="LblCons.Height=LblElectric.Height"[EducationalEdit/General script]
views.get("lblcons").vw.setHeight((int)((views.get("lblelectric").vw.getHeight())));
//BA.debugLineNum = 144;BA.debugLine="LblCons.SetLeftAndRight(5%x,95%x)"[EducationalEdit/General script]
views.get("lblcons").vw.setLeft((int)((5d / 100 * width)));
views.get("lblcons").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 146;BA.debugLine="Panel7.Top=LblCons.Top+LblCons.Height"[EducationalEdit/General script]
views.get("panel7").vw.setTop((int)((views.get("lblcons").vw.getTop())+(views.get("lblcons").vw.getHeight())));
//BA.debugLineNum = 147;BA.debugLine="Panel7.SetLeftAndRight(5%x,95%x)"[EducationalEdit/General script]
views.get("panel7").vw.setLeft((int)((5d / 100 * width)));
views.get("panel7").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 148;BA.debugLine="Panel7.Height=PanelElectricity.Height"[EducationalEdit/General script]
views.get("panel7").vw.setHeight((int)((views.get("panelelectricity").vw.getHeight())));
//BA.debugLineNum = 150;BA.debugLine="Construction.Height=Panel7.Height"[EducationalEdit/General script]
views.get("construction").vw.setHeight((int)((views.get("panel7").vw.getHeight())));
//BA.debugLineNum = 151;BA.debugLine="Construction.Top=Electricity.Top"[EducationalEdit/General script]
views.get("construction").vw.setTop((int)((views.get("electricity").vw.getTop())));
//BA.debugLineNum = 152;BA.debugLine="Construction.SetLeftAndRight(0%x,90%x)"[EducationalEdit/General script]
views.get("construction").vw.setLeft((int)((0d / 100 * width)));
views.get("construction").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 154;BA.debugLine="BtnSaveChanges.Top = Panel7.Top+Panel7.Height + 5%y"[EducationalEdit/General script]
views.get("btnsavechanges").vw.setTop((int)((views.get("panel7").vw.getTop())+(views.get("panel7").vw.getHeight())+(5d / 100 * height)));
//BA.debugLineNum = 155;BA.debugLine="BtnSaveChanges.Height = 8%y"[EducationalEdit/General script]
views.get("btnsavechanges").vw.setHeight((int)((8d / 100 * height)));
//BA.debugLineNum = 156;BA.debugLine="BtnSaveChanges.SetLeftAndRight(5%x,95%x)"[EducationalEdit/General script]
views.get("btnsavechanges").vw.setLeft((int)((5d / 100 * width)));
views.get("btnsavechanges").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));

}
}