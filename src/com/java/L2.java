package com.java;
// Character Literals
public class L2 
{
	public static void main(String[] args) 
	{
		char ch1 = 'A';
		System.out.println(ch1);
		
		char ch2 = '	';  
		// no continous 2 single quote,use atleast 1 space b/w them.
		// u can also make use of tab key here for particular 4 spaces.
		// mutiple spaces are not allow here
		System.out.println(ch2);
	
		// char ch2 = ' AB';      invalid character constant  (Act as a String)
  
		char ch3 = '*';
		System.out.println(ch3);
		
		char ch4 = '7';
		System.out.println(ch4);
	
		char ch5 = 98;
		System.out.println(ch5);
		
		char ch7 = '\\';
		System.out.println(ch7);
	
		char ch8 = '\u0045';
		System.out.println(ch8);                //  E
		
		char ch9 = '\u00cf';
		System.out.println(ch9);                //  Ï   
	
		char ch10 = (char) -1;
		System.out.println(ch10);               //  ? for non existing representation
	
		char ch11 = 65530;
		System.out.println(ch11);               //  ? for non existing representation
		
		for(char c =0;c<=255;c++)
		{
		   System.out.println(c);
		}
	
		for(char c =0;c<=255;c++)
		{
			int x =c;
		   System.out.print(x);
		   System.out.print('\t');
		   System.out.print(c);
		   System.out.println();
		}

	}

}
