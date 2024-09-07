				// Practical No: 10_1 //

/* Develop a program to accept two numbers in two different textfields and display addition and substraction of these two numbers in third textfield when user presses "ADD" and "Multiply" button respectively. */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DemoAction extends Applet implements ActionListener
{
	Label l1, l2, l3;
	Button b1, b2;
	TextField t1, t2, t3;
	
	public void init()
	{
		setLayout(new GridLayout(4, 2, 10, 10));

		l1=new Label("Enter First Number:");
		t1=new TextField(10);

		l2=new Label("Enter Second Number:");
		t2=new TextField(10);
	
		l3=new Label("Result");
		t3=new TextField(10);
	
		b1=new Button("Add"); 
		b2=new Button("Multiply");
	
		add(l1);
		add(t1);
	
		add(l2);
		add(t2);
		
		add(l3);
		add(t3);
	
		add(b1);
		add(b2);
	
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a=Integer.parseInt(t1.getText());	
		int b=Integer.parseInt(t2.getText());
	
		int c=0; 
		if(ae.getSource()==b1)
		c = a + b;
		else if(ae.getSource()==b2)
		c = a * b;
		 
		t3.setText(c+" ");
	}
}
/*
<applet code="DemoAction.class" width=400 height=300></applet>
*/
 