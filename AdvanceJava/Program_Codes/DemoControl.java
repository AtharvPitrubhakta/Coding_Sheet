// Design an applet / application to create form using TextField ,TextArea ,Button ,and Label.

import java.awt.*;

class DemoControl extends Frame
{
	Label l1,l2;
	TextField tf;
	TextArea ta;
	Button b1;

	DemoControl()
	{		
		setLayout(null);	
	
		l1 = new Label("Name");	
		tf = new TextField();
		
		l2 = new Label("Address");
		ta = new TextArea();
			
		b1 = new Button("Submit");
		
		add(l1);
		add(tf);
		add(l2);
		add(ta);
		add(b1);
	
		l1.setBounds(50, 80, 100, 20);
		tf.setBounds(170, 80, 100, 30);
		
		l2.setBounds(50, 130, 100, 20);
		ta.setBounds(170, 130, 100, 70);
		
		b1.setBounds(150,230, 60, 30);
				
	}
	public static void main(String args[])
	{
		DemoControl f = new DemoControl();
		f.setSize(400,400);
		f.setVisible(true);
	}
}
