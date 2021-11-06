package resources;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

public class utils {
	//specify common part of API request
	public RequestSpecification requestSpec() throws FileNotFoundException {
		PrintStream log = new PrintStream(new FileOutputStream("log.txt"));
		return new RequestSpecBuilder()
			.setBaseUri(property.baseURL)
			.setBasePath(property.basePath_Stations)
			.addFilter(RequestLoggingFilter.logRequestTo(log))
			.addFilter(ResponseLoggingFilter.logResponseTo(log))
			.addHeader("Content-Type","application/json")
			.build();
	}
}
