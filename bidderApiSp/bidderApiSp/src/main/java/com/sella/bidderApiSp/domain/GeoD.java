package com.sella.bidderApiSp.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"country",
"lat",
"lon"
})
public class GeoD {
	
	@JsonProperty("country")
	@JsonPropertyDescription("Country code using ISO-3166-1-alpha-3.")
	private String country;

	@JsonProperty("lat")
	@JsonPropertyDescription("Latitude from 90.0 to +90.0, where negative is south.")
	private Double lat;

	@JsonProperty("lon")
	@JsonPropertyDescription("Longitude from 180.0 to +180.0, where negative is west.")
	private Double lon;

	@JsonProperty("country")
	public String getCountry() {
	return country;
	}
	
	@JsonProperty("country")
	public void setCountry(String country) {
	this.country = country;
	}

	@JsonProperty("lat")
	public Double getLat() {
	return lat;
	}

	@JsonProperty("lat")
	public void setLat(Double lat) {
	this.lat = lat;
	}

	@JsonProperty("lon")
	public Double getLon() {
	return lon;
	}

	@JsonProperty("lon")
	public void setLon(Double lon) {
	this.lon = lon;
	}

}
