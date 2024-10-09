package com.algonquin.cst8288.fall24.assignment1.prescription;
import java.text.SimpleDateFormat;
import com.algonquin.cst8288.fall24.assignment1.patient.Patient;



/**
 * 
 * Implement this
 * 
 */
public class PrintablePrescriptionService implements PrescriptionService {

	@Override
	public String generatePrescription(Patient patient) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        StringBuilder prescription = new StringBuilder();

        // Add header for printable prescription
        prescription.append("===== Printable Prescription =====\n")
                    .append("Patient ID: ").append(patient.getId()).append("\n")
                    .append("Name: ").append(patient.getName()).append("\n")
                    .append("Date of Birth: ").append(patient.getDateOfBirth()).append("\n")
                    .append("Diagnosis: ").append(patient.getDiagnosis()).append("\n")
                    .append("Life Stage: ").append(patient.getLifeStage()).append("\n")
                    .append("Planned Treatment: ").append(patient.getPlannedTreatment()).append("\n");

        //Prescription Details
        Prescription pres = patient.getPrescription();
        if (pres != null){
            prescription.append("\nPrescriptionDetails:\n");
         prescription.append("Dosage:").append(pres.getDailyDosageCount()).append("times per day\n");
         prescription.append("Duration:").append(pres.getDuration()).append("days\n");
         prescription.append("Disease Type:").append(pres.getDiseaseType()).append("\n");
         if (pres.getSurgeryDate() !=null){
             prescription.append("Surgery Date:").append(dateFormat.format(pres.getSurgeryDate())).append("\n");
        }
         prescription.append("Risk Factor:").append(pres.getRiskFactor()).append("\n");
         prescription.append("Fasting Required:").append(pres.isFastingRequired()? "Yes": "No").append("\n");
         if (pres.getFollowUpDate() !=null){
             prescription.append("Follow-up Date:").append(dateFormat.format(pres.getFollowUpDate())).append("\n");
         }
         
         }else{
            prescription.append("No Prescription Details Available.\n");
        }
        return prescription.toString();
        }}
        