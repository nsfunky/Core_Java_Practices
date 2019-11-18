package com.java;

/*
     Increment && Decrement Operator is a unary operator
     with One Operator only.
     Only, Expression value is calculated here.
 */

public class M1 
{
	public static void main(String[] args) 
	{
//		int i = 12++;  Invalid argument to operation ++/--
		int ab = 10;
		int j = ab++;
		System.out.println(j);         // 10
		System.out.println(ab);     //  11
		int k = ++ab;
		System.out.println(k);       //  12
		int a = 10;
		int a1 = 10;
		System.out.println(++a);    //   11
		System.out.println(+a);      //   11
		System.out.println(a--);     //   11
		System.out.println(--a1);    //   9 
		System.out.println(-a1);     //  -9		

	}

}
