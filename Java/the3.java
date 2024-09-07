import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class the3 extends Applet implements Runnable
{
Graphics g;
Thread t;
public void init()
{
g=getGraphics();
Font f=new Font("Courier",Font.BOLD,34);
g.setFont(f);
t=new Thread(this);
t.start();
}
public void run()
{
for(int i=1;i<=500;i++)
drawme("Java Programming",50,i);
}
void drawme(String s,int x,int y)
{
g.setColor(Color.black);
g.fillRect(0,0,500,500);
g.setColor(Color.yellow);
g.drawString(s,x,y);
try
{
Thread.sleep(10);
}catch(Exception ee){}
}
}
/*<applet height=600 width=600 code=the3></applet>*/