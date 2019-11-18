package com.stoken;

import java.util.StringTokenizer;

public class Lab3 
{
	public static void main(String[] args) 
	{
		String s = "thisis\tmy\ntest";
				
		StringTokenizer st = new StringTokenizer(s);
		
		int i=st.countTokens();
		System.out.println("Total number of Tokens = "+(i-1));
		
		while (st.hasMoreTokens()) 
		{
		   System.out.println(st.nextToken());
		}
		
		

	}

}

