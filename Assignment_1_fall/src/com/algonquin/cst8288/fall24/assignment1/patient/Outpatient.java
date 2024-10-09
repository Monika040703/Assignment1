package com.algonquin.cst8288.fall24.assignment1.patient;

/**
 * The Outpatient class represents a patient who visits the hospital for an appointment but is not admitted.
 * It extends the Patient class and includes the appointment date for the outpatient.
 */
public class Outpatient extends Patient {

    private String appointmentDate;

    /**
     * Constructs an Outpatient object with the given details.
     * 
     * @param id               the patient's unique ID
     * @param name             the patient's name
     * @param email            the patient's email address
     * @param phoneNumber      the patient's phone number
     * @param dateOfBirth      the patient's date of birth in "yyyy-MM-dd" format
     * @param appointmentDate  the date of the patient's appointment
     */
    public Outpatient(String id, String name, String email, String phoneNumber, String dateOfBirth, String appointmentDate) {
        super(id, name, email, phoneNumber, dateOfBirth);
        this.appointmentDate = appointmentDate;
    }

    /**
     * Gets the appointment date of the outpatient.
     * 
     * @return the appointment date as a String
     */
    public String getAppointmentDate() {
        return appointmentDate;
    }

    /**
     * This method is not applicable for outpatients since they are not admitted to the hospital.
     * Calling this method will throw an UnsupportedOperationException.
     */
    @Override
    public void admit() {
        throw new UnsupportedOperationException("Unexpected error occurred: Outpatients cannot be admitted.");
    }
}