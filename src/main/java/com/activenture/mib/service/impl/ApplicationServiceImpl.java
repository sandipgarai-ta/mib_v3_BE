/**
 * 
 */
package com.activenture.mib.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.activenture.mib.dao.ApplicationDao;
import com.activenture.mib.entity.Application;
import com.activenture.mib.service.ApplicationService;

/**
 * @author Sandip
 *
 */
@Component
public class ApplicationServiceImpl implements ApplicationService {
	
	@Autowired
	ApplicationDao applicationDao;

	@Override
	public Application saveApplication(Application application) {
		return applicationDao.saveApplication(application);
	}

}
