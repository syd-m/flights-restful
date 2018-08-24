package com.altimetrix.flights.service;

import java.util.List;

import com.altimetrix.flights.model.Results;

public interface FlightsService {

	List<Results> getCheapestAndFastestFlights(String fromCity, String toCity, String startDate, String returnDate);

	void getComfortableFlights(String comfortOptions);

}
