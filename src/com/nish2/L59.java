package com.nish2;

class Hellox
{
}

class Outerx 
{
	void m1()
	{
		System.out.println("M1 in Outer");
	}
	
	/*class Inner extends Hello
	{
		void m22()
		{
			System.out.println("M22 in InnerHello");
		}
	}*/
	
	class Inner extends Outerx
	{
		public void m1()
		{
			System.out.println("M1 in InnerOuter");
		}
		void m3()
		{
			System.out.println("M3 in InnerOuter");
		}
	}
}

class L59
{
	public static void main(String args[])
	{
		Outerx otr=new Outerx();
		otr.m1();
		//Hello h1=new Hello().new Outer().new Inner();
		Outerx otr1=new Outerx().new Inner();
		otr1.m1();
		new Outerx().new Inner().m3();
	}
}
