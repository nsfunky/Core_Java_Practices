package com.nish1;

class Animal
{
	void eating()
	{
		System.out.println("Animal is eating");
	}
	
	int sleeping()
	{
		System.out.println("Animal is sleeping");
		return 1;
	}
	
	static void walking()
	{
		System.out.println("Animal is walking");
	}
}


class Dog extends Animal
{
	void eating()
	{
		System.out.println("Dog is eating");
	}
	
	void barking()
	{
		System.out.println("Dog is barking");
	}
	
	static void walking()
	{
		System.out.println("Dog is walking");
	}
}

class Cata extends Animal
{
	int sleeping()
	{
		System.out.println("Cat is sleeping");
		return 2;
	}
	
	void drinking()
	{
		System.out.println("Cat is drinking");
	}
	
	static void walking()
	{
		System.out.println("Cat is walking");
	}
}

public class L48 
{
	public static void main(String[] args) 
	{
		Animal ani = null;
		ani = new Dog();
		
		ani.eating();
		ani.sleeping();
		ani.walking();
		// ani.barking();
		/*
		 * when you are calling any method, with super class reference variable, which contain sub class object reference
		 * then that method signature must be available in super class.
		 when we calling, first verify the method signature available in super class or not.
		 if not , then it will give compile time error.
		 
		-->  instance method invoke, depends on type object reference variable
		-->  static method invocation depends on type of reference variable, which are calling.
		
		-->  if it is not dependent on object reference available to corresponding reference variable
		 
		 */
		System.out.println("------------------");
		
		Animal ani1 = null;
		ani1 = new Cata();
		
		ani1.sleeping();
		ani1.walking();
		ani1.eating();
		// you can;t access ---  ani1.drinking()     ---
		
		System.out.println("------------------");
		
        Dog dg = new Dog();
        dg.barking();
        
        Cata ct = new Cata();
        ct.drinking();
		
 // In order to achieve dynamic polymorphism is always recommendable to use instance method.		
	}

}
