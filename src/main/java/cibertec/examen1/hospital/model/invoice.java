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
@Table (name = "invoice")
public class invoice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Invoice_Num;
	//conectar con id paciente
	@ManyToOne
	@JoinColumn (name = "Patient_ID")
	private Patient patient;
	private String Service_Description;
	private Double Cost;
	private Double Total;

}
