package com.activenture.mib.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activenture.mib.entity.Offer;
import com.activenture.mib.repo.OfferRepo;

@Service
public class OfferDao {
	
	@Autowired
	OfferRepo offerRepo;
	
	
	public Offer saveOffer(Offer offer){
		return offerRepo.save(offer);
	}
	
	
	public List<Offer> getAllActiveOffer(){
		return offerRepo.findAllOffer();
	}

}
