package com.nish;

class A
{
	int a = 10;
	static int b = 20;
	{
		System.out.println("--IB in A");		
	}
	static
	{
		System.out.println("--SB in A");
	}
}

public class L12 
{
	static
	{
	System.out.println("SB in main class");	
	}
	public static void main(String[] args) 
	{
		System.out.println(A.b);

	}

}
