package com.sella.bidderApiSp.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"campaignId",
"price",
"adm"
})

public class BidD {

	@JsonProperty("campaignId")
	@JsonPropertyDescription("The campaign id.")
	private String campaignId;

	@JsonProperty("price")
	@JsonPropertyDescription("The bid price.")
	private Double price;

	@JsonProperty("adm")
	@JsonPropertyDescription("The ad markup.")
	private String adm;

	@JsonProperty("campaignId")
	public String getCampaignId() {
		return campaignId;
	}

	@JsonProperty("campaignId")
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
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

	
}
