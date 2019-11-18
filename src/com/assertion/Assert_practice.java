package com.assertion;

public class Assert_practice {

	public static void main(String[] args) 
	{
	       System.out.println(1);
	        assert false;   // Execution should never reach this point!
	        System.out.println(2);
	
	}

}


/*
output:

1
Exception in thread "main" java.lang.AssertionError
	at com.ass.A.main(A.java:8)
(so for handing such exception, we used try & catch in my next program)
*/