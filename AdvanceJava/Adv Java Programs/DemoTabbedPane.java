/*
1] Develop a program to demonstrate the use of TabbedPane using swing.
*/

import javax.swing.*;
import java.awt.*;

public class DemoTabbedPane extends JApplet
{
	JTabbedPane jtp;
	Panel p1,p2;
	JButton b1,b2;
	JCheckBox c1,c2;

	public void init()
	{
		Container c=getContentPane();
		c.setLayout(new BorderLayout());

		jtp=new JTabbedPane();
		
		p1=new Panel();
		b1=new JButton("Dhule");
		b2=new JButton("Pune");		
		p1.add(b1);
		p2.add(b2);
	
		p2=new Panel();
		c1=new JCheckBox("Red");
		c2=new JCheckBox("Blue");
		p2.add(c1);
		p2.add(c2);

		jtp.addTab("Cities", p1);
		jtp.addTab("Colors", p2);

		c.add(jtp, BorderLayout.CENTER);
	}
}
/*
<applet code="DemoTabbedPane.class" width=400 height=400></applet>
*/