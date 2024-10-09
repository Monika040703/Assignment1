package com.alognquin.cst8288.fall24.assignment1;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import com.algonquin.cst8288.fall24.assignment1.patient.Inpatient;
import com.algonquin.cst8288.fall24.assignment1.patient.Outpatient;
import com.algonquin.cst8288.fall24.assignment1.prescription.Prescription;
import com.algonquin.cst8288.fall24.assignment1.treatment.MedicationTreatmentPlan;
import com.algonquin.cst8288.fall24.assignment1.treatment.SurgeryTreatmentPlan;
import com.algonquin.cst8288.fall24.assignment1.management.PatientManagement;
import com.algonquin.cst8288.fall24.assignment1.prescription.PrescriptionService;
import com.algonquin.cst8288.fall24.assignment1.prescription.PrintablePrescriptionService;
import com.algonquin.cst8288.fall24.assignment1.prescription.OnlinePrescriptionService;
import com.algonquin.cst8288.fall24.assignment1.treatment.TreatmentPlan;
import java.text.SimpleDateFormat;
import java.text.ParseException; 
import java.io.IOException;

public class Physician {
    
    public static void main(String[] args) throws IOException, ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        // Create instances of Patient (Inpatient and Outpatient)
        Patient outpatient = new Outpatient("P001", "Wendy Shey", "wendyshey@gmail.com", "333-243-546", 
                "1993-01-01", "2024-09-26");
        Inpatient inpatient = new Inpatient("P002", "Kumkum Mumu", "mkumkum@gmail.com", "343-297-6543",
                "1982-05-15", "2024-09-26");

        // Set life stage and planned treatment
        inpatient.setLifeStage(Constants.ADULT);
        outpatient.setLifeStage(Constants.ADULT);
        
        inpatient.setPlannedTreatment(Constants.MEDICATION);
        outpatient.setPlannedTreatment(Constants.MEDICATION);  // Fixed to only medication for outpatient

        // Set diagnosis for both patients
        inpatient.setDiagnosis(Constants.INFECTION);
        outpatient.setDiagnosis("Flu");  // Changed diagnosis to reflect outpatient

        // Set prescription details (Medications for both)
        Prescription inpatientPrescription = new Prescription(2, Constants.INFECTION_DURATION, Constants.INFECTION, 
                null, Constants.MEDIUM, false, null);
        inpatient.setPrescription(inpatientPrescription);

        // Outpatient should not have surgery details in the prescription
        Prescription outpatientPrescription = new Prescription(1, Constants.INFECTION_DURATION, Constants.INFECTION, 
                null, Constants.LOW, false, null);
        outpatient.setPrescription(outpatientPrescription);

        // Apply treatment plans
        TreatmentPlan medicationPlan = new MedicationTreatmentPlan();
        TreatmentPlan surgeryPlan = new SurgeryTreatmentPlan();

        PatientManagement patientManagement = new PatientManagement();

        // Apply Medication Treatment Plan to inpatient
        System.out.println("Treatment Plan for Inpatient:");
        System.out.println(medicationPlan.createTreatmentPlan(inpatient));

        // Surgery should only be applicable for inpatients
        if (outpatient instanceof Inpatient) {
            System.out.println("\nTreatment Plan for Outpatient (should be Inpatient):");
            System.out.println(surgeryPlan.createTreatmentPlan(outpatient));
        } else {
            System.out.println("\nSurgery can only be applied to inpatients. Outpatient can't have surgery.");
        }

        // Generate prescriptions in different formats
        PrescriptionService onlineService = new OnlinePrescriptionService();
        PrescriptionService printableService = new PrintablePrescriptionService();

        // Generate and print prescriptions
        System.out.println("\nOnline Prescription for Inpatient:");
        System.out.println(onlineService.generatePrescription(inpatient));

        System.out.println("\nPrintable Prescription for Outpatient:");
        System.out.println(printableService.generatePrescription(outpatient));
    }
}