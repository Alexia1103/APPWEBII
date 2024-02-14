package cibertec.examen1.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cibertec.examen1.hospital.model.pharmacy;

public interface PharmacyRepo extends JpaRepository<pharmacy, Integer> {
}
