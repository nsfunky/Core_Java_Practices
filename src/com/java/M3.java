package com.java;

// Logical Operator

public class M3 
{
	public static void main(String[] args) 
	{
		//  Example related to Logical Not
		
		int res  = 90;
		boolean b1 = (res==90);
		boolean b2 = !(res==90);
		boolean b3 = !b1;
		System.out.println(b1);      // true
		System.out.println(b2);     // false
		System.out.println(b3);    // false
		
		//  Example related to Logical AND
		
		int ab = 14;
		boolean b4 = ab<16 && ab++ < 4;
		System.out.println(b4);    // false
		
		int xy = 14;
		boolean b5 = xy<16 && xy++ <24;
		System.out.println(b5);    // true
		
	//  Example related to Logical OR
		
		int abc = 14;
		boolean b6 = abc>16 || abc++ <4;
		System.out.println(b6);    // false
		
		int xyz = 14;
		boolean b7 = xyz<16 || xyz++ <24;
		System.out.println(b7);    // true
		
		
		
		

	}

}
