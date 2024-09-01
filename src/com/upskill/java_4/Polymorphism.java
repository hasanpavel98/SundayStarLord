package com.upskill.java_4;

public class Polymorphism {
	
	 /* Polymorphism is the ability of an object to take on many forms.
	 - Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	 - Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
	 */
/*
	public static void main(String[] args) {
		car(7);
		car("Red");
		car(true);
		
	}

	public static void car(){
		System.out.println("My car is Tesla!");	
	}
	public static void car(String color){
		System.out.println("My car is : " + color);	
	}
	public static void car(int seat){
		System.out.println("My car has Seat : " + seat);	
	}
	public static void car(boolean ev){
		System.out.println("My car is : " + ev);	
	}
	public static void car(String color, int seat){
		System.out.println("My car is : " + color + " . It has seat : " + seat);	
		
*/
	public static void main(String[] args) {
		computer(8);
		computer("Black");
		computer(true);
		
		
	}

	public static void computer(){
		System.out.println("My computer is HP!");	
	}
	public static void computer(String color){
		System.out.println("My computer is : " + color);	
	}
	public static void computer(int ram){
		System.out.println("My computer has ram : " + ram);	
	}
	public static void computer(boolean laptop){
		System.out.println("My computer is : " + laptop);	
	}
	public static void computer(String color, int ram){
		System.out.println("My computer is : " + color + " . It has : " + ram);	
		
	
	}
}
