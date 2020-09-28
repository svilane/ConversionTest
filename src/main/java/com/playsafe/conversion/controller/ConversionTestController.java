package com.playsafe.conversion.controller;


import com.playsafe.conversion.service.ConversionTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ConversionTestController {
	@Autowired
	private ConversionTestService conversionService;

	@GetMapping("/conversions/ktoc")
	public BigDecimal getKelvinToCelcius() {
		return new BigDecimal(10);
	}

	@GetMapping("/conversions/ctok")
		public BigDecimal getCelciusToKelvin() {
			return new BigDecimal(10);
	}

	@GetMapping("/conversions/mtok")
	public BigDecimal getMilesToKm() {
		return new BigDecimal(10);
	}

	@GetMapping("/conversions/ktom")
	public BigDecimal getKmToMiles() {
		return new BigDecimal(10);
	}


}
