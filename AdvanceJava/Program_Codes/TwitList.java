// 1] Develop an applet/application using List components to add names of 5 different cities.

import java.applet.*;
import java.awt.*;

public class TwitList extends Applet
{
	List l1;
		
	public void init()
	{
		l1 = new List(3, true);
	
		l1.add("Mumbai");
		l1.add("Goa");
		l1.add("Bangalore");		
		l1.add("Nashik");
		l1.add("Pune");

		add(l1);

	} 
}
/*
<applet code="TwitList.class" width=400 height=300></applet>
*/