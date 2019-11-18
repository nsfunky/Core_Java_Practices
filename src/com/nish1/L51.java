package com.nish1;

abstract class ABC
{
	 /*
	   void m1(); 
	  
    -->	if you are defining any method, without body or without method implementation
    	then you must have to declare that method as abstract (or) implement the method of the body.
    	
    	    -->	and when a class is having 1/more abstract method then that class must be
    	    	declared as abstract class.
    
     -->  you can't instantiate the abstract class.
     
      	--> An abstract class may or may not contain any abstract method.
      	
	*/
	
	abstract void eating();
	void sleepin()
	{
		System.out.println("-- With Body --");
	}
	abstract void sleeping();
	
}

abstract class MNO extends ABC
{
  // when sub class & parent class both are abstract then just normal overriding
	
	/*public void eating() 
	{
	  System.out.println("Dog is Eating");	
	}*/
}

/*
  
  when any class is extending any abstract class then remember the following points
  
   1) sub class has to override all the abstract methods of super class(i.e abstract class)
   2) if not then sub class must be declared also as abstract class.
   3) Inside abstract class, you can write all the members of a class.
  
 */

class mydog extends ABC
{
// when sub class is any normal class & parent is abstract in nature then, Only abstract method is inherited here.
	
	@Override
	void eating() 
	{
		System.out.println("mydog is eating");
		
	}

	@Override
	void sleeping() 
	{
		System.out.println("mydog is sleeping");
		
	}
	
}


public class L51 
{
	public static void main(String[] args) 
	{
		ABC a = new mydog();
		a.sleepin();
		a.sleeping();
		a.eating();
	}

}
