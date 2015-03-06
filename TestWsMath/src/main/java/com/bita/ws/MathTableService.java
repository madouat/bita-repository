package com.bita.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface MathTableService {
	@WebMethod
	public SimpleMathTable getTable(Integer number) throws NegException;
}
