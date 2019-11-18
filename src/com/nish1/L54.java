package com.nish1;

abstract class Helloz
{
	 Helloz()
	{
		System.out.println("Default constructor in Hello");
	}
	private Helloz(int a)
	{
		System.out.println("one arg constructor in Hello");
	}
}


class Haiz extends Helloz
{
	Haiz()
	{
		//super();
		System.out.println("Default constructor in Hai");
	}
}


class Hai1z extends Haiz
{
	Hai1z()
	{
		super();
		System.out.println("Default constructor in construction");
	}
} 


public class L54 
{
	public static void main(String[] args) 
	{
		Hai1z hai1=new Hai1z();		

	}

}
