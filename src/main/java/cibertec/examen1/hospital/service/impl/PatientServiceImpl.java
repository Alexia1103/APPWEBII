package cibertec.examen1.hospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.examen1.hospital.model.Patient;
import cibertec.examen1.hospital.repo.PatientRepo;
import cibertec.examen1.hospital.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	
	  @Autowired
	    PatientRepo patientRepo;

	    @Override
	    public List<Patient> list() {
	        return patientRepo.findAll();
	    }

	    @Override
	    public Patient add(Patient patient) {
	        return patientRepo.save(patient);
	    }

	    @Override
	    public Patient update(Patient patient) {
	        return patientRepo.save(patient);
	    }

	    @Override
	    public void delete(int id) {
	        patientRepo.deleteById(id);
	    }

}
