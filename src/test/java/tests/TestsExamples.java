package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestsExamples {
	@Test
public void test_1() {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println("status code = " + response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
		System.out.println("response time = " + response.getTime());
		System.out.println("response body: ... " + response.getBody().asPrettyString());
		System.out.println("status line: " + response.getStatusLine());
		System.out.println("header: " + response.getHeader("content-type"));
		
	
}
}
