package pojo;

public class GetStationResponse {
	 private float altitude;
	 private String updated_at;
	 private float latitude;
	 private String name;
	 private String created_at;
	 private float rank;
	 private String external_id;
	 private String id;
	 private float longitude;


	 // Getter Methods 

	 public float getAltitude() {
	  return altitude;
	 }

	 public String getUpdated_at() {
	  return updated_at;
	 }

	 public float getLatitude() {
	  return latitude;
	 }

	 public String getName() {
	  return name;
	 }

	 public String getCreated_at() {
	  return created_at;
	 }

	 public float getRank() {
	  return rank;
	 }

	 public String getExternal_id() {
	  return external_id;
	 }

	 public String getId() {
	  return id;
	 }

	 public float getLongitude() {
	  return longitude;
	 }

	 // Setter Methods 

	 public void setAltitude(float altitude) {
	  this.altitude = altitude;
	 }

	 public void setUpdated_at(String updated_at) {
	  this.updated_at = updated_at;
	 }

	 public void setLatitude(float latitude) {
	  this.latitude = latitude;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setCreated_at(String created_at) {
	  this.created_at = created_at;
	 }

	 public void setRank(float rank) {
	  this.rank = rank;
	 }

	 public void setExternal_id(String external_id) {
	  this.external_id = external_id;
	 }

	 public void setId(String id) {
	  this.id = id;
	 }

	 public void setLongitude(float longitude) {
	  this.longitude = longitude;
	 }
}
