package com.java;

// using Arithmetic Operators

public class L6 
{
	public static void main(String[] args) 
	{
		int ab =97;
		System.out.println(ab);
		
	/* 
	     unary + or - operator is used only for changing sign
		 (+ * +) = (+)
		 (+ * -) = (-)
		 (- * -) = (+)
	*/
		
		int a = +ab;    
		System.out.println(a);
		int b = -ab;
		System.out.println(b);
		int c = -b;
		System.out.println(c);
		int d =- -ab;    // { - space - } is different from { -- }
		System.out.println(d);
		int e = -(-ab);
		System.out.println(e);
		
		int f = --ab;   // acts as a decrement operator
		System.out.println(f);
		
		System.out.println(ab);

		
    System.out.println("----------------------");	
	
	
		char ch = 'A';
		char chr = ch;
		char chrr = (char)ch;
		int chi = +ch;
		System.out.println(chr);     // A
		System.out.println(chrr);   // A
		System.out.println(chi);    // 65
	
		
	System.out.println("----------------------");	
	
	
	    byte b1 = 46;
		 //  byte b2 = +b1;     type mismatch --- store it in int.
		byte b2 = +46;
		byte b3 = -46;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		int b4 = +b1;
		System.out.println(b4);
		

	}

}