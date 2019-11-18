package com.stoken;

public class Lab8 
{
	public static void main(String[] args) 
	{
/*		
        You can control number of split by using overloaded version 
        split (regex, limit)  -- If you give limit as 2 it will only creates two strings.
*/

		
		String places = "London.Switzerland.Europe.Australia";
		
		String[] splits = places.split("\\.",3);
		
		System.out.println("placeSplits.size: " + splits.length );
		
		for(String contents: splits)
		{
		    System.out.println(contents);
		}
		
	}

}

