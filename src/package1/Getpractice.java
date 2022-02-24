package package1;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Getpractice {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123").queryParam("place_id", "48b4298432efe5f8968becf8b6710293")
				.header("Content-Type", "application/json").when().get("maps/api/place/get/json").then().log().all()
				.statusCode(200);

	}

}
