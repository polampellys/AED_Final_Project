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
public class StoreDirectrory {
    private ArrayList<Store> useraccountlist;
    
    public StoreDirectrory() {
        this.useraccountlist = new ArrayList<Store>();
    }

    public ArrayList<Store> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<Store> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    public Store createUserAccount(String name, String password, Role role) {
        Store user = new Store(name, password, role);
       
        this.useraccountlist.add(user);
        return user;
    }
    
    public Store authenticateUser(String name, String password) {
        for(Store ua: this.useraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkUniqueUsername(String userName){
        for (Store user: this.useraccountlist){
            if(user.getUsername().equals(userName)){
                return false;
            }
        }
        return true;
    }
    
}
