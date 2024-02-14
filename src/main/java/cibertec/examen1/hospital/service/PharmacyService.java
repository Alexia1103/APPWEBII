package cibertec.examen1.hospital.service;

import java.util.List;

import cibertec.examen1.hospital.model.pharmacy;

public interface PharmacyService {

    public List<pharmacy> list();
    public pharmacy add(pharmacy pharmacy);
    public pharmacy update(pharmacy pharmacy);
    public void delete(int id);
}
