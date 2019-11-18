package com.thread;

// To Synchronize to control access.

 class SumArray
 {
   private int sum;
   
   synchronized int sumArray(int nums[])   // sumArray( ) is synchronized here. 
   {
      sum = 0; // reset sum
      
      for(int i=0; i<nums.length; i++) 
      {
        sum += nums[i];
        System.out.println("Running total for " +Thread.currentThread().getName() + " is " + sum);
        
        try 
        {
           Thread.sleep(10); // allow task-switch
        }
        catch(InterruptedException exc) 
        {
           System.out.println("Main thread interrupted.");
        }
    }
   return sum;
  }
}
 class MyThrea implements Runnable 
  {
    Thread thrd;
    
    static Sync sa = new Sync();
    int a[];
    int answer;
// Construct a new thread.
    
  MyThrea(String name, int nums[])
   {
    thrd = new Thread(this, name);
    
    a = nums;
    
    thrd.start(); // start the thread
   }
 // Begin execution of new thread.
   
  public void run() 
   {
     int sum;
     System.out.println(thrd.getName() + " starting.");
     answer = sa.sumArray(a);
     System.out.println("Sum for " + thrd.getName() + " is " + answer);
     System.out.println(thrd.getName() + " terminating.");
   }
}
 
  class Sync 
   {
     public static void main(String args[]) 
      {
        int a[] = {1, 2, 3, 4, 5};
         
        MyThrea mt1 = new MyThrea("Child #1", a);
        MyThrea mt2 = new MyThrea("Child #2", a);
      }

	public int sumArray(int[] a) {
		// TODO Auto-generated method stub
		return 0;
	}
}
