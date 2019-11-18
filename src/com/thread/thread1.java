package com.thread;

class newthread implements Runnable
{
  Thread t;

  newthread()
    {
	    t=new Thread(this,"Demo thread");
	    System.out.println("Child Thread "+t);
	    t.start();
    }

  public void run()
    {
	    try
	      {
	        for(int j=5;j>=0;j--)
	          {
		        System.out.println("Child thread  => "+j);
		        Thread.sleep(2000);
	          }
	      }catch(InterruptedException ie)
	        {
	           System.out.println("Child interuppted");
	        }

	      System.out.println("Exiting child thread....");
    }
}

public class thread1
{
  public static void main(String args[])
    {
	new newthread();

	try
	  {
	    for(int i=0;i<=5;i++)
	      {
		    System.out.println("Main Thread  : "+i);
		    Thread.sleep(1000);
	      }
	  }
  catch(InterruptedException ie)
	  {
	    System.out.println("Main thread interrupted");
	  }

	System.out.println("Main thread exiting....");
    }
}
