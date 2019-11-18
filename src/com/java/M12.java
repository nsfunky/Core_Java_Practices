package com.java;

public class M12 
{
	public static void main(String[] args) 
	{
		int i=10;
		int j = ++i + ++i + ++i;
		int k = ++i + ++i + i++;
		int l = ++i + i++ + ++i;
		int m = ++i + i++ + i++;
		int n = i++ + i++ + i++;
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
