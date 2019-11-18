package com.collection;

import java.util.ArrayList;

public class ArrayListAction 
	{

		public static void main(String[] args) 
		{
			ArrayList countries = new ArrayList();
			
			countries.add("INDIA");
			countries.add("PAKISTAN");
			countries.add("SRILANKA");
			
            int size = countries.size();   //  size()--> returns the number of elements in the list...
            
            System.out.println("List of Counrty added:");
			
            /*
Object java.util.ArrayList.get(int index) -- Returns the element at the specified position in this list.
             */
            
			for(int index=0;index<size;index++)
		    	{
			    	System.out.println(countries.get(index));
		    	}
			
			countries.remove("SRILANKA");
			
            int siz = countries.size();
            
            System.out.println("List of Counrty after removing some :");
			
			for(int index=0;index<siz;index++)
			{
				System.out.println(countries.get(index));
			}
		}
	}
