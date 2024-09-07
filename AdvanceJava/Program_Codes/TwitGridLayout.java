/*
3] Develop a program to generate following output.
*/

import java.applet.*;
import java.awt.*;

public class TwitGridLayout extends Applet
{
	Button b1, b2, b3, b4, b5;

	public void init()
	{
		GridLayout g=new GridLayout(3,2,30,50);
		setLayout(g);
		
		b1 = new Button("Button1");
		b2 = new Button("Button 2");
		b3 = new Button("Button 3");
		b4 = new Button("Button 4");
		b5 = new Button("Button 5");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
	}
	
}
/*
<applet code="TwitGridLayout.class" width=400 height=300></applet>
*/