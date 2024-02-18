package com.javapractice;

import java.util.LinkedList;

public class LinkedListPractice2 {

	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();//For the 'Stack' version
		LinkedList<String> myList2 = new LinkedList<String>();//For the 'Queue' version
		
		//Note:If you look within the LinkedList java class, we will see that a 'Deque' interface is implemented which works sort of like a doubly queue or a stack. This can be seen below.
		myList.push("A");
		myList.push("B");
		myList.push("C");
		myList.push("D");
		myList.push("F");
		myList.pop();
		
		System.out.println(myList);//The first String we add is at the very end, like a stack, and the 'pop()' function removes the most recent value added to the list
		
		//Note:The previous example was that of a 'Stack' using a LinkedList. The following is an example of that of 'Queue' still using the LinkedList class.
		myList2.offer("A");
		myList2.offer("B");
		myList2.offer("C");
		myList2.offer("D");
		myList2.offer("F");
		myList2.poll();//Removes the value added first to the list
		
		System.out.println(myList2);//When printed, we see that the first value added has been remove due to the 'poll()' function and the next following value is at the head.
		
		//To ADD to our LinkedList, using the 'Queue' version, we do the following:
		myList2.add(3,"E");//(index, value)
		
		System.out.println(myList2);//After printing, we see that 'E' was added at index '3'
		
		//To remove, we simply use the 'remove()' function
		myList2.remove("D");
		
		System.out.println(myList2);//There we go, value 'D' was removed.

	}//Main

}//Class
