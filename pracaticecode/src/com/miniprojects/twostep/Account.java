package com.miniprojects.twostep;

public class Account {

	private String username;
	private String password;
	private boolean twoStepChoice;
	
	public Account(String username, String password, boolean twoStepChoice) {
		this.username = username;
		this.password = password;
		this.twoStepChoice = twoStepChoice;
	}

	public boolean isTwoStepChoice() {
		return twoStepChoice;
	}

	public boolean validUsername(String user) {
		return this.username.equalsIgnoreCase(user);
	}
	
	public boolean validPassword(String passGiven) {
		return this.password.equalsIgnoreCase(passGiven);
	}
	
}
