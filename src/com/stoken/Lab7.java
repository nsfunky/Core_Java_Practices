package com.stoken;

public class Lab7 
{
	public static void main(String[] args) 
	{
		//string split on special character “.”
		
		String str = "Apple IPhone.HTC DZire.Nokia Asha.Samsung Galaxy";
		
		String[] splits = str.split("\\.");
	
		for(String s: splits)
			{
			   System.out.println(s);
			}
	}

}

