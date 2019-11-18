package com.nish;

class Z
{
	int a,b;
	static int c=30;
	
	Z(){}
	
	public Z(int a, int b) 
	{
		this.a = a;
		this.b = b;
	}
	
	public String toString() 
	{
		return "a of Z: "+this.a+"\nb of Z: "+this.b;
	}
	
	void display()
	{
		System.out.println(toString());
	}
}

//first do the work of sub class

class B extends Z
{
	int q,p;
	public B() {}
	
	public B(int q, int p) 
	{
		super(p*10,q*10);
		this.q = q;
		this.p = p;
	}
	
	public String toString() 
	{
		 return "p of B: "+this.p+"\nq of B: "+this.q+"\na of Z: "+this.a+"\nb of Z: "+this.b;
	}
	
	private void show() 
	{
		System.out.println(toString());
	}
}

// first do the work of sub class

class C extends B
{
	int x,y;
	public C() {}
	
	public C(int x, int y) 
	{
		super(x*10,y*10);
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() 
	{
		 return "x of C: "+this.x+"\ny of C: "+this.y+"\np of B: "+this.p+"\nq of B: "+this.q+"\na of Z: "+this.a+"\nb of Z: "+this.b;
	}
	
	private void show() 
	{
		System.out.println(toString());
	}
}



public class L40
{
	public static void main(String[] args) 
	{
		C c=new C(1,2);
		c.display();
		
		/*
		  during object creation of C type , you have to go first in C class which extends B class
		  So .... first go to B class --- then again ... B is extended Z so ... ultimately goes to 
		  constructor within Z ..... So ...display start fetching from above.
		 */
		
	}

}