package com.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromConfigProp {
	public static void main(String[] args) throws IOException {
		
	
	
	FileInputStream stream = new FileInputStream("C:\\Users\\elcot\\eclipse-workspace\\APIGetSample\\config.properties");
	
	Properties property=new Properties();
	
	property.load(stream);
	
	Object object = property.get("username");
	String name= (String) object;
	System.out.println(name);
	
	
	
	
	
	
	}
}
