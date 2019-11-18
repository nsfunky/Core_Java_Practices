package com.thread;

class mythread extends Thread
{
  mythread() 				//constructor
    {
	super("Demo thread");
	System.out.println("Child thread");
	start(); 			//to strat the thread
    }

  public void run()
    {
	try
	  {
	    for(int i=0;i<5;i++)
	      {
		System.out.println("Child Thread for i = "+i);
		Thread.sleep(1000);
	      }
	  }catch(InterruptedException ie)
	    {
	    }

	System.out.println("Exiting child thread");
    }
}

public class newthread1
{
  public static void main(String args[])
    {
	new mythread();

	try
	  {
	    for(int i=0;i<5;i++)
	      {
		System.out.println("Main thread -> "+i);
		Thread.sleep(200);
	      }
	  }catch(InterruptedException ie)
	    {
	      System.out.println("Error !!!");
	    }

	System.out.println("Exiting the main thread");
    }
}

