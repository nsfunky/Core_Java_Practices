package com.nish2;

class Outer
{
	int a=10;
	int b=20;
	static int c=33;
	
	{
		System.out.println("IB in outer class");
	}
	
	static 
	{
		System.out.println("SB in outer class");
	}

	/*   
	 *  --- INNER CLASS IS NOT THE SUB CLASS OF OUTER CLASS ---
	   
	      A class defined within another class termed as inner class
	      
	    ---Following types of inner class Exists---
	      1) Non static inner class
	      2) static inner class
	      3) method local inner class
	      4) Anonymous inner class
	 */	
	
	class Inner  // class is defined within a class without any static keyword is termed as non static inner class. 	
	 {
		int aa=101;
		// static int ab=44;
		
		{
			System.out.println("IB in Inner class");
		}
		
	/*
		static
		{
			System.out.println("SB in Inner class");
		}
	*/
		void show()
		{
			System.out.println("Show in Inner class");
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(aa);
			//System.out.println(ab);
		}
	}

	
	/*
	 1) inside non static inner class, we can access all the members of outer class directly.
	    BUT, we can't have any static declaration inside the non-static inner class.
	 
	 2) you can't access members of innerclass inside outerclass directly.
	    (in order to access), 
	    non static inner members .... inside outer class ---> for that 
	    we need to create the object of inner class inside outer class and through that reference
	    you can access that.   
	  
	 3) In order to access member of inner class outside outer class --- then-----
	    1) create the object of the outer class
	    2) through that you can create the inner class object 
	  
	 */
	
	void showAll()
	{
		System.out.println("ShowAll in Oute class");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(aa);
	
	}
}

class L57
{
	public static void main(String args[])
	{
		Outer otr=new Outer();
		otr.showAll();
		//Outer.Inner oi1=new Outer.new Inner();
		Outer.Inner oi1=new Outer().new Inner();
		Outer.Inner oi3=otr.new Inner();
		oi3.show();
		// oi3.showAll();
	}
}

/*
   Here how many class files are generated for above programs
   1) outer.class
   2) outer$inner.class    here $ represents Anonymous in the class. 
   3) L57.class  
 */