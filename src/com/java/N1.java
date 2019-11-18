package com.java;

// With label  

public class N1 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i <=10; i++) 
		{
			JLC:
				for (int j = 0; j <=5; j++) 
				{
					System.out.println("-- Start --");
					if(j==2)
					{
						continue;
					}
					System.out.println("-- End --");
					break JLC;
					
				}
			System.out.println();
			
		}

	}

}
