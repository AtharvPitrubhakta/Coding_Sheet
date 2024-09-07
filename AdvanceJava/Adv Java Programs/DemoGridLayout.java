// Develop a program to demonstrate the use of GirdLayout.

import java.applet.*;
import java.awt.*;

public class DemoGridLayout extends Applet
{
	Button b1, b2, b3, b4, b5;
	
	public void init()
	{
		setLayout(new GridLayout(3,2,10,10));

		Button b1=new Button("First");
		Button b2=new Button("Second");
		Button b3=new Button("Third");	
		Button b4=new Button("Fourth");
		Button b5=new Button("Fifth");

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
	}
}
/*
<applet code="DemoGridLayout.class" width=400 height=400></applet>
*/