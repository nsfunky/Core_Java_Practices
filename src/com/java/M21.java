package com.java;

public class M21 
{
	public static void main(String[] args) 
	{
		String str = "ABC";
		M21 test = new M21();
		Object obj = test.equals(str);
		// Indicates whether str object is "equal to" test object or not.
		// if not then return false otherwise return true.
		System.out.println(obj);    //  false
		
		Object ob = "ABC";
		boolean bl = ob.equals(str);
		System.out.println(bl);    //  true
		
		Object o = str;
		System.out.println(o==test);    // false
		System.out.println(o==str);     // true
		
		o = test;
		System.out.println(o==test);     // true
		System.out.println(o==str);     // false
		
		

	}

}
