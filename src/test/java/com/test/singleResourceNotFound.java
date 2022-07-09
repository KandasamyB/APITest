package com.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class singleResourceNotFound {

	static RequestSpecification reqspec;

	public static void main(String[] args) {

reqspec = RestAssured.given();
		
		reqspec = reqspec.headers("Content-Type","application/json");
		
		reqspec = reqspec.pathParam("hi", "23");
		
		
		Response response = reqspec.get("https://reqres.in/api/unknown/{hi}");
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		ResponseBody body = response.getBody();
		
		String asString = body.asString();
		System.out.println(asString);
		
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);
	}
}
