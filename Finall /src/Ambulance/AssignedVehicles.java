/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ambulance;

/**
 *
 * @author saketh
 */
public class AssignedVehicles {
    Driver driver;
    Vehicle vehicle;
    
    public AssignedVehicles(){
        
    }
    
    public AssignedVehicles(Driver driver, Vehicle vehicle){
        this.driver = driver;
        this.vehicle = vehicle;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    
}
