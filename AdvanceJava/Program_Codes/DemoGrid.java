import java.applet.*;
import java.awt.*;

public class DemoGrid extends Applet
{
	Button b1, b2, b3, b4, b5;

	public void init()
	{
		GridLayout g=new GridLayout(3, 2, 30, 50);
		setLayout(g);
		
		b1=new Button("Button1");
		b2=new Button("Button2");
		b3=new Button("Button3");
		b4=new Button("Button4");
		b5=new Button("Button5");	

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
	}	
}
/*
<applet code="DemoGrid.java" width=400 height=300></applet>
*/