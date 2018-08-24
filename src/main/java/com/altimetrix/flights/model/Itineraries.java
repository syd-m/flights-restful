package com.altimetrix.flights.model;

public class Itineraries {
	private Outbound outbound;

	public Outbound getOutbound() {
		return outbound;
	}

	public void setOutbound(Outbound outbound) {
		this.outbound = outbound;
	}

	@Override
	public String toString() {
		return "Itineraries [outbound=" + outbound + "]";
	}
}
