package com.jaunos.microservices.currencyexchangeservice.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaunos.microservices.currencyexchangeservice.entity.ExchangeValue;

@Repository
@Transactional
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	public abstract ExchangeValue findByFromAndTo(String from,  String to);
}
