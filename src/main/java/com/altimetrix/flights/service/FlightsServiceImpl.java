package com.altimetrix.flights.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrix.flights.entity.Results;
import com.altimetrix.flights.model.FlightsRequestInformation;
import com.altimetrix.flights.repo.FlightsRepo;

@Service
public class FlightsServiceImpl implements FlightsService {
	private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(FlightsServiceImpl.class);

	@Autowired
	FlightsRepo flightsRepo;

	@Override
	public List<Results> getCheapestAndFastestFlights(FlightsRequestInformation flightsRequestInformation) {
		return getFastestFromCheapestFlights(flightsRepo.getFlights(flightsRequestInformation));
	}

	@Override
	public void getComfortableFlights(String comfortOptions) {
		// TODO Auto-generated method stub

	}
	
	private List<Results> getFastestFromCheapestFlights(List<Results> cheapestFlightsResult) {
		List<Results> fastestAndCheapest = new ArrayList<>();
		for(int i = 0; i < 3; i++) {
			for (Results result : cheapestFlightsResult) {
				fastestAndCheapest.add(result);
			}
		}
		return fastestAndCheapest; 
	}
}
