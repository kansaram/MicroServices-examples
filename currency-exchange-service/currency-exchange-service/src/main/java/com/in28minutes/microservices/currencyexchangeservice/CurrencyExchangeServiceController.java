package com.in28minutes.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CurrencyExchangeServiceController {
	
	@Autowired
	Environment environment;
	
	@GetMapping("/currencyExchange/from/{from}/to/{to}")
	public ExchangeValue ExchangeService(@PathVariable String from, @PathVariable String to) {
		
		ExchangeValue exchangeValue= new ExchangeValue(1000, "USD", "INR",  BigDecimal.valueOf(65));
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		
		return exchangeValue;
	}

}
