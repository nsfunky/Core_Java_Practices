package com.nish;

class sir
{
	public static void main(String[] args) 
	{
		System.out.println("main(String[] args in sir)");		
	}
}

/*
 * Alwayz line processing will be done first and then the returned type wil be processed.
 */

public class L21 
{
	static
	{
		sir s = new sir();
		String args[] = {"Nishant"};
		main(args);
	}
	public static void main(String[] args) 
	{
		System.out.println("main(String[] args in L21)"+args);
		main("abc");
		main(111);
		main(11.21);
	}
	
	public static void main(String args)
	{
		System.out.println("main(String args)");
	}
	
	public static void main(int args)
	{
		System.out.println("main(int args)");
	}

	public static void main(double args)
	{
		System.out.println("main(double args)");
	}
}
