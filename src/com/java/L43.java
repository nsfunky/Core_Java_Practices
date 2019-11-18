package com.java;

// Integer Literals

public class L43 
{
	public static void main(String[] args) 
	{
		
		int i=10;
		
	//	int j = ++i + i++ + foo(i++) +i + ++i + foo(i++) + i + foo(++i) + --i + foo(--i) + ++i + foo(i--);
		
		int j = ++i + i++ + foo(i++);
		System.out.println(i);
		System.out.println(j);    
		
		
	}

	private static int foo(int i) 
	{
		return ++i;
	}

}
