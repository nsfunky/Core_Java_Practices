package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist
	{

		public static void main(String[] args) 
		{
			ArrayList countries = new ArrayList(); 
			   /*
			    -> Resizable-array implementation of the List interface
			    -> it permits all elements, including null.
			    -> Each ArrayList instance has a capacity. 
			    
			    The capacity is the size of the array used to store the elements in the list. 
			    
			    -> It is always at least as large as the list size. 
			    -> As elements are added to an ArrayList, its capacity grows automatically. 
			*/
			countries.add("INDIA");
			countries.add("PAKISTAN");
			countries.add("SRILANKA");
			countries.add(null);
			countries.add(null);
			countries.add("INDIA");
			
			int size = countries.size();                  // The number of elements in the list.
			
			System.out.println("size = "+size);
			
			for(int index=0;index<size;index++)
			{
				System.out.println(countries.get(index));
			}
		
		  System.out.println("printing countries using iterator"); 
		    
		                                  // it is used only for fetching.
		  				  				 //  it is interface provided by java.
		  
		  Iterator countryIterator = countries.iterator(); 
		  // this method returns a reference of type iterator.
		  
		  while(countryIterator.hasNext())	// hasNext() method returns true...if the collection contains atleast 1 elements.
		  {                                               
			  System.out.println(countryIterator.next()); //next() returns next elements from the collection.
		  }
		  
		  System.out.println("printing countries using enhance for loop");
		  
		  for(Object obj : countries)
			  {
			   System.out.println(obj);
			  }
		
	}

}


