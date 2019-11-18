package com.nish2;

/*
   interface is fully abstract, which contain mainly 2 types of member
 
   1)  public abstract method
   2)  public static final variable (or you can also say) public,static,final individually also.
        but internally, it understands as -->  public static final variable.
 */

interface Ix
{
	
	public static final int b=20;
	int a=10;
	final int i =30;
	static int j = 40;
	
	// private int i=5;  Illegal modifier for the interface field Ix.i;   only public, static & final are permitted.
	
	
	// method define inside interface will be considered as BY DEFAULT  [   public abstract method   ]  
	
	void m1();
	public abstract void m2();
	public void m3();
	
	/*
	    you can't write following things inside interface
	    
	    1) instance variable
	    2) concrete method
	    3) block
	    4) constructor 
	 
	
	public void v()
	{
	  // some implementation here
	}
	
	{
	  // instance block 
	}
	
	static
	{
	   // static block
	}
 
  */	
}

abstract class Hello implements Ix
{
/*
	void m1()
	{
		System.out.println("M1 in Hello class");
		
	//	I can't reduce the visibility of the inherited method from Ix
	}

*/	
   public void m1()
	{
		System.out.println("M1 in Hello class");
	}
	public void m2()
	{
		System.out.println("M2 in Hello class");
	}
	
}


class Hai extends Hello
{
	public void m3()
	{
		System.out.println("M3 in Hai class");
	}
	void m4()
	{
		System.out.println("M4 in Hai class");
	}
}


 public class L55{
	public static void main(String args[])
	{
		//I1 i1=new I1();  never instantiate the object for interface. but iterface reference can be created.
		Ix i2=new Hai();  
		i2.m1();
		i2.m2();
		i2.m3();
		//i2.m4();
		Hai hai=new Hai();
		hai.m4();
		hai.m3();
		
		/*
		  
		  if a class is implementing any interface then remember following points
		  
		  1) that class must override all the methods of the interface.
		  2) if sub class is not overriding all the methods of interface,then sub class must be declared as an 
		     abstract class.
		  
		 */
		
	}
}