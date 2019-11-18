package com.nish;

class A2
{
	static final int a = 20;
	static
	{
		System.out.println("--IB in A2");		
	}
	static
	{
		System.out.println("--SB in A2");
	}
}


public class L14 
{
	public static void main(String[] args) 
	{
		System.out.println(A2.a);

	}

}
