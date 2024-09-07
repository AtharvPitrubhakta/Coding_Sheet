import java.applet.*;
import java.awt.*;

public class DemoProgram extends Applet
{
	Label l1,l2,l3,l4;
	TextField tf1,tf2, tf3;
	TextArea ta;
	Button b1;
	
	public void init()
	{
		setLayout(null);
		
		l1 = new Label("First Name");
		tf1 = new TextField();
	
		l2 = new Label("Last Name");
		tf2 = new TextField();
		
		l3 = new Label("Date Of Birth");
		tf3 = new TextField();
	
		l4 = new Label("Introduction");
		ta = new TextArea();

		b1 = new Button("Submit");
	
		l1.setBounds(50, 100, 100, 30);
		tf1.setBounds(170,100,100,30);
		
		l2.setBounds(50, 150, 100, 30);
		tf2.setBounds(170,150,100,30);
	
		l3.setBounds(50, 200, 100, 30);
		tf2.setBounds(170, 200, 100, 30);
	
		l4.setBounds(50, 250, 100, 30);
		ta.setBounds(170, 250, 100, 70);
		
		b1.setBounds(110,  330, 50, 30);

		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		add(l4);
		add(ta);
		add(b1);
			
	} 
}
/*
<applet code="DemoProgram.class" width=500 height=500></applet>
*/				