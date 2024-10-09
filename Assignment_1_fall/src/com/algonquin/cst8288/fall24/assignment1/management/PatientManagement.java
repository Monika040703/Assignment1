package com.algonquin.cst8288.fall24.assignment1.management;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;



/**
 * The patient management class  used by Physicians to perform multiple tasks.
 * 
 */

public class PatientManagement {

	
	/**
	 * Validate patient data
	 * 
	 * @param patient
	 * @return
	 */
private PatientValidation validator = new PatientValidation();
private TreatmentPlanService treatmentService = new TreatmentPlanService();
private PrescriptionServiceManager prescriptionServiceManager= new PrescriptionServiceManager();

	public boolean validatePatient(Patient patient) {
			return validator.validatePatientData(patient);
        }
        public void createTreatmentPlan(Patient patient) {
			treatmentService.createTreatmentPlan(patient);
        }
        public void generatePrescription(Patient patient, String filename) throws IOException{
            prescriptionServiceManager.generatePrescription(patient, filename);
        }
}
		