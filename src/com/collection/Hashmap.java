package com.collection;

import java.util.*;

public class Hashmap 
 {
	public static void main(String[] args) 
	{
		HashMap<String,String> hm = new HashMap<String,String>();
		TreeMap<String,String> tm = new TreeMap<String,String>();
		
	    hm.put("Nishant","Sharma");
		hm.put("Funky","Delll");
		hm.put("Nishu","08-cse-78");
		hm.put("07-07-89","D.O.B");
		hm.put("null","name");
		hm.put("null","address");
		
		
		tm.put("Nishant","Sharma");
		tm.put("Funky","Delll");
		tm.put("Nishu","08-cse-78");
		tm.put("07-07-89","D.O.B");
		tm.put("null","name");
		tm.put("null","address");
		tm.put("Nishant","Kumar");
		
		
		System.out.println(" The Hash Mapping  -- unordered ");
        System.out.println(hm);
        System.out.println("HashMap Size >> "+hm.size());
	    
	    System.out.println("\n The Tree Mapping -- sorted ordered ");
	    System.out.println(tm);
	    System.out.println("TreeMap Size >> "+tm.size());
	    
	}

}
