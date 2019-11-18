package com.collection;

//import java.util.Iterator;

import java.util.*;

public class queueList 
{
	public static void main(String[] args) 
	{
		Queue<String> queue = new LinkedList<>();
		queue.add("one");
		queue.add("two");
		queue.add("three");
		queue.add("four");
		System.out.println(queue);
			
		queue.remove("three");
		System.out.println(queue);
		System.out.println("Queue Size: " + queue.size());
		
		queue.peek();
		System.out.println("Queue Size: " + queue.size());
		System.out.println(queue);
		
		
		
		System.out.println("Queue Contains element 'two' or not? : " + queue.contains("two"));

		// To empty the queue
		queue.clear();
		System.out.println(queue.peek());
		
		// Java Array to Queue
		
		String nums[] = {"one","two","three","four","five"};
		Queue<String> queue1 = new LinkedList<>();
		Collections.addAll(queue1, nums);
		System.out.println(queue1);
	  
		
		
	}

}
