package com.java;

// String Concatenation Operator

public class L7 
{
	public static void main(String[] args) 
	{
		String s1 = "Ok";
		String s2 = " funky";
		String s3 = s1+s2;
		System.out.println(s3);
		     int a = 10;
	         String s4 = s3+a;
	  System.out.println(s4);
		System.out.println(s2+007);
		
		String s5 = s1+102.345;
		System.out.println(s5);
		
		float f = 102.333f;
				String s6 = s2+f;
				System.out.println(s6);
		double d = 34.3344;
				String s7 = s1+d;
				System.out.println(s7);
				
		System.out.println("sum = "+90+45);		  // 9045
		System.out.println(90+45);			             //  135
		System.out.println("sum = "+(90+45));	  // 135
		
		System.out.println(90-45);	                        // 45
		System.out.println("diff = "+(90-45));	    // 45
		//     System.out.println("diff = "+90-45);     show you an error from - used by you directly....Show Below.
		
		int i=45;
		int j=27;
		System.out.println("result is = "+i+-j);              // result is = 45-27
		System.out.println("result is = "+i+(-j));          // result is = 45-27
		System.out.println("result is = "+(i-j));            // result is = 18
		
		L7 t1 = null;
		String s8 = "OM"+t1;
		System.out.println(s8);
	 
		int cs = 23;
		// String rs = (String)cs;   ------------   can't cast  int into String
		String r1 = ""+cs;
		System.out.println(r1);
		String r2 = cs + "";
		System.out.println(r2);
		
		

		
	}

}
