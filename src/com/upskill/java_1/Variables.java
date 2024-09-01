package com.upskill.java_1;

public class Variables {
	
// Variables in Java
	
	//Instance OR global variable - variable declared in class level, outside of method
	//Static variable - variable belong to class and don't required creating object
	//Local variable - variables declared inside methods
	//Method parameter - variables used as method parameter and bring data outside to Inside
	
	
	String counry = "USA";			   	//Instance OR global variable - variable declared in class level, outside method
	
	static String region = "America";   //Static variable - variable belong to class and don't required creating object
	
	public static void main(String[] args) {
	
		String city = "New York"; 		//Local variable - variables declared in methods
		michigan("Wayne");
		texas("Anderson");
	}

	public static void texas(String county){     //Local variable - variables declared in methods
		String city = "Dallas";
		String myCounty = county;
		System.out.println(city);
		System.out.println(myCounty);
		System.out.println(region);
		
	}
	
	public static void michigan(String Country){  //Local variable - variables declared in methods
		String city = "Detroit"; 		
		String myCounty = (region);
		System.out.println(city);
		System.out.println(myCounty);
		System.out.println(region);
	}
}
