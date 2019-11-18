package com.nish2;

/*
  1)  when a class implements 1 or more interfaces, the methods defined with same signature                           
      in one or more interfaces ----   needs to be overridden ----  only once.
   
  2)  if the multiple interfaces are having the same variable name,
      then you can't access directly inside the sub classes. Because
      Ambiguity problem came, ---------------in order to access common variable----------------
      you need to access with the corresponding interface name. i.e.  I13.x  &  I16.x          
*/

interface I11
{
	int a=10;
	void m1();
}

interface I12
{
	public static final int b=20;
	public abstract void m2();
}

interface I13 extends I11,I12
{
	int x=88;
	void m3();	
}

interface I14
{
	int c=40;
	void m4();
}

interface I15
{
	public static final int d=50;
	public abstract void m5();
}

interface I16 extends I14,I15
{
	int x=99;
	void m3();
}

class HelloK implements I13,I16
{
	public void m1()
	{
		System.out.println("M1 in Hello");
	}
	public void m2()
	{
		System.out.println("M2 in Hello");
	}
	public void m3()
	{
		System.out.println("M3 in Hello");
	}
	public void m4()
	{
		System.out.println("M4 in Hello");
	}
	public void m5()
	{
		System.out.println("M5 in Hello");
	}
	public void m6()
	{
		System.out.println("M6 in Hello");
	}
	void show()
	{
		System.out.println("Show in Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		// System.out.println(x);  ambiguous field
		System.out.println(I13.x);
		System.out.println(I16.x);
	}
}

class L56
{
	public static void main(String args[])
	{
		I13 i3=null;
		I16 i6=null;
	
		i3=new HelloK();
		i6=new HelloK();
		
		i3.m1();
		i3.m2();
		i3.m3();
		
	//	we can't call i3.m4()  because m4()  method signature is not available in i11,i12,i13 interface anywhere.  
		
		// i3.m4();
		// i3.m5();  these methods are undefined for i3.
		
		// i6.m1()   these methods are undefined for i6.
		
		i6.m4();
		i6.m5();
  	    
		//i6.m6();
		
		HelloK h1=new HelloK();
		h1.show();
	}
}