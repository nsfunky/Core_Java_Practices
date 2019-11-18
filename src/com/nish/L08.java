package com.nish;

class Hell
{
	int a = 20;               // instance variable
	int b = 20;              // instance variable
	static int c = 20;   // static  variable
	
	void m1()     
	{
		System.out.println("--m1() inside Hell");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	static void m2()
	{  // instance variable can't be accessed inside static context
		System.out.println("--m2() inside Hell");
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
	}
}

public class L08 
{
	public static void main(String[] args) 
	{
		System.out.println("--I'm in main()--");
		System.out.println("------------------------------------------------------------------");
		System.out.println("Only Static variable can be acceses by declaring reference variable as null also-");
		System.out.println("------------------------------------------------------------------");
		Hell h1 = null;
		System.out.println("  static variable c = "+h1.c); 
          //	System.out.println(h1.a);  
         //		System.out.println(h1.b);
		// Null pointer access: The variable h1 can only be null at this location
		System.out.println("------------------------------------------------------------------");
		System.out.println("Only Static variable can be acceses directly by Class name itself");
		System.out.println("--------------------------------------------------------------------");
		System.out.println(Hell.c);  
		System.out.println("------------------------------------------------------------------");
		System.out.println("With the help of reference variable which contain corresponding class object reference");
		System.out.println("--------------------------------------------------------------------");
		Hell h2 = new Hell();
		System.out.println(h2.a);
		System.out.println(h2.b);
		System.out.println(h2.c);

		
	}

}
