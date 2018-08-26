package com.altimetrix.flights.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookingInfo {
	@JsonProperty("travel_class")
	private String travelClass;
	@JsonProperty("booking_code")
	private String bookingCode;
	@JsonProperty("seats_remaining")
	private String seatsRemaining;

	public String getTravelClass() {
		return travelClass;
	}

	public void setTravelClass(String travelClass) {
		this.travelClass = travelClass;
	}

	public String getBookingCode() {
		return bookingCode;
	}

	public void setBookingCode(String bookingCode) {
		this.bookingCode = bookingCode;
	}

	public String getSeatsRemaining() {
		return seatsRemaining;
	}

	public void setSeatsRemaining(String seatsRemaining) {
		this.seatsRemaining = seatsRemaining;
	}

	@Override
	public String toString() {
		return "BookingInfo [travelClass=" + travelClass + ", bookingCode=" + bookingCode + ", seatsRemaining="
				+ seatsRemaining + "]";
	}
}