package com.javapractice;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

//This program prompts the user to enter the number of usernames they'd wish to save, then having them enter each name of the user, finally ending with printing every users' name using a LinkedList.

public class LinkedListPractice {
	
	private static Scanner sc = new Scanner(System.in);
	private static LinkedList<String> username = new LinkedList<String>();

	public static void main(String[] args) {

		retrievingUsername(numOfUsers());
		printUsernameList();

	}//end main
	
	private static int numOfUsers() {
		
		while(true) {
			System.out.println("Enter the number of users:");
			if(sc.hasNextInt()) {
				int numOfUsers = sc.nextInt();
				return numOfUsers;
			}else{
				sc.nextLine();						//<--- Recall that this is needed in order to hand the 'enter'/space after entering an invalid value
				System.out.println("Invalid value. Please try again.\n");
			}
		}
	}//end numOfUsers
	
	private static void retrievingUsername(int numOfUsers) {
		System.out.println();
		for(int i=0; i<numOfUsers; i++) {
			System.out.println("Enter User number " + (i+1) + "'s username:");
			username.add(sc.next());
		}
	}//end retrievingUsername
	
	private static void printUsernameList() {
		Iterator itr = username.iterator();
		int userNum = 1;
		System.out.println("\nList of Users:");
		while(itr.hasNext()) {
			System.out.println(userNum + ". " + itr.next());
			userNum++;
		}
	}
	
}//end class
