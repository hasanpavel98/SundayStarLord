package com.upskill.java_5;

public class InterfaceImplementation implements Interface {

	@Override
	public void iDoor() {
		System.out.println("My car has 4 door");
		
	}

	@Override
	public void iDoor(int door) {
		System.out.println("My car has door : " + door);
		
	}

	@Override
	public String iDoor() {
		System.out.println("My car has door : " + glass);
	}

	@Override
	public int iWheel() {
		// TODO Auto-generated method stub
		return 0;
	}

}
