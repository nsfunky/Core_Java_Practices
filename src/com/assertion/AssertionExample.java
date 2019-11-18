package com.assertion;

import java.util.Scanner;

public class AssertionExample 
{
	public static void main(String[] args) 
	{
		try
		{
		  Scanner s = new Scanner(System.in);
		  System.out.println("Enter your age : ");
		  int value = s.nextInt();
		
    	   assert value>=18:"You are not Allowed for Adult Movie";
		
	      System.out.println("You are "+value+" yrs old...You can enjoy the movie.");
		}
		catch(AssertionError e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	/*
	 
	  Before running any code related to assert -> need to enable the assertion, -ea or -enableassertions  (by default. it is disabled)
	  So for enabling the assertion : go to run as -> run configurations --> add "-ea" to virual argument section.
	  
     Assertion:
		Assertion is a statement in java. It can be used to test your assumptions about the program.

		While executing assertion, it is believed to be true. If it fails, JVM will throw an error named AssertionError. It is mainly used for testing purpose.

	 Advantage of Assertion:
		It provides an effective way to detect and correct programming errors.
	  
	 There are two ways to use assertion. 
	   First way is:

		  assert expression;  
      
       Second way is:

		  assert expression1 : expression2;  
	 
	 */

}
