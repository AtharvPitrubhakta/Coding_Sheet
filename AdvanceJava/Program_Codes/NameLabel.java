// Title:- The following example creates three labels and adds them to an applet window.
import java.applet.*;
import java.awt.*;

public class NameLabel extends Applet
{

	Label l1, l2, l3, l4;
	public void init()
	{	
	
		Label l1=new Label("Krishn");
		Label l2=new Label("Kahna");	
		Label l3=new Label("Madhav", Label.LEFT);
		Label l4=new Label("Vasudev Krishn");
	
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		
		l4.setText("Vasudev Shree Krishn");
		l1. getText();		
		
	}
}
/*
<applet code="NameLabel.class" width=400 height=300></applet>
*/