package com.algonquin.cst8288.fall24.assignment1.treatment;
import com.algonquin.cst8288.fall24.assignment1.patient.Inpatient;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;

/**
 * 
 * This class is responsible for implementing the business logic related to generating a treatment plan. 
 * 
 * You can use any method you prefer, such as StringBuilder or standard String, to construct the plan. Think of
 * treatment plan is a doctor notes in a summary format. 
 * Later, you will attach the treatment plan to detailed prescription.
 * 
 * An example might look like this:
 * "The patient is diagnosed with xxx and requires surgery.
 *  The patient is xxx years old with a risk factor of xxx. It is required to perform a minor surgery
 *  in order to address the xxx issue."
 * 
 * */


public class SurgeryTreatmentPlan implements TreatmentPlan{

	@Override
        public String createTreatmentPlan(Patient patient) {
        // If the patient is not an inpatient, return a specific message
        if (!(patient instanceof Inpatient)) {
            return "Surgery is not applicable for outpatients.";
        }

        // Continue with surgery treatment plan logic for Inpatients
        StringBuilder treatmentPlan = new StringBuilder();

        // Now we know the patient is an Inpatient, so we can cast the patient object
        Inpatient inpatient = (Inpatient) patient;

        // Add patient and treatment details for the surgery plan
        treatmentPlan.append("The patient is diagnosed with ")
                     .append(patient.getDiagnosis())
                     .append(" and requires surgery.\n")
                     .append("The patient is ")
                     .append(patient.getAge())
                     .append(" years old with a risk factor of ")
                     .append(inpatient.getRiskFactor()).append(".\n")
                     .append("The surgery is scheduled for ")
                     .append(inpatient.getSurgeryDate()).append(".\n")
                     .append("The patient is advised to fast for ")
                     .append(inpatient.isFastingRequired() ? "8 hours" : "no fasting required").append(".\n")
                     .append("Follow-up is scheduled for ")
                     .append(inpatient.getFollowUpDate()).append(".\n");

        return treatmentPlan.toString();
    }}
