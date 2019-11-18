package com.nish;

class stak
{
	stak(stak h)
	{
		System.out.println("1-param-constructor");
	}
	public stak() 
	{
		// this(this);  can't refer to (this or super),while explicitly invoking the constructor.
		//this(new stak(this));
		
		this(new stak(new stak()));
		System.out.println("Default constructor");	
	}
}

public class StackOverflow 
{
	public static void main(String[] args) 
	{
		stak st = new stak();

	}

}
