package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.*;
import resources.property;
import resources.utils;

import static org.junit.Assert.*;

import java.io.IOException;

public class stepDefination extends utils{
	private GetStationResponse getStationResponse;
	private RegisterStationRequest payload;
	private Response response;
	private RequestSpecification req;
	private String stationId;
	
@Given("add station payload with {string}, {string} ,{string} ,{string} ,{string}")
public void register_station_payload_is_added(String id,String name,String latitude,String longitude,String altitude ) throws IOException {
	payload = new RegisterStationRequest(id,name,Float.parseFloat(latitude),Float.parseFloat(longitude),Float.parseFloat(altitude));
	req = RestAssured.given()
					 .spec(requestSpec())
					 .body(payload);
}

@When("Register Station POST API is invoked with {string} ApiKey")
public void register_station_post_api_is_invoked(String key) {
	response = req.queryParam("appid", key.equals("Valid") ? property.apiKey : "12345")
				  .when()
			      .post();
}

@Then("the received reponse code is {int}")
public void the_resceived_reponse_code_is(int code) {
	response.then()
			.assertThat()
			.statusCode(code);
					    
}

@Then("call Get Stations API to retrieve details of the station just registered")
public void call_get_stations_api_to_retrieve_details_of_the_station_just_registered() throws IOException {
	stationId = response.as(RegisterStationResponse.class)
		    			.getID();
	getStationResponse = RestAssured.given().spec(requestSpec())
											.queryParam("appid", property.apiKey )
											.when().get("/" + stationId)
											.as(GetStationResponse.class);
}
@Then("verify the response data matches Register Station request")
public void verify_the_response_data_matches_registration_request() {
    assertEquals(getStationResponse.getExternal_id(), payload.getExternal_id());
    assertEquals(getStationResponse.getName(), payload.getName());
    assertEquals(getStationResponse.getLatitude(), payload.getLatitude(),0.0001);
    assertEquals(getStationResponse.getLongitude(), payload.getLongitude(), 0.0001);
    assertEquals(getStationResponse.getAltitude(), payload.getAltitude(),0.0001);
    
}

}
