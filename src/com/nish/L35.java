package com.nish;

class mainy
{
	L35 k = new L35();
    public mainy() 
    {
		System.out.println("Default constructor");
	}
}

public class L35 
{
	static mainy ma = new mainy();       //   1-time memory allocation
	public static void main(String[] args) 
	{
		System.out.println("In main");
		mainy ma = new mainy();

	}

}
