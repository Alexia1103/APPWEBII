package cibertec.examen1.hospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.examen1.hospital.model.pharmacy;
import cibertec.examen1.hospital.repo.PharmacyRepo;
import cibertec.examen1.hospital.service.PharmacyService;

@Service
public class PharmacyServiceImpl implements PharmacyService {

    @Autowired
    PharmacyRepo pharmacyRepo;

    @Override
    public List<pharmacy> list() {
        return pharmacyRepo.findAll();
    }

    @Override
    public pharmacy add(pharmacy pharmacy) {
        return pharmacyRepo.save(pharmacy);
    }

    @Override
    public pharmacy update(pharmacy pharmacy) {
        return pharmacyRepo.save(pharmacy);
    }

    @Override
    public void delete(int id) {
        pharmacyRepo.deleteById(id);
    }
}
