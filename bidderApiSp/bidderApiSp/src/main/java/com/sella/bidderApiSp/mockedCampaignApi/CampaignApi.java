package com.sella.bidderApiSp.mockedCampaignApi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sella.bidderApiSp.domain.CampaignD;

import org.springframework.stereotype.Component;
 
@Component
public class CampaignApi {
	
	public static final String campaignResp = "[\r\n"
			+ "  {\r\n"
			+ "    \"id\": \"c56bc77b\",\r\n"
			+ "    \"name\": \"Test Campaign 2\",\r\n"
			+ "    \"price\": 0.45,\r\n"
			+ "    \"adm\": \"<a href=\\\"http://example.com/click/qbFCjzXR9rkf8qa4\\\"><img src=\\\"http://assets.example.com/ad_assets/files/000/000/002/original/banner_300_250.png\\\" height=\\\"250\\\" width=\\\"300\\\" alt=\\\"\\\"/></a><img src=\\\"http://example.com/win/qbFCjzXR9rkf8qa4\\\" height=\\\"1\\\" width=\\\"1\\\" alt=\\\"\\\"/>\\r\\n\",\r\n"
			+ "    \"targetedCountries\": [\r\n"
			+ "      \"BRA\",\r\n"
			+ "      \"EGY\"\r\n"
			+ "    ]\r\n"
			+ "  },\r\n"
			+ "  {\r\n"
			+ "    \"id\": \"a20579a5\",\r\n"
			+ "    \"name\": \"Test Campaign 3\",\r\n"
			+ "    \"price\": 2.21,\r\n"
			+ "    \"adm\": \"<a href=\\\"http://example.com/click/qbFCjzXR9rkf8qa4\\\"><img src=\\\"http://assets.example.com/ad_assets/files/000/000/002/original/banner_300_250.png\\\" height=\\\"250\\\" width=\\\"300\\\" alt=\\\"\\\"/></a><img src=\\\"http://example.com/win/qbFCjzXR9rkf8qa4\\\" height=\\\"1\\\" width=\\\"1\\\" alt=\\\"\\\"/>\\r\\n\",\r\n"
			+ "    \"targetedCountries\": [\r\n"
			+ "      \"HUN\",\r\n"
			+ "      \"MEX\"\r\n"
			+ "    ]\r\n"
			+ "  },\r\n"
			+ "  {\r\n"
			+ "    \"id\": \"5a3dce46\",\r\n"
			+ "    \"name\": \"Test Campaign 1\",\r\n"
			+ "    \"price\": 1.23,\r\n"
			+ "    \"adm\": \"<a href=\\\"http://example.com/click/qbFCjzXR9rkf8qa4\\\"><img src=\\\"http://assets.example.com/ad_assets/files/000/000/002/original/banner_300_250.png\\\" height=\\\"250\\\" width=\\\"300\\\" alt=\\\"\\\"/></a><img src=\\\"http://example.com/win/qbFCjzXR9rkf8qa4\\\" height=\\\"1\\\" width=\\\"1\\\" alt=\\\"\\\"/>\\r\\n\",\r\n"
			+ "    \"targetedCountries\": [\r\n"
			+ "      \"USA\",\r\n"
			+ "      \"GBR\",\r\n"
			+ "      \"GRC\"\r\n"
			+ "    ]\r\n"
			+ "  },\r\n"
			+ "  {\r\n"
			+ "    \"id\": \"e919799e\",\r\n"
			+ "    \"name\": \"Test Campaign 4\",\r\n"
			+ "    \"price\": 0.39,\r\n"
			+ "    \"adm\": \"<a href=\\\"http://example.com/click/qbFCjzXR9rkf8qa4\\\"><img src=\\\"http://assets.example.com/ad_assets/files/000/000/002/original/banner_300_250.png\\\" height=\\\"250\\\" width=\\\"300\\\" alt=\\\"\\\"/></a><img src=\\\"http://example.com/win/qbFCjzXR9rkf8qa4\\\" height=\\\"1\\\" width=\\\"1\\\" alt=\\\"\\\"/>\\r\\n\",\r\n"
			+ "    \"targetedCountries\": [\r\n"
			+ "      \"USA\"\r\n"
			+ "    ]\r\n"
			+ "  },\r\n"
			+ "  {\r\n"
			+ "    \"id\": \"ef88888f\",\r\n"
			+ "    \"name\": \"Test Campaign 5\",\r\n"
			+ "    \"price\": 1.6,\r\n"
			+ "    \"adm\": \"<a href=\\\"http://example.com/click/qbFCjzXR9rkf8qa4\\\"><img src=\\\"http://assets.example.com/ad_assets/files/000/000/002/original/banner_300_250.png\\\" height=\\\"250\\\" width=\\\"300\\\" alt=\\\"\\\"/></a><img src=\\\"http://example.com/win/qbFCjzXR9rkf8qa4\\\" height=\\\"1\\\" width=\\\"1\\\" alt=\\\"\\\"/>\\r\\n\",\r\n"
			+ "    \"targetedCountries\": [\r\n"
			+ "      \"GBR\"\r\n"
			+ "    ]\r\n"
			+ "  }\r\n"
			+ "]\r\n"
			+ "";
	
	public CampaignD[] parseCampaign (){	
		Gson gson = new GsonBuilder().create(); 
		CampaignD[] resp = gson.fromJson(campaignResp, CampaignD[].class);
		return resp;
	}
	


}
