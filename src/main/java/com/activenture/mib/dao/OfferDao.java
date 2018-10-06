package com.activenture.mib.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activenture.mib.entity.Offer;
import com.activenture.mib.repo.MasterRepo;

@Service
public class OfferDao {
	
	@Autowired
	MasterRepo masterRepo;
	
	
	public Offer saveOffer(Offer offer){
		return masterRepo.save(offer);
	}
	
	
	public List<Offer> getAllActiveOffer(){
		return masterRepo.findAllOffer();
	}

}
