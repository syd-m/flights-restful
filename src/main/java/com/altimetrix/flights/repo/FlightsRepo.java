package com.altimetrix.flights.repo;

import java.util.List;

import com.altimetrix.flights.entity.Results;
import com.altimetrix.flights.model.FlightsRequestInformation;

public interface FlightsRepo {

	List<Results> getFlights(FlightsRequestInformation flightsRequestInformation);

}