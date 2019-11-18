package com.nish;

class A1
{
	int a = 10;
	static int b = 20;
	
	{
		System.out.println("--IB in A");
		int a1 = 111;
	//	static int b1 = 202; Illegal modifier for the variable b1 ;  only final local value is permitted
	 // Becoz it's not act as a static variable
	}
	
	/*
	 * we can't define static variable inside any local context
	 * variable defined inside instance & static block will not 
	 *  be equal to static or instance variable.
	 */
	static
	{
		System.out.println("--SB in A");
		int a2 = 111;
	//	static int b2 = 111;  Illegal modifier for the variable b2; only final is permitted
	}
}


public class L13 
{
	public static void main(String[] args) 
	{
		A1 a = new A1();

	}

}
