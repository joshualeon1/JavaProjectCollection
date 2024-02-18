package practice.musicplayer;

import java.util.LinkedList;
import java.util.Scanner;

public class Playlist {

	private String playlistTitle;
	private LinkedList<Song> songs;
	private Scanner sc = new Scanner(System.in);

	public Playlist(String playlistTitle) {
		this.playlistTitle = playlistTitle;
		songs = new LinkedList<Song>();
	}

	public String getPlaylistTitle() {
		return playlistTitle;
	}

	/**
	 * Given a String title, e.g. "Shepherd of Fire", and a String artist, e.g. "Avenged Sevenfold",
	 * returns 'i' the index where it was found, or '-1' if not found.
	 * <ul>
	 * <li>querySong("Shepherd of Fire, Avenged Sevenfold") --> "-1"</li>
	 * <li>querySong("Shepherd of Fire, Avenged Sevenfold") --> "8"</li>
	 * <li>querySong("Hail to the King, Avenged Sevenfold") --> "-1"</li>
	 * </ul>
	 *
	 * @param title
	 *         given string
	 * 
	 * @param artist
	 *         given string
	 *
	 * @return 'i' the index where it was found, or '-1' if not found.
	 */

	private int querySong(String title, String artist) {
		
		for(int i=0; i<songs.size(); i++) {
			if(songs.get(i).getTitle().equals(title) && songs.get(i).getArtist().equals(artist))
				return i;
		}
		
		return -1;
		
	}

	public void addSong() {
		
		System.out.println("Enter song title:");
		String title = sc.nextLine();
		System.out.println("Enter song artist:");
		String artist = sc.nextLine();
		System.out.println("Enter song length (00:00) :");
		String length = sc.nextLine();
		System.out.println("Enter song genre:");
		String genre = sc.nextLine();
		
		if(querySong(title, artist) == -1) {
			songs.add(new Song(title, artist, length, genre));
			System.out.println(title + " added to '" + playlistTitle + "'.");
		} else
			System.out.println(title + " is already in this playlist.");
		
	}

	public void removeSong() {
		
		System.out.println("Enter song title:");
		String title = sc.nextLine();
		System.out.println("Enter song artist:");
		String artist = sc.nextLine();
		
		if(querySong(title, artist) != -1) {
			songs.remove(querySong(title, artist));
			System.out.println(title + " by " + artist + " was removed from " + playlistTitle);
		}else
			System.out.println(title + " is not in this playlist.");
		
	}
	
	public void printSongs() {
		
		for(Song s : songs)
			System.out.println(s.toString());
		
	}

	private class Song {

		private String title;
		private String artist;
		private String length;
		private String genre;

		public Song(String title, String artist, String length, String genre) {
			this.title = title;
			this.artist = artist;
			this.length = length;
			this.genre = genre;
		}

		public String getTitle() {
			return title;
		}

		public String getArtist() {
			return artist;
		}

		public String getLength() {
			return length;
		}

		public String getGenre() {
			return genre;
		}

		@Override
		public String toString() {
			return "Song title: " + title + " | Artist: " + artist + " | Length: " + length + " | Genre: " + genre;
		}

	}//End Song

}//End Playlist
