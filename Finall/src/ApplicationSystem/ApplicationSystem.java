/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApplicationSystem;

import Ambulance.AmbulanceUserDirectory;
import Diagnostic.DiagnosticUserDirectory;
import Hospital.HospitalUserDirectory;
import Pharmacy.PharmacyUserDirectory;
import Roles.AmbulanceSystemAdminRole;
import Roles.DiagnosticSystemAdminRole;
import Roles.HospitalSystemAdminRole;
import Roles.PharmacySystemAdminRole;
import Roles.SystemAdminRole;
import User.UserAccount;
import User.UserAccountDirectory;

/**
 *
 * @author saketh
 */
public class ApplicationSystem {
    private UserAccountDirectory useraccountDirectory;
    private AmbulanceUserDirectory ambulanceUserAccountDirectory;
    private HospitalUserDirectory hospitalUserAccountDirectory;
    private PharmacyUserDirectory pharmacyUserAccountDirectory;
    private DiagnosticUserDirectory diagnosticUserAccountDirectory;
    
    public ApplicationSystem(){
         this.useraccountDirectory = new UserAccountDirectory();
         this.ambulanceUserAccountDirectory = new AmbulanceUserDirectory();
         this.hospitalUserAccountDirectory = new HospitalUserDirectory();
         this.pharmacyUserAccountDirectory = new PharmacyUserDirectory();
         this.diagnosticUserAccountDirectory = new DiagnosticUserDirectory();
         
         
         this.useraccountDirectory.createUserAccount("admin", "admin", new SystemAdminRole());
         this.ambulanceUserAccountDirectory.createUserAccount("admin", "admin", new AmbulanceSystemAdminRole());
         
         this.pharmacyUserAccountDirectory.createUserAccount("admin", "admin", new PharmacySystemAdminRole());
         this.diagnosticUserAccountDirectory.createUserAccount("admin", "admin", new DiagnosticSystemAdminRole());

    }

    public UserAccountDirectory getUseraccountDirectory() {
        return useraccountDirectory;
    }

    public void setUseraccountDirectory(UserAccountDirectory useraccountDirectory) {
        this.useraccountDirectory = useraccountDirectory;
    }

    public AmbulanceUserDirectory getAmbulanceUserAccountDirectory() {
        return ambulanceUserAccountDirectory;
    }

    public void setAmbulanceUserAccountDirectory(AmbulanceUserDirectory ambulanceUserAccountDirectory) {
        this.ambulanceUserAccountDirectory = ambulanceUserAccountDirectory;
    }

    public HospitalUserDirectory getHospitalUserAccountDirectory() {
        return hospitalUserAccountDirectory;
    }

    public void setHospitalUserAccountDirectory(HospitalUserDirectory hospitalUserAccountDirectory) {
        this.hospitalUserAccountDirectory = hospitalUserAccountDirectory;
    }

    public PharmacyUserDirectory getPharmacyUserAccountDirectory() {
        return pharmacyUserAccountDirectory;
    }

    public void setPharmacyUserAccountDirectory(PharmacyUserDirectory pharmacyUserAccountDirectory) {
        this.pharmacyUserAccountDirectory = pharmacyUserAccountDirectory;
    }

    public DiagnosticUserDirectory getDiagnosticUserAccountDirectory() {
        return diagnosticUserAccountDirectory;
    }

    public void setDiagnosticUserAccountDirectory(DiagnosticUserDirectory diagnosticUserAccountDirectory) {
        this.diagnosticUserAccountDirectory = diagnosticUserAccountDirectory;
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
