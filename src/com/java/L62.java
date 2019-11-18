package com.java;

public class L62 
{
	public static void main(String[] args) 
	{
		System.out.println(10/3);
		System.out.println(10%3);
		System.out.println(10.0f/3);          // ans will be in float range/
		System.out.println(10.0/3);           // ans will be in Double range/
		System.out.println(0.0 == -0.0);   // true
		// Comparing identical expressions is given here a warning.
		System.out.println(10.0/0.0);     //   infinity means + infinity
		System.out.println(10.0/-0.0);   //  -infinity
		System.out.println(-10.0/0.0);   //  -infinity
	    System.out.println(0.0/0.0);      // NaN
	    
	    System.out.println(Double.POSITIVE_INFINITY);     //  Infinity
	    System.out.println(Double.NEGATIVE_INFINITY);     //  -Infinity
	    System.out.println(Double.NaN);                   //  NaN

	  //  System.out.println(10/0);
	}

}
