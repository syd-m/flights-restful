package com.altimetrix.flights.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrix.flights.entity.Results;
import com.altimetrix.flights.model.FlightsRequestInformation;
import com.altimetrix.flights.service.FlightsService;

@RestController
public class FlightsController {

	@Autowired
	private FlightsService flightsService;

	@PostMapping("/flights/getFlightsInformation")
	public ResponseEntity<List<Results>> getFlightInformation(@RequestBody FlightsRequestInformation flightsRequest) {

		// Results should include Fastest, Cheapest, and Most comfortable

		// TODO getting cheapest and fastest flights
		return new ResponseEntity<>(flightsService.getCheapestAndFastestFlights(flightsRequest), HttpStatus.OK);

		// TODO call the Most Comfortable service

		// return null;

	}

	@GetMapping("/")
	public String test() {
		return "hey";
	}
}