package com.java;

public class L51 
{
	public static void main(String[] args) 
	{
		int i = 87678;
		
		String binary = Integer.toBinaryString(i);
		
/*
  Parameters: i an integer to be converted to a string.
  Returns:    the string representation of the unsigned integer value represented by the argument in binary (base 2).
*/
		
		String octal = Integer.toOctalString(i);
		String hexa = Integer.toHexString(i);
		String str = Integer.toString(i);
		
		System.out.println(binary);
		System.out.println(octal);
		System.out.println(hexa);
		System.out.println(str);
		
		System.out.printf("\n%d\t%o\t%x", i,i,i);  
		
		//     87678	 253176  	1567e
		
		System.out.printf("\n%d\t%o\t%X", i,i,i);
        //     87678	 253176  	1567E
		
		System.out.println();
		System.out.println("PI = "+Math.PI);
		
	}

}
