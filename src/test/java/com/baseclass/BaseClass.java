package com.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class BaseClass {

	RequestSpecification reqSpec;
	Response response;

	public void addHeader(String key, String value) {
		reqSpec = RestAssured.given().header(key, value);

	}
	public void addHeaders(Headers headers) {
		reqSpec = RestAssured.given().headers(headers);
	}

	public void queryParam(String key, String value) {
		reqSpec = reqSpec.queryParam(key, value);
	}

	public void pathParam(String key, String value) {
		reqSpec = reqSpec.pathParam(key, value);

	}
	public void addBody(Object reqbody) {

		reqSpec = reqSpec.body(reqbody);

	}

	public void addBody(String reqbody) {

		reqSpec = reqSpec.body(reqbody);

	}

	private void basicAuth(String username, String password) {
		reqSpec = reqSpec.auth().preemptive().basic(username, password);

	}

	public String getPropertyFileValue(String key) throws FileNotFoundException, IOException {

		Properties properties = new Properties();

		properties.load(new FileInputStream(System.getProperty("user.dir") + "\\config.properties"));

		Object object = properties.get(key);
		String value = (String) object;
		return value;
	}

	public Response requestType(String reqType, String endpoint) {

		switch (reqType) {
		case "GET":

			response = reqSpec.get(endpoint);
			break;
		case "POST":

			response = reqSpec.post(endpoint);
			break;
		case "PUT":

			response = reqSpec.put(endpoint);
			break;
		case "DELETE":

			response = reqSpec.delete(endpoint);
			break;
		default:
			break;
		}
		return response;

	}

	public int getStatusCode(Response response) {
		int statusCode = response.getStatusCode();
		return statusCode;

	}

	public ResponseBody getResponseBody(Response response) {
		ResponseBody body = response.getBody();
		return body;

	}

	public String getResBodyAsString(Response response) {

		String asString = getResponseBody(response).asString();
		return asString;

	}

	public String getResBodyAsPreetyString(Response response) {

		String asPrettyString = getResponseBody(response).asPrettyString();
		return asPrettyString;

	}

}
