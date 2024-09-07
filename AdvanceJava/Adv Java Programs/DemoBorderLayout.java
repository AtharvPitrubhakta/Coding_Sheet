// Develop a program to demonstrate the use of BorderLayout.

import java.applet.*;
import java.awt.*;

public class DemoBorderLayout extends Applet
{
	Button b1,b2,b3,b4,b5;
	
	public void init()
	{
		setLayout(new BorderLayout(20, 20));	
		
		Button b1=new Button("Top");
		Button b2=new Button("Right");
		Button b3=new Button("Bottom");
		Button b4=new Button("Left");
		Button b5=new Button("Middle");	                                            
	
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.EAST);
		add(b3, BorderLayout.SOUTH);
		add(b4, BorderLayout.WEST);
		add(b5, BorderLayout.CENTER);

	}	
}
/*
<applet code="DemoBorderLayout.class" width=400 height=400></applet>
*/