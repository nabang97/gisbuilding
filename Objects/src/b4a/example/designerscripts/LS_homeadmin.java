package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_homeadmin{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelbackground").vw.setWidth((int)((100d / 100 * width)));
views.get("panelbackground").vw.setHeight((int)((100d / 100 * height)));
views.get("panel1").vw.setHeight((int)((20d / 100 * height)));
views.get("label1").vw.setLeft((int)((0d / 100 * width)));
views.get("label1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panel1").vw.setLeft((int)((0d / 100 * width)));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panel2").vw.setLeft((int)((5d / 100 * width)));
views.get("panel2").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("label2").vw.setLeft((int)((5d / 100 * width)));
views.get("label2").vw.setWidth((int)((85d / 100 * width) - ((5d / 100 * width))));
views.get("label16").vw.setLeft((int)((5d / 100 * width)));
views.get("label16").vw.setWidth((int)((85d / 100 * width) - ((5d / 100 * width))));
views.get("housep").vw.setLeft((int)((5d / 100 * width)));
views.get("housep").vw.setWidth((int)((31d / 100 * width) - ((5d / 100 * width))));
views.get("worshipp").vw.setLeft((int)((32d / 100 * width)));
views.get("worshipp").vw.setWidth((int)((58d / 100 * width) - ((32d / 100 * width))));
views.get("officep").vw.setLeft((int)((59d / 100 * width)));
views.get("officep").vw.setWidth((int)((85d / 100 * width) - ((59d / 100 * width))));
views.get("label3").vw.setLeft((int)((5d / 100 * width)));
views.get("label3").vw.setWidth((int)((31d / 100 * width) - ((5d / 100 * width))));
views.get("label4").vw.setLeft((int)((32d / 100 * width)));
views.get("label4").vw.setWidth((int)((58d / 100 * width) - ((32d / 100 * width))));
views.get("label5").vw.setLeft((int)((59d / 100 * width)));
views.get("label5").vw.setWidth((int)((85d / 100 * width) - ((59d / 100 * width))));
views.get("schoolp").vw.setLeft((int)((5d / 100 * width)));
views.get("schoolp").vw.setWidth((int)((31d / 100 * width) - ((5d / 100 * width))));
views.get("msmep").vw.setLeft((int)((32d / 100 * width)));
views.get("msmep").vw.setWidth((int)((58d / 100 * width) - ((32d / 100 * width))));
views.get("healthp").vw.setLeft((int)((59d / 100 * width)));
views.get("healthp").vw.setWidth((int)((85d / 100 * width) - ((59d / 100 * width))));
views.get("label6").vw.setLeft((int)((5d / 100 * width)));
views.get("label6").vw.setWidth((int)((31d / 100 * width) - ((5d / 100 * width))));
views.get("label7").vw.setLeft((int)((32d / 100 * width)));
views.get("label7").vw.setWidth((int)((58d / 100 * width) - ((32d / 100 * width))));
views.get("label8").vw.setLeft((int)((59d / 100 * width)));
views.get("label8").vw.setWidth((int)((85d / 100 * width) - ((59d / 100 * width))));
views.get("label1").vw.setHeight((int)((5d / 100 * height)));
views.get("label2").vw.setHeight((int)((5d / 100 * height)));
views.get("housep").vw.setHeight((int)((8d / 100 * height)));
views.get("worshipp").vw.setHeight((int)((views.get("housep").vw.getHeight())));
views.get("officep").vw.setHeight((int)((views.get("housep").vw.getHeight())));
views.get("schoolp").vw.setHeight((int)((views.get("housep").vw.getHeight())));
views.get("msmep").vw.setHeight((int)((views.get("housep").vw.getHeight())));
views.get("healthp").vw.setHeight((int)((views.get("housep").vw.getHeight())));
views.get("label1").vw.setTop((int)((2d / 100 * height)));
views.get("panel1").vw.setTop((int)(0-(1.5d / 100 * height)));
views.get("panel2").vw.setTop((int)((2d / 100 * height)+(views.get("label1").vw.getHeight())+(views.get("label1").vw.getTop())));
views.get("label2").vw.setTop((int)((5d / 100 * width)));
views.get("housep").vw.setTop((int)((views.get("label2").vw.getTop())+(views.get("label2").vw.getHeight())+(1d / 100 * height)));
views.get("worshipp").vw.setTop((int)((views.get("housep").vw.getTop())));
views.get("officep").vw.setTop((int)((views.get("worshipp").vw.getTop())));
views.get("label3").vw.setTop((int)((views.get("housep").vw.getTop())+(views.get("housep").vw.getHeight())+(0.2d / 100 * height)));
views.get("label4").vw.setTop((int)((views.get("label3").vw.getTop())));
views.get("label5").vw.setTop((int)((views.get("label3").vw.getTop())));
views.get("schoolp").vw.setTop((int)((views.get("label3").vw.getTop())+(views.get("label3").vw.getHeight())+(1d / 100 * height)));
views.get("msmep").vw.setTop((int)((views.get("schoolp").vw.getTop())));
views.get("healthp").vw.setTop((int)((views.get("schoolp").vw.getTop())));
views.get("label6").vw.setTop((int)((views.get("schoolp").vw.getTop())+(views.get("schoolp").vw.getHeight())+(0.2d / 100 * height)));
views.get("label7").vw.setTop((int)((views.get("label6").vw.getTop())));
views.get("label8").vw.setTop((int)((views.get("label6").vw.getTop())));
views.get("imageview1").vw.setLeft((int)((1d / 100 * height)));
views.get("imageview1").vw.setWidth((int)((5d / 100 * height) - ((1d / 100 * height))));
views.get("imageview2").vw.setLeft((int)((1d / 100 * height)));
views.get("imageview2").vw.setWidth((int)((5d / 100 * height) - ((1d / 100 * height))));
views.get("imageview3").vw.setLeft((int)((1d / 100 * height)));
views.get("imageview3").vw.setWidth((int)((5d / 100 * height) - ((1d / 100 * height))));
views.get("imageview4").vw.setLeft((int)((1d / 100 * height)));
views.get("imageview4").vw.setWidth((int)((5d / 100 * height) - ((1d / 100 * height))));
views.get("imageview5").vw.setLeft((int)((1d / 100 * height)));
views.get("imageview5").vw.setWidth((int)((5d / 100 * height) - ((1d / 100 * height))));
views.get("imageview6").vw.setLeft((int)((1d / 100 * height)));
views.get("imageview6").vw.setWidth((int)((5d / 100 * height) - ((1d / 100 * height))));
views.get("label9").vw.setLeft((int)((1d / 100 * height)));
views.get("label9").vw.setWidth((int)((18d / 100 * height) - ((1d / 100 * height))));
views.get("label10").vw.setLeft((int)((1d / 100 * height)));
views.get("label10").vw.setWidth((int)((18d / 100 * height) - ((1d / 100 * height))));
views.get("label11").vw.setLeft((int)((1d / 100 * height)));
views.get("label11").vw.setWidth((int)((18d / 100 * height) - ((1d / 100 * height))));
views.get("label12").vw.setLeft((int)((1d / 100 * height)));
views.get("label12").vw.setWidth((int)((18d / 100 * height) - ((1d / 100 * height))));
views.get("label13").vw.setLeft((int)((1d / 100 * height)));
views.get("label13").vw.setWidth((int)((18d / 100 * height) - ((1d / 100 * height))));
views.get("label14").vw.setLeft((int)((1d / 100 * height)));
views.get("label14").vw.setWidth((int)((18d / 100 * height) - ((1d / 100 * height))));
views.get("imageview1").vw.setHeight((int)((4d / 100 * height)));
views.get("imageview2").vw.setHeight((int)((views.get("imageview1").vw.getHeight())));
views.get("imageview3").vw.setHeight((int)((views.get("imageview1").vw.getHeight())));
views.get("imageview4").vw.setHeight((int)((views.get("imageview1").vw.getHeight())));
views.get("imageview5").vw.setHeight((int)((views.get("imageview1").vw.getHeight())));
views.get("imageview6").vw.setHeight((int)((views.get("imageview1").vw.getHeight())));
views.get("label9").vw.setHeight((int)((views.get("housep").vw.getHeight())));
views.get("label10").vw.setHeight((int)((views.get("housep").vw.getHeight())));
views.get("label11").vw.setHeight((int)((views.get("housep").vw.getHeight())));
views.get("label12").vw.setHeight((int)((views.get("housep").vw.getHeight())));
views.get("label13").vw.setHeight((int)((views.get("housep").vw.getHeight())));
views.get("label14").vw.setHeight((int)((views.get("housep").vw.getHeight())));
views.get("imageview1").vw.setTop((int)((2d / 100 * height)));
views.get("imageview2").vw.setTop((int)((views.get("imageview1").vw.getTop())));
views.get("imageview3").vw.setTop((int)((views.get("imageview1").vw.getTop())));
views.get("imageview4").vw.setTop((int)((views.get("imageview1").vw.getTop())));
views.get("imageview5").vw.setTop((int)((views.get("imageview1").vw.getTop())));
views.get("imageview6").vw.setTop((int)((views.get("imageview1").vw.getTop())));
views.get("label9").vw.setTop((int)((0d / 100 * height)));
views.get("label10").vw.setTop((int)((0d / 100 * height)));
views.get("label11").vw.setTop((int)((0d / 100 * height)));
views.get("label12").vw.setTop((int)((0d / 100 * height)));
views.get("label13").vw.setTop((int)((0d / 100 * height)));
views.get("label14").vw.setTop((int)((0d / 100 * height)));
views.get("label16").vw.setTop((int)((views.get("label6").vw.getTop())+(views.get("label6").vw.getHeight())+(10d / 100 * width)));
views.get("label16").vw.setHeight((int)((views.get("label2").vw.getHeight())));
views.get("button1").vw.setLeft((int)((12d / 100 * width)));
views.get("button1").vw.setWidth((int)((14d / 100 * width)));
views.get("button1").vw.setHeight((int)((views.get("button1").vw.getWidth())));
views.get("button1").vw.setTop((int)((views.get("label16").vw.getTop())+(views.get("label16").vw.getHeight())+(5d / 100 * width)));
views.get("button2").vw.setWidth((int)((views.get("button1").vw.getWidth())));
views.get("button2").vw.setLeft((int)(((views.get("panel2").vw.getWidth())/2d)-((views.get("button2").vw.getWidth())/2d)));
views.get("button2").vw.setHeight((int)((views.get("button1").vw.getWidth())));
views.get("button2").vw.setTop((int)((views.get("label16").vw.getTop())+(views.get("label16").vw.getHeight())+(5d / 100 * width)));
views.get("button3").vw.setWidth((int)((views.get("button1").vw.getWidth())));
views.get("button3").vw.setLeft((int)((views.get("button2").vw.getLeft())+(views.get("button2").vw.getWidth())+(views.get("button1").vw.getLeft())));
views.get("button3").vw.setHeight((int)((views.get("button1").vw.getWidth())));
views.get("button3").vw.setTop((int)((views.get("label16").vw.getTop())+(views.get("label16").vw.getHeight())+(5d / 100 * width)));
views.get("button4").vw.setLeft((int)((views.get("button1").vw.getLeft())));
views.get("button4").vw.setWidth((int)((views.get("button1").vw.getWidth())));
views.get("button4").vw.setHeight((int)((views.get("button1").vw.getWidth())));
views.get("button4").vw.setTop((int)((views.get("button1").vw.getTop())+(views.get("button1").vw.getHeight())+(5d / 100 * width)));
views.get("button5").vw.setWidth((int)((views.get("button1").vw.getWidth())));
views.get("button5").vw.setLeft((int)(((views.get("panel2").vw.getWidth())/2d)-((views.get("button2").vw.getWidth())/2d)));
views.get("button5").vw.setHeight((int)((views.get("button1").vw.getWidth())));
views.get("button5").vw.setTop((int)((views.get("button1").vw.getTop())+(views.get("button1").vw.getHeight())+(5d / 100 * width)));
views.get("panel2").vw.setHeight((int)((views.get("button5").vw.getHeight())+(views.get("button5").vw.getTop())+(10d / 100 * width)));
views.get("label15").vw.setLeft((int)((5d / 100 * width)));
views.get("label15").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("label15").vw.setTop((int)((views.get("panel2").vw.getTop())+(views.get("panel2").vw.getHeight())+(2d / 100 * height)));
views.get("horizontalscrollview1").vw.setLeft((int)((5d / 100 * width)));
views.get("horizontalscrollview1").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("horizontalscrollview1").vw.setHeight((int)((50d / 100 * height)));
views.get("horizontalscrollview1").vw.setTop((int)((views.get("label15").vw.getTop())+(views.get("label15").vw.getHeight())));

}
}