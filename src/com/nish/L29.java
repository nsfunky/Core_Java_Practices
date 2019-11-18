package com.nish;
//  this is a current working object.
class tissi
{
	int a;
	int b;
	static int c=30;
	static
	{
		System.out.println("SB in tissi");
		// System.out.println(this); instance variable can't be access inside static block.
	}
	{
		System.out.println("IB in tissi");
		System.out.println(this);
	}
	public tissi() 
	{
		System.out.println("---Default---");
	    System.out.println(this);
	}
	tissi(int a,int b)
	{
		System.out.println("--Parameter constructor--");
		System.out.println(this);
		this.a=a;
		this.b=b;		
	}
	void show()
	{
		   System.out.println("---show() in tissi---");
		   System.out.println(this);
		   System.out.println(a);
		   System.out.println(b);
		   System.out.println(c);
	}
}

public class L29 
{
	public static void main(String[] args) 
	{
		tissi ti = new tissi();
		System.out.println(ti);
		ti.show();
		tissi tt = new tissi(11,22);
		System.out.println(tt);
		tt.show();

	}

}
