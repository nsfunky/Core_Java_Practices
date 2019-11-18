package com.collection;

import java.util.Enumeration;
import java.util.Hashtable;


public class HashTable
{                       //it stores key & thier respectives value in form of mapping.
	public static void main(String[] args)
	  {
		Hashtable<String,String> has = new Hashtable<String,String>();
		
		has.put("Item1" , "Apple");			//has.put(key,value);
		has.put("Item2" , "Orange");		//key should implements the hash codes..&..equal methods
		has.put("Item3" , "Grape");			//to store key & relative values in the hash tables.
		has.put("Item4" , "Kukumber");		// every method within HashTable is synchronized. so thread safe.
		has.put("Item5" , "Guava");         // slower than HashMap.
											//In hash table each collection refers to a unique words
		Enumeration e = has.keys();  	   // called Hash code.this code is used as an index to 
										  // associate with the objects which is used in the hash 
		while(e.hasMoreElements())		 // table & this type of storing information in the hash
		{								//  table is known as by HASHING.
			String str = (String)e.nextElement();
			System.out.println(has.get(str));
		}
	 }
}
