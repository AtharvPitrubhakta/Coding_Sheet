/* Program to create applet window.


import java.applet.*;
import java.awt.*;

public class DemoApplet extends Applet
{
	public void init()
	{
		//initialization 
	}
	public void paint(Graphics g)
	{
		g.drawString(" Hello Applet ",50,100);
	}	
}
/*
<applet code="DemoApplet.class" height=400 width=300></applet>
*/