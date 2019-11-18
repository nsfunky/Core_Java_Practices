package com.nish;

public class L06 
{
	int a = 10;
	public static void main(String...  args)  // valid from java5
	{
		L06 st = new L06();
		System.out.println(st.a);
		
		
		/*
		 you can't directly get the value of a directly
		System.out.println(a);   becoz
		Cannot make a static reference to the non-static field a
		*/
		
		
	}

}
