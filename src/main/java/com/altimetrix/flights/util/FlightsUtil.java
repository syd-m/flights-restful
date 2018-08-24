package com.altimetrix.flights.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FlightsUtil {
	public static final String API_KEY = "5pRO3mpZtwMrDkSEzR7W3ivY4irpRk8s"; 

	public static Date dateStringtoDate(String dateString) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = formatter.parse(dateString);
			System.out.println("Date is: " + date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
}