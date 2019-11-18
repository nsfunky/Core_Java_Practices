package com.thread;

class Thread5 extends Thread
{
	public void run()
	{
		//System.out.println("Priority given : "+getPriority());

		for(int i=1;i<=5;i++)
		{
			System.out.println("A:"+i);
			try
			{
				//t1.wait();
				sleep(1000);
			}
			catch(Exception e)
			{}
		}
	}
}
class Thread2 extends Thread
{
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
class Thread3 extends Thread
{
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


public class ThreadPrio 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		
	t1.setPriority(Thread.MIN_PRIORITY);      // all these PRIORITY is final in nature
	t2.setPriority(3);
	t3.setPriority(Thread.MAX_PRIORITY);
	
	t1.start();
	t2.start();
	t3.start();
		
  }

}
