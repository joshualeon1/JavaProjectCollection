package com.miniprojects;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your String:");
		String userInput = sc.nextLine();

		reverseString(userInput);

		System.out.println("\nHere is your reveresed String: " + reverseString(userInput));
		
		sc.close();
		
	}//end Main

	private static String reverseString(String str) {
		String reversed = "";
		
		for(int i = str.length()-1; i >= 0; i--)
			reversed += str.charAt(i);
			
		return reversed;
	}
	
}//end Class
