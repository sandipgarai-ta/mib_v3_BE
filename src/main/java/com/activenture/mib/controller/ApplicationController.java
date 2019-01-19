/**
 * 
 */
package com.activenture.mib.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activenture.mib.entity.Application;

/**
 * @author Sandip
 *
 */
@RequestMapping("/application")
@RestController
public interface ApplicationController {
	
	@PostMapping("/save-application")
	public ResponseEntity saveApplication(@RequestBody Application application);

}
