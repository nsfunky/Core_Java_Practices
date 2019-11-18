package com.collection;

import java.util.*;

public class GenericArrayList 

{
  public static void main(String[] args)
  {
	ArrayList<String> cars = new ArrayList<String>();
	ArrayList lita = new ArrayList();
	
	Student s1 = new Student(78,"Nishant");
	Student s2 = new Student(80,"Sanjay");
	Student s3 = new Student(68,"Ashwani");
	
	lita.add(s1);
	lita.add(s2);
	lita.add(s3);
	
	cars.add("Bhalo India");
	
	for(Object obj:lita)
	      {
	    	Student std = (Student)obj;
		    String name = std.getName();
		    int rollno = std.getRollno();
		    System.out.print(name);
		    System.out.println(" = "+rollno);
	      }
	
	 for(Object obj:cars)
	 {
		  //String car = (String)obj;
		  //String newcar = car.toUpperCase();
		  //System.out.println(newcar);
		System.out.println(obj);
	 }
  }

}
