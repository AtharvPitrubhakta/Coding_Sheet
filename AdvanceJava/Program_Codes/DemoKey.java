/*
Develop a program to accept two numbers and display product of two numbers when user pressed "Multiply".
*/

import  java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DemoKey extends Applet implements KeyListener
{
	Label l1, l2, l3;
	Button b1;
	TextField t1, t2, t3;
	
	public void init()
	{
		setLayout(new GridLayout(4, 2, 10, 10));
			
		l1=new Label("Enter First Number:");
		t1=new TextField(10);

		l2=new Label("Enter Second Number:");
		t2=new TextField(10);
		
		l3=new Label("Enter Result:");
		t3=new TextField(10);

		b1=new Button("Multiply");

		add(l1);
		add(t1);
			
		add(l2);
		add(t2);
		
		add(l3);
		add(t3);
	
		add(b1);

		b1.addKeyListener(this);
		
	}
	public void keyPressed(KeyEvent ke)
	{
		showStatus("user key pressed: Multiply");
	
		int a = Integer.parseInt(t1.getText());
		int b = Integer.parseInt(t2.getText());
		
		int c=0;
		if(ke.getSource() == b1)
		c=a*b;

		t3.setText(c+" ");	
	}
	public void keyReleased(KeyEvent ke){}
	public void keyTyped(KeyEvent ke){}
}	
/*
<applet code="DemoKey.java" width=400 height=400></applet>
*/