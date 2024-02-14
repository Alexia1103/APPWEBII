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
@Table(name = "staff")
public class staff {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer Staff_ID;
	@ManyToOne
	@JoinColumn(name = "Department_ID")
	private department Department;
	private String Staff_FName;
	private String Staff_LName;
	private String Staff_Address;
	private String Staff_Phone_Number;

}
