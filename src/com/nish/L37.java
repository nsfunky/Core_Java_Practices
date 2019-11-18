package com.nish;

class extraa
{
	int a;
	int b;
	static int c = 30;
		
	{  // instance block
		int a1 = 11;
		// static int b1 = 22;   Illegal modifier for the variable b1 ; only final is permitted
		int c1;
		System.out.println("IB in Extra");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a1);
		//   System.out.println(c1);  local variable must be initialized.... 
		{  // local block
			// int a =22; due to same name of local variable
			// int a1 = 33;  same name already declared for local variable.
			int a12 = 22;
			System.out.println("Local block in IB");
			System.out.println(a);
			// System.out.println(b1); The local variable b1 may not have been initialized
			System.out.println(b);
			System.out.println("End of Local block");
		}
	//System.out.println(a1);   a1 cannot be resolved to a variable 
	// No accessing local variable outside local block (till that they destroy also).....	
	}
	
	static
	{
		int ab = 11;
// static int bc = 22;  for local variable , you only used final keyword(other wise by default)
		System.out.println("Sb in Extra");
		/*System.out.println(a);
		System.out.println(a);*/    // can't access instance variable inside static block
		System.out.println(c);
		System.out.println(ab);
		{
			System.out.println("Local block in SB ");
			// System.out.println(a);    instance variable can't be accessed within SB
			System.out.println(c);
		}
	}
	
	public extraa() 
	{
		System.out.println("Default constructor");
	}
	
	extraa(int a1,int b1)
	{
		System.out.println("2-param-constructor");
		a = a1;
		b = b1;
	}
	
	
	void m1()
	{
		int a = 11;
		int b = 22;
		int c = 33;
		System.out.println("m1 in Extra");
		{
			int ab = 10;
			System.out.println("local in m1()");
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
	
			System.out.println(this.a);
			System.out.println(this.b);
			System.out.println(this.c);
			System.out.println(ab);
		}
		// System.out.println(ab); can't access outside local block
	}
	
	static void m2()
	{
		int a = 11;
		int b = 22;
		int c = 33;
		System.out.println("m2 in Extra");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		{
			int ab = 10;
			System.out.println("local in m1()");
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			/*System.out.println(this.a);
			System.out.println(this.b);
			System.out.println(this.c);*/
			// can't use this(instance variable) in static context
			System.out.println(ab);
		}
		// System.out.println(ab); can't access outside local block
	}
}

public class L37 
{
   int a12 = 12;
   static int b12 = 23;
   {
	   System.out.println("IB in Test");
   }
   static
   {
	   System.out.println("SB in Test");
   }
	public static void main(String[] args) 
	{
		extraa ex = new extraa();
		extraa ex1 = new extraa(99,77);
		ex = null;
		ex1 = null;
		extraa ex2 = new extraa(99,77);
	} 

}

