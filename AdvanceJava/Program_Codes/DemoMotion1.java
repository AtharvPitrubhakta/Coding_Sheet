import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DemoMotion1 extends Applet
{
	public void init()
	{
		this.addMouseMotionListener(new MouseMotionAdapter()
		{
			public void mouseDragged(MouseEvent me)
			{
				showStatus("Mouse Dragged");	
			}
		});
	}
}
/*
<applet code="DemoMotion1.class" width=400 height=400></applet>
*/