package cibertec.examen1.hospital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "hospital")
public class hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
private Integer Hospital_ID;
private String Hospital_Name;
private String Hospital_Address;
private String Hospital_Phone_Number;
private String State;
private String Zip_Code;
	
}
