/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy;

import Roles.Role;
import User.UserAccount;

/**
 *
 * @author saketh
 */
public class Companies extends UserAccount{
        
    private String accountId;
    
    private static int counter = 0;
    
    public Companies(String username, String password, Role role) {
        super(username, password, role);
        this.accountId = "user" + this.counter++;
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
        Companies.counter = counter;
    }
    
    
    
}
