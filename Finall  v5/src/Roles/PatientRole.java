/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import ApplicationSystem.ApplicationSystem;

import UI.Patient.PatientJFrame;
import User.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author saketh
 */
public class PatientRole extends Role{
    @Override
    public JFrame createWorkArea(ApplicationSystem applicationSystem, UserAccount useraccount) {
        System.out.println(applicationSystem);
        return new PatientJFrame (applicationSystem, useraccount);
    }
    
}
