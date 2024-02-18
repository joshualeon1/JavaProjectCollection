package com.miniprojects;

public class MeasureRuntime {

	public static void main(String[] args) throws InterruptedException {

		long start = System.nanoTime();//nanosecond is a billionth of a second
		
		//--------Program--------

		System.out.println("\nHere is your reveresed String: " + reverseString("This is a test."));
		
		//-----------------------
		
		long duration = (System.nanoTime() - start);//returns a time in nanoseconds
		
		System.out.println(duration + "ns");

	}//Main

	private static String reverseString(String str) {
		String reversed = "";
		
		for(int i = str.length()-1; i >= 0; i--)
			reversed += str.charAt(i);
			
		return reversed;
	}
	
}//Class
