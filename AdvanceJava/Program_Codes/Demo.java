// Write a program using Label to display message "Welcome To Java".

import java.applet.Applet;
import java.awt.*;

public class Demo extends Applet
{	
	Label l1;

	public void init()
	{
		setLayout(null);
		
		l1=new Label("Welcome To Java");

		add(l1);	
		
		l1.setBounds(100, 100, 100, 50);
	}
}
/*
<applet code="Demo.java" width=400 height=300></applet>
*/