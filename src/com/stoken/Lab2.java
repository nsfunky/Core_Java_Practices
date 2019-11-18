package com.stoken;

import java.util.StringTokenizer;

public class Lab2 
{
	public static void main(String[] args) 
	{
		String s = "this-is-my-test";
			
		StringTokenizer st = new StringTokenizer(s,"-");
		
		while (st.hasMoreTokens()) 
			{
			   System.out.println(st.nextToken());
			}

	}

}

