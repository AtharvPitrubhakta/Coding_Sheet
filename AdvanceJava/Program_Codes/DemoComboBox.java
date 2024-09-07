// write a program to develop a frame to select the different states of India using JComboBox.

import java.awt.*;
import javax.swing.*;

class DemoComboBox extends JFrame
{
	JComboBox jcb;
	
	DemoComboBox()
	{
		Container c = getContentPane();
		c.setLayout(null);
	
		jcb = new JComboBox();
		jcb.addItem("Maharshtra");	
		jcb.addItem("Delhi");
		jcb.addItem("Gujarat");		
		jcb.addItem("Bihar");
	
		c.add(jcb);
		jcb.setBounds(80, 100, 120, 30);
	
		jcb.setEditable(true);
		
	}
	public static void main(String args[])
	{
		DemoComboBox d=new DemoComboBox();
		d.setSize(400 , 400);
		d.setVisible(true);
		d.setDefaultCloseOperation(EXIT_ON_CLOSE);
 	}	
}



