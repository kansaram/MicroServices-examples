package com.in28minutes.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	@Id
	Long id;
	
	@Column(name="CURRENCY_FROM")
	String from;
	
	@Column(name="CURRENCY_TO")
	String to;
	
	@Column(name="CONVERSION_VALUE")
	BigDecimal conversionValue;
	
	@Column(name="PORT")
	int port;

	public ExchangeValue(int i, String string, String string2, BigDecimal bigDecimal) {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExchangeValue(Long id, String from, String to, BigDecimal conversionValue) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionValue = conversionValue;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionValue() {
		return conversionValue;
	}

	public void setConversionValue(BigDecimal conversionValue) {
		this.conversionValue = conversionValue;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	
	
}
