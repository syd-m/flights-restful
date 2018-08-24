package com.altimetrix.flights.repo;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.altimetrix.flights.entity.Response;
import com.altimetrix.flights.entity.Results;
import com.altimetrix.flights.model.FlightsRequestInformation;

@Repository
public class FlightsRepoImpl implements FlightsRepo {
	private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(FlightsRepoImpl.class);

	@Autowired
	RestTemplate restTemplate;
	private final String lowestFareAndFlightsInformation = "https://api.sandbox.amadeus.com/v1.2/flights/low-fare-search?apikey=5pRO3mpZtwMrDkSEzR7W3ivY4irpRk8s";

	// https://api.sandbox.amadeus.com/v1.2/flights/low-fare-search?apikey=5pRO3mpZtwMrDkSEzR7W3ivY4irpRk8s&origin=LAX&destination=HOU&departure_date=2018-12-25&return_date=2018-12-28

	@Override
	public List<Results> getFlights(FlightsRequestInformation flightsRequestInformation) {
		ResponseEntity<Response> response = restTemplate.getForEntity(lowestFareAndFlightsInformation + "&origin="
				+ flightsRequestInformation.getFromCity() + "&destination=" + flightsRequestInformation.getToCity() + "&departure_date= " + flightsRequestInformation.getStartDate() + "&return_date=" + flightsRequestInformation.getToCity(), Response.class);
		List<Results> cheapestFlightResults = response.getBody().getResults();
		LOGGER.info("Total results fetched for lowest fare flights: [{}]", cheapestFlightResults.size());
		LOGGER.info("Flights with lowest fare: [{}]", cheapestFlightResults.toString());
		return cheapestFlightResults;
	}

}
