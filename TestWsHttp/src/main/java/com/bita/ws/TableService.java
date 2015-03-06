package com.bita.ws;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

@ApplicationPath("math")
@Path("table")
public class TableService extends Application {
	@POST
	@Path("/post")
	@Consumes("application/x-www-form-urlencoded")
	@Produces(MediaType.APPLICATION_XML)
	public MathTable getTable(String num) {
		MathTable mt = new MathTable(new Integer(num));
		return mt;
		//return "" + mt.toString();
	}

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> s = new HashSet<Class<?>>();
		s.add(TableService.class);
		return s;
	}
}