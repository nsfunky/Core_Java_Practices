package com.nish;

class Hello
{  // these are Instance variable becoz directly declared inside class
	int a =30;
	int b =20;
} // So can not access it, without creating any object reference(Object)

public class L07 
{
	public static void main(String[] args) 
	{
		Hello h1 = new Hello();
		System.out.println("Instance variable a = "+h1.a);
		System.out.println("Instance variable b = "+h1.b);
	}

}
