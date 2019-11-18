package com.nish1;

// Inside abstract class, you can write all the member of the class.

abstract class Helloy
{
	int a,b;
	static int c=30;
	
	{
		System.out.println("IB in Hello");
	}
	
	static
	{
		System.out.println("SB in Hello");
	}
	
	/*
	    inside abstract class, we can write constructor, 
	    which will be processed, when we are creating the sub class object.
	    ---- So while processing the sub class constructor, JVM will check, whether any 
	    super statement is available inside sub class constructor or not.
	    
	    if not available, then JVM inserts automatically default super statement inside the sub class constructor.'
	    and due to that, abstract class constructor will be processed.
	  
	  --> you can't declare constructor as abstract.
	  
	  --> constructor can't be inherited.
	  --> constructor can't be overridden.
	  
	  --> instance block is automatically done when you are going to create an object.
	  
	  --> I can declare abstract class -- default constructor -- as private BUT
	      you will not able to create the object of any of its sub class.
	  
	 */
	
	
	Helloy()
	{
		System.out.println("Default cons. in Hello");
	}
	
	Helloy(int a,int b)
	{
		System.out.println("Two parametrize cons. in Hello");
		this.a=a;
		this.b=b;
	}
	
  // abstract method don't specify a body. 
	
   void m1()
	{
		System.out.println("M1 in Hello");
	}
	
	static void m2()
	{
		System.out.println("Static M2 in Hello");
	}
	
	public abstract void m3();
	
	abstract void m4();
	
	/*
	       if the super class abstract method is public then it must be overridden only by the public. 
	 */
	
	// --------------------------------------------------------
	
	// we can't declare abstract method as private,final,static.
	
	// private abstract void m4();
	// final abstract void m5();
	// static abstract void m6();
	
	// static abstract  &&  final abstract is called as Illegal Combination. (REMEMBER THAT)
	
	abstract void m7();
	abstract void show();
}

class Haiy extends Helloy
{
	int a;
	int b;
	static int c=20;
	
	{
		System.out.println("IB in Hai");
	}
	
	static
	{
		System.out.println("SB in Hai");
	}
	
	Haiy()
	{
		System.out.println("Default cons. in Hai");
	}
	
	Haiy(int a,int b)
	{
		System.out.println("Two parametrize cons. in Hai");
		this.a=a;
		this.b=b;
	}
	
	void m1()
	{
		System.out.println("M1 in Hai");
	}
	
	static void m2()
	{
		System.out.println("Static M2 in Hai");
	}
	
	public void m3()
	{
		System.out.println("M3 in Hai class");
	}
	
	void m4()
	{
		System.out.println("M4 i Hai");
	}

	void m7()
	{
		System.out.println("M7 in Hai class");
	}
	
	void m8()
	{
		System.out.println("M8 in Hai class");
	}
	
	void show()
	{
		//int a=10;
		//int b=11;
		//static int c=33;
		System.out.println("show in Hai");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(super.c);
	
	}
} 


public class L53 
{
	public static void main(String[] args) 
	{
		
		//Helloy h1=new Helloy();
		Helloy h1=null;
		h1=new Haiy();
		h1.m1();
		h1.m2();
		h1.m3();
		h1.m7();
		
		// h1.m8(); 
		/* 
		     will not be able to called m8() by using h1, because 
		     h1 is the super class reference variable, which contain the sub class object reference.
		     So, in order to call any method with the help of super class reference variable,
		     which contain sub class object reference, then that method signature must be available 
		     inside super class.   
		 */
		
		new Haiy().show();
		System.out.println("****************");
		Helloy h2=new Haiy(111,222);
		h2.show();

	}

}
