// Title = Design an applet / application to demonstrate use of scrollbar.

import java.applet.*;
import java.awt.*;

public class DemoScrollbar extends Applet
{
	Scrollbar sb1,sb2,sb3;

	public void init()	
	{
		setLayout(null);
		
		sb1 = new Scrollbar(Scrollbar.HORIZONTAL, 10, 30, 0, 255);
		sb2 = new Scrollbar(Scrollbar.HORIZONTAL, 90, 30, 0, 255);
		sb3 = new Scrollbar(Scrollbar.HORIZONTAL, 180, 30, 0, 255);
	
		add(sb1);
		add(sb2);
		add(sb3);
		
		sb1.setBounds(50, 30, 150, 30);
		sb2.setBounds(50, 80, 150, 30);
		sb3.setBounds(50, 130, 150, 30);
		
	}
}
/*
<applet code="DemoScrollbar.class" width=400 height=400></applet>
*/