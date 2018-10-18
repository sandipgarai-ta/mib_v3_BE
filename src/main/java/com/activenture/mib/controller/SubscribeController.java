/**
 * 
 */
package com.activenture.mib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.activenture.mib.dao.SubscribeDao;
import com.activenture.mib.entity.SubscribedUser;

/**
 * @author Sandip
 *
 */

@RestController
@RequestMapping("/subscribe")
public class SubscribeController {
	
	@Autowired
	SubscribeDao subscriberDao;
	
	@PostMapping("/add-subscriber")
	public SubscribedUser addSubscriber(@RequestBody SubscribedUser subscribeObj){
		return subscriberDao.addSubscribedUser(subscribeObj);
	}
	
	
	
	

}
