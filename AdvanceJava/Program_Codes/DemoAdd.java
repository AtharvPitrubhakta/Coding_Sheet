import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DemoAdd extends JApplet implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1;
	
	public void init()
	{
		Container c=getContentPane();
		c.setLayout(new GridLayout(4,2,10,10));					
	
		l1=new JLabel("First No");
		t1=new JTextField(10);
	
		l2=new JLabel("Second No:");
		t2=new JTextField(10);

		l3=new JLabel("Result");
		t3=new JTextField(10);

		b1=new JButton("ADD");
	
		c.add(l1);
		c.add(t1);
		
		c.add(l2);
		c.add(t2);
	
		c.add(l3);
		c.add(t3);
		
		c.add(b1);
		
		b1.addActionListener(this);
	}
	public void  actionPerformed(ActionEvent ae)
	{
		int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t2.getText());
	
		int c=0;
		if(ae.getSource() == b1)
		c=a+b;
		
		t3.setText(c+" ");
	}
		
}
/*
<applet code="DemoAdd.class" width=400 height=300></applet>
*/