package com.collection;

import java.util.Iterator; // Here No need of class name...this import packages creates its own objects.
import java.util.Vector;

//import java.util.*;

public class VectorList  //it is similar as arraylist..except it is SYNCHRONIZED
{

	public static void main(String[] args)
 {
	Vector<String> nish = new Vector<String>();   // this vector class is synchronised then 
	nish.add("Apple");		     //multiple thread can't access the vector objects simultaneously.
	nish.add("Orange");	        // only 1 thread can access the vector objects at the specific time.
	nish.add("Apple");	
	nish.add("Grape");
	
	Iterator it = nish.iterator(); 
	
	while(it.hasNext())
	{
	   System.out.println(it.next());	
    }
	
	 System.out.println("printing countries using enhance for loop");
	  
	  for(Object obj : nish)
		  {
		   System.out.println(obj);
		  }
	
  }
}

