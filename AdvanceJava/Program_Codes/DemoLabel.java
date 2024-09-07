import java.applet.*;
import java.awt.*;

public class DemoLabel extends Applet
{
	Label  l1, l2;
	Button b1;

	public void init()
	{
		setLayout(null);
			
		Label l1=new Label("UserName");
		Label l2=new Label("Password");

		Button b1=new Button("Login");
		
		add(l1);
		add(l2);
		add(b1);
		
		l1.setBounds(50,50,100,30);
		l2.setBounds(50,100,100,30);
		b1.setBounds(120,150,100,30);		
	}
}

/*<applet code="DemoLabel.class" width=400 height=300></applet>*/