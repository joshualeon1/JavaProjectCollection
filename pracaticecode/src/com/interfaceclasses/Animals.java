package com.interfaceclasses;

import java.util.Scanner;

public class Animals implements AnimalCharacteristics{
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		AnimalCharacteristics obj = new Animals();

		System.out.println("If the animal is asleep, enter 0, else enter 1:");
		boolean sleep = false;
		if(sc.nextInt() == 0)
			sleep = true;
		
		obj.active(sleep);
		
		System.out.println("====================================================================");
		
		System.out.println("If the animal is not hungry, enter 0, else enter 1:");
		boolean hungry = false;
		if(sc.nextInt() == 1)
			hungry = true;
		
		obj.eat(hungry);
		
		System.out.println("====================================================================");
		
		System.out.println("Enter 0 if the animal isn't moving, 1 if it is moving at a slow pace, 2 if it is moving at a moderate pace, and 3 if the animal is moving at a fast pace:");
		int speed = sc.nextInt();
		obj.moving(speed);
		
		sc.close();
		System.exit(0);

	}//end Main

	public void moving(int speed) {
		switch(speed) {
		case 0:
			System.out.println("The animal isn't moving at all and is just in one place.");
			break;
		case 1:
			System.out.println("The animal is walking around.");
			break;
		case 2:
			System.out.println("The animal is moving around a bit fast.");
			break;
		case 3:
			System.out.println("The animal is running around.");
			break;
		default:
			System.out.println("Invalid value given.");
			break;
		}
	}

	public void eat(boolean hungry) {
		if(hungry)
			System.out.println("The animal is hungry and needs nutrients.");
		else
			System.out.println("The animal is not hungry and does not need nutrients.");
	}

	public void active(boolean sleep) {
		if(sleep)
			System.out.println("The animal is asleep.");
		else
			System.out.println("The animal is awake.");
	}

}//end Class
