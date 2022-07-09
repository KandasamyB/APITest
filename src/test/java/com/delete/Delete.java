package com.delete;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Delete {
	
	static RequestSpecification req;
	
	public static void main(String[] args) {
		
		req= RestAssured.given();
		
	req=req.header("Content-Type", "application/json");
	Response delete = req.delete("https://reqres.in/api/users/2");
	
	int statusCode = delete.getStatusCode();
	System.out.println(statusCode);
	ResponseBody body = delete.getBody();
	System.out.println(body.asString());
	System.out.println(body.asPrettyString());
	
	
		
		
	}

}
