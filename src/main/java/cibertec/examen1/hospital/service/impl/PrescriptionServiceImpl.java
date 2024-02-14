package cibertec.examen1.hospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.examen1.hospital.model.prescription;
import cibertec.examen1.hospital.repo.PrescriptionRepo;
import cibertec.examen1.hospital.service.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

    @Autowired
    PrescriptionRepo prescriptionRepo;

    @Override
    public List<prescription> list() {
        return prescriptionRepo.findAll();
    }

    @Override
    public prescription add(prescription prescription) {
        return prescriptionRepo.save(prescription);
    }

    @Override
    public prescription update(prescription prescription) {
        return prescriptionRepo.save(prescription);
    }

    @Override
    public void delete(int id) {
        prescriptionRepo.deleteById(id);
    }
}
