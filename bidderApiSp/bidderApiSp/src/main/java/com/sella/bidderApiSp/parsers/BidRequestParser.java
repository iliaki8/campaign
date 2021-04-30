package com.sella.bidderApiSp.parsers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sella.bidderApiSp.domain.BidRequestD;
import com.sella.bidderApiSp.domain.BidderResponceD;

import org.springframework.stereotype.Component;

@Component
public class BidRequestParser {

	public BidRequestD parseBid(String bidRequest) {
		Gson gson = new GsonBuilder().disableHtmlEscaping().create(); 
		BidRequestD req = gson.fromJson(bidRequest, BidRequestD.class);
		return req;	
	}
	
	public BidderResponceD parseBidResponse(String response) {
		Gson gson = new GsonBuilder().disableHtmlEscaping().create(); 
		BidderResponceD res = gson.fromJson(response, BidderResponceD.class);
		return res;	
	}

}
