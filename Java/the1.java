class the1 extends Thread
{
public static void main(String[] args)
{
System.out.println("Main Started");
the1 p1=new the1();
the1 p2=new the1();
p1.start();
p2.start();
System.out.println("Main Ends");
}
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("Thread "+Thread.currentThread()+" "+i);
try
{
Thread.sleep(1000);
}catch(Exception ee){}
}
}
} 
