package com.altimetrix.flights.entity;

public class PricePerAdult {
	private String totalFare;
	private String tax;

	public String getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(String totalFare) {
		this.totalFare = totalFare;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "PricePerAdult [totalFare=" + totalFare + ", tax=" + tax + "]";
	}
}
