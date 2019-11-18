package com.collection;

import java.util.*;
public class stackList 
{
  public static void main(String[] args) 
   {
	  Stack<String> stk = new Stack<String>();
	  stk.push("Nishant");                //push() method add the element from the top of the stack.
	  stk.push("Ashwani");
	  stk.push("Sumit");
	  stk.push("Cindrella");
	  stk.push("Taklaa");
	  
	  System.out.println("----------------------");
	  
	  int siz = stk.size();
	  for(int i=0;i<siz;i++)
	  {
		   System.out.println(stk.get(i));
	  }


	  System.out.println("----------------------");  
	  System.out.println(stk.pop());   
	  
	  // remove the elements from the top of the stack. & return that removed element.
      // rest of elements is as it is -- in the stack.
	  
	 System.out.println("----------------------");
	  System.out.println(stk.pop());            
	  System.out.println("----------------------"); 
	 //stk.pop();
	 
	  int sz = stk.size();
	  for(int i=0;i<sz;i++)
	  {
		   System.out.println(stk.get(i));
	  }
	  
	  
	  
	 
	  System.out.println("----------------------");
	  
	  System.out.println(stk.peek());   // return the element from the top of the stack.
	 
	 
	  
	  
	  
	  
	  System.out.println("----------------------");
	 
	  System.out.println(stk.empty());    //  return TRUE (Boolean) ....if the stack is Empty......Otherwise False.
	  
	  
	  
	  
	  
	  System.out.println("----------------------");
	  
	  System.out.println(stk.search("Sumit"));   //  for searching elements ...&...returns the position of that elements
	                                             //which starts from 1
	}											// if elements are not belonging 2 the stack then return ouput as -1

}
