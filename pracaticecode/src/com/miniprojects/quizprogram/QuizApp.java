package com.miniprojects.quizprogram;

import java.util.Scanner;

public class QuizApp {

	public static void main(String[] args) {

		
		//The prompts
		String q1 = "How many letters are in the alphabet:\n"
				  + "a) 20\nb) 24\nc) 26\nd) 28";
		String q2 = "How many vowels are there:\n"
				  + "a) 4\nb) 5\nc) 6\nd) 3";
		//An array of questions - (String prompt, String answer)
		Question[] questions = {new Question(q1, "c"), new Question(q2, "b")};
		
		takeTest(questions);

	}//end Main

	private static void takeTest(Question[] questions) {
		int score = 0;//Keep track of correct answers
		Scanner sc = new Scanner(System.in);//Scanner object
		//Traversing through questions, receiving/checking answers
		for(int i=0; i<questions.length; i++) {
			System.out.println(questions[i].prompt);
			String answer = sc.nextLine();
			if(answer.equals(questions[i].answer))
				score++;
		}
		sc.close();
		System.out.println("You got " + score + "/" + questions.length + "!");//Printing final score
	}

}//end Class
