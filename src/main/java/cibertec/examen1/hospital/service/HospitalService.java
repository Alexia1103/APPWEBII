package cibertec.examen1.hospital.service;

import java.util.List;

import cibertec.examen1.hospital.model.hospital;

public interface HospitalService {

	public List<hospital> list();
	public hospital add(hospital h);
	public hospital update(hospital h);
	public void delete(int id);
}
