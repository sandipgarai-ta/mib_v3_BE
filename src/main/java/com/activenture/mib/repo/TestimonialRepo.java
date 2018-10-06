package com.activenture.mib.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.activenture.mib.entity.Posts;
import com.activenture.mib.entity.Testimonials;

public interface TestimonialRepo extends JpaRepository<Testimonials, Long> {
	
	@Query("SELECT testimonials FROM Testimonials testimonials WHERE isActive = 1")
    public List<Testimonials> findAllActiveTestimonials();

}
