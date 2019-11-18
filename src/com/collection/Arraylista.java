package com.collection;

import java.util.ArrayList;

public class Arraylista 
	{
		public static void main(String[] args) 
		 {
			ArrayList arr = new ArrayList();
			
			System.out.println("initial size of array list = "+arr.size());
			
			arr.add("A");
			arr.add("B");
			arr.add("C");
			arr.add("D");
			
            System.out.println("size of array list after adding the elements = "+arr.size());
            
            System.out.println("content of array list = "+arr);
            
            arr.add(2,"E");
            
            System.out.println("changing in content of array list after adding the elements at the given index = "+arr);
            
            arr.remove(3);
            
            System.out.println("changing in content of array list after removing the elements at the given index = "+arr);
            
            arr.remove("A");
            
            System.out.println("changing in content of array list after removing the elements from content = "+arr);
            
         }
	}
