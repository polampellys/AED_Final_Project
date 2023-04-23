/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ambulance;

import Patient.AmbulanceRequestDirectory;
import Roles.Role;

import User.UserAccount;

/**
 *
 * @author saketh
 */
public class Driver extends UserAccount{
    private String accountId;
    
    private static int counter = 0;
    private int trips = 0;
    private AmbulanceRequestDirectory ambulanceRequestDirectory;
    
    public Driver(String username, String password, Role role) {
        super(username,password,role);
        this.accountId = "user" + this.counter++;
        this.ambulanceRequestDirectory = new AmbulanceRequestDirectory();
        
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Driver.counter = counter;
    }

    public AmbulanceRequestDirectory getAmbulanceRequestDirectory() {
        return ambulanceRequestDirectory;
    }

    public void setAmbulanceRequestDirectory(AmbulanceRequestDirectory ambulanceRequestDirectory) {
        this.ambulanceRequestDirectory = ambulanceRequestDirectory;
    }

    public int getTrips() {
        return trips;
    }

    public void setTrips(int trips) {
        this.trips = trips;
    }
    
    
    
    public void increaseTrip()
    {
        trips++;
    }
    
    
}
