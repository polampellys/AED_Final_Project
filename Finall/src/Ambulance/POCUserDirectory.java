/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ambulance;

import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author saketh
 */
public class POCUserDirectory {
    private ArrayList<POC> useraccountlist;
    
    public POCUserDirectory() {
        this.useraccountlist = new ArrayList<POC>();
    }

    public ArrayList<POC> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<POC> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    public POC createUserAccount(String name, String password, Role role) {
        POC user = new POC(name, password, role);
        this.useraccountlist.add(user);
        return user;
    }
    
    public POC authenticateUser(String name, String password) {
        for(POC ua: this.useraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkUniqueUsername(String userName){
        for (POC user: this.useraccountlist){
            if(user.getUsername().equals(userName)){
                return false;
            }
        }
        return true;
    }
}
