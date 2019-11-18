package com.nish;

class sikh
{
	int a=10;
	static int b=20;
	
	{
		System.out.println("IB in Sikh");
		int a=11;
		int b=22;
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this);
		// System.out.println(super.hashCode());   OK  -- But simply -- System.out.println(super);  
	}
	
	static
	{
		System.out.println("SB in Sikh");
		int a=111;
		int b=222;
		System.out.println(a);
		System.out.println(b);
		
		// this  (or)  super both are instance variable so can't access within static context.
		
		//System.out.println(this.a);   
		//System.out.println(this.b);
		//System.out.println(this);
		
		// System.out.println(super.hashCode());   OK  -- But simply -- System.out.println(super);  
	}
}

class isai extends sikh
{
	int a= 101;
	static int b=202;
	
	{
		System.out.println("IB in Isai");
		int a=101;
		int b=202;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(this.a);   
		System.out.println(this.b);
		
		System.out.println(super.a);
		System.out.println(super.b);
		
		// System.out.println(super); 
	}
	
	static
	{
		System.out.println("SB in Isai");
		int a=15;
		int b=25;
		System.out.println(a);
		System.out.println(b);
		
		// this  (or)  super both are instance variable so can't access within static context.
		
		//System.out.println(this.a);   
		//System.out.println(this.b);
		//System.out.println(this);
		//System.out.println(super.a);   
		//System.out.println(super.b);
		//System.out.println(super);
				
		
		// System.out.println(super.hashCode());   OK  -- But simply -- System.out.println(super);
		
		System.out.println(A.b);
		// System.out.println(B.b);
	}
	
}

public class L43 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1);
		
	}

}

