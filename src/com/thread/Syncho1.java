package com.thread;

public class Syncho1 extends Thread
{
	Thread m1,m2,m3;
	public Syncho1()
	{
		m1=new Thread(this,"A");
		m2=new Thread(this,"B");
		m3=new Thread(this,"C");
		m1.start();
		m2.start();
		m3.start();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			Thread m=Thread.currentThread();
			System.out.println(m.getName()+":"+i);
			try
			{
				sleep(500);
			}
			catch(Exception e)
			{}
		}
	}
	public static void main(String args[])
	{
		new Syncho1();
	}
}
