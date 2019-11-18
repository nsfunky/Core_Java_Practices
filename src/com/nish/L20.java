package com.nish;

    /*
    
    i can also overload the main() method,but internally JVM invokes/calls the main
    method with main(String[] args) as a input parameter and rest of the other
    main methods will be treated as a normal main() method,which will be done by us 
    explicit called by us.

    */

public class L20 
{
	public static void main(String[] args) 
	{ 
		System.out.println("main(String[] args)");
	    main("abc");
	    main(111);
	    main(11.11);

	}
	public static void main(String ar)
	{
		System.out.println("string(ar)");
	}
	public static void main(int a)
	{
		System.out.println("int(a)");
	}
	public static void main(double d)
	{
		System.out.println("double(d)");
	}

}
