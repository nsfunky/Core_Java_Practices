package com.nish1;

abstract class Animal1
{
	abstract void eating();
	abstract void sleeping();
	
}

abstract class Dogg extends Animal1
{
  public void eating() 
	{
	  System.out.println("Dog is Eating");	
	}
}

/*
  
  when any class is extending any abstract class then remember the following points
  
   1) sub class has to override all the abstract methods of super class(i.e abstract class)
   2) if not then sub class must be declared also as abstract class.
   3) Inside abstract class, you can write all the members of a class.
  
 */

class mydogg extends Animal1
{

	@Override
	void eating() 
	{
		System.out.println("mydogg is eating");
		
	}

	@Override
	void sleeping() 
	{
		System.out.println("mydogg is sleeping");
		
	}

}

abstract class cat extends Animal1
{
	abstract void m1();
	
	void anything()
	{
		System.out.println("Any method");
	}
	
	void eating() 
	{
		System.out.println("Cat is eating");
		
	}

	void sleeping() 
	{
		System.out.println("Cat is sleeping");
		
	}

}


class mycat extends cat
{
	@Override
	void m1() 
	{
       System.out.println("when ever you not found abstract method, No need to implement that.");       
	}
	
}


class AnimalFactory
{
	public static final int d = 12;
	public static final int c = 15;
	
	public static Animal1 getAnimal(int i)
	{
		Animal1 ani = null;
		if (i==1)
		{
			ani = new mydogg();
		}
		else
		{
			ani = new mycat();
		}
	   return ani;	
	}
	
}


public class L52 
{
	public static void main(String[] args) 
	{
		// Animal1 an = new Animal1();   NEVERRRRR  -- for that immediately you have to implement the the abstract methods.
		
		Animal1 ani = null;
		
		ani = AnimalFactory.getAnimal(AnimalFactory.d);
		System.out.println(ani);
		ani = AnimalFactory.getAnimal(AnimalFactory.c);
		System.out.println(ani);
		
	}

}
