package pojo;

public class GetStationResponse {
	 private double altitude;
	 private String updated_at;
	 private double latitude;
	 private String name;
	 private String created_at;
	 private double rank;
	 private String external_id;
	 private String id;
	 private double longitude;


	 // Getter Methods 

	 public double getAltitude() {
	  return altitude;
	 }

	 public String getUpdated_at() {
	  return updated_at;
	 }

	 public double getLatitude() {
	  return latitude;
	 }

	 public String getName() {
	  return name;
	 }

	 public String getCreated_at() {
	  return created_at;
	 }

	 public double getRank() {
	  return rank;
	 }

	 public String getExternal_id() {
	  return external_id;
	 }

	 public String getId() {
	  return id;
	 }

	 public double getLongitude() {
	  return longitude;
	 }

	 // Setter Methods 

	 public void setAltitude(double altitude) {
	  this.altitude = altitude;
	 }

	 public void setUpdated_at(String updated_at) {
	  this.updated_at = updated_at;
	 }

	 public void setLatitude(double latitude) {
	  this.latitude = latitude;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setCreated_at(String created_at) {
	  this.created_at = created_at;
	 }

	 public void setRank(double rank) {
	  this.rank = rank;
	 }

	 public void setExternal_id(String external_id) {
	  this.external_id = external_id;
	 }

	 public void setId(String id) {
	  this.id = id;
	 }

	 public void setLongitude(double longitude) {
	  this.longitude = longitude;
	 }
}
