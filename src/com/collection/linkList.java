package com.collection;

import java.util.*;

public class linkList
{
	public static void main(String[] args) 
	{
      LinkedList<String> ls = new LinkedList<String>();
      ls.add("Hello ");
      ls.add("Funky ");
      ls.add("Nishant ");
      ls.add("Sharma ");
      
      int size = ls.size();
      
      for(int i=0;i<size;i++)
       {
		 System.out.println(ls.get(i));
       }
      
      int saa = ls.size();
      System.out.println("The size = "+saa);
      
      System.out.println("-------------------------------------------");
      
      ls.remove("Funky ");
      int siz = ls.size();
      
      for(int i=0;i<siz;i++)
      {
		 System.out.println(ls.get(i));
      }
      
      int sa = ls.size();
      System.out.println("The size = "+sa);
      System.out.println("-------------------------------------------");
     
      ls.add(2,"Jehanabad");
      
       int sz = ls.size();
      
      for(int i=0;i<sz;i++)
      {
		 System.out.println(ls.get(i));
      }
      
      int s = ls.size();
      System.out.println("The size = "+s);
	}
}	


