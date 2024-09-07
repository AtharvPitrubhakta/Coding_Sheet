
import java.util.*;
class ruls

{
	public static void main(String[]args)
	{
		Scanner s=new Scanner (System.in);
			double msalary,asalary,incometax;
			System.out.println("enter monthly salary");
				msalary=s.nextDouble();
				asalary=msalary*12;
				if(asalary<300000)
				incometax=0;
				else
				if(asalary<=100000)
				incometax=(asalary-300000)*0.10);
				else
				incometax=(asalary-100000)*0.15+700000
			System.out.println("incometax is"+incometax);
}
	}