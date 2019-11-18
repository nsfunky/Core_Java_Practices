package com.nish;

class A3
{
	{
		System.out.println("--IB in A3");		
	}
	static
	{
		System.out.println("--SB in A3");
	}
	void m1()
	{
		System.out.println("m1 in A3");
	}
}


public class L15 
{
	public static void main(String[] args) throws Exception
	{
		Class cls = Class.forName("com.som.A3");
		String cname = cls.getName();
		System.out.println(" Cname :: "+cname);
		A3 a = (A3) cls.newInstance();  // typecasting for class to object
		A3 a1 = new A3();
		if(a instanceof A3)
		{
			a.m1();
		}
		else if (a1 instanceof A3) 
		{
			a1.m1();
			
		}

	}

}
