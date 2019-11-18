package com.nish;

class hate
{
	int a=10;
	final int b;
	public hate(int b) 
	{
	    this.b = b;
	}
	void m1()
	{
		System.out.println("--m1 in hate");
		System.out.println(b);
	}
}

public class L31 
{
	public static void main(String[] args) 
	{
		hate h = new hate(11);
		h.m1();
		hate ha = new hate(22);
		ha.m1();
		
	}

}