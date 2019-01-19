/**
 * 
 */
package com.activenture.mib.service;

import org.springframework.stereotype.Service;

import com.activenture.mib.entity.Application;

/**
 * @author Sandip
 *
 */

@Service
public interface ApplicationService  {
	public Application saveApplication(Application application);

}
