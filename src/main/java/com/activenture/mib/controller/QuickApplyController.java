package com.activenture.mib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activenture.mib.dao.QuickApplyDao;
import com.activenture.mib.entity.QuickApply;

@RestController
@RequestMapping("/quick-apply")
public class QuickApplyController {
	
	@Autowired
	QuickApplyDao quickApplyDao;
	
	@PostMapping("/save")
	public QuickApply saveQuickApply(@RequestBody QuickApply quickApply) {
		return quickApplyDao.saveQuickApply(quickApply);
	}
	
	

}
