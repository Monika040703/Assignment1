package com.algonquin.cst8288.fall24.assignment1.prescription;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;


/**
 * 
 * OnlinePrescriptionService is responsible for generating prescriptions
 * in an Online format for the specified patient.
 * 
 */
public class OnlinePrescriptionService implements PrescriptionService{

	@Override
	public String generatePrescription(Patient patient) {
		// TODO Auto-generated method stub
//Contruct the prescription information in a formatted string
StringBuilder prescription = new StringBuilder();
        
        prescription.append("Online Prescription\n");
        prescription.append("-------------------------------\n");
        prescription.append("Patient ID: ").append(patient.getId()).append("\n");
        prescription.append("Name: ").append(patient.getName()).append("\n");
        prescription.append("Email: ").append(patient.getEmail()).append("\n");
        prescription.append("Phone: ").append(patient.getPhoneNumber()).append("\n");
        prescription.append("Date of Birth: ").append(patient.getDateOfBirth()).append("\n");
        prescription.append("Age: ").append(patient.getAge()).append("\n");
        prescription.append("Life Stage: ").append(patient.getLifeStage()).append("\n");
        prescription.append("Planned Treatment: ").append(patient.getPlannedTreatment()).append("\n");
        prescription.append("-------------------------------\n");
        if (patient.getPrescription() != null) {
            prescription.append(patient.getPrescription().getDetails()).append("\n");
        } else {
            prescription.append("No prescription available.\n");
        }
        prescription.append("-------------------------------\n");
        prescription.append("Thank you for using our service.\n");

        return prescription.toString();
    
	}
	
}
