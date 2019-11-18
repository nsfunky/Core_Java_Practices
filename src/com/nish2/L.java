package com.nish2;

class XxX implements Cloneable
{
	int a=10;
	int b=20;
	void m1() throws CloneNotSupportedException
	{
		this.clone();
		System.out.println("Nishant");
	}
}

/*
    Don't write protected keyword within interface (you can --- but no importance)
 */

public class L 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		XxX x = new XxX();
		/*try
		{
		  x.m1();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}*/
		x.m1();
		System.out.println("--------------");
		

	}

}
