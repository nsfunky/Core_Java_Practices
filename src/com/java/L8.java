package com.java;

// Assignment Operators

public class L8 
{
	public static void main(String[] args) 
	{
		int i = 90;
		final int f;
		int j =i;
		f =i;    
	/*
	   f=34;          ---------- Error ---------------   
	   The final local variable f may already have been assigned
	   Any attempts to Override the values throws an error.
	 */
		
		i = 45;
		// f=i;   -- final local variable f may already have been assigned
		System.out.println(f);
		
		int res = 12 + 20*2/10;
		System.out.println(res);
		
		/*
		   working order Priority {{   *  >   /   >   %  	>	+   >  −    }} L --> R
		*/
		
//	   int res2 = i>f;   Type mismatch: cannot convert from boolean to int.
		boolean res2 = i>f;
		System.out.println(res2);
		
		boolean res3 = j==f;
		System.out.println(res3);

 		char ch = 'A';
 		int m = ch;
 		System.out.println(m);
 		
 		byte b1 = 78;
 		char c= (char) b1;
 		System.out.println(c);
 		
 		int x = b1;
 		long lg = ch;
 		System.out.println(lg);
 		long lg1 = x;
 		System.out.println(lg1);
 		
 		final int a1 = 12;
 		final int a2 = 12;
 		byte b2 = a1+a2;
 		System.out.println(b2);
 		
 		final int rt = 110;
 		byte by = rt;    // it is in range of byte.
 		System.out.println(by);
 		
 		final long ty = 110;
 	// byte by1 = ty;   Type mismatch: cannot convert from long to byte
 		System.out.println(ty);
 		byte by1 = 'A';    // thier ASCII value is in range (65)so contained it
 		System.out.println(by1);
 		
 		char  cr = 'A';
 // byte by2 = cr; Type mismatch: cannot convert from char to byte
 		byte by2 = (byte) cr;  // for this u've to typecast it.
 		System.out.println(by2);
 		
 		final char cr1 = 'A';
 		byte by3 = cr1;
 		System.out.println(by3);

	}

}
