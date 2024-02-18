package com.miniprojects.twostep;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Account object taking in params of: String username, String password, boolean twoStepChoice;
		Account myAccount = new Account("Joshua", "Yes", true);
		TwoStepAuthenticator myTwoStep = new TwoStepAuthenticator();
		
		if(myAccount.isTwoStepChoice()) {
			System.out.println("Enter your generated code:");
			myTwoStep.displayCode();
			boolean valid = myTwoStep.validCode(input.nextInt());//checking if given user code matched our generated code
			if(valid)
				System.out.println("Welcome.");
			else
				System.out.println("Incorrect.");
		}else {
			System.out.println("Welcome to (program name)!");//if Account object's choice was false
		}
		
		input.close();
		System.out.println("Program ran successfully.");
		
	}//end Main

}//end Class
