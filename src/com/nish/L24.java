package com.nish;

/*
 * when u are calling any method without passing any parameter, if the method 
 * without corresponding parameter is not available then preference will be given to 
 * the vararg method
 */

class set
{
	
}

class seta
{
	void m1(int...a)
	{
		System.out.println("m1(int...a)");
	}
	/*
	void m1(int[] a)
	{
		System.out.println("m1(int...a)");
	}
	
	void m1(int a[])
	{
		System.out.println("m1(int...a)");
	}*/
	
/*	void m1(set se)
	{
		System.out.println("m1(set se)");
	}
*/	
	/*
	void m1(String... str)
	{
		System.out.println("m1(String... str)");
	}
	
	void m1(Object ob)
	{
		System.out.println("m1(object ob)");
	}
*/	
}

public class L24 
{
	public static void main(String[] args) 
	{
		seta sk = new seta();
		// sk.m1(); not allow due to method m1(int[]) is ambigous for type seta
		sk.m1(12,45,56);
		
		/*
		sk.m1(null);
		The method m1(int[]) is ambiguous for the type seta
		so first decode various same type of methods
		*/
		
		sk.m1(null);
	}

}
