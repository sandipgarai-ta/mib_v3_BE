package com.activenture.mib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activenture.mib.dao.OfferDao;
import com.activenture.mib.dao.PostDao;
import com.activenture.mib.dao.TestimonialDao;
import com.activenture.mib.entity.Offer;
import com.activenture.mib.entity.Posts;
import com.activenture.mib.repo.TestimonialRepo;
import com.activenture.mib.response.MasterResponse;

@RestController
@RequestMapping("/master")
public class MasterController {
	
	@Autowired
	OfferDao offerDao;
	
	@Autowired
	PostDao postDao;
	
	@Autowired
	TestimonialDao testimonialDao;
	
	@PostMapping("/savepost")
	public Posts savePost(@RequestBody Posts post){
		return post;
	}
	
	@GetMapping("/fetchmasterdata")
	public MasterResponse getMasterData(){
		MasterResponse masterRes=new MasterResponse();
		masterRes.setOfferList(offerDao.getAllActiveOffer());
		masterRes.setPostList(postDao.getAllActivePosts());
		masterRes.setTestimonialsList(testimonialDao.findAllActiveTestimonials());
		return masterRes;
	}

}
