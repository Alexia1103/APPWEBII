package cibertec.examen1.hospital.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.examen1.hospital.model.Patient;
import cibertec.examen1.hospital.model.TotalPatientPrescriptionDTO;
import cibertec.examen1.hospital.repo.PatientRepo;
import cibertec.examen1.hospital.repo.PrescriptionRepo;
import cibertec.examen1.hospital.service.TotalPatientPrescriptionService;

@Service
public class TotalPatientPrescriptionServiceImpl implements TotalPatientPrescriptionService {

    @Autowired
    private PrescriptionRepo prescriptionRepo;

    @Autowired
    private PatientRepo patientRepo;
   
    @Override
    public TotalPatientPrescriptionDTO getTotalCostForPatient(Integer patientId) {
        Patient patient = patientRepo.findById(patientId).orElse(null);
        if (patient != null) {
            Double totalCost = prescriptionRepo.getTotalPrescriptionCostForPatient(patientId);
            return new TotalPatientPrescriptionDTO(patientId, patient.getPatient_FName(), patient.getPatient_LName(), totalCost);
        } else {
            return null; // Manejo de error si no se encuentra el paciente
        }
    }
}
