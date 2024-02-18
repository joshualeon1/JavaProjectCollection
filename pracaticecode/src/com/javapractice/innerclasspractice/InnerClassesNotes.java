package com.javapractice.innerclasspractice;//	08.11.2021

class Outer {
	
	 int a = 1;
	 static int b = 2;
	 
	 public static void show() {
		 System.out.println("Outer class .show() accessed.");
	 }
	 
	 static class Inner {	// The file name for this class would look like this: Outer$Inner.class		(Note: not sure if this matters but knowledge is knowledge)
		 
		 public void printB() {
			 System.out.println("Outer class (using 'static' b variable) -> Inner class .printB() accessed. b value is :" + b);
		 }

		 public void printC() {
			 int c = b;
			 System.out.println("Outer class (using 'static' b variable) -> Inner class .printC() accessed. c value  was set = to b 'static variable and value is: " + c);
		 }
		 
		 public void display() {
			 System.out.println("Outer class -> Inner class .display() accessed.");
		 }
		 
	 }//Inner Class
	 
 }//Outer Class

public class InnerClassesNotes {	//The name of the file uses the class name on this line 'InnerClassesNotes.java'

	//	NOTE: WITHIN a class, one can have the following: variables, methods, classes
	
	public static void main(String[] args) {

		Outer obj = new Outer();	//	Normally, to access a classes' behaviors (methods), you create an object of the class as you can see on this line
		obj.show();					//	Then you simply use the '.' operator to use the method
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
		
		//	How to access a variable within a class
		System.out.println(obj.a);
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
		
		//	Even though 'b' is a static int, 'b' is only accessible to other classes/methods within it, of course, variables included. BUT we can access it through the 'obj' object created of 'Outer' type of course.
		System.out.println(obj.b);
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
		
		//Outer.Inner obj1 = obj.new Inner();	//	NOTE: When the 'Inner' class is 'NON-STATIC' you access the 'Inner' class using the method seen on this line of code
		Outer.Inner obj1 = new Outer.Inner();	//	OTHERWISE: IF the 'Inner' class is static, as seen on line 10, you access the 'Inner' class using the method seen on this line
		obj1.display();
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
		
		//	Line 59 and line 63 are a continuation of what was being discussed on line 47
		obj1.printB();
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
		
		obj1.printC();
		
		/* Final Notes: From what it seems, you have to make separate 'obj' variables to access each individual class, even though the 'Inner' class is within the 'Outer' class, it doesn't seem possible to have
		 * ONE single 'obj' variable for accessing methods within both. Which is why we have 'obj' and 'obj1' where 'obj' is used to accessing anything within the 'Outer' class (excluding the 'Inner' class) and we
		 * make a separate 'obj1' class to access anything within that class.
		 */

	}//Main
	

}//Class
