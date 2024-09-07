/*
3] Write a program using JPassswordField to accept password form user and if the length is less than 6 characters then error messages should be displayed "password length must be > 6 characters"
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoLogin1 extends JApplet implements ActionListener
{
	JLabel l1, l2, msg;
	JButton b1, b2;
	JTextField t1;
	JPasswordField jp1;

	public void init()
	{
		Container c=getContentPane();
		setLayout(new FlowLayout());
	
		l1=new JLabel("UserName:");
		t1=new JTextField(10);
	
		l2=new JLabel("Password:");
		jp1=new JPasswordField(10);
	
		b1=new JButton("Login");
		b2=new JButton("Cancel");

		msg=new JLabel();

		c.add(l1);
		c.add(t1);
	
		c.add(l2);
		c.add(jp1);
		c.add(msg);
			
		c.add(b1);
		c.add(b2);

		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String pass=jp1.getText();
			
			if(pass.length()<6)
			msg.setText("password length must be>6 characters");
		}
	}
}
/*
<applet code="DemoLogin1.class" width=650 height=1 00></applet>
*/		