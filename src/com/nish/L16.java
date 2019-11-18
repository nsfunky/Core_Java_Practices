package com.nish;

class hi
{
	int a = 10;
	int b = 20;
	static int c = 30;
	{
		System.out.println("IB in Hi");
	}
	static
	{
		System.out.println("SB in Hi");
	}
	void m1()
	{
		System.out.println("m1() in hi");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static void m2()
	{
		System.out.println("m2() in hi");
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
	}
}

public class L16 
{	
	{
		System.out.println("IB in L16");
	}
	static
	{
		System.out.println("SB in L16");
	}
	public static void main(String[] args) 
	{
		System.out.println("----------------------");
		hi.m2();
		System.out.println("----------------------");
		// hi.m1();   not allows
		hi h = null;
		h.m2();
		//h.m1();
		System.out.println("----------------------");
		hi hh = new hi();
		hh.m1();
		System.out.println("----------------------");
		hh.m2();
	

	}

}
