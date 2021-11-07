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

public class stepDefination_RegisterStation extends utils{
	private GetStationResponse getStationResponse;
	private RegisterStationRequest payload;
	private Response response;
	private RequestSpecification req;
	private String stationId;

@Given("add station payload with {string}, {string} ,{string} ,{string} ,{string}")
public void register_station_payload_is_added(String id,String name,String latitude,String longitude,String altitude ) throws IOException {
	//setup payload with Example data in feature file
	payload = new RegisterStationRequest(id,name,Double.parseDouble(latitude),Double.parseDouble(longitude),Double.parseDouble(altitude));
	req = RestAssured.given()
					 .spec(requestSpec()) 
					 .body(payload);
}

@When("Register Station POST API is invoked with {string} ApiKey")
public void register_station_post_api_is_invoked(String key) {
	//set to '12345' as invalid apikey
	response = req.queryParam("appid", key.equals("Valid") ? property.apiKey : "12345")
				  .when()
			      .post(property.basePath_Stations);
}

@Then("the received response status code is {int}")
public void the_resceived_reponse_code_is(int code) {
	assertEquals(response.statusCode(),code);					    
}

@Then("call Get Stations API to retrieve details of the station just registered")
public void call_get_stations_api_to_retrieve_details_of_the_station_just_registered() throws IOException {
	//Extract 'ID' from RegisterStation API response and use it in Get Station API URL
	stationId = response.as(RegisterStationResponse.class)
		    			.getID();
	
	getStationResponse = RestAssured
						.given()
						.spec(requestSpec())
						.queryParam("appid", property.apiKey )
						.when().get(property.basePath_Stations + "/" + stationId)
						.as(GetStationResponse.class);
}
@Then("verify the response data matches Register Station request")
public void verify_the_response_data_matches_registration_request() {
	//Compare the response data with request payload
    assertEquals(getStationResponse.getExternal_id(), payload.getExternal_id());
    assertEquals(getStationResponse.getName(), payload.getName());
    assertEquals(getStationResponse.getLatitude(), payload.getLatitude(),0.0001);
    assertEquals(getStationResponse.getLongitude(), payload.getLongitude(), 0.0001);
    assertEquals(getStationResponse.getAltitude(), payload.getAltitude(),0.0001);
}

@Then("the received message in response body is {string}")
public void the_received_error_message_is(String errorMsg) {
    // extract 'message' from error response and validate
    assertEquals(response.jsonPath().get("message"),errorMsg);
}

@Then("the received code in response body is {int}")
public void the_received_code_in_response_body_is(int code) {
    // when statusCode is 401 it returns property 'cod' while returns 'code' for other failures
	int expectedCode = response.statusCode() == 401 ?
			response.jsonPath().get("cod") : response.jsonPath().get("code"); 
	assertEquals( expectedCode,code,0.1);
}

}
