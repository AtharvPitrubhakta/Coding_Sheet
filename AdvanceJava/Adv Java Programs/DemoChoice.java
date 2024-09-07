/*					Pracitical No: 2
1] Develop an applet/application to demonstrate the use of choice component.
*/

import java.applet.*;
import java.awt.*;

public class DemoChoice extends Applet
{
	Choice ch;

	public void init()
	{
		setLayout(null);
	
		ch=new Choice();
		ch.add("Dhule");
		ch.add("Pune");
		ch.add("Mumbai");
		ch.add("Nashik");
		
		add(ch);
		
		ch.setBounds(100, 150, 100, 70);
	}
}
/*
<applet code="DemoChoice.class" width=400 height=300></applet>
*/