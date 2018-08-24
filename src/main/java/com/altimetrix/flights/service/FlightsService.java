package com.altimetrix.flights.service;

import java.util.List;

import com.altimetrix.flights.entity.Results;
import com.altimetrix.flights.model.FlightsRequestInformation;

public interface FlightsService {

	List<Results> getCheapestAndFastestFlights(FlightsRequestInformation flightsRequest);

	void getComfortableFlights(String comfortOptions);

}
