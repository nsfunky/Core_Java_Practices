package com.nish;

public class L02 
{
	public static void main(String[] args) 
	{
		String s1 = "c:\\program:\\C";
		System.out.println(s1);

		String s2 = "c://program://u";
		System.out.println(s2);
		
		//String s3 = "c:\\program:\\user";   
		/*
		  invalid unicode becoz \\u acts as unicode for this understandable compiler
		 String literal is not properly closed by a double-quote
		 MEANS whether u commented your Line .... but compiler read it as line by line
		 Now after that --- he decided an error.....2 u 
		 */
		//System.out.println(s3);
	}

}
