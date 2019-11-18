package com.java;

public class L42 
{
	public static void main(String[] args) 
	{
		System.out.println("-- OctaL --");
		byte a = 017;
		System.out.println(a);
		
		/*
		octal to decimal conversion
		abc = c*pow(8,0) + b*pow(8,1) + a*pow(8,2)
		*/
		
		int b = 04666;   // 04667 gives u an error ....
		System.out.println(b);
		
/*
 * int c = 09;
 * The literal 009 of type int is out of range .so try for others.
 */
		
		int d = 07676;
		System.out.println(d);
		
		System.out.println(" -- Decimal --");
		
		int e = 98987789;
		System.out.println(e);
		
		byte by = 123;
		System.out.println(by);
		
		System.out.println(" -- HexaDecimal --");
		
		// int rt = 43a65;    error
		int rt = 0x43a65;
		System.out.println(rt);
		
		byte byt = 0xf;
		System.out.println(byt);
		
		
	}

}
