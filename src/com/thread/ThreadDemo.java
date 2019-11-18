package com.thread;

class ThreadA extends Thread
{
	Thread t1;
	public ThreadA()
	{
	   t1=new Thread(this,"A");
		t1.setPriority(1);
		t1.start();
		
	}
	public void run()
	{
		System.out.println("Priority given : "+t1.getPriority());

		for(int i=1;i<=5;i++)
		{
			System.out.println("A:"+i);
			try
			{
				t1.wait();
				sleep(1000);
			}
			catch(Exception e)
			{}
		}
	}
}
class ThreadB extends Thread
{
	public ThreadB()
	{
		Thread t1=new Thread(this,"B");
		t1.start();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("B:"+i);
			try
			{
				sleep(1000);
			}
			catch(Exception e)
			{}
		}
	}
}
class ThreadC extends Thread
{
	Thread t1;
	public ThreadC()
	{
		t1=new Thread(this,"C");
		t1.start();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("C:"+i);
			try
			{
				sleep(1000);
			}
			catch(Exception e)
			{}
		}
	}
}
class ThreadDemo
{
	public static void main(String args[])
	{
		ThreadA A=new ThreadA();
		ThreadB B=new ThreadB();
		ThreadC C=new ThreadC();
	}
}