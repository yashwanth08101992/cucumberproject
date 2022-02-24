package package1;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class deletepractice {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body("{\r\n" + "    \"place_id\":\"48b4298432efe5f8968becf8b6710293\"   \r\n" + "}").when()
				.delete("maps/api/place/delete/json").then().log().all().statusCode(200);

	}

}
