
//for e.g: Design a class employee, having 
			data member
			int empno
			String empname
			float empsal
			Method
			void accept() - to read empno,empname and empsal
			void incr() - to incr the salary by 10%
			void disp() - to display all information
//
import java.util.*;
class emp
{
	private int empno[] = new int();
	private string[] = new string();
	private float empsal[]=new float();
	public void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.pritln("Enter Empno:");
		System.out.pritln("Enter Empname:");
		System.out.pritln("Enter Empsalary:");
		for(int i=0;i<x.length;i++)
		empno[i] = s.nextInt();
		empname[i] = s.nextLine();
		empsal[i] = s.nextfloat();
	}
	public void incr(int a)
	{
		for(int i=0;i<x.lenght;i++)
		{
			if(sal <= x[i])
			float = (sal)(++a)*10.0f;
		}
	}
	public void display()
	{
		System.out.println("Empno"+empno);
		System.out.println("Empname"+empname);
		System.out.println("Empsalary"+empsal);
	}
	class emp1
	{
		public static void main(String args[])
		{	
			emp e=new emp();
			e.accept();
			e.incr();
			e.display();
		}
	}
}