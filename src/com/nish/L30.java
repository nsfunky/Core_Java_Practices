package com.nish;

/*
 * cyclic invocation of constructor is not allowed
 * you can't invoke 2nd constructor at a time from the constructor by using "this"
 * "this" can be used only within/ inside the constructor ,,,in order to invoke the
 * CURRENT-CLASS-CONSTRUCTOR
 */

class tissy
{
	int a;
	int b;
	static int c=30;
	{
		System.out.println("IB in tissy");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static
	{
		System.out.println("SB in tissy");
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
	}
	
	public tissy() 
	{   
		this(99);
		// this(88,77);
		System.out.println("--default--");
		System.out.println(this);
	}
	
	tissy(int a)
	{
		this(88,77);
		System.out.println("---1-parameteric constructor---");
		this.a = a;
		System.out.println(this);
	}
	
	tissy(int a,int b)
	{
		// this();
		System.out.println("--2-parameter constructor--");
		this.a=a;
		this.b=b;
		System.out.println(this);
	}
	
	void show()
	{
		int a = 101;
		int b = 202;
		//static int c = 303;
		System.out.println("--show()--");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
	}
	
	static void show1()
	{
		int a = 101;
		int b = 202;
	//	static int c = 303;
		System.out.println("--show1()--");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		/*System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);*/
		System.out.println(tissy.c);
	    /*
		System.out.println(tissy.show1());  
		The method println(boolean) in the type PrintStream is not applicable 
		for the arguments (void)
		*/
	}
}


public class L30 
{
	public static void main(String[] args) 
	{
		tissy tt = new tissy();
		tt.show();
		tt.show1();
	}

}
