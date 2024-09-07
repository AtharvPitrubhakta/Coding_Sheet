/*					Practical No: 1
2] Program to demonstrate use of radiobuttons in AWT.
*/

import java.applet.*;
import java.awt.*;

public class DemoRadio extends Applet
{
	CheckboxGroup cbg;
	Checkbox cb1,cb2;
	
	public void init()
	{
		cbg=new CheckboxGroup();
		
		cb1=new Checkbox("Male",true,cbg);
		cb2=new Checkbox("Female",true,cbg);

		add(cb1); 
		add(cb2);
	}	
}
/*
<applet code="DemoRadio.class" width=400 height=300></applet>
*/
	