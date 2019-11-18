package com.nish1;

import java.sql.SQLException;

/*
 
 1) super class method throws some exception then sub class overridden method can as it, 
    just ignore the exception thrown by the super class method.
 
 2) if super class method throwing any exception, sub class overridden method can as it is 
    report the exception that throws super class method.
    
 3) super class method throwing exception then sub class overridden method is throwing exception
 
 */

class Any
{
	void eating() throws SQLException
	{
		System.out.println("Animal is eating");
	}
	
	int sleeping()
	{
		System.out.println("Animal is sleeping");
		return 1;
	}
	
}


class Many extends Any
{
	
	void eating()     // No other Exception is allowed here rather than super class method Exception.
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


public class L49 
{
	public static void main(String[] args) 
	{
      // In order to achieve dynamic polymorphism is always recommendable to use instance method.
		
	Many a = new Many();
	a.eating();
	
	/*
	Any a = new Many();
	a.eating();
	*/
	
	/*
	Any an = new Any();
	an.eating();
	*/
	}

}