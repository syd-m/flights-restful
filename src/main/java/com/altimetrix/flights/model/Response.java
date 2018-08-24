package com.altimetrix.flights.model;

import java.util.List;

public class Response {
	private String currency;
	private List<Results> results;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public List<Results> getResults() {
		return results;
	}

	public void setResults(List<Results> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "Response [currency=" + currency + ", results=" + results + "]";
	}
}
