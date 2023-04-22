/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import ApplicationSystem.ApplicationSystem;
import UI.PhramacyCompany.Pharmacy;
import User.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author saketh
 */
public class CompanyRole extends Role {
    @Override
    public JFrame createWorkArea(ApplicationSystem applicationSystem, UserAccount useraccount) {
        System.out.println(applicationSystem);
        return new Pharmacy(applicationSystem, useraccount);
    }
}
