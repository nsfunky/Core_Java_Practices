package com.nish;

class soma
{
	private soma()
	{
	}
		static soma m = null;
		static
		{
			m = new soma();
		}
		static soma getSoma()
		{
			return m;
		}
		
		void m1()
		{
			System.out.println("m1 in soma");
		}
		
	}


public class L32 
{
	public static void main(String[] args) 
	{
		//	soma s = new soma();
		
		soma s = soma.getSoma();
		s.m1();
		soma s1 = soma.getSoma();
		s1.m1();
		System.out.println(s==s1);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

	}

}
