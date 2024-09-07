/*
2]  Develop an applet/application to select multiple names of cities using List.
*/

import java.applet.*;
import java.awt.*;

public class HashList extends Applet
{
	List lst;
	public void init()
	{
		
		setLayout(null);
				
		lst = new List(3,true);
		lst.add("Nashik");		
		lst.add("Pune");
		lst.add("Mumbai");
		lst.add("Bangalore");
		lst.add("Nagpur");	
	
		add(lst);	
	
		lst.setBounds(50,100,100,60);
		
		//String str[] = lst.getSelectedItems()
		//int  str[] = lst.getSelectedIndexes()
		//lst.select(3);
	}
	
}
/*<applet code="HashList.class" width=400 height=400></applet>*/
