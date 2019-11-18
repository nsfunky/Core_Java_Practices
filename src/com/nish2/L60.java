package com.nish2;

//package com.p2;
class Outery
{
	int a=10;
	private int b=20;
	class Inner
	{
		int aa=111;
		private int bb=222;
		void m1()
		{
			System.out.println("M1 in Inner");
			System.out.println(a);
			System.out.println(b);
			System.out.println(aa);
			System.out.println(bb);
		}
	}
	void m2()
	{
		int ab=22;
		System.out.println("M2 in Outer");
		System.out.println(a);
		System.out.println(b);
		System.out.println(ab);
		Inner i1=new Inner();
		System.out.println("In M2 aa: "+i1.aa);
		System.out.println("In M2 bb: "+i1.bb);
	}
}

class L60
{
	public static void main(String args[])
	{
		Outery otr=new Outery();
		Outery.Inner oi1=otr.new Inner();
		otr.m2();
		oi1.m1();
	}
}
