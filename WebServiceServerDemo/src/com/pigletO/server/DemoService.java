package com.pigletO.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebService
public class DemoService {
 
	Logger log = LoggerFactory.getLogger(DemoService.class);
 
	public void serviceOne(){
		log.info("Service One");
	}
	@WebMethod(exclude=true)
	public void serviceTwo(){
		log.info("Service Two");
	}
 
}

