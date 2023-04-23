/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Roles.Role;
import User.UserAccount;

/**
 *
 * @author saketh
 */
public class Patient extends UserAccount{
    private String accountId;
    
    private static int counter = 0;
    private String bp;
    
    public Patient(String username, String password, Role role) {
        super(username, password, role);
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Patient.counter = counter;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }
    
    
    
    
}
