/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import Roles.Role;
import User.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author saketh
 */
public class HospitalUserDirectory {
    private ArrayList<UserAccount> hospitaluseraccountlist;

    public HospitalUserDirectory() {
        this.hospitaluseraccountlist = new ArrayList<UserAccount>(); 
    }

    public ArrayList<UserAccount> getHospitaluseraccountlist() {
        return hospitaluseraccountlist;
    }

    public void setHospitaluseraccountlist(ArrayList<UserAccount> hospitaluseraccountlist) {
        this.hospitaluseraccountlist = hospitaluseraccountlist;
    }
    
    public UserAccount createUserAccount(String name, String password, Role role) {
        UserAccount user = new UserAccount(name, password, role);
        this.hospitaluseraccountlist.add(user);
        return user;
    }
    
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.hospitaluseraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    
    
}
