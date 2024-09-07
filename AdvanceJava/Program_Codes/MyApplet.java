// Title = Program to create applet window.

import java.applet.*;
import java.awt.*;

public class MyApplet extends Applet
{
	public void init()
	{
		// Intialization	
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello Applet", 50 , 100);
	}
	
}
/*
<applet code = "MyApplet.class" width=400 height=300></applet>
*/
