package cibertec.examen1.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cibertec.examen1.hospital.model.prescription;

public interface PrescriptionRepo extends JpaRepository<prescription, Integer> {
 
    @Query("SELECT SUM(p.Prescription_Cost) FROM prescription p WHERE p.patient.Patient_ID = :patientId")
    Double getTotalPrescriptionCostForPatient(@Param("patientId") Integer patientId);



}
