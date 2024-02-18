package com.genericspractice;

public class Main {

	public static void main(String[] args) {

		Taco asadaTaco = new Taco("Asada Taco");
		Hamburger cheeseBurger = new Hamburger("Cheeseburger");
		
		Meal<Taco> tacos = new Meal<>("Tacos");
		tacos.addMeal(asadaTaco);
		
		tacos.numOfMeals();
		tacos.printMeals();
		
		System.out.println("++++++++++++++++++++++++++");
		
		Meal<Hamburger> hamburgers = new Meal<>("Hamurgers");
		hamburgers.addMeal(cheeseBurger);
		
		hamburgers.numOfMeals();
		hamburgers.printMeals();

	}//end Main

}//end Class
