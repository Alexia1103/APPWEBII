package cibertec.examen1.hospital.model;

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
@Table (name="patient")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Patient_ID;
	private String Patient_FName;
	private String Patient_LName;
	private String Patient_Address;
	private String Patient_Phone_Number;
	//Conectar con Pharmacy_ID
	@ManyToOne
	@JoinColumn (name = "Pharmacy_ID")
	private pharmacy Pharmacy;
	
	
	
}
