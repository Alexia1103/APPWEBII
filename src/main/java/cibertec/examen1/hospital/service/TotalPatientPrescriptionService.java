package cibertec.examen1.hospital.service;

import java.util.List;

import cibertec.examen1.hospital.model.TotalPatientPrescriptionDTO;

public interface TotalPatientPrescriptionService {

	
    TotalPatientPrescriptionDTO getTotalCostForPatient(Integer patientId);

}
