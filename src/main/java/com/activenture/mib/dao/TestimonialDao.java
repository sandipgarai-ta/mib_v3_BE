package com.activenture.mib.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activenture.mib.entity.Testimonials;
import com.activenture.mib.repo.TestimonialRepo;

@Service
public class TestimonialDao {
	@Autowired
	TestimonialRepo testimonialRepo;
	
	public Testimonials saveTestimonial(Testimonials t){
		return testimonialRepo.save(t);
	}
	
	public List<Testimonials> findAllActiveTestimonials(){
		return testimonialRepo.findAllActiveTestimonials();
	}
}
