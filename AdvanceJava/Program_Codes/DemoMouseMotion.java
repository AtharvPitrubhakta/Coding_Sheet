import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DemoMouseMotion extends Applet implements MouseMotionListener
{
	public void init()
	{
		this.addMouseMotionListener(this);

	}
	public void mouseMoved(MouseEvent me)	
	{	
		int x=me.getX();
		int y=me.getY();
		
		showStatus("Mouse Moving at x="+x+"y="+y);
			
	}
	public void mouseDragged(MouseEvent me)
	{
		showStatus("Mouse Dragged");

	}
}
/*
<applet code="DemoMouseMotion.java" width=400 height=400></applet>
*/