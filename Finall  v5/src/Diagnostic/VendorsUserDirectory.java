/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostic;

import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author saketh
 */
public class VendorsUserDirectory {
    private ArrayList<Vendors> useraccountlist;
    
    public VendorsUserDirectory() {
        this.useraccountlist = new ArrayList<Vendors>();
    }

    public ArrayList<Vendors> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<Vendors> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    public Vendors createUserAccount(String name, String password, Role role, String companyname) {
        Vendors user = new Vendors(name, password, role);
        user.setCompany(companyname);
        this.useraccountlist.add(user);
        return user;
    }
    
    public Vendors authenticateUser(String name, String password) {
        for(Vendors ua: this.useraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkUniqueUsername(String userName){
        for (Vendors user: this.useraccountlist){
            if(user.getUsername().equals(userName)){
                return false;
            }
        }
        return true;
    }
    
}
