class the2 implements Runnable
{
public static void main(String[] args)
{
System.out.println("Main Started");
the2 p=new the2();

Thread p1=new Thread(p);
Thread p2=new Thread(p);
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
Thread.sleep(100);
}catch(Exception ee){}
}
}
} 
