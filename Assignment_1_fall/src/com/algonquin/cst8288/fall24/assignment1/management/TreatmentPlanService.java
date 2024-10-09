/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.fall24.assignment1.management;
import com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import com.algonquin.cst8288.fall24.assignment1.treatment.SurgeryTreatmentPlan;
import com.algonquin.cst8288.fall24.assignment1.treatment.TreatmentPlan;

/**
 *
 * @author antwi
 */
public class TreatmentPlanService {
    public void createTreatmentPlan(Patient patient) {
        TreatmentPlan treatment = new SurgeryTreatmentPlan();  // Can be expanded for different plans.
        patient.setAge(new PatientAgeCalculator().calculatePatientAge(patient.getDateOfBirth()));
        patient.setLifeStage(new PatientAgeCalculator().determineLifeStage(patient.getAge()));
        treatment.createTreatmentPlan(patient);
    }
}
    
