package com.java;

public class N2 
{
	public static void main(String[] args) 
	{
		System.out.println( " ---- A ----");
		
		int a[] = null;
		System.out.println(a);                      //   null
		//System.out.println(a[0]);             // Null Pointer Exception
		// System.out.println(a.length);     // Null Pointer Exception
		
		System.out.println( " ---- B ----");
		
		int b[] = new int[2];
		System.out.println(b);                  //  [I@3e25a5     here I for integer type
		System.out.println(b.length);     //    2
		System.out.println(b[0]);            //    0
		System.out.println(b[1]);             //    0
		
		System.out.println( " ---- C ----");
		
		int c[] = new int[3];
		// System.out.println(c[3]);          //    java.lang.ArrayIndexOutOfBoundsException: 3
		
		System.out.println( " ---- D ----");
		
		int d[] = new int[0];
		System.out.println(d.length);     //  0 
		System.out.println(c[0]);             //  0
		
		System.out.println( " ---- Use of Command Line Argument ----");
		
		for(int i=0;i<2;i++)
		{
			System.out.println(Integer.parseInt(args[i]));
		}
		
		System.out.println( " ---- E ----");
		
		int e[][] = new int[2][2];
		System.out.println(e);                //     [[I@19821f   // integer started with I
	

		System.out.println( " ---- F ----");
		
		float f[][] = new float[2][2];
		System.out.println(f);                //     [[F@addbf1   // Float started with F
	
        System.out.println( " ---- G ----");
		
		String g[][] = new String[2][2];
		System.out.println(g);                //     [[Ljava.lang.String;@42e816 -- String started with.
	
		System.out.println( " ---- ARGS ----");
		
		System.out.println(args.length); 
		
		// becoz 2 values are entered through Command line
		
		System.out.println( " ---- Initialization Based ----");
		
		int h[] = new int[]{10,20,30};
		System.out.println(h[0]);
		System.out.println(h[1]);
		System.out.println(h[2]);
		// System.out.println(h[3]);     //  java.lang.ArrayIndexOutOfBoundsException: 3
		
		System.out.println( " ---- 2D_Initialization Based ----");
		
		
	}

}
