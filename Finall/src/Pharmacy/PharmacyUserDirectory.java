/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy;

import Roles.Role;
import User.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author saketh
 */
public class PharmacyUserDirectory {
    private ArrayList<UserAccount> pharmacyuseraccountlist;
    
    public PharmacyUserDirectory(){
        this.pharmacyuseraccountlist = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getPharmacyuseraccountlist() {
        return pharmacyuseraccountlist;
    }

    public void setPharmacyuseraccountlist(ArrayList<UserAccount> pharmacyuseraccountlist) {
        this.pharmacyuseraccountlist = pharmacyuseraccountlist;
    }
    
    public UserAccount createUserAccount(String name, String password, Role role) {
        UserAccount user = new UserAccount(name, password, role);
        this.pharmacyuseraccountlist.add(user);
        return user;
    }
    
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.pharmacyuseraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
}
