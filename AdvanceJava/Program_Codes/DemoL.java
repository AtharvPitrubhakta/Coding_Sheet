// Develop a program to select multiple languages known to user. (e.g. marathi , hindi, english, sankrit).

import java.awt.*;

class DemoL extends Frame
{
	List l;
	
	DemoL()
	{
		setLayout(null);
		
		l = new List(4, true);
		l.add("Marathi");
		l.add("Hindi");
		l.add("English");
		l.add("Sanskrit");
		
		add(l);	
			
		l.setBounds(100, 100, 100, 70);			
	}
	public static void main(String args[])
	{
		DemoL l=new DemoL();
		l.setSize(400, 300);
		l.setVisible(true);
	}	
}