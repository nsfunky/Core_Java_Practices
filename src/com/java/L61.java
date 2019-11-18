package com.java;

public class L61 {
	public static void main(String[] args) {

		System.out.println(Byte.MIN_VALUE + "<---->" + Byte.MAX_VALUE);
		// -128 ----------- 127

		byte b1 = 10 + 20;
		System.out.println(b1); // 30

		byte b2 = 10;
		byte b3 = 20;
		// byte b4 = b2+b3;

		byte b4 = (byte) (b2 + b3);
		System.out.println(b4); // 30

		final int b5 = 10;
		final int b6 = 20;
		byte b7 = b5 + b6;
		System.out.println(b7); // 30

		char c1 = 65;
		char c2 = 10;
		// char c3 = c1 + c2; for that, we have to cast it into char
		char c3 = (char) (c1 + c2);
		System.out.println(c3); // K

		int res = c1 + c2;
		System.out.println(res); // 75

		final char c4 = 65;
		final char c5 = 10;
		char c6 = c4 + c5;
		System.out.println(c6); // K

		byte b8 = 10;
		int a1 = b8 + 20;
		System.out.println(a1); // 30

		// int a2 = b8+20l; upcasting not allowed.

		long l1 = b8 + 20l;
		System.out.println(l1); // 30

		float f1 = b8 + 12.0f;
		System.out.println(f1); // 22.0

		// int a2 = b8+20.0f // error

		float f2 = Long.MAX_VALUE;
		System.out.println(f2); // 9.223372E18

		System.out.println(Long.MAX_VALUE); // 9223372036854775807

		// long l2 = 12l + 10.0f; // upcasting again

		float f3 = 12l + 20.0f;
		System.out.println(f3); // 32.0

	}

}
