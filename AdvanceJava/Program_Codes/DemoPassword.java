/*
1] Write a program to JPasswordField and JTextField to demonstrate the use of user authentication.
*/

import java.applet.*;
import javax.swing.*;
import java.awt.*;

public class DemoPassword extends JApplet
{
	JLabel l1,l2;
	JPasswordField pf;
	JTextField t1;
		
	public void init()
	{
		Container c=getContentPane();
		c.setLayout(new GridLayout(2,2,10,100));
	
		l1=new JLabel("Name");
		t1=new JTextField(10);	
		
		l2=new JLabel("Password");	
		pf=new JPasswordField(10);

		c.add(l1);
		c.add(t1);	
		c.add(l2);
		c.add(pf);
		
	}
}
/*
<applet code="DemoPassword.class" width=400 height=300></applet>
*/