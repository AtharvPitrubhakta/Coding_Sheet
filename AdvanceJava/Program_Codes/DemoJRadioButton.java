/*
Develop an applet in using swing to demonstrate JRadioButton and ButtonGroup class
*/

import javax.swing.*;
import java.awt.*;

public class DemoJRadioButton extends JApplet
{
	JRadioButton  rb1 , rb2;
	
	public void init()
	{
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
	
		rb1=new JRadioButton("Red");
		rb2=new JRadioButton("Yellow");
	
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
	
		c.add(rb1);
		c.add(rb2);
	}
}
/*
<applet code="DemoJRadioButton.class" width=400 height=300></applet>
*/