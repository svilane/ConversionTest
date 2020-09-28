package com.playsafe.conversion.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;

@Service
public class ConversionTestService {


    public double getKelvinToCelcius(double kelvin) {
        return kelvin - 273;
    }

    public double getCelciusToKelvin(double celcius) {
        return 273 - celcius;
    }

    public double getMilesToKm(double miles) {
        return miles * 1.161;
    }

    public double getKmToMiles(double km) {
        return  km / 1.161;
    }

}
