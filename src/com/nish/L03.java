package com.nish;

public class L03 
{
	public static void main(String[] args) 
	{
		
//  int a[] ;   The local variable a may not have been initialized so u can't print {{ sop(a);}}
	//  for that you have to initialized this local variable with null...then it works.
		System.out.println("-------------------------------------------------");
		int b = 0b10;         // binary Representation started by {{ zero b }}
		System.out.println("Binary representation to Decimal => "+b);
		System.out.println("-------------------------------------------------");
		int c = 0xA;         // Hexadecimal Representation started by {{ zero x }}
		System.out.println("Hexadecimal representation to Decimal => "+c);
		System.out.println("-------------------------------------------------");
		int d = 0100;          // Octal Representation started by {{ zero }}
		System.out.println("Octal representation to Decimal => "+d);
		
		
		

	}

}
