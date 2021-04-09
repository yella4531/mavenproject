package com.slokam.healthcare.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.entity.Patient;
import com.slokam.healthcare.pojo.PatientSearchPojo;
import com.slokam.healthcare.repo.IPatientRepo;
import com.slokam.healthcare.repo.PatientCriteriaRepo;
import com.slokam.healthcare.service.IPatientService;
@Service
public class PatientServiceImpl implements IPatientService   {
	@Autowired
	private IPatientRepo patientrepo;
	@Autowired
	private PatientCriteriaRepo patientCriteria;

	@Override
	public void patientRegistration(Patient patient) {
		patient.setRegDate(new Date());
		patientrepo.save(patient);
	
	}

	@Override
	public List<Patient> criteriaTest(String name, String email) {
		
		return patientCriteria.patientSearch(name, email);
	}

	@Override
	public List<Patient> patientSearch(PatientSearchPojo searchPojo) {
	
		return patientCriteria.patientFullSearch(searchPojo);
	}

	@Override
	public List<Patient> getAllPatients() {
		
		return patientrepo.findAll();
	}

	@Override
	public Patient getById(Integer id) {
	Optional<Patient> op=patientrepo.findById(id);
	if(op.isPresent()) {
		return op.get();
	}	
	return null;
	}

	
	
}
