package com.nish;

public class L05 
{    
  public static void main(String[] args) 
    {
	   int a[][] = new int[3][];   // Dynamic Array Memory Allocation(if one field contains nothing)
	   
	   a[0] = new int[1];
	       a[0][0] = 101;
	   

	   a[1] = new int[2];
	       a[1][0] = 404;
	       a[1][1] = 505;
	   
	   a[2] = new int[4];
	       a[2][0] = 10;
	       a[2][1] = 20;
	       a[2][2] = 30;
	       a[2][3] = 40;
	   
	   System.out.println("Right Now the Size => "+a.length);
	   System.out.println("_______|-|________");
	   
	   for (int i = 0; i < a.length; i++) 
	   {
		   for (int j = 0; j < a[i].length; j++) 
		   {
			   System.out.print(a[i][j]);
			   System.out.print("\t");
		   }
		System.out.println();
	}
	   
	}

}
