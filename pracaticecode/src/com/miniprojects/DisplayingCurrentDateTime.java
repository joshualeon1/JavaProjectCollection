package com.miniprojects;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalDateTime;

public class DisplayingCurrentDateTime extends TimerTask{

	public static void main(String[] args) throws InterruptedException {

		//This prints out the local date and time ONCE
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));
		
		System.out.println("===============");
		
		//This below outputs the time to console every second (1000ms)
		Timer timer = new Timer();
		timer.schedule(new DisplayingCurrentDateTime(), 0, 1000);//	timer.schedule(TimerTask task, long delay, long period)
		
		Thread.sleep(5000);
		System.exit(0);

	}//end main

	@Override
	public void run() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now)); 
	}

}//end class
