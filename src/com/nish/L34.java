package com.nish;

class andy
{
	private int a;
	private int b;
	private int c;
	/*
	 *  you can't access private variable ouside class
	 *  but the value of private variable can easily access outside the class
	 *  (by using setter & getter methods) 
	 */
	static andy an = new andy();

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	static andy getAndy()
	{
		return an;
	}
	
}

public class L34 
{
	public static void main(String[] args) 
	{
		andy an = new andy();
		// System.out.println(an.a); can't access , due to private access specifier.
		// no accessing outside the class....
		System.out.println(an.getA());
		an.setA(22);
		System.out.println(an.getA());
	}

}
