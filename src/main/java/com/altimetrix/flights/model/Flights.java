package com.altimetrix.flights.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Flights {
	@JsonProperty("departs_at")
	private String departsAt;
	@JsonProperty("arrives_at")
	private String arrivesAt;
	private Origin origin;
	private Destination destination;
	@JsonProperty("marketing_airline")
	private String marketingAirline;
	@JsonProperty("operating_airline")
	private String operatingAirline;
	@JsonProperty("flight_number")
	private String flightNumber;
	private String aircraft;
	@JsonProperty("booking_info")
	private BookingInfo bookingInfo;

	public String getAircraft() {
		return aircraft;
	}

	public String getArrivesAt() {
		return arrivesAt;
	}

	public BookingInfo getBookingInfo() {
		return bookingInfo;
	}

	public String getDepartsAt() {
		return departsAt;
	}

	public Destination getDestination() {
		return destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public String getMarketingAirline() {
		return marketingAirline;
	}

	public String getOperatingAirline() {
		return operatingAirline;
	}

	public Origin getOrigin() {
		return origin;
	}

	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}

	public void setArrivesAt(String arrivesAt) {
		this.arrivesAt = arrivesAt;
	}

	public void setBookingInfo(BookingInfo bookingInfo) {
		this.bookingInfo = bookingInfo;
	}

	public void setDepartsAt(String departsAt) {
		this.departsAt = departsAt;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public void setMarketingAirline(String marketingAirline) {
		this.marketingAirline = marketingAirline;
	}

	public void setOperatingAirline(String operatingAirline) {
		this.operatingAirline = operatingAirline;
	}

	public void setOrigin(Origin origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Flights [departsAt=" + departsAt + ", arrivesAt=" + arrivesAt + ", origin=" + origin + ", destination="
				+ destination + ", marketingAirline=" + marketingAirline + ", operatingAirline=" + operatingAirline
				+ ", flightNumber=" + flightNumber + ", aircraft=" + aircraft + ", bookingInfo=" + bookingInfo + "]";
	}
}
