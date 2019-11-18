package com.thread;


class thread7 extends Thread
{
	  public void run()
	 {
		  for(int i=0;i<5;i++)
		  {
			  try 
			  {
				System.out.println("I = "+i);
				sleep(5000);
			  } 
			  catch (InterruptedException e) 
			  {
				e.printStackTrace();
			  }
			  
		  }
	 }

}

public class SimpleThread 
{
	public static void main(String[] args) 
	{
      /*
       thread7 th = new thread7();
       th.start();
	  */
		
	 new thread7().start();	
	}

}
