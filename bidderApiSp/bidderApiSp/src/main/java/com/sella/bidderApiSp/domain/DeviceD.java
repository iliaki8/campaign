package com.sella.bidderApiSp.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"os",
"geo"
})
public class DeviceD {
	
	@JsonProperty("os")
	@JsonPropertyDescription("Device operating system")
	private OSEnum os;
	
	@JsonProperty("geo")
	@JsonPropertyDescription("Location of the device assumed to be the user's current location.")
	private GeoD geo;

	@JsonProperty("os")
	public OSEnum getOs() {
		return os;
	}

	@JsonProperty("os")
	public void setOs(OSEnum os) {
		this.os = os;
	}

	@JsonProperty("geo")
	public GeoD getGeo() {
		return geo;
	}

	@JsonProperty("geo")
	public void setGeo(GeoD geo) {
		this.geo = geo;
	}

	
	


}
