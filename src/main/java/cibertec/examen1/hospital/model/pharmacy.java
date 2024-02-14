package cibertec.examen1.hospital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table (name="pharmacy")
public class pharmacy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Pharmacy_ID;
	private String Pharmacy_Name;
	private String Pharmacy_Address;
	private String Pharmacy_Phone_Number;
}
