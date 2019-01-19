/**
 * 
 */
package com.activenture.mib.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.activenture.mib.entity.Application;

/**
 * @author Sandip
 *
 */
public interface ApplicationRepo extends JpaRepository<Application, Long> {
	
	//public Application save();

}
