package com.nish;

class cancer
{
	int a= 10;
	int b =20;
	static int c = 30;
	
	public cancer() 
	{
		System.out.println("Default Constructor");
	}
	
	  {
            System.out.println("IB in cancer");
      }
	  static
	  {
		  System.out.println("SB in cancer");
	  }
	  
	cancer(int a1,int b1)
	{
		a=a1;
		b=b1;
		System.out.println("Parameterized Constructor");
	}
	void show()
	{
		System.out.println("--Show() in cancer--");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

class kall
{
	static
	{
		System.out.println("SB in kall");
	}
}

public class L26 
{
	{
		System.out.println("IB in L26");
	}
	static
	{
		System.out.println("SB in L26");
	}
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.som.kall");
		System.out.println("---------------");
		System.out.println(cancer.c);
		System.out.println("---------------");
		cancer can = new cancer();
		can.show();
		System.out.println("---------------");
		cancer can1 = new cancer(12, 34);
		can1.show();
	

	}

}
