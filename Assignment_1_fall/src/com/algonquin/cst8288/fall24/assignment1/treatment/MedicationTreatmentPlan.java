package com.algonquin.cst8288.fall24.assignment1.treatment;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;


/**
 * 
 * Implement this
 */
public class MedicationTreatmentPlan implements TreatmentPlan {

	@Override
    public String createTreatmentPlan(Patient patient) {
        StringBuilder treatmentPlan = new StringBuilder();
        
        // Basic information about the patient
        treatmentPlan.append("The patient is diagnosed with ").append(patient.getDiagnosis()).append(" and requires medication.\n");
        treatmentPlan.append("The patient is ").append(patient.getAge()).append(" years old and is prescribed a course of treatment.\n");
        
        // Custom information for the medication treatment plan
        treatmentPlan.append("The patient needs to take medication ").append(patient.getPrescription().getDailyDosageCount())
                     .append(" times per day for ").append(patient.getPrescription().getDuration()).append(" days.\n");
        
        if (patient.getPrescription().getDiseaseType() != null) {
            treatmentPlan.append("The medication is for treating ").append(patient.getPrescription().getDiseaseType()).append(".\n");
        }

        return treatmentPlan.toString();
    }
}
