package com.interview_question;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String inputString="my name is nishant";

        System.out.println("inputString is : "+inputString);
        System.out.print("Output is : ");
      
        System.out.println(getFirstNonRepeatedChar(inputString));


	}

	public static char getFirstNonRepeatedChar(String str) 
	 { 
		  Map<Character,Integer> counts = new LinkedHashMap<>(str.length()); 
		  for (char c : str.toCharArray()) 
		  { 
			  counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1); 
		  } 
		  for (Entry<Character,Integer> entry : counts.entrySet()) 
		  { 
			  if (entry.getValue() == 1) 
			  { 
				  return entry.getKey(); 
			   } 
		  } 
		  throw new RuntimeException("didn't find any non repeated Character"); 
	  }
}