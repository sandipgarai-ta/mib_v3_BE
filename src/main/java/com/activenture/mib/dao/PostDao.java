package com.activenture.mib.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activenture.mib.entity.Posts;
import com.activenture.mib.repo.MasterRepo;

@Service
public class PostDao {
	@Autowired
	MasterRepo masterRepo;
	
	
	public List<Posts> getAllActivePosts(){
		return masterRepo.findAllPost();
	}

}
