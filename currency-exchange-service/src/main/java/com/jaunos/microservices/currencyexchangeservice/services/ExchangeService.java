package com.jaunos.microservices.currencyexchangeservice.services;

import java.util.List;

import com.jaunos.microservices.currencyexchangeservice.entity.ExchangeValue;

public interface ExchangeService {

	public ExchangeValue save(ExchangeValue exchangeValue);
	
	public ExchangeValue findById(Long id);
	
	public List<ExchangeValue> findAll();
	
	public abstract ExchangeValue findByFromAndTo(String from,  String to);
}
