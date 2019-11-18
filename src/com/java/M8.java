package com.java;

// using Switch Statement

public class M8 
{
	public static void main(String[] args) 
	{
		int ab = 89;
		switch(ab)
		{
		case 56:
			  System.out.println("56 mil gyaa");
		case 60:
			System.out.println("60 mil gyaa");
		case 80:
			System.out.println("80 mil gyaa");
		case 89:
			System.out.println("89 mil gyaa");
		case 95:
			System.out.println("89 ke niche sab milegaa");
		case 100:
			System.out.println("Mila naa");
		}
		
		System.out.println("---------------------------------");
	// To avoid the free fall -- use break(unconditional ctrl statement)
		
		switch(ab)
		{
		case 56:
			  System.out.println("56 mil gyaa");
			  break;
		case 60:
			System.out.println("60 mil gyaa");
			break;
		case 80:
			System.out.println("80 mil gyaa");
			break;
		case 89:
			System.out.println("89 mil gyaa");
			break;
		case 95:
			System.out.println("95 mil gaya");
			break;
		case 100:
			System.out.println("100 Mil gyaa");
			break;
		}
		

	}

}
