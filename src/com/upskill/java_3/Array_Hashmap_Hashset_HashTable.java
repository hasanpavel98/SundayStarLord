package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
	
	//Array store multiple data using index
	
	/* int age = 30;
	
	int[] ageStarLord = new int[]{25, 30, 28, 32, 35, 27};
	
	//Array index                 [0] [1] 
		
	System.out.println("Student Age : " + ageStarLord[3]);
	System.out.println("Total Student : "	+ ageStarLord.length);
	
	String[] nameStarLord = new String[]{"Omi", "Pavel", "Tahan", "Emo", "Ifty", "Sakib"};
	
	System.out.println("Name of Student : " + nameStarLord[1]);
	System.out.println("Name of Student : "	+ nameStarLord.length);
	
	for(int i=0; i<nameStarLord.length; i++){
		System.out.print(nameStarLord[i] + " ");
	}
	
	int [][] ageStarLord2D = {{25, 30, 28, 32, 35, 27},
			                  {26, 29, 30, 34}};
	
	System.out.println("Student Age 2d : " + ageStarLord2D[0][2]);
	

	String[][] nameStarLord2D = {{"Omi", "Pavel", "Tahan", "Emo", "Ifty", "Sakib"},
			                                 {"Omi", "Pavel", "Tahan", "Emo", "Sakib", "Ifty"}};
	
	System.out.println("Student Name 2d : " + nameStarLord2D[0][1]);
	
	HashMap<String, String> Capital = new HashMap<String, String>();
	
	Capital.put("BD", "Dhaka");
	
	System.out.println("Capital City : " + Capital.get("BD"));
	
		
	Hashtable<String, String> Region = new Hashtable<String, String>();
	 
	Region.put("BD", "Asia");
	Region.put("USA", "America");
	Region.put("BD", "South Asia");
	
	
	System.out.println("Region : " + Region.get("BD"));
	*/
		
	HashSet<String> car = new HashSet<String>();
	car.add("BMW");
	car.add("Toyota");
	car.add("Audi");
	car.add("Ford");
	
	System.out.println("Car : " + car);
	}
}