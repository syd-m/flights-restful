package com.altimetrix.flights.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrix.flights.model.Results;
import com.altimetrix.flights.repo.FlightsRepo;
import com.altimetrix.flights.service.FlightsService;

@RestController("/flights")
public class FlightsController {
	private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(FlightsController.class);

	@Autowired
	private FlightsService flightsService;

	@Autowired
	FlightsRepo flightsRepo;

	@GetMapping("/getFlights")
	public List<Results> getFlightInformation(String fromCity, String toCity, String startDate, String returnDate) {
		LOGGER.info("Controller called...");
		return flightsService.getCheapestAndFastestFlights(fromCity, toCity, startDate, returnDate);
		// return flightsRepo.getFlights(fromCity, toCity, startDate, returnDate);
	}
}