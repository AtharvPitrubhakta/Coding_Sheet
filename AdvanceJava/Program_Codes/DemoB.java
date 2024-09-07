/*
Write a program to create three buttons with caption OK, RESET, and CANCEL.
*/

import java.applet.*;
import java.awt.*;

public class DemoB extends Applet
{
	Button b1,b2,b3;
		
	public void init()
	{
		setLayout(null);
	
		b1 = new Button("OK");
		b2 = new Button("RESET");
		b3 = new Button("CANCEL");
	
		add(b1);
		add(b2);	
		add(b3);
	
		b1.setBounds(50, 50, 40, 30);	
		b2.setBounds(120, 50, 60, 30);
		b3.setBounds(210, 50, 60, 30);	
	}
}
/*
<applet code="DemoB.java" width=400 height=300></applet>
*/