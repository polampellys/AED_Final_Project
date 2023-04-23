/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Diagnostic.Diagnosticians;
import Hospital.Doctor;



/**
 *
 * @author saketh
 */
public class DiagnosticRequest {
    Doctor doctor;
    Patient patient;
    Diagnosticians diag;
    String testName;
    String result;
    
    public DiagnosticRequest(){
        
    }
    
    public DiagnosticRequest(Doctor doctor, Patient patient,  Diagnosticians diag, String testName){
        this.doctor = doctor;
        this.patient = patient;
        this.diag = diag;
        this.result = "Under Process";
        this.testName = testName;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Diagnosticians getDiag() {
        return diag;
    }

    public void setDiag(Diagnosticians diag) {
        this.diag = diag;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    
    
    
}
