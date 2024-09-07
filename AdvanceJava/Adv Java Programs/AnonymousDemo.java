//Java program to demonstrate Anonymous inner class 

import java.util.*;

interface Age 
{ 
	int x = 21; 
	void getAge(); 
} 
class AnonymousDemo 
{ 
	public static void main(String[] args) 
	{ 
		Age oj1 = new Age() 
		{ 
			public void getAge() 
			{ 
				// printing age 
				System.out.print("Age is "+x); 
			} 
		}; 
		oj1.getAge(); 
	} 
} 
