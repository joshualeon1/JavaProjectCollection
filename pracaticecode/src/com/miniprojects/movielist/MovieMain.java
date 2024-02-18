package com.miniprojects.movielist;
import java.util.*;

public class MovieMain {
	
	private static Scanner sc = new Scanner(System.in);
	private static MovieCommands movies = new MovieCommands();
	
	public static void main(String[] args) {
		
		movies.readsIntoArrayList();
		
		System.out.println("Welcome to the movie list application.");
		
		while(true) {
			printOptions();
			String optionInput = sc.nextLine();
			boolean hasInt = optionValidation(optionInput);
			if(hasInt) {
				int num = Integer.valueOf(optionInput);
				if(num >= 0 && num <=5)
					optionExecution(num);
				else {
					System.out.println("\n" + "(" + num + ")" + " is not a valid value. Please try again.");
				}
			} else {
				System.out.println("\n" + "(" + optionInput + ")" + " is not a valid input. Please try again.");
			}
		}

	}//end main

	public static void printOptions() {
		System.out.println("\nSelect an action from one of the options below:");
		System.out.println("0 - End program.");
		System.out.println("1 - Add a movie title to the list.");
		System.out.println("2 - Print movie title list.");
		System.out.println("3 - Search for a movie title within the list.");
		System.out.println("4 - Remove a movie title from the list.");
		System.out.println("5 - Replace a movie title within the list.");
		System.out.print("Enter your choice:");
	}
	
	public static void optionExecution(int optionNum) {
		switch(optionNum) {
		case 0:
			sc.close();
			movies.endProgram();
		case 1:
			System.out.print("\nEnter the movie title you would like to add: ");
			movies.addMovieTitle(sc.nextLine());
			break;
		case 2:
			movies.printMovieList();
			break;
		case 3:
			System.out.print("\nEnter the movie title you are searching for: ");
			movies.searchMovieTitle(sc.nextLine());
			break;
		case 4:
			System.out.print("\nEnter the movie title you would like to remove: ");
			movies.removeMovieTitle(sc.nextLine());
			break;
		case 5:
			System.out.print("\nEnter the movie title you would like to replace: ");
			String oldTitle = sc.nextLine();
			System.out.print("\nEnter the movie title you would like to replace with: ");
			String newTitle = sc.nextLine();
			movies.replaceMovieTitle(oldTitle, newTitle);
			break;
		}
	}//end optionExecution
	
	public static boolean optionValidation(String input) {
		boolean isAnInt = false;//used to check in the for loop below if the SINGLE String char is at least an int by checking if it may be a num 0-9
		if(input.length()>1 || input.isEmpty()) {
			return false;
		}else {
			for(int i=0; i<10; i++) {
				if(input.equals(String.valueOf(i)))
					isAnInt = true;
			}
			return isAnInt;
		}
	}
	

}//end class
