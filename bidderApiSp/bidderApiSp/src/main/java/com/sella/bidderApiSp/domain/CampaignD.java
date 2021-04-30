package com.sella.bidderApiSp.domain;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"name",
"price",
"adm",
"targetedCountries"
})

public class CampaignD {
	
	@JsonProperty("id")
	private String id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("price")
	private Double price;
	@JsonProperty("adm")
	private String adm;
	@JsonProperty("targetedCountries")
	private List<String> targetedCountries = null;

	@JsonProperty("id")
	public String getId() {
	return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
	this.id = id;
	}

	@JsonProperty("name")
	public String getName() {
	return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
	this.name = name;
	}

	@JsonProperty("price")
	public Double getPrice() {
	return price;
	}

	@JsonProperty("price")
	public void setPrice(Double price) {
	this.price = price;
	}

	@JsonProperty("adm")
	public String getAdm() {
	return adm;
	}

	@JsonProperty("adm")
	public void setAdm(String adm) {
	this.adm = adm;
	}

	@JsonProperty("targetedCountries")
	public List<String> getTargetedCountries() {
	return targetedCountries;
	}

	@JsonProperty("targetedCountries")
	public void setTargetedCountries(List<String> targetedCountries) {
	this.targetedCountries = targetedCountries;
	}


}
