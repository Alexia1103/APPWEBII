package cibertec.examen1.hospital.service;

import java.util.List;

import cibertec.examen1.hospital.model.prescription;

public interface PrescriptionService {

    public List<prescription> list();
    public prescription add(prescription prescription);
    public prescription update(prescription prescription);
    public void delete(int id);
}
