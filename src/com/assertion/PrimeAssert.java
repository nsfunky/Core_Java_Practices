package com.assertion;

import java.util.Scanner;

public class PrimeAssert 
{
	public static void main(String[] args) 
	{
	  try
	   {
		  int flag=0;
		  Scanner s = new Scanner(System.in);
		  System.out.println("Check your Number : ");
		  int n = s.nextInt();
		
		 assert n>=2 : "Prime number must be >= 2 ";
		 
		  for (int i = 2; i < n ; i++) 
		  {
			  if (n%i==0)
			  {
				   flag++;				
			  }
		  }
		  if (flag==0) 
		  {
			  System.out.println("Number is Prime");  			
		  } 
		  else 
		  {
			  System.out.println("Number is not Prime");
		  }
			
		}
		
		catch(AssertionError e)
		{
			System.out.println(e.getMessage());
		}

	}

}
