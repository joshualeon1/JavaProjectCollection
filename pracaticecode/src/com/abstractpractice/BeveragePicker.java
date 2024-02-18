package com.abstractpractice;

import java.util.Scanner;

public class BeveragePicker extends Beverage{
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		BeveragePicker bp = new BeveragePicker();
		
		bp.printOptions();
		int option = sc.nextInt();
		
		bp.beverageOption(option);
		
		System.out.println("\nProgram ran successfully.");

	}//end Main

	@Override
	public void beverageOption(int option) {
		switch(option) {
		case 1:
			System.out.println("One cup of water coming right up.");
			break;
		case 2:
			System.out.println("One cup of tea coming right up.");
			break;
		case 3:
			System.out.println("One cup of coffee coming right up.");
		case 4:
			System.out.println("One bottle of juice coming right up.");
			break;
		case 5:
			System.out.println("One soda pop coming right up.");
			break;
		default:
			System.out.println("Invalid option. Goodbye.");
			sc.close();
			System.exit(0);
		}
	}

	@Override
	public void printOptions() {
		System.out.println("Choose a beverage from the list below:\n"
							+ "1 - Water\n"
							+ "2 - Tea\n"
							+ "3 - Coffee\n"
							+ "4 - Juice\n"
							+ "5 - Soda\n"
							+ "Enter your choice here:");
	}

}//end Class
