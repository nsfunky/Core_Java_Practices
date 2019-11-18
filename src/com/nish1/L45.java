package com.nish1;

class A                    //  super class
{
	void mm()
	{
		System.out.println("mm in A");
	}
}

class B extends A         // sub class
{
	void mn()
	{
		System.out.println("mn in A");
	}
}

class Hell                  // any Dependent class
{
	A m1()
	{
	   System.out.println("--m1 in Hell--");
	   return new A();
	}
	B m2()
	{
	   System.out.println("--m2 in Hell--");
	   return new B();
	}
	B m3(A a1)
	{
	   System.out.println("--m3 in Hell--");
	   return (B)a1;
	}
}

public class L45 
{
	public static void main(String[] args) 
	{
		Hell h1 = new Hell();
		
		A a11 = h1.m1();
		A a12 = h1.m2();
		
		B b11 = h1.m2();
		
    //	h1.m3(new A());    //  A can't be cast to B

		//  Never assign super class reference variable to sub class reference variable.
		
		B b12 = h1.m3(new B());
		
		h1.m1().mm();
		h1.m2().mm();
		
		h1.m2().mn();
		
	}

}
