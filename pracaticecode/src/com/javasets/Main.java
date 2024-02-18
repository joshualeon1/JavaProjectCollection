package com.javasets;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Set<Integer> t = new LinkedHashSet<Integer>();
		t.add(5);
		t.add(7);
		t.add(5);
		t.add(9);
		t.add(-8);
		
		System.out.println(t);

	}//Main

}//Class
