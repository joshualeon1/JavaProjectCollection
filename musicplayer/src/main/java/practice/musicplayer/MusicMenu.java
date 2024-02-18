package practice.musicplayer;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicMenu {

	private ArrayList<Playlist> playlists;
	private Scanner sc = new Scanner(System.in);

	public MusicMenu() {

		playlists = new ArrayList<Playlist>();
		System.out.println("Welcome to Music Player!");
		runOptions();

	}

	private int printMenu() {

		System.out.println("\n1) Create a Playlist\n"
				+ "2) View Playlist(s)\n"
				+ "3) Delete a Playlist\n"
				+ "4) Add a Song\n"
				+ "5) Delete a Song\n"
				+ "6) View list of Songs\n"
				+ "7) Quit Program\n"
				+ "Enter an integer:");

		return Integer.parseInt(sc.nextLine());

	}

	private void runOptions() {

		switch(printMenu()) {
		case 1:
			createPlaylist();
			runOptions();
		case 2:
			viewPlaylists();
			runOptions();
		case 3:
			deletePlaylist();
			runOptions();
		case 4:
			addToPlaylist();
			runOptions();
		case 5:
			deleteFromList();
			runOptions();
		case 6:
			viewSongs();
			runOptions();
		case 7:
			quitProgram();
		default:
			System.out.println("Invalid input, please try again.");
			runOptions();
		}

	}

	private int queryPlaylist(String name) {

		for(int i=0; i<playlists.size(); i++) {
			if(playlists.get(i).getPlaylistTitle().equals(name))
				return i;
		}

		return -1;

	}

	private void createPlaylist() {

		System.out.println("Enter the name of your playlist: ");
		String name = sc.nextLine();
		
		if(queryPlaylist(name) == -1) {
			playlists.add(new Playlist(name));
			System.out.println(name + " has been created.");
		} else
			System.out.println(name + " is already in this list.");

	}

	private void viewPlaylists() {

		if(playlists.isEmpty()) {
			System.out.println("There are none to view.\n");
		} else {
			for(Playlist p : playlists)
				System.out.println(p.getPlaylistTitle());
		}

	}

	private void deletePlaylist() {

		System.out.println("Enter playlist name:");
		String name = sc.nextLine();
		
		if(queryPlaylist(name) != -1) {
			playlists.remove(queryPlaylist(name));
			System.out.println(name + " was removed from list.");
		}else
			System.out.println(name + " is not in this list.");

	}

	private void addToPlaylist() {

		System.out.println("Enter the name of the playlist you would like to add to:");
		String name = sc.nextLine();

		playlists.get(queryPlaylist(name)).addSong();

	}

	private void deleteFromList() {

		System.out.println("Enter the name of the playlist you would like to delete from:");
		String name = sc.nextLine();

		playlists.get(queryPlaylist(name)).removeSong();

	}

	private void viewSongs() {

		System.out.println("Enter the name of the playlist you would like to view:");
		String name = sc.nextLine();

		playlists.get(queryPlaylist(name)).printSongs();

	}

	private void quitProgram() {

		System.out.println("Goodbye!");
		sc.close();

		System.exit(0);

	}

}//End MusicMenu
