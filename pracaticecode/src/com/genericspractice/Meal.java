package com.genericspractice;

import java.util.ArrayList;

public class Meal<M extends Food>{
	
	private ArrayList<M> mealList = new ArrayList<>();
	
	private String name;
	
	public Meal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean addMeal(M meal) {
		if(mealList.contains(meal)) {
			System.out.println(meal.getName() + " is already within the list.");
			return false;
		}
		mealList.add(meal);
		System.out.println(meal.getName() + " added.");
		return true;
	}
	
	public int numOfMeals() {
		return mealList.size();
	}
	
	public void printMeals() {
		if(mealList.isEmpty())
			System.out.println("There are no meals in the list.");
		else {
			System.out.println("Meals:");
			for(M meal: mealList)
				System.out.println(meal.getName());
		}
	}

}
