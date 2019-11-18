package com.nish;

class extra
{
	int a;
	int b;
	static int c = 30;
	
	
	
	{  // instance block
		int a = 11;
		int b1;
		System.out.println("IB in Extra");
		{  // local block
			// int a =22;// due to same name of local variable
			int a1 = 33;
			System.out.println("Local block in IB");
			System.out.println(a);
			// System.out.println(b1); The local variable b1 may not have been initialized
			System.out.println(b);
			System.out.println("End of Local block");
		}
	//System.out.println(a1);   a1 cannot be resolved to a variable 
	// No accessing local variable outside local block (till that they destroy also).....	
	}
	
	static
	{
		System.out.println("Sb in Extra");
		{
			System.out.println("Local block in SB ");
			// System.out.println(a);    instance variable can't be accessed within SB
			System.out.println(c);
		}
	}
	
	void m1()
	{
		int a = 11;
		int b = 22;
		int c = 33;
		System.out.println("m1 in Extra");
		{
			int ab = 10;
			System.out.println("local in m1()");
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(this.a);
			System.out.println(this.b);
			System.out.println(this.c);
			System.out.println(ab);
		}
		// System.out.println(ab); can't access outside local block
	}
	
	static void m2()
	{
		int a = 11;
		int b = 22;
		int c = 33;
		System.out.println("m2 in Extra");
		{
			int ab = 10;
			System.out.println("local in m1()");
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			/*System.out.println(this.a);
			System.out.println(this.b);
			System.out.println(this.c);*/
			// can't use this(instance variable) in static context
			System.out.println(ab);
		}
		// System.out.println(ab); can't access outside local block
	}
}

public class L36 
{
	public static void main(String[] args) 
	{
		extra ex = new extra();
		ex.m1();
		extra.m2();
	}

}
