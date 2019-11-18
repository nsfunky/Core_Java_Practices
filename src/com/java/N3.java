package com.java;

public class N3 
{
	public static void main(String[] args) 
	{
		int a[][] = new int [][]{{10,20},{10,20,30}};
		System.out.println(a.length);                    //  2
		System.out.println(a[0].length);               //  2
		System.out.println(a[1].length);               //  3
		// System.out.println(a[2].length);  java.lang.ArrayIndexOutOfBoundsException: 2
System.out.println("---------Separator---------");
		int b[][] = new int [][]{{10,20},{10,20,30},{50}};
		System.out.println(b.length);                 //  3
		System.out.println(b[0].length);            //  2
		System.out.println(b[1].length);             //  3
		System.out.println(b[2].length);             //  1
		
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b[i].length; j++) 
			{
				System.out.print("\t"+b[i][j]);
				System.out.println();
				
			}
			
		}
	}

}
