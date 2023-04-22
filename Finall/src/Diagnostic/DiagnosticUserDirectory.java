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
    private DiagnosticiansUserDirectory  diagnosticiansUserDirectory;
    private VendorsUserDirectory vendorsUserDirectory;
    
    
    public DiagnosticUserDirectory() {
        this.diagnosticuseraccountlist = new ArrayList<UserAccount>(); 
        this.diagnosticiansUserDirectory= new DiagnosticiansUserDirectory();
        this.vendorsUserDirectory = new VendorsUserDirectory();
    }

    public ArrayList<UserAccount> getDiagnosticuseraccountlist() {
        return diagnosticuseraccountlist;
    }

    public void setDiagnosticuseraccountlist(ArrayList<UserAccount> diagnosticuseraccountlist) {
        this.diagnosticuseraccountlist = diagnosticuseraccountlist;
    }

    public DiagnosticiansUserDirectory getDiagnosticiansUserDirectory() {
        return diagnosticiansUserDirectory;
    }

    public void setDiagnosticiansUserDirectory(DiagnosticiansUserDirectory diagnosticiansUserDirectory) {
        this.diagnosticiansUserDirectory = diagnosticiansUserDirectory;
    }

    public VendorsUserDirectory getVendorsUserDirectory() {
        return vendorsUserDirectory;
    }

    public void setVendorsUserDirectory(VendorsUserDirectory vendorsUserDirectory) {
        this.vendorsUserDirectory = vendorsUserDirectory;
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
    
    public Boolean checkUniqueUsername(String userName){
        for (UserAccount user: this.diagnosticuseraccountlist){
            if(user.getUsername().equals(userName)){
                return false;
            }
        }
        return true;
    }
}
