package com.java;

// String Literals

public class L3 
{
	public static void main(String[] args) 
	{
		String s1="";
		System.out.println(s1);
		
		String s2="f65M\t00cfTR";
		System.out.println(s2);
		

		String s3="f65M\\\u00cfTR";      //      \u00ce  -- Î      &      \u00cf  --  Ï
		System.out.println(s3);
		

		String s4="f65M\t00cfTR";
		System.out.println(s4);
		

		String s5="D:\test\b40\new";
		System.out.println(s5);
	   

		String s6="D:\\test\b40\\new";
		System.out.println(s6);
		
		String s7="HELLO\rKA";       //  KALLO
		System.out.println(s7);     // right side string from \r acquires the front String postion 
	   
		// String s8="d:\core\pack\jew";    
		 // escape sequence charchater  [ \b  \t  \n  \f  \r  \"  \'  \\  ]  must be from that.
		
		String s8="d:\\core\\pack\\jew";
		System.out.println(s8);


		String s9="f65M\\u00ceTR";
		System.out.println(s9);
		

		String s10="Hello\bBoy";   // o/p as >>> HellBoy <<<   from command line
		System.out.println(s10);
		// But actually '\b' reduced a single character from just before,
		// from where it starts.   nish\bant   <----o/p ---->   nisant

/*
  In eclipse, 2 escape sequence character dont work properly
  Like \b(backspace) & \r(carriage return)
  it gives something like   so as to signify a character the font 
  doesn't support, or has an invalid ASCII value or something. 
  You do it Properly through command Line
 */
		
	   
	}

}
