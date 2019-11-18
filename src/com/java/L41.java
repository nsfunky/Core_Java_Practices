package com.java;

public class L41 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.MIN_VALUE + "  Integer Range  "+Integer.MAX_VALUE);
		/*
		 Range of Integer   [ -2147483648   to   2147483647  ]   -(2)31    ---   (2)31  -1
		 So, any attempt after these giving u an error ... 
		*/	
		int ab = 2147483647;
		System.out.println(ab);
		
		System.out.println(Long.MIN_VALUE+ "  Long Range  "+Long.MAX_VALUE);
		long l1 = 2147483647;
		//long l1 = 2147483648;  error becoz not in Int range
		System.out.println(l1);
		
		long l2 = 2147483648l; // specifying l at last so ... within long range.
		System.out.println(l2);
		
		System.out.println(2147483647);
		
		System.out.println(2147483647+100);
		System.out.println(2147483647+100l);
		
		long ll = 45258;
		System.out.println(ll);
		
		long lk = 45258l;
		System.out.println(lk);
		
		System.out.println(Byte.MIN_VALUE +" --Byte Range-- "+Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE +" --Short Range-- "+Short.MAX_VALUE);
		System.out.println(Float.MIN_VALUE +" --Float Range-- "+Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE +" --Double Range-- "+Double.MAX_VALUE);
		
	}

}
