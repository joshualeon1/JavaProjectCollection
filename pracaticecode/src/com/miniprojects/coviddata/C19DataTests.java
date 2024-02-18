package com.miniprojects.coviddata;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C19DataTests {

	public static void main(String[] args) {

		//an array to hold our objects
		CovidEntry[] covidEntries = new CovidEntry[33718];

		File file = new File("us-states.csv");
		Scanner input = null;

		//Exception Handling
		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			e.printStackTrace();
			System.exit(0);
		}//end catch

		input.nextLine();//to read in the header of the text file

		int index = 0;
		while(input.hasNext()) {

			//2020-01-21,state,fips,cases,deaths
			String line = input.nextLine();//each line in the file is read in as a single String segment here
			String[] fields = line.split(",");//the string segment is then 'split' at every ',' char (see .cvs file)
			covidEntries[index++] = new CovidEntry(fields[0], fields[1], Integer.parseInt(fields[2]), Integer.parseInt(fields[3]), Integer.parseInt(fields[4]));

		}//end while

		input.close();
		
		double cases = overallCases(covidEntries);
		double deaths = overallDeaths(covidEntries);
		double mortalityRate = percentOfDeaths(cases, deaths);
		
		System.out.println("Overall number of cases within given dataset: " + String.format("%,.0f",cases));
		System.out.println("Overall number of deaths within given dataset: " + String.format("%,.0f",deaths));
		System.out.println("Mortality: "+ String.format("%,.2f", mortalityRate) + "%");
		System.out.println("========================================================================================");
		System.out.println("Overall cases in California: " + String.format("%,.0f", casesPerState("California", covidEntries)));
		System.out.println("Overall deaths in California: " + String.format("%,.0f", deathsPerState("California", covidEntries)));
		System.out.println("========================================================================================");
		System.out.println("Overall cases in Washingtion: " + String.format("%,.0f", casesPerState("Washington", covidEntries)));
		System.out.println("Overall deaths in Washingtion: " + String.format("%,.0f", deathsPerState("Washington", covidEntries)));

	}//end Main
	
	private static double overallCases(CovidEntry[] c19Entries) {
		double cases = 0;
		for(int i=0; i<c19Entries.length; i++) {
			cases += c19Entries[i].getCases();
		}
		return cases;
	}
	
	private static double overallDeaths(CovidEntry[] c19Entries) {
		double deaths = 0;
		for(int i=0; i<c19Entries.length; i++) {
			deaths += c19Entries[i].getDeaths();
		}
		return deaths;
	}
	
	private static double percentOfDeaths(double totalCases, double totalDeaths) {
		double percentage = (totalDeaths/totalCases)*100;
		return percentage;
	}
	
	private static double casesPerState(String state, CovidEntry[] c19Entries) {
		double cases = 0;
		for(int i=0; i<c19Entries.length; i++) {
			if(c19Entries[i].getState().equals(state))
				cases += c19Entries[i].getCases();
		}
		return cases;
	}
	
	private static double deathsPerState(String state, CovidEntry[] c19Entries) {
		double deaths = 0;
		for(int i=0; i<c19Entries.length; i++) {
			if(c19Entries[i].getState().equals(state))
				deaths += c19Entries[i].getDeaths();
		}
		return deaths;
	}

}//end Class
