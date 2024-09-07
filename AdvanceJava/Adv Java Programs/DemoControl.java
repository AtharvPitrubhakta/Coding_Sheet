/*					Practical No: 1
3] Design an applet/application to create form using TextField, TextArea, Button and Label.
*/

import java.awt.*;

class DemoControl extends Frame
{
	TextField t1;
	TextArea ta;
	Button b1;
	Label l1,l2;

	DemoControl()
	{
		setLayout(null);
		
		l1=new Label("Name");				
		t1=new TextField();
		
		l2=new Label("Address");
		ta=new TextArea();

		b1=new Button("Submit");

		add(l1);
		add(t1);
		
		add(l2);
		add(ta);

		add(b1);		
	
		l1.setBounds(50, 100, 100, 30);
		t1.setBounds(180, 100, 100, 30);
	
		l2.setBounds(50, 160, 100, 30);
		ta.setBounds(180, 160, 100, 70);
	
		b1.setBounds(90, 250, 50, 30);
	
	}
	public static void main(String args[])
	{
		DemoControl d=new DemoControl();
		d.setSize(400,300);
		d.setVisible(true);	
	}
}