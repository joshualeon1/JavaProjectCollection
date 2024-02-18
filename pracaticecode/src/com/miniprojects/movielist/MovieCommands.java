package com.miniprojects.movielist;

import java.io.*;
import java.util.*;

public class MovieCommands {
	
	private ArrayList<String> movieList = new ArrayList<String>();
	
	public void readsIntoArrayList() {
		
		File file = new File("MovieList.txt");
		Scanner input = null;
		
		try {
			input = new Scanner(file);
			input.nextLine();	//read in the header and do nothing with it
			
			while(input.hasNextLine()) {
				movieList.add(input.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("No file to read from found.\n");
			//e.printStackTrace();		//<--- outputs an error message to console
			//System.exit(0);
		}
		
	}
	
	private int findMovieTitle(String movieTitle) {
		return movieList.indexOf(movieTitle);
	}
	
	public void addMovieTitle(String movieTitle) {
		if(findMovieTitle(movieTitle) == -1) {
			movieList.add(movieTitle);
			System.out.println(movieTitle + " was added.");
		}else
			System.out.println(movieTitle + " is already in the list.");
	}
	
	public void printMovieList() {
		if(movieList.size()==0)
			System.out.println("\nThere are no movie titles in this list.");
		else {
			System.out.println("\nMovie List:");
			for(int i=0; i<movieList.size(); i++) {
				System.out.println((i+1) + ". " + movieList.get(i));
			}
		}
	}
	
	public void searchMovieTitle(String movieTitle) {
		if(findMovieTitle(movieTitle) != -1)
			System.out.println(movieTitle + " found.");
		else
			System.out.println(movieTitle + " not found.");
	}
	
	public void removeMovieTitle(String movieTitle) {
		int index = findMovieTitle(movieTitle);
		if(index != -1) {
			movieList.remove(index);
			System.out.println(movieTitle + " was removed.");
		} else
			System.out.println(movieTitle + " does not exist, and thus, was not removed.");
	}
	
	public void replaceMovieTitle(String oldTitle, String newTitle) {
		int index = findMovieTitle(oldTitle);
		if(index != -1) {
			movieList.remove(index);
			movieList.add(index, newTitle);
			System.out.println(oldTitle + " has been replaced with " + newTitle + ".");
		} else
			System.out.println(oldTitle + " does not exist in list.");
	}
	
	private void printOntoFile() {
		try {
			FileWriter fw = new FileWriter("MovieList.txt");
			PrintWriter pw = new PrintWriter(fw, false);
			pw.println("Movie List:");
			for(int i=0; i<movieList.size(); i++) {
				pw.println(movieList.get(i));
			}
			pw.close();
			System.out.println("\nFile created.\n");
		} catch (IOException e) {
			System.out.println("Oops, something went wrong.");
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void endProgram() {
		printOntoFile();
		System.out.println("Shutting down....\nGoodbye.");
		System.exit(0);
	}
	
}//end MovieCommands class
