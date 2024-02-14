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
@Table(name = "doctor")
public class doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer Doctor_ID;
	private String Doctor_FName;
	private String Doctor_LName;
	@ManyToOne
	@JoinColumn(name="Department_ID")
	private department Department;
	private String Doctor_Phone_Number;
	
}
