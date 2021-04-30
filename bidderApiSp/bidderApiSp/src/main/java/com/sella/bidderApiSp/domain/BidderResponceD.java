package com.sella.bidderApiSp.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"bid"
})
public class BidderResponceD {

	@JsonProperty("id")
	@JsonPropertyDescription("The unique identifier of the bid request.")
	private String id;

	@JsonProperty("bid")
	@JsonPropertyDescription("Information about the bid.")
	private BidD bid;


	@JsonProperty("id")
	public String getId() {
	return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
	this.id = id;
	}

	@JsonProperty("bid")
	public BidD getBid() {
	return bid;
	}

	@JsonProperty("bid")
	public void setBid(BidD bid) {
	this.bid = bid;
	}

}
