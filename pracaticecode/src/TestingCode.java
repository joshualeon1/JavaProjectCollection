import java.util.Scanner;

public class TestingCode {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String str = sc.nextLine();
		
		System.out.println("Sentence Given: " + str);
		System.out.println("Sentence Reversed: " + reverseSentence(str));

	}//Main
	
	public static String reverseSentence(String s) {
	    // Finding the index of the whitespaces
	    int x = s.indexOf(" ");
	    
	    //Base condition
	    if(x == -1)
	      return s;
	      
	     //Recursive call
	    return reverseSentence(s.substring(x+1)) +" "+ s.substring(0, x);
	     }
	
}//Class
