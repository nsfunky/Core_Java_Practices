package com.nish2;

/*

if a class is implementing any interface then remember following points

1) that class must override all the methods of the interface.
2) if sub class is not overriding all the methods of interface,then sub class must be declared as an 
   abstract class.

*/

interface I7
{
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
}

/*
abstract class xyz implements I7
{
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub	
	}
	
}

*/


/*
 
 class xy implements I7
 { 

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
	
}

*/

public class InterfaceTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
