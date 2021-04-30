package com.sella.bidderApiSp.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sella.bidderApiSp.domain.DeviceD;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"app",
"device"
})

public class BidRequestD {
	
	@JsonProperty("id")
	@JsonPropertyDescription("The unique identifier of the bid request.")
	private String id;

	@JsonProperty("app")
	@JsonPropertyDescription("Details about the app where the traffic is coming from.")
	private AppD app;

	@JsonProperty("device")
	@JsonPropertyDescription("Details about the user's device to which the impression will be delivered.")
	private DeviceD device;

	
	@JsonProperty("id")
	public String getId() {
	return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
	this.id = id;
	}

	@JsonProperty("app")
	public AppD getApp() {
	return app;
	}

	@JsonProperty("app")
	public void setApp(AppD app) {
	this.app = app;
	}

	@JsonProperty("device")
	public DeviceD getDevice() {
	return device;
	}

	@JsonProperty("device")
	public void setDevice(DeviceD device) {
	this.device = device;
	}


}
