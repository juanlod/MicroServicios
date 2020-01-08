package com.jaunos.microservices.currencyexchangeservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaunos.microservices.currencyexchangeservice.entity.ExchangeValue;
import com.jaunos.microservices.currencyexchangeservice.repository.ExchangeValueRepository;

@Service
public class ExchangeServiceImpl implements ExchangeService{

	@Autowired
	private ExchangeValueRepository exchangeRepository;
	
	@Override
	public ExchangeValue save(ExchangeValue exchangeValue) {
		// TODO Auto-generated method stub
		return exchangeRepository.save(exchangeValue);
	}

	@Override
	public ExchangeValue findById(Long id) {
		// TODO Auto-generated method stub
		return exchangeRepository.findById(id).get();
	}

	@Override
	public List<ExchangeValue> findAll() {
		// TODO Auto-generated method stub
		return exchangeRepository.findAll();
	}

	@Override
	public ExchangeValue findByFromAndTo(String from, String to) {
		// TODO Auto-generated method stub
		return exchangeRepository.findByFromAndTo(from, to);
	}

}
