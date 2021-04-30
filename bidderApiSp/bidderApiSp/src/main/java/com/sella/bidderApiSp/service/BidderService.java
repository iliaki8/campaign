package com.sella.bidderApiSp.service;

import java.util.ArrayList;
import java.util.List;

import com.sella.bidderApiSp.domain.BidD;
import com.sella.bidderApiSp.domain.BidRequestD;
import com.sella.bidderApiSp.domain.BidderResponceD;
import com.sella.bidderApiSp.domain.CampaignD;
import com.sella.bidderApiSp.interfaceService.BidderInterfaceService;
import java.util.Comparator;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class BidderService implements BidderInterfaceService {

	@Override
	public Object findBindResponseFromCampaingAndBidRequest(BidRequestD request, CampaignD[] campaignResp) {

		String id = null;
		Boolean flag = false;
		List<CampaignD> countrySelected = new ArrayList<>();
		
		for(CampaignD campaign:campaignResp) {
			if (campaign.getTargetedCountries().contains(request.getDevice().getGeo().getCountry())) {
				countrySelected.add(campaign);
				id = request.getId();
				flag = true;
			}
		}
		
		if (flag) {
			BidderResponceD bidResp = new BidderResponceD();
			BidD bid = new BidD();
			List<CampaignD> finalList = countrySelected.stream()
							.sorted(Comparator.comparingDouble(CampaignD::getPrice)
							.reversed())
							.collect(Collectors.toList());
			CampaignD campaign = finalList.get(0);
				bid.setAdm(campaign.getAdm());
				bid.setCampaignId(campaign.getId());
				bid.setPrice(campaign.getPrice());
				bidResp.setBid(bid);
				bidResp.setId(id);
			
			return bidResp;
		} else {
		 	
			return null;
		}
		

	}

}
