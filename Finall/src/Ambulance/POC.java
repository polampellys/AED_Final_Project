/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ambulance;

import Roles.Role;
import User.UserAccount;

/**
 *
 * @author saketh
 */
public class POC extends UserAccount{
    private String accountId;
    
    private static int counter = 0;
    
    public POC(String username, String password, Role role) {
        super(username,password,role);
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
        POC.counter = counter;
    }

    
    
    
}
