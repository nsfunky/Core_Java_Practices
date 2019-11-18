package com.thread;

public class ABC1 extends Thread
{
	Thread t1,t2,t3;
	
	public ABC1()
	{
		t1=new Thread(this,"First");   //  (runnable args,String)
		t2=new Thread(this,"Second");
		t3=new Thread(this,"Third");
	
		t1.start();
		t2.start();
		t3.start();

	}
	
	public void run()
	  {
		// synchronized(this)
	   {
		for(int i=1;i<=4;i++)
		{
			System.out.println(Thread.currentThread().getName()+" i = "+i);
			
			// getName()---get the name of the thread in which thread is running.
			// currentThread()---gets the thread in which the method is running.
			
			try
		   	{
			//   Thread.sleep(1000);   // sleep for milli second.
			// yield();   	 // yields the Thread-control to another thread.		
			// notify();    // 
			// if(Thread.currentThread().getName().compareTo("Third")!=0)
			 wait();     //  wait for something to happen.

			}
			catch(Exception e)
			{
				System.out.println("Message : "+e);
			}
		}
		}
	}
	public static void main(String arg[])
	{
		//ABC1 obj=new ABC1();
		new ABC1();
	}
}