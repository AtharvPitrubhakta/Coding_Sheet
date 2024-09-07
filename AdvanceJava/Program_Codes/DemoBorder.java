import java.applet.*;
import java.awt.*;

public class DemoBorder extends Applet
{
	Button b1, b2, b3,b4, b5;	
	public void init()
	{
		BorderLayout b=new BorderLayout(40, 20);	
		setLayout(b);
	
		b1 = new Button("North");
		b2 = new Button("East");
		b3 = new Button("South");	
		b4 = new Button("West");
		b5 = new Button("Center");
		
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.EAST);
		add(b3, BorderLayout.SOUTH);
		add(b4,BorderLayout.WEST);
		add(b5, BorderLayout.CENTER);

	}
}
/*
<applet code="DemoBorder.java" width=400 height=300></applet>
*/  