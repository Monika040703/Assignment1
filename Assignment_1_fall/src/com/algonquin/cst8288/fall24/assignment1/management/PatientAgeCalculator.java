/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.fall24.assignment1.management;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import com.alognquin.cst8288.fall24.assignment1.Constants;

/**
 *
 * @author monika
 */
public class PatientAgeCalculator {
    public long calculatePatientAge(String dob){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd");
        LocalDate dateOfBirth=LocalDate.parse(dob, formatter);
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
    public String determineLifeStage(long age){
        return (age <=6) ? Constants.CHILD: (age <=18)? Constants.YOUTH:Constants.ADULT;
    }
    
}
