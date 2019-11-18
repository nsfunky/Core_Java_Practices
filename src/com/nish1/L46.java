package com.nish1;

class He
{
	void m1()
	{
		System.out.println("m1 in He");
	}
	
	int m2()
	{
		System.out.println("m2 in He");
		return 10;
	}
	
	void m3()
	{
		System.out.println("m3 in He");
	}
}


class Ha extends He
{
	/*
	     if you want to use the super class implementation, Don't override the method inside sub class. just like m1 
	 */
	
	int m2()
	{
		System.out.println("m2 in Ha");
		super.m2();
		/*
		     if you wanted to use sub class as well as super class implementation 
		     i.e.
		     if you want to use new implementation as well as old(existing) implementation also, 
		     then override that method inside sub class like m2() >--- i.e---<    super.m2() 
		 */
		return 20;
	}
	
	void m3()
	{
		System.out.println("m3 in Ha");
	}
	
}


public class L46 
{
	public static void main(String[] args) 
	{
		Ha h = new Ha();
		h.m1();
		h.m2();
		h.m3();

	}

}
