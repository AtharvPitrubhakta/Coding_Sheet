// Develop an applet in swing to demonstrate use of JLabel, LTextField, JPassField and JButton control.

import javax.swing.*;
import java.awt.*;

public class DemoLogin extends JApplet
{
	JLabel l1, l2;
	JButton b1, b2;
	JTextField t1;
	JPasswordField jp1;

	public void init()
	{
		Container c=getContentPane();
		c.setLayout(new GridLayout(3,2,10,10));

		l1 = new JLabel("UserName:");
		t1 = new JTextField(10);

		l2 = new JLabel("Password");
		jp1 = new JPasswordField(10);
		
		b1 = new JButton("Login");
		b2 = new JButton("Cancel");	
	
		c.add(l1);
		c.add(t1);
		
		c.add(l2);
		c.add(jp1);

		c.add(b1);
		c.add(b2);
	}
}
/*
<applet code="DemoLogin.class" width=400 height=300></applet>
*/