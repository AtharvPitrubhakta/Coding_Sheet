// Develop applet/ application to select multiple names of news papers.

import java.awt.*;
	
class DemoNews extends Frame
{
	List lst;
	
	DemoNews()
	{
		setLayout(null);	
	
		lst = new List(4, true);
		lst.add("Lokmat");
		lst.add("Sakal");
		lst.add("Express");
		lst.add("Times of India");
	
		add(lst);
		
		lst.setBounds(50, 50, 100, 70);
	}
	public static void main(String args[])
	{
		DemoNews dn=new DemoNews();
		dn.setSize(400, 300);
		dn.setVisible(true);			
	}
}	

