package com.algonquin.cst8288.fall24.assignment1.prescription;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * 
 * Calculate the details of the prescription according to the business rules.
 * The information to include should cover daily doses, duration, disease type,
 * surgery date, etc.
 * 
 */


public class Prescription {

    private long dailyDosageCount;
    private long duration;  // duration in days
    private String diseaseType;
    private Date surgeryDate;
    private String riskFactor;
    private boolean isFastingRequired;
    private Date followUpDate;
    

    public Prescription() {
        // Default constructor
    }

    // Constructor for easier instantiation
    public Prescription(long dailyDosageCount, long duration, String diseaseType, Date surgeryDate, 
                        String riskFactor, boolean isFastingRequired, Date followUpDate) {
        this.dailyDosageCount = dailyDosageCount;
        this.duration = duration;
        this.diseaseType = diseaseType;
        this.surgeryDate = surgeryDate;
        this.riskFactor = riskFactor;
        this.isFastingRequired = isFastingRequired;
        this.followUpDate = followUpDate;
    }

    // Getters and setters for all attributes
    public long getDailyDosageCount() {
        return dailyDosageCount;
    }

    public void setDailyDosageCount(long dailyDosageCount) {
        this.dailyDosageCount = dailyDosageCount;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getDiseaseType() {
        return diseaseType;
    }

    public void setDiseaseType(String diseaseType) {
        this.diseaseType = diseaseType;
    }

    public Date getSurgeryDate() {
        return surgeryDate;
    }

    public void setSurgeryDate(Date surgeryDate) {
        this.surgeryDate = surgeryDate;
    }

    public String getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(String riskFactor) {
        this.riskFactor = riskFactor;
    }

    public boolean isFastingRequired() {
        return isFastingRequired;
    }

    public void setFastingRequired(boolean isFastingRequired) {
        this.isFastingRequired = isFastingRequired;
    }

    public Date getFollowUpDate() {
        return followUpDate;
    }

    public void setFollowUpDate(Date followUpDate) {
        this.followUpDate = followUpDate;
    }

    /**
     * Generates the prescription details in a readable format.
     * @return A string containing the details of the prescription.
     */
    public String getDetails() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        StringBuilder details = new StringBuilder();
        details.append("Prescription Details:\n");
        details.append("Disease Type: ").append(diseaseType).append("\n");
        details.append("Daily Dosage: ").append(dailyDosageCount).append("\n");
        details.append("Duration: ").append(duration).append(" days\n");
        
        if (surgeryDate != null) {
            details.append("Surgery Date: ").append(dateFormat.format(surgeryDate)).append("\n");
        }
        
        details.append("Risk Factor: ").append(riskFactor).append("\n");
        details.append("Fasting Required: ").append(isFastingRequired ? "Yes" : "No").append("\n");
        
        if (followUpDate != null) {
            details.append("Follow-up Date: ").append(dateFormat.format(followUpDate)).append("\n");
        }
        
        return details.toString();
    }
}
