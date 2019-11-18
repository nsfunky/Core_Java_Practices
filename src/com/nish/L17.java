package com.nish;

class tiger
{
	void m1()
	{
		System.out.println("m1() in tiger");
	}
		
	public String toString()
	{
		return "Here I'm !!!";     // Default Object Calling Method
	}
	
}

class lion
{
    /*
	Void m1()    // Void is an reference type that inherits from Object. 
      {
    	System.out.println("m1() in lion");
     }
     */
     
    
	int m2()
    {
    	System.out.println("m2() in Lion");
    	return 10;
    }
    
	byte m3(int a)
    {
    	System.out.println("m3() in Lion");
    	return (byte) a;
    }
    
	tiger m4()
    {
    	System.out.println("m4() in Lion");
    	return new tiger();
    }
    
	/*
	m5()
	{
		
	}
    */
	
	/*
	int m6()
	{
		
	}
	*/
	
	/*
	void m7()
	{
		void m8()
		{
			
		}
	}
	*/
	
	void m9()
	{
		return;
	}
	
	/*
	int m10()
	{
		return;
	}
	*/
	
	void m11()
	{
		System.out.println("m11() in Lion");
		// return 10;
		;  // empty statement
		return ;   // empty return statement 
	}
}   

public class L17 
{
	public static void main(String[] args) 
	{
		lion l1 = new lion();	
       System.out.println("---------------------------");
		int i = l1.m2();		
		System.out.println(i);
		
		//  l1.m2(111);
		System.out.println("---------------------------");
		byte b = l1.m3(100);
		System.out.println(b);
		System.out.println("---------------------------");
		tiger t = l1.m4();
		System.out.println(t);
		System.out.println("---------------------------");
		t.m1();
		
	

	}

}
