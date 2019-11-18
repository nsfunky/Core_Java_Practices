package com.thread;

class Current
{
	public static void main(String args[])
	{
		Thread t=new Thread("Raj");
		System.out.println("Current Thead:"+t.getName());
		t.setName("funky");
		System.out.println("After name changed:"+t.getName());
		try
		{
			for( int n=5;n>0;n--)
			{
				System.out.println(n);
				Thread.sleep(1000);
			}
		}
		 catch(Exception e)
		{
			System.out.println("Main interrupted");
		}
	}
}