package com.sella.bidderApiSp.domain;


import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public enum OSEnum {
	ANDROID("Android"),
	I_OS("iOS");
	
	private final String value;
	private final static Map<String, OSEnum> CONSTANTS = new HashMap<String, OSEnum>();

	static {
	for (OSEnum c: values()) {
	CONSTANTS.put(c.value, c);
	}
	}

	private OSEnum(String value) {
	this.value = value;
	}

	@Override
	public String toString() {
	return this.value;
	}

	@JsonValue
	public String value() {
	return this.value;
	}

	@JsonCreator
	public static OSEnum fromValue(String value) {
		OSEnum constant = CONSTANTS.get(value);
	if (constant == null) {
	throw new IllegalArgumentException(value);
	} else {
	return constant;
	}
	}


}
