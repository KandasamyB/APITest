package com.baseclass;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Sample extends BaseClass {

	@Test(priority = 1)
	public void createUser() {
		System.out.println("======POST==========");
		addHeader("Content-Type", "application/json");
		addBody("{\r\n"
				+ "    \"data\": {\r\n"
				+ "        \"id\": 2,\r\n"
				+ "        \"email\": \"kandaswami.weaver@reqres.in\",\r\n"
				+ "        \"first_name\": \"kkk\",\r\n"
				+ "        \"last_name\": \"jjk\",\r\n"
				+ "        \"avatar\": \"https://reqres.in/img/faces/2-image.jpg\"\r\n"
				+ "    },\r\n"
				+ "    \"support\": {\r\n"
				+ "        \"url\": \"https://reqres.in/#support-heading\",\r\n"
				+ "        \"text\": \"To keep ReqRes free, contributions towards server costs are appreciated!\"\r\n"
				+ "    }\r\n"
				+ "}");
		Response r = requestType("POST", "https://reqres.in/api/users/2");
		int statusCode = getStatusCode(r);
		System.out.println(statusCode);
		System.out.println(getResBodyAsString(r)); 
		System.out.println(getResBodyAsPreetyString(r));
		
	}
	@Test(priority = 3)
	public void updateUser() {
		System.out.println("=====PUT========");
		addHeader("Content-Type", "application/json");
		addBody("{\r\n"
				+ "    \"data\": {\r\n"
				+ "        \"id\": 2,\r\n"
				+ "        \"email\": \"kanda.weaver@reqres.in\",\r\n"
				+ "        \"first_name\": \"kanda\",\r\n"
				+ "        \"last_name\": \"samy\",\r\n"
				+ "        \"avatar\": \"https://reqres.in/img/faces/2-image.jpg\"\r\n"
				+ "    },\r\n"
				+ "    \"support\": {\r\n"
				+ "        \"url\": \"https://reqres.in/#support-heading\",\r\n"
				+ "        \"text\": \"To keep ReqRes free, contributions towards server costs are appreciated!\"\r\n"
				+ "    }\r\n"
				+ "}");
		Response r = requestType("PUT", "https://reqres.in/api/users/2");
		int statusCode = getStatusCode(r);
		System.out.println(statusCode);
		System.out.println(getResBodyAsString(r)); 
		System.out.println(getResBodyAsPreetyString(r));


		
	}
	
	
	@Test(priority = 2)
	public void getUser() {
		System.out.println("============GET=================");
		addHeader("Content-Type", "application/json");
		pathParam("page", "2");
		Response r = requestType("GET", "https://reqres.in/api/users/{page}");
		int statusCode = getStatusCode(r);
		System.out.println(statusCode);
		System.out.println(getResBodyAsString(r)); 
		System.out.println(getResBodyAsPreetyString(r));
		
	}
	@Test(priority = 4)
	public void deleteUser() {
		System.out.println("============DELETE=================");
		addHeader("Content-Type", "application/json");
		queryParam("page", "2");
		Response r = requestType("DELETE", "https://reqres.in/api/users/2");
		int statusCode = getStatusCode(r);
		System.out.println(statusCode);
		System.out.println(getResBodyAsString(r)); 
		System.out.println(getResBodyAsPreetyString(r));


	}

	

}
//https://reqres.in/api/login