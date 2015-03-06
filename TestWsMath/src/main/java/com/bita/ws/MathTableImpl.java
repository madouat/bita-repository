package com.bita.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.bita.ws.MathTableService")
public class MathTableImpl implements MathTableService {
	
	public SimpleMathTable getTable(Integer number) throws NegException {
		if (number < 0) {
			throw new NegException("Number cannot be negative");
		}
		SimpleMathTable table = new SimpleMathTable(number);
		return table;
	}
}