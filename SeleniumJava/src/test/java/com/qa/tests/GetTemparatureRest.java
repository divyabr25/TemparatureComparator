package com.qa.tests;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetTemparatureRest {

	@Test
	public static void getCode() {
		
		int code  = get("https://api.openweathermap.org/data/2.5/weather?q=Chennai&appid=7fe67bf08c80ded756e598d6f8fedaea").getStatusCode();
		System.out.println("RestAssured "+code);
		Assert.assertEquals(code, 200);
	
	}
	@Test
	public static void getBody() {
		
		String data  = get("https://api.openweathermap.org/data/2.5/weather?q=Chennai&appid=7fe67bf08c80ded756e598d6f8fedaea").asString();
		
		JSONObject jsonResponse =new JSONObject(data);
		
		Double restTemp = jsonResponse.getJSONObject("main").getDouble("temp_min");
		System.out.println(restTemp);
		
	
	}


}
