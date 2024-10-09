/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.fall24.assignment1.management;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import com.algonquin.cst8288.fall24.assignment1.prescription.OnlinePrescriptionService;
import com.algonquin.cst8288.fall24.assignment1.prescription.PrescriptionService;

/**
 *
 * @author antwi
 */
public class PrescriptionServiceManager {
    public void generatePrescription(Patient patient, String filename) throws IOException {
        PrescriptionService prescriptionService = new OnlinePrescriptionService();
        BufferedWriter bwriter = new BufferedWriter(new FileWriter(filename));
        bwriter.write(prescriptionService.generatePrescription(patient));
        bwriter.close();
    }
}
    
