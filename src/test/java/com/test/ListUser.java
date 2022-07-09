package com.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ListUser {
	
	static RequestSpecification req;
	
	public static void main(String[] args) {
		
		req = RestAssured.given();
		
		req= req.header("Content-Type", "application/json");
		
		req = req.queryParam("page","2");

		Response response = req.get("https://reqres.in/api/users");
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		ResponseBody body = response.getBody();
		
		System.out.println(body.asString());
		
		System.out.println(body.asPrettyString());
		
		
		
	}

}
