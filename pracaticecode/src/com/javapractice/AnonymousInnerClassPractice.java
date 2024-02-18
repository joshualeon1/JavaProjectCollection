package com.javapractice;

class Greeting {
	
	void Welcome() {
		System.out.println("Hello World!");
	}
	
}//Greeting

public class AnonymousInnerClassPractice {

	public static void main(String[] args) {

		Greeting greeting = new Greeting() {

			@Override
			void Welcome() {
				System.out.println("Yo bro!");
			}
			
		};
		
		Greeting greeting2 = new Greeting();
		greeting.Welcome();
		greeting2.Welcome();

	}//Main

}//Class
