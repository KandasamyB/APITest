package com.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class SingleResource {
	
	static RequestSpecification spec;
	
	public static void main(String[] args) {
		//https://reqres.in/api/unknown/2
		
		
		spec= RestAssured.given();
	spec=	spec.header("Content-Type","application/json");
		
		
		spec=spec.pathParam("page", "2");
		
		Response response = spec.get("https://reqres.in/api/unknown/{page}");
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		ResponseBody body = response.getBody();
		
		System.out.println(body.asPrettyString());
		
		
	}

}
