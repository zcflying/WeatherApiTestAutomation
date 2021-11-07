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
	 private double latitude;
	 private double longitude;
	 private double altitude;
	 private int rank;
	 private int source_type;

	 // Getter Methods 

	 public double getAltitude() {
	  return altitude;
	 }

	 public String getUpdated_at() {
	  return updated_at;
	 }

	 public String getUser_id() {
	  return user_id;
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

	 public int getRank() {
	  return rank;
	 }

	 public String getExternal_id() {
	  return external_id;
	 }

	 public int getSource_type() {
	  return source_type;
	 }

	 public String getID() {
	  return iD;
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

	 public void setUser_id(String user_id) {
	  this.user_id = user_id;
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

	 public void setRank(int rank) {
	  this.rank = rank;
	 }

	 public void setExternal_id(String external_id) {
	  this.external_id = external_id;
	 }

	 public void setSource_type(int source_type) {
	  this.source_type = source_type;
	 }

	 public void setID(String ID) {
	  this.iD = ID;
	 }

	 public void setLongitude(double longitude) {
	  this.longitude = longitude;
	 }
}
