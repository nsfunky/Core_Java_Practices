package com.nish;

class cons
{
	int a= 10;
	int b =20;
	static int c = 30;
	cons() 
	{
		System.out.println("Default Constructor");
		// TODO Auto-generated constructor stub
	}
	cons(int a1,int b1)
	{
		a=a1;
		b=b1;
		System.out.println("Parameterized Constructor");
	}
	void show()
	{
		System.out.println("--Show() in cons--");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

public class L25 
{
	public static void main(String[] args) 
	{
		cons cs = new cons();
		cs.show();
		cons cs1 = new cons(11,22);
		cs1.show();
		/*
		 * when u created another object,different memory will be allocated
		 * for the Instance variable,but static variable value will be same 4 all object.
		 */
		cons cs2 = new cons(12,22);
		cs2.show();
		

	}

}
