package com.nish;

// A constructor() method is can't called inside any local block .

class c1
{
	public c1()      // u may/may not use public access specifier 
	{
			System.out.println("default constructor");
	}
	c1(int a)
	{
		System.out.println("param-constructor");
	}
	c1(int a,int b)
	{
		System.out.println("2-param-constructor");
		return;
		//  this is empty return statement so u can use this within any constructor
		//  rest of any return statement can't allowed in constructor.
	}
	
	
	public c1(c1 ck)
	{
		
	}
	
	// the method having name of class and uses the return type termed as local method. 
	//-----------------------------------------------------------
	
	void c1()
	{
		System.out.println("c1 in c1");
	}
	
	int c1(int a)
	{
		System.out.println("c1(int a) in c1");
		return a;
	}
	
	c1 c1(c1 c)
	{
		return c;
	}
	
	/*
	 c1---return the reference of type c1
	 c1---c1() method
	 (c1 c) -- passing reference variable of c1 within c1() method.
	*/
	
	//-----------------------------------------------------------
	
	void show()
	{
		System.out.println("show()in c1");
	}
}

public class L27 
{
	public static void main(String[] args) 
	{
		System.out.println("-----------------");
		c1 ck = new c1();
		ck.c1();
		System.out.println("-----------------");
		c1 ck1 = new c1(111);
		ck1.show();
		System.out.println("-----------------");
		c1 ck2 = new c1(ck);
		ck2.show();
		System.out.println("-----------------");
		c1 ck3 = new c1(ck1);
		ck3.show();
		
	}

}
