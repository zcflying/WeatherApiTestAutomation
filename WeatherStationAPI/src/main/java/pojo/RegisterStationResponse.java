package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegisterStationResponse {
	@JsonProperty("ID") 
	 private String iD;
	 private String updated_at;
	 private String created_at;
	 private String user_id;
	 private String external_id;
	 private String name;
	 private float latitude;
	 private float longitude;
	 private float altitude;
	 private float rank;
	 private float source_type;

	 // Getter Methods 

	 public float getAltitude() {
	  return altitude;
	 }

	 public String getUpdated_at() {
	  return updated_at;
	 }

	 public String getUser_id() {
	  return user_id;
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

	 public float getSource_type() {
	  return source_type;
	 }

	 public String getID() {
	  return iD;
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

	 public void setUser_id(String user_id) {
	  this.user_id = user_id;
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

	 public void setSource_type(float source_type) {
	  this.source_type = source_type;
	 }

	 public void setID(String ID) {
	  this.iD = ID;
	 }

	 public void setLongitude(float longitude) {
	  this.longitude = longitude;
	 }
}
