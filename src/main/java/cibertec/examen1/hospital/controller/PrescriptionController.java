package cibertec.examen1.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cibertec.examen1.hospital.model.TotalPatientPrescriptionDTO;
import cibertec.examen1.hospital.model.prescription;
import cibertec.examen1.hospital.repo.PrescriptionRepo;
import cibertec.examen1.hospital.service.PrescriptionService;
import cibertec.examen1.hospital.service.TotalPatientPrescriptionService;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

    @Autowired
    PrescriptionService prescriptionService;
    
    @Autowired
    private PrescriptionRepo prescriptionRepo;
    
    @Autowired
    private TotalPatientPrescriptionService totalPatientPrescriptionService;



    @GetMapping
    public ResponseEntity<List<prescription>> list() {
        return new ResponseEntity<>(prescriptionService.list(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<prescription> add(@RequestBody prescription prescription) {
        return new ResponseEntity<>(prescriptionService.add(prescription), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<prescription> update(@RequestBody prescription prescription) {
        return new ResponseEntity<>(prescriptionService.update(prescription), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id) {
        prescriptionService.delete(id);
        return new ResponseEntity<>("Prescription eliminado correctamente",HttpStatus.OK);
    }
 
    @GetMapping("/totalCostForPatient/{patientId}")
    public ResponseEntity<TotalPatientPrescriptionDTO> getTotalCostForPatient(@PathVariable("patientId") Integer patientId) {
        TotalPatientPrescriptionDTO totalPrescription = totalPatientPrescriptionService.getTotalCostForPatient(patientId);
        if (totalPrescription != null) {
            return new ResponseEntity<>(totalPrescription, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
