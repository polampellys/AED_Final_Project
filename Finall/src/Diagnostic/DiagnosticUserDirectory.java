/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostic;

import Roles.Role;
import User.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author saketh
 */
public class DiagnosticUserDirectory {
    private ArrayList<UserAccount> diagnosticuseraccountlist;
    
    public DiagnosticUserDirectory() {
        this.diagnosticuseraccountlist = new ArrayList<UserAccount>(); 
    }

    public ArrayList<UserAccount> getDiagnosticuseraccountlist() {
        return diagnosticuseraccountlist;
    }

    public void setDiagnosticuseraccountlist(ArrayList<UserAccount> diagnosticuseraccountlist) {
        this.diagnosticuseraccountlist = diagnosticuseraccountlist;
    }
    
    public UserAccount createUserAccount(String name, String password, Role role) {
        UserAccount user = new UserAccount(name, password, role);
        this.diagnosticuseraccountlist.add(user);
        return user;
    }
    
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.diagnosticuseraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
}
