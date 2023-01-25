package APIJANBatch.APIJAN;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetRequest {
	public static void main(String[] args) {
		Response r=
		given().
		contentType(ContentType.JSON)
		.when().get("http://localhost:3000/APIFolks");
		System.out.println("Response is"+r.asString());
		System.out.println("Status Code = "+ r.getStatusCode());
		
	}

}
