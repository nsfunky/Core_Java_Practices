package com.nish;

class kk 
{
	public kk() 
	{
		System.out.println("Default");
	}
	kk(int a)
	{
		this();
		System.out.println("1-param-caonstructor");
	}
	kk(int...a)
	{
		this(a[0]);
		System.out.println("var-arg");
	}
	
}

public class L33 
{
	public static void main(String[] args) 
	{
		kk ob = new kk(11,22);
	}
}
