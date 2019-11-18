package com.java;

// If Else Statements ------------------------------------

public class M7 
{
	public static void main(String[] args) 
	{
		if(true)
		{
			System.out.println("Try Block 1");
		}
		if(false)
		{
			System.out.println("Try Block 2");
		}
		
		if(false)
		{
			System.out.println("Try Block 3a");
			System.out.println("Try Block 3b");
			System.out.println("Try Block 3c");
		}
		if(true)
		{
			System.out.println("Try Block 4a");
			System.out.println("Try Block 4b");
			System.out.println("Try Block 4c");
		}
		if(false)
		{
			System.out.println("Try Block 4a");
			System.out.println("Try Block 4b");
			System.out.println("Try Block 4c");
		}
		
		System.out.println("****If----Else****");
		
		int ab = 10;
		if(ab==11)
		{
			System.out.println("If > "+ab);
		}
		else
		{
			System.out.println("Else > "+ab);
		}
		
		int mn = 0;
		if(mn++==0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		if(mn++==1)
		{
			System.out.println("true");
		}
		if(mn++==1)       // false
		{
			System.out.println("Ye nhi ho sakta");
		}
		if(mn++==2)       // false
		{
			System.out.println("Ye ho sakta");
		}
		if(mn++==4)       // true
		{
			System.out.println(mn);
			System.out.println("Ye ho sakta");
		}

		int n = 0;
		if(++n==0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		boolean bol = false;
		
		if(bol)
		{
			System.out.println("reaf bol");
		}
		else
		{
			System.out.println("Write bol");
		}
		
		if(bol = true)
		{
			System.out.println("Assignment Operator");
		}
		
		if(bol == true)
		{
			System.out.println("Assignment Operator");
		}
		
		
		
	}

}
