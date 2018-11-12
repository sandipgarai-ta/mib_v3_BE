package com.activenture.mib.controller;

import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activenture.mib.config.MailClient;
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
	
	@Autowired
	MailClient mailClient;
	
	@PostMapping("/savepost")
	public Posts savePost(@RequestBody Posts post){
		return postDao.savePost(post);
	}
	
	@GetMapping("/fetchmasterdata")
	public MasterResponse getMasterData(){
		//MailClient mailClient=new MailClient();
		try {
			mailClient.preparedAndSendMail("sandip.garai013@gmail.com", "Test Mail From MIB-BE");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MasterResponse masterRes=new MasterResponse();
		masterRes.setOfferList(offerDao.getAllActiveOffer());
		masterRes.setPostList(postDao.getAllActivePosts());
		masterRes.setTestimonialsList(testimonialDao.findAllActiveTestimonials());
		return masterRes;
	}

}
