package com.nish1;

class Hello
{
	
}

class Hai extends Hello
{
	
}

public class L44 
{
	public static void main(String[] args) 
	{
		Hello h1 = new Hello();
		Hai h2 = new Hai();
		
		// process of assigning subclass object reference to the superclass reference variable.
		Hello h3 = new Hai();
    
		
		// Hai h4 = (Hai) new Hello(); 	 for that, you have to type cast it with Hai
	
		// during that compile time exception OK -- but you have to ClassCastException during Runtime.
		// Hello cannot be cast to Hai  
		// the code has attempted to cast an object to a subclass of which it is not an instance. 
		
		
		Hello h11 = h1;
		Hello h12 = h2;
		Hello h13 = h3;
		
		Hai h23 = h2;
		
	 // Hai h21 = h1;  for that you have to type cast it with Hai	
	//	Hai h22 = h3;  for that you have to type cast it with Hai
		
		Hai h25 = (Hai) h3; 
		// here in case of h25, we are assigning the superclass reference variable which contain 
		// sub class object reference, then it will not give any problem.
		
		Hai h26 = (Hai) h1;      //   Hello cannot be cast to Hai

		// But here Compile time -- OK -- but you got run time exception i.e ClassCastException here.
		// Here we are assigning the super class reference variable which contain but the super class object reference.
		// so runtime problem, you have to face.
	}

}
