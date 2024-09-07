// Title = Develop an applet / application to demonstrate use of choice component. */

import java.applet.*;
import java.awt.*;

public class DemoChoice extends Applet
{
	Choice ch;
	
	public void init()	
	{
		setLayout(null);
		
		ch = new Choice();
		ch.add("Vikunth");
		ch.add("Swarg Lok");
		ch.add("Bramh Lok");
		ch.add("Mrutu Lok");

		add(ch);
	
		ch.setBounds(80, 120, 100, 30);

	}
}
/*
<applet code = "DemoChoice.class" width=400 height=300></applet>
*/