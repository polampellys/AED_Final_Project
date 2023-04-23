/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy;

import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author saketh
 */
public class CompaniesDirectory {
    private ArrayList<Companies> useraccountlist;
    
    
    public CompaniesDirectory() {
        this.useraccountlist = new ArrayList<Companies>();
    }

    public ArrayList<Companies> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<Companies> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    public Companies createUserAccount(String name, String password, Role role) {
        Companies user = new Companies(name, password, role);
       
        this.useraccountlist.add(user);
        return user;
    }
    
    public Companies authenticateUser(String name, String password) {
        for(Companies ua: this.useraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkUniqueUsername(String userName){
        for (Companies user: this.useraccountlist){
            if(user.getUsername().equals(userName)){
                return false;
            }
        }
        return true;
    }
}
