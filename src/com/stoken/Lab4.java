package com.stoken;

public class Lab4 
{
	public static void main(String[] args) 
	{
        String st = "Gold:Stocks:Fixed Income:Commodity:Interest Rates";
		
		String[] splits = st.split(":");
		
		System.out.println("splits.size :=: " + splits.length);
		
		for(String asset: splits)
		{
		  System.out.println(asset);
		}

	}

}

