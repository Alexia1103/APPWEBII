package cibertec.examen1.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cibertec.examen1.hospital.model.hospital;

public interface HospitalRepo extends JpaRepository<hospital, Integer>{

	
}
