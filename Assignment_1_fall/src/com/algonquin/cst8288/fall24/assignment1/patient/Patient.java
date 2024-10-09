package com.algonquin.cst8288.fall24.assignment1.patient;

import com.algonquin.cst8288.fall24.assignment1.prescription.Prescription;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Patient class that holds all patient data.
 */
public abstract class Patient {

    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String dateOfBirth;
    private long age;
    private String lifeStage;
    private String plannedTreatment;
    private Prescription prescription;
    private String diagnosis; // to add the diagnosis field

    public Patient(String id, String name, String email, String phoneNumber, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.age = calculateAge(dateOfBirth); // Call calculateAge() during object creation
    }

    // Method to calculate age based on dateOfBirth
    private long calculateAge(String dateOfBirth) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date dob = sdf.parse(dateOfBirth);
            Calendar birthDay = Calendar.getInstance();
            birthDay.setTime(dob);
            Calendar today = Calendar.getInstance();
            
            int age = today.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
            
            if (today.get(Calendar.DAY_OF_YEAR) < birthDay.get(Calendar.DAY_OF_YEAR)) {
                age--;  // Decrease age if birthday hasn't occurred yet this year
            }
            
            return age;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        this.age = calculateAge(dateOfBirth);  // Recalculate age if date of birth changes
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getLifeStage() {
        return lifeStage;
    }

    public void setLifeStage(String lifeStage) {
        this.lifeStage = lifeStage;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public String getPlannedTreatment() {
        return plannedTreatment;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setPlannedTreatment(String plannedTreatment) {
        this.plannedTreatment = plannedTreatment;
    }

    public abstract void admit();

    /**
     * Enum to represent different types of treatment for patients
     */
    public enum TreatmentType {
        MEDICATION, SURGERY, THERAPY;
    }
}