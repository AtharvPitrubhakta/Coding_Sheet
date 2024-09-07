import javax.swing.*;
import java.awt.*;

public class DemoScrollPane extends JApplet
{
	JScrollPane jsp;
	JTextArea jta;
	
	public void init()
	{
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
	
		jta = new JTextArea();

		int vsb = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int hsb = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;	
		
		jsp = new JScrollPane(jta, vsb, hsb);

		c.add(jta, BorderLayout.CENTER);	
	}
}
/*
<applet code="DemoScrollPane.java" width=400 height=400></applet>		
*/
