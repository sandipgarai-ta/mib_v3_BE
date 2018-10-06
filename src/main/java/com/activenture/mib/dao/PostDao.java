package com.activenture.mib.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activenture.mib.entity.Posts;
import com.activenture.mib.repo.OfferRepo;
import com.activenture.mib.repo.PostRepo;

@Service
public class PostDao {
	@Autowired
	PostRepo postRepo;
	
	public Posts savePost(Posts post){
		return postRepo.save(post);
	}
	
	
	public List<Posts> getAllActivePosts(){
		return postRepo.findAllPost();
	}

}
