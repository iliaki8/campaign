package com.sella.bidderApiSp;

//import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.google.gson.Gson;

import com.sella.bidderApiSp.domain.BidRequestD;
import com.sella.bidderApiSp.domain.BidderResponceD;
import com.sella.bidderApiSp.domain.CampaignD;
import com.sella.bidderApiSp.mockedCampaignApi.CampaignApi;
import com.sella.bidderApiSp.parsers.BidRequestParser;
import com.sella.bidderApiSp.service.BidderService;


@SpringBootTest
public class BidderApiSpApplicationTests {

	@Autowired
	private BidderService service;
	@Autowired
	private BidRequestParser parser;
	@Autowired
	private CampaignApi campaignApi;


	@Test
	public void testService_case1() {
		String case1Input = "{\n"
				+ "  \"id\": \"e7fe51ce4f6376876353ff0961c2cb0d\",\n"
				+ "  \"app\": {\n"
				+ "    \"id\": \"e7fe51ce-4f63-7687-6353-ff0961c2cb0d\",\n"
				+ "    \"name\": \"Morecast Weather\"\n"
				+ "  },\n"
				+ "  \"device\": {\n"
				+ "    \"os\": \"Android\",\n"
				+ "    \"geo\": {\n"
				+ "      \"country\": \"USA\",\n"
				+ "      \"lat\": 0,\n"
				+ "      \"lon\": 0\n"
				+ "    }\n"
				+ "  }\n"
				+ "}";
		BidRequestD req = parser.parseBid(case1Input);

		CampaignD[] campaigns = campaignApi.parseCampaign();
		BidderResponceD output = (BidderResponceD) service.findBindResponseFromCampaingAndBidRequest(req, campaigns);
		System.out.println("actual: " + new Gson().toJson(output));
		
		String case1Output ="{"
				+ "  \"id\": \"e7fe51ce4f6376876353ff0961c2cb0d\","
				+ "  \"bid\": {"
				+ "    \"campaignId\": \"5a3dce46\","
				+ "    \"price\": 1.23,"
				+ "    \"adm\": \"<a href=\\\"http://example.com/click/qbFCjzXR9rkf8qa4\\\"><img src=\\\"http://assets.example.com/ad_assets/files/000/000/002/original/banner_300_250.png\\\" height=\\\"250\\\" width=\\\"300\\\" alt=\\\"\\\"/></a><img src=\\\"http://example.com/win/qbFCjzXR9rkf8qa4\\\" height=\\\"1\\\" width=\\\"1\\\" alt=\\\"\\\"/>\\r\\n\""
				+ "  }"
				+ "}"
				+ "";
		BidderResponceD resp = parser.parseBidResponse(case1Output);
		System.out.println("expected: " + case1Output);
	}

	@Test
	public void testService_case2() {
		String case2Input = "{\n"
				+ "  \"id\": \"e7fe51ce4f6376876353ff0961c2cb0d\",\n"
				+ "  \"app\": {\n"
				+ "    \"id\": \"e7fe51ce-4f63-7687-6353-ff0961c2cb0d\",\n"
				+ "    \"name\": \"Morecast Weather\"\n"
				+ "  },\n"
				+ "  \"device\": {\n"
				+ "    \"os\": \"Android\",\n"
				+ "    \"geo\": {\n"
				+ "      \"country\": \"CYP\",\n"
				+ "      \"lat\": 0,\n"
				+ "      \"lon\": 0\n"
				+ "    }\n"
				+ "  }\n"
				+ "}\n"
				+ "\n"
				+ "";
		BidRequestD req = parser.parseBid(case2Input);

		CampaignD[] campaign = campaignApi.parseCampaign();
		BidRequestD output = (BidRequestD) service.findBindResponseFromCampaingAndBidRequest(req, campaign);
		if(output == null) {
			System.out.println("no bid");
		}
		System.out.println("actual 2 " + new Gson().toJson(output));
		
		String expetedOutput2 = "";
		BidderResponceD resp = parser.parseBidResponse(expetedOutput2);
		System.out.println("expected 2: " + expetedOutput2);
	}
}
