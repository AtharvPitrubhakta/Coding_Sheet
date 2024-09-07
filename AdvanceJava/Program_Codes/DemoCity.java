// Develop an applet/ application using List components to add names of 10 different cities.

import java.applet.*;
import java.awt.*;

public class DemoCity extends Applet
{
	List l1;
	
	public void init()
	{	
		setLayout(null);
	
		l1=new List(10, true);
		l1.add("Dhule");
		l1.add("Mumbai");	
		l1.add("Pune");
		l1.add("Nashik");
		l1.add("Nagpur");
		l1.add("Bangalore");
		l1.add("Akola");
		l1.add("Goa");
		l1.add("Ahmednagar");
		l1.add("Kolkata");	

		add(l1);
	
		l1.setBounds(60, 60, 150, 160);
	}
}
/*
<applet code="DemoCity.java" width = 500 height=400 > </applet>
*/