/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostic;

/**
 *
 * @author saketh
 */
public class AssignedMachine {
    Machine machine;
    Diagnosticians diag;
    
    
    public AssignedMachine(){
        
    }
    
    public AssignedMachine(Machine machine, Diagnosticians diag){
        this.diag = diag;
        this.machine = machine;
        
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Diagnosticians getDiag() {
        return diag;
    }

    public void setDiag(Diagnosticians diag) {
        this.diag = diag;
    }

    
    
    
    
}
