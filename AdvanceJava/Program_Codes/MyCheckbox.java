// Program to demonstrate use of checkbox.
// Or
// Develop program using Applet to select multiple language known to user(e.g. Marathi, Hindi, and English)

import java.applet.*;
import java.awt.*;

public class MyCheckbox extends Applet
{
	Checkbox cb1 , cb2, cb3;
	public void init()
	{
			
		cb1 = new Checkbox ("Marathi");
		cb2 = new Checkbox ("Hindi");
		cb3 = new Checkbox ("English");
	
		add(cb1);
		add(cb2);
		add(cb3);	
	}
}
/*
<applet code="MyCheckbox.class" width=400 height=300></applet>
*/
	