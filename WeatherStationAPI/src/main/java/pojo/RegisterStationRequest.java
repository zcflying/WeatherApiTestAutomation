package pojo;

public class RegisterStationRequest {
	 private String external_id;
	 private String name;
	 private double latitude;
	 private double longitude;
	 private double altitude;


	 // Getter Methods 

	 public String getExternal_id() {
	  return external_id;
	 }

	 public String getName() {
	  return name;
	 }

	 public double getLatitude() {
	  return latitude;
	 }

	 public double getLongitude() {
	  return longitude;
	 }

	 public double getAltitude() {
	  return altitude;
	 }

	 // Setter Methods 

	 public void setExternal_id(String external_id) {
	  this.external_id = external_id;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setLatitude(double latitude) {
	  this.latitude = latitude;
	 }

	 public void setLongitude(double longitude) {
	  this.longitude = longitude;
	 }

	 public void setAltitude(double altitude) {
	  this.altitude = altitude;
	 }
	 
	public RegisterStationRequest(String id, String name,double latitude,double longitude,double altitude) {
			this.external_id = id;
			this.name = name;
			this.latitude = latitude;
			this.longitude = longitude;
			this.altitude = altitude;

		}
}
