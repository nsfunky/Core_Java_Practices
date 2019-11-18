package com.interview_question;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class TotalCountOfCharacterFromString 
{

	public static void main(String[] args) 
	{
		String inputString="my name is nishant";

        System.out.println("inputString is : "+inputString);
        System.out.print("Output is : ");
      
        System.out.println(characterCount(inputString));
        
        Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
        map = characterCount(inputString);
        Iterator<Character> charIterator=map.keySet().iterator();
        while(charIterator.hasNext()){
            char ch=charIterator.next();
            System.out.print(ch+"="+map.get(ch)+" ");
        }
        
     }

        
   
     public static Map characterCount(String inputString)
     {
        Map<Character, Integer> map=new LinkedHashMap<Character, Integer>(); 
        //LinkedHashMap used so that we could maintain insertion order.
        char[] inputAr=inputString.toCharArray();
     
        for(int i=0;i<inputAr.length;i++){
            char ch=inputAr[i];
            if(map.containsKey(ch))
                   map.put(ch, map.get(ch) +1);
            else
                   map.put(ch, 1);
          }         
        return map;  
     }
}