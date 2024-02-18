package com.miniprojects.shopping;

import java.util.HashMap;

public class ShoppingList {

	private String name;
	private HashMap<String, Integer> userList;
	
	ShoppingList(String name) {
		this.name = name;
		userList = new HashMap<String, Integer>();
	}

	public String getName() {
		return name;
	}
	
	public void addItem(String item, int amount) {
		if(userList.containsKey(item)) {
			userList.put(item, userList.get(item)+amount);
			System.out.println(amount + " added to " + item);
		} else {
			userList.put(item, amount);
			System.out.println(amount + " " + item + " added to list.");
		}
	}
	
	public void removeAmount(String item, int amount) {
		if(userList.containsKey(item) && userList.get(item) > amount) {
			userList.put(item, userList.get(item)-amount);
		} else {
			System.out.println(item + " is not within the list or invalid amount given.");
		}
	}
	
	public void removeItem(String item) {
		if(userList.containsKey(item))
			userList.remove(item);
		else
			System.out.println(item + " is not in list.");
	}
	
	public void printItems() {
		System.out.println("List:");
		userList.entrySet().forEach(entry -> {
			System.out.println("~ " + entry.getKey() + " - " + entry.getValue());
		});;
	}
	
}
