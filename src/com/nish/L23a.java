package com.nish;

class ie
{
	/*void m2(double... d,int a)
	{
		System.out.println("m2() in vie");
	}*/
	
	void m2(int a,double ... d)
	{
		System.out.println("m2(int,double) in vie");
		for (double e : d) 
		{
			System.out.println(e);
			
		}
	}
}

public class L23a 
{
	public static void main(String[] args) 
	{
			ie i = new ie();
			i.m2(1,22.22, 11.22,33.33);

	}

}
