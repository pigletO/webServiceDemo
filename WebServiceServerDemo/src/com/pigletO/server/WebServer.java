package com.pigletO.server;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebServer {

	static Logger log = LoggerFactory.getLogger(WebServer.class);
	public static void main(String[] args) {
		log.info("Beginning ...");
		Endpoint.publish("http://localhost:8888/service/demoService",new DemoService());
		log.info("publish successfully!");
	}

}
