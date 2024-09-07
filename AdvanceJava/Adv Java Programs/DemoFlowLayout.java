import java.applet.*;
import java.awt.*;

public class DemoFlowLayout extends Applet
{
	Button b1,b2,b3;

	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 30));

		Button b1=new Button("OK");	
		Button b2=new Button("RESET");
		Button b3=new Button("SUBMIT");
	
		add(b1);
		add(b2);
		add(b3);
	}
}
/*
<applet code="DemoFlowLayout.java" width=400 height=400></applet>
*/