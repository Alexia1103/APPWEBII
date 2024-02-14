package cibertec.examen1.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cibertec.examen1.hospital.model.TotalPatientPrescriptionDTO;

public interface TotalPatientPrescriptionRepo extends JpaRepository<TotalPatientPrescriptionDTO, Integer> {

}
