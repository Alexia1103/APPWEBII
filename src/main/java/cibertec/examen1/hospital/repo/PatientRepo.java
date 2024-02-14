package cibertec.examen1.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cibertec.examen1.hospital.model.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
