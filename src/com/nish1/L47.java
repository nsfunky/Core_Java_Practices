package com.nish1;

/*
  Remember following points while overriding methods
   
   1.   method must be same inside super & sub class
   2.   method signature must be same inside the sub class
   3.   method return type should be equal or higher than the super type. 
      
           super -------------------------   sub
      a)  private                        private,default,protected,public
      b)  default                        default,protected,public
      c)  protected                      protected,public
      d)  public                         public
   
   4.    private method can't be overridden.
   5.    static method  can't be overridden.
   6.    final method   can't be overridden.
       
 */


class Hee
{
	void m1()
	{
		System.out.println("m1 in Hee");
	}
	
	void m2(int a)
	{
		System.out.println("m2(1-int-arg) in Hee");
	}
	
	int m3()
	{
		System.out.println("m3 in Hee");
		return 10;
	}
	
	static void m4()
	{
		System.out.println("m4 in Hee");
	}
	
	final int m5()
	{
		System.out.println("m5 in Hee");
		return 20;
	}
	
	public void m11()
	{
		System.out.println("m11 in Hee");
	}
	
	public void m22()
	{
		System.out.println("m22 in Hee");
	}
	
	protected void m33()
	{
		System.out.println("m33 in Hee");
	}
	
}


class Haa extends Hee
{
	public void m1() 
	{
		System.out.println("m1 in Haa");
	}
	
	public void m1(int a) 
	{
		System.out.println("m1(int) in Haa");
	}
	
/*	
	void m2()         // method having same input argument with same name is not allowed in JAVA
	{
	   	System.out.println("m2 in Haa");
	}
	
	int m2()
	{
		System.out.println("m2 in Haa");
		super.m2(10);
		
		     if you wanted to use sub class as well as super class implementation 
		     i.e.
		     if you want to use new implementation as well as old(existing) implementation also, 
		     then override that method inside sub class like m2() >--- i.e---<    super.m2() 
		 
		return 20;
	}
	
*/	
	
	int m2()
	{
		System.out.println("m2 in Haa");
		return 10;
	}
	
	void m2(int a)
	{
		System.out.println("m2(int) in Haa");
	}
	
	
	int m3()
	{
		System.out.println("m3 in Ha");
		return 10;
	}
	
/*
  This instance method cannot override the static method from Hee
	void m4()
	{
		System.out.println("m4 in Haa");
	}
*/
	
	static void m4()
	{
		System.out.println("m4 in Haa");
	}
	
/*	
 * you can Never override the method having final keyword (ANYHOWWWW) 
	void m5()
	{
		
	}

	int m5()
	{
		
	}

	final int m5()
	{
		
	}
	
*/
	
	public void m11() 
	{
		System.out.println("m11 in Haa");		
	}
	
/*
 * Cannot reduce the visibility of the inherited method from Hee class 
 * method return type should be equal or higher than the super type.(Go to Point 3)  
	
	void m22() 
	{
	    System.out.println("m22 in Haa");	
	}
*/	
	
}




public class L47 
{
	public static void main(String[] args) 
	{
		Haa ha = new Haa();
		ha.m1();
		ha.m22();
	}

}