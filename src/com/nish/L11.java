package com.nish;


class welly
{
	{
		System.out.println("IB in welly");
	}
	static
	{
		System.out.println("SB in welly");
	}
}




class L1a
{
	public static void main(String[] args) 
	{
		System.out.println("main in L1a");
		welly w = new welly();
	}

}

/*
main in L1a
SB in welly
IB in welly
 */



public class L11 
{
	public static void main(String[] args) 
	{
		System.out.println("main in L11");
		welly w = new welly();
		String str[] = {"nishant"};
		L1a.main(str);
		
		/*
		 * Here Object Creation with same name doesn't effect each other.
		 * becoz both are on different class.
		 * As, you know, when you are going to print out that Object's value
		 * which is created in form of [[[ classified class name @ hexadecimal ]]]
		 */

	}

}

/*
main in L11
SB in welly
IB in welly
main in L1a
IB in welly
*/