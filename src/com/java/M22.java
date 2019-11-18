package com.java;

public class M22 
{
	public static void main(String[] args) 
	{
		System.out.println(Float.NaN != Float.NaN);       // true
		System.out.println(0.0/0.0 != 0.0/0.0);           // true
		
		int a = 10;
		System.out.println("X = "+a == "X = "+a);       // false

		final int b = 10;
		System.out.println("X = "+b == "X = "+b);       // true
	}

}
