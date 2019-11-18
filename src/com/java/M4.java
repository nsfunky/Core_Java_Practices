package com.java;

//   Conditional / Ternary  Operator

public class M4 
{
	public static void main(String[] args) 
	{
		int ab = 10;
		int bc = 20;
		
		int rs1 =  ab>bc ? ab : bc;     
		System.out.println(rs1);        //  20

		int rs2 =  true ? ab : bc;
		System.out.println(rs2);        //  10

		int rs3 =  false ? ab : bc;
		System.out.println(rs3);        //  20

		
	}

}
