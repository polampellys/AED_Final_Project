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
public class DiagnosticiansUserDirectory {
    private ArrayList<Diagnosticians> useraccountlist;
    
    public DiagnosticiansUserDirectory() {
        this.useraccountlist = new ArrayList<Diagnosticians>();
    }

    public ArrayList<Diagnosticians> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<Diagnosticians> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    public Diagnosticians createUserAccount(String name, String password, Role role) {
        Diagnosticians user = new Diagnosticians(name, password, role);
        this.useraccountlist.add(user);
        return user;
    }
    
    public Diagnosticians authenticateUser(String name, String password) {
        for(Diagnosticians ua: this.useraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkUniqueUsername(String userName){
        for (Diagnosticians user: this.useraccountlist){
            if(user.getUsername().equals(userName)){
                return false;
            }
        }
        return true;
    }
}
