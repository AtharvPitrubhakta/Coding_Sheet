// Develop a program to demonstrate the use of Table in Swing.

import javax.swing.*;
import java.awt.*;
	
public class DemoJTable extends JApplet
{
	JTable jt;
	JScrollPane jsp;
		
	public void init()
	{
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
	
		String colHeads[] = {"ID", "Name", "Salary"};
			
		String data [][] = {{"101",  "AAA", "35.5"},
				{"102",  "BBB", "67.5"},
				{"103",  "CCC", "45.9"},
				};
	
		jt = new JTable(data, colHeads);
	
		int vsb = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int hsb = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		jsp = new JScrollPane(jt, vsb, hsb);
		
		c.add(jsp, BorderLayout.CENTER);	
	}
}
/*
<applet code="DemoJTable.java" width=400 height=400></applet>



	
*/