package com.nish2;

class Hello1
{
}

class Outer1
{
  interface I1    //  i can also write interface within a class
	{
		int a=10;
		void m1();
	}
	interface I2
	{
		int b=20;
		void m2();
	}
	abstract class Inner1 implements I1,I2
	{
		public void m1()	
		{
			System.out.println("M1 in Inner1");
		}
	}
	class Inner2 extends Inner1
	{
		public void m2()
		{
			System.out.println("M2 in Inner2");
		}
		void show()
		{
			System.out.println("Show in Inner2");
			System.out.println(a);
			System.out.println(b);
		}
	}	
	void showAll()
	{
		System.out.println("ShowAll in Inner1 class");
		I1 i1=new Inner2();
		I2 i2=new Inner2();
		i1.m1();
		//i1.m2();
		//i2.m1();
		i2.m2();
	}

}
class Inner2 extends Hello1
{
}

class L58
{
	public static void main(String args[])
	{
		Outer1 otr=new Outer1();
		Outer1.I1 oi1=null;
		oi1=new Outer1().new Inner2();
		oi1.m1();
		new Outer1().new Inner2().show();
		otr.showAll();
	}
}