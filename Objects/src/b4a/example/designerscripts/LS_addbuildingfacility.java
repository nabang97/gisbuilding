package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_addbuildingfacility{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelbuildinglist").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 3;BA.debugLine="LabelKet.Height=10%y"[AddBuildingFacility/General script]
views.get("labelket").vw.setHeight((int)((10d / 100 * height)));
//BA.debugLineNum = 4;BA.debugLine="LabelKet.Top=2%y"[AddBuildingFacility/General script]
views.get("labelket").vw.setTop((int)((2d / 100 * height)));
//BA.debugLineNum = 6;BA.debugLine="lblNameFacility.Top=3%y"[AddBuildingFacility/General script]
views.get("lblnamefacility").vw.setTop((int)((3d / 100 * height)));
//BA.debugLineNum = 7;BA.debugLine="lblNameFacility.Height=5%y"[AddBuildingFacility/General script]
views.get("lblnamefacility").vw.setHeight((int)((5d / 100 * height)));
//BA.debugLineNum = 8;BA.debugLine="lblNameFacility.SetLeftAndRight(5%x,95%x)"[AddBuildingFacility/General script]
views.get("lblnamefacility").vw.setLeft((int)((5d / 100 * width)));
views.get("lblnamefacility").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 10;BA.debugLine="SpinNameFacility.Height=8%y"[AddBuildingFacility/General script]
views.get("spinnamefacility").vw.setHeight((int)((8d / 100 * height)));
//BA.debugLineNum = 11;BA.debugLine="SpinNameFacility.Top=0%y"[AddBuildingFacility/General script]
views.get("spinnamefacility").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 12;BA.debugLine="SpinNameFacility.SetLeftAndRight(0%x,90%x)"[AddBuildingFacility/General script]
views.get("spinnamefacility").vw.setLeft((int)((0d / 100 * width)));
views.get("spinnamefacility").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 14;BA.debugLine="PanelSpinnerFacility.Top=lblNameFacility.Top+lblNameFacility.Height"[AddBuildingFacility/General script]
views.get("panelspinnerfacility").vw.setTop((int)((views.get("lblnamefacility").vw.getTop())+(views.get("lblnamefacility").vw.getHeight())));
//BA.debugLineNum = 15;BA.debugLine="PanelSpinnerFacility.SetLeftAndRight(5%x,95%x)"[AddBuildingFacility/General script]
views.get("panelspinnerfacility").vw.setLeft((int)((5d / 100 * width)));
views.get("panelspinnerfacility").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 16;BA.debugLine="PanelSpinnerFacility.Height=SpinNameFacility.Height"[AddBuildingFacility/General script]
views.get("panelspinnerfacility").vw.setHeight((int)((views.get("spinnamefacility").vw.getHeight())));
//BA.debugLineNum = 18;BA.debugLine="LblQuantity.Height=lblNameFacility.Height"[AddBuildingFacility/General script]
views.get("lblquantity").vw.setHeight((int)((views.get("lblnamefacility").vw.getHeight())));
//BA.debugLineNum = 19;BA.debugLine="LblQuantity.Top=PanelSpinnerFacility.Top+PanelSpinnerFacility.Height+2%y"[AddBuildingFacility/General script]
views.get("lblquantity").vw.setTop((int)((views.get("panelspinnerfacility").vw.getTop())+(views.get("panelspinnerfacility").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 20;BA.debugLine="LblQuantity.SetLeftAndRight(5%x,95%x)"[AddBuildingFacility/General script]
views.get("lblquantity").vw.setLeft((int)((5d / 100 * width)));
views.get("lblquantity").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 22;BA.debugLine="editQuantity.Height=SpinNameFacility.Height"[AddBuildingFacility/General script]
views.get("editquantity").vw.setHeight((int)((views.get("spinnamefacility").vw.getHeight())));
//BA.debugLineNum = 23;BA.debugLine="editQuantity.Top=SpinNameFacility.Top"[AddBuildingFacility/General script]
views.get("editquantity").vw.setTop((int)((views.get("spinnamefacility").vw.getTop())));
//BA.debugLineNum = 24;BA.debugLine="editQuantity.SetLeftAndRight(0%x,90%x)"[AddBuildingFacility/General script]
views.get("editquantity").vw.setLeft((int)((0d / 100 * width)));
views.get("editquantity").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 26;BA.debugLine="PanelEditQuanity.Top=LblQuantity.Top+LblQuantity.Height"[AddBuildingFacility/General script]
views.get("paneleditquanity").vw.setTop((int)((views.get("lblquantity").vw.getTop())+(views.get("lblquantity").vw.getHeight())));
//BA.debugLineNum = 27;BA.debugLine="PanelEditQuanity.SetLeftAndRight(5%x,95%x)"[AddBuildingFacility/General script]
views.get("paneleditquanity").vw.setLeft((int)((5d / 100 * width)));
views.get("paneleditquanity").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 28;BA.debugLine="PanelEditQuanity.Height=editQuantity.Height"[AddBuildingFacility/General script]
views.get("paneleditquanity").vw.setHeight((int)((views.get("editquantity").vw.getHeight())));
//BA.debugLineNum = 30;BA.debugLine="PanelEditFacility.SetLeftAndRight(0%x,100%x)"[AddBuildingFacility/General script]
views.get("paneleditfacility").vw.setLeft((int)((0d / 100 * width)));
views.get("paneleditfacility").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 31;BA.debugLine="PanelEditFacility.Top=LabelKet.Height+LabelKet.Top +2%y"[AddBuildingFacility/General script]
views.get("paneleditfacility").vw.setTop((int)((views.get("labelket").vw.getHeight())+(views.get("labelket").vw.getTop())+(2d / 100 * height)));
//BA.debugLineNum = 32;BA.debugLine="PanelEditFacility.Height=PanelEditQuanity.Top+PanelEditQuanity.Height +3%y"[AddBuildingFacility/General script]
views.get("paneleditfacility").vw.setHeight((int)((views.get("paneleditquanity").vw.getTop())+(views.get("paneleditquanity").vw.getHeight())+(3d / 100 * height)));
//BA.debugLineNum = 34;BA.debugLine="btnAddFacility.Height=8%y"[AddBuildingFacility/General script]
views.get("btnaddfacility").vw.setHeight((int)((8d / 100 * height)));
//BA.debugLineNum = 35;BA.debugLine="btnAddFacility.SetLeftAndRight(5%x,95%x)"[AddBuildingFacility/General script]
views.get("btnaddfacility").vw.setLeft((int)((5d / 100 * width)));
views.get("btnaddfacility").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 36;BA.debugLine="btnAddFacility.Top=PanelEditFacility.Top+PanelEditFacility.Height+3%y"[AddBuildingFacility/General script]
views.get("btnaddfacility").vw.setTop((int)((views.get("paneleditfacility").vw.getTop())+(views.get("paneleditfacility").vw.getHeight())+(3d / 100 * height)));

}
}