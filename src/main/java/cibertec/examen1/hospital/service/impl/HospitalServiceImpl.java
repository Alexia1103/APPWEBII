package cibertec.examen1.hospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.examen1.hospital.model.hospital;
import cibertec.examen1.hospital.repo.HospitalRepo;
import cibertec.examen1.hospital.service.HospitalService;

@Service
public class HospitalServiceImpl  implements HospitalService{

	@Autowired
	HospitalRepo hospitalrepo;
	
	
	@Override
	public List<hospital> list() {
		return hospitalrepo.findAll();
	}

	@Override
	public hospital add(hospital h) {
		return hospitalrepo.save(h);
	}

	@Override
	public hospital update(hospital h) {
		return hospitalrepo.save(h);
	}

	@Override
	public void delete(int id) {
		hospitalrepo.deleteById(id);
		
	}

}
