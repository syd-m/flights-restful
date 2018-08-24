package com.altimetrix.flights.repo;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.altimetrix.flights.model.Response;
import com.altimetrix.flights.model.Results;

@Repository
public class FlightsRepoImpl implements FlightsRepo {
	private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(FlightsRepoImpl.class);
	@Autowired
	RestTemplate restTemplate;
	private final String lowestFareAndFlightsInformation = "https://api.sandbox.amadeus.com/v1.2/flights/low-fare-search?apikey=5pRO3mpZtwMrDkSEzR7W3ivY4irpRk8s";

	@Override
	public List<Results> getFlights(String fromCity, String toCity, String startDate, String returnDate) {
		String URI = lowestFareAndFlightsInformation + "&origin=" + fromCity + "&destination=" + toCity
				+ "&departure_date=" + startDate + "&return_date=" + startDate;
		ResponseEntity<Response> response = restTemplate.getForEntity(URI, Response.class);
		LOGGER.info("");
		List<Results> cheapestFlightResults = response.getBody().getResults();
		LOGGER.info("Total results fetched for lowest fare flights: [{}]", cheapestFlightResults.size());
		LOGGER.info("Flights with lowest fare: [{}]", cheapestFlightResults.toString());
		return cheapestFlightResults;
	}
}