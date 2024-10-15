package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.ResponseAwareMatcher.*;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

public class TestsExamples {
	@Test
	public void test_1() {
		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println("status code = " + response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
		System.out.println("response time = " + response.getTime());
		System.out.println("response body: ... " + response.getBody().asPrettyString());
		System.out.println("status line: " + response.getStatusLine());
		System.out.println("header: " + response.getHeader("content-type"));
	}

	@Test
	public void test_2() {
		baseURI = "https://reqres.in/api";
		given().get("/users?page=2").then().statusCode(200).body("data[1].id", equalTo(8)).log().all();
	}
}
