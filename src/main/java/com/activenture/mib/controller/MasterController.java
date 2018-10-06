package com.activenture.mib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activenture.mib.dao.OfferDao;
import com.activenture.mib.entity.Offer;

@RestController
@RequestMapping("/master")
public class MasterController {
	
	@Autowired
	OfferDao offerDao;
	
	@GetMapping("/fetchmasterdata")
	public List<Offer> getMasterData(){
		return offerDao.getAllOffer();
	}

}
