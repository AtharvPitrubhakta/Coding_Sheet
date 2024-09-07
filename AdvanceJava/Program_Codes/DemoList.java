// Title = Develop an applet /application to select multiple names of news // papers using List.

import java.awt.*;

class DemoList extends Frame
{
	List l1;
	
	DemoList()
	{	
		setLayout(null);
		
		l1 = new List(4 , false);
			
		l1.add("Express");
		l1.add("Lokmat");
		l1.add("Times of India");
		l1.add("Sakal");
		l1.add("Sammna");
	
		add(l1);

		l1.setBounds(70, 100, 150, 50);
	}
	public static void main(String args[])
	{
		DemoList f = new DemoList();
		f.setSize(400,400);
		f.setVisible(true);
	}
}