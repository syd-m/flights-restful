package com.altimetrix.flights.model;

public class Origin {
	private String airport;
	private String terminal;

	@Override
	public String toString() {
		return "Origin [airport=" + airport + ", terminal=" + terminal + "]";
	}

	public String getAirport() {
		return airport;
	}

	public void setAirport(String airport) {
		this.airport = airport;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
}
