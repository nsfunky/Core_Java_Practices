package com.java;

// TypeCasting & Assignment Operator

public class L9 
{
	public static void main(String[] args) 
	{
		final int x = 19;  
		byte y = x;
		/*
		 * Becoz x is declare as final as static, then compiler only 
		 * check that , whether it is in byte range or not .....
		 */
		System.out.println(y);
		
		int i = 5;
		// byte b = i;  // show u error so to remove that use byte casting
		byte b = (byte)i;
		System.out.println(b);
		

		int a = 66;
		// char ch =a;  Type mismatch: cannot convert from int to char
		char ch =(char) a;
		System.out.println(ch);
		
//		int m = 123.343;  Type mismatch: cannot convert from double to int
		int m = (int) 123.343;
		System.out.println(m);       // 123
		
		int rt = 5476;
		byte by = (byte) rt;
		System.out.println(by);
		System.out.println(Byte.MIN_VALUE+" -- Range -- "+Byte.MAX_VALUE);
		
		long val = 5467;
		byte by1 = (byte) val;
		System.out.println(by1);
		
		int bd = 428;
		byte by2 = (byte) bd;
		System.out.println(by2);
		
		byte x1 = 23;
		byte x2 = 21;
		//byte z = x1+x2; Type mismatch: cannot convert from int to byte
		byte z = (byte) (x1+x2);
		System.out.println(z);
    /*
	boolean bl = 0;Type mismatch: cannot convert from int to boolean
	here zero understands as Integer ... So can't type cast it also.
	*/
				
	}

}
