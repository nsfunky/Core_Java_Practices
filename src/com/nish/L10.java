package com.nish;

class well
{
	int a = 20;               // instance variable
	int b = 20;              // instance variable
	static int c = 20;      // static  variable
	
	{
		System.out.println("--IB in Hello--");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	static
	{
		System.out.println("--SB in Hello--");
	//	System.out.println(a);
	//	System.out.println(b);
		System.out.println(c);
		
	}
	
}

public class L10 
{
	public static void main(String[] args) 
	{
		
		well w1 = new well();
		System.out.println(w1);
		System.out.println("SA = "+well.c);

	}

}
