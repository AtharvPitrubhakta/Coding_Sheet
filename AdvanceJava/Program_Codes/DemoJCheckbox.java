import javax.swing.*;
import java.awt.*;

public class DemoJCheckbox extends JApplet
{
	JCheckBox cb1,cb2;

	public void init()
	{
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
	
		cb1=new JCheckBox("Red");
		cb2=new JCheckBox("Blue");
		
		c.add(cb1);
		c.add(cb2);

	}
}
/*
<applet code="DemoJCheckbox.class" width=400 height=300></applet>
*/