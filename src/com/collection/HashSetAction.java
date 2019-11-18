package com.collection;


//import java.util.ArrayList;     //  list of elements with repetition , unordered

import java.util.HashSet;      //  list of elements with no repetition, unordered

//import java.util.TreeSet;      // list of elements arranged in sorted order with no repetition

 public class HashSetAction
	{
		public static void main(String[] args) 
			{
						
						//ArrayList countries = new ArrayList();
			
						HashSet countries = new HashSet();
						
						//TreeSet countries = new TreeSet();
						
						countries.add("INDIA");
						countries.add("SRILANKA");
						countries.add("PAKISTAN");
						countries.add("PAKISTAN");
						countries.add("SRILANKA");
						countries.add("quran");
						
					
														   //[enhance for] / [for each]  LOOP
						for(Object obj : countries)       // This countries gives treeset.. 
						{								 // by default it start from 0 &
							System.out.println(obj);	// go to the end of the list
						}
					}

			}

