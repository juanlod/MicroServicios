package com.jaunos.microservices.currencyconversionservice.services;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jaunos.microservices.currencyconversionservice.entity.CurrencyConversionBean;

//@FeignClient(name = "currency-exchange-service", url = "localhost:8000")
//@FeignClient(name = "currency-exchange-service")
// Proxy configuration
@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeServiceProxy {
	
	// Ribbon Balancing
	// 1. Se configura la carga entre cada url


	// Con feign se instancia un servicio de otro micro servicio. Sin proxy
//	@GetMapping("/currency-exchange/from/{from}/to/{to}")
//	public CurrencyConversionBean retrieveExchangeValue
//	(@PathVariable("from") String from, @PathVariable("to") String to);
	
	// Configurar peticiones a traves de proxy en application.properties de netflix-zuul-api-gateway
	// Con feign se instancia un servicio de otro micro servicio. A través de proxy
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue
	(@PathVariable("from") String from, @PathVariable("to") String to);
	

}
