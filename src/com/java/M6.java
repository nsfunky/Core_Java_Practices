package com.java;

// new && instanceof Operator

public class M6 
{	
	public static void main(String[] args) 
	{
		String s1 = new String("JLC");
		String s2 = new String("JLC");
		System.out.println(s1+"\t"+s2);
		System.out.println(s1==s2);
		M6 t1 = new M6();
		M6 t2 = new M6();
		System.out.println(t1+"\t"+t2);
		System.out.println(t1==t2);
		
		int a[] = new int[12];
		System.out.println(a);

		System.out.println(s1 instanceof String);
		Object ref = s1;
		System.out.println("Ref  : \t"+ref);
		System.out.println(ref instanceof String);
		System.out.println(ref instanceof M6);
		System.out.println(s1 instanceof Object);
		
		ref = t2;
		System.out.println("Ref  : \t"+ref);
		System.out.println(ref instanceof String);
		System.out.println(ref instanceof M6);
		System.out.println(s1 instanceof Object);
		
		
	}

}
