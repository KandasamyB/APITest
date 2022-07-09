package com.post;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RegisterSuccessful {
	
	static RequestSpecification spec;
	
	
	public static void main(String[] args) {
		
		spec= RestAssured.given();
		
	spec=	spec.header("Content-Type", "application/json");
	
	spec=spec.body("{\r\n"
			+ "    \"email\": \"eve.holt@reqres.in\",\r\n"
			+ "    \"password\": \"pistol\"\r\n"
			+ "}");
	
	
	Response post = spec.post("https://reqres.in/api/register");
	
	int statusCode = post.getStatusCode();
	System.out.println(statusCode);
		
	
	ResponseBody body = post.getBody();
	String asString = body.asString();
	System.out.println(asString);
	
	System.out.println(body.asPrettyString());
	
	
	System.out.print("haiiii");
	System.out.println("samy");
		
		
	}

}
