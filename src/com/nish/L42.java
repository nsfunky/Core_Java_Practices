package com.nish;

class kut
{
	int a=10,b=20;
	static int c =30;
	
	public kut() 
	{
		System.out.println("--def : cons : kut--");
	}
	
	void k1()
	{
		System.out.println("kut-salaaa");
	}
	
}

class kuta extends kut
{
	int a=15,b=25;
	static int c =35;
	
	public kuta() 
	{
		// super();
		System.out.println("--def : cons : kuta--");
	}
	
	void k1()
	{
		System.out.println("******");
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println("-------");
		System.out.println("kuta-salaaa");
	}
	
}



public class L42
{
	public static void main(String[] args) 
	{
		System.out.println("-------");
		
		kut k = new kuta();
		
		System.out.println(k.a);
		System.out.println(k.b);
		
		k.k1();

	}

}