package com.nish;

/*
     1. writing more than one method within the same class and same name
         are called as method overloading.
     2. returned type can be anything.
     3. method parameter must be different in following ways
         a)  number of parameters
         b) types of parameter
         c) sequence of parameter    
 */

class arith
{
	void sum1(int a,int b,int c)
	{
		System.out.println("sum1(a,b,c)");
	}

/*
 *	it will understand it as a duplicate
    void sum1(int x,int y,int z)
	{
		System.out.println("sum1(a,b,c)");
	}
 */
	
	void sum1(int a,int b)
	{
		System.out.println("sum1(a,b)");
	}
	
	int sum1(int a)
	{
		System.out.println("sum1(int)");
		return a;
	}
	
	void sum1()
	{
		System.out.println("sum1()");
	}
	
	void sum1(String str)
	{
		System.out.println("sum1(string)");
	}
	
	void sum1(byte b)
	{
		System.out.println("sum1(byte)");
	}
	
	void sum1(int a,double d)
	{
		System.out.println("sum1(a,d)");
	}
	
	void sum1(double d,int a)
	{
      System.out.println("sum1(d,a)");
	}
	
	void sum1(float f)
	{
		System.out.println("sum1(float)");
	}
}

public class L18 
{
	public static void main(String[] args) 
	{
		arith ar = new arith();
		ar.sum1();
		System.out.println("----------------");
		ar.sum1(100);
		System.out.println("----------------");
		ar.sum1(2.23f);
		System.out.println("----------------");
		ar.sum1(3);
		System.out.println("----------------");
		ar.sum1("hell");
		System.out.println("----------------");
		ar.sum1(3.3, 4);
		System.out.println("----------------");
		ar.sum1(7, 8.9);
		System.out.println("----------------");
		ar.sum1(6, 7);
		System.out.println("----------------");
		ar.sum1(3, 5, 6);
		System.out.println("----------------");

	}

}
