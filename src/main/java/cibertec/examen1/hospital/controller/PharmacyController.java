package cibertec.examen1.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cibertec.examen1.hospital.model.pharmacy;
import cibertec.examen1.hospital.service.PharmacyService;

@RestController
@RequestMapping("/pharmacy")
public class PharmacyController {

    @Autowired
    PharmacyService pharmacyService;

    @GetMapping
    public ResponseEntity<List<pharmacy>> list() {
        return new ResponseEntity<>(pharmacyService.list(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<pharmacy> add(@RequestBody pharmacy pharmacy) {
        return new ResponseEntity<>(pharmacyService.add(pharmacy), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<pharmacy> update(@RequestBody pharmacy pharmacy) {
        return new ResponseEntity<>(pharmacyService.update(pharmacy), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id) {
        pharmacyService.delete(id);
        return new ResponseEntity<>("Pharmacy eliminado correctamente",HttpStatus.OK);
    }
}
