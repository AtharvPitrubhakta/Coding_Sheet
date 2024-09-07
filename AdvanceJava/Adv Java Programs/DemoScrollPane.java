/*
2] Develop a program to demostrate the use of ScrollPane in swing.
*/

import javax.swing.*;
import java.applet.*;
import java.awt.*;


public class DemoScrollPane extends JApplet
{
	JScrollPane jsp;
	JTextArea jta;

	public void init()
	{
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
	
		jta=new JTextArea();
		int vsb=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int hsb=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
	
		jsp=new JScrollPane(jta, vsb, hsb);
	
		c.add(jsp, BorderLayout.CENTER);
	}		
}
/*
<applet code="DemoScrollPane.class" width=400 height=400></applet>
*/


	