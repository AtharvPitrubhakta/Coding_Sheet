/*
Develop an applet to add button with image on it, image on button should be change.
*/

import javax.swing.*;
import java.awt.*;

public class DemoJButton extends JApplet
{
	JButton b1;
	ImageIcon ni, pi, ri;
	
	public void init()
	{
		Container c=getContentPane();
		c.setLayout(null);
		
		ni=new ImageIcon("green.png");
		b1=new JButton(ni);
		c.add(b1);
		b1.setBounds(100, 100, 150, 40);
		
		pi=new ImageIcon("nature.png");
		ri=new ImageIcon("sun.jpg");
	
		b1.setPressedIcon(pi);
		b1.setRolloverIcon(ri);
	}
}
/*
<applet code="DemoJButton.class" width=400 height=300></applet>
*/
		