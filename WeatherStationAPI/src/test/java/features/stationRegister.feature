Feature: Weather Station API

@Regression @Smoke
Scenario Outline: Register Station API Success
Given add station payload with "<external_id>", "<name>" ,"<latitude>" ,"<longitude>" ,"<altitude>"
When Register Station POST API is invoked with "Valid" ApiKey
Then the received response status code is 201
And call Get Stations API to retrieve details of the station just registered
And verify the response data matches Register Station request

Examples:
	|external_id    |name                      |latitude |longitude   |altitude|
	|DEMO_TEST001   |Team Demo Test Station 001|33.33    |-122.43     |222     |
	|DEMO_TEST002   |Team Demo Test Station 002|44.44    |-122.44     |111     |

@Regression
Scenario Outline: Register Station API Failed at authentication
Given add station payload with "<external_id>", "<name>" ,"<latitude>" ,"<longitude>" ,"<altitude>"
When Register Station POST API is invoked with "Invalid" ApiKey
Then the received response status code is 401
And the received code in response body is 401
And the received message in response body is "Invalid API key. Please see http://openweathermap.org/faq#error401 for more info."
 
Examples:
	|external_id  |name                       |latitude |longitude   |altitude|
	|DEMO_TEST003 |Team Demo Test Station 003 |33.33    |-122.43     |222     |

@Additional
Scenario Outline: Register Station API Failed at request validation
Given add station payload with "<external_id>", "<name>" ,"<latitude>" ,"<longitude>" ,"<altitude>"
When Register Station POST API is invoked with "Valid" ApiKey
Then the received response status code is 400
And the received code in response body is 400001
And the received message in response body is "<errorMessage>"

Examples:
	|errorMessage            						|external_id    |name                       |latitude |longitude   |altitude|
	|Bad external id         						|           	|Team Demo Test Station 004 |33.33    |-122.43     |222     |
	|Bad or zero length station name        		|DEMO_TEST004   |                           |33.33    |-122.43     |222     |
	|Station latitude should be in (-90:90)        	|DEMO_TEST005   |Team Demo Test Station 005 |90.00001 |-122.43     |222     |
	|Station latitude should be in (-90:90)        	|DEMO_TEST006   |Team Demo Test Station 006 |-90.00001|-122.43     |222     |
	|Station longitude should be in (-180:180)     	|DEMO_TEST007   |Team Demo Test Station 007 |33.33    |180.00001   |222     |
	|Station longitude should be in (-180:180)     	|DEMO_TEST008   |Team Demo Test Station 008 |33.33    |-180.00001  |222     |
	