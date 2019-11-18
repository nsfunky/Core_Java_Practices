package com.nish;

class s1
{
	int a;
	int b;
	static int c = 30;
	public s1() 
	{
		System.out.println("default");
	}
	s1(int a)
	{
		System.out.println("parameter");
		a=a;
	}
	s1(int...a)
	{
		System.out.println("vararg parameter");
		System.out.println(a.length);
		this.a = a[0];
		b = a[1];
		c = a[2];
	}
	
	void m1()
	{
		System.out.println("m1() in s1");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

public class L28 
{
	public static void main(String[] args) 
	{
		s1 s = new s1();
		s.m1();
		s1 p = new s1(111);
		p.m1();

		s1 q = new s1(11,22,33);
		q.m1();

	}

}
