package com.java;

public class N4 
{
	public static void main(String[] args) 
	{
		boolean boo[] = new boolean[2];
		
		System.out.println(boo.length);      // 2
		System.out.println(boo[0]);            // false
		System.out.println(boo[1]);            // false
		
		// System.out.println(boo[2]);     java.lang.ArrayIndexOutOfBoundsException: 2

	// 	byte by[] = new int[4];  Type mismatch: cannot convert from int[] to byte[]
		
       // int by[] = new byte[4];  Type mismatch: cannot convert from byte[] to int[]    
		
		//  No casting Here
		
		//double do[] = new double[4];  Syntax error on token "do", Identifier expected
		
		double dau[] = new double[2158525];
		System.out.println(dau.length);        // 2158525
		
		System.out.println(" ----- C ARRAY -----");
		
		int c[] = new int[7];
		System.out.println(c.length);
		
		        c[1]=10;
				c[3]=30;
				c[5]=20;
				
				for (int i = 0; i < c.length; i++) 
				{
					System.out.print("\t"+c[i]);					
				}
				
				System.out.println("\n ----- CheckUp -----\n");
				
		int other[] = c;
		System.out.println(other==c);                 // True
		c = new int[9];
		System.out.println(other==c);                  // False
		
		System.out.println("\n ----- Object Reference  -----\n");
		
		int ref[] = new int[3];
		Object obj = ref;
		System.out.println(ref==obj);           //  True
		System.out.println(ref[0]);                //   0  
		System.out.println(obj);                   // [I@9304b1
		
	}

}
