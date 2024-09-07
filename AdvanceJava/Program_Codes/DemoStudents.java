/*
Write a java program to create a table of Name of Students, Percentage and Grade of 10 students using JTable.
*/

import javax.swing.*;
import java.awt.*;

public class DemoStudents extends JApplet
{
	JTable jt;
	JScrollPane jsp;

	public void init()
	{
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
	
		String colHeads[] = {"Name Of Students", "Percentage", "Grade"};
	
		String data[][] = {{"David", "99%", "A"},
				{"Michael", "95%", "A"},
				{"Harry", "90%", "A"},
				{"Carry", "85%", "A"},
				{"Mary", "80%", "B"},
				{"John", "75%", "B"},
				{"Donald", "65%", "C"},
				{"Larry", "60%", "C"},
				{"Liza", "55%", "D"},
				{"James", "50%", "D"}};
	
		jt = new JTable(data, colHeads);	
		
		int vsb = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int hsb = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
	
		jsp = new JScrollPane(jt, vsb, hsb);
	
		c.add(jsp, BorderLayout.CENTER);

	}
}
/*
<applet code="DemoStudents.java" width=400 height=300></applet>
*/