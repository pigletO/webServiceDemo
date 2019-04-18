package com.pigletO.test;

import com.pigletO.client.DemoService;
import com.pigletO.client.DemoServiceService;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DemoService dService = new DemoServiceService().getDemoServicePort();
		dService.serviceOne();

	}

}
