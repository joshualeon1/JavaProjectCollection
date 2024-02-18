//	09.12.2021

package com.genericspractice;

//We make our own class that uses Generics
class Container<N extends Number>{//Here, the 'N' can be any letter A-Z which is equivalent to what we've seen in lists (List<E>). We extend 'Number' so that 'T' only accepts numbers (Integer, Double, etc.)
	
	//Will hold the value of what we pass in
	N value;

	//A simple Getter/Setter for our 'value' variable
	public N getValue() {
		return value;
	}

	public void setValue(N value) {
		this.value = value;
	}
	
	//Simple to show of what type our value holds
	public void showType() {
		System.out.println(value.getClass().getName());
	}
}

public class PracticeGenerics {

	public static void main(String[] args) {

		//We create our 'Container' object not using Generics
		Container obj = new Container();
		
		//Since our class doesn't have a constructor, we instantiate the value of 'value' to 9 here
		obj.value = 9;
		//We display the 'value' type here
		obj.showType();
		System.out.println(obj.value);//Prints out the value 'value' currently holds (in this case, 9)
		//Now we'll change the value of 'value' to a double and repeat the above steps
		obj.value = 9.5;
		obj.showType();//This displays 'java.lang.Double' now instead of 'java.lang.Integer'
		System.out.println(obj.value);//Prints out the value of 'value' which we changed from an int type '9' to a double type '9.0'
		
		//Separate the two different tests
		System.out.println("---------------------------------------------");
		
		//Creating our 'Container' object using Generics
		Container<Double> obj2 = new Container<Double>();
		
		//obj2.value = 3; <-- NOTE that this doesn't work as it's an 'int' and not a 'double' type
		obj2.value = 12.3;
		obj2.showType();//Displays 'java.lang.Double' of course
		System.out.println(obj2.value);//We get '12.3'

	}//end Main

}//end Class
