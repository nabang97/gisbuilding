package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_educational_tabdetail{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("lbltypeofeducation").vw.setHeight((int)((6d / 100 * height)));
views.get("typeofeducation").vw.setHeight((int)((6d / 100 * height)));
views.get("lblschoollevel").vw.setHeight((int)((views.get("lbltypeofeducation").vw.getHeight())));
views.get("schoollevel").vw.setHeight((int)((views.get("typeofeducation").vw.getHeight())));
views.get("lblheadmaster").vw.setHeight((int)((views.get("lbltypeofeducation").vw.getHeight())));
views.get("headmaster").vw.setHeight((int)((views.get("typeofeducation").vw.getHeight())));
views.get("lblteacher").vw.setHeight((int)((views.get("lbltypeofeducation").vw.getHeight())));
views.get("numteacher").vw.setHeight((int)((views.get("typeofeducation").vw.getHeight())));
views.get("lblstudent").vw.setHeight((int)((views.get("lbltypeofeducation").vw.getHeight())));
views.get("numstudent").vw.setHeight((int)((views.get("typeofeducation").vw.getHeight())));
views.get("lblstandingyear").vw.setHeight((int)((views.get("lbltypeofeducation").vw.getHeight())));
views.get("standingyear").vw.setHeight((int)((views.get("typeofeducation").vw.getHeight())));
views.get("lblbuildingarea").vw.setHeight((int)((views.get("lbltypeofeducation").vw.getHeight())));
views.get("buildingarea").vw.setHeight((int)((views.get("typeofeducation").vw.getHeight())));
views.get("lbllandarea").vw.setHeight((int)((views.get("lbltypeofeducation").vw.getHeight())));
views.get("landarea").vw.setHeight((int)((views.get("typeofeducation").vw.getHeight())));
views.get("lblparkingarea").vw.setHeight((int)((views.get("lbltypeofeducation").vw.getHeight())));
views.get("parkingarea").vw.setHeight((int)((views.get("typeofeducation").vw.getHeight())));
views.get("lblelectric").vw.setHeight((int)((views.get("lbltypeofeducation").vw.getHeight())));
views.get("electricity").vw.setHeight((int)((views.get("typeofeducation").vw.getHeight())));
views.get("lblcons").vw.setHeight((int)((views.get("lbltypeofeducation").vw.getHeight())));
views.get("construction").vw.setHeight((int)((views.get("typeofeducation").vw.getHeight())));
views.get("lblfacility").vw.setHeight((int)((views.get("lbltypeofeducation").vw.getHeight())));
views.get("label2").vw.setHeight((int)((8d / 100 * height)));
views.get("lbltypeofeducation").vw.setTop((int)((0d / 100 * height)));
views.get("typeofeducation").vw.setTop((int)((views.get("lbltypeofeducation").vw.getTop())+(views.get("lbltypeofeducation").vw.getHeight())));
//BA.debugLineNum = 29;BA.debugLine="LblSchoolLevel.Top=LblTypeOfEducation.Top"[Educational_tabDetail/General script]
views.get("lblschoollevel").vw.setTop((int)((views.get("lbltypeofeducation").vw.getTop())));
//BA.debugLineNum = 30;BA.debugLine="SchoolLevel.Top=LblSchoolLevel.Top + LblSchoolLevel.Height"[Educational_tabDetail/General script]
views.get("schoollevel").vw.setTop((int)((views.get("lblschoollevel").vw.getTop())+(views.get("lblschoollevel").vw.getHeight())));
//BA.debugLineNum = 31;BA.debugLine="LblHeadmaster.Top=LblTypeOfEducation.Top"[Educational_tabDetail/General script]
views.get("lblheadmaster").vw.setTop((int)((views.get("lbltypeofeducation").vw.getTop())));
//BA.debugLineNum = 32;BA.debugLine="Headmaster.Top=LblHeadmaster.Top + LblHeadmaster.Height"[Educational_tabDetail/General script]
views.get("headmaster").vw.setTop((int)((views.get("lblheadmaster").vw.getTop())+(views.get("lblheadmaster").vw.getHeight())));
//BA.debugLineNum = 33;BA.debugLine="LblTeacher.Top=LblTypeOfEducation.Top"[Educational_tabDetail/General script]
views.get("lblteacher").vw.setTop((int)((views.get("lbltypeofeducation").vw.getTop())));
//BA.debugLineNum = 34;BA.debugLine="NumTeacher.Top=LblTeacher.Top + LblTeacher.Height"[Educational_tabDetail/General script]
views.get("numteacher").vw.setTop((int)((views.get("lblteacher").vw.getTop())+(views.get("lblteacher").vw.getHeight())));
//BA.debugLineNum = 35;BA.debugLine="LblStudent.Top=LblTypeOfEducation.Top"[Educational_tabDetail/General script]
views.get("lblstudent").vw.setTop((int)((views.get("lbltypeofeducation").vw.getTop())));
//BA.debugLineNum = 36;BA.debugLine="NumStudent.Top=LblStudent.Top + LblStudent.Height"[Educational_tabDetail/General script]
views.get("numstudent").vw.setTop((int)((views.get("lblstudent").vw.getTop())+(views.get("lblstudent").vw.getHeight())));
//BA.debugLineNum = 37;BA.debugLine="LblStandingYear.Top=LblTypeOfEducation.Top"[Educational_tabDetail/General script]
views.get("lblstandingyear").vw.setTop((int)((views.get("lbltypeofeducation").vw.getTop())));
//BA.debugLineNum = 38;BA.debugLine="StandingYear.Top=LblStandingYear.Top + LblStandingYear.Height"[Educational_tabDetail/General script]
views.get("standingyear").vw.setTop((int)((views.get("lblstandingyear").vw.getTop())+(views.get("lblstandingyear").vw.getHeight())));
//BA.debugLineNum = 39;BA.debugLine="LblBuildingArea.Top=LblTypeOfEducation.Top"[Educational_tabDetail/General script]
views.get("lblbuildingarea").vw.setTop((int)((views.get("lbltypeofeducation").vw.getTop())));
//BA.debugLineNum = 40;BA.debugLine="BuildingArea.Top=LblBuildingArea.Top + LblBuildingArea.Height"[Educational_tabDetail/General script]
views.get("buildingarea").vw.setTop((int)((views.get("lblbuildingarea").vw.getTop())+(views.get("lblbuildingarea").vw.getHeight())));
//BA.debugLineNum = 41;BA.debugLine="LblLandArea.Top=LblTypeOfEducation.Top"[Educational_tabDetail/General script]
views.get("lbllandarea").vw.setTop((int)((views.get("lbltypeofeducation").vw.getTop())));
//BA.debugLineNum = 42;BA.debugLine="LandArea.Top=LblLandArea.Top + LblLandArea.Height"[Educational_tabDetail/General script]
views.get("landarea").vw.setTop((int)((views.get("lbllandarea").vw.getTop())+(views.get("lbllandarea").vw.getHeight())));
//BA.debugLineNum = 43;BA.debugLine="LblParkingArea.Top=LblTypeOfEducation.Top"[Educational_tabDetail/General script]
views.get("lblparkingarea").vw.setTop((int)((views.get("lbltypeofeducation").vw.getTop())));
//BA.debugLineNum = 44;BA.debugLine="ParkingArea.Top=LblParkingArea.Top + LblParkingArea.Height"[Educational_tabDetail/General script]
views.get("parkingarea").vw.setTop((int)((views.get("lblparkingarea").vw.getTop())+(views.get("lblparkingarea").vw.getHeight())));
//BA.debugLineNum = 45;BA.debugLine="LblElectric.Top=LblTypeOfEducation.Top"[Educational_tabDetail/General script]
views.get("lblelectric").vw.setTop((int)((views.get("lbltypeofeducation").vw.getTop())));
//BA.debugLineNum = 46;BA.debugLine="Electricity.Top=LblElectric.Top + LblElectric.Height"[Educational_tabDetail/General script]
views.get("electricity").vw.setTop((int)((views.get("lblelectric").vw.getTop())+(views.get("lblelectric").vw.getHeight())));
//BA.debugLineNum = 47;BA.debugLine="LblCons.Top=LblTypeOfEducation.Top"[Educational_tabDetail/General script]
views.get("lblcons").vw.setTop((int)((views.get("lbltypeofeducation").vw.getTop())));
//BA.debugLineNum = 48;BA.debugLine="Construction.Top=LblCons.Top + LblCons.Height"[Educational_tabDetail/General script]
views.get("construction").vw.setTop((int)((views.get("lblcons").vw.getTop())+(views.get("lblcons").vw.getHeight())));
//BA.debugLineNum = 49;BA.debugLine="LblFacility.Top=2%y"[Educational_tabDetail/General script]
views.get("lblfacility").vw.setTop((int)((2d / 100 * height)));
//BA.debugLineNum = 50;BA.debugLine="CLV1.Top=LblFacility.Top + LblFacility.Height"[Educational_tabDetail/General script]
views.get("clv1").vw.setTop((int)((views.get("lblfacility").vw.getTop())+(views.get("lblfacility").vw.getHeight())));
//BA.debugLineNum = 52;BA.debugLine="PanelTypeEducation.Height=TypeOfEducation.Top + TypeOfEducation.Height"[Educational_tabDetail/General script]
views.get("paneltypeeducation").vw.setHeight((int)((views.get("typeofeducation").vw.getTop())+(views.get("typeofeducation").vw.getHeight())));
//BA.debugLineNum = 53;BA.debugLine="PnlHead.Height = Headmaster.Top + Headmaster.Height"[Educational_tabDetail/General script]
views.get("pnlhead").vw.setHeight((int)((views.get("headmaster").vw.getTop())+(views.get("headmaster").vw.getHeight())));
//BA.debugLineNum = 54;BA.debugLine="PnlTcs.Height = PanelTypeEducation.Height"[Educational_tabDetail/General script]
views.get("pnltcs").vw.setHeight((int)((views.get("paneltypeeducation").vw.getHeight())));
//BA.debugLineNum = 55;BA.debugLine="Panel2.Height=PanelTypeEducation.Height"[Educational_tabDetail/General script]
views.get("panel2").vw.setHeight((int)((views.get("paneltypeeducation").vw.getHeight())));
//BA.debugLineNum = 56;BA.debugLine="Panel3.Height=PanelTypeEducation.Height"[Educational_tabDetail/General script]
views.get("panel3").vw.setHeight((int)((views.get("paneltypeeducation").vw.getHeight())));
//BA.debugLineNum = 57;BA.debugLine="PanelElectricity.Height=PanelTypeEducation.Height"[Educational_tabDetail/General script]
views.get("panelelectricity").vw.setHeight((int)((views.get("paneltypeeducation").vw.getHeight())));
//BA.debugLineNum = 58;BA.debugLine="PFacility.height=CLV1.Top + CLV1.Height"[Educational_tabDetail/General script]
views.get("pfacility").vw.setHeight((int)((views.get("clv1").vw.getTop())+(views.get("clv1").vw.getHeight())));
//BA.debugLineNum = 60;BA.debugLine="Panel4.SetLeftAndRight(4%x,96%x)"[Educational_tabDetail/General script]
views.get("panel4").vw.setLeft((int)((4d / 100 * width)));
views.get("panel4").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 61;BA.debugLine="Label2.Top = 2%y"[Educational_tabDetail/General script]
views.get("label2").vw.setTop((int)((2d / 100 * height)));
//BA.debugLineNum = 62;BA.debugLine="PanelTypeEducation.Top=Label2.Top + Label2.Height + 2%y"[Educational_tabDetail/General script]
views.get("paneltypeeducation").vw.setTop((int)((views.get("label2").vw.getTop())+(views.get("label2").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 63;BA.debugLine="PnlHead.Top=PanelTypeEducation.Top + PanelTypeEducation.Height + 2%y"[Educational_tabDetail/General script]
views.get("pnlhead").vw.setTop((int)((views.get("paneltypeeducation").vw.getTop())+(views.get("paneltypeeducation").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 64;BA.debugLine="PnlTcs.Top = PnlHead.Top + PnlHead.Height + 2%y"[Educational_tabDetail/General script]
views.get("pnltcs").vw.setTop((int)((views.get("pnlhead").vw.getTop())+(views.get("pnlhead").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 65;BA.debugLine="Panel2.Top=PnlTcs.Top + PnlTcs.Height + 2%y"[Educational_tabDetail/General script]
views.get("panel2").vw.setTop((int)((views.get("pnltcs").vw.getTop())+(views.get("pnltcs").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 66;BA.debugLine="Panel3.Top=Panel2.Top + Panel2.Height + 2%y"[Educational_tabDetail/General script]
views.get("panel3").vw.setTop((int)((views.get("panel2").vw.getTop())+(views.get("panel2").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 67;BA.debugLine="PanelElectricity.Top=Panel3.Top + Panel3.Height + 2%y"[Educational_tabDetail/General script]
views.get("panelelectricity").vw.setTop((int)((views.get("panel3").vw.getTop())+(views.get("panel3").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 68;BA.debugLine="Panel4.Height = PanelElectricity.Top+PanelElectricity.Height+2%y"[Educational_tabDetail/General script]
views.get("panel4").vw.setHeight((int)((views.get("panelelectricity").vw.getTop())+(views.get("panelelectricity").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 69;BA.debugLine="PFacility.Top=Panel4.Top + Panel4.Height + 2%y"[Educational_tabDetail/General script]
views.get("pfacility").vw.setTop((int)((views.get("panel4").vw.getTop())+(views.get("panel4").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 71;BA.debugLine="Label2.SetLeftAndRight(4%x,88%x)"[Educational_tabDetail/General script]
views.get("label2").vw.setLeft((int)((4d / 100 * width)));
views.get("label2").vw.setWidth((int)((88d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 72;BA.debugLine="LblTypeOfEducation.SetLeftAndRight(0%x,42%x)"[Educational_tabDetail/General script]
views.get("lbltypeofeducation").vw.setLeft((int)((0d / 100 * width)));
views.get("lbltypeofeducation").vw.setWidth((int)((42d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 73;BA.debugLine="TypeOfEducation.SetLeftAndRight(0%x,42%x)"[Educational_tabDetail/General script]
views.get("typeofeducation").vw.setLeft((int)((0d / 100 * width)));
views.get("typeofeducation").vw.setWidth((int)((42d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 74;BA.debugLine="LblSchoolLevel.SetLeftAndRight(42%x,84%x)"[Educational_tabDetail/General script]
views.get("lblschoollevel").vw.setLeft((int)((42d / 100 * width)));
views.get("lblschoollevel").vw.setWidth((int)((84d / 100 * width) - ((42d / 100 * width))));
//BA.debugLineNum = 75;BA.debugLine="SchoolLevel.SetLeftAndRight(42%x,84%x)"[Educational_tabDetail/General script]
views.get("schoollevel").vw.setLeft((int)((42d / 100 * width)));
views.get("schoollevel").vw.setWidth((int)((84d / 100 * width) - ((42d / 100 * width))));
//BA.debugLineNum = 76;BA.debugLine="LblHeadmaster.SetLeftAndRight(0%x,84%x)"[Educational_tabDetail/General script]
views.get("lblheadmaster").vw.setLeft((int)((0d / 100 * width)));
views.get("lblheadmaster").vw.setWidth((int)((84d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 77;BA.debugLine="Headmaster.SetLeftAndRight(0%x,84%x)"[Educational_tabDetail/General script]
views.get("headmaster").vw.setLeft((int)((0d / 100 * width)));
views.get("headmaster").vw.setWidth((int)((84d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 78;BA.debugLine="LblTeacher.SetLeftAndRight(0%x,42%x)"[Educational_tabDetail/General script]
views.get("lblteacher").vw.setLeft((int)((0d / 100 * width)));
views.get("lblteacher").vw.setWidth((int)((42d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 79;BA.debugLine="NumTeacher.SetLeftAndRight(0%x,42%x)"[Educational_tabDetail/General script]
views.get("numteacher").vw.setLeft((int)((0d / 100 * width)));
views.get("numteacher").vw.setWidth((int)((42d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 80;BA.debugLine="LblStudent.SetLeftAndRight(42%x,84%x)"[Educational_tabDetail/General script]
views.get("lblstudent").vw.setLeft((int)((42d / 100 * width)));
views.get("lblstudent").vw.setWidth((int)((84d / 100 * width) - ((42d / 100 * width))));
//BA.debugLineNum = 81;BA.debugLine="NumStudent.SetLeftAndRight(42%x,84%x)"[Educational_tabDetail/General script]
views.get("numstudent").vw.setLeft((int)((42d / 100 * width)));
views.get("numstudent").vw.setWidth((int)((84d / 100 * width) - ((42d / 100 * width))));
//BA.debugLineNum = 82;BA.debugLine="LblStandingYear.SetLeftAndRight(0%x,42%x)"[Educational_tabDetail/General script]
views.get("lblstandingyear").vw.setLeft((int)((0d / 100 * width)));
views.get("lblstandingyear").vw.setWidth((int)((42d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 83;BA.debugLine="StandingYear.SetLeftAndRight(0%x,42%x)"[Educational_tabDetail/General script]
views.get("standingyear").vw.setLeft((int)((0d / 100 * width)));
views.get("standingyear").vw.setWidth((int)((42d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 84;BA.debugLine="LblBuildingArea.SetLeftAndRight(42%x,84%x)"[Educational_tabDetail/General script]
views.get("lblbuildingarea").vw.setLeft((int)((42d / 100 * width)));
views.get("lblbuildingarea").vw.setWidth((int)((84d / 100 * width) - ((42d / 100 * width))));
//BA.debugLineNum = 85;BA.debugLine="BuildingArea.SetLeftAndRight(42%x,84%x)"[Educational_tabDetail/General script]
views.get("buildingarea").vw.setLeft((int)((42d / 100 * width)));
views.get("buildingarea").vw.setWidth((int)((84d / 100 * width) - ((42d / 100 * width))));
//BA.debugLineNum = 86;BA.debugLine="LblLandArea.SetLeftAndRight(0%x,42%x)"[Educational_tabDetail/General script]
views.get("lbllandarea").vw.setLeft((int)((0d / 100 * width)));
views.get("lbllandarea").vw.setWidth((int)((42d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 87;BA.debugLine="LandArea.SetLeftAndRight(0%x,42%x)"[Educational_tabDetail/General script]
views.get("landarea").vw.setLeft((int)((0d / 100 * width)));
views.get("landarea").vw.setWidth((int)((42d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 88;BA.debugLine="LblParkingArea.SetLeftAndRight(42%x,84%x)"[Educational_tabDetail/General script]
views.get("lblparkingarea").vw.setLeft((int)((42d / 100 * width)));
views.get("lblparkingarea").vw.setWidth((int)((84d / 100 * width) - ((42d / 100 * width))));
//BA.debugLineNum = 89;BA.debugLine="ParkingArea.SetLeftAndRight(42%x,84%x)"[Educational_tabDetail/General script]
views.get("parkingarea").vw.setLeft((int)((42d / 100 * width)));
views.get("parkingarea").vw.setWidth((int)((84d / 100 * width) - ((42d / 100 * width))));
//BA.debugLineNum = 90;BA.debugLine="LblElectric.SetLeftAndRight(0%x,42%x)"[Educational_tabDetail/General script]
views.get("lblelectric").vw.setLeft((int)((0d / 100 * width)));
views.get("lblelectric").vw.setWidth((int)((42d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 91;BA.debugLine="Electricity.SetLeftAndRight(0%x,42%x)"[Educational_tabDetail/General script]
views.get("electricity").vw.setLeft((int)((0d / 100 * width)));
views.get("electricity").vw.setWidth((int)((42d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 92;BA.debugLine="LblCons.SetLeftAndRight(42%x,84%x)"[Educational_tabDetail/General script]
views.get("lblcons").vw.setLeft((int)((42d / 100 * width)));
views.get("lblcons").vw.setWidth((int)((84d / 100 * width) - ((42d / 100 * width))));
//BA.debugLineNum = 93;BA.debugLine="Construction.SetLeftAndRight(42%x,84%x)"[Educational_tabDetail/General script]
views.get("construction").vw.setLeft((int)((42d / 100 * width)));
views.get("construction").vw.setWidth((int)((84d / 100 * width) - ((42d / 100 * width))));
//BA.debugLineNum = 94;BA.debugLine="LblFacility.SetLeftAndRight(4%x,88%x)"[Educational_tabDetail/General script]
views.get("lblfacility").vw.setLeft((int)((4d / 100 * width)));
views.get("lblfacility").vw.setWidth((int)((88d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 95;BA.debugLine="CLV1.SetLeftAndRight(4%x,88%x)"[Educational_tabDetail/General script]
views.get("clv1").vw.setLeft((int)((4d / 100 * width)));
views.get("clv1").vw.setWidth((int)((88d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 97;BA.debugLine="PanelTypeEducation.SetLeftAndRight(4%x,88%x)"[Educational_tabDetail/General script]
views.get("paneltypeeducation").vw.setLeft((int)((4d / 100 * width)));
views.get("paneltypeeducation").vw.setWidth((int)((88d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 98;BA.debugLine="PnlHead.SetLeftAndRight(4%x,88%x)"[Educational_tabDetail/General script]
views.get("pnlhead").vw.setLeft((int)((4d / 100 * width)));
views.get("pnlhead").vw.setWidth((int)((88d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 99;BA.debugLine="PnlTcs.SetLeftAndRight(4%x,88%x)"[Educational_tabDetail/General script]
views.get("pnltcs").vw.setLeft((int)((4d / 100 * width)));
views.get("pnltcs").vw.setWidth((int)((88d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 100;BA.debugLine="Panel2.SetLeftAndRight(4%x,88%x)"[Educational_tabDetail/General script]
views.get("panel2").vw.setLeft((int)((4d / 100 * width)));
views.get("panel2").vw.setWidth((int)((88d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 101;BA.debugLine="Panel3.SetLeftAndRight(4%x,88%x)"[Educational_tabDetail/General script]
views.get("panel3").vw.setLeft((int)((4d / 100 * width)));
views.get("panel3").vw.setWidth((int)((88d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 102;BA.debugLine="PanelElectricity.SetLeftAndRight(4%x,88%x)"[Educational_tabDetail/General script]
views.get("panelelectricity").vw.setLeft((int)((4d / 100 * width)));
views.get("panelelectricity").vw.setWidth((int)((88d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 103;BA.debugLine="PFacility.SetLeftAndRight(4%x,96%x)"[Educational_tabDetail/General script]
views.get("pfacility").vw.setLeft((int)((4d / 100 * width)));
views.get("pfacility").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 105;BA.debugLine="editBtn.SetLeftAndRight(80%x,94%x)"[Educational_tabDetail/General script]
views.get("editbtn").vw.setLeft((int)((80d / 100 * width)));
views.get("editbtn").vw.setWidth((int)((94d / 100 * width) - ((80d / 100 * width))));
//BA.debugLineNum = 106;BA.debugLine="editBtn.Height= 10%y"[Educational_tabDetail/General script]
views.get("editbtn").vw.setHeight((int)((10d / 100 * height)));
//BA.debugLineNum = 107;BA.debugLine="editBtn.Top = Panel4.Top + Label2.Top"[Educational_tabDetail/General script]
views.get("editbtn").vw.setTop((int)((views.get("panel4").vw.getTop())+(views.get("label2").vw.getTop())));
//BA.debugLineNum = 108;BA.debugLine="editFacility.Top = 0%y"[Educational_tabDetail/General script]
views.get("editfacility").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 109;BA.debugLine="editFacility.Height=editBtn.Height"[Educational_tabDetail/General script]
views.get("editfacility").vw.setHeight((int)((views.get("editbtn").vw.getHeight())));
//BA.debugLineNum = 110;BA.debugLine="editFacility.SetLeftAndRight(78%x,92%x)"[Educational_tabDetail/General script]
views.get("editfacility").vw.setLeft((int)((78d / 100 * width)));
views.get("editfacility").vw.setWidth((int)((92d / 100 * width) - ((78d / 100 * width))));

}
}