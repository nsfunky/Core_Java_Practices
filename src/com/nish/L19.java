package com.nish;

class ai
{
	// super class
}

class aii extends ai
{
	// sub class
}

class ello
{
	void m1(byte b)
	{
		System.out.println("byte");
	}
	void m1(short s)
	{
		System.out.println("short");
	}
	void m1(int i)
	{
		System.out.println("int");
	}
	void m1(long l)
	{
		System.out.println("long");
	}
	
	void m1(ai a)
	{
		System.out.println("m1(ai class)");
	}
	
	void m1(aii a)
	{
		System.out.println("m1(aii class)");
	}
	/*
	void m1(String s)
	{
		System.out.println("m1(String)");
	}
	*/
	void m1(Object ob)
	{
		System.out.println("m1(object)");
	}	
	
}

public class L19 
{
	public static void main(String[] args) 
	{
		ello lo = new ello();
		lo.m1(10);
		lo.m1((byte)12);
		/*
		   lo.m1(null); 
		 The method m1(ai) is ambiguous for the type ello
		  so for that, we have to block some m1() method of similar object type 
		  reference variable.....then it works....
        */
		
		lo.m1(null);
		
	}

}
