package com.activenture.mib.response;

import java.util.List;

import com.activenture.mib.entity.*;

public class MasterResponse {
	private List<Offer> offerList;
	private List<Testimonials> testimonialsList;
	private List<Posts> postList;
	
	
	
	public List<Offer> getOfferList() {
		return offerList;
	}
	public void setOfferList(List<Offer> offerList) {
		this.offerList = offerList;
	}
	public List<Testimonials> getTestimonialsList() {
		return testimonialsList;
	}
	public void setTestimonialsList(List<Testimonials> testimonialsList) {
		this.testimonialsList = testimonialsList;
	}
	public List<Posts> getPostList() {
		return postList;
	}
	public void setPostList(List<Posts> postList) {
		this.postList = postList;
	}
	
	

}
