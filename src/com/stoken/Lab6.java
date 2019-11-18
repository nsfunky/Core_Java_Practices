package com.stoken;

public class Lab6 
{
	public static void main(String[] args) 
	{
		//string split on special character “|”
		
		String str = "Gold Trading|Stocks Trading|Fixed Income Trading|Commodity Trading";
		
		String[] splits = str.split("\\|"); 
		
		// two \\ is required because "\" itself require escaping
		
 // String[] splits = str.split("|");  // separating every single letter of the sentence. 
		
		for(String t: splits)
		{
		    System.out.println(t);
		}
	}

}

