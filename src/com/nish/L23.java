package com.nish;

class vie
{
	void m1()
	{
		System.out.println("m1() in vie");
	}
	
	void m1(int m)
	{
		System.out.println("m1(int) in vie");
	}
	
	void m1(int... a)
	{
		System.out.println("m1(int...) in vie");
	}
	/*
	void m2(double... d,int a)
	{  double acts as a last parameter
		System.out.println("m2() in vie");
	}
	*/
	void m2(int a,double ... d)
	{
		System.out.println("m2(int,double) in vie");
		for (double e : d) 
		{
			System.out.println(e);
			
		}
	}
	
	/*void m2(double...d,int...a)
	{
		//The variable argument type double of the method m2 must be the last parameter
	}*/
	
	void m2(double...d)
	{
		System.out.println("double...d");
		for (double e1 : d) 
		{
			System.out.println(e1);
			
		}
	}
	
}

public class L23 
{
	public static void main(String[] args) 
	{
		vie v = new vie();
		v.m1();
		v.m1(23);
		v.m1(11,22,33);
		v.m2(11.11,22.22,33.33);
		v.m2(12, 44.44,55.55,77.77);
	}

}
