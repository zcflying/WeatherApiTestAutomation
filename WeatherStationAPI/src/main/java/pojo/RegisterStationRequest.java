package pojo;

public class RegisterStationRequest {
	 private String external_id;
	 private String name;
	 private float latitude;
	 private float longitude;
	 private float altitude;


	 // Getter Methods 

	 public String getExternal_id() {
	  return external_id;
	 }

	 public String getName() {
	  return name;
	 }

	 public float getLatitude() {
	  return latitude;
	 }

	 public float getLongitude() {
	  return longitude;
	 }

	 public float getAltitude() {
	  return altitude;
	 }

	 // Setter Methods 

	 public void setExternal_id(String external_id) {
	  this.external_id = external_id;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setLatitude(float latitude) {
	  this.latitude = latitude;
	 }

	 public void setLongitude(float longitude) {
	  this.longitude = longitude;
	 }

	 public void setAltitude(float altitude) {
	  this.altitude = altitude;
	 }
	 
	public RegisterStationRequest(String id, String name,float latitude,float longitude,float altitude) {
			this.external_id = id;
			this.name = name;
			this.latitude = latitude;
			this.longitude = longitude;
			this.altitude = altitude;

		}
}
