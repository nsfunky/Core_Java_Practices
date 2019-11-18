package com.nish;

import java.util.*;

public class ExamSort {
     public static void main(String args[]) {
      // create an array of string objs
      String init[] = { "One", "Two", "Three", "One", "Two", "Three" };
      
      // create one list
      List list = new ArrayList(Arrays.asList(init));
      
      System.out.println("List value before: "+list);
      
      /*
        sort the list- --- The sort(List<T>) method is used to sort the specified list 
        into ascending order, according to the natural ordering of its element.
         ------>  declaration for java.util.Collections.sort() method.
         It's paramter type is list  & it returns nothing.
         
         2 Types of Exception it throwss
         
         1. ClassCastException--Throws if the list contains elements that are not mutually 
            comparable (for example, strings and integers).

         2. UnsupportedOperationException--Throws if the specified list's list-iterator 
             does not support the set operation.
       */
      Collections.sort(list);
      
      System.out.println("List value after sort: "+list);
   }
}
