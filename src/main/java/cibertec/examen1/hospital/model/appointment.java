package cibertec.examen1.hospital.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table (name ="appointment")
public class appointment {
	
	@Id
    @ManyToOne
    @JoinColumn(name = "Patient_ID")
    private Patient patient;

    @Id
    @ManyToOne
    @JoinColumn(name = "Doctor_ID")
    private doctor Doctor;

    private LocalDate Date;
    private String Time;
}
