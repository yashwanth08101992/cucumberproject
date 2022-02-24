package package1;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import Files.Payload;
import io.restassured.RestAssured;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// given - all input details
		// when - Submit the API -resource,http method
		// Then - validate the response
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		given().queryParam("key", "qaclick123").header("Content-Type", "application/json").body(Payload.addPost())
				.when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200)
				.body("scope", equalTo("App")).header("Server", "Apache/2.4.18 (Ubuntu)");
	}

}
