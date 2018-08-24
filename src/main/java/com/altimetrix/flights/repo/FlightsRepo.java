package com.altimetrix.flights.repo;

import java.util.List;

import com.altimetrix.flights.model.Results;

public interface FlightsRepo {

	List<Results> getFlights(String fromCity, String toCity, String startDate, String returnDate);

}