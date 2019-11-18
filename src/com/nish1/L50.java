package com.nish1;

class Ax
{
	void m1()
	{
		System.out.println("M1 in A");
	}
	void mm1()
	{
		System.out.println("MM1 in A");
	}
	
}

class Bx extends Ax
{
	void m1()

	{
		System.out.println("M1 in B");
	}
	void mm2()
	{
		System.out.println("MM2 in B");
	}
}

class Hellox
{
	Ax m11()
	{
		System.out.println("M11 in Hellox");
		return new Ax();
	}
	
	Bx m22()
	{
		System.out.println("M22 in Hellox");
		return new Bx();
	}
	
	Bx m33(Bx b1)
	{
		System.out.println("M33 in Hellox");
		return b1;
	}
	
	Ax m44(Ax a1)
	{
		System.out.println("M44 in Hellox");
		return a1;
	}
}

class Haix extends Hellox
{
	Ax m11()
	{
		System.out.println("M11 in Haix");
		return new Ax();
	}
	
	Bx m12()
	{
		System.out.println("M11 in Haix");
		return new Bx();
	}
	/*Ax m22()
	{
		return new Bx();
	}*/
	Bx m33(Bx b1)
	{
		System.out.println("M33 in Hai");
		return b1;
	}
	Ax m44()
	{
		System.out.println("M44 in Hai");
		return new Ax();
	}
}

public class L50 
{
	public static void main(String[] args) 
	{
		Hellox h1=new Haix();
		Ax a1=h1.m11();
		a1.m1();
	}

}