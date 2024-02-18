package com.miniprojects.coviddata;

public class CovidEntry {

	private String date;
	private String state;
	private int fips;
	private int cases;
	private int deaths;
	
	public CovidEntry(String date, String state, int fips, int cases, int deaths) {
		this.date = date;
		this.state = state;
		this.fips = fips;
		this.cases = cases;
		this.deaths = deaths;
	}

	public String getDate() {
		return date;
	}

	public String getState() {
		return state;
	}

	public int getFips() {
		return fips;
	}

	public int getCases() {
		return cases;
	}

	public int getDeaths() {
		return deaths;
	}

	@Override
	public String toString() {
		return "CovidEntry - date:" + date + " | state:" + state + " | fips:" + fips + " | cases:" + cases + " | deaths:" + deaths;
	}
	
}//end Class
