package com.java;

// Integer Literals

public class L4 
{
	public static void main(String[] args) 
	{
		System.out.println("----------------------------");
		int i=10;
		System.out.println(i);
		int j = ++i + ++i + ++i;
		System.out.println(i);
		int k = ++i + ++i + i++;
		System.out.println(i);
		int l = ++i + i++ + ++i;
		System.out.println(i);
		int m = ++i + i++ + i++;
		System.out.println(i);
		int n = i++ + i++ + i++;
		System.out.println("----------------------------");
		System.out.println(j);    // 36
		System.out.println(i);                 // 25
		System.out.println(k);   // 44
		System.out.println(i);                 // 25 
		System.out.println(l);    // 53
		System.out.println(i);                // 25
		System.out.println(m);   // 61
		System.out.println(i);                // 25
		System.out.println(n);   // 69
		System.out.println(i);                // 25

	}

}
