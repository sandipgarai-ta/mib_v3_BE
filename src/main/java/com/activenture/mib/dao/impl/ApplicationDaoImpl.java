/**
 * 
 */
package com.activenture.mib.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.activenture.mib.dao.ApplicationDao;
import com.activenture.mib.entity.Application;
import com.activenture.mib.repo.ApplicationRepo;

/**
 * @author Sandip
 *
 */

@Component
public class ApplicationDaoImpl implements ApplicationDao {
	
	@Autowired
	ApplicationRepo applicationRepo;

	@Override
	public Application saveApplication(Application application) {
		return applicationRepo.save(application);
	}

}
