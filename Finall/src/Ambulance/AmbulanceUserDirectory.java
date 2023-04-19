/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ambulance;

import Roles.Role;
import User.UserAccount;
import User.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author saketh
 */
public class AmbulanceUserDirectory {
    private ArrayList<UserAccount> ambulanceuseraccountlist;
    
    public AmbulanceUserDirectory(){
        this.ambulanceuseraccountlist = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getAmbulanceuseraccountlist() {
        return ambulanceuseraccountlist;
    }

    public void setAmbulanceuseraccountlist(ArrayList<UserAccount> ambulanceuseraccountlist) {
        this.ambulanceuseraccountlist = ambulanceuseraccountlist;
    }

    
    
    public UserAccount createUserAccount(String name, String password, Role role) {
        UserAccount user = new UserAccount(name, password, role);
        this.ambulanceuseraccountlist.add(user);
        return user;
    }
    
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.ambulanceuseraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    
}
