//	NOTE: ALL methods required to be implemented from an 'INTERFACE' MUST be 'PUBLIC'

package com.interfaceclasses;

interface MyInterface {
	
	//NOTE: ALL variables within an Interface MUST be instantiated within the interface. Variables instantiated within an Interface are by default: PUBLIC, STATIC, FINAL so their value CANNOT be altered
	String message = "MyInterface message accessed.";
	int num = 10;
	
	void method1();
	void method2();
	
}

//	Note: An Interface can EXTEND another interface, but not implement it
interface MySecondInterface extends MyInterface {
	
	String message = "MySecondInterface message accessed.";
	int num = 12;
	
	void method3();
	void method4();
	
}

public class InterfacesPractice implements MySecondInterface{

	public static void main(String[] args) {

		//	NOTE: You MUST make an object using the interface type as the line below in order to have ACCESS to the methods (in order to use them as they are NON-STATIC)
		MySecondInterface obj = new InterfacesPractice();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		
		System.out.println("===================================");
		
		System.out.println(MyInterface.message);
		System.out.println(message);
		
		System.out.println("===================================");
		
		//	Variables in interfaces that share the same variable name:
		System.out.println(num);
		System.out.println(MyInterface.num);
		System.out.println(MySecondInterface.num);

	}//end main

	//	Methods below MUST be public as it is implemented from an 'Interface'
	@Override
	public void method1() {
		System.out.println("Method 1 has been accessed.");
	}

	@Override
	public void method2() {
		System.out.println("Method 2 has been accessed.");
	}

	@Override
	public void method3() {
		System.out.println("Method 3 has been accessed.");
	}

	@Override
	public void method4() {
		System.out.println("Method 4 has been accessed.");
	}

}//end class
