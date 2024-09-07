/* 
1] Develop a program to demonstrate use of Grid Layout.
*/

import java.applet.*;
import java.awt.*;

public class DemoGridLayout extends Applet
{
	Button b1, b2, b3, b4, b5; //b6
	
	public void init()
	{
		GridLayout g=new GridLayout(3, 2, 30, 50);
		setLayout(g);

		b1 = new Button("First");
		b2 = new Button("Second");
		b3 = new Button("Third");
		b4 = new Button("Fourth");
		b5 = new Button("Fifth");
		//b6 = new Button("Sixth");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		//add(b6);
	
	}
}
/*
<applet code="DemoGridLayout.class" width=400 height=300></applet>
*/
	