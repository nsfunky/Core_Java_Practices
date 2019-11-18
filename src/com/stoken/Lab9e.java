package com.stoken;

public class Lab9e 
{
	public static void main(String[] args) 
	{
		String str = "this is my test";
		String s[] = str.split(" ");
		for (String st : s) 
		{
			System.out.println(st);
			
		}
		System.out.println("---Rearrangement---");
		
        System.out.println(s[2]+"\t"+s[3]+"\t"+s[0]+"\t"+s[1]);
	}

}
