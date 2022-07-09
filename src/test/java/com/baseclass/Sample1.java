package com.baseclass;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Sample1 extends BaseClass{
	
	@Test(priority = 1)
	public void createUser() {
		System.out.println("============post===========");

addHeader("Content-Type", "application/json");
addBody("{\r\n"
		+ "  \"id\": 10,\r\n"
		+ "  \"category\": {\r\n"
		+ "    \"id\": 0,\r\n"
		+ "    \"name\": \"string\"\r\n"
		+ "  },\r\n"
		+ "  \"name\": \"doggie\",\r\n"
		+ "  \"photoUrls\": [\r\n"
		+ "    \"string\"\r\n"
		+ "  ],\r\n"
		+ "  \"tags\": [\r\n"
		+ "    {\r\n"
		+ "      \"id\": 0,\r\n"
		+ "      \"name\": \"string\"\r\n"
		+ "    }\r\n"
		+ "  ],\r\n"
		+ "  \"status\": \"available\"\r\n"
		+ "}");
Response response = requestType("POST", "https://petstore.swagger.io/v2/pet");
System.out.println("status code"+getStatusCode(response));
System.out.println(getResBodyAsPreetyString(response));

	}
	@Test(priority = 2)
	public void updateUser() {
		System.out.println("============put===========");

addHeader("Content-Type", "application/json");
addBody("{\r\n"
		+ "  \"id\": 10,\r\n"
		+ "  \"category\": {\r\n"
		+ "    \"id\": 0,\r\n"
		+ "    \"name\": \"cat\"\r\n"
		+ "  },\r\n"
		+ "  \"name\": \"cat\",\r\n"
		+ "  \"photoUrls\": [\r\n"
		+ "    \"string\"\r\n"
		+ "  ],\r\n"
		+ "  \"tags\": [\r\n"
		+ "    {\r\n"
		+ "      \"id\": 0,\r\n"
		+ "      \"name\": \"string\"\r\n"
		+ "    }\r\n"
		+ "  ],\r\n"
		+ "  \"status\": \"available\"\r\n"
		+ "}");
Response response = requestType("PUT", "https://petstore.swagger.io/v2/pet");
System.out.println("status code"+getStatusCode(response));
System.out.println(getResBodyAsPreetyString(response));

	
	}
	@Test(priority = 3)
	public void getUser() {

		System.out.println("============get===========");

addHeader("Content-Type", "application/json");
pathParam("page", "10");
Response response = requestType("GET", "https://petstore.swagger.io/v2/pet/{page}");
System.out.println("status code"+getStatusCode(response));
System.out.println(getResBodyAsPreetyString(response));

	
	
	}
	@Test(priority = 4)
	public void deleteUser() {

System.out.println("============delete===========");

addHeader("Content-Type", "application/json");
pathParam("page", "10");
Response response = requestType("DELETE", "https://petstore.swagger.io/v2/pet/{page}");
System.out.println("status code"+getStatusCode(response));
System.out.println(getResBodyAsPreetyString(response));

	
	
	
	}
	
}
