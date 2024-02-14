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
@Table ( name = "room")
public class room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Room_Num;
	//Conectar paciente id y id staff
	@ManyToOne
	@JoinColumn (name = "Patient_ID")
	private Patient patient;
	@ManyToOne
	@JoinColumn (name = "Staff_ID")
	private staff Staff;
	
	private LocalDate Admission_Date;

}
