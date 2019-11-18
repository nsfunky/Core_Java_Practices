package com.nish;

class Cello
 {
	int a=10,b=20;
	static int c=30;
	void m1()
	{
		System.out.println(".........M1 in Cello............");
		System.out.println("a in Hello...."+a);
		System.out.println("b in Hello...."+b);
		System.out.println("c in Hello...."+c);
		System.out.println(".......end of m1........");
	}
}

// extending more than one class at a time is not allowed here.
// extending a class with itself (cyclic inheritence) is not allowed here.
// multiple or hybrid inheritence is not allowed here(1 child has 1 parent -- OK)
// In java, [ java.lang.Object ] is the super class for all type of classes.
// sub class members can't access directly inside super class.

class Hai extends Cello
 {
	int a=111,b=222;
	static int c=333;
	void show()
	{
		System.out.println(".........show in Hai............");
		System.out.println("a in Hello...."+a);
		System.out.println("b in Hello...."+b);
		System.out.println("c in Hello...."+c);
		System.out.println(".......end of show........");
		m1();
	}
	
}
public class L38
 {
	
	public static void main(String[] args) 
	{
		Hai h=new Hai();
		h.show();
		Cello h1=new Cello();
		h1.m1();
	}

}