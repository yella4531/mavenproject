package com.slokam.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.repo.IVisitingRepo;
import com.slokam.healthcare.service.IVisintingService;
@Service
public class VisitingServiceImpl implements IVisintingService {
	@Autowired
	private IVisitingRepo ivisitrepo;

	@Override
	public List<Object[]> getVisitingsByPatientId(Integer id) {
	
		return ivisitrepo.getVisitingDet(id) ;
	}

}
