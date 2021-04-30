package com.sella.bidderApiSp.interfaceService;

import com.sella.bidderApiSp.domain.BidRequestD;
import com.sella.bidderApiSp.domain.CampaignD;

public interface BidderInterfaceService {

	public Object findBindResponseFromCampaingAndBidRequest(BidRequestD request ,CampaignD[] campaignResp );
}
