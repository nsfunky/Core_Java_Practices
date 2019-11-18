package com.nish;

//  SB > IB > default constructor  [ Loading Style ]

class M
{
	int a,b;
	static int c=30;
	
	{
		System.out.println("IB in M");
	}
	
	static
	{
		System.out.println("SB in M");
	}
	
	public M() 
	{
		System.out.println("Default constructor-M");
	}
	
	M(int a)
	{
		System.out.println("1-param constructor");
		this.a=a;
	}
	
	M(int a,int b)
	{
		System.out.println("2-param constructor");
		this.a=a;
		this.b=b;
	}
	
}

/*
    * super is an instance reference variable which is used to point immediate super class member.
      since,it is instance reference variable so we can't access it inside any static context.
      
    * By using super class we can access instance and static member of the immediate super class.
    
    * By using super, we can invoke the immediate super class constructor from sub class constructor  
       
       1) to invoke default constructor -- write --  super()
       2) to invoke one-parametrized constructor -- write --  super(int)
       3) to invoke two-parametrized constructor -- write --  super(int,int)
       
       During this invocation -- Ponder these points
       
       1) super must be the first statement inside sub class constructor
       2) you can't write super inside the method in order to invoke in super class constructor
       3) from a sub class constructor, you can invoke only 1 super class constructor.
       4) Inside subclass constructor, you can't write this,super both in order to invoke constructor.
       5) cyclic/reverse invocation of contructor between super and sub class constructor is not allowed by super.
 */

class N extends M
{
	int a,b;
	static int c=30;
	
	{
		System.out.println("IB in N");
	}
	
	static
	{
		System.out.println("SB in N");
	}
	
	public N() 
	{
		super();
		System.out.println("Default constructor-N");
	}
	
	N(int a)
	{
		super(909);
		System.out.println("1-param constructor");
		this.a=a;
	}
	
	N(int a,int b)
	{
		super(12, 34);
		System.out.println("2-param constructor");
		this.a=a;
		this.b=b;
	}
	
}


class O extends N
{
	int a,b;
	static int c=30;
	
	{
		System.out.println("IB in O");
	}
	
	static
	{
		System.out.println("SB in O");
	}
	
	public O() 
	{
        super();
		System.out.println("Default constructor-O");
	}
	
	O(int a)
	{
		super(80);
		System.out.println("1-param constructor");
		this.a=a;
	}
	
	O(int a,int b)
	{
		super(10, 20);
		System.out.println("2-param constructor");
		this.a=a;
		this.b=b;
	}
	
	void show()
	{
		int a=11;
		int b=22;
		int c=33;
		
		// accessing the local variable
		System.out.println(a);
		System.out.println(b);      
		System.out.println(c);
		
		// accessing the instance variable of same class
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		
		// accessing the instance variable of Just Immediate super class.
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(super.c);
		
	}
	
}


public class L41 
{
	public static void main(String[] args) 
	{
		O o1 = new O();
		o1.show();
		
		/*
		     when you are creating Object of class O,while processing thier corresponding constructor
		     it is getting one super statement before processing subclass constructor.
		     So, it will process immediate super constructor & then sub class constructor.
		 */
		
System.out.println("----------------------");	
		O o2 = new O(50);
		o2.show();
System.out.println("----------------------");			
		O o3 = new O(40, 60);
		o3.show();
		
		/*
		    if the super class & sub class member's name are same then we need to refer immediate
		    super class member with the help of super keyword.
		 */

	}

}