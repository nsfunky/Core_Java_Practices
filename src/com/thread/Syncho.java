package com.thread;

public class Syncho extends Thread
{
	Thread m1,m2,m3;
	public Syncho()
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
		synchronized(this)
		{
			for(int i=1;i<=5;i++)
			{
				Thread m=Thread.currentThread();
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{}
				System.out.println(m.getName()+":"+i);
			}
		}
	}
	public static void main(String args[])
	{
		new Syncho();
	}
}