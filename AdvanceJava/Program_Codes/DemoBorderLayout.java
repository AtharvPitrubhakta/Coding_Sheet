/*
3] Develop a program to demonstrate use of borderLayout.
*/

import java.applet.*;
import java.awt.*;

public class DemoBorderLayout extends Applet
{
	Button b1, b2, b3, b4, b5;

	public void init()
	{
		BorderLayout b=new BorderLayout(40 , 20);
		setLayout(b);	

		b1 = new Button("Top");
		b2 = new Button("Right");
		b3 = new Button("Bottom");
		b4 = new Button("Left");
		b5 = new Button("Middle");

		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.EAST);	
		add(b3, BorderLayout.SOUTH);
		add(b4, BorderLayout.WEST);
		add(b5, BorderLayout.CENTER);
	
	}
}	
/*
<applet code="DemoBorderLayout.class" width=400 height=300></applet>
*/
