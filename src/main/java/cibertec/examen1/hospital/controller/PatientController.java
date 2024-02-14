package cibertec.examen1.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cibertec.examen1.hospital.model.Patient;
import cibertec.examen1.hospital.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping
    public ResponseEntity<List<Patient>> list() {
        return new ResponseEntity<>(patientService.list(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Patient> add(@RequestBody Patient patient) {
    	
        return new ResponseEntity<>(patientService.add(patient), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Patient> update(@RequestBody Patient patient) {
        return new ResponseEntity<>(patientService.update(patient), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id) {
        patientService.delete(id);
        return new ResponseEntity<>("Registro eliminado correctamente",HttpStatus.OK);
    }
}
