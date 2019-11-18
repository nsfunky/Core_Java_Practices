package com.java;

// Relational Operator

public class M2 
{
	public static void main(String[] args) 
	{
		System.out.println(10>78);      //   false
		System.out.println(10>=78);    //   false
		System.out.println(10>=10);    //   true
		System.out.println(10<78);    //   true
		System.out.println(10<=78);    //   true
		System.out.println(10<=10);    //   true
	// warning for 	Comparing identical expressions
		System.out.println(65==65);    //   true
		System.out.println(65==65l);    //   true
		System.out.println(65==65f);    //   true
		System.out.println(65==65.0f);    //   true
		System.out.println(65==65.0);    //   true
		System.out.println(65=='A');    //   true
		
		// System.out.println(true>=true);
		System.out.println(true==true);      //   true
		System.out.println(false==false);    //   true
		System.out.println(true==false);    //   false
		
		String st1 = "JLC";
		String st2 = "JLC";
		String st3 = new String("JLC");
		System.out.println(st1+"\t"+st2+"\t"+st3);
		// JLC	JLC	JLC
		System.out.println(st1==st2);  // true
		System.out.println(st1==st3);  // false
		

	}

}
