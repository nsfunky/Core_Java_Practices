package com.java;

public class M9b 
{
	public static void main(String[] args) 
	{
		int mn=0;
		String st = "ok";
		char ch = 'A';
		float f1 = 0f;
		for (mn=0, ch='A';mn<5 ;mn++)
		{
			System.out.println(mn+"\t"+ch);
		}
		
		for(mn=10,st="JLC",ch='a',f1=12.31F ; mn<15 ; mn++,ch+=2,f1+=10,st+=ch)
		{
			System.out.println(mn+"\t"+ch+"\t"+f1+"\t"+st);
		}

	}

}
