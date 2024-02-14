package cibertec.examen1.hospital.service;

import java.util.List;

import cibertec.examen1.hospital.model.Patient;

public interface PatientService {

    public List<Patient> list();
    public Patient add(Patient patient);
    public Patient update(Patient patient);
    public void delete(int id);

}
