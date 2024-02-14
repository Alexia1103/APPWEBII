package cibertec.examen1.hospital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TotalPatientPrescriptionDTO {
	@Id
	 private Integer patientId;
	    private String patientName;
	    private String patientLastName;
	    private Double totalPrescriptionCost;

	    // Constructor
	    public TotalPatientPrescriptionDTO(Integer patientId, String patientName, String patientLastName, Double totalPrescriptionCost) {
	        this.patientId = patientId;
	        this.patientName = patientName;
	        this.patientLastName = patientLastName;
	        this.totalPrescriptionCost = totalPrescriptionCost;
	    }

		public Integer getPatientId() {
			return patientId;
		}

		public void setPatientId(Integer patientId) {
			this.patientId = patientId;
		}

		public String getPatientName() {
			return patientName;
		}

		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}

		public String getPatientLastName() {
			return patientLastName;
		}

		public void setPatientLastName(String patientLastName) {
			this.patientLastName = patientLastName;
		}

		public Double getTotalPrescriptionCost() {
			return totalPrescriptionCost;
		}

		public void setTotalPrescriptionCost(Double totalPrescriptionCost) {
			this.totalPrescriptionCost = totalPrescriptionCost;
		}
	    
}
