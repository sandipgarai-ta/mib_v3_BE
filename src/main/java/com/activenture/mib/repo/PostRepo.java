package com.activenture.mib.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.activenture.mib.entity.Posts;

public interface PostRepo extends JpaRepository<Posts, Long> {
	
	@Query("SELECT post FROM Posts post WHERE isActive = 1")
    public List<Posts> findAllPost();
}
