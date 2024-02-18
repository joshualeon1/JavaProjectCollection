package com.javapractice;

//We use a shopping list for an example of a 2D ArrayList

import java.util.ArrayList;

public class ArrayList2DPractice {

	public static void main(String[] args) {

		//Below, we have an ArrayList of type ArrayList that holds Strings, basically, we have a list of lists (a list that holds other lists)
		ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();

		//One of the lists we'll add to our 2D ArrayList
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("Pasta");
		bakeryList.add("Garlic bread");
		bakeryList.add("Donuts");

		System.out.println(bakeryList.get(0));//Example displaying what is in our 'bakeryList' at index 0
		System.out.println("============================================================================");

		//Second list we'll add to our 2D ArrayList
		ArrayList<String> produceList = new ArrayList<String>();
		produceList.add("Tomatoes");
		produceList.add("Zucchini");
		produceList.add("Peppers");

		//Third list we'll add to our 2D ArrayList
		ArrayList<String> beverageList = new ArrayList<String>();
		beverageList.add("Water");
		beverageList.add("Tea");
		
		System.out.println(beverageList);//Displaying what is within our 'beverageList' list
		System.out.println("============================================================================");
		
		//Now we have three different lists per their respective category(ex. bakery, produce, beverages). We add them to our list of lists now (the 2D ArrayList)
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(bakeryList);
		
		System.out.println(groceryList);//Displays the values held within each list within this 2D ArrayList
		System.out.println("============================================================================");
		System.out.println(groceryList.get(0));//Displays only the values of what is held within the list at index 0
		System.out.println("============================================================================");
		System.out.println(groceryList.get(0).get(0));//Displays only the value of what is held within the list at index 0, and what is at index 0 within that list

	}//Main

}//Class
