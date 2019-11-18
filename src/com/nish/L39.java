package com.nish;


class jai
{
	 int a,b;
	 static int c=30;
	 
	 {
		 System.out.println("IB in jai");
		 int a1 = 101;
		 System.out.println(a1);
	 }
	 
	 static
	 {
		 System.out.println("SB in jai");
		 int b1 = 202;
		 System.out.println(b1);
	 }
	 
	 public jai() {}
	 
	 jai(int a,int b)
	 {
		 System.out.println("2-param-constructor");
		 this.a=a;
		 this.b=b;
	 }
}

class kisan extends jai
{
	 int a,b;
	 static int c=33;
	 
	 {
		 System.out.println("IB in kisan");
		 int a1 = 101;
		 System.out.println(a1);
	 }
	 
	 static
	 {
		 System.out.println("SB in kisan");
		 int b1 = 202;
		 System.out.println(b1);
	 }
	 
	 public kisan() {}
	 
	 kisan(int a,int b)
	 {
		 System.out.println("2-param-constructor");
		 this.a=a;
		 this.b=b;
	 }
	
	 void show()
	 {
		 int a=11;
		 int b=22;
		 int c=33;
		 
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
//  with the help of this, we can access the current class member		 
		 System.out.println(this.a);
		 System.out.println(this.b);
		 System.out.println(this.c);
// with the help of super, we can access the class member of the immediate super class.		 
		 System.out.println(super.a);
		 System.out.println(super.b);
		 System.out.println(super.c);
	 }
}

// with the help of sub class object reference, we can access the the super as well as sub class member both.

//with the help of super class object, we can access only the super class member but not the subclass member.

public class L39
{
	public static void main(String[] args) 
	{
		System.out.println(kisan.c);
		
		kisan k1 = new kisan();
		k1.show();
		
		kisan k2 = new kisan();
		k2.show();
		
	}
}	