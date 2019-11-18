package com.interview_question;

import java.util.HashSet;
import java.util.Set;

public class StringCombination {

	public static void main(String[] args) {
		System.out.println(allPossibleCombination("lok"));
		System.out.println("----");
		limitedCombination("lok");
		System.out.println("----");
		Set<String> set = new HashSet<>();
		set = permutationFinder("lok");
		System.out.println(set);
	}
	
	public static Set allPossibleCombination(String str){
		
		StringBuilder temp = new StringBuilder(str);
		Set<String> m = new HashSet<>();
		for (int i = 0; i < temp.length(); i++) 
		{
			for (int j = i+1; j <= temp.length(); j++) 
				{
					m.add((String) temp.subSequence(i, j));
					if(temp.subSequence(i, j).length()>1) 
					{
						m.add(new StringBuilder(temp.subSequence(i, j).toString()).reverse().toString());
					}
				}
		}
		return m;
	}

	public static String limitedCombination(String str){
		
		StringBuilder temp = new StringBuilder(str);

		for (int i = 0; i < temp.length(); i++) 
		{
		 for (int j = i; j <= temp.length(); j++) 
		 {
		   System.out.println(temp.subSequence(i, j));
		   if(temp.subSequence(i, j).length()>1) 
		   {
		     System.out.println(new StringBuilder(temp.subSequence(i, j).toString()).reverse());
		}
		}
		}
		return str;
	}
	
	 public static Set<String> permutationFinder(String str) {
	        Set<String> perm = new HashSet<String>();
	        //Handling error scenarios
	        if (str == null) {
	            return null;
	        } else if (str.length() == 0) {
	            perm.add("");
	            return perm;
	        }
	        char initial = str.charAt(0); // first character
	        String rem = str.substring(1); // Full string without first character
	        Set<String> words = permutationFinder(rem);
	        for (String strNew : words) {
	            for (int i = 0;i<=strNew.length();i++){
	                perm.add(charInsert(strNew, initial, i));
	            }
	        }
	        return perm;
	    }

	    public static String charInsert(String str, char c, int j) {
	        String begin = str.substring(0, j);
	        String end = str.substring(j);
	        return begin + c + end;
	    }
	
}
