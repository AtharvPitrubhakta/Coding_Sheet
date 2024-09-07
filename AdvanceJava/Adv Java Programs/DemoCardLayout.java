// Develop a program to demonstrate the use of CardLayout.

import java.applet.*;
import java.awt.*;

public class DemoCardLayout extends Applet
{
	Panel deck, p1,p2;
	Button b1,b2;
	Checkbox c1,c2;
	
	public void init()
	{
		deck =new Panel();
		deck.setLayout(new CardLayout());

		p1=new Panel();
		b1=new Button("Dhule");
		b2=new Button("Pune");
		p1.add(b1);
		p1.add(b2);
	
		p2=new Panel();
		c1=new Checkbox("Red");
		c2=new Checkbox("Blue");
		p2.add(c1);
		p2.add(c2);
	
		deck.add(p1, "Cities");
		deck.add(p2, "Color");

		add(deck);	
	}
}
/*
<applet code="DemoCardLayout.class" width=400 height=400></applet>
*/