Feature: Weather Station API

@Regression
Scenario Outline: Register Station Success
Given add station payload with "<external_id>", "<name>" ,"<latitude>" ,"<longitude>" ,"<altitude>"
When Register Station POST API is invoked with "Valid" ApiKey
Then the received reponse code is 201
And call Get Stations API to retrieve details of the station just registered
And verify the response data matches Register Station request

Examples:
	|external_id  |name                       |latitude |longitude   |altitude|
	|CZ_TEST001   |Chun Zhang Test Station 001|33.33    |-122.43     |222     |
	|CZ_TEST002   |Chun Zhang Test Station 002|44.44    |-122.44     |111     |

@Smoke
Scenario Outline: Register Station Failed with invalid ApiKey
Given add station payload with "<external_id>", "<name>" ,"<latitude>" ,"<longitude>" ,"<altitude>"
When Register Station POST API is invoked with "Invalid" ApiKey
Then the received reponse code is 401
 
Examples:
	|external_id|name                       |latitude |longitude   |altitude|
	|CZ_TEST001 |Chun Zhang Test Station 001|33.33    |-122.43     |222     |

