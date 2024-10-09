package com.algonquin.cst8288.fall24.assignment1.patient;
import java.util.Date;
/**
 * The impatient class represents a patient who has been admitted to the hospital
 * it extends the patient class and adds the room number for the inpatient 
 * @author monika
 */
public class Inpatient extends Patient {
    private String roomNumber;
    private Date surgeryDate;
    private boolean fastingRequired;
    private Date followUpDate;
    private String riskFactor;
    /**
     * Constructs an inpatients object with the given details;
     * @param id
     * @param name
     * @param email
     * @param phoneNumber
     * @param dateOfBirth
     * @param roomNumber 
     */

    public Inpatient(String id, String name, String email, String phoneNumber, String dateOfBirth, String roomNumber) {
        super(id, name, email, phoneNumber, dateOfBirth);
        this.roomNumber = roomNumber;
        this.riskFactor=riskFactor;
    }
    /**
     * Gets the room  number assigned to the inpatient
     * @return the room number of the inpatient
     */


    public String getRoomNumber() {
        return roomNumber;
    }
    public String getRiskFactor(){
        return riskFactor;
    }
    /**
     * Admits the inpatient to their assigned room and prints a message with the patients name and room number 
     */
    

	@Override
	public void admit() {
        System.out.println(getName() + " has been admitted to " + getRoomNumber());
    }

    // Getter and setter for surgeryDate
    public Date getSurgeryDate() {
        return surgeryDate;
    }

    public void setSurgeryDate(Date surgeryDate) {
        this.surgeryDate = surgeryDate;
    }

    // Getter and setter for fastingRequired
    public boolean isFastingRequired() {
        return fastingRequired;
    }

    public void setFastingRequired(boolean fastingRequired) {
        this.fastingRequired = fastingRequired;
    }

    // Getter and setter for followUpDate
    public Date getFollowUpDate() {
        return followUpDate;
    }

    public void setFollowUpDate(Date followUpDate) {
        this.followUpDate = followUpDate;
    }
}
