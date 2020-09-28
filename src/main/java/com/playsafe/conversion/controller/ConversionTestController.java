package com.playsafe.conversion.controller;


import com.playsafe.conversion.service.ConversionTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ConversionTestController {
	@Autowired
	private ConversionTestService conversionService;

	@GetMapping("/conversions/ktoc/{unit}")
	public ResponseEntity<Double>  getKelvinToCelcius(@PathVariable(value = "unit") Double kelvin) {
		double ktoc = conversionService.getKelvinToCelcius(kelvin);
		return new ResponseEntity<Double>(HttpStatus.OK);
	}

	@GetMapping("/conversions/ctok/{unit}")
		public ResponseEntity<Double>  getCelciusToKelvin(@PathVariable(value = "unit") Double celcius) {
		double ctok = conversionService.getCelciusToKelvin (celcius);
		return new ResponseEntity<Double>(HttpStatus.OK);
	}

	@GetMapping("/conversions/mtok/{unit}")
	public ResponseEntity<Double>  getMilesToKm(@PathVariable(value = "unit") Float miles) {
		double mtok = conversionService.getKmToMiles(miles);
		return new ResponseEntity<Double>(HttpStatus.OK);
	}

	@GetMapping("/conversions/ktom/{unit}")
	public ResponseEntity<Double>  getKmToMiles(@PathVariable(value = "unit") Float km) {
		double ktom = conversionService.getKmToMiles(km);
		return new ResponseEntity<Double>(HttpStatus.OK);
	}
}
