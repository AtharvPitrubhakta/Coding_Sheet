/*					Practical No: 2
2] Develop an applet/application to select multiple names of news papers using List.
*/

import java.applet.*;
import java.awt.*;

public class DemoList extends Applet
{	
	List lst;

	public void init()
	{
	
		lst=new List(3,true);
		lst.add("Lokmat");
		lst.add("Sakal");
		lst.add("Saamana");
		lst.add("Deshdut");
		
		add(lst);
			
	}
}
/*
<applet code="DemoList.class" width=400 height=300></applet>
*/