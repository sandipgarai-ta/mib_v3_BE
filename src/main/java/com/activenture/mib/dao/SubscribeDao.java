package com.activenture.mib.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activenture.mib.entity.SubscribedUser;
import com.activenture.mib.repo.SubscriberRepo;

@Service
public class SubscribeDao {

	@Autowired
	SubscriberRepo subscribeRepo;
	
	
	public SubscribedUser addSubscribedUser(SubscribedUser obj){
		return subscribeRepo.save(obj);
	}

}
