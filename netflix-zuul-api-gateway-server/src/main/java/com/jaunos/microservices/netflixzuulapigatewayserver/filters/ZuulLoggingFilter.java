package com.jaunos.microservices.netflixzuulapigatewayserver.filters;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.ribbon.proxy.annotation.Http;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulLoggingFilter extends ZuulFilter {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// Filtro de registro del gateway

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {

		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		logger.info("request -> {} request uri -> {}",
				request, request.getRequestURI());
		

		return null;
	}

	// Especifica el tipo de retorno, pre, error, post,
	@Override
	public String filterType() {
		return null;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}