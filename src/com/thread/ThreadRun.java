package com.thread;

class Mt implements Runnable
{
	int i=0;
	private Thread th;
	private boolean bl =true;
	
	public Mt(int prt)
	{
		th=new Thread(this,"Jhakas");
		th.setPriority(prt);
	}
	
	public void run()
	{
		while(bl)
			i++;
	}
	
	public void start()
	{
		th.start();
	}
	
	public void stop()
	{
		bl=false;
	}
	
}
public class ThreadRun
{
	public static void main(String s[])
	{
		System.out.println("MAIN:"+Thread.currentThread());
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("MAIN:"+Thread.currentThread());

		Mt m1=new Mt(Thread.NORM_PRIORITY+2);
		Mt m2=new Mt(Thread.NORM_PRIORITY-2);
		
		m1.start();
		m2.start();
		
		System.out.println("child1"+m1);
		System.out.println("child2"+m2);
		
		m1=null;
		m2=null;
	}
}