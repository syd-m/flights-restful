package com.altimetrix.flights.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fare {
	@JsonProperty("total_price")
	private String totalPrice;
	@JsonProperty("price_per_adult")
	private PricePerAdult pricePerAdult;
	private Restrictions restrictions;

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public PricePerAdult getPricePerAdult() {
		return pricePerAdult;
	}

	public void setPricePerAdult(PricePerAdult pricePerAdult) {
		this.pricePerAdult = pricePerAdult;
	}

	public Restrictions getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(Restrictions restrictions) {
		this.restrictions = restrictions;
	}

	@Override
	public String toString() {
		return "Fare [totalPrice=" + totalPrice + ", pricePerAdult=" + pricePerAdult + ", restrictions=" + restrictions
				+ "]";
	}
}
