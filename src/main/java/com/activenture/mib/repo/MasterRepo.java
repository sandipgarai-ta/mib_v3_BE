package com.activenture.mib.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.activenture.mib.entity.Offer;
import com.activenture.mib.entity.Posts;

public interface MasterRepo extends JpaRepository<Offer, Long> {
	
	@Query("SELECT offer FROM Offer offer WHERE isActive = 1")
    public List<Offer> findAllOffer();
	
	@Query("SELECT post FROM Posts post WHERE isActive = 1")
    public List<Posts> findAllPost();
	
	@Query("SELECT testimonials FROM Testimonials testimonials WHERE isActive = 1")
    public List<Posts> findAllTestimonials();
}
