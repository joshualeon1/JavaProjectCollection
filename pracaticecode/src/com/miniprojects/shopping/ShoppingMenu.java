package com.miniprojects.shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingMenu {

	private ArrayList<ShoppingList> shopLists;
	private Scanner sc = new Scanner(System.in);

	public ShoppingMenu() {

		shopLists = new ArrayList<ShoppingList>();
		System.out.println("Welcome to the Shopping Application!");
		runOptions();

	}

	private int printMenu() {

		System.out.println("\n1) Create a Shopping List"
				+ "\n2) View Shopping Lists"
				+ "\n3) Delete a Shopping List"
				+ "\n4) Add an item to a Shopping List"
				+ "\n5) View items within a Shopping List"
				+ "\n6) Delete an item from a Shopping List"
				+ "\n7) Delete a certain amount from an item within a Shopping List"
				+ "\n8) Quit Program"
				+ "\nEnter an integer:");

		return Integer.parseInt(sc.nextLine());
	}

	private void runOptions() {

		switch(printMenu()) {
		case 1:
			createShopList();
			runOptions();
		case 2:
			viewShopLists();
			runOptions();
		case 3:
			deleteShopList();
			runOptions();
		case 4:
			addToShopList();
			runOptions();
		case 5:
			viewItems();
			runOptions();
		case 6:
			deleteItem();
			runOptions();
		case 7:
			deleteAmount();
			runOptions();
		case 8:
			quitProgram();
		default:
			System.out.println("Invalid input, please try again.");
			runOptions();
		}

	}

	private int queryShopList(String name) {

		for(int i=0; i<shopLists.size(); i++) {
			if(shopLists.get(i).getName().equals(name))
				return i;
		}

		return -1;

	}

	private void createShopList() {

		System.out.println("Enter the name of your Shopping List: ");
		String name = sc.nextLine();

		if(queryShopList(name) == -1) {
			shopLists.add(new ShoppingList(name));
			System.out.println(name + " has been created.");
		} else
			System.out.println(name + " is already in this list.");

	}

	private void viewShopLists() {

		if(shopLists.isEmpty()) {
			System.out.println("There are none to view.\n");
		} else {
			for(ShoppingList s : shopLists)
				System.out.println("- " + s.getName());
		}

	}

	private void deleteShopList() {

		System.out.println("Enter Shopping List name:");
		String name = sc.nextLine();

		if(queryShopList(name) != -1) {
			shopLists.remove(queryShopList(name));
			System.out.println(name + " was removed from list.");
		}else
			System.out.println(name + " is not in this list.");

	}

	private void addToShopList() {

		System.out.println("Enter the name of the Shopping List you would like to add to:");
		String name = sc.nextLine();
		System.out.println("Enter the name of the item you would like to add:");
		String item = sc.nextLine();
		System.out.println("Enter the amount:");
		int amount = Integer.parseInt(sc.nextLine());
		
		shopLists.get(queryShopList(name)).addItem(item, amount);

	}

	private void viewItems() {

		System.out.println("Enter the name of the Shopping List you would like to view:");
		String name = sc.nextLine();
		
		shopLists.get(queryShopList(name)).printItems();

	}

	private void deleteItem() {

		System.out.println("Enter the name of the Shopping List you would like to delete from:");
		String name = sc.nextLine();
		System.out.println("Enter the name of the item you would like to delete:");
		String item = sc.nextLine();
		
		shopLists.get(queryShopList(name)).removeItem(item);

	}

	private void deleteAmount() {

		System.out.println("Enter the name of the Shopping List you would like to delete from:");
		String name = sc.nextLine();
		System.out.println("Enter the name of the item you would like to reduce from:");
		String item = sc.nextLine();
		System.out.println("Enter the amount you would like to reduce:");
		int amount = Integer.parseInt(sc.nextLine());
		
		shopLists.get(queryShopList(name)).removeAmount(item, amount);

	}

	private void quitProgram() {

		System.out.println("Goodbye!");
		sc.close();

		System.exit(0);

	}

}
