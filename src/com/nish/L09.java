package com.nish;

class Helly
{
	int a = 20;               // instance variable
	int b = 20;              // instance variable
	static int c = 20;      // static  variable
	
	void m1()     
	{
		System.out.println("--Instance method m1() inside Hell Class-----");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	
	static void m2()
	{
		System.out.println("-- Static method m2() inside Hell Class----");
		System.out.println(c);
		
				
	}
}

public class L09 
{
	public static void main(String[] args) 
	{
		System.out.println("--main()--");
		Helly h1 = new Helly();
		
		System.out.println(h1.a);
		System.out.println(h1.c);
	}

}