import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DemoMouse1 extends Applet
{	
	public void init()
	{
		this.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				showStatus("Mouse Pressed:");
			}
		});
	}
}
/*
<applet code="DemoMouse1.class" width=400 height=400></applet>
*/

