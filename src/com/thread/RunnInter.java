package com.thread;

class Inter implements Runnable
{
	@Override
	public void run() 
	{
		for (int i = 0; i < 3; i++) 
		{
			System.out.println(" i = "+i);
			try 
			{
				Thread.sleep(500);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			
		}
		
	}
	
}

public class RunnInter 
{
	public static void main(String[] args) 
	{
	    Inter in = new Inter();
	    Thread th = new Thread(in);
	    th.start();
		
	}

}