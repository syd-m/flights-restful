package com.altimetrix.flights.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrix.flights.model.Results;
import com.altimetrix.flights.repo.FlightsRepo;

@Service
public class FlightsServiceImpl implements FlightsService {
	// private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(FlightsServiceImpl.class);

	@Autowired
	FlightsRepo flightsRepo;

	@Override
	public List<Results> getCheapestAndFastestFlights(String fromCity, String toCity, String startDate, String returnDate) {
		return getFastestFromCheapestFlights(flightsRepo.getFlights(fromCity, toCity, startDate, returnDate));
	}

	@Override
	public void getComfortableFlights(String comfortOptions) {
		// TODO Auto-generated method stub

	}
	
	private List<Results> getFastestFromCheapestFlights(List<Results> cheapestFlightsResult) {
		return cheapestFlightsResult.subList(0, 3);
	}
}