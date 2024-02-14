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
@Table(name = "department")
public class department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer Department_ID;
	private String Department_Name;
	@ManyToOne
	@JoinColumn(name = "Hospital_ID")
	private hospital Hospital;
}
