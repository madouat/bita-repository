package com.bita.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.bita.ws.MathTableService;
import com.bita.ws.SimpleMathTable;

public class MathTableClient {
	public static void main(String[] args) {
		QName serviceName = new QName("http://ws.bita.com/", "MathTableImplService");
		URL url;
		try {
			url = new URL("http://localhost:9999/math?wsdl");
			Service s = Service.create(url, serviceName);
			QName portname = s.getPorts().next();
			MathTableService port = s.getPort(portname, MathTableService.class);
			SimpleMathTable table = port.getTable(new Integer(10));
			System.out.println(table.toString());
			
			System.out.println("sample modif for testing purpose");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}