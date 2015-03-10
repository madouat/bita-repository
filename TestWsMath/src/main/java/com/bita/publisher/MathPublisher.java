package com.bita.publisher;


import javax.xml.ws.Endpoint;

import com.bita.ws.MathTableImpl;


public class MathPublisher {
	public static void main(String[] args) {
		final String url = "http://localhost:9999/math";
		System.out.println("Publishing Math Service at endpoint " + url);
		Endpoint.publish(url, new MathTableImpl());
		System.out.println("done today");
	}
}
