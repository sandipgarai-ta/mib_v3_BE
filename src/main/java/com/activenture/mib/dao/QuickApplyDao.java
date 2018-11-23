package com.activenture.mib.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activenture.mib.entity.QuickApply;
import com.activenture.mib.repo.QuickApplyRepo;

@Service
public class QuickApplyDao {
	
	@Autowired
	QuickApplyRepo quickApplyRepo;
	
	public QuickApply saveQuickApply(QuickApply quickApply) {
		return quickApplyRepo.save(quickApply);
	}
}
