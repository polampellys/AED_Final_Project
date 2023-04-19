/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApplicationSystem;

import Roles.SystemAdminRole;
import User.UserAccount;
import User.UserAccountDirectory;

/**
 *
 * @author saketh
 */
public class ApplicationSystem {
    private UserAccountDirectory useraccountDirectory;
    
    public ApplicationSystem(){
         this.useraccountDirectory = new UserAccountDirectory();
         this.useraccountDirectory.createUserAccount("admin", "admin", new SystemAdminRole());

    }

    public UserAccountDirectory getUseraccountDirectory() {
        return useraccountDirectory;
    }

    public void setUseraccountDirectory(UserAccountDirectory useraccountDirectory) {
        this.useraccountDirectory = useraccountDirectory;
    }
    
    public boolean checkIfCustomerExists(String name){
        for(UserAccount user: this.useraccountDirectory.getUseraccountlist())
        {
            if(user.getUsername().equals(name)){
                System.out.println(user.getUsername());
                return false;
            }
        }
        return true;
    }
    
     public static ApplicationSystem getInstance() {
        return new ApplicationSystem();
    }
}
