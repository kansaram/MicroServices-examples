package com.in28minutes.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyConversionJPARepository extends JpaRepository<ExchangeValue, Long>{
		public ExchangeValue findFromAndTo(String from,String to);
}
