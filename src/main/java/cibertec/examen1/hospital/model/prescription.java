package cibertec.examen1.hospital.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table (name = "prescription")
public class prescription {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer Prescription_Num;
	//Conectar con id paciente
	@ManyToOne
	@JoinColumn(name="Patient_ID")
	private Patient patient;
	private String Medication_Name;
	private LocalDate Prescription_Date;
	private Double Prescription_Cost;

}
