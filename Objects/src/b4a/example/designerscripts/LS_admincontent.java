package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_admincontent{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panel2").vw.setWidth((int)((40d / 100 * width)-(5d / 100 * width)));
views.get("panel3").vw.setWidth((int)((views.get("panel2").vw.getWidth())+(5d / 100 * width)));
views.get("panel4").vw.setWidth((int)((views.get("panel2").vw.getWidth())+(5d / 100 * width)));
views.get("panel5").vw.setWidth((int)((views.get("panel2").vw.getWidth())+(5d / 100 * width)));
views.get("panel6").vw.setWidth((int)((views.get("panel2").vw.getWidth())+(5d / 100 * width)));
views.get("panel2").vw.setLeft((int)((10d / 100 * height)-(10d / 100 * height)));
views.get("panel3").vw.setLeft((int)((views.get("panel2").vw.getLeft())+(views.get("panel2").vw.getWidth())+(10d / 100 * height)));
views.get("panel4").vw.setLeft((int)((views.get("panel3").vw.getLeft())+(views.get("panel3").vw.getWidth())+(10d / 100 * height)));
views.get("panel5").vw.setLeft((int)((views.get("panel4").vw.getLeft())+(views.get("panel4").vw.getWidth())+(10d / 100 * height)));
views.get("panel6").vw.setLeft((int)((views.get("panel5").vw.getLeft())+(views.get("panel5").vw.getWidth())+(10d / 100 * height)));
views.get("contentadmin").vw.setWidth((int)((views.get("panel6").vw.getLeft())+(views.get("panel6").vw.getWidth())+(5d / 100 * height)));
views.get("contentadmin").vw.setTop((int)((0d / 100 * height)));
views.get("contentadmin").vw.setHeight((int)((100d / 100 * height)));
views.get("panel2").vw.setHeight((int)((views.get("contentadmin").vw.getHeight())));
views.get("panel3").vw.setHeight((int)((views.get("contentadmin").vw.getHeight())));
views.get("panel4").vw.setHeight((int)((views.get("contentadmin").vw.getHeight())));
views.get("panel5").vw.setHeight((int)((views.get("contentadmin").vw.getHeight())));
views.get("panel6").vw.setHeight((int)((views.get("contentadmin").vw.getHeight())));
views.get("worshipbtn").vw.setTop((int)((0d / 100 * height)));
views.get("worshipbtn").vw.setHeight((int)((100d / 100 * height)));
views.get("worshipbtn").vw.setLeft((int)((0d / 100 * width)));
views.get("worshipbtn").vw.setWidth((int)((35d / 100 * width) - ((0d / 100 * width))));
views.get("officebtn").vw.setTop((int)((0d / 100 * height)));
views.get("officebtn").vw.setHeight((int)((100d / 100 * height)));
views.get("officebtn").vw.setLeft((int)((5d / 100 * width)));
views.get("officebtn").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));
views.get("healthbtn").vw.setTop((int)((0d / 100 * height)));
views.get("healthbtn").vw.setHeight((int)((100d / 100 * height)));
//BA.debugLineNum = 33;BA.debugLine="HealthBtn.SetLeftAndRight(5%x,40%x)"[AdminContent/General script]
views.get("healthbtn").vw.setLeft((int)((5d / 100 * width)));
views.get("healthbtn").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 35;BA.debugLine="EducationBtn.Top=0%y"[AdminContent/General script]
views.get("educationbtn").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 36;BA.debugLine="EducationBtn.Height=100%y"[AdminContent/General script]
views.get("educationbtn").vw.setHeight((int)((100d / 100 * height)));
//BA.debugLineNum = 37;BA.debugLine="EducationBtn.SetLeftAndRight(5%x,40%x)"[AdminContent/General script]
views.get("educationbtn").vw.setLeft((int)((5d / 100 * width)));
views.get("educationbtn").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 39;BA.debugLine="MsmeBtn.Top=0%y"[AdminContent/General script]
views.get("msmebtn").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 40;BA.debugLine="MsmeBtn.Height=100%y"[AdminContent/General script]
views.get("msmebtn").vw.setHeight((int)((100d / 100 * height)));
//BA.debugLineNum = 41;BA.debugLine="MsmeBtn.SetLeftAndRight(5%x,40%x)"[AdminContent/General script]
views.get("msmebtn").vw.setLeft((int)((5d / 100 * width)));
views.get("msmebtn").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));

}
}