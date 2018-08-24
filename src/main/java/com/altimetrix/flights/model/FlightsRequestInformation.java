package com.altimetrix.flights.model;

public class FlightsRequestInformation {
	private String fromCity;
	private String toCity;
	private String startDate;
	private String returnDate;
	// hotel/car
	private String nearestAriport;
	private String carClass;
	private String radius;

	public String getCarClass() {
		return carClass;
	}

	public String getFromCity() {
		return fromCity;
	}

	public String getNearestAriport() {
		return nearestAriport;
	}

	public String getRadius() {
		return radius;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getToCity() {
		return toCity;
	}

	public void setCarClass(String carClass) {
		this.carClass = carClass;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public void setNearestAriport(String nearestAriport) {
		this.nearestAriport = nearestAriport;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	@Override
	public String toString() {
		return "FlightsRequestInformation [fromCity=" + fromCity + ", toCity=" + toCity + ", startDate=" + startDate
				+ ", returnDate=" + returnDate + ", nearestAriport=" + nearestAriport + ", carClass=" + carClass
				+ ", radius=" + radius + "]";
	}

}
