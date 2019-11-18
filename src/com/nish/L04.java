package com.nish;

public class L04 
{
	public static void main(String[] args) 
	{
		System.out.println(args.length);       // 0
		// Initially we only put these values from CLA  12 56 
		for (int i = 0; i < args.length; i++)
		{
			System.out.println(args[i]);         // 12 & 56 
			
		}
		int i1 = Integer.parseInt(args[0]);
		int i2 = Integer.parseInt(args[1]);
		int i3 = (i1>i2)?i1:i2;
		System.out.println(i3);                         //  56
		
		
		int i4 = Integer.parseInt(args[4]);
		int i5 = Integer.parseInt(args[6]);
		int i6 = (i4>i5)?i4:i5;
		System.out.println(i6);                         //99
		
		
		// As we put these values from CLA  12 56 23  66 77 88 99 0000

	}

}
