/**
 * 
 */
package com.activenture.mib.controller.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.activenture.mib.controller.ApplicationController;
import com.activenture.mib.dto.ResponseObj;
import com.activenture.mib.entity.Application;
import com.activenture.mib.service.ApplicationService;

/**
 * @author Sandip
 *
 */

@Component
public class ApplicationControllerImpl implements ApplicationController {
	
	@Autowired
	ApplicationService applicationService;

	@Override
	public ResponseEntity saveApplication(Application application) {
		ResponseObj response =new ResponseObj();
		List<Application> list=new ArrayList<Application>();
		list.add(applicationService.saveApplication(application));
		response.setData(list);
		return new ResponseEntity(response,HttpStatus.OK);
	}

}
