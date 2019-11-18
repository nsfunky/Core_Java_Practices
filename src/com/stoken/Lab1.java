package com.stoken;

import java.util.StringTokenizer;

public class Lab1 
{
	public static void main(String[] args) 
	{
		String s = "this is my test";
		
	// 	String s1=null;
		
		StringTokenizer st = new StringTokenizer(s);
		
		while (st.hasMoreTokens()) 
		{
		   System.out.println(st.nextToken());
		}

	}

}

